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
        net.tuis.ubench.UScale uScale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.scale.MathEquation mathEquation1 = net.tuis.ubench.ScaleDetect.detect(uScale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.util.logging.Level level0 = null;
        net.tuis.ubench.UUtils.setLogLevel(level0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.io.Writer writer0 = null;
        net.tuis.ubench.UReport.title(writer0, "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String[] strArray0 = net.tuis.ubench.UStats.getJSONFields();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        int int0 = net.tuis.ubench.UBench.MAX_RESULTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000000000 + "'", int0 == 1000000000);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException1 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.String str2 = uBenchRuntimeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str2, "net.tuis.ubench.UBenchRuntimeException: ");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        net.tuis.ubench.scale.Models models0 = new net.tuis.ubench.scale.Models();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report(writer4, "");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UStats[] uStatsArray5 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList6 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList6, uStatsArray5);
        net.tuis.ubench.UReport uReport8 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList6);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator9 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList10 = uReport8.getStats(uStatsComparator9);
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report("net.tuis.ubench.UBenchRuntimeException: ", uStatsComparator9);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(uStatsComparator9);
        org.junit.Assert.assertNotNull(uStatsList10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator5 = net.tuis.ubench.UReport.BY_AVERAGE;
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report("", uStatsComparator5);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        net.tuis.ubench.UMode uMode10 = net.tuis.ubench.UMode.PARALLEL;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport16 = uBench1.press(uMode10, 1000000000, 10, 10.0d, (long) 1000000000, timeUnit15);
            org.junit.Assert.fail("Expected exception of type net.tuis.ubench.UBenchRuntimeException; message: Parallel Execution failed. See cause.");
        } catch (net.tuis.ubench.UBenchRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertTrue("'" + uMode10 + "' != '" + net.tuis.ubench.UMode.PARALLEL + "'", uMode10.equals(net.tuis.ubench.UMode.PARALLEL));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport.title(writer0, "net.tuis.ubench.UBenchRuntimeException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        net.tuis.ubench.ScaleDetect scaleDetect0 = new net.tuis.ubench.ScaleDetect();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.io.Writer writer4 = null;
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator6 = net.tuis.ubench.UReport.BY_FASTEST;
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report(writer4, "", uStatsComparator6);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.lang.String str1 = net.tuis.ubench.UUtils.readResource("");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net\n" + "'", str1, "net\n");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        net.tuis.ubench.UScale uScale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.scale.MathEquation[] mathEquationArray1 = net.tuis.ubench.ScaleDetect.rank(uScale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport11 = uBench1.press(1000000000, (int) (short) 1, 10.0d, (long) '4', timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.util.logging.Level level0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UUtils.setStandaloneLogging(level0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.CONSTANT;
        java.lang.String str1 = mathModel0.getFormat();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "%f" + "'", str1, "%f");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator7 = net.tuis.ubench.UReport.BY_SLOWEST;
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report("", uStatsComparator7);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsComparator7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.io.Writer writer11 = null;
        net.tuis.ubench.UStats[] uStatsArray12 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList13 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList13, uStatsArray12);
        net.tuis.ubench.UReport uReport15 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList13);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator16 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList17 = uReport15.getStats(uStatsComparator16);
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report(writer11, uStatsComparator16);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(uStatsComparator16);
        org.junit.Assert.assertNotNull(uStatsList17);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.N_SQUARED;
        org.junit.Assert.assertNotNull(mathModel0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.io.Writer writer7 = null;
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(writer7, uStatsComparator8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsComparator8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.lang.String str10 = uBench9.getSuiteName();
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str10, "net.tuis.ubench.UBenchRuntimeException: ");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report("net\n", uStatsComparator8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsComparator8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        java.lang.Class<?> wildcardClass10 = uReport6.getClass();
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport17 = uBench15.press((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        net.tuis.ubench.UMode uMode6 = net.tuis.ubench.UMode.PARALLEL;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport8 = uBench1.press(uMode6, (int) '4');
            org.junit.Assert.fail("Expected exception of type net.tuis.ubench.UBenchRuntimeException; message: Parallel Execution failed. See cause.");
        } catch (net.tuis.ubench.UBenchRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertTrue("'" + uMode6 + "' != '" + net.tuis.ubench.UMode.PARALLEL + "'", uMode6.equals(net.tuis.ubench.UMode.PARALLEL));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport6 = uBench4.press((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator7 = net.tuis.ubench.UReport.BY_AVERAGE;
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report("net\n", uStatsComparator7);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsComparator7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator7 = net.tuis.ubench.UReport.BY_AVERAGE;
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(uStatsComparator7);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsComparator7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport.title(writer0, "net\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport.title(writer0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        net.tuis.ubench.UStats[] uStatsArray7 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList8 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList8, uStatsArray7);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList8);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator11 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport10.getStats(uStatsComparator11);
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(uStatsComparator11);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(uStatsComparator11);
        org.junit.Assert.assertNotNull(uStatsList12);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport15 = uBench1.press((int) (byte) 100, (int) (byte) 100, (double) (byte) 1, (long) (byte) 100, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator7 = net.tuis.ubench.UReport.BY_95PCTILE;
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report("", uStatsComparator7);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsComparator7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport21 = uBench15.press((int) (byte) 100, 0, (double) 10, (long) (byte) 1, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("%f * log n");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("%f * log n", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench5.addIntTask("", intSupplier7, intPredicate8);
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(writer8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        net.tuis.ubench.UMode uMode5 = net.tuis.ubench.UMode.SEQUENTIAL;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport7 = uBench4.press(uMode5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertTrue("'" + uMode5 + "' != '" + net.tuis.ubench.UMode.SEQUENTIAL + "'", uMode5.equals(net.tuis.ubench.UMode.SEQUENTIAL));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("");
        net.tuis.ubench.UMode uMode2 = net.tuis.ubench.UMode.PARALLEL;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport4 = uBench1.press(uMode2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + uMode2 + "' != '" + net.tuis.ubench.UMode.PARALLEL + "'", uMode2.equals(net.tuis.ubench.UMode.PARALLEL));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_AVERAGE;
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(uStatsComparator8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("%f * log n");
        java.lang.Class<?> wildcardClass2 = uBench1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException1 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray2 = uBenchRuntimeException1.getSuppressed();
        java.lang.String str3 = uBenchRuntimeException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str3, "net.tuis.ubench.UBenchRuntimeException: ");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("%f * log n");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("%f * log n", longSupplier3, longPredicate4);
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport8 = uBench1.press((long) 0, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addIntTask("%f", intSupplier7);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport14 = uBench1.press((int) (short) 1, (int) '4', (double) 10, (long) (short) 1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        long long0 = net.tuis.ubench.UUtils.getNanoTick();
// flaky:         org.junit.Assert.assertTrue("'" + long0 + "' != '" + 83L + "'", long0 == 83L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.io.Writer writer7 = null;
        net.tuis.ubench.UStats[] uStatsArray9 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList10 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList10, uStatsArray9);
        net.tuis.ubench.UReport uReport12 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList10);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator13 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList14 = uReport12.getStats(uStatsComparator13);
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(writer7, "hi!", uStatsComparator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(uStatsComparator13);
        org.junit.Assert.assertNotNull(uStatsList14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport7 = uBench5.press((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator12 = net.tuis.ubench.UReport.BY_95PCTILE;
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report("net\n", uStatsComparator12);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsComparator12);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        net.tuis.ubench.UStats[] uStatsArray9 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList10 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList10, uStatsArray9);
        net.tuis.ubench.UReport uReport12 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList10);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator13 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList14 = uReport12.getStats(uStatsComparator13);
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report("%f", uStatsComparator13);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(uStatsComparator13);
        org.junit.Assert.assertNotNull(uStatsList14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.io.Writer writer11 = null;
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator12 = net.tuis.ubench.UReport.BY_AVERAGE;
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report(writer11, uStatsComparator12);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsComparator12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report("O(log n)");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        java.io.Writer writer10 = null;
        net.tuis.ubench.UStats[] uStatsArray12 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList13 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList13, uStatsArray12);
        net.tuis.ubench.UReport uReport15 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList13);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator16 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList17 = uReport15.getStats(uStatsComparator16);
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(writer10, "", uStatsComparator16);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(uStatsComparator16);
        org.junit.Assert.assertNotNull(uStatsList17);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.lang.Runnable runnable6 = null;
        net.tuis.ubench.UBench uBench7 = uBench4.addTask("net.tuis.ubench.UBenchRuntimeException: ", runnable6);
        java.util.function.IntSupplier intSupplier9 = null;
        net.tuis.ubench.UBench uBench10 = uBench4.addIntTask("%f", intSupplier9);
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench7);
        org.junit.Assert.assertNotNull(uBench10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        net.tuis.ubench.UStats[] uStatsArray9 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList10 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList10, uStatsArray9);
        net.tuis.ubench.UReport uReport12 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList10);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator13 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList14 = uReport12.getStats(uStatsComparator13);
        net.tuis.ubench.UReport uReport15 = new net.tuis.ubench.UReport(uStatsList14);
        java.util.List<net.tuis.ubench.UStats> uStatsList16 = uReport15.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator17 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList18 = uReport15.getStats(uStatsComparator17);
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report("net\n", uStatsComparator17);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(uStatsComparator13);
        org.junit.Assert.assertNotNull(uStatsList14);
        org.junit.Assert.assertNotNull(uStatsList16);
        org.junit.Assert.assertNotNull(uStatsComparator17);
        org.junit.Assert.assertNotNull(uStatsList18);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.CONSTANT;
        java.lang.String str1 = mathModel0.getName();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "O(1)" + "'", str1, "O(1)");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException1 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray2 = uBenchRuntimeException1.getSuppressed();
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException4 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray5 = uBenchRuntimeException4.getSuppressed();
        uBenchRuntimeException1.addSuppressed((java.lang.Throwable) uBenchRuntimeException4);
        java.lang.String str7 = uBenchRuntimeException4.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str7, "net.tuis.ubench.UBenchRuntimeException: ");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("%f * log n");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("%f * log n", longSupplier3, longPredicate4);
        net.tuis.ubench.UMode uMode6 = net.tuis.ubench.UMode.INTERLEAVED;
        java.util.concurrent.TimeUnit timeUnit9 = net.tuis.ubench.UStats.findBestUnit(0L);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport10 = uBench5.press(uMode6, (long) 10, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertTrue("'" + uMode6 + "' != '" + net.tuis.ubench.UMode.INTERLEAVED + "'", uMode6.equals(net.tuis.ubench.UMode.INTERLEAVED));
        org.junit.Assert.assertNotNull(timeUnit9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        java.io.Writer writer6 = null;
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator7 = net.tuis.ubench.UReport.BY_AVERAGE;
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report(writer6, uStatsComparator7);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsComparator7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.lang.Runnable runnable6 = null;
        net.tuis.ubench.UBench uBench7 = uBench4.addTask("net.tuis.ubench.UBenchRuntimeException: ", runnable6);
        java.util.concurrent.TimeUnit timeUnit13 = net.tuis.ubench.UStats.findBestUnit(0L);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport14 = uBench4.press(10, (int) (byte) 1, (double) (byte) 0, (long) (byte) -1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench7);
        org.junit.Assert.assertNotNull(timeUnit13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.lang.Class<?> wildcardClass5 = uBench4.getClass();
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator12 = net.tuis.ubench.UReport.BY_SLOWEST;
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report("", uStatsComparator12);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsComparator12);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UStats[] uStatsArray7 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList8 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList8, uStatsArray7);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList8);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator11 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport10.getStats(uStatsComparator11);
        net.tuis.ubench.UReport uReport13 = new net.tuis.ubench.UReport(uStatsList12);
        java.util.List<net.tuis.ubench.UStats> uStatsList14 = uReport13.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator15 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList16 = uReport13.getStats(uStatsComparator15);
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report("O(1)", uStatsComparator15);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(uStatsComparator11);
        org.junit.Assert.assertNotNull(uStatsList12);
        org.junit.Assert.assertNotNull(uStatsList14);
        org.junit.Assert.assertNotNull(uStatsComparator15);
        org.junit.Assert.assertNotNull(uStatsList16);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("");
        java.lang.String str2 = uBench1.getSuiteName();
        java.util.function.DoubleSupplier doubleSupplier4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addDoubleTask("hi!", doubleSupplier4);
        java.lang.Runnable runnable7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addTask("%f * log n", runnable7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport10.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator14 = net.tuis.ubench.UReport.BY_SLOWEST;
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report("net.tuis.ubench.UBenchRuntimeException: ", uStatsComparator14);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsList12);
        org.junit.Assert.assertNotNull(uStatsComparator14);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray1 = mathModel0.getInitialValues();
        java.lang.String str2 = mathModel0.getName();
        java.lang.String str3 = mathModel0.toString();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O(log n)" + "'", str2, "O(log n)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "%f * log n" + "'", str3, "%f * log n");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport.title(writer0, "%f");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        java.io.Writer writer12 = null;
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report(writer12, "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", uStatsComparator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        java.lang.String str1 = mathModel0.getFormat();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "%f * log n" + "'", str1, "%f * log n");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport.title(writer0, "%f*n + %f");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator5 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList6 = uReport4.getStats(uStatsComparator5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport4.getStats();
        // The following exception was thrown during execution in test generation
        try {
            uReport4.report("O(log n)");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator5);
        org.junit.Assert.assertNotNull(uStatsList6);
        org.junit.Assert.assertNotNull(uStatsList7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        java.io.Writer writer10 = null;
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator12 = net.tuis.ubench.UReport.BY_SLOWEST;
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(writer10, "O(1)", uStatsComparator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsComparator12);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        java.lang.String str1 = mathModel0.toString();
        java.lang.String str2 = mathModel0.getName();
        java.lang.String str3 = mathModel0.getFormat();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "%f * log n" + "'", str1, "%f * log n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O(log n)" + "'", str2, "O(log n)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "%f * log n" + "'", str3, "%f * log n");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport10.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator14 = net.tuis.ubench.UReport.BY_99PCTILE;
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report("O(1)", uStatsComparator14);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsList12);
        org.junit.Assert.assertNotNull(uStatsComparator14);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addIntTask("%f", intSupplier7);
        java.util.function.IntSupplier intSupplier10 = null;
        java.util.function.IntPredicate intPredicate11 = null;
        net.tuis.ubench.UBench uBench12 = uBench8.addIntTask("net\n", intSupplier10, intPredicate11);
        java.util.function.IntSupplier intSupplier14 = null;
        java.util.function.IntPredicate intPredicate15 = null;
        net.tuis.ubench.UBench uBench16 = uBench12.addIntTask("%f * log n", intSupplier14, intPredicate15);
        net.tuis.ubench.UMode uMode17 = net.tuis.ubench.UMode.INTERLEAVED;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport19 = uBench16.press(uMode17, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench16);
        org.junit.Assert.assertTrue("'" + uMode17 + "' != '" + net.tuis.ubench.UMode.INTERLEAVED + "'", uMode17.equals(net.tuis.ubench.UMode.INTERLEAVED));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator10 = net.tuis.ubench.UReport.BY_99PCTILE;
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(uStatsComparator10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsComparator10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_SLOWEST;
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report(uStatsComparator4);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        java.lang.String str1 = mathModel0.toString();
        double[] doubleArray5 = new double[] { 100L, (short) 0, (byte) -1 };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator6 = mathModel0.createFunction(doubleArray5);
        net.tuis.ubench.scale.MathModel mathModel7 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel8 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray14 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator15 = mathModel8.createFunction(doubleArray14);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator16 = mathModel7.createFunction(doubleArray14);
        double[] doubleArray17 = mathModel7.getInitialValues();
        double[] doubleArray23 = new double[] { (short) 1, ' ', ' ', 10.0d, ' ' };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator24 = mathModel7.createFunction(doubleArray23);
        net.tuis.ubench.scale.MathModel mathModel25 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel26 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray32 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator33 = mathModel26.createFunction(doubleArray32);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator34 = mathModel25.createFunction(doubleArray32);
        net.tuis.ubench.scale.MathEquation mathEquation37 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator24, doubleArray32, "O(1)", (double) 1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator38 = mathEquation37.getEquation();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "%f * log n" + "'", str1, "%f * log n");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator6);
        org.junit.Assert.assertNotNull(mathModel7);
        org.junit.Assert.assertNotNull(mathModel8);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator15);
        org.junit.Assert.assertNotNull(doubleUnaryOperator16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 32.0, 32.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator24);
        org.junit.Assert.assertNotNull(mathModel25);
        org.junit.Assert.assertNotNull(mathModel26);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator33);
        org.junit.Assert.assertNotNull(doubleUnaryOperator34);
        org.junit.Assert.assertNotNull(doubleUnaryOperator38);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.lang.Runnable runnable17 = null;
        net.tuis.ubench.UBench uBench18 = uBench15.addTask("%f * log n", runnable17);
        net.tuis.ubench.UMode uMode19 = net.tuis.ubench.UMode.PARALLEL;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport21 = uBench18.press(uMode19, 0);
            org.junit.Assert.fail("Expected exception of type net.tuis.ubench.UBenchRuntimeException; message: Parallel Execution failed. See cause.");
        } catch (net.tuis.ubench.UBenchRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertTrue("'" + uMode19 + "' != '" + net.tuis.ubench.UMode.PARALLEL + "'", uMode19.equals(net.tuis.ubench.UMode.PARALLEL));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uReport4.report(writer5);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(writer7);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException1 = new net.tuis.ubench.UBenchRuntimeException("{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.function.IntSupplier intSupplier17 = null;
        java.util.function.IntPredicate intPredicate18 = null;
        net.tuis.ubench.UBench uBench19 = uBench15.addIntTask("", intSupplier17, intPredicate18);
        java.util.concurrent.TimeUnit timeUnit25 = net.tuis.ubench.UStats.findBestUnit(0L);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport26 = uBench15.press((int) '4', (int) (byte) -1, (double) '4', (long) '4', timeUnit25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench19);
        org.junit.Assert.assertNotNull(timeUnit25);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("%f*n + %f");
        java.util.function.LongSupplier longSupplier3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addLongTask("O(1)", longSupplier3);
        net.tuis.ubench.UMode uMode5 = net.tuis.ubench.UMode.SEQUENTIAL;
        java.util.concurrent.TimeUnit timeUnit11 = net.tuis.ubench.UStats.findBestUnit((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport12 = uBench1.press(uMode5, (int) (byte) 0, (-1), (double) 'a', (long) (byte) 100, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertTrue("'" + uMode5 + "' != '" + net.tuis.ubench.UMode.SEQUENTIAL + "'", uMode5.equals(net.tuis.ubench.UMode.SEQUENTIAL));
        org.junit.Assert.assertNotNull(timeUnit11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.function.LongSupplier longSupplier17 = null;
        net.tuis.ubench.UBench uBench18 = uBench12.addLongTask("%f * log n", longSupplier17);
        java.lang.String str19 = uBench18.getSuiteName();
        net.tuis.ubench.UMode uMode20 = net.tuis.ubench.UMode.INTERLEAVED;
        java.util.concurrent.TimeUnit timeUnit23 = net.tuis.ubench.UStats.findBestUnit(0L);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport24 = uBench18.press(uMode20, 0L, timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str19, "net.tuis.ubench.UBenchRuntimeException: ");
        org.junit.Assert.assertTrue("'" + uMode20 + "' != '" + net.tuis.ubench.UMode.INTERLEAVED + "'", uMode20.equals(net.tuis.ubench.UMode.INTERLEAVED));
        org.junit.Assert.assertNotNull(timeUnit23);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        java.io.Writer writer10 = null;
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator12 = net.tuis.ubench.UReport.BY_99PCTILE;
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(writer10, "%f", uStatsComparator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsComparator12);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.util.function.LongSupplier longSupplier6 = null;
        java.util.function.LongPredicate longPredicate7 = null;
        net.tuis.ubench.UBench uBench8 = uBench4.addLongTask("", longSupplier6, longPredicate7);
        java.util.function.IntSupplier intSupplier10 = null;
        java.util.function.IntPredicate intPredicate11 = null;
        net.tuis.ubench.UBench uBench12 = uBench4.addIntTask("O(log n)", intSupplier10, intPredicate11);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport14 = uBench12.press(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench12);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report(writer4);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.EXPONENTIAL;
        org.junit.Assert.assertNotNull(mathModel0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addLongTask("net\n", longSupplier3);
        java.util.concurrent.TimeUnit timeUnit10 = net.tuis.ubench.UStats.findBestUnit((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport11 = uBench1.press((int) (byte) -1, 10, (double) 100L, (long) (short) 0, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(timeUnit10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addLongTask("net\n", longSupplier3);
        net.tuis.ubench.UMode uMode5 = net.tuis.ubench.UMode.INTERLEAVED;
        java.util.concurrent.TimeUnit timeUnit11 = net.tuis.ubench.UStats.findBestUnit(0L);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport12 = uBench1.press(uMode5, 0, 0, (double) '4', 83L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertTrue("'" + uMode5 + "' != '" + net.tuis.ubench.UMode.INTERLEAVED + "'", uMode5.equals(net.tuis.ubench.UMode.INTERLEAVED));
        org.junit.Assert.assertNotNull(timeUnit11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(writer10, "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.util.function.LongSupplier longSupplier6 = null;
        java.util.function.LongPredicate longPredicate7 = null;
        net.tuis.ubench.UBench uBench8 = uBench4.addLongTask("", longSupplier6, longPredicate7);
        java.util.function.IntSupplier intSupplier10 = null;
        net.tuis.ubench.UBench uBench11 = uBench4.addIntTask("hi!", intSupplier10);
        java.lang.Class<?> wildcardClass12 = uBench11.getClass();
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        java.lang.Class<?> wildcardClass10 = uStatsComparator8.getClass();
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator5 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList6 = uReport4.getStats(uStatsComparator5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport4.getStats();
        net.tuis.ubench.UReport uReport8 = new net.tuis.ubench.UReport(uStatsList7);
        net.tuis.ubench.UReport uReport9 = new net.tuis.ubench.UReport(uStatsList7);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            uReport9.report(writer10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator5);
        org.junit.Assert.assertNotNull(uStatsList6);
        org.junit.Assert.assertNotNull(uStatsList7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("%f*n + %f");
        java.util.function.LongSupplier longSupplier3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addLongTask("O(1)", longSupplier3);
        net.tuis.ubench.UMode uMode5 = net.tuis.ubench.UMode.PARALLEL;
        java.util.concurrent.TimeUnit timeUnit11 = net.tuis.ubench.UStats.findBestUnit(0L);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport12 = uBench4.press(uMode5, (int) (byte) -1, (int) ' ', (double) 83L, (long) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type net.tuis.ubench.UBenchRuntimeException; message: Parallel Execution failed. See cause.");
        } catch (net.tuis.ubench.UBenchRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertTrue("'" + uMode5 + "' != '" + net.tuis.ubench.UMode.PARALLEL + "'", uMode5.equals(net.tuis.ubench.UMode.PARALLEL));
        org.junit.Assert.assertNotNull(timeUnit11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addIntTask("%f", intSupplier7);
        java.util.function.IntSupplier intSupplier10 = null;
        java.util.function.IntPredicate intPredicate11 = null;
        net.tuis.ubench.UBench uBench12 = uBench8.addIntTask("net\n", intSupplier10, intPredicate11);
        java.util.function.LongSupplier longSupplier14 = null;
        java.util.function.LongPredicate longPredicate15 = null;
        net.tuis.ubench.UBench uBench16 = uBench12.addLongTask("{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", longSupplier14, longPredicate15);
        java.util.concurrent.TimeUnit timeUnit19 = net.tuis.ubench.UStats.findBestUnit((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport20 = uBench16.press((long) ' ', timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench16);
        org.junit.Assert.assertNotNull(timeUnit19);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        java.lang.String str1 = mathModel0.toString();
        double[] doubleArray5 = new double[] { 100L, (short) 0, (byte) -1 };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator6 = mathModel0.createFunction(doubleArray5);
        net.tuis.ubench.scale.MathModel mathModel7 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel8 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray14 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator15 = mathModel8.createFunction(doubleArray14);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator16 = mathModel7.createFunction(doubleArray14);
        double[] doubleArray17 = mathModel7.getInitialValues();
        double[] doubleArray23 = new double[] { (short) 1, ' ', ' ', 10.0d, ' ' };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator24 = mathModel7.createFunction(doubleArray23);
        net.tuis.ubench.scale.MathModel mathModel25 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel26 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray32 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator33 = mathModel26.createFunction(doubleArray32);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator34 = mathModel25.createFunction(doubleArray32);
        net.tuis.ubench.scale.MathEquation mathEquation37 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator24, doubleArray32, "O(1)", (double) 1);
        boolean boolean38 = mathEquation37.isValid();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "%f * log n" + "'", str1, "%f * log n");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator6);
        org.junit.Assert.assertNotNull(mathModel7);
        org.junit.Assert.assertNotNull(mathModel8);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator15);
        org.junit.Assert.assertNotNull(doubleUnaryOperator16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 32.0, 32.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator24);
        org.junit.Assert.assertNotNull(mathModel25);
        org.junit.Assert.assertNotNull(mathModel26);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator33);
        org.junit.Assert.assertNotNull(doubleUnaryOperator34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.lang.Runnable runnable17 = null;
        net.tuis.ubench.UBench uBench18 = uBench15.addTask("%f * log n", runnable17);
        java.util.function.DoubleSupplier doubleSupplier20 = null;
        net.tuis.ubench.UBench uBench21 = uBench18.addDoubleTask("net\n", doubleSupplier20);
        net.tuis.ubench.UMode uMode22 = net.tuis.ubench.UMode.PARALLEL;
        java.util.concurrent.TimeUnit timeUnit25 = net.tuis.ubench.UStats.findBestUnit((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport26 = uBench18.press(uMode22, (long) ' ', timeUnit25);
            org.junit.Assert.fail("Expected exception of type net.tuis.ubench.UBenchRuntimeException; message: Parallel Execution failed. See cause.");
        } catch (net.tuis.ubench.UBenchRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertNotNull(uBench21);
        org.junit.Assert.assertTrue("'" + uMode22 + "' != '" + net.tuis.ubench.UMode.PARALLEL + "'", uMode22.equals(net.tuis.ubench.UMode.PARALLEL));
        org.junit.Assert.assertNotNull(timeUnit25);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport.title(writer0, "O(1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.lang.String str10 = uBench1.toString();
        java.lang.String str11 = uBench1.toString();
        java.lang.Class<?> wildcardClass12 = uBench1.getClass();
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Degree must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.lang.Runnable runnable17 = null;
        net.tuis.ubench.UBench uBench18 = uBench15.addTask("%f * log n", runnable17);
        java.lang.String str19 = uBench15.toString();
        net.tuis.ubench.UMode uMode20 = net.tuis.ubench.UMode.SEQUENTIAL;
        java.util.concurrent.TimeUnit timeUnit26 = net.tuis.ubench.UStats.findBestUnit(0L);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport27 = uBench15.press(uMode20, (int) (short) 0, 1000000000, (double) '4', (long) (short) 0, timeUnit26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertTrue("'" + uMode20 + "' != '" + net.tuis.ubench.UMode.SEQUENTIAL + "'", uMode20.equals(net.tuis.ubench.UMode.SEQUENTIAL));
        org.junit.Assert.assertNotNull(timeUnit26);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport10.getStats();
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report("%f");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsList12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray8 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel2.createFunction(doubleArray8);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction12 = null;
        double[] doubleArray19 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel20 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction12, doubleArray19);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator21 = mathModel2.createFunction(doubleArray19);
        net.tuis.ubench.scale.MathModel mathModel22 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray28 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator29 = mathModel22.createFunction(doubleArray28);
        net.tuis.ubench.scale.MathEquation mathEquation32 = new net.tuis.ubench.scale.MathEquation(mathModel1, doubleUnaryOperator21, doubleArray28, "", (double) (short) -1);
        java.lang.String str33 = mathEquation32.toJSONString();
        net.tuis.ubench.scale.MathModel mathModel34 = mathEquation32.getModel();
        double double35 = mathEquation32.getRSquared();
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator21);
        org.junit.Assert.assertNotNull(mathModel22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}" + "'", str33, "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}");
        org.junit.Assert.assertNotNull(mathModel34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport10.getStats();
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report("net\n with precision -1.0");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsList12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("O(1)");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        net.tuis.ubench.UReport uReport7 = new net.tuis.ubench.UReport(uStatsList5);
        java.io.Writer writer8 = null;
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            uReport7.report(writer8, uStatsComparator9);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        java.lang.String str1 = mathModel0.toString();
        java.lang.String str2 = mathModel0.getFormat();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "%f*n + %f" + "'", str1, "%f*n + %f");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "%f*n + %f" + "'", str2, "%f*n + %f");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException3 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException4 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException3);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException5 = new net.tuis.ubench.UBenchRuntimeException("%f*n + %f", (java.lang.Throwable) uBenchRuntimeException4);
        java.lang.String str6 = uBenchRuntimeException5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: %f*n + %f" + "'", str6, "net.tuis.ubench.UBenchRuntimeException: %f*n + %f");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.io.Writer writer5 = null;
        net.tuis.ubench.UStats[] uStatsArray6 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList7 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList7, uStatsArray6);
        net.tuis.ubench.UReport uReport9 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList7);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList7);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator11 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport10.getStats(uStatsComparator11);
        java.util.List<net.tuis.ubench.UStats> uStatsList13 = uReport10.getStats();
        net.tuis.ubench.UReport uReport14 = new net.tuis.ubench.UReport(uStatsList13);
        net.tuis.ubench.UReport uReport15 = new net.tuis.ubench.UReport(uStatsList13);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator16 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList17 = uReport15.getStats(uStatsComparator16);
        // The following exception was thrown during execution in test generation
        try {
            uReport4.report(writer5, uStatsComparator16);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(uStatsComparator11);
        org.junit.Assert.assertNotNull(uStatsList12);
        org.junit.Assert.assertNotNull(uStatsList13);
        org.junit.Assert.assertNotNull(uStatsComparator16);
        org.junit.Assert.assertNotNull(uStatsList17);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report("%f * log n");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray18 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel12.createFunction(doubleArray18);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction22 = null;
        double[] doubleArray29 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel30 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction22, doubleArray29);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator31 = mathModel12.createFunction(doubleArray29);
        net.tuis.ubench.scale.MathModel mathModel32 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray38 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator39 = mathModel32.createFunction(doubleArray38);
        net.tuis.ubench.scale.MathEquation mathEquation42 = new net.tuis.ubench.scale.MathEquation(mathModel11, doubleUnaryOperator31, doubleArray38, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathEquation42.getEquation();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction46 = null;
        double[] doubleArray53 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel54 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction46, doubleArray53);
        net.tuis.ubench.scale.MathEquation mathEquation57 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator43, doubleArray53, "net\n", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator58 = mathEquation57.getEquation();
        boolean boolean59 = mathEquation57.isValid();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator60 = mathEquation57.getEquation();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator31);
        org.junit.Assert.assertNotNull(mathModel32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator39);
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(doubleUnaryOperator60);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.N_LOG_N;
        org.junit.Assert.assertNotNull(mathModel0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray18 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel12.createFunction(doubleArray18);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction22 = null;
        double[] doubleArray29 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel30 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction22, doubleArray29);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator31 = mathModel12.createFunction(doubleArray29);
        net.tuis.ubench.scale.MathModel mathModel32 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray38 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator39 = mathModel32.createFunction(doubleArray38);
        net.tuis.ubench.scale.MathEquation mathEquation42 = new net.tuis.ubench.scale.MathEquation(mathModel11, doubleUnaryOperator31, doubleArray38, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathEquation42.getEquation();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction46 = null;
        double[] doubleArray53 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel54 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction46, doubleArray53);
        net.tuis.ubench.scale.MathEquation mathEquation57 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator43, doubleArray53, "net\n", (double) (short) -1);
        java.lang.String str58 = mathEquation57.toString();
        java.lang.String str59 = mathEquation57.toString();
        double[] doubleArray60 = mathEquation57.getParameters();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator31);
        org.junit.Assert.assertNotNull(mathModel32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator39);
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "net\n with precision -1.0" + "'", str58, "net\n with precision -1.0");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "net\n with precision -1.0" + "'", str59, "net\n with precision -1.0");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.function.LongSupplier longSupplier17 = null;
        net.tuis.ubench.UBench uBench18 = uBench12.addLongTask("%f * log n", longSupplier17);
        java.lang.String str19 = uBench12.toString();
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report(writer6, "");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction2 = null;
        net.tuis.ubench.scale.MathModel mathModel3 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel4 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray10 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator11 = mathModel4.createFunction(doubleArray10);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator12 = mathModel3.createFunction(doubleArray10);
        double[] doubleArray13 = mathModel3.getInitialValues();
        double[] doubleArray19 = new double[] { (short) 1, ' ', ' ', 10.0d, ' ' };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator20 = mathModel3.createFunction(doubleArray19);
        net.tuis.ubench.scale.MathModel mathModel21 = new net.tuis.ubench.scale.MathModel("%f", "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", doubleArrayFunction2, doubleArray19);
        java.lang.String str22 = mathModel21.toString();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction25 = null;
        double[] doubleArray32 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel33 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction25, doubleArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.function.DoubleUnaryOperator doubleUnaryOperator34 = mathModel21.createFunction(doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mathModel3);
        org.junit.Assert.assertNotNull(mathModel4);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator11);
        org.junit.Assert.assertNotNull(doubleUnaryOperator12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 32.0, 32.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}" + "'", str22, "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport5 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UStats[] uStatsArray7 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList8 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList8, uStatsArray7);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList8);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator11 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport10.getStats(uStatsComparator11);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator13 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList14 = uReport10.getStats(uStatsComparator13);
        // The following exception was thrown during execution in test generation
        try {
            uReport5.report("{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", uStatsComparator13);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(uStatsComparator11);
        org.junit.Assert.assertNotNull(uStatsList12);
        org.junit.Assert.assertNotNull(uStatsComparator13);
        org.junit.Assert.assertNotNull(uStatsList14);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray6 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator7 = mathModel0.createFunction(doubleArray6);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction10 = null;
        double[] doubleArray17 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel18 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction10, doubleArray17);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel0.createFunction(doubleArray17);
        java.lang.String str20 = mathModel0.getName();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction23 = null;
        net.tuis.ubench.scale.MathModel mathModel24 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel25 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray31 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator32 = mathModel25.createFunction(doubleArray31);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator33 = mathModel24.createFunction(doubleArray31);
        double[] doubleArray34 = mathModel24.getInitialValues();
        double[] doubleArray40 = new double[] { (short) 1, ' ', ' ', 10.0d, ' ' };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator41 = mathModel24.createFunction(doubleArray40);
        net.tuis.ubench.scale.MathModel mathModel42 = new net.tuis.ubench.scale.MathModel("%f", "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", doubleArrayFunction23, doubleArray40);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathModel0.createFunction(doubleArray40);
        java.lang.String str44 = mathModel0.getName();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator7);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "O(log n)" + "'", str20, "O(log n)");
        org.junit.Assert.assertNotNull(mathModel24);
        org.junit.Assert.assertNotNull(mathModel25);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator32);
        org.junit.Assert.assertNotNull(doubleUnaryOperator33);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 32.0, 32.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator41);
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "O(log n)" + "'", str44, "O(log n)");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray18 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel12.createFunction(doubleArray18);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction22 = null;
        double[] doubleArray29 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel30 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction22, doubleArray29);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator31 = mathModel12.createFunction(doubleArray29);
        net.tuis.ubench.scale.MathModel mathModel32 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray38 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator39 = mathModel32.createFunction(doubleArray38);
        net.tuis.ubench.scale.MathEquation mathEquation42 = new net.tuis.ubench.scale.MathEquation(mathModel11, doubleUnaryOperator31, doubleArray38, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathEquation42.getEquation();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction46 = null;
        double[] doubleArray53 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel54 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction46, doubleArray53);
        net.tuis.ubench.scale.MathEquation mathEquation57 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator43, doubleArray53, "net\n", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator58 = mathEquation57.getEquation();
        java.lang.String str59 = mathEquation57.toString();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator60 = mathEquation57.getEquation();
        boolean boolean61 = mathEquation57.isValid();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator31);
        org.junit.Assert.assertNotNull(mathModel32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator39);
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "net\n with precision -1.0" + "'", str59, "net\n with precision -1.0");
        org.junit.Assert.assertNotNull(doubleUnaryOperator60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList8 = uReport6.getStats();
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsList8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException1 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.lang.Runnable runnable6 = null;
        net.tuis.ubench.UBench uBench7 = uBench4.addTask("net.tuis.ubench.UBenchRuntimeException: ", runnable6);
        java.util.function.IntSupplier intSupplier9 = null;
        net.tuis.ubench.UBench uBench10 = uBench7.addIntTask("{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", intSupplier9);
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench7);
        org.junit.Assert.assertNotNull(uBench10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addIntTask("%f", intSupplier7);
        java.lang.String str9 = uBench8.toString();
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray8 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel2.createFunction(doubleArray8);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction12 = null;
        double[] doubleArray19 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel20 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction12, doubleArray19);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator21 = mathModel2.createFunction(doubleArray19);
        net.tuis.ubench.scale.MathModel mathModel22 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray28 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator29 = mathModel22.createFunction(doubleArray28);
        net.tuis.ubench.scale.MathEquation mathEquation32 = new net.tuis.ubench.scale.MathEquation(mathModel1, doubleUnaryOperator21, doubleArray28, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator33 = mathEquation32.getEquation();
        boolean boolean34 = mathEquation32.isValid();
        java.lang.String str35 = mathEquation32.toString();
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator21);
        org.junit.Assert.assertNotNull(mathModel22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator29);
        org.junit.Assert.assertNotNull(doubleUnaryOperator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " with precision -1.0" + "'", str35, " with precision -1.0");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.lang.String str10 = uBench1.toString();
        java.lang.String str11 = uBench1.toString();
        net.tuis.ubench.UMode uMode12 = net.tuis.ubench.UMode.INTERLEAVED;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport18 = uBench1.press(uMode12, (int) ' ', 1000000000, (double) (short) -1, 10L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertTrue("'" + uMode12 + "' != '" + net.tuis.ubench.UMode.INTERLEAVED + "'", uMode12.equals(net.tuis.ubench.UMode.INTERLEAVED));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("%f * log n");
        java.lang.String str2 = uBench1.getSuiteName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "%f * log n" + "'", str2, "%f * log n");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        java.lang.String str1 = mathModel0.toString();
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel3 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray9 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator10 = mathModel3.createFunction(doubleArray9);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator11 = mathModel2.createFunction(doubleArray9);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction14 = null;
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction17 = null;
        double[] doubleArray24 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel25 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction17, doubleArray24);
        net.tuis.ubench.scale.MathModel mathModel26 = new net.tuis.ubench.scale.MathModel("net.tuis.ubench.UBenchRuntimeException: ", "", doubleArrayFunction14, doubleArray24);
        net.tuis.ubench.scale.MathEquation mathEquation29 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator11, doubleArray24, "net.tuis.ubench.UBenchRuntimeException: %f*n + %f", (double) (short) 10);
        java.lang.String str30 = mathEquation29.getFormat();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "%f * log n" + "'", str1, "%f * log n");
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(mathModel3);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator10);
        org.junit.Assert.assertNotNull(doubleUnaryOperator11);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: %f*n + %f" + "'", str30, "net.tuis.ubench.UBenchRuntimeException: %f*n + %f");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addIntTask("%f", intSupplier7);
        java.util.function.IntSupplier intSupplier10 = null;
        java.util.function.IntPredicate intPredicate11 = null;
        net.tuis.ubench.UBench uBench12 = uBench8.addIntTask("net\n", intSupplier10, intPredicate11);
        net.tuis.ubench.UMode uMode13 = net.tuis.ubench.UMode.PARALLEL;
        java.util.concurrent.TimeUnit timeUnit16 = net.tuis.ubench.UStats.findBestUnit(0L);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport17 = uBench8.press(uMode13, 0L, timeUnit16);
            org.junit.Assert.fail("Expected exception of type net.tuis.ubench.UBenchRuntimeException; message: Parallel Execution failed. See cause.");
        } catch (net.tuis.ubench.UBenchRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertTrue("'" + uMode13 + "' != '" + net.tuis.ubench.UMode.PARALLEL + "'", uMode13.equals(net.tuis.ubench.UMode.PARALLEL));
        org.junit.Assert.assertNotNull(timeUnit16);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport10.getStats();
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsList12);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        java.io.Writer writer12 = null;
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator14 = net.tuis.ubench.UReport.BY_ADDED;
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report(writer12, "", uStatsComparator14);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsComparator14);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.function.LongSupplier longSupplier17 = null;
        net.tuis.ubench.UBench uBench18 = uBench12.addLongTask("%f * log n", longSupplier17);
        java.lang.String str19 = uBench18.getSuiteName();
        java.lang.String str20 = uBench18.toString();
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str19, "net.tuis.ubench.UBenchRuntimeException: ");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator5 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList6 = uReport4.getStats(uStatsComparator5);
        java.io.Writer writer7 = null;
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_AVERAGE;
        // The following exception was thrown during execution in test generation
        try {
            uReport4.report(writer7, uStatsComparator8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator5);
        org.junit.Assert.assertNotNull(uStatsList6);
        org.junit.Assert.assertNotNull(uStatsComparator8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        // The following exception was thrown during execution in test generation
        try {
            uReport4.report("%f*n + %f");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.lang.String str5 = uBench1.toString();
        net.tuis.ubench.UMode uMode6 = net.tuis.ubench.UMode.INTERLEAVED;
        java.util.concurrent.TimeUnit timeUnit12 = net.tuis.ubench.UStats.findBestUnit((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport13 = uBench1.press(uMode6, (int) ' ', (int) '#', (double) 100.0f, (long) (short) 10, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertTrue("'" + uMode6 + "' != '" + net.tuis.ubench.UMode.INTERLEAVED + "'", uMode6.equals(net.tuis.ubench.UMode.INTERLEAVED));
        org.junit.Assert.assertNotNull(timeUnit12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport10.getStats();
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report(writer13);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsList12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.function.IntSupplier intSupplier17 = null;
        java.util.function.IntPredicate intPredicate18 = null;
        net.tuis.ubench.UBench uBench19 = uBench15.addIntTask("", intSupplier17, intPredicate18);
        net.tuis.ubench.UMode uMode20 = net.tuis.ubench.UMode.SEQUENTIAL;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport22 = uBench19.press(uMode20, 1000000000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench19);
        org.junit.Assert.assertTrue("'" + uMode20 + "' != '" + net.tuis.ubench.UMode.SEQUENTIAL + "'", uMode20.equals(net.tuis.ubench.UMode.SEQUENTIAL));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray18 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel12.createFunction(doubleArray18);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction22 = null;
        double[] doubleArray29 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel30 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction22, doubleArray29);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator31 = mathModel12.createFunction(doubleArray29);
        net.tuis.ubench.scale.MathModel mathModel32 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray38 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator39 = mathModel32.createFunction(doubleArray38);
        net.tuis.ubench.scale.MathEquation mathEquation42 = new net.tuis.ubench.scale.MathEquation(mathModel11, doubleUnaryOperator31, doubleArray38, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathEquation42.getEquation();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction46 = null;
        double[] doubleArray53 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel54 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction46, doubleArray53);
        net.tuis.ubench.scale.MathEquation mathEquation57 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator43, doubleArray53, "net\n", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator58 = mathEquation57.getEquation();
        java.lang.String str59 = mathEquation57.toString();
        net.tuis.ubench.scale.MathModel mathModel60 = mathEquation57.getModel();
        java.lang.String str61 = mathEquation57.getDescription();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator31);
        org.junit.Assert.assertNotNull(mathModel32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator39);
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "net\n with precision -1.0" + "'", str59, "net\n with precision -1.0");
        org.junit.Assert.assertNotNull(mathModel60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "net\n" + "'", str61, "net\n");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        net.tuis.ubench.UStats[] uStatsArray12 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList13 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList13, uStatsArray12);
        net.tuis.ubench.UReport uReport15 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList13);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator16 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList17 = uReport15.getStats(uStatsComparator16);
        net.tuis.ubench.UReport uReport18 = new net.tuis.ubench.UReport(uStatsList17);
        java.util.List<net.tuis.ubench.UStats> uStatsList19 = uReport18.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator20 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList21 = uReport18.getStats(uStatsComparator20);
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report(uStatsComparator20);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(uStatsComparator16);
        org.junit.Assert.assertNotNull(uStatsList17);
        org.junit.Assert.assertNotNull(uStatsList19);
        org.junit.Assert.assertNotNull(uStatsComparator20);
        org.junit.Assert.assertNotNull(uStatsList21);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        java.lang.String str1 = mathModel0.toString();
        double[] doubleArray5 = new double[] { 100L, (short) 0, (byte) -1 };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator6 = mathModel0.createFunction(doubleArray5);
        double[] doubleArray7 = mathModel0.getInitialValues();
        java.lang.String str8 = mathModel0.getFormat();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "%f * log n" + "'", str1, "%f * log n");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "%f * log n" + "'", str8, "%f * log n");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator5 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList6 = uReport4.getStats(uStatsComparator5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport4.getStats();
        net.tuis.ubench.UReport uReport8 = new net.tuis.ubench.UReport(uStatsList7);
        net.tuis.ubench.UReport uReport9 = new net.tuis.ubench.UReport(uStatsList7);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator10 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport9.getStats(uStatsComparator10);
        java.io.Writer writer12 = null;
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator14 = net.tuis.ubench.UReport.BY_CONSISTENCY;
        // The following exception was thrown during execution in test generation
        try {
            uReport9.report(writer12, " with precision -1.0", uStatsComparator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator5);
        org.junit.Assert.assertNotNull(uStatsList6);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator10);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsComparator14);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator6 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport3.getStats(uStatsComparator6);
        java.io.Writer writer8 = null;
        net.tuis.ubench.UStats[] uStatsArray9 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList10 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList10, uStatsArray9);
        net.tuis.ubench.UReport uReport12 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList10);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator13 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList14 = uReport12.getStats(uStatsComparator13);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator15 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList16 = uReport12.getStats(uStatsComparator15);
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report(writer8, uStatsComparator15);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsComparator6);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(uStatsComparator13);
        org.junit.Assert.assertNotNull(uStatsList14);
        org.junit.Assert.assertNotNull(uStatsComparator15);
        org.junit.Assert.assertNotNull(uStatsList16);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addIntTask("%f", intSupplier7);
        java.util.function.IntSupplier intSupplier10 = null;
        java.util.function.IntPredicate intPredicate11 = null;
        net.tuis.ubench.UBench uBench12 = uBench8.addIntTask("net\n", intSupplier10, intPredicate11);
        java.util.function.LongSupplier longSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench8.addLongTask("hi!", longSupplier14);
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.function.LongSupplier longSupplier17 = null;
        net.tuis.ubench.UBench uBench18 = uBench12.addLongTask("%f * log n", longSupplier17);
        java.lang.String str19 = uBench18.getSuiteName();
        net.tuis.ubench.UMode uMode20 = net.tuis.ubench.UMode.PARALLEL;
        java.util.concurrent.TimeUnit timeUnit23 = net.tuis.ubench.UStats.findBestUnit((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport24 = uBench18.press(uMode20, (long) '4', timeUnit23);
            org.junit.Assert.fail("Expected exception of type net.tuis.ubench.UBenchRuntimeException; message: Parallel Execution failed. See cause.");
        } catch (net.tuis.ubench.UBenchRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str19, "net.tuis.ubench.UBenchRuntimeException: ");
        org.junit.Assert.assertTrue("'" + uMode20 + "' != '" + net.tuis.ubench.UMode.PARALLEL + "'", uMode20.equals(net.tuis.ubench.UMode.PARALLEL));
        org.junit.Assert.assertNotNull(timeUnit23);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addIntTask("%f", intSupplier7);
        java.util.function.IntSupplier intSupplier10 = null;
        java.util.function.IntPredicate intPredicate11 = null;
        net.tuis.ubench.UBench uBench12 = uBench8.addIntTask("net\n", intSupplier10, intPredicate11);
        java.util.function.IntSupplier intSupplier14 = null;
        java.util.function.IntPredicate intPredicate15 = null;
        net.tuis.ubench.UBench uBench16 = uBench12.addIntTask("%f * log n", intSupplier14, intPredicate15);
        net.tuis.ubench.UMode uMode17 = net.tuis.ubench.UMode.PARALLEL;
        java.util.concurrent.TimeUnit timeUnit23 = net.tuis.ubench.UStats.findBestUnit((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport24 = uBench16.press(uMode17, (int) (short) 10, (int) (short) 0, 10.0d, 100L, timeUnit23);
            org.junit.Assert.fail("Expected exception of type net.tuis.ubench.UBenchRuntimeException; message: Parallel Execution failed. See cause.");
        } catch (net.tuis.ubench.UBenchRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench16);
        org.junit.Assert.assertTrue("'" + uMode17 + "' != '" + net.tuis.ubench.UMode.PARALLEL + "'", uMode17.equals(net.tuis.ubench.UMode.PARALLEL));
        org.junit.Assert.assertNotNull(timeUnit23);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.function.IntSupplier intSupplier17 = null;
        net.tuis.ubench.UBench uBench18 = uBench15.addIntTask("net\n", intSupplier17);
        net.tuis.ubench.UMode uMode19 = net.tuis.ubench.UMode.INTERLEAVED;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport25 = uBench18.press(uMode19, (int) (byte) -1, (int) 'a', 0.0d, (long) (short) 0, timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertTrue("'" + uMode19 + "' != '" + net.tuis.ubench.UMode.INTERLEAVED + "'", uMode19.equals(net.tuis.ubench.UMode.INTERLEAVED));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        net.tuis.ubench.UBench uBench7 = uBench4.addDoubleTask("%f*n + %f", doubleSupplier6);
        java.util.function.IntSupplier intSupplier9 = null;
        java.util.function.IntPredicate intPredicate10 = null;
        net.tuis.ubench.UBench uBench11 = uBench7.addIntTask("%f*n + %f", intSupplier9, intPredicate10);
        net.tuis.ubench.UMode uMode12 = net.tuis.ubench.UMode.SEQUENTIAL;
        java.util.concurrent.TimeUnit timeUnit18 = net.tuis.ubench.UStats.findBestUnit((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport19 = uBench7.press(uMode12, 10, (int) (byte) 1, 100.0d, (long) (short) 10, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench7);
        org.junit.Assert.assertNotNull(uBench11);
        org.junit.Assert.assertTrue("'" + uMode12 + "' != '" + net.tuis.ubench.UMode.SEQUENTIAL + "'", uMode12.equals(net.tuis.ubench.UMode.SEQUENTIAL));
        org.junit.Assert.assertNotNull(timeUnit18);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.DoubleSupplier doubleSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addDoubleTask("net\n with precision -1.0", doubleSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench1.addIntTask("net.tuis.ubench.UBenchRuntimeException: ", intSupplier14);
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) '4');
        org.junit.Assert.assertNotNull(mathModel1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException1 = new net.tuis.ubench.UBenchRuntimeException("%f*n + %f");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel3 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray9 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator10 = mathModel3.createFunction(doubleArray9);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction13 = null;
        double[] doubleArray20 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel21 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction13, doubleArray20);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator22 = mathModel3.createFunction(doubleArray20);
        net.tuis.ubench.scale.MathModel mathModel23 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray29 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator30 = mathModel23.createFunction(doubleArray29);
        net.tuis.ubench.scale.MathEquation mathEquation33 = new net.tuis.ubench.scale.MathEquation(mathModel2, doubleUnaryOperator22, doubleArray29, "", (double) (short) -1);
        java.lang.String str34 = mathEquation33.toJSONString();
        net.tuis.ubench.scale.MathModel mathModel35 = mathEquation33.getModel();
        java.lang.String str36 = mathEquation33.toJSONString();
        double[] doubleArray37 = mathEquation33.getParameters();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator38 = mathModel0.createFunction(doubleArray37);
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(mathModel3);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator10);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator22);
        org.junit.Assert.assertNotNull(mathModel23);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}" + "'", str34, "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}");
        org.junit.Assert.assertNotNull(mathModel35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}" + "'", str36, "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator38);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException4 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException5 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException4);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException6 = new net.tuis.ubench.UBenchRuntimeException("%f*n + %f", (java.lang.Throwable) uBenchRuntimeException5);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException7 = new net.tuis.ubench.UBenchRuntimeException(" with precision -1.0", (java.lang.Throwable) uBenchRuntimeException6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.function.LongSupplier longSupplier17 = null;
        java.util.function.LongPredicate longPredicate18 = null;
        net.tuis.ubench.UBench uBench19 = uBench15.addLongTask("", longSupplier17, longPredicate18);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport21 = uBench15.press((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench19);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.function.LongSupplier longSupplier17 = null;
        java.util.function.LongPredicate longPredicate18 = null;
        net.tuis.ubench.UBench uBench19 = uBench15.addLongTask("", longSupplier17, longPredicate18);
        net.tuis.ubench.UMode uMode20 = net.tuis.ubench.UMode.PARALLEL;
        java.util.concurrent.TimeUnit timeUnit26 = net.tuis.ubench.UStats.findBestUnit((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport27 = uBench19.press(uMode20, (int) 'a', (int) ' ', (double) 0L, (long) (-1), timeUnit26);
            org.junit.Assert.fail("Expected exception of type net.tuis.ubench.UBenchRuntimeException; message: Parallel Execution failed. See cause.");
        } catch (net.tuis.ubench.UBenchRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench19);
        org.junit.Assert.assertTrue("'" + uMode20 + "' != '" + net.tuis.ubench.UMode.PARALLEL + "'", uMode20.equals(net.tuis.ubench.UMode.PARALLEL));
        org.junit.Assert.assertNotNull(timeUnit26);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        net.tuis.ubench.UBench uBench7 = uBench4.addDoubleTask("%f*n + %f", doubleSupplier6);
        java.util.function.IntSupplier intSupplier9 = null;
        java.util.function.IntPredicate intPredicate10 = null;
        net.tuis.ubench.UBench uBench11 = uBench7.addIntTask("%f*n + %f", intSupplier9, intPredicate10);
        java.lang.String str12 = uBench7.getSuiteName();
        java.lang.Runnable runnable14 = null;
        net.tuis.ubench.UBench uBench15 = uBench7.addTask("O(log n)", runnable14);
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench7);
        org.junit.Assert.assertNotNull(uBench11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str12, "net.tuis.ubench.UBenchRuntimeException: ");
        org.junit.Assert.assertNotNull(uBench15);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport5 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator6 = net.tuis.ubench.UReport.BY_AVERAGE;
        // The following exception was thrown during execution in test generation
        try {
            uReport5.report(uStatsComparator6);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LOG_N;
        java.lang.String str3 = mathModel2.toString();
        double[] doubleArray7 = new double[] { 100L, (short) 0, (byte) -1 };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel2.createFunction(doubleArray7);
        double[] doubleArray9 = mathModel2.getInitialValues();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator10 = mathModel1.createFunction(doubleArray9);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "%f * log n" + "'", str3, "%f * log n");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator10);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction2 = null;
        net.tuis.ubench.scale.MathModel mathModel3 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel4 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray10 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator11 = mathModel4.createFunction(doubleArray10);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator12 = mathModel3.createFunction(doubleArray10);
        net.tuis.ubench.scale.MathModel mathModel13 = new net.tuis.ubench.scale.MathModel("%f*n + %f", "net\n with precision -1.0", doubleArrayFunction2, doubleArray10);
        org.junit.Assert.assertNotNull(mathModel3);
        org.junit.Assert.assertNotNull(mathModel4);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator11);
        org.junit.Assert.assertNotNull(doubleUnaryOperator12);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.io.Writer writer4 = null;
        net.tuis.ubench.UStats[] uStatsArray5 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList6 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList6, uStatsArray5);
        net.tuis.ubench.UReport uReport8 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList6);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator9 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList10 = uReport8.getStats(uStatsComparator9);
        net.tuis.ubench.UReport uReport11 = new net.tuis.ubench.UReport(uStatsList10);
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport11.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator13 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList14 = uReport11.getStats(uStatsComparator13);
        net.tuis.ubench.UReport uReport15 = new net.tuis.ubench.UReport(uStatsList14);
        java.util.List<net.tuis.ubench.UStats> uStatsList16 = uReport15.getStats();
        net.tuis.ubench.UStats[] uStatsArray17 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList18 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList18, uStatsArray17);
        net.tuis.ubench.UReport uReport20 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList18);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator21 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList22 = uReport20.getStats(uStatsComparator21);
        net.tuis.ubench.UReport uReport23 = new net.tuis.ubench.UReport(uStatsList22);
        java.util.List<net.tuis.ubench.UStats> uStatsList24 = uReport23.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator25 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList26 = uReport23.getStats(uStatsComparator25);
        java.util.List<net.tuis.ubench.UStats> uStatsList27 = uReport15.getStats(uStatsComparator25);
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report(writer4, uStatsComparator25);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(uStatsComparator9);
        org.junit.Assert.assertNotNull(uStatsList10);
        org.junit.Assert.assertNotNull(uStatsList12);
        org.junit.Assert.assertNotNull(uStatsComparator13);
        org.junit.Assert.assertNotNull(uStatsList14);
        org.junit.Assert.assertNotNull(uStatsList16);
        org.junit.Assert.assertNotNull(uStatsArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(uStatsComparator21);
        org.junit.Assert.assertNotNull(uStatsList22);
        org.junit.Assert.assertNotNull(uStatsList24);
        org.junit.Assert.assertNotNull(uStatsComparator25);
        org.junit.Assert.assertNotNull(uStatsList26);
        org.junit.Assert.assertNotNull(uStatsList27);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator5 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList6 = uReport4.getStats(uStatsComparator5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport4.getStats();
        net.tuis.ubench.UReport uReport8 = new net.tuis.ubench.UReport(uStatsList7);
        // The following exception was thrown during execution in test generation
        try {
            uReport8.report("{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator5);
        org.junit.Assert.assertNotNull(uStatsList6);
        org.junit.Assert.assertNotNull(uStatsList7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray18 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel12.createFunction(doubleArray18);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction22 = null;
        double[] doubleArray29 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel30 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction22, doubleArray29);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator31 = mathModel12.createFunction(doubleArray29);
        net.tuis.ubench.scale.MathModel mathModel32 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray38 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator39 = mathModel32.createFunction(doubleArray38);
        net.tuis.ubench.scale.MathEquation mathEquation42 = new net.tuis.ubench.scale.MathEquation(mathModel11, doubleUnaryOperator31, doubleArray38, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathEquation42.getEquation();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction46 = null;
        double[] doubleArray53 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel54 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction46, doubleArray53);
        net.tuis.ubench.scale.MathEquation mathEquation57 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator43, doubleArray53, "net\n", (double) (short) -1);
        boolean boolean58 = mathEquation57.isValid();
        java.lang.String str59 = mathEquation57.toString();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator31);
        org.junit.Assert.assertNotNull(mathModel32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator39);
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "net\n with precision -1.0" + "'", str59, "net\n with precision -1.0");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction2 = null;
        double[] doubleArray9 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel10 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction2, doubleArray9);
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray18 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel12.createFunction(doubleArray18);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator20 = mathModel11.createFunction(doubleArray18);
        double[] doubleArray21 = mathModel11.getInitialValues();
        double[] doubleArray27 = new double[] { (short) 1, ' ', ' ', 10.0d, ' ' };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator28 = mathModel11.createFunction(doubleArray27);
        double[] doubleArray33 = new double[] { (-1L), (byte) -1, 83L, (-1L) };
        net.tuis.ubench.scale.MathEquation mathEquation36 = new net.tuis.ubench.scale.MathEquation(mathModel10, doubleUnaryOperator28, doubleArray33, "%f * log n", (double) 1000000000);
        net.tuis.ubench.scale.MathModel mathModel37 = mathEquation36.getModel();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleUnaryOperator20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 32.0, 32.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator28);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 83.0, -1.0]");
        org.junit.Assert.assertNotNull(mathModel37);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom(1);
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray3 = mathModel2.getInitialValues();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator4 = mathModel1.createFunction(doubleArray3);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator4);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.function.LongSupplier longSupplier17 = null;
        net.tuis.ubench.UBench uBench18 = uBench12.addLongTask("%f * log n", longSupplier17);
        java.lang.String str19 = uBench18.getSuiteName();
        java.util.function.LongSupplier longSupplier21 = null;
        java.util.function.LongPredicate longPredicate22 = null;
        net.tuis.ubench.UBench uBench23 = uBench18.addLongTask("hi!", longSupplier21, longPredicate22);
        java.lang.String str24 = uBench18.toString();
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str19, "net.tuis.ubench.UBenchRuntimeException: ");
        org.junit.Assert.assertNotNull(uBench23);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator5 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList6 = uReport4.getStats(uStatsComparator5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport4.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList8 = uReport4.getStats();
        java.io.Writer writer9 = null;
        net.tuis.ubench.UStats[] uStatsArray11 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList12 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList12, uStatsArray11);
        net.tuis.ubench.UReport uReport14 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList12);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator15 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList16 = uReport14.getStats(uStatsComparator15);
        net.tuis.ubench.UReport uReport17 = new net.tuis.ubench.UReport(uStatsList16);
        java.util.List<net.tuis.ubench.UStats> uStatsList18 = uReport17.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator19 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList20 = uReport17.getStats(uStatsComparator19);
        // The following exception was thrown during execution in test generation
        try {
            uReport4.report(writer9, "%f*n + %f", uStatsComparator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator5);
        org.junit.Assert.assertNotNull(uStatsList6);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsList8);
        org.junit.Assert.assertNotNull(uStatsArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(uStatsComparator15);
        org.junit.Assert.assertNotNull(uStatsList16);
        org.junit.Assert.assertNotNull(uStatsList18);
        org.junit.Assert.assertNotNull(uStatsComparator19);
        org.junit.Assert.assertNotNull(uStatsList20);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException2 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray3 = uBenchRuntimeException2.getSuppressed();
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException5 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray6 = uBenchRuntimeException5.getSuppressed();
        uBenchRuntimeException2.addSuppressed((java.lang.Throwable) uBenchRuntimeException5);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException11 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException12 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException11);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException13 = new net.tuis.ubench.UBenchRuntimeException("%f*n + %f", (java.lang.Throwable) uBenchRuntimeException12);
        uBenchRuntimeException5.addSuppressed((java.lang.Throwable) uBenchRuntimeException13);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException15 = new net.tuis.ubench.UBenchRuntimeException("%f", (java.lang.Throwable) uBenchRuntimeException13);
        java.lang.Throwable[] throwableArray16 = uBenchRuntimeException13.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UStats[] uStatsArray5 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList6 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList6, uStatsArray5);
        net.tuis.ubench.UReport uReport8 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList6);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator9 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList10 = uReport8.getStats(uStatsComparator9);
        net.tuis.ubench.UReport uReport11 = new net.tuis.ubench.UReport(uStatsList10);
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport11.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator13 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList14 = uReport11.getStats(uStatsComparator13);
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report(" with precision -1.0", uStatsComparator13);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(uStatsComparator9);
        org.junit.Assert.assertNotNull(uStatsList10);
        org.junit.Assert.assertNotNull(uStatsList12);
        org.junit.Assert.assertNotNull(uStatsComparator13);
        org.junit.Assert.assertNotNull(uStatsList14);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        java.util.List<net.tuis.ubench.UStats> uStatsList6 = uReport3.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report("net.tuis.ubench.UBenchRuntimeException: ", uStatsComparator8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList6);
        org.junit.Assert.assertNotNull(uStatsComparator8);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray8 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel2.createFunction(doubleArray8);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction12 = null;
        double[] doubleArray19 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel20 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction12, doubleArray19);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator21 = mathModel2.createFunction(doubleArray19);
        net.tuis.ubench.scale.MathModel mathModel22 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray28 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator29 = mathModel22.createFunction(doubleArray28);
        net.tuis.ubench.scale.MathEquation mathEquation32 = new net.tuis.ubench.scale.MathEquation(mathModel1, doubleUnaryOperator21, doubleArray28, "", (double) (short) -1);
        java.lang.String str33 = mathEquation32.toString();
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator21);
        org.junit.Assert.assertNotNull(mathModel22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " with precision -1.0" + "'", str33, " with precision -1.0");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.lang.Runnable runnable17 = null;
        net.tuis.ubench.UBench uBench18 = uBench15.addTask("%f * log n", runnable17);
        java.lang.String str19 = uBench15.toString();
        java.util.function.IntSupplier intSupplier21 = null;
        net.tuis.ubench.UBench uBench22 = uBench15.addIntTask("{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", intSupplier21);
        java.util.function.IntSupplier intSupplier24 = null;
        java.util.function.IntPredicate intPredicate25 = null;
        net.tuis.ubench.UBench uBench26 = uBench22.addIntTask("O(1)", intSupplier24, intPredicate25);
        net.tuis.ubench.UMode uMode27 = net.tuis.ubench.UMode.INTERLEAVED;
        java.util.concurrent.TimeUnit timeUnit30 = net.tuis.ubench.UStats.findBestUnit((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport31 = uBench26.press(uMode27, (long) (short) 0, timeUnit30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertNotNull(uBench22);
        org.junit.Assert.assertNotNull(uBench26);
        org.junit.Assert.assertTrue("'" + uMode27 + "' != '" + net.tuis.ubench.UMode.INTERLEAVED + "'", uMode27.equals(net.tuis.ubench.UMode.INTERLEAVED));
        org.junit.Assert.assertNotNull(timeUnit30);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList13 = uReport10.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator14 = net.tuis.ubench.UReport.BY_ADDED;
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report(uStatsComparator14);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsList12);
        org.junit.Assert.assertNotNull(uStatsList13);
        org.junit.Assert.assertNotNull(uStatsComparator14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("");
        java.util.function.IntSupplier intSupplier3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addIntTask("%f*n + %f", intSupplier3);
        org.junit.Assert.assertNotNull(uBench4);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        net.tuis.ubench.UBench uBench7 = uBench4.addDoubleTask("%f*n + %f", doubleSupplier6);
        java.util.function.IntSupplier intSupplier9 = null;
        java.util.function.IntPredicate intPredicate10 = null;
        net.tuis.ubench.UBench uBench11 = uBench7.addIntTask("%f*n + %f", intSupplier9, intPredicate10);
        net.tuis.ubench.UMode uMode12 = net.tuis.ubench.UMode.SEQUENTIAL;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport14 = uBench11.press(uMode12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench7);
        org.junit.Assert.assertNotNull(uBench11);
        org.junit.Assert.assertTrue("'" + uMode12 + "' != '" + net.tuis.ubench.UMode.SEQUENTIAL + "'", uMode12.equals(net.tuis.ubench.UMode.SEQUENTIAL));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        java.lang.Class<?> wildcardClass1 = mathModel0.getClass();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException2 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray3 = uBenchRuntimeException2.getSuppressed();
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException5 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray6 = uBenchRuntimeException5.getSuppressed();
        uBenchRuntimeException2.addSuppressed((java.lang.Throwable) uBenchRuntimeException5);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException11 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException12 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException11);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException13 = new net.tuis.ubench.UBenchRuntimeException("%f*n + %f", (java.lang.Throwable) uBenchRuntimeException12);
        uBenchRuntimeException5.addSuppressed((java.lang.Throwable) uBenchRuntimeException13);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException15 = new net.tuis.ubench.UBenchRuntimeException("O(1)", (java.lang.Throwable) uBenchRuntimeException5);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.lang.Runnable runnable17 = null;
        net.tuis.ubench.UBench uBench18 = uBench15.addTask("%f * log n", runnable17);
        java.util.function.DoubleSupplier doubleSupplier20 = null;
        net.tuis.ubench.UBench uBench21 = uBench18.addDoubleTask("net\n", doubleSupplier20);
        java.util.function.DoubleSupplier doubleSupplier23 = null;
        java.util.function.DoublePredicate doublePredicate24 = null;
        net.tuis.ubench.UBench uBench25 = uBench18.addDoubleTask("%f * log n", doubleSupplier23, doublePredicate24);
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertNotNull(uBench21);
        org.junit.Assert.assertNotNull(uBench25);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction2 = null;
        net.tuis.ubench.scale.MathModel mathModel3 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray9 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator10 = mathModel3.createFunction(doubleArray9);
        net.tuis.ubench.scale.MathModel mathModel11 = new net.tuis.ubench.scale.MathModel("hi!", " with precision -1.0", doubleArrayFunction2, doubleArray9);
        org.junit.Assert.assertNotNull(mathModel3);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray8 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel2.createFunction(doubleArray8);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction12 = null;
        double[] doubleArray19 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel20 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction12, doubleArray19);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator21 = mathModel2.createFunction(doubleArray19);
        net.tuis.ubench.scale.MathModel mathModel22 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray28 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator29 = mathModel22.createFunction(doubleArray28);
        net.tuis.ubench.scale.MathEquation mathEquation32 = new net.tuis.ubench.scale.MathEquation(mathModel1, doubleUnaryOperator21, doubleArray28, "", (double) (short) -1);
        java.lang.String str33 = mathEquation32.toJSONString();
        net.tuis.ubench.scale.MathModel mathModel34 = mathEquation32.getModel();
        java.lang.String str35 = mathEquation32.toJSONString();
        java.lang.String str36 = mathEquation32.getDescription();
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator21);
        org.junit.Assert.assertNotNull(mathModel22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}" + "'", str33, "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}");
        org.junit.Assert.assertNotNull(mathModel34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}" + "'", str35, "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        java.lang.String str1 = mathModel0.toString();
        double[] doubleArray5 = new double[] { 100L, (short) 0, (byte) -1 };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator6 = mathModel0.createFunction(doubleArray5);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction9 = null;
        double[] doubleArray16 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel17 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction9, doubleArray16);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator18 = mathModel0.createFunction(doubleArray16);
        java.lang.String str19 = mathModel0.toString();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "%f * log n" + "'", str1, "%f * log n");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator6);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "%f * log n" + "'", str19, "%f * log n");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList8 = uReport6.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats();
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsList8);
        org.junit.Assert.assertNotNull(uStatsList9);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction2 = null;
        double[] doubleArray9 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel10 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction2, doubleArray9);
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray17 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator18 = mathModel11.createFunction(doubleArray17);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction21 = null;
        double[] doubleArray28 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel29 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction21, doubleArray28);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator30 = mathModel11.createFunction(doubleArray28);
        java.lang.String str31 = mathModel11.getName();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction34 = null;
        net.tuis.ubench.scale.MathModel mathModel35 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel36 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray42 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathModel36.createFunction(doubleArray42);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator44 = mathModel35.createFunction(doubleArray42);
        double[] doubleArray45 = mathModel35.getInitialValues();
        double[] doubleArray51 = new double[] { (short) 1, ' ', ' ', 10.0d, ' ' };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator52 = mathModel35.createFunction(doubleArray51);
        net.tuis.ubench.scale.MathModel mathModel53 = new net.tuis.ubench.scale.MathModel("%f", "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", doubleArrayFunction34, doubleArray51);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator54 = mathModel11.createFunction(doubleArray51);
        // The following exception was thrown during execution in test generation
        try {
            java.util.function.DoubleUnaryOperator doubleUnaryOperator55 = mathModel10.createFunction(doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator18);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "O(log n)" + "'", str31, "O(log n)");
        org.junit.Assert.assertNotNull(mathModel35);
        org.junit.Assert.assertNotNull(mathModel36);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertNotNull(doubleUnaryOperator44);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 32.0, 32.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator52);
        org.junit.Assert.assertNotNull(doubleUnaryOperator54);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray18 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel12.createFunction(doubleArray18);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction22 = null;
        double[] doubleArray29 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel30 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction22, doubleArray29);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator31 = mathModel12.createFunction(doubleArray29);
        net.tuis.ubench.scale.MathModel mathModel32 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray38 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator39 = mathModel32.createFunction(doubleArray38);
        net.tuis.ubench.scale.MathEquation mathEquation42 = new net.tuis.ubench.scale.MathEquation(mathModel11, doubleUnaryOperator31, doubleArray38, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathEquation42.getEquation();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction46 = null;
        double[] doubleArray53 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel54 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction46, doubleArray53);
        net.tuis.ubench.scale.MathEquation mathEquation57 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator43, doubleArray53, "net\n", (double) (short) -1);
        java.lang.String str58 = mathEquation57.getDescription();
        java.lang.String str59 = mathEquation57.getFormat();
        double double60 = mathEquation57.getRSquared();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator31);
        org.junit.Assert.assertNotNull(mathModel32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator39);
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "net\n" + "'", str58, "net\n");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "net\n" + "'", str59, "net\n");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-1.0d) + "'", double60 == (-1.0d));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException2 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray3 = uBenchRuntimeException2.getSuppressed();
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException5 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray6 = uBenchRuntimeException5.getSuppressed();
        uBenchRuntimeException2.addSuppressed((java.lang.Throwable) uBenchRuntimeException5);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException11 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException12 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException11);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException13 = new net.tuis.ubench.UBenchRuntimeException("%f*n + %f", (java.lang.Throwable) uBenchRuntimeException12);
        uBenchRuntimeException5.addSuppressed((java.lang.Throwable) uBenchRuntimeException13);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException15 = new net.tuis.ubench.UBenchRuntimeException("%f", (java.lang.Throwable) uBenchRuntimeException13);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException19 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException20 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException19);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException21 = new net.tuis.ubench.UBenchRuntimeException("%f*n + %f", (java.lang.Throwable) uBenchRuntimeException20);
        uBenchRuntimeException15.addSuppressed((java.lang.Throwable) uBenchRuntimeException20);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException24 = new net.tuis.ubench.UBenchRuntimeException("net\n");
        uBenchRuntimeException20.addSuppressed((java.lang.Throwable) uBenchRuntimeException24);
        java.lang.Class<?> wildcardClass26 = uBenchRuntimeException24.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.DoubleSupplier doubleSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addDoubleTask("net\n with precision -1.0", doubleSupplier11);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport14 = uBench12.press((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addIntTask("%f", intSupplier7);
        java.util.function.IntSupplier intSupplier10 = null;
        java.util.function.IntPredicate intPredicate11 = null;
        net.tuis.ubench.UBench uBench12 = uBench8.addIntTask("net\n", intSupplier10, intPredicate11);
        java.util.function.IntSupplier intSupplier14 = null;
        java.util.function.IntPredicate intPredicate15 = null;
        net.tuis.ubench.UBench uBench16 = uBench12.addIntTask("%f * log n", intSupplier14, intPredicate15);
        java.util.function.LongSupplier longSupplier18 = null;
        java.util.function.LongPredicate longPredicate19 = null;
        net.tuis.ubench.UBench uBench20 = uBench16.addLongTask("net\n", longSupplier18, longPredicate19);
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench16);
        org.junit.Assert.assertNotNull(uBench20);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        java.io.Writer writer12 = null;
        net.tuis.ubench.UStats[] uStatsArray14 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList15 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList15, uStatsArray14);
        net.tuis.ubench.UReport uReport17 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList15);
        net.tuis.ubench.UReport uReport18 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList15);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator19 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList20 = uReport18.getStats(uStatsComparator19);
        java.util.List<net.tuis.ubench.UStats> uStatsList21 = uReport18.getStats();
        net.tuis.ubench.UReport uReport22 = new net.tuis.ubench.UReport(uStatsList21);
        net.tuis.ubench.UReport uReport23 = new net.tuis.ubench.UReport(uStatsList21);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator24 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList25 = uReport23.getStats(uStatsComparator24);
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report(writer12, "net.tuis.ubench.UBenchRuntimeException: ", uStatsComparator24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(uStatsComparator19);
        org.junit.Assert.assertNotNull(uStatsList20);
        org.junit.Assert.assertNotNull(uStatsList21);
        org.junit.Assert.assertNotNull(uStatsComparator24);
        org.junit.Assert.assertNotNull(uStatsList25);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray8 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel2.createFunction(doubleArray8);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction12 = null;
        double[] doubleArray19 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel20 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction12, doubleArray19);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator21 = mathModel2.createFunction(doubleArray19);
        net.tuis.ubench.scale.MathModel mathModel22 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray28 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator29 = mathModel22.createFunction(doubleArray28);
        net.tuis.ubench.scale.MathEquation mathEquation32 = new net.tuis.ubench.scale.MathEquation(mathModel1, doubleUnaryOperator21, doubleArray28, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator33 = mathEquation32.getEquation();
        java.lang.String str34 = mathEquation32.toJSONString();
        java.lang.String str35 = mathEquation32.toJSONString();
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator21);
        org.junit.Assert.assertNotNull(mathModel22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator29);
        org.junit.Assert.assertNotNull(doubleUnaryOperator33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}" + "'", str34, "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}" + "'", str35, "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.CONSTANT;
        java.lang.String str1 = mathModel0.toString();
        java.lang.String str2 = mathModel0.getName();
        java.lang.String str3 = mathModel0.getFormat();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "%f" + "'", str1, "%f");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O(1)" + "'", str2, "O(1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "%f" + "'", str3, "%f");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray8 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel2.createFunction(doubleArray8);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction12 = null;
        double[] doubleArray19 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel20 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction12, doubleArray19);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator21 = mathModel2.createFunction(doubleArray19);
        net.tuis.ubench.scale.MathModel mathModel22 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray28 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator29 = mathModel22.createFunction(doubleArray28);
        net.tuis.ubench.scale.MathEquation mathEquation32 = new net.tuis.ubench.scale.MathEquation(mathModel1, doubleUnaryOperator21, doubleArray28, "", (double) (short) -1);
        double[] doubleArray33 = mathModel1.getInitialValues();
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator21);
        org.junit.Assert.assertNotNull(mathModel22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator29);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0]");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.lang.Runnable runnable17 = null;
        net.tuis.ubench.UBench uBench18 = uBench15.addTask("%f * log n", runnable17);
        java.lang.String str19 = uBench15.toString();
        java.util.function.IntSupplier intSupplier21 = null;
        net.tuis.ubench.UBench uBench22 = uBench15.addIntTask("{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", intSupplier21);
        java.util.function.IntSupplier intSupplier24 = null;
        java.util.function.IntPredicate intPredicate25 = null;
        net.tuis.ubench.UBench uBench26 = uBench22.addIntTask("O(1)", intSupplier24, intPredicate25);
        java.util.function.LongSupplier longSupplier28 = null;
        java.util.function.LongPredicate longPredicate29 = null;
        net.tuis.ubench.UBench uBench30 = uBench22.addLongTask("O(n^100)", longSupplier28, longPredicate29);
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertNotNull(uBench22);
        org.junit.Assert.assertNotNull(uBench26);
        org.junit.Assert.assertNotNull(uBench30);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator5 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList6 = uReport4.getStats(uStatsComparator5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport4.getStats();
        net.tuis.ubench.UReport uReport8 = new net.tuis.ubench.UReport(uStatsList7);
        net.tuis.ubench.UReport uReport9 = new net.tuis.ubench.UReport(uStatsList7);
        net.tuis.ubench.UStats[] uStatsArray10 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList11 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList11, uStatsArray10);
        net.tuis.ubench.UReport uReport13 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList11);
        net.tuis.ubench.UReport uReport14 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList11);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator15 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList16 = uReport14.getStats(uStatsComparator15);
        java.util.List<net.tuis.ubench.UStats> uStatsList17 = uReport14.getStats();
        net.tuis.ubench.UReport uReport18 = new net.tuis.ubench.UReport(uStatsList17);
        net.tuis.ubench.UReport uReport19 = new net.tuis.ubench.UReport(uStatsList17);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator20 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList21 = uReport19.getStats(uStatsComparator20);
        // The following exception was thrown during execution in test generation
        try {
            uReport9.report(uStatsComparator20);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator5);
        org.junit.Assert.assertNotNull(uStatsList6);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(uStatsComparator15);
        org.junit.Assert.assertNotNull(uStatsList16);
        org.junit.Assert.assertNotNull(uStatsList17);
        org.junit.Assert.assertNotNull(uStatsComparator20);
        org.junit.Assert.assertNotNull(uStatsList21);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        net.tuis.ubench.UBench uBench7 = uBench4.addDoubleTask("%f*n + %f", doubleSupplier6);
        java.util.function.IntSupplier intSupplier9 = null;
        java.util.function.IntPredicate intPredicate10 = null;
        net.tuis.ubench.UBench uBench11 = uBench7.addIntTask("%f*n + %f", intSupplier9, intPredicate10);
        java.lang.String str12 = uBench7.getSuiteName();
        java.util.function.DoubleSupplier doubleSupplier14 = null;
        java.util.function.DoublePredicate doublePredicate15 = null;
        net.tuis.ubench.UBench uBench16 = uBench7.addDoubleTask("net\n with precision -1.0", doubleSupplier14, doublePredicate15);
        net.tuis.ubench.UMode uMode17 = net.tuis.ubench.UMode.PARALLEL;
        java.util.concurrent.TimeUnit timeUnit20 = net.tuis.ubench.UStats.findBestUnit((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport21 = uBench16.press(uMode17, 83L, timeUnit20);
            org.junit.Assert.fail("Expected exception of type net.tuis.ubench.UBenchRuntimeException; message: Parallel Execution failed. See cause.");
        } catch (net.tuis.ubench.UBenchRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench7);
        org.junit.Assert.assertNotNull(uBench11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str12, "net.tuis.ubench.UBenchRuntimeException: ");
        org.junit.Assert.assertNotNull(uBench16);
        org.junit.Assert.assertTrue("'" + uMode17 + "' != '" + net.tuis.ubench.UMode.PARALLEL + "'", uMode17.equals(net.tuis.ubench.UMode.PARALLEL));
        org.junit.Assert.assertNotNull(timeUnit20);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        net.tuis.ubench.UBench uBench7 = uBench4.addDoubleTask("%f*n + %f", doubleSupplier6);
        java.util.function.IntSupplier intSupplier9 = null;
        java.util.function.IntPredicate intPredicate10 = null;
        net.tuis.ubench.UBench uBench11 = uBench7.addIntTask("%f*n + %f", intSupplier9, intPredicate10);
        java.lang.String str12 = uBench7.getSuiteName();
        java.util.function.IntSupplier intSupplier14 = null;
        java.util.function.IntPredicate intPredicate15 = null;
        net.tuis.ubench.UBench uBench16 = uBench7.addIntTask("%f * log n", intSupplier14, intPredicate15);
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench7);
        org.junit.Assert.assertNotNull(uBench11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str12, "net.tuis.ubench.UBenchRuntimeException: ");
        org.junit.Assert.assertNotNull(uBench16);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray18 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel12.createFunction(doubleArray18);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction22 = null;
        double[] doubleArray29 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel30 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction22, doubleArray29);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator31 = mathModel12.createFunction(doubleArray29);
        net.tuis.ubench.scale.MathModel mathModel32 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray38 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator39 = mathModel32.createFunction(doubleArray38);
        net.tuis.ubench.scale.MathEquation mathEquation42 = new net.tuis.ubench.scale.MathEquation(mathModel11, doubleUnaryOperator31, doubleArray38, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathEquation42.getEquation();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction46 = null;
        double[] doubleArray53 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel54 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction46, doubleArray53);
        net.tuis.ubench.scale.MathEquation mathEquation57 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator43, doubleArray53, "net\n", (double) (short) -1);
        java.lang.String str58 = mathModel0.toString();
        double[] doubleArray59 = mathModel0.getInitialValues();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator31);
        org.junit.Assert.assertNotNull(mathModel32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator39);
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "%f*n + %f" + "'", str58, "%f*n + %f");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 0.0]");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        net.tuis.ubench.UMode uMode10 = net.tuis.ubench.UMode.PARALLEL;
        java.util.concurrent.TimeUnit timeUnit16 = net.tuis.ubench.UStats.findBestUnit(0L);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport17 = uBench1.press(uMode10, 100, (int) (byte) 0, (double) 0L, (long) (byte) 0, timeUnit16);
            org.junit.Assert.fail("Expected exception of type net.tuis.ubench.UBenchRuntimeException; message: Parallel Execution failed. See cause.");
        } catch (net.tuis.ubench.UBenchRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertTrue("'" + uMode10 + "' != '" + net.tuis.ubench.UMode.PARALLEL + "'", uMode10.equals(net.tuis.ubench.UMode.PARALLEL));
        org.junit.Assert.assertNotNull(timeUnit16);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction2 = null;
        net.tuis.ubench.scale.MathModel mathModel3 = net.tuis.ubench.scale.Models.LOG_N;
        java.lang.String str4 = mathModel3.toString();
        double[] doubleArray8 = new double[] { 100L, (short) 0, (byte) -1 };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel3.createFunction(doubleArray8);
        net.tuis.ubench.scale.MathModel mathModel10 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray16 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator17 = mathModel10.createFunction(doubleArray16);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction20 = null;
        double[] doubleArray27 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel28 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction20, doubleArray27);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator29 = mathModel10.createFunction(doubleArray27);
        java.lang.String str30 = mathModel10.getName();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction33 = null;
        net.tuis.ubench.scale.MathModel mathModel34 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel35 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray41 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator42 = mathModel35.createFunction(doubleArray41);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathModel34.createFunction(doubleArray41);
        double[] doubleArray44 = mathModel34.getInitialValues();
        double[] doubleArray50 = new double[] { (short) 1, ' ', ' ', 10.0d, ' ' };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator51 = mathModel34.createFunction(doubleArray50);
        net.tuis.ubench.scale.MathModel mathModel52 = new net.tuis.ubench.scale.MathModel("%f", "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", doubleArrayFunction33, doubleArray50);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator53 = mathModel10.createFunction(doubleArray50);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator54 = mathModel3.createFunction(doubleArray50);
        net.tuis.ubench.scale.MathModel mathModel55 = new net.tuis.ubench.scale.MathModel("net.tuis.ubench.UBenchRuntimeException: ", "O(log n)", doubleArrayFunction2, doubleArray50);
        org.junit.Assert.assertNotNull(mathModel3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "%f * log n" + "'", str4, "%f * log n");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(mathModel10);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator17);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "O(log n)" + "'", str30, "O(log n)");
        org.junit.Assert.assertNotNull(mathModel34);
        org.junit.Assert.assertNotNull(mathModel35);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator42);
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 32.0, 32.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator51);
        org.junit.Assert.assertNotNull(doubleUnaryOperator53);
        org.junit.Assert.assertNotNull(doubleUnaryOperator54);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.function.LongSupplier longSupplier17 = null;
        net.tuis.ubench.UBench uBench18 = uBench12.addLongTask("%f * log n", longSupplier17);
        java.lang.String str19 = uBench18.getSuiteName();
        java.util.function.DoubleSupplier doubleSupplier21 = null;
        net.tuis.ubench.UBench uBench22 = uBench18.addDoubleTask("%f", doubleSupplier21);
        java.util.function.DoubleSupplier doubleSupplier24 = null;
        java.util.function.DoublePredicate doublePredicate25 = null;
        net.tuis.ubench.UBench uBench26 = uBench18.addDoubleTask("hi!", doubleSupplier24, doublePredicate25);
        net.tuis.ubench.UMode uMode27 = net.tuis.ubench.UMode.PARALLEL;
        java.util.concurrent.TimeUnit timeUnit33 = net.tuis.ubench.UStats.findBestUnit(0L);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport34 = uBench18.press(uMode27, 1, 0, (double) 100L, (long) (short) 1, timeUnit33);
            org.junit.Assert.fail("Expected exception of type net.tuis.ubench.UBenchRuntimeException; message: Parallel Execution failed. See cause.");
        } catch (net.tuis.ubench.UBenchRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str19, "net.tuis.ubench.UBenchRuntimeException: ");
        org.junit.Assert.assertNotNull(uBench22);
        org.junit.Assert.assertNotNull(uBench26);
        org.junit.Assert.assertTrue("'" + uMode27 + "' != '" + net.tuis.ubench.UMode.PARALLEL + "'", uMode27.equals(net.tuis.ubench.UMode.PARALLEL));
        org.junit.Assert.assertNotNull(timeUnit33);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("%f * log n");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("%f * log n", longSupplier3, longPredicate4);
        java.util.concurrent.TimeUnit timeUnit11 = net.tuis.ubench.UStats.findBestUnit((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport12 = uBench5.press(1000000000, (int) '4', (-1.0d), (long) (byte) 100, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(timeUnit11);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray6 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator7 = mathModel0.createFunction(doubleArray6);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction10 = null;
        double[] doubleArray17 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel18 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction10, doubleArray17);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel0.createFunction(doubleArray17);
        double[] doubleArray20 = mathModel0.getInitialValues();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator7);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0]");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.function.IntSupplier intSupplier17 = null;
        java.util.function.IntPredicate intPredicate18 = null;
        net.tuis.ubench.UBench uBench19 = uBench15.addIntTask("", intSupplier17, intPredicate18);
        net.tuis.ubench.UMode uMode20 = net.tuis.ubench.UMode.INTERLEAVED;
        java.util.concurrent.TimeUnit timeUnit23 = net.tuis.ubench.UStats.findBestUnit((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport24 = uBench15.press(uMode20, (long) 0, timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench19);
        org.junit.Assert.assertTrue("'" + uMode20 + "' != '" + net.tuis.ubench.UMode.INTERLEAVED + "'", uMode20.equals(net.tuis.ubench.UMode.INTERLEAVED));
        org.junit.Assert.assertNotNull(timeUnit23);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.lang.String str10 = uBench1.toString();
        java.util.function.LongSupplier longSupplier12 = null;
        java.util.function.LongPredicate longPredicate13 = null;
        net.tuis.ubench.UBench uBench14 = uBench1.addLongTask("O(1)", longSupplier12, longPredicate13);
        java.util.function.IntSupplier intSupplier16 = null;
        java.util.function.IntPredicate intPredicate17 = null;
        net.tuis.ubench.UBench uBench18 = uBench14.addIntTask("", intSupplier16, intPredicate17);
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench14);
        org.junit.Assert.assertNotNull(uBench18);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        net.tuis.ubench.UBench uBench7 = uBench4.addDoubleTask("%f*n + %f", doubleSupplier6);
        java.util.function.IntSupplier intSupplier9 = null;
        java.util.function.IntPredicate intPredicate10 = null;
        net.tuis.ubench.UBench uBench11 = uBench7.addIntTask("%f*n + %f", intSupplier9, intPredicate10);
        java.lang.String str12 = uBench7.getSuiteName();
        java.util.function.LongSupplier longSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench7.addLongTask("", longSupplier14);
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench7);
        org.junit.Assert.assertNotNull(uBench11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str12, "net.tuis.ubench.UBenchRuntimeException: ");
        org.junit.Assert.assertNotNull(uBench15);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList13 = uReport10.getStats();
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report(writer14);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsList12);
        org.junit.Assert.assertNotNull(uStatsList13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList13 = uReport10.getStats();
        java.io.Writer writer14 = null;
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator16 = net.tuis.ubench.UReport.BY_AVERAGE;
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report(writer14, "O(n^100)", uStatsComparator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsList12);
        org.junit.Assert.assertNotNull(uStatsList13);
        org.junit.Assert.assertNotNull(uStatsComparator16);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        java.util.function.LongPredicate longPredicate12 = null;
        net.tuis.ubench.UBench uBench13 = uBench1.addLongTask("O(log n)", longSupplier11, longPredicate12);
        java.util.function.DoubleSupplier doubleSupplier15 = null;
        net.tuis.ubench.UBench uBench16 = uBench1.addDoubleTask("", doubleSupplier15);
        java.lang.String str17 = uBench1.getSuiteName();
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench13);
        org.junit.Assert.assertNotNull(uBench16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str17, "net.tuis.ubench.UBenchRuntimeException: ");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("%f * log n");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("%f * log n", longSupplier3, longPredicate4);
        java.lang.String str6 = uBench1.getSuiteName();
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "%f * log n" + "'", str6, "%f * log n");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.lang.Runnable runnable17 = null;
        net.tuis.ubench.UBench uBench18 = uBench15.addTask("%f * log n", runnable17);
        java.util.function.DoubleSupplier doubleSupplier20 = null;
        net.tuis.ubench.UBench uBench21 = uBench15.addDoubleTask("%f", doubleSupplier20);
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertNotNull(uBench21);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        net.tuis.ubench.UBench uBench7 = uBench4.addDoubleTask("%f*n + %f", doubleSupplier6);
        java.util.function.IntSupplier intSupplier9 = null;
        net.tuis.ubench.UBench uBench10 = uBench4.addIntTask("net\n", intSupplier9);
        java.lang.String str11 = uBench10.toString();
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench7);
        org.junit.Assert.assertNotNull(uBench10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException1 = new net.tuis.ubench.UBenchRuntimeException("O(n^100)");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException2 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray3 = uBenchRuntimeException2.getSuppressed();
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException5 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray6 = uBenchRuntimeException5.getSuppressed();
        uBenchRuntimeException2.addSuppressed((java.lang.Throwable) uBenchRuntimeException5);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException10 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException11 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException10);
        uBenchRuntimeException5.addSuppressed((java.lang.Throwable) uBenchRuntimeException10);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException13 = new net.tuis.ubench.UBenchRuntimeException("O(log n)", (java.lang.Throwable) uBenchRuntimeException5);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom(100);
        java.lang.String str2 = mathModel1.getName();
        java.lang.String str3 = mathModel1.toString();
        java.lang.String str4 = mathModel1.toString();
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O(n^100)" + "'", str2, "O(n^100)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "%f*n^100 + %f*n^99 + %f*n^98 + %f*n^97 + %f*n^96 + %f*n^95 + %f*n^94 + %f*n^93 + %f*n^92 + %f*n^91 + %f*n^90 + %f*n^89 + %f*n^88 + %f*n^87 + %f*n^86 + %f*n^85 + %f*n^84 + %f*n^83 + %f*n^82 + %f*n^81 + %f*n^80 + %f*n^79 + %f*n^78 + %f*n^77 + %f*n^76 + %f*n^75 + %f*n^74 + %f*n^73 + %f*n^72 + %f*n^71 + %f*n^70 + %f*n^69 + %f*n^68 + %f*n^67 + %f*n^66 + %f*n^65 + %f*n^64 + %f*n^63 + %f*n^62 + %f*n^61 + %f*n^60 + %f*n^59 + %f*n^58 + %f*n^57 + %f*n^56 + %f*n^55 + %f*n^54 + %f*n^53 + %f*n^52 + %f*n^51 + %f*n^50 + %f*n^49 + %f*n^48 + %f*n^47 + %f*n^46 + %f*n^45 + %f*n^44 + %f*n^43 + %f*n^42 + %f*n^41 + %f*n^40 + %f*n^39 + %f*n^38 + %f*n^37 + %f*n^36 + %f*n^35 + %f*n^34 + %f*n^33 + %f*n^32 + %f*n^31 + %f*n^30 + %f*n^29 + %f*n^28 + %f*n^27 + %f*n^26 + %f*n^25 + %f*n^24 + %f*n^23 + %f*n^22 + %f*n^21 + %f*n^20 + %f*n^19 + %f*n^18 + %f*n^17 + %f*n^16 + %f*n^15 + %f*n^14 + %f*n^13 + %f*n^12 + %f*n^11 + %f*n^10 + %f*n^9 + %f*n^8 + %f*n^7 + %f*n^6 + %f*n^5 + %f*n^4 + %f*n^3 + %f*n^2 + %f*n + %f" + "'", str3, "%f*n^100 + %f*n^99 + %f*n^98 + %f*n^97 + %f*n^96 + %f*n^95 + %f*n^94 + %f*n^93 + %f*n^92 + %f*n^91 + %f*n^90 + %f*n^89 + %f*n^88 + %f*n^87 + %f*n^86 + %f*n^85 + %f*n^84 + %f*n^83 + %f*n^82 + %f*n^81 + %f*n^80 + %f*n^79 + %f*n^78 + %f*n^77 + %f*n^76 + %f*n^75 + %f*n^74 + %f*n^73 + %f*n^72 + %f*n^71 + %f*n^70 + %f*n^69 + %f*n^68 + %f*n^67 + %f*n^66 + %f*n^65 + %f*n^64 + %f*n^63 + %f*n^62 + %f*n^61 + %f*n^60 + %f*n^59 + %f*n^58 + %f*n^57 + %f*n^56 + %f*n^55 + %f*n^54 + %f*n^53 + %f*n^52 + %f*n^51 + %f*n^50 + %f*n^49 + %f*n^48 + %f*n^47 + %f*n^46 + %f*n^45 + %f*n^44 + %f*n^43 + %f*n^42 + %f*n^41 + %f*n^40 + %f*n^39 + %f*n^38 + %f*n^37 + %f*n^36 + %f*n^35 + %f*n^34 + %f*n^33 + %f*n^32 + %f*n^31 + %f*n^30 + %f*n^29 + %f*n^28 + %f*n^27 + %f*n^26 + %f*n^25 + %f*n^24 + %f*n^23 + %f*n^22 + %f*n^21 + %f*n^20 + %f*n^19 + %f*n^18 + %f*n^17 + %f*n^16 + %f*n^15 + %f*n^14 + %f*n^13 + %f*n^12 + %f*n^11 + %f*n^10 + %f*n^9 + %f*n^8 + %f*n^7 + %f*n^6 + %f*n^5 + %f*n^4 + %f*n^3 + %f*n^2 + %f*n + %f");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "%f*n^100 + %f*n^99 + %f*n^98 + %f*n^97 + %f*n^96 + %f*n^95 + %f*n^94 + %f*n^93 + %f*n^92 + %f*n^91 + %f*n^90 + %f*n^89 + %f*n^88 + %f*n^87 + %f*n^86 + %f*n^85 + %f*n^84 + %f*n^83 + %f*n^82 + %f*n^81 + %f*n^80 + %f*n^79 + %f*n^78 + %f*n^77 + %f*n^76 + %f*n^75 + %f*n^74 + %f*n^73 + %f*n^72 + %f*n^71 + %f*n^70 + %f*n^69 + %f*n^68 + %f*n^67 + %f*n^66 + %f*n^65 + %f*n^64 + %f*n^63 + %f*n^62 + %f*n^61 + %f*n^60 + %f*n^59 + %f*n^58 + %f*n^57 + %f*n^56 + %f*n^55 + %f*n^54 + %f*n^53 + %f*n^52 + %f*n^51 + %f*n^50 + %f*n^49 + %f*n^48 + %f*n^47 + %f*n^46 + %f*n^45 + %f*n^44 + %f*n^43 + %f*n^42 + %f*n^41 + %f*n^40 + %f*n^39 + %f*n^38 + %f*n^37 + %f*n^36 + %f*n^35 + %f*n^34 + %f*n^33 + %f*n^32 + %f*n^31 + %f*n^30 + %f*n^29 + %f*n^28 + %f*n^27 + %f*n^26 + %f*n^25 + %f*n^24 + %f*n^23 + %f*n^22 + %f*n^21 + %f*n^20 + %f*n^19 + %f*n^18 + %f*n^17 + %f*n^16 + %f*n^15 + %f*n^14 + %f*n^13 + %f*n^12 + %f*n^11 + %f*n^10 + %f*n^9 + %f*n^8 + %f*n^7 + %f*n^6 + %f*n^5 + %f*n^4 + %f*n^3 + %f*n^2 + %f*n + %f" + "'", str4, "%f*n^100 + %f*n^99 + %f*n^98 + %f*n^97 + %f*n^96 + %f*n^95 + %f*n^94 + %f*n^93 + %f*n^92 + %f*n^91 + %f*n^90 + %f*n^89 + %f*n^88 + %f*n^87 + %f*n^86 + %f*n^85 + %f*n^84 + %f*n^83 + %f*n^82 + %f*n^81 + %f*n^80 + %f*n^79 + %f*n^78 + %f*n^77 + %f*n^76 + %f*n^75 + %f*n^74 + %f*n^73 + %f*n^72 + %f*n^71 + %f*n^70 + %f*n^69 + %f*n^68 + %f*n^67 + %f*n^66 + %f*n^65 + %f*n^64 + %f*n^63 + %f*n^62 + %f*n^61 + %f*n^60 + %f*n^59 + %f*n^58 + %f*n^57 + %f*n^56 + %f*n^55 + %f*n^54 + %f*n^53 + %f*n^52 + %f*n^51 + %f*n^50 + %f*n^49 + %f*n^48 + %f*n^47 + %f*n^46 + %f*n^45 + %f*n^44 + %f*n^43 + %f*n^42 + %f*n^41 + %f*n^40 + %f*n^39 + %f*n^38 + %f*n^37 + %f*n^36 + %f*n^35 + %f*n^34 + %f*n^33 + %f*n^32 + %f*n^31 + %f*n^30 + %f*n^29 + %f*n^28 + %f*n^27 + %f*n^26 + %f*n^25 + %f*n^24 + %f*n^23 + %f*n^22 + %f*n^21 + %f*n^20 + %f*n^19 + %f*n^18 + %f*n^17 + %f*n^16 + %f*n^15 + %f*n^14 + %f*n^13 + %f*n^12 + %f*n^11 + %f*n^10 + %f*n^9 + %f*n^8 + %f*n^7 + %f*n^6 + %f*n^5 + %f*n^4 + %f*n^3 + %f*n^2 + %f*n + %f");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_99PCTILE;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(writer10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.lang.Runnable runnable17 = null;
        net.tuis.ubench.UBench uBench18 = uBench15.addTask("%f * log n", runnable17);
        java.util.function.DoubleSupplier doubleSupplier20 = null;
        net.tuis.ubench.UBench uBench21 = uBench18.addDoubleTask("net\n", doubleSupplier20);
        java.util.function.DoubleSupplier doubleSupplier23 = null;
        net.tuis.ubench.UBench uBench24 = uBench21.addDoubleTask("net\n", doubleSupplier23);
        java.util.function.LongSupplier longSupplier26 = null;
        net.tuis.ubench.UBench uBench27 = uBench21.addLongTask("%f", longSupplier26);
        java.lang.String str28 = uBench27.toString();
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertNotNull(uBench21);
        org.junit.Assert.assertNotNull(uBench24);
        org.junit.Assert.assertNotNull(uBench27);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        net.tuis.ubench.UReport uReport7 = new net.tuis.ubench.UReport(uStatsList5);
        // The following exception was thrown during execution in test generation
        try {
            uReport7.report();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray18 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel12.createFunction(doubleArray18);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction22 = null;
        double[] doubleArray29 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel30 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction22, doubleArray29);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator31 = mathModel12.createFunction(doubleArray29);
        net.tuis.ubench.scale.MathModel mathModel32 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray38 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator39 = mathModel32.createFunction(doubleArray38);
        net.tuis.ubench.scale.MathEquation mathEquation42 = new net.tuis.ubench.scale.MathEquation(mathModel11, doubleUnaryOperator31, doubleArray38, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathEquation42.getEquation();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction46 = null;
        double[] doubleArray53 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel54 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction46, doubleArray53);
        net.tuis.ubench.scale.MathEquation mathEquation57 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator43, doubleArray53, "net\n", (double) (short) -1);
        java.lang.String str58 = mathEquation57.toString();
        java.lang.String str59 = mathEquation57.toString();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator60 = mathEquation57.getEquation();
        java.lang.String str61 = mathEquation57.toJSONString();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator31);
        org.junit.Assert.assertNotNull(mathModel32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator39);
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "net\n with precision -1.0" + "'", str58, "net\n with precision -1.0");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "net\n with precision -1.0" + "'", str59, "net\n with precision -1.0");
        org.junit.Assert.assertNotNull(doubleUnaryOperator60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "{name: \"O(n)\", valid: true, format: \"net\n\", description: \"net\n\", parameters: [1.000000, -1.000000, -1.000000, -1.000000, 52.000000, 100.000000], rsquare: -1.000000}" + "'", str61, "{name: \"O(n)\", valid: true, format: \"net\n\", description: \"net\n\", parameters: [1.000000, -1.000000, -1.000000, -1.000000, 52.000000, 100.000000], rsquare: -1.000000}");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray1 = mathModel0.getInitialValues();
        java.lang.String str2 = mathModel0.getFormat();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "%f * log n" + "'", str2, "%f * log n");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addIntTask("%f", intSupplier7);
        java.util.function.IntSupplier intSupplier10 = null;
        java.util.function.IntPredicate intPredicate11 = null;
        net.tuis.ubench.UBench uBench12 = uBench8.addIntTask("net\n", intSupplier10, intPredicate11);
        java.util.function.LongSupplier longSupplier14 = null;
        java.util.function.LongPredicate longPredicate15 = null;
        net.tuis.ubench.UBench uBench16 = uBench12.addLongTask("{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", longSupplier14, longPredicate15);
        java.util.function.DoubleSupplier doubleSupplier18 = null;
        java.util.function.DoublePredicate doublePredicate19 = null;
        net.tuis.ubench.UBench uBench20 = uBench16.addDoubleTask("%f * log n", doubleSupplier18, doublePredicate19);
        java.util.function.DoubleSupplier doubleSupplier22 = null;
        java.util.function.DoublePredicate doublePredicate23 = null;
        net.tuis.ubench.UBench uBench24 = uBench20.addDoubleTask("O(n^100)", doubleSupplier22, doublePredicate23);
        java.util.concurrent.TimeUnit timeUnit27 = net.tuis.ubench.UStats.findBestUnit((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport28 = uBench24.press((long) (short) 1, timeUnit27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench16);
        org.junit.Assert.assertNotNull(uBench20);
        org.junit.Assert.assertNotNull(uBench24);
        org.junit.Assert.assertNotNull(timeUnit27);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction2 = null;
        net.tuis.ubench.scale.MathModel mathModel4 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        double[] doubleArray5 = mathModel4.getInitialValues();
        net.tuis.ubench.scale.MathModel mathModel6 = new net.tuis.ubench.scale.MathModel(" with precision -1.0", "%f", doubleArrayFunction2, doubleArray5);
        org.junit.Assert.assertNotNull(mathModel4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0]");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException3 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray4 = uBenchRuntimeException3.getSuppressed();
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException6 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray7 = uBenchRuntimeException6.getSuppressed();
        uBenchRuntimeException3.addSuppressed((java.lang.Throwable) uBenchRuntimeException6);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException12 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException13 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException12);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException14 = new net.tuis.ubench.UBenchRuntimeException("%f*n + %f", (java.lang.Throwable) uBenchRuntimeException13);
        uBenchRuntimeException6.addSuppressed((java.lang.Throwable) uBenchRuntimeException14);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException16 = new net.tuis.ubench.UBenchRuntimeException("%f", (java.lang.Throwable) uBenchRuntimeException14);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException20 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException21 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException20);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException22 = new net.tuis.ubench.UBenchRuntimeException("%f*n + %f", (java.lang.Throwable) uBenchRuntimeException21);
        uBenchRuntimeException16.addSuppressed((java.lang.Throwable) uBenchRuntimeException21);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException24 = new net.tuis.ubench.UBenchRuntimeException("%f * log n", (java.lang.Throwable) uBenchRuntimeException21);
        java.lang.Throwable[] throwableArray25 = uBenchRuntimeException21.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray6 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator7 = mathModel0.createFunction(doubleArray6);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction10 = null;
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction13 = null;
        double[] doubleArray20 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel21 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction13, doubleArray20);
        net.tuis.ubench.scale.MathModel mathModel22 = new net.tuis.ubench.scale.MathModel("net.tuis.ubench.UBenchRuntimeException: ", "", doubleArrayFunction10, doubleArray20);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator23 = mathModel0.createFunction(doubleArray20);
        double[] doubleArray24 = mathModel0.getInitialValues();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator7);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0]");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addIntTask("%f", intSupplier7);
        java.util.function.IntSupplier intSupplier10 = null;
        java.util.function.IntPredicate intPredicate11 = null;
        net.tuis.ubench.UBench uBench12 = uBench8.addIntTask("net\n", intSupplier10, intPredicate11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("O(n^100)", intSupplier14);
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_99PCTILE;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        net.tuis.ubench.UStats[] uStatsArray11 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList12 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList12, uStatsArray11);
        net.tuis.ubench.UReport uReport14 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList12);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator15 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList16 = uReport14.getStats(uStatsComparator15);
        net.tuis.ubench.UReport uReport17 = new net.tuis.ubench.UReport(uStatsList16);
        java.util.List<net.tuis.ubench.UStats> uStatsList18 = uReport17.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator19 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList20 = uReport17.getStats(uStatsComparator19);
        net.tuis.ubench.UReport uReport21 = new net.tuis.ubench.UReport(uStatsList20);
        java.util.List<net.tuis.ubench.UStats> uStatsList22 = uReport21.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator23 = net.tuis.ubench.UReport.BY_ADDED;
        java.util.List<net.tuis.ubench.UStats> uStatsList24 = uReport21.getStats(uStatsComparator23);
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report(uStatsComparator23);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(uStatsComparator15);
        org.junit.Assert.assertNotNull(uStatsList16);
        org.junit.Assert.assertNotNull(uStatsList18);
        org.junit.Assert.assertNotNull(uStatsComparator19);
        org.junit.Assert.assertNotNull(uStatsList20);
        org.junit.Assert.assertNotNull(uStatsList22);
        org.junit.Assert.assertNotNull(uStatsComparator23);
        org.junit.Assert.assertNotNull(uStatsList24);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addIntTask("%f", intSupplier7);
        java.util.function.IntSupplier intSupplier10 = null;
        java.util.function.IntPredicate intPredicate11 = null;
        net.tuis.ubench.UBench uBench12 = uBench8.addIntTask("net\n", intSupplier10, intPredicate11);
        java.util.function.IntSupplier intSupplier14 = null;
        java.util.function.IntPredicate intPredicate15 = null;
        net.tuis.ubench.UBench uBench16 = uBench12.addIntTask("%f * log n", intSupplier14, intPredicate15);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport18 = uBench12.press((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench16);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        net.tuis.ubench.UBench uBench7 = uBench4.addDoubleTask("%f*n + %f", doubleSupplier6);
        java.util.function.IntSupplier intSupplier9 = null;
        java.util.function.IntPredicate intPredicate10 = null;
        net.tuis.ubench.UBench uBench11 = uBench7.addIntTask("%f*n + %f", intSupplier9, intPredicate10);
        java.lang.String str12 = uBench7.getSuiteName();
        java.util.function.DoubleSupplier doubleSupplier14 = null;
        java.util.function.DoublePredicate doublePredicate15 = null;
        net.tuis.ubench.UBench uBench16 = uBench7.addDoubleTask("net\n with precision -1.0", doubleSupplier14, doublePredicate15);
        java.lang.String str17 = uBench7.toString();
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench7);
        org.junit.Assert.assertNotNull(uBench11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str12, "net.tuis.ubench.UBenchRuntimeException: ");
        org.junit.Assert.assertNotNull(uBench16);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        net.tuis.ubench.UReport uReport7 = new net.tuis.ubench.UReport(uStatsList5);
        java.io.Writer writer8 = null;
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator10 = net.tuis.ubench.UReport.BY_95PCTILE;
        // The following exception was thrown during execution in test generation
        try {
            uReport7.report(writer8, "", uStatsComparator10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsComparator10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report("{name: \"O(n)\", valid: true, format: \"net\n\", description: \"net\n\", parameters: [1.000000, -1.000000, -1.000000, -1.000000, 52.000000, 100.000000], rsquare: -1.000000}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException4 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException5 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException4);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException6 = new net.tuis.ubench.UBenchRuntimeException("%f*n + %f", (java.lang.Throwable) uBenchRuntimeException5);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException9 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException10 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException9);
        uBenchRuntimeException6.addSuppressed((java.lang.Throwable) uBenchRuntimeException9);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException15 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray16 = uBenchRuntimeException15.getSuppressed();
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException18 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray19 = uBenchRuntimeException18.getSuppressed();
        uBenchRuntimeException15.addSuppressed((java.lang.Throwable) uBenchRuntimeException18);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException24 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException25 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException24);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException26 = new net.tuis.ubench.UBenchRuntimeException("%f*n + %f", (java.lang.Throwable) uBenchRuntimeException25);
        uBenchRuntimeException18.addSuppressed((java.lang.Throwable) uBenchRuntimeException26);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException28 = new net.tuis.ubench.UBenchRuntimeException("%f", (java.lang.Throwable) uBenchRuntimeException26);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException32 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException33 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException32);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException34 = new net.tuis.ubench.UBenchRuntimeException("%f*n + %f", (java.lang.Throwable) uBenchRuntimeException33);
        uBenchRuntimeException28.addSuppressed((java.lang.Throwable) uBenchRuntimeException33);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException36 = new net.tuis.ubench.UBenchRuntimeException("%f * log n", (java.lang.Throwable) uBenchRuntimeException33);
        uBenchRuntimeException6.addSuppressed((java.lang.Throwable) uBenchRuntimeException33);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException38 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException6);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.lang.Runnable runnable17 = null;
        net.tuis.ubench.UBench uBench18 = uBench15.addTask("%f * log n", runnable17);
        java.lang.String str19 = uBench15.toString();
        java.util.function.IntSupplier intSupplier21 = null;
        net.tuis.ubench.UBench uBench22 = uBench15.addIntTask("{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", intSupplier21);
        java.util.function.LongSupplier longSupplier24 = null;
        java.util.function.LongPredicate longPredicate25 = null;
        net.tuis.ubench.UBench uBench26 = uBench15.addLongTask("{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", longSupplier24, longPredicate25);
        java.util.function.LongSupplier longSupplier28 = null;
        java.util.function.LongPredicate longPredicate29 = null;
        net.tuis.ubench.UBench uBench30 = uBench26.addLongTask("net\n with precision -1.0", longSupplier28, longPredicate29);
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertNotNull(uBench22);
        org.junit.Assert.assertNotNull(uBench26);
        org.junit.Assert.assertNotNull(uBench30);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net\n with precision -1.0");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        java.util.function.LongPredicate longPredicate12 = null;
        net.tuis.ubench.UBench uBench13 = uBench1.addLongTask("O(log n)", longSupplier11, longPredicate12);
        net.tuis.ubench.UMode uMode14 = net.tuis.ubench.UMode.PARALLEL;
        java.util.concurrent.TimeUnit timeUnit20 = net.tuis.ubench.UStats.findBestUnit(0L);
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport21 = uBench13.press(uMode14, 0, 1, (double) ' ', (long) (byte) 0, timeUnit20);
            org.junit.Assert.fail("Expected exception of type net.tuis.ubench.UBenchRuntimeException; message: Parallel Execution failed. See cause.");
        } catch (net.tuis.ubench.UBenchRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench13);
        org.junit.Assert.assertTrue("'" + uMode14 + "' != '" + net.tuis.ubench.UMode.PARALLEL + "'", uMode14.equals(net.tuis.ubench.UMode.PARALLEL));
        org.junit.Assert.assertNotNull(timeUnit20);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator5 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList6 = uReport4.getStats(uStatsComparator5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport4.getStats();
        net.tuis.ubench.UStats[] uStatsArray9 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList10 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList10, uStatsArray9);
        net.tuis.ubench.UReport uReport12 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList10);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator13 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList14 = uReport12.getStats(uStatsComparator13);
        // The following exception was thrown during execution in test generation
        try {
            uReport4.report("net.tuis.ubench.UBenchRuntimeException: %f*n + %f", uStatsComparator13);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator5);
        org.junit.Assert.assertNotNull(uStatsList6);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(uStatsComparator13);
        org.junit.Assert.assertNotNull(uStatsList14);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_99PCTILE;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.io.Writer writer11 = null;
        net.tuis.ubench.UStats[] uStatsArray13 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList14 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList14, uStatsArray13);
        net.tuis.ubench.UReport uReport16 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList14);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator17 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList18 = uReport16.getStats(uStatsComparator17);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator19 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList20 = uReport16.getStats(uStatsComparator19);
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report(writer11, "O(n^100)", uStatsComparator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(uStatsComparator17);
        org.junit.Assert.assertNotNull(uStatsList18);
        org.junit.Assert.assertNotNull(uStatsComparator19);
        org.junit.Assert.assertNotNull(uStatsList20);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("%f");
        java.util.function.DoubleSupplier doubleSupplier3 = null;
        java.util.function.DoublePredicate doublePredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addDoubleTask("O(1)", doubleSupplier3, doublePredicate4);
        org.junit.Assert.assertNotNull(uBench5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray18 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel12.createFunction(doubleArray18);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction22 = null;
        double[] doubleArray29 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel30 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction22, doubleArray29);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator31 = mathModel12.createFunction(doubleArray29);
        net.tuis.ubench.scale.MathModel mathModel32 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray38 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator39 = mathModel32.createFunction(doubleArray38);
        net.tuis.ubench.scale.MathEquation mathEquation42 = new net.tuis.ubench.scale.MathEquation(mathModel11, doubleUnaryOperator31, doubleArray38, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathEquation42.getEquation();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction46 = null;
        double[] doubleArray53 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel54 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction46, doubleArray53);
        net.tuis.ubench.scale.MathEquation mathEquation57 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator43, doubleArray53, "net\n", (double) (short) -1);
        java.lang.String str58 = mathEquation57.toString();
        double double59 = mathEquation57.getRSquared();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator60 = mathEquation57.getEquation();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator31);
        org.junit.Assert.assertNotNull(mathModel32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator39);
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "net\n with precision -1.0" + "'", str58, "net\n with precision -1.0");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleUnaryOperator60);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray8 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel2.createFunction(doubleArray8);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction12 = null;
        double[] doubleArray19 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel20 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction12, doubleArray19);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator21 = mathModel2.createFunction(doubleArray19);
        net.tuis.ubench.scale.MathModel mathModel22 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray28 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator29 = mathModel22.createFunction(doubleArray28);
        net.tuis.ubench.scale.MathEquation mathEquation32 = new net.tuis.ubench.scale.MathEquation(mathModel1, doubleUnaryOperator21, doubleArray28, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator33 = mathEquation32.getEquation();
        double[] doubleArray34 = mathEquation32.getParameters();
        net.tuis.ubench.scale.MathModel mathModel35 = mathEquation32.getModel();
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator21);
        org.junit.Assert.assertNotNull(mathModel22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator29);
        org.junit.Assert.assertNotNull(doubleUnaryOperator33);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(mathModel35);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray8 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel2.createFunction(doubleArray8);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction12 = null;
        double[] doubleArray19 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel20 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction12, doubleArray19);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator21 = mathModel2.createFunction(doubleArray19);
        net.tuis.ubench.scale.MathModel mathModel22 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray28 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator29 = mathModel22.createFunction(doubleArray28);
        net.tuis.ubench.scale.MathEquation mathEquation32 = new net.tuis.ubench.scale.MathEquation(mathModel1, doubleUnaryOperator21, doubleArray28, "", (double) (short) -1);
        double double33 = mathEquation32.getRSquared();
        boolean boolean34 = mathEquation32.isValid();
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator21);
        org.junit.Assert.assertNotNull(mathModel22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator29);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.lang.Class<?> wildcardClass7 = uStatsList5.getClass();
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("{name: \"O(n)\", valid: true, format: \"net\n\", description: \"net\n\", parameters: [1.000000, -1.000000, -1.000000, -1.000000, 52.000000, 100.000000], rsquare: -1.000000}");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        java.lang.String str10 = mathModel0.getFormat();
        double[] doubleArray11 = mathModel0.getInitialValues();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "%f*n + %f" + "'", str10, "%f*n + %f");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 0.0]");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.util.function.LongSupplier longSupplier6 = null;
        java.util.function.LongPredicate longPredicate7 = null;
        net.tuis.ubench.UBench uBench8 = uBench4.addLongTask("", longSupplier6, longPredicate7);
        java.util.function.IntSupplier intSupplier10 = null;
        net.tuis.ubench.UBench uBench11 = uBench8.addIntTask("hi!", intSupplier10);
        java.util.function.IntSupplier intSupplier13 = null;
        java.util.function.IntPredicate intPredicate14 = null;
        net.tuis.ubench.UBench uBench15 = uBench11.addIntTask("net\n", intSupplier13, intPredicate14);
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench11);
        org.junit.Assert.assertNotNull(uBench15);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        double[] doubleArray10 = mathModel0.getInitialValues();
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray18 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel12.createFunction(doubleArray18);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator20 = mathModel11.createFunction(doubleArray18);
        double[] doubleArray21 = mathModel11.getInitialValues();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator22 = mathModel0.createFunction(doubleArray21);
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleUnaryOperator20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator22);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport5 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.List<net.tuis.ubench.UStats> uStatsList6 = uReport5.getStats();
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsList6);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.function.LongSupplier longSupplier17 = null;
        net.tuis.ubench.UBench uBench18 = uBench15.addLongTask("net\n with precision -1.0", longSupplier17);
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray1 = mathModel0.getInitialValues();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction4 = null;
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction7 = null;
        double[] doubleArray14 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel15 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction7, doubleArray14);
        net.tuis.ubench.scale.MathModel mathModel16 = new net.tuis.ubench.scale.MathModel("net.tuis.ubench.UBenchRuntimeException: ", "", doubleArrayFunction4, doubleArray14);
        net.tuis.ubench.scale.MathModel mathModel17 = net.tuis.ubench.scale.Models.LOG_N;
        java.lang.String str18 = mathModel17.toString();
        net.tuis.ubench.scale.MathModel mathModel19 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel20 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray26 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator27 = mathModel20.createFunction(doubleArray26);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator28 = mathModel19.createFunction(doubleArray26);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction31 = null;
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction34 = null;
        double[] doubleArray41 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel42 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction34, doubleArray41);
        net.tuis.ubench.scale.MathModel mathModel43 = new net.tuis.ubench.scale.MathModel("net.tuis.ubench.UBenchRuntimeException: ", "", doubleArrayFunction31, doubleArray41);
        net.tuis.ubench.scale.MathEquation mathEquation46 = new net.tuis.ubench.scale.MathEquation(mathModel17, doubleUnaryOperator28, doubleArray41, "net.tuis.ubench.UBenchRuntimeException: %f*n + %f", (double) (short) 10);
        net.tuis.ubench.scale.MathModel mathModel47 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel48 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray54 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator55 = mathModel48.createFunction(doubleArray54);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator56 = mathModel47.createFunction(doubleArray54);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator57 = mathModel17.createFunction(doubleArray54);
        net.tuis.ubench.scale.MathModel mathModel58 = net.tuis.ubench.scale.Models.LOG_N;
        java.lang.String str59 = mathModel58.toString();
        double[] doubleArray63 = new double[] { 100L, (short) 0, (byte) -1 };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator64 = mathModel58.createFunction(doubleArray63);
        net.tuis.ubench.scale.MathModel mathModel65 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel66 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray72 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator73 = mathModel66.createFunction(doubleArray72);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator74 = mathModel65.createFunction(doubleArray72);
        double[] doubleArray75 = mathModel65.getInitialValues();
        double[] doubleArray81 = new double[] { (short) 1, ' ', ' ', 10.0d, ' ' };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator82 = mathModel65.createFunction(doubleArray81);
        net.tuis.ubench.scale.MathModel mathModel83 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel84 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray90 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator91 = mathModel84.createFunction(doubleArray90);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator92 = mathModel83.createFunction(doubleArray90);
        net.tuis.ubench.scale.MathEquation mathEquation95 = new net.tuis.ubench.scale.MathEquation(mathModel58, doubleUnaryOperator82, doubleArray90, "O(1)", (double) 1);
        net.tuis.ubench.scale.MathEquation mathEquation98 = new net.tuis.ubench.scale.MathEquation(mathModel16, doubleUnaryOperator57, doubleArray90, "O(1)", (double) (-1));
        java.util.function.DoubleUnaryOperator doubleUnaryOperator99 = mathModel0.createFunction(doubleArray90);
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(mathModel17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "%f * log n" + "'", str18, "%f * log n");
        org.junit.Assert.assertNotNull(mathModel19);
        org.junit.Assert.assertNotNull(mathModel20);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator27);
        org.junit.Assert.assertNotNull(doubleUnaryOperator28);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(mathModel47);
        org.junit.Assert.assertNotNull(mathModel48);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator55);
        org.junit.Assert.assertNotNull(doubleUnaryOperator56);
        org.junit.Assert.assertNotNull(doubleUnaryOperator57);
        org.junit.Assert.assertNotNull(mathModel58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "%f * log n" + "'", str59, "%f * log n");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator64);
        org.junit.Assert.assertNotNull(mathModel65);
        org.junit.Assert.assertNotNull(mathModel66);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator73);
        org.junit.Assert.assertNotNull(doubleUnaryOperator74);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[1.0, 32.0, 32.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator82);
        org.junit.Assert.assertNotNull(mathModel83);
        org.junit.Assert.assertNotNull(mathModel84);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator91);
        org.junit.Assert.assertNotNull(doubleUnaryOperator92);
        org.junit.Assert.assertNotNull(doubleUnaryOperator99);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_99PCTILE;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_99PCTILE;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report(writer11, "%f*n + %f");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException1 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray2 = uBenchRuntimeException1.getSuppressed();
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException4 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray5 = uBenchRuntimeException4.getSuppressed();
        uBenchRuntimeException1.addSuppressed((java.lang.Throwable) uBenchRuntimeException4);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException9 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException10 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException9);
        uBenchRuntimeException4.addSuppressed((java.lang.Throwable) uBenchRuntimeException9);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException13 = new net.tuis.ubench.UBenchRuntimeException("%f");
        uBenchRuntimeException4.addSuppressed((java.lang.Throwable) uBenchRuntimeException13);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.util.concurrent.TimeUnit timeUnit1 = net.tuis.ubench.UStats.findBestUnit((long) (byte) 100);
        org.junit.Assert.assertNotNull(timeUnit1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.lang.Runnable runnable6 = null;
        net.tuis.ubench.UBench uBench7 = uBench4.addTask("net.tuis.ubench.UBenchRuntimeException: ", runnable6);
        java.lang.Runnable runnable9 = null;
        net.tuis.ubench.UBench uBench10 = uBench4.addTask("%f", runnable9);
        java.lang.String str11 = uBench4.getSuiteName();
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench7);
        org.junit.Assert.assertNotNull(uBench10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str11, "net.tuis.ubench.UBenchRuntimeException: ");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray8 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel2.createFunction(doubleArray8);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction12 = null;
        double[] doubleArray19 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel20 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction12, doubleArray19);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator21 = mathModel2.createFunction(doubleArray19);
        net.tuis.ubench.scale.MathModel mathModel22 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray28 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator29 = mathModel22.createFunction(doubleArray28);
        net.tuis.ubench.scale.MathEquation mathEquation32 = new net.tuis.ubench.scale.MathEquation(mathModel1, doubleUnaryOperator21, doubleArray28, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator33 = mathEquation32.getEquation();
        double[] doubleArray34 = mathEquation32.getParameters();
        double[] doubleArray35 = mathEquation32.getParameters();
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator21);
        org.junit.Assert.assertNotNull(mathModel22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator29);
        org.junit.Assert.assertNotNull(doubleUnaryOperator33);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, -1.0, 0.0, -1.0, 100.0]");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        net.tuis.ubench.scale.MathModel mathModel10 = net.tuis.ubench.scale.Models.LOG_N;
        java.lang.String str11 = mathModel10.toString();
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel13 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray19 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator20 = mathModel13.createFunction(doubleArray19);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator21 = mathModel12.createFunction(doubleArray19);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction24 = null;
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction27 = null;
        double[] doubleArray34 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel35 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction27, doubleArray34);
        net.tuis.ubench.scale.MathModel mathModel36 = new net.tuis.ubench.scale.MathModel("net.tuis.ubench.UBenchRuntimeException: ", "", doubleArrayFunction24, doubleArray34);
        net.tuis.ubench.scale.MathEquation mathEquation39 = new net.tuis.ubench.scale.MathEquation(mathModel10, doubleUnaryOperator21, doubleArray34, "net.tuis.ubench.UBenchRuntimeException: %f*n + %f", (double) (short) 10);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator40 = mathModel0.createFunction(doubleArray34);
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(mathModel10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "%f * log n" + "'", str11, "%f * log n");
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(mathModel13);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator20);
        org.junit.Assert.assertNotNull(doubleUnaryOperator21);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator40);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addIntTask("%f", intSupplier7);
        java.util.function.IntSupplier intSupplier10 = null;
        java.util.function.IntPredicate intPredicate11 = null;
        net.tuis.ubench.UBench uBench12 = uBench8.addIntTask("net\n", intSupplier10, intPredicate11);
        java.util.function.LongSupplier longSupplier14 = null;
        java.util.function.LongPredicate longPredicate15 = null;
        net.tuis.ubench.UBench uBench16 = uBench12.addLongTask("{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", longSupplier14, longPredicate15);
        java.lang.String str17 = uBench16.getSuiteName();
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str17, "net.tuis.ubench.UBenchRuntimeException: ");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("%f*n + %f");
        java.util.function.LongSupplier longSupplier3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addLongTask("O(1)", longSupplier3);
        java.lang.String str5 = uBench1.getSuiteName();
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport7 = uBench1.press(1000000000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "%f*n + %f" + "'", str5, "%f*n + %f");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) (byte) 10);
        org.junit.Assert.assertNotNull(mathModel1);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray18 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel12.createFunction(doubleArray18);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction22 = null;
        double[] doubleArray29 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel30 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction22, doubleArray29);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator31 = mathModel12.createFunction(doubleArray29);
        net.tuis.ubench.scale.MathModel mathModel32 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray38 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator39 = mathModel32.createFunction(doubleArray38);
        net.tuis.ubench.scale.MathEquation mathEquation42 = new net.tuis.ubench.scale.MathEquation(mathModel11, doubleUnaryOperator31, doubleArray38, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathEquation42.getEquation();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction46 = null;
        double[] doubleArray53 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel54 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction46, doubleArray53);
        net.tuis.ubench.scale.MathEquation mathEquation57 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator43, doubleArray53, "net\n", (double) (short) -1);
        java.lang.String str58 = mathEquation57.getDescription();
        java.lang.String str59 = mathEquation57.getDescription();
        java.lang.String str60 = mathEquation57.toJSONString();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator31);
        org.junit.Assert.assertNotNull(mathModel32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator39);
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "net\n" + "'", str58, "net\n");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "net\n" + "'", str59, "net\n");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "{name: \"O(n)\", valid: true, format: \"net\n\", description: \"net\n\", parameters: [1.000000, -1.000000, -1.000000, -1.000000, 52.000000, 100.000000], rsquare: -1.000000}" + "'", str60, "{name: \"O(n)\", valid: true, format: \"net\n\", description: \"net\n\", parameters: [1.000000, -1.000000, -1.000000, -1.000000, 52.000000, 100.000000], rsquare: -1.000000}");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.lang.String str10 = uBench1.toString();
        java.util.function.LongSupplier longSupplier12 = null;
        java.util.function.LongPredicate longPredicate13 = null;
        net.tuis.ubench.UBench uBench14 = uBench1.addLongTask("O(1)", longSupplier12, longPredicate13);
        java.util.function.LongSupplier longSupplier16 = null;
        net.tuis.ubench.UBench uBench17 = uBench14.addLongTask("net.tuis.ubench.UBenchRuntimeException: ", longSupplier16);
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench14);
        org.junit.Assert.assertNotNull(uBench17);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray8 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel2.createFunction(doubleArray8);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction12 = null;
        double[] doubleArray19 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel20 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction12, doubleArray19);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator21 = mathModel2.createFunction(doubleArray19);
        net.tuis.ubench.scale.MathModel mathModel22 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray28 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator29 = mathModel22.createFunction(doubleArray28);
        net.tuis.ubench.scale.MathEquation mathEquation32 = new net.tuis.ubench.scale.MathEquation(mathModel1, doubleUnaryOperator21, doubleArray28, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator33 = mathEquation32.getEquation();
        java.lang.String str34 = mathEquation32.toJSONString();
        double double35 = mathEquation32.getRSquared();
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator21);
        org.junit.Assert.assertNotNull(mathModel22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator29);
        org.junit.Assert.assertNotNull(doubleUnaryOperator33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}" + "'", str34, "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport.title(writer0, "net.tuis.ubench.UBenchRuntimeException: %f*n + %f");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        java.util.List<net.tuis.ubench.UStats> uStatsList6 = uReport3.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_95PCTILE;
        // The following exception was thrown during execution in test generation
        try {
            uReport3.report("", uStatsComparator8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList6);
        org.junit.Assert.assertNotNull(uStatsComparator8);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator5 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList6 = uReport4.getStats(uStatsComparator5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport4.getStats();
        net.tuis.ubench.UReport uReport8 = new net.tuis.ubench.UReport(uStatsList7);
        net.tuis.ubench.UReport uReport9 = new net.tuis.ubench.UReport(uStatsList7);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator10 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport9.getStats(uStatsComparator10);
        // The following exception was thrown during execution in test generation
        try {
            uReport9.report();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator5);
        org.junit.Assert.assertNotNull(uStatsList6);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator10);
        org.junit.Assert.assertNotNull(uStatsList11);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.function.LongSupplier longSupplier17 = null;
        java.util.function.LongPredicate longPredicate18 = null;
        net.tuis.ubench.UBench uBench19 = uBench15.addLongTask("", longSupplier17, longPredicate18);
        net.tuis.ubench.UMode uMode20 = net.tuis.ubench.UMode.INTERLEAVED;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport22 = uBench19.press(uMode20, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench19);
        org.junit.Assert.assertTrue("'" + uMode20 + "' != '" + net.tuis.ubench.UMode.INTERLEAVED + "'", uMode20.equals(net.tuis.ubench.UMode.INTERLEAVED));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator5 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList6 = uReport4.getStats(uStatsComparator5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport4.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList8 = uReport4.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator10 = net.tuis.ubench.UReport.BY_99PCTILE;
        // The following exception was thrown during execution in test generation
        try {
            uReport4.report("hi!", uStatsComparator10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator5);
        org.junit.Assert.assertNotNull(uStatsList6);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsList8);
        org.junit.Assert.assertNotNull(uStatsComparator10);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        java.io.Writer writer12 = null;
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator14 = net.tuis.ubench.UReport.BY_CONSISTENCY;
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report(writer12, "O(n^100)", uStatsComparator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsComparator14);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.util.function.DoubleSupplier doubleSupplier6 = null;
        net.tuis.ubench.UBench uBench7 = uBench4.addDoubleTask("%f*n + %f", doubleSupplier6);
        java.util.function.IntSupplier intSupplier9 = null;
        java.util.function.IntPredicate intPredicate10 = null;
        net.tuis.ubench.UBench uBench11 = uBench7.addIntTask("%f*n + %f", intSupplier9, intPredicate10);
        java.lang.String str12 = uBench7.getSuiteName();
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench7.addIntTask("{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", intSupplier14);
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench7);
        org.junit.Assert.assertNotNull(uBench11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str12, "net.tuis.ubench.UBenchRuntimeException: ");
        org.junit.Assert.assertNotNull(uBench15);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addLongTask("net\n", longSupplier3);
        java.util.function.IntSupplier intSupplier6 = null;
        net.tuis.ubench.UBench uBench7 = uBench4.addIntTask("O(log n)", intSupplier6);
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench7);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList13 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList14 = uReport10.getStats();
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsList12);
        org.junit.Assert.assertNotNull(uStatsList13);
        org.junit.Assert.assertNotNull(uStatsList14);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) 'a');
        org.junit.Assert.assertNotNull(mathModel1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("%f*n + %f");
        java.util.function.LongSupplier longSupplier3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addLongTask("O(1)", longSupplier3);
        java.util.function.IntSupplier intSupplier6 = null;
        java.util.function.IntPredicate intPredicate7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addIntTask("O(log n)", intSupplier6, intPredicate7);
        java.util.function.IntSupplier intSupplier10 = null;
        java.util.function.IntPredicate intPredicate11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addIntTask("{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", intSupplier10, intPredicate11);
        java.lang.String str13 = uBench12.toString();
        java.util.function.IntSupplier intSupplier15 = null;
        java.util.function.IntPredicate intPredicate16 = null;
        net.tuis.ubench.UBench uBench17 = uBench12.addIntTask("%f*n^100 + %f*n^99 + %f*n^98 + %f*n^97 + %f*n^96 + %f*n^95 + %f*n^94 + %f*n^93 + %f*n^92 + %f*n^91 + %f*n^90 + %f*n^89 + %f*n^88 + %f*n^87 + %f*n^86 + %f*n^85 + %f*n^84 + %f*n^83 + %f*n^82 + %f*n^81 + %f*n^80 + %f*n^79 + %f*n^78 + %f*n^77 + %f*n^76 + %f*n^75 + %f*n^74 + %f*n^73 + %f*n^72 + %f*n^71 + %f*n^70 + %f*n^69 + %f*n^68 + %f*n^67 + %f*n^66 + %f*n^65 + %f*n^64 + %f*n^63 + %f*n^62 + %f*n^61 + %f*n^60 + %f*n^59 + %f*n^58 + %f*n^57 + %f*n^56 + %f*n^55 + %f*n^54 + %f*n^53 + %f*n^52 + %f*n^51 + %f*n^50 + %f*n^49 + %f*n^48 + %f*n^47 + %f*n^46 + %f*n^45 + %f*n^44 + %f*n^43 + %f*n^42 + %f*n^41 + %f*n^40 + %f*n^39 + %f*n^38 + %f*n^37 + %f*n^36 + %f*n^35 + %f*n^34 + %f*n^33 + %f*n^32 + %f*n^31 + %f*n^30 + %f*n^29 + %f*n^28 + %f*n^27 + %f*n^26 + %f*n^25 + %f*n^24 + %f*n^23 + %f*n^22 + %f*n^21 + %f*n^20 + %f*n^19 + %f*n^18 + %f*n^17 + %f*n^16 + %f*n^15 + %f*n^14 + %f*n^13 + %f*n^12 + %f*n^11 + %f*n^10 + %f*n^9 + %f*n^8 + %f*n^7 + %f*n^6 + %f*n^5 + %f*n^4 + %f*n^3 + %f*n^2 + %f*n + %f", intSupplier15, intPredicate16);
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench17);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.lang.String str10 = uBench1.toString();
        java.util.function.LongSupplier longSupplier12 = null;
        java.util.function.LongPredicate longPredicate13 = null;
        net.tuis.ubench.UBench uBench14 = uBench1.addLongTask("O(1)", longSupplier12, longPredicate13);
        java.lang.String str15 = uBench14.toString();
        java.util.function.IntSupplier intSupplier17 = null;
        net.tuis.ubench.UBench uBench18 = uBench14.addIntTask("%f*n^100 + %f*n^99 + %f*n^98 + %f*n^97 + %f*n^96 + %f*n^95 + %f*n^94 + %f*n^93 + %f*n^92 + %f*n^91 + %f*n^90 + %f*n^89 + %f*n^88 + %f*n^87 + %f*n^86 + %f*n^85 + %f*n^84 + %f*n^83 + %f*n^82 + %f*n^81 + %f*n^80 + %f*n^79 + %f*n^78 + %f*n^77 + %f*n^76 + %f*n^75 + %f*n^74 + %f*n^73 + %f*n^72 + %f*n^71 + %f*n^70 + %f*n^69 + %f*n^68 + %f*n^67 + %f*n^66 + %f*n^65 + %f*n^64 + %f*n^63 + %f*n^62 + %f*n^61 + %f*n^60 + %f*n^59 + %f*n^58 + %f*n^57 + %f*n^56 + %f*n^55 + %f*n^54 + %f*n^53 + %f*n^52 + %f*n^51 + %f*n^50 + %f*n^49 + %f*n^48 + %f*n^47 + %f*n^46 + %f*n^45 + %f*n^44 + %f*n^43 + %f*n^42 + %f*n^41 + %f*n^40 + %f*n^39 + %f*n^38 + %f*n^37 + %f*n^36 + %f*n^35 + %f*n^34 + %f*n^33 + %f*n^32 + %f*n^31 + %f*n^30 + %f*n^29 + %f*n^28 + %f*n^27 + %f*n^26 + %f*n^25 + %f*n^24 + %f*n^23 + %f*n^22 + %f*n^21 + %f*n^20 + %f*n^19 + %f*n^18 + %f*n^17 + %f*n^16 + %f*n^15 + %f*n^14 + %f*n^13 + %f*n^12 + %f*n^11 + %f*n^10 + %f*n^9 + %f*n^8 + %f*n^7 + %f*n^6 + %f*n^5 + %f*n^4 + %f*n^3 + %f*n^2 + %f*n + %f", intSupplier17);
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench14);
        org.junit.Assert.assertNotNull(uBench18);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        java.util.List<net.tuis.ubench.UStats> uStatsList10 = uReport6.getStats();
        java.io.Writer writer11 = null;
        net.tuis.ubench.UStats[] uStatsArray13 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList14 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList14, uStatsArray13);
        net.tuis.ubench.UReport uReport16 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList14);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator17 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList18 = uReport16.getStats(uStatsComparator17);
        net.tuis.ubench.UStats[] uStatsArray19 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList20 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList20, uStatsArray19);
        net.tuis.ubench.UReport uReport22 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList20);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator23 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList24 = uReport22.getStats(uStatsComparator23);
        net.tuis.ubench.UReport uReport25 = new net.tuis.ubench.UReport(uStatsList24);
        java.util.List<net.tuis.ubench.UStats> uStatsList26 = uReport25.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator27 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList28 = uReport25.getStats(uStatsComparator27);
        net.tuis.ubench.UReport uReport29 = new net.tuis.ubench.UReport(uStatsList28);
        java.util.List<net.tuis.ubench.UStats> uStatsList30 = uReport29.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator31 = net.tuis.ubench.UReport.BY_ADDED;
        java.util.List<net.tuis.ubench.UStats> uStatsList32 = uReport29.getStats(uStatsComparator31);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator33 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList34 = uReport29.getStats(uStatsComparator33);
        java.util.List<net.tuis.ubench.UStats> uStatsList35 = uReport16.getStats(uStatsComparator33);
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(writer11, "", uStatsComparator33);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList10);
        org.junit.Assert.assertNotNull(uStatsArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(uStatsComparator17);
        org.junit.Assert.assertNotNull(uStatsList18);
        org.junit.Assert.assertNotNull(uStatsArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(uStatsComparator23);
        org.junit.Assert.assertNotNull(uStatsList24);
        org.junit.Assert.assertNotNull(uStatsList26);
        org.junit.Assert.assertNotNull(uStatsComparator27);
        org.junit.Assert.assertNotNull(uStatsList28);
        org.junit.Assert.assertNotNull(uStatsList30);
        org.junit.Assert.assertNotNull(uStatsComparator31);
        org.junit.Assert.assertNotNull(uStatsList32);
        org.junit.Assert.assertNotNull(uStatsComparator33);
        org.junit.Assert.assertNotNull(uStatsList34);
        org.junit.Assert.assertNotNull(uStatsList35);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        java.lang.String str1 = mathModel0.toString();
        double[] doubleArray5 = new double[] { 100L, (short) 0, (byte) -1 };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator6 = mathModel0.createFunction(doubleArray5);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction9 = null;
        double[] doubleArray16 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel17 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction9, doubleArray16);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator18 = mathModel0.createFunction(doubleArray16);
        java.lang.String str19 = mathModel0.getFormat();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "%f * log n" + "'", str1, "%f * log n");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator6);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "%f * log n" + "'", str19, "%f * log n");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray8 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel2.createFunction(doubleArray8);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction12 = null;
        double[] doubleArray19 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel20 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction12, doubleArray19);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator21 = mathModel2.createFunction(doubleArray19);
        net.tuis.ubench.scale.MathModel mathModel22 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray28 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator29 = mathModel22.createFunction(doubleArray28);
        net.tuis.ubench.scale.MathEquation mathEquation32 = new net.tuis.ubench.scale.MathEquation(mathModel1, doubleUnaryOperator21, doubleArray28, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator33 = mathEquation32.getEquation();
        java.lang.String str34 = mathEquation32.toJSONString();
        boolean boolean35 = mathEquation32.isValid();
        java.lang.String str36 = mathEquation32.getDescription();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator37 = mathEquation32.getEquation();
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator21);
        org.junit.Assert.assertNotNull(mathModel22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator29);
        org.junit.Assert.assertNotNull(doubleUnaryOperator33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}" + "'", str34, "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(doubleUnaryOperator37);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray8 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel2.createFunction(doubleArray8);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction12 = null;
        double[] doubleArray19 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel20 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction12, doubleArray19);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator21 = mathModel2.createFunction(doubleArray19);
        net.tuis.ubench.scale.MathModel mathModel22 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray28 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator29 = mathModel22.createFunction(doubleArray28);
        net.tuis.ubench.scale.MathEquation mathEquation32 = new net.tuis.ubench.scale.MathEquation(mathModel1, doubleUnaryOperator21, doubleArray28, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator33 = mathEquation32.getEquation();
        java.lang.String str34 = mathEquation32.toJSONString();
        boolean boolean35 = mathEquation32.isValid();
        java.lang.String str36 = mathEquation32.getFormat();
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator21);
        org.junit.Assert.assertNotNull(mathModel22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator29);
        org.junit.Assert.assertNotNull(doubleUnaryOperator33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}" + "'", str34, "{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        double[] doubleArray10 = mathModel0.getInitialValues();
        java.lang.String str11 = mathModel0.getFormat();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "%f*n + %f" + "'", str11, "%f*n + %f");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException1 = new net.tuis.ubench.UBenchRuntimeException("O(log n)");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException1 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray2 = uBenchRuntimeException1.getSuppressed();
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException4 = new net.tuis.ubench.UBenchRuntimeException("");
        java.lang.Throwable[] throwableArray5 = uBenchRuntimeException4.getSuppressed();
        uBenchRuntimeException1.addSuppressed((java.lang.Throwable) uBenchRuntimeException4);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException9 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException10 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException9);
        uBenchRuntimeException4.addSuppressed((java.lang.Throwable) uBenchRuntimeException9);
        java.lang.Throwable[] throwableArray12 = uBenchRuntimeException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.io.Writer writer7 = null;
        net.tuis.ubench.UStats[] uStatsArray9 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList10 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList10, uStatsArray9);
        net.tuis.ubench.UReport uReport12 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList10);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator13 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList14 = uReport12.getStats(uStatsComparator13);
        net.tuis.ubench.UReport uReport15 = new net.tuis.ubench.UReport(uStatsList14);
        java.util.List<net.tuis.ubench.UStats> uStatsList16 = uReport15.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator17 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList18 = uReport15.getStats(uStatsComparator17);
        net.tuis.ubench.UReport uReport19 = new net.tuis.ubench.UReport(uStatsList18);
        java.util.List<net.tuis.ubench.UStats> uStatsList20 = uReport19.getStats();
        net.tuis.ubench.UStats[] uStatsArray21 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList22 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList22, uStatsArray21);
        net.tuis.ubench.UReport uReport24 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList22);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator25 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList26 = uReport24.getStats(uStatsComparator25);
        net.tuis.ubench.UReport uReport27 = new net.tuis.ubench.UReport(uStatsList26);
        java.util.List<net.tuis.ubench.UStats> uStatsList28 = uReport27.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator29 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList30 = uReport27.getStats(uStatsComparator29);
        java.util.List<net.tuis.ubench.UStats> uStatsList31 = uReport19.getStats(uStatsComparator29);
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(writer7, "net\n", uStatsComparator29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(uStatsComparator13);
        org.junit.Assert.assertNotNull(uStatsList14);
        org.junit.Assert.assertNotNull(uStatsList16);
        org.junit.Assert.assertNotNull(uStatsComparator17);
        org.junit.Assert.assertNotNull(uStatsList18);
        org.junit.Assert.assertNotNull(uStatsList20);
        org.junit.Assert.assertNotNull(uStatsArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(uStatsComparator25);
        org.junit.Assert.assertNotNull(uStatsList26);
        org.junit.Assert.assertNotNull(uStatsList28);
        org.junit.Assert.assertNotNull(uStatsComparator29);
        org.junit.Assert.assertNotNull(uStatsList30);
        org.junit.Assert.assertNotNull(uStatsList31);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("%f*n + %f");
        java.util.function.LongSupplier longSupplier3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addLongTask("O(1)", longSupplier3);
        java.util.function.IntSupplier intSupplier6 = null;
        java.util.function.IntPredicate intPredicate7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addIntTask("O(log n)", intSupplier6, intPredicate7);
        java.util.function.IntSupplier intSupplier10 = null;
        java.util.function.IntPredicate intPredicate11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addIntTask("{name: \"O(1)\", valid: true, format: \"\", description: \"\", parameters: [10.000000, -1.000000, 0.000000, -1.000000, 100.000000], rsquare: -1.000000}", intSupplier10, intPredicate11);
        java.lang.Runnable runnable14 = null;
        net.tuis.ubench.UBench uBench15 = uBench1.addTask("hi!", runnable14);
        java.util.function.LongSupplier longSupplier17 = null;
        net.tuis.ubench.UBench uBench18 = uBench15.addLongTask("net\n", longSupplier17);
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        java.util.List<net.tuis.ubench.UStats> uStatsList11 = uReport10.getStats();
        java.util.List<net.tuis.ubench.UStats> uStatsList12 = uReport10.getStats();
        net.tuis.ubench.UStats[] uStatsArray13 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList14 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList14, uStatsArray13);
        net.tuis.ubench.UReport uReport16 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList14);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator17 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList18 = uReport16.getStats(uStatsComparator17);
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report(uStatsComparator17);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
        org.junit.Assert.assertNotNull(uStatsList11);
        org.junit.Assert.assertNotNull(uStatsList12);
        org.junit.Assert.assertNotNull(uStatsArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(uStatsComparator17);
        org.junit.Assert.assertNotNull(uStatsList18);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("%f");
        java.util.function.DoubleSupplier doubleSupplier3 = null;
        java.util.function.DoublePredicate doublePredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addDoubleTask("net\n with precision -1.0", doubleSupplier3, doublePredicate4);
        org.junit.Assert.assertNotNull(uBench5);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_SLOWEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList9 = uReport6.getStats(uStatsComparator8);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport(uStatsList9);
        // The following exception was thrown during execution in test generation
        try {
            uReport10.report("net.tuis.ubench.UBenchRuntimeException: %f*n + %f");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsComparator8);
        org.junit.Assert.assertNotNull(uStatsList9);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException2 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException3 = new net.tuis.ubench.UBenchRuntimeException("", (java.lang.Throwable) uBenchRuntimeException2);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        java.util.function.IntPredicate intPredicate8 = null;
        net.tuis.ubench.UBench uBench9 = uBench1.addIntTask("", intSupplier7, intPredicate8);
        java.util.function.LongSupplier longSupplier11 = null;
        net.tuis.ubench.UBench uBench12 = uBench1.addLongTask("", longSupplier11);
        java.util.function.IntSupplier intSupplier14 = null;
        net.tuis.ubench.UBench uBench15 = uBench12.addIntTask("", intSupplier14);
        java.util.function.LongSupplier longSupplier17 = null;
        net.tuis.ubench.UBench uBench18 = uBench12.addLongTask("%f * log n", longSupplier17);
        java.lang.String str19 = uBench18.getSuiteName();
        java.util.function.DoubleSupplier doubleSupplier21 = null;
        net.tuis.ubench.UBench uBench22 = uBench18.addDoubleTask("%f", doubleSupplier21);
        java.util.function.DoubleSupplier doubleSupplier24 = null;
        java.util.function.DoublePredicate doublePredicate25 = null;
        net.tuis.ubench.UBench uBench26 = uBench22.addDoubleTask("%f*n + %f", doubleSupplier24, doublePredicate25);
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench9);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench15);
        org.junit.Assert.assertNotNull(uBench18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "net.tuis.ubench.UBenchRuntimeException: " + "'", str19, "net.tuis.ubench.UBenchRuntimeException: ");
        org.junit.Assert.assertNotNull(uBench22);
        org.junit.Assert.assertNotNull(uBench26);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.io.Writer writer7 = null;
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator8 = net.tuis.ubench.UReport.BY_AVERAGE;
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(writer7, uStatsComparator8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsComparator8);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator4 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList5 = uReport3.getStats(uStatsComparator4);
        net.tuis.ubench.UReport uReport6 = new net.tuis.ubench.UReport(uStatsList5);
        java.util.List<net.tuis.ubench.UStats> uStatsList7 = uReport6.getStats();
        net.tuis.ubench.UStats[] uStatsArray8 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList9 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList9, uStatsArray8);
        net.tuis.ubench.UReport uReport11 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList9);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator12 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList13 = uReport11.getStats(uStatsComparator12);
        // The following exception was thrown during execution in test generation
        try {
            uReport6.report(uStatsComparator12);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsComparator4);
        org.junit.Assert.assertNotNull(uStatsList5);
        org.junit.Assert.assertNotNull(uStatsList7);
        org.junit.Assert.assertNotNull(uStatsArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(uStatsComparator12);
        org.junit.Assert.assertNotNull(uStatsList13);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.lang.Runnable runnable3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addTask("net\n", runnable3);
        java.lang.Runnable runnable6 = null;
        net.tuis.ubench.UBench uBench7 = uBench4.addTask("net.tuis.ubench.UBenchRuntimeException: ", runnable6);
        java.util.function.LongSupplier longSupplier9 = null;
        net.tuis.ubench.UBench uBench10 = uBench7.addLongTask("%f*n + %f", longSupplier9);
        java.util.function.IntSupplier intSupplier12 = null;
        java.util.function.IntPredicate intPredicate13 = null;
        net.tuis.ubench.UBench uBench14 = uBench10.addIntTask("", intSupplier12, intPredicate13);
        java.util.function.DoubleSupplier doubleSupplier16 = null;
        java.util.function.DoublePredicate doublePredicate17 = null;
        net.tuis.ubench.UBench uBench18 = uBench10.addDoubleTask("%f*n^100 + %f*n^99 + %f*n^98 + %f*n^97 + %f*n^96 + %f*n^95 + %f*n^94 + %f*n^93 + %f*n^92 + %f*n^91 + %f*n^90 + %f*n^89 + %f*n^88 + %f*n^87 + %f*n^86 + %f*n^85 + %f*n^84 + %f*n^83 + %f*n^82 + %f*n^81 + %f*n^80 + %f*n^79 + %f*n^78 + %f*n^77 + %f*n^76 + %f*n^75 + %f*n^74 + %f*n^73 + %f*n^72 + %f*n^71 + %f*n^70 + %f*n^69 + %f*n^68 + %f*n^67 + %f*n^66 + %f*n^65 + %f*n^64 + %f*n^63 + %f*n^62 + %f*n^61 + %f*n^60 + %f*n^59 + %f*n^58 + %f*n^57 + %f*n^56 + %f*n^55 + %f*n^54 + %f*n^53 + %f*n^52 + %f*n^51 + %f*n^50 + %f*n^49 + %f*n^48 + %f*n^47 + %f*n^46 + %f*n^45 + %f*n^44 + %f*n^43 + %f*n^42 + %f*n^41 + %f*n^40 + %f*n^39 + %f*n^38 + %f*n^37 + %f*n^36 + %f*n^35 + %f*n^34 + %f*n^33 + %f*n^32 + %f*n^31 + %f*n^30 + %f*n^29 + %f*n^28 + %f*n^27 + %f*n^26 + %f*n^25 + %f*n^24 + %f*n^23 + %f*n^22 + %f*n^21 + %f*n^20 + %f*n^19 + %f*n^18 + %f*n^17 + %f*n^16 + %f*n^15 + %f*n^14 + %f*n^13 + %f*n^12 + %f*n^11 + %f*n^10 + %f*n^9 + %f*n^8 + %f*n^7 + %f*n^6 + %f*n^5 + %f*n^4 + %f*n^3 + %f*n^2 + %f*n + %f", doubleSupplier16, doublePredicate17);
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench7);
        org.junit.Assert.assertNotNull(uBench10);
        org.junit.Assert.assertNotNull(uBench14);
        org.junit.Assert.assertNotNull(uBench18);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        java.lang.String str1 = mathModel0.toString();
        java.lang.String str2 = mathModel0.getName();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction5 = null;
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction8 = null;
        double[] doubleArray15 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel16 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction8, doubleArray15);
        net.tuis.ubench.scale.MathModel mathModel17 = new net.tuis.ubench.scale.MathModel("net.tuis.ubench.UBenchRuntimeException: ", "", doubleArrayFunction5, doubleArray15);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator18 = mathModel0.createFunction(doubleArray15);
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "%f * log n" + "'", str1, "%f * log n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "O(log n)" + "'", str2, "O(log n)");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator18);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.createPolynom(10);
        org.junit.Assert.assertNotNull(mathModel1);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray18 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel12.createFunction(doubleArray18);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction22 = null;
        double[] doubleArray29 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel30 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction22, doubleArray29);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator31 = mathModel12.createFunction(doubleArray29);
        net.tuis.ubench.scale.MathModel mathModel32 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray38 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator39 = mathModel32.createFunction(doubleArray38);
        net.tuis.ubench.scale.MathEquation mathEquation42 = new net.tuis.ubench.scale.MathEquation(mathModel11, doubleUnaryOperator31, doubleArray38, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathEquation42.getEquation();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction46 = null;
        double[] doubleArray53 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel54 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction46, doubleArray53);
        net.tuis.ubench.scale.MathEquation mathEquation57 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator43, doubleArray53, "net\n", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator58 = mathEquation57.getEquation();
        boolean boolean59 = mathEquation57.isValid();
        java.lang.String str60 = mathEquation57.toJSONString();
        net.tuis.ubench.scale.MathModel mathModel61 = mathEquation57.getModel();
        java.lang.String str62 = mathEquation57.toJSONString();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator31);
        org.junit.Assert.assertNotNull(mathModel32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator39);
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "{name: \"O(n)\", valid: true, format: \"net\n\", description: \"net\n\", parameters: [1.000000, -1.000000, -1.000000, -1.000000, 52.000000, 100.000000], rsquare: -1.000000}" + "'", str60, "{name: \"O(n)\", valid: true, format: \"net\n\", description: \"net\n\", parameters: [1.000000, -1.000000, -1.000000, -1.000000, 52.000000, 100.000000], rsquare: -1.000000}");
        org.junit.Assert.assertNotNull(mathModel61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "{name: \"O(n)\", valid: true, format: \"net\n\", description: \"net\n\", parameters: [1.000000, -1.000000, -1.000000, -1.000000, 52.000000, 100.000000], rsquare: -1.000000}" + "'", str62, "{name: \"O(n)\", valid: true, format: \"net\n\", description: \"net\n\", parameters: [1.000000, -1.000000, -1.000000, -1.000000, 52.000000, 100.000000], rsquare: -1.000000}");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LOG_N;
        java.lang.String str1 = mathModel0.toString();
        net.tuis.ubench.scale.MathModel mathModel2 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel3 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray9 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator10 = mathModel3.createFunction(doubleArray9);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator11 = mathModel2.createFunction(doubleArray9);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction14 = null;
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction17 = null;
        double[] doubleArray24 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel25 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction17, doubleArray24);
        net.tuis.ubench.scale.MathModel mathModel26 = new net.tuis.ubench.scale.MathModel("net.tuis.ubench.UBenchRuntimeException: ", "", doubleArrayFunction14, doubleArray24);
        net.tuis.ubench.scale.MathEquation mathEquation29 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator11, doubleArray24, "net.tuis.ubench.UBenchRuntimeException: %f*n + %f", (double) (short) 10);
        net.tuis.ubench.scale.MathModel mathModel30 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel31 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray37 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator38 = mathModel31.createFunction(doubleArray37);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator39 = mathModel30.createFunction(doubleArray37);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator40 = mathModel0.createFunction(doubleArray37);
        java.lang.String str41 = mathModel0.getFormat();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction44 = null;
        double[] doubleArray51 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel52 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction44, doubleArray51);
        net.tuis.ubench.scale.MathModel mathModel53 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel54 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray60 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator61 = mathModel54.createFunction(doubleArray60);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator62 = mathModel53.createFunction(doubleArray60);
        double[] doubleArray63 = mathModel53.getInitialValues();
        double[] doubleArray69 = new double[] { (short) 1, ' ', ' ', 10.0d, ' ' };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator70 = mathModel53.createFunction(doubleArray69);
        double[] doubleArray75 = new double[] { (-1L), (byte) -1, 83L, (-1L) };
        net.tuis.ubench.scale.MathEquation mathEquation78 = new net.tuis.ubench.scale.MathEquation(mathModel52, doubleUnaryOperator70, doubleArray75, "%f * log n", (double) 1000000000);
        double[] doubleArray79 = null;
        net.tuis.ubench.scale.MathEquation mathEquation82 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator70, doubleArray79, "", 100.0d);
        net.tuis.ubench.scale.MathModel mathModel83 = mathEquation82.getModel();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "%f * log n" + "'", str1, "%f * log n");
        org.junit.Assert.assertNotNull(mathModel2);
        org.junit.Assert.assertNotNull(mathModel3);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator10);
        org.junit.Assert.assertNotNull(doubleUnaryOperator11);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(mathModel30);
        org.junit.Assert.assertNotNull(mathModel31);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator38);
        org.junit.Assert.assertNotNull(doubleUnaryOperator39);
        org.junit.Assert.assertNotNull(doubleUnaryOperator40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "%f * log n" + "'", str41, "%f * log n");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(mathModel53);
        org.junit.Assert.assertNotNull(mathModel54);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator61);
        org.junit.Assert.assertNotNull(doubleUnaryOperator62);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 32.0, 32.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator70);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, -1.0, 83.0, -1.0]");
        org.junit.Assert.assertNotNull(mathModel83);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("%f*n + %f");
        java.util.function.LongSupplier longSupplier3 = null;
        net.tuis.ubench.UBench uBench4 = uBench1.addLongTask("O(1)", longSupplier3);
        java.util.function.LongSupplier longSupplier6 = null;
        java.util.function.LongPredicate longPredicate7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addLongTask("net.tuis.ubench.UBenchRuntimeException: %f*n + %f", longSupplier6, longPredicate7);
        org.junit.Assert.assertNotNull(uBench4);
        org.junit.Assert.assertNotNull(uBench8);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        net.tuis.ubench.UBench uBench1 = new net.tuis.ubench.UBench("net.tuis.ubench.UBenchRuntimeException: ");
        java.util.function.LongSupplier longSupplier3 = null;
        java.util.function.LongPredicate longPredicate4 = null;
        net.tuis.ubench.UBench uBench5 = uBench1.addLongTask("", longSupplier3, longPredicate4);
        java.util.function.IntSupplier intSupplier7 = null;
        net.tuis.ubench.UBench uBench8 = uBench1.addIntTask("%f", intSupplier7);
        java.util.function.IntSupplier intSupplier10 = null;
        java.util.function.IntPredicate intPredicate11 = null;
        net.tuis.ubench.UBench uBench12 = uBench8.addIntTask("net\n", intSupplier10, intPredicate11);
        java.util.function.IntSupplier intSupplier14 = null;
        java.util.function.IntPredicate intPredicate15 = null;
        net.tuis.ubench.UBench uBench16 = uBench12.addIntTask("%f * log n", intSupplier14, intPredicate15);
        net.tuis.ubench.UMode uMode17 = net.tuis.ubench.UMode.PARALLEL;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.tuis.ubench.UReport uReport20 = uBench12.press(uMode17, (long) '4', timeUnit19);
            org.junit.Assert.fail("Expected exception of type net.tuis.ubench.UBenchRuntimeException; message: Parallel Execution failed. See cause.");
        } catch (net.tuis.ubench.UBenchRuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uBench5);
        org.junit.Assert.assertNotNull(uBench8);
        org.junit.Assert.assertNotNull(uBench12);
        org.junit.Assert.assertNotNull(uBench16);
        org.junit.Assert.assertTrue("'" + uMode17 + "' != '" + net.tuis.ubench.UMode.PARALLEL + "'", uMode17.equals(net.tuis.ubench.UMode.PARALLEL));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport5 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        java.io.Writer writer6 = null;
        net.tuis.ubench.UStats[] uStatsArray8 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList9 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList9, uStatsArray8);
        net.tuis.ubench.UReport uReport11 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList9);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator12 = net.tuis.ubench.UReport.BY_FASTEST;
        java.util.List<net.tuis.ubench.UStats> uStatsList13 = uReport11.getStats(uStatsComparator12);
        net.tuis.ubench.UReport uReport14 = new net.tuis.ubench.UReport(uStatsList13);
        java.util.List<net.tuis.ubench.UStats> uStatsList15 = uReport14.getStats();
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator16 = net.tuis.ubench.UReport.BY_99PCTILE;
        java.util.List<net.tuis.ubench.UStats> uStatsList17 = uReport14.getStats(uStatsComparator16);
        // The following exception was thrown during execution in test generation
        try {
            uReport5.report(writer6, "O(n^100)", uStatsComparator16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(uStatsComparator12);
        org.junit.Assert.assertNotNull(uStatsList13);
        org.junit.Assert.assertNotNull(uStatsList15);
        org.junit.Assert.assertNotNull(uStatsComparator16);
        org.junit.Assert.assertNotNull(uStatsList17);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        net.tuis.ubench.UStats[] uStatsArray0 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList1 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList1, uStatsArray0);
        net.tuis.ubench.UReport uReport3 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport4 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UReport uReport5 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList1);
        net.tuis.ubench.UStats[] uStatsArray7 = new net.tuis.ubench.UStats[] {};
        java.util.ArrayList<net.tuis.ubench.UStats> uStatsList8 = new java.util.ArrayList<net.tuis.ubench.UStats>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.tuis.ubench.UStats>) uStatsList8, uStatsArray7);
        net.tuis.ubench.UReport uReport10 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList8);
        net.tuis.ubench.UReport uReport11 = new net.tuis.ubench.UReport((java.util.List<net.tuis.ubench.UStats>) uStatsList8);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator12 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList13 = uReport11.getStats(uStatsComparator12);
        java.util.List<net.tuis.ubench.UStats> uStatsList14 = uReport11.getStats();
        net.tuis.ubench.UReport uReport15 = new net.tuis.ubench.UReport(uStatsList14);
        net.tuis.ubench.UReport uReport16 = new net.tuis.ubench.UReport(uStatsList14);
        java.util.Comparator<net.tuis.ubench.UStats> uStatsComparator17 = net.tuis.ubench.UReport.BY_AVERAGE;
        java.util.List<net.tuis.ubench.UStats> uStatsList18 = uReport16.getStats(uStatsComparator17);
        // The following exception was thrown during execution in test generation
        try {
            uReport5.report("{name: \"O(n)\", valid: true, format: \"net\n\", description: \"net\n\", parameters: [1.000000, -1.000000, -1.000000, -1.000000, 52.000000, 100.000000], rsquare: -1.000000}", uStatsComparator17);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uStatsArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(uStatsArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(uStatsComparator12);
        org.junit.Assert.assertNotNull(uStatsList13);
        org.junit.Assert.assertNotNull(uStatsList14);
        org.junit.Assert.assertNotNull(uStatsComparator17);
        org.junit.Assert.assertNotNull(uStatsList18);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray18 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel12.createFunction(doubleArray18);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction22 = null;
        double[] doubleArray29 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel30 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction22, doubleArray29);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator31 = mathModel12.createFunction(doubleArray29);
        net.tuis.ubench.scale.MathModel mathModel32 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray38 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator39 = mathModel32.createFunction(doubleArray38);
        net.tuis.ubench.scale.MathEquation mathEquation42 = new net.tuis.ubench.scale.MathEquation(mathModel11, doubleUnaryOperator31, doubleArray38, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathEquation42.getEquation();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction46 = null;
        double[] doubleArray53 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel54 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction46, doubleArray53);
        net.tuis.ubench.scale.MathEquation mathEquation57 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator43, doubleArray53, "net\n", (double) (short) -1);
        java.lang.String str58 = mathEquation57.toString();
        java.lang.String str59 = mathEquation57.toString();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator60 = mathEquation57.getEquation();
        java.util.function.DoubleUnaryOperator doubleUnaryOperator61 = mathEquation57.getEquation();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator31);
        org.junit.Assert.assertNotNull(mathModel32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator39);
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "net\n with precision -1.0" + "'", str58, "net\n with precision -1.0");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "net\n with precision -1.0" + "'", str59, "net\n with precision -1.0");
        org.junit.Assert.assertNotNull(doubleUnaryOperator60);
        org.junit.Assert.assertNotNull(doubleUnaryOperator61);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        net.tuis.ubench.scale.MathModel mathModel0 = net.tuis.ubench.scale.Models.LINEAR;
        net.tuis.ubench.scale.MathModel mathModel1 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray7 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator8 = mathModel1.createFunction(doubleArray7);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator9 = mathModel0.createFunction(doubleArray7);
        net.tuis.ubench.scale.MathModel mathModel11 = net.tuis.ubench.scale.Models.createPolynom((int) (short) 0);
        net.tuis.ubench.scale.MathModel mathModel12 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray18 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator19 = mathModel12.createFunction(doubleArray18);
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction22 = null;
        double[] doubleArray29 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel30 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction22, doubleArray29);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator31 = mathModel12.createFunction(doubleArray29);
        net.tuis.ubench.scale.MathModel mathModel32 = net.tuis.ubench.scale.Models.LOG_N;
        double[] doubleArray38 = new double[] { 10L, (-1), 0, (-1), 100L };
        java.util.function.DoubleUnaryOperator doubleUnaryOperator39 = mathModel32.createFunction(doubleArray38);
        net.tuis.ubench.scale.MathEquation mathEquation42 = new net.tuis.ubench.scale.MathEquation(mathModel11, doubleUnaryOperator31, doubleArray38, "", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator43 = mathEquation42.getEquation();
        java.util.function.Function<double[], java.util.function.DoubleUnaryOperator> doubleArrayFunction46 = null;
        double[] doubleArray53 = new double[] { (byte) 1, (-1.0d), (short) -1, (-1L), '4', (short) 100 };
        net.tuis.ubench.scale.MathModel mathModel54 = new net.tuis.ubench.scale.MathModel("", "", doubleArrayFunction46, doubleArray53);
        net.tuis.ubench.scale.MathEquation mathEquation57 = new net.tuis.ubench.scale.MathEquation(mathModel0, doubleUnaryOperator43, doubleArray53, "net\n", (double) (short) -1);
        java.util.function.DoubleUnaryOperator doubleUnaryOperator58 = mathEquation57.getEquation();
        boolean boolean59 = mathEquation57.isValid();
        java.lang.String str60 = mathEquation57.toString();
        org.junit.Assert.assertNotNull(mathModel0);
        org.junit.Assert.assertNotNull(mathModel1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator8);
        org.junit.Assert.assertNotNull(doubleUnaryOperator9);
        org.junit.Assert.assertNotNull(mathModel11);
        org.junit.Assert.assertNotNull(mathModel12);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator19);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator31);
        org.junit.Assert.assertNotNull(mathModel32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator39);
        org.junit.Assert.assertNotNull(doubleUnaryOperator43);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, -1.0, -1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleUnaryOperator58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "net\n with precision -1.0" + "'", str60, "net\n with precision -1.0");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException4 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException5 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException4);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException6 = new net.tuis.ubench.UBenchRuntimeException("%f*n + %f", (java.lang.Throwable) uBenchRuntimeException5);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException9 = new net.tuis.ubench.UBenchRuntimeException("");
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException10 = new net.tuis.ubench.UBenchRuntimeException("net.tuis.ubench.UBenchRuntimeException: ", (java.lang.Throwable) uBenchRuntimeException9);
        uBenchRuntimeException6.addSuppressed((java.lang.Throwable) uBenchRuntimeException9);
        net.tuis.ubench.UBenchRuntimeException uBenchRuntimeException12 = new net.tuis.ubench.UBenchRuntimeException("O(n^100)", (java.lang.Throwable) uBenchRuntimeException6);
    }
}
