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
        com.anitech.resting.Resting.setEnableProcessingHooks(false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        boolean boolean0 = com.anitech.resting.Resting.isEnableProcessingHooks();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        org.apache.http.HttpResponse httpResponse0 = null;
        com.anitech.resting.http.response.RestingResponse restingResponse1 = new com.anitech.resting.http.response.RestingResponse(httpResponse0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = restingResponse1.getHttpStatus();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = com.anitech.resting.util.RestingConstants.CONTENT_TYPE_APPLICATION_XML;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/xml" + "'", str0, "application/xml");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.String str0 = com.anitech.resting.util.RestingConstants.CONTENT_TYPE_APPLICATION_JSON;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/json" + "'", str0, "application/json");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.Resting.getGlobalRequestConfig();
        org.junit.Assert.assertNull(requestConfig0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        org.apache.http.HttpResponse httpResponse0 = null;
        com.anitech.resting.http.response.RestingResponse restingResponse1 = new com.anitech.resting.http.response.RestingResponse(httpResponse0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = restingResponse1.getBody();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.anitech.resting.Resting.setEnableMetrics(true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        org.apache.http.HttpResponse httpResponse0 = null;
        com.anitech.resting.http.response.RestingResponse restingResponse1 = new com.anitech.resting.http.response.RestingResponse(httpResponse0);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.Header[] headerArray3 = restingResponse1.getHeaders("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.apache.http.HttpResponse httpResponse0 = null;
        com.anitech.resting.http.response.RestingResponse restingResponse1 = new com.anitech.resting.http.response.RestingResponse(httpResponse0);
        // The following exception was thrown during execution in test generation
        try {
            long long2 = restingResponse1.getContentLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        org.apache.http.HttpResponse httpResponse0 = null;
        com.anitech.resting.http.response.RestingResponse restingResponse1 = new com.anitech.resting.http.response.RestingResponse(httpResponse0);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.Header header2 = restingResponse1.getContentEncoding();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str0 = com.anitech.resting.util.RestingConstants.REQUEST_XML_ROOT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "request" + "'", str0, "request");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        org.apache.http.HttpResponse httpResponse0 = null;
        com.anitech.resting.http.response.RestingResponse restingResponse1 = new com.anitech.resting.http.response.RestingResponse(httpResponse0);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.Header[] headerArray2 = restingResponse1.getAllHeaders();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.apache.http.HttpResponse httpResponse0 = null;
        com.anitech.resting.http.response.RestingResponse restingResponse1 = new com.anitech.resting.http.response.RestingResponse(httpResponse0);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.Header[] headerArray3 = restingResponse1.getHeaders("application/json");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        java.lang.Class<?> wildcardClass1 = requestConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity4 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) (-1), requestConfig1);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.anitech.resting.http.request.RequestBuilder requestBuilder0 = new com.anitech.resting.http.request.RequestBuilder();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.anitech.resting.http.response.ResponseIntercepter responseIntercepter0 = new com.anitech.resting.http.response.ResponseIntercepter();
        java.lang.Class<?> wildcardClass1 = responseIntercepter0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.anitech.resting.util.RestingUtil restingUtil0 = new com.anitech.resting.util.RestingUtil();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.apache.http.HttpResponse httpResponse0 = null;
        com.anitech.resting.http.response.RestingResponse restingResponse1 = new com.anitech.resting.http.response.RestingResponse(httpResponse0);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.Header[] headerArray3 = restingResponse1.getHeaders("application/xml");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        org.apache.http.HttpResponse httpResponse0 = null;
        com.anitech.resting.http.response.RestingResponse restingResponse1 = new com.anitech.resting.http.response.RestingResponse(httpResponse0);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.Header header2 = restingResponse1.getContentType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        requestConfig1.setConnectTimeout((int) (byte) 0);
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String str0 = com.anitech.resting.Resting.getBaseURI();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.anitech.resting.http.request.RequestIntercepter requestIntercepter0 = new com.anitech.resting.http.request.RequestIntercepter();
        java.lang.Class<?> wildcardClass1 = requestIntercepter0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.apache.http.HttpResponse httpResponse0 = null;
        com.anitech.resting.http.response.RestingResponse restingResponse1 = new com.anitech.resting.http.response.RestingResponse(httpResponse0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = restingResponse1.getStatusCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.anitech.resting.util.RestingConstants restingConstants0 = new com.anitech.resting.util.RestingConstants();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.apache.http.HttpResponse httpResponse0 = null;
        com.anitech.resting.http.response.RestingResponse restingResponse1 = new com.anitech.resting.http.response.RestingResponse(httpResponse0);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.Header[] headerArray3 = restingResponse1.getHeaders("Name: application/xml, Value: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.request.RequestConfig requestConfig5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity6 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) requestConfig4, requestConfig5);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.Throwable throwable1 = null;
        com.anitech.resting.exception.RestingException restingException2 = new com.anitech.resting.exception.RestingException(throwable1);
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException();
        java.lang.Throwable throwable5 = null;
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException(throwable5);
        com.anitech.resting.exception.RestingException restingException7 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException6);
        restingException4.addSuppressed((java.lang.Throwable) restingException7);
        restingException2.addSuppressed((java.lang.Throwable) restingException4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header5 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str6 = header5.toString();
        java.lang.String str7 = header5.toString();
        java.lang.String str8 = header5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            requestConfig1.addHeader(header5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Name: application/xml, Value: " + "'", str6, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Name: application/xml, Value: " + "'", str7, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.lang.Throwable throwable1 = null;
        com.anitech.resting.exception.RestingException restingException2 = new com.anitech.resting.exception.RestingException(throwable1);
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException("Name: application/xml, Value: ", (java.lang.Throwable) restingException3);
        java.lang.String str5 = restingException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException" + "'", str5, "com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.anitech.resting.Resting.setEnableMetrics(false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("Name: , Value: application/xml", "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = requestConfig1.getHeaders();
        org.apache.http.Header[] headerArray4 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray3);
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNotNull(headerArray4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("", "application/xml");
        java.lang.String str8 = header7.toString();
        java.lang.String str9 = header7.getValue();
        // The following exception was thrown during execution in test generation
        try {
            requestConfig4.addHeader(header7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Name: , Value: application/xml" + "'", str8, "Name: , Value: application/xml");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "application/xml" + "'", str9, "application/xml");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        boolean boolean0 = com.anitech.resting.Resting.isEnableMetrics();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.anitech.resting.Resting.setEnableProcessingHooks(true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header5 = requestConfig1.getHeader("hi!");
        int int6 = requestConfig1.getSocketTimeout();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity7 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) (byte) 10, requestConfig1);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(header5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.Throwable throwable0 = null;
        com.anitech.resting.exception.RestingException restingException1 = new com.anitech.resting.exception.RestingException(throwable0);
        com.anitech.resting.exception.RestingException restingException2 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException1);
        java.lang.Class<?> wildcardClass3 = restingException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.anitech.resting.Resting.setBaseURI("hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig0.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray3 = requestConfig0.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig4 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig5 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig5.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig8 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig4, requestConfig5);
        com.anitech.resting.http.Header header11 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str12 = header11.getValue();
        java.lang.String str13 = header11.toString();
        requestConfig5.addHeader(header11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity15 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) requestConfig0, requestConfig5);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNotNull(requestConfig8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Name: application/xml, Value: " + "'", str13, "Name: application/xml, Value: ");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.anitech.resting.Resting.setBaseURI("application/json");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.anitech.resting.Resting.setBaseURI("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.anitech.resting.exception.RestingException restingException1 = new com.anitech.resting.exception.RestingException("application/json");
        com.anitech.resting.exception.RestingException restingException2 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException1);
        java.lang.String str3 = restingException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.anitech.resting.exception.RestingException: application/json" + "'", str3, "com.anitech.resting.exception.RestingException: application/json");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = new com.anitech.resting.http.Header[] {};
        requestConfig0.setHeaders(headerArray3);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        java.lang.Class<?> wildcardClass6 = requestConfig0.getClass();
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.Header[] headerArray17 = requestConfig16.getHeaders();
        java.lang.Class<?> wildcardClass18 = requestConfig16.getClass();
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        // The following exception was thrown during execution in test generation
        try {
            requestConfig1.addHeader("hi!", "Name: , Value: application/xml");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig0.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header4 = requestConfig0.getHeader("hi!");
        requestConfig0.setSocketTimeout((int) ' ');
        com.anitech.resting.http.Header[] headerArray7 = requestConfig0.getHeaders();
        org.junit.Assert.assertNull(header4);
        org.junit.Assert.assertNotNull(headerArray7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = new com.anitech.resting.http.Header[] {};
        requestConfig0.setHeaders(headerArray3);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        // The following exception was thrown during execution in test generation
        try {
            requestConfig0.addHeader("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.lang.Throwable throwable0 = null;
        com.anitech.resting.exception.RestingException restingException1 = new com.anitech.resting.exception.RestingException(throwable0);
        com.anitech.resting.exception.RestingException restingException2 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException1);
        java.lang.String str3 = restingException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException" + "'", str3, "com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.Header header12 = requestConfig1.getHeader("request");
        com.anitech.resting.http.Header header15 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str16 = header15.toString();
        com.anitech.resting.http.Header header19 = new com.anitech.resting.http.Header("", "application/xml");
        java.lang.String str20 = header19.toString();
        com.anitech.resting.http.Header[] headerArray21 = new com.anitech.resting.http.Header[] { header15, header19 };
        requestConfig1.setHeaders(headerArray21);
        // The following exception was thrown during execution in test generation
        try {
            requestConfig1.addHeader("request", "Name: application/xml, Value: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNull(header12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Name: application/xml, Value: " + "'", str16, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Name: , Value: application/xml" + "'", str20, "Name: , Value: application/xml");
        org.junit.Assert.assertNotNull(headerArray21);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.lang.Throwable throwable2 = null;
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException(throwable2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException3);
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", (java.lang.Throwable) restingException3);
        java.lang.Throwable throwable7 = null;
        com.anitech.resting.exception.RestingException restingException8 = new com.anitech.resting.exception.RestingException(throwable7);
        com.anitech.resting.exception.RestingException restingException9 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException8);
        restingException3.addSuppressed((java.lang.Throwable) restingException9);
        java.lang.String str11 = restingException9.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.anitech.resting.exception.RestingException: hi!" + "'", str11, "com.anitech.resting.exception.RestingException: hi!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig1.getHeaders();
        requestConfig0.setHeaders(headerArray4);
        int int6 = requestConfig0.getSocketTimeout();
        requestConfig0.setConnectTimeout((int) (short) -1);
        com.anitech.resting.http.Header header10 = requestConfig0.getHeader("com.anitech.resting.exception.RestingException: hi!");
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(header10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse2 = resting0.DELETE("Name: application/xml, Value: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptionName: application/xml, Value: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse2 = resting0.GET("request");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptionrequest");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig2, requestConfig3);
        com.anitech.resting.http.Header[] headerArray5 = requestConfig3.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig6 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig6.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header10 = requestConfig6.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig3, requestConfig6);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse12 = resting0.DELETE("Name: application/xml, Value: ", requestConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptionName: application/xml, Value: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertNotNull(headerArray5);
        org.junit.Assert.assertNull(header10);
        org.junit.Assert.assertNotNull(requestConfig11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig3.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig2, requestConfig3);
        com.anitech.resting.http.Header header9 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str10 = header9.getValue();
        java.lang.String str11 = header9.toString();
        requestConfig3.addHeader(header9);
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig13, requestConfig14);
        com.anitech.resting.http.Header[] headerArray16 = new com.anitech.resting.http.Header[] {};
        requestConfig13.setHeaders(headerArray16);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig13);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig13);
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig3, requestConfig13);
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig21, requestConfig22);
        com.anitech.resting.http.Header[] headerArray24 = requestConfig22.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig25 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig25.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header29 = requestConfig25.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig30 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig22, requestConfig25);
        com.anitech.resting.http.request.RequestConfig requestConfig31 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig3, requestConfig30);
        com.anitech.resting.http.Header[] headerArray32 = requestConfig30.getHeaders();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse33 = resting0.POST("request", (java.lang.Object) requestConfig30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptionrequest");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Name: application/xml, Value: " + "'", str11, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(requestConfig22);
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertNull(header29);
        org.junit.Assert.assertNotNull(requestConfig30);
        org.junit.Assert.assertNotNull(requestConfig31);
        org.junit.Assert.assertNotNull(headerArray32);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        java.lang.Object obj11 = header7.clone();
        java.lang.String str12 = header7.getName();
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "application/xml" + "'", str12, "application/xml");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.Header[] headerArray14 = new com.anitech.resting.http.Header[] {};
        requestConfig11.setHeaders(headerArray14);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig19, requestConfig20);
        com.anitech.resting.http.Header[] headerArray22 = new com.anitech.resting.http.Header[] {};
        requestConfig19.setHeaders(headerArray22);
        com.anitech.resting.http.request.RequestConfig requestConfig24 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig25 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig25.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray28 = requestConfig25.getHeaders();
        requestConfig24.setHeaders(headerArray28);
        org.apache.http.Header[] headerArray30 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray28);
        requestConfig19.setHeaders(headerArray28);
        requestConfig1.setHeaders(headerArray28);
        // The following exception was thrown during execution in test generation
        try {
            requestConfig1.addHeader("Name: , Value: application/xml", "com.anitech.resting.exception.RestingException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertNotNull(headerArray30);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig3.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig2, requestConfig3);
        com.anitech.resting.http.Header header9 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str10 = header9.getValue();
        java.lang.String str11 = header9.toString();
        requestConfig3.addHeader(header9);
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig13, requestConfig14);
        com.anitech.resting.http.Header[] headerArray16 = new com.anitech.resting.http.Header[] {};
        requestConfig13.setHeaders(headerArray16);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig13);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig13);
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig3, requestConfig13);
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig21, requestConfig22);
        com.anitech.resting.http.Header[] headerArray24 = requestConfig22.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig25 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig25.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header29 = requestConfig25.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig30 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig22, requestConfig25);
        com.anitech.resting.http.request.RequestConfig requestConfig31 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig3, requestConfig30);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse32 = resting0.GET("application/json", requestConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptionapplication/json");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Name: application/xml, Value: " + "'", str11, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(requestConfig22);
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertNull(header29);
        org.junit.Assert.assertNotNull(requestConfig30);
        org.junit.Assert.assertNotNull(requestConfig31);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = requestConfig1.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig4 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig4.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header8 = requestConfig4.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig4);
        com.anitech.resting.http.request.RequestConfig requestConfig10 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig10, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig13, requestConfig14);
        requestConfig14.setConnectTimeout(10);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig14);
        com.anitech.resting.http.Header[] headerArray19 = requestConfig14.getHeaders();
        requestConfig4.setHeaders(headerArray19);
        com.anitech.resting.http.request.RequestConfig requestConfig21 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity23 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) headerArray19, requestConfig21);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNull(header8);
        org.junit.Assert.assertNotNull(requestConfig9);
        org.junit.Assert.assertNotNull(requestConfig10);
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(headerArray19);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.request.RequestConfig requestConfig5 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig6 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig6.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig5, requestConfig6);
        com.anitech.resting.http.Header header12 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str13 = header12.getValue();
        java.lang.String str14 = header12.toString();
        requestConfig6.addHeader(header12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig17 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig16, requestConfig17);
        com.anitech.resting.http.Header[] headerArray19 = new com.anitech.resting.http.Header[] {};
        requestConfig16.setHeaders(headerArray19);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig16);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig16);
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig6, requestConfig16);
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig16);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig24);
        java.lang.Class<?> wildcardClass26 = requestConfig24.getClass();
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertNotNull(requestConfig9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Name: application/xml, Value: " + "'", str14, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(requestConfig17);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = new com.anitech.resting.http.Header[] {};
        requestConfig0.setHeaders(headerArray3);
        com.anitech.resting.http.request.RequestConfig requestConfig5 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig6 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig6.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray9 = requestConfig6.getHeaders();
        requestConfig5.setHeaders(headerArray9);
        org.apache.http.Header[] headerArray11 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray9);
        requestConfig0.setHeaders(headerArray9);
        java.lang.Class<?> wildcardClass13 = requestConfig0.getClass();
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig10 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig10, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig13 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig13.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header17 = requestConfig13.getHeader("hi!");
        int int18 = requestConfig13.getSocketTimeout();
        com.anitech.resting.http.Header[] headerArray19 = requestConfig13.getHeaders();
        requestConfig11.setHeaders(headerArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse21 = resting5.POST("Name: application/xml, Value: ", (java.lang.Object) headerArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptionName: application/xml, Value: ");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(requestConfig10);
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNull(header17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(headerArray19);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse9 = resting7.GET("application/xml");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptionapplication/xml");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        // The following exception was thrown during execution in test generation
        try {
            requestConfig1.addHeader("application/xml", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig16);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.Header[] headerArray14 = new com.anitech.resting.http.Header[] {};
        requestConfig11.setHeaders(headerArray14);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig19, requestConfig20);
        com.anitech.resting.http.Header[] headerArray22 = new com.anitech.resting.http.Header[] {};
        requestConfig19.setHeaders(headerArray22);
        com.anitech.resting.http.request.RequestConfig requestConfig24 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig25 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig25.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray28 = requestConfig25.getHeaders();
        requestConfig24.setHeaders(headerArray28);
        org.apache.http.Header[] headerArray30 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray28);
        requestConfig19.setHeaders(headerArray28);
        requestConfig1.setHeaders(headerArray28);
        requestConfig1.setConnectTimeout((int) ' ');
        com.anitech.resting.http.request.RequestConfig requestConfig35 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig36 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig37 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig35, requestConfig36);
        com.anitech.resting.http.request.RequestConfig requestConfig38 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig39 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig40 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig38, requestConfig39);
        requestConfig39.setConnectTimeout(10);
        com.anitech.resting.http.request.RequestConfig requestConfig43 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig37, requestConfig39);
        com.anitech.resting.http.Header header45 = requestConfig39.getHeader("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity46 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) ' ', requestConfig39);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertNotNull(headerArray30);
        org.junit.Assert.assertNotNull(requestConfig35);
        org.junit.Assert.assertNotNull(requestConfig36);
        org.junit.Assert.assertNotNull(requestConfig37);
        org.junit.Assert.assertNotNull(requestConfig38);
        org.junit.Assert.assertNotNull(requestConfig39);
        org.junit.Assert.assertNotNull(requestConfig40);
        org.junit.Assert.assertNotNull(requestConfig43);
        org.junit.Assert.assertNull(header45);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("request", "application/xml");
        java.lang.String str3 = header2.getName();
        java.lang.String str4 = header2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "request" + "'", str3, "request");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "request" + "'", str4, "request");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.http.request.RequestConfig requestConfig8 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig9.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        requestConfig8.setHeaders(headerArray12);
        int int14 = requestConfig8.getSocketTimeout();
        requestConfig8.setConnectTimeout((int) (short) -1);
        com.anitech.resting.Resting resting17 = resting7.globalRequestConfig(requestConfig8);
        com.anitech.resting.Resting resting18 = resting17.enableMetrics();
        com.anitech.resting.Resting resting20 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig21, requestConfig22);
        com.anitech.resting.http.Header[] headerArray24 = requestConfig22.getHeaders();
        com.anitech.resting.Resting resting25 = resting20.globalRequestConfig(requestConfig22);
        com.anitech.resting.http.request.RequestConfig requestConfig26 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting27 = resting25.globalRequestConfig(requestConfig26);
        com.anitech.resting.Resting resting28 = resting25.enableMetrics();
        com.anitech.resting.Resting resting30 = resting25.baseURI("application/xml");
        com.anitech.resting.http.request.RequestConfig requestConfig31 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig32 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig33 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig31, requestConfig32);
        com.anitech.resting.http.Header[] headerArray34 = new com.anitech.resting.http.Header[] {};
        requestConfig31.setHeaders(headerArray34);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig31);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig31);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse38 = resting18.POST("com.anitech.resting.exception.RestingException: application/json", (java.lang.Object) resting30, requestConfig31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 62: application/xmlcom.anitech.resting.exception.RestingException: application/json");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(resting17);
        org.junit.Assert.assertNotNull(resting18);
        org.junit.Assert.assertNotNull(resting20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(requestConfig22);
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertNotNull(resting25);
        org.junit.Assert.assertNotNull(requestConfig26);
        org.junit.Assert.assertNotNull(resting27);
        org.junit.Assert.assertNotNull(resting28);
        org.junit.Assert.assertNotNull(resting30);
        org.junit.Assert.assertNotNull(requestConfig31);
        org.junit.Assert.assertNotNull(requestConfig32);
        org.junit.Assert.assertNotNull(requestConfig33);
        org.junit.Assert.assertNotNull(headerArray34);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig4.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header8 = requestConfig4.getHeader("hi!");
        int int9 = requestConfig4.getSocketTimeout();
        com.anitech.resting.http.Header[] headerArray10 = requestConfig4.getHeaders();
        requestConfig2.setHeaders(headerArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity12 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) 'a', requestConfig2);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNull(header8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(headerArray10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.http.request.RequestConfig requestConfig8 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig9.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        requestConfig8.setHeaders(headerArray12);
        int int14 = requestConfig8.getSocketTimeout();
        requestConfig8.setConnectTimeout((int) (short) -1);
        com.anitech.resting.Resting resting17 = resting7.globalRequestConfig(requestConfig8);
        com.anitech.resting.Resting resting18 = resting17.enableMetrics();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse20 = resting18.GET("request");
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: org.apache.http.client.ClientProtocolException");
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(resting17);
        org.junit.Assert.assertNotNull(resting18);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("Name: application/xml, Value: ", "com.anitech.resting.exception.RestingException: hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.anitech.resting.http.request.RequestDataMassager requestDataMassager0 = new com.anitech.resting.http.request.RequestDataMassager();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig2.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig5 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header header8 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str9 = header8.getValue();
        java.lang.String str10 = header8.toString();
        requestConfig2.addHeader(header8);
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig13);
        com.anitech.resting.http.Header[] headerArray15 = new com.anitech.resting.http.Header[] {};
        requestConfig12.setHeaders(headerArray15);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig12);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig12);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig2, requestConfig12);
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig20, requestConfig21);
        com.anitech.resting.http.Header[] headerArray23 = new com.anitech.resting.http.Header[] {};
        requestConfig20.setHeaders(headerArray23);
        com.anitech.resting.http.request.RequestConfig requestConfig25 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig26 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig26.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray29 = requestConfig26.getHeaders();
        requestConfig25.setHeaders(headerArray29);
        org.apache.http.Header[] headerArray31 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray29);
        requestConfig20.setHeaders(headerArray29);
        requestConfig2.setHeaders(headerArray29);
        requestConfig2.setConnectTimeout((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity36 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) requestDataMassager0, requestConfig2);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Name: application/xml, Value: " + "'", str10, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(requestConfig22);
        org.junit.Assert.assertNotNull(headerArray23);
        org.junit.Assert.assertNotNull(headerArray29);
        org.junit.Assert.assertNotNull(headerArray31);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = requestConfig1.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig4 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig4.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header8 = requestConfig4.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig4);
        com.anitech.resting.http.Header header11 = requestConfig4.getHeader("request");
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNull(header8);
        org.junit.Assert.assertNotNull(requestConfig9);
        org.junit.Assert.assertNull(header11);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str3 = header2.toString();
        java.lang.String str4 = header2.toString();
        java.lang.String str5 = header2.toString();
        java.lang.String str6 = header2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Name: application/xml, Value: " + "'", str3, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Name: application/xml, Value: " + "'", str4, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Name: application/xml, Value: " + "'", str5, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "application/xml" + "'", str6, "application/xml");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.anitech.resting.exception.RestingException restingException1 = new com.anitech.resting.exception.RestingException("application/json");
        com.anitech.resting.exception.RestingException restingException2 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException1);
        java.lang.String str3 = restingException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/json" + "'", str3, "com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/json");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.Header[] headerArray17 = requestConfig16.getHeaders();
        java.lang.Class<?> wildcardClass18 = headerArray17.getClass();
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str3 = header2.getName();
        java.lang.String str4 = header2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "application/xml" + "'", str3, "application/xml");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "application/xml" + "'", str4, "application/xml");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.request.RequestConfig requestConfig3 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig3.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header7 = requestConfig3.getHeader("hi!");
        int int8 = requestConfig3.getSocketTimeout();
        com.anitech.resting.http.Header[] headerArray9 = requestConfig3.getHeaders();
        requestConfig1.setHeaders(headerArray9);
        java.lang.Class<?> wildcardClass11 = requestConfig1.getClass();
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNull(header7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.Header header18 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str19 = header18.getValue();
        java.lang.String str20 = header18.toString();
        requestConfig12.addHeader(header18);
        com.anitech.resting.http.request.RequestConfig requestConfig22 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig23.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig26 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig22, requestConfig23);
        com.anitech.resting.http.Header header29 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str30 = header29.getValue();
        java.lang.String str31 = header29.toString();
        requestConfig23.addHeader(header29);
        com.anitech.resting.http.request.RequestConfig requestConfig33 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig34 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig35 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig33, requestConfig34);
        com.anitech.resting.http.Header[] headerArray36 = new com.anitech.resting.http.Header[] {};
        requestConfig33.setHeaders(headerArray36);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig33);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig33);
        com.anitech.resting.http.request.RequestConfig requestConfig40 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig23, requestConfig33);
        com.anitech.resting.http.request.RequestConfig requestConfig41 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig42 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig43 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig41, requestConfig42);
        com.anitech.resting.http.Header[] headerArray44 = new com.anitech.resting.http.Header[] {};
        requestConfig41.setHeaders(headerArray44);
        com.anitech.resting.http.request.RequestConfig requestConfig46 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig47 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig47.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray50 = requestConfig47.getHeaders();
        requestConfig46.setHeaders(headerArray50);
        org.apache.http.Header[] headerArray52 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray50);
        requestConfig41.setHeaders(headerArray50);
        requestConfig23.setHeaders(headerArray50);
        requestConfig12.setHeaders(headerArray50);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity56 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) header7, requestConfig12);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Name: application/xml, Value: " + "'", str20, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Name: application/xml, Value: " + "'", str31, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig33);
        org.junit.Assert.assertNotNull(requestConfig34);
        org.junit.Assert.assertNotNull(requestConfig35);
        org.junit.Assert.assertNotNull(headerArray36);
        org.junit.Assert.assertNotNull(requestConfig40);
        org.junit.Assert.assertNotNull(requestConfig41);
        org.junit.Assert.assertNotNull(requestConfig42);
        org.junit.Assert.assertNotNull(requestConfig43);
        org.junit.Assert.assertNotNull(headerArray44);
        org.junit.Assert.assertNotNull(headerArray50);
        org.junit.Assert.assertNotNull(headerArray52);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = new com.anitech.resting.http.Header[] {};
        requestConfig0.setHeaders(headerArray3);
        com.anitech.resting.http.Header[] headerArray5 = requestConfig0.getHeaders();
        com.anitech.resting.http.Header header8 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str9 = header8.getValue();
        // The following exception was thrown during execution in test generation
        try {
            requestConfig0.addHeader(header8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNotNull(headerArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting9 = resting5.baseURI("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        com.anitech.resting.Resting resting11 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig13);
        com.anitech.resting.http.Header[] headerArray15 = requestConfig13.getHeaders();
        com.anitech.resting.Resting resting16 = resting11.globalRequestConfig(requestConfig13);
        com.anitech.resting.http.request.RequestConfig requestConfig17 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting18 = resting16.globalRequestConfig(requestConfig17);
        com.anitech.resting.Resting resting19 = resting16.enableMetrics();
        com.anitech.resting.Resting resting21 = resting16.baseURI("application/xml");
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse22 = resting5.PUT("application/json", (java.lang.Object) resting16);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
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
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(resting11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertNotNull(resting16);
        org.junit.Assert.assertNotNull(requestConfig17);
        org.junit.Assert.assertNotNull(resting18);
        org.junit.Assert.assertNotNull(resting19);
        org.junit.Assert.assertNotNull(resting21);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig7 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig8 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig7, requestConfig8);
        com.anitech.resting.http.Header[] headerArray10 = new com.anitech.resting.http.Header[] {};
        requestConfig7.setHeaders(headerArray10);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig7);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig7);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig7);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig7);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse16 = resting5.DELETE("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/json", requestConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 62: application/xmlcom.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/json");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig7);
        org.junit.Assert.assertNotNull(requestConfig8);
        org.junit.Assert.assertNotNull(requestConfig9);
        org.junit.Assert.assertNotNull(headerArray10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.anitech.resting.exception.RestingException restingException1 = new com.anitech.resting.exception.RestingException();
        java.lang.Throwable throwable2 = null;
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException(throwable2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException3);
        restingException1.addSuppressed((java.lang.Throwable) restingException4);
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException("application/json", (java.lang.Throwable) restingException4);
        java.lang.Throwable throwable9 = null;
        com.anitech.resting.exception.RestingException restingException10 = new com.anitech.resting.exception.RestingException(throwable9);
        com.anitech.resting.exception.RestingException restingException11 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException10);
        com.anitech.resting.exception.RestingException restingException12 = new com.anitech.resting.exception.RestingException("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", (java.lang.Throwable) restingException10);
        restingException6.addSuppressed((java.lang.Throwable) restingException12);
        com.anitech.resting.exception.RestingException restingException14 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.http.request.RequestConfig requestConfig8 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig9.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        requestConfig8.setHeaders(headerArray12);
        int int14 = requestConfig8.getSocketTimeout();
        requestConfig8.setConnectTimeout((int) (short) -1);
        com.anitech.resting.Resting resting17 = resting7.globalRequestConfig(requestConfig8);
        com.anitech.resting.Resting resting18 = resting17.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse21 = resting18.DELETE("hi!", requestConfig20);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: org.apache.http.client.ClientProtocolException");
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(resting17);
        org.junit.Assert.assertNotNull(resting18);
        org.junit.Assert.assertNotNull(requestConfig20);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.anitech.resting.Resting.setBaseURI("com.anitech.resting.exception.RestingException: application/json");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.Header[] headerArray14 = new com.anitech.resting.http.Header[] {};
        requestConfig11.setHeaders(headerArray14);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig19, requestConfig20);
        com.anitech.resting.http.Header[] headerArray22 = requestConfig20.getHeaders();
        requestConfig11.setHeaders(headerArray22);
        org.apache.http.Header[] headerArray24 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray22);
        org.apache.http.Header[] headerArray25 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray22);
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertNotNull(headerArray25);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig17 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.Header[] headerArray18 = requestConfig17.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig16, requestConfig17);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig19);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig19);
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertNotNull(requestConfig19);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
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
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig18, requestConfig19);
        com.anitech.resting.http.Header[] headerArray21 = requestConfig19.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig22 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig22.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header26 = requestConfig22.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig27 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig19, requestConfig22);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse28 = resting16.DELETE("com.anitech.resting.exception.RestingException: hi!", requestConfig22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: application/jsoncom.anitech.resting.exception.RestingException: hi!");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertNull(header26);
        org.junit.Assert.assertNotNull(requestConfig27);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("com.anitech.resting.exception.RestingException: hi!", "hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.http.request.RequestConfig requestConfig10 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig11.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig10, requestConfig11);
        com.anitech.resting.http.Header header17 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str18 = header17.getValue();
        java.lang.String str19 = header17.toString();
        requestConfig11.addHeader(header17);
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig21, requestConfig22);
        com.anitech.resting.http.Header[] headerArray24 = new com.anitech.resting.http.Header[] {};
        requestConfig21.setHeaders(headerArray24);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig21);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig21);
        com.anitech.resting.http.request.RequestConfig requestConfig28 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig21);
        com.anitech.resting.http.request.RequestConfig requestConfig29 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig30 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig31 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig29, requestConfig30);
        com.anitech.resting.http.Header[] headerArray32 = requestConfig30.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig33 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig33.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header37 = requestConfig33.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig38 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig30, requestConfig33);
        com.anitech.resting.http.request.RequestConfig requestConfig39 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig38);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse40 = resting5.PUT("Name: , Value: application/xml", (java.lang.Object) 'a', requestConfig11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: application/jsonName: , Value: application/xml");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Name: application/xml, Value: " + "'", str19, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(requestConfig22);
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertNotNull(requestConfig28);
        org.junit.Assert.assertNotNull(requestConfig29);
        org.junit.Assert.assertNotNull(requestConfig30);
        org.junit.Assert.assertNotNull(requestConfig31);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertNull(header37);
        org.junit.Assert.assertNotNull(requestConfig38);
        org.junit.Assert.assertNotNull(requestConfig39);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.Header[] headerArray6 = requestConfig2.getHeaders();
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(headerArray6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig14, requestConfig15);
        requestConfig15.setConnectTimeout(10);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig13, requestConfig15);
        com.anitech.resting.http.Header header21 = requestConfig15.getHeader("");
        com.anitech.resting.http.Header header23 = requestConfig15.getHeader("Name: , Value: application/xml");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity24 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) header7, requestConfig15);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNull(header21);
        org.junit.Assert.assertNull(header23);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("Name: , Value: application/xml", "application/xml");
        java.lang.String str3 = header2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Name: , Value: application/xml" + "'", str3, "Name: , Value: application/xml");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.Header[] headerArray14 = new com.anitech.resting.http.Header[] {};
        requestConfig11.setHeaders(headerArray14);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig19, requestConfig20);
        com.anitech.resting.http.Header[] headerArray22 = new com.anitech.resting.http.Header[] {};
        requestConfig19.setHeaders(headerArray22);
        com.anitech.resting.http.request.RequestConfig requestConfig24 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig25 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig25.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray28 = requestConfig25.getHeaders();
        requestConfig24.setHeaders(headerArray28);
        org.apache.http.Header[] headerArray30 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray28);
        requestConfig19.setHeaders(headerArray28);
        requestConfig1.setHeaders(headerArray28);
        requestConfig1.setConnectTimeout((int) ' ');
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertNotNull(headerArray30);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        requestConfig0.setConnectTimeout((int) (byte) 100);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig4.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header8 = requestConfig4.getHeader("hi!");
        int int9 = requestConfig4.getSocketTimeout();
        com.anitech.resting.http.Header[] headerArray10 = requestConfig4.getHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity11 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) (byte) 100, requestConfig4);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(header8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(headerArray10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.Header[] headerArray14 = new com.anitech.resting.http.Header[] {};
        requestConfig11.setHeaders(headerArray14);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig19, requestConfig20);
        com.anitech.resting.http.Header[] headerArray22 = requestConfig20.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig23.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header27 = requestConfig23.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig28 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig20, requestConfig23);
        com.anitech.resting.http.request.RequestConfig requestConfig29 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig28);
        com.anitech.resting.http.request.RequestConfig requestConfig30 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig31 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig32 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig30, requestConfig31);
        com.anitech.resting.http.Header[] headerArray33 = requestConfig31.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig34 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig34.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header38 = requestConfig34.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig39 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig31, requestConfig34);
        com.anitech.resting.http.request.RequestConfig requestConfig40 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig28, requestConfig31);
        com.anitech.resting.http.Header header43 = new com.anitech.resting.http.Header("", "application/xml");
        // The following exception was thrown during execution in test generation
        try {
            requestConfig31.addHeader(header43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertNull(header27);
        org.junit.Assert.assertNotNull(requestConfig28);
        org.junit.Assert.assertNotNull(requestConfig29);
        org.junit.Assert.assertNotNull(requestConfig30);
        org.junit.Assert.assertNotNull(requestConfig31);
        org.junit.Assert.assertNotNull(requestConfig32);
        org.junit.Assert.assertNotNull(headerArray33);
        org.junit.Assert.assertNull(header38);
        org.junit.Assert.assertNotNull(requestConfig39);
        org.junit.Assert.assertNotNull(requestConfig40);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.http.request.RequestConfig requestConfig8 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig9.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        requestConfig8.setHeaders(headerArray12);
        int int14 = requestConfig8.getSocketTimeout();
        requestConfig8.setConnectTimeout((int) (short) -1);
        com.anitech.resting.Resting resting17 = resting7.globalRequestConfig(requestConfig8);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig20, requestConfig21);
        com.anitech.resting.http.request.RequestConfig requestConfig23 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig23.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header27 = requestConfig23.getHeader("hi!");
        int int28 = requestConfig23.getSocketTimeout();
        com.anitech.resting.http.Header[] headerArray29 = requestConfig23.getHeaders();
        requestConfig21.setHeaders(headerArray29);
        requestConfig19.setHeaders(headerArray29);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse32 = resting17.PUT("", (java.lang.Object) headerArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: application/json");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(resting17);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(requestConfig22);
        org.junit.Assert.assertNull(header27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(headerArray29);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig0.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header4 = requestConfig0.getHeader("hi!");
        int int5 = requestConfig0.getSocketTimeout();
        requestConfig0.setSocketTimeout((int) (byte) 100);
        com.anitech.resting.http.request.RequestConfig requestConfig8 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig8.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header12 = requestConfig8.getHeader("hi!");
        int int13 = requestConfig8.getSocketTimeout();
        com.anitech.resting.http.Header[] headerArray14 = requestConfig8.getHeaders();
        requestConfig0.setHeaders(headerArray14);
        org.junit.Assert.assertNull(header4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(header12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(headerArray14);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.Resting resting6 = resting5.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig9.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header13 = requestConfig9.getHeader("hi!");
        org.apache.http.entity.StringEntity stringEntity14 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) "Name: , Value: application/xml", requestConfig9);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig16 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig16.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig15, requestConfig16);
        com.anitech.resting.http.Header header22 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str23 = header22.getValue();
        java.lang.String str24 = header22.toString();
        requestConfig16.addHeader(header22);
        com.anitech.resting.http.request.RequestConfig requestConfig26 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig27 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig27.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig30 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig26, requestConfig27);
        com.anitech.resting.http.request.RequestConfig requestConfig31 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig16, requestConfig26);
        com.anitech.resting.http.request.RequestConfig requestConfig32 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.Header[] headerArray33 = requestConfig32.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig34 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig31, requestConfig32);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse35 = resting6.POST("", (java.lang.Object) stringEntity14, requestConfig34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: application/json");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(resting6);
        org.junit.Assert.assertNull(header13);
        org.junit.Assert.assertNotNull(stringEntity14);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Name: application/xml, Value: " + "'", str24, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig30);
        org.junit.Assert.assertNotNull(requestConfig31);
        org.junit.Assert.assertNotNull(headerArray33);
        org.junit.Assert.assertNotNull(requestConfig34);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
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
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        com.anitech.resting.Resting resting13 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig16 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig16.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig15, requestConfig16);
        com.anitech.resting.http.Header header22 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str23 = header22.getValue();
        java.lang.String str24 = header22.toString();
        requestConfig16.addHeader(header22);
        com.anitech.resting.http.request.RequestConfig requestConfig26 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig27 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig28 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig26, requestConfig27);
        com.anitech.resting.http.Header[] headerArray29 = new com.anitech.resting.http.Header[] {};
        requestConfig26.setHeaders(headerArray29);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig26);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig26);
        com.anitech.resting.http.request.RequestConfig requestConfig33 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig16, requestConfig26);
        com.anitech.resting.http.request.RequestConfig requestConfig34 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig35 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig36 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig34, requestConfig35);
        com.anitech.resting.http.Header[] headerArray37 = requestConfig35.getHeaders();
        requestConfig26.setHeaders(headerArray37);
        com.anitech.resting.http.request.RequestConfig requestConfig39 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig40 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig40.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig43 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig39, requestConfig40);
        com.anitech.resting.http.Header header46 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str47 = header46.getValue();
        java.lang.String str48 = header46.toString();
        requestConfig40.addHeader(header46);
        com.anitech.resting.http.request.RequestConfig requestConfig50 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig51 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig51.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig54 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig50, requestConfig51);
        com.anitech.resting.http.request.RequestConfig requestConfig55 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig40, requestConfig50);
        com.anitech.resting.http.request.RequestConfig requestConfig56 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.Header[] headerArray57 = requestConfig56.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig58 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig55, requestConfig56);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse59 = resting13.POST("hi!", (java.lang.Object) requestConfig26, requestConfig55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: application/jsonhi!");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertNotNull(resting13);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Name: application/xml, Value: " + "'", str24, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig26);
        org.junit.Assert.assertNotNull(requestConfig27);
        org.junit.Assert.assertNotNull(requestConfig28);
        org.junit.Assert.assertNotNull(headerArray29);
        org.junit.Assert.assertNotNull(requestConfig33);
        org.junit.Assert.assertNotNull(requestConfig34);
        org.junit.Assert.assertNotNull(requestConfig35);
        org.junit.Assert.assertNotNull(requestConfig36);
        org.junit.Assert.assertNotNull(headerArray37);
        org.junit.Assert.assertNotNull(requestConfig43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Name: application/xml, Value: " + "'", str48, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig54);
        org.junit.Assert.assertNotNull(requestConfig55);
        org.junit.Assert.assertNotNull(headerArray57);
        org.junit.Assert.assertNotNull(requestConfig58);
    }

    @Test
    public void test102() throws Throwable {
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
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
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
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        com.anitech.resting.Resting resting13 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig14, requestConfig15);
        com.anitech.resting.http.Header[] headerArray17 = new com.anitech.resting.http.Header[] {};
        requestConfig14.setHeaders(headerArray17);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig20 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig20.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray23 = requestConfig20.getHeaders();
        requestConfig19.setHeaders(headerArray23);
        org.apache.http.Header[] headerArray25 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray23);
        requestConfig14.setHeaders(headerArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity27 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) resting13, requestConfig14);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertNotNull(resting13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertNotNull(headerArray23);
        org.junit.Assert.assertNotNull(headerArray25);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.anitech.resting.exception.RestingException restingException1 = new com.anitech.resting.exception.RestingException();
        java.lang.Throwable throwable2 = null;
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException(throwable2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException3);
        restingException1.addSuppressed((java.lang.Throwable) restingException4);
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException("application/json", (java.lang.Throwable) restingException4);
        java.lang.String str7 = restingException4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException" + "'", str7, "com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting9 = resting5.baseURI("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        com.anitech.resting.Resting resting10 = resting9.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig13.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig13);
        com.anitech.resting.http.Header header19 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str20 = header19.getValue();
        java.lang.String str21 = header19.toString();
        requestConfig13.addHeader(header19);
        com.anitech.resting.http.Header header24 = requestConfig13.getHeader("request");
        requestConfig13.setConnectTimeout((int) (short) 100);
        requestConfig13.setConnectTimeout(100);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse29 = resting9.POST("com.anitech.resting.exception.RestingException: hi!", (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptioncom.anitech.resting.exception.RestingException: hi!");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(resting10);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Name: application/xml, Value: " + "'", str21, "Name: application/xml, Value: ");
        org.junit.Assert.assertNull(header24);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.Resting resting6 = resting5.enableMetrics();
        java.lang.Throwable throwable10 = null;
        com.anitech.resting.exception.RestingException restingException11 = new com.anitech.resting.exception.RestingException(throwable10);
        com.anitech.resting.exception.RestingException restingException12 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException11);
        com.anitech.resting.exception.RestingException restingException13 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException11);
        com.anitech.resting.exception.RestingException restingException14 = new com.anitech.resting.exception.RestingException("", (java.lang.Throwable) restingException11);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse15 = resting5.POST("application/json", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptionapplication/json");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(resting6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.lang.Throwable throwable1 = null;
        com.anitech.resting.exception.RestingException restingException2 = new com.anitech.resting.exception.RestingException(throwable1);
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException("Name: application/xml, Value: ", (java.lang.Throwable) restingException3);
        java.lang.Throwable throwable5 = null;
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException(throwable5);
        com.anitech.resting.exception.RestingException restingException7 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException6);
        restingException4.addSuppressed((java.lang.Throwable) restingException7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting9 = resting5.baseURI("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        com.anitech.resting.http.Header header13 = new com.anitech.resting.http.Header("", "application/xml");
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse14 = resting5.POST("hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptionhi!");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(resting9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig10 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig11.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig10, requestConfig11);
        com.anitech.resting.http.Header header17 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str18 = header17.getValue();
        java.lang.String str19 = header17.toString();
        requestConfig11.addHeader(header17);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse22 = resting5.GET("", requestConfig11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Name: application/xml, Value: " + "'", str19, "Name: application/xml, Value: ");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = requestConfig1.getHeaders();
        com.anitech.resting.http.Header header5 = requestConfig1.getHeader("com.anitech.resting.exception.RestingException: application/json");
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNull(header5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.lang.Throwable throwable1 = null;
        com.anitech.resting.exception.RestingException restingException2 = new com.anitech.resting.exception.RestingException("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/json", throwable1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("Name: , Value: application/xml", "com.anitech.resting.exception.RestingException: hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.Resting resting1 = resting0.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig5 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig3, requestConfig4);
        requestConfig4.setConnectTimeout(10);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse8 = resting0.GET("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", requestConfig4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: application/jsoncom.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(resting1);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertNotNull(requestConfig5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting9 = resting5.baseURI("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        com.anitech.resting.Resting resting10 = resting9.enableMetrics();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse12 = resting9.DELETE("Name: application/xml, Value: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptionName: application/xml, Value: ");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(resting10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig7 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig8 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig7, requestConfig8);
        com.anitech.resting.http.Header[] headerArray10 = requestConfig8.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig11.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header15 = requestConfig11.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig8, requestConfig11);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse17 = resting0.DELETE("", requestConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig7);
        org.junit.Assert.assertNotNull(requestConfig8);
        org.junit.Assert.assertNotNull(requestConfig9);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertNull(header15);
        org.junit.Assert.assertNotNull(requestConfig16);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
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
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        com.anitech.resting.Resting resting13 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.Resting resting15 = resting8.baseURI("application/xml");
        com.anitech.resting.http.Header header19 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str20 = header19.toString();
        java.lang.String str21 = header19.toString();
        java.lang.String str22 = header19.getValue();
        java.lang.String str23 = header19.toString();
        java.lang.Object obj24 = header19.clone();
        com.anitech.resting.http.request.RequestConfig requestConfig25 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig26 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig27 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig25, requestConfig26);
        com.anitech.resting.http.Header[] headerArray28 = new com.anitech.resting.http.Header[] {};
        requestConfig25.setHeaders(headerArray28);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig25);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig25);
        int int32 = requestConfig25.getSocketTimeout();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse33 = resting8.POST("Name: application/xml, Value: ", obj24, requestConfig25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: application/xmlName: application/xml, Value: ");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertNotNull(resting13);
        org.junit.Assert.assertNotNull(resting15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Name: application/xml, Value: " + "'", str20, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Name: application/xml, Value: " + "'", str21, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Name: application/xml, Value: " + "'", str23, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig25);
        org.junit.Assert.assertNotNull(requestConfig26);
        org.junit.Assert.assertNotNull(requestConfig27);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig2.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig5 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header header8 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str9 = header8.getValue();
        java.lang.String str10 = header8.toString();
        requestConfig2.addHeader(header8);
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig13.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig13);
        com.anitech.resting.http.request.RequestConfig requestConfig17 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig2, requestConfig12);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.Header[] headerArray19 = requestConfig18.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig17, requestConfig18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity21 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) ' ', requestConfig20);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Name: application/xml, Value: " + "'", str10, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(requestConfig17);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertNotNull(requestConfig20);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = new com.anitech.resting.http.Header[] {};
        requestConfig0.setHeaders(headerArray3);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        requestConfig0.setConnectTimeout((int) ' ');
        requestConfig0.setSocketTimeout(0);
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig13);
        com.anitech.resting.http.Header[] headerArray15 = new com.anitech.resting.http.Header[] {};
        requestConfig12.setHeaders(headerArray15);
        requestConfig0.setHeaders(headerArray15);
        // The following exception was thrown during execution in test generation
        try {
            requestConfig0.addHeader("Name: , Value: application/xml", "com.anitech.resting.exception.RestingException: application/json");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(headerArray15);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header5 = requestConfig1.getHeader("hi!");
        int int6 = requestConfig1.getSocketTimeout();
        com.anitech.resting.http.Header[] headerArray7 = requestConfig1.getHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity8 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) false, requestConfig1);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(header5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(headerArray7);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str3 = header2.getValue();
        com.anitech.resting.http.request.RequestConfig requestConfig4 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig5 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig5.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig8 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig4, requestConfig5);
        com.anitech.resting.http.Header header11 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str12 = header11.getValue();
        java.lang.String str13 = header11.toString();
        requestConfig5.addHeader(header11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity15 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) header2, requestConfig5);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(requestConfig8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Name: application/xml, Value: " + "'", str13, "Name: application/xml, Value: ");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str3 = header2.getValue();
        java.lang.String str4 = header2.toString();
        java.lang.String str5 = header2.toString();
        java.lang.String str6 = header2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Name: application/xml, Value: " + "'", str4, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Name: application/xml, Value: " + "'", str5, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "application/xml" + "'", str6, "application/xml");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
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
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        com.anitech.resting.Resting resting13 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.http.request.RequestConfig requestConfig14 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig15.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig14, requestConfig15);
        com.anitech.resting.http.Header header21 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str22 = header21.getValue();
        java.lang.String str23 = header21.toString();
        requestConfig15.addHeader(header21);
        com.anitech.resting.http.Header header26 = requestConfig15.getHeader("request");
        com.anitech.resting.http.Header header29 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str30 = header29.toString();
        com.anitech.resting.http.Header header33 = new com.anitech.resting.http.Header("", "application/xml");
        java.lang.String str34 = header33.toString();
        com.anitech.resting.http.Header[] headerArray35 = new com.anitech.resting.http.Header[] { header29, header33 };
        requestConfig15.setHeaders(headerArray35);
        requestConfig15.setSocketTimeout(10);
        com.anitech.resting.Resting resting39 = resting8.globalRequestConfig(requestConfig15);
        com.anitech.resting.http.request.RequestConfig requestConfig41 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig42 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig42.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig45 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig41, requestConfig42);
        com.anitech.resting.http.request.RequestConfig requestConfig46 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig47 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig47.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig50 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig46, requestConfig47);
        com.anitech.resting.http.Header header53 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str54 = header53.getValue();
        java.lang.String str55 = header53.toString();
        requestConfig47.addHeader(header53);
        com.anitech.resting.http.request.RequestConfig requestConfig57 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig58 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig59 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig57, requestConfig58);
        com.anitech.resting.http.Header[] headerArray60 = new com.anitech.resting.http.Header[] {};
        requestConfig57.setHeaders(headerArray60);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig57);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig57);
        com.anitech.resting.http.request.RequestConfig requestConfig64 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig47, requestConfig57);
        com.anitech.resting.http.request.RequestConfig requestConfig65 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig41, requestConfig57);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig65);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse67 = resting8.DELETE("com.anitech.resting.exception.RestingException: hi!", requestConfig65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 62: application/xmlcom.anitech.resting.exception.RestingException: hi!");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertNotNull(resting13);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Name: application/xml, Value: " + "'", str23, "Name: application/xml, Value: ");
        org.junit.Assert.assertNull(header26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Name: application/xml, Value: " + "'", str30, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Name: , Value: application/xml" + "'", str34, "Name: , Value: application/xml");
        org.junit.Assert.assertNotNull(headerArray35);
        org.junit.Assert.assertNotNull(resting39);
        org.junit.Assert.assertNotNull(requestConfig45);
        org.junit.Assert.assertNotNull(requestConfig50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Name: application/xml, Value: " + "'", str55, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig57);
        org.junit.Assert.assertNotNull(requestConfig58);
        org.junit.Assert.assertNotNull(requestConfig59);
        org.junit.Assert.assertNotNull(headerArray60);
        org.junit.Assert.assertNotNull(requestConfig64);
        org.junit.Assert.assertNotNull(requestConfig65);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse10 = resting5.DELETE("application/xml");
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: org.apache.http.client.ClientProtocolException");
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
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.anitech.resting.Resting.setBaseURI("request");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting9 = resting5.baseURI("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        com.anitech.resting.Resting resting11 = resting9.baseURI("com.anitech.resting.exception.RestingException: application/json");
        com.anitech.resting.http.request.RequestConfig requestConfig13 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig14.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig17 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig13, requestConfig14);
        com.anitech.resting.http.Header header20 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str21 = header20.getValue();
        java.lang.String str22 = header20.toString();
        requestConfig14.addHeader(header20);
        com.anitech.resting.http.request.RequestConfig requestConfig24 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig25 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig25.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig28 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig24, requestConfig25);
        com.anitech.resting.http.request.RequestConfig requestConfig29 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig14, requestConfig24);
        int int30 = requestConfig29.getSocketTimeout();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse31 = resting11.GET("", requestConfig29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: application/json");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(resting11);
        org.junit.Assert.assertNotNull(requestConfig17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Name: application/xml, Value: " + "'", str22, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig28);
        org.junit.Assert.assertNotNull(requestConfig29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str3 = header2.getValue();
        java.lang.String str4 = header2.getValue();
        java.lang.String str5 = header2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Name: application/xml, Value: " + "'", str5, "Name: application/xml, Value: ");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig7 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig8 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig7, requestConfig8);
        com.anitech.resting.http.request.RequestConfig requestConfig10 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig10, requestConfig11);
        requestConfig11.setConnectTimeout(10);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig9, requestConfig11);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse16 = resting0.GET("com.anitech.resting.exception.RestingException: hi!", requestConfig11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: application/jsoncom.anitech.resting.exception.RestingException: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig7);
        org.junit.Assert.assertNotNull(requestConfig8);
        org.junit.Assert.assertNotNull(requestConfig9);
        org.junit.Assert.assertNotNull(requestConfig10);
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig1.getHeaders();
        requestConfig0.setHeaders(headerArray4);
        int int6 = requestConfig0.getSocketTimeout();
        java.lang.Class<?> wildcardClass7 = requestConfig0.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting9 = resting5.baseURI("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        com.anitech.resting.Resting resting10 = resting9.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse14 = resting10.PUT("application/json", (java.lang.Object) "request", requestConfig13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptionapplication/json");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(resting10);
        org.junit.Assert.assertNotNull(requestConfig13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting9 = resting5.baseURI("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        java.lang.Class<?> wildcardClass10 = resting5.getClass();
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertNotNull(resting7);
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.lang.Throwable throwable2 = null;
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException(throwable2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException3);
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", (java.lang.Throwable) restingException3);
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = new com.anitech.resting.http.Header[] {};
        requestConfig0.setHeaders(headerArray3);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        requestConfig0.setConnectTimeout((int) ' ');
        requestConfig0.setSocketTimeout(0);
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig13);
        com.anitech.resting.http.Header[] headerArray15 = new com.anitech.resting.http.Header[] {};
        requestConfig12.setHeaders(headerArray15);
        requestConfig0.setHeaders(headerArray15);
        org.apache.http.Header[] headerArray18 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray15);
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertNotNull(headerArray18);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.lang.Throwable throwable2 = null;
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException(throwable2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException3);
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", (java.lang.Throwable) restingException3);
        java.lang.Throwable throwable7 = null;
        com.anitech.resting.exception.RestingException restingException8 = new com.anitech.resting.exception.RestingException(throwable7);
        com.anitech.resting.exception.RestingException restingException9 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException8);
        restingException3.addSuppressed((java.lang.Throwable) restingException9);
        java.lang.Class<?> wildcardClass11 = restingException9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("application/json", "hi!");
        java.lang.Object obj3 = header2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "Name: application/json, Value: hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "Name: application/json, Value: hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "Name: application/json, Value: hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header5 = requestConfig1.getHeader("hi!");
        org.apache.http.entity.StringEntity stringEntity6 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) "Name: , Value: application/xml", requestConfig1);
        com.anitech.resting.http.Header[] headerArray7 = requestConfig1.getHeaders();
        com.anitech.resting.http.Header header10 = new com.anitech.resting.http.Header("", "application/xml");
        requestConfig1.addHeader(header10);
        org.junit.Assert.assertNull(header5);
        org.junit.Assert.assertNotNull(stringEntity6);
        org.junit.Assert.assertNotNull(headerArray7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig10 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig11.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray14 = requestConfig11.getHeaders();
        requestConfig10.setHeaders(headerArray14);
        int int16 = requestConfig10.getSocketTimeout();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse17 = resting5.POST("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/json", (java.lang.Object) int16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/json");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
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
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        com.anitech.resting.Resting resting13 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.Resting resting15 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig17 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig16, requestConfig17);
        com.anitech.resting.http.Header[] headerArray19 = requestConfig17.getHeaders();
        com.anitech.resting.Resting resting20 = resting15.globalRequestConfig(requestConfig17);
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting22 = resting20.globalRequestConfig(requestConfig21);
        com.anitech.resting.Resting resting24 = resting20.baseURI("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        com.anitech.resting.http.request.RequestConfig requestConfig25 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig26 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig26.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig29 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig25, requestConfig26);
        com.anitech.resting.http.Header header32 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str33 = header32.getValue();
        java.lang.String str34 = header32.toString();
        requestConfig26.addHeader(header32);
        com.anitech.resting.http.request.RequestConfig requestConfig36 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig37 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig38 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig36, requestConfig37);
        com.anitech.resting.http.Header[] headerArray39 = new com.anitech.resting.http.Header[] {};
        requestConfig36.setHeaders(headerArray39);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig36);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig36);
        com.anitech.resting.http.request.RequestConfig requestConfig43 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig26, requestConfig36);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse44 = resting13.PUT("hi!", (java.lang.Object) resting24, requestConfig43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptionhi!");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertNotNull(resting13);
        org.junit.Assert.assertNotNull(resting15);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(requestConfig17);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertNotNull(resting20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(resting22);
        org.junit.Assert.assertNotNull(resting24);
        org.junit.Assert.assertNotNull(requestConfig29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Name: application/xml, Value: " + "'", str34, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig36);
        org.junit.Assert.assertNotNull(requestConfig37);
        org.junit.Assert.assertNotNull(requestConfig38);
        org.junit.Assert.assertNotNull(headerArray39);
        org.junit.Assert.assertNotNull(requestConfig43);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.Header[] headerArray14 = new com.anitech.resting.http.Header[] {};
        requestConfig11.setHeaders(headerArray14);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig19, requestConfig20);
        com.anitech.resting.http.Header[] headerArray22 = requestConfig20.getHeaders();
        requestConfig11.setHeaders(headerArray22);
        // The following exception was thrown during execution in test generation
        try {
            requestConfig11.addHeader("Name: , Value: application/xml", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(headerArray22);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
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
        com.anitech.resting.http.request.RequestConfig requestConfig10 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig10.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig9, requestConfig10);
        com.anitech.resting.http.Header header16 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str17 = header16.getValue();
        java.lang.String str18 = header16.toString();
        requestConfig10.addHeader(header16);
        com.anitech.resting.http.Header header21 = requestConfig10.getHeader("request");
        com.anitech.resting.http.Header header24 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str25 = header24.toString();
        com.anitech.resting.http.Header header28 = new com.anitech.resting.http.Header("", "application/xml");
        java.lang.String str29 = header28.toString();
        com.anitech.resting.http.Header[] headerArray30 = new com.anitech.resting.http.Header[] { header24, header28 };
        requestConfig10.setHeaders(headerArray30);
        requestConfig10.setSocketTimeout(10);
        com.anitech.resting.Resting resting34 = resting5.globalRequestConfig(requestConfig10);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse36 = resting34.GET("com.anitech.resting.exception.RestingException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptioncom.anitech.resting.exception.RestingException: hi!");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Name: application/xml, Value: " + "'", str18, "Name: application/xml, Value: ");
        org.junit.Assert.assertNull(header21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Name: application/xml, Value: " + "'", str25, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Name: , Value: application/xml" + "'", str29, "Name: , Value: application/xml");
        org.junit.Assert.assertNotNull(headerArray30);
        org.junit.Assert.assertNotNull(resting34);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.anitech.resting.Resting.setBaseURI("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/json");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig1);
        int int12 = requestConfig1.getSocketTimeout();
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.Throwable throwable1 = null;
        com.anitech.resting.exception.RestingException restingException2 = new com.anitech.resting.exception.RestingException(throwable1);
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException("Name: application/xml, Value: ", (java.lang.Throwable) restingException3);
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException3);
        java.lang.Class<?> wildcardClass6 = restingException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.Header[] headerArray1 = requestConfig0.getHeaders();
        int int2 = requestConfig0.getSocketTimeout();
        org.junit.Assert.assertNotNull(headerArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        // The following exception was thrown during execution in test generation
        try {
            requestConfig2.addHeader("application/xml", "application/json");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig5 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig3, requestConfig4);
        requestConfig4.setConnectTimeout(10);
        com.anitech.resting.http.request.RequestConfig requestConfig8 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig2, requestConfig4);
        com.anitech.resting.http.Header header10 = requestConfig4.getHeader("");
        com.anitech.resting.http.Header header12 = requestConfig4.getHeader("Name: , Value: application/xml");
        com.anitech.resting.http.Header[] headerArray13 = requestConfig4.getHeaders();
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertNotNull(requestConfig5);
        org.junit.Assert.assertNotNull(requestConfig8);
        org.junit.Assert.assertNull(header10);
        org.junit.Assert.assertNull(header12);
        org.junit.Assert.assertNotNull(headerArray13);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = new com.anitech.resting.http.Header[] {};
        requestConfig0.setHeaders(headerArray3);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        int int6 = requestConfig0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            requestConfig0.addHeader("hi!", "Name: application/xml, Value: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
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
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        com.anitech.resting.Resting resting13 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.Resting resting15 = resting8.baseURI("application/xml");
        java.lang.Throwable throwable19 = null;
        com.anitech.resting.exception.RestingException restingException20 = new com.anitech.resting.exception.RestingException(throwable19);
        com.anitech.resting.exception.RestingException restingException21 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException20);
        com.anitech.resting.exception.RestingException restingException22 = new com.anitech.resting.exception.RestingException("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", (java.lang.Throwable) restingException20);
        java.lang.Throwable throwable24 = null;
        com.anitech.resting.exception.RestingException restingException25 = new com.anitech.resting.exception.RestingException(throwable24);
        com.anitech.resting.exception.RestingException restingException26 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException25);
        restingException20.addSuppressed((java.lang.Throwable) restingException26);
        java.lang.Throwable[] throwableArray28 = restingException20.getSuppressed();
        com.anitech.resting.exception.RestingException restingException29 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException20);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse30 = resting8.PUT("Name: , Value: application/xml", (java.lang.Object) restingException20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: application/xmlName: , Value: application/xml");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertNotNull(resting13);
        org.junit.Assert.assertNotNull(resting15);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig7 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig8 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig7, requestConfig8);
        com.anitech.resting.http.Header[] headerArray10 = new com.anitech.resting.http.Header[] {};
        requestConfig7.setHeaders(headerArray10);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig7);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig7);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig7);
        int int15 = requestConfig7.getConnectTimeout();
        com.anitech.resting.http.Header[] headerArray16 = requestConfig7.getHeaders();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse17 = resting0.GET("Name: application/xml, Value: ", requestConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: application/xmlName: application/xml, Value: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig7);
        org.junit.Assert.assertNotNull(requestConfig8);
        org.junit.Assert.assertNotNull(requestConfig9);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(headerArray16);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("hi!", "application/json");
        java.lang.String str3 = header2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "application/json" + "'", str3, "application/json");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        requestConfig16.setSocketTimeout((int) (byte) 10);
        int int19 = requestConfig16.getSocketTimeout();
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.request.RequestConfig requestConfig5 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig6 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig6.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig5, requestConfig6);
        com.anitech.resting.http.Header header12 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str13 = header12.getValue();
        java.lang.String str14 = header12.toString();
        requestConfig6.addHeader(header12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig17 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig16, requestConfig17);
        com.anitech.resting.http.Header[] headerArray19 = new com.anitech.resting.http.Header[] {};
        requestConfig16.setHeaders(headerArray19);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig16);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig16);
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig6, requestConfig16);
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig16);
        com.anitech.resting.http.request.RequestConfig requestConfig25 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig26 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig27 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig25, requestConfig26);
        com.anitech.resting.http.Header[] headerArray28 = new com.anitech.resting.http.Header[] {};
        requestConfig25.setHeaders(headerArray28);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig25);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig25);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig25);
        int int33 = requestConfig25.getConnectTimeout();
        com.anitech.resting.http.Header[] headerArray34 = requestConfig25.getHeaders();
        requestConfig24.setHeaders(headerArray34);
        org.apache.http.Header[] headerArray36 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray34);
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertNotNull(requestConfig9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Name: application/xml, Value: " + "'", str14, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(requestConfig17);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertNotNull(requestConfig25);
        org.junit.Assert.assertNotNull(requestConfig26);
        org.junit.Assert.assertNotNull(requestConfig27);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(headerArray34);
        org.junit.Assert.assertNotNull(headerArray36);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
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
        com.anitech.resting.http.request.RequestConfig requestConfig17 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig18 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig18.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig17, requestConfig18);
        com.anitech.resting.http.Header header24 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str25 = header24.getValue();
        java.lang.String str26 = header24.toString();
        requestConfig18.addHeader(header24);
        com.anitech.resting.http.request.RequestConfig requestConfig28 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig29 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig29.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig32 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig28, requestConfig29);
        com.anitech.resting.http.request.RequestConfig requestConfig33 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig18, requestConfig28);
        com.anitech.resting.http.request.RequestConfig requestConfig34 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig9, requestConfig28);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig9);
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
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Name: application/xml, Value: " + "'", str26, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig32);
        org.junit.Assert.assertNotNull(requestConfig33);
        org.junit.Assert.assertNotNull(requestConfig34);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig0.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header4 = requestConfig0.getHeader("hi!");
        int int5 = requestConfig0.getSocketTimeout();
        com.anitech.resting.http.Header[] headerArray6 = requestConfig0.getHeaders();
        requestConfig0.setSocketTimeout((int) (byte) 10);
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig10 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig10.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig9, requestConfig10);
        com.anitech.resting.http.Header header16 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str17 = header16.getValue();
        java.lang.String str18 = header16.toString();
        requestConfig10.addHeader(header16);
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig20, requestConfig21);
        com.anitech.resting.http.Header[] headerArray23 = new com.anitech.resting.http.Header[] {};
        requestConfig20.setHeaders(headerArray23);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig20);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig20);
        com.anitech.resting.http.request.RequestConfig requestConfig27 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig10, requestConfig20);
        com.anitech.resting.http.request.RequestConfig requestConfig28 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig29 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig30 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig28, requestConfig29);
        com.anitech.resting.http.Header[] headerArray31 = requestConfig29.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig32 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig32.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header36 = requestConfig32.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig37 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig29, requestConfig32);
        com.anitech.resting.http.request.RequestConfig requestConfig38 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig10, requestConfig37);
        requestConfig38.setConnectTimeout((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity41 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) (byte) 10, requestConfig38);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(header4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Name: application/xml, Value: " + "'", str18, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(requestConfig22);
        org.junit.Assert.assertNotNull(headerArray23);
        org.junit.Assert.assertNotNull(requestConfig27);
        org.junit.Assert.assertNotNull(requestConfig28);
        org.junit.Assert.assertNotNull(requestConfig29);
        org.junit.Assert.assertNotNull(requestConfig30);
        org.junit.Assert.assertNotNull(headerArray31);
        org.junit.Assert.assertNull(header36);
        org.junit.Assert.assertNotNull(requestConfig37);
        org.junit.Assert.assertNotNull(requestConfig38);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        requestConfig6.setConnectTimeout((int) 'a');
        com.anitech.resting.Resting resting9 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting11 = resting5.baseURI("application/xml");
        com.anitech.resting.http.request.RequestConfig requestConfig13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse14 = resting11.DELETE("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", requestConfig13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(resting11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.Resting resting6 = resting0.enableProcessingHooks();
        com.anitech.resting.http.request.RequestConfig requestConfig8 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig10 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig8, requestConfig9);
        com.anitech.resting.http.Header[] headerArray11 = new com.anitech.resting.http.Header[] {};
        requestConfig8.setHeaders(headerArray11);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig8);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig8);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse15 = resting0.GET("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/json", requestConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 62: application/xmlcom.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/json");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(resting6);
        org.junit.Assert.assertNotNull(requestConfig8);
        org.junit.Assert.assertNotNull(requestConfig9);
        org.junit.Assert.assertNotNull(requestConfig10);
        org.junit.Assert.assertNotNull(headerArray11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        requestConfig1.setConnectTimeout(10);
        requestConfig1.setConnectTimeout((int) (short) 0);
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.Resting resting10 = resting8.baseURI("");
        com.anitech.resting.Resting resting11 = resting8.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig15.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig14, requestConfig15);
        com.anitech.resting.http.Header header21 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str22 = header21.getValue();
        java.lang.String str23 = header21.toString();
        requestConfig15.addHeader(header21);
        com.anitech.resting.http.request.RequestConfig requestConfig25 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig26 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig27 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig25, requestConfig26);
        com.anitech.resting.http.Header[] headerArray28 = new com.anitech.resting.http.Header[] {};
        requestConfig25.setHeaders(headerArray28);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig25);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig25);
        com.anitech.resting.http.request.RequestConfig requestConfig32 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig15, requestConfig25);
        com.anitech.resting.http.request.RequestConfig requestConfig33 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig34 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig35 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig33, requestConfig34);
        com.anitech.resting.http.Header[] headerArray36 = requestConfig34.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig37 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig37.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header41 = requestConfig37.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig42 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig34, requestConfig37);
        com.anitech.resting.http.request.RequestConfig requestConfig43 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig15, requestConfig42);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse44 = resting8.POST("hi!", (java.lang.Object) "", requestConfig15);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: org.apache.http.client.ClientProtocolException");
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
        org.junit.Assert.assertNotNull(resting10);
        org.junit.Assert.assertNotNull(resting11);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Name: application/xml, Value: " + "'", str23, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig25);
        org.junit.Assert.assertNotNull(requestConfig26);
        org.junit.Assert.assertNotNull(requestConfig27);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertNotNull(requestConfig32);
        org.junit.Assert.assertNotNull(requestConfig33);
        org.junit.Assert.assertNotNull(requestConfig34);
        org.junit.Assert.assertNotNull(requestConfig35);
        org.junit.Assert.assertNotNull(headerArray36);
        org.junit.Assert.assertNull(header41);
        org.junit.Assert.assertNotNull(requestConfig42);
        org.junit.Assert.assertNotNull(requestConfig43);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.Resting resting10 = resting8.baseURI("");
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse12 = resting10.GET("com.anitech.resting.exception.RestingException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: hi!");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(resting10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.anitech.resting.exception.RestingException restingException1 = new com.anitech.resting.exception.RestingException("Name: , Value: application/xml");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        java.lang.Object obj11 = header7.clone();
        java.lang.String str12 = header7.getValue();
        java.lang.String str13 = header7.getValue();
        java.lang.String str14 = header7.toString();
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Name: application/xml, Value: " + "'", str14, "Name: application/xml, Value: ");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
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
        com.anitech.resting.http.request.RequestConfig requestConfig10 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig10.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig9, requestConfig10);
        com.anitech.resting.http.Header header16 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str17 = header16.getValue();
        java.lang.String str18 = header16.toString();
        requestConfig10.addHeader(header16);
        com.anitech.resting.http.Header header21 = requestConfig10.getHeader("request");
        com.anitech.resting.http.Header header24 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str25 = header24.toString();
        com.anitech.resting.http.Header header28 = new com.anitech.resting.http.Header("", "application/xml");
        java.lang.String str29 = header28.toString();
        com.anitech.resting.http.Header[] headerArray30 = new com.anitech.resting.http.Header[] { header24, header28 };
        requestConfig10.setHeaders(headerArray30);
        requestConfig10.setSocketTimeout(10);
        com.anitech.resting.Resting resting34 = resting5.globalRequestConfig(requestConfig10);
        com.anitech.resting.Resting resting36 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig37 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig38 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig39 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig37, requestConfig38);
        com.anitech.resting.http.Header[] headerArray40 = requestConfig38.getHeaders();
        com.anitech.resting.Resting resting41 = resting36.globalRequestConfig(requestConfig38);
        com.anitech.resting.Resting resting42 = resting41.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig43 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig44 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig45 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig43, requestConfig44);
        com.anitech.resting.http.Header[] headerArray46 = new com.anitech.resting.http.Header[] {};
        requestConfig43.setHeaders(headerArray46);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig43);
        int int49 = requestConfig43.getConnectTimeout();
        int int50 = requestConfig43.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse51 = resting5.PUT("application/json", (java.lang.Object) resting41, requestConfig43);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
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
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Name: application/xml, Value: " + "'", str18, "Name: application/xml, Value: ");
        org.junit.Assert.assertNull(header21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Name: application/xml, Value: " + "'", str25, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Name: , Value: application/xml" + "'", str29, "Name: , Value: application/xml");
        org.junit.Assert.assertNotNull(headerArray30);
        org.junit.Assert.assertNotNull(resting34);
        org.junit.Assert.assertNotNull(resting36);
        org.junit.Assert.assertNotNull(requestConfig37);
        org.junit.Assert.assertNotNull(requestConfig38);
        org.junit.Assert.assertNotNull(requestConfig39);
        org.junit.Assert.assertNotNull(headerArray40);
        org.junit.Assert.assertNotNull(resting41);
        org.junit.Assert.assertNotNull(resting42);
        org.junit.Assert.assertNotNull(requestConfig43);
        org.junit.Assert.assertNotNull(requestConfig44);
        org.junit.Assert.assertNotNull(requestConfig45);
        org.junit.Assert.assertNotNull(headerArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        requestConfig4.setSocketTimeout((int) (short) -1);
        requestConfig4.setConnectTimeout((int) (byte) 10);
        org.junit.Assert.assertNotNull(requestConfig4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig17 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.Header[] headerArray18 = requestConfig17.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig16, requestConfig17);
        requestConfig16.setSocketTimeout((int) (byte) 1);
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertNotNull(requestConfig19);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("application/xml", "application/json");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        requestConfig6.setConnectTimeout((int) 'a');
        com.anitech.resting.Resting resting9 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.Header header18 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str19 = header18.getValue();
        java.lang.String str20 = header18.toString();
        requestConfig12.addHeader(header18);
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig22, requestConfig23);
        com.anitech.resting.http.Header[] headerArray25 = new com.anitech.resting.http.Header[] {};
        requestConfig22.setHeaders(headerArray25);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig22);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig22);
        com.anitech.resting.http.request.RequestConfig requestConfig29 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig22);
        com.anitech.resting.http.request.RequestConfig requestConfig30 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig31 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig32 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig30, requestConfig31);
        com.anitech.resting.http.Header[] headerArray33 = requestConfig31.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig34 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig34.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header38 = requestConfig34.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig39 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig31, requestConfig34);
        com.anitech.resting.http.request.RequestConfig requestConfig40 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig39);
        com.anitech.resting.http.request.RequestConfig requestConfig41 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig42 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig42.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig45 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig41, requestConfig42);
        com.anitech.resting.http.Header header48 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str49 = header48.getValue();
        java.lang.String str50 = header48.toString();
        requestConfig42.addHeader(header48);
        com.anitech.resting.http.request.RequestConfig requestConfig52 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig53 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig54 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig52, requestConfig53);
        com.anitech.resting.http.Header[] headerArray55 = new com.anitech.resting.http.Header[] {};
        requestConfig52.setHeaders(headerArray55);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig52);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig52);
        com.anitech.resting.http.request.RequestConfig requestConfig59 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig42, requestConfig52);
        com.anitech.resting.http.request.RequestConfig requestConfig60 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig61 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig62 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig60, requestConfig61);
        com.anitech.resting.http.Header[] headerArray63 = requestConfig61.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig64 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig64.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header68 = requestConfig64.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig69 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig61, requestConfig64);
        com.anitech.resting.http.request.RequestConfig requestConfig70 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig42, requestConfig69);
        com.anitech.resting.http.request.RequestConfig requestConfig71 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig72 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig73 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig71, requestConfig72);
        com.anitech.resting.http.Header[] headerArray74 = requestConfig72.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig75 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig75.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header79 = requestConfig75.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig80 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig72, requestConfig75);
        com.anitech.resting.http.request.RequestConfig requestConfig81 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig69, requestConfig72);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse82 = resting9.POST("request", (java.lang.Object) requestConfig39, requestConfig72);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
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
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Name: application/xml, Value: " + "'", str20, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig22);
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertNotNull(headerArray25);
        org.junit.Assert.assertNotNull(requestConfig29);
        org.junit.Assert.assertNotNull(requestConfig30);
        org.junit.Assert.assertNotNull(requestConfig31);
        org.junit.Assert.assertNotNull(requestConfig32);
        org.junit.Assert.assertNotNull(headerArray33);
        org.junit.Assert.assertNull(header38);
        org.junit.Assert.assertNotNull(requestConfig39);
        org.junit.Assert.assertNotNull(requestConfig40);
        org.junit.Assert.assertNotNull(requestConfig45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Name: application/xml, Value: " + "'", str50, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig52);
        org.junit.Assert.assertNotNull(requestConfig53);
        org.junit.Assert.assertNotNull(requestConfig54);
        org.junit.Assert.assertNotNull(headerArray55);
        org.junit.Assert.assertNotNull(requestConfig59);
        org.junit.Assert.assertNotNull(requestConfig60);
        org.junit.Assert.assertNotNull(requestConfig61);
        org.junit.Assert.assertNotNull(requestConfig62);
        org.junit.Assert.assertNotNull(headerArray63);
        org.junit.Assert.assertNull(header68);
        org.junit.Assert.assertNotNull(requestConfig69);
        org.junit.Assert.assertNotNull(requestConfig70);
        org.junit.Assert.assertNotNull(requestConfig71);
        org.junit.Assert.assertNotNull(requestConfig72);
        org.junit.Assert.assertNotNull(requestConfig73);
        org.junit.Assert.assertNotNull(headerArray74);
        org.junit.Assert.assertNull(header79);
        org.junit.Assert.assertNotNull(requestConfig80);
        org.junit.Assert.assertNotNull(requestConfig81);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        requestConfig1.addHeader("", "hi!");
        org.junit.Assert.assertNotNull(requestConfig4);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("", "application/xml");
        java.lang.String str3 = header2.toString();
        java.lang.String str4 = header2.getValue();
        java.lang.String str5 = header2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Name: , Value: application/xml" + "'", str3, "Name: , Value: application/xml");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "application/xml" + "'", str4, "application/xml");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "application/xml" + "'", str5, "application/xml");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.Resting resting10 = resting8.baseURI("");
        com.anitech.resting.Resting resting11 = resting8.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig13, requestConfig14);
        com.anitech.resting.http.Header[] headerArray16 = new com.anitech.resting.http.Header[] {};
        requestConfig13.setHeaders(headerArray16);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig13);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig13);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig13);
        com.anitech.resting.http.request.RequestConfig requestConfig21 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig22 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig22.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray25 = requestConfig22.getHeaders();
        requestConfig21.setHeaders(headerArray25);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse27 = resting8.PUT("Name: , Value: application/xml", (java.lang.Object) requestConfig13, requestConfig21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 5: Name: , Value: application/xml");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(resting10);
        org.junit.Assert.assertNotNull(resting11);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertNotNull(headerArray25);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.Header header18 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str19 = header18.getValue();
        java.lang.String str20 = header18.toString();
        requestConfig12.addHeader(header18);
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig22, requestConfig23);
        com.anitech.resting.http.Header[] headerArray25 = new com.anitech.resting.http.Header[] {};
        requestConfig22.setHeaders(headerArray25);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig22);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig22);
        com.anitech.resting.http.request.RequestConfig requestConfig29 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig22);
        com.anitech.resting.http.request.RequestConfig requestConfig30 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig31 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig32 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig30, requestConfig31);
        com.anitech.resting.http.Header[] headerArray33 = new com.anitech.resting.http.Header[] {};
        requestConfig30.setHeaders(headerArray33);
        com.anitech.resting.http.request.RequestConfig requestConfig35 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig36 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig36.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray39 = requestConfig36.getHeaders();
        requestConfig35.setHeaders(headerArray39);
        org.apache.http.Header[] headerArray41 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray39);
        requestConfig30.setHeaders(headerArray39);
        requestConfig12.setHeaders(headerArray39);
        requestConfig1.setHeaders(headerArray39);
        com.anitech.resting.http.request.RequestConfig requestConfig45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity46 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) requestConfig1, requestConfig45);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Name: application/xml, Value: " + "'", str20, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig22);
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertNotNull(headerArray25);
        org.junit.Assert.assertNotNull(requestConfig29);
        org.junit.Assert.assertNotNull(requestConfig30);
        org.junit.Assert.assertNotNull(requestConfig31);
        org.junit.Assert.assertNotNull(requestConfig32);
        org.junit.Assert.assertNotNull(headerArray33);
        org.junit.Assert.assertNotNull(headerArray39);
        org.junit.Assert.assertNotNull(headerArray41);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting9 = resting5.baseURI("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse11 = resting9.DELETE("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptioncom.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(resting9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting9 = resting5.baseURI("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        com.anitech.resting.Resting resting10 = resting9.enableMetrics();
        com.anitech.resting.Resting resting11 = resting10.enableProcessingHooks();
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertNotNull(resting7);
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(resting10);
        org.junit.Assert.assertNotNull(resting11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = new com.anitech.resting.http.Header[] {};
        requestConfig0.setHeaders(headerArray3);
        com.anitech.resting.http.request.RequestConfig requestConfig5 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig6 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig6.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray9 = requestConfig6.getHeaders();
        requestConfig5.setHeaders(headerArray9);
        org.apache.http.Header[] headerArray11 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray9);
        requestConfig0.setHeaders(headerArray9);
        com.anitech.resting.http.request.RequestConfig requestConfig14 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig14.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header18 = requestConfig14.getHeader("hi!");
        org.apache.http.entity.StringEntity stringEntity19 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) "Name: , Value: application/xml", requestConfig14);
        com.anitech.resting.http.Header[] headerArray20 = requestConfig14.getHeaders();
        requestConfig0.setHeaders(headerArray20);
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertNull(header18);
        org.junit.Assert.assertNotNull(stringEntity19);
        org.junit.Assert.assertNotNull(headerArray20);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.http.request.RequestConfig requestConfig8 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig9.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        requestConfig8.setHeaders(headerArray12);
        int int14 = requestConfig8.getSocketTimeout();
        requestConfig8.setConnectTimeout((int) (short) -1);
        com.anitech.resting.Resting resting17 = resting7.globalRequestConfig(requestConfig8);
        com.anitech.resting.http.Header[] headerArray18 = requestConfig8.getHeaders();
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertNotNull(resting7);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(resting17);
        org.junit.Assert.assertNotNull(headerArray18);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig10 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig10.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig9, requestConfig10);
        com.anitech.resting.http.Header header16 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str17 = header16.getValue();
        java.lang.String str18 = header16.toString();
        requestConfig10.addHeader(header16);
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig20, requestConfig21);
        com.anitech.resting.http.Header[] headerArray23 = new com.anitech.resting.http.Header[] {};
        requestConfig20.setHeaders(headerArray23);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig20);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig20);
        com.anitech.resting.http.request.RequestConfig requestConfig27 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig10, requestConfig20);
        com.anitech.resting.http.request.RequestConfig requestConfig28 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig29 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig30 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig28, requestConfig29);
        com.anitech.resting.http.Header[] headerArray31 = requestConfig29.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig32 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig32.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header36 = requestConfig32.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig37 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig29, requestConfig32);
        com.anitech.resting.http.request.RequestConfig requestConfig38 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig10, requestConfig37);
        com.anitech.resting.http.Header[] headerArray39 = requestConfig37.getHeaders();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse40 = resting7.GET("com.anitech.resting.exception.RestingException: application/json", requestConfig37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptioncom.anitech.resting.exception.RestingException: application/json");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Name: application/xml, Value: " + "'", str18, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(requestConfig22);
        org.junit.Assert.assertNotNull(headerArray23);
        org.junit.Assert.assertNotNull(requestConfig27);
        org.junit.Assert.assertNotNull(requestConfig28);
        org.junit.Assert.assertNotNull(requestConfig29);
        org.junit.Assert.assertNotNull(requestConfig30);
        org.junit.Assert.assertNotNull(headerArray31);
        org.junit.Assert.assertNull(header36);
        org.junit.Assert.assertNotNull(requestConfig37);
        org.junit.Assert.assertNotNull(requestConfig38);
        org.junit.Assert.assertNotNull(headerArray39);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig0.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray3 = requestConfig0.getHeaders();
        java.lang.Class<?> wildcardClass4 = headerArray3.getClass();
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.anitech.resting.exception.RestingException restingException1 = new com.anitech.resting.exception.RestingException();
        java.lang.Throwable throwable2 = null;
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException(throwable2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException3);
        restingException1.addSuppressed((java.lang.Throwable) restingException4);
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException("application/json", (java.lang.Throwable) restingException4);
        java.lang.Throwable throwable9 = null;
        com.anitech.resting.exception.RestingException restingException10 = new com.anitech.resting.exception.RestingException(throwable9);
        com.anitech.resting.exception.RestingException restingException11 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException10);
        com.anitech.resting.exception.RestingException restingException12 = new com.anitech.resting.exception.RestingException("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", (java.lang.Throwable) restingException10);
        restingException6.addSuppressed((java.lang.Throwable) restingException12);
        java.lang.String str14 = restingException12.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException" + "'", str14, "com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.http.request.RequestConfig requestConfig8 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig9.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        requestConfig8.setHeaders(headerArray12);
        int int14 = requestConfig8.getSocketTimeout();
        requestConfig8.setConnectTimeout((int) (short) -1);
        com.anitech.resting.Resting resting17 = resting7.globalRequestConfig(requestConfig8);
        com.anitech.resting.Resting resting18 = resting17.enableMetrics();
        com.anitech.resting.Resting resting20 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig21, requestConfig22);
        com.anitech.resting.http.Header[] headerArray24 = requestConfig22.getHeaders();
        com.anitech.resting.Resting resting25 = resting20.globalRequestConfig(requestConfig22);
        com.anitech.resting.http.request.RequestConfig requestConfig26 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting27 = resting25.globalRequestConfig(requestConfig26);
        com.anitech.resting.Resting resting28 = resting25.enableMetrics();
        com.anitech.resting.Resting resting30 = resting25.baseURI("application/xml");
        com.anitech.resting.http.request.RequestConfig requestConfig31 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig32 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig32.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray35 = requestConfig32.getHeaders();
        requestConfig31.setHeaders(headerArray35);
        int int37 = requestConfig31.getSocketTimeout();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse38 = resting18.PUT("hi!", (java.lang.Object) resting30, requestConfig31);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(resting17);
        org.junit.Assert.assertNotNull(resting18);
        org.junit.Assert.assertNotNull(resting20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(requestConfig22);
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertNotNull(resting25);
        org.junit.Assert.assertNotNull(requestConfig26);
        org.junit.Assert.assertNotNull(resting27);
        org.junit.Assert.assertNotNull(resting28);
        org.junit.Assert.assertNotNull(resting30);
        org.junit.Assert.assertNotNull(headerArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
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
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        com.anitech.resting.Resting resting13 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.http.request.RequestConfig requestConfig14 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig15.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig14, requestConfig15);
        int int19 = requestConfig14.getSocketTimeout();
        com.anitech.resting.Resting resting20 = resting8.globalRequestConfig(requestConfig14);
        com.anitech.resting.http.request.RequestConfig requestConfig22 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig23.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig26 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig22, requestConfig23);
        com.anitech.resting.http.Header header29 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str30 = header29.getValue();
        java.lang.String str31 = header29.toString();
        requestConfig23.addHeader(header29);
        com.anitech.resting.http.request.RequestConfig requestConfig33 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig34 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig34.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig37 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig33, requestConfig34);
        com.anitech.resting.http.request.RequestConfig requestConfig38 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig23, requestConfig33);
        com.anitech.resting.http.request.RequestConfig requestConfig39 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.Header[] headerArray40 = requestConfig39.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig41 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig38, requestConfig39);
        com.anitech.resting.http.request.RequestConfig requestConfig42 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig43 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig43.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig46 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig42, requestConfig43);
        com.anitech.resting.http.Header header49 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str50 = header49.getValue();
        java.lang.String str51 = header49.toString();
        requestConfig43.addHeader(header49);
        com.anitech.resting.http.request.RequestConfig requestConfig53 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig54 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig55 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig53, requestConfig54);
        com.anitech.resting.http.Header[] headerArray56 = new com.anitech.resting.http.Header[] {};
        requestConfig53.setHeaders(headerArray56);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig53);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig53);
        com.anitech.resting.http.request.RequestConfig requestConfig60 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig43, requestConfig53);
        com.anitech.resting.http.request.RequestConfig requestConfig61 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig62 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig63 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig61, requestConfig62);
        com.anitech.resting.http.Header[] headerArray64 = new com.anitech.resting.http.Header[] {};
        requestConfig61.setHeaders(headerArray64);
        com.anitech.resting.http.request.RequestConfig requestConfig66 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig67 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig67.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray70 = requestConfig67.getHeaders();
        requestConfig66.setHeaders(headerArray70);
        org.apache.http.Header[] headerArray72 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray70);
        requestConfig61.setHeaders(headerArray70);
        requestConfig43.setHeaders(headerArray70);
        com.anitech.resting.http.request.RequestConfig requestConfig75 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig76 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig77 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig75, requestConfig76);
        com.anitech.resting.http.Header[] headerArray78 = new com.anitech.resting.http.Header[] {};
        requestConfig75.setHeaders(headerArray78);
        requestConfig43.setHeaders(headerArray78);
        com.anitech.resting.http.request.RequestConfig requestConfig81 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig39, requestConfig43);
        com.anitech.resting.http.request.RequestConfig requestConfig82 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig83 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig84 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig82, requestConfig83);
        com.anitech.resting.http.Header[] headerArray85 = requestConfig83.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig86 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig86.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header90 = requestConfig86.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig91 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig83, requestConfig86);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse92 = resting8.PUT("", (java.lang.Object) requestConfig39, requestConfig91);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertNotNull(resting13);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(resting20);
        org.junit.Assert.assertNotNull(requestConfig26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Name: application/xml, Value: " + "'", str31, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig37);
        org.junit.Assert.assertNotNull(requestConfig38);
        org.junit.Assert.assertNotNull(headerArray40);
        org.junit.Assert.assertNotNull(requestConfig41);
        org.junit.Assert.assertNotNull(requestConfig46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Name: application/xml, Value: " + "'", str51, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig53);
        org.junit.Assert.assertNotNull(requestConfig54);
        org.junit.Assert.assertNotNull(requestConfig55);
        org.junit.Assert.assertNotNull(headerArray56);
        org.junit.Assert.assertNotNull(requestConfig60);
        org.junit.Assert.assertNotNull(requestConfig61);
        org.junit.Assert.assertNotNull(requestConfig62);
        org.junit.Assert.assertNotNull(requestConfig63);
        org.junit.Assert.assertNotNull(headerArray64);
        org.junit.Assert.assertNotNull(headerArray70);
        org.junit.Assert.assertNotNull(headerArray72);
        org.junit.Assert.assertNotNull(requestConfig75);
        org.junit.Assert.assertNotNull(requestConfig76);
        org.junit.Assert.assertNotNull(requestConfig77);
        org.junit.Assert.assertNotNull(headerArray78);
        org.junit.Assert.assertNotNull(requestConfig81);
        org.junit.Assert.assertNotNull(requestConfig82);
        org.junit.Assert.assertNotNull(requestConfig83);
        org.junit.Assert.assertNotNull(requestConfig84);
        org.junit.Assert.assertNotNull(headerArray85);
        org.junit.Assert.assertNull(header90);
        org.junit.Assert.assertNotNull(requestConfig91);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = new com.anitech.resting.http.Header[] {};
        requestConfig0.setHeaders(headerArray3);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig7 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig7.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig10 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig6, requestConfig7);
        com.anitech.resting.http.Header header13 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str14 = header13.getValue();
        java.lang.String str15 = header13.toString();
        requestConfig7.addHeader(header13);
        java.lang.Object obj17 = header13.clone();
        java.lang.String str18 = header13.getValue();
        // The following exception was thrown during execution in test generation
        try {
            requestConfig0.addHeader(header13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNotNull(requestConfig10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Name: application/xml, Value: " + "'", str15, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.Header[] headerArray14 = new com.anitech.resting.http.Header[] {};
        requestConfig11.setHeaders(headerArray14);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig19, requestConfig20);
        com.anitech.resting.http.Header[] headerArray22 = requestConfig20.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig23.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header27 = requestConfig23.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig28 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig20, requestConfig23);
        com.anitech.resting.http.request.RequestConfig requestConfig29 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig28);
        requestConfig29.setConnectTimeout((int) '4');
        com.anitech.resting.http.request.RequestConfig requestConfig32 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig33 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig33.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig36 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig32, requestConfig33);
        com.anitech.resting.http.Header header39 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str40 = header39.getValue();
        java.lang.String str41 = header39.toString();
        requestConfig33.addHeader(header39);
        java.lang.Object obj43 = header39.clone();
        // The following exception was thrown during execution in test generation
        try {
            requestConfig29.addHeader(header39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertNull(header27);
        org.junit.Assert.assertNotNull(requestConfig28);
        org.junit.Assert.assertNotNull(requestConfig29);
        org.junit.Assert.assertNotNull(requestConfig36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Name: application/xml, Value: " + "'", str41, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "Name: application/xml, Value: ");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
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
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        com.anitech.resting.Resting resting13 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.http.request.RequestConfig requestConfig14 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig15.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig14, requestConfig15);
        int int19 = requestConfig14.getSocketTimeout();
        com.anitech.resting.Resting resting20 = resting8.globalRequestConfig(requestConfig14);
        com.anitech.resting.http.Header[] headerArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestConfig14.setHeaders(headerArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertNotNull(resting13);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(resting20);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = new com.anitech.resting.http.Header[] {};
        requestConfig0.setHeaders(headerArray3);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        int int6 = requestConfig0.getConnectTimeout();
        int int7 = requestConfig0.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            requestConfig0.addHeader("request", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.Resting resting10 = resting8.baseURI("");
        com.anitech.resting.Resting resting11 = resting8.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig13, requestConfig14);
        com.anitech.resting.http.Header[] headerArray16 = requestConfig14.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig17 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig17.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header21 = requestConfig17.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig14, requestConfig17);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse23 = resting8.PUT("", (java.lang.Object) requestConfig14);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
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
        org.junit.Assert.assertNotNull(resting10);
        org.junit.Assert.assertNotNull(resting11);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertNull(header21);
        org.junit.Assert.assertNotNull(requestConfig22);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = requestConfig1.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig4 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig4.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header8 = requestConfig4.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig4);
        com.anitech.resting.http.request.RequestConfig requestConfig10 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig10, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig13, requestConfig14);
        requestConfig14.setConnectTimeout(10);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig14);
        com.anitech.resting.http.Header[] headerArray19 = requestConfig14.getHeaders();
        requestConfig4.setHeaders(headerArray19);
        // The following exception was thrown during execution in test generation
        try {
            requestConfig4.addHeader("Name: , Value: application/xml", "com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNull(header8);
        org.junit.Assert.assertNotNull(requestConfig9);
        org.junit.Assert.assertNotNull(requestConfig10);
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(headerArray19);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
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
        com.anitech.resting.http.request.RequestConfig requestConfig10 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig10.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig9, requestConfig10);
        com.anitech.resting.http.Header header16 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str17 = header16.getValue();
        java.lang.String str18 = header16.toString();
        requestConfig10.addHeader(header16);
        com.anitech.resting.http.Header header21 = requestConfig10.getHeader("request");
        com.anitech.resting.http.Header header24 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str25 = header24.toString();
        com.anitech.resting.http.Header header28 = new com.anitech.resting.http.Header("", "application/xml");
        java.lang.String str29 = header28.toString();
        com.anitech.resting.http.Header[] headerArray30 = new com.anitech.resting.http.Header[] { header24, header28 };
        requestConfig10.setHeaders(headerArray30);
        requestConfig10.setSocketTimeout(10);
        com.anitech.resting.Resting resting34 = resting5.globalRequestConfig(requestConfig10);
        com.anitech.resting.http.request.RequestConfig requestConfig36 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig37 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig37.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray40 = requestConfig37.getHeaders();
        requestConfig36.setHeaders(headerArray40);
        com.anitech.resting.Resting resting42 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig43 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig44 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig45 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig43, requestConfig44);
        com.anitech.resting.http.Header[] headerArray46 = requestConfig44.getHeaders();
        com.anitech.resting.Resting resting47 = resting42.globalRequestConfig(requestConfig44);
        com.anitech.resting.http.request.RequestConfig requestConfig48 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting49 = resting47.globalRequestConfig(requestConfig48);
        com.anitech.resting.Resting resting50 = resting47.enableMetrics();
        com.anitech.resting.Resting resting52 = resting47.baseURI("application/xml");
        com.anitech.resting.http.request.RequestConfig requestConfig53 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig54 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig54.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig57 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig53, requestConfig54);
        com.anitech.resting.http.Header header60 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str61 = header60.getValue();
        java.lang.String str62 = header60.toString();
        requestConfig54.addHeader(header60);
        com.anitech.resting.http.Header header65 = requestConfig54.getHeader("request");
        requestConfig54.setConnectTimeout((int) (short) 100);
        requestConfig54.setConnectTimeout(100);
        com.anitech.resting.Resting resting70 = resting47.globalRequestConfig(requestConfig54);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig54);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse72 = resting5.PUT("", (java.lang.Object) headerArray40, requestConfig54);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
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
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Name: application/xml, Value: " + "'", str18, "Name: application/xml, Value: ");
        org.junit.Assert.assertNull(header21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Name: application/xml, Value: " + "'", str25, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Name: , Value: application/xml" + "'", str29, "Name: , Value: application/xml");
        org.junit.Assert.assertNotNull(headerArray30);
        org.junit.Assert.assertNotNull(resting34);
        org.junit.Assert.assertNotNull(headerArray40);
        org.junit.Assert.assertNotNull(resting42);
        org.junit.Assert.assertNotNull(requestConfig43);
        org.junit.Assert.assertNotNull(requestConfig44);
        org.junit.Assert.assertNotNull(requestConfig45);
        org.junit.Assert.assertNotNull(headerArray46);
        org.junit.Assert.assertNotNull(resting47);
        org.junit.Assert.assertNotNull(requestConfig48);
        org.junit.Assert.assertNotNull(resting49);
        org.junit.Assert.assertNotNull(resting50);
        org.junit.Assert.assertNotNull(resting52);
        org.junit.Assert.assertNotNull(requestConfig57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Name: application/xml, Value: " + "'", str62, "Name: application/xml, Value: ");
        org.junit.Assert.assertNull(header65);
        org.junit.Assert.assertNotNull(resting70);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        requestConfig0.setConnectTimeout((int) (byte) 100);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig0.getHeaders();
        int int5 = requestConfig0.getSocketTimeout();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.anitech.resting.exception.RestingException restingException1 = new com.anitech.resting.exception.RestingException("request");
        java.lang.String str2 = restingException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.anitech.resting.exception.RestingException: request" + "'", str2, "com.anitech.resting.exception.RestingException: request");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.lang.Throwable throwable2 = null;
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException(throwable2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException3);
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", (java.lang.Throwable) restingException3);
        java.lang.Throwable throwable7 = null;
        com.anitech.resting.exception.RestingException restingException8 = new com.anitech.resting.exception.RestingException(throwable7);
        com.anitech.resting.exception.RestingException restingException9 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException8);
        restingException3.addSuppressed((java.lang.Throwable) restingException9);
        java.lang.Throwable[] throwableArray11 = restingException3.getSuppressed();
        com.anitech.resting.exception.RestingException restingException13 = new com.anitech.resting.exception.RestingException("Name: application/xml, Value: ");
        restingException3.addSuppressed((java.lang.Throwable) restingException13);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.lang.Throwable throwable1 = null;
        com.anitech.resting.exception.RestingException restingException2 = new com.anitech.resting.exception.RestingException(throwable1);
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException2);
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException2);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig1.getHeaders();
        requestConfig0.setHeaders(headerArray4);
        int int6 = requestConfig0.getSocketTimeout();
        requestConfig0.setConnectTimeout((int) (byte) 1);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("Name: , Value: application/xml", "hi!");
        java.lang.String str3 = header2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Name: , Value: application/xml" + "'", str3, "Name: , Value: application/xml");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.lang.Throwable throwable2 = null;
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException(throwable2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException3);
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException("Name: application/xml, Value: ", (java.lang.Throwable) restingException4);
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException("Name: application/xml, Value: ", (java.lang.Throwable) restingException4);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig0.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header4 = requestConfig0.getHeader("hi!");
        int int5 = requestConfig0.getSocketTimeout();
        com.anitech.resting.http.Header[] headerArray6 = requestConfig0.getHeaders();
        com.anitech.resting.http.Header header9 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str10 = header9.toString();
        java.lang.String str11 = header9.toString();
        java.lang.String str12 = header9.toString();
        requestConfig0.addHeader(header9);
        requestConfig0.setSocketTimeout((int) ' ');
        org.junit.Assert.assertNull(header4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Name: application/xml, Value: " + "'", str10, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Name: application/xml, Value: " + "'", str11, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Name: application/xml, Value: " + "'", str12, "Name: application/xml, Value: ");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        requestConfig6.setConnectTimeout((int) 'a');
        com.anitech.resting.Resting resting9 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting11 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig13);
        com.anitech.resting.http.Header[] headerArray15 = requestConfig13.getHeaders();
        com.anitech.resting.Resting resting16 = resting11.globalRequestConfig(requestConfig13);
        com.anitech.resting.http.request.RequestConfig requestConfig17 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting18 = resting16.globalRequestConfig(requestConfig17);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig20 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig20.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray23 = requestConfig20.getHeaders();
        requestConfig19.setHeaders(headerArray23);
        int int25 = requestConfig19.getSocketTimeout();
        requestConfig19.setConnectTimeout((int) (short) -1);
        com.anitech.resting.Resting resting28 = resting18.globalRequestConfig(requestConfig19);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse29 = resting5.GET("com.anitech.resting.exception.RestingException: request", requestConfig19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 5: Name: , Value: application/xmlcom.anitech.resting.exception.RestingException: request");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(resting11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertNotNull(resting16);
        org.junit.Assert.assertNotNull(requestConfig17);
        org.junit.Assert.assertNotNull(resting18);
        org.junit.Assert.assertNotNull(headerArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(resting28);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.request.RequestConfig requestConfig5 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig6 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig6.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig5, requestConfig6);
        com.anitech.resting.http.Header header12 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str13 = header12.getValue();
        java.lang.String str14 = header12.toString();
        requestConfig6.addHeader(header12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig17 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig16, requestConfig17);
        com.anitech.resting.http.Header[] headerArray19 = new com.anitech.resting.http.Header[] {};
        requestConfig16.setHeaders(headerArray19);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig16);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig16);
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig6, requestConfig16);
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig16);
        com.anitech.resting.http.request.RequestConfig requestConfig25 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig26 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig27 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig25, requestConfig26);
        com.anitech.resting.http.Header[] headerArray28 = new com.anitech.resting.http.Header[] {};
        requestConfig25.setHeaders(headerArray28);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig25);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig25);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig25);
        int int33 = requestConfig25.getConnectTimeout();
        com.anitech.resting.http.Header[] headerArray34 = requestConfig25.getHeaders();
        requestConfig24.setHeaders(headerArray34);
        com.anitech.resting.http.Header header37 = requestConfig24.getHeader("com.anitech.resting.exception.RestingException: request");
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertNotNull(requestConfig9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Name: application/xml, Value: " + "'", str14, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(requestConfig17);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertNotNull(requestConfig25);
        org.junit.Assert.assertNotNull(requestConfig26);
        org.junit.Assert.assertNotNull(requestConfig27);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(headerArray34);
        org.junit.Assert.assertNull(header37);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        com.anitech.resting.http.Header[] headerArray2 = requestConfig0.getHeaders();
        org.apache.http.Header[] headerArray3 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray2);
        org.apache.http.Header[] headerArray4 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray2);
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNotNull(headerArray4);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.Resting resting10 = resting5.baseURI("application/xml");
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.Header header18 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str19 = header18.getValue();
        java.lang.String str20 = header18.toString();
        requestConfig12.addHeader(header18);
        com.anitech.resting.http.Header header23 = requestConfig12.getHeader("request");
        requestConfig12.setConnectTimeout((int) (short) 100);
        requestConfig12.setConnectTimeout(100);
        com.anitech.resting.Resting resting28 = resting5.globalRequestConfig(requestConfig12);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig12);
        com.anitech.resting.http.Header[] headerArray30 = requestConfig12.getHeaders();
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertNotNull(resting7);
        org.junit.Assert.assertNotNull(resting8);
        org.junit.Assert.assertNotNull(resting10);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Name: application/xml, Value: " + "'", str20, "Name: application/xml, Value: ");
        org.junit.Assert.assertNull(header23);
        org.junit.Assert.assertNotNull(resting28);
        org.junit.Assert.assertNotNull(headerArray30);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting9 = resting5.baseURI("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        com.anitech.resting.Resting resting10 = resting9.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig13.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig13);
        com.anitech.resting.http.Header header19 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str20 = header19.getValue();
        java.lang.String str21 = header19.toString();
        requestConfig13.addHeader(header19);
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig25 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig23, requestConfig24);
        com.anitech.resting.http.Header[] headerArray26 = new com.anitech.resting.http.Header[] {};
        requestConfig23.setHeaders(headerArray26);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig23);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig23);
        com.anitech.resting.http.request.RequestConfig requestConfig30 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig13, requestConfig23);
        com.anitech.resting.http.request.RequestConfig requestConfig31 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig32 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig33 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig31, requestConfig32);
        com.anitech.resting.http.Header[] headerArray34 = requestConfig32.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig35 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig35.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header39 = requestConfig35.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig40 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig32, requestConfig35);
        com.anitech.resting.http.request.RequestConfig requestConfig41 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig13, requestConfig40);
        java.lang.Class<?> wildcardClass42 = requestConfig40.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse43 = resting9.POST("request", (java.lang.Object) wildcardClass42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingExceptionrequest");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(resting10);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Name: application/xml, Value: " + "'", str21, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertNotNull(requestConfig25);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertNotNull(requestConfig30);
        org.junit.Assert.assertNotNull(requestConfig31);
        org.junit.Assert.assertNotNull(requestConfig32);
        org.junit.Assert.assertNotNull(requestConfig33);
        org.junit.Assert.assertNotNull(headerArray34);
        org.junit.Assert.assertNull(header39);
        org.junit.Assert.assertNotNull(requestConfig40);
        org.junit.Assert.assertNotNull(requestConfig41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.Resting resting10 = resting5.baseURI("application/xml");
        com.anitech.resting.http.request.RequestConfig requestConfig13 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig13.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header17 = requestConfig13.getHeader("hi!");
        org.apache.http.entity.StringEntity stringEntity18 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) "Name: , Value: application/xml", requestConfig13);
        com.anitech.resting.http.Header header20 = requestConfig13.getHeader("");
        com.anitech.resting.http.Header[] headerArray21 = requestConfig13.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig24 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig24.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig27 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig23, requestConfig24);
        com.anitech.resting.http.Header header30 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str31 = header30.getValue();
        java.lang.String str32 = header30.toString();
        requestConfig24.addHeader(header30);
        com.anitech.resting.http.request.RequestConfig requestConfig34 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig35 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig36 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig34, requestConfig35);
        com.anitech.resting.http.Header[] headerArray37 = new com.anitech.resting.http.Header[] {};
        requestConfig34.setHeaders(headerArray37);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig34);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig34);
        com.anitech.resting.http.request.RequestConfig requestConfig41 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig24, requestConfig34);
        com.anitech.resting.http.request.RequestConfig requestConfig42 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig43 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig44 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig42, requestConfig43);
        com.anitech.resting.http.Header[] headerArray45 = requestConfig43.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig46 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig46.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header50 = requestConfig46.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig51 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig43, requestConfig46);
        com.anitech.resting.http.request.RequestConfig requestConfig52 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig24, requestConfig51);
        com.anitech.resting.http.Header[] headerArray53 = requestConfig51.getHeaders();
        org.apache.http.entity.StringEntity stringEntity54 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) "application/json", requestConfig51);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse55 = resting10.PUT("application/json", (java.lang.Object) headerArray21, requestConfig51);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
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
        org.junit.Assert.assertNotNull(resting10);
        org.junit.Assert.assertNull(header17);
        org.junit.Assert.assertNotNull(stringEntity18);
        org.junit.Assert.assertNull(header20);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertNotNull(requestConfig27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Name: application/xml, Value: " + "'", str32, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig34);
        org.junit.Assert.assertNotNull(requestConfig35);
        org.junit.Assert.assertNotNull(requestConfig36);
        org.junit.Assert.assertNotNull(headerArray37);
        org.junit.Assert.assertNotNull(requestConfig41);
        org.junit.Assert.assertNotNull(requestConfig42);
        org.junit.Assert.assertNotNull(requestConfig43);
        org.junit.Assert.assertNotNull(requestConfig44);
        org.junit.Assert.assertNotNull(headerArray45);
        org.junit.Assert.assertNull(header50);
        org.junit.Assert.assertNotNull(requestConfig51);
        org.junit.Assert.assertNotNull(requestConfig52);
        org.junit.Assert.assertNotNull(headerArray53);
        org.junit.Assert.assertNotNull(stringEntity54);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("com.anitech.resting.exception.RestingException: application/json", "Name: application/xml, Value: ");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
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
        com.anitech.resting.http.request.RequestConfig requestConfig18 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig19 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig19.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig18, requestConfig19);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse23 = resting8.GET("com.anitech.resting.exception.RestingException: application/json", requestConfig19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 5: Name: , Value: application/xmlcom.anitech.resting.exception.RestingException: application/json");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(requestConfig22);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.lang.Throwable throwable4 = null;
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException(throwable4);
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException5);
        com.anitech.resting.exception.RestingException restingException7 = new com.anitech.resting.exception.RestingException("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", (java.lang.Throwable) restingException5);
        com.anitech.resting.exception.RestingException restingException8 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException5);
        com.anitech.resting.exception.RestingException restingException9 = new com.anitech.resting.exception.RestingException("application/xml", (java.lang.Throwable) restingException8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.Header[] headerArray1 = requestConfig0.getHeaders();
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(headerArray1);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.anitech.resting.exception.RestingException restingException1 = new com.anitech.resting.exception.RestingException("request");
        java.lang.Throwable throwable3 = null;
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException(throwable3);
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException4);
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException("Name: application/xml, Value: ", (java.lang.Throwable) restingException5);
        com.anitech.resting.exception.RestingException restingException7 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException6);
        restingException1.addSuppressed((java.lang.Throwable) restingException7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", "com.anitech.resting.exception.RestingException: application/json");
        java.lang.Object obj3 = header2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "Name: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException, Value: com.anitech.resting.exception.RestingException: application/json");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "Name: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException, Value: com.anitech.resting.exception.RestingException: application/json");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "Name: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException, Value: com.anitech.resting.exception.RestingException: application/json");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting9 = resting5.baseURI("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        com.anitech.resting.Resting resting11 = resting9.baseURI("com.anitech.resting.exception.RestingException: application/json");
        com.anitech.resting.http.request.RequestConfig requestConfig13 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig14.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray17 = requestConfig14.getHeaders();
        requestConfig13.setHeaders(headerArray17);
        int int19 = requestConfig13.getSocketTimeout();
        requestConfig13.setConnectTimeout((int) (short) -1);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig13);
        com.anitech.resting.Resting resting23 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig25 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig26 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig24, requestConfig25);
        com.anitech.resting.http.Header[] headerArray27 = requestConfig25.getHeaders();
        com.anitech.resting.Resting resting28 = resting23.globalRequestConfig(requestConfig25);
        com.anitech.resting.http.request.RequestConfig requestConfig29 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting30 = resting28.globalRequestConfig(requestConfig29);
        com.anitech.resting.Resting resting31 = resting28.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig32 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig32.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray35 = requestConfig32.getHeaders();
        com.anitech.resting.Resting resting36 = resting31.globalRequestConfig(requestConfig32);
        com.anitech.resting.Resting resting38 = resting31.baseURI("application/xml");
        com.anitech.resting.Resting resting39 = resting31.enableProcessingHooks();
        com.anitech.resting.http.request.RequestConfig requestConfig40 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.Resting resting41 = resting31.globalRequestConfig(requestConfig40);
        com.anitech.resting.http.request.RequestConfig requestConfig42 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig13, requestConfig40);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse43 = resting9.GET("", requestConfig40);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: org.apache.http.client.ClientProtocolException");
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
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(resting11);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(resting23);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertNotNull(requestConfig25);
        org.junit.Assert.assertNotNull(requestConfig26);
        org.junit.Assert.assertNotNull(headerArray27);
        org.junit.Assert.assertNotNull(resting28);
        org.junit.Assert.assertNotNull(requestConfig29);
        org.junit.Assert.assertNotNull(resting30);
        org.junit.Assert.assertNotNull(resting31);
        org.junit.Assert.assertNotNull(headerArray35);
        org.junit.Assert.assertNotNull(resting36);
        org.junit.Assert.assertNotNull(resting38);
        org.junit.Assert.assertNotNull(resting39);
        org.junit.Assert.assertNotNull(resting41);
        org.junit.Assert.assertNotNull(requestConfig42);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("request", "application/xml");
        java.lang.String str3 = header2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "application/xml" + "'", str3, "application/xml");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.anitech.resting.exception.RestingException restingException1 = new com.anitech.resting.exception.RestingException("com.anitech.resting.exception.RestingException: application/json");
        java.lang.Throwable throwable4 = null;
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException(throwable4);
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException5);
        com.anitech.resting.exception.RestingException restingException7 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException5);
        com.anitech.resting.exception.RestingException restingException8 = new com.anitech.resting.exception.RestingException("", (java.lang.Throwable) restingException5);
        restingException1.addSuppressed((java.lang.Throwable) restingException8);
        com.anitech.resting.exception.RestingException restingException11 = new com.anitech.resting.exception.RestingException();
        java.lang.Throwable throwable12 = null;
        com.anitech.resting.exception.RestingException restingException13 = new com.anitech.resting.exception.RestingException(throwable12);
        com.anitech.resting.exception.RestingException restingException14 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException13);
        restingException11.addSuppressed((java.lang.Throwable) restingException14);
        com.anitech.resting.exception.RestingException restingException16 = new com.anitech.resting.exception.RestingException("application/json", (java.lang.Throwable) restingException14);
        restingException8.addSuppressed((java.lang.Throwable) restingException14);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.Header[] headerArray17 = requestConfig16.getHeaders();
        requestConfig16.setSocketTimeout((int) (short) 10);
        com.anitech.resting.http.Header[] headerArray20 = requestConfig16.getHeaders();
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertNotNull(headerArray20);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        int int5 = requestConfig0.getSocketTimeout();
        int int6 = requestConfig0.getConnectTimeout();
        com.anitech.resting.http.Header header8 = requestConfig0.getHeader("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/json");
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(header8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.lang.Throwable throwable1 = null;
        com.anitech.resting.exception.RestingException restingException2 = new com.anitech.resting.exception.RestingException(throwable1);
        java.lang.Throwable[] throwableArray3 = restingException2.getSuppressed();
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException("request", (java.lang.Throwable) restingException2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
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
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        com.anitech.resting.Resting resting13 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.Resting resting14 = resting13.enableProcessingHooks();
        com.anitech.resting.Resting resting15 = resting13.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig17 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig18 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig18.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig17, requestConfig18);
        com.anitech.resting.http.Header header24 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str25 = header24.getValue();
        java.lang.String str26 = header24.toString();
        requestConfig18.addHeader(header24);
        com.anitech.resting.http.request.RequestConfig requestConfig28 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig29 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig30 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig28, requestConfig29);
        com.anitech.resting.http.Header[] headerArray31 = new com.anitech.resting.http.Header[] {};
        requestConfig28.setHeaders(headerArray31);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig28);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig28);
        com.anitech.resting.http.request.RequestConfig requestConfig35 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig18, requestConfig28);
        com.anitech.resting.http.request.RequestConfig requestConfig36 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig37 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig38 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig36, requestConfig37);
        com.anitech.resting.http.Header[] headerArray39 = new com.anitech.resting.http.Header[] {};
        requestConfig36.setHeaders(headerArray39);
        com.anitech.resting.http.request.RequestConfig requestConfig41 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig42 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig42.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray45 = requestConfig42.getHeaders();
        requestConfig41.setHeaders(headerArray45);
        org.apache.http.Header[] headerArray47 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray45);
        requestConfig36.setHeaders(headerArray45);
        requestConfig18.setHeaders(headerArray45);
        com.anitech.resting.http.Header[] headerArray50 = requestConfig18.getHeaders();
        int int51 = requestConfig18.getConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse52 = resting15.DELETE("com.anitech.resting.exception.RestingException: application/json", requestConfig18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 62: application/xmlcom.anitech.resting.exception.RestingException: application/json");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertNotNull(resting13);
        org.junit.Assert.assertNotNull(resting14);
        org.junit.Assert.assertNotNull(resting15);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Name: application/xml, Value: " + "'", str26, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig28);
        org.junit.Assert.assertNotNull(requestConfig29);
        org.junit.Assert.assertNotNull(requestConfig30);
        org.junit.Assert.assertNotNull(headerArray31);
        org.junit.Assert.assertNotNull(requestConfig35);
        org.junit.Assert.assertNotNull(requestConfig36);
        org.junit.Assert.assertNotNull(requestConfig37);
        org.junit.Assert.assertNotNull(requestConfig38);
        org.junit.Assert.assertNotNull(headerArray39);
        org.junit.Assert.assertNotNull(headerArray45);
        org.junit.Assert.assertNotNull(headerArray47);
        org.junit.Assert.assertNotNull(headerArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig17 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.Header[] headerArray18 = requestConfig17.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig16, requestConfig17);
        com.anitech.resting.http.request.RequestConfig requestConfig20 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig21.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig20, requestConfig21);
        com.anitech.resting.http.Header header27 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str28 = header27.getValue();
        java.lang.String str29 = header27.toString();
        requestConfig21.addHeader(header27);
        com.anitech.resting.http.request.RequestConfig requestConfig31 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig32 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig33 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig31, requestConfig32);
        com.anitech.resting.http.Header[] headerArray34 = new com.anitech.resting.http.Header[] {};
        requestConfig31.setHeaders(headerArray34);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig31);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig31);
        com.anitech.resting.http.request.RequestConfig requestConfig38 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig21, requestConfig31);
        com.anitech.resting.http.request.RequestConfig requestConfig39 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig40 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig41 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig39, requestConfig40);
        com.anitech.resting.http.Header[] headerArray42 = new com.anitech.resting.http.Header[] {};
        requestConfig39.setHeaders(headerArray42);
        com.anitech.resting.http.request.RequestConfig requestConfig44 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig45 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig45.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray48 = requestConfig45.getHeaders();
        requestConfig44.setHeaders(headerArray48);
        org.apache.http.Header[] headerArray50 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray48);
        requestConfig39.setHeaders(headerArray48);
        requestConfig21.setHeaders(headerArray48);
        com.anitech.resting.http.request.RequestConfig requestConfig53 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig54 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig55 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig53, requestConfig54);
        com.anitech.resting.http.Header[] headerArray56 = new com.anitech.resting.http.Header[] {};
        requestConfig53.setHeaders(headerArray56);
        requestConfig21.setHeaders(headerArray56);
        com.anitech.resting.http.request.RequestConfig requestConfig59 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig17, requestConfig21);
        com.anitech.resting.http.request.RequestConfig requestConfig60 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig61 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig61.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig64 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig60, requestConfig61);
        com.anitech.resting.http.Header header67 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str68 = header67.getValue();
        java.lang.String str69 = header67.toString();
        requestConfig61.addHeader(header67);
        com.anitech.resting.http.Header header72 = requestConfig61.getHeader("request");
        com.anitech.resting.http.Header header75 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str76 = header75.toString();
        com.anitech.resting.http.Header header79 = new com.anitech.resting.http.Header("", "application/xml");
        java.lang.String str80 = header79.toString();
        com.anitech.resting.http.Header[] headerArray81 = new com.anitech.resting.http.Header[] { header75, header79 };
        requestConfig61.setHeaders(headerArray81);
        com.anitech.resting.http.request.RequestConfig requestConfig83 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig59, requestConfig61);
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Name: application/xml, Value: " + "'", str29, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig31);
        org.junit.Assert.assertNotNull(requestConfig32);
        org.junit.Assert.assertNotNull(requestConfig33);
        org.junit.Assert.assertNotNull(headerArray34);
        org.junit.Assert.assertNotNull(requestConfig38);
        org.junit.Assert.assertNotNull(requestConfig39);
        org.junit.Assert.assertNotNull(requestConfig40);
        org.junit.Assert.assertNotNull(requestConfig41);
        org.junit.Assert.assertNotNull(headerArray42);
        org.junit.Assert.assertNotNull(headerArray48);
        org.junit.Assert.assertNotNull(headerArray50);
        org.junit.Assert.assertNotNull(requestConfig53);
        org.junit.Assert.assertNotNull(requestConfig54);
        org.junit.Assert.assertNotNull(requestConfig55);
        org.junit.Assert.assertNotNull(headerArray56);
        org.junit.Assert.assertNotNull(requestConfig59);
        org.junit.Assert.assertNotNull(requestConfig64);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Name: application/xml, Value: " + "'", str69, "Name: application/xml, Value: ");
        org.junit.Assert.assertNull(header72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Name: application/xml, Value: " + "'", str76, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Name: , Value: application/xml" + "'", str80, "Name: , Value: application/xml");
        org.junit.Assert.assertNotNull(headerArray81);
        org.junit.Assert.assertNotNull(requestConfig83);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
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
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        com.anitech.resting.Resting resting13 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.http.request.RequestConfig requestConfig14 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig15.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig14, requestConfig15);
        int int19 = requestConfig14.getSocketTimeout();
        com.anitech.resting.Resting resting20 = resting8.globalRequestConfig(requestConfig14);
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig22, requestConfig23);
        com.anitech.resting.http.Header[] headerArray25 = new com.anitech.resting.http.Header[] {};
        requestConfig22.setHeaders(headerArray25);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig22);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig22);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig22);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig22);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse31 = resting8.GET("com.anitech.resting.exception.RestingException: request", requestConfig22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 62: application/xmlcom.anitech.resting.exception.RestingException: request");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertNotNull(resting13);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(resting20);
        org.junit.Assert.assertNotNull(requestConfig22);
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertNotNull(headerArray25);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.Resting resting10 = resting5.baseURI("application/xml");
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.Header header18 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str19 = header18.getValue();
        java.lang.String str20 = header18.toString();
        requestConfig12.addHeader(header18);
        com.anitech.resting.http.Header header23 = requestConfig12.getHeader("request");
        requestConfig12.setConnectTimeout((int) (short) 100);
        requestConfig12.setConnectTimeout(100);
        com.anitech.resting.Resting resting28 = resting5.globalRequestConfig(requestConfig12);
        com.anitech.resting.Resting resting29 = resting28.enableProcessingHooks();
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertNotNull(resting7);
        org.junit.Assert.assertNotNull(resting8);
        org.junit.Assert.assertNotNull(resting10);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Name: application/xml, Value: " + "'", str20, "Name: application/xml, Value: ");
        org.junit.Assert.assertNull(header23);
        org.junit.Assert.assertNotNull(resting28);
        org.junit.Assert.assertNotNull(resting29);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting9 = resting5.baseURI("hi!");
        com.anitech.resting.Resting resting10 = resting5.enableProcessingHooks();
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertNotNull(resting7);
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(resting10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("", "request");
        java.lang.Object obj3 = header2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "Name: , Value: request");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "Name: , Value: request");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "Name: , Value: request");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("", "application/xml");
        java.lang.String str3 = header2.toString();
        java.lang.String str4 = header2.getValue();
        java.lang.String str5 = header2.getName();
        java.lang.String str6 = header2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Name: , Value: application/xml" + "'", str3, "Name: , Value: application/xml");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "application/xml" + "'", str4, "application/xml");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Name: , Value: application/xml" + "'", str6, "Name: , Value: application/xml");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.lang.Throwable throwable3 = null;
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException(throwable3);
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException4);
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException4);
        com.anitech.resting.exception.RestingException restingException7 = new com.anitech.resting.exception.RestingException("application/xml", (java.lang.Throwable) restingException4);
        com.anitech.resting.exception.RestingException restingException8 = new com.anitech.resting.exception.RestingException("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", (java.lang.Throwable) restingException4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("", "application/xml");
        java.lang.String str3 = header2.toString();
        java.lang.String str4 = header2.getValue();
        java.lang.Object obj5 = header2.clone();
        java.lang.String str6 = header2.toString();
        java.lang.String str7 = header2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Name: , Value: application/xml" + "'", str3, "Name: , Value: application/xml");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "application/xml" + "'", str4, "application/xml");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "Name: , Value: application/xml");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "Name: , Value: application/xml");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "Name: , Value: application/xml");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Name: , Value: application/xml" + "'", str6, "Name: , Value: application/xml");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Name: , Value: application/xml" + "'", str7, "Name: , Value: application/xml");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str3 = header2.getValue();
        java.lang.String str4 = header2.getName();
        java.lang.String str5 = header2.getValue();
        java.lang.String str6 = header2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "application/xml" + "'", str4, "application/xml");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting9 = resting5.baseURI("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        com.anitech.resting.Resting resting11 = resting9.baseURI("com.anitech.resting.exception.RestingException: application/json");
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse13 = resting9.GET("Name: , Value: application/xml");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: application/jsonName: , Value: application/xml");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(resting11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.Header[] headerArray11 = requestConfig1.getHeaders();
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(headerArray11);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
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
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        com.anitech.resting.Resting resting13 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.Resting resting14 = resting13.enableProcessingHooks();
        com.anitech.resting.Resting resting15 = resting13.enableMetrics();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse17 = resting13.DELETE("Name: , Value: application/xml");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: application/jsonName: , Value: application/xml");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertNotNull(resting13);
        org.junit.Assert.assertNotNull(resting14);
        org.junit.Assert.assertNotNull(resting15);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str3 = header2.getValue();
        java.lang.String str4 = header2.toString();
        java.lang.String str5 = header2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Name: application/xml, Value: " + "'", str4, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "application/xml" + "'", str5, "application/xml");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
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
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        com.anitech.resting.Resting resting13 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.Resting resting14 = resting13.enableProcessingHooks();
        java.lang.Throwable throwable17 = null;
        com.anitech.resting.exception.RestingException restingException18 = new com.anitech.resting.exception.RestingException(throwable17);
        com.anitech.resting.exception.RestingException restingException19 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException18);
        com.anitech.resting.exception.RestingException restingException20 = new com.anitech.resting.exception.RestingException("Name: application/xml, Value: ", (java.lang.Throwable) restingException19);
        com.anitech.resting.exception.RestingException restingException21 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException19);
        java.lang.Throwable throwable23 = null;
        com.anitech.resting.exception.RestingException restingException24 = new com.anitech.resting.exception.RestingException(throwable23);
        com.anitech.resting.exception.RestingException restingException25 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException24);
        com.anitech.resting.exception.RestingException restingException26 = new com.anitech.resting.exception.RestingException("Name: application/xml, Value: ", (java.lang.Throwable) restingException25);
        com.anitech.resting.exception.RestingException restingException27 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException25);
        restingException19.addSuppressed((java.lang.Throwable) restingException25);
        com.anitech.resting.http.request.RequestConfig requestConfig29 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig30 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig30.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig33 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig29, requestConfig30);
        com.anitech.resting.http.Header header36 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str37 = header36.getValue();
        java.lang.String str38 = header36.toString();
        requestConfig30.addHeader(header36);
        com.anitech.resting.http.request.RequestConfig requestConfig40 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig41 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig42 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig40, requestConfig41);
        com.anitech.resting.http.Header[] headerArray43 = new com.anitech.resting.http.Header[] {};
        requestConfig40.setHeaders(headerArray43);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig40);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig40);
        com.anitech.resting.http.request.RequestConfig requestConfig47 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig30, requestConfig40);
        com.anitech.resting.http.request.RequestConfig requestConfig48 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig49 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig50 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig48, requestConfig49);
        com.anitech.resting.http.Header[] headerArray51 = new com.anitech.resting.http.Header[] {};
        requestConfig48.setHeaders(headerArray51);
        com.anitech.resting.http.request.RequestConfig requestConfig53 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig54 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig54.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray57 = requestConfig54.getHeaders();
        requestConfig53.setHeaders(headerArray57);
        org.apache.http.Header[] headerArray59 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray57);
        requestConfig48.setHeaders(headerArray57);
        requestConfig30.setHeaders(headerArray57);
        com.anitech.resting.http.request.RequestConfig requestConfig62 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig63 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig64 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig62, requestConfig63);
        com.anitech.resting.http.Header[] headerArray65 = new com.anitech.resting.http.Header[] {};
        requestConfig62.setHeaders(headerArray65);
        requestConfig30.setHeaders(headerArray65);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse68 = resting13.PUT("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/json", (java.lang.Object) restingException19, requestConfig30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: application/jsoncom.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/json");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertNotNull(resting13);
        org.junit.Assert.assertNotNull(resting14);
        org.junit.Assert.assertNotNull(requestConfig33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Name: application/xml, Value: " + "'", str38, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig40);
        org.junit.Assert.assertNotNull(requestConfig41);
        org.junit.Assert.assertNotNull(requestConfig42);
        org.junit.Assert.assertNotNull(headerArray43);
        org.junit.Assert.assertNotNull(requestConfig47);
        org.junit.Assert.assertNotNull(requestConfig48);
        org.junit.Assert.assertNotNull(requestConfig49);
        org.junit.Assert.assertNotNull(requestConfig50);
        org.junit.Assert.assertNotNull(headerArray51);
        org.junit.Assert.assertNotNull(headerArray57);
        org.junit.Assert.assertNotNull(headerArray59);
        org.junit.Assert.assertNotNull(requestConfig62);
        org.junit.Assert.assertNotNull(requestConfig63);
        org.junit.Assert.assertNotNull(requestConfig64);
        org.junit.Assert.assertNotNull(headerArray65);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.request.RequestConfig requestConfig5 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig6 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig6.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig5, requestConfig6);
        com.anitech.resting.http.Header header12 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str13 = header12.getValue();
        java.lang.String str14 = header12.toString();
        requestConfig6.addHeader(header12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig17 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig16, requestConfig17);
        com.anitech.resting.http.Header[] headerArray19 = new com.anitech.resting.http.Header[] {};
        requestConfig16.setHeaders(headerArray19);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig16);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig16);
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig6, requestConfig16);
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig16);
        com.anitech.resting.http.Header[] headerArray25 = requestConfig24.getHeaders();
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertNotNull(requestConfig9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Name: application/xml, Value: " + "'", str14, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(requestConfig17);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertNotNull(headerArray25);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.Header[] headerArray14 = new com.anitech.resting.http.Header[] {};
        requestConfig11.setHeaders(headerArray14);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig19, requestConfig20);
        com.anitech.resting.http.Header[] headerArray22 = requestConfig20.getHeaders();
        requestConfig11.setHeaders(headerArray22);
        // The following exception was thrown during execution in test generation
        try {
            requestConfig11.addHeader("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", "Name: application/xml, Value: ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(headerArray22);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig0.setConnectTimeout((int) (byte) 0);
        requestConfig0.setConnectTimeout((int) (byte) 1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = new com.anitech.resting.http.Header[] {};
        requestConfig0.setHeaders(headerArray3);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        requestConfig0.setConnectTimeout((int) ' ');
        requestConfig0.setSocketTimeout(0);
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig13);
        com.anitech.resting.http.Header[] headerArray15 = new com.anitech.resting.http.Header[] {};
        requestConfig12.setHeaders(headerArray15);
        requestConfig0.setHeaders(headerArray15);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig19 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig19.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig18, requestConfig19);
        com.anitech.resting.http.Header header25 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str26 = header25.getValue();
        java.lang.String str27 = header25.toString();
        requestConfig19.addHeader(header25);
        com.anitech.resting.http.request.RequestConfig requestConfig29 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig30 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig30.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig33 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig29, requestConfig30);
        com.anitech.resting.http.request.RequestConfig requestConfig34 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig19, requestConfig29);
        int int35 = requestConfig34.getSocketTimeout();
        com.anitech.resting.http.request.RequestConfig requestConfig36 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig34);
        requestConfig0.setSocketTimeout((int) '4');
        com.anitech.resting.http.request.RequestConfig requestConfig39 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig40 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig41 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig39, requestConfig40);
        com.anitech.resting.http.request.RequestConfig requestConfig42 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig43 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig44 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig42, requestConfig43);
        requestConfig43.setConnectTimeout(10);
        com.anitech.resting.http.request.RequestConfig requestConfig47 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig41, requestConfig43);
        com.anitech.resting.http.request.RequestConfig requestConfig48 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig47);
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertNotNull(requestConfig22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Name: application/xml, Value: " + "'", str27, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig33);
        org.junit.Assert.assertNotNull(requestConfig34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(requestConfig36);
        org.junit.Assert.assertNotNull(requestConfig39);
        org.junit.Assert.assertNotNull(requestConfig40);
        org.junit.Assert.assertNotNull(requestConfig41);
        org.junit.Assert.assertNotNull(requestConfig42);
        org.junit.Assert.assertNotNull(requestConfig43);
        org.junit.Assert.assertNotNull(requestConfig44);
        org.junit.Assert.assertNotNull(requestConfig47);
        org.junit.Assert.assertNotNull(requestConfig48);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = new com.anitech.resting.http.Header[] {};
        requestConfig0.setHeaders(headerArray3);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        requestConfig0.setConnectTimeout((int) ' ');
        requestConfig0.setSocketTimeout(0);
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig13);
        com.anitech.resting.http.Header[] headerArray15 = new com.anitech.resting.http.Header[] {};
        requestConfig12.setHeaders(headerArray15);
        requestConfig0.setHeaders(headerArray15);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(headerArray15);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.lang.Throwable throwable2 = null;
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException(throwable2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException3);
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException3);
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException("application/xml", (java.lang.Throwable) restingException3);
        java.lang.String str7 = restingException6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.anitech.resting.exception.RestingException: application/xml" + "'", str7, "com.anitech.resting.exception.RestingException: application/xml");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        java.lang.String str11 = header7.getValue();
        java.lang.String str12 = header7.getValue();
        java.lang.String str13 = header7.toString();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig15.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig14, requestConfig15);
        com.anitech.resting.http.Header header21 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str22 = header21.getValue();
        java.lang.String str23 = header21.toString();
        requestConfig15.addHeader(header21);
        com.anitech.resting.http.request.RequestConfig requestConfig25 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig26 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig26.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig29 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig25, requestConfig26);
        com.anitech.resting.http.request.RequestConfig requestConfig30 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig15, requestConfig25);
        int int31 = requestConfig30.getSocketTimeout();
        org.apache.http.entity.StringEntity stringEntity32 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) str13, requestConfig30);
        int int33 = requestConfig30.getConnectTimeout();
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Name: application/xml, Value: " + "'", str13, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Name: application/xml, Value: " + "'", str23, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig29);
        org.junit.Assert.assertNotNull(requestConfig30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(stringEntity32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.lang.Throwable throwable1 = null;
        com.anitech.resting.exception.RestingException restingException2 = new com.anitech.resting.exception.RestingException(throwable1);
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException("Name: application/xml, Value: ", (java.lang.Throwable) restingException3);
        java.lang.Throwable[] throwableArray5 = restingException3.getSuppressed();
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException3);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig0.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header4 = requestConfig0.getHeader("hi!");
        requestConfig0.setSocketTimeout((int) ' ');
        requestConfig0.setConnectTimeout(0);
        org.junit.Assert.assertNull(header4);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("", "application/xml");
        java.lang.String str3 = header2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.lang.Throwable throwable0 = null;
        com.anitech.resting.exception.RestingException restingException1 = new com.anitech.resting.exception.RestingException(throwable0);
        com.anitech.resting.exception.RestingException restingException2 = new com.anitech.resting.exception.RestingException();
        java.lang.Throwable throwable3 = null;
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException(throwable3);
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException4);
        restingException2.addSuppressed((java.lang.Throwable) restingException5);
        restingException1.addSuppressed((java.lang.Throwable) restingException2);
        java.lang.Throwable throwable9 = null;
        com.anitech.resting.exception.RestingException restingException10 = new com.anitech.resting.exception.RestingException(throwable9);
        com.anitech.resting.exception.RestingException restingException11 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException10);
        restingException1.addSuppressed((java.lang.Throwable) restingException10);
        com.anitech.resting.exception.RestingException restingException13 = new com.anitech.resting.exception.RestingException();
        java.lang.Throwable[] throwableArray14 = restingException13.getSuppressed();
        restingException1.addSuppressed((java.lang.Throwable) restingException13);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.http.request.RequestConfig requestConfig8 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig9.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        requestConfig8.setHeaders(headerArray12);
        int int14 = requestConfig8.getSocketTimeout();
        requestConfig8.setConnectTimeout((int) (short) -1);
        com.anitech.resting.Resting resting17 = resting7.globalRequestConfig(requestConfig8);
        com.anitech.resting.Resting resting18 = resting17.enableMetrics();
        com.anitech.resting.Resting resting20 = resting18.baseURI("Name: , Value: application/xml");
        com.anitech.resting.Resting resting21 = resting20.enableProcessingHooks();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig24 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig24.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig27 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig23, requestConfig24);
        int int28 = requestConfig23.getSocketTimeout();
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse29 = resting20.DELETE("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", requestConfig23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 5: Name: , Value: application/xmlcom.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(resting17);
        org.junit.Assert.assertNotNull(resting18);
        org.junit.Assert.assertNotNull(resting20);
        org.junit.Assert.assertNotNull(resting21);
        org.junit.Assert.assertNotNull(requestConfig27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        requestConfig6.setConnectTimeout((int) 'a');
        com.anitech.resting.Resting resting9 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting11 = resting5.baseURI("application/xml");
        com.anitech.resting.Resting resting12 = resting11.enableProcessingHooks();
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(resting11);
        org.junit.Assert.assertNotNull(resting12);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header5 = requestConfig1.getHeader("hi!");
        org.apache.http.entity.StringEntity stringEntity6 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) "Name: , Value: application/xml", requestConfig1);
        com.anitech.resting.http.Header header8 = requestConfig1.getHeader("");
        com.anitech.resting.http.Header[] headerArray9 = requestConfig1.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig10 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig10, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig13, requestConfig14);
        requestConfig14.setConnectTimeout(10);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig14);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig18);
        int int20 = requestConfig19.getSocketTimeout();
        org.junit.Assert.assertNull(header5);
        org.junit.Assert.assertNotNull(stringEntity6);
        org.junit.Assert.assertNull(header8);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertNotNull(requestConfig10);
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("", "");
        java.lang.Object obj3 = header2.clone();
        java.lang.String str4 = header2.getValue();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "Name: , Value: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "Name: , Value: ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "Name: , Value: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.Header[] headerArray14 = new com.anitech.resting.http.Header[] {};
        requestConfig11.setHeaders(headerArray14);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig20 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig19, requestConfig20);
        com.anitech.resting.http.Header[] headerArray22 = requestConfig20.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig23.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header27 = requestConfig23.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig28 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig20, requestConfig23);
        com.anitech.resting.http.request.RequestConfig requestConfig29 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig28);
        com.anitech.resting.http.Header[] headerArray30 = requestConfig29.getHeaders();
        org.apache.http.Header[] headerArray31 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray30);
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(requestConfig20);
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertNull(header27);
        org.junit.Assert.assertNotNull(requestConfig28);
        org.junit.Assert.assertNotNull(requestConfig29);
        org.junit.Assert.assertNotNull(headerArray30);
        org.junit.Assert.assertNotNull(headerArray31);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig17 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.Header[] headerArray18 = requestConfig17.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig16, requestConfig17);
        com.anitech.resting.http.request.RequestConfig requestConfig20 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig20.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray23 = requestConfig20.getHeaders();
        requestConfig19.setHeaders(headerArray23);
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(headerArray23);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.http.request.RequestConfig requestConfig8 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig9.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        requestConfig8.setHeaders(headerArray12);
        int int14 = requestConfig8.getSocketTimeout();
        requestConfig8.setConnectTimeout((int) (short) -1);
        com.anitech.resting.Resting resting17 = resting7.globalRequestConfig(requestConfig8);
        com.anitech.resting.Resting resting18 = resting17.enableMetrics();
        com.anitech.resting.http.Header header22 = new com.anitech.resting.http.Header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse23 = resting18.POST("Name: , Value: application/xml", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: application/xmlName: , Value: application/xml");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(resting17);
        org.junit.Assert.assertNotNull(resting18);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("application/xml", "com.anitech.resting.exception.RestingException: application/json");
        java.lang.Object obj3 = header2.clone();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "Name: application/xml, Value: com.anitech.resting.exception.RestingException: application/json");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "Name: application/xml, Value: com.anitech.resting.exception.RestingException: application/json");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "Name: application/xml, Value: com.anitech.resting.exception.RestingException: application/json");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.lang.Throwable throwable1 = null;
        com.anitech.resting.exception.RestingException restingException2 = new com.anitech.resting.exception.RestingException(throwable1);
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException("Name: application/xml, Value: ", (java.lang.Throwable) restingException3);
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException4);
        java.lang.Throwable throwable8 = null;
        com.anitech.resting.exception.RestingException restingException9 = new com.anitech.resting.exception.RestingException(throwable8);
        com.anitech.resting.exception.RestingException restingException10 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException9);
        com.anitech.resting.exception.RestingException restingException11 = new com.anitech.resting.exception.RestingException("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", (java.lang.Throwable) restingException9);
        restingException5.addSuppressed((java.lang.Throwable) restingException11);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.Header[] headerArray1 = requestConfig0.getHeaders();
        org.apache.http.Header[] headerArray2 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray1);
        org.junit.Assert.assertNotNull(headerArray1);
        org.junit.Assert.assertNotNull(headerArray2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig1);
        java.lang.Class<?> wildcardClass12 = requestConfig1.getClass();
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = requestConfig1.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig4 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig4.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header8 = requestConfig4.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig4);
        requestConfig9.setSocketTimeout((int) '#');
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNull(header8);
        org.junit.Assert.assertNotNull(requestConfig9);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = new com.anitech.resting.http.Header[] {};
        requestConfig0.setHeaders(headerArray3);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig0);
        requestConfig0.setConnectTimeout((int) ' ');
        requestConfig0.setSocketTimeout(0);
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig13);
        com.anitech.resting.http.Header[] headerArray15 = new com.anitech.resting.http.Header[] {};
        requestConfig12.setHeaders(headerArray15);
        requestConfig0.setHeaders(headerArray15);
        // The following exception was thrown during execution in test generation
        try {
            requestConfig0.addHeader("application/xml", "Name: , Value: application/xml");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(headerArray15);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.Header[] headerArray17 = requestConfig16.getHeaders();
        com.anitech.resting.http.Header[] headerArray18 = requestConfig16.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig19 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig19);
        com.anitech.resting.http.Header[] headerArray21 = requestConfig19.getHeaders();
        org.apache.http.Header[] headerArray22 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray21);
        requestConfig16.setHeaders(headerArray21);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig16);
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertNotNull(headerArray22);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header5 = requestConfig1.getHeader("hi!");
        org.apache.http.entity.StringEntity stringEntity6 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) "Name: , Value: application/xml", requestConfig1);
        com.anitech.resting.http.Header header8 = requestConfig1.getHeader("");
        com.anitech.resting.http.Header[] headerArray9 = requestConfig1.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig10 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig11.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig10, requestConfig11);
        com.anitech.resting.http.Header header17 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str18 = header17.getValue();
        java.lang.String str19 = header17.toString();
        requestConfig11.addHeader(header17);
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig22 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig21, requestConfig22);
        com.anitech.resting.http.Header[] headerArray24 = new com.anitech.resting.http.Header[] {};
        requestConfig21.setHeaders(headerArray24);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig21);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig21);
        com.anitech.resting.http.request.RequestConfig requestConfig28 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig21);
        com.anitech.resting.http.request.RequestConfig requestConfig29 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig30 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig31 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig29, requestConfig30);
        com.anitech.resting.http.Header[] headerArray32 = requestConfig30.getHeaders();
        requestConfig21.setHeaders(headerArray32);
        org.apache.http.Header[] headerArray34 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray32);
        requestConfig1.setHeaders(headerArray32);
        org.junit.Assert.assertNull(header5);
        org.junit.Assert.assertNotNull(stringEntity6);
        org.junit.Assert.assertNull(header8);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Name: application/xml, Value: " + "'", str19, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertNotNull(requestConfig22);
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertNotNull(requestConfig28);
        org.junit.Assert.assertNotNull(requestConfig29);
        org.junit.Assert.assertNotNull(requestConfig30);
        org.junit.Assert.assertNotNull(requestConfig31);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertNotNull(headerArray34);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.apache.http.HttpResponse httpResponse0 = null;
        com.anitech.resting.http.response.RestingResponse restingResponse1 = new com.anitech.resting.http.response.RestingResponse(httpResponse0);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.Header[] headerArray3 = restingResponse1.getHeaders("com.anitech.resting.exception.RestingException: application/json");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str8 = header7.getValue();
        java.lang.String str9 = header7.toString();
        requestConfig1.addHeader(header7);
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig12.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig11, requestConfig12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig11);
        com.anitech.resting.http.Header[] headerArray17 = requestConfig16.getHeaders();
        requestConfig16.setSocketTimeout((int) (short) 10);
        int int20 = requestConfig16.getSocketTimeout();
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Name: application/xml, Value: " + "'", str9, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.Resting resting10 = resting8.baseURI("");
        com.anitech.resting.Resting resting11 = resting8.enableMetrics();
        com.anitech.resting.Resting resting13 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig14, requestConfig15);
        com.anitech.resting.http.Header[] headerArray17 = requestConfig15.getHeaders();
        com.anitech.resting.Resting resting18 = resting13.globalRequestConfig(requestConfig15);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting20 = resting18.globalRequestConfig(requestConfig19);
        com.anitech.resting.Resting resting21 = resting18.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig22 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig23.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig26 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig22, requestConfig23);
        com.anitech.resting.http.Header header29 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str30 = header29.getValue();
        java.lang.String str31 = header29.toString();
        requestConfig23.addHeader(header29);
        com.anitech.resting.http.request.RequestConfig requestConfig33 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig34 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig34.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig37 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig33, requestConfig34);
        com.anitech.resting.http.request.RequestConfig requestConfig38 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig23, requestConfig33);
        int int39 = requestConfig38.getSocketTimeout();
        com.anitech.resting.Resting resting40 = resting21.globalRequestConfig(requestConfig38);
        com.anitech.resting.http.request.RequestConfig requestConfig41 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig42 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig43 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig41, requestConfig42);
        com.anitech.resting.http.Header[] headerArray44 = new com.anitech.resting.http.Header[] {};
        requestConfig41.setHeaders(headerArray44);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig41);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig41);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig41);
        requestConfig41.setConnectTimeout((int) ' ');
        requestConfig41.setSocketTimeout(0);
        com.anitech.resting.http.request.RequestConfig requestConfig53 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig54 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig55 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig53, requestConfig54);
        com.anitech.resting.http.Header[] headerArray56 = new com.anitech.resting.http.Header[] {};
        requestConfig53.setHeaders(headerArray56);
        requestConfig41.setHeaders(headerArray56);
        com.anitech.resting.http.request.RequestConfig requestConfig59 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig60 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig60.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig63 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig59, requestConfig60);
        com.anitech.resting.http.Header header66 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str67 = header66.getValue();
        java.lang.String str68 = header66.toString();
        requestConfig60.addHeader(header66);
        com.anitech.resting.http.request.RequestConfig requestConfig70 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig71 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig71.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig74 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig70, requestConfig71);
        com.anitech.resting.http.request.RequestConfig requestConfig75 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig60, requestConfig70);
        int int76 = requestConfig75.getSocketTimeout();
        com.anitech.resting.http.request.RequestConfig requestConfig77 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig41, requestConfig75);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse78 = resting11.POST("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/json", (java.lang.Object) requestConfig38, requestConfig77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/json");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(resting10);
        org.junit.Assert.assertNotNull(resting11);
        org.junit.Assert.assertNotNull(resting13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertNotNull(resting18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(resting20);
        org.junit.Assert.assertNotNull(resting21);
        org.junit.Assert.assertNotNull(requestConfig26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Name: application/xml, Value: " + "'", str31, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig37);
        org.junit.Assert.assertNotNull(requestConfig38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(resting40);
        org.junit.Assert.assertNotNull(requestConfig41);
        org.junit.Assert.assertNotNull(requestConfig42);
        org.junit.Assert.assertNotNull(requestConfig43);
        org.junit.Assert.assertNotNull(headerArray44);
        org.junit.Assert.assertNotNull(requestConfig53);
        org.junit.Assert.assertNotNull(requestConfig54);
        org.junit.Assert.assertNotNull(requestConfig55);
        org.junit.Assert.assertNotNull(headerArray56);
        org.junit.Assert.assertNotNull(requestConfig63);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Name: application/xml, Value: " + "'", str68, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig74);
        org.junit.Assert.assertNotNull(requestConfig75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(requestConfig77);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header5 = requestConfig1.getHeader("hi!");
        org.apache.http.entity.StringEntity stringEntity6 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) "Name: , Value: application/xml", requestConfig1);
        com.anitech.resting.http.Header header8 = requestConfig1.getHeader("");
        com.anitech.resting.http.Header[] headerArray9 = requestConfig1.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig10 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig10, requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig13 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig13, requestConfig14);
        requestConfig14.setConnectTimeout(10);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig14);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig18);
        int int20 = requestConfig1.getSocketTimeout();
        org.junit.Assert.assertNull(header5);
        org.junit.Assert.assertNotNull(stringEntity6);
        org.junit.Assert.assertNull(header8);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertNotNull(requestConfig10);
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(requestConfig13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header header7 = new com.anitech.resting.http.Header("application/xml", "com.anitech.resting.exception.RestingException: application/json");
        // The following exception was thrown during execution in test generation
        try {
            requestConfig0.addHeader(header7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig4);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.Resting resting10 = resting8.baseURI("");
        com.anitech.resting.Resting resting11 = resting8.enableMetrics();
        com.anitech.resting.Resting resting13 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig14 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig14, requestConfig15);
        com.anitech.resting.http.Header[] headerArray17 = requestConfig15.getHeaders();
        com.anitech.resting.Resting resting18 = resting13.globalRequestConfig(requestConfig15);
        com.anitech.resting.http.request.RequestConfig requestConfig19 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting20 = resting18.globalRequestConfig(requestConfig19);
        com.anitech.resting.Resting resting21 = resting18.enableMetrics();
        com.anitech.resting.Resting resting23 = resting18.baseURI("application/xml");
        com.anitech.resting.http.request.RequestConfig requestConfig24 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig25 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig25.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig28 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig24, requestConfig25);
        com.anitech.resting.http.Header header31 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str32 = header31.getValue();
        java.lang.String str33 = header31.toString();
        requestConfig25.addHeader(header31);
        com.anitech.resting.http.Header header36 = requestConfig25.getHeader("request");
        requestConfig25.setConnectTimeout((int) (short) 100);
        requestConfig25.setConnectTimeout(100);
        com.anitech.resting.Resting resting41 = resting18.globalRequestConfig(requestConfig25);
        com.anitech.resting.Resting resting42 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig43 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig44 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig45 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig43, requestConfig44);
        com.anitech.resting.http.Header[] headerArray46 = requestConfig44.getHeaders();
        com.anitech.resting.Resting resting47 = resting42.globalRequestConfig(requestConfig44);
        com.anitech.resting.http.request.RequestConfig requestConfig48 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting49 = resting47.globalRequestConfig(requestConfig48);
        com.anitech.resting.Resting resting50 = resting47.enableMetrics();
        com.anitech.resting.Resting resting52 = resting47.baseURI("application/xml");
        com.anitech.resting.http.request.RequestConfig requestConfig53 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig54 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig54.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig57 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig53, requestConfig54);
        com.anitech.resting.http.Header header60 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str61 = header60.getValue();
        java.lang.String str62 = header60.toString();
        requestConfig54.addHeader(header60);
        com.anitech.resting.http.Header header65 = requestConfig54.getHeader("request");
        requestConfig54.setConnectTimeout((int) (short) 100);
        requestConfig54.setConnectTimeout(100);
        com.anitech.resting.Resting resting70 = resting47.globalRequestConfig(requestConfig54);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig54);
        com.anitech.resting.http.Header header73 = requestConfig54.getHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse74 = resting11.PUT("hi!", (java.lang.Object) resting18, requestConfig54);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
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
        org.junit.Assert.assertNotNull(resting10);
        org.junit.Assert.assertNotNull(resting11);
        org.junit.Assert.assertNotNull(resting13);
        org.junit.Assert.assertNotNull(requestConfig14);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertNotNull(resting18);
        org.junit.Assert.assertNotNull(requestConfig19);
        org.junit.Assert.assertNotNull(resting20);
        org.junit.Assert.assertNotNull(resting21);
        org.junit.Assert.assertNotNull(resting23);
        org.junit.Assert.assertNotNull(requestConfig28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Name: application/xml, Value: " + "'", str33, "Name: application/xml, Value: ");
        org.junit.Assert.assertNull(header36);
        org.junit.Assert.assertNotNull(resting41);
        org.junit.Assert.assertNotNull(resting42);
        org.junit.Assert.assertNotNull(requestConfig43);
        org.junit.Assert.assertNotNull(requestConfig44);
        org.junit.Assert.assertNotNull(requestConfig45);
        org.junit.Assert.assertNotNull(headerArray46);
        org.junit.Assert.assertNotNull(resting47);
        org.junit.Assert.assertNotNull(requestConfig48);
        org.junit.Assert.assertNotNull(resting49);
        org.junit.Assert.assertNotNull(resting50);
        org.junit.Assert.assertNotNull(resting52);
        org.junit.Assert.assertNotNull(requestConfig57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Name: application/xml, Value: " + "'", str62, "Name: application/xml, Value: ");
        org.junit.Assert.assertNull(header65);
        org.junit.Assert.assertNotNull(resting70);
        org.junit.Assert.assertNull(header73);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.Header header7 = requestConfig2.getHeader("com.anitech.resting.exception.RestingException: hi!");
        com.anitech.resting.http.Header header9 = requestConfig2.getHeader("Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNull(header7);
        org.junit.Assert.assertNull(header9);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig5 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig4, requestConfig5);
        requestConfig5.setConnectTimeout(10);
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig3, requestConfig5);
        com.anitech.resting.http.Header header11 = requestConfig5.getHeader("");
        requestConfig5.setSocketTimeout((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.http.entity.StringEntity stringEntity14 = com.anitech.resting.http.request.RequestDataMassager.massageRequestData((java.lang.Object) 1.0d, requestConfig5);
            org.junit.Assert.fail("Expected exception of type com.anitech.resting.exception.RestingException; message: Unparseable data format found in inputs!");
        } catch (com.anitech.resting.exception.RestingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertNotNull(requestConfig5);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertNotNull(requestConfig9);
        org.junit.Assert.assertNull(header11);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.http.request.RequestConfig requestConfig8 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig9.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        requestConfig8.setHeaders(headerArray12);
        int int14 = requestConfig8.getSocketTimeout();
        requestConfig8.setConnectTimeout((int) (short) -1);
        com.anitech.resting.Resting resting17 = resting7.globalRequestConfig(requestConfig8);
        com.anitech.resting.Resting resting18 = resting17.enableMetrics();
        com.anitech.resting.Resting resting20 = resting18.baseURI("Name: , Value: application/xml");
        com.anitech.resting.Resting resting21 = resting20.enableProcessingHooks();
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig25 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig23, requestConfig24);
        com.anitech.resting.http.Header[] headerArray26 = new com.anitech.resting.http.Header[] {};
        requestConfig23.setHeaders(headerArray26);
        com.anitech.resting.http.request.RequestConfig requestConfig28 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig29 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig29.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray32 = requestConfig29.getHeaders();
        requestConfig28.setHeaders(headerArray32);
        org.apache.http.Header[] headerArray34 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray32);
        requestConfig23.setHeaders(headerArray32);
        requestConfig23.setConnectTimeout((-1));
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse38 = resting21.GET("com.anitech.resting.exception.RestingException: hi!", requestConfig23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 5: Name: , Value: application/xmlcom.anitech.resting.exception.RestingException: hi!");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(resting17);
        org.junit.Assert.assertNotNull(resting18);
        org.junit.Assert.assertNotNull(resting20);
        org.junit.Assert.assertNotNull(resting21);
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertNotNull(requestConfig25);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertNotNull(headerArray34);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str3 = header2.toString();
        java.lang.String str4 = header2.toString();
        java.lang.String str5 = header2.getValue();
        java.lang.String str6 = header2.getName();
        java.lang.String str7 = header2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Name: application/xml, Value: " + "'", str3, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Name: application/xml, Value: " + "'", str4, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "application/xml" + "'", str6, "application/xml");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "application/xml" + "'", str7, "application/xml");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.Header[] headerArray1 = requestConfig0.getHeaders();
        requestConfig0.setConnectTimeout((int) (byte) 1);
        requestConfig0.setSocketTimeout(1);
        org.junit.Assert.assertNotNull(headerArray1);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.request.RequestConfig requestConfig5 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig6 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig6.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig5, requestConfig6);
        com.anitech.resting.http.Header header12 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str13 = header12.getValue();
        java.lang.String str14 = header12.toString();
        requestConfig6.addHeader(header12);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig17 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig16, requestConfig17);
        com.anitech.resting.http.Header[] headerArray19 = new com.anitech.resting.http.Header[] {};
        requestConfig16.setHeaders(headerArray19);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig16);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig16);
        com.anitech.resting.http.request.RequestConfig requestConfig23 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig6, requestConfig16);
        com.anitech.resting.http.request.RequestConfig requestConfig24 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig16);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig24);
        int int26 = requestConfig24.getConnectTimeout();
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig24);
        com.anitech.resting.http.Header header29 = requestConfig24.getHeader("request");
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertNotNull(requestConfig9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Name: application/xml, Value: " + "'", str14, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertNotNull(requestConfig17);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertNotNull(requestConfig23);
        org.junit.Assert.assertNotNull(requestConfig24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(header29);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.lang.Throwable throwable2 = null;
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException(throwable2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException3);
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException3);
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException("application/xml", (java.lang.Throwable) restingException3);
        com.anitech.resting.exception.RestingException restingException7 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException6);
        java.lang.String str8 = restingException7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/xml" + "'", str8, "com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/xml");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.Resting resting1 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig4 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig2, requestConfig3);
        com.anitech.resting.http.Header[] headerArray5 = requestConfig3.getHeaders();
        com.anitech.resting.Resting resting6 = resting1.globalRequestConfig(requestConfig3);
        com.anitech.resting.http.request.RequestConfig requestConfig7 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting8 = resting6.globalRequestConfig(requestConfig7);
        com.anitech.resting.Resting resting9 = resting6.enableMetrics();
        com.anitech.resting.Resting resting11 = resting6.baseURI("application/xml");
        com.anitech.resting.http.request.RequestConfig requestConfig12 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig13 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig13.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig12, requestConfig13);
        com.anitech.resting.http.Header header19 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str20 = header19.getValue();
        java.lang.String str21 = header19.toString();
        requestConfig13.addHeader(header19);
        com.anitech.resting.http.Header header24 = requestConfig13.getHeader("request");
        requestConfig13.setConnectTimeout((int) (short) 100);
        requestConfig13.setConnectTimeout(100);
        com.anitech.resting.Resting resting29 = resting6.globalRequestConfig(requestConfig13);
        com.anitech.resting.Resting.setGlobalRequestConfig(requestConfig13);
        com.anitech.resting.http.Header header32 = requestConfig13.getHeader("hi!");
        com.anitech.resting.Resting resting33 = resting0.globalRequestConfig(requestConfig13);
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(resting1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(requestConfig4);
        org.junit.Assert.assertNotNull(headerArray5);
        org.junit.Assert.assertNotNull(resting6);
        org.junit.Assert.assertNotNull(requestConfig7);
        org.junit.Assert.assertNotNull(resting8);
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(resting11);
        org.junit.Assert.assertNotNull(requestConfig16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Name: application/xml, Value: " + "'", str21, "Name: application/xml, Value: ");
        org.junit.Assert.assertNull(header24);
        org.junit.Assert.assertNotNull(resting29);
        org.junit.Assert.assertNull(header32);
        org.junit.Assert.assertNotNull(resting33);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.lang.Throwable throwable3 = null;
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException(throwable3);
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException4);
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException("Name: application/xml, Value: ", (java.lang.Throwable) restingException5);
        com.anitech.resting.exception.RestingException restingException7 = new com.anitech.resting.exception.RestingException("application/xml", (java.lang.Throwable) restingException5);
        com.anitech.resting.exception.RestingException restingException8 = new com.anitech.resting.exception.RestingException("request", (java.lang.Throwable) restingException7);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.anitech.resting.http.Header header2 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str3 = header2.getValue();
        java.lang.String str4 = header2.getValue();
        java.lang.String str5 = header2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "application/xml" + "'", str5, "application/xml");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig1.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig1.getHeaders();
        requestConfig0.setHeaders(headerArray4);
        int int6 = requestConfig0.getSocketTimeout();
        requestConfig0.setConnectTimeout((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            requestConfig0.addHeader("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/xml", "request");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.anitech.resting.exception.RestingException restingException1 = new com.anitech.resting.exception.RestingException("application/xml");
        java.lang.String str2 = restingException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.anitech.resting.exception.RestingException: application/xml" + "'", str2, "com.anitech.resting.exception.RestingException: application/xml");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
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
        com.anitech.resting.http.Header[] headerArray12 = requestConfig9.getHeaders();
        com.anitech.resting.Resting resting13 = resting8.globalRequestConfig(requestConfig9);
        com.anitech.resting.http.request.RequestConfig requestConfig14 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig15 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig15.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig18 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig14, requestConfig15);
        com.anitech.resting.http.Header header21 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str22 = header21.getValue();
        java.lang.String str23 = header21.toString();
        requestConfig15.addHeader(header21);
        com.anitech.resting.http.Header header26 = requestConfig15.getHeader("request");
        com.anitech.resting.http.Header header29 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str30 = header29.toString();
        com.anitech.resting.http.Header header33 = new com.anitech.resting.http.Header("", "application/xml");
        java.lang.String str34 = header33.toString();
        com.anitech.resting.http.Header[] headerArray35 = new com.anitech.resting.http.Header[] { header29, header33 };
        requestConfig15.setHeaders(headerArray35);
        requestConfig15.setSocketTimeout(10);
        com.anitech.resting.Resting resting39 = resting8.globalRequestConfig(requestConfig15);
        com.anitech.resting.http.request.RequestConfig requestConfig41 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig41.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header45 = requestConfig41.getHeader("hi!");
        requestConfig41.setSocketTimeout((int) ' ');
        int int48 = requestConfig41.getSocketTimeout();
        com.anitech.resting.http.request.RequestConfig requestConfig49 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig50 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig51 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig49, requestConfig50);
        com.anitech.resting.http.request.RequestConfig requestConfig52 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig53 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig54 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig52, requestConfig53);
        requestConfig53.setConnectTimeout(10);
        com.anitech.resting.http.request.RequestConfig requestConfig57 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig51, requestConfig53);
        com.anitech.resting.http.Header header59 = requestConfig53.getHeader("");
        requestConfig53.setSocketTimeout((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse62 = resting39.POST("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/xml", (java.lang.Object) int48, requestConfig53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 62: application/xmlcom.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException: application/xml");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertNotNull(resting13);
        org.junit.Assert.assertNotNull(requestConfig18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Name: application/xml, Value: " + "'", str23, "Name: application/xml, Value: ");
        org.junit.Assert.assertNull(header26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Name: application/xml, Value: " + "'", str30, "Name: application/xml, Value: ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Name: , Value: application/xml" + "'", str34, "Name: , Value: application/xml");
        org.junit.Assert.assertNotNull(headerArray35);
        org.junit.Assert.assertNotNull(resting39);
        org.junit.Assert.assertNull(header45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 32 + "'", int48 == 32);
        org.junit.Assert.assertNotNull(requestConfig49);
        org.junit.Assert.assertNotNull(requestConfig50);
        org.junit.Assert.assertNotNull(requestConfig51);
        org.junit.Assert.assertNotNull(requestConfig52);
        org.junit.Assert.assertNotNull(requestConfig53);
        org.junit.Assert.assertNotNull(requestConfig54);
        org.junit.Assert.assertNotNull(requestConfig57);
        org.junit.Assert.assertNull(header59);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.anitech.resting.http.request.RequestConfig requestConfig0 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig0, requestConfig1);
        com.anitech.resting.http.Header[] headerArray3 = new com.anitech.resting.http.Header[] {};
        requestConfig0.setHeaders(headerArray3);
        com.anitech.resting.http.request.RequestConfig requestConfig5 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig6 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig6.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header[] headerArray9 = requestConfig6.getHeaders();
        requestConfig5.setHeaders(headerArray9);
        org.apache.http.Header[] headerArray11 = com.anitech.resting.util.RestingUtil.getHeadersFromRequest(headerArray9);
        requestConfig0.setHeaders(headerArray9);
        int int13 = requestConfig0.getSocketTimeout();
        org.junit.Assert.assertNotNull(requestConfig0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting8 = resting5.enableMetrics();
        com.anitech.resting.Resting resting10 = resting8.baseURI("");
        com.anitech.resting.Resting resting11 = resting8.enableMetrics();
        com.anitech.resting.Resting resting13 = resting11.baseURI("hi!");
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(requestConfig1);
        org.junit.Assert.assertNotNull(requestConfig2);
        org.junit.Assert.assertNotNull(requestConfig3);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertNotNull(resting5);
        org.junit.Assert.assertNotNull(requestConfig6);
        org.junit.Assert.assertNotNull(resting7);
        org.junit.Assert.assertNotNull(resting8);
        org.junit.Assert.assertNotNull(resting10);
        org.junit.Assert.assertNotNull(resting11);
        org.junit.Assert.assertNotNull(resting13);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        java.lang.Throwable throwable2 = null;
        com.anitech.resting.exception.RestingException restingException3 = new com.anitech.resting.exception.RestingException(throwable2);
        com.anitech.resting.exception.RestingException restingException4 = new com.anitech.resting.exception.RestingException("hi!", (java.lang.Throwable) restingException3);
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException("com.anitech.resting.exception.RestingException: com.anitech.resting.exception.RestingException", (java.lang.Throwable) restingException3);
        java.lang.Throwable[] throwableArray6 = restingException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.Resting resting1 = resting0.enableMetrics();
        com.anitech.resting.Resting resting2 = resting0.enableMetrics();
        com.anitech.resting.exception.RestingException restingException5 = new com.anitech.resting.exception.RestingException("application/json");
        com.anitech.resting.exception.RestingException restingException6 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException5);
        com.anitech.resting.http.request.RequestConfig requestConfig7 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig8 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig9 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig7, requestConfig8);
        com.anitech.resting.http.Header[] headerArray10 = requestConfig8.getHeaders();
        com.anitech.resting.http.request.RequestConfig requestConfig11 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig11.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header15 = requestConfig11.getHeader("hi!");
        com.anitech.resting.http.request.RequestConfig requestConfig16 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig8, requestConfig11);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse17 = resting2.PUT("Name: , Value: application/xml", (java.lang.Object) restingException6, requestConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 2: hi!Name: , Value: application/xml");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resting0);
        org.junit.Assert.assertNotNull(resting1);
        org.junit.Assert.assertNotNull(resting2);
        org.junit.Assert.assertNotNull(requestConfig7);
        org.junit.Assert.assertNotNull(requestConfig8);
        org.junit.Assert.assertNotNull(requestConfig9);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertNull(header15);
        org.junit.Assert.assertNotNull(requestConfig16);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
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
        com.anitech.resting.http.request.RequestConfig requestConfig17 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig18 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig18.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig21 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig17, requestConfig18);
        com.anitech.resting.http.Header header24 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str25 = header24.getValue();
        java.lang.String str26 = header24.toString();
        requestConfig18.addHeader(header24);
        com.anitech.resting.http.request.RequestConfig requestConfig28 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig29 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig29.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig32 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig28, requestConfig29);
        com.anitech.resting.http.request.RequestConfig requestConfig33 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig18, requestConfig28);
        com.anitech.resting.http.request.RequestConfig requestConfig34 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig9, requestConfig28);
        com.anitech.resting.http.request.RequestConfig requestConfig35 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig35.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header39 = requestConfig35.getHeader("hi!");
        requestConfig35.setSocketTimeout((int) ' ');
        com.anitech.resting.http.request.RequestConfig requestConfig42 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig28, requestConfig35);
        int int43 = requestConfig42.getSocketTimeout();
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
        org.junit.Assert.assertNotNull(requestConfig21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Name: application/xml, Value: " + "'", str26, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig32);
        org.junit.Assert.assertNotNull(requestConfig33);
        org.junit.Assert.assertNotNull(requestConfig34);
        org.junit.Assert.assertNull(header39);
        org.junit.Assert.assertNotNull(requestConfig42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.anitech.resting.Resting.setBaseURI("com.anitech.resting.exception.RestingException: request");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.anitech.resting.Resting resting0 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig1 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig2 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig3 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig1, requestConfig2);
        com.anitech.resting.http.Header[] headerArray4 = requestConfig2.getHeaders();
        com.anitech.resting.Resting resting5 = resting0.globalRequestConfig(requestConfig2);
        com.anitech.resting.http.request.RequestConfig requestConfig6 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting7 = resting5.globalRequestConfig(requestConfig6);
        com.anitech.resting.Resting resting9 = com.anitech.resting.Resting.getInstance();
        com.anitech.resting.http.request.RequestConfig requestConfig10 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig11 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig12 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig10, requestConfig11);
        com.anitech.resting.http.Header[] headerArray13 = requestConfig11.getHeaders();
        com.anitech.resting.Resting resting14 = resting9.globalRequestConfig(requestConfig11);
        com.anitech.resting.http.request.RequestConfig requestConfig15 = com.anitech.resting.util.RestingUtil.getDefaultRequestConfig();
        com.anitech.resting.Resting resting16 = resting14.globalRequestConfig(requestConfig15);
        com.anitech.resting.Resting resting17 = resting14.enableMetrics();
        com.anitech.resting.http.request.RequestConfig requestConfig18 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig18.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.Header header22 = requestConfig18.getHeader("hi!");
        requestConfig18.setSocketTimeout((int) ' ');
        com.anitech.resting.Resting resting25 = resting17.globalRequestConfig(requestConfig18);
        com.anitech.resting.http.request.RequestConfig requestConfig26 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig27 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig27.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig30 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig26, requestConfig27);
        com.anitech.resting.http.Header header33 = new com.anitech.resting.http.Header("application/xml", "");
        java.lang.String str34 = header33.getValue();
        java.lang.String str35 = header33.toString();
        requestConfig27.addHeader(header33);
        com.anitech.resting.http.request.RequestConfig requestConfig37 = new com.anitech.resting.http.request.RequestConfig();
        com.anitech.resting.http.request.RequestConfig requestConfig38 = new com.anitech.resting.http.request.RequestConfig();
        requestConfig38.setConnectTimeout((int) (byte) 0);
        com.anitech.resting.http.request.RequestConfig requestConfig41 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig37, requestConfig38);
        com.anitech.resting.http.request.RequestConfig requestConfig42 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig27, requestConfig37);
        com.anitech.resting.http.request.RequestConfig requestConfig43 = com.anitech.resting.util.RestingUtil.overrideGlobalRequestConfig(requestConfig18, requestConfig37);
        // The following exception was thrown during execution in test generation
        try {
            com.anitech.resting.http.response.RestingResponse restingResponse44 = resting5.GET("com.anitech.resting.exception.RestingException: hi!", requestConfig43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in opaque part at index 47: com.anitech.resting.exception.RestingException: requestcom.anitech.resting.exception.RestingException: hi!");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(resting9);
        org.junit.Assert.assertNotNull(requestConfig10);
        org.junit.Assert.assertNotNull(requestConfig11);
        org.junit.Assert.assertNotNull(requestConfig12);
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertNotNull(resting14);
        org.junit.Assert.assertNotNull(requestConfig15);
        org.junit.Assert.assertNotNull(resting16);
        org.junit.Assert.assertNotNull(resting17);
        org.junit.Assert.assertNull(header22);
        org.junit.Assert.assertNotNull(resting25);
        org.junit.Assert.assertNotNull(requestConfig30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Name: application/xml, Value: " + "'", str35, "Name: application/xml, Value: ");
        org.junit.Assert.assertNotNull(requestConfig41);
        org.junit.Assert.assertNotNull(requestConfig42);
        org.junit.Assert.assertNotNull(requestConfig43);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.anitech.resting.exception.RestingException restingException1 = new com.anitech.resting.exception.RestingException("com.anitech.resting.exception.RestingException: hi!");
        com.anitech.resting.exception.RestingException restingException2 = new com.anitech.resting.exception.RestingException((java.lang.Throwable) restingException1);
    }
}
