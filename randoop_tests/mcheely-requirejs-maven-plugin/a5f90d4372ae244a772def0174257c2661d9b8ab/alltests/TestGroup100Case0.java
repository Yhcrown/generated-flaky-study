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
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException1 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("hi!");
        java.lang.Class<?> wildcardClass2 = rhinoRunnerException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException1 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("hi!");
        java.lang.String str2 = rhinoRunnerException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" + "'", str2, "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
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
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("org.apache.maven.plugin.Mojo");
        java.io.File file2 = null;
        java.lang.String[] strArray3 = null;
        org.mozilla.javascript.ErrorReporter errorReporter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus5 = nodeJsRunner1.exec(file2, strArray3, errorReporter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("org.apache.maven.plugin.Mojo");
        java.io.File file2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "org.apache.maven.plugin.Mojo" };
        org.mozilla.javascript.ErrorReporter errorReporter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus11 = nodeJsRunner1.exec(file2, strArray9, errorReporter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException1 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.String str2 = rhinoRunnerException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" + "'", str2, "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        org.mozilla.javascript.ErrorReporter errorReporter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus8 = rhinoRunner0.exec(file1, strArray6, errorReporter7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str0 = com.github.mcheely.maven.requirejs.NodeJsRunner.detectNodeCommand();
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("org.apache.maven.plugin.Mojo");
        java.io.File file2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        org.mozilla.javascript.ErrorReporter errorReporter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus10 = nodeJsRunner1.exec(file2, strArray8, errorReporter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.mozilla.javascript.ErrorReporter errorReporter3 = null;
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner4 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, errorReporter3, (com.github.mcheely.maven.requirejs.Runner) rhinoRunner4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "org.apache.maven.plugin.Mojo", "", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        org.mozilla.javascript.ErrorReporter errorReporter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus9 = nodeJsRunner1.exec(file2, strArray7, errorReporter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        org.mozilla.javascript.ErrorReporter errorReporter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus7 = rhinoRunner0.exec(file1, strArray5, errorReporter6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.mozilla.javascript.ErrorReporter errorReporter2 = null;
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner3 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, errorReporter2, (com.github.mcheely.maven.requirejs.Runner) rhinoRunner3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException2 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException3 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException2);
        java.lang.String str4 = rhinoRunnerException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" + "'", str4, "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException3 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("", (java.lang.Throwable) optimizationException3);
        java.lang.String str6 = rhinoRunnerException5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.github.mcheely.maven.requirejs.RhinoRunnerException: " + "'", str6, "com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.mozilla.javascript.ErrorReporter errorReporter3 = null;
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner5 = new com.github.mcheely.maven.requirejs.NodeJsRunner("org.apache.maven.plugin.Mojo");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, errorReporter3, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        org.mozilla.javascript.ErrorReporter errorReporter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus6 = rhinoRunner0.exec(file1, strArray4, errorReporter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.mozilla.javascript.ErrorReporter errorReporter2 = null;
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner4 = new com.github.mcheely.maven.requirejs.NodeJsRunner("org.apache.maven.plugin.Mojo");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, errorReporter2, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException1 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray2 = rhinoRunnerException1.getSuppressed();
        java.lang.String str3 = rhinoRunnerException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" + "'", str3, "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "org.apache.maven.plugin.Mojo", "org.apache.maven.plugin.Mojo", "" };
        org.apache.maven.plugin.logging.Log log9 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter11 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log9, true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus12 = rhinoRunner0.exec(file1, strArray8, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            org.mozilla.javascript.EvaluatorException evaluatorException9 = mojoErrorReporter2.runtimeError("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "", (int) (short) 0, "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException1 = new com.github.mcheely.maven.requirejs.OptimizationException("");
        java.lang.String str2 = optimizationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.github.mcheely.maven.requirejs.OptimizationException: " + "'", str2, "com.github.mcheely.maven.requirejs.OptimizationException: ");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.apache.maven.plugin.logging.Log log2 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter4 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log2, true);
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner6 = new com.github.mcheely.maven.requirejs.NodeJsRunner("org.apache.maven.plugin.Mojo");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter4, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (int) '#', "com.github.mcheely.maven.requirejs.OptimizationException: ", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException1 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("");
        java.lang.String str2 = rhinoRunnerException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.github.mcheely.maven.requirejs.RhinoRunnerException: " + "'", str2, "com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException3 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException5 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException4);
        java.lang.String str6 = rhinoRunnerException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" + "'", str6, "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.apache.maven.plugin.logging.Log log2 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter4 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log2, true);
        int int5 = mojoErrorReporter4.getWarningCnt();
        int int6 = mojoErrorReporter4.getErrorCnt();
        int int7 = mojoErrorReporter4.getErrorCnt();
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner9 = new com.github.mcheely.maven.requirejs.NodeJsRunner("hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter4, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException1 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray2 = rhinoRunnerException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = rhinoRunnerException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (byte) 100);
        boolean boolean3 = exitStatus0.success();
        exitStatus0.setExitCode(1);
        exitStatus0.setExitCode((int) (short) 0);
        int int8 = exitStatus0.getExitCode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", 100, "org.apache.maven.plugin.Mojo", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        org.apache.maven.plugin.logging.Log log8 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter10 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log8, false);
        int int11 = mojoErrorReporter10.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus12 = rhinoRunner0.exec(file1, strArray7, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.maven.plugin.Mojo", "", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: " };
        org.apache.maven.plugin.logging.Log log8 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter10 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log8, false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus11 = rhinoRunner0.exec(file1, strArray7, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.apache.maven.plugin.logging.Log log2 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter4 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log2, true);
        int int5 = mojoErrorReporter4.getWarningCnt();
        int int6 = mojoErrorReporter4.getErrorCnt();
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner7 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter4, (com.github.mcheely.maven.requirejs.Runner) rhinoRunner7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.apache.maven.plugin.logging.Log log2 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter4 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log2, false);
        int int5 = mojoErrorReporter4.getWarningCnt();
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner6 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter4, (com.github.mcheely.maven.requirejs.Runner) rhinoRunner6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "hi!", (int) (short) 10, "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("org.apache.maven.plugin.Mojo", "hi!", (int) (byte) -1, "org.apache.maven.plugin.Mojo", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("org.apache.maven.plugin.Mojo");
        java.io.File file2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.OptimizationException: ", "hi!" };
        org.apache.maven.plugin.logging.Log log8 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter10 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log8, false);
        int int11 = mojoErrorReporter10.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus12 = nodeJsRunner1.exec(file2, strArray7, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: " };
        org.apache.maven.plugin.logging.Log log5 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter7 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log5, true);
        int int8 = mojoErrorReporter7.getWarningCnt();
        int int9 = mojoErrorReporter7.getErrorCnt();
        int int10 = mojoErrorReporter7.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus11 = rhinoRunner0.exec(file1, strArray4, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException1 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("org.apache.maven.plugin.Mojo");
        java.io.File file2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.OptimizationException: ", "", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        org.apache.maven.plugin.logging.Log log10 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter12 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log10, false);
        int int13 = mojoErrorReporter12.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus14 = nodeJsRunner1.exec(file2, strArray9, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException2 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException3 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("", (java.lang.Throwable) optimizationException2);
        java.lang.Throwable[] throwableArray4 = rhinoRunnerException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.maven.plugin.logging.Log log4 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter6 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log4, true);
        mojoErrorReporter6.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus9 = rhinoRunner0.exec(file1, strArray3, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        int int1 = exitStatus0.getExitCode();
        boolean boolean2 = exitStatus0.success();
        java.lang.Class<?> wildcardClass3 = exitStatus0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (byte) 100);
        boolean boolean3 = exitStatus0.success();
        exitStatus0.setExitCode(1);
        exitStatus0.setExitCode((int) (short) 0);
        boolean boolean8 = exitStatus0.success();
        java.lang.Class<?> wildcardClass9 = exitStatus0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (int) (short) -1, "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, false);
        int int6 = mojoErrorReporter5.getWarningCnt();
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner8 = new com.github.mcheely.maven.requirejs.NodeJsRunner("hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray5 = rhinoRunnerException4.getSuppressed();
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException6 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException4);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException7 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException6);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException8 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException7);
        java.lang.Throwable[] throwableArray9 = rhinoRunnerException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.lang.Throwable throwable1 = null;
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException2 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", throwable1);
        java.lang.Class<?> wildcardClass3 = optimizationException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.OptimizationException: " };
        org.apache.maven.plugin.logging.Log log9 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter11 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log9, true);
        int int12 = mojoErrorReporter11.getWarningCnt();
        int int13 = mojoErrorReporter11.getErrorCnt();
        int int14 = mojoErrorReporter11.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus15 = nodeJsRunner1.exec(file2, strArray8, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log3 = null;
        optimizeMojo0.setLog(log3);
        // The following exception was thrown during execution in test generation
        try {
            optimizeMojo0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        int int5 = mojoErrorReporter2.getErrorCnt();
        int int6 = mojoErrorReporter2.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            org.mozilla.javascript.EvaluatorException evaluatorException12 = mojoErrorReporter2.runtimeError("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (int) (short) -1, "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.apache.maven.plugin.logging.Log log2 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter4 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log2, true);
        int int5 = mojoErrorReporter4.getWarningCnt();
        int int6 = mojoErrorReporter4.getErrorCnt();
        int int7 = mojoErrorReporter4.getErrorCnt();
        int int8 = mojoErrorReporter4.getErrorCnt();
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner9 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter4, (com.github.mcheely.maven.requirejs.Runner) rhinoRunner9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        org.apache.maven.plugin.logging.Log log5 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter7 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log5, true);
        mojoErrorReporter7.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        int int10 = mojoErrorReporter7.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus11 = nodeJsRunner1.exec(file2, strArray4, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, true);
        int int6 = mojoErrorReporter5.getWarningCnt();
        int int7 = mojoErrorReporter5.getErrorCnt();
        int int8 = mojoErrorReporter5.getErrorCnt();
        int int9 = mojoErrorReporter5.getErrorCnt();
        int int10 = mojoErrorReporter5.getErrorCnt();
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner12 = new com.github.mcheely.maven.requirejs.NodeJsRunner("");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException4 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException6 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException7 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("org.apache.maven.plugin.Mojo", (java.lang.Throwable) rhinoRunnerException6);
        java.lang.String str8 = rhinoRunnerException7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo" + "'", str8, "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) ' ');
        boolean boolean3 = exitStatus0.success();
        exitStatus0.setExitCode((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (byte) 100);
        int int3 = exitStatus0.getExitCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo" };
        org.apache.maven.plugin.logging.Log log9 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter11 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log9, true);
        int int12 = mojoErrorReporter11.getWarningCnt();
        int int13 = mojoErrorReporter11.getErrorCnt();
        int int14 = mojoErrorReporter11.getErrorCnt();
        int int15 = mojoErrorReporter11.getErrorCnt();
        int int16 = mojoErrorReporter11.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus17 = rhinoRunner0.exec(file1, strArray8, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.OptimizationException: " };
        org.apache.maven.plugin.logging.Log log6 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter8 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log6, false);
        int int9 = mojoErrorReporter8.getWarningCnt();
        mojoErrorReporter8.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter8.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus18 = nodeJsRunner1.exec(file2, strArray5, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("org.apache.maven.plugin.Mojo");
        java.io.File file2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "org.apache.maven.plugin.Mojo", "hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.OptimizationException: " };
        org.apache.maven.plugin.logging.Log log9 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter11 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log9, true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus12 = nodeJsRunner1.exec(file2, strArray8, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "", "org.apache.maven.plugin.Mojo" };
        org.apache.maven.plugin.logging.Log log9 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter11 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log9, false);
        int int12 = mojoErrorReporter11.getWarningCnt();
        mojoErrorReporter11.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter11.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus21 = rhinoRunner0.exec(file1, strArray8, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("");
        java.io.File file2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: " };
        org.apache.maven.plugin.logging.Log log5 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter7 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log5, false);
        int int8 = mojoErrorReporter7.getWarningCnt();
        mojoErrorReporter7.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter7.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus17 = nodeJsRunner1.exec(file2, strArray4, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, true);
        mojoErrorReporter5.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        int int8 = mojoErrorReporter5.getErrorCnt();
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner9 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5, (com.github.mcheely.maven.requirejs.Runner) rhinoRunner9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.apache.maven.plugin.logging.Log log2 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter4 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log2, false);
        int int5 = mojoErrorReporter4.getWarningCnt();
        mojoErrorReporter4.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter4.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner15 = new com.github.mcheely.maven.requirejs.NodeJsRunner("");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter4, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        int int1 = exitStatus0.getExitCode();
        boolean boolean2 = exitStatus0.success();
        int int3 = exitStatus0.getExitCode();
        boolean boolean4 = exitStatus0.success();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        org.apache.maven.plugin.logging.Log log4 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter6 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log4, false);
        int int7 = mojoErrorReporter6.getWarningCnt();
        mojoErrorReporter6.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus10 = rhinoRunner0.exec(file1, strArray3, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException1 = new com.github.mcheely.maven.requirejs.OptimizationException("org.apache.maven.plugin.Mojo");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("org.apache.maven.plugin.Mojo", (java.lang.Throwable) rhinoRunnerException4);
        optimizationException1.addSuppressed((java.lang.Throwable) rhinoRunnerException5);
        java.lang.String str7 = optimizationException1.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo" + "'", str7, "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo" };
        org.apache.maven.plugin.logging.Log log6 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter8 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log6, false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus9 = nodeJsRunner1.exec(file2, strArray5, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, true);
        int int6 = mojoErrorReporter5.getWarningCnt();
        int int7 = mojoErrorReporter5.getErrorCnt();
        int int8 = mojoErrorReporter5.getErrorCnt();
        int int9 = mojoErrorReporter5.getErrorCnt();
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner11 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "org.apache.maven.plugin.Mojo", (int) '4', "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("", "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", 10, "com.github.mcheely.maven.requirejs.OptimizationException: ", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("");
        java.io.File file2 = null;
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.maven.plugin.logging.Log log4 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter6 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log4, true);
        int int7 = mojoErrorReporter6.getWarningCnt();
        int int8 = mojoErrorReporter6.getErrorCnt();
        int int9 = mojoErrorReporter6.getErrorCnt();
        int int10 = mojoErrorReporter6.getErrorCnt();
        int int11 = mojoErrorReporter6.getErrorCnt();
        mojoErrorReporter6.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus14 = nodeJsRunner1.exec(file2, strArray3, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.apache.maven.plugin.logging.Log log2 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter4 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log2, true);
        int int5 = mojoErrorReporter4.getWarningCnt();
        mojoErrorReporter4.setDefaultFileName("");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner9 = new com.github.mcheely.maven.requirejs.NodeJsRunner("hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter4, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, true);
        int int6 = mojoErrorReporter5.getWarningCnt();
        int int7 = mojoErrorReporter5.getErrorCnt();
        int int8 = mojoErrorReporter5.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus9 = rhinoRunner0.exec(file1, strArray2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException1 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray2 = rhinoRunnerException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException3 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray4 = rhinoRunnerException3.getSuppressed();
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException5 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException3);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException6 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException3);
        java.lang.String str7 = rhinoRunnerException3.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" + "'", str7, "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log2 = optimizeMojo0.getLog();
        java.util.Map map3 = optimizeMojo0.getPluginContext();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(map3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "com.github.mcheely.maven.requirejs.OptimizationException: ", "org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.OptimizationException: " };
        org.apache.maven.plugin.logging.Log log7 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter9 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log7, true);
        mojoErrorReporter9.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus12 = rhinoRunner0.exec(file1, strArray6, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
        java.io.File file2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "", "hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: " };
        org.apache.maven.plugin.logging.Log log10 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter12 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log10, true);
        int int13 = mojoErrorReporter12.getWarningCnt();
        int int14 = mojoErrorReporter12.getErrorCnt();
        int int15 = mojoErrorReporter12.getErrorCnt();
        int int16 = mojoErrorReporter12.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus17 = nodeJsRunner1.exec(file2, strArray9, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, false);
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner6 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5, (com.github.mcheely.maven.requirejs.Runner) rhinoRunner6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (byte) 100);
        boolean boolean3 = exitStatus0.success();
        exitStatus0.setExitCode(1);
        int int6 = exitStatus0.getExitCode();
        exitStatus0.setExitCode((int) (short) 100);
        boolean boolean9 = exitStatus0.success();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        int int5 = mojoErrorReporter2.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", 100, "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.OptimizationException: " };
        org.apache.maven.plugin.logging.Log log7 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter9 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log7, true);
        int int10 = mojoErrorReporter9.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus11 = rhinoRunner0.exec(file1, strArray6, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        mojoErrorReporter2.setDefaultFileName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.OptimizationException: ", (int) (byte) 1, "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        java.util.Map map15 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo16 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map17 = optimizeMojo16.getPluginContext();
        java.util.Map map18 = optimizeMojo16.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo19 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log20 = optimizeMojo19.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo21 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log22 = optimizeMojo21.getLog();
        optimizeMojo19.setLog(log22);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo24 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log25 = optimizeMojo24.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo26 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log27 = optimizeMojo26.getLog();
        optimizeMojo24.setLog(log27);
        optimizeMojo19.setLog(log27);
        optimizeMojo16.setLog(log27);
        java.util.Map map31 = optimizeMojo16.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo32 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log33 = optimizeMojo32.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo34 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log35 = optimizeMojo34.getLog();
        optimizeMojo32.setLog(log35);
        org.apache.maven.plugin.logging.Log log37 = optimizeMojo32.getLog();
        optimizeMojo16.setLog(log37);
        optimizeMojo0.setLog(log37);
        java.util.Map map40 = optimizeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNull(map31);
        org.junit.Assert.assertNotNull(log33);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertNull(map40);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.mozilla.javascript.EvaluatorException evaluatorException17 = mojoErrorReporter2.runtimeError("com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", 0, "org.apache.maven.plugin.Mojo", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        int int5 = mojoErrorReporter2.getErrorCnt();
        int int6 = mojoErrorReporter2.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "org.apache.maven.plugin.Mojo", 1, "hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("org.apache.maven.plugin.Mojo");
        java.io.File file2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "org.apache.maven.plugin.Mojo" };
        org.apache.maven.plugin.logging.Log log8 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter10 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log8, true);
        mojoErrorReporter10.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        int int13 = mojoErrorReporter10.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus14 = nodeJsRunner1.exec(file2, strArray7, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log3 = optimizeMojo2.getLog();
        optimizeMojo0.setLog(log3);
        java.util.Map map5 = optimizeMojo0.getPluginContext();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(map5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (int) (short) 100, "com.github.mcheely.maven.requirejs.OptimizationException: ", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo" };
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo9 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log10 = optimizeMojo9.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter12 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log10, true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus13 = nodeJsRunner1.exec(file2, strArray8, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo15 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log16 = optimizeMojo15.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo17 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log18 = optimizeMojo17.getLog();
        optimizeMojo15.setLog(log18);
        org.apache.maven.plugin.logging.Log log20 = optimizeMojo15.getLog();
        optimizeMojo0.setLog(log20);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNotNull(log20);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        int int5 = mojoErrorReporter2.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("hi!", "hi!", (int) 'a', "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "hi!", "com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.OptimizationException: " };
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo9 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log10 = optimizeMojo9.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter12 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log10, true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus13 = nodeJsRunner1.exec(file2, strArray8, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.mozilla.javascript.ErrorReporter errorReporter3 = null;
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner5 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, errorReporter3, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: " };
        org.apache.maven.plugin.logging.Log log6 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter8 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log6, false);
        int int9 = mojoErrorReporter8.getWarningCnt();
        mojoErrorReporter8.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        int int12 = mojoErrorReporter8.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus13 = nodeJsRunner1.exec(file2, strArray5, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) ' ');
        boolean boolean3 = exitStatus0.success();
        int int4 = exitStatus0.getExitCode();
        int int5 = exitStatus0.getExitCode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        mojoErrorReporter2.setDefaultFileName("");
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("com.github.mcheely.maven.requirejs.OptimizationException: ", "hi!", (int) (short) 1, "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.maven.plugin.Mojo", "", "hi!" };
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo6 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map7 = optimizeMojo6.getPluginContext();
        java.util.Map map8 = optimizeMojo6.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo9 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log10 = optimizeMojo9.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo11 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log12 = optimizeMojo11.getLog();
        optimizeMojo9.setLog(log12);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo14 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log15 = optimizeMojo14.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo16 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo16.getLog();
        optimizeMojo14.setLog(log17);
        optimizeMojo9.setLog(log17);
        optimizeMojo6.setLog(log17);
        java.util.Map map21 = optimizeMojo6.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo22 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log23 = optimizeMojo22.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo24 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log25 = optimizeMojo24.getLog();
        optimizeMojo22.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = optimizeMojo22.getLog();
        optimizeMojo6.setLog(log27);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter30 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log27, true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus31 = rhinoRunner0.exec(file1, strArray5, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log27);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo1 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map2 = optimizeMojo1.getPluginContext();
        java.util.Map map3 = optimizeMojo1.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo4 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log5 = optimizeMojo4.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo6 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log7 = optimizeMojo6.getLog();
        optimizeMojo4.setLog(log7);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo9 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log10 = optimizeMojo9.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo11 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log12 = optimizeMojo11.getLog();
        optimizeMojo9.setLog(log12);
        optimizeMojo4.setLog(log12);
        optimizeMojo1.setLog(log12);
        java.util.Map map16 = optimizeMojo1.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo17 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map18 = optimizeMojo17.getPluginContext();
        java.util.Map map19 = optimizeMojo17.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo20 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log21 = optimizeMojo20.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo22 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log23 = optimizeMojo22.getLog();
        optimizeMojo20.setLog(log23);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo25 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log26 = optimizeMojo25.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo27 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log28 = optimizeMojo27.getLog();
        optimizeMojo25.setLog(log28);
        optimizeMojo20.setLog(log28);
        optimizeMojo17.setLog(log28);
        java.util.Map map32 = optimizeMojo17.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo33 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log34 = optimizeMojo33.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo35 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log36 = optimizeMojo35.getLog();
        optimizeMojo33.setLog(log36);
        org.apache.maven.plugin.logging.Log log38 = optimizeMojo33.getLog();
        optimizeMojo17.setLog(log38);
        optimizeMojo1.setLog(log38);
        optimizeMojo0.setLog(log38);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map19);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNull(map32);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertNotNull(log36);
        org.junit.Assert.assertNotNull(log38);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, false);
        int int6 = mojoErrorReporter5.getWarningCnt();
        mojoErrorReporter5.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter5.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        int int15 = mojoErrorReporter5.getErrorCnt();
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner16 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5, (com.github.mcheely.maven.requirejs.Runner) rhinoRunner16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("org.apache.maven.plugin.Mojo");
        java.io.File file2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "", "com.github.mcheely.maven.requirejs.OptimizationException: " };
        org.apache.maven.plugin.logging.Log log8 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter10 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log8, true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus11 = nodeJsRunner1.exec(file2, strArray7, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException2 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException3 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("", (java.lang.Throwable) optimizationException2);
        java.lang.String str4 = rhinoRunnerException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.github.mcheely.maven.requirejs.RhinoRunnerException: " + "'", str4, "com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log3 = optimizeMojo2.getLog();
        optimizeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo6 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map7 = optimizeMojo6.getPluginContext();
        java.util.Map map8 = optimizeMojo6.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo9 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log10 = optimizeMojo9.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo11 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log12 = optimizeMojo11.getLog();
        optimizeMojo9.setLog(log12);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo14 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log15 = optimizeMojo14.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo16 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo16.getLog();
        optimizeMojo14.setLog(log17);
        optimizeMojo9.setLog(log17);
        optimizeMojo6.setLog(log17);
        java.util.Map map21 = optimizeMojo6.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo22 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log23 = optimizeMojo22.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo24 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log25 = optimizeMojo24.getLog();
        optimizeMojo22.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = optimizeMojo22.getLog();
        optimizeMojo6.setLog(log27);
        optimizeMojo0.setLog(log27);
        org.apache.maven.plugin.logging.Log log30 = null;
        optimizeMojo0.setLog(log30);
        java.util.Map map32 = null;
        optimizeMojo0.setPluginContext(map32);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log27);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, true);
        int int6 = mojoErrorReporter5.getWarningCnt();
        int int7 = mojoErrorReporter5.getWarningCnt();
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner9 = new com.github.mcheely.maven.requirejs.NodeJsRunner("hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("hi!", "", 0, "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (byte) 100);
        exitStatus0.setExitCode((int) (short) -1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log3 = optimizeMojo2.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo4 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log5 = optimizeMojo4.getLog();
        optimizeMojo2.setLog(log5);
        org.apache.maven.plugin.logging.Log log7 = optimizeMojo2.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter9 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log7, false);
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner11 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter9, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (short) 100);
        exitStatus0.setExitCode(10);
        exitStatus0.setExitCode((int) 'a');
        exitStatus0.setExitCode(0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException1 = new com.github.mcheely.maven.requirejs.OptimizationException("org.apache.maven.plugin.Mojo");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("org.apache.maven.plugin.Mojo", (java.lang.Throwable) rhinoRunnerException4);
        optimizationException1.addSuppressed((java.lang.Throwable) rhinoRunnerException5);
        java.lang.String str7 = rhinoRunnerException5.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo" + "'", str7, "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            org.mozilla.javascript.EvaluatorException evaluatorException10 = mojoErrorReporter2.runtimeError("org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.OptimizationException: ", 0, "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException1 = new com.github.mcheely.maven.requirejs.OptimizationException("hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("");
        java.io.File file2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo" };
        org.mozilla.javascript.ErrorReporter errorReporter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus11 = nodeJsRunner1.exec(file2, strArray9, errorReporter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException1 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.OptimizationException: ");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log3 = optimizeMojo2.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo4 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log5 = optimizeMojo4.getLog();
        optimizeMojo2.setLog(log5);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo7 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log8 = optimizeMojo7.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo9 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log10 = optimizeMojo9.getLog();
        optimizeMojo7.setLog(log10);
        optimizeMojo2.setLog(log10);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter14 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log10, true);
        optimizeMojo0.setLog(log10);
        java.util.Map map16 = optimizeMojo0.getPluginContext();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNull(map16);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.warning("org.apache.maven.plugin.Mojo", "", (int) (byte) -1, "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.OptimizationException: ", (int) '#', "hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException4 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException6 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException5);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException7 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("hi!", (java.lang.Throwable) optimizationException6);
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rhinoRunnerException7.addSuppressed(throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException1 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log3 = optimizeMojo2.getLog();
        optimizeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter7 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log5, false);
        mojoErrorReporter7.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "", (int) (byte) 1, "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (int) (short) 10);
        int int14 = mojoErrorReporter7.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            org.mozilla.javascript.EvaluatorException evaluatorException20 = mojoErrorReporter7.runtimeError("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", (int) (short) 100, "org.apache.maven.plugin.Mojo", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mozilla.javascript.EvaluatorException; message: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi! (com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo#100)");
        } catch (org.mozilla.javascript.EvaluatorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
        java.io.File file2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map9 = optimizeMojo8.getPluginContext();
        java.util.Map map10 = optimizeMojo8.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo11 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log12 = optimizeMojo11.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo13 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log14 = optimizeMojo13.getLog();
        optimizeMojo11.setLog(log14);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo16 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo16.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo18 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log19 = optimizeMojo18.getLog();
        optimizeMojo16.setLog(log19);
        optimizeMojo11.setLog(log19);
        optimizeMojo8.setLog(log19);
        java.util.Map map23 = optimizeMojo8.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo24 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log25 = optimizeMojo24.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo26 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log27 = optimizeMojo26.getLog();
        optimizeMojo24.setLog(log27);
        org.apache.maven.plugin.logging.Log log29 = optimizeMojo24.getLog();
        optimizeMojo8.setLog(log29);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter32 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log29, true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus33 = nodeJsRunner1.exec(file2, strArray7, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNotNull(log29);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (byte) 100);
        boolean boolean3 = exitStatus0.success();
        exitStatus0.setExitCode(1);
        boolean boolean6 = exitStatus0.success();
        exitStatus0.setExitCode(1);
        exitStatus0.setExitCode((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        java.util.Map map15 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo16 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo16.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo18 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log19 = optimizeMojo18.getLog();
        optimizeMojo16.setLog(log19);
        org.apache.maven.plugin.logging.Log log21 = optimizeMojo16.getLog();
        optimizeMojo0.setLog(log21);
        java.util.Map map23 = optimizeMojo0.getPluginContext();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNull(map23);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "org.apache.maven.plugin.Mojo", "hi!" };
        org.apache.maven.plugin.logging.Log log6 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter8 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log6, false);
        int int9 = mojoErrorReporter8.getWarningCnt();
        mojoErrorReporter8.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter8.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        int int18 = mojoErrorReporter8.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus19 = rhinoRunner0.exec(file1, strArray5, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("");
        java.lang.Class<?> wildcardClass2 = nodeJsRunner1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        int int5 = mojoErrorReporter2.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "hi!", (int) (short) -1, "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "hi!", (int) (short) 10, "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        // The following exception was thrown during execution in test generation
        try {
            org.mozilla.javascript.EvaluatorException evaluatorException8 = mojoErrorReporter2.runtimeError("com.github.mcheely.maven.requirejs.OptimizationException: ", "", (int) (byte) 0, "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        int int5 = mojoErrorReporter2.getErrorCnt();
        int int6 = mojoErrorReporter2.getWarningCnt();
        java.lang.Class<?> wildcardClass7 = mojoErrorReporter2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.OptimizationException: ");
        java.io.File file2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "com.github.mcheely.maven.requirejs.OptimizationException: ", "", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map9 = optimizeMojo8.getPluginContext();
        java.util.Map map10 = optimizeMojo8.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo11 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log12 = optimizeMojo11.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo13 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log14 = optimizeMojo13.getLog();
        optimizeMojo11.setLog(log14);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo16 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo16.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo18 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log19 = optimizeMojo18.getLog();
        optimizeMojo16.setLog(log19);
        optimizeMojo11.setLog(log19);
        optimizeMojo8.setLog(log19);
        java.util.Map map23 = optimizeMojo8.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo24 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log25 = optimizeMojo24.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo26 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log27 = optimizeMojo26.getLog();
        optimizeMojo24.setLog(log27);
        org.apache.maven.plugin.logging.Log log29 = optimizeMojo24.getLog();
        optimizeMojo8.setLog(log29);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter32 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log29, true);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter34 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log29, true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus35 = nodeJsRunner1.exec(file2, strArray7, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(map23);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNotNull(log29);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.OptimizationException: ");
        java.io.File file2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: " };
        org.apache.maven.plugin.logging.Log log6 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter8 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log6, true);
        int int9 = mojoErrorReporter8.getWarningCnt();
        int int10 = mojoErrorReporter8.getErrorCnt();
        int int11 = mojoErrorReporter8.getErrorCnt();
        int int12 = mojoErrorReporter8.getErrorCnt();
        int int13 = mojoErrorReporter8.getErrorCnt();
        mojoErrorReporter8.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus16 = nodeJsRunner1.exec(file2, strArray5, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map3 = optimizeMojo2.getPluginContext();
        java.util.Map map4 = optimizeMojo2.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo7 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log8 = optimizeMojo7.getLog();
        optimizeMojo5.setLog(log8);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo12 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log13 = optimizeMojo12.getLog();
        optimizeMojo10.setLog(log13);
        optimizeMojo5.setLog(log13);
        optimizeMojo2.setLog(log13);
        java.util.Map map17 = optimizeMojo2.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo18 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log19 = optimizeMojo18.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo20 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log21 = optimizeMojo20.getLog();
        optimizeMojo18.setLog(log21);
        org.apache.maven.plugin.logging.Log log23 = optimizeMojo18.getLog();
        optimizeMojo2.setLog(log23);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter26 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log23, true);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter28 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log23, true);
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner29 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter28, (com.github.mcheely.maven.requirejs.Runner) rhinoRunner29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNotNull(log23);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        int int5 = mojoErrorReporter2.getErrorCnt();
        int int6 = mojoErrorReporter2.getErrorCnt();
        int int7 = mojoErrorReporter2.getErrorCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
        int int10 = mojoErrorReporter2.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", (int) 'a', "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException4 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException6 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException5);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException7 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("hi!", (java.lang.Throwable) optimizationException6);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException11 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException12 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("org.apache.maven.plugin.Mojo", (java.lang.Throwable) rhinoRunnerException11);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException13 = new com.github.mcheely.maven.requirejs.OptimizationException("", (java.lang.Throwable) rhinoRunnerException12);
        optimizationException6.addSuppressed((java.lang.Throwable) rhinoRunnerException12);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: " };
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter8 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log6, true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus9 = nodeJsRunner1.exec(file2, strArray4, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(log6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException1 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
        java.lang.String str2 = optimizationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: " + "'", str2, "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo9 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log10 = optimizeMojo9.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo11 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log12 = optimizeMojo11.getLog();
        optimizeMojo9.setLog(log12);
        org.apache.maven.plugin.logging.Log log14 = optimizeMojo9.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter16 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log14, false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus17 = rhinoRunner0.exec(file1, strArray8, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.lang.Throwable throwable1 = null;
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException2 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.OptimizationException: ", throwable1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.apache.maven.plugin.logging.Log log2 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter4 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log2, false);
        int int5 = mojoErrorReporter4.getWarningCnt();
        mojoErrorReporter4.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter4.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        mojoErrorReporter4.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner17 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter4, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter2.setDefaultFileName("");
        // The following exception was thrown during execution in test generation
        try {
            org.mozilla.javascript.EvaluatorException evaluatorException12 = mojoErrorReporter2.runtimeError("hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (-1), "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("org.apache.maven.plugin.Mojo");
        java.io.File file2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo7 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map8 = optimizeMojo7.getPluginContext();
        java.util.Map map9 = optimizeMojo7.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo12 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log13 = optimizeMojo12.getLog();
        optimizeMojo10.setLog(log13);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo15 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log16 = optimizeMojo15.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo17 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log18 = optimizeMojo17.getLog();
        optimizeMojo15.setLog(log18);
        optimizeMojo10.setLog(log18);
        optimizeMojo7.setLog(log18);
        java.util.Map map22 = optimizeMojo7.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo23 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log24 = optimizeMojo23.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo25 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log26 = optimizeMojo25.getLog();
        optimizeMojo23.setLog(log26);
        org.apache.maven.plugin.logging.Log log28 = optimizeMojo23.getLog();
        optimizeMojo7.setLog(log28);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter31 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log28, true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus32 = nodeJsRunner1.exec(file2, strArray6, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNull(map22);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(log26);
        org.junit.Assert.assertNotNull(log28);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException1 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("org.apache.maven.plugin.Mojo");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        int int6 = mojoErrorReporter2.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("", "hi!", (int) (short) 100, "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
        java.io.File file2 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: " };
        org.apache.maven.plugin.logging.Log log8 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter10 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log8, true);
        mojoErrorReporter10.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        int int13 = mojoErrorReporter10.getErrorCnt();
        int int14 = mojoErrorReporter10.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus15 = nodeJsRunner1.exec(file2, strArray7, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (byte) 100);
        boolean boolean3 = exitStatus0.success();
        exitStatus0.setExitCode(1);
        int int6 = exitStatus0.getExitCode();
        exitStatus0.setExitCode((-1));
        java.lang.Class<?> wildcardClass9 = exitStatus0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray3 = new java.lang.String[] {};
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo4 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log5 = optimizeMojo4.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter7 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log5, true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus8 = nodeJsRunner1.exec(file2, strArray3, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log3 = optimizeMojo2.getLog();
        optimizeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter7 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log5, false);
        mojoErrorReporter7.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "", (int) (byte) 1, "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (int) (short) 10);
        int int14 = mojoErrorReporter7.getWarningCnt();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log3 = optimizeMojo2.getLog();
        optimizeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo6 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map7 = optimizeMojo6.getPluginContext();
        java.util.Map map8 = optimizeMojo6.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo9 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log10 = optimizeMojo9.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo11 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log12 = optimizeMojo11.getLog();
        optimizeMojo9.setLog(log12);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo14 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log15 = optimizeMojo14.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo16 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo16.getLog();
        optimizeMojo14.setLog(log17);
        optimizeMojo9.setLog(log17);
        optimizeMojo6.setLog(log17);
        java.util.Map map21 = optimizeMojo6.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo22 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log23 = optimizeMojo22.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo24 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log25 = optimizeMojo24.getLog();
        optimizeMojo22.setLog(log25);
        org.apache.maven.plugin.logging.Log log27 = optimizeMojo22.getLog();
        optimizeMojo6.setLog(log27);
        optimizeMojo0.setLog(log27);
        java.lang.Class<?> wildcardClass30 = optimizeMojo0.getClass();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNull(map7);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNotNull(log10);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (byte) 100);
        boolean boolean3 = exitStatus0.success();
        exitStatus0.setExitCode(1);
        int int6 = exitStatus0.getExitCode();
        exitStatus0.setExitCode((-1));
        boolean boolean9 = exitStatus0.success();
        int int10 = exitStatus0.getExitCode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.maven.plugin.logging.Log log4 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter6 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log4, false);
        int int7 = mojoErrorReporter6.getWarningCnt();
        mojoErrorReporter6.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter6.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        mojoErrorReporter6.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter6.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus20 = nodeJsRunner1.exec(file2, strArray3, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException3 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException8 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException9 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException8);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException10 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("", (java.lang.Throwable) optimizationException8);
        optimizationException3.addSuppressed((java.lang.Throwable) rhinoRunnerException10);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException12 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException10);
        java.lang.String str13 = optimizationException12.toString();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" + "'", str13, "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        // The following exception was thrown during execution in test generation
        try {
            org.mozilla.javascript.EvaluatorException evaluatorException11 = mojoErrorReporter2.runtimeError("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "", 10, "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, true);
        mojoErrorReporter5.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo");
        int int8 = mojoErrorReporter5.getWarningCnt();
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner10 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map4 = optimizeMojo3.getPluginContext();
        java.util.Map map5 = optimizeMojo3.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo6 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log7 = optimizeMojo6.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        optimizeMojo6.setLog(log9);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo11 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log12 = optimizeMojo11.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo13 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log14 = optimizeMojo13.getLog();
        optimizeMojo11.setLog(log14);
        optimizeMojo6.setLog(log14);
        optimizeMojo3.setLog(log14);
        java.util.Map map18 = optimizeMojo3.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo19 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log20 = optimizeMojo19.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo21 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log22 = optimizeMojo21.getLog();
        optimizeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = optimizeMojo19.getLog();
        optimizeMojo3.setLog(log24);
        optimizeMojo0.setLog(log24);
        org.apache.maven.plugin.logging.Log log27 = optimizeMojo0.getLog();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNotNull(log27);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException3 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException8 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException9 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException8);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException10 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("", (java.lang.Throwable) optimizationException8);
        optimizationException3.addSuppressed((java.lang.Throwable) rhinoRunnerException10);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException12 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (java.lang.Throwable) optimizationException3);
        java.lang.Class<?> wildcardClass13 = optimizationException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray6 = rhinoRunnerException5.getSuppressed();
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException7 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException5);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException8 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException7);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException9 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException8);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException10 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException8);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        java.util.Map map15 = optimizeMojo0.getPluginContext();
        java.util.Map map16 = null;
        optimizeMojo0.setPluginContext(map16);
        org.apache.maven.plugin.logging.Log log18 = optimizeMojo0.getLog();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(log18);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException4 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException6 = new com.github.mcheely.maven.requirejs.OptimizationException("hi!", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException7 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.OptimizationException: ");
        java.io.File file2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "hi!" };
        org.apache.maven.plugin.logging.Log log10 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter12 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log10, true);
        int int13 = mojoErrorReporter12.getWarningCnt();
        int int14 = mojoErrorReporter12.getErrorCnt();
        int int15 = mojoErrorReporter12.getErrorCnt();
        int int16 = mojoErrorReporter12.getErrorCnt();
        int int17 = mojoErrorReporter12.getErrorCnt();
        int int18 = mojoErrorReporter12.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus19 = nodeJsRunner1.exec(file2, strArray9, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter3 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log1, true);
        // The following exception was thrown during execution in test generation
        try {
            org.mozilla.javascript.EvaluatorException evaluatorException9 = mojoErrorReporter3.runtimeError("", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 0, "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.mozilla.javascript.EvaluatorException; message: ");
        } catch (org.mozilla.javascript.EvaluatorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException4 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException9 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException10 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException9);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException11 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("", (java.lang.Throwable) optimizationException9);
        optimizationException4.addSuppressed((java.lang.Throwable) rhinoRunnerException11);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException13 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException14 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        java.lang.Throwable[] throwableArray15 = optimizationException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException4 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException6 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException7 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("org.apache.maven.plugin.Mojo", (java.lang.Throwable) rhinoRunnerException6);
        java.lang.Class<?> wildcardClass8 = rhinoRunnerException7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode(0);
        boolean boolean3 = exitStatus0.success();
        exitStatus0.setExitCode((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo7 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log8 = optimizeMojo7.getLog();
        optimizeMojo5.setLog(log8);
        org.apache.maven.plugin.logging.Log log10 = optimizeMojo5.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter12 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log10, false);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus13 = nodeJsRunner1.exec(file2, strArray4, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (byte) 100);
        boolean boolean3 = exitStatus0.success();
        exitStatus0.setExitCode(1);
        int int6 = exitStatus0.getExitCode();
        exitStatus0.setExitCode((int) (short) 100);
        exitStatus0.setExitCode((int) (short) 1);
        int int11 = exitStatus0.getExitCode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        int int5 = mojoErrorReporter2.getErrorCnt();
        int int6 = mojoErrorReporter2.getErrorCnt();
        int int7 = mojoErrorReporter2.getErrorCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.warning("hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", 32, "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (int) (byte) -1, "org.apache.maven.plugin.Mojo", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log3 = optimizeMojo2.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo4 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log5 = optimizeMojo4.getLog();
        optimizeMojo2.setLog(log5);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo7 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log8 = optimizeMojo7.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo9 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log10 = optimizeMojo9.getLog();
        optimizeMojo7.setLog(log10);
        optimizeMojo2.setLog(log10);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter14 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log10, true);
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner16 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.OptimizationException: ");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter14, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.apache.maven.plugin.logging.Log log2 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter4 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log2, false);
        int int5 = mojoErrorReporter4.getWarningCnt();
        mojoErrorReporter4.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        int int8 = mojoErrorReporter4.getWarningCnt();
        com.github.mcheely.maven.requirejs.Runner runner9 = null;
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter4, runner9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map4 = optimizeMojo3.getPluginContext();
        java.util.Map map5 = optimizeMojo3.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo6 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log7 = optimizeMojo6.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        optimizeMojo6.setLog(log9);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo11 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log12 = optimizeMojo11.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo13 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log14 = optimizeMojo13.getLog();
        optimizeMojo11.setLog(log14);
        optimizeMojo6.setLog(log14);
        optimizeMojo3.setLog(log14);
        java.util.Map map18 = optimizeMojo3.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo19 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log20 = optimizeMojo19.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo21 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log22 = optimizeMojo21.getLog();
        optimizeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = optimizeMojo19.getLog();
        optimizeMojo3.setLog(log24);
        optimizeMojo0.setLog(log24);
        org.apache.maven.plugin.logging.Log log27 = null;
        optimizeMojo0.setLog(log27);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNotNull(log24);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException1 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray2 = rhinoRunnerException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        org.apache.maven.plugin.logging.Log log15 = optimizeMojo0.getLog();
        java.util.Map map16 = optimizeMojo0.getPluginContext();
        java.util.Map map17 = null;
        optimizeMojo0.setPluginContext(map17);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo19 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log20 = optimizeMojo19.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo21 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log22 = optimizeMojo21.getLog();
        optimizeMojo19.setLog(log22);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo24 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log25 = optimizeMojo24.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo26 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log27 = optimizeMojo26.getLog();
        optimizeMojo24.setLog(log27);
        optimizeMojo19.setLog(log27);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter31 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log27, true);
        optimizeMojo0.setLog(log27);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log27);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo7 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map8 = optimizeMojo7.getPluginContext();
        java.util.Map map9 = optimizeMojo7.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo12 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log13 = optimizeMojo12.getLog();
        optimizeMojo10.setLog(log13);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo15 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log16 = optimizeMojo15.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo17 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log18 = optimizeMojo17.getLog();
        optimizeMojo15.setLog(log18);
        optimizeMojo10.setLog(log18);
        optimizeMojo7.setLog(log18);
        org.apache.maven.plugin.logging.Log log22 = optimizeMojo7.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter24 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log22, true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus25 = nodeJsRunner1.exec(file2, strArray6, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(map8);
        org.junit.Assert.assertNull(map9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNotNull(log22);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException3 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        java.lang.Class<?> wildcardClass6 = optimizationException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, true);
        int int6 = mojoErrorReporter5.getWarningCnt();
        int int7 = mojoErrorReporter5.getErrorCnt();
        mojoErrorReporter5.setDefaultFileName("hi!");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner11 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "hi!", 0, "", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (int) ' ', "", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter2.setDefaultFileName("");
        mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (int) (byte) 100, "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        mojoErrorReporter2.setDefaultFileName("");
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (int) (short) 100, "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (short) 100);
        int int3 = exitStatus0.getExitCode();
        exitStatus0.setExitCode((int) '#');
        int int6 = exitStatus0.getExitCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log3 = optimizeMojo2.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo4 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log5 = optimizeMojo4.getLog();
        optimizeMojo2.setLog(log5);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo7 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log8 = optimizeMojo7.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo9 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log10 = optimizeMojo9.getLog();
        optimizeMojo7.setLog(log10);
        optimizeMojo2.setLog(log10);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter14 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log10, true);
        optimizeMojo0.setLog(log10);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter17 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log10, true);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter19 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log10, false);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        org.apache.maven.plugin.logging.Log log7 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter9 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log7, true);
        int int10 = mojoErrorReporter9.getWarningCnt();
        int int11 = mojoErrorReporter9.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus12 = rhinoRunner0.exec(file1, strArray6, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (byte) 100);
        boolean boolean3 = exitStatus0.success();
        exitStatus0.setExitCode((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        mojoErrorReporter2.setDefaultFileName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.warning("org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (int) (short) -1, "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        int int16 = mojoErrorReporter2.getWarningCnt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map4 = optimizeMojo3.getPluginContext();
        java.util.Map map5 = optimizeMojo3.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo6 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log7 = optimizeMojo6.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        optimizeMojo6.setLog(log9);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo11 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log12 = optimizeMojo11.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo13 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log14 = optimizeMojo13.getLog();
        optimizeMojo11.setLog(log14);
        optimizeMojo6.setLog(log14);
        optimizeMojo3.setLog(log14);
        java.util.Map map18 = optimizeMojo3.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo19 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log20 = optimizeMojo19.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo21 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log22 = optimizeMojo21.getLog();
        optimizeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = optimizeMojo19.getLog();
        optimizeMojo3.setLog(log24);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter27 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log24, true);
        mojoErrorReporter27.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", 0, "org.apache.maven.plugin.Mojo", 10);
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner35 = new com.github.mcheely.maven.requirejs.NodeJsRunner("org.apache.maven.plugin.Mojo");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter27, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNotNull(log24);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        java.util.Map map15 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo16 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo16.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo18 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log19 = optimizeMojo18.getLog();
        optimizeMojo16.setLog(log19);
        org.apache.maven.plugin.logging.Log log21 = optimizeMojo16.getLog();
        optimizeMojo0.setLog(log21);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter24 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log21, true);
        int int25 = mojoErrorReporter24.getErrorCnt();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map3 = optimizeMojo2.getPluginContext();
        java.util.Map map4 = optimizeMojo2.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo7 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log8 = optimizeMojo7.getLog();
        optimizeMojo5.setLog(log8);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo12 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log13 = optimizeMojo12.getLog();
        optimizeMojo10.setLog(log13);
        optimizeMojo5.setLog(log13);
        optimizeMojo2.setLog(log13);
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo2.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter19 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log17, true);
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner21 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter19, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log17);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("", "org.apache.maven.plugin.Mojo", (int) (byte) -1, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("org.apache.maven.plugin.Mojo");
        java.io.File file2 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo" };
        org.apache.maven.plugin.logging.Log log6 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter8 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log6, true);
        mojoErrorReporter8.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus11 = nodeJsRunner1.exec(file2, strArray5, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException4 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException6 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException5);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException7 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", (java.lang.Throwable) rhinoRunnerException5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException4 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException6 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException7 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("org.apache.maven.plugin.Mojo", (java.lang.Throwable) rhinoRunnerException6);
        java.lang.Class<?> wildcardClass8 = rhinoRunnerException6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException3 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("", (java.lang.Throwable) optimizationException3);
        java.lang.Throwable[] throwableArray6 = optimizationException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException5 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException6 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException5);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException7 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException6);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException8 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("hi!", (java.lang.Throwable) optimizationException7);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException9 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException7);
        java.lang.Class<?> wildcardClass10 = optimizationException7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException2 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray3 = rhinoRunnerException2.getSuppressed();
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException4 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException2);
        java.lang.Throwable throwable6 = null;
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException7 = new com.github.mcheely.maven.requirejs.OptimizationException("", throwable6);
        rhinoRunnerException2.addSuppressed((java.lang.Throwable) optimizationException7);
        java.lang.Throwable[] throwableArray9 = rhinoRunnerException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.apache.maven.plugin.logging.Log log2 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter4 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log2, false);
        int int5 = mojoErrorReporter4.getWarningCnt();
        mojoErrorReporter4.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter4.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        int int14 = mojoErrorReporter4.getWarningCnt();
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner16 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.OptimizationException: ");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter4, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        java.util.Map map15 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo16 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo16.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo18 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log19 = optimizeMojo18.getLog();
        optimizeMojo16.setLog(log19);
        org.apache.maven.plugin.logging.Log log21 = optimizeMojo16.getLog();
        optimizeMojo0.setLog(log21);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter24 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log21, true);
        // The following exception was thrown during execution in test generation
        try {
            org.mozilla.javascript.EvaluatorException evaluatorException30 = mojoErrorReporter24.runtimeError("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.OptimizationException: ", 10, "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.mozilla.javascript.EvaluatorException; message: com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi! (com.github.mcheely.maven.requirejs.OptimizationException: #10)");
        } catch (org.mozilla.javascript.EvaluatorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log21);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException5 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException6 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException5);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException7 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException6);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException8 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("hi!", (java.lang.Throwable) optimizationException7);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException9 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map4 = optimizeMojo3.getPluginContext();
        java.util.Map map5 = optimizeMojo3.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo6 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log7 = optimizeMojo6.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        optimizeMojo6.setLog(log9);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo11 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log12 = optimizeMojo11.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo13 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log14 = optimizeMojo13.getLog();
        optimizeMojo11.setLog(log14);
        optimizeMojo6.setLog(log14);
        optimizeMojo3.setLog(log14);
        java.util.Map map18 = optimizeMojo3.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo19 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log20 = optimizeMojo19.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo21 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log22 = optimizeMojo21.getLog();
        optimizeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = optimizeMojo19.getLog();
        optimizeMojo3.setLog(log24);
        optimizeMojo0.setLog(log24);
        java.util.Map map27 = null;
        optimizeMojo0.setPluginContext(map27);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNotNull(log24);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        int int5 = mojoErrorReporter2.getWarningCnt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException2 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException3 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException2);
        java.lang.Throwable[] throwableArray4 = rhinoRunnerException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = rhinoRunnerException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException3 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        java.lang.Throwable[] throwableArray6 = rhinoRunnerException5.getSuppressed();
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException12 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException13 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException12);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException14 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException13);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException15 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("hi!", (java.lang.Throwable) optimizationException14);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException16 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException14);
        rhinoRunnerException5.addSuppressed((java.lang.Throwable) optimizationException16);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException2 = new com.github.mcheely.maven.requirejs.OptimizationException("");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException3 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException2);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException8 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray9 = rhinoRunnerException8.getSuppressed();
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException10 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException8);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException11 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException10);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException12 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException11);
        rhinoRunnerException3.addSuppressed((java.lang.Throwable) rhinoRunnerException11);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException3 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        java.lang.Throwable[] throwableArray6 = rhinoRunnerException5.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) ' ');
        int int3 = exitStatus0.getExitCode();
        boolean boolean4 = exitStatus0.success();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException1 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray2 = rhinoRunnerException1.getSuppressed();
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException4 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        rhinoRunnerException1.addSuppressed((java.lang.Throwable) optimizationException4);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.apache.maven.plugin.logging.Log log2 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter4 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log2, false);
        int int5 = mojoErrorReporter4.getWarningCnt();
        mojoErrorReporter4.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter4.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        int int14 = mojoErrorReporter4.getWarningCnt();
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner16 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter4, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException2 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException7 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException8 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException7);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException9 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (java.lang.Throwable) optimizationException7);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException10 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("", (java.lang.Throwable) optimizationException9);
        optimizationException2.addSuppressed((java.lang.Throwable) rhinoRunnerException10);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException12 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException2);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException1 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo");
        java.lang.Class<?> wildcardClass2 = rhinoRunnerException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) ' ');
        boolean boolean3 = exitStatus0.success();
        int int4 = exitStatus0.getExitCode();
        exitStatus0.setExitCode(0);
        boolean boolean7 = exitStatus0.success();
        boolean boolean8 = exitStatus0.success();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (byte) 100);
        boolean boolean3 = exitStatus0.success();
        exitStatus0.setExitCode(1);
        boolean boolean6 = exitStatus0.success();
        boolean boolean7 = exitStatus0.success();
        int int8 = exitStatus0.getExitCode();
        int int9 = exitStatus0.getExitCode();
        boolean boolean10 = exitStatus0.success();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (short) 100);
        exitStatus0.setExitCode(10);
        int int5 = exitStatus0.getExitCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode(0);
        boolean boolean3 = exitStatus0.success();
        int int4 = exitStatus0.getExitCode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException3 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray4 = rhinoRunnerException3.getSuppressed();
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException5 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException3);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException6 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException5);
        java.lang.Throwable[] throwableArray7 = rhinoRunnerException6.getSuppressed();
        java.lang.String str8 = rhinoRunnerException6.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" + "'", str8, "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (int) '4', "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 0, "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", (int) 'a');
        mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "", 0, "hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException4 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException9 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException10 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException9);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException11 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("", (java.lang.Throwable) optimizationException9);
        optimizationException4.addSuppressed((java.lang.Throwable) rhinoRunnerException11);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException13 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException14 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (java.lang.Throwable) rhinoRunnerException13);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException5 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException6 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException5);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException7 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException6);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException8 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("hi!", (java.lang.Throwable) optimizationException7);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException9 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException7);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException13 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException14 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException13);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException15 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (java.lang.Throwable) optimizationException13);
        java.lang.Throwable[] throwableArray16 = optimizationException13.getSuppressed();
        java.lang.Throwable[] throwableArray17 = optimizationException13.getSuppressed();
        optimizationException7.addSuppressed((java.lang.Throwable) optimizationException13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException2 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException3 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException2);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException6 = new com.github.mcheely.maven.requirejs.OptimizationException("");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException7 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException6);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException12 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray13 = rhinoRunnerException12.getSuppressed();
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException14 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException12);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException15 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException14);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException16 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException15);
        optimizationException6.addSuppressed((java.lang.Throwable) optimizationException16);
        optimizationException2.addSuppressed((java.lang.Throwable) optimizationException6);
        java.lang.String str19 = optimizationException2.toString();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" + "'", str19, "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        java.util.Map map15 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo16 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo16.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo18 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log19 = optimizeMojo18.getLog();
        optimizeMojo16.setLog(log19);
        org.apache.maven.plugin.logging.Log log21 = optimizeMojo16.getLog();
        optimizeMojo0.setLog(log21);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo23 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map24 = optimizeMojo23.getPluginContext();
        java.util.Map map25 = optimizeMojo23.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo26 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map27 = optimizeMojo26.getPluginContext();
        java.util.Map map28 = optimizeMojo26.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo29 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log30 = optimizeMojo29.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo31 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log32 = optimizeMojo31.getLog();
        optimizeMojo29.setLog(log32);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo34 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log35 = optimizeMojo34.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo36 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log37 = optimizeMojo36.getLog();
        optimizeMojo34.setLog(log37);
        optimizeMojo29.setLog(log37);
        optimizeMojo26.setLog(log37);
        java.util.Map map41 = optimizeMojo26.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo42 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log43 = optimizeMojo42.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo44 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log45 = optimizeMojo44.getLog();
        optimizeMojo42.setLog(log45);
        org.apache.maven.plugin.logging.Log log47 = optimizeMojo42.getLog();
        optimizeMojo26.setLog(log47);
        optimizeMojo23.setLog(log47);
        optimizeMojo0.setLog(log47);
        java.util.Map map51 = null;
        optimizeMojo0.setPluginContext(map51);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNull(map27);
        org.junit.Assert.assertNull(map28);
        org.junit.Assert.assertNotNull(log30);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertNotNull(log35);
        org.junit.Assert.assertNotNull(log37);
        org.junit.Assert.assertNull(map41);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertNotNull(log45);
        org.junit.Assert.assertNotNull(log47);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log3 = optimizeMojo2.getLog();
        optimizeMojo0.setLog(log3);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo7 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log8 = optimizeMojo7.getLog();
        optimizeMojo5.setLog(log8);
        optimizeMojo0.setLog(log8);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter12 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log8, true);
        java.lang.Class<?> wildcardClass13 = mojoErrorReporter12.getClass();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, false);
        int int6 = mojoErrorReporter5.getWarningCnt();
        mojoErrorReporter5.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter5.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner16 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException3 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException5 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException4);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException11 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException12 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException11);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException13 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException12);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException14 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("hi!", (java.lang.Throwable) optimizationException13);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException15 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException13);
        optimizationException5.addSuppressed((java.lang.Throwable) optimizationException15);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        org.apache.maven.plugin.logging.Log log15 = optimizeMojo0.getLog();
        java.util.Map map16 = null;
        optimizeMojo0.setPluginContext(map16);
        org.apache.maven.plugin.logging.Log log18 = optimizeMojo0.getLog();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log18);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException1 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
        java.lang.String str2 = optimizationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: " + "'", str2, "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("org.apache.maven.plugin.Mojo");
        java.io.File file2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.OptimizationException: " };
        org.mozilla.javascript.ErrorReporter errorReporter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus10 = nodeJsRunner1.exec(file2, strArray8, errorReporter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, true);
        int int6 = mojoErrorReporter5.getWarningCnt();
        int int7 = mojoErrorReporter5.getErrorCnt();
        int int8 = mojoErrorReporter5.getErrorCnt();
        int int9 = mojoErrorReporter5.getErrorCnt();
        int int10 = mojoErrorReporter5.getErrorCnt();
        int int11 = mojoErrorReporter5.getWarningCnt();
        int int12 = mojoErrorReporter5.getWarningCnt();
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner14 = new com.github.mcheely.maven.requirejs.NodeJsRunner("hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException2 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException3 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException2);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException7 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException8 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException7);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException9 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("", (java.lang.Throwable) optimizationException7);
        optimizationException2.addSuppressed((java.lang.Throwable) rhinoRunnerException9);
        java.lang.Throwable[] throwableArray11 = optimizationException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter2.setDefaultFileName("");
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (int) (byte) -1, "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        org.apache.maven.plugin.logging.Log log4 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter6 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log4, true);
        int int7 = mojoErrorReporter6.getWarningCnt();
        int int8 = mojoErrorReporter6.getErrorCnt();
        int int9 = mojoErrorReporter6.getErrorCnt();
        int int10 = mojoErrorReporter6.getErrorCnt();
        int int11 = mojoErrorReporter6.getErrorCnt();
        mojoErrorReporter6.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
        int int14 = mojoErrorReporter6.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus15 = rhinoRunner0.exec(file1, strArray3, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map4 = optimizeMojo3.getPluginContext();
        java.util.Map map5 = optimizeMojo3.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo6 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log7 = optimizeMojo6.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        optimizeMojo6.setLog(log9);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo11 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log12 = optimizeMojo11.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo13 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log14 = optimizeMojo13.getLog();
        optimizeMojo11.setLog(log14);
        optimizeMojo6.setLog(log14);
        optimizeMojo3.setLog(log14);
        java.util.Map map18 = optimizeMojo3.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo19 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log20 = optimizeMojo19.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo21 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log22 = optimizeMojo21.getLog();
        optimizeMojo19.setLog(log22);
        org.apache.maven.plugin.logging.Log log24 = optimizeMojo19.getLog();
        optimizeMojo3.setLog(log24);
        optimizeMojo0.setLog(log24);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter28 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log24, true);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log22);
        org.junit.Assert.assertNotNull(log24);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo9 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map10 = optimizeMojo9.getPluginContext();
        java.util.Map map11 = optimizeMojo9.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo12 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log13 = optimizeMojo12.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo14 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log15 = optimizeMojo14.getLog();
        optimizeMojo12.setLog(log15);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo17 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log18 = optimizeMojo17.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo19 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log20 = optimizeMojo19.getLog();
        optimizeMojo17.setLog(log20);
        optimizeMojo12.setLog(log20);
        optimizeMojo9.setLog(log20);
        org.apache.maven.plugin.logging.Log log24 = optimizeMojo9.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter26 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log24, false);
        int int27 = mojoErrorReporter26.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus28 = rhinoRunner0.exec(file1, strArray8, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(map10);
        org.junit.Assert.assertNull(map11);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNotNull(log20);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        org.apache.maven.plugin.logging.Log log15 = optimizeMojo0.getLog();
        java.util.Map map16 = optimizeMojo0.getPluginContext();
        java.util.Map map17 = null;
        optimizeMojo0.setPluginContext(map17);
        java.util.Map map19 = null;
        optimizeMojo0.setPluginContext(map19);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(map16);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", "" };
        org.apache.maven.plugin.logging.Log log8 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter10 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log8, true);
        int int11 = mojoErrorReporter10.getWarningCnt();
        int int12 = mojoErrorReporter10.getErrorCnt();
        mojoErrorReporter10.setDefaultFileName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus15 = rhinoRunner0.exec(file1, strArray7, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException3 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException8 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException9 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException8);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException10 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("", (java.lang.Throwable) optimizationException8);
        optimizationException3.addSuppressed((java.lang.Throwable) rhinoRunnerException10);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException12 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (java.lang.Throwable) optimizationException3);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException17 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException18 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException17);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException22 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException23 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException22);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException24 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("", (java.lang.Throwable) optimizationException22);
        optimizationException17.addSuppressed((java.lang.Throwable) rhinoRunnerException24);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException26 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (java.lang.Throwable) optimizationException17);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException27 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException17);
        rhinoRunnerException12.addSuppressed((java.lang.Throwable) rhinoRunnerException27);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        org.apache.maven.plugin.logging.Log log10 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter12 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log10, true);
        int int13 = mojoErrorReporter12.getWarningCnt();
        int int14 = mojoErrorReporter12.getErrorCnt();
        int int15 = mojoErrorReporter12.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus16 = nodeJsRunner1.exec(file2, strArray9, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        org.apache.maven.plugin.logging.Log log6 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter8 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log6, true);
        int int9 = mojoErrorReporter8.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus10 = rhinoRunner0.exec(file1, strArray5, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        int int5 = mojoErrorReporter2.getErrorCnt();
        int int6 = mojoErrorReporter2.getWarningCnt();
        java.lang.Class<?> wildcardClass7 = mojoErrorReporter2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map3 = optimizeMojo2.getPluginContext();
        java.util.Map map4 = optimizeMojo2.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo7 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log8 = optimizeMojo7.getLog();
        optimizeMojo5.setLog(log8);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo12 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log13 = optimizeMojo12.getLog();
        optimizeMojo10.setLog(log13);
        optimizeMojo5.setLog(log13);
        optimizeMojo2.setLog(log13);
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo2.getLog();
        java.util.Map map18 = optimizeMojo2.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo19 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map20 = optimizeMojo19.getPluginContext();
        java.util.Map map21 = optimizeMojo19.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo22 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log23 = optimizeMojo22.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo24 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log25 = optimizeMojo24.getLog();
        optimizeMojo22.setLog(log25);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo27 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log28 = optimizeMojo27.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo29 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log30 = optimizeMojo29.getLog();
        optimizeMojo27.setLog(log30);
        optimizeMojo22.setLog(log30);
        optimizeMojo19.setLog(log30);
        org.apache.maven.plugin.logging.Log log34 = optimizeMojo19.getLog();
        optimizeMojo2.setLog(log34);
        optimizeMojo0.setLog(log34);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNull(map18);
        org.junit.Assert.assertNull(map20);
        org.junit.Assert.assertNull(map21);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(log25);
        org.junit.Assert.assertNotNull(log28);
        org.junit.Assert.assertNotNull(log30);
        org.junit.Assert.assertNotNull(log34);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.lang.Throwable throwable1 = null;
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException2 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("", throwable1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException3 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray4 = rhinoRunnerException3.getSuppressed();
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException5 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException3);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException6 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException3 = new com.github.mcheely.maven.requirejs.OptimizationException("");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException9 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray10 = rhinoRunnerException9.getSuppressed();
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException11 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException9);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException12 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException11);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException13 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException12);
        optimizationException3.addSuppressed((java.lang.Throwable) optimizationException13);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException15 = new com.github.mcheely.maven.requirejs.OptimizationException("", (java.lang.Throwable) optimizationException13);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "hi!", "com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        org.apache.maven.plugin.logging.Log log7 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter9 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log7, true);
        int int10 = mojoErrorReporter9.getErrorCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus11 = rhinoRunner0.exec(file1, strArray6, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) ' ');
        boolean boolean3 = exitStatus0.success();
        int int4 = exitStatus0.getExitCode();
        exitStatus0.setExitCode(0);
        boolean boolean7 = exitStatus0.success();
        exitStatus0.setExitCode((int) (byte) 1);
        int int10 = exitStatus0.getExitCode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException3 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException5 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (java.lang.Throwable) optimizationException3);
        java.lang.Throwable[] throwableArray6 = optimizationException3.getSuppressed();
        java.lang.Throwable[] throwableArray7 = optimizationException3.getSuppressed();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            optimizationException3.addSuppressed(throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException3 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray4 = rhinoRunnerException3.getSuppressed();
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException5 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException3);
        java.lang.Throwable throwable7 = null;
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException8 = new com.github.mcheely.maven.requirejs.OptimizationException("", throwable7);
        rhinoRunnerException3.addSuppressed((java.lang.Throwable) optimizationException8);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException10 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (java.lang.Throwable) optimizationException8);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException1 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray2 = rhinoRunnerException1.getSuppressed();
        java.lang.String str3 = rhinoRunnerException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" + "'", str3, "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log3 = optimizeMojo2.getLog();
        optimizeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter7 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log5, false);
        java.lang.Class<?> wildcardClass8 = log5.getClass();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        int int1 = exitStatus0.getExitCode();
        boolean boolean2 = exitStatus0.success();
        int int3 = exitStatus0.getExitCode();
        int int4 = exitStatus0.getExitCode();
        int int5 = exitStatus0.getExitCode();
        boolean boolean6 = exitStatus0.success();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: " };
        org.apache.maven.plugin.logging.Log log7 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter9 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log7, false);
        int int10 = mojoErrorReporter9.getWarningCnt();
        mojoErrorReporter9.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter9.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        mojoErrorReporter9.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus21 = nodeJsRunner1.exec(file2, strArray6, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter2.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        int int12 = mojoErrorReporter2.getWarningCnt();
        int int13 = mojoErrorReporter2.getWarningCnt();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        org.apache.maven.plugin.logging.Log log15 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter17 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log15, false);
        mojoErrorReporter17.warning("org.apache.maven.plugin.Mojo", "", (int) (byte) 100, "org.apache.maven.plugin.Mojo", (int) (byte) 1);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log15);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (byte) 100);
        boolean boolean3 = exitStatus0.success();
        exitStatus0.setExitCode(1);
        boolean boolean6 = exitStatus0.success();
        boolean boolean7 = exitStatus0.success();
        java.lang.Class<?> wildcardClass8 = exitStatus0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log2 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map4 = optimizeMojo3.getPluginContext();
        java.util.Map map5 = optimizeMojo3.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo6 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log7 = optimizeMojo6.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        optimizeMojo6.setLog(log9);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo11 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log12 = optimizeMojo11.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo13 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log14 = optimizeMojo13.getLog();
        optimizeMojo11.setLog(log14);
        optimizeMojo6.setLog(log14);
        optimizeMojo3.setLog(log14);
        org.apache.maven.plugin.logging.Log log18 = optimizeMojo3.getLog();
        optimizeMojo0.setLog(log18);
        java.util.Map map20 = optimizeMojo0.getPluginContext();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNull(map5);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log12);
        org.junit.Assert.assertNotNull(log14);
        org.junit.Assert.assertNotNull(log18);
        org.junit.Assert.assertNull(map20);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        org.apache.maven.plugin.logging.Log log15 = optimizeMojo0.getLog();
        java.util.Map map16 = optimizeMojo0.getPluginContext();
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo0.getLog();
        java.util.Map map18 = null;
        optimizeMojo0.setPluginContext(map18);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log15);
        org.junit.Assert.assertNull(map16);
        org.junit.Assert.assertNotNull(log17);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException3 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException4 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException3);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException4);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner1 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.io.File file2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "org.apache.maven.plugin.Mojo" };
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo7 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log8 = optimizeMojo7.getLog();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo7.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter11 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log9, true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus12 = nodeJsRunner1.exec(file2, strArray6, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log9);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (byte) 100);
        boolean boolean3 = exitStatus0.success();
        exitStatus0.setExitCode(1);
        boolean boolean6 = exitStatus0.success();
        boolean boolean7 = exitStatus0.success();
        exitStatus0.setExitCode((int) ' ');
        exitStatus0.setExitCode((-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "org.apache.maven.plugin.Mojo", "hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" };
        org.apache.maven.plugin.logging.Log log8 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter10 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log8, true);
        int int11 = mojoErrorReporter10.getWarningCnt();
        int int12 = mojoErrorReporter10.getErrorCnt();
        int int13 = mojoErrorReporter10.getErrorCnt();
        int int14 = mojoErrorReporter10.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus15 = rhinoRunner0.exec(file1, strArray7, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException3 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        java.lang.Throwable[] throwableArray4 = rhinoRunnerException3.getSuppressed();
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException5 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException3);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException6 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException3);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException10 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException11 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException10);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException12 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("", (java.lang.Throwable) optimizationException10);
        optimizationException6.addSuppressed((java.lang.Throwable) rhinoRunnerException12);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException1 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log3 = optimizeMojo2.getLog();
        optimizeMojo0.setLog(log3);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo7 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log8 = optimizeMojo7.getLog();
        optimizeMojo5.setLog(log8);
        optimizeMojo0.setLog(log8);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter12 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log8, true);
        mojoErrorReporter12.error("org.apache.maven.plugin.Mojo", "hi!", (int) (short) 0, "hi!", (int) (short) 100);
        mojoErrorReporter12.error("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", 0, "com.github.mcheely.maven.requirejs.OptimizationException: ", (int) (short) 100);
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, true);
        int int6 = mojoErrorReporter5.getWarningCnt();
        int int7 = mojoErrorReporter5.getErrorCnt();
        int int8 = mojoErrorReporter5.getErrorCnt();
        int int9 = mojoErrorReporter5.getErrorCnt();
        int int10 = mojoErrorReporter5.getErrorCnt();
        mojoErrorReporter5.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
        int int13 = mojoErrorReporter5.getWarningCnt();
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner15 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, false);
        int int6 = mojoErrorReporter5.getWarningCnt();
        mojoErrorReporter5.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter5.setDefaultFileName("");
        com.github.mcheely.maven.requirejs.Runner runner11 = null;
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5, runner11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, false);
        int int6 = mojoErrorReporter5.getWarningCnt();
        mojoErrorReporter5.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter5.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        int int15 = mojoErrorReporter5.getWarningCnt();
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner17 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException2 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException3 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (java.lang.Throwable) optimizationException2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.apache.maven.plugin.logging.Log log2 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter4 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log2, false);
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner6 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter4, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", "hi!" };
        org.mozilla.javascript.ErrorReporter errorReporter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus7 = rhinoRunner0.exec(file1, strArray5, errorReporter6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map3 = optimizeMojo2.getPluginContext();
        java.util.Map map4 = optimizeMojo2.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo7 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log8 = optimizeMojo7.getLog();
        optimizeMojo5.setLog(log8);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo12 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log13 = optimizeMojo12.getLog();
        optimizeMojo10.setLog(log13);
        optimizeMojo5.setLog(log13);
        optimizeMojo2.setLog(log13);
        java.util.Map map17 = optimizeMojo2.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo18 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log19 = optimizeMojo18.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo20 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log21 = optimizeMojo20.getLog();
        optimizeMojo18.setLog(log21);
        org.apache.maven.plugin.logging.Log log23 = optimizeMojo18.getLog();
        optimizeMojo2.setLog(log23);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter26 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log23, true);
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner28 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter26, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(map3);
        org.junit.Assert.assertNull(map4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log8);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(map17);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNotNull(log23);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.apache.maven.plugin.logging.Log log2 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter4 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log2, false);
        int int5 = mojoErrorReporter4.getWarningCnt();
        mojoErrorReporter4.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter4.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        int int14 = mojoErrorReporter4.getErrorCnt();
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner16 = new com.github.mcheely.maven.requirejs.NodeJsRunner("hi!");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter4, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        java.util.Map map15 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo16 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo16.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo18 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log19 = optimizeMojo18.getLog();
        optimizeMojo16.setLog(log19);
        org.apache.maven.plugin.logging.Log log21 = optimizeMojo16.getLog();
        optimizeMojo0.setLog(log21);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo23 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map24 = optimizeMojo23.getPluginContext();
        java.util.Map map25 = optimizeMojo23.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo26 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log27 = optimizeMojo26.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo28 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log29 = optimizeMojo28.getLog();
        optimizeMojo26.setLog(log29);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo31 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log32 = optimizeMojo31.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo33 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log34 = optimizeMojo33.getLog();
        optimizeMojo31.setLog(log34);
        optimizeMojo26.setLog(log34);
        optimizeMojo23.setLog(log34);
        java.util.Map map38 = optimizeMojo23.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo39 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map40 = optimizeMojo39.getPluginContext();
        java.util.Map map41 = optimizeMojo39.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo42 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log43 = optimizeMojo42.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo44 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log45 = optimizeMojo44.getLog();
        optimizeMojo42.setLog(log45);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo47 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log48 = optimizeMojo47.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo49 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log50 = optimizeMojo49.getLog();
        optimizeMojo47.setLog(log50);
        optimizeMojo42.setLog(log50);
        optimizeMojo39.setLog(log50);
        java.util.Map map54 = optimizeMojo39.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo55 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log56 = optimizeMojo55.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo57 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log58 = optimizeMojo57.getLog();
        optimizeMojo55.setLog(log58);
        org.apache.maven.plugin.logging.Log log60 = optimizeMojo55.getLog();
        optimizeMojo39.setLog(log60);
        optimizeMojo23.setLog(log60);
        optimizeMojo0.setLog(log60);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo64 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log65 = optimizeMojo64.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo66 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log67 = optimizeMojo66.getLog();
        optimizeMojo64.setLog(log67);
        optimizeMojo0.setLog(log67);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo70 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo71 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log72 = optimizeMojo71.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo73 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log74 = optimizeMojo73.getLog();
        optimizeMojo71.setLog(log74);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo76 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log77 = optimizeMojo76.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo78 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log79 = optimizeMojo78.getLog();
        optimizeMojo76.setLog(log79);
        optimizeMojo71.setLog(log79);
        optimizeMojo70.setLog(log79);
        java.util.Map map83 = null;
        optimizeMojo70.setPluginContext(map83);
        org.apache.maven.plugin.logging.Log log85 = optimizeMojo70.getLog();
        optimizeMojo0.setLog(log85);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNotNull(log29);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertNull(map38);
        org.junit.Assert.assertNull(map40);
        org.junit.Assert.assertNull(map41);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertNotNull(log45);
        org.junit.Assert.assertNotNull(log48);
        org.junit.Assert.assertNotNull(log50);
        org.junit.Assert.assertNull(map54);
        org.junit.Assert.assertNotNull(log56);
        org.junit.Assert.assertNotNull(log58);
        org.junit.Assert.assertNotNull(log60);
        org.junit.Assert.assertNotNull(log65);
        org.junit.Assert.assertNotNull(log67);
        org.junit.Assert.assertNotNull(log72);
        org.junit.Assert.assertNotNull(log74);
        org.junit.Assert.assertNotNull(log77);
        org.junit.Assert.assertNotNull(log79);
        org.junit.Assert.assertNotNull(log85);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException1 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo2.setLog(log11);
        optimizeMojo0.setLog(log11);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter17 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log11, false);
        int int18 = mojoErrorReporter17.getErrorCnt();
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException4 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        java.lang.Throwable[] throwableArray6 = rhinoRunnerException5.getSuppressed();
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException7 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.OptimizationException: ", (java.lang.Throwable) rhinoRunnerException5);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException8 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException5);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        // The following exception was thrown during execution in test generation
        try {
            org.mozilla.javascript.EvaluatorException evaluatorException9 = mojoErrorReporter2.runtimeError("com.github.mcheely.maven.requirejs.OptimizationException: ", "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (int) (byte) 0, "org.apache.maven.plugin.Mojo", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        java.io.File file2 = null;
        org.apache.maven.plugin.logging.Log log3 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter5 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log3, true);
        int int6 = mojoErrorReporter5.getWarningCnt();
        int int7 = mojoErrorReporter5.getErrorCnt();
        int int8 = mojoErrorReporter5.getErrorCnt();
        int int9 = mojoErrorReporter5.getErrorCnt();
        int int10 = mojoErrorReporter5.getErrorCnt();
        mojoErrorReporter5.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
        int int13 = mojoErrorReporter5.getWarningCnt();
        int int14 = mojoErrorReporter5.getWarningCnt();
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner16 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, file2, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter5, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, false);
        int int3 = mojoErrorReporter2.getWarningCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter2.setDefaultFileName("");
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "hi!", 35, "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        int int5 = mojoErrorReporter2.getErrorCnt();
        int int6 = mojoErrorReporter2.getErrorCnt();
        int int7 = mojoErrorReporter2.getErrorCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            mojoErrorReporter2.error("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (int) (byte) 0, "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (byte) 100);
        boolean boolean3 = exitStatus0.success();
        exitStatus0.setExitCode(1);
        int int6 = exitStatus0.getExitCode();
        exitStatus0.setExitCode((-1));
        boolean boolean9 = exitStatus0.success();
        exitStatus0.setExitCode((int) (short) 100);
        exitStatus0.setExitCode((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo2 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log3 = optimizeMojo2.getLog();
        optimizeMojo0.setLog(log3);
        org.apache.maven.plugin.logging.Log log5 = optimizeMojo0.getLog();
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter7 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log5, false);
        mojoErrorReporter7.error("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 0, "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", (-1));
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.lang.Throwable throwable1 = null;
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException2 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", throwable1);
        java.lang.Throwable[] throwableArray3 = optimizationException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException5 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException6 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException5);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException7 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) rhinoRunnerException6);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException8 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("hi!", (java.lang.Throwable) optimizationException7);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException9 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: org.apache.maven.plugin.Mojo", (java.lang.Throwable) optimizationException7);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        java.util.Map map15 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo16 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo16.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo18 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log19 = optimizeMojo18.getLog();
        optimizeMojo16.setLog(log19);
        org.apache.maven.plugin.logging.Log log21 = optimizeMojo16.getLog();
        optimizeMojo0.setLog(log21);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter24 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log21, true);
        mojoErrorReporter24.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", 0, "org.apache.maven.plugin.Mojo", 10);
        mojoErrorReporter24.error("", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 100, "com.github.mcheely.maven.requirejs.OptimizationException: ", (int) (byte) -1);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log21);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException4 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException5 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException6 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException4);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException7 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("org.apache.maven.plugin.Mojo", (java.lang.Throwable) rhinoRunnerException6);
        java.lang.Throwable[] throwableArray8 = rhinoRunnerException7.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo");
        int int5 = mojoErrorReporter2.getErrorCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo");
        int int5 = mojoErrorReporter2.getErrorCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.github.mcheely.maven.requirejs.ExitStatus exitStatus0 = new com.github.mcheely.maven.requirejs.ExitStatus();
        exitStatus0.setExitCode((int) (byte) 100);
        boolean boolean3 = exitStatus0.success();
        exitStatus0.setExitCode(1);
        int int6 = exitStatus0.getExitCode();
        exitStatus0.setExitCode((-1));
        int int9 = exitStatus0.getExitCode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException2 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException3 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", (java.lang.Throwable) rhinoRunnerException2);
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException8 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException9 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException8);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException10 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException8);
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException11 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("org.apache.maven.plugin.Mojo", (java.lang.Throwable) rhinoRunnerException10);
        optimizationException3.addSuppressed((java.lang.Throwable) rhinoRunnerException11);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        org.apache.maven.plugin.logging.Log log0 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter2 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log0, true);
        int int3 = mojoErrorReporter2.getWarningCnt();
        int int4 = mojoErrorReporter2.getErrorCnt();
        int int5 = mojoErrorReporter2.getErrorCnt();
        int int6 = mojoErrorReporter2.getErrorCnt();
        int int7 = mojoErrorReporter2.getErrorCnt();
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: ");
        mojoErrorReporter2.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException1 = new com.github.mcheely.maven.requirejs.OptimizationException("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        java.util.Map map15 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo16 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo16.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo18 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log19 = optimizeMojo18.getLog();
        optimizeMojo16.setLog(log19);
        org.apache.maven.plugin.logging.Log log21 = optimizeMojo16.getLog();
        optimizeMojo0.setLog(log21);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter24 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log21, true);
        mojoErrorReporter24.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: ", "com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", 0, "org.apache.maven.plugin.Mojo", 10);
        mojoErrorReporter24.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", 10, "hi!", 0);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log21);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.apache.maven.plugin.logging.Log log2 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter4 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log2, true);
        com.github.mcheely.maven.requirejs.NodeJsRunner nodeJsRunner6 = new com.github.mcheely.maven.requirejs.NodeJsRunner("com.github.mcheely.maven.requirejs.OptimizationException: ");
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter4, (com.github.mcheely.maven.requirejs.Runner) nodeJsRunner6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo3 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log4 = optimizeMojo3.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo5 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log6 = optimizeMojo5.getLog();
        optimizeMojo3.setLog(log6);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo8 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log9 = optimizeMojo8.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo10 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log11 = optimizeMojo10.getLog();
        optimizeMojo8.setLog(log11);
        optimizeMojo3.setLog(log11);
        optimizeMojo0.setLog(log11);
        java.util.Map map15 = optimizeMojo0.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo16 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log17 = optimizeMojo16.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo18 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log19 = optimizeMojo18.getLog();
        optimizeMojo16.setLog(log19);
        org.apache.maven.plugin.logging.Log log21 = optimizeMojo16.getLog();
        optimizeMojo0.setLog(log21);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo23 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map24 = optimizeMojo23.getPluginContext();
        java.util.Map map25 = optimizeMojo23.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo26 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log27 = optimizeMojo26.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo28 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log29 = optimizeMojo28.getLog();
        optimizeMojo26.setLog(log29);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo31 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log32 = optimizeMojo31.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo33 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log34 = optimizeMojo33.getLog();
        optimizeMojo31.setLog(log34);
        optimizeMojo26.setLog(log34);
        optimizeMojo23.setLog(log34);
        java.util.Map map38 = optimizeMojo23.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo39 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map40 = optimizeMojo39.getPluginContext();
        java.util.Map map41 = optimizeMojo39.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo42 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log43 = optimizeMojo42.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo44 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log45 = optimizeMojo44.getLog();
        optimizeMojo42.setLog(log45);
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo47 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log48 = optimizeMojo47.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo49 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log50 = optimizeMojo49.getLog();
        optimizeMojo47.setLog(log50);
        optimizeMojo42.setLog(log50);
        optimizeMojo39.setLog(log50);
        java.util.Map map54 = optimizeMojo39.getPluginContext();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo55 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log56 = optimizeMojo55.getLog();
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo57 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log58 = optimizeMojo57.getLog();
        optimizeMojo55.setLog(log58);
        org.apache.maven.plugin.logging.Log log60 = optimizeMojo55.getLog();
        optimizeMojo39.setLog(log60);
        optimizeMojo23.setLog(log60);
        optimizeMojo0.setLog(log60);
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter65 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log60, true);
        mojoErrorReporter65.error("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (-1), "com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo", 100);
        org.junit.Assert.assertNull(map1);
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNotNull(log4);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(log9);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNull(map15);
        org.junit.Assert.assertNotNull(log17);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNotNull(log21);
        org.junit.Assert.assertNull(map24);
        org.junit.Assert.assertNull(map25);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertNotNull(log29);
        org.junit.Assert.assertNotNull(log32);
        org.junit.Assert.assertNotNull(log34);
        org.junit.Assert.assertNull(map38);
        org.junit.Assert.assertNull(map40);
        org.junit.Assert.assertNull(map41);
        org.junit.Assert.assertNotNull(log43);
        org.junit.Assert.assertNotNull(log45);
        org.junit.Assert.assertNotNull(log48);
        org.junit.Assert.assertNotNull(log50);
        org.junit.Assert.assertNull(map54);
        org.junit.Assert.assertNotNull(log56);
        org.junit.Assert.assertNotNull(log58);
        org.junit.Assert.assertNotNull(log60);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        com.github.mcheely.maven.requirejs.Optimizer optimizer0 = new com.github.mcheely.maven.requirejs.Optimizer();
        java.io.File file1 = null;
        org.apache.maven.plugin.logging.Log log2 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter4 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log2, false);
        int int5 = mojoErrorReporter4.getWarningCnt();
        mojoErrorReporter4.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: ");
        mojoErrorReporter4.warning("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: ", 32, "hi!", (-1));
        mojoErrorReporter4.setDefaultFileName("com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        mojoErrorReporter4.setDefaultFileName("com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner18 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        // The following exception was thrown during execution in test generation
        try {
            optimizer0.optimize(file1, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter4, (com.github.mcheely.maven.requirejs.Runner) rhinoRunner18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        com.github.mcheely.maven.requirejs.OptimizationException optimizationException2 = new com.github.mcheely.maven.requirejs.OptimizationException("");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException3 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", (java.lang.Throwable) optimizationException2);
        java.lang.String str4 = rhinoRunnerException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!" + "'", str4, "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        com.github.mcheely.maven.requirejs.RhinoRunnerException rhinoRunnerException1 = new com.github.mcheely.maven.requirejs.RhinoRunnerException("com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo");
        java.lang.Throwable[] throwableArray2 = rhinoRunnerException1.getSuppressed();
        java.lang.String str3 = rhinoRunnerException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo" + "'", str3, "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.OptimizationException: org.apache.maven.plugin.Mojo");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        com.github.mcheely.maven.requirejs.RhinoRunner rhinoRunner0 = new com.github.mcheely.maven.requirejs.RhinoRunner();
        java.io.File file1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "com.github.mcheely.maven.requirejs.OptimizationException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "com.github.mcheely.maven.requirejs.RhinoRunnerException: com.github.mcheely.maven.requirejs.RhinoRunnerException: hi!", "org.apache.maven.plugin.Mojo", "com.github.mcheely.maven.requirejs.OptimizationException: " };
        org.apache.maven.plugin.logging.Log log7 = null;
        com.github.mcheely.maven.requirejs.MojoErrorReporter mojoErrorReporter9 = new com.github.mcheely.maven.requirejs.MojoErrorReporter(log7, true);
        // The following exception was thrown during execution in test generation
        try {
            com.github.mcheely.maven.requirejs.ExitStatus exitStatus10 = rhinoRunner0.exec(file1, strArray6, (org.mozilla.javascript.ErrorReporter) mojoErrorReporter9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }
}

