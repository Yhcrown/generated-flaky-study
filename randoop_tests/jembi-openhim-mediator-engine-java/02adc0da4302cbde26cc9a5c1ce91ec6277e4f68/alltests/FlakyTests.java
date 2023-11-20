import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTests{
    public static boolean debug = false;


    public void test087_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date5.toString(), "Tue Oct 31 18:53:23 CDT 2023");
    }

    public void test121_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        org.openhim.mediator.engine.CoreResponse.Response response1 = coreResponse0.getResponse();
        org.openhim.mediator.engine.CoreResponse.Response response2 = new org.openhim.mediator.engine.CoreResponse.Response();
        coreResponse0.setResponse(response2);
        java.lang.String str4 = coreResponse0.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = coreResponse0.getProperties();
        org.junit.Assert.assertNull(response1);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{\"response\":{\"headers\":{}

    public void test124_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.openhim.mediator.engine.CoreResponse coreResponse0 = new org.openhim.mediator.engine.CoreResponse();
        org.openhim.mediator.engine.CoreResponse.Response response1 = coreResponse0.getResponse();
        org.openhim.mediator.engine.CoreResponse.Response response2 = new org.openhim.mediator.engine.CoreResponse.Response();
        coreResponse0.setResponse(response2);
        java.lang.String str4 = coreResponse0.toString();
        java.lang.String str5 = coreResponse0.toJSON();
        org.junit.Assert.assertNull(response1);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{\"response\":{\"headers\":{}

    public void test136_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date6.toString(), "Tue Oct 31 18:53:24 CDT 2023");
    }

    public void test236_1() throws Throwable {
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
         org.junit.Assert.assertEquals(date18.toString(), "Tue Oct 31 18:53:26 CDT 2023");
    }
}