import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        optimizeMojo0.execute();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        optimizeMojo0.execute();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        java.util.Map map1 = optimizeMojo0.getPluginContext();
        java.util.Map map2 = optimizeMojo0.getPluginContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        optimizeMojo0.execute();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        optimizeMojo0.execute();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        optimizeMojo0.execute();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log2 = optimizeMojo0.getLog();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        optimizeMojo0.execute();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        optimizeMojo0.execute();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        optimizeMojo0.execute();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.github.mcheely.maven.requirejs.OptimizeMojo optimizeMojo0 = new com.github.mcheely.maven.requirejs.OptimizeMojo();
        org.apache.maven.plugin.logging.Log log1 = optimizeMojo0.getLog();
        org.apache.maven.plugin.logging.Log log2 = optimizeMojo0.getLog();
        java.util.Map map3 = optimizeMojo0.getPluginContext();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        optimizeMojo0.execute();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        optimizeMojo0.execute();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        optimizeMojo0.execute();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        optimizeMojo0.execute();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        org.apache.maven.plugin.logging.Log log32 = optimizeMojo17.getLog();
        optimizeMojo0.setLog(log32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        optimizeMojo0.execute();
    }
}

