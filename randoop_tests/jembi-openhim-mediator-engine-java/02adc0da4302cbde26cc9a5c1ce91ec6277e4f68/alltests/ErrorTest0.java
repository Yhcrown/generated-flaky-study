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
        org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = registrationConfig1.getDefaultConfig();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("");
        registrationConfig1.setContent("application/json+openhim");
        java.lang.String str4 = registrationConfig1.getContentType();
        java.lang.String str5 = registrationConfig1.getContent();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = registrationConfig1.getDefaultConfig();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig3 = mediatorConfig0.getRegistrationConfig();
        java.lang.String str4 = mediatorConfig0.getServerHost();
        org.openhim.mediator.engine.RegistrationConfig registrationConfig6 = new org.openhim.mediator.engine.RegistrationConfig("");
        registrationConfig6.setContent("application/json+openhim");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        mediatorConfig0.setRegistrationConfig(registrationConfig6);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("");
        registrationConfig1.setContent("application/json+openhim");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = registrationConfig1.getDefaultConfig();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("");
        registrationConfig1.setContent("application/json+openhim");
        java.lang.String str4 = registrationConfig1.getContentType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = registrationConfig1.getDefaultConfig();
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        mediatorConfig0.setProperties("");
        java.lang.String str6 = mediatorConfig0.getProperty("");
        java.lang.Integer int7 = mediatorConfig0.getCoreAPIPort();
        mediatorConfig0.setServerPort((java.lang.Integer) 0);
        mediatorConfig0.setHeartbeatPeriodSeconds((int) (short) 10);
        boolean boolean12 = mediatorConfig0.getHeartsbeatEnabled();
        org.openhim.mediator.engine.RegistrationConfig registrationConfig14 = new org.openhim.mediator.engine.RegistrationConfig("");
        registrationConfig14.setMethod("hi!");
        java.lang.String str17 = registrationConfig14.getMethod();
        java.lang.String str18 = registrationConfig14.getContentType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        mediatorConfig0.setRegistrationConfig(registrationConfig14);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setRootTimeout((java.lang.Integer) 10);
        mediatorConfig0.setCoreHost("https");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = mediatorConfig0.getProperty("{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.407-0600\"},\"orchestrations\":[],\"properties\":{}}");
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig3 = new org.openhim.mediator.engine.MediatorConfig("/user/null/application/json", "https", (java.lang.Integer) 1);
        java.lang.Integer int4 = mediatorConfig3.getCoreAPIPort();
        boolean boolean5 = mediatorConfig3.getHeartsbeatEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        mediatorConfig3.setProperties("org.openhim.mediator.engine.CoreResponse$ParseException");
    }
}

