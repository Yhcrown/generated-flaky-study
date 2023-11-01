import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle1 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        activeMQBundle1.start();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        activeMQBundle0.start();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle1 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("ActiveMQConfig{brokerUrl='null', healthCheckMillisecondsToWait=-1, shutdownWaitInSeconds=20, timeToLiveInSeconds=-1, brokerUsername=null, brokerPassword=null, trustedPackages=, , pool=null}");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        activeMQBundle1.stop();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle0 = new com.kjetland.dropwizard.activemq.ActiveMQBundle();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        activeMQBundle0.stop();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.kjetland.dropwizard.activemq.ActiveMQBundle activeMQBundle1 = new com.kjetland.dropwizard.activemq.ActiveMQBundle("com.kjetland.dropwizard.activemq.errors.JsonError: com.kjetland.dropwizard.activemq.errors.JsonError");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        activeMQBundle1.stop();
    }
}

