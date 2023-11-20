import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTests{
    public static boolean debug = false;


    public void test166_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.j256.simplemetrics.metric.ControlledMetricTimer controlledMetricTimer4 = new com.j256.simplemetrics.metric.ControlledMetricTimer("hi!", "never", "hi!", "com.j256");
        long long6 = controlledMetricTimer4.stop((long) (byte) 10);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698796522535L + "'", long6 == 1698796522535L);
    }

    public void test208_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.j256.simplemetrics.metric.ControlledMetricTimer controlledMetricTimer4 = new com.j256.simplemetrics.metric.ControlledMetricTimer("hi!", "never", "hi!", "com.j256");
        long long6 = controlledMetricTimer4.stop((long) 100);
        long long7 = controlledMetricTimer4.start();
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698796525183L + "'", long6 == 1698796525183L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698796525283L + "'", long7 == 1698796525283L);
    }

    public void test208_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.j256.simplemetrics.metric.ControlledMetricTimer controlledMetricTimer4 = new com.j256.simplemetrics.metric.ControlledMetricTimer("hi!", "never", "hi!", "com.j256");
        long long6 = controlledMetricTimer4.stop((long) 100);
        long long7 = controlledMetricTimer4.start();
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698796525183L + "'", long6 == 1698796525183L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698796525283L + "'", long7 == 1698796525283L);
    }
}