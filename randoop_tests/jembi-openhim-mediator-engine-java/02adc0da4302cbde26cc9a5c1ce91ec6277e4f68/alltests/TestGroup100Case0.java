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
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext1 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch[] actorToLaunchArray0 = new org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch[] {};
        java.util.ArrayList<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch> actorToLaunchList1 = new java.util.ArrayList<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch>) actorToLaunchList1, actorToLaunchArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.testing.MockLauncher mockLauncher3 = new org.openhim.mediator.engine.testing.MockLauncher((java.util.List<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch>) actorToLaunchList1);
            org.junit.Assert.fail("Expected exception of type akka.actor.ActorInitializationException; message: You cannot create an instance of [org.openhim.mediator.engine.testing.MockLauncher] explicitly using the constructor (new). You have to use one of the 'actorOf' factory methods to create a new actor. See the documentation.");
        } catch (akka.actor.ActorInitializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(actorToLaunchArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str0 = org.openhim.mediator.engine.MediatorRequestHandler.OPENHIM_MIME_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/json+openhim" + "'", str0, "application/json+openhim");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        org.openhim.mediator.engine.HeartbeatActor.Start start1 = new org.openhim.mediator.engine.HeartbeatActor.Start(true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        char char0 = org.openhim.mediator.engine.connectors.MLLPConnector.MLLP_FOOTER_CR;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\r' + "'", char0 == '\r');
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        akka.actor.ActorSystem actorSystem0 = null;
        org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch[] actorToLaunchArray2 = new org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch[] {};
        java.util.ArrayList<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch> actorToLaunchList3 = new java.util.ArrayList<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch>) actorToLaunchList3, actorToLaunchArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.testing.TestingUtils.launchActors(actorSystem0, "application/json+openhim", (java.util.List<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch>) actorToLaunchList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(actorToLaunchArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.Class class0 = null;
        akka.actor.ActorRef actorRef1 = null;
        akka.actor.ActorRef actorRef2 = null;
        org.openhim.mediator.engine.messages.MediatorSocketRequest mediatorSocketRequest7 = new org.openhim.mediator.engine.messages.MediatorSocketRequest(actorRef1, actorRef2, "", "", (java.lang.Integer) (-1), "hi!");
        boolean boolean8 = org.openhim.mediator.engine.messages.SimpleMediatorRequest.isInstanceOf(class0, (java.lang.Object) actorRef1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        org.openhim.mediator.engine.HeartbeatActor.Start start1 = new org.openhim.mediator.engine.HeartbeatActor.Start(false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest5 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "hi!", "hi!", "");
        java.lang.Throwable throwable6 = null;
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse7 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest5, throwable6);
        java.lang.String str8 = mediatorHTTPRequest5.getHost();
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.connectors.UDPFireForgetConnector uDPFireForgetConnector0 = new org.openhim.mediator.engine.connectors.UDPFireForgetConnector();
            org.junit.Assert.fail("Expected exception of type akka.actor.ActorInitializationException; message: You cannot create an instance of [org.openhim.mediator.engine.connectors.UDPFireForgetConnector] explicitly using the constructor (new). You have to use one of the 'actorOf' factory methods to create a new actor. See the documentation.");
        } catch (akka.actor.ActorInitializationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        char char0 = org.openhim.mediator.engine.connectors.MLLPConnector.MLLP_FOOTER_FS;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\034' + "'", char0 == '\034');
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        akka.actor.ActorSystem actorSystem0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.testing.TestingUtils.clearRootContext(actorSystem0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse2 = new org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse("", strMap1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        java.lang.String str3 = mediatorConfig0.getCoreAPIPassword();
        org.openhim.mediator.engine.RoutingTable routingTable4 = mediatorConfig0.getRoutingTable();
        int int5 = mediatorConfig0.getHeartbeatPeriodSeconds();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(routingTable4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.openhim.mediator.engine.HeartbeatActor.Stop stop0 = new org.openhim.mediator.engine.HeartbeatActor.Stop();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.MediatorRootActor mediatorRootActor1 = new org.openhim.mediator.engine.MediatorRootActor(mediatorConfig0);
            org.junit.Assert.fail("Expected exception of type akka.actor.ActorInitializationException; message: You cannot create an instance of [org.openhim.mediator.engine.MediatorRootActor] explicitly using the constructor (new). You have to use one of the 'actorOf' factory methods to create a new actor. See the documentation.");
        } catch (akka.actor.ActorInitializationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.Integer int1 = mediatorConfig0.getServerPort();
        mediatorConfig0.setCoreHost("application/json+openhim");
        java.lang.String str4 = mediatorConfig0.getCoreAPIScheme();
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.HeartbeatActor heartbeatActor5 = new org.openhim.mediator.engine.HeartbeatActor(mediatorConfig0);
            org.junit.Assert.fail("Expected exception of type akka.actor.ActorInitializationException; message: You cannot create an instance of [org.openhim.mediator.engine.HeartbeatActor] explicitly using the constructor (new). You have to use one of the 'actorOf' factory methods to create a new actor. See the documentation.");
        } catch (akka.actor.ActorInitializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "https" + "'", str4, "https");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.CoreResponse coreResponse1 = org.openhim.mediator.engine.CoreResponse.parse("application/json+openhim");
            org.junit.Assert.fail("Expected exception of type org.openhim.mediator.engine.CoreResponse.ParseException; message: com.google.gson.JsonSyntaxException: java.lang.IllegalStateException: Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $");
        } catch (org.openhim.mediator.engine.CoreResponse.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest1 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(mediatorHTTPRequest0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse3 = new org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse(false, "application/json+openhim", strMap2);
        boolean boolean4 = sendHeartbeatToCoreResponse3.requestSucceeded();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("", "hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        akka.actor.ActorRef actorRef0 = null;
        org.openhim.mediator.engine.messages.RegisterMediatorWithCore registerMediatorWithCore1 = new org.openhim.mediator.engine.messages.RegisterMediatorWithCore(actorRef0);
        akka.actor.ActorRef actorRef2 = registerMediatorWithCore1.getRespondTo();
        org.junit.Assert.assertNull(actorRef2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse3 = new org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse(false, "application/json+openhim", strMap2);
        boolean boolean4 = sendHeartbeatToCoreResponse3.receivedConfigUpdate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setRootTimeout((java.lang.Integer) 10);
        mediatorConfig0.setCoreHost("https");
        org.openhim.mediator.engine.StartupActorsConfig startupActorsConfig5 = null;
        mediatorConfig0.setStartupActors(startupActorsConfig5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.SimpleMediatorRequest<java.lang.CharSequence> charSequenceSimpleMediatorRequest3 = new org.openhim.mediator.engine.messages.SimpleMediatorRequest<java.lang.CharSequence>(actorRef0, actorRef1, (java.lang.CharSequence) "application/json+openhim");
        java.lang.CharSequence charSequence4 = charSequenceSimpleMediatorRequest3.getRequestObject();
        org.junit.Assert.assertEquals("'" + charSequence4 + "' != '" + "application/json+openhim" + "'", charSequence4, "application/json+openhim");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.String str1 = org.openhim.mediator.engine.connectors.MLLPConnector.wrapMLLP("application/json+openhim");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\013application/json+openhim\034\r" + "'", str1, "\013application/json+openhim\034\r");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorSocketRequest mediatorSocketRequest8 = new org.openhim.mediator.engine.messages.MediatorSocketRequest(actorRef0, actorRef1, "", "application/json+openhim", "hi!", (java.lang.Integer) 0, "application/json+openhim", false);
        java.lang.String str9 = mediatorSocketRequest8.getHost();
        java.lang.String str10 = mediatorSocketRequest8.getBody();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "application/json+openhim" + "'", str10, "application/json+openhim");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        boolean boolean1 = org.openhim.mediator.engine.connectors.MLLPConnector.isMLLPWrapped("application/json+openhim");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        akka.actor.ActorRef actorRef7 = null;
        akka.actor.ActorRef actorRef8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList14 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest15 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef7, actorRef8, "hi!", "", "hi!", "hi!", strMap13, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList14);
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest17 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "", "", "hi!", "", strMap6, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList14, "hi!");
        java.lang.String str18 = mediatorHTTPRequest17.getScheme();
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setRootTimeout((java.lang.Integer) 10);
        mediatorConfig0.setName("https");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.connectors.MLLPConnector mLLPConnector0 = new org.openhim.mediator.engine.connectors.MLLPConnector();
            org.junit.Assert.fail("Expected exception of type akka.actor.ActorInitializationException; message: You cannot create an instance of [org.openhim.mediator.engine.connectors.MLLPConnector] explicitly using the constructor (new). You have to use one of the 'actorOf' factory methods to create a new actor. See the documentation.");
        } catch (akka.actor.ActorInitializationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.SimpleMediatorRequest<java.lang.CharSequence> charSequenceSimpleMediatorRequest3 = new org.openhim.mediator.engine.messages.SimpleMediatorRequest<java.lang.CharSequence>(actorRef0, actorRef1, (java.lang.CharSequence) "\013application/json+openhim\034\r");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setRootTimeout((java.lang.Integer) 10);
        java.util.Properties properties3 = mediatorConfig0.getProperties();
        org.junit.Assert.assertNull(properties3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.openhim.mediator.engine.testing.TestingUtils testingUtils0 = new org.openhim.mediator.engine.testing.TestingUtils();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.Integer int1 = mediatorConfig0.getServerPort();
        mediatorConfig0.setCoreHost("application/json+openhim");
        java.lang.String str4 = mediatorConfig0.getCoreAPIScheme();
        java.lang.String str5 = mediatorConfig0.getCoreAPIUsername();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "https" + "'", str4, "https");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorSocketRequest mediatorSocketRequest5 = new org.openhim.mediator.engine.messages.MediatorSocketRequest(actorRef0, actorRef1, "\013application/json+openhim\034\r", (java.lang.Integer) 0, "hi!");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException invalidRegistrationContentException1 = new org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException("\013application/json+openhim\034\r");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorSocketRequest mediatorSocketRequest8 = new org.openhim.mediator.engine.messages.MediatorSocketRequest(actorRef0, actorRef1, "", "https", "", (java.lang.Integer) (-1), "", false);
        java.lang.String str9 = mediatorSocketRequest8.getBody();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.Integer int1 = mediatorConfig0.getServerPort();
        mediatorConfig0.setCoreHost("application/json+openhim");
        mediatorConfig0.setServerPort((java.lang.Integer) 0);
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        akka.actor.ActorSystem actorSystem0 = null;
        org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch[] actorToLaunchArray2 = new org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch[] {};
        java.util.ArrayList<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch> actorToLaunchList3 = new java.util.ArrayList<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch>) actorToLaunchList3, actorToLaunchArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.testing.TestingUtils.launchActors(actorSystem0, "hi!", (java.util.List<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch>) actorToLaunchList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(actorToLaunchArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setRootTimeout((java.lang.Integer) 10);
        mediatorConfig0.setCoreHost("https");
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext5 = mediatorConfig0.getSSLContext();
        org.junit.Assert.assertNull(sSLContext5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse2 = new org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse("application/json+openhim", strMap1);
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = sendHeartbeatToCoreResponse2.getConfig();
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore1 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("https");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.SimpleMediatorRequest<java.lang.CharSequence> charSequenceSimpleMediatorRequest3 = new org.openhim.mediator.engine.messages.SimpleMediatorRequest<java.lang.CharSequence>(actorRef0, actorRef1, (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence4 = charSequenceSimpleMediatorRequest3.getRequestObject();
        org.junit.Assert.assertEquals("'" + charSequence4 + "' != '" + "" + "'", charSequence4, "");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        mediatorConfig0.setProperties("");
        java.lang.String str6 = mediatorConfig0.getProperty("");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.util.List<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch> actorToLaunchList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.testing.MockLauncher mockLauncher1 = new org.openhim.mediator.engine.testing.MockLauncher(actorToLaunchList0);
            org.junit.Assert.fail("Expected exception of type akka.actor.ActorInitializationException; message: You cannot create an instance of [org.openhim.mediator.engine.testing.MockLauncher] explicitly using the constructor (new). You have to use one of the 'actorOf' factory methods to create a new actor. See the documentation.");
        } catch (akka.actor.ActorInitializationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorSocketRequest mediatorSocketRequest7 = new org.openhim.mediator.engine.messages.MediatorSocketRequest(actorRef0, actorRef1, "application/json+openhim", "https", "application/json", (java.lang.Integer) (-1), "application/json+openhim");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.Integer int1 = mediatorConfig0.getServerPort();
        mediatorConfig0.setCoreHost("application/json+openhim");
        java.lang.String str4 = mediatorConfig0.getCoreAPIScheme();
        mediatorConfig0.setHeartbeatsEnabled(false);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "https" + "'", str4, "https");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList10 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest11 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "hi!", "hi!", "", "", (java.lang.Integer) 0, "", "application/json+openhim", strMap9, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList10);
        java.lang.String str12 = mediatorHTTPRequest11.getHost();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.openhim.mediator.engine.messages.AcceptedAsyncRequest acceptedAsyncRequest0 = new org.openhim.mediator.engine.messages.AcceptedAsyncRequest();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        org.openhim.mediator.engine.messages.FinishRequest finishRequest3 = new org.openhim.mediator.engine.messages.FinishRequest("", strMap1, (java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.String> strMap4 = finishRequest3.getResponseHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = finishRequest3.getResponseHeaders();
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        char char0 = org.openhim.mediator.engine.connectors.MLLPConnector.MLLP_HEADER_VT;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\013' + "'", char0 == '\013');
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("https");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException; message: java.lang.IllegalStateException: Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $");
        } catch (com.google.gson.JsonSyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.openhim.mediator.engine.messages.SendHeartbeatToCore sendHeartbeatToCore2 = new org.openhim.mediator.engine.messages.SendHeartbeatToCore((long) (short) 0, true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.String str1 = org.openhim.mediator.engine.connectors.MLLPConnector.wrapMLLP("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\013\034\r" + "'", str1, "\013\034\r");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.io.InputStream inputStream0 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream0, "\013\034\r");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        org.openhim.mediator.engine.messages.FinishRequest finishRequest3 = new org.openhim.mediator.engine.messages.FinishRequest("", strMap1, (java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.String> strMap4 = finishRequest3.getResponseHeaders();
        java.lang.String str5 = finishRequest3.getResponse();
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        akka.actor.ActorRef actorRef10 = null;
        akka.actor.ActorRef actorRef11 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        akka.actor.ActorRef actorRef17 = null;
        akka.actor.ActorRef actorRef18 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList24 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest25 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef17, actorRef18, "hi!", "", "hi!", "hi!", strMap23, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList24);
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest27 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef10, actorRef11, "", "", "hi!", "", strMap16, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList24, "hi!");
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest29 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "", "application/json+openhim", "hi!", "", (java.lang.Integer) 100, "hi!", "", strMap9, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList24, "application/json+openhim");
        java.lang.String str30 = mediatorHTTPRequest29.getHost();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.io.InputStream inputStream0 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream0, "hi!");
        java.io.InputStream inputStream3 = keyStore2.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore5 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream6 = keyStore5.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext7 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore2, keyStore5);
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore8 = sSLContext7.getKeyStore();
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNotNull(keyStore8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorSocketRequest mediatorSocketRequest5 = new org.openhim.mediator.engine.messages.MediatorSocketRequest(actorRef0, actorRef1, "\013\034\r", (java.lang.Integer) 10, "application/json+openhim");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore1 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore3 = null;
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext4 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore2, keyStore3);
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray5 = sSLContext4.getTrustStores();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext7 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore1, keyStoreArray5, false);
        java.lang.String str8 = keyStore1.getPassword();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore10 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore11 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore12 = null;
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext13 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore11, keyStore12);
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray14 = sSLContext13.getTrustStores();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext16 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore10, keyStoreArray14, false);
        java.lang.String str17 = keyStore10.getPassword();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext18 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore1, keyStore10);
        org.junit.Assert.assertNotNull(keyStoreArray5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(keyStoreArray14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorSocketRequest mediatorSocketRequest7 = new org.openhim.mediator.engine.messages.MediatorSocketRequest(actorRef0, actorRef1, "", "\013application/json+openhim\034\r", "/user/null/\013application/json+openhim\034\r", (java.lang.Integer) 10, "\013\034\r");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.io.InputStream inputStream0 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream0, "\013application/json+openhim\034\r");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        java.lang.String str2 = request0.getQueryString();
        request0.setPort("hi!");
        request0.setPath("https");
        request0.setPath("\013application/json+openhim\034\r");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.CoreResponse coreResponse1 = org.openhim.mediator.engine.CoreResponse.parse("https");
            org.junit.Assert.fail("Expected exception of type org.openhim.mediator.engine.CoreResponse.ParseException; message: com.google.gson.JsonSyntaxException: java.lang.IllegalStateException: Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $");
        } catch (org.openhim.mediator.engine.CoreResponse.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse2 = new org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse("\013\034\r", strMap1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.CoreResponse.Request request9 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = request9.getHeaders();
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList11 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest13 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "", "https", "application/json+openhim", "", (java.lang.Integer) 10, "hi!", "hi!", strMap10, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList11, "application/json+openhim");
        java.lang.String str14 = mediatorHTTPRequest13.getScheme();
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "application/json+openhim" + "'", str14, "application/json+openhim");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig3 = mediatorConfig0.getRegistrationConfig();
        java.lang.String str5 = mediatorConfig0.userPathFor("\013application/json+openhim\034\r");
        java.lang.Integer int6 = mediatorConfig0.getRootTimeout();
        org.junit.Assert.assertNull(registrationConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/user/null/\013application/json+openhim\034\r" + "'", str5, "/user/null/\013application/json+openhim\034\r");
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext2 = null;
        org.openhim.mediator.engine.messages.SetupSSLContext setupSSLContext3 = new org.openhim.mediator.engine.messages.SetupSSLContext(actorRef0, actorRef1, sSLContext2);
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext4 = setupSSLContext3.getRequestObject();
        org.junit.Assert.assertNull(sSLContext4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.openhim.mediator.engine.messages.SendHeartbeatToCore sendHeartbeatToCore1 = new org.openhim.mediator.engine.messages.SendHeartbeatToCore((long) (short) 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        java.lang.String str2 = request0.getQueryString();
        java.lang.String str3 = request0.getPath();
        java.lang.String str4 = request0.getQueryString();
        request0.setBody("/user/null/\013application/json+openhim\034\r");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException; message: java.lang.IllegalStateException: Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $");
        } catch (com.google.gson.JsonSyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        request0.setPath("\013\034\r");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        mediatorConfig0.setProperties("");
        java.lang.Integer int5 = mediatorConfig0.getRootTimeout();
        java.util.Properties properties6 = null;
        mediatorConfig0.setProperties(properties6);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.io.InputStream inputStream0 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream0, "hi!");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore4 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream5 = keyStore4.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore7 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream8 = keyStore7.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore10 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream11 = keyStore10.getInputStream();
        java.io.InputStream inputStream12 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore14 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream12, "hi!");
        java.io.InputStream inputStream15 = keyStore14.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore18 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("", "hi!");
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray19 = new org.openhim.mediator.engine.MediatorConfig.KeyStore[] { keyStore4, keyStore7, keyStore10, keyStore14, keyStore18 };
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext20 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore2, keyStoreArray19);
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore21 = sSLContext20.getKeyStore();
        boolean boolean22 = sSLContext20.getTrustAll();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(keyStoreArray19);
        org.junit.Assert.assertNotNull(keyStore21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        akka.actor.ActorRef actorRef10 = null;
        akka.actor.ActorRef actorRef11 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        akka.actor.ActorRef actorRef17 = null;
        akka.actor.ActorRef actorRef18 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList24 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest25 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef17, actorRef18, "hi!", "", "hi!", "hi!", strMap23, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList24);
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest27 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef10, actorRef11, "", "", "hi!", "", strMap16, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList24, "hi!");
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest29 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "", "application/json+openhim", "hi!", "", (java.lang.Integer) 100, "hi!", "", strMap9, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList24, "application/json+openhim");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList30 = mediatorHTTPRequest29.getParams();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest31 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(mediatorHTTPRequest29);
        org.junit.Assert.assertNotNull(strPairList30);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        java.lang.String str2 = request0.getQueryString();
        java.lang.String str3 = request0.getPort();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        akka.actor.ActorRef actorRef7 = null;
        akka.actor.ActorRef actorRef8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList14 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest15 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef7, actorRef8, "hi!", "", "hi!", "hi!", strMap13, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList14);
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest17 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "", "", "hi!", "", strMap6, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList14, "hi!");
        java.lang.String str18 = mediatorHTTPRequest17.getBody();
        java.lang.String str19 = mediatorHTTPRequest17.getHost();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        org.openhim.mediator.engine.messages.SendHeartbeatToCore sendHeartbeatToCore1 = new org.openhim.mediator.engine.messages.SendHeartbeatToCore((long) '\034');
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        mediatorConfig0.setServerHost("\013\034\r");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.openhim.mediator.engine.messages.RegisterMediatorWithCoreResponse registerMediatorWithCoreResponse3 = new org.openhim.mediator.engine.messages.RegisterMediatorWithCoreResponse(false, (java.lang.Integer) 8080, "\013application/json+openhim\034\r");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.openhim.mediator.engine.messages.SendHeartbeatToCore sendHeartbeatToCore2 = new org.openhim.mediator.engine.messages.SendHeartbeatToCore(0L, false);
        long long3 = sendHeartbeatToCore2.getUptimeSeconds();
        boolean boolean4 = sendHeartbeatToCore2.getForceConfig();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest5 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "hi!", "hi!", "");
        java.lang.Throwable throwable6 = null;
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse7 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest5, throwable6);
        java.lang.Throwable throwable8 = setupSSLContextResponse7.getError();
        boolean boolean9 = setupSSLContextResponse7.isSuccessful();
        org.openhim.mediator.engine.messages.MediatorRequestMessage mediatorRequestMessage10 = setupSSLContextResponse7.getOriginalRequest();
        org.junit.Assert.assertNull(throwable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(mediatorRequestMessage10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.CoreResponse.Request request6 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = request6.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = request6.getHeaders();
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList9 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest11 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "/user/null/\013application/json+openhim\034\r", "", "hi!", "/user/null/application/json", strMap8, strPairList9, "application/json");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException invalidRegistrationContentException1 = new org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException("");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        org.openhim.mediator.engine.CoreResponse.Request request2 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = request2.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = request2.getHeaders();
        java.util.Date date5 = request2.getTimestamp();
        request0.setTimestamp(date5);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Nov 20 03:09:58 CST 2023");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest5 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "hi!", "hi!", "");
        java.lang.Throwable throwable6 = null;
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse7 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest5, throwable6);
        java.lang.Throwable throwable8 = setupSSLContextResponse7.getError();
        boolean boolean9 = setupSSLContextResponse7.isSuccessful();
        boolean boolean10 = setupSSLContextResponse7.isSuccessful();
        org.junit.Assert.assertNull(throwable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.openhim.mediator.engine.messages.FinishRequest finishRequest3 = new org.openhim.mediator.engine.messages.FinishRequest("application/json+openhim", "hi!", (java.lang.Integer) 0);
        java.lang.String str4 = finishRequest3.getResponseMimeType();
        java.lang.String str5 = finishRequest3.getResponse();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "application/json+openhim" + "'", str5, "application/json+openhim");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("");
        registrationConfig1.setContent("application/json+openhim");
        java.lang.String str4 = registrationConfig1.getContentType();
        registrationConfig1.setMethod("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "application/json" + "'", str4, "application/json");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore0 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore1 = null;
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext2 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore0, keyStore1);
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray3 = sSLContext2.getTrustStores();
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray4 = sSLContext2.getTrustStores();
        org.junit.Assert.assertNotNull(keyStoreArray3);
        org.junit.Assert.assertNotNull(keyStoreArray4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig3 = new org.openhim.mediator.engine.MediatorConfig("", "", (java.lang.Integer) 10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException invalidRegistrationContentException2 = null;
        org.openhim.mediator.engine.messages.SimpleMediatorRequest<org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException> invalidRegistrationContentExceptionSimpleMediatorRequest3 = new org.openhim.mediator.engine.messages.SimpleMediatorRequest<org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException>(actorRef0, actorRef1, invalidRegistrationContentException2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        java.lang.String str3 = mediatorConfig0.getCoreAPIPassword();
        org.openhim.mediator.engine.RoutingTable routingTable4 = mediatorConfig0.getRoutingTable();
        java.lang.String str5 = mediatorConfig0.getCoreAPIUsername();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(routingTable4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.String str2 = mediatorConfig0.userPathFor("");
        mediatorConfig0.setRootTimeout((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/user/null/" + "'", str2, "/user/null/");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.openhim.mediator.engine.CoreResponse.Response response0 = new org.openhim.mediator.engine.CoreResponse.Response();
        org.openhim.mediator.engine.CoreResponse.Request request1 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request1.getHeaders();
        response0.setHeaders(strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response0.getHeaders();
        response0.setStatus((java.lang.Integer) 0);
        response0.setBody("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        java.lang.String str2 = request0.getQueryString();
        java.lang.String str3 = request0.getPath();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = request0.getHeaders();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.openhim.mediator.engine.messages.PutPropertyInCoreResponse putPropertyInCoreResponse2 = new org.openhim.mediator.engine.messages.PutPropertyInCoreResponse("/user/null/", "https");
        java.lang.String str3 = putPropertyInCoreResponse2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/user/null/" + "'", str3, "/user/null/");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        java.lang.String str3 = mediatorConfig0.getCoreAPIPassword();
        org.openhim.mediator.engine.RoutingTable routingTable4 = mediatorConfig0.getRoutingTable();
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.MediatorRequestHandler mediatorRequestHandler5 = new org.openhim.mediator.engine.MediatorRequestHandler(mediatorConfig0);
            org.junit.Assert.fail("Expected exception of type akka.actor.ActorInitializationException; message: You cannot create an instance of [org.openhim.mediator.engine.MediatorRequestHandler] explicitly using the constructor (new). You have to use one of the 'actorOf' factory methods to create a new actor. See the documentation.");
        } catch (akka.actor.ActorInitializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(routingTable4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        mediatorConfig0.setProperties("");
        java.lang.Integer int5 = mediatorConfig0.getRootTimeout();
        java.lang.String str7 = mediatorConfig0.userPathFor("application/json");
        java.lang.String str8 = mediatorConfig0.getCoreAPIScheme();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/user/null/application/json" + "'", str7, "/user/null/application/json");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "https" + "'", str8, "https");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("application/json+openhim");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException; message: java.lang.IllegalStateException: Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $");
        } catch (com.google.gson.JsonSyntaxException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.String str1 = mediatorConfig0.getCoreAPIPassword();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext2 = mediatorConfig0.getSSLContext();
        mediatorConfig0.setHeartbeatPeriodSeconds(8080);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(sSLContext2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        java.lang.String str2 = request0.getQueryString();
        akka.actor.ActorRef actorRef3 = null;
        akka.actor.ActorRef actorRef4 = null;
        org.openhim.mediator.engine.CoreResponse.Request request12 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = request12.getHeaders();
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList14 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest16 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef3, actorRef4, "", "https", "application/json+openhim", "", (java.lang.Integer) 10, "hi!", "hi!", strMap13, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList14, "application/json+openhim");
        request0.setHeaders(strMap13);
        java.lang.String str18 = request0.getBody();
        request0.setPath("application/json+openhim");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.Integer int1 = mediatorConfig0.getServerPort();
        mediatorConfig0.setCoreHost("application/json+openhim");
        java.io.InputStream inputStream4 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore6 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream4, "hi!");
        java.io.InputStream inputStream7 = keyStore6.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore9 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream10 = keyStore9.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext11 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore6, keyStore9);
        mediatorConfig0.setSSLContext(sSLContext11);
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.MediatorRequestHandler mediatorRequestHandler13 = new org.openhim.mediator.engine.MediatorRequestHandler(mediatorConfig0);
            org.junit.Assert.fail("Expected exception of type akka.actor.ActorInitializationException; message: You cannot create an instance of [org.openhim.mediator.engine.MediatorRequestHandler] explicitly using the constructor (new). You have to use one of the 'actorOf' factory methods to create a new actor. See the documentation.");
        } catch (akka.actor.ActorInitializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(inputStream10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.io.InputStream inputStream0 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream0, "hi!");
        java.io.InputStream inputStream3 = keyStore2.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore5 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream6 = keyStore5.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext7 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore2, keyStore5);
        java.lang.String str8 = keyStore2.getFilename();
        java.io.InputStream inputStream9 = keyStore2.getInputStream();
        java.io.InputStream inputStream10 = keyStore2.getInputStream();
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.connectors.HTTPConnector hTTPConnector0 = new org.openhim.mediator.engine.connectors.HTTPConnector();
            org.junit.Assert.fail("Expected exception of type akka.actor.ActorInitializationException; message: You cannot create an instance of [org.openhim.mediator.engine.connectors.HTTPConnector] explicitly using the constructor (new). You have to use one of the 'actorOf' factory methods to create a new actor. See the documentation.");
        } catch (akka.actor.ActorInitializationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest8 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "\013\034\r", "/user/null/\013application/json+openhim\034\r", "", "application/json+openhim", (java.lang.Integer) 1, "\013\034\r");
        org.openhim.mediator.engine.CoreResponse.Request request11 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str12 = request11.getPath();
        org.openhim.mediator.engine.CoreResponse.Request request13 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str14 = request13.getPath();
        java.lang.String str15 = request13.getQueryString();
        akka.actor.ActorRef actorRef16 = null;
        akka.actor.ActorRef actorRef17 = null;
        org.openhim.mediator.engine.CoreResponse.Request request25 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = request25.getHeaders();
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList27 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest29 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef16, actorRef17, "", "https", "application/json+openhim", "", (java.lang.Integer) 10, "hi!", "hi!", strMap26, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList27, "application/json+openhim");
        request13.setHeaders(strMap26);
        request11.setHeaders(strMap26);
        org.openhim.mediator.engine.messages.MediatorHTTPResponse mediatorHTTPResponse32 = new org.openhim.mediator.engine.messages.MediatorHTTPResponse(mediatorHTTPRequest8, "application/json", (java.lang.Integer) 100, strMap26);
        java.lang.String str33 = mediatorHTTPRequest8.getPath();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\013\034\r" + "'", str33, "\013\034\r");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("");
        registrationConfig1.setMethod("hi!");
        java.lang.String str4 = registrationConfig1.getMethod();
        java.lang.String str5 = registrationConfig1.getContentType();
        registrationConfig1.setPath("https");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = registrationConfig1.getURN();
            org.junit.Assert.fail("Expected exception of type org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException; message: Invalid registration config - failed to read mediator URN");
        } catch (org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "application/json" + "'", str5, "application/json");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig3 = new org.openhim.mediator.engine.MediatorConfig("application/json", "\013\034\r", (java.lang.Integer) (-1));
        java.lang.String str5 = mediatorConfig3.userPathFor("/user/null/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/user/application/json//user/null/" + "'", str5, "/user/application/json//user/null/");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.openhim.mediator.engine.messages.FinishRequest finishRequest3 = new org.openhim.mediator.engine.messages.FinishRequest("", "hi!", (java.lang.Integer) 0);
        java.lang.String str4 = finishRequest3.getResponse();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.io.InputStream inputStream0 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream0, "hi!");
        java.lang.String str3 = keyStore2.getFilename();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.SimpleMediatorRequest<java.lang.CharSequence> charSequenceSimpleMediatorRequest5 = new org.openhim.mediator.engine.messages.SimpleMediatorRequest<java.lang.CharSequence>(actorRef0, actorRef1, "application/json+openhim", "\013\034\r", (java.lang.CharSequence) "\013\034\r");
        java.lang.CharSequence charSequence6 = charSequenceSimpleMediatorRequest5.getRequestObject();
        org.junit.Assert.assertEquals("'" + charSequence6 + "' != '" + "\013\034\r" + "'", charSequence6, "\013\034\r");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.String str1 = mediatorConfig0.getCoreAPIPassword();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext2 = mediatorConfig0.getSSLContext();
        mediatorConfig0.setServerHost("\013application/json+openhim\034\r");
        org.openhim.mediator.engine.RoutingTable routingTable5 = new org.openhim.mediator.engine.RoutingTable();
        java.lang.Class<? extends akka.actor.Actor> wildcardClass7 = routingTable5.getActorClassForPath("application/json+openhim");
        java.lang.Class<? extends akka.actor.Actor> wildcardClass9 = routingTable5.getActorClassForPath("application/json+openhim");
        org.openhim.mediator.engine.RoutingTable.RouteAlreadyMappedException routeAlreadyMappedException10 = routingTable5.new RouteAlreadyMappedException();
        mediatorConfig0.setRoutingTable(routingTable5);
        mediatorConfig0.setHeartbeatPeriodSeconds((int) ' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(sSLContext2);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        org.openhim.mediator.engine.RoutingTable routingTable0 = new org.openhim.mediator.engine.RoutingTable();
        java.lang.Class<? extends akka.actor.Actor> wildcardClass2 = routingTable0.removeRoute("\013application/json+openhim\034\r");
        org.openhim.mediator.engine.RoutingTable.RouteAlreadyMappedException routeAlreadyMappedException3 = routingTable0.new RouteAlreadyMappedException();
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.openhim.mediator.engine.RoutingTable routingTable0 = new org.openhim.mediator.engine.RoutingTable();
        java.lang.Class<? extends akka.actor.Actor> wildcardClass2 = routingTable0.getActorClassForPath("application/json+openhim");
        java.lang.Class<? extends akka.actor.Actor> wildcardClass4 = routingTable0.getActorClassForPath("application/json+openhim");
        java.lang.Class<?> wildcardClass5 = routingTable0.getClass();
        org.openhim.mediator.engine.RegistrationConfig registrationConfig7 = new org.openhim.mediator.engine.RegistrationConfig("");
        boolean boolean8 = org.openhim.mediator.engine.messages.SimpleMediatorRequest.isInstanceOf((java.lang.Class) wildcardClass5, (java.lang.Object) registrationConfig7);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = request0.getHeaders();
        java.lang.String str2 = request0.getHost();
        request0.setMethod("/user/null/\013application/json+openhim\034\r");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.SimpleMediatorRequest<java.lang.CharSequence> charSequenceSimpleMediatorRequest3 = new org.openhim.mediator.engine.messages.SimpleMediatorRequest<java.lang.CharSequence>(actorRef0, actorRef1, (java.lang.CharSequence) "application/json+openhim");
        java.lang.String str4 = charSequenceSimpleMediatorRequest3.getCorrelationId();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("");
        registrationConfig1.setMethod("hi!");
        java.lang.String str4 = registrationConfig1.getMethod();
        java.lang.String str5 = registrationConfig1.getContentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = registrationConfig1.getURN();
            org.junit.Assert.fail("Expected exception of type org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException; message: Invalid registration config - failed to read mediator URN");
        } catch (org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "application/json" + "'", str5, "application/json");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        java.lang.String str2 = request0.getQueryString();
        java.lang.String str3 = request0.getPath();
        java.lang.String str4 = request0.getBody();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.openhim.mediator.engine.CoreResponse.Response response0 = new org.openhim.mediator.engine.CoreResponse.Response();
        org.openhim.mediator.engine.CoreResponse.Request request1 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request1.getHeaders();
        response0.setHeaders(strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response0.getHeaders();
        response0.setStatus((java.lang.Integer) 0);
        java.lang.String str7 = response0.getBody();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        org.openhim.mediator.engine.CoreResponse.Response response1 = coreResponse0.getResponse();
        org.openhim.mediator.engine.CoreResponse.Response response2 = new org.openhim.mediator.engine.CoreResponse.Response();
        coreResponse0.setResponse(response2);
        java.lang.String str4 = coreResponse0.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = coreResponse0.getProperties();
        org.junit.Assert.assertNull(response1);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.342-0600\"},\"orchestrations\":[],\"properties\":{}}" + "'", str4, "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.342-0600\"},\"orchestrations\":[],\"properties\":{}}");
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = request0.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.getHeaders();
        java.lang.String str3 = request0.getPath();
        request0.setMethod("hi!");
        request0.setQueryString("");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorSocketRequest mediatorSocketRequest5 = new org.openhim.mediator.engine.messages.MediatorSocketRequest(actorRef0, actorRef1, "\013\034\r", (java.lang.Integer) 10, "application/json");
        java.lang.String str6 = mediatorSocketRequest5.getBody();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "application/json" + "'", str6, "application/json");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        org.openhim.mediator.engine.CoreResponse.Response response1 = coreResponse0.getResponse();
        org.openhim.mediator.engine.CoreResponse.Response response2 = new org.openhim.mediator.engine.CoreResponse.Response();
        coreResponse0.setResponse(response2);
        java.lang.String str4 = coreResponse0.toString();
        java.lang.String str5 = coreResponse0.toJSON();
        org.junit.Assert.assertNull(response1);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.407-0600\"},\"orchestrations\":[],\"properties\":{}}" + "'", str4, "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.407-0600\"},\"orchestrations\":[],\"properties\":{}}");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.407-0600\"},\"orchestrations\":[],\"properties\":{}}" + "'", str5, "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.407-0600\"},\"orchestrations\":[],\"properties\":{}}");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.io.InputStream inputStream0 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream0, "hi!");
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext3 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        akka.actor.ActorSystem actorSystem0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.testing.TestingUtils.clearRootContext(actorSystem0, "/user/null/application/json");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        akka.actor.ActorRef actorRef6 = null;
        akka.actor.ActorRef actorRef7 = null;
        org.openhim.mediator.engine.CoreResponse.Request request15 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = request15.getHeaders();
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList17 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest19 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef6, actorRef7, "", "https", "application/json+openhim", "", (java.lang.Integer) 10, "hi!", "hi!", strMap16, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList17, "application/json+openhim");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList20 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest22 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "application/json", "", "", "application/json+openhim", strMap16, strPairList20, "/user/null/application/json");
        java.lang.Integer int23 = mediatorHTTPRequest22.getPort();
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(int23);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("");
        registrationConfig1.setContent("application/json+openhim");
        java.lang.String str4 = registrationConfig1.getContentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = registrationConfig1.getURN();
            org.junit.Assert.fail("Expected exception of type org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException; message: Invalid registration config - failed to read mediator URN");
        } catch (org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "application/json" + "'", str4, "application/json");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore0 = null;
        java.io.InputStream inputStream1 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore3 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream1, "hi!");
        java.io.InputStream inputStream4 = keyStore3.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore6 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream7 = keyStore6.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext8 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore3, keyStore6);
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray9 = sSLContext8.getTrustStores();
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray10 = sSLContext8.getTrustStores();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext12 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore0, keyStoreArray10, false);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNotNull(keyStoreArray9);
        org.junit.Assert.assertNotNull(keyStoreArray10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.openhim.mediator.engine.messages.FinishRequest finishRequest3 = new org.openhim.mediator.engine.messages.FinishRequest("Successful", "https", (java.lang.Integer) (-1));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.openhim.mediator.engine.messages.PutPropertyInCoreResponse putPropertyInCoreResponse2 = new org.openhim.mediator.engine.messages.PutPropertyInCoreResponse("/user/null/", "https");
        java.lang.String str3 = putPropertyInCoreResponse2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "https" + "'", str3, "https");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("");
        registrationConfig1.setContent("application/json+openhim");
        java.lang.String str4 = registrationConfig1.getContentType();
        java.lang.String str5 = registrationConfig1.getContent();
        registrationConfig1.setContent("/user/null/\013application/json+openhim\034\r");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = registrationConfig1.getURN();
            org.junit.Assert.fail("Expected exception of type org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException; message: Invalid registration config - failed to read mediator URN");
        } catch (org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "application/json" + "'", str4, "application/json");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "application/json+openhim" + "'", str5, "application/json+openhim");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig1 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.String str2 = mediatorConfig1.getCoreAPIPassword();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext3 = mediatorConfig1.getSSLContext();
        mediatorConfig1.setCoreAPIScheme("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = mediatorConfig1.getDynamicConfig();
        org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse7 = new org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse("application/json+openhim", strMap6);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sSLContext3);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        org.openhim.mediator.engine.CoreResponse.Request request2 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str3 = request2.getPath();
        java.lang.String str4 = request2.getQueryString();
        akka.actor.ActorRef actorRef5 = null;
        akka.actor.ActorRef actorRef6 = null;
        org.openhim.mediator.engine.CoreResponse.Request request14 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = request14.getHeaders();
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList16 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest18 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef5, actorRef6, "", "https", "application/json+openhim", "", (java.lang.Integer) 10, "hi!", "hi!", strMap15, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList16, "application/json+openhim");
        request2.setHeaders(strMap15);
        request0.setHeaders(strMap15);
        request0.setHost("");
        java.lang.String str23 = request0.getPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest5 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "", "https", "application/json+openhim");
        java.lang.String str6 = mediatorHTTPRequest5.getPath();
        java.lang.String str7 = mediatorHTTPRequest5.getUri();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "application/json+openhim" + "'", str7, "application/json+openhim");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.openhim.mediator.engine.CoreResponse.Response response0 = new org.openhim.mediator.engine.CoreResponse.Response();
        org.openhim.mediator.engine.CoreResponse.Request request1 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request1.getHeaders();
        response0.setHeaders(strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response0.getHeaders();
        java.lang.Integer int5 = response0.getStatus();
        java.util.Date date6 = response0.getTimestamp();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Nov 20 03:09:59 CST 2023");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        mediatorConfig0.setProperties("");
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext5 = mediatorConfig0.getSSLContext();
        org.junit.Assert.assertNull(sSLContext5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore1 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream2 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore4 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream2, "hi!");
        java.io.InputStream inputStream5 = keyStore4.getInputStream();
        java.io.InputStream inputStream6 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore8 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream6, "hi!");
        java.io.InputStream inputStream9 = keyStore8.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore11 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream12 = keyStore11.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext13 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore8, keyStore11);
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore15 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream16 = keyStore15.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore18 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream19 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore21 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream19, "hi!");
        java.io.InputStream inputStream22 = keyStore21.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore24 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream25 = keyStore24.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext26 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore21, keyStore24);
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray27 = new org.openhim.mediator.engine.MediatorConfig.KeyStore[] { keyStore11, keyStore15, keyStore18, keyStore24 };
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext29 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore4, keyStoreArray27, true);
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext30 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore1, keyStore4);
        java.io.InputStream inputStream31 = keyStore4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNotNull(keyStoreArray27);
        org.junit.Assert.assertNull(inputStream31);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.openhim.mediator.engine.CoreResponse.Response response0 = new org.openhim.mediator.engine.CoreResponse.Response();
        response0.setStatus((java.lang.Integer) 100);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setRootTimeout((java.lang.Integer) 10);
        mediatorConfig0.setHeartbeatsEnabled(false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.openhim.mediator.engine.CoreResponse.Response response0 = new org.openhim.mediator.engine.CoreResponse.Response();
        org.openhim.mediator.engine.CoreResponse.Request request1 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request1.getHeaders();
        response0.setHeaders(strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response0.getHeaders();
        response0.setStatus((java.lang.Integer) 0);
        response0.setStatus((java.lang.Integer) 8080);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest8 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "/user/null/", "Successful", "", "\013application/json+openhim\034\r", (java.lang.Integer) 100, "");
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest9 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(mediatorHTTPRequest8);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.String str1 = mediatorConfig0.getCoreAPIPassword();
        java.lang.Integer int2 = mediatorConfig0.getServerPort();
        org.openhim.mediator.engine.StartupActorsConfig startupActorsConfig3 = mediatorConfig0.getStartupActors();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(startupActorsConfig3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        akka.actor.ActorSystem actorSystem0 = null;
        org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch[] actorToLaunchArray2 = new org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch[] {};
        java.util.ArrayList<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch> actorToLaunchList3 = new java.util.ArrayList<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch>) actorToLaunchList3, actorToLaunchArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.testing.TestingUtils.launchActors(actorSystem0, "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.342-0600\"},\"orchestrations\":[],\"properties\":{}}", (java.util.List<org.openhim.mediator.engine.testing.MockLauncher.ActorToLaunch>) actorToLaunchList3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(actorToLaunchArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setRootTimeout((java.lang.Integer) 10);
        mediatorConfig0.setCoreAPIPort((java.lang.Integer) 0);
        mediatorConfig0.setCoreAPIUsername("\013application/json+openhim\034\r");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorSocketRequest mediatorSocketRequest7 = new org.openhim.mediator.engine.messages.MediatorSocketRequest(actorRef0, actorRef1, "/user/null/\013application/json+openhim\034\r", "", "/user/null/", (java.lang.Integer) 10, "\013application/json+openhim\034\r");
        java.lang.String str8 = mediatorSocketRequest7.getCorrelationId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig3 = mediatorConfig0.getRegistrationConfig();
        java.lang.String str5 = mediatorConfig0.userPathFor("\013application/json+openhim\034\r");
        mediatorConfig0.setCoreAPIUsername("application/json+openhim");
        org.junit.Assert.assertNull(registrationConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/user/null/\013application/json+openhim\034\r" + "'", str5, "/user/null/\013application/json+openhim\034\r");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest5 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "hi!", "hi!", "");
        java.lang.Throwable throwable6 = null;
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse7 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest5, throwable6);
        java.lang.Throwable throwable8 = null;
        org.openhim.mediator.engine.CoreResponse.ParseException parseException9 = new org.openhim.mediator.engine.CoreResponse.ParseException(throwable8);
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse10 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest5, throwable8);
        java.lang.Integer int11 = mediatorHTTPRequest5.getPort();
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest5 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "hi!", "hi!", "");
        java.lang.Throwable throwable6 = null;
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse7 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest5, throwable6);
        java.lang.String str8 = mediatorHTTPRequest5.getCorrelationId();
        java.lang.Integer int9 = mediatorHTTPRequest5.getPort();
        java.lang.Integer int10 = mediatorHTTPRequest5.getPort();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.lang.Throwable throwable0 = null;
        org.openhim.mediator.engine.messages.ExceptError exceptError1 = new org.openhim.mediator.engine.messages.ExceptError(throwable0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.openhim.mediator.engine.CoreResponse.Response response0 = new org.openhim.mediator.engine.CoreResponse.Response();
        org.openhim.mediator.engine.CoreResponse.Request request1 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request1.getHeaders();
        response0.setHeaders(strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response0.getHeaders();
        java.lang.Integer int5 = response0.getStatus();
        java.lang.Integer int6 = response0.getStatus();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest8 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "\013\034\r", "/user/null/\013application/json+openhim\034\r", "", "application/json+openhim", (java.lang.Integer) 1, "\013\034\r");
        org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException invalidRegistrationContentException10 = new org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException("\013\034\r");
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse11 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest8, (java.lang.Throwable) invalidRegistrationContentException10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        java.lang.String str2 = request0.getQueryString();
        request0.setPort("hi!");
        request0.setQueryString("/user/application/json//user/null/");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = request0.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.getHeaders();
        java.lang.String str3 = request0.getPath();
        java.lang.String str4 = request0.getBody();
        request0.setQueryString("application/json");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse1 = new org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse("/user/null/application/json");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList7 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest8 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "hi!", "", "hi!", "hi!", strMap6, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList7);
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse9 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest8);
        java.lang.Integer int10 = mediatorHTTPRequest8.getPort();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = mediatorHTTPRequest8.getHeaders();
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest5 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "/user/null/application/json", "application/json", "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.342-0600\"},\"orchestrations\":[],\"properties\":{}}");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.openhim.mediator.engine.connectors.CoreAPIConnector.CoreGetAuthenticationDetailsError coreGetAuthenticationDetailsError1 = new org.openhim.mediator.engine.connectors.CoreAPIConnector.CoreGetAuthenticationDetailsError("\013application/json+openhim\034\r");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        java.lang.String str2 = request0.getQueryString();
        akka.actor.ActorRef actorRef3 = null;
        akka.actor.ActorRef actorRef4 = null;
        org.openhim.mediator.engine.CoreResponse.Request request12 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = request12.getHeaders();
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList14 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest16 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef3, actorRef4, "", "https", "application/json+openhim", "", (java.lang.Integer) 10, "hi!", "hi!", strMap13, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList14, "application/json+openhim");
        request0.setHeaders(strMap13);
        request0.setHost("{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.305-0600\"},\"orchestrations\":[],\"properties\":{}}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        java.lang.String str1 = coreResponse0.getDescriptiveStatus();
        java.util.List<org.openhim.mediator.engine.CoreResponse.Orchestration> orchestrationList2 = null;
        coreResponse0.setOrchestrations(orchestrationList2);
        org.openhim.mediator.engine.CoreResponse.Orchestration[] orchestrationArray4 = new org.openhim.mediator.engine.CoreResponse.Orchestration[] {};
        java.util.ArrayList<org.openhim.mediator.engine.CoreResponse.Orchestration> orchestrationList5 = new java.util.ArrayList<org.openhim.mediator.engine.CoreResponse.Orchestration>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.openhim.mediator.engine.CoreResponse.Orchestration>) orchestrationList5, orchestrationArray4);
        coreResponse0.setOrchestrations((java.util.List<org.openhim.mediator.engine.CoreResponse.Orchestration>) orchestrationList5);
        org.openhim.mediator.engine.CoreResponse.Orchestration[] orchestrationArray8 = new org.openhim.mediator.engine.CoreResponse.Orchestration[] {};
        java.util.ArrayList<org.openhim.mediator.engine.CoreResponse.Orchestration> orchestrationList9 = new java.util.ArrayList<org.openhim.mediator.engine.CoreResponse.Orchestration>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.openhim.mediator.engine.CoreResponse.Orchestration>) orchestrationList9, orchestrationArray8);
        coreResponse0.setOrchestrations((java.util.List<org.openhim.mediator.engine.CoreResponse.Orchestration>) orchestrationList9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Successful" + "'", str1, "Successful");
        org.junit.Assert.assertNotNull(orchestrationArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(orchestrationArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig3 = new org.openhim.mediator.engine.MediatorConfig("/user/null/application/json", "https", (java.lang.Integer) 1);
        java.lang.String str4 = mediatorConfig3.getCoreAPIUsername();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        akka.actor.ActorRef actorRef6 = null;
        akka.actor.ActorRef actorRef7 = null;
        akka.actor.ActorRef actorRef15 = null;
        akka.actor.ActorRef actorRef16 = null;
        akka.actor.ActorRef actorRef21 = null;
        akka.actor.ActorRef actorRef22 = null;
        org.openhim.mediator.engine.CoreResponse.Request request30 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = request30.getHeaders();
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList32 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest34 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef21, actorRef22, "", "https", "application/json+openhim", "", (java.lang.Integer) 10, "hi!", "hi!", strMap31, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList32, "application/json+openhim");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList35 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest37 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef15, actorRef16, "application/json", "", "", "application/json+openhim", strMap31, strPairList35, "/user/null/application/json");
        akka.actor.ActorRef actorRef38 = null;
        akka.actor.ActorRef actorRef39 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap44 = null;
        akka.actor.ActorRef actorRef45 = null;
        akka.actor.ActorRef actorRef46 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap51 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList52 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest53 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef45, actorRef46, "hi!", "", "hi!", "hi!", strMap51, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList52);
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest55 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef38, actorRef39, "", "", "hi!", "", strMap44, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList52, "hi!");
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest57 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef6, actorRef7, "application/json", "/user/null/application/json", "Successful", "application/json", (java.lang.Integer) 10, "/user/null/\013application/json+openhim\034\r", "Successful", strMap31, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList52, "/user/application/json//user/null/");
        akka.actor.ActorRef actorRef58 = null;
        akka.actor.ActorRef actorRef59 = null;
        org.openhim.mediator.engine.CoreResponse.Request request66 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap67 = request66.getHeaders();
        org.openhim.mediator.engine.messages.MediatorHTTPResponse mediatorHTTPResponse68 = new org.openhim.mediator.engine.messages.MediatorHTTPResponse("application/json+openhim", (java.lang.Integer) (-1), strMap67);
        akka.actor.ActorRef actorRef69 = null;
        akka.actor.ActorRef actorRef70 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap78 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList79 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest80 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef69, actorRef70, "hi!", "hi!", "", "", (java.lang.Integer) 0, "", "application/json+openhim", strMap78, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList79);
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest82 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef58, actorRef59, "/user/null/\013application/json+openhim\034\r", "/user/null/\013application/json+openhim\034\r", "/user/application/json//user/null/", "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.342-0600\"},\"orchestrations\":[],\"properties\":{}}", strMap67, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList79, "application/json");
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest83 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "POST", "/user/application/json//user/null/", "Successful", "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.407-0600\"},\"orchestrations\":[],\"properties\":{}}", strMap31, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList79);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap67);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("");
        registrationConfig1.setContent("application/json+openhim");
        java.lang.String str4 = registrationConfig1.getContentType();
        java.lang.String str5 = registrationConfig1.getMethod();
        java.lang.String str6 = registrationConfig1.getContentType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "application/json" + "'", str4, "application/json");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "POST" + "'", str5, "POST");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "application/json" + "'", str6, "application/json");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        org.openhim.mediator.engine.messages.FinishRequest finishRequest3 = new org.openhim.mediator.engine.messages.FinishRequest("\013\034\r", strMap1, (java.lang.Integer) 100);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorSocketRequest mediatorSocketRequest5 = new org.openhim.mediator.engine.messages.MediatorSocketRequest(actorRef0, actorRef1, "\013\034\r", (java.lang.Integer) 10, "application/json");
        java.lang.String str6 = mediatorSocketRequest5.getHost();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\013\034\r" + "'", str6, "\013\034\r");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore1 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore3 = null;
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext4 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore2, keyStore3);
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray5 = sSLContext4.getTrustStores();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext7 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore1, keyStoreArray5, false);
        java.lang.String str8 = keyStore1.getPassword();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext10 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore1, false);
        org.junit.Assert.assertNotNull(keyStoreArray5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        mediatorConfig0.setProperties("");
        java.lang.Integer int5 = mediatorConfig0.getServerPort();
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("");
        registrationConfig1.setMethod("hi!");
        java.lang.String str4 = registrationConfig1.getMethod();
        java.lang.String str5 = registrationConfig1.getContentType();
        java.lang.String str6 = registrationConfig1.getContentType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "application/json" + "'", str5, "application/json");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "application/json" + "'", str6, "application/json");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.lang.Class class0 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.openhim.mediator.engine.messages.FinishRequest finishRequest4 = new org.openhim.mediator.engine.messages.FinishRequest("", strMap2, (java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.String> strMap5 = finishRequest4.getResponseHeaders();
        boolean boolean6 = org.openhim.mediator.engine.messages.SimpleMediatorResponse.isInstanceOf(class0, (java.lang.Object) finishRequest4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.openhim.mediator.engine.messages.SendHeartbeatToCore sendHeartbeatToCore1 = new org.openhim.mediator.engine.messages.SendHeartbeatToCore((long) 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest5 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "hi!", "hi!", "");
        java.lang.Throwable throwable6 = null;
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse7 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest5, throwable6);
        java.lang.Throwable throwable8 = setupSSLContextResponse7.getError();
        org.openhim.mediator.engine.messages.MediatorRequestMessage mediatorRequestMessage9 = setupSSLContextResponse7.getOriginalRequest();
        java.lang.Throwable throwable10 = setupSSLContextResponse7.getError();
        org.junit.Assert.assertNull(throwable8);
        org.junit.Assert.assertNotNull(mediatorRequestMessage9);
        org.junit.Assert.assertNull(throwable10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef2 = null;
        akka.actor.ActorRef actorRef3 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest7 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef2, actorRef3, "hi!", "hi!", "");
        java.lang.Throwable throwable8 = null;
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse9 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest7, throwable8);
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest10 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, "\013application/json+openhim\034\r", mediatorHTTPRequest7);
        java.lang.String str11 = mediatorHTTPRequest7.getBody();
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.io.InputStream inputStream0 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream0, "hi!");
        java.io.InputStream inputStream3 = keyStore2.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore4 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore5 = null;
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext6 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore4, keyStore5);
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore7 = sSLContext6.getKeyStore();
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray8 = sSLContext6.getTrustStores();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext10 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore2, keyStoreArray8, true);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertNull(keyStore7);
        org.junit.Assert.assertNotNull(keyStoreArray8);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.openhim.mediator.engine.CoreResponse.Orchestration orchestration0 = null;
        org.openhim.mediator.engine.messages.AddOrchestrationToCoreResponse addOrchestrationToCoreResponse1 = new org.openhim.mediator.engine.messages.AddOrchestrationToCoreResponse(orchestration0);
        org.openhim.mediator.engine.CoreResponse.Orchestration orchestration2 = addOrchestrationToCoreResponse1.getOrchestration();
        org.openhim.mediator.engine.CoreResponse.Orchestration orchestration3 = addOrchestrationToCoreResponse1.getOrchestration();
        org.junit.Assert.assertNull(orchestration2);
        org.junit.Assert.assertNull(orchestration3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.openhim.mediator.engine.messages.SendHeartbeatToCore sendHeartbeatToCore2 = new org.openhim.mediator.engine.messages.SendHeartbeatToCore(0L, false);
        boolean boolean3 = sendHeartbeatToCore2.getForceConfig();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        org.openhim.mediator.engine.RoutingTable routingTable3 = mediatorConfig0.getRoutingTable();
        int int4 = mediatorConfig0.getHeartbeatPeriodSeconds();
        org.junit.Assert.assertNull(routingTable3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore1 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore3 = null;
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext4 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore2, keyStore3);
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray5 = sSLContext4.getTrustStores();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext7 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore1, keyStoreArray5, false);
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray8 = sSLContext7.getTrustStores();
        org.junit.Assert.assertNotNull(keyStoreArray5);
        org.junit.Assert.assertNotNull(keyStoreArray8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("", "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.407-0600\"},\"orchestrations\":[],\"properties\":{}}");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        org.openhim.mediator.engine.CoreResponse.Response response1 = coreResponse0.getResponse();
        java.lang.String str2 = coreResponse0.getUrn();
        java.util.List<org.openhim.mediator.engine.CoreResponse.Orchestration> orchestrationList3 = coreResponse0.getOrchestrations();
        java.lang.String str4 = coreResponse0.toString();
        org.junit.Assert.assertNull(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(orchestrationList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{\"orchestrations\":[],\"properties\":{}}" + "'", str4, "{\"orchestrations\":[],\"properties\":{}}");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.String str1 = mediatorConfig0.getCoreAPIPassword();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext2 = mediatorConfig0.getSSLContext();
        mediatorConfig0.setCoreAPIScheme("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = mediatorConfig0.getDynamicConfig();
        java.lang.String str6 = mediatorConfig0.getCoreAPIUsername();
        org.openhim.mediator.engine.RegistrationConfig registrationConfig7 = mediatorConfig0.getRegistrationConfig();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(sSLContext2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(registrationConfig7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        org.openhim.mediator.engine.CoreResponse.Response response1 = coreResponse0.getResponse();
        org.openhim.mediator.engine.CoreResponse.Response response2 = new org.openhim.mediator.engine.CoreResponse.Response();
        coreResponse0.setResponse(response2);
        coreResponse0.setStatus("");
        org.openhim.mediator.engine.CoreResponse.Orchestration orchestration6 = null;
        coreResponse0.addOrchestration(orchestration6);
        org.junit.Assert.assertNull(response1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        java.lang.String str1 = coreResponse0.getDescriptiveStatus();
        java.lang.String str2 = coreResponse0.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Successful" + "'", str1, "Successful");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse1 = new org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse("\013application/json+openhim\034\r");
        boolean boolean2 = sendHeartbeatToCoreResponse1.receivedConfigUpdate();
        java.lang.String str3 = sendHeartbeatToCoreResponse1.getRawResponse();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\013application/json+openhim\034\r" + "'", str3, "\013application/json+openhim\034\r");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.io.InputStream inputStream0 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream0, "hi!");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore4 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream5 = keyStore4.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore7 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream8 = keyStore7.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore10 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream11 = keyStore10.getInputStream();
        java.io.InputStream inputStream12 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore14 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream12, "hi!");
        java.io.InputStream inputStream15 = keyStore14.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore18 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("", "hi!");
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray19 = new org.openhim.mediator.engine.MediatorConfig.KeyStore[] { keyStore4, keyStore7, keyStore10, keyStore14, keyStore18 };
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext20 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore2, keyStoreArray19);
        java.io.InputStream inputStream21 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore23 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream21, "hi!");
        java.io.InputStream inputStream24 = keyStore23.getInputStream();
        java.io.InputStream inputStream25 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore27 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream25, "hi!");
        java.io.InputStream inputStream28 = keyStore27.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore30 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream31 = keyStore30.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext32 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore27, keyStore30);
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore34 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream35 = keyStore34.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore37 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream38 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore40 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream38, "hi!");
        java.io.InputStream inputStream41 = keyStore40.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore43 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream44 = keyStore43.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext45 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore40, keyStore43);
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray46 = new org.openhim.mediator.engine.MediatorConfig.KeyStore[] { keyStore30, keyStore34, keyStore37, keyStore43 };
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext48 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore23, keyStoreArray46, true);
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext50 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore2, keyStoreArray46, true);
        java.io.InputStream inputStream51 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore53 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream51, "hi!");
        java.io.InputStream inputStream54 = keyStore53.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore56 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream57 = keyStore56.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext58 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore53, keyStore56);
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray59 = sSLContext58.getTrustStores();
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray60 = sSLContext58.getTrustStores();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext62 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore2, keyStoreArray60, true);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(keyStoreArray19);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertNull(inputStream31);
        org.junit.Assert.assertNull(inputStream35);
        org.junit.Assert.assertNull(inputStream41);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNotNull(keyStoreArray46);
        org.junit.Assert.assertNull(inputStream54);
        org.junit.Assert.assertNull(inputStream57);
        org.junit.Assert.assertNotNull(keyStoreArray59);
        org.junit.Assert.assertNotNull(keyStoreArray60);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorSocketRequest mediatorSocketRequest5 = new org.openhim.mediator.engine.messages.MediatorSocketRequest(actorRef0, actorRef1, "\013\034\r", (java.lang.Integer) 10, "application/json");
        org.openhim.mediator.engine.RoutingTable routingTable6 = new org.openhim.mediator.engine.RoutingTable();
        java.lang.Class<? extends akka.actor.Actor> wildcardClass8 = routingTable6.getActorClassForPath("application/json+openhim");
        java.lang.Class<? extends akka.actor.Actor> wildcardClass10 = routingTable6.getActorClassForPath("application/json+openhim");
        org.openhim.mediator.engine.RoutingTable.RouteAlreadyMappedException routeAlreadyMappedException11 = routingTable6.new RouteAlreadyMappedException();
        java.lang.Throwable[] throwableArray12 = routeAlreadyMappedException11.getSuppressed();
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse13 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorSocketRequest5, (java.lang.Throwable) routeAlreadyMappedException11);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        akka.actor.ActorRef actorRef9 = null;
        akka.actor.ActorRef actorRef10 = null;
        akka.actor.ActorRef actorRef15 = null;
        akka.actor.ActorRef actorRef16 = null;
        org.openhim.mediator.engine.CoreResponse.Request request24 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = request24.getHeaders();
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList26 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest28 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef15, actorRef16, "", "https", "application/json+openhim", "", (java.lang.Integer) 10, "hi!", "hi!", strMap25, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList26, "application/json+openhim");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList29 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest31 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef9, actorRef10, "application/json", "", "", "application/json+openhim", strMap25, strPairList29, "/user/null/application/json");
        akka.actor.ActorRef actorRef32 = null;
        akka.actor.ActorRef actorRef33 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap38 = null;
        akka.actor.ActorRef actorRef39 = null;
        akka.actor.ActorRef actorRef40 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap45 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList46 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest47 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef39, actorRef40, "hi!", "", "hi!", "hi!", strMap45, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList46);
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest49 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef32, actorRef33, "", "", "hi!", "", strMap38, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList46, "hi!");
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest51 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "application/json", "/user/null/application/json", "Successful", "application/json", (java.lang.Integer) 10, "/user/null/\013application/json+openhim\034\r", "Successful", strMap25, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList46, "/user/application/json//user/null/");
        java.util.Map<java.lang.String, java.lang.String> strMap52 = mediatorHTTPRequest51.getHeaders();
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap52);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("");
        registrationConfig1.setContent("application/json+openhim");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = registrationConfig1.getURN();
            org.junit.Assert.fail("Expected exception of type org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException; message: Invalid registration config - failed to read mediator URN");
        } catch (org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore1 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore3 = null;
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext4 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore2, keyStore3);
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray5 = sSLContext4.getTrustStores();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext7 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore1, keyStoreArray5, false);
        java.lang.String str8 = keyStore1.getPassword();
        java.io.InputStream inputStream9 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore11 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream9, "hi!");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore13 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream14 = keyStore13.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore16 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream17 = keyStore16.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore19 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream20 = keyStore19.getInputStream();
        java.io.InputStream inputStream21 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore23 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream21, "hi!");
        java.io.InputStream inputStream24 = keyStore23.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore27 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("", "hi!");
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray28 = new org.openhim.mediator.engine.MediatorConfig.KeyStore[] { keyStore13, keyStore16, keyStore19, keyStore23, keyStore27 };
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext29 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore11, keyStoreArray28);
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext30 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore1, keyStoreArray28);
        org.junit.Assert.assertNotNull(keyStoreArray5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNotNull(keyStoreArray28);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore1 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("/user/null/application/json");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        mediatorConfig0.setCoreAPIScheme("{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.407-0600\"},\"orchestrations\":[],\"properties\":{}}");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorSocketRequest mediatorSocketRequest8 = new org.openhim.mediator.engine.messages.MediatorSocketRequest(actorRef0, actorRef1, "hi!", "https", "hi!", (java.lang.Integer) 1, "\013application/json+openhim\034\r", true);
        java.lang.String str9 = mediatorSocketRequest8.getBody();
        akka.actor.ActorRef actorRef10 = mediatorSocketRequest8.getRequestHandler();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\013application/json+openhim\034\r" + "'", str9, "\013application/json+openhim\034\r");
        org.junit.Assert.assertNull(actorRef10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("");
        registrationConfig1.setMethod("hi!");
        java.lang.String str4 = registrationConfig1.getMethod();
        java.lang.String str5 = registrationConfig1.getContentType();
        registrationConfig1.setPath("https");
        registrationConfig1.setMethod("");
        java.lang.String str10 = registrationConfig1.getMethod();
        registrationConfig1.setMethod("{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.342-0600\"},\"orchestrations\":[],\"properties\":{}}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "application/json" + "'", str5, "application/json");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        akka.actor.ActorRef actorRef9 = null;
        akka.actor.ActorRef actorRef10 = null;
        akka.actor.ActorRef actorRef15 = null;
        akka.actor.ActorRef actorRef16 = null;
        org.openhim.mediator.engine.CoreResponse.Request request24 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = request24.getHeaders();
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList26 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest28 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef15, actorRef16, "", "https", "application/json+openhim", "", (java.lang.Integer) 10, "hi!", "hi!", strMap25, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList26, "application/json+openhim");
        java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList29 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest31 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef9, actorRef10, "application/json", "", "", "application/json+openhim", strMap25, strPairList29, "/user/null/application/json");
        akka.actor.ActorRef actorRef32 = null;
        akka.actor.ActorRef actorRef33 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap38 = null;
        akka.actor.ActorRef actorRef39 = null;
        akka.actor.ActorRef actorRef40 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap45 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList46 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest47 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef39, actorRef40, "hi!", "", "hi!", "hi!", strMap45, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList46);
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest49 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef32, actorRef33, "", "", "hi!", "", strMap38, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList46, "hi!");
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest51 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "application/json", "/user/null/application/json", "Successful", "application/json", (java.lang.Integer) 10, "/user/null/\013application/json+openhim\034\r", "Successful", strMap25, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList46, "/user/application/json//user/null/");
        java.lang.String str52 = mediatorHTTPRequest51.getUri();
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        org.openhim.mediator.engine.messages.FinishRequest finishRequest3 = new org.openhim.mediator.engine.messages.FinishRequest("", strMap1, (java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = finishRequest3.getResponseMimeType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.openhim.mediator.engine.messages.SendHeartbeatToCore sendHeartbeatToCore2 = new org.openhim.mediator.engine.messages.SendHeartbeatToCore((long) (short) -1, false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.openhim.mediator.engine.messages.FinishRequest finishRequest3 = new org.openhim.mediator.engine.messages.FinishRequest("/user/null/application/json", "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.342-0600\"},\"orchestrations\":[],\"properties\":{}}", (java.lang.Integer) 8080);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse2 = new org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse("application/json+openhim", strMap1);
        boolean boolean3 = sendHeartbeatToCoreResponse2.requestSucceeded();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.openhim.mediator.engine.CoreResponse.Response response0 = new org.openhim.mediator.engine.CoreResponse.Response();
        response0.setStatus((java.lang.Integer) 10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        org.openhim.mediator.engine.CoreResponse.Response response1 = coreResponse0.getResponse();
        org.openhim.mediator.engine.CoreResponse.Response response2 = new org.openhim.mediator.engine.CoreResponse.Response();
        coreResponse0.setResponse(response2);
        coreResponse0.setStatus("");
        coreResponse0.setUrn("{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.342-0600\"},\"orchestrations\":[],\"properties\":{}}");
        org.junit.Assert.assertNull(response1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.openhim.mediator.engine.messages.SendHeartbeatToCore sendHeartbeatToCore2 = new org.openhim.mediator.engine.messages.SendHeartbeatToCore((long) 'a', true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.openhim.mediator.engine.messages.SendHeartbeatToCore sendHeartbeatToCore1 = new org.openhim.mediator.engine.messages.SendHeartbeatToCore((long) (short) -1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.openhim.mediator.engine.messages.FinishRequest finishRequest3 = new org.openhim.mediator.engine.messages.FinishRequest("application/json+openhim", "hi!", (java.lang.Integer) 0);
        java.lang.String str4 = finishRequest3.getResponseMimeType();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = finishRequest3.getResponseHeaders();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest8 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "\013\034\r", "/user/null/\013application/json+openhim\034\r", "", "application/json+openhim", (java.lang.Integer) 1, "\013\034\r");
        org.openhim.mediator.engine.CoreResponse.Request request11 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str12 = request11.getPath();
        org.openhim.mediator.engine.CoreResponse.Request request13 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str14 = request13.getPath();
        java.lang.String str15 = request13.getQueryString();
        akka.actor.ActorRef actorRef16 = null;
        akka.actor.ActorRef actorRef17 = null;
        org.openhim.mediator.engine.CoreResponse.Request request25 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = request25.getHeaders();
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList27 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest29 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef16, actorRef17, "", "https", "application/json+openhim", "", (java.lang.Integer) 10, "hi!", "hi!", strMap26, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList27, "application/json+openhim");
        request13.setHeaders(strMap26);
        request11.setHeaders(strMap26);
        org.openhim.mediator.engine.messages.MediatorHTTPResponse mediatorHTTPResponse32 = new org.openhim.mediator.engine.messages.MediatorHTTPResponse(mediatorHTTPRequest8, "application/json", (java.lang.Integer) 100, strMap26);
        org.openhim.mediator.engine.messages.FinishRequest finishRequest34 = mediatorHTTPResponse32.toFinishRequest(true);
        java.lang.String str35 = finishRequest34.getResponseMimeType();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(finishRequest34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest8 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "\013\034\r", "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.407-0600\"},\"orchestrations\":[],\"properties\":{}}", "/user/null/application/json", "/user/null/application/json", (java.lang.Integer) 0, "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.342-0600\"},\"orchestrations\":[],\"properties\":{}}");
        java.lang.String str9 = mediatorHTTPRequest8.getScheme();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/user/null/application/json" + "'", str9, "/user/null/application/json");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse1 = new org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse("\013application/json+openhim\034\r");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = sendHeartbeatToCoreResponse1.getConfig();
        org.junit.Assert.assertNull(strMap2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        mediatorConfig0.setProperties("");
        java.lang.Integer int5 = mediatorConfig0.getRootTimeout();
        java.lang.String str7 = mediatorConfig0.userPathFor("application/json");
        mediatorConfig0.setHeartbeatsEnabled(true);
        mediatorConfig0.setHeartbeatPeriodSeconds((int) (short) -1);
        mediatorConfig0.setHeartbeatsEnabled(true);
        org.openhim.mediator.engine.RoutingTable routingTable14 = new org.openhim.mediator.engine.RoutingTable();
        mediatorConfig0.setRoutingTable(routingTable14);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/user/null/application/json" + "'", str7, "/user/null/application/json");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = request0.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.getHeaders();
        java.lang.String str3 = request0.getPath();
        request0.setMethod("hi!");
        request0.putHeader("/user/null/", "/user/application/json//user/null/");
        java.lang.String str9 = request0.getMethod();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore1 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream2 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore4 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream2, "hi!");
        java.io.InputStream inputStream5 = keyStore4.getInputStream();
        java.io.InputStream inputStream6 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore8 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream6, "hi!");
        java.io.InputStream inputStream9 = keyStore8.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore11 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream12 = keyStore11.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext13 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore8, keyStore11);
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore15 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream16 = keyStore15.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore18 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream19 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore21 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream19, "hi!");
        java.io.InputStream inputStream22 = keyStore21.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore24 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream25 = keyStore24.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext26 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore21, keyStore24);
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray27 = new org.openhim.mediator.engine.MediatorConfig.KeyStore[] { keyStore11, keyStore15, keyStore18, keyStore24 };
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext29 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore4, keyStoreArray27, true);
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext30 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore1, keyStore4);
        java.io.InputStream inputStream31 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore33 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream31, "https");
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext34 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore4, keyStore33);
        java.lang.String str35 = keyStore33.getPassword();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNotNull(keyStoreArray27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "https" + "'", str35, "https");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        java.lang.Throwable throwable0 = null;
        org.openhim.mediator.engine.CoreResponse.ParseException parseException1 = new org.openhim.mediator.engine.CoreResponse.ParseException(throwable0);
        java.lang.Throwable throwable2 = null;
        org.openhim.mediator.engine.CoreResponse.ParseException parseException3 = new org.openhim.mediator.engine.CoreResponse.ParseException(throwable2);
        org.openhim.mediator.engine.CoreResponse.ParseException parseException4 = new org.openhim.mediator.engine.CoreResponse.ParseException((java.lang.Throwable) parseException3);
        org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException invalidRegistrationContentException6 = new org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException("hi!");
        parseException3.addSuppressed((java.lang.Throwable) invalidRegistrationContentException6);
        parseException1.addSuppressed((java.lang.Throwable) parseException3);
        java.lang.String str9 = parseException1.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.openhim.mediator.engine.CoreResponse$ParseException" + "'", str9, "org.openhim.mediator.engine.CoreResponse$ParseException");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.lang.Throwable throwable0 = null;
        org.openhim.mediator.engine.CoreResponse.ParseException parseException1 = new org.openhim.mediator.engine.CoreResponse.ParseException(throwable0);
        org.openhim.mediator.engine.CoreResponse.ParseException parseException2 = new org.openhim.mediator.engine.CoreResponse.ParseException((java.lang.Throwable) parseException1);
        org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException invalidRegistrationContentException4 = new org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException("hi!");
        parseException1.addSuppressed((java.lang.Throwable) invalidRegistrationContentException4);
        org.openhim.mediator.engine.messages.ExceptError exceptError6 = new org.openhim.mediator.engine.messages.ExceptError((java.lang.Throwable) invalidRegistrationContentException4);
        java.lang.Object obj7 = exceptError6.getOriginalRequest();
        java.lang.Throwable throwable8 = exceptError6.getError();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "hi!");
        org.junit.Assert.assertEquals(throwable8.toString(), "org.openhim.mediator.engine.RegistrationConfig$InvalidRegistrationContentException: hi!");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = request0.getHeaders();
        java.lang.String str2 = request0.getHost();
        request0.setMethod("");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.openhim.mediator.engine.messages.RegisterMediatorWithCoreResponse registerMediatorWithCoreResponse3 = new org.openhim.mediator.engine.messages.RegisterMediatorWithCoreResponse(false, (java.lang.Integer) 8080, "/user/application/json//user/null/");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.String str1 = mediatorConfig0.getCoreAPIPassword();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext2 = mediatorConfig0.getSSLContext();
        org.openhim.mediator.engine.StartupActorsConfig startupActorsConfig3 = new org.openhim.mediator.engine.StartupActorsConfig();
        org.openhim.mediator.engine.StartupActorsConfig.ActorToLaunch actorToLaunch4 = null;
        startupActorsConfig3.addActor(actorToLaunch4);
        mediatorConfig0.setStartupActors(startupActorsConfig3);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(sSLContext2);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.Integer int1 = mediatorConfig0.getServerPort();
        mediatorConfig0.setCoreHost("application/json+openhim");
        java.io.InputStream inputStream4 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore6 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream4, "hi!");
        java.io.InputStream inputStream7 = keyStore6.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore9 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream10 = keyStore9.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext11 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore6, keyStore9);
        mediatorConfig0.setSSLContext(sSLContext11);
        mediatorConfig0.setName("\013\034\r");
        mediatorConfig0.setName("{\"orchestrations\":[],\"properties\":{}}");
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext17 = mediatorConfig0.getSSLContext();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(sSLContext17);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        org.openhim.mediator.engine.CoreResponse.Response response1 = coreResponse0.getResponse();
        org.openhim.mediator.engine.CoreResponse.Response response2 = new org.openhim.mediator.engine.CoreResponse.Response();
        coreResponse0.setResponse(response2);
        java.lang.String str4 = coreResponse0.getStatus();
        org.junit.Assert.assertNull(response1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        akka.actor.ActorRef actorRef7 = null;
        akka.actor.ActorRef actorRef8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList14 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest15 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef7, actorRef8, "hi!", "", "hi!", "hi!", strMap13, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList14);
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest17 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "", "", "hi!", "", strMap6, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList14, "hi!");
        org.openhim.mediator.engine.messages.MediatorSocketResponse mediatorSocketResponse19 = new org.openhim.mediator.engine.messages.MediatorSocketResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest17, "\013application/json+openhim\034\r");
        java.lang.String str20 = mediatorSocketResponse19.getBody();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\013application/json+openhim\034\r" + "'", str20, "\013application/json+openhim\034\r");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.io.InputStream inputStream0 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore2 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream0, "https");
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext3 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.openhim.mediator.engine.CoreResponse.Response response0 = new org.openhim.mediator.engine.CoreResponse.Response();
        org.openhim.mediator.engine.CoreResponse.Request request1 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request1.getHeaders();
        response0.setHeaders(strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response0.getHeaders();
        java.lang.Integer int5 = response0.getStatus();
        org.openhim.mediator.engine.CoreResponse.Request request8 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = request8.getHeaders();
        org.openhim.mediator.engine.messages.MediatorHTTPResponse mediatorHTTPResponse10 = new org.openhim.mediator.engine.messages.MediatorHTTPResponse("application/json+openhim", (java.lang.Integer) (-1), strMap9);
        response0.setHeaders(strMap9);
        response0.setBody("/user/null/");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.openhim.mediator.engine.StartupActorsConfig startupActorsConfig0 = new org.openhim.mediator.engine.StartupActorsConfig();
        java.util.List<org.openhim.mediator.engine.StartupActorsConfig.ActorToLaunch> actorToLaunchList1 = startupActorsConfig0.getActors();
        org.openhim.mediator.engine.StartupActorsConfig.ActorToLaunch actorToLaunch2 = null;
        startupActorsConfig0.addActor(actorToLaunch2);
        java.util.List<org.openhim.mediator.engine.StartupActorsConfig.ActorToLaunch> actorToLaunchList4 = startupActorsConfig0.getActors();
        org.junit.Assert.assertNotNull(actorToLaunchList1);
        org.junit.Assert.assertNotNull(actorToLaunchList4);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList7 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest8 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "hi!", "", "hi!", "hi!", strMap6, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList7);
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse9 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest8);
        java.lang.Integer int10 = mediatorHTTPRequest8.getPort();
        org.openhim.mediator.engine.RoutingTable routingTable11 = new org.openhim.mediator.engine.RoutingTable();
        java.lang.Class<? extends akka.actor.Actor> wildcardClass13 = routingTable11.getActorClassForPath("application/json+openhim");
        java.lang.Class<? extends akka.actor.Actor> wildcardClass15 = routingTable11.getActorClassForPath("application/json+openhim");
        java.lang.Class<?> wildcardClass16 = routingTable11.getClass();
        org.openhim.mediator.engine.messages.SimpleMediatorResponse<java.lang.reflect.GenericDeclaration> genericDeclarationSimpleMediatorResponse17 = new org.openhim.mediator.engine.messages.SimpleMediatorResponse<java.lang.reflect.GenericDeclaration>((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest8, (java.lang.reflect.GenericDeclaration) wildcardClass16);
        org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException invalidRegistrationContentException19 = new org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException("hi!");
        java.lang.Throwable throwable20 = null;
        org.openhim.mediator.engine.CoreResponse.ParseException parseException21 = new org.openhim.mediator.engine.CoreResponse.ParseException(throwable20);
        org.openhim.mediator.engine.CoreResponse.ParseException parseException22 = new org.openhim.mediator.engine.CoreResponse.ParseException((java.lang.Throwable) parseException21);
        org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException invalidRegistrationContentException24 = new org.openhim.mediator.engine.RegistrationConfig.InvalidRegistrationContentException("hi!");
        parseException21.addSuppressed((java.lang.Throwable) invalidRegistrationContentException24);
        invalidRegistrationContentException19.addSuppressed((java.lang.Throwable) invalidRegistrationContentException24);
        java.lang.Throwable throwable27 = null;
        org.openhim.mediator.engine.CoreResponse.ParseException parseException28 = new org.openhim.mediator.engine.CoreResponse.ParseException(throwable27);
        org.openhim.mediator.engine.CoreResponse.ParseException parseException29 = new org.openhim.mediator.engine.CoreResponse.ParseException((java.lang.Throwable) parseException28);
        invalidRegistrationContentException19.addSuppressed((java.lang.Throwable) parseException28);
        org.openhim.mediator.engine.messages.ExceptError exceptError31 = new org.openhim.mediator.engine.messages.ExceptError((java.lang.Object) mediatorHTTPRequest8, (java.lang.Throwable) parseException28);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.openhim.mediator.engine.CoreResponse.Request request2 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = request2.getHeaders();
        org.openhim.mediator.engine.messages.MediatorHTTPResponse mediatorHTTPResponse4 = new org.openhim.mediator.engine.messages.MediatorHTTPResponse("application/json+openhim", (java.lang.Integer) (-1), strMap3);
        java.lang.String str5 = mediatorHTTPResponse4.getBody();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = mediatorHTTPResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "application/json+openhim" + "'", str5, "application/json+openhim");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList10 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest11 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "hi!", "hi!", "", "", (java.lang.Integer) 0, "", "application/json+openhim", strMap9, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList10);
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest12 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(mediatorHTTPRequest11);
        akka.actor.ActorRef actorRef13 = mediatorHTTPRequest12.getRespondTo();
        org.junit.Assert.assertNull(actorRef13);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        boolean boolean1 = org.openhim.mediator.engine.connectors.MLLPConnector.isMLLPWrapped("{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.342-0600\"},\"orchestrations\":[],\"properties\":{}}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest8 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "POST", "/user/application/json//user/null/", "hi!", "org.openhim.mediator.engine.CoreResponse$ParseException", (java.lang.Integer) 10, "\013\034\r");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest5 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "org.openhim.mediator.engine.CoreResponse$ParseException", "", "Successful");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        akka.actor.ActorRef actorRef7 = null;
        akka.actor.ActorRef actorRef8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList14 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest15 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef7, actorRef8, "hi!", "", "hi!", "hi!", strMap13, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList14);
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest17 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "", "", "hi!", "", strMap6, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList14, "hi!");
        java.lang.String str18 = mediatorHTTPRequest17.getBody();
        akka.actor.ActorRef actorRef19 = null;
        akka.actor.ActorRef actorRef20 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList26 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest27 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef19, actorRef20, "hi!", "", "hi!", "hi!", strMap25, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList26);
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse28 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest27);
        java.lang.Integer int29 = mediatorHTTPRequest27.getPort();
        org.openhim.mediator.engine.RoutingTable routingTable30 = new org.openhim.mediator.engine.RoutingTable();
        java.lang.Class<? extends akka.actor.Actor> wildcardClass32 = routingTable30.getActorClassForPath("application/json+openhim");
        java.lang.Class<? extends akka.actor.Actor> wildcardClass34 = routingTable30.getActorClassForPath("application/json+openhim");
        java.lang.Class<?> wildcardClass35 = routingTable30.getClass();
        org.openhim.mediator.engine.messages.SimpleMediatorResponse<java.lang.reflect.GenericDeclaration> genericDeclarationSimpleMediatorResponse36 = new org.openhim.mediator.engine.messages.SimpleMediatorResponse<java.lang.reflect.GenericDeclaration>((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest27, (java.lang.reflect.GenericDeclaration) wildcardClass35);
        java.lang.reflect.GenericDeclaration genericDeclaration37 = genericDeclarationSimpleMediatorResponse36.getResponseObject();
        java.lang.reflect.GenericDeclaration genericDeclaration38 = genericDeclarationSimpleMediatorResponse36.getResponseObject();
        org.openhim.mediator.engine.messages.SimpleMediatorResponse<java.lang.reflect.GenericDeclaration> genericDeclarationSimpleMediatorResponse39 = new org.openhim.mediator.engine.messages.SimpleMediatorResponse<java.lang.reflect.GenericDeclaration>((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest17, genericDeclaration38);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(genericDeclaration37);
        org.junit.Assert.assertNotNull(genericDeclaration38);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.openhim.mediator.engine.RoutingTable routingTable0 = new org.openhim.mediator.engine.RoutingTable();
        java.lang.Class<? extends akka.actor.Actor> wildcardClass2 = routingTable0.getActorClassForPath("application/json+openhim");
        java.lang.Class<? extends akka.actor.Actor> wildcardClass4 = routingTable0.getActorClassForPath("application/json+openhim");
        java.lang.Class<?> wildcardClass5 = routingTable0.getClass();
        org.openhim.mediator.engine.CoreResponse.Request request6 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str7 = request6.getPath();
        boolean boolean8 = org.openhim.mediator.engine.messages.SimpleMediatorResponse.isInstanceOf((java.lang.Class) wildcardClass5, (java.lang.Object) request6);
        akka.actor.ActorRef actorRef9 = null;
        akka.actor.ActorRef actorRef10 = null;
        org.openhim.mediator.engine.CoreResponse.Response response15 = new org.openhim.mediator.engine.CoreResponse.Response();
        org.openhim.mediator.engine.CoreResponse.Request request16 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = request16.getHeaders();
        response15.setHeaders(strMap17);
        akka.actor.ActorRef actorRef19 = null;
        akka.actor.ActorRef actorRef20 = null;
        org.openhim.mediator.engine.CoreResponse.Request request27 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = request27.getHeaders();
        org.openhim.mediator.engine.messages.MediatorHTTPResponse mediatorHTTPResponse29 = new org.openhim.mediator.engine.messages.MediatorHTTPResponse("application/json+openhim", (java.lang.Integer) (-1), strMap28);
        akka.actor.ActorRef actorRef30 = null;
        akka.actor.ActorRef actorRef31 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap39 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList40 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest41 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef30, actorRef31, "hi!", "hi!", "", "", (java.lang.Integer) 0, "", "application/json+openhim", strMap39, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList40);
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest43 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef19, actorRef20, "/user/null/\013application/json+openhim\034\r", "/user/null/\013application/json+openhim\034\r", "/user/application/json//user/null/", "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.342-0600\"},\"orchestrations\":[],\"properties\":{}}", strMap28, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList40, "application/json");
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest44 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef9, actorRef10, "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.407-0600\"},\"orchestrations\":[],\"properties\":{}}", "/user/null/\013application/json+openhim\034\r", "{\"orchestrations\":[],\"properties\":{}}", "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.342-0600\"},\"orchestrations\":[],\"properties\":{}}", strMap17, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList40);
        boolean boolean45 = org.openhim.mediator.engine.messages.SimpleMediatorRequest.isInstanceOf((java.lang.Class) wildcardClass5, (java.lang.Object) actorRef9);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorSocketRequest mediatorSocketRequest5 = new org.openhim.mediator.engine.messages.MediatorSocketRequest(actorRef0, actorRef1, "{\"orchestrations\":[],\"properties\":{}}", (java.lang.Integer) 0, "/user/null/\013application/json+openhim\034\r");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        java.lang.String str2 = request0.getQueryString();
        request0.setQueryString("https");
        java.lang.String str5 = request0.getHost();
        java.lang.String str6 = request0.getBody();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.String str1 = mediatorConfig0.getCoreAPIPassword();
        java.lang.Integer int2 = mediatorConfig0.getServerPort();
        org.openhim.mediator.engine.RoutingTable routingTable3 = mediatorConfig0.getRoutingTable();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(routingTable3);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList7 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest8 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "hi!", "", "hi!", "hi!", strMap6, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList7);
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse9 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest8);
        java.lang.Integer int10 = mediatorHTTPRequest8.getPort();
        org.openhim.mediator.engine.RoutingTable routingTable11 = new org.openhim.mediator.engine.RoutingTable();
        java.lang.Class<? extends akka.actor.Actor> wildcardClass13 = routingTable11.getActorClassForPath("application/json+openhim");
        java.lang.Class<? extends akka.actor.Actor> wildcardClass15 = routingTable11.getActorClassForPath("application/json+openhim");
        java.lang.Class<?> wildcardClass16 = routingTable11.getClass();
        org.openhim.mediator.engine.messages.SimpleMediatorResponse<java.lang.reflect.GenericDeclaration> genericDeclarationSimpleMediatorResponse17 = new org.openhim.mediator.engine.messages.SimpleMediatorResponse<java.lang.reflect.GenericDeclaration>((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest8, (java.lang.reflect.GenericDeclaration) wildcardClass16);
        akka.actor.ActorRef actorRef18 = null;
        akka.actor.ActorRef actorRef19 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        akka.actor.ActorRef actorRef25 = null;
        akka.actor.ActorRef actorRef26 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap31 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList32 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest33 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef25, actorRef26, "hi!", "", "hi!", "hi!", strMap31, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList32);
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest35 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef18, actorRef19, "", "", "hi!", "", strMap24, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList32, "hi!");
        boolean boolean36 = org.openhim.mediator.engine.messages.SimpleMediatorRequest.isInstanceOf((java.lang.Class) wildcardClass16, (java.lang.Object) strPairList32);
        org.openhim.mediator.engine.CoreResponse.Request request37 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str38 = request37.getPath();
        request37.setQueryString("");
        boolean boolean41 = org.openhim.mediator.engine.messages.SimpleMediatorResponse.isInstanceOf((java.lang.Class) wildcardClass16, (java.lang.Object) request37);
        java.util.Map<java.lang.String, java.lang.String> strMap42 = request37.getHeaders();
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strMap42);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        java.lang.String str2 = request0.getQueryString();
        request0.setPort("hi!");
        request0.setMethod("");
        request0.setPath("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = request0.getHeaders();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.lang.Throwable throwable0 = null;
        org.openhim.mediator.engine.CoreResponse.ParseException parseException1 = new org.openhim.mediator.engine.CoreResponse.ParseException(throwable0);
        org.openhim.mediator.engine.messages.ExceptError exceptError2 = new org.openhim.mediator.engine.messages.ExceptError((java.lang.Throwable) parseException1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.openhim.mediator.engine.CoreResponse.Response response0 = new org.openhim.mediator.engine.CoreResponse.Response();
        org.openhim.mediator.engine.CoreResponse.Request request1 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request1.getHeaders();
        response0.setHeaders(strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response0.getHeaders();
        response0.setBody("https");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.String str2 = mediatorConfig0.userPathFor("");
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext3 = mediatorConfig0.getSSLContext();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/user/null/" + "'", str2, "/user/null/");
        org.junit.Assert.assertNull(sSLContext3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        java.lang.String str2 = request0.getQueryString();
        akka.actor.ActorRef actorRef3 = null;
        akka.actor.ActorRef actorRef4 = null;
        org.openhim.mediator.engine.CoreResponse.Request request12 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = request12.getHeaders();
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList14 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest16 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef3, actorRef4, "", "https", "application/json+openhim", "", (java.lang.Integer) 10, "hi!", "hi!", strMap13, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList14, "application/json+openhim");
        request0.setHeaders(strMap13);
        java.util.Date date18 = request0.getTimestamp();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Mon Nov 20 03:10:01 CST 2023");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.Integer int1 = mediatorConfig0.getServerPort();
        mediatorConfig0.setCoreHost("application/json+openhim");
        java.util.Properties properties4 = mediatorConfig0.getProperties();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext5 = mediatorConfig0.getSSLContext();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(properties4);
        org.junit.Assert.assertNull(sSLContext5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.String str1 = mediatorConfig0.getCoreAPIPassword();
        mediatorConfig0.setName("application/json");
        java.lang.Integer int4 = mediatorConfig0.getRootTimeout();
        java.lang.String str5 = mediatorConfig0.getCoreHost();
        // The following exception was thrown during execution in test generation
        try {
            org.openhim.mediator.engine.MediatorRootActor mediatorRootActor6 = new org.openhim.mediator.engine.MediatorRootActor(mediatorConfig0);
            org.junit.Assert.fail("Expected exception of type akka.actor.ActorInitializationException; message: You cannot create an instance of [org.openhim.mediator.engine.MediatorRootActor] explicitly using the constructor (new). You have to use one of the 'actorOf' factory methods to create a new actor. See the documentation.");
        } catch (akka.actor.ActorInitializationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse1 = new org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse("\013application/json+openhim\034\r");
        boolean boolean2 = sendHeartbeatToCoreResponse1.requestSucceeded();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.openhim.mediator.engine.messages.SendHeartbeatToCore sendHeartbeatToCore1 = new org.openhim.mediator.engine.messages.SendHeartbeatToCore((long) 8080);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        org.openhim.mediator.engine.CoreResponse.Response response1 = coreResponse0.getResponse();
        org.openhim.mediator.engine.CoreResponse.Response response2 = new org.openhim.mediator.engine.CoreResponse.Response();
        coreResponse0.setResponse(response2);
        org.openhim.mediator.engine.CoreResponse.Request request4 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str5 = request4.getPath();
        org.openhim.mediator.engine.CoreResponse.Request request6 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str7 = request6.getPath();
        java.lang.String str8 = request6.getQueryString();
        akka.actor.ActorRef actorRef9 = null;
        akka.actor.ActorRef actorRef10 = null;
        org.openhim.mediator.engine.CoreResponse.Request request18 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = request18.getHeaders();
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList20 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest22 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef9, actorRef10, "", "https", "application/json+openhim", "", (java.lang.Integer) 10, "hi!", "hi!", strMap19, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList20, "application/json+openhim");
        request6.setHeaders(strMap19);
        request4.setHeaders(strMap19);
        request4.setHost("");
        org.openhim.mediator.engine.CoreResponse.Response response28 = new org.openhim.mediator.engine.CoreResponse.Response();
        org.openhim.mediator.engine.CoreResponse.Request request29 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = request29.getHeaders();
        response28.setHeaders(strMap30);
        org.openhim.mediator.engine.messages.FinishRequest finishRequest33 = new org.openhim.mediator.engine.messages.FinishRequest("application/json", strMap30, (java.lang.Integer) 0);
        request4.setHeaders(strMap30);
        coreResponse0.setProperties(strMap30);
        org.junit.Assert.assertNull(response1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.openhim.mediator.engine.RoutingTable routingTable0 = new org.openhim.mediator.engine.RoutingTable();
        java.lang.Class<? extends akka.actor.Actor> wildcardClass2 = routingTable0.getActorClassForPath("/user/application/json//user/null/");
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext1 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        java.lang.String str2 = request0.getQueryString();
        java.lang.String str3 = request0.getPath();
        request0.setPath("\013application/json+openhim\034\r");
        request0.setPort("POST");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        mediatorConfig0.setProperties("");
        mediatorConfig0.setName("\013\034\r");
        org.openhim.mediator.engine.StartupActorsConfig startupActorsConfig7 = new org.openhim.mediator.engine.StartupActorsConfig();
        org.openhim.mediator.engine.StartupActorsConfig.ActorToLaunch actorToLaunch8 = null;
        startupActorsConfig7.addActor(actorToLaunch8);
        java.util.List<org.openhim.mediator.engine.StartupActorsConfig.ActorToLaunch> actorToLaunchList10 = startupActorsConfig7.getActors();
        org.openhim.mediator.engine.StartupActorsConfig.ActorToLaunch actorToLaunch11 = null;
        startupActorsConfig7.addActor(actorToLaunch11);
        java.util.List<org.openhim.mediator.engine.StartupActorsConfig.ActorToLaunch> actorToLaunchList13 = startupActorsConfig7.getActors();
        mediatorConfig0.setStartupActors(startupActorsConfig7);
        org.junit.Assert.assertNotNull(actorToLaunchList10);
        org.junit.Assert.assertNotNull(actorToLaunchList13);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        java.lang.String str1 = coreResponse0.getDescriptiveStatus();
        java.util.List<org.openhim.mediator.engine.CoreResponse.Orchestration> orchestrationList2 = null;
        coreResponse0.setOrchestrations(orchestrationList2);
        org.openhim.mediator.engine.CoreResponse.Orchestration[] orchestrationArray4 = new org.openhim.mediator.engine.CoreResponse.Orchestration[] {};
        java.util.ArrayList<org.openhim.mediator.engine.CoreResponse.Orchestration> orchestrationList5 = new java.util.ArrayList<org.openhim.mediator.engine.CoreResponse.Orchestration>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.openhim.mediator.engine.CoreResponse.Orchestration>) orchestrationList5, orchestrationArray4);
        coreResponse0.setOrchestrations((java.util.List<org.openhim.mediator.engine.CoreResponse.Orchestration>) orchestrationList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = coreResponse0.getProperties();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Successful" + "'", str1, "Successful");
        org.junit.Assert.assertNotNull(orchestrationArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest5 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "\013\034\r", "\013application/json+openhim\034\r", "POST");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.SimpleMediatorRequest<java.lang.CharSequence> charSequenceSimpleMediatorRequest3 = new org.openhim.mediator.engine.messages.SimpleMediatorRequest<java.lang.CharSequence>(actorRef0, actorRef1, (java.lang.CharSequence) "{\"response\":{\"headers\":{},\"timestamp\":\"2023-11-20T03:09:59.305-0600\"},\"orchestrations\":[],\"properties\":{}}");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest5 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "hi!", "hi!", "");
        java.lang.Throwable throwable6 = null;
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse7 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest5, throwable6);
        java.lang.Throwable throwable8 = setupSSLContextResponse7.getError();
        org.openhim.mediator.engine.messages.MediatorRequestMessage mediatorRequestMessage9 = setupSSLContextResponse7.getOriginalRequest();
        boolean boolean10 = setupSSLContextResponse7.isSuccessful();
        org.junit.Assert.assertNull(throwable8);
        org.junit.Assert.assertNotNull(mediatorRequestMessage9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore1 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("application/json");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore1 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream2 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore4 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream2, "hi!");
        java.io.InputStream inputStream5 = keyStore4.getInputStream();
        java.io.InputStream inputStream6 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore8 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream6, "hi!");
        java.io.InputStream inputStream9 = keyStore8.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore11 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream12 = keyStore11.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext13 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore8, keyStore11);
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore15 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream16 = keyStore15.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore18 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream19 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore21 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream19, "hi!");
        java.io.InputStream inputStream22 = keyStore21.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore24 = new org.openhim.mediator.engine.MediatorConfig.KeyStore("");
        java.io.InputStream inputStream25 = keyStore24.getInputStream();
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext26 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore21, keyStore24);
        org.openhim.mediator.engine.MediatorConfig.KeyStore[] keyStoreArray27 = new org.openhim.mediator.engine.MediatorConfig.KeyStore[] { keyStore11, keyStore15, keyStore18, keyStore24 };
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext29 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore4, keyStoreArray27, true);
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext30 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore1, keyStore4);
        java.io.InputStream inputStream31 = null;
        org.openhim.mediator.engine.MediatorConfig.KeyStore keyStore33 = new org.openhim.mediator.engine.MediatorConfig.KeyStore(inputStream31, "https");
        org.openhim.mediator.engine.MediatorConfig.SSLContext sSLContext34 = new org.openhim.mediator.engine.MediatorConfig.SSLContext(keyStore4, keyStore33);
        boolean boolean35 = sSLContext34.getTrustAll();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNotNull(keyStoreArray27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse1 = new org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse("/user/null/");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.lang.Throwable throwable0 = null;
        org.openhim.mediator.engine.CoreResponse.ParseException parseException1 = new org.openhim.mediator.engine.CoreResponse.ParseException(throwable0);
        org.openhim.mediator.engine.messages.ExceptError exceptError2 = new org.openhim.mediator.engine.messages.ExceptError(throwable0);
        java.lang.Object obj3 = exceptError2.getOriginalRequest();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = mediatorConfig0.getDynamicConfig();
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        java.lang.String str1 = coreResponse0.toString();
        org.openhim.mediator.engine.CoreResponse.Orchestration orchestration2 = null;
        coreResponse0.addOrchestration(orchestration2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{\"orchestrations\":[],\"properties\":{}}" + "'", str1, "{\"orchestrations\":[],\"properties\":{}}");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.messages.MediatorSocketRequest mediatorSocketRequest5 = new org.openhim.mediator.engine.messages.MediatorSocketRequest(actorRef0, actorRef1, "", (java.lang.Integer) 10, "org.openhim.mediator.engine.CoreResponse$ParseException");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        java.lang.String str2 = request0.getQueryString();
        request0.setQueryString("https");
        request0.setMethod("hi!");
        java.lang.String str7 = request0.getMethod();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.lang.String str1 = request0.getPath();
        java.lang.String str2 = request0.getQueryString();
        request0.setPort("hi!");
        request0.putHeader("POST", "");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList7 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest8 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "hi!", "", "hi!", "hi!", strMap6, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList7);
        org.openhim.mediator.engine.messages.SetupSSLContextResponse setupSSLContextResponse9 = new org.openhim.mediator.engine.messages.SetupSSLContextResponse((org.openhim.mediator.engine.messages.MediatorRequestMessage) mediatorHTTPRequest8);
        org.openhim.mediator.engine.messages.MediatorRequestMessage mediatorRequestMessage10 = setupSSLContextResponse9.getOriginalRequest();
        boolean boolean11 = setupSSLContextResponse9.isSuccessful();
        org.junit.Assert.assertNotNull(mediatorRequestMessage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = request0.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = request0.getHeaders();
        java.lang.String str3 = request0.getPath();
        request0.setMethod("hi!");
        request0.putHeader("/user/null/", "/user/application/json//user/null/");
        java.lang.String str9 = request0.getQueryString();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        mediatorConfig0.setCoreHost("application/json+openhim");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig3 = mediatorConfig0.getRegistrationConfig();
        java.lang.String str4 = mediatorConfig0.getServerHost();
        org.openhim.mediator.engine.StartupActorsConfig startupActorsConfig5 = new org.openhim.mediator.engine.StartupActorsConfig();
        org.openhim.mediator.engine.StartupActorsConfig.ActorToLaunch actorToLaunch6 = null;
        startupActorsConfig5.addActor(actorToLaunch6);
        java.util.List<org.openhim.mediator.engine.StartupActorsConfig.ActorToLaunch> actorToLaunchList8 = startupActorsConfig5.getActors();
        org.openhim.mediator.engine.StartupActorsConfig.ActorToLaunch actorToLaunch9 = null;
        startupActorsConfig5.addActor(actorToLaunch9);
        org.openhim.mediator.engine.StartupActorsConfig.ActorToLaunch actorToLaunch11 = null;
        startupActorsConfig5.addActor(actorToLaunch11);
        mediatorConfig0.setStartupActors(startupActorsConfig5);
        java.lang.String str14 = mediatorConfig0.getCoreAPIScheme();
        org.junit.Assert.assertNull(registrationConfig3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(actorToLaunchList8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "https" + "'", str14, "https");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        akka.actor.ActorRef actorRef0 = null;
        akka.actor.ActorRef actorRef1 = null;
        org.openhim.mediator.engine.CoreResponse.Request request11 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = request11.getHeaders();
        org.openhim.mediator.engine.messages.MediatorHTTPResponse mediatorHTTPResponse13 = new org.openhim.mediator.engine.messages.MediatorHTTPResponse("application/json+openhim", (java.lang.Integer) (-1), strMap12);
        java.lang.String str14 = mediatorHTTPResponse13.getBody();
        org.openhim.mediator.engine.messages.FinishRequest finishRequest15 = mediatorHTTPResponse13.toFinishRequest();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = mediatorHTTPResponse13.getHeaders();
        akka.actor.ActorRef actorRef17 = null;
        akka.actor.ActorRef actorRef18 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>> strPairList24 = new java.util.ArrayList<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>();
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest25 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef17, actorRef18, "hi!", "", "hi!", "hi!", strMap23, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList24);
        org.openhim.mediator.engine.messages.MediatorHTTPRequest mediatorHTTPRequest26 = new org.openhim.mediator.engine.messages.MediatorHTTPRequest(actorRef0, actorRef1, "", "/user/application/json//user/null/", "Successful", "", (java.lang.Integer) (-1), "application/json", "application/json", strMap16, (java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String>>) strPairList24);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "application/json+openhim" + "'", str14, "application/json+openhim");
        org.junit.Assert.assertNotNull(finishRequest15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        org.openhim.mediator.engine.CoreResponse.Response response1 = coreResponse0.getResponse();
        org.openhim.mediator.engine.CoreResponse.Response response2 = coreResponse0.getResponse();
        coreResponse0.setUrn("hi!");
        org.junit.Assert.assertNull(response1);
        org.junit.Assert.assertNull(response2);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse sendHeartbeatToCoreResponse3 = new org.openhim.mediator.engine.messages.SendHeartbeatToCoreResponse(false, "application/json+openhim", strMap2);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = sendHeartbeatToCoreResponse3.getConfig();
        java.lang.String str5 = sendHeartbeatToCoreResponse3.getRawResponse();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = sendHeartbeatToCoreResponse3.getConfig();
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "application/json+openhim" + "'", str5, "application/json+openhim");
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.openhim.mediator.engine.messages.FinishRequest finishRequest4 = new org.openhim.mediator.engine.messages.FinishRequest("", "hi!", (java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = finishRequest4.getResponseHeaders();
        org.openhim.mediator.engine.messages.FinishRequest finishRequest7 = new org.openhim.mediator.engine.messages.FinishRequest("hi!", strMap5, (java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.openhim.mediator.engine.CoreResponse.Request request0 = new org.openhim.mediator.engine.CoreResponse.Request();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = request0.getHeaders();
        java.lang.String str2 = request0.getQueryString();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        java.lang.String str1 = coreResponse0.toString();
        org.openhim.mediator.engine.CoreResponse coreResponse2 = new org.openhim.mediator.engine.CoreResponse();
        java.lang.String str3 = coreResponse2.toString();
        java.util.List<org.openhim.mediator.engine.CoreResponse.Orchestration> orchestrationList4 = coreResponse2.getOrchestrations();
        org.openhim.mediator.engine.CoreResponse.Response response5 = new org.openhim.mediator.engine.CoreResponse.Response();
        coreResponse2.setResponse(response5);
        coreResponse0.setResponse(response5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{\"orchestrations\":[],\"properties\":{}}" + "'", str1, "{\"orchestrations\":[],\"properties\":{}}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{\"orchestrations\":[],\"properties\":{}}" + "'", str3, "{\"orchestrations\":[],\"properties\":{}}");
        org.junit.Assert.assertNotNull(orchestrationList4);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.openhim.mediator.engine.MediatorConfig mediatorConfig0 = new org.openhim.mediator.engine.MediatorConfig();
        java.lang.Integer int1 = mediatorConfig0.getServerPort();
        mediatorConfig0.setServerPort((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        org.openhim.mediator.engine.RegistrationConfig registrationConfig1 = new org.openhim.mediator.engine.RegistrationConfig("");
        registrationConfig1.setMethod("hi!");
        java.lang.String str4 = registrationConfig1.getMethod();
        java.lang.String str5 = registrationConfig1.getContentType();
        registrationConfig1.setPath("https");
        java.lang.String str8 = registrationConfig1.getContent();
        registrationConfig1.setContent("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "application/json" + "'", str5, "application/json");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        java.lang.String str1 = coreResponse0.toString();
        java.lang.String str2 = coreResponse0.toJSON();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{\"orchestrations\":[],\"properties\":{}}" + "'", str1, "{\"orchestrations\":[],\"properties\":{}}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{\"orchestrations\":[],\"properties\":{}}" + "'", str2, "{\"orchestrations\":[],\"properties\":{}}");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.lang.Throwable throwable0 = null;
        org.openhim.mediator.engine.CoreResponse.ParseException parseException1 = new org.openhim.mediator.engine.CoreResponse.ParseException(throwable0);
        org.openhim.mediator.engine.CoreResponse.ParseException parseException2 = new org.openhim.mediator.engine.CoreResponse.ParseException((java.lang.Throwable) parseException1);
        java.lang.Throwable[] throwableArray3 = parseException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
    }
}
