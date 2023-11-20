import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTests{
    public static boolean debug = false;


    public void test006_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        long long0 = com.github.myzhan.locust4j.utils.Utils.currentTimeInSeconds();
         org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1698795329L + "'", long0 == 1698795329L);
    }

    public void test012_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        long long0 = com.github.myzhan.locust4j.utils.Utils.now();
         org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1698795329485L + "'", long0 == 1698795329485L);
    }

    public void test027_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.String str0 = com.github.myzhan.locust4j.utils.Utils.getNodeID();
         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Hengchens-MBP.attlocal.net_a1fcdcbb743445894896776421d599ff" + "'", str0, "Hengchens-MBP.attlocal.net_a1fcdcbb743445894896776421d599ff");
    }

    public void test028_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");
        statsEntry2.setMinResponseTime(0L);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = statsEntry2.getStrippedReport();
        long long6 = statsEntry2.getLastRequestTimestamp();
        long long7 = statsEntry2.getNumFailures();
        java.lang.Class<?> wildcardClass8 = statsEntry2.getClass();
        org.junit.Assert.assertNotNull(strMap5);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698795335L + "'", long6 == 1698795335L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test029_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");
        statsEntry2.setMinResponseTime(0L);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = statsEntry2.getStrippedReport();
        long long6 = statsEntry2.getLastRequestTimestamp();
        long long7 = statsEntry2.getNumFailures();
        java.lang.String str8 = statsEntry2.getName();
        statsEntry2.setTotalResponseTime((long) (-1));
        long long11 = statsEntry2.getTotalResponseTime();
        org.junit.Assert.assertNotNull(strMap5);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698795335L + "'", long6 == 1698795335L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    public void test040_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");
        statsEntry2.setMinResponseTime(0L);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = statsEntry2.getStrippedReport();
        long long6 = statsEntry2.getLastRequestTimestamp();
        long long7 = statsEntry2.getNumFailures();
        java.lang.String str8 = statsEntry2.getName();
        statsEntry2.setTotalResponseTime((long) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = statsEntry2.serialize();
        org.junit.Assert.assertNotNull(strMap5);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698795340L + "'", long6 == 1698795340L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap11);
    }

    public void test051_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.github.myzhan.locust4j.runtime.Runner runner0 = new com.github.myzhan.locust4j.runtime.Runner();
        com.github.myzhan.locust4j.rpc.Client client1 = null;
        runner0.setRPCClient(client1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet8 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        weighingTaskSet5.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet8);
        int int10 = weighingTaskSet8.getWeight();
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        int int14 = weighingTaskSet13.getWeight();
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet17 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet20 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        weighingTaskSet17.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);
        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);
        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray23 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet8, weighingTaskSet20 };
        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList24 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24, abstractTaskArray23);
        runner0.setTasks((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24);
        java.lang.String str27 = runner0.getNodeID();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(abstractTaskArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hengchens-MBP.attlocal.net_7d1564785ce4a97d77025101bfb71227" + "'", str27, "Hengchens-MBP.attlocal.net_7d1564785ce4a97d77025101bfb71227");
    }

    public void test065_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.github.myzhan.locust4j.runtime.Runner runner0 = new com.github.myzhan.locust4j.runtime.Runner();
        com.github.myzhan.locust4j.rpc.Client client1 = null;
        runner0.setRPCClient(client1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet8 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        weighingTaskSet5.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet8);
        int int10 = weighingTaskSet8.getWeight();
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        int int14 = weighingTaskSet13.getWeight();
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet17 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet20 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        weighingTaskSet17.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);
        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);
        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray23 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet8, weighingTaskSet20 };
        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList24 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24, abstractTaskArray23);
        runner0.setTasks((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24);
        com.github.myzhan.locust4j.rpc.Client client27 = null;
        runner0.setRPCClient(client27);
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = runner0.getRemoteParams();
        java.lang.String str30 = runner0.getNodeID();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(abstractTaskArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strMap29);
         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hengchens-MBP.attlocal.net_4cb1a2630de37c793d0f93600c055d98" + "'", str30, "Hengchens-MBP.attlocal.net_4cb1a2630de37c793d0f93600c055d98");
    }

    public void test070_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");
        statsEntry2.setMinResponseTime(0L);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = statsEntry2.getStrippedReport();
        long long6 = statsEntry2.getLastRequestTimestamp();
        long long7 = statsEntry2.getNumFailures();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = statsEntry2.serialize();
        org.junit.Assert.assertNotNull(strMap5);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698795361L + "'", long6 == 1698795361L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(strMap8);
    }

    public void test077_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.github.myzhan.locust4j.runtime.Runner runner0 = new com.github.myzhan.locust4j.runtime.Runner();
        com.github.myzhan.locust4j.rpc.Client client1 = null;
        runner0.setRPCClient(client1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet8 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        weighingTaskSet5.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet8);
        int int10 = weighingTaskSet8.getWeight();
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        int int14 = weighingTaskSet13.getWeight();
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet17 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet20 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        weighingTaskSet17.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);
        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);
        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray23 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet8, weighingTaskSet20 };
        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList24 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24, abstractTaskArray23);
        runner0.setTasks((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24);
        com.github.myzhan.locust4j.rpc.Client client27 = null;
        runner0.setRPCClient(client27);
        com.github.myzhan.locust4j.rpc.Client client29 = null;
        runner0.setRPCClient(client29);
        java.lang.String str31 = runner0.getNodeID();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(abstractTaskArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Hengchens-MBP.attlocal.net_0e082ff260df27e91bc8e214b2491cdf" + "'", str31, "Hengchens-MBP.attlocal.net_0e082ff260df27e91bc8e214b2491cdf");
    }

    public void test083_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        int int3 = weighingTaskSet2.getWeight();
         weighingTaskSet2.run();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    public void test089_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("hi!", (int) (byte) 100);
         weighingTaskSet2.run();
    }

    public void test110_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        int int3 = weighingTaskSet2.getWeight();
        weighingTaskSet2.onStart();
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet7 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        java.lang.String str8 = weighingTaskSet7.getName();
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet11 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet14 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        weighingTaskSet11.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet14);
        weighingTaskSet7.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet14);
         weighingTaskSet14.run();
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet20 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet23 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        weighingTaskSet20.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet23);
        java.lang.String str25 = weighingTaskSet20.getName();
        weighingTaskSet14.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);
        weighingTaskSet2.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    public void test124_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.github.myzhan.locust4j.runtime.Runner runner0 = new com.github.myzhan.locust4j.runtime.Runner();
        com.github.myzhan.locust4j.rpc.Client client1 = null;
        runner0.setRPCClient(client1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet8 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        weighingTaskSet5.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet8);
        int int10 = weighingTaskSet8.getWeight();
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        int int14 = weighingTaskSet13.getWeight();
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet17 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet20 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        weighingTaskSet17.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);
        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet20);
        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray23 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet8, weighingTaskSet20 };
        java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask> abstractTaskList24 = new java.util.ArrayList<com.github.myzhan.locust4j.AbstractTask>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24, abstractTaskArray23);
        runner0.setTasks((java.util.List<com.github.myzhan.locust4j.AbstractTask>) abstractTaskList24);
        com.github.myzhan.locust4j.rpc.Client client27 = null;
        runner0.setRPCClient(client27);
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = runner0.getRemoteParams();
        com.github.myzhan.locust4j.rpc.Client client30 = null;
        runner0.setRPCClient(client30);
        java.lang.String str32 = runner0.getNodeID();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(abstractTaskArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strMap29);
         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Hengchens-MBP.attlocal.net_2f2f6326153bae5e1a82cfcacf4aac1e" + "'", str32, "Hengchens-MBP.attlocal.net_2f2f6326153bae5e1a82cfcacf4aac1e");
    }

    public void test127_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        int int3 = weighingTaskSet2.getWeight();
        int int4 = weighingTaskSet2.getWeight();
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet7 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("hi!", 100);
        weighingTaskSet2.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet7);
         weighingTaskSet7.run();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    public void test140_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");
        statsEntry2.setMinResponseTime(0L);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = statsEntry2.getStrippedReport();
        long long6 = statsEntry2.getLastRequestTimestamp();
        long long7 = statsEntry2.getNumFailures();
        java.lang.String str8 = statsEntry2.getName();
        statsEntry2.setTotalResponseTime((long) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = statsEntry2.getStrippedReport();
        org.junit.Assert.assertNotNull(strMap5);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698795367L + "'", long6 == 1698795367L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap11);
    }

    public void test145_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        weighingTaskSet2.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet5);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet9 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        java.lang.String str10 = weighingTaskSet9.getName();
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet13 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet16 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        weighingTaskSet13.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet16);
        weighingTaskSet9.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet16);
         weighingTaskSet16.run();
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet22 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet25 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        weighingTaskSet22.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet25);
        java.lang.String str27 = weighingTaskSet22.getName();
        weighingTaskSet16.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet22);
        weighingTaskSet5.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet16);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    public void test163_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.github.myzhan.locust4j.Locust locust0 = com.github.myzhan.locust4j.Locust.getInstance();
        locust0.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");
        locust0.setMasterPort(0);
        locust0.setMaxRPS((long) (short) 0);
        com.github.myzhan.locust4j.Locust locust10 = com.github.myzhan.locust4j.Locust.getInstance();
        locust10.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");
        locust10.setMasterPort((int) (short) -1);
        locust10.recordSuccess("hi!", "Hengchens-MBP.attlocal.net_a1fcdcbb743445894896776421d599ff", (long) '#', (-1L));
        boolean boolean23 = locust10.isVerbose();
        com.github.myzhan.locust4j.Locust locust24 = com.github.myzhan.locust4j.Locust.getInstance();
        locust24.recordFailure("hi!", "hi!", (long) (short) -1, "hi!");
        locust24.setMasterPort(0);
        locust24.setMaxRPS((long) (short) 0);
        boolean boolean34 = locust24.isRateLimitEnabled();
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet37 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet40 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        weighingTaskSet37.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet40);
        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray42 = new com.github.myzhan.locust4j.AbstractTask[] { weighingTaskSet40 };
        locust24.dryRun(abstractTaskArray42);
        locust10.dryRun(abstractTaskArray42);
        locust0.dryRun(abstractTaskArray42);
        com.github.myzhan.locust4j.AbstractTask[] abstractTaskArray46 = null;
        // The following exception was thrown during execution in test generation
        try {
            locust0.run(abstractTaskArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locust0);
        org.junit.Assert.assertNotNull(locust10);
         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(locust24);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(abstractTaskArray42);
    }

    public void test171_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");
        statsEntry2.setMinResponseTime(0L);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = statsEntry2.getStrippedReport();
        long long6 = statsEntry2.getLastRequestTimestamp();
        long long7 = statsEntry2.getNumFailures();
        java.lang.String str8 = statsEntry2.getName();
        statsEntry2.setMaxResponseTime((long) (short) 100);
        org.junit.Assert.assertNotNull(strMap5);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698795378L + "'", long6 == 1698795378L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }
}