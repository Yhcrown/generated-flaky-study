package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test102_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig9.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header13 = requestConfig9.getHeader("hi!");
        requestConfig9.setSocketTimeout((int) ' ');
        com.anitech.resting.Resting resting16 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.Resting resting17 = resting8.enableProcessingHooks();
        com.anitech.resting.http.Header header21 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str22 = header21.getValue();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig25 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig23, requestConfig24);
        requestConfig24.setConnectTimeout(10);
        // The following exception was thrown during execution in test generation
{          try {
            com.anitech.resting.http.response.RestingResponse restingResponse28 = null; // flaky: resting8.PUT("application/json", (java.lang.Object) str22, requestConfig24);
// flaky:             org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: org.apache.http.client.ClientProtocolException");
// flaky:         } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertNotNull(resting7);
        org.junit.Assert.assertNotNull(resting8);
        org.junit.Assert.assertNull(header13);
        org.junit.Assert.assertNotNull(resting16);
        org.junit.Assert.assertNotNull(resting17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertNotNull(requestConfig25);
    }
	@Test
    public void test102_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig9.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header13 = requestConfig9.getHeader("hi!");
        requestConfig9.setSocketTimeout((int) ' ');
        com.anitech.resting.Resting resting16 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.Resting resting17 = resting8.enableProcessingHooks();
        com.anitech.resting.http.Header header21 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str22 = header21.getValue();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig25 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig23, requestConfig24);
        requestConfig24.setConnectTimeout(10);
        // The following exception was thrown during execution in test generation
{ // flaky:         try {
            com.anitech.resting.http.response.RestingResponse restingResponse28 = null;  resting8.PUT("application/json", (java.lang.Object) str22, requestConfig24);
// flaky:             org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: org.apache.http.client.ClientProtocolException");
// flaky:         } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertNotNull(resting7);
        org.junit.Assert.assertNotNull(resting8);
        org.junit.Assert.assertNull(header13);
        org.junit.Assert.assertNotNull(resting16);
        org.junit.Assert.assertNotNull(resting17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertNotNull(requestConfig25);
    }
	@Test
    public void test102_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig9.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header13 = requestConfig9.getHeader("hi!");
        requestConfig9.setSocketTimeout((int) ' ');
        com.anitech.resting.Resting resting16 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.Resting resting17 = resting8.enableProcessingHooks();
        com.anitech.resting.http.Header header21 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str22 = header21.getValue();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig25 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig23, requestConfig24);
        requestConfig24.setConnectTimeout(10);
        // The following exception was thrown during execution in test generation
{ // flaky:         try {
            com.anitech.resting.http.response.RestingResponse restingResponse28 = null; // flaky: resting8.PUT("application/json", (java.lang.Object) str22, requestConfig24);
             org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: org.apache.http.client.ClientProtocolException");
// flaky:         } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertNotNull(resting7);
        org.junit.Assert.assertNotNull(resting8);
        org.junit.Assert.assertNull(header13);
        org.junit.Assert.assertNotNull(resting16);
        org.junit.Assert.assertNotNull(resting17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertNotNull(requestConfig25);
    }
	@Test
    public void test102_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig9.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header13 = requestConfig9.getHeader("hi!");
        requestConfig9.setSocketTimeout((int) ' ');
        com.anitech.resting.Resting resting16 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.Resting resting17 = resting8.enableProcessingHooks();
        com.anitech.resting.http.Header header21 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str22 = header21.getValue();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig25 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig23, requestConfig24);
        requestConfig24.setConnectTimeout(10);
        // The following exception was thrown during execution in test generation
{ // flaky:         try {
            com.anitech.resting.http.response.RestingResponse restingResponse28 = null; // flaky: resting8.PUT("application/json", (java.lang.Object) str22, requestConfig24);
// flaky:             org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: org.apache.http.client.ClientProtocolException");
         } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertNotNull(resting7);
        org.junit.Assert.assertNotNull(resting8);
        org.junit.Assert.assertNull(header13);
        org.junit.Assert.assertNotNull(resting16);
        org.junit.Assert.assertNotNull(resting17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertNotNull(requestConfig25);
    }
}