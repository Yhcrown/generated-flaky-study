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
        com.github.myzhan.locust4j.stats.Stats stats0 = com.github.myzhan.locust4j.stats.Stats.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stats0.stop();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        statsEntry2.logError("");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.github.myzhan.locust4j.ratelimit.StableRateLimiter stableRateLimiter1 = new com.github.myzhan.locust4j.ratelimit.StableRateLimiter(10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stableRateLimiter1.stop();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");
        statsEntry2.setMinResponseTime(0L);
        statsEntry2.setTotalContentLength((long) '#');
        long long7 = statsEntry2.getTotalContentLength();
        long long8 = statsEntry2.getLastRequestTimestamp();
        statsEntry2.setMethod("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        statsEntry2.logError("");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet2 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        com.github.myzhan.locust4j.taskset.WeighingTaskSet weighingTaskSet5 = new com.github.myzhan.locust4j.taskset.WeighingTaskSet("", (int) (short) 1);
        weighingTaskSet2.addTask((com.github.myzhan.locust4j.AbstractTask) weighingTaskSet5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        weighingTaskSet5.run();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");
        statsEntry2.setMinResponseTime(0L);
        statsEntry2.setTotalContentLength((long) '#');
        long long7 = statsEntry2.getTotalContentLength();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        statsEntry2.logError("Hengchens-MBP.attlocal.net");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");
        statsEntry2.setMinResponseTime(0L);
        statsEntry2.setTotalContentLength((long) '#');
        long long7 = statsEntry2.getTotalContentLength();
        statsEntry2.setMinResponseTime((long) ' ');
        java.lang.String str10 = statsEntry2.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        statsEntry2.logTimeOfRequest();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.github.myzhan.locust4j.ratelimit.StableRateLimiter stableRateLimiter1 = new com.github.myzhan.locust4j.ratelimit.StableRateLimiter(10L);
        boolean boolean2 = stableRateLimiter1.acquire();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stableRateLimiter1.stop();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");
        statsEntry2.setMinResponseTime(0L);
        long long5 = statsEntry2.getStartTime();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        statsEntry2.logResponseTime(1700469898L);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.github.myzhan.locust4j.stats.Stats stats0 = new com.github.myzhan.locust4j.stats.Stats();
        stats0.clearAll();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stats0.stop();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");
        statsEntry2.setLastRequestTimestamp((long) (short) 1);
        statsEntry2.setNumRequests((long) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        statsEntry2.logError("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("Hengchens-MBP.attlocal.net_356a323fbdf190ed485423b672f5c055", "bcb1c32f385de115abd9c3efda4468d0");
        statsEntry2.setMaxResponseTime((long) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        statsEntry2.logResponseTime(1700469865L);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.github.myzhan.locust4j.stats.StatsEntry statsEntry2 = new com.github.myzhan.locust4j.stats.StatsEntry("", "");
        statsEntry2.setMinResponseTime(0L);
        statsEntry2.setLastRequestTimestamp((long) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        statsEntry2.logTimeOfRequest();
    }
}

