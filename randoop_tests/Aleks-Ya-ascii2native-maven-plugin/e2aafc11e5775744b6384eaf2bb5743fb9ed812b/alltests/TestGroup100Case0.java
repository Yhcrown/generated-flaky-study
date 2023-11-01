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
        java.lang.String str0 = org.apache.maven.plugin.Mojo.ROLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.maven.plugin.Mojo" + "'", str0, "org.apache.maven.plugin.Mojo");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str0 = ru.yaal.maven.ascii2native.Ascii2NativeMojo.MOJO_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ascii2native" + "'", str0, "ascii2native");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.lang.Class<?> wildcardClass1 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.lang.Class<?> wildcardClass5 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.lang.Class<?> wildcardClass3 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.lang.Class<?> wildcardClass7 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass4 = log3.getClass();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo2 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo2.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo2.setLog(log5);
        java.util.Map map7 = null;
        ascii2NativeMojo2.setPluginContext(map7);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map10 = ascii2NativeMojo9.getPluginContext();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo9.getLog();
        ascii2NativeMojo2.setLog(log11);
        ascii2NativeMojo0.setLog(log11);
        java.lang.Class<?> wildcardClass14 = log11.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo0.getLog();
        java.util.Map map11 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map11);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        java.util.Map map10 = null;
        ascii2NativeMojo0.setPluginContext(map10);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.lang.Class<?> wildcardClass11 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = ascii2NativeMojo10.getPluginContext();
        org.apache.maven.plugin.logging.Log log12 = ascii2NativeMojo10.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo13 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map14 = null;
        ascii2NativeMojo13.setPluginContext(map14);
        org.apache.maven.plugin.logging.Log log16 = null;
        ascii2NativeMojo13.setLog(log16);
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo13.getLog();
        ascii2NativeMojo10.setLog(log18);
        ascii2NativeMojo0.setLog(log18);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log18);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        java.util.Map map4 = null;
        ascii2NativeMojo0.setPluginContext(map4);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        java.util.Map map10 = null;
        ascii2NativeMojo0.setPluginContext(map10);
        java.util.Map map12 = ascii2NativeMojo0.getPluginContext();
        java.lang.Class<?> wildcardClass13 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo0.getLog();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo2 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo2.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo2.setLog(log5);
        java.util.Map map7 = null;
        ascii2NativeMojo2.setPluginContext(map7);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map10 = ascii2NativeMojo9.getPluginContext();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo9.getLog();
        ascii2NativeMojo2.setLog(log11);
        ascii2NativeMojo0.setLog(log11);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo0.setLog(log11);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo0.getLog();
        java.util.Map map11 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map13 = null;
        ascii2NativeMojo12.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo12.getLog();
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo12.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo19.setLog(log20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        java.util.Map map24 = null;
        ascii2NativeMojo19.setPluginContext(map24);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo26 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map27 = ascii2NativeMojo26.getPluginContext();
        org.apache.maven.plugin.logging.Log log28 = ascii2NativeMojo26.getLog();
        ascii2NativeMojo19.setLog(log28);
        ascii2NativeMojo12.setLog(log28);
        ascii2NativeMojo0.setLog(log28);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNotNull(log28);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        java.lang.Class<?> wildcardClass10 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log4 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass5 = log4.getClass();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass3 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = map8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map6 = null;
        ascii2NativeMojo5.setPluginContext(map6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo5.getLog();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo5.getLog();
        ascii2NativeMojo0.setLog(log11);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo0.getLog();
        java.util.Map map9 = null;
        ascii2NativeMojo0.setPluginContext(map9);
        java.lang.Class<?> wildcardClass11 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = null;
        ascii2NativeMojo0.setPluginContext(map7);
        java.lang.Class<?> wildcardClass9 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass8 = log7.getClass();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass16 = log15.getClass();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.lang.Class<?> wildcardClass13 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        java.lang.Class<?> wildcardClass15 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        java.util.Map map6 = null;
        ascii2NativeMojo0.setPluginContext(map6);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        java.lang.Class<?> wildcardClass3 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo8 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map9 = ascii2NativeMojo8.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo8.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        java.util.Map map23 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map23);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        java.util.Map map3 = null;
        ascii2NativeMojo0.setPluginContext(map3);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo7.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo7.setLog(log10);
        java.util.Map map12 = null;
        ascii2NativeMojo7.setPluginContext(map12);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo14 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map15 = ascii2NativeMojo14.getPluginContext();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo14.getLog();
        ascii2NativeMojo7.setLog(log16);
        ascii2NativeMojo0.setLog(log16);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo19.setLog(log20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        java.util.Map map24 = null;
        ascii2NativeMojo19.setPluginContext(map24);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo26 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map27 = ascii2NativeMojo26.getPluginContext();
        org.apache.maven.plugin.logging.Log log28 = ascii2NativeMojo26.getLog();
        ascii2NativeMojo19.setLog(log28);
        java.util.Map map30 = null;
        ascii2NativeMojo19.setPluginContext(map30);
        java.util.Map map32 = null;
        ascii2NativeMojo19.setPluginContext(map32);
        org.apache.maven.plugin.logging.Log log34 = ascii2NativeMojo19.getLog();
        java.util.Map map35 = ascii2NativeMojo19.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo36 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map37 = ascii2NativeMojo36.getPluginContext();
        org.apache.maven.plugin.logging.Log log38 = ascii2NativeMojo36.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo39 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map40 = null;
        ascii2NativeMojo39.setPluginContext(map40);
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo39.setLog(log42);
        org.apache.maven.plugin.logging.Log log44 = ascii2NativeMojo39.getLog();
        ascii2NativeMojo36.setLog(log44);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo46 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map47 = null;
        ascii2NativeMojo46.setPluginContext(map47);
        org.apache.maven.plugin.logging.Log log49 = null;
        ascii2NativeMojo46.setLog(log49);
        org.apache.maven.plugin.logging.Log log51 = ascii2NativeMojo46.getLog();
        org.apache.maven.plugin.logging.Log log52 = ascii2NativeMojo46.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo53 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log54 = null;
        ascii2NativeMojo53.setLog(log54);
        org.apache.maven.plugin.logging.Log log56 = null;
        ascii2NativeMojo53.setLog(log56);
        java.util.Map map58 = null;
        ascii2NativeMojo53.setPluginContext(map58);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo60 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map61 = ascii2NativeMojo60.getPluginContext();
        org.apache.maven.plugin.logging.Log log62 = ascii2NativeMojo60.getLog();
        ascii2NativeMojo53.setLog(log62);
        ascii2NativeMojo46.setLog(log62);
        ascii2NativeMojo36.setLog(log62);
        ascii2NativeMojo19.setLog(log62);
        ascii2NativeMojo0.setLog(log62);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertNull(map35);
        org.junit.Assert.assertNull(map37);
        org.junit.Assert.assertNotNull(log38);
        org.junit.Assert.assertNotNull(log44);
        org.junit.Assert.assertNotNull(log51);
        org.junit.Assert.assertNotNull(log52);
        org.junit.Assert.assertNull(map61);
        org.junit.Assert.assertNotNull(log62);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = map1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo10.getLog();
        ascii2NativeMojo0.setLog(log16);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo0.getLog();
        java.util.Map map11 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map13 = null;
        ascii2NativeMojo12.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo12.getLog();
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo12.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo19.setLog(log20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        java.util.Map map24 = null;
        ascii2NativeMojo19.setPluginContext(map24);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo26 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map27 = ascii2NativeMojo26.getPluginContext();
        org.apache.maven.plugin.logging.Log log28 = ascii2NativeMojo26.getLog();
        ascii2NativeMojo19.setLog(log28);
        ascii2NativeMojo12.setLog(log28);
        ascii2NativeMojo0.setLog(log28);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo32 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log33 = null;
        ascii2NativeMojo32.setLog(log33);
        org.apache.maven.plugin.logging.Log log35 = null;
        ascii2NativeMojo32.setLog(log35);
        org.apache.maven.plugin.logging.Log log37 = ascii2NativeMojo32.getLog();
        ascii2NativeMojo0.setLog(log37);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(log37);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo4 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map5 = null;
        ascii2NativeMojo4.setPluginContext(map5);
        org.apache.maven.plugin.logging.Log log7 = null;
        ascii2NativeMojo4.setLog(log7);
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo4.getLog();
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo4.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo11 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo11.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo11.setLog(log14);
        java.util.Map map16 = null;
        ascii2NativeMojo11.setPluginContext(map16);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = ascii2NativeMojo18.getPluginContext();
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo18.getLog();
        ascii2NativeMojo11.setLog(log20);
        ascii2NativeMojo4.setLog(log20);
        ascii2NativeMojo0.setLog(log20);
        java.lang.Class<?> wildcardClass24 = log20.getClass();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log4 = ascii2NativeMojo0.getLog();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo0.getLog();
        java.util.Map map11 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map13 = null;
        ascii2NativeMojo12.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo12.getLog();
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo12.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo19.setLog(log20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        java.util.Map map24 = null;
        ascii2NativeMojo19.setPluginContext(map24);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo26 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map27 = ascii2NativeMojo26.getPluginContext();
        org.apache.maven.plugin.logging.Log log28 = ascii2NativeMojo26.getLog();
        ascii2NativeMojo19.setLog(log28);
        ascii2NativeMojo12.setLog(log28);
        ascii2NativeMojo0.setLog(log28);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo32 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log33 = null;
        ascii2NativeMojo32.setLog(log33);
        org.apache.maven.plugin.logging.Log log35 = null;
        ascii2NativeMojo32.setLog(log35);
        org.apache.maven.plugin.logging.Log log37 = ascii2NativeMojo32.getLog();
        ascii2NativeMojo0.setLog(log37);
        org.apache.maven.plugin.logging.Log log39 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass40 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertNotNull(log39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = map8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo22 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map23 = ascii2NativeMojo22.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log25 = null;
        ascii2NativeMojo24.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = null;
        ascii2NativeMojo24.setLog(log27);
        java.util.Map map29 = null;
        ascii2NativeMojo24.setPluginContext(map29);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo31 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map32 = ascii2NativeMojo31.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo31.getLog();
        ascii2NativeMojo24.setLog(log33);
        ascii2NativeMojo22.setLog(log33);
        ascii2NativeMojo0.setLog(log33);
        org.apache.maven.plugin.logging.Log log37 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass38 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo0.getLog();
        java.util.Map map11 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map13 = null;
        ascii2NativeMojo12.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo12.getLog();
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo12.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo19.setLog(log20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        java.util.Map map24 = null;
        ascii2NativeMojo19.setPluginContext(map24);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo26 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map27 = ascii2NativeMojo26.getPluginContext();
        org.apache.maven.plugin.logging.Log log28 = ascii2NativeMojo26.getLog();
        ascii2NativeMojo19.setLog(log28);
        ascii2NativeMojo12.setLog(log28);
        ascii2NativeMojo0.setLog(log28);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo32 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log33 = null;
        ascii2NativeMojo32.setLog(log33);
        org.apache.maven.plugin.logging.Log log35 = null;
        ascii2NativeMojo32.setLog(log35);
        org.apache.maven.plugin.logging.Log log37 = ascii2NativeMojo32.getLog();
        ascii2NativeMojo0.setLog(log37);
        java.lang.Class<?> wildcardClass39 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.lang.Class<?> wildcardClass5 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo8 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo8.setLog(log9);
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo8.setLog(log11);
        java.util.Map map13 = null;
        ascii2NativeMojo8.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo15.getLog();
        ascii2NativeMojo8.setLog(log17);
        java.util.Map map19 = null;
        ascii2NativeMojo8.setPluginContext(map19);
        java.util.Map map21 = null;
        ascii2NativeMojo8.setPluginContext(map21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo8.getLog();
        ascii2NativeMojo0.setLog(log23);
        java.lang.Class<?> wildcardClass25 = log23.getClass();
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass9 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo9.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo9.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo9.getPluginContext();
        java.util.Map map17 = null;
        ascii2NativeMojo9.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = null;
        ascii2NativeMojo19.setPluginContext(map20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = ascii2NativeMojo19.getLog();
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo9.setLog(log25);
        ascii2NativeMojo0.setLog(log25);
        java.util.Map map28 = null;
        ascii2NativeMojo0.setPluginContext(map28);
        java.lang.Class<?> wildcardClass30 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map10 = null;
        ascii2NativeMojo9.setPluginContext(map10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        java.util.Map map14 = null;
        ascii2NativeMojo9.setPluginContext(map14);
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo9.getLog();
        ascii2NativeMojo0.setLog(log16);
        org.apache.maven.plugin.logging.Log log18 = null;
        ascii2NativeMojo0.setLog(log18);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log16);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        java.util.Map map15 = null;
        ascii2NativeMojo0.setPluginContext(map15);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo8 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo8.setLog(log9);
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo8.setLog(log11);
        java.util.Map map13 = null;
        ascii2NativeMojo8.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo15.getLog();
        ascii2NativeMojo8.setLog(log17);
        java.util.Map map19 = null;
        ascii2NativeMojo8.setPluginContext(map19);
        java.util.Map map21 = null;
        ascii2NativeMojo8.setPluginContext(map21);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo23 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map24 = ascii2NativeMojo23.getPluginContext();
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo23.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo26 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map27 = null;
        ascii2NativeMojo26.setPluginContext(map27);
        org.apache.maven.plugin.logging.Log log29 = null;
        ascii2NativeMojo26.setLog(log29);
        org.apache.maven.plugin.logging.Log log31 = ascii2NativeMojo26.getLog();
        ascii2NativeMojo23.setLog(log31);
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo23.getLog();
        ascii2NativeMojo8.setLog(log33);
        ascii2NativeMojo0.setLog(log33);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log31);
        org.junit.Assert.assertNotNull(log33);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo9.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo9.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo9.getPluginContext();
        java.util.Map map17 = null;
        ascii2NativeMojo9.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = null;
        ascii2NativeMojo19.setPluginContext(map20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = ascii2NativeMojo19.getLog();
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo9.setLog(log25);
        ascii2NativeMojo0.setLog(log25);
        java.util.Map map28 = null;
        ascii2NativeMojo0.setPluginContext(map28);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(log25);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        java.util.Map map15 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(map15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        java.lang.Class<?> wildcardClass22 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo0.getLog();
        java.util.Map map9 = null;
        ascii2NativeMojo0.setPluginContext(map9);
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo6.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo6.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo0.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = map16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map16);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo6.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo6.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo0.setLog(log14);
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map18);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo10.getLog();
        ascii2NativeMojo0.setLog(log16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(map18);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo0.getLog();
        java.util.Map map16 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(map16);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo4 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map5 = ascii2NativeMojo4.getPluginContext();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo4.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = null;
        ascii2NativeMojo7.setPluginContext(map8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo7.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo4.setLog(log12);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo14 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map15 = null;
        ascii2NativeMojo14.setPluginContext(map15);
        org.apache.maven.plugin.logging.Log log17 = null;
        ascii2NativeMojo14.setLog(log17);
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo14.getLog();
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo14.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo21 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo21.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = null;
        ascii2NativeMojo21.setLog(log24);
        java.util.Map map26 = null;
        ascii2NativeMojo21.setPluginContext(map26);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo28 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map29 = ascii2NativeMojo28.getPluginContext();
        org.apache.maven.plugin.logging.Log log30 = ascii2NativeMojo28.getLog();
        ascii2NativeMojo21.setLog(log30);
        ascii2NativeMojo14.setLog(log30);
        ascii2NativeMojo4.setLog(log30);
        ascii2NativeMojo0.setLog(log30);
        java.lang.Class<?> wildcardClass35 = log30.getClass();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNotNull(log30);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo5.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo5.setLog(log10);
        java.util.Map map12 = ascii2NativeMojo5.getPluginContext();
        java.util.Map map13 = null;
        ascii2NativeMojo5.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo15.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = null;
        ascii2NativeMojo18.setPluginContext(map19);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo18.setLog(log21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo18.getLog();
        ascii2NativeMojo15.setLog(log23);
        ascii2NativeMojo5.setLog(log23);
        ascii2NativeMojo0.setLog(log23);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo27 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map28 = ascii2NativeMojo27.getPluginContext();
        org.apache.maven.plugin.logging.Log log29 = ascii2NativeMojo27.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo30 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map31 = null;
        ascii2NativeMojo30.setPluginContext(map31);
        org.apache.maven.plugin.logging.Log log33 = null;
        ascii2NativeMojo30.setLog(log33);
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo30.getLog();
        ascii2NativeMojo27.setLog(log35);
        org.apache.maven.plugin.logging.Log log37 = ascii2NativeMojo27.getLog();
        java.util.Map map38 = ascii2NativeMojo27.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo39 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map40 = null;
        ascii2NativeMojo39.setPluginContext(map40);
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo39.setLog(log42);
        org.apache.maven.plugin.logging.Log log44 = ascii2NativeMojo39.getLog();
        org.apache.maven.plugin.logging.Log log45 = ascii2NativeMojo39.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo46 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log47 = null;
        ascii2NativeMojo46.setLog(log47);
        org.apache.maven.plugin.logging.Log log49 = null;
        ascii2NativeMojo46.setLog(log49);
        java.util.Map map51 = null;
        ascii2NativeMojo46.setPluginContext(map51);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo53 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map54 = ascii2NativeMojo53.getPluginContext();
        org.apache.maven.plugin.logging.Log log55 = ascii2NativeMojo53.getLog();
        ascii2NativeMojo46.setLog(log55);
        ascii2NativeMojo39.setLog(log55);
        ascii2NativeMojo27.setLog(log55);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo59 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log60 = null;
        ascii2NativeMojo59.setLog(log60);
        org.apache.maven.plugin.logging.Log log62 = null;
        ascii2NativeMojo59.setLog(log62);
        org.apache.maven.plugin.logging.Log log64 = ascii2NativeMojo59.getLog();
        ascii2NativeMojo27.setLog(log64);
        org.apache.maven.plugin.logging.Log log66 = ascii2NativeMojo27.getLog();
        ascii2NativeMojo0.setLog(log66);
        java.util.Map map68 = null;
        ascii2NativeMojo0.setPluginContext(map68);
        java.lang.Class<?> wildcardClass70 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNotNull(log29);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertNull(map38);
        org.junit.Assert.assertNotNull(log44);
        org.junit.Assert.assertNotNull(log45);
        org.junit.Assert.assertNull(map54);
        org.junit.Assert.assertNotNull(log55);
        org.junit.Assert.assertNotNull(log64);
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log4 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass5 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        java.lang.Class<?> wildcardClass9 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo8 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map9 = ascii2NativeMojo8.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo8.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        java.lang.Class<?> wildcardClass23 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo0.getLog();
        java.util.Map map14 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass16 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo10.getLog();
        ascii2NativeMojo0.setLog(log16);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = null;
        ascii2NativeMojo18.setPluginContext(map19);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo18.setLog(log21);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo23 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map24 = null;
        ascii2NativeMojo23.setPluginContext(map24);
        org.apache.maven.plugin.logging.Log log26 = null;
        ascii2NativeMojo23.setLog(log26);
        org.apache.maven.plugin.logging.Log log28 = ascii2NativeMojo23.getLog();
        org.apache.maven.plugin.logging.Log log29 = ascii2NativeMojo23.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo30 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log31 = null;
        ascii2NativeMojo30.setLog(log31);
        org.apache.maven.plugin.logging.Log log33 = null;
        ascii2NativeMojo30.setLog(log33);
        java.util.Map map35 = null;
        ascii2NativeMojo30.setPluginContext(map35);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo37 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map38 = ascii2NativeMojo37.getPluginContext();
        org.apache.maven.plugin.logging.Log log39 = ascii2NativeMojo37.getLog();
        ascii2NativeMojo30.setLog(log39);
        ascii2NativeMojo23.setLog(log39);
        ascii2NativeMojo18.setLog(log39);
        ascii2NativeMojo0.setLog(log39);
        java.lang.Class<?> wildcardClass44 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(log29);
        org.junit.Assert.assertNull(map38);
        org.junit.Assert.assertNotNull(log39);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo11 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo11.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo11.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo11.getPluginContext();
        java.util.Map map17 = ascii2NativeMojo11.getPluginContext();
        java.util.Map map18 = ascii2NativeMojo11.getPluginContext();
        java.util.Map map19 = ascii2NativeMojo11.getPluginContext();
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo11.getLog();
        ascii2NativeMojo0.setLog(log20);
        java.util.Map map22 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNull(map22);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = ascii2NativeMojo10.getPluginContext();
        org.apache.maven.plugin.logging.Log log12 = ascii2NativeMojo10.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo13 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map14 = null;
        ascii2NativeMojo13.setPluginContext(map14);
        org.apache.maven.plugin.logging.Log log16 = null;
        ascii2NativeMojo13.setLog(log16);
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo13.getLog();
        ascii2NativeMojo10.setLog(log18);
        ascii2NativeMojo0.setLog(log18);
        java.lang.Class<?> wildcardClass21 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        java.lang.Class<?> wildcardClass9 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map10 = ascii2NativeMojo9.getPluginContext();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo9.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map13 = null;
        ascii2NativeMojo12.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo12.getLog();
        ascii2NativeMojo9.setLog(log17);
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo9.getLog();
        java.util.Map map20 = ascii2NativeMojo9.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo21 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map22 = null;
        ascii2NativeMojo21.setPluginContext(map22);
        org.apache.maven.plugin.logging.Log log24 = null;
        ascii2NativeMojo21.setLog(log24);
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo21.getLog();
        org.apache.maven.plugin.logging.Log log27 = ascii2NativeMojo21.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo28 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log29 = null;
        ascii2NativeMojo28.setLog(log29);
        org.apache.maven.plugin.logging.Log log31 = null;
        ascii2NativeMojo28.setLog(log31);
        java.util.Map map33 = null;
        ascii2NativeMojo28.setPluginContext(map33);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo35 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map36 = ascii2NativeMojo35.getPluginContext();
        org.apache.maven.plugin.logging.Log log37 = ascii2NativeMojo35.getLog();
        ascii2NativeMojo28.setLog(log37);
        ascii2NativeMojo21.setLog(log37);
        ascii2NativeMojo9.setLog(log37);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo41 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo41.setLog(log42);
        org.apache.maven.plugin.logging.Log log44 = null;
        ascii2NativeMojo41.setLog(log44);
        org.apache.maven.plugin.logging.Log log46 = ascii2NativeMojo41.getLog();
        ascii2NativeMojo9.setLog(log46);
        org.apache.maven.plugin.logging.Log log48 = ascii2NativeMojo9.getLog();
        ascii2NativeMojo0.setLog(log48);
        java.lang.Class<?> wildcardClass50 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNull(map36);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertNotNull(log46);
        org.junit.Assert.assertNotNull(log48);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo16 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log17 = null;
        ascii2NativeMojo16.setLog(log17);
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo16.getLog();
        ascii2NativeMojo0.setLog(log19);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log19);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log4 = ascii2NativeMojo0.getLog();
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo6.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo6.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo0.setLog(log14);
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = map18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map18);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        java.util.Map map3 = null;
        ascii2NativeMojo0.setPluginContext(map3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo5.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo5.getLog();
        ascii2NativeMojo0.setLog(log10);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo0.getLog();
        java.util.Map map16 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo20 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map21 = null;
        ascii2NativeMojo20.setPluginContext(map21);
        org.apache.maven.plugin.logging.Log log23 = null;
        ascii2NativeMojo20.setLog(log23);
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo20.getLog();
        ascii2NativeMojo17.setLog(log25);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo27 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map28 = null;
        ascii2NativeMojo27.setPluginContext(map28);
        org.apache.maven.plugin.logging.Log log30 = null;
        ascii2NativeMojo27.setLog(log30);
        org.apache.maven.plugin.logging.Log log32 = ascii2NativeMojo27.getLog();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo27.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo34 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log35 = null;
        ascii2NativeMojo34.setLog(log35);
        org.apache.maven.plugin.logging.Log log37 = null;
        ascii2NativeMojo34.setLog(log37);
        java.util.Map map39 = null;
        ascii2NativeMojo34.setPluginContext(map39);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo41 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map42 = ascii2NativeMojo41.getPluginContext();
        org.apache.maven.plugin.logging.Log log43 = ascii2NativeMojo41.getLog();
        ascii2NativeMojo34.setLog(log43);
        ascii2NativeMojo27.setLog(log43);
        ascii2NativeMojo17.setLog(log43);
        ascii2NativeMojo0.setLog(log43);
        java.lang.Class<?> wildcardClass48 = log43.getClass();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map42);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        java.util.Map map4 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(map4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo9.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo9.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo9.getPluginContext();
        java.util.Map map17 = null;
        ascii2NativeMojo9.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = null;
        ascii2NativeMojo19.setPluginContext(map20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = ascii2NativeMojo19.getLog();
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo9.setLog(log25);
        ascii2NativeMojo0.setLog(log25);
        java.util.Map map28 = null;
        ascii2NativeMojo0.setPluginContext(map28);
        java.util.Map map30 = null;
        ascii2NativeMojo0.setPluginContext(map30);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo32 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log33 = null;
        ascii2NativeMojo32.setLog(log33);
        org.apache.maven.plugin.logging.Log log35 = null;
        ascii2NativeMojo32.setLog(log35);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo37 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map38 = null;
        ascii2NativeMojo37.setPluginContext(map38);
        org.apache.maven.plugin.logging.Log log40 = null;
        ascii2NativeMojo37.setLog(log40);
        org.apache.maven.plugin.logging.Log log42 = ascii2NativeMojo37.getLog();
        org.apache.maven.plugin.logging.Log log43 = ascii2NativeMojo37.getLog();
        ascii2NativeMojo32.setLog(log43);
        java.util.Map map45 = ascii2NativeMojo32.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo46 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map47 = null;
        ascii2NativeMojo46.setPluginContext(map47);
        org.apache.maven.plugin.logging.Log log49 = null;
        ascii2NativeMojo46.setLog(log49);
        org.apache.maven.plugin.logging.Log log51 = ascii2NativeMojo46.getLog();
        org.apache.maven.plugin.logging.Log log52 = ascii2NativeMojo46.getLog();
        org.apache.maven.plugin.logging.Log log53 = ascii2NativeMojo46.getLog();
        ascii2NativeMojo32.setLog(log53);
        ascii2NativeMojo0.setLog(log53);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log42);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertNull(map45);
        org.junit.Assert.assertNotNull(log51);
        org.junit.Assert.assertNotNull(log52);
        org.junit.Assert.assertNotNull(log53);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = null;
        ascii2NativeMojo0.setPluginContext(map3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo5.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo5.setLog(log10);
        java.util.Map map12 = ascii2NativeMojo5.getPluginContext();
        java.util.Map map13 = null;
        ascii2NativeMojo5.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo15.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = null;
        ascii2NativeMojo18.setPluginContext(map19);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo18.setLog(log21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo18.getLog();
        ascii2NativeMojo15.setLog(log23);
        ascii2NativeMojo5.setLog(log23);
        ascii2NativeMojo0.setLog(log23);
        java.util.Map map27 = null;
        ascii2NativeMojo0.setPluginContext(map27);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log23);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = ascii2NativeMojo3.getPluginContext();
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo3.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo3.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo3.getLog();
        java.util.Map map14 = ascii2NativeMojo3.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = null;
        ascii2NativeMojo15.setPluginContext(map16);
        org.apache.maven.plugin.logging.Log log18 = null;
        ascii2NativeMojo15.setLog(log18);
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo15.getLog();
        org.apache.maven.plugin.logging.Log log21 = ascii2NativeMojo15.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo22 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log23 = null;
        ascii2NativeMojo22.setLog(log23);
        org.apache.maven.plugin.logging.Log log25 = null;
        ascii2NativeMojo22.setLog(log25);
        java.util.Map map27 = null;
        ascii2NativeMojo22.setPluginContext(map27);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo29 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map30 = ascii2NativeMojo29.getPluginContext();
        org.apache.maven.plugin.logging.Log log31 = ascii2NativeMojo29.getLog();
        ascii2NativeMojo22.setLog(log31);
        ascii2NativeMojo15.setLog(log31);
        ascii2NativeMojo3.setLog(log31);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo35 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log36 = null;
        ascii2NativeMojo35.setLog(log36);
        org.apache.maven.plugin.logging.Log log38 = null;
        ascii2NativeMojo35.setLog(log38);
        org.apache.maven.plugin.logging.Log log40 = ascii2NativeMojo35.getLog();
        ascii2NativeMojo3.setLog(log40);
        ascii2NativeMojo0.setLog(log40);
        java.lang.Class<?> wildcardClass43 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNotNull(log31);
        org.junit.Assert.assertNotNull(log40);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = map11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(map11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = null;
        ascii2NativeMojo0.setPluginContext(map7);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo9.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo9.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo9.getPluginContext();
        java.util.Map map17 = null;
        ascii2NativeMojo9.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = null;
        ascii2NativeMojo19.setPluginContext(map20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = ascii2NativeMojo19.getLog();
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo9.setLog(log25);
        ascii2NativeMojo0.setLog(log25);
        java.util.Map map28 = null;
        ascii2NativeMojo0.setPluginContext(map28);
        java.util.Map map30 = null;
        ascii2NativeMojo0.setPluginContext(map30);
        java.lang.Class<?> wildcardClass32 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log4 = ascii2NativeMojo0.getLog();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(log4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo0.getLog();
        java.util.Map map9 = null;
        ascii2NativeMojo0.setPluginContext(map9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo15.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = null;
        ascii2NativeMojo18.setPluginContext(map19);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo18.setLog(log21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo18.getLog();
        ascii2NativeMojo15.setLog(log23);
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo15.getLog();
        ascii2NativeMojo0.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = ascii2NativeMojo0.getLog();
        java.util.Map map28 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNull(map28);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo22 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map23 = ascii2NativeMojo22.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log25 = null;
        ascii2NativeMojo24.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = null;
        ascii2NativeMojo24.setLog(log27);
        java.util.Map map29 = null;
        ascii2NativeMojo24.setPluginContext(map29);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo31 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map32 = ascii2NativeMojo31.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo31.getLog();
        ascii2NativeMojo24.setLog(log33);
        ascii2NativeMojo22.setLog(log33);
        ascii2NativeMojo0.setLog(log33);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo37 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log38 = null;
        ascii2NativeMojo37.setLog(log38);
        org.apache.maven.plugin.logging.Log log40 = null;
        ascii2NativeMojo37.setLog(log40);
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo37.setLog(log42);
        java.util.Map map44 = ascii2NativeMojo37.getPluginContext();
        java.util.Map map45 = null;
        ascii2NativeMojo37.setPluginContext(map45);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo47 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log48 = null;
        ascii2NativeMojo47.setLog(log48);
        org.apache.maven.plugin.logging.Log log50 = null;
        ascii2NativeMojo47.setLog(log50);
        java.util.Map map52 = null;
        ascii2NativeMojo47.setPluginContext(map52);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo54 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map55 = ascii2NativeMojo54.getPluginContext();
        org.apache.maven.plugin.logging.Log log56 = ascii2NativeMojo54.getLog();
        ascii2NativeMojo47.setLog(log56);
        ascii2NativeMojo37.setLog(log56);
        ascii2NativeMojo0.setLog(log56);
        java.util.Map map60 = null;
        ascii2NativeMojo0.setPluginContext(map60);
        java.lang.Class<?> wildcardClass62 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map44);
        org.junit.Assert.assertNull(map55);
        org.junit.Assert.assertNotNull(log56);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo10.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log18 = null;
        ascii2NativeMojo17.setLog(log18);
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo17.setLog(log20);
        java.util.Map map22 = null;
        ascii2NativeMojo17.setPluginContext(map22);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map25 = ascii2NativeMojo24.getPluginContext();
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo24.getLog();
        ascii2NativeMojo17.setLog(log26);
        ascii2NativeMojo10.setLog(log26);
        ascii2NativeMojo0.setLog(log26);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo30 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map31 = ascii2NativeMojo30.getPluginContext();
        org.apache.maven.plugin.logging.Log log32 = ascii2NativeMojo30.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo33 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map34 = ascii2NativeMojo33.getPluginContext();
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo33.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo36 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map37 = null;
        ascii2NativeMojo36.setPluginContext(map37);
        org.apache.maven.plugin.logging.Log log39 = null;
        ascii2NativeMojo36.setLog(log39);
        org.apache.maven.plugin.logging.Log log41 = ascii2NativeMojo36.getLog();
        ascii2NativeMojo33.setLog(log41);
        org.apache.maven.plugin.logging.Log log43 = ascii2NativeMojo33.getLog();
        java.util.Map map44 = ascii2NativeMojo33.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo45 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map46 = null;
        ascii2NativeMojo45.setPluginContext(map46);
        org.apache.maven.plugin.logging.Log log48 = null;
        ascii2NativeMojo45.setLog(log48);
        org.apache.maven.plugin.logging.Log log50 = ascii2NativeMojo45.getLog();
        org.apache.maven.plugin.logging.Log log51 = ascii2NativeMojo45.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo52 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log53 = null;
        ascii2NativeMojo52.setLog(log53);
        org.apache.maven.plugin.logging.Log log55 = null;
        ascii2NativeMojo52.setLog(log55);
        java.util.Map map57 = null;
        ascii2NativeMojo52.setPluginContext(map57);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo59 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map60 = ascii2NativeMojo59.getPluginContext();
        org.apache.maven.plugin.logging.Log log61 = ascii2NativeMojo59.getLog();
        ascii2NativeMojo52.setLog(log61);
        ascii2NativeMojo45.setLog(log61);
        ascii2NativeMojo33.setLog(log61);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo65 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log66 = null;
        ascii2NativeMojo65.setLog(log66);
        org.apache.maven.plugin.logging.Log log68 = null;
        ascii2NativeMojo65.setLog(log68);
        org.apache.maven.plugin.logging.Log log70 = ascii2NativeMojo65.getLog();
        ascii2NativeMojo33.setLog(log70);
        ascii2NativeMojo30.setLog(log70);
        ascii2NativeMojo0.setLog(log70);
        org.apache.maven.plugin.logging.Log log74 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log75 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNull(map31);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertNull(map44);
        org.junit.Assert.assertNotNull(log50);
        org.junit.Assert.assertNotNull(log51);
        org.junit.Assert.assertNull(map60);
        org.junit.Assert.assertNotNull(log61);
        org.junit.Assert.assertNotNull(log70);
        org.junit.Assert.assertNotNull(log74);
        org.junit.Assert.assertNotNull(log75);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo8 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map9 = ascii2NativeMojo8.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo8.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo23 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map24 = null;
        ascii2NativeMojo23.setPluginContext(map24);
        org.apache.maven.plugin.logging.Log log26 = null;
        ascii2NativeMojo23.setLog(log26);
        org.apache.maven.plugin.logging.Log log28 = ascii2NativeMojo23.getLog();
        org.apache.maven.plugin.logging.Log log29 = ascii2NativeMojo23.getLog();
        ascii2NativeMojo0.setLog(log29);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(log29);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo4 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map5 = ascii2NativeMojo4.getPluginContext();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo4.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = null;
        ascii2NativeMojo7.setPluginContext(map8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo7.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo4.setLog(log12);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo14 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map15 = null;
        ascii2NativeMojo14.setPluginContext(map15);
        org.apache.maven.plugin.logging.Log log17 = null;
        ascii2NativeMojo14.setLog(log17);
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo14.getLog();
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo14.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo21 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo21.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = null;
        ascii2NativeMojo21.setLog(log24);
        java.util.Map map26 = null;
        ascii2NativeMojo21.setPluginContext(map26);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo28 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map29 = ascii2NativeMojo28.getPluginContext();
        org.apache.maven.plugin.logging.Log log30 = ascii2NativeMojo28.getLog();
        ascii2NativeMojo21.setLog(log30);
        ascii2NativeMojo14.setLog(log30);
        ascii2NativeMojo4.setLog(log30);
        ascii2NativeMojo0.setLog(log30);
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo36 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map37 = null;
        ascii2NativeMojo36.setPluginContext(map37);
        org.apache.maven.plugin.logging.Log log39 = null;
        ascii2NativeMojo36.setLog(log39);
        org.apache.maven.plugin.logging.Log log41 = ascii2NativeMojo36.getLog();
        org.apache.maven.plugin.logging.Log log42 = ascii2NativeMojo36.getLog();
        ascii2NativeMojo0.setLog(log42);
        java.lang.Class<?> wildcardClass44 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNotNull(log30);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertNotNull(log42);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo0.getLog();
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        java.lang.Class<?> wildcardClass18 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map6 = null;
        ascii2NativeMojo5.setPluginContext(map6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo5.getLog();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo5.getLog();
        ascii2NativeMojo0.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo0.getLog();
        java.util.Map map15 = null;
        ascii2NativeMojo0.setPluginContext(map15);
        java.util.Map map17 = null;
        ascii2NativeMojo0.setPluginContext(map17);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map10 = null;
        ascii2NativeMojo9.setPluginContext(map10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        java.util.Map map14 = null;
        ascii2NativeMojo9.setPluginContext(map14);
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo9.getLog();
        ascii2NativeMojo0.setLog(log16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map19 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map19);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo0.getLog();
        java.util.Map map14 = null;
        ascii2NativeMojo0.setPluginContext(map14);
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        java.lang.Class<?> wildcardClass18 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map6 = null;
        ascii2NativeMojo5.setPluginContext(map6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo5.getLog();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo5.getLog();
        ascii2NativeMojo0.setLog(log11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log15);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo7.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo7.setLog(log10);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map13 = null;
        ascii2NativeMojo12.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo12.getLog();
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo12.getLog();
        ascii2NativeMojo7.setLog(log18);
        ascii2NativeMojo0.setLog(log18);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo0.setLog(log21);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log18);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo0.getLog();
        java.util.Map map11 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map13 = null;
        ascii2NativeMojo12.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo12.getLog();
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo12.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo19.setLog(log20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        java.util.Map map24 = null;
        ascii2NativeMojo19.setPluginContext(map24);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo26 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map27 = ascii2NativeMojo26.getPluginContext();
        org.apache.maven.plugin.logging.Log log28 = ascii2NativeMojo26.getLog();
        ascii2NativeMojo19.setLog(log28);
        ascii2NativeMojo12.setLog(log28);
        ascii2NativeMojo0.setLog(log28);
        java.util.Map map32 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNull(map32);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log4 = ascii2NativeMojo0.getLog();
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(map5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map6 = null;
        ascii2NativeMojo5.setPluginContext(map6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo5.getLog();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo5.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo12.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        java.util.Map map17 = null;
        ascii2NativeMojo12.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = ascii2NativeMojo19.getPluginContext();
        org.apache.maven.plugin.logging.Log log21 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo12.setLog(log21);
        ascii2NativeMojo5.setLog(log21);
        ascii2NativeMojo0.setLog(log21);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNotNull(log21);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map10 = null;
        ascii2NativeMojo9.setPluginContext(map10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        java.util.Map map14 = null;
        ascii2NativeMojo9.setPluginContext(map14);
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo9.getLog();
        ascii2NativeMojo0.setLog(log16);
        java.util.Map map18 = null;
        ascii2NativeMojo0.setPluginContext(map18);
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo0.getLog();
        java.util.Map map21 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNull(map21);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo4 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map5 = ascii2NativeMojo4.getPluginContext();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo4.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = null;
        ascii2NativeMojo7.setPluginContext(map8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo7.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo4.setLog(log12);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo14 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map15 = null;
        ascii2NativeMojo14.setPluginContext(map15);
        org.apache.maven.plugin.logging.Log log17 = null;
        ascii2NativeMojo14.setLog(log17);
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo14.getLog();
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo14.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo21 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo21.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = null;
        ascii2NativeMojo21.setLog(log24);
        java.util.Map map26 = null;
        ascii2NativeMojo21.setPluginContext(map26);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo28 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map29 = ascii2NativeMojo28.getPluginContext();
        org.apache.maven.plugin.logging.Log log30 = ascii2NativeMojo28.getLog();
        ascii2NativeMojo21.setLog(log30);
        ascii2NativeMojo14.setLog(log30);
        ascii2NativeMojo4.setLog(log30);
        ascii2NativeMojo0.setLog(log30);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNotNull(log30);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo4 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map5 = ascii2NativeMojo4.getPluginContext();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo4.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = null;
        ascii2NativeMojo7.setPluginContext(map8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo7.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo4.setLog(log12);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo14 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map15 = null;
        ascii2NativeMojo14.setPluginContext(map15);
        org.apache.maven.plugin.logging.Log log17 = null;
        ascii2NativeMojo14.setLog(log17);
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo14.getLog();
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo14.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo21 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo21.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = null;
        ascii2NativeMojo21.setLog(log24);
        java.util.Map map26 = null;
        ascii2NativeMojo21.setPluginContext(map26);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo28 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map29 = ascii2NativeMojo28.getPluginContext();
        org.apache.maven.plugin.logging.Log log30 = ascii2NativeMojo28.getLog();
        ascii2NativeMojo21.setLog(log30);
        ascii2NativeMojo14.setLog(log30);
        ascii2NativeMojo4.setLog(log30);
        ascii2NativeMojo0.setLog(log30);
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log36 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass37 = log36.getClass();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNotNull(log30);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo5.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo5.setLog(log10);
        java.util.Map map12 = ascii2NativeMojo5.getPluginContext();
        java.util.Map map13 = null;
        ascii2NativeMojo5.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo15.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = null;
        ascii2NativeMojo18.setPluginContext(map19);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo18.setLog(log21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo18.getLog();
        ascii2NativeMojo15.setLog(log23);
        ascii2NativeMojo5.setLog(log23);
        ascii2NativeMojo0.setLog(log23);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log23);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo0.getLog();
        java.util.Map map11 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map13 = null;
        ascii2NativeMojo12.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo12.getLog();
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo12.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo19.setLog(log20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        java.util.Map map24 = null;
        ascii2NativeMojo19.setPluginContext(map24);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo26 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map27 = ascii2NativeMojo26.getPluginContext();
        org.apache.maven.plugin.logging.Log log28 = ascii2NativeMojo26.getLog();
        ascii2NativeMojo19.setLog(log28);
        ascii2NativeMojo12.setLog(log28);
        ascii2NativeMojo0.setLog(log28);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo32 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log33 = null;
        ascii2NativeMojo32.setLog(log33);
        org.apache.maven.plugin.logging.Log log35 = null;
        ascii2NativeMojo32.setLog(log35);
        org.apache.maven.plugin.logging.Log log37 = ascii2NativeMojo32.getLog();
        ascii2NativeMojo0.setLog(log37);
        org.apache.maven.plugin.logging.Log log39 = ascii2NativeMojo0.getLog();
        java.util.Map map40 = null;
        ascii2NativeMojo0.setPluginContext(map40);
        org.apache.maven.plugin.logging.Log log42 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertNotNull(log39);
        org.junit.Assert.assertNotNull(log42);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map6 = null;
        ascii2NativeMojo5.setPluginContext(map6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo5.getLog();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo5.getLog();
        ascii2NativeMojo0.setLog(log11);
        java.lang.Class<?> wildcardClass13 = log11.getClass();
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo10.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log18 = null;
        ascii2NativeMojo17.setLog(log18);
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo17.setLog(log20);
        java.util.Map map22 = null;
        ascii2NativeMojo17.setPluginContext(map22);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map25 = ascii2NativeMojo24.getPluginContext();
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo24.getLog();
        ascii2NativeMojo17.setLog(log26);
        ascii2NativeMojo10.setLog(log26);
        ascii2NativeMojo0.setLog(log26);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo30 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map31 = ascii2NativeMojo30.getPluginContext();
        org.apache.maven.plugin.logging.Log log32 = ascii2NativeMojo30.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo33 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map34 = ascii2NativeMojo33.getPluginContext();
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo33.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo36 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map37 = null;
        ascii2NativeMojo36.setPluginContext(map37);
        org.apache.maven.plugin.logging.Log log39 = null;
        ascii2NativeMojo36.setLog(log39);
        org.apache.maven.plugin.logging.Log log41 = ascii2NativeMojo36.getLog();
        ascii2NativeMojo33.setLog(log41);
        org.apache.maven.plugin.logging.Log log43 = ascii2NativeMojo33.getLog();
        java.util.Map map44 = ascii2NativeMojo33.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo45 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map46 = null;
        ascii2NativeMojo45.setPluginContext(map46);
        org.apache.maven.plugin.logging.Log log48 = null;
        ascii2NativeMojo45.setLog(log48);
        org.apache.maven.plugin.logging.Log log50 = ascii2NativeMojo45.getLog();
        org.apache.maven.plugin.logging.Log log51 = ascii2NativeMojo45.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo52 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log53 = null;
        ascii2NativeMojo52.setLog(log53);
        org.apache.maven.plugin.logging.Log log55 = null;
        ascii2NativeMojo52.setLog(log55);
        java.util.Map map57 = null;
        ascii2NativeMojo52.setPluginContext(map57);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo59 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map60 = ascii2NativeMojo59.getPluginContext();
        org.apache.maven.plugin.logging.Log log61 = ascii2NativeMojo59.getLog();
        ascii2NativeMojo52.setLog(log61);
        ascii2NativeMojo45.setLog(log61);
        ascii2NativeMojo33.setLog(log61);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo65 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log66 = null;
        ascii2NativeMojo65.setLog(log66);
        org.apache.maven.plugin.logging.Log log68 = null;
        ascii2NativeMojo65.setLog(log68);
        org.apache.maven.plugin.logging.Log log70 = ascii2NativeMojo65.getLog();
        ascii2NativeMojo33.setLog(log70);
        ascii2NativeMojo30.setLog(log70);
        ascii2NativeMojo0.setLog(log70);
        org.apache.maven.plugin.logging.Log log74 = ascii2NativeMojo0.getLog();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNull(map31);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertNull(map44);
        org.junit.Assert.assertNotNull(log50);
        org.junit.Assert.assertNotNull(log51);
        org.junit.Assert.assertNull(map60);
        org.junit.Assert.assertNotNull(log61);
        org.junit.Assert.assertNotNull(log70);
        org.junit.Assert.assertNotNull(log74);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map4 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(map4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        java.lang.Class<?> wildcardClass10 = log8.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo10.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log18 = null;
        ascii2NativeMojo17.setLog(log18);
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo17.setLog(log20);
        java.util.Map map22 = null;
        ascii2NativeMojo17.setPluginContext(map22);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map25 = ascii2NativeMojo24.getPluginContext();
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo24.getLog();
        ascii2NativeMojo17.setLog(log26);
        ascii2NativeMojo10.setLog(log26);
        ascii2NativeMojo0.setLog(log26);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo30 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map31 = ascii2NativeMojo30.getPluginContext();
        org.apache.maven.plugin.logging.Log log32 = ascii2NativeMojo30.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo33 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map34 = ascii2NativeMojo33.getPluginContext();
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo33.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo36 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map37 = null;
        ascii2NativeMojo36.setPluginContext(map37);
        org.apache.maven.plugin.logging.Log log39 = null;
        ascii2NativeMojo36.setLog(log39);
        org.apache.maven.plugin.logging.Log log41 = ascii2NativeMojo36.getLog();
        ascii2NativeMojo33.setLog(log41);
        org.apache.maven.plugin.logging.Log log43 = ascii2NativeMojo33.getLog();
        java.util.Map map44 = ascii2NativeMojo33.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo45 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map46 = null;
        ascii2NativeMojo45.setPluginContext(map46);
        org.apache.maven.plugin.logging.Log log48 = null;
        ascii2NativeMojo45.setLog(log48);
        org.apache.maven.plugin.logging.Log log50 = ascii2NativeMojo45.getLog();
        org.apache.maven.plugin.logging.Log log51 = ascii2NativeMojo45.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo52 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log53 = null;
        ascii2NativeMojo52.setLog(log53);
        org.apache.maven.plugin.logging.Log log55 = null;
        ascii2NativeMojo52.setLog(log55);
        java.util.Map map57 = null;
        ascii2NativeMojo52.setPluginContext(map57);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo59 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map60 = ascii2NativeMojo59.getPluginContext();
        org.apache.maven.plugin.logging.Log log61 = ascii2NativeMojo59.getLog();
        ascii2NativeMojo52.setLog(log61);
        ascii2NativeMojo45.setLog(log61);
        ascii2NativeMojo33.setLog(log61);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo65 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log66 = null;
        ascii2NativeMojo65.setLog(log66);
        org.apache.maven.plugin.logging.Log log68 = null;
        ascii2NativeMojo65.setLog(log68);
        org.apache.maven.plugin.logging.Log log70 = ascii2NativeMojo65.getLog();
        ascii2NativeMojo33.setLog(log70);
        ascii2NativeMojo30.setLog(log70);
        ascii2NativeMojo0.setLog(log70);
        java.util.Map map74 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNull(map31);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertNull(map44);
        org.junit.Assert.assertNotNull(log50);
        org.junit.Assert.assertNotNull(log51);
        org.junit.Assert.assertNull(map60);
        org.junit.Assert.assertNotNull(log61);
        org.junit.Assert.assertNotNull(log70);
        org.junit.Assert.assertNull(map74);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = null;
        ascii2NativeMojo0.setPluginContext(map7);
        java.util.Map map9 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        java.util.Map map10 = null;
        ascii2NativeMojo0.setPluginContext(map10);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo12.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo12.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = null;
        ascii2NativeMojo18.setPluginContext(map19);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo18.setLog(log21);
        java.util.Map map23 = null;
        ascii2NativeMojo18.setPluginContext(map23);
        java.util.Map map25 = ascii2NativeMojo18.getPluginContext();
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo18.getLog();
        ascii2NativeMojo12.setLog(log26);
        java.util.Map map28 = null;
        ascii2NativeMojo12.setPluginContext(map28);
        java.util.Map map30 = ascii2NativeMojo12.getPluginContext();
        java.util.Map map31 = ascii2NativeMojo12.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo32 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map33 = null;
        ascii2NativeMojo32.setPluginContext(map33);
        org.apache.maven.plugin.logging.Log log35 = null;
        ascii2NativeMojo32.setLog(log35);
        java.util.Map map37 = null;
        ascii2NativeMojo32.setPluginContext(map37);
        java.util.Map map39 = ascii2NativeMojo32.getPluginContext();
        java.util.Map map40 = ascii2NativeMojo32.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo41 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map42 = ascii2NativeMojo41.getPluginContext();
        org.apache.maven.plugin.logging.Log log43 = ascii2NativeMojo41.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo44 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map45 = null;
        ascii2NativeMojo44.setPluginContext(map45);
        org.apache.maven.plugin.logging.Log log47 = null;
        ascii2NativeMojo44.setLog(log47);
        org.apache.maven.plugin.logging.Log log49 = ascii2NativeMojo44.getLog();
        ascii2NativeMojo41.setLog(log49);
        org.apache.maven.plugin.logging.Log log51 = ascii2NativeMojo41.getLog();
        java.util.Map map52 = ascii2NativeMojo41.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo53 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map54 = null;
        ascii2NativeMojo53.setPluginContext(map54);
        org.apache.maven.plugin.logging.Log log56 = null;
        ascii2NativeMojo53.setLog(log56);
        org.apache.maven.plugin.logging.Log log58 = ascii2NativeMojo53.getLog();
        org.apache.maven.plugin.logging.Log log59 = ascii2NativeMojo53.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo60 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log61 = null;
        ascii2NativeMojo60.setLog(log61);
        org.apache.maven.plugin.logging.Log log63 = null;
        ascii2NativeMojo60.setLog(log63);
        java.util.Map map65 = null;
        ascii2NativeMojo60.setPluginContext(map65);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo67 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map68 = ascii2NativeMojo67.getPluginContext();
        org.apache.maven.plugin.logging.Log log69 = ascii2NativeMojo67.getLog();
        ascii2NativeMojo60.setLog(log69);
        ascii2NativeMojo53.setLog(log69);
        ascii2NativeMojo41.setLog(log69);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo73 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log74 = null;
        ascii2NativeMojo73.setLog(log74);
        org.apache.maven.plugin.logging.Log log76 = null;
        ascii2NativeMojo73.setLog(log76);
        org.apache.maven.plugin.logging.Log log78 = ascii2NativeMojo73.getLog();
        ascii2NativeMojo41.setLog(log78);
        org.apache.maven.plugin.logging.Log log80 = ascii2NativeMojo41.getLog();
        ascii2NativeMojo32.setLog(log80);
        ascii2NativeMojo12.setLog(log80);
        ascii2NativeMojo0.setLog(log80);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNull(map31);
        org.junit.Assert.assertNull(map39);
        org.junit.Assert.assertNull(map40);
        org.junit.Assert.assertNull(map42);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertNotNull(log49);
        org.junit.Assert.assertNotNull(log51);
        org.junit.Assert.assertNull(map52);
        org.junit.Assert.assertNotNull(log58);
        org.junit.Assert.assertNotNull(log59);
        org.junit.Assert.assertNull(map68);
        org.junit.Assert.assertNotNull(log69);
        org.junit.Assert.assertNotNull(log78);
        org.junit.Assert.assertNotNull(log80);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map6 = null;
        ascii2NativeMojo5.setPluginContext(map6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo5.getLog();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo5.getLog();
        ascii2NativeMojo0.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo0.getLog();
        java.util.Map map14 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(map14);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = ascii2NativeMojo10.getPluginContext();
        org.apache.maven.plugin.logging.Log log12 = ascii2NativeMojo10.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo13 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map14 = null;
        ascii2NativeMojo13.setPluginContext(map14);
        org.apache.maven.plugin.logging.Log log16 = null;
        ascii2NativeMojo13.setLog(log16);
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo13.getLog();
        ascii2NativeMojo10.setLog(log18);
        ascii2NativeMojo0.setLog(log18);
        org.apache.maven.plugin.logging.Log log21 = ascii2NativeMojo0.getLog();
        java.util.Map map22 = null;
        ascii2NativeMojo0.setPluginContext(map22);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNotNull(log21);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo10.setLog(log15);
        java.util.Map map17 = ascii2NativeMojo10.getPluginContext();
        java.util.Map map18 = null;
        ascii2NativeMojo10.setPluginContext(map18);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo20 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map21 = null;
        ascii2NativeMojo20.setPluginContext(map21);
        org.apache.maven.plugin.logging.Log log23 = null;
        ascii2NativeMojo20.setLog(log23);
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo20.getLog();
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo20.getLog();
        ascii2NativeMojo10.setLog(log26);
        ascii2NativeMojo0.setLog(log26);
        java.lang.Class<?> wildcardClass29 = log26.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo22 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map23 = ascii2NativeMojo22.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log25 = null;
        ascii2NativeMojo24.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = null;
        ascii2NativeMojo24.setLog(log27);
        java.util.Map map29 = null;
        ascii2NativeMojo24.setPluginContext(map29);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo31 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map32 = ascii2NativeMojo31.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo31.getLog();
        ascii2NativeMojo24.setLog(log33);
        ascii2NativeMojo22.setLog(log33);
        ascii2NativeMojo0.setLog(log33);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo37 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log38 = null;
        ascii2NativeMojo37.setLog(log38);
        org.apache.maven.plugin.logging.Log log40 = null;
        ascii2NativeMojo37.setLog(log40);
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo37.setLog(log42);
        java.util.Map map44 = ascii2NativeMojo37.getPluginContext();
        java.util.Map map45 = null;
        ascii2NativeMojo37.setPluginContext(map45);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo47 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log48 = null;
        ascii2NativeMojo47.setLog(log48);
        org.apache.maven.plugin.logging.Log log50 = null;
        ascii2NativeMojo47.setLog(log50);
        java.util.Map map52 = null;
        ascii2NativeMojo47.setPluginContext(map52);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo54 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map55 = ascii2NativeMojo54.getPluginContext();
        org.apache.maven.plugin.logging.Log log56 = ascii2NativeMojo54.getLog();
        ascii2NativeMojo47.setLog(log56);
        ascii2NativeMojo37.setLog(log56);
        ascii2NativeMojo0.setLog(log56);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map44);
        org.junit.Assert.assertNull(map55);
        org.junit.Assert.assertNotNull(log56);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map6 = null;
        ascii2NativeMojo5.setPluginContext(map6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo5.getLog();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo5.getLog();
        ascii2NativeMojo0.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass14 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        java.util.Map map15 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(log16);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = null;
        ascii2NativeMojo0.setPluginContext(map7);
        java.util.Map map9 = null;
        ascii2NativeMojo0.setPluginContext(map9);
        java.util.Map map11 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map12 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNull(map12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map4 = null;
        ascii2NativeMojo0.setPluginContext(map4);
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(map6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        java.util.Map map22 = null;
        ascii2NativeMojo0.setPluginContext(map22);
        java.util.Map map24 = null;
        ascii2NativeMojo0.setPluginContext(map24);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo6.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo6.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo0.setLog(log14);
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map19 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo20 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map21 = null;
        ascii2NativeMojo20.setPluginContext(map21);
        org.apache.maven.plugin.logging.Log log23 = null;
        ascii2NativeMojo20.setLog(log23);
        java.util.Map map25 = null;
        ascii2NativeMojo20.setPluginContext(map25);
        java.util.Map map27 = ascii2NativeMojo20.getPluginContext();
        java.util.Map map28 = ascii2NativeMojo20.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo29 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map30 = ascii2NativeMojo29.getPluginContext();
        org.apache.maven.plugin.logging.Log log31 = ascii2NativeMojo29.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo32 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map33 = null;
        ascii2NativeMojo32.setPluginContext(map33);
        org.apache.maven.plugin.logging.Log log35 = null;
        ascii2NativeMojo32.setLog(log35);
        org.apache.maven.plugin.logging.Log log37 = ascii2NativeMojo32.getLog();
        ascii2NativeMojo29.setLog(log37);
        org.apache.maven.plugin.logging.Log log39 = ascii2NativeMojo29.getLog();
        java.util.Map map40 = ascii2NativeMojo29.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo41 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map42 = null;
        ascii2NativeMojo41.setPluginContext(map42);
        org.apache.maven.plugin.logging.Log log44 = null;
        ascii2NativeMojo41.setLog(log44);
        org.apache.maven.plugin.logging.Log log46 = ascii2NativeMojo41.getLog();
        org.apache.maven.plugin.logging.Log log47 = ascii2NativeMojo41.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo48 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log49 = null;
        ascii2NativeMojo48.setLog(log49);
        org.apache.maven.plugin.logging.Log log51 = null;
        ascii2NativeMojo48.setLog(log51);
        java.util.Map map53 = null;
        ascii2NativeMojo48.setPluginContext(map53);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo55 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map56 = ascii2NativeMojo55.getPluginContext();
        org.apache.maven.plugin.logging.Log log57 = ascii2NativeMojo55.getLog();
        ascii2NativeMojo48.setLog(log57);
        ascii2NativeMojo41.setLog(log57);
        ascii2NativeMojo29.setLog(log57);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo61 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log62 = null;
        ascii2NativeMojo61.setLog(log62);
        org.apache.maven.plugin.logging.Log log64 = null;
        ascii2NativeMojo61.setLog(log64);
        org.apache.maven.plugin.logging.Log log66 = ascii2NativeMojo61.getLog();
        ascii2NativeMojo29.setLog(log66);
        org.apache.maven.plugin.logging.Log log68 = ascii2NativeMojo29.getLog();
        ascii2NativeMojo20.setLog(log68);
        ascii2NativeMojo0.setLog(log68);
        java.util.Map map71 = null;
        ascii2NativeMojo0.setPluginContext(map71);
        java.util.Map map73 = null;
        ascii2NativeMojo0.setPluginContext(map73);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNotNull(log31);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertNotNull(log39);
        org.junit.Assert.assertNull(map40);
        org.junit.Assert.assertNotNull(log46);
        org.junit.Assert.assertNotNull(log47);
        org.junit.Assert.assertNull(map56);
        org.junit.Assert.assertNotNull(log57);
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertNotNull(log68);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        java.util.Map map10 = null;
        ascii2NativeMojo0.setPluginContext(map10);
        org.apache.maven.plugin.logging.Log log12 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log12);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo0.getLog();
        java.util.Map map14 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(map14);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo10.getLog();
        ascii2NativeMojo0.setLog(log16);
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass19 = log18.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo6.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo6.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo0.setLog(log14);
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = null;
        ascii2NativeMojo19.setPluginContext(map20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        java.util.Map map24 = null;
        ascii2NativeMojo19.setPluginContext(map24);
        java.util.Map map26 = ascii2NativeMojo19.getPluginContext();
        org.apache.maven.plugin.logging.Log log27 = ascii2NativeMojo19.getLog();
        java.util.Map map28 = null;
        ascii2NativeMojo19.setPluginContext(map28);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo30 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log31 = null;
        ascii2NativeMojo30.setLog(log31);
        org.apache.maven.plugin.logging.Log log33 = null;
        ascii2NativeMojo30.setLog(log33);
        org.apache.maven.plugin.logging.Log log35 = null;
        ascii2NativeMojo30.setLog(log35);
        java.util.Map map37 = ascii2NativeMojo30.getPluginContext();
        java.util.Map map38 = null;
        ascii2NativeMojo30.setPluginContext(map38);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo40 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log41 = null;
        ascii2NativeMojo40.setLog(log41);
        org.apache.maven.plugin.logging.Log log43 = null;
        ascii2NativeMojo40.setLog(log43);
        java.util.Map map45 = null;
        ascii2NativeMojo40.setPluginContext(map45);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo47 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map48 = ascii2NativeMojo47.getPluginContext();
        org.apache.maven.plugin.logging.Log log49 = ascii2NativeMojo47.getLog();
        ascii2NativeMojo40.setLog(log49);
        ascii2NativeMojo30.setLog(log49);
        ascii2NativeMojo19.setLog(log49);
        ascii2NativeMojo0.setLog(log49);
        java.util.Map map54 = null;
        ascii2NativeMojo0.setPluginContext(map54);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNull(map26);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNull(map37);
        org.junit.Assert.assertNull(map48);
        org.junit.Assert.assertNotNull(log49);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        java.util.Map map15 = null;
        ascii2NativeMojo0.setPluginContext(map15);
        java.util.Map map17 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(map17);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log4 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo5.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo5.getLog();
        ascii2NativeMojo0.setLog(log10);
        java.lang.Class<?> wildcardClass12 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo9.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo9.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo9.getPluginContext();
        java.util.Map map17 = null;
        ascii2NativeMojo9.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = null;
        ascii2NativeMojo19.setPluginContext(map20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = ascii2NativeMojo19.getLog();
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo9.setLog(log25);
        ascii2NativeMojo0.setLog(log25);
        java.util.Map map28 = null;
        ascii2NativeMojo0.setPluginContext(map28);
        java.util.Map map30 = null;
        ascii2NativeMojo0.setPluginContext(map30);
        java.util.Map map32 = null;
        ascii2NativeMojo0.setPluginContext(map32);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(log25);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo0.getLog();
        java.util.Map map14 = null;
        ascii2NativeMojo0.setPluginContext(map14);
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo4 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map5 = null;
        ascii2NativeMojo4.setPluginContext(map5);
        org.apache.maven.plugin.logging.Log log7 = null;
        ascii2NativeMojo4.setLog(log7);
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo4.getLog();
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo4.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo11 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo11.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo11.setLog(log14);
        java.util.Map map16 = null;
        ascii2NativeMojo11.setPluginContext(map16);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = ascii2NativeMojo18.getPluginContext();
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo18.getLog();
        ascii2NativeMojo11.setLog(log20);
        ascii2NativeMojo4.setLog(log20);
        ascii2NativeMojo0.setLog(log20);
        java.util.Map map24 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNull(map24);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo6.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo6.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo0.setLog(log14);
        java.lang.Class<?> wildcardClass16 = log14.getClass();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo22 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map23 = ascii2NativeMojo22.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log25 = null;
        ascii2NativeMojo24.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = null;
        ascii2NativeMojo24.setLog(log27);
        java.util.Map map29 = null;
        ascii2NativeMojo24.setPluginContext(map29);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo31 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map32 = ascii2NativeMojo31.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo31.getLog();
        ascii2NativeMojo24.setLog(log33);
        ascii2NativeMojo22.setLog(log33);
        ascii2NativeMojo0.setLog(log33);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo6.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo6.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo0.setLog(log14);
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = ascii2NativeMojo19.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo21 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo21.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = null;
        ascii2NativeMojo21.setLog(log24);
        java.util.Map map26 = null;
        ascii2NativeMojo21.setPluginContext(map26);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo28 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map29 = ascii2NativeMojo28.getPluginContext();
        org.apache.maven.plugin.logging.Log log30 = ascii2NativeMojo28.getLog();
        ascii2NativeMojo21.setLog(log30);
        ascii2NativeMojo19.setLog(log30);
        ascii2NativeMojo0.setLog(log30);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNotNull(log30);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.lang.Class<?> wildcardClass8 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo0.getLog();
        java.util.Map map14 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo0.getLog();
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = ascii2NativeMojo18.getPluginContext();
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo18.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo21 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map22 = null;
        ascii2NativeMojo21.setPluginContext(map22);
        org.apache.maven.plugin.logging.Log log24 = null;
        ascii2NativeMojo21.setLog(log24);
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo21.getLog();
        ascii2NativeMojo18.setLog(log26);
        org.apache.maven.plugin.logging.Log log28 = ascii2NativeMojo18.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo29 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log30 = null;
        ascii2NativeMojo29.setLog(log30);
        org.apache.maven.plugin.logging.Log log32 = null;
        ascii2NativeMojo29.setLog(log32);
        java.util.Map map34 = ascii2NativeMojo29.getPluginContext();
        java.util.Map map35 = ascii2NativeMojo29.getPluginContext();
        java.util.Map map36 = ascii2NativeMojo29.getPluginContext();
        java.util.Map map37 = ascii2NativeMojo29.getPluginContext();
        org.apache.maven.plugin.logging.Log log38 = ascii2NativeMojo29.getLog();
        ascii2NativeMojo18.setLog(log38);
        ascii2NativeMojo0.setLog(log38);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNull(map35);
        org.junit.Assert.assertNull(map36);
        org.junit.Assert.assertNull(map37);
        org.junit.Assert.assertNotNull(log38);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo0.getLog();
        java.util.Map map9 = null;
        ascii2NativeMojo0.setPluginContext(map9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map14 = null;
        ascii2NativeMojo0.setPluginContext(map14);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(map13);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo10.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log18 = null;
        ascii2NativeMojo17.setLog(log18);
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo17.setLog(log20);
        java.util.Map map22 = null;
        ascii2NativeMojo17.setPluginContext(map22);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map25 = ascii2NativeMojo24.getPluginContext();
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo24.getLog();
        ascii2NativeMojo17.setLog(log26);
        ascii2NativeMojo10.setLog(log26);
        ascii2NativeMojo0.setLog(log26);
        java.lang.Class<?> wildcardClass30 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo10.getLog();
        ascii2NativeMojo0.setLog(log16);
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo0.getLog();
        java.util.Map map19 = null;
        ascii2NativeMojo0.setPluginContext(map19);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(log18);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log4 = ascii2NativeMojo0.getLog();
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = null;
        ascii2NativeMojo0.setPluginContext(map7);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo9.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo9.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo9.getPluginContext();
        java.util.Map map17 = null;
        ascii2NativeMojo9.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo19.setLog(log20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        java.util.Map map24 = null;
        ascii2NativeMojo19.setPluginContext(map24);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo26 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map27 = ascii2NativeMojo26.getPluginContext();
        org.apache.maven.plugin.logging.Log log28 = ascii2NativeMojo26.getLog();
        ascii2NativeMojo19.setLog(log28);
        ascii2NativeMojo9.setLog(log28);
        org.apache.maven.plugin.logging.Log log31 = ascii2NativeMojo9.getLog();
        ascii2NativeMojo0.setLog(log31);
        java.util.Map map33 = null;
        ascii2NativeMojo0.setPluginContext(map33);
        java.util.Map map35 = null;
        ascii2NativeMojo0.setPluginContext(map35);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(log31);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log4 = ascii2NativeMojo0.getLog();
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = null;
        ascii2NativeMojo0.setPluginContext(map7);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo9.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo9.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo9.getPluginContext();
        java.util.Map map17 = null;
        ascii2NativeMojo9.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo19.setLog(log20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        java.util.Map map24 = null;
        ascii2NativeMojo19.setPluginContext(map24);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo26 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map27 = ascii2NativeMojo26.getPluginContext();
        org.apache.maven.plugin.logging.Log log28 = ascii2NativeMojo26.getLog();
        ascii2NativeMojo19.setLog(log28);
        ascii2NativeMojo9.setLog(log28);
        org.apache.maven.plugin.logging.Log log31 = ascii2NativeMojo9.getLog();
        ascii2NativeMojo0.setLog(log31);
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(log31);
        org.junit.Assert.assertNotNull(log33);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = null;
        ascii2NativeMojo7.setPluginContext(map8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo7.setLog(log10);
        java.util.Map map12 = null;
        ascii2NativeMojo7.setPluginContext(map12);
        java.util.Map map14 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass18 = log17.getClass();
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo3.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        ascii2NativeMojo7.setLog(log15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = null;
        ascii2NativeMojo17.setPluginContext(map18);
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo17.setLog(log20);
        org.apache.maven.plugin.logging.Log log22 = ascii2NativeMojo17.getLog();
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo17.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log25 = null;
        ascii2NativeMojo24.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = null;
        ascii2NativeMojo24.setLog(log27);
        java.util.Map map29 = null;
        ascii2NativeMojo24.setPluginContext(map29);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo31 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map32 = ascii2NativeMojo31.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo31.getLog();
        ascii2NativeMojo24.setLog(log33);
        ascii2NativeMojo17.setLog(log33);
        ascii2NativeMojo7.setLog(log33);
        ascii2NativeMojo3.setLog(log33);
        org.apache.maven.plugin.logging.Log log38 = ascii2NativeMojo3.getLog();
        org.apache.maven.plugin.logging.Log log39 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log39);
        java.lang.Class<?> wildcardClass41 = log39.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNotNull(log38);
        org.junit.Assert.assertNotNull(log39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo6.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo6.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo0.setLog(log14);
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo0.getLog();
        java.util.Map map20 = null;
        ascii2NativeMojo0.setPluginContext(map20);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log4 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo0.getLog();
        java.util.Map map14 = null;
        ascii2NativeMojo0.setPluginContext(map14);
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log16);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = null;
        ascii2NativeMojo0.setPluginContext(map7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo10.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log18 = null;
        ascii2NativeMojo17.setLog(log18);
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo17.setLog(log20);
        java.util.Map map22 = null;
        ascii2NativeMojo17.setPluginContext(map22);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map25 = ascii2NativeMojo24.getPluginContext();
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo24.getLog();
        ascii2NativeMojo17.setLog(log26);
        ascii2NativeMojo10.setLog(log26);
        ascii2NativeMojo0.setLog(log26);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo30 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map31 = ascii2NativeMojo30.getPluginContext();
        org.apache.maven.plugin.logging.Log log32 = ascii2NativeMojo30.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo33 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map34 = ascii2NativeMojo33.getPluginContext();
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo33.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo36 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map37 = null;
        ascii2NativeMojo36.setPluginContext(map37);
        org.apache.maven.plugin.logging.Log log39 = null;
        ascii2NativeMojo36.setLog(log39);
        org.apache.maven.plugin.logging.Log log41 = ascii2NativeMojo36.getLog();
        ascii2NativeMojo33.setLog(log41);
        org.apache.maven.plugin.logging.Log log43 = ascii2NativeMojo33.getLog();
        java.util.Map map44 = ascii2NativeMojo33.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo45 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map46 = null;
        ascii2NativeMojo45.setPluginContext(map46);
        org.apache.maven.plugin.logging.Log log48 = null;
        ascii2NativeMojo45.setLog(log48);
        org.apache.maven.plugin.logging.Log log50 = ascii2NativeMojo45.getLog();
        org.apache.maven.plugin.logging.Log log51 = ascii2NativeMojo45.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo52 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log53 = null;
        ascii2NativeMojo52.setLog(log53);
        org.apache.maven.plugin.logging.Log log55 = null;
        ascii2NativeMojo52.setLog(log55);
        java.util.Map map57 = null;
        ascii2NativeMojo52.setPluginContext(map57);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo59 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map60 = ascii2NativeMojo59.getPluginContext();
        org.apache.maven.plugin.logging.Log log61 = ascii2NativeMojo59.getLog();
        ascii2NativeMojo52.setLog(log61);
        ascii2NativeMojo45.setLog(log61);
        ascii2NativeMojo33.setLog(log61);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo65 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log66 = null;
        ascii2NativeMojo65.setLog(log66);
        org.apache.maven.plugin.logging.Log log68 = null;
        ascii2NativeMojo65.setLog(log68);
        org.apache.maven.plugin.logging.Log log70 = ascii2NativeMojo65.getLog();
        ascii2NativeMojo33.setLog(log70);
        ascii2NativeMojo30.setLog(log70);
        ascii2NativeMojo0.setLog(log70);
        java.lang.Class<?> wildcardClass74 = log70.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNull(map31);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertNull(map44);
        org.junit.Assert.assertNotNull(log50);
        org.junit.Assert.assertNotNull(log51);
        org.junit.Assert.assertNull(map60);
        org.junit.Assert.assertNotNull(log61);
        org.junit.Assert.assertNotNull(log70);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo8 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map9 = null;
        ascii2NativeMojo8.setPluginContext(map9);
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo8.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo8.getLog();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo8.getLog();
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo8.getLog();
        java.util.Map map16 = ascii2NativeMojo8.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = null;
        ascii2NativeMojo17.setPluginContext(map18);
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo17.setLog(log20);
        java.util.Map map22 = null;
        ascii2NativeMojo17.setPluginContext(map22);
        org.apache.maven.plugin.logging.Log log24 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo8.setLog(log24);
        ascii2NativeMojo0.setLog(log24);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log24);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo22 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map23 = ascii2NativeMojo22.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log25 = null;
        ascii2NativeMojo24.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = null;
        ascii2NativeMojo24.setLog(log27);
        java.util.Map map29 = null;
        ascii2NativeMojo24.setPluginContext(map29);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo31 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map32 = ascii2NativeMojo31.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo31.getLog();
        ascii2NativeMojo24.setLog(log33);
        ascii2NativeMojo22.setLog(log33);
        ascii2NativeMojo0.setLog(log33);
        java.util.Map map37 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log38 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map37);
        org.junit.Assert.assertNotNull(log38);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = null;
        ascii2NativeMojo0.setPluginContext(map7);
        java.util.Map map9 = null;
        ascii2NativeMojo0.setPluginContext(map9);
        java.util.Map map11 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map11);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo8 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo8.setLog(log9);
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo8.setLog(log11);
        java.util.Map map13 = null;
        ascii2NativeMojo8.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo15.getLog();
        ascii2NativeMojo8.setLog(log17);
        java.util.Map map19 = null;
        ascii2NativeMojo8.setPluginContext(map19);
        java.util.Map map21 = null;
        ascii2NativeMojo8.setPluginContext(map21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo8.getLog();
        ascii2NativeMojo0.setLog(log23);
        java.util.Map map25 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map26 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNull(map26);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo13 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo13.setLog(log14);
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo13.getLog();
        ascii2NativeMojo0.setLog(log16);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log16);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo9.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo9.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo9.getPluginContext();
        java.util.Map map17 = null;
        ascii2NativeMojo9.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = null;
        ascii2NativeMojo19.setPluginContext(map20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = ascii2NativeMojo19.getLog();
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo9.setLog(log25);
        ascii2NativeMojo0.setLog(log25);
        java.util.Map map28 = null;
        ascii2NativeMojo0.setPluginContext(map28);
        java.util.Map map30 = null;
        ascii2NativeMojo0.setPluginContext(map30);
        java.util.Map map32 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNull(map32);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map6 = null;
        ascii2NativeMojo5.setPluginContext(map6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo5.getLog();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo5.getLog();
        ascii2NativeMojo0.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo0.getLog();
        java.util.Map map15 = null;
        ascii2NativeMojo0.setPluginContext(map15);
        java.lang.Class<?> wildcardClass17 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo10.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log18 = null;
        ascii2NativeMojo17.setLog(log18);
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo17.setLog(log20);
        java.util.Map map22 = null;
        ascii2NativeMojo17.setPluginContext(map22);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map25 = ascii2NativeMojo24.getPluginContext();
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo24.getLog();
        ascii2NativeMojo17.setLog(log26);
        ascii2NativeMojo10.setLog(log26);
        ascii2NativeMojo0.setLog(log26);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo30 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map31 = ascii2NativeMojo30.getPluginContext();
        org.apache.maven.plugin.logging.Log log32 = ascii2NativeMojo30.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo33 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map34 = ascii2NativeMojo33.getPluginContext();
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo33.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo36 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map37 = null;
        ascii2NativeMojo36.setPluginContext(map37);
        org.apache.maven.plugin.logging.Log log39 = null;
        ascii2NativeMojo36.setLog(log39);
        org.apache.maven.plugin.logging.Log log41 = ascii2NativeMojo36.getLog();
        ascii2NativeMojo33.setLog(log41);
        org.apache.maven.plugin.logging.Log log43 = ascii2NativeMojo33.getLog();
        java.util.Map map44 = ascii2NativeMojo33.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo45 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map46 = null;
        ascii2NativeMojo45.setPluginContext(map46);
        org.apache.maven.plugin.logging.Log log48 = null;
        ascii2NativeMojo45.setLog(log48);
        org.apache.maven.plugin.logging.Log log50 = ascii2NativeMojo45.getLog();
        org.apache.maven.plugin.logging.Log log51 = ascii2NativeMojo45.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo52 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log53 = null;
        ascii2NativeMojo52.setLog(log53);
        org.apache.maven.plugin.logging.Log log55 = null;
        ascii2NativeMojo52.setLog(log55);
        java.util.Map map57 = null;
        ascii2NativeMojo52.setPluginContext(map57);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo59 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map60 = ascii2NativeMojo59.getPluginContext();
        org.apache.maven.plugin.logging.Log log61 = ascii2NativeMojo59.getLog();
        ascii2NativeMojo52.setLog(log61);
        ascii2NativeMojo45.setLog(log61);
        ascii2NativeMojo33.setLog(log61);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo65 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log66 = null;
        ascii2NativeMojo65.setLog(log66);
        org.apache.maven.plugin.logging.Log log68 = null;
        ascii2NativeMojo65.setLog(log68);
        org.apache.maven.plugin.logging.Log log70 = ascii2NativeMojo65.getLog();
        ascii2NativeMojo33.setLog(log70);
        ascii2NativeMojo30.setLog(log70);
        ascii2NativeMojo0.setLog(log70);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo74 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log75 = null;
        ascii2NativeMojo74.setLog(log75);
        org.apache.maven.plugin.logging.Log log77 = null;
        ascii2NativeMojo74.setLog(log77);
        org.apache.maven.plugin.logging.Log log79 = ascii2NativeMojo74.getLog();
        ascii2NativeMojo0.setLog(log79);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNull(map31);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertNull(map44);
        org.junit.Assert.assertNotNull(log50);
        org.junit.Assert.assertNotNull(log51);
        org.junit.Assert.assertNull(map60);
        org.junit.Assert.assertNotNull(log61);
        org.junit.Assert.assertNotNull(log70);
        org.junit.Assert.assertNotNull(log79);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = null;
        ascii2NativeMojo0.setPluginContext(map7);
        java.util.Map map9 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = map9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map9);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map9 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = null;
        ascii2NativeMojo0.setPluginContext(map7);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo4 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map5 = ascii2NativeMojo4.getPluginContext();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo4.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = null;
        ascii2NativeMojo7.setPluginContext(map8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo7.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo4.setLog(log12);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo14 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map15 = null;
        ascii2NativeMojo14.setPluginContext(map15);
        org.apache.maven.plugin.logging.Log log17 = null;
        ascii2NativeMojo14.setLog(log17);
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo14.getLog();
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo14.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo21 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo21.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = null;
        ascii2NativeMojo21.setLog(log24);
        java.util.Map map26 = null;
        ascii2NativeMojo21.setPluginContext(map26);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo28 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map29 = ascii2NativeMojo28.getPluginContext();
        org.apache.maven.plugin.logging.Log log30 = ascii2NativeMojo28.getLog();
        ascii2NativeMojo21.setLog(log30);
        ascii2NativeMojo14.setLog(log30);
        ascii2NativeMojo4.setLog(log30);
        ascii2NativeMojo0.setLog(log30);
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo36 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log37 = null;
        ascii2NativeMojo36.setLog(log37);
        org.apache.maven.plugin.logging.Log log39 = null;
        ascii2NativeMojo36.setLog(log39);
        org.apache.maven.plugin.logging.Log log41 = ascii2NativeMojo36.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo42 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map43 = null;
        ascii2NativeMojo42.setPluginContext(map43);
        org.apache.maven.plugin.logging.Log log45 = null;
        ascii2NativeMojo42.setLog(log45);
        java.util.Map map47 = null;
        ascii2NativeMojo42.setPluginContext(map47);
        java.util.Map map49 = ascii2NativeMojo42.getPluginContext();
        org.apache.maven.plugin.logging.Log log50 = ascii2NativeMojo42.getLog();
        ascii2NativeMojo36.setLog(log50);
        java.util.Map map52 = null;
        ascii2NativeMojo36.setPluginContext(map52);
        org.apache.maven.plugin.logging.Log log54 = ascii2NativeMojo36.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo55 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map56 = null;
        ascii2NativeMojo55.setPluginContext(map56);
        org.apache.maven.plugin.logging.Log log58 = null;
        ascii2NativeMojo55.setLog(log58);
        java.util.Map map60 = null;
        ascii2NativeMojo55.setPluginContext(map60);
        java.util.Map map62 = ascii2NativeMojo55.getPluginContext();
        org.apache.maven.plugin.logging.Log log63 = ascii2NativeMojo55.getLog();
        java.util.Map map64 = null;
        ascii2NativeMojo55.setPluginContext(map64);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo66 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log67 = null;
        ascii2NativeMojo66.setLog(log67);
        org.apache.maven.plugin.logging.Log log69 = null;
        ascii2NativeMojo66.setLog(log69);
        org.apache.maven.plugin.logging.Log log71 = null;
        ascii2NativeMojo66.setLog(log71);
        java.util.Map map73 = ascii2NativeMojo66.getPluginContext();
        java.util.Map map74 = null;
        ascii2NativeMojo66.setPluginContext(map74);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo76 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log77 = null;
        ascii2NativeMojo76.setLog(log77);
        org.apache.maven.plugin.logging.Log log79 = null;
        ascii2NativeMojo76.setLog(log79);
        java.util.Map map81 = null;
        ascii2NativeMojo76.setPluginContext(map81);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo83 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map84 = ascii2NativeMojo83.getPluginContext();
        org.apache.maven.plugin.logging.Log log85 = ascii2NativeMojo83.getLog();
        ascii2NativeMojo76.setLog(log85);
        ascii2NativeMojo66.setLog(log85);
        ascii2NativeMojo55.setLog(log85);
        ascii2NativeMojo36.setLog(log85);
        ascii2NativeMojo0.setLog(log85);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNotNull(log30);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertNull(map49);
        org.junit.Assert.assertNotNull(log50);
        org.junit.Assert.assertNotNull(log54);
        org.junit.Assert.assertNull(map62);
        org.junit.Assert.assertNotNull(log63);
        org.junit.Assert.assertNull(map73);
        org.junit.Assert.assertNull(map84);
        org.junit.Assert.assertNotNull(log85);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map10 = null;
        ascii2NativeMojo9.setPluginContext(map10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        java.util.Map map14 = null;
        ascii2NativeMojo9.setPluginContext(map14);
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo9.getLog();
        ascii2NativeMojo0.setLog(log16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map19 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map20 = null;
        ascii2NativeMojo0.setPluginContext(map20);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map19);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo0.getLog();
        java.util.Map map9 = null;
        ascii2NativeMojo0.setPluginContext(map9);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log4 = ascii2NativeMojo0.getLog();
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = null;
        ascii2NativeMojo0.setPluginContext(map7);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo9.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo9.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo9.getPluginContext();
        java.util.Map map17 = null;
        ascii2NativeMojo9.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo19.setLog(log20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        java.util.Map map24 = null;
        ascii2NativeMojo19.setPluginContext(map24);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo26 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map27 = ascii2NativeMojo26.getPluginContext();
        org.apache.maven.plugin.logging.Log log28 = ascii2NativeMojo26.getLog();
        ascii2NativeMojo19.setLog(log28);
        ascii2NativeMojo9.setLog(log28);
        org.apache.maven.plugin.logging.Log log31 = ascii2NativeMojo9.getLog();
        ascii2NativeMojo0.setLog(log31);
        java.util.Map map33 = null;
        ascii2NativeMojo0.setPluginContext(map33);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(log31);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log4 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo5.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo5.getLog();
        ascii2NativeMojo0.setLog(log10);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo12.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        java.util.Map map17 = null;
        ascii2NativeMojo12.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = ascii2NativeMojo19.getPluginContext();
        org.apache.maven.plugin.logging.Log log21 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo12.setLog(log21);
        java.util.Map map23 = null;
        ascii2NativeMojo12.setPluginContext(map23);
        java.util.Map map25 = null;
        ascii2NativeMojo12.setPluginContext(map25);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo27 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map28 = ascii2NativeMojo27.getPluginContext();
        org.apache.maven.plugin.logging.Log log29 = ascii2NativeMojo27.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo30 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map31 = null;
        ascii2NativeMojo30.setPluginContext(map31);
        org.apache.maven.plugin.logging.Log log33 = null;
        ascii2NativeMojo30.setLog(log33);
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo30.getLog();
        ascii2NativeMojo27.setLog(log35);
        org.apache.maven.plugin.logging.Log log37 = ascii2NativeMojo27.getLog();
        ascii2NativeMojo12.setLog(log37);
        ascii2NativeMojo0.setLog(log37);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNotNull(log29);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log37);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map4 = null;
        ascii2NativeMojo0.setPluginContext(map4);
        java.util.Map map6 = null;
        ascii2NativeMojo0.setPluginContext(map6);
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map9 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo8 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo8.setLog(log9);
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo8.setLog(log11);
        java.util.Map map13 = null;
        ascii2NativeMojo8.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo15.getLog();
        ascii2NativeMojo8.setLog(log17);
        java.util.Map map19 = null;
        ascii2NativeMojo8.setPluginContext(map19);
        java.util.Map map21 = null;
        ascii2NativeMojo8.setPluginContext(map21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo8.getLog();
        ascii2NativeMojo0.setLog(log23);
        java.util.Map map25 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNull(map25);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = null;
        ascii2NativeMojo0.setPluginContext(map7);
        java.util.Map map9 = null;
        ascii2NativeMojo0.setPluginContext(map9);
        java.lang.Class<?> wildcardClass11 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map10 = ascii2NativeMojo9.getPluginContext();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo9.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map13 = null;
        ascii2NativeMojo12.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo12.getLog();
        ascii2NativeMojo9.setLog(log17);
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo9.getLog();
        java.util.Map map20 = ascii2NativeMojo9.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo21 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map22 = null;
        ascii2NativeMojo21.setPluginContext(map22);
        org.apache.maven.plugin.logging.Log log24 = null;
        ascii2NativeMojo21.setLog(log24);
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo21.getLog();
        org.apache.maven.plugin.logging.Log log27 = ascii2NativeMojo21.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo28 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log29 = null;
        ascii2NativeMojo28.setLog(log29);
        org.apache.maven.plugin.logging.Log log31 = null;
        ascii2NativeMojo28.setLog(log31);
        java.util.Map map33 = null;
        ascii2NativeMojo28.setPluginContext(map33);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo35 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map36 = ascii2NativeMojo35.getPluginContext();
        org.apache.maven.plugin.logging.Log log37 = ascii2NativeMojo35.getLog();
        ascii2NativeMojo28.setLog(log37);
        ascii2NativeMojo21.setLog(log37);
        ascii2NativeMojo9.setLog(log37);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo41 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo41.setLog(log42);
        org.apache.maven.plugin.logging.Log log44 = null;
        ascii2NativeMojo41.setLog(log44);
        org.apache.maven.plugin.logging.Log log46 = ascii2NativeMojo41.getLog();
        ascii2NativeMojo9.setLog(log46);
        ascii2NativeMojo0.setLog(log46);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNull(map36);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertNotNull(log46);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo0.getLog();
        java.util.Map map11 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map13 = null;
        ascii2NativeMojo12.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo12.getLog();
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo12.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo19.setLog(log20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        java.util.Map map24 = null;
        ascii2NativeMojo19.setPluginContext(map24);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo26 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map27 = ascii2NativeMojo26.getPluginContext();
        org.apache.maven.plugin.logging.Log log28 = ascii2NativeMojo26.getLog();
        ascii2NativeMojo19.setLog(log28);
        ascii2NativeMojo12.setLog(log28);
        ascii2NativeMojo0.setLog(log28);
        java.lang.Class<?> wildcardClass32 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log4 = null;
        ascii2NativeMojo3.setLog(log4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        java.util.Map map8 = null;
        ascii2NativeMojo3.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = null;
        ascii2NativeMojo15.setPluginContext(map16);
        org.apache.maven.plugin.logging.Log log18 = null;
        ascii2NativeMojo15.setLog(log18);
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo15.getLog();
        org.apache.maven.plugin.logging.Log log21 = ascii2NativeMojo15.getLog();
        ascii2NativeMojo10.setLog(log21);
        ascii2NativeMojo3.setLog(log21);
        ascii2NativeMojo0.setLog(log21);
        java.lang.Class<?> wildcardClass25 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo22 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map23 = ascii2NativeMojo22.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log25 = null;
        ascii2NativeMojo24.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = null;
        ascii2NativeMojo24.setLog(log27);
        java.util.Map map29 = null;
        ascii2NativeMojo24.setPluginContext(map29);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo31 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map32 = ascii2NativeMojo31.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo31.getLog();
        ascii2NativeMojo24.setLog(log33);
        ascii2NativeMojo22.setLog(log33);
        ascii2NativeMojo0.setLog(log33);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo37 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log38 = null;
        ascii2NativeMojo37.setLog(log38);
        org.apache.maven.plugin.logging.Log log40 = null;
        ascii2NativeMojo37.setLog(log40);
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo37.setLog(log42);
        java.util.Map map44 = ascii2NativeMojo37.getPluginContext();
        java.util.Map map45 = null;
        ascii2NativeMojo37.setPluginContext(map45);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo47 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log48 = null;
        ascii2NativeMojo47.setLog(log48);
        org.apache.maven.plugin.logging.Log log50 = null;
        ascii2NativeMojo47.setLog(log50);
        java.util.Map map52 = null;
        ascii2NativeMojo47.setPluginContext(map52);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo54 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map55 = ascii2NativeMojo54.getPluginContext();
        org.apache.maven.plugin.logging.Log log56 = ascii2NativeMojo54.getLog();
        ascii2NativeMojo47.setLog(log56);
        ascii2NativeMojo37.setLog(log56);
        ascii2NativeMojo0.setLog(log56);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo60 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log61 = null;
        ascii2NativeMojo60.setLog(log61);
        org.apache.maven.plugin.logging.Log log63 = ascii2NativeMojo60.getLog();
        org.apache.maven.plugin.logging.Log log64 = ascii2NativeMojo60.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo65 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log66 = null;
        ascii2NativeMojo65.setLog(log66);
        org.apache.maven.plugin.logging.Log log68 = null;
        ascii2NativeMojo65.setLog(log68);
        org.apache.maven.plugin.logging.Log log70 = ascii2NativeMojo65.getLog();
        ascii2NativeMojo60.setLog(log70);
        ascii2NativeMojo0.setLog(log70);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map44);
        org.junit.Assert.assertNull(map55);
        org.junit.Assert.assertNotNull(log56);
        org.junit.Assert.assertNotNull(log63);
        org.junit.Assert.assertNotNull(log64);
        org.junit.Assert.assertNotNull(log70);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass8 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass11 = log10.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map4 = null;
        ascii2NativeMojo0.setPluginContext(map4);
        java.util.Map map6 = null;
        ascii2NativeMojo0.setPluginContext(map6);
        java.lang.Class<?> wildcardClass8 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo8 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo8.setLog(log9);
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo8.setLog(log11);
        java.util.Map map13 = ascii2NativeMojo8.getPluginContext();
        java.util.Map map14 = ascii2NativeMojo8.getPluginContext();
        java.util.Map map15 = ascii2NativeMojo8.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo16 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map17 = ascii2NativeMojo16.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log19 = null;
        ascii2NativeMojo18.setLog(log19);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo18.setLog(log21);
        java.util.Map map23 = null;
        ascii2NativeMojo18.setPluginContext(map23);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo25 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map26 = ascii2NativeMojo25.getPluginContext();
        org.apache.maven.plugin.logging.Log log27 = ascii2NativeMojo25.getLog();
        ascii2NativeMojo18.setLog(log27);
        ascii2NativeMojo16.setLog(log27);
        ascii2NativeMojo8.setLog(log27);
        ascii2NativeMojo0.setLog(log27);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo32 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map33 = ascii2NativeMojo32.getPluginContext();
        org.apache.maven.plugin.logging.Log log34 = ascii2NativeMojo32.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo35 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map36 = null;
        ascii2NativeMojo35.setPluginContext(map36);
        org.apache.maven.plugin.logging.Log log38 = null;
        ascii2NativeMojo35.setLog(log38);
        org.apache.maven.plugin.logging.Log log40 = ascii2NativeMojo35.getLog();
        ascii2NativeMojo32.setLog(log40);
        org.apache.maven.plugin.logging.Log log42 = ascii2NativeMojo32.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo43 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log44 = null;
        ascii2NativeMojo43.setLog(log44);
        org.apache.maven.plugin.logging.Log log46 = null;
        ascii2NativeMojo43.setLog(log46);
        java.util.Map map48 = ascii2NativeMojo43.getPluginContext();
        java.util.Map map49 = ascii2NativeMojo43.getPluginContext();
        java.util.Map map50 = ascii2NativeMojo43.getPluginContext();
        java.util.Map map51 = ascii2NativeMojo43.getPluginContext();
        org.apache.maven.plugin.logging.Log log52 = ascii2NativeMojo43.getLog();
        ascii2NativeMojo32.setLog(log52);
        org.apache.maven.plugin.logging.Log log54 = ascii2NativeMojo32.getLog();
        ascii2NativeMojo0.setLog(log54);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(map26);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNull(map33);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertNotNull(log40);
        org.junit.Assert.assertNotNull(log42);
        org.junit.Assert.assertNull(map48);
        org.junit.Assert.assertNull(map49);
        org.junit.Assert.assertNull(map50);
        org.junit.Assert.assertNull(map51);
        org.junit.Assert.assertNotNull(log52);
        org.junit.Assert.assertNotNull(log54);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo8 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo8.setLog(log9);
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo8.setLog(log11);
        java.util.Map map13 = null;
        ascii2NativeMojo8.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo15.getLog();
        ascii2NativeMojo8.setLog(log17);
        java.util.Map map19 = null;
        ascii2NativeMojo8.setPluginContext(map19);
        java.util.Map map21 = null;
        ascii2NativeMojo8.setPluginContext(map21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo8.getLog();
        ascii2NativeMojo0.setLog(log23);
        java.util.Map map25 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map26 = null;
        ascii2NativeMojo0.setPluginContext(map26);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo28 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log29 = null;
        ascii2NativeMojo28.setLog(log29);
        org.apache.maven.plugin.logging.Log log31 = null;
        ascii2NativeMojo28.setLog(log31);
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo28.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo34 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map35 = null;
        ascii2NativeMojo34.setPluginContext(map35);
        org.apache.maven.plugin.logging.Log log37 = null;
        ascii2NativeMojo34.setLog(log37);
        java.util.Map map39 = null;
        ascii2NativeMojo34.setPluginContext(map39);
        java.util.Map map41 = ascii2NativeMojo34.getPluginContext();
        org.apache.maven.plugin.logging.Log log42 = ascii2NativeMojo34.getLog();
        ascii2NativeMojo28.setLog(log42);
        java.util.Map map44 = null;
        ascii2NativeMojo28.setPluginContext(map44);
        org.apache.maven.plugin.logging.Log log46 = ascii2NativeMojo28.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo47 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map48 = null;
        ascii2NativeMojo47.setPluginContext(map48);
        org.apache.maven.plugin.logging.Log log50 = null;
        ascii2NativeMojo47.setLog(log50);
        java.util.Map map52 = null;
        ascii2NativeMojo47.setPluginContext(map52);
        java.util.Map map54 = ascii2NativeMojo47.getPluginContext();
        org.apache.maven.plugin.logging.Log log55 = ascii2NativeMojo47.getLog();
        java.util.Map map56 = null;
        ascii2NativeMojo47.setPluginContext(map56);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo58 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log59 = null;
        ascii2NativeMojo58.setLog(log59);
        org.apache.maven.plugin.logging.Log log61 = null;
        ascii2NativeMojo58.setLog(log61);
        org.apache.maven.plugin.logging.Log log63 = null;
        ascii2NativeMojo58.setLog(log63);
        java.util.Map map65 = ascii2NativeMojo58.getPluginContext();
        java.util.Map map66 = null;
        ascii2NativeMojo58.setPluginContext(map66);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo68 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log69 = null;
        ascii2NativeMojo68.setLog(log69);
        org.apache.maven.plugin.logging.Log log71 = null;
        ascii2NativeMojo68.setLog(log71);
        java.util.Map map73 = null;
        ascii2NativeMojo68.setPluginContext(map73);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo75 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map76 = ascii2NativeMojo75.getPluginContext();
        org.apache.maven.plugin.logging.Log log77 = ascii2NativeMojo75.getLog();
        ascii2NativeMojo68.setLog(log77);
        ascii2NativeMojo58.setLog(log77);
        ascii2NativeMojo47.setLog(log77);
        ascii2NativeMojo28.setLog(log77);
        ascii2NativeMojo0.setLog(log77);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map41);
        org.junit.Assert.assertNotNull(log42);
        org.junit.Assert.assertNotNull(log46);
        org.junit.Assert.assertNull(map54);
        org.junit.Assert.assertNotNull(log55);
        org.junit.Assert.assertNull(map65);
        org.junit.Assert.assertNull(map76);
        org.junit.Assert.assertNotNull(log77);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = null;
        ascii2NativeMojo0.setPluginContext(map6);
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo0.getLog();
        java.util.Map map16 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo20 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map21 = null;
        ascii2NativeMojo20.setPluginContext(map21);
        org.apache.maven.plugin.logging.Log log23 = null;
        ascii2NativeMojo20.setLog(log23);
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo20.getLog();
        ascii2NativeMojo17.setLog(log25);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo27 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map28 = null;
        ascii2NativeMojo27.setPluginContext(map28);
        org.apache.maven.plugin.logging.Log log30 = null;
        ascii2NativeMojo27.setLog(log30);
        org.apache.maven.plugin.logging.Log log32 = ascii2NativeMojo27.getLog();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo27.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo34 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log35 = null;
        ascii2NativeMojo34.setLog(log35);
        org.apache.maven.plugin.logging.Log log37 = null;
        ascii2NativeMojo34.setLog(log37);
        java.util.Map map39 = null;
        ascii2NativeMojo34.setPluginContext(map39);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo41 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map42 = ascii2NativeMojo41.getPluginContext();
        org.apache.maven.plugin.logging.Log log43 = ascii2NativeMojo41.getLog();
        ascii2NativeMojo34.setLog(log43);
        ascii2NativeMojo27.setLog(log43);
        ascii2NativeMojo17.setLog(log43);
        ascii2NativeMojo0.setLog(log43);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map42);
        org.junit.Assert.assertNotNull(log43);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map6 = null;
        ascii2NativeMojo5.setPluginContext(map6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo5.getLog();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo5.getLog();
        ascii2NativeMojo0.setLog(log11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        java.util.Map map15 = ascii2NativeMojo0.getPluginContext();
        java.lang.Class<?> wildcardClass16 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo4 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo4.setLog(log5);
        org.apache.maven.plugin.logging.Log log7 = null;
        ascii2NativeMojo4.setLog(log7);
        java.util.Map map9 = ascii2NativeMojo4.getPluginContext();
        java.util.Map map10 = ascii2NativeMojo4.getPluginContext();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo4.getLog();
        ascii2NativeMojo0.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo0.setLog(log13);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(log11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = ascii2NativeMojo10.getPluginContext();
        org.apache.maven.plugin.logging.Log log12 = ascii2NativeMojo10.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo13 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map14 = null;
        ascii2NativeMojo13.setPluginContext(map14);
        org.apache.maven.plugin.logging.Log log16 = null;
        ascii2NativeMojo13.setLog(log16);
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo13.getLog();
        ascii2NativeMojo10.setLog(log18);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo20 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map21 = null;
        ascii2NativeMojo20.setPluginContext(map21);
        org.apache.maven.plugin.logging.Log log23 = null;
        ascii2NativeMojo20.setLog(log23);
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo20.getLog();
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo20.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo27 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log28 = null;
        ascii2NativeMojo27.setLog(log28);
        org.apache.maven.plugin.logging.Log log30 = null;
        ascii2NativeMojo27.setLog(log30);
        java.util.Map map32 = null;
        ascii2NativeMojo27.setPluginContext(map32);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo34 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map35 = ascii2NativeMojo34.getPluginContext();
        org.apache.maven.plugin.logging.Log log36 = ascii2NativeMojo34.getLog();
        ascii2NativeMojo27.setLog(log36);
        ascii2NativeMojo20.setLog(log36);
        ascii2NativeMojo10.setLog(log36);
        org.apache.maven.plugin.logging.Log log40 = ascii2NativeMojo10.getLog();
        ascii2NativeMojo0.setLog(log40);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNull(map35);
        org.junit.Assert.assertNotNull(log36);
        org.junit.Assert.assertNotNull(log40);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo0.getLog();
        java.util.Map map16 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log18 = null;
        ascii2NativeMojo17.setLog(log18);
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo17.setLog(log20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo17.setLog(log22);
        java.util.Map map24 = ascii2NativeMojo17.getPluginContext();
        java.util.Map map25 = null;
        ascii2NativeMojo17.setPluginContext(map25);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo27 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log28 = null;
        ascii2NativeMojo27.setLog(log28);
        org.apache.maven.plugin.logging.Log log30 = null;
        ascii2NativeMojo27.setLog(log30);
        java.util.Map map32 = null;
        ascii2NativeMojo27.setPluginContext(map32);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo34 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map35 = ascii2NativeMojo34.getPluginContext();
        org.apache.maven.plugin.logging.Log log36 = ascii2NativeMojo34.getLog();
        ascii2NativeMojo27.setLog(log36);
        ascii2NativeMojo17.setLog(log36);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo39 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map40 = ascii2NativeMojo39.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo41 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo41.setLog(log42);
        org.apache.maven.plugin.logging.Log log44 = null;
        ascii2NativeMojo41.setLog(log44);
        java.util.Map map46 = null;
        ascii2NativeMojo41.setPluginContext(map46);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo48 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map49 = ascii2NativeMojo48.getPluginContext();
        org.apache.maven.plugin.logging.Log log50 = ascii2NativeMojo48.getLog();
        ascii2NativeMojo41.setLog(log50);
        ascii2NativeMojo39.setLog(log50);
        ascii2NativeMojo17.setLog(log50);
        org.apache.maven.plugin.logging.Log log54 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo0.setLog(log54);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNull(map35);
        org.junit.Assert.assertNotNull(log36);
        org.junit.Assert.assertNull(map40);
        org.junit.Assert.assertNull(map49);
        org.junit.Assert.assertNotNull(log50);
        org.junit.Assert.assertNotNull(log54);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo6.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo6.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo0.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map16);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo0.getLog();
        java.util.Map map14 = null;
        ascii2NativeMojo0.setPluginContext(map14);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map4 = null;
        ascii2NativeMojo0.setPluginContext(map4);
        org.junit.Assert.assertNull(map3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        java.util.Map map10 = null;
        ascii2NativeMojo0.setPluginContext(map10);
        java.util.Map map12 = null;
        ascii2NativeMojo0.setPluginContext(map12);
        java.util.Map map14 = null;
        ascii2NativeMojo0.setPluginContext(map14);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        java.lang.Class<?> wildcardClass9 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo5.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo5.setLog(log10);
        java.util.Map map12 = ascii2NativeMojo5.getPluginContext();
        java.util.Map map13 = null;
        ascii2NativeMojo5.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo15.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = null;
        ascii2NativeMojo18.setPluginContext(map19);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo18.setLog(log21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo18.getLog();
        ascii2NativeMojo15.setLog(log23);
        ascii2NativeMojo5.setLog(log23);
        ascii2NativeMojo0.setLog(log23);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo27 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map28 = ascii2NativeMojo27.getPluginContext();
        org.apache.maven.plugin.logging.Log log29 = ascii2NativeMojo27.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo30 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map31 = null;
        ascii2NativeMojo30.setPluginContext(map31);
        org.apache.maven.plugin.logging.Log log33 = null;
        ascii2NativeMojo30.setLog(log33);
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo30.getLog();
        ascii2NativeMojo27.setLog(log35);
        org.apache.maven.plugin.logging.Log log37 = ascii2NativeMojo27.getLog();
        java.util.Map map38 = ascii2NativeMojo27.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo39 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map40 = null;
        ascii2NativeMojo39.setPluginContext(map40);
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo39.setLog(log42);
        org.apache.maven.plugin.logging.Log log44 = ascii2NativeMojo39.getLog();
        org.apache.maven.plugin.logging.Log log45 = ascii2NativeMojo39.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo46 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log47 = null;
        ascii2NativeMojo46.setLog(log47);
        org.apache.maven.plugin.logging.Log log49 = null;
        ascii2NativeMojo46.setLog(log49);
        java.util.Map map51 = null;
        ascii2NativeMojo46.setPluginContext(map51);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo53 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map54 = ascii2NativeMojo53.getPluginContext();
        org.apache.maven.plugin.logging.Log log55 = ascii2NativeMojo53.getLog();
        ascii2NativeMojo46.setLog(log55);
        ascii2NativeMojo39.setLog(log55);
        ascii2NativeMojo27.setLog(log55);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo59 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log60 = null;
        ascii2NativeMojo59.setLog(log60);
        org.apache.maven.plugin.logging.Log log62 = null;
        ascii2NativeMojo59.setLog(log62);
        org.apache.maven.plugin.logging.Log log64 = ascii2NativeMojo59.getLog();
        ascii2NativeMojo27.setLog(log64);
        org.apache.maven.plugin.logging.Log log66 = ascii2NativeMojo27.getLog();
        ascii2NativeMojo0.setLog(log66);
        org.apache.maven.plugin.logging.Log log68 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNotNull(log29);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertNull(map38);
        org.junit.Assert.assertNotNull(log44);
        org.junit.Assert.assertNotNull(log45);
        org.junit.Assert.assertNull(map54);
        org.junit.Assert.assertNotNull(log55);
        org.junit.Assert.assertNotNull(log64);
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertNotNull(log68);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = null;
        ascii2NativeMojo7.setPluginContext(map8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo7.setLog(log10);
        java.util.Map map12 = null;
        ascii2NativeMojo7.setPluginContext(map12);
        java.util.Map map14 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log15);
        java.lang.Class<?> wildcardClass17 = log15.getClass();
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        java.util.Map map15 = null;
        ascii2NativeMojo0.setPluginContext(map15);
        java.util.Map map17 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map18 = null;
        ascii2NativeMojo0.setPluginContext(map18);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNull(map17);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo10.getLog();
        ascii2NativeMojo0.setLog(log16);
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo0.getLog();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(log18);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log4 = ascii2NativeMojo0.getLog();
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNull(map7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo0.getLog();
        java.util.Map map9 = null;
        ascii2NativeMojo0.setPluginContext(map9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo0.getLog();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo0.getLog();
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo20 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map21 = null;
        ascii2NativeMojo20.setPluginContext(map21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo20.getLog();
        ascii2NativeMojo0.setLog(log23);
        java.lang.Class<?> wildcardClass25 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map4 = null;
        ascii2NativeMojo0.setPluginContext(map4);
        java.util.Map map6 = null;
        ascii2NativeMojo0.setPluginContext(map6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo6.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo6.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo0.setLog(log14);
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass19 = log18.getClass();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = ascii2NativeMojo10.getPluginContext();
        org.apache.maven.plugin.logging.Log log12 = ascii2NativeMojo10.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo13 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map14 = null;
        ascii2NativeMojo13.setPluginContext(map14);
        org.apache.maven.plugin.logging.Log log16 = null;
        ascii2NativeMojo13.setLog(log16);
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo13.getLog();
        ascii2NativeMojo10.setLog(log18);
        ascii2NativeMojo0.setLog(log18);
        org.apache.maven.plugin.logging.Log log21 = ascii2NativeMojo0.getLog();
        java.util.Map map22 = null;
        ascii2NativeMojo0.setPluginContext(map22);
        java.util.Map map24 = null;
        ascii2NativeMojo0.setPluginContext(map24);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNotNull(log21);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo4 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map5 = ascii2NativeMojo4.getPluginContext();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo4.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        ascii2NativeMojo7.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo7.getLog();
        java.util.Map map18 = ascii2NativeMojo7.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = null;
        ascii2NativeMojo19.setPluginContext(map20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = ascii2NativeMojo19.getLog();
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo19.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo26 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log27 = null;
        ascii2NativeMojo26.setLog(log27);
        org.apache.maven.plugin.logging.Log log29 = null;
        ascii2NativeMojo26.setLog(log29);
        java.util.Map map31 = null;
        ascii2NativeMojo26.setPluginContext(map31);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo33 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map34 = ascii2NativeMojo33.getPluginContext();
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo33.getLog();
        ascii2NativeMojo26.setLog(log35);
        ascii2NativeMojo19.setLog(log35);
        ascii2NativeMojo7.setLog(log35);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo39 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log40 = null;
        ascii2NativeMojo39.setLog(log40);
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo39.setLog(log42);
        org.apache.maven.plugin.logging.Log log44 = ascii2NativeMojo39.getLog();
        ascii2NativeMojo7.setLog(log44);
        ascii2NativeMojo4.setLog(log44);
        ascii2NativeMojo0.setLog(log44);
        org.apache.maven.plugin.logging.Log log48 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log44);
        org.junit.Assert.assertNotNull(log48);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        java.util.Map map10 = null;
        ascii2NativeMojo0.setPluginContext(map10);
        java.util.Map map12 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo5.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo5.setLog(log10);
        java.util.Map map12 = ascii2NativeMojo5.getPluginContext();
        java.util.Map map13 = null;
        ascii2NativeMojo5.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo15.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = null;
        ascii2NativeMojo18.setPluginContext(map19);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo18.setLog(log21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo18.getLog();
        ascii2NativeMojo15.setLog(log23);
        ascii2NativeMojo5.setLog(log23);
        ascii2NativeMojo0.setLog(log23);
        java.util.Map map27 = null;
        ascii2NativeMojo0.setPluginContext(map27);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo29 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map30 = null;
        ascii2NativeMojo29.setPluginContext(map30);
        org.apache.maven.plugin.logging.Log log32 = null;
        ascii2NativeMojo29.setLog(log32);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo34 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map35 = null;
        ascii2NativeMojo34.setPluginContext(map35);
        org.apache.maven.plugin.logging.Log log37 = null;
        ascii2NativeMojo34.setLog(log37);
        org.apache.maven.plugin.logging.Log log39 = ascii2NativeMojo34.getLog();
        org.apache.maven.plugin.logging.Log log40 = ascii2NativeMojo34.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo41 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo41.setLog(log42);
        org.apache.maven.plugin.logging.Log log44 = null;
        ascii2NativeMojo41.setLog(log44);
        java.util.Map map46 = null;
        ascii2NativeMojo41.setPluginContext(map46);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo48 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map49 = ascii2NativeMojo48.getPluginContext();
        org.apache.maven.plugin.logging.Log log50 = ascii2NativeMojo48.getLog();
        ascii2NativeMojo41.setLog(log50);
        ascii2NativeMojo34.setLog(log50);
        ascii2NativeMojo29.setLog(log50);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo54 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map55 = null;
        ascii2NativeMojo54.setPluginContext(map55);
        org.apache.maven.plugin.logging.Log log57 = null;
        ascii2NativeMojo54.setLog(log57);
        java.util.Map map59 = null;
        ascii2NativeMojo54.setPluginContext(map59);
        org.apache.maven.plugin.logging.Log log61 = ascii2NativeMojo54.getLog();
        ascii2NativeMojo29.setLog(log61);
        ascii2NativeMojo0.setLog(log61);
        java.lang.Class<?> wildcardClass64 = log61.getClass();
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(log39);
        org.junit.Assert.assertNotNull(log40);
        org.junit.Assert.assertNull(map49);
        org.junit.Assert.assertNotNull(log50);
        org.junit.Assert.assertNotNull(log61);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo6.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo6.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo0.setLog(log14);
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = ascii2NativeMojo19.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo21 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo21.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = null;
        ascii2NativeMojo21.setLog(log24);
        java.util.Map map26 = null;
        ascii2NativeMojo21.setPluginContext(map26);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo28 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map29 = ascii2NativeMojo28.getPluginContext();
        org.apache.maven.plugin.logging.Log log30 = ascii2NativeMojo28.getLog();
        ascii2NativeMojo21.setLog(log30);
        ascii2NativeMojo19.setLog(log30);
        ascii2NativeMojo0.setLog(log30);
        org.apache.maven.plugin.logging.Log log34 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo35 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map36 = null;
        ascii2NativeMojo35.setPluginContext(map36);
        org.apache.maven.plugin.logging.Log log38 = ascii2NativeMojo35.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo39 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map40 = ascii2NativeMojo39.getPluginContext();
        org.apache.maven.plugin.logging.Log log41 = ascii2NativeMojo39.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo42 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map43 = null;
        ascii2NativeMojo42.setPluginContext(map43);
        org.apache.maven.plugin.logging.Log log45 = null;
        ascii2NativeMojo42.setLog(log45);
        org.apache.maven.plugin.logging.Log log47 = ascii2NativeMojo42.getLog();
        ascii2NativeMojo39.setLog(log47);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo49 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map50 = null;
        ascii2NativeMojo49.setPluginContext(map50);
        org.apache.maven.plugin.logging.Log log52 = null;
        ascii2NativeMojo49.setLog(log52);
        org.apache.maven.plugin.logging.Log log54 = ascii2NativeMojo49.getLog();
        org.apache.maven.plugin.logging.Log log55 = ascii2NativeMojo49.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo56 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log57 = null;
        ascii2NativeMojo56.setLog(log57);
        org.apache.maven.plugin.logging.Log log59 = null;
        ascii2NativeMojo56.setLog(log59);
        java.util.Map map61 = null;
        ascii2NativeMojo56.setPluginContext(map61);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo63 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map64 = ascii2NativeMojo63.getPluginContext();
        org.apache.maven.plugin.logging.Log log65 = ascii2NativeMojo63.getLog();
        ascii2NativeMojo56.setLog(log65);
        ascii2NativeMojo49.setLog(log65);
        ascii2NativeMojo39.setLog(log65);
        ascii2NativeMojo35.setLog(log65);
        org.apache.maven.plugin.logging.Log log70 = ascii2NativeMojo35.getLog();
        ascii2NativeMojo0.setLog(log70);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNotNull(log30);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertNotNull(log38);
        org.junit.Assert.assertNull(map40);
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertNotNull(log47);
        org.junit.Assert.assertNotNull(log54);
        org.junit.Assert.assertNotNull(log55);
        org.junit.Assert.assertNull(map64);
        org.junit.Assert.assertNotNull(log65);
        org.junit.Assert.assertNotNull(log70);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo11 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo11.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo11.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo11.getPluginContext();
        java.util.Map map17 = ascii2NativeMojo11.getPluginContext();
        java.util.Map map18 = ascii2NativeMojo11.getPluginContext();
        java.util.Map map19 = ascii2NativeMojo11.getPluginContext();
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo11.getLog();
        ascii2NativeMojo0.setLog(log20);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(log20);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = null;
        ascii2NativeMojo7.setPluginContext(map8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo7.setLog(log10);
        java.util.Map map12 = null;
        ascii2NativeMojo7.setPluginContext(map12);
        java.util.Map map14 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log18);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = null;
        ascii2NativeMojo0.setPluginContext(map7);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo9.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo14 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map15 = null;
        ascii2NativeMojo14.setPluginContext(map15);
        org.apache.maven.plugin.logging.Log log17 = null;
        ascii2NativeMojo14.setLog(log17);
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo14.getLog();
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo14.getLog();
        ascii2NativeMojo9.setLog(log20);
        org.apache.maven.plugin.logging.Log log22 = ascii2NativeMojo9.getLog();
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo9.getLog();
        ascii2NativeMojo0.setLog(log23);
        java.lang.Class<?> wildcardClass25 = log23.getClass();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map4 = null;
        ascii2NativeMojo3.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo3.getLog();
        ascii2NativeMojo0.setLog(log8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo10.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log18 = null;
        ascii2NativeMojo17.setLog(log18);
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo17.setLog(log20);
        java.util.Map map22 = null;
        ascii2NativeMojo17.setPluginContext(map22);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map25 = ascii2NativeMojo24.getPluginContext();
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo24.getLog();
        ascii2NativeMojo17.setLog(log26);
        ascii2NativeMojo10.setLog(log26);
        ascii2NativeMojo0.setLog(log26);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo30 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map31 = ascii2NativeMojo30.getPluginContext();
        org.apache.maven.plugin.logging.Log log32 = ascii2NativeMojo30.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo33 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map34 = ascii2NativeMojo33.getPluginContext();
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo33.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo36 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map37 = null;
        ascii2NativeMojo36.setPluginContext(map37);
        org.apache.maven.plugin.logging.Log log39 = null;
        ascii2NativeMojo36.setLog(log39);
        org.apache.maven.plugin.logging.Log log41 = ascii2NativeMojo36.getLog();
        ascii2NativeMojo33.setLog(log41);
        org.apache.maven.plugin.logging.Log log43 = ascii2NativeMojo33.getLog();
        java.util.Map map44 = ascii2NativeMojo33.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo45 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map46 = null;
        ascii2NativeMojo45.setPluginContext(map46);
        org.apache.maven.plugin.logging.Log log48 = null;
        ascii2NativeMojo45.setLog(log48);
        org.apache.maven.plugin.logging.Log log50 = ascii2NativeMojo45.getLog();
        org.apache.maven.plugin.logging.Log log51 = ascii2NativeMojo45.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo52 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log53 = null;
        ascii2NativeMojo52.setLog(log53);
        org.apache.maven.plugin.logging.Log log55 = null;
        ascii2NativeMojo52.setLog(log55);
        java.util.Map map57 = null;
        ascii2NativeMojo52.setPluginContext(map57);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo59 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map60 = ascii2NativeMojo59.getPluginContext();
        org.apache.maven.plugin.logging.Log log61 = ascii2NativeMojo59.getLog();
        ascii2NativeMojo52.setLog(log61);
        ascii2NativeMojo45.setLog(log61);
        ascii2NativeMojo33.setLog(log61);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo65 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log66 = null;
        ascii2NativeMojo65.setLog(log66);
        org.apache.maven.plugin.logging.Log log68 = null;
        ascii2NativeMojo65.setLog(log68);
        org.apache.maven.plugin.logging.Log log70 = ascii2NativeMojo65.getLog();
        ascii2NativeMojo33.setLog(log70);
        ascii2NativeMojo30.setLog(log70);
        ascii2NativeMojo0.setLog(log70);
        java.util.Map map74 = null;
        ascii2NativeMojo0.setPluginContext(map74);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNull(map31);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertNull(map44);
        org.junit.Assert.assertNotNull(log50);
        org.junit.Assert.assertNotNull(log51);
        org.junit.Assert.assertNull(map60);
        org.junit.Assert.assertNotNull(log61);
        org.junit.Assert.assertNotNull(log70);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo6.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo6.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo0.setLog(log14);
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo0.getLog();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(log18);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo9.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo9.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo9.getPluginContext();
        java.util.Map map17 = null;
        ascii2NativeMojo9.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = null;
        ascii2NativeMojo19.setPluginContext(map20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = ascii2NativeMojo19.getLog();
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo9.setLog(log25);
        ascii2NativeMojo0.setLog(log25);
        java.util.Map map28 = null;
        ascii2NativeMojo0.setPluginContext(map28);
        java.util.Map map30 = null;
        ascii2NativeMojo0.setPluginContext(map30);
        java.util.Map map32 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo34 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log35 = null;
        ascii2NativeMojo34.setLog(log35);
        org.apache.maven.plugin.logging.Log log37 = null;
        ascii2NativeMojo34.setLog(log37);
        java.util.Map map39 = null;
        ascii2NativeMojo34.setPluginContext(map39);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo41 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map42 = ascii2NativeMojo41.getPluginContext();
        org.apache.maven.plugin.logging.Log log43 = ascii2NativeMojo41.getLog();
        ascii2NativeMojo34.setLog(log43);
        java.util.Map map45 = null;
        ascii2NativeMojo34.setPluginContext(map45);
        java.util.Map map47 = null;
        ascii2NativeMojo34.setPluginContext(map47);
        org.apache.maven.plugin.logging.Log log49 = ascii2NativeMojo34.getLog();
        java.util.Map map50 = null;
        ascii2NativeMojo34.setPluginContext(map50);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo52 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map53 = null;
        ascii2NativeMojo52.setPluginContext(map53);
        org.apache.maven.plugin.logging.Log log55 = null;
        ascii2NativeMojo52.setLog(log55);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo57 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map58 = null;
        ascii2NativeMojo57.setPluginContext(map58);
        org.apache.maven.plugin.logging.Log log60 = null;
        ascii2NativeMojo57.setLog(log60);
        org.apache.maven.plugin.logging.Log log62 = ascii2NativeMojo57.getLog();
        org.apache.maven.plugin.logging.Log log63 = ascii2NativeMojo57.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo64 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log65 = null;
        ascii2NativeMojo64.setLog(log65);
        org.apache.maven.plugin.logging.Log log67 = null;
        ascii2NativeMojo64.setLog(log67);
        java.util.Map map69 = null;
        ascii2NativeMojo64.setPluginContext(map69);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo71 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map72 = ascii2NativeMojo71.getPluginContext();
        org.apache.maven.plugin.logging.Log log73 = ascii2NativeMojo71.getLog();
        ascii2NativeMojo64.setLog(log73);
        ascii2NativeMojo57.setLog(log73);
        ascii2NativeMojo52.setLog(log73);
        ascii2NativeMojo34.setLog(log73);
        ascii2NativeMojo0.setLog(log73);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map42);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertNotNull(log49);
        org.junit.Assert.assertNotNull(log62);
        org.junit.Assert.assertNotNull(log63);
        org.junit.Assert.assertNull(map72);
        org.junit.Assert.assertNotNull(log73);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass6 = log5.getClass();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = null;
        ascii2NativeMojo0.setPluginContext(map6);
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map9 = null;
        ascii2NativeMojo0.setPluginContext(map9);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map8);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        java.util.Map map3 = null;
        ascii2NativeMojo0.setPluginContext(map3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo0.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass7 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo6.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo6.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo0.setLog(log14);
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map19 = ascii2NativeMojo0.getPluginContext();
        java.lang.Class<?> wildcardClass20 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo0.getLog();
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map19 = ascii2NativeMojo0.getPluginContext();
        java.lang.Class<?> wildcardClass20 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo8 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map9 = null;
        ascii2NativeMojo8.setPluginContext(map9);
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo8.setLog(log11);
        java.util.Map map13 = null;
        ascii2NativeMojo8.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = null;
        ascii2NativeMojo15.setPluginContext(map16);
        org.apache.maven.plugin.logging.Log log18 = null;
        ascii2NativeMojo15.setLog(log18);
        java.util.Map map20 = null;
        ascii2NativeMojo15.setPluginContext(map20);
        java.util.Map map22 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo15.getLog();
        ascii2NativeMojo8.setLog(log23);
        ascii2NativeMojo0.setLog(log23);
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNotNull(log23);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = ascii2NativeMojo0.getLog();
        java.util.Map map14 = null;
        ascii2NativeMojo0.setPluginContext(map14);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo16 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log17 = null;
        ascii2NativeMojo16.setLog(log17);
        org.apache.maven.plugin.logging.Log log19 = null;
        ascii2NativeMojo16.setLog(log19);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo16.setLog(log21);
        java.util.Map map23 = ascii2NativeMojo16.getPluginContext();
        java.util.Map map24 = null;
        ascii2NativeMojo16.setPluginContext(map24);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo26 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log27 = null;
        ascii2NativeMojo26.setLog(log27);
        org.apache.maven.plugin.logging.Log log29 = null;
        ascii2NativeMojo26.setLog(log29);
        java.util.Map map31 = null;
        ascii2NativeMojo26.setPluginContext(map31);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo33 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map34 = ascii2NativeMojo33.getPluginContext();
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo33.getLog();
        ascii2NativeMojo26.setLog(log35);
        ascii2NativeMojo16.setLog(log35);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo38 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map39 = ascii2NativeMojo38.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo40 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log41 = null;
        ascii2NativeMojo40.setLog(log41);
        org.apache.maven.plugin.logging.Log log43 = null;
        ascii2NativeMojo40.setLog(log43);
        java.util.Map map45 = null;
        ascii2NativeMojo40.setPluginContext(map45);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo47 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map48 = ascii2NativeMojo47.getPluginContext();
        org.apache.maven.plugin.logging.Log log49 = ascii2NativeMojo47.getLog();
        ascii2NativeMojo40.setLog(log49);
        ascii2NativeMojo38.setLog(log49);
        ascii2NativeMojo16.setLog(log49);
        ascii2NativeMojo0.setLog(log49);
        java.util.Map map54 = null;
        ascii2NativeMojo0.setPluginContext(map54);
        org.apache.maven.plugin.logging.Log log56 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNull(map39);
        org.junit.Assert.assertNull(map48);
        org.junit.Assert.assertNotNull(log49);
        org.junit.Assert.assertNotNull(log56);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        java.util.Map map22 = null;
        ascii2NativeMojo0.setPluginContext(map22);
        java.lang.Class<?> wildcardClass24 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map4 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(map4);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map6 = null;
        ascii2NativeMojo5.setPluginContext(map6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo5.getLog();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo5.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo12.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        java.util.Map map17 = null;
        ascii2NativeMojo12.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = ascii2NativeMojo19.getPluginContext();
        org.apache.maven.plugin.logging.Log log21 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo12.setLog(log21);
        ascii2NativeMojo5.setLog(log21);
        ascii2NativeMojo0.setLog(log21);
        java.util.Map map25 = null;
        ascii2NativeMojo0.setPluginContext(map25);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNotNull(log21);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo8 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map9 = ascii2NativeMojo8.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo8.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        java.lang.Class<?> wildcardClass23 = log19.getClass();
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map6 = null;
        ascii2NativeMojo5.setPluginContext(map6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo5.getLog();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo5.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo12.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        java.util.Map map17 = null;
        ascii2NativeMojo12.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = ascii2NativeMojo19.getPluginContext();
        org.apache.maven.plugin.logging.Log log21 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo12.setLog(log21);
        ascii2NativeMojo5.setLog(log21);
        ascii2NativeMojo0.setLog(log21);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo25 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map26 = null;
        ascii2NativeMojo25.setPluginContext(map26);
        org.apache.maven.plugin.logging.Log log28 = null;
        ascii2NativeMojo25.setLog(log28);
        java.util.Map map30 = null;
        ascii2NativeMojo25.setPluginContext(map30);
        org.apache.maven.plugin.logging.Log log32 = ascii2NativeMojo25.getLog();
        ascii2NativeMojo0.setLog(log32);
        java.util.Map map34 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertNull(map34);
        org.junit.Assert.assertNotNull(log35);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo8 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo8.setLog(log9);
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo8.setLog(log11);
        java.util.Map map13 = ascii2NativeMojo8.getPluginContext();
        java.util.Map map14 = ascii2NativeMojo8.getPluginContext();
        java.util.Map map15 = ascii2NativeMojo8.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo16 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map17 = ascii2NativeMojo16.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log19 = null;
        ascii2NativeMojo18.setLog(log19);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo18.setLog(log21);
        java.util.Map map23 = null;
        ascii2NativeMojo18.setPluginContext(map23);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo25 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map26 = ascii2NativeMojo25.getPluginContext();
        org.apache.maven.plugin.logging.Log log27 = ascii2NativeMojo25.getLog();
        ascii2NativeMojo18.setLog(log27);
        ascii2NativeMojo16.setLog(log27);
        ascii2NativeMojo8.setLog(log27);
        ascii2NativeMojo0.setLog(log27);
        org.apache.maven.plugin.logging.Log log32 = ascii2NativeMojo0.getLog();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(map26);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNotNull(log32);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo5.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo5.setLog(log10);
        java.util.Map map12 = ascii2NativeMojo5.getPluginContext();
        java.util.Map map13 = null;
        ascii2NativeMojo5.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo15.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = null;
        ascii2NativeMojo18.setPluginContext(map19);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo18.setLog(log21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo18.getLog();
        ascii2NativeMojo15.setLog(log23);
        ascii2NativeMojo5.setLog(log23);
        ascii2NativeMojo0.setLog(log23);
        java.lang.Class<?> wildcardClass27 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log2 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo3 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log4 = null;
        ascii2NativeMojo3.setLog(log4);
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo3.setLog(log6);
        java.util.Map map8 = null;
        ascii2NativeMojo3.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = null;
        ascii2NativeMojo15.setPluginContext(map16);
        org.apache.maven.plugin.logging.Log log18 = null;
        ascii2NativeMojo15.setLog(log18);
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo15.getLog();
        org.apache.maven.plugin.logging.Log log21 = ascii2NativeMojo15.getLog();
        ascii2NativeMojo10.setLog(log21);
        ascii2NativeMojo3.setLog(log21);
        ascii2NativeMojo0.setLog(log21);
        java.util.Map map25 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNull(map25);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo7.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo7.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo7.setLog(log12);
        java.util.Map map14 = ascii2NativeMojo7.getPluginContext();
        java.util.Map map15 = null;
        ascii2NativeMojo7.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log18 = null;
        ascii2NativeMojo17.setLog(log18);
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo17.setLog(log20);
        java.util.Map map22 = null;
        ascii2NativeMojo17.setPluginContext(map22);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map25 = ascii2NativeMojo24.getPluginContext();
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo24.getLog();
        ascii2NativeMojo17.setLog(log26);
        ascii2NativeMojo7.setLog(log26);
        ascii2NativeMojo0.setLog(log26);
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNotNull(log26);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo8 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo8.setLog(log9);
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo8.setLog(log11);
        java.util.Map map13 = null;
        ascii2NativeMojo8.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo15.getLog();
        ascii2NativeMojo8.setLog(log17);
        java.util.Map map19 = null;
        ascii2NativeMojo8.setPluginContext(map19);
        java.util.Map map21 = null;
        ascii2NativeMojo8.setPluginContext(map21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo8.getLog();
        ascii2NativeMojo0.setLog(log23);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo25 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map26 = null;
        ascii2NativeMojo25.setPluginContext(map26);
        org.apache.maven.plugin.logging.Log log28 = null;
        ascii2NativeMojo25.setLog(log28);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo30 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map31 = null;
        ascii2NativeMojo30.setPluginContext(map31);
        org.apache.maven.plugin.logging.Log log33 = null;
        ascii2NativeMojo30.setLog(log33);
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo30.getLog();
        org.apache.maven.plugin.logging.Log log36 = ascii2NativeMojo30.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo37 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log38 = null;
        ascii2NativeMojo37.setLog(log38);
        org.apache.maven.plugin.logging.Log log40 = null;
        ascii2NativeMojo37.setLog(log40);
        java.util.Map map42 = null;
        ascii2NativeMojo37.setPluginContext(map42);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo44 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map45 = ascii2NativeMojo44.getPluginContext();
        org.apache.maven.plugin.logging.Log log46 = ascii2NativeMojo44.getLog();
        ascii2NativeMojo37.setLog(log46);
        ascii2NativeMojo30.setLog(log46);
        ascii2NativeMojo25.setLog(log46);
        ascii2NativeMojo0.setLog(log46);
        java.lang.Class<?> wildcardClass51 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log36);
        org.junit.Assert.assertNull(map45);
        org.junit.Assert.assertNotNull(log46);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log4 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass5 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo0.setPluginContext(map11);
        java.util.Map map13 = null;
        ascii2NativeMojo0.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo0.getLog();
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo20 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map21 = null;
        ascii2NativeMojo20.setPluginContext(map21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo20.getLog();
        ascii2NativeMojo0.setLog(log23);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo25 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map26 = null;
        ascii2NativeMojo25.setPluginContext(map26);
        org.apache.maven.plugin.logging.Log log28 = null;
        ascii2NativeMojo25.setLog(log28);
        java.util.Map map30 = null;
        ascii2NativeMojo25.setPluginContext(map30);
        java.util.Map map32 = ascii2NativeMojo25.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo25.getLog();
        java.util.Map map34 = null;
        ascii2NativeMojo25.setPluginContext(map34);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo36 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log37 = null;
        ascii2NativeMojo36.setLog(log37);
        org.apache.maven.plugin.logging.Log log39 = null;
        ascii2NativeMojo36.setLog(log39);
        org.apache.maven.plugin.logging.Log log41 = null;
        ascii2NativeMojo36.setLog(log41);
        java.util.Map map43 = ascii2NativeMojo36.getPluginContext();
        java.util.Map map44 = null;
        ascii2NativeMojo36.setPluginContext(map44);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo46 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log47 = null;
        ascii2NativeMojo46.setLog(log47);
        org.apache.maven.plugin.logging.Log log49 = null;
        ascii2NativeMojo46.setLog(log49);
        java.util.Map map51 = null;
        ascii2NativeMojo46.setPluginContext(map51);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo53 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map54 = ascii2NativeMojo53.getPluginContext();
        org.apache.maven.plugin.logging.Log log55 = ascii2NativeMojo53.getLog();
        ascii2NativeMojo46.setLog(log55);
        ascii2NativeMojo36.setLog(log55);
        ascii2NativeMojo25.setLog(log55);
        ascii2NativeMojo0.setLog(log55);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map43);
        org.junit.Assert.assertNull(map54);
        org.junit.Assert.assertNotNull(log55);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map4 = null;
        ascii2NativeMojo0.setPluginContext(map4);
        java.util.Map map6 = null;
        ascii2NativeMojo0.setPluginContext(map6);
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map10 = null;
        ascii2NativeMojo9.setPluginContext(map10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        java.util.Map map14 = null;
        ascii2NativeMojo9.setPluginContext(map14);
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo9.getLog();
        ascii2NativeMojo0.setLog(log16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = ascii2NativeMojo19.getPluginContext();
        java.util.Map map21 = ascii2NativeMojo19.getPluginContext();
        java.util.Map map22 = ascii2NativeMojo19.getPluginContext();
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo0.setLog(log23);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNotNull(log23);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map6 = null;
        ascii2NativeMojo5.setPluginContext(map6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo5.getLog();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo5.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo12.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        java.util.Map map17 = null;
        ascii2NativeMojo12.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = ascii2NativeMojo19.getPluginContext();
        org.apache.maven.plugin.logging.Log log21 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo12.setLog(log21);
        ascii2NativeMojo5.setLog(log21);
        ascii2NativeMojo0.setLog(log21);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo25 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map26 = null;
        ascii2NativeMojo25.setPluginContext(map26);
        org.apache.maven.plugin.logging.Log log28 = null;
        ascii2NativeMojo25.setLog(log28);
        java.util.Map map30 = null;
        ascii2NativeMojo25.setPluginContext(map30);
        org.apache.maven.plugin.logging.Log log32 = ascii2NativeMojo25.getLog();
        ascii2NativeMojo0.setLog(log32);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo34 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map35 = ascii2NativeMojo34.getPluginContext();
        org.apache.maven.plugin.logging.Log log36 = ascii2NativeMojo34.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo37 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map38 = null;
        ascii2NativeMojo37.setPluginContext(map38);
        org.apache.maven.plugin.logging.Log log40 = null;
        ascii2NativeMojo37.setLog(log40);
        org.apache.maven.plugin.logging.Log log42 = ascii2NativeMojo37.getLog();
        ascii2NativeMojo34.setLog(log42);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo44 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map45 = null;
        ascii2NativeMojo44.setPluginContext(map45);
        org.apache.maven.plugin.logging.Log log47 = null;
        ascii2NativeMojo44.setLog(log47);
        org.apache.maven.plugin.logging.Log log49 = ascii2NativeMojo44.getLog();
        org.apache.maven.plugin.logging.Log log50 = ascii2NativeMojo44.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo51 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log52 = null;
        ascii2NativeMojo51.setLog(log52);
        org.apache.maven.plugin.logging.Log log54 = null;
        ascii2NativeMojo51.setLog(log54);
        java.util.Map map56 = null;
        ascii2NativeMojo51.setPluginContext(map56);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo58 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map59 = ascii2NativeMojo58.getPluginContext();
        org.apache.maven.plugin.logging.Log log60 = ascii2NativeMojo58.getLog();
        ascii2NativeMojo51.setLog(log60);
        ascii2NativeMojo44.setLog(log60);
        ascii2NativeMojo34.setLog(log60);
        ascii2NativeMojo0.setLog(log60);
        org.apache.maven.plugin.logging.Log log65 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertNull(map35);
        org.junit.Assert.assertNotNull(log36);
        org.junit.Assert.assertNotNull(log42);
        org.junit.Assert.assertNotNull(log49);
        org.junit.Assert.assertNotNull(log50);
        org.junit.Assert.assertNull(map59);
        org.junit.Assert.assertNotNull(log60);
        org.junit.Assert.assertNotNull(log65);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo22 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map23 = ascii2NativeMojo22.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log25 = null;
        ascii2NativeMojo24.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = null;
        ascii2NativeMojo24.setLog(log27);
        java.util.Map map29 = null;
        ascii2NativeMojo24.setPluginContext(map29);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo31 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map32 = ascii2NativeMojo31.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo31.getLog();
        ascii2NativeMojo24.setLog(log33);
        ascii2NativeMojo22.setLog(log33);
        ascii2NativeMojo0.setLog(log33);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo37 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log38 = null;
        ascii2NativeMojo37.setLog(log38);
        org.apache.maven.plugin.logging.Log log40 = null;
        ascii2NativeMojo37.setLog(log40);
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo37.setLog(log42);
        java.util.Map map44 = ascii2NativeMojo37.getPluginContext();
        java.util.Map map45 = null;
        ascii2NativeMojo37.setPluginContext(map45);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo47 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log48 = null;
        ascii2NativeMojo47.setLog(log48);
        org.apache.maven.plugin.logging.Log log50 = null;
        ascii2NativeMojo47.setLog(log50);
        java.util.Map map52 = null;
        ascii2NativeMojo47.setPluginContext(map52);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo54 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map55 = ascii2NativeMojo54.getPluginContext();
        org.apache.maven.plugin.logging.Log log56 = ascii2NativeMojo54.getLog();
        ascii2NativeMojo47.setLog(log56);
        ascii2NativeMojo37.setLog(log56);
        ascii2NativeMojo0.setLog(log56);
        java.lang.Class<?> wildcardClass60 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map44);
        org.junit.Assert.assertNull(map55);
        org.junit.Assert.assertNotNull(log56);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo6.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo6.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo0.setLog(log14);
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = null;
        ascii2NativeMojo19.setPluginContext(map20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        java.util.Map map24 = null;
        ascii2NativeMojo19.setPluginContext(map24);
        java.util.Map map26 = ascii2NativeMojo19.getPluginContext();
        org.apache.maven.plugin.logging.Log log27 = ascii2NativeMojo19.getLog();
        java.util.Map map28 = null;
        ascii2NativeMojo19.setPluginContext(map28);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo30 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log31 = null;
        ascii2NativeMojo30.setLog(log31);
        org.apache.maven.plugin.logging.Log log33 = null;
        ascii2NativeMojo30.setLog(log33);
        org.apache.maven.plugin.logging.Log log35 = null;
        ascii2NativeMojo30.setLog(log35);
        java.util.Map map37 = ascii2NativeMojo30.getPluginContext();
        java.util.Map map38 = null;
        ascii2NativeMojo30.setPluginContext(map38);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo40 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log41 = null;
        ascii2NativeMojo40.setLog(log41);
        org.apache.maven.plugin.logging.Log log43 = null;
        ascii2NativeMojo40.setLog(log43);
        java.util.Map map45 = null;
        ascii2NativeMojo40.setPluginContext(map45);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo47 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map48 = ascii2NativeMojo47.getPluginContext();
        org.apache.maven.plugin.logging.Log log49 = ascii2NativeMojo47.getLog();
        ascii2NativeMojo40.setLog(log49);
        ascii2NativeMojo30.setLog(log49);
        ascii2NativeMojo19.setLog(log49);
        ascii2NativeMojo0.setLog(log49);
        java.lang.Class<?> wildcardClass54 = log49.getClass();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNull(map26);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNull(map37);
        org.junit.Assert.assertNull(map48);
        org.junit.Assert.assertNotNull(log49);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo7.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo7.setLog(log10);
        java.util.Map map12 = null;
        ascii2NativeMojo7.setPluginContext(map12);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo14 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map15 = ascii2NativeMojo14.getPluginContext();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo14.getLog();
        ascii2NativeMojo7.setLog(log16);
        ascii2NativeMojo0.setLog(log16);
        java.util.Map map19 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNull(map19);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo22 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map23 = ascii2NativeMojo22.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log25 = null;
        ascii2NativeMojo24.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = null;
        ascii2NativeMojo24.setLog(log27);
        java.util.Map map29 = null;
        ascii2NativeMojo24.setPluginContext(map29);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo31 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map32 = ascii2NativeMojo31.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo31.getLog();
        ascii2NativeMojo24.setLog(log33);
        ascii2NativeMojo22.setLog(log33);
        ascii2NativeMojo0.setLog(log33);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo37 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log38 = null;
        ascii2NativeMojo37.setLog(log38);
        org.apache.maven.plugin.logging.Log log40 = null;
        ascii2NativeMojo37.setLog(log40);
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo37.setLog(log42);
        java.util.Map map44 = ascii2NativeMojo37.getPluginContext();
        java.util.Map map45 = null;
        ascii2NativeMojo37.setPluginContext(map45);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo47 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log48 = null;
        ascii2NativeMojo47.setLog(log48);
        org.apache.maven.plugin.logging.Log log50 = null;
        ascii2NativeMojo47.setLog(log50);
        java.util.Map map52 = null;
        ascii2NativeMojo47.setPluginContext(map52);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo54 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map55 = ascii2NativeMojo54.getPluginContext();
        org.apache.maven.plugin.logging.Log log56 = ascii2NativeMojo54.getLog();
        ascii2NativeMojo47.setLog(log56);
        ascii2NativeMojo37.setLog(log56);
        ascii2NativeMojo0.setLog(log56);
        java.util.Map map60 = null;
        ascii2NativeMojo0.setPluginContext(map60);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo62 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map63 = null;
        ascii2NativeMojo62.setPluginContext(map63);
        org.apache.maven.plugin.logging.Log log65 = null;
        ascii2NativeMojo62.setLog(log65);
        java.util.Map map67 = null;
        ascii2NativeMojo62.setPluginContext(map67);
        java.util.Map map69 = ascii2NativeMojo62.getPluginContext();
        org.apache.maven.plugin.logging.Log log70 = ascii2NativeMojo62.getLog();
        java.util.Map map71 = null;
        ascii2NativeMojo62.setPluginContext(map71);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo73 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log74 = null;
        ascii2NativeMojo73.setLog(log74);
        org.apache.maven.plugin.logging.Log log76 = null;
        ascii2NativeMojo73.setLog(log76);
        org.apache.maven.plugin.logging.Log log78 = null;
        ascii2NativeMojo73.setLog(log78);
        java.util.Map map80 = ascii2NativeMojo73.getPluginContext();
        java.util.Map map81 = null;
        ascii2NativeMojo73.setPluginContext(map81);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo83 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log84 = null;
        ascii2NativeMojo83.setLog(log84);
        org.apache.maven.plugin.logging.Log log86 = null;
        ascii2NativeMojo83.setLog(log86);
        java.util.Map map88 = null;
        ascii2NativeMojo83.setPluginContext(map88);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo90 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map91 = ascii2NativeMojo90.getPluginContext();
        org.apache.maven.plugin.logging.Log log92 = ascii2NativeMojo90.getLog();
        ascii2NativeMojo83.setLog(log92);
        ascii2NativeMojo73.setLog(log92);
        ascii2NativeMojo62.setLog(log92);
        ascii2NativeMojo0.setLog(log92);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map44);
        org.junit.Assert.assertNull(map55);
        org.junit.Assert.assertNotNull(log56);
        org.junit.Assert.assertNull(map69);
        org.junit.Assert.assertNotNull(log70);
        org.junit.Assert.assertNull(map80);
        org.junit.Assert.assertNull(map91);
        org.junit.Assert.assertNotNull(log92);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        // The following exception was thrown during execution in test generation
        try {
            ascii2NativeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type org.apache.maven.plugin.MojoExecutionException; message: Ascii2Native: Folder isn't exist: null");
        } catch (org.apache.maven.plugin.MojoExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map4 = null;
        ascii2NativeMojo0.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = ascii2NativeMojo10.getPluginContext();
        org.apache.maven.plugin.logging.Log log12 = ascii2NativeMojo10.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo13 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map14 = null;
        ascii2NativeMojo13.setPluginContext(map14);
        org.apache.maven.plugin.logging.Log log16 = null;
        ascii2NativeMojo13.setLog(log16);
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo13.getLog();
        ascii2NativeMojo10.setLog(log18);
        ascii2NativeMojo0.setLog(log18);
        org.apache.maven.plugin.logging.Log log21 = ascii2NativeMojo0.getLog();
        java.util.Map map22 = null;
        ascii2NativeMojo0.setPluginContext(map22);
        org.apache.maven.plugin.logging.Log log24 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNotNull(log24);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = ascii2NativeMojo10.getPluginContext();
        org.apache.maven.plugin.logging.Log log12 = ascii2NativeMojo10.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo13 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map14 = null;
        ascii2NativeMojo13.setPluginContext(map14);
        org.apache.maven.plugin.logging.Log log16 = null;
        ascii2NativeMojo13.setLog(log16);
        org.apache.maven.plugin.logging.Log log18 = ascii2NativeMojo13.getLog();
        ascii2NativeMojo10.setLog(log18);
        ascii2NativeMojo0.setLog(log18);
        org.apache.maven.plugin.logging.Log log21 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo22 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map23 = null;
        ascii2NativeMojo22.setPluginContext(map23);
        org.apache.maven.plugin.logging.Log log25 = null;
        ascii2NativeMojo22.setLog(log25);
        java.util.Map map27 = null;
        ascii2NativeMojo22.setPluginContext(map27);
        java.util.Map map29 = ascii2NativeMojo22.getPluginContext();
        java.util.Map map30 = ascii2NativeMojo22.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo31 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map32 = ascii2NativeMojo31.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo31.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo34 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map35 = null;
        ascii2NativeMojo34.setPluginContext(map35);
        org.apache.maven.plugin.logging.Log log37 = null;
        ascii2NativeMojo34.setLog(log37);
        org.apache.maven.plugin.logging.Log log39 = ascii2NativeMojo34.getLog();
        ascii2NativeMojo31.setLog(log39);
        org.apache.maven.plugin.logging.Log log41 = ascii2NativeMojo31.getLog();
        java.util.Map map42 = ascii2NativeMojo31.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo43 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map44 = null;
        ascii2NativeMojo43.setPluginContext(map44);
        org.apache.maven.plugin.logging.Log log46 = null;
        ascii2NativeMojo43.setLog(log46);
        org.apache.maven.plugin.logging.Log log48 = ascii2NativeMojo43.getLog();
        org.apache.maven.plugin.logging.Log log49 = ascii2NativeMojo43.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo50 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log51 = null;
        ascii2NativeMojo50.setLog(log51);
        org.apache.maven.plugin.logging.Log log53 = null;
        ascii2NativeMojo50.setLog(log53);
        java.util.Map map55 = null;
        ascii2NativeMojo50.setPluginContext(map55);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo57 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map58 = ascii2NativeMojo57.getPluginContext();
        org.apache.maven.plugin.logging.Log log59 = ascii2NativeMojo57.getLog();
        ascii2NativeMojo50.setLog(log59);
        ascii2NativeMojo43.setLog(log59);
        ascii2NativeMojo31.setLog(log59);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo63 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log64 = null;
        ascii2NativeMojo63.setLog(log64);
        org.apache.maven.plugin.logging.Log log66 = null;
        ascii2NativeMojo63.setLog(log66);
        org.apache.maven.plugin.logging.Log log68 = ascii2NativeMojo63.getLog();
        ascii2NativeMojo31.setLog(log68);
        org.apache.maven.plugin.logging.Log log70 = ascii2NativeMojo31.getLog();
        ascii2NativeMojo22.setLog(log70);
        ascii2NativeMojo0.setLog(log70);
        java.util.Map map73 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo74 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map75 = null;
        ascii2NativeMojo74.setPluginContext(map75);
        org.apache.maven.plugin.logging.Log log77 = null;
        ascii2NativeMojo74.setLog(log77);
        org.apache.maven.plugin.logging.Log log79 = ascii2NativeMojo74.getLog();
        org.apache.maven.plugin.logging.Log log80 = ascii2NativeMojo74.getLog();
        org.apache.maven.plugin.logging.Log log81 = ascii2NativeMojo74.getLog();
        java.util.Map map82 = ascii2NativeMojo74.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo83 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map84 = null;
        ascii2NativeMojo83.setPluginContext(map84);
        org.apache.maven.plugin.logging.Log log86 = null;
        ascii2NativeMojo83.setLog(log86);
        java.util.Map map88 = null;
        ascii2NativeMojo83.setPluginContext(map88);
        org.apache.maven.plugin.logging.Log log90 = ascii2NativeMojo83.getLog();
        ascii2NativeMojo74.setLog(log90);
        java.util.Map map92 = null;
        ascii2NativeMojo74.setPluginContext(map92);
        org.apache.maven.plugin.logging.Log log94 = ascii2NativeMojo74.getLog();
        ascii2NativeMojo0.setLog(log94);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNotNull(log39);
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertNull(map42);
        org.junit.Assert.assertNotNull(log48);
        org.junit.Assert.assertNotNull(log49);
        org.junit.Assert.assertNull(map58);
        org.junit.Assert.assertNotNull(log59);
        org.junit.Assert.assertNotNull(log68);
        org.junit.Assert.assertNotNull(log70);
        org.junit.Assert.assertNull(map73);
        org.junit.Assert.assertNotNull(log79);
        org.junit.Assert.assertNotNull(log80);
        org.junit.Assert.assertNotNull(log81);
        org.junit.Assert.assertNull(map82);
        org.junit.Assert.assertNotNull(log90);
        org.junit.Assert.assertNotNull(log94);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo5 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log6 = null;
        ascii2NativeMojo5.setLog(log6);
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo5.setLog(log10);
        java.util.Map map12 = ascii2NativeMojo5.getPluginContext();
        java.util.Map map13 = null;
        ascii2NativeMojo5.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo15.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = null;
        ascii2NativeMojo18.setPluginContext(map19);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo18.setLog(log21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo18.getLog();
        ascii2NativeMojo15.setLog(log23);
        ascii2NativeMojo5.setLog(log23);
        ascii2NativeMojo0.setLog(log23);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo27 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map28 = ascii2NativeMojo27.getPluginContext();
        org.apache.maven.plugin.logging.Log log29 = ascii2NativeMojo27.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo30 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map31 = null;
        ascii2NativeMojo30.setPluginContext(map31);
        org.apache.maven.plugin.logging.Log log33 = null;
        ascii2NativeMojo30.setLog(log33);
        org.apache.maven.plugin.logging.Log log35 = ascii2NativeMojo30.getLog();
        ascii2NativeMojo27.setLog(log35);
        org.apache.maven.plugin.logging.Log log37 = ascii2NativeMojo27.getLog();
        java.util.Map map38 = ascii2NativeMojo27.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo39 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map40 = null;
        ascii2NativeMojo39.setPluginContext(map40);
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo39.setLog(log42);
        org.apache.maven.plugin.logging.Log log44 = ascii2NativeMojo39.getLog();
        org.apache.maven.plugin.logging.Log log45 = ascii2NativeMojo39.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo46 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log47 = null;
        ascii2NativeMojo46.setLog(log47);
        org.apache.maven.plugin.logging.Log log49 = null;
        ascii2NativeMojo46.setLog(log49);
        java.util.Map map51 = null;
        ascii2NativeMojo46.setPluginContext(map51);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo53 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map54 = ascii2NativeMojo53.getPluginContext();
        org.apache.maven.plugin.logging.Log log55 = ascii2NativeMojo53.getLog();
        ascii2NativeMojo46.setLog(log55);
        ascii2NativeMojo39.setLog(log55);
        ascii2NativeMojo27.setLog(log55);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo59 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log60 = null;
        ascii2NativeMojo59.setLog(log60);
        org.apache.maven.plugin.logging.Log log62 = null;
        ascii2NativeMojo59.setLog(log62);
        org.apache.maven.plugin.logging.Log log64 = ascii2NativeMojo59.getLog();
        ascii2NativeMojo27.setLog(log64);
        org.apache.maven.plugin.logging.Log log66 = ascii2NativeMojo27.getLog();
        ascii2NativeMojo0.setLog(log66);
        java.util.Map map68 = null;
        ascii2NativeMojo0.setPluginContext(map68);
        java.util.Map map70 = null;
        ascii2NativeMojo0.setPluginContext(map70);
        java.util.Map map72 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map12);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNotNull(log29);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertNull(map38);
        org.junit.Assert.assertNotNull(log44);
        org.junit.Assert.assertNotNull(log45);
        org.junit.Assert.assertNull(map54);
        org.junit.Assert.assertNotNull(log55);
        org.junit.Assert.assertNotNull(log64);
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertNull(map72);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo0.getLog();
        java.util.Map map9 = null;
        ascii2NativeMojo0.setPluginContext(map9);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo11 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo11.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo11.setLog(log14);
        org.apache.maven.plugin.logging.Log log16 = null;
        ascii2NativeMojo11.setLog(log16);
        java.util.Map map18 = ascii2NativeMojo11.getPluginContext();
        java.util.Map map19 = null;
        ascii2NativeMojo11.setPluginContext(map19);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo21 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo21.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = null;
        ascii2NativeMojo21.setLog(log24);
        java.util.Map map26 = null;
        ascii2NativeMojo21.setPluginContext(map26);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo28 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map29 = ascii2NativeMojo28.getPluginContext();
        org.apache.maven.plugin.logging.Log log30 = ascii2NativeMojo28.getLog();
        ascii2NativeMojo21.setLog(log30);
        ascii2NativeMojo11.setLog(log30);
        ascii2NativeMojo0.setLog(log30);
        java.util.Map map34 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map29);
        org.junit.Assert.assertNotNull(log30);
        org.junit.Assert.assertNull(map34);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo9.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo9.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo9.getPluginContext();
        java.util.Map map17 = null;
        ascii2NativeMojo9.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = null;
        ascii2NativeMojo19.setPluginContext(map20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = ascii2NativeMojo19.getLog();
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo9.setLog(log25);
        ascii2NativeMojo0.setLog(log25);
        java.util.Map map28 = null;
        ascii2NativeMojo0.setPluginContext(map28);
        org.apache.maven.plugin.logging.Log log30 = ascii2NativeMojo0.getLog();
        java.util.Map map31 = null;
        ascii2NativeMojo0.setPluginContext(map31);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo33 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map34 = null;
        ascii2NativeMojo33.setPluginContext(map34);
        org.apache.maven.plugin.logging.Log log36 = null;
        ascii2NativeMojo33.setLog(log36);
        org.apache.maven.plugin.logging.Log log38 = ascii2NativeMojo33.getLog();
        java.util.Map map39 = ascii2NativeMojo33.getPluginContext();
        org.apache.maven.plugin.logging.Log log40 = ascii2NativeMojo33.getLog();
        org.apache.maven.plugin.logging.Log log41 = ascii2NativeMojo33.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo42 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log43 = null;
        ascii2NativeMojo42.setLog(log43);
        org.apache.maven.plugin.logging.Log log45 = null;
        ascii2NativeMojo42.setLog(log45);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo47 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map48 = null;
        ascii2NativeMojo47.setPluginContext(map48);
        org.apache.maven.plugin.logging.Log log50 = null;
        ascii2NativeMojo47.setLog(log50);
        org.apache.maven.plugin.logging.Log log52 = ascii2NativeMojo47.getLog();
        org.apache.maven.plugin.logging.Log log53 = ascii2NativeMojo47.getLog();
        ascii2NativeMojo42.setLog(log53);
        org.apache.maven.plugin.logging.Log log55 = ascii2NativeMojo42.getLog();
        org.apache.maven.plugin.logging.Log log56 = ascii2NativeMojo42.getLog();
        ascii2NativeMojo33.setLog(log56);
        ascii2NativeMojo0.setLog(log56);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log30);
        org.junit.Assert.assertNotNull(log38);
        org.junit.Assert.assertNull(map39);
        org.junit.Assert.assertNotNull(log40);
        org.junit.Assert.assertNotNull(log41);
        org.junit.Assert.assertNotNull(log52);
        org.junit.Assert.assertNotNull(log53);
        org.junit.Assert.assertNotNull(log55);
        org.junit.Assert.assertNotNull(log56);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log8 = null;
        ascii2NativeMojo7.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo7.setLog(log10);
        java.util.Map map12 = null;
        ascii2NativeMojo7.setPluginContext(map12);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo14 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map15 = ascii2NativeMojo14.getPluginContext();
        org.apache.maven.plugin.logging.Log log16 = ascii2NativeMojo14.getLog();
        ascii2NativeMojo7.setLog(log16);
        ascii2NativeMojo0.setLog(log16);
        java.lang.Class<?> wildcardClass19 = ascii2NativeMojo0.getClass();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo22 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map23 = ascii2NativeMojo22.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log25 = null;
        ascii2NativeMojo24.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = null;
        ascii2NativeMojo24.setLog(log27);
        java.util.Map map29 = null;
        ascii2NativeMojo24.setPluginContext(map29);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo31 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map32 = ascii2NativeMojo31.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo31.getLog();
        ascii2NativeMojo24.setLog(log33);
        ascii2NativeMojo22.setLog(log33);
        ascii2NativeMojo0.setLog(log33);
        java.util.Map map37 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map38 = null;
        ascii2NativeMojo0.setPluginContext(map38);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map37);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map10 = ascii2NativeMojo9.getPluginContext();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo9.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map13 = null;
        ascii2NativeMojo12.setPluginContext(map13);
        org.apache.maven.plugin.logging.Log log15 = null;
        ascii2NativeMojo12.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo12.getLog();
        ascii2NativeMojo9.setLog(log17);
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo9.getLog();
        java.util.Map map20 = ascii2NativeMojo9.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo21 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map22 = null;
        ascii2NativeMojo21.setPluginContext(map22);
        org.apache.maven.plugin.logging.Log log24 = null;
        ascii2NativeMojo21.setLog(log24);
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo21.getLog();
        org.apache.maven.plugin.logging.Log log27 = ascii2NativeMojo21.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo28 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log29 = null;
        ascii2NativeMojo28.setLog(log29);
        org.apache.maven.plugin.logging.Log log31 = null;
        ascii2NativeMojo28.setLog(log31);
        java.util.Map map33 = null;
        ascii2NativeMojo28.setPluginContext(map33);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo35 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map36 = ascii2NativeMojo35.getPluginContext();
        org.apache.maven.plugin.logging.Log log37 = ascii2NativeMojo35.getLog();
        ascii2NativeMojo28.setLog(log37);
        ascii2NativeMojo21.setLog(log37);
        ascii2NativeMojo9.setLog(log37);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo41 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo41.setLog(log42);
        org.apache.maven.plugin.logging.Log log44 = null;
        ascii2NativeMojo41.setLog(log44);
        org.apache.maven.plugin.logging.Log log46 = ascii2NativeMojo41.getLog();
        ascii2NativeMojo9.setLog(log46);
        org.apache.maven.plugin.logging.Log log48 = ascii2NativeMojo9.getLog();
        ascii2NativeMojo0.setLog(log48);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo50 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map51 = ascii2NativeMojo50.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo52 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log53 = null;
        ascii2NativeMojo52.setLog(log53);
        org.apache.maven.plugin.logging.Log log55 = null;
        ascii2NativeMojo52.setLog(log55);
        java.util.Map map57 = null;
        ascii2NativeMojo52.setPluginContext(map57);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo59 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map60 = ascii2NativeMojo59.getPluginContext();
        org.apache.maven.plugin.logging.Log log61 = ascii2NativeMojo59.getLog();
        ascii2NativeMojo52.setLog(log61);
        ascii2NativeMojo50.setLog(log61);
        org.apache.maven.plugin.logging.Log log64 = ascii2NativeMojo50.getLog();
        ascii2NativeMojo0.setLog(log64);
        java.util.Map map66 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNull(map36);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertNotNull(log46);
        org.junit.Assert.assertNotNull(log48);
        org.junit.Assert.assertNull(map51);
        org.junit.Assert.assertNull(map60);
        org.junit.Assert.assertNotNull(log61);
        org.junit.Assert.assertNotNull(log64);
        org.junit.Assert.assertNull(map66);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = null;
        ascii2NativeMojo7.setPluginContext(map8);
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo7.setLog(log10);
        java.util.Map map12 = null;
        ascii2NativeMojo7.setPluginContext(map12);
        java.util.Map map14 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log15);
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = ascii2NativeMojo18.getPluginContext();
        java.util.Map map20 = ascii2NativeMojo18.getPluginContext();
        java.util.Map map21 = ascii2NativeMojo18.getPluginContext();
        java.util.Map map22 = null;
        ascii2NativeMojo18.setPluginContext(map22);
        org.apache.maven.plugin.logging.Log log24 = ascii2NativeMojo18.getLog();
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo18.getLog();
        ascii2NativeMojo0.setLog(log25);
        org.junit.Assert.assertNull(map14);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(log25);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map4 = null;
        ascii2NativeMojo0.setPluginContext(map4);
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo7 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map8 = ascii2NativeMojo7.getPluginContext();
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo7.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map11 = null;
        ascii2NativeMojo10.setPluginContext(map11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        org.apache.maven.plugin.logging.Log log15 = ascii2NativeMojo10.getLog();
        ascii2NativeMojo7.setLog(log15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = null;
        ascii2NativeMojo17.setPluginContext(map18);
        org.apache.maven.plugin.logging.Log log20 = null;
        ascii2NativeMojo17.setLog(log20);
        org.apache.maven.plugin.logging.Log log22 = ascii2NativeMojo17.getLog();
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo17.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log25 = null;
        ascii2NativeMojo24.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = null;
        ascii2NativeMojo24.setLog(log27);
        java.util.Map map29 = null;
        ascii2NativeMojo24.setPluginContext(map29);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo31 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map32 = ascii2NativeMojo31.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo31.getLog();
        ascii2NativeMojo24.setLog(log33);
        ascii2NativeMojo17.setLog(log33);
        ascii2NativeMojo7.setLog(log33);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo37 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map38 = ascii2NativeMojo37.getPluginContext();
        org.apache.maven.plugin.logging.Log log39 = ascii2NativeMojo37.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo40 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map41 = ascii2NativeMojo40.getPluginContext();
        org.apache.maven.plugin.logging.Log log42 = ascii2NativeMojo40.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo43 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map44 = null;
        ascii2NativeMojo43.setPluginContext(map44);
        org.apache.maven.plugin.logging.Log log46 = null;
        ascii2NativeMojo43.setLog(log46);
        org.apache.maven.plugin.logging.Log log48 = ascii2NativeMojo43.getLog();
        ascii2NativeMojo40.setLog(log48);
        org.apache.maven.plugin.logging.Log log50 = ascii2NativeMojo40.getLog();
        java.util.Map map51 = ascii2NativeMojo40.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo52 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map53 = null;
        ascii2NativeMojo52.setPluginContext(map53);
        org.apache.maven.plugin.logging.Log log55 = null;
        ascii2NativeMojo52.setLog(log55);
        org.apache.maven.plugin.logging.Log log57 = ascii2NativeMojo52.getLog();
        org.apache.maven.plugin.logging.Log log58 = ascii2NativeMojo52.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo59 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log60 = null;
        ascii2NativeMojo59.setLog(log60);
        org.apache.maven.plugin.logging.Log log62 = null;
        ascii2NativeMojo59.setLog(log62);
        java.util.Map map64 = null;
        ascii2NativeMojo59.setPluginContext(map64);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo66 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map67 = ascii2NativeMojo66.getPluginContext();
        org.apache.maven.plugin.logging.Log log68 = ascii2NativeMojo66.getLog();
        ascii2NativeMojo59.setLog(log68);
        ascii2NativeMojo52.setLog(log68);
        ascii2NativeMojo40.setLog(log68);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo72 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log73 = null;
        ascii2NativeMojo72.setLog(log73);
        org.apache.maven.plugin.logging.Log log75 = null;
        ascii2NativeMojo72.setLog(log75);
        org.apache.maven.plugin.logging.Log log77 = ascii2NativeMojo72.getLog();
        ascii2NativeMojo40.setLog(log77);
        ascii2NativeMojo37.setLog(log77);
        ascii2NativeMojo7.setLog(log77);
        org.apache.maven.plugin.logging.Log log81 = ascii2NativeMojo7.getLog();
        ascii2NativeMojo0.setLog(log81);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map38);
        org.junit.Assert.assertNotNull(log39);
        org.junit.Assert.assertNull(map41);
        org.junit.Assert.assertNotNull(log42);
        org.junit.Assert.assertNotNull(log48);
        org.junit.Assert.assertNotNull(log50);
        org.junit.Assert.assertNull(map51);
        org.junit.Assert.assertNotNull(log57);
        org.junit.Assert.assertNotNull(log58);
        org.junit.Assert.assertNull(map67);
        org.junit.Assert.assertNotNull(log68);
        org.junit.Assert.assertNotNull(log77);
        org.junit.Assert.assertNotNull(log81);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo9.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo9.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo9.getPluginContext();
        java.util.Map map17 = null;
        ascii2NativeMojo9.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = null;
        ascii2NativeMojo19.setPluginContext(map20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = ascii2NativeMojo19.getLog();
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo9.setLog(log25);
        ascii2NativeMojo0.setLog(log25);
        java.util.Map map28 = null;
        ascii2NativeMojo0.setPluginContext(map28);
        java.util.Map map30 = null;
        ascii2NativeMojo0.setPluginContext(map30);
        java.util.Map map32 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log34 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNotNull(log34);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass4 = log3.getClass();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo4 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map5 = null;
        ascii2NativeMojo4.setPluginContext(map5);
        org.apache.maven.plugin.logging.Log log7 = null;
        ascii2NativeMojo4.setLog(log7);
        org.apache.maven.plugin.logging.Log log9 = ascii2NativeMojo4.getLog();
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo4.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo11 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo11.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo11.setLog(log14);
        java.util.Map map16 = null;
        ascii2NativeMojo11.setPluginContext(map16);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = ascii2NativeMojo18.getPluginContext();
        org.apache.maven.plugin.logging.Log log20 = ascii2NativeMojo18.getLog();
        ascii2NativeMojo11.setLog(log20);
        ascii2NativeMojo4.setLog(log20);
        ascii2NativeMojo0.setLog(log20);
        java.util.Map map24 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map25 = null;
        ascii2NativeMojo0.setPluginContext(map25);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNull(map24);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log8 = ascii2NativeMojo0.getLog();
        java.lang.Class<?> wildcardClass9 = log8.getClass();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log6 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo22 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map23 = ascii2NativeMojo22.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log25 = null;
        ascii2NativeMojo24.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = null;
        ascii2NativeMojo24.setLog(log27);
        java.util.Map map29 = null;
        ascii2NativeMojo24.setPluginContext(map29);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo31 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map32 = ascii2NativeMojo31.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo31.getLog();
        ascii2NativeMojo24.setLog(log33);
        ascii2NativeMojo22.setLog(log33);
        ascii2NativeMojo0.setLog(log33);
        java.util.Map map37 = ascii2NativeMojo0.getPluginContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass38 = map37.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map37);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo8 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map9 = null;
        ascii2NativeMojo8.setPluginContext(map9);
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo8.setLog(log11);
        java.util.Map map13 = null;
        ascii2NativeMojo8.setPluginContext(map13);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = null;
        ascii2NativeMojo15.setPluginContext(map16);
        org.apache.maven.plugin.logging.Log log18 = null;
        ascii2NativeMojo15.setLog(log18);
        java.util.Map map20 = null;
        ascii2NativeMojo15.setPluginContext(map20);
        java.util.Map map22 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo15.getLog();
        ascii2NativeMojo8.setLog(log23);
        ascii2NativeMojo0.setLog(log23);
        org.apache.maven.plugin.logging.Log log26 = ascii2NativeMojo0.getLog();
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(log26);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        org.apache.maven.plugin.logging.Log log7 = ascii2NativeMojo0.getLog();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map9 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map10 = null;
        ascii2NativeMojo0.setPluginContext(map10);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo12 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map13 = ascii2NativeMojo12.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo12.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo15 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map16 = ascii2NativeMojo15.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = ascii2NativeMojo15.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo18 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map19 = null;
        ascii2NativeMojo18.setPluginContext(map19);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo18.setLog(log21);
        org.apache.maven.plugin.logging.Log log23 = ascii2NativeMojo18.getLog();
        ascii2NativeMojo15.setLog(log23);
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo15.getLog();
        java.util.Map map26 = ascii2NativeMojo15.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo27 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map28 = null;
        ascii2NativeMojo27.setPluginContext(map28);
        org.apache.maven.plugin.logging.Log log30 = null;
        ascii2NativeMojo27.setLog(log30);
        org.apache.maven.plugin.logging.Log log32 = ascii2NativeMojo27.getLog();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo27.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo34 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log35 = null;
        ascii2NativeMojo34.setLog(log35);
        org.apache.maven.plugin.logging.Log log37 = null;
        ascii2NativeMojo34.setLog(log37);
        java.util.Map map39 = null;
        ascii2NativeMojo34.setPluginContext(map39);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo41 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map42 = ascii2NativeMojo41.getPluginContext();
        org.apache.maven.plugin.logging.Log log43 = ascii2NativeMojo41.getLog();
        ascii2NativeMojo34.setLog(log43);
        ascii2NativeMojo27.setLog(log43);
        ascii2NativeMojo15.setLog(log43);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo47 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log48 = null;
        ascii2NativeMojo47.setLog(log48);
        org.apache.maven.plugin.logging.Log log50 = null;
        ascii2NativeMojo47.setLog(log50);
        org.apache.maven.plugin.logging.Log log52 = ascii2NativeMojo47.getLog();
        ascii2NativeMojo15.setLog(log52);
        ascii2NativeMojo12.setLog(log52);
        ascii2NativeMojo0.setLog(log52);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNull(map26);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map42);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertNotNull(log52);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        org.apache.maven.plugin.logging.Log log10 = ascii2NativeMojo0.getLog();
        java.util.Map map11 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map11);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = ascii2NativeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log4 = ascii2NativeMojo0.getLog();
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = null;
        ascii2NativeMojo0.setPluginContext(map7);
        java.util.Map map9 = null;
        ascii2NativeMojo0.setPluginContext(map9);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log4);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo0.setLog(log5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo10 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log11 = null;
        ascii2NativeMojo10.setLog(log11);
        org.apache.maven.plugin.logging.Log log13 = null;
        ascii2NativeMojo10.setLog(log13);
        java.util.Map map15 = null;
        ascii2NativeMojo10.setPluginContext(map15);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo17 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map18 = ascii2NativeMojo17.getPluginContext();
        org.apache.maven.plugin.logging.Log log19 = ascii2NativeMojo17.getLog();
        ascii2NativeMojo10.setLog(log19);
        ascii2NativeMojo0.setLog(log19);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo22 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map23 = ascii2NativeMojo22.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo24 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log25 = null;
        ascii2NativeMojo24.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = null;
        ascii2NativeMojo24.setLog(log27);
        java.util.Map map29 = null;
        ascii2NativeMojo24.setPluginContext(map29);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo31 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map32 = ascii2NativeMojo31.getPluginContext();
        org.apache.maven.plugin.logging.Log log33 = ascii2NativeMojo31.getLog();
        ascii2NativeMojo24.setLog(log33);
        ascii2NativeMojo22.setLog(log33);
        ascii2NativeMojo0.setLog(log33);
        java.util.Map map37 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map38 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNull(map37);
        org.junit.Assert.assertNull(map38);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo2 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo2.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = null;
        ascii2NativeMojo2.setLog(log5);
        java.util.Map map7 = null;
        ascii2NativeMojo2.setPluginContext(map7);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map10 = ascii2NativeMojo9.getPluginContext();
        org.apache.maven.plugin.logging.Log log11 = ascii2NativeMojo9.getLog();
        ascii2NativeMojo2.setLog(log11);
        ascii2NativeMojo0.setLog(log11);
        java.util.Map map14 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map14);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map2 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map3 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map4 = null;
        ascii2NativeMojo0.setPluginContext(map4);
        java.util.Map map6 = null;
        ascii2NativeMojo0.setPluginContext(map6);
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        java.util.Map map10 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo11 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map12 = null;
        ascii2NativeMojo11.setPluginContext(map12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo11.setLog(log14);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo16 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log17 = null;
        ascii2NativeMojo16.setLog(log17);
        org.apache.maven.plugin.logging.Log log19 = null;
        ascii2NativeMojo16.setLog(log19);
        org.apache.maven.plugin.logging.Log log21 = null;
        ascii2NativeMojo16.setLog(log21);
        java.util.Map map23 = ascii2NativeMojo16.getPluginContext();
        java.util.Map map24 = null;
        ascii2NativeMojo16.setPluginContext(map24);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo26 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map27 = ascii2NativeMojo26.getPluginContext();
        org.apache.maven.plugin.logging.Log log28 = ascii2NativeMojo26.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo29 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map30 = null;
        ascii2NativeMojo29.setPluginContext(map30);
        org.apache.maven.plugin.logging.Log log32 = null;
        ascii2NativeMojo29.setLog(log32);
        org.apache.maven.plugin.logging.Log log34 = ascii2NativeMojo29.getLog();
        ascii2NativeMojo26.setLog(log34);
        ascii2NativeMojo16.setLog(log34);
        ascii2NativeMojo11.setLog(log34);
        ascii2NativeMojo0.setLog(log34);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(log34);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map6 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = null;
        ascii2NativeMojo0.setPluginContext(map8);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNull(map6);
        org.junit.Assert.assertNull(map7);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map1 = null;
        ascii2NativeMojo0.setPluginContext(map1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        java.util.Map map5 = null;
        ascii2NativeMojo0.setPluginContext(map5);
        java.util.Map map7 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map8 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo9 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log10 = null;
        ascii2NativeMojo9.setLog(log10);
        org.apache.maven.plugin.logging.Log log12 = null;
        ascii2NativeMojo9.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = null;
        ascii2NativeMojo9.setLog(log14);
        java.util.Map map16 = ascii2NativeMojo9.getPluginContext();
        java.util.Map map17 = null;
        ascii2NativeMojo9.setPluginContext(map17);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo19 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map20 = null;
        ascii2NativeMojo19.setPluginContext(map20);
        org.apache.maven.plugin.logging.Log log22 = null;
        ascii2NativeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = ascii2NativeMojo19.getLog();
        org.apache.maven.plugin.logging.Log log25 = ascii2NativeMojo19.getLog();
        ascii2NativeMojo9.setLog(log25);
        ascii2NativeMojo0.setLog(log25);
        java.util.Map map28 = null;
        ascii2NativeMojo0.setPluginContext(map28);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo30 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map31 = ascii2NativeMojo30.getPluginContext();
        org.apache.maven.plugin.logging.Log log32 = ascii2NativeMojo30.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo33 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map34 = null;
        ascii2NativeMojo33.setPluginContext(map34);
        org.apache.maven.plugin.logging.Log log36 = null;
        ascii2NativeMojo33.setLog(log36);
        org.apache.maven.plugin.logging.Log log38 = ascii2NativeMojo33.getLog();
        ascii2NativeMojo30.setLog(log38);
        org.apache.maven.plugin.logging.Log log40 = ascii2NativeMojo30.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo41 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log42 = null;
        ascii2NativeMojo41.setLog(log42);
        org.apache.maven.plugin.logging.Log log44 = null;
        ascii2NativeMojo41.setLog(log44);
        java.util.Map map46 = ascii2NativeMojo41.getPluginContext();
        java.util.Map map47 = ascii2NativeMojo41.getPluginContext();
        java.util.Map map48 = ascii2NativeMojo41.getPluginContext();
        java.util.Map map49 = ascii2NativeMojo41.getPluginContext();
        org.apache.maven.plugin.logging.Log log50 = ascii2NativeMojo41.getLog();
        ascii2NativeMojo30.setLog(log50);
        ascii2NativeMojo0.setLog(log50);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNull(map31);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertNotNull(log38);
        org.junit.Assert.assertNotNull(log40);
        org.junit.Assert.assertNull(map46);
        org.junit.Assert.assertNull(map47);
        org.junit.Assert.assertNull(map48);
        org.junit.Assert.assertNull(map49);
        org.junit.Assert.assertNotNull(log50);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo0 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log1 = null;
        ascii2NativeMojo0.setLog(log1);
        org.apache.maven.plugin.logging.Log log3 = null;
        ascii2NativeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = ascii2NativeMojo0.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo6 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map7 = null;
        ascii2NativeMojo6.setPluginContext(map7);
        org.apache.maven.plugin.logging.Log log9 = null;
        ascii2NativeMojo6.setLog(log9);
        java.util.Map map11 = null;
        ascii2NativeMojo6.setPluginContext(map11);
        java.util.Map map13 = ascii2NativeMojo6.getPluginContext();
        org.apache.maven.plugin.logging.Log log14 = ascii2NativeMojo6.getLog();
        ascii2NativeMojo0.setLog(log14);
        java.util.Map map16 = null;
        ascii2NativeMojo0.setPluginContext(map16);
        java.util.Map map18 = ascii2NativeMojo0.getPluginContext();
        java.util.Map map19 = ascii2NativeMojo0.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo20 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map21 = null;
        ascii2NativeMojo20.setPluginContext(map21);
        org.apache.maven.plugin.logging.Log log23 = null;
        ascii2NativeMojo20.setLog(log23);
        java.util.Map map25 = null;
        ascii2NativeMojo20.setPluginContext(map25);
        java.util.Map map27 = ascii2NativeMojo20.getPluginContext();
        java.util.Map map28 = ascii2NativeMojo20.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo29 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map30 = ascii2NativeMojo29.getPluginContext();
        org.apache.maven.plugin.logging.Log log31 = ascii2NativeMojo29.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo32 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map33 = null;
        ascii2NativeMojo32.setPluginContext(map33);
        org.apache.maven.plugin.logging.Log log35 = null;
        ascii2NativeMojo32.setLog(log35);
        org.apache.maven.plugin.logging.Log log37 = ascii2NativeMojo32.getLog();
        ascii2NativeMojo29.setLog(log37);
        org.apache.maven.plugin.logging.Log log39 = ascii2NativeMojo29.getLog();
        java.util.Map map40 = ascii2NativeMojo29.getPluginContext();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo41 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map42 = null;
        ascii2NativeMojo41.setPluginContext(map42);
        org.apache.maven.plugin.logging.Log log44 = null;
        ascii2NativeMojo41.setLog(log44);
        org.apache.maven.plugin.logging.Log log46 = ascii2NativeMojo41.getLog();
        org.apache.maven.plugin.logging.Log log47 = ascii2NativeMojo41.getLog();
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo48 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log49 = null;
        ascii2NativeMojo48.setLog(log49);
        org.apache.maven.plugin.logging.Log log51 = null;
        ascii2NativeMojo48.setLog(log51);
        java.util.Map map53 = null;
        ascii2NativeMojo48.setPluginContext(map53);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo55 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        java.util.Map map56 = ascii2NativeMojo55.getPluginContext();
        org.apache.maven.plugin.logging.Log log57 = ascii2NativeMojo55.getLog();
        ascii2NativeMojo48.setLog(log57);
        ascii2NativeMojo41.setLog(log57);
        ascii2NativeMojo29.setLog(log57);
        ru.yaal.maven.ascii2native.Ascii2NativeMojo ascii2NativeMojo61 = new ru.yaal.maven.ascii2native.Ascii2NativeMojo();
        org.apache.maven.plugin.logging.Log log62 = null;
        ascii2NativeMojo61.setLog(log62);
        org.apache.maven.plugin.logging.Log log64 = null;
        ascii2NativeMojo61.setLog(log64);
        org.apache.maven.plugin.logging.Log log66 = ascii2NativeMojo61.getLog();
        ascii2NativeMojo29.setLog(log66);
        org.apache.maven.plugin.logging.Log log68 = ascii2NativeMojo29.getLog();
        ascii2NativeMojo20.setLog(log68);
        ascii2NativeMojo0.setLog(log68);
        java.util.Map map71 = null;
        ascii2NativeMojo0.setPluginContext(map71);
        java.util.Map map73 = ascii2NativeMojo0.getPluginContext();
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map13);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNull(map30);
        org.junit.Assert.assertNotNull(log31);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertNotNull(log39);
        org.junit.Assert.assertNull(map40);
        org.junit.Assert.assertNotNull(log46);
        org.junit.Assert.assertNotNull(log47);
        org.junit.Assert.assertNull(map56);
        org.junit.Assert.assertNotNull(log57);
        org.junit.Assert.assertNotNull(log66);
        org.junit.Assert.assertNotNull(log68);
        org.junit.Assert.assertNull(map73);
    }
}

