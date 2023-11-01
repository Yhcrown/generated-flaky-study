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
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.COMPRESS;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "compress");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        io.muserver.Mutils.notNull("", (java.lang.Object) (byte) 10);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        boolean boolean1 = io.muserver.Mutils.nullOrEmpty("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.CONTENT_SECURITY_POLICY;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "content-security-policy");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.AGE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "age");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.X_FORWARDED_PROTO;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "x-forwarded-proto");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.GZIP;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "gzip");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_VND_APPLE_INSTALLER_XML;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str0 = io.muserver.Mutils.NEWLINE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\n" + "'", str0, "\n");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_OGG;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.FILE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "file");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.DATE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "date");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.EXPECT;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "expect");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.FONT_WOFF;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_OGG;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/ogg");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.VIDEO_WEBM;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "video/webm");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_X_CSH;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/x-csh");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.WEBSOCKET_PROTOCOL;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "websocket-protocol");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        io.muserver.Method method0 = io.muserver.Method.HEAD;
        org.junit.Assert.assertTrue("'" + method0 + "' != '" + io.muserver.Method.HEAD + "'", method0.equals(io.muserver.Method.HEAD));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.FONT_WOFF2;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "font/woff2");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        io.muserver.RateLimitBuilder rateLimitBuilder0 = io.muserver.RateLimitBuilder.rateLimit();
        org.junit.Assert.assertNotNull(rateLimitBuilder0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.S_MAXAGE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "s-maxage");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.TRAILERS;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "trailers");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.IF_MODIFIED_SINCE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "if-modified-since");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.TEXT_CALENDAR_UTF8;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "text/calendar;charset=utf-8");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.CONTENT_DISPOSITION;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "content-disposition");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.TRANSFER_ENCODING;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "transfer-encoding");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.handlers.HttpToHttpsRedirector httpToHttpsRedirector1 = new io.muserver.handlers.HttpToHttpsRedirector((int) '4');
            org.junit.Assert.fail("Expected exception of type io.muserver.MuException; message: This class has been deprecated. Please use HttpsRedirectorBuilder.toHttpsPort(int) instead.");
        } catch (io.muserver.MuException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.SEC_WEBSOCKET_EXTENSIONS;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "sec-websocket-extensions");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_VND_MS_EXCEL;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.FONT_WOFF;
        io.muserver.handlers.ResourceType[] resourceTypeArray1 = new io.muserver.handlers.ResourceType[] { resourceType0 };
        java.util.ArrayList<io.muserver.handlers.ResourceType> resourceTypeList2 = new java.util.ArrayList<io.muserver.handlers.ResourceType>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.muserver.handlers.ResourceType>) resourceTypeList2, resourceTypeArray1);
        java.util.Set<java.lang.String> strSet4 = io.muserver.handlers.ResourceType.gzippableMimeTypes((java.util.Collection<io.muserver.handlers.ResourceType>) resourceTypeList2);
        org.junit.Assert.assertNotNull(resourceType0);
        org.junit.Assert.assertNotNull(resourceTypeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.VIDEO_3GPP;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "video/3gpp");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        io.muserver.openapi.SecuritySchemeObjectBuilder securitySchemeObjectBuilder0 = io.muserver.openapi.SecuritySchemeObjectBuilder.securitySchemeObject();
        io.muserver.openapi.SecuritySchemeObjectBuilder securitySchemeObjectBuilder2 = securitySchemeObjectBuilder0.withBearerFormat("\n");
        org.junit.Assert.assertNotNull(securitySchemeObjectBuilder0);
        org.junit.Assert.assertNotNull(securitySchemeObjectBuilder2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.RETRY_AFTER;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "retry-after");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_EPUB_ZIP;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/epub+zip");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.ACCESS_CONTROL_MAX_AGE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "access-control-max-age");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        io.muserver.Method method0 = io.muserver.Method.PUT;
        io.muserver.RouteHandler routeHandler2 = null;
        io.muserver.MuHandler muHandler3 = io.muserver.Routes.route(method0, "", routeHandler2);
        io.muserver.MuRequest muRequest4 = null;
        io.muserver.MuResponse muResponse5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = muHandler3.handle(muRequest4, muResponse5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + method0 + "' != '" + io.muserver.Method.PUT + "'", method0.equals(io.muserver.Method.PUT));
        org.junit.Assert.assertNotNull(muHandler3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.FORWARDED;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "forwarded");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        io.muserver.ForwardedHeader forwardedHeader5 = new io.muserver.ForwardedHeader("", "", "hi!", "", strMap4);
        java.lang.String str6 = forwardedHeader5.host();
        boolean boolean8 = forwardedHeader5.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.VIDEO_MPEG;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        io.muserver.WebsocketSessionState websocketSessionState0 = io.muserver.WebsocketSessionState.SERVER_CLOSING;
        org.junit.Assert.assertTrue("'" + websocketSessionState0 + "' != '" + io.muserver.WebsocketSessionState.SERVER_CLOSING + "'", websocketSessionState0.equals(io.muserver.WebsocketSessionState.SERVER_CLOSING));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.CONTENT_TRANSFER_ENCODING;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "content-transfer-encoding");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        boolean boolean0 = io.muserver.Toggles.http2;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        io.muserver.openapi.ContactObjectBuilder contactObjectBuilder0 = new io.muserver.openapi.ContactObjectBuilder();
        io.muserver.openapi.ContactObjectBuilder contactObjectBuilder2 = contactObjectBuilder0.withEmail("");
        java.net.URI uRI3 = null;
        io.muserver.openapi.ContactObjectBuilder contactObjectBuilder4 = contactObjectBuilder0.withUrl(uRI3);
        org.junit.Assert.assertNotNull(contactObjectBuilder2);
        org.junit.Assert.assertNotNull(contactObjectBuilder4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.SERVER;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "server");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.CHUNKED;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "chunked");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.lang.String str0 = javax.ws.rs.ext.RuntimeDelegate.JAXRS_RUNTIME_DELEGATE_PROPERTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "javax.ws.rs.ext.RuntimeDelegate" + "'", str0, "javax.ws.rs.ext.RuntimeDelegate");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        io.muserver.Method method0 = io.muserver.Method.TRACE;
        org.junit.Assert.assertTrue("'" + method0 + "' != '" + io.muserver.Method.TRACE + "'", method0.equals(io.muserver.Method.TRACE));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.lang.String str1 = io.muserver.Mutils.htmlEncode("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        io.muserver.ForwardedHeader forwardedHeader5 = new io.muserver.ForwardedHeader("", "", "hi!", "", strMap4);
        io.muserver.ForwardedHeader[] forwardedHeaderArray6 = new io.muserver.ForwardedHeader[] { forwardedHeader5 };
        java.util.ArrayList<io.muserver.ForwardedHeader> forwardedHeaderList7 = new java.util.ArrayList<io.muserver.ForwardedHeader>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<io.muserver.ForwardedHeader>) forwardedHeaderList7, forwardedHeaderArray6);
        java.lang.String str9 = io.muserver.ForwardedHeader.toString((java.util.List<io.muserver.ForwardedHeader>) forwardedHeaderList7);
        org.junit.Assert.assertNotNull(forwardedHeaderArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "by=;for=;host=hi!;proto=" + "'", str9, "by=;for=;host=hi!;proto=");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.FROM;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "from");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.X_FRAME_OPTIONS;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "x-frame-options");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder1 = io.muserver.handlers.ResourceHandlerBuilder.fileHandler(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_VND_OASIS_OPENDOCUMENT_SPREADSHEET;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/vnd.oasis.opendocument.spreadsheet");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.MULTIPART_FORM_DATA;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "multipart/form-data");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder1 = io.muserver.handlers.ResourceHandlerBuilder.fileHandler(path0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder0 = new io.muserver.handlers.CORSHandlerBuilder();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        io.muserver.openapi.SecuritySchemeObjectBuilder securitySchemeObjectBuilder0 = io.muserver.openapi.SecuritySchemeObjectBuilder.securitySchemeObject();
        io.muserver.openapi.SecuritySchemeObjectBuilder securitySchemeObjectBuilder2 = securitySchemeObjectBuilder0.withDescription("\n");
        io.muserver.openapi.SecuritySchemeObjectBuilder securitySchemeObjectBuilder4 = securitySchemeObjectBuilder2.withIn("javax.ws.rs.ext.RuntimeDelegate");
        io.muserver.openapi.SecuritySchemeObjectBuilder securitySchemeObjectBuilder6 = securitySchemeObjectBuilder4.withScheme("hi!");
        org.junit.Assert.assertNotNull(securitySchemeObjectBuilder0);
        org.junit.Assert.assertNotNull(securitySchemeObjectBuilder2);
        org.junit.Assert.assertNotNull(securitySchemeObjectBuilder4);
        org.junit.Assert.assertNotNull(securitySchemeObjectBuilder6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        io.muserver.ResponseState responseState0 = io.muserver.ResponseState.ERRORED;
        org.junit.Assert.assertTrue("'" + responseState0 + "' != '" + io.muserver.ResponseState.ERRORED + "'", responseState0.equals(io.muserver.ResponseState.ERRORED));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.handlers.HttpToHttpsRedirector httpToHttpsRedirector1 = new io.muserver.handlers.HttpToHttpsRedirector((int) 'a');
            org.junit.Assert.fail("Expected exception of type io.muserver.MuException; message: This class has been deprecated. Please use HttpsRedirectorBuilder.toHttpsPort(int) instead.");
        } catch (io.muserver.MuException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        boolean boolean1 = io.muserver.Mutils.nullOrEmpty("\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.X_GZIP;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "x-gzip");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.TEXT_PLAIN;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "text/plain");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        boolean boolean0 = io.muserver.Toggles.fixedLengthResponsesEnabled;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.muserver.MediaTypeParser mediaTypeParser0 = new io.muserver.MediaTypeParser();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_X_7Z_COMPRESSED;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/x-7z-compressed");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.SET_COOKIE2;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "set-cookie2");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.TEXT_CSS_UTF8;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "text/css;charset=utf-8");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.CACHE_CONTROL;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "cache-control");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        io.muserver.ForwardedHeader forwardedHeader5 = new io.muserver.ForwardedHeader("", "", "hi!", "", strMap4);
        java.lang.String str6 = forwardedHeader5.host();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = forwardedHeader5.extensions();
        java.lang.String str8 = forwardedHeader5.host();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.ACCESS_CONTROL_REQUEST_HEADERS;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "access-control-request-headers");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/vnd.oasis.opendocument.text");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.QUOTED_PRINTABLE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "quoted-printable");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        io.muserver.openapi.ComponentsObjectBuilder componentsObjectBuilder0 = new io.muserver.openapi.ComponentsObjectBuilder();
        java.util.Map<java.lang.String, io.muserver.openapi.SchemaObject> strMap1 = null;
        io.muserver.openapi.ComponentsObjectBuilder componentsObjectBuilder2 = componentsObjectBuilder0.withSchemas(strMap1);
        java.util.Map<java.lang.String, io.muserver.openapi.HeaderObject> strMap3 = null;
        io.muserver.openapi.ComponentsObjectBuilder componentsObjectBuilder4 = componentsObjectBuilder2.withHeaders(strMap3);
        org.junit.Assert.assertNotNull(componentsObjectBuilder2);
        org.junit.Assert.assertNotNull(componentsObjectBuilder4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        io.muserver.openapi.ExampleObjectBuilder exampleObjectBuilder0 = io.muserver.openapi.ExampleObjectBuilder.exampleObject();
        org.junit.Assert.assertNotNull(exampleObjectBuilder0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.IMAGE_AVIF;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "image/avif");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.X_FORWARDED_HOST;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "x-forwarded-host");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.lang.String str2 = io.muserver.Mutils.trim("", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        io.muserver.Method method0 = io.muserver.Method.POST;
        org.junit.Assert.assertTrue("'" + method0 + "' != '" + io.muserver.Method.POST + "'", method0.equals(io.muserver.Method.POST));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.IMAGE_AVIF;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.IMAGE_PNG;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        io.muserver.openapi.XmlObjectBuilder xmlObjectBuilder0 = new io.muserver.openapi.XmlObjectBuilder();
        io.muserver.openapi.XmlObjectBuilder xmlObjectBuilder2 = xmlObjectBuilder0.withWrapped(true);
        org.junit.Assert.assertNotNull(xmlObjectBuilder2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        io.muserver.openapi.OperationObject operationObject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.openapi.OperationObjectBuilder operationObjectBuilder1 = io.muserver.openapi.OperationObjectBuilder.builderFrom(operationObject0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.VIDEO_3GPP2;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.BASE64;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "base64");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.ACCESS_CONTROL_ALLOW_ORIGIN;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "access-control-allow-origin");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.TEXT_CSV;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "text/csv");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.CONNECTION;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "connection");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.CONTENT_RANGE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "content-range");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_X_BZIP2;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/x-bzip2");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        javax.ws.rs.ext.RuntimeDelegate runtimeDelegate0 = javax.ws.rs.ext.RuntimeDelegate.getInstance();
        org.junit.Assert.assertNotNull(runtimeDelegate0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.NO_STORE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "no-store");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.muserver.Method method0 = io.muserver.Method.GET;
        org.junit.Assert.assertTrue("'" + method0 + "' != '" + io.muserver.Method.GET + "'", method0.equals(io.muserver.Method.GET));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        io.muserver.Toggles.http2 = true;
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.WEB_APP_MANIFEST;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), " application/manifest+json");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.SEC_WEBSOCKET_KEY2;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "sec-websocket-key2");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.muserver.openapi.XmlObjectBuilder xmlObjectBuilder0 = new io.muserver.openapi.XmlObjectBuilder();
        io.muserver.openapi.XmlObjectBuilder xmlObjectBuilder2 = xmlObjectBuilder0.withPrefix("by=;for=;host=hi!;proto=");
        org.junit.Assert.assertNotNull(xmlObjectBuilder2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.AUDIO_OGG;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.TE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "te");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_JAVA_ARCHIVE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/java-archive");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder0 = io.muserver.handlers.CORSHandlerBuilder.corsHandler();
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder1 = io.muserver.rest.CORSConfigBuilder.disabled();
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder2 = cORSHandlerBuilder0.withCORSConfig(cORSConfigBuilder1);
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder4 = cORSConfigBuilder1.withMaxAge((-1L));
        org.junit.Assert.assertNotNull(cORSHandlerBuilder0);
        org.junit.Assert.assertNotNull(cORSConfigBuilder1);
        org.junit.Assert.assertNotNull(cORSHandlerBuilder2);
        org.junit.Assert.assertNotNull(cORSConfigBuilder4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.IF_UNMODIFIED_SINCE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "if-unmodified-since");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.FONT_TTF;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        boolean boolean1 = io.muserver.Mutils.hasValue("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_XML;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.muserver.handlers.ResourceHandler.Builder builder2 = io.muserver.handlers.ResourceHandler.fileOrClasspath("by=;for=;host=hi!;proto=", "");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.CONTENT_LANGUAGE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "content-language");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder0 = io.muserver.rest.CORSConfigBuilder.disabled();
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder1 = cORSConfigBuilder0.withAllOriginsAllowed();
        org.junit.Assert.assertNotNull(cORSConfigBuilder0);
        org.junit.Assert.assertNotNull(cORSConfigBuilder1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        io.muserver.handlers.HttpsRedirectorBuilder httpsRedirectorBuilder0 = new io.muserver.handlers.HttpsRedirectorBuilder();
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.handlers.HttpsRedirector httpsRedirector1 = httpsRedirectorBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The HTTPS port to redirect to should be a positive number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.muserver.openapi.OpenAPIObjectBuilder openAPIObjectBuilder0 = io.muserver.openapi.OpenAPIObjectBuilder.openAPIObject();
        io.muserver.openapi.SecurityRequirementObject[] securityRequirementObjectArray1 = new io.muserver.openapi.SecurityRequirementObject[] {};
        java.util.ArrayList<io.muserver.openapi.SecurityRequirementObject> securityRequirementObjectList2 = new java.util.ArrayList<io.muserver.openapi.SecurityRequirementObject>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.muserver.openapi.SecurityRequirementObject>) securityRequirementObjectList2, securityRequirementObjectArray1);
        io.muserver.openapi.OpenAPIObjectBuilder openAPIObjectBuilder4 = openAPIObjectBuilder0.withSecurity((java.util.List<io.muserver.openapi.SecurityRequirementObject>) securityRequirementObjectList2);
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.openapi.OpenAPIObject openAPIObject5 = openAPIObjectBuilder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: paths cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openAPIObjectBuilder0);
        org.junit.Assert.assertNotNull(securityRequirementObjectArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(openAPIObjectBuilder4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.CONTINUE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "100-continue");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_JSON;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/json");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = io.muserver.Mutils.fullPath(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: file cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_X_BZIP;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_X_SHOCKWAVE_FLASH;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        io.muserver.ResponseState responseState0 = io.muserver.ResponseState.CLIENT_DISCONNECTED;
        org.junit.Assert.assertTrue("'" + responseState0 + "' != '" + io.muserver.ResponseState.CLIENT_DISCONNECTED + "'", responseState0.equals(io.muserver.ResponseState.CLIENT_DISCONNECTED));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.Mutils.copy(inputStream0, outputStream1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.lang.String str0 = io.muserver.rest.MuRuntimeDelegate.RESOURCE_INFO_PROPERTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.muserver.RESOURCE_INFO" + "'", str0, "io.muserver.RESOURCE_INFO");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.WEBSOCKET;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "websocket");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        io.muserver.Http2ConfigBuilder http2ConfigBuilder0 = io.muserver.Http2ConfigBuilder.http2EnabledIfAvailable();
        org.junit.Assert.assertNotNull(http2ConfigBuilder0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        io.muserver.openapi.ContactObjectBuilder contactObjectBuilder0 = io.muserver.openapi.ContactObjectBuilder.contactObject();
        org.junit.Assert.assertNotNull(contactObjectBuilder0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.TEXT_MARKDOWN;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "text/markdown");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.PRIVATE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "private");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.ONLY_IF_CACHED;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "only-if-cached");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.IF_NONE_MATCH;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "if-none-match");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_OCTET_STREAM;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/octet-stream");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        io.muserver.ForwardedHeader forwardedHeader5 = new io.muserver.ForwardedHeader("", "", "hi!", "", strMap4);
        java.lang.String str6 = forwardedHeader5.host();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = forwardedHeader5.extensions();
        io.muserver.openapi.LicenseObjectBuilder licenseObjectBuilder8 = io.muserver.openapi.LicenseObjectBuilder.licenseObject();
        boolean boolean9 = forwardedHeader5.equals((java.lang.Object) licenseObjectBuilder8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(licenseObjectBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        io.muserver.MuRequest muRequest0 = null;
        io.muserver.MuResponse muResponse1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.SsePublisher ssePublisher2 = io.muserver.SsePublisher.start(muRequest0, muResponse1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.ACCEPT_ENCODING;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "accept-encoding");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_ZIP;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/zip");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        io.muserver.RateLimitBuilder rateLimitBuilder0 = io.muserver.RateLimit.builder();
        org.junit.Assert.assertNotNull(rateLimitBuilder0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.FONT_WOFF;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "font/woff");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        io.muserver.openapi.ExampleObjectBuilder exampleObjectBuilder0 = new io.muserver.openapi.ExampleObjectBuilder();
        java.net.URI uRI1 = null;
        io.muserver.openapi.ExampleObjectBuilder exampleObjectBuilder2 = exampleObjectBuilder0.withExternalValue(uRI1);
        io.muserver.openapi.ExampleObject exampleObject3 = exampleObjectBuilder0.build();
        io.muserver.openapi.ExampleObjectBuilder exampleObjectBuilder5 = exampleObjectBuilder0.withSummary("");
        org.junit.Assert.assertNotNull(exampleObjectBuilder2);
        org.junit.Assert.assertNotNull(exampleObject3);
        org.junit.Assert.assertNotNull(exampleObjectBuilder5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.AUDIO_X_WAV;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "audio/x-wav");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.ACCEPT;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "accept");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.WEB_APP_MANIFEST;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        io.muserver.ResponseState responseState0 = io.muserver.ResponseState.FULL_SENT;
        boolean boolean1 = responseState0.endState();
        org.junit.Assert.assertTrue("'" + responseState0 + "' != '" + io.muserver.ResponseState.FULL_SENT + "'", responseState0.equals(io.muserver.ResponseState.FULL_SENT));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.X_DEFLATE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "x-deflate");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.TEXT_JAVASCRIPT;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.MAX_FORWARDS;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "max-forwards");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        io.muserver.Toggles.http2 = false;
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_XHTML_XML;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/xhtml+xml");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        io.muserver.Method method0 = io.muserver.Method.CONNECT;
        org.junit.Assert.assertTrue("'" + method0 + "' != '" + io.muserver.Method.CONNECT + "'", method0.equals(io.muserver.Method.CONNECT));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.muserver.rest.UriPattern uriPattern1 = io.muserver.rest.UriPattern.uriTemplateToRegex("hi!");
        java.net.URI uRI2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.rest.PathMatch pathMatch3 = uriPattern1.matcher(uRI2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uriPattern1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        io.muserver.openapi.DiscriminatorObjectBuilder discriminatorObjectBuilder0 = io.muserver.openapi.DiscriminatorObjectBuilder.discriminatorObject();
        org.junit.Assert.assertNotNull(discriminatorObjectBuilder0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder0 = io.muserver.handlers.CORSHandlerBuilder.corsHandler();
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder1 = new io.muserver.rest.CORSConfigBuilder();
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder2 = cORSHandlerBuilder0.withCORSConfig(cORSConfigBuilder1);
        io.muserver.rest.CORSConfig cORSConfig3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder4 = cORSHandlerBuilder0.withCORSConfig(cORSConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: corsConfig cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cORSHandlerBuilder0);
        org.junit.Assert.assertNotNull(cORSHandlerBuilder2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        io.muserver.CookieBuilder cookieBuilder0 = io.muserver.CookieBuilder.newSecureCookie();
        io.muserver.CookieBuilder cookieBuilder2 = cookieBuilder0.withMaxAgeInSeconds((long) (short) 0);
        io.muserver.CookieBuilder cookieBuilder4 = cookieBuilder2.withPath("javax.ws.rs.ext.RuntimeDelegate");
        org.junit.Assert.assertNotNull(cookieBuilder0);
        org.junit.Assert.assertNotNull(cookieBuilder2);
        org.junit.Assert.assertNotNull(cookieBuilder4);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.SET_COOKIE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "set-cookie");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.X_FORWARDED_FOR;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "x-forwarded-for");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        io.muserver.openapi.OpenAPIObjectBuilder openAPIObjectBuilder0 = io.muserver.openapi.OpenAPIObjectBuilder.openAPIObject();
        io.muserver.openapi.ComponentsObject componentsObject1 = null;
        io.muserver.openapi.OpenAPIObjectBuilder openAPIObjectBuilder2 = openAPIObjectBuilder0.withComponents(componentsObject1);
        org.junit.Assert.assertNotNull(openAPIObjectBuilder0);
        org.junit.Assert.assertNotNull(openAPIObjectBuilder2);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_PDF;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/pdf");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_GZIP;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_JAVASCRIPT;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/javascript");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        io.muserver.openapi.ServerVariableObjectBuilder serverVariableObjectBuilder0 = new io.muserver.openapi.ServerVariableObjectBuilder();
        java.util.List<java.lang.String> strList1 = io.muserver.openapi.ParameterObject.allowedStyles();
        io.muserver.openapi.ServerVariableObjectBuilder serverVariableObjectBuilder2 = serverVariableObjectBuilder0.withEnumValues(strList1);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(serverVariableObjectBuilder2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.IMAGE_GIF;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "image/gif");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.TEXT_CALENDAR;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "text/calendar");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder2 = io.muserver.handlers.ResourceHandlerBuilder.fileOrClasspath("\n", "hi!");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder4 = resourceHandlerBuilder2.withDirectoryListing(true);
        io.muserver.handlers.ResourceHandler resourceHandler5 = resourceHandlerBuilder2.build();
        io.muserver.MuRequest muRequest6 = null;
        io.muserver.MuResponse muResponse7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = resourceHandler5.handle(muRequest6, muResponse7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceHandlerBuilder2);
        org.junit.Assert.assertNotNull(resourceHandlerBuilder4);
        org.junit.Assert.assertNotNull(resourceHandler5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        io.muserver.HttpsConfigBuilder httpsConfigBuilder0 = io.muserver.HttpsConfigBuilder.unsignedLocalhost();
        javax.net.ssl.KeyManagerFactory keyManagerFactory1 = null;
        io.muserver.SSLContextBuilder sSLContextBuilder2 = httpsConfigBuilder0.withKeyManagerFactory(keyManagerFactory1);
        io.muserver.HttpsConfigBuilder httpsConfigBuilder4 = httpsConfigBuilder0.withKeystorePassword("by=;for=;host=hi!;proto=");
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.SSLContextBuilder sSLContextBuilder6 = httpsConfigBuilder4.withKeystore(inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpsConfigBuilder0);
        org.junit.Assert.assertNotNull(sSLContextBuilder2);
        org.junit.Assert.assertNotNull(httpsConfigBuilder4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.muserver.openapi.ComponentsObjectBuilder componentsObjectBuilder0 = new io.muserver.openapi.ComponentsObjectBuilder();
        java.util.Map<java.lang.String, io.muserver.openapi.SchemaObject> strMap1 = null;
        io.muserver.openapi.ComponentsObjectBuilder componentsObjectBuilder2 = componentsObjectBuilder0.withSchemas(strMap1);
        java.util.Map<java.lang.String, io.muserver.openapi.SchemaObject> strMap3 = null;
        io.muserver.openapi.ComponentsObjectBuilder componentsObjectBuilder4 = componentsObjectBuilder0.withSchemas(strMap3);
        org.junit.Assert.assertNotNull(componentsObjectBuilder2);
        org.junit.Assert.assertNotNull(componentsObjectBuilder4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        io.muserver.ResponseState responseState0 = io.muserver.ResponseState.TIMED_OUT;
        org.junit.Assert.assertTrue("'" + responseState0 + "' != '" + io.muserver.ResponseState.TIMED_OUT + "'", responseState0.equals(io.muserver.ResponseState.TIMED_OUT));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.LAST_MODIFIED;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "last-modified");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.TEXT_PLAIN;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.lang.String str1 = io.muserver.Mutils.urlEncode("\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "%0A" + "'", str1, "%0A");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.muserver.Method method0 = io.muserver.Method.PUT;
        io.muserver.RouteHandler routeHandler2 = null;
        io.muserver.MuHandler muHandler3 = io.muserver.Routes.route(method0, "", routeHandler2);
        io.muserver.RouteHandler routeHandler5 = null;
        io.muserver.MuHandler muHandler6 = io.muserver.Routes.route(method0, "javax.ws.rs.ext.RuntimeDelegate", routeHandler5);
        org.junit.Assert.assertTrue("'" + method0 + "' != '" + io.muserver.Method.PUT + "'", method0.equals(io.muserver.Method.PUT));
        org.junit.Assert.assertNotNull(muHandler3);
        org.junit.Assert.assertNotNull(muHandler6);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.NONE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "none");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.lang.String str0 = io.muserver.rest.MuRuntimeDelegate.MU_REQUEST_PROPERTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "io.muserver.MU_REQUEST" + "'", str0, "io.muserver.MU_REQUEST");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        io.muserver.Http2ConfigBuilder http2ConfigBuilder0 = new io.muserver.Http2ConfigBuilder();
        io.muserver.Http2Config http2Config1 = http2ConfigBuilder0.build();
        org.junit.Assert.assertNotNull(http2Config1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder1 = io.muserver.handlers.ResourceHandlerBuilder.fileHandler("\n");
            org.junit.Assert.fail("Expected exception of type io.muserver.MuException; message: ? is not a directory");
        } catch (io.muserver.MuException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.AUTHORIZATION;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "authorization");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.FILENAME;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "filename");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_TYPESCRIPT;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/typescript");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.PRAGMA;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "pragma");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        io.muserver.openapi.OAuthFlowsObjectBuilder oAuthFlowsObjectBuilder0 = io.muserver.openapi.OAuthFlowsObjectBuilder.oAuthFlowsObject();
        io.muserver.openapi.OAuthFlowObject oAuthFlowObject1 = null;
        io.muserver.openapi.OAuthFlowsObjectBuilder oAuthFlowsObjectBuilder2 = oAuthFlowsObjectBuilder0.withClientCredentials(oAuthFlowObject1);
        org.junit.Assert.assertNotNull(oAuthFlowsObjectBuilder0);
        org.junit.Assert.assertNotNull(oAuthFlowsObjectBuilder2);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        io.muserver.openapi.ExampleObjectBuilder exampleObjectBuilder0 = new io.muserver.openapi.ExampleObjectBuilder();
        java.net.URI uRI1 = null;
        io.muserver.openapi.ExampleObjectBuilder exampleObjectBuilder2 = exampleObjectBuilder0.withExternalValue(uRI1);
        io.muserver.openapi.ExampleObject exampleObject3 = exampleObjectBuilder0.build();
        java.lang.String str4 = exampleObject3.summary();
        org.junit.Assert.assertNotNull(exampleObjectBuilder2);
        org.junit.Assert.assertNotNull(exampleObject3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        io.muserver.openapi.LicenseObjectBuilder licenseObjectBuilder0 = io.muserver.openapi.LicenseObjectBuilder.licenseObject();
        java.net.URI uRI1 = null;
        io.muserver.openapi.LicenseObjectBuilder licenseObjectBuilder2 = licenseObjectBuilder0.withUrl(uRI1);
        io.muserver.openapi.LicenseObjectBuilder licenseObjectBuilder4 = licenseObjectBuilder0.withName("");
        org.junit.Assert.assertNotNull(licenseObjectBuilder0);
        org.junit.Assert.assertNotNull(licenseObjectBuilder2);
        org.junit.Assert.assertNotNull(licenseObjectBuilder4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.CONTENT_MD5;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "content-md5");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_JAVA_ARCHIVE;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        io.muserver.CookieBuilder cookieBuilder0 = io.muserver.CookieBuilder.newSecureCookie();
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.CookieBuilder cookieBuilder2 = cookieBuilder0.withSameSite("%0A");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid SameSite value. It should be one of: Lax, Strict, None");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cookieBuilder0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_X_7Z_COMPRESSED;
        java.lang.CharSequence charSequence1 = resourceType0.mimeType();
        org.junit.Assert.assertNotNull(resourceType0);
        org.junit.Assert.assertNotNull(charSequence1);
        org.junit.Assert.assertEquals(charSequence1.toString(), "application/x-7z-compressed");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        io.muserver.handlers.HttpsRedirector.Builder builder0 = new io.muserver.handlers.HttpsRedirector.Builder();
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.handlers.HttpsRedirector httpsRedirector1 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The HTTPS port to redirect to should be a positive number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        io.muserver.MuRequest muRequest0 = null;
        io.muserver.MuResponse muResponse1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.AsyncSsePublisher asyncSsePublisher2 = io.muserver.AsyncSsePublisher.start(muRequest0, muResponse1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        io.muserver.handlers.HttpsRedirectorBuilder httpsRedirectorBuilder0 = new io.muserver.handlers.HttpsRedirectorBuilder();
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.handlers.HttpsRedirectorBuilder httpsRedirectorBuilder3 = httpsRedirectorBuilder0.withHSTSExpireTime((int) '4', timeUnit2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.TEXT_CSS;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "text/css");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.VIDEO_OGG;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "video/ogg");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.ACCEPT_LANGUAGE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "accept-language");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        io.muserver.CookieBuilder cookieBuilder0 = io.muserver.CookieBuilder.newSecureCookie();
        io.muserver.CookieBuilder cookieBuilder2 = cookieBuilder0.withMaxAgeInSeconds((long) (short) 0);
        io.muserver.CookieBuilder cookieBuilder4 = cookieBuilder0.withDomain("");
        io.muserver.CookieBuilder cookieBuilder6 = cookieBuilder0.withUrlEncodedValue("hi!");
        org.junit.Assert.assertNotNull(cookieBuilder0);
        org.junit.Assert.assertNotNull(cookieBuilder2);
        org.junit.Assert.assertNotNull(cookieBuilder4);
        org.junit.Assert.assertNotNull(cookieBuilder6);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        io.muserver.CookieBuilder cookieBuilder0 = io.muserver.CookieBuilder.newSecureCookie();
        io.muserver.CookieBuilder cookieBuilder2 = cookieBuilder0.withMaxAgeInSeconds((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.CookieBuilder cookieBuilder4 = cookieBuilder2.withSameSite("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid SameSite value. It should be one of: Lax, Strict, None");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cookieBuilder0);
        org.junit.Assert.assertNotNull(cookieBuilder2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.DEFLATE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "deflate");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        io.muserver.openapi.TagObjectBuilder tagObjectBuilder0 = io.muserver.openapi.TagObjectBuilder.tagObject();
        io.muserver.openapi.TagObjectBuilder tagObjectBuilder2 = tagObjectBuilder0.withDescription("javax.ws.rs.ext.RuntimeDelegate");
        io.muserver.openapi.TagObjectBuilder tagObjectBuilder4 = tagObjectBuilder2.withName("");
        org.junit.Assert.assertNotNull(tagObjectBuilder0);
        org.junit.Assert.assertNotNull(tagObjectBuilder2);
        org.junit.Assert.assertNotNull(tagObjectBuilder4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        io.muserver.handlers.HttpsRedirectorBuilder httpsRedirectorBuilder0 = new io.muserver.handlers.HttpsRedirectorBuilder();
        io.muserver.handlers.HttpsRedirectorBuilder httpsRedirectorBuilder2 = httpsRedirectorBuilder0.includeSubDomains(true);
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.handlers.HttpsRedirector httpsRedirector3 = httpsRedirectorBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The HTTPS port to redirect to should be a positive number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpsRedirectorBuilder2);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.BYTES;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "bytes");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_VND_MS_FONTOBJECT;
        java.lang.CharSequence charSequence1 = resourceType0.mimeType();
        org.junit.Assert.assertNotNull(resourceType0);
        org.junit.Assert.assertNotNull(charSequence1);
        org.junit.Assert.assertEquals(charSequence1.toString(), "application/vnd.ms-fontobject");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.WARNING;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "warning");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.MULTIPART_MIXED;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "multipart/mixed");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        io.muserver.openapi.ServerObjectBuilder serverObjectBuilder0 = io.muserver.openapi.ServerObjectBuilder.serverObject();
        org.junit.Assert.assertNotNull(serverObjectBuilder0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_X_RAR_COMPRESSED;
        java.util.List<java.lang.String> strList1 = resourceType0.extensions;
        org.junit.Assert.assertNotNull(resourceType0);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_X_RAR_COMPRESSED;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/x-rar-compressed");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.IMAGE_SVG_XML;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "image/svg+xml");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.CONTENT_TYPE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "content-type");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.TEXT_MARKDOWN;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        io.muserver.rest.SchemaObjectCustomizerTarget schemaObjectCustomizerTarget0 = io.muserver.rest.SchemaObjectCustomizerTarget.REQUEST_BODY;
        org.junit.Assert.assertTrue("'" + schemaObjectCustomizerTarget0 + "' != '" + io.muserver.rest.SchemaObjectCustomizerTarget.REQUEST_BODY + "'", schemaObjectCustomizerTarget0.equals(io.muserver.rest.SchemaObjectCustomizerTarget.REQUEST_BODY));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        io.muserver.openapi.SecuritySchemeObjectBuilder securitySchemeObjectBuilder0 = new io.muserver.openapi.SecuritySchemeObjectBuilder();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.ACCESS_CONTROL_ALLOW_HEADERS;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "access-control-allow-headers");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder0 = io.muserver.handlers.CORSHandlerBuilder.corsHandler();
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder1 = io.muserver.rest.CORSConfigBuilder.disabled();
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder2 = cORSHandlerBuilder0.withCORSConfig(cORSConfigBuilder1);
        io.muserver.rest.CORSConfig cORSConfig3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder4 = cORSHandlerBuilder2.withCORSConfig(cORSConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: corsConfig cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cORSHandlerBuilder0);
        org.junit.Assert.assertNotNull(cORSConfigBuilder1);
        org.junit.Assert.assertNotNull(cORSHandlerBuilder2);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        io.muserver.openapi.HeaderObjectBuilder headerObjectBuilder0 = io.muserver.openapi.HeaderObjectBuilder.headerObject();
        io.muserver.openapi.HeaderObjectBuilder headerObjectBuilder2 = headerObjectBuilder0.withExplode("by=;for=;host=hi!;proto=");
        io.muserver.openapi.SchemaObject schemaObject3 = null;
        io.muserver.openapi.HeaderObjectBuilder headerObjectBuilder4 = headerObjectBuilder2.withSchema(schemaObject3);
        org.junit.Assert.assertNotNull(headerObjectBuilder0);
        org.junit.Assert.assertNotNull(headerObjectBuilder2);
        org.junit.Assert.assertNotNull(headerObjectBuilder4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_VND_MS_FONTOBJECT;
        boolean boolean1 = resourceType0.gzip();
        org.junit.Assert.assertNotNull(resourceType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        io.muserver.openapi.HeaderObjectBuilder headerObjectBuilder0 = io.muserver.openapi.HeaderObjectBuilder.headerObject();
        io.muserver.openapi.HeaderObjectBuilder headerObjectBuilder2 = headerObjectBuilder0.withRequired(false);
        org.junit.Assert.assertNotNull(headerObjectBuilder0);
        org.junit.Assert.assertNotNull(headerObjectBuilder2);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder0 = new io.muserver.handlers.ResourceHandlerBuilder();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        io.muserver.RateLimitBuilder rateLimitBuilder0 = new io.muserver.RateLimitBuilder();
        io.muserver.RateLimitRejectionAction rateLimitRejectionAction1 = io.muserver.RateLimitRejectionAction.SEND_429;
        io.muserver.RateLimitBuilder rateLimitBuilder2 = rateLimitBuilder0.withRejectionAction(rateLimitRejectionAction1);
        io.muserver.RateLimitRejectionAction rateLimitRejectionAction3 = io.muserver.RateLimitRejectionAction.SEND_429;
        io.muserver.RateLimitBuilder rateLimitBuilder4 = rateLimitBuilder2.withRejectionAction(rateLimitRejectionAction3);
        io.muserver.RateLimit rateLimit5 = rateLimitBuilder2.build();
        org.junit.Assert.assertTrue("'" + rateLimitRejectionAction1 + "' != '" + io.muserver.RateLimitRejectionAction.SEND_429 + "'", rateLimitRejectionAction1.equals(io.muserver.RateLimitRejectionAction.SEND_429));
        org.junit.Assert.assertNotNull(rateLimitBuilder2);
        org.junit.Assert.assertTrue("'" + rateLimitRejectionAction3 + "' != '" + io.muserver.RateLimitRejectionAction.SEND_429 + "'", rateLimitRejectionAction3.equals(io.muserver.RateLimitRejectionAction.SEND_429));
        org.junit.Assert.assertNotNull(rateLimitBuilder4);
        org.junit.Assert.assertNotNull(rateLimit5);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        io.muserver.openapi.TagObjectBuilder tagObjectBuilder0 = io.muserver.openapi.TagObjectBuilder.tagObject();
        io.muserver.openapi.TagObjectBuilder tagObjectBuilder2 = tagObjectBuilder0.withDescription("javax.ws.rs.ext.RuntimeDelegate");
        io.muserver.openapi.TagObjectBuilder tagObjectBuilder4 = tagObjectBuilder0.withName("\n");
        org.junit.Assert.assertNotNull(tagObjectBuilder0);
        org.junit.Assert.assertNotNull(tagObjectBuilder2);
        org.junit.Assert.assertNotNull(tagObjectBuilder4);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        io.muserver.handlers.ResourceHandler.Builder builder1 = io.muserver.handlers.ResourceHandler.classpathHandler("\n");
        io.muserver.handlers.ResourceHandler resourceHandler2 = builder1.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(resourceHandler2);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.muserver.HttpsConfigBuilder httpsConfigBuilder0 = new io.muserver.HttpsConfigBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        io.muserver.HttpsConfigBuilder httpsConfigBuilder3 = httpsConfigBuilder0.withProtocols(strArray2);
        javax.net.ssl.KeyManagerFactory keyManagerFactory4 = null;
        io.muserver.HttpsConfigBuilder httpsConfigBuilder5 = httpsConfigBuilder0.withKeyManagerFactory(keyManagerFactory4);
        // The following exception was thrown during execution in test generation
        try {
            javax.net.ssl.SSLContext sSLContext6 = httpsConfigBuilder5.build();
            org.junit.Assert.fail("Expected exception of type io.muserver.MuException; message: No keystore has been set");
        } catch (io.muserver.MuException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(httpsConfigBuilder3);
        org.junit.Assert.assertNotNull(httpsConfigBuilder5);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.VIDEO_WEBM;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.muserver.openapi.ResponseObjectBuilder responseObjectBuilder0 = new io.muserver.openapi.ResponseObjectBuilder();
        java.util.Map<java.lang.String, io.muserver.openapi.LinkObject> strMap1 = null;
        io.muserver.openapi.ResponseObjectBuilder responseObjectBuilder2 = responseObjectBuilder0.withLinks(strMap1);
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.openapi.ResponseObject responseObject3 = responseObjectBuilder2.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: description cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(responseObjectBuilder2);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.TEXT_CALENDAR;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        io.muserver.WebsocketSessionState websocketSessionState0 = io.muserver.WebsocketSessionState.CLIENT_CLOSED;
        org.junit.Assert.assertTrue("'" + websocketSessionState0 + "' != '" + io.muserver.WebsocketSessionState.CLIENT_CLOSED + "'", websocketSessionState0.equals(io.muserver.WebsocketSessionState.CLIENT_CLOSED));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.util.List<java.lang.String> strList0 = io.muserver.openapi.SecuritySchemeObject.validTypes();
        org.junit.Assert.assertNotNull(strList0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder2 = io.muserver.handlers.ResourceHandlerBuilder.fileOrClasspath("\n", "hi!");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder4 = resourceHandlerBuilder2.withDirectoryListing(true);
        io.muserver.handlers.ResourceHandler resourceHandler5 = resourceHandlerBuilder2.build();
        io.muserver.MuRequest muRequest6 = null;
        io.muserver.MuResponse muResponse7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = resourceHandler5.handle(muRequest6, muResponse7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceHandlerBuilder2);
        org.junit.Assert.assertNotNull(resourceHandlerBuilder4);
        org.junit.Assert.assertNotNull(resourceHandler5);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        io.muserver.HttpsConfigBuilder httpsConfigBuilder0 = new io.muserver.HttpsConfigBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        io.muserver.HttpsConfigBuilder httpsConfigBuilder3 = httpsConfigBuilder0.withProtocols(strArray2);
        io.muserver.SSLCipherFilter sSLCipherFilter4 = null;
        io.muserver.SSLContextBuilder sSLContextBuilder5 = httpsConfigBuilder0.withCipherFilter(sSLCipherFilter4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(httpsConfigBuilder3);
        org.junit.Assert.assertNotNull(sSLContextBuilder5);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        io.muserver.HttpsConfigBuilder httpsConfigBuilder0 = io.muserver.HttpsConfigBuilder.unsignedLocalhost();
        javax.net.ssl.KeyManagerFactory keyManagerFactory1 = null;
        io.muserver.SSLContextBuilder sSLContextBuilder2 = httpsConfigBuilder0.withKeyManagerFactory(keyManagerFactory1);
        char[] charArray3 = new char[] {};
        io.muserver.SSLContextBuilder sSLContextBuilder4 = sSLContextBuilder2.withKeystorePassword(charArray3);
        org.junit.Assert.assertNotNull(httpsConfigBuilder0);
        org.junit.Assert.assertNotNull(sSLContextBuilder2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertNotNull(sSLContextBuilder4);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        io.muserver.openapi.InfoObjectBuilder infoObjectBuilder0 = new io.muserver.openapi.InfoObjectBuilder();
        io.muserver.openapi.LicenseObject licenseObject1 = null;
        io.muserver.openapi.InfoObjectBuilder infoObjectBuilder2 = infoObjectBuilder0.withLicense(licenseObject1);
        java.net.URI uRI3 = null;
        io.muserver.openapi.InfoObjectBuilder infoObjectBuilder4 = infoObjectBuilder2.withTermsOfService(uRI3);
        org.junit.Assert.assertNotNull(infoObjectBuilder2);
        org.junit.Assert.assertNotNull(infoObjectBuilder4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        io.muserver.rest.UriPattern uriPattern1 = io.muserver.rest.UriPattern.uriTemplateToRegex("hi!");
        io.muserver.rest.PathMatch pathMatch3 = uriPattern1.matcher("");
        java.lang.String str4 = pathMatch3.toString();
        org.junit.Assert.assertNotNull(uriPattern1);
        org.junit.Assert.assertNotNull(pathMatch3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PathMatch{matches=false, params={}}" + "'", str4, "PathMatch{matches=false, params={}}");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.TEXT_CSV_UTF8;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "text/csv;charset=utf-8");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        io.muserver.RateLimitBuilder rateLimitBuilder0 = new io.muserver.RateLimitBuilder();
        io.muserver.RateLimitRejectionAction rateLimitRejectionAction1 = io.muserver.RateLimitRejectionAction.SEND_429;
        io.muserver.RateLimitBuilder rateLimitBuilder2 = rateLimitBuilder0.withRejectionAction(rateLimitRejectionAction1);
        io.muserver.RateLimitBuilder rateLimitBuilder3 = new io.muserver.RateLimitBuilder();
        io.muserver.RateLimitRejectionAction rateLimitRejectionAction4 = io.muserver.RateLimitRejectionAction.SEND_429;
        io.muserver.RateLimitBuilder rateLimitBuilder5 = rateLimitBuilder3.withRejectionAction(rateLimitRejectionAction4);
        io.muserver.RateLimitRejectionAction rateLimitRejectionAction6 = io.muserver.RateLimitRejectionAction.SEND_429;
        io.muserver.RateLimitBuilder rateLimitBuilder7 = rateLimitBuilder5.withRejectionAction(rateLimitRejectionAction6);
        io.muserver.RateLimitBuilder rateLimitBuilder8 = new io.muserver.RateLimitBuilder();
        io.muserver.RateLimitRejectionAction rateLimitRejectionAction9 = io.muserver.RateLimitRejectionAction.SEND_429;
        io.muserver.RateLimitBuilder rateLimitBuilder10 = rateLimitBuilder8.withRejectionAction(rateLimitRejectionAction9);
        io.muserver.RateLimitRejectionAction rateLimitRejectionAction11 = io.muserver.RateLimitRejectionAction.SEND_429;
        io.muserver.RateLimitBuilder rateLimitBuilder12 = rateLimitBuilder10.withRejectionAction(rateLimitRejectionAction11);
        io.muserver.RateLimitBuilder rateLimitBuilder13 = rateLimitBuilder7.withRejectionAction(rateLimitRejectionAction11);
        io.muserver.RateLimitBuilder rateLimitBuilder14 = rateLimitBuilder2.withRejectionAction(rateLimitRejectionAction11);
        org.junit.Assert.assertTrue("'" + rateLimitRejectionAction1 + "' != '" + io.muserver.RateLimitRejectionAction.SEND_429 + "'", rateLimitRejectionAction1.equals(io.muserver.RateLimitRejectionAction.SEND_429));
        org.junit.Assert.assertNotNull(rateLimitBuilder2);
        org.junit.Assert.assertTrue("'" + rateLimitRejectionAction4 + "' != '" + io.muserver.RateLimitRejectionAction.SEND_429 + "'", rateLimitRejectionAction4.equals(io.muserver.RateLimitRejectionAction.SEND_429));
        org.junit.Assert.assertNotNull(rateLimitBuilder5);
        org.junit.Assert.assertTrue("'" + rateLimitRejectionAction6 + "' != '" + io.muserver.RateLimitRejectionAction.SEND_429 + "'", rateLimitRejectionAction6.equals(io.muserver.RateLimitRejectionAction.SEND_429));
        org.junit.Assert.assertNotNull(rateLimitBuilder7);
        org.junit.Assert.assertTrue("'" + rateLimitRejectionAction9 + "' != '" + io.muserver.RateLimitRejectionAction.SEND_429 + "'", rateLimitRejectionAction9.equals(io.muserver.RateLimitRejectionAction.SEND_429));
        org.junit.Assert.assertNotNull(rateLimitBuilder10);
        org.junit.Assert.assertTrue("'" + rateLimitRejectionAction11 + "' != '" + io.muserver.RateLimitRejectionAction.SEND_429 + "'", rateLimitRejectionAction11.equals(io.muserver.RateLimitRejectionAction.SEND_429));
        org.junit.Assert.assertNotNull(rateLimitBuilder12);
        org.junit.Assert.assertNotNull(rateLimitBuilder13);
        org.junit.Assert.assertNotNull(rateLimitBuilder14);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_MSWORD;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        io.muserver.openapi.HeaderObjectBuilder headerObjectBuilder0 = new io.muserver.openapi.HeaderObjectBuilder();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        io.muserver.Method method0 = io.muserver.Method.DELETE;
        org.junit.Assert.assertTrue("'" + method0 + "' != '" + io.muserver.Method.DELETE + "'", method0.equals(io.muserver.Method.DELETE));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        io.muserver.openapi.InfoObjectBuilder infoObjectBuilder0 = new io.muserver.openapi.InfoObjectBuilder();
        io.muserver.openapi.LicenseObject licenseObject1 = null;
        io.muserver.openapi.InfoObjectBuilder infoObjectBuilder2 = infoObjectBuilder0.withLicense(licenseObject1);
        io.muserver.openapi.ContactObject contactObject3 = null;
        io.muserver.openapi.InfoObjectBuilder infoObjectBuilder4 = infoObjectBuilder0.withContact(contactObject3);
        org.junit.Assert.assertNotNull(infoObjectBuilder2);
        org.junit.Assert.assertNotNull(infoObjectBuilder4);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder2 = io.muserver.handlers.ResourceHandlerBuilder.fileOrClasspath("\n", "hi!");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder4 = resourceHandlerBuilder2.withDirectoryListingCSS("");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder6 = resourceHandlerBuilder2.withDirectoryListingCSS("io.muserver.MU_REQUEST");
        io.muserver.handlers.ResourceHandler resourceHandler7 = resourceHandlerBuilder6.build();
        org.junit.Assert.assertNotNull(resourceHandlerBuilder2);
        org.junit.Assert.assertNotNull(resourceHandlerBuilder4);
        org.junit.Assert.assertNotNull(resourceHandlerBuilder6);
        org.junit.Assert.assertNotNull(resourceHandler7);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_GZIP;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/gzip");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        io.muserver.ResponseState responseState0 = io.muserver.ResponseState.FINISHING;
        boolean boolean1 = responseState0.endState();
        org.junit.Assert.assertTrue("'" + responseState0 + "' != '" + io.muserver.ResponseState.FINISHING + "'", responseState0.equals(io.muserver.ResponseState.FINISHING));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        io.muserver.ResponseState responseState0 = io.muserver.ResponseState.UPGRADED;
        org.junit.Assert.assertTrue("'" + responseState0 + "' != '" + io.muserver.ResponseState.UPGRADED + "'", responseState0.equals(io.muserver.ResponseState.UPGRADED));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_JSON;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        io.muserver.MuServerBuilder muServerBuilder0 = new io.muserver.MuServerBuilder();
        javax.net.ssl.SSLContext sSLContext2 = io.muserver.SSLContextBuilder.unsignedLocalhostCert();
        io.muserver.MuServerBuilder muServerBuilder3 = muServerBuilder0.withHttpsConnection(0, sSLContext2);
        io.muserver.MuServerBuilder muServerBuilder5 = muServerBuilder3.withHttpsPort((int) (short) 1);
        org.junit.Assert.assertNotNull(sSLContext2);
        org.junit.Assert.assertNotNull(muServerBuilder3);
        org.junit.Assert.assertNotNull(muServerBuilder5);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        io.muserver.rest.UriPattern uriPattern1 = io.muserver.rest.UriPattern.uriTemplateToRegex("hi!");
        io.muserver.rest.PathMatch pathMatch3 = uriPattern1.matcher("");
        io.muserver.MuServerBuilder muServerBuilder4 = new io.muserver.MuServerBuilder();
        javax.net.ssl.SSLContext sSLContext6 = io.muserver.SSLContextBuilder.unsignedLocalhostCert();
        io.muserver.MuServerBuilder muServerBuilder7 = muServerBuilder4.withHttpsConnection(0, sSLContext6);
        io.muserver.MuServerBuilder muServerBuilder9 = new io.muserver.MuServerBuilder();
        javax.net.ssl.SSLContext sSLContext11 = io.muserver.SSLContextBuilder.unsignedLocalhostCert();
        io.muserver.MuServerBuilder muServerBuilder12 = muServerBuilder9.withHttpsConnection(0, sSLContext11);
        io.muserver.MuServerBuilder muServerBuilder13 = muServerBuilder7.withHttpsConnection(100, sSLContext11);
        boolean boolean14 = uriPattern1.equals((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(uriPattern1);
        org.junit.Assert.assertNotNull(pathMatch3);
        org.junit.Assert.assertNotNull(sSLContext6);
        org.junit.Assert.assertNotNull(muServerBuilder7);
        org.junit.Assert.assertNotNull(sSLContext11);
        org.junit.Assert.assertNotNull(muServerBuilder12);
        org.junit.Assert.assertNotNull(muServerBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.Mutils.copy(inputStream0, outputStream1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        io.muserver.rest.UriPattern uriPattern1 = io.muserver.rest.UriPattern.uriTemplateToRegex("hi!");
        io.muserver.rest.PathMatch pathMatch3 = uriPattern1.matcher("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = pathMatch3.params();
        org.junit.Assert.assertNotNull(uriPattern1);
        org.junit.Assert.assertNotNull(pathMatch3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.TEXT_CSV;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        io.muserver.openapi.ComponentsObjectBuilder componentsObjectBuilder0 = new io.muserver.openapi.ComponentsObjectBuilder();
        java.util.Map<java.lang.String, io.muserver.openapi.SchemaObject> strMap1 = null;
        io.muserver.openapi.ComponentsObjectBuilder componentsObjectBuilder2 = componentsObjectBuilder0.withSchemas(strMap1);
        java.util.Map<java.lang.String, io.muserver.openapi.ParameterObject> strMap3 = null;
        io.muserver.openapi.ComponentsObjectBuilder componentsObjectBuilder4 = componentsObjectBuilder2.withParameters(strMap3);
        org.junit.Assert.assertNotNull(componentsObjectBuilder2);
        org.junit.Assert.assertNotNull(componentsObjectBuilder4);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.VARY;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "vary");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        io.muserver.MuServerBuilder muServerBuilder0 = new io.muserver.MuServerBuilder();
        javax.net.ssl.SSLContext sSLContext2 = io.muserver.SSLContextBuilder.unsignedLocalhostCert();
        io.muserver.MuServerBuilder muServerBuilder3 = muServerBuilder0.withHttpsConnection(0, sSLContext2);
        java.util.concurrent.ExecutorService executorService4 = null;
        io.muserver.MuServerBuilder muServerBuilder5 = muServerBuilder0.withHandlerExecutor(executorService4);
        io.muserver.UnhandledExceptionHandler unhandledExceptionHandler6 = null;
        io.muserver.MuServerBuilder muServerBuilder7 = muServerBuilder5.withExceptionHandler(unhandledExceptionHandler6);
        org.junit.Assert.assertNotNull(sSLContext2);
        org.junit.Assert.assertNotNull(muServerBuilder3);
        org.junit.Assert.assertNotNull(muServerBuilder5);
        org.junit.Assert.assertNotNull(muServerBuilder7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.lang.String str1 = io.muserver.Mutils.urlEncode("io.muserver.RESOURCE_INFO");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "io.muserver.RESOURCE_INFO" + "'", str1, "io.muserver.RESOURCE_INFO");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.CONTENT_BASE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "content-base");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder0 = io.muserver.handlers.CORSHandlerBuilder.corsHandler();
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder1 = io.muserver.rest.CORSConfigBuilder.disabled();
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder2 = cORSHandlerBuilder0.withCORSConfig(cORSConfigBuilder1);
        java.util.List<java.lang.String> strList3 = io.muserver.openapi.ParameterObject.allowedStyles();
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder4 = cORSConfigBuilder1.withExposedHeaders((java.util.Collection<java.lang.String>) strList3);
        org.junit.Assert.assertNotNull(cORSHandlerBuilder0);
        org.junit.Assert.assertNotNull(cORSConfigBuilder1);
        org.junit.Assert.assertNotNull(cORSHandlerBuilder2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(cORSConfigBuilder4);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        io.muserver.handlers.ResourceHandler.Builder builder1 = io.muserver.handlers.ResourceHandler.classpathHandler("\n");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder4 = io.muserver.handlers.ResourceHandlerBuilder.fileOrClasspath("\n", "hi!");
        java.util.HashMap<java.lang.String, io.muserver.handlers.ResourceType> strMap5 = io.muserver.handlers.ResourceType.getDefaultMapping();
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder6 = resourceHandlerBuilder4.withExtensionToResourceType((java.util.Map<java.lang.String, io.muserver.handlers.ResourceType>) strMap5);
        io.muserver.handlers.ResourceHandler.Builder builder7 = builder1.withExtensionToResourceType((java.util.Map<java.lang.String, io.muserver.handlers.ResourceType>) strMap5);
        io.muserver.handlers.ResourceHandler.Builder builder9 = builder7.withPathToServeFrom("javax.ws.rs.ext.RuntimeDelegate");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(resourceHandlerBuilder4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(resourceHandlerBuilder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        io.muserver.openapi.HeaderObjectBuilder headerObjectBuilder0 = io.muserver.openapi.HeaderObjectBuilder.headerObject();
        io.muserver.openapi.HeaderObjectBuilder headerObjectBuilder2 = headerObjectBuilder0.withDescription("javax.ws.rs.ext.RuntimeDelegate");
        java.util.Map<java.lang.String, io.muserver.openapi.ExampleObject> strMap3 = null;
        io.muserver.openapi.HeaderObjectBuilder headerObjectBuilder4 = headerObjectBuilder0.withExamples(strMap3);
        io.muserver.openapi.HeaderObjectBuilder headerObjectBuilder6 = headerObjectBuilder4.withDeprecated((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(headerObjectBuilder0);
        org.junit.Assert.assertNotNull(headerObjectBuilder2);
        org.junit.Assert.assertNotNull(headerObjectBuilder4);
        org.junit.Assert.assertNotNull(headerObjectBuilder6);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        io.muserver.HttpsConfigBuilder httpsConfigBuilder0 = io.muserver.HttpsConfigBuilder.unsignedLocalhost();
        javax.net.ssl.KeyManagerFactory keyManagerFactory1 = null;
        io.muserver.SSLContextBuilder sSLContextBuilder2 = httpsConfigBuilder0.withKeyManagerFactory(keyManagerFactory1);
        io.muserver.SSLContextBuilder sSLContextBuilder4 = sSLContextBuilder2.withDefaultAlias("by=;for=;host=hi!;proto=");
        org.junit.Assert.assertNotNull(httpsConfigBuilder0);
        org.junit.Assert.assertNotNull(sSLContextBuilder2);
        org.junit.Assert.assertNotNull(sSLContextBuilder4);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        io.muserver.openapi.ExternalDocumentationObjectBuilder externalDocumentationObjectBuilder0 = io.muserver.openapi.ExternalDocumentationObjectBuilder.externalDocumentationObject();
        org.junit.Assert.assertNotNull(externalDocumentationObjectBuilder0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder1 = io.muserver.handlers.ResourceHandlerBuilder.fileHandler("PathMatch{matches=false, params={}}");
            org.junit.Assert.fail("Expected exception of type io.muserver.MuException; message: PathMatch{matches=false, params={}} is not a directory");
        } catch (io.muserver.MuException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder0 = io.muserver.rest.CORSConfigBuilder.disabled();
        java.lang.String[] strArray2 = new java.lang.String[] { "\n" };
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder3 = cORSConfigBuilder0.withAllowedHeaders(strArray2);
        org.junit.Assert.assertNotNull(cORSConfigBuilder0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(cORSConfigBuilder3);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        io.muserver.handlers.ResourceHandler.Builder builder2 = io.muserver.handlers.ResourceHandler.fileOrClasspath("\n", "io.muserver.RESOURCE_INFO");
        io.muserver.handlers.ResourceHandler.Builder builder4 = builder2.withPathToServeFrom("by=;for=;host=hi!;proto=");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_X_BZIP2;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.DEFAULT;
        boolean boolean1 = resourceType0.gzip;
        java.lang.CharSequence charSequence2 = resourceType0.mimeType();
        org.junit.Assert.assertNotNull(resourceType0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charSequence2);
        org.junit.Assert.assertEquals(charSequence2.toString(), "application/octet-stream");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        io.muserver.openapi.CallbackObjectBuilder callbackObjectBuilder0 = io.muserver.openapi.CallbackObjectBuilder.callbackObject();
        java.util.Map<java.lang.String, io.muserver.openapi.PathItemObject> strMap1 = null;
        io.muserver.openapi.CallbackObjectBuilder callbackObjectBuilder2 = callbackObjectBuilder0.withCallbacks(strMap1);
        org.junit.Assert.assertNotNull(callbackObjectBuilder0);
        org.junit.Assert.assertNotNull(callbackObjectBuilder2);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.IMAGE_X_ICON;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "image/x-icon");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        io.muserver.rest.SchemaObjectCustomizerTarget schemaObjectCustomizerTarget0 = io.muserver.rest.SchemaObjectCustomizerTarget.RESPONSE_BODY;
        org.junit.Assert.assertTrue("'" + schemaObjectCustomizerTarget0 + "' != '" + io.muserver.rest.SchemaObjectCustomizerTarget.RESPONSE_BODY + "'", schemaObjectCustomizerTarget0.equals(io.muserver.rest.SchemaObjectCustomizerTarget.RESPONSE_BODY));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        io.muserver.CookieBuilder cookieBuilder0 = io.muserver.CookieBuilder.newSecureCookie();
        io.muserver.CookieBuilder cookieBuilder2 = cookieBuilder0.withMaxAgeInSeconds((long) (short) 0);
        io.muserver.CookieBuilder cookieBuilder4 = cookieBuilder0.withDomain("");
        io.muserver.CookieBuilder cookieBuilder6 = cookieBuilder0.withValue("hi!");
        org.junit.Assert.assertNotNull(cookieBuilder0);
        org.junit.Assert.assertNotNull(cookieBuilder2);
        org.junit.Assert.assertNotNull(cookieBuilder4);
        org.junit.Assert.assertNotNull(cookieBuilder6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        io.muserver.openapi.OpenAPIObjectBuilder openAPIObjectBuilder0 = io.muserver.openapi.OpenAPIObjectBuilder.openAPIObject();
        io.muserver.openapi.PathsObject pathsObject1 = null;
        io.muserver.openapi.OpenAPIObjectBuilder openAPIObjectBuilder2 = openAPIObjectBuilder0.withPaths(pathsObject1);
        io.muserver.openapi.ServerObject[] serverObjectArray3 = new io.muserver.openapi.ServerObject[] {};
        java.util.ArrayList<io.muserver.openapi.ServerObject> serverObjectList4 = new java.util.ArrayList<io.muserver.openapi.ServerObject>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<io.muserver.openapi.ServerObject>) serverObjectList4, serverObjectArray3);
        io.muserver.openapi.OpenAPIObjectBuilder openAPIObjectBuilder6 = openAPIObjectBuilder0.withServers((java.util.List<io.muserver.openapi.ServerObject>) serverObjectList4);
        org.junit.Assert.assertNotNull(openAPIObjectBuilder0);
        org.junit.Assert.assertNotNull(openAPIObjectBuilder2);
        org.junit.Assert.assertNotNull(serverObjectArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(openAPIObjectBuilder6);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.IMAGE_X_ICON;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        io.muserver.openapi.LicenseObject licenseObject0 = io.muserver.openapi.LicenseObjectBuilder.TheUnlicense();
        org.junit.Assert.assertNotNull(licenseObject0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.PROXY_REVALIDATE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "proxy-revalidate");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        io.muserver.WebsocketSessionState websocketSessionState0 = io.muserver.WebsocketSessionState.CLIENT_CLOSING;
        boolean boolean1 = websocketSessionState0.endState();
        org.junit.Assert.assertTrue("'" + websocketSessionState0 + "' != '" + io.muserver.WebsocketSessionState.CLIENT_CLOSING + "'", websocketSessionState0.equals(io.muserver.WebsocketSessionState.CLIENT_CLOSING));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        io.muserver.openapi.TagObjectBuilder tagObjectBuilder0 = io.muserver.openapi.TagObjectBuilder.tagObject();
        io.muserver.openapi.TagObjectBuilder tagObjectBuilder2 = tagObjectBuilder0.withDescription("javax.ws.rs.ext.RuntimeDelegate");
        io.muserver.openapi.TagObjectBuilder tagObjectBuilder4 = tagObjectBuilder0.withDescription("PathMatch{matches=false, params={}}");
        org.junit.Assert.assertNotNull(tagObjectBuilder0);
        org.junit.Assert.assertNotNull(tagObjectBuilder2);
        org.junit.Assert.assertNotNull(tagObjectBuilder4);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.NOSNIFF;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "nosniff");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.ACCESS_CONTROL_ALLOW_CREDENTIALS;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "access-control-allow-credentials");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.lang.String str1 = io.muserver.Mutils.urlDecode("%0A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        io.muserver.openapi.PathsObjectBuilder pathsObjectBuilder0 = new io.muserver.openapi.PathsObjectBuilder();
        io.muserver.openapi.PathsObject pathsObject1 = pathsObjectBuilder0.build();
        org.junit.Assert.assertNotNull(pathsObject1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.VIDEO_OGG;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        io.muserver.openapi.OperationObjectBuilder operationObjectBuilder0 = new io.muserver.openapi.OperationObjectBuilder();
        io.muserver.openapi.RequestBodyObject requestBodyObject1 = null;
        io.muserver.openapi.OperationObjectBuilder operationObjectBuilder2 = operationObjectBuilder0.withRequestBody(requestBodyObject1);
        io.muserver.openapi.ServerObject[] serverObjectArray3 = new io.muserver.openapi.ServerObject[] {};
        java.util.ArrayList<io.muserver.openapi.ServerObject> serverObjectList4 = new java.util.ArrayList<io.muserver.openapi.ServerObject>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<io.muserver.openapi.ServerObject>) serverObjectList4, serverObjectArray3);
        io.muserver.openapi.OperationObjectBuilder operationObjectBuilder6 = operationObjectBuilder0.withServers((java.util.List<io.muserver.openapi.ServerObject>) serverObjectList4);
        io.muserver.openapi.ParameterObject[] parameterObjectArray7 = new io.muserver.openapi.ParameterObject[] {};
        java.util.ArrayList<io.muserver.openapi.ParameterObject> parameterObjectList8 = new java.util.ArrayList<io.muserver.openapi.ParameterObject>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<io.muserver.openapi.ParameterObject>) parameterObjectList8, parameterObjectArray7);
        io.muserver.openapi.OperationObjectBuilder operationObjectBuilder10 = operationObjectBuilder0.withParameters((java.util.List<io.muserver.openapi.ParameterObject>) parameterObjectList8);
        org.junit.Assert.assertNotNull(operationObjectBuilder2);
        org.junit.Assert.assertNotNull(serverObjectArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(operationObjectBuilder6);
        org.junit.Assert.assertNotNull(parameterObjectArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(operationObjectBuilder10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.ALLOW;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "allow");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.VIDEO_X_MSVIDEO;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        io.muserver.openapi.EncodingObjectBuilder encodingObjectBuilder0 = io.muserver.openapi.EncodingObjectBuilder.encodingObject();
        io.muserver.openapi.EncodingObject encodingObject1 = encodingObjectBuilder0.build();
        io.muserver.openapi.EncodingObjectBuilder encodingObjectBuilder3 = encodingObjectBuilder0.withAllowReserved(false);
        org.junit.Assert.assertNotNull(encodingObjectBuilder0);
        org.junit.Assert.assertNotNull(encodingObject1);
        org.junit.Assert.assertNotNull(encodingObjectBuilder3);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        io.muserver.openapi.OAuthFlowsObjectBuilder oAuthFlowsObjectBuilder0 = io.muserver.openapi.OAuthFlowsObjectBuilder.oAuthFlowsObject();
        io.muserver.openapi.OAuthFlowObject oAuthFlowObject1 = null;
        io.muserver.openapi.OAuthFlowsObjectBuilder oAuthFlowsObjectBuilder2 = oAuthFlowsObjectBuilder0.withAuthorizationCode(oAuthFlowObject1);
        io.muserver.openapi.OAuthFlowObject oAuthFlowObject3 = null;
        io.muserver.openapi.OAuthFlowsObjectBuilder oAuthFlowsObjectBuilder4 = oAuthFlowsObjectBuilder2.withAuthorizationCode(oAuthFlowObject3);
        org.junit.Assert.assertNotNull(oAuthFlowsObjectBuilder0);
        org.junit.Assert.assertNotNull(oAuthFlowsObjectBuilder2);
        org.junit.Assert.assertNotNull(oAuthFlowsObjectBuilder4);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_X_TAR;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/x-tar");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        io.muserver.HttpsConfigBuilder httpsConfigBuilder0 = io.muserver.HttpsConfigBuilder.unsignedLocalhost();
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.SSLContextBuilder sSLContextBuilder2 = httpsConfigBuilder0.withKeystoreFromClasspath("\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Could not find ?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpsConfigBuilder0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        io.muserver.openapi.ComponentsObjectBuilder componentsObjectBuilder0 = new io.muserver.openapi.ComponentsObjectBuilder();
        java.util.Map<java.lang.String, io.muserver.openapi.SchemaObject> strMap1 = null;
        io.muserver.openapi.ComponentsObjectBuilder componentsObjectBuilder2 = componentsObjectBuilder0.withSchemas(strMap1);
        java.util.Map<java.lang.String, io.muserver.openapi.CallbackObject> strMap3 = null;
        io.muserver.openapi.ComponentsObjectBuilder componentsObjectBuilder4 = componentsObjectBuilder0.withCallbacks(strMap3);
        org.junit.Assert.assertNotNull(componentsObjectBuilder2);
        org.junit.Assert.assertNotNull(componentsObjectBuilder4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        io.muserver.openapi.PathsObjectBuilder pathsObjectBuilder0 = io.muserver.openapi.PathsObjectBuilder.pathsObject();
        org.junit.Assert.assertNotNull(pathsObjectBuilder0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.TEXT_MARKDOWN_UTF8;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "text/markdown;charset=utf-8");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        io.muserver.HttpsConfigBuilder httpsConfigBuilder0 = new io.muserver.HttpsConfigBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        io.muserver.HttpsConfigBuilder httpsConfigBuilder3 = httpsConfigBuilder0.withProtocols(strArray2);
        javax.net.ssl.KeyManagerFactory keyManagerFactory4 = null;
        io.muserver.HttpsConfigBuilder httpsConfigBuilder5 = httpsConfigBuilder0.withKeyManagerFactory(keyManagerFactory4);
        io.muserver.HttpsConfigBuilder httpsConfigBuilder6 = io.muserver.HttpsConfigBuilder.unsignedLocalhost();
        javax.net.ssl.KeyManagerFactory keyManagerFactory7 = null;
        io.muserver.SSLContextBuilder sSLContextBuilder8 = httpsConfigBuilder6.withKeyManagerFactory(keyManagerFactory7);
        io.muserver.HttpsConfigBuilder httpsConfigBuilder10 = httpsConfigBuilder6.withKeystorePassword("by=;for=;host=hi!;proto=");
        char[] charArray12 = new char[] { ' ' };
        io.muserver.SSLContextBuilder sSLContextBuilder13 = httpsConfigBuilder6.withKeystorePassword(charArray12);
        io.muserver.HttpsConfigBuilder httpsConfigBuilder14 = httpsConfigBuilder5.withKeyPassword(charArray12);
        io.muserver.HttpsConfigBuilder httpsConfigBuilder15 = new io.muserver.HttpsConfigBuilder();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        io.muserver.HttpsConfigBuilder httpsConfigBuilder18 = httpsConfigBuilder15.withProtocols(strArray17);
        javax.net.ssl.KeyManagerFactory keyManagerFactory19 = null;
        io.muserver.HttpsConfigBuilder httpsConfigBuilder20 = httpsConfigBuilder15.withKeyManagerFactory(keyManagerFactory19);
        io.muserver.HttpsConfigBuilder httpsConfigBuilder21 = io.muserver.HttpsConfigBuilder.unsignedLocalhost();
        javax.net.ssl.KeyManagerFactory keyManagerFactory22 = null;
        io.muserver.SSLContextBuilder sSLContextBuilder23 = httpsConfigBuilder21.withKeyManagerFactory(keyManagerFactory22);
        io.muserver.HttpsConfigBuilder httpsConfigBuilder25 = httpsConfigBuilder21.withKeystorePassword("by=;for=;host=hi!;proto=");
        char[] charArray27 = new char[] { ' ' };
        io.muserver.SSLContextBuilder sSLContextBuilder28 = httpsConfigBuilder21.withKeystorePassword(charArray27);
        io.muserver.HttpsConfigBuilder httpsConfigBuilder29 = httpsConfigBuilder20.withKeyPassword(charArray27);
        io.muserver.SSLContextBuilder sSLContextBuilder30 = httpsConfigBuilder5.withKeystorePassword(charArray27);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(httpsConfigBuilder3);
        org.junit.Assert.assertNotNull(httpsConfigBuilder5);
        org.junit.Assert.assertNotNull(httpsConfigBuilder6);
        org.junit.Assert.assertNotNull(sSLContextBuilder8);
        org.junit.Assert.assertNotNull(httpsConfigBuilder10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ]");
        org.junit.Assert.assertNotNull(sSLContextBuilder13);
        org.junit.Assert.assertNotNull(httpsConfigBuilder14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(httpsConfigBuilder18);
        org.junit.Assert.assertNotNull(httpsConfigBuilder20);
        org.junit.Assert.assertNotNull(httpsConfigBuilder21);
        org.junit.Assert.assertNotNull(sSLContextBuilder23);
        org.junit.Assert.assertNotNull(httpsConfigBuilder25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ ]");
        org.junit.Assert.assertNotNull(sSLContextBuilder28);
        org.junit.Assert.assertNotNull(httpsConfigBuilder29);
        org.junit.Assert.assertNotNull(sSLContextBuilder30);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        io.muserver.HttpsConfigBuilder httpsConfigBuilder0 = io.muserver.HttpsConfigBuilder.unsignedLocalhost();
        javax.net.ssl.KeyManagerFactory keyManagerFactory1 = null;
        io.muserver.SSLContextBuilder sSLContextBuilder2 = httpsConfigBuilder0.withKeyManagerFactory(keyManagerFactory1);
        io.muserver.HttpsConfigBuilder httpsConfigBuilder4 = httpsConfigBuilder0.withKeystorePassword("by=;for=;host=hi!;proto=");
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.SSLContextBuilder sSLContextBuilder6 = httpsConfigBuilder0.withKeystore(file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpsConfigBuilder0);
        org.junit.Assert.assertNotNull(sSLContextBuilder2);
        org.junit.Assert.assertNotNull(httpsConfigBuilder4);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        io.muserver.handlers.HttpsRedirectorBuilder httpsRedirectorBuilder0 = new io.muserver.handlers.HttpsRedirectorBuilder();
        io.muserver.handlers.HttpsRedirectorBuilder httpsRedirectorBuilder2 = httpsRedirectorBuilder0.withHSTSPreload(false);
        org.junit.Assert.assertNotNull(httpsRedirectorBuilder2);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        io.muserver.RateLimitBuilder rateLimitBuilder0 = new io.muserver.RateLimitBuilder();
        io.muserver.RateLimit rateLimit1 = rateLimitBuilder0.build();
        org.junit.Assert.assertNotNull(rateLimit1);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.FONT_OTF;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "font/otf");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        io.muserver.CookieBuilder cookieBuilder0 = new io.muserver.CookieBuilder();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        io.muserver.WebsocketSessionState websocketSessionState0 = io.muserver.WebsocketSessionState.SERVER_CLOSED;
        org.junit.Assert.assertTrue("'" + websocketSessionState0 + "' != '" + io.muserver.WebsocketSessionState.SERVER_CLOSED + "'", websocketSessionState0.equals(io.muserver.WebsocketSessionState.SERVER_CLOSED));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        io.muserver.WebsocketSessionState websocketSessionState0 = io.muserver.WebsocketSessionState.OPEN;
        org.junit.Assert.assertTrue("'" + websocketSessionState0 + "' != '" + io.muserver.WebsocketSessionState.OPEN + "'", websocketSessionState0.equals(io.muserver.WebsocketSessionState.OPEN));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.APPLICATION_VND_MS_FONTOBJECT;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "application/vnd.ms-fontobject");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        io.muserver.ContextHandlerBuilder contextHandlerBuilder0 = new io.muserver.ContextHandlerBuilder();
        io.muserver.Method method1 = io.muserver.Method.PUT;
        io.muserver.RouteHandler routeHandler3 = null;
        io.muserver.MuHandler muHandler4 = io.muserver.Routes.route(method1, "", routeHandler3);
        io.muserver.RouteHandler routeHandler6 = null;
        io.muserver.ContextHandlerBuilder contextHandlerBuilder7 = contextHandlerBuilder0.addHandler(method1, "by=;for=;host=hi!;proto=", routeHandler6);
        io.muserver.ContextHandlerBuilder contextHandlerBuilder9 = contextHandlerBuilder0.withPath("javax.ws.rs.ext.RuntimeDelegate");
        org.junit.Assert.assertTrue("'" + method1 + "' != '" + io.muserver.Method.PUT + "'", method1.equals(io.muserver.Method.PUT));
        org.junit.Assert.assertNotNull(muHandler4);
        org.junit.Assert.assertNotNull(contextHandlerBuilder7);
        org.junit.Assert.assertNotNull(contextHandlerBuilder9);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_PDF;
        java.lang.CharSequence charSequence1 = resourceType0.mimeType();
        org.junit.Assert.assertNotNull(resourceType0);
        org.junit.Assert.assertNotNull(charSequence1);
        org.junit.Assert.assertEquals(charSequence1.toString(), "application/pdf");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        io.muserver.rest.UriPattern uriPattern1 = io.muserver.rest.UriPattern.uriTemplateToRegex("hi!");
        io.muserver.rest.PathMatch pathMatch3 = uriPattern1.matcher("");
        io.muserver.rest.PathMatch pathMatch5 = uriPattern1.matcher("");
        org.junit.Assert.assertNotNull(uriPattern1);
        org.junit.Assert.assertNotNull(pathMatch3);
        org.junit.Assert.assertNotNull(pathMatch5);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        java.lang.String str1 = io.muserver.Mutils.urlDecode("javax.ws.rs.ext.RuntimeDelegate");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javax.ws.rs.ext.RuntimeDelegate" + "'", str1, "javax.ws.rs.ext.RuntimeDelegate");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        io.muserver.openapi.TagObjectBuilder tagObjectBuilder0 = new io.muserver.openapi.TagObjectBuilder();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder2 = io.muserver.handlers.ResourceHandlerBuilder.fileOrClasspath("\n", "hi!");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder4 = resourceHandlerBuilder2.withDirectoryListingCSS("");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder6 = resourceHandlerBuilder2.withDirectoryListingCSS("io.muserver.MU_REQUEST");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder8 = resourceHandlerBuilder6.withDirectoryListingCSS("io.muserver.MU_REQUEST");
        org.junit.Assert.assertNotNull(resourceHandlerBuilder2);
        org.junit.Assert.assertNotNull(resourceHandlerBuilder4);
        org.junit.Assert.assertNotNull(resourceHandlerBuilder6);
        org.junit.Assert.assertNotNull(resourceHandlerBuilder8);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        java.lang.String str1 = io.muserver.Mutils.htmlEncode("javax.ws.rs.ext.RuntimeDelegate");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "javax.ws.rs.ext.RuntimeDelegate" + "'", str1, "javax.ws.rs.ext.RuntimeDelegate");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        io.muserver.handlers.ResourceHandler.Builder builder2 = io.muserver.handlers.ResourceHandler.fileOrClasspath("", "by=;for=;host=hi!;proto=");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        io.muserver.WebsocketSessionState websocketSessionState0 = io.muserver.WebsocketSessionState.DISCONNECTED;
        org.junit.Assert.assertTrue("'" + websocketSessionState0 + "' != '" + io.muserver.WebsocketSessionState.DISCONNECTED + "'", websocketSessionState0.equals(io.muserver.WebsocketSessionState.DISCONNECTED));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.X_FORWARDED_PORT;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "x-forwarded-port");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.ETAG;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "etag");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.PROXY_AUTHENTICATE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "proxy-authenticate");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        io.muserver.HttpsConfigBuilder httpsConfigBuilder0 = new io.muserver.HttpsConfigBuilder();
        io.muserver.HttpsConfigBuilder httpsConfigBuilder2 = httpsConfigBuilder0.withDefaultAlias("io.muserver.MU_REQUEST");
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.HttpsConfigBuilder httpsConfigBuilder4 = httpsConfigBuilder2.withKeystoreFromClasspath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Could not find hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpsConfigBuilder2);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        io.muserver.RateLimitBuilder rateLimitBuilder0 = new io.muserver.RateLimitBuilder();
        io.muserver.RateLimitRejectionAction rateLimitRejectionAction1 = io.muserver.RateLimitRejectionAction.SEND_429;
        io.muserver.RateLimitBuilder rateLimitBuilder2 = rateLimitBuilder0.withRejectionAction(rateLimitRejectionAction1);
        io.muserver.RateLimitBuilder rateLimitBuilder3 = new io.muserver.RateLimitBuilder();
        io.muserver.RateLimitRejectionAction rateLimitRejectionAction4 = io.muserver.RateLimitRejectionAction.SEND_429;
        io.muserver.RateLimitBuilder rateLimitBuilder5 = rateLimitBuilder3.withRejectionAction(rateLimitRejectionAction4);
        io.muserver.RateLimitRejectionAction rateLimitRejectionAction6 = io.muserver.RateLimitRejectionAction.SEND_429;
        io.muserver.RateLimitBuilder rateLimitBuilder7 = rateLimitBuilder5.withRejectionAction(rateLimitRejectionAction6);
        io.muserver.RateLimitBuilder rateLimitBuilder8 = new io.muserver.RateLimitBuilder();
        io.muserver.RateLimitRejectionAction rateLimitRejectionAction9 = io.muserver.RateLimitRejectionAction.SEND_429;
        io.muserver.RateLimitBuilder rateLimitBuilder10 = rateLimitBuilder8.withRejectionAction(rateLimitRejectionAction9);
        io.muserver.RateLimitRejectionAction rateLimitRejectionAction11 = io.muserver.RateLimitRejectionAction.SEND_429;
        io.muserver.RateLimitBuilder rateLimitBuilder12 = rateLimitBuilder10.withRejectionAction(rateLimitRejectionAction11);
        io.muserver.RateLimitBuilder rateLimitBuilder13 = rateLimitBuilder7.withRejectionAction(rateLimitRejectionAction11);
        io.muserver.RateLimitBuilder rateLimitBuilder14 = rateLimitBuilder0.withRejectionAction(rateLimitRejectionAction11);
        org.junit.Assert.assertTrue("'" + rateLimitRejectionAction1 + "' != '" + io.muserver.RateLimitRejectionAction.SEND_429 + "'", rateLimitRejectionAction1.equals(io.muserver.RateLimitRejectionAction.SEND_429));
        org.junit.Assert.assertNotNull(rateLimitBuilder2);
        org.junit.Assert.assertTrue("'" + rateLimitRejectionAction4 + "' != '" + io.muserver.RateLimitRejectionAction.SEND_429 + "'", rateLimitRejectionAction4.equals(io.muserver.RateLimitRejectionAction.SEND_429));
        org.junit.Assert.assertNotNull(rateLimitBuilder5);
        org.junit.Assert.assertTrue("'" + rateLimitRejectionAction6 + "' != '" + io.muserver.RateLimitRejectionAction.SEND_429 + "'", rateLimitRejectionAction6.equals(io.muserver.RateLimitRejectionAction.SEND_429));
        org.junit.Assert.assertNotNull(rateLimitBuilder7);
        org.junit.Assert.assertTrue("'" + rateLimitRejectionAction9 + "' != '" + io.muserver.RateLimitRejectionAction.SEND_429 + "'", rateLimitRejectionAction9.equals(io.muserver.RateLimitRejectionAction.SEND_429));
        org.junit.Assert.assertNotNull(rateLimitBuilder10);
        org.junit.Assert.assertTrue("'" + rateLimitRejectionAction11 + "' != '" + io.muserver.RateLimitRejectionAction.SEND_429 + "'", rateLimitRejectionAction11.equals(io.muserver.RateLimitRejectionAction.SEND_429));
        org.junit.Assert.assertNotNull(rateLimitBuilder12);
        org.junit.Assert.assertNotNull(rateLimitBuilder13);
        org.junit.Assert.assertNotNull(rateLimitBuilder14);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        io.muserver.openapi.ExampleObjectBuilder exampleObjectBuilder0 = new io.muserver.openapi.ExampleObjectBuilder();
        java.net.URI uRI1 = null;
        io.muserver.openapi.ExampleObjectBuilder exampleObjectBuilder2 = exampleObjectBuilder0.withExternalValue(uRI1);
        io.muserver.openapi.ExampleObject exampleObject3 = exampleObjectBuilder0.build();
        java.net.URI uRI4 = exampleObject3.externalValue();
        java.lang.Object obj5 = exampleObject3.value;
        org.junit.Assert.assertNotNull(exampleObjectBuilder2);
        org.junit.Assert.assertNotNull(exampleObject3);
        org.junit.Assert.assertNull(uRI4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.IMAGE_WEBP;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "image/webp");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.MUST_REVALIDATE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "must-revalidate");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        io.muserver.openapi.ParameterObjectBuilder parameterObjectBuilder0 = io.muserver.openapi.ParameterObjectBuilder.parameterObject();
        io.muserver.openapi.ParameterObjectBuilder parameterObjectBuilder2 = parameterObjectBuilder0.withDescription("");
        org.junit.Assert.assertNotNull(parameterObjectBuilder0);
        org.junit.Assert.assertNotNull(parameterObjectBuilder2);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder0 = io.muserver.rest.CORSConfigBuilder.corsConfig();
        org.junit.Assert.assertNotNull(cORSConfigBuilder0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        io.muserver.ParameterizedHeader parameterizedHeader1 = io.muserver.ParameterizedHeader.fromString("io.muserver.MU_REQUEST");
        java.lang.String str3 = parameterizedHeader1.parameter("io.muserver.MU_REQUEST");
        io.muserver.openapi.EncodingObjectBuilder encodingObjectBuilder4 = io.muserver.openapi.EncodingObjectBuilder.encodingObject();
        boolean boolean5 = parameterizedHeader1.equals((java.lang.Object) encodingObjectBuilder4);
        org.junit.Assert.assertNotNull(parameterizedHeader1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(encodingObjectBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        java.util.List<io.muserver.ParameterizedHeaderWithValue> parameterizedHeaderWithValueList1 = io.muserver.ParameterizedHeaderWithValue.fromString("PathMatch{matches=false, params={}}");
        org.junit.Assert.assertNotNull(parameterizedHeaderWithValueList1);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        io.muserver.HttpsConfigBuilder httpsConfigBuilder0 = new io.muserver.HttpsConfigBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        io.muserver.HttpsConfigBuilder httpsConfigBuilder3 = httpsConfigBuilder0.withProtocols(strArray2);
        io.muserver.rest.RestHandlerBuilder restHandlerBuilder4 = new io.muserver.rest.RestHandlerBuilder((java.lang.Object[]) strArray2);
        javax.ws.rs.ext.WriterInterceptor writerInterceptor5 = null;
        io.muserver.rest.RestHandlerBuilder restHandlerBuilder6 = restHandlerBuilder4.addWriterInterceptor(writerInterceptor5);
        javax.ws.rs.ext.ReaderInterceptor readerInterceptor7 = null;
        io.muserver.rest.RestHandlerBuilder restHandlerBuilder8 = restHandlerBuilder6.addReaderInterceptor(readerInterceptor7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(httpsConfigBuilder3);
        org.junit.Assert.assertNotNull(restHandlerBuilder6);
        org.junit.Assert.assertNotNull(restHandlerBuilder8);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_TYPESCRIPT;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder0 = io.muserver.handlers.CORSHandlerBuilder.corsHandler();
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder1 = new io.muserver.rest.CORSConfigBuilder();
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder2 = cORSHandlerBuilder0.withCORSConfig(cORSConfigBuilder1);
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder3 = io.muserver.handlers.CORSHandlerBuilder.corsHandler();
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder4 = io.muserver.rest.CORSConfigBuilder.disabled();
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder5 = cORSHandlerBuilder3.withCORSConfig(cORSConfigBuilder4);
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder6 = cORSConfigBuilder4.withAllOriginsAllowed();
        io.muserver.handlers.ResourceType resourceType7 = io.muserver.handlers.ResourceType.FONT_WOFF;
        io.muserver.handlers.ResourceType[] resourceTypeArray8 = new io.muserver.handlers.ResourceType[] { resourceType7 };
        java.util.ArrayList<io.muserver.handlers.ResourceType> resourceTypeList9 = new java.util.ArrayList<io.muserver.handlers.ResourceType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<io.muserver.handlers.ResourceType>) resourceTypeList9, resourceTypeArray8);
        java.util.Set<java.lang.String> strSet11 = io.muserver.handlers.ResourceType.gzippableMimeTypes((java.util.Collection<io.muserver.handlers.ResourceType>) resourceTypeList9);
        io.muserver.handlers.ResourceType resourceType12 = io.muserver.handlers.ResourceType.FONT_WOFF;
        io.muserver.handlers.ResourceType[] resourceTypeArray13 = new io.muserver.handlers.ResourceType[] { resourceType12 };
        java.util.ArrayList<io.muserver.handlers.ResourceType> resourceTypeList14 = new java.util.ArrayList<io.muserver.handlers.ResourceType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<io.muserver.handlers.ResourceType>) resourceTypeList14, resourceTypeArray13);
        java.util.Set<java.lang.String> strSet16 = io.muserver.handlers.ResourceType.gzippableMimeTypes((java.util.Collection<io.muserver.handlers.ResourceType>) resourceTypeList14);
        java.util.Collection[] collectionArray18 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.String>[] strCollectionArray19 = (java.util.Collection<java.lang.String>[]) collectionArray18;
        strCollectionArray19[0] = strSet11;
        strCollectionArray19[1] = strSet16;
        java.util.Collection<java.lang.String> strCollection24 = io.muserver.Mutils.coalesce(strCollectionArray19);
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder25 = cORSConfigBuilder4.withExposedHeaders(strCollection24);
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder26 = cORSHandlerBuilder2.withCORSConfig(cORSConfigBuilder25);
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder28 = cORSConfigBuilder25.withAllowCredentials(false);
        java.lang.String[] strArray30 = new java.lang.String[] { "%0A" };
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder31 = cORSConfigBuilder28.withAllowedHeaders(strArray30);
        org.junit.Assert.assertNotNull(cORSHandlerBuilder0);
        org.junit.Assert.assertNotNull(cORSHandlerBuilder2);
        org.junit.Assert.assertNotNull(cORSHandlerBuilder3);
        org.junit.Assert.assertNotNull(cORSConfigBuilder4);
        org.junit.Assert.assertNotNull(cORSHandlerBuilder5);
        org.junit.Assert.assertNotNull(cORSConfigBuilder6);
        org.junit.Assert.assertNotNull(resourceType7);
        org.junit.Assert.assertNotNull(resourceTypeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(resourceType12);
        org.junit.Assert.assertNotNull(resourceTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(collectionArray18);
        org.junit.Assert.assertNotNull(strCollectionArray19);
        org.junit.Assert.assertNotNull(strCollection24);
        org.junit.Assert.assertNotNull(cORSConfigBuilder25);
        org.junit.Assert.assertNotNull(cORSHandlerBuilder26);
        org.junit.Assert.assertNotNull(cORSConfigBuilder28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(cORSConfigBuilder31);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        io.muserver.openapi.LinkObjectBuilder linkObjectBuilder0 = io.muserver.openapi.LinkObjectBuilder.linkObject();
        org.junit.Assert.assertNotNull(linkObjectBuilder0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.IMAGE_GIF;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.REFERER;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "referer");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        io.muserver.openapi.OpenAPIObjectBuilder openAPIObjectBuilder0 = io.muserver.openapi.OpenAPIObjectBuilder.openAPIObject();
        io.muserver.openapi.SecurityRequirementObject[] securityRequirementObjectArray1 = new io.muserver.openapi.SecurityRequirementObject[] {};
        java.util.ArrayList<io.muserver.openapi.SecurityRequirementObject> securityRequirementObjectList2 = new java.util.ArrayList<io.muserver.openapi.SecurityRequirementObject>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<io.muserver.openapi.SecurityRequirementObject>) securityRequirementObjectList2, securityRequirementObjectArray1);
        io.muserver.openapi.OpenAPIObjectBuilder openAPIObjectBuilder4 = openAPIObjectBuilder0.withSecurity((java.util.List<io.muserver.openapi.SecurityRequirementObject>) securityRequirementObjectList2);
        io.muserver.openapi.TagObject[] tagObjectArray5 = new io.muserver.openapi.TagObject[] {};
        java.util.ArrayList<io.muserver.openapi.TagObject> tagObjectList6 = new java.util.ArrayList<io.muserver.openapi.TagObject>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<io.muserver.openapi.TagObject>) tagObjectList6, tagObjectArray5);
        io.muserver.openapi.OpenAPIObjectBuilder openAPIObjectBuilder8 = openAPIObjectBuilder4.withTags((java.util.List<io.muserver.openapi.TagObject>) tagObjectList6);
        org.junit.Assert.assertNotNull(openAPIObjectBuilder0);
        org.junit.Assert.assertNotNull(securityRequirementObjectArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(openAPIObjectBuilder4);
        org.junit.Assert.assertNotNull(tagObjectArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(openAPIObjectBuilder8);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_VND_AMAZON_EBOOK;
        java.lang.CharSequence charSequence1 = resourceType0.mimeType();
        org.junit.Assert.assertNotNull(resourceType0);
        org.junit.Assert.assertNotNull(charSequence1);
        org.junit.Assert.assertEquals(charSequence1.toString(), "application/vnd.amazon.ebook");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        io.muserver.openapi.CallbackObjectBuilder callbackObjectBuilder0 = io.muserver.openapi.CallbackObjectBuilder.callbackObject();
        java.util.Map<java.lang.String, io.muserver.openapi.PathItemObject> strMap1 = null;
        io.muserver.openapi.CallbackObjectBuilder callbackObjectBuilder2 = callbackObjectBuilder0.withCallbacks(strMap1);
        io.muserver.openapi.CallbackObjectBuilder[] callbackObjectBuilderArray3 = new io.muserver.openapi.CallbackObjectBuilder[] { callbackObjectBuilder0 };
        io.muserver.openapi.CallbackObjectBuilder callbackObjectBuilder4 = io.muserver.Mutils.coalesce(callbackObjectBuilderArray3);
        org.junit.Assert.assertNotNull(callbackObjectBuilder0);
        org.junit.Assert.assertNotNull(callbackObjectBuilder2);
        org.junit.Assert.assertNotNull(callbackObjectBuilderArray3);
        org.junit.Assert.assertNotNull(callbackObjectBuilder4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder0 = io.muserver.handlers.CORSHandlerBuilder.corsHandler();
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder1 = new io.muserver.rest.CORSConfigBuilder();
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder2 = cORSHandlerBuilder0.withCORSConfig(cORSConfigBuilder1);
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder3 = io.muserver.handlers.CORSHandlerBuilder.corsHandler();
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder4 = io.muserver.rest.CORSConfigBuilder.disabled();
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder5 = cORSHandlerBuilder3.withCORSConfig(cORSConfigBuilder4);
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder6 = cORSConfigBuilder4.withAllOriginsAllowed();
        io.muserver.handlers.ResourceType resourceType7 = io.muserver.handlers.ResourceType.FONT_WOFF;
        io.muserver.handlers.ResourceType[] resourceTypeArray8 = new io.muserver.handlers.ResourceType[] { resourceType7 };
        java.util.ArrayList<io.muserver.handlers.ResourceType> resourceTypeList9 = new java.util.ArrayList<io.muserver.handlers.ResourceType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<io.muserver.handlers.ResourceType>) resourceTypeList9, resourceTypeArray8);
        java.util.Set<java.lang.String> strSet11 = io.muserver.handlers.ResourceType.gzippableMimeTypes((java.util.Collection<io.muserver.handlers.ResourceType>) resourceTypeList9);
        io.muserver.handlers.ResourceType resourceType12 = io.muserver.handlers.ResourceType.FONT_WOFF;
        io.muserver.handlers.ResourceType[] resourceTypeArray13 = new io.muserver.handlers.ResourceType[] { resourceType12 };
        java.util.ArrayList<io.muserver.handlers.ResourceType> resourceTypeList14 = new java.util.ArrayList<io.muserver.handlers.ResourceType>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<io.muserver.handlers.ResourceType>) resourceTypeList14, resourceTypeArray13);
        java.util.Set<java.lang.String> strSet16 = io.muserver.handlers.ResourceType.gzippableMimeTypes((java.util.Collection<io.muserver.handlers.ResourceType>) resourceTypeList14);
        java.util.Collection[] collectionArray18 = new java.util.Collection[2];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.String>[] strCollectionArray19 = (java.util.Collection<java.lang.String>[]) collectionArray18;
        strCollectionArray19[0] = strSet11;
        strCollectionArray19[1] = strSet16;
        java.util.Collection<java.lang.String> strCollection24 = io.muserver.Mutils.coalesce(strCollectionArray19);
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder25 = cORSConfigBuilder4.withExposedHeaders(strCollection24);
        io.muserver.handlers.CORSHandlerBuilder cORSHandlerBuilder26 = cORSHandlerBuilder2.withCORSConfig(cORSConfigBuilder25);
        io.muserver.rest.CORSConfigBuilder cORSConfigBuilder28 = cORSConfigBuilder25.withMaxAge(10L);
        org.junit.Assert.assertNotNull(cORSHandlerBuilder0);
        org.junit.Assert.assertNotNull(cORSHandlerBuilder2);
        org.junit.Assert.assertNotNull(cORSHandlerBuilder3);
        org.junit.Assert.assertNotNull(cORSConfigBuilder4);
        org.junit.Assert.assertNotNull(cORSHandlerBuilder5);
        org.junit.Assert.assertNotNull(cORSConfigBuilder6);
        org.junit.Assert.assertNotNull(resourceType7);
        org.junit.Assert.assertNotNull(resourceTypeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(resourceType12);
        org.junit.Assert.assertNotNull(resourceTypeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(collectionArray18);
        org.junit.Assert.assertNotNull(strCollectionArray19);
        org.junit.Assert.assertNotNull(strCollection24);
        org.junit.Assert.assertNotNull(cORSConfigBuilder25);
        org.junit.Assert.assertNotNull(cORSHandlerBuilder26);
        org.junit.Assert.assertNotNull(cORSConfigBuilder28);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        io.muserver.openapi.ResponsesObjectBuilder responsesObjectBuilder0 = new io.muserver.openapi.ResponsesObjectBuilder();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        io.muserver.handlers.HttpsRedirectorBuilder httpsRedirectorBuilder1 = io.muserver.handlers.HttpsRedirector.toHttpsPort(1);
        org.junit.Assert.assertNotNull(httpsRedirectorBuilder1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        io.muserver.openapi.EncodingObjectBuilder encodingObjectBuilder0 = io.muserver.openapi.EncodingObjectBuilder.encodingObject();
        io.muserver.openapi.EncodingObject encodingObject1 = encodingObjectBuilder0.build();
        java.lang.String str2 = encodingObject1.style;
        org.junit.Assert.assertNotNull(encodingObjectBuilder0);
        org.junit.Assert.assertNotNull(encodingObject1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        io.muserver.openapi.ExternalDocumentationObjectBuilder externalDocumentationObjectBuilder0 = new io.muserver.openapi.ExternalDocumentationObjectBuilder();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        io.muserver.openapi.EncodingObjectBuilder encodingObjectBuilder0 = io.muserver.openapi.EncodingObjectBuilder.encodingObject();
        io.muserver.openapi.EncodingObject encodingObject1 = encodingObjectBuilder0.build();
        java.lang.String str2 = encodingObject1.contentType();
        java.lang.String str3 = encodingObject1.contentType();
        java.lang.String str4 = encodingObject1.style;
        org.junit.Assert.assertNotNull(encodingObjectBuilder0);
        org.junit.Assert.assertNotNull(encodingObject1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        io.muserver.WriteCallback writeCallback0 = io.muserver.WriteCallback.NoOp;
        java.lang.Throwable throwable3 = null;
        io.muserver.WebSocketProtocolException webSocketProtocolException4 = new io.muserver.WebSocketProtocolException("hi!", throwable3);
        java.lang.Throwable[] throwableArray5 = webSocketProtocolException4.getSuppressed();
        io.muserver.WebSocketProtocolException webSocketProtocolException6 = new io.muserver.WebSocketProtocolException("io.muserver.MU_REQUEST", (java.lang.Throwable) webSocketProtocolException4);
        writeCallback0.onFailure((java.lang.Throwable) webSocketProtocolException6);
        org.junit.Assert.assertNotNull(writeCallback0);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        io.muserver.MuServerBuilder muServerBuilder0 = new io.muserver.MuServerBuilder();
        javax.net.ssl.SSLContext sSLContext2 = io.muserver.SSLContextBuilder.unsignedLocalhostCert();
        io.muserver.MuServerBuilder muServerBuilder3 = muServerBuilder0.withHttpsConnection(0, sSLContext2);
        javax.net.ssl.SSLContext sSLContext5 = io.muserver.SSLContextBuilder.unsignedLocalhostCert();
        io.muserver.MuServerBuilder muServerBuilder6 = muServerBuilder3.withHttpsConnection((-1), sSLContext5);
        io.muserver.MuServerBuilder muServerBuilder8 = muServerBuilder6.withHttpPort(10);
        io.muserver.Http2ConfigBuilder http2ConfigBuilder9 = new io.muserver.Http2ConfigBuilder();
        io.muserver.MuServerBuilder muServerBuilder10 = muServerBuilder6.withHttp2Config(http2ConfigBuilder9);
        org.junit.Assert.assertNotNull(sSLContext2);
        org.junit.Assert.assertNotNull(muServerBuilder3);
        org.junit.Assert.assertNotNull(sSLContext5);
        org.junit.Assert.assertNotNull(muServerBuilder6);
        org.junit.Assert.assertNotNull(muServerBuilder8);
        org.junit.Assert.assertNotNull(muServerBuilder10);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        io.muserver.HttpsConfigBuilder httpsConfigBuilder0 = new io.muserver.HttpsConfigBuilder();
        io.muserver.HttpsConfigBuilder httpsConfigBuilder2 = httpsConfigBuilder0.withDefaultAlias("io.muserver.RESOURCE_INFO");
        char[] charArray4 = new char[] { '4' };
        io.muserver.HttpsConfigBuilder httpsConfigBuilder5 = httpsConfigBuilder2.withKeyPassword(charArray4);
        io.muserver.HttpsConfigBuilder httpsConfigBuilder7 = httpsConfigBuilder2.withDefaultAlias("io.muserver.RESOURCE_INFO");
        org.junit.Assert.assertNotNull(httpsConfigBuilder2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertNotNull(httpsConfigBuilder5);
        org.junit.Assert.assertNotNull(httpsConfigBuilder7);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        io.muserver.ClientDisconnectedException clientDisconnectedException2 = new io.muserver.ClientDisconnectedException();
        io.muserver.MuException muException3 = new io.muserver.MuException("javax.ws.rs.ext.RuntimeDelegate", (java.lang.Throwable) clientDisconnectedException2);
        io.muserver.WebSocketProtocolException webSocketProtocolException4 = new io.muserver.WebSocketProtocolException("%0A", (java.lang.Throwable) muException3);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.APPLICATION_VND_MOZILLA_XUL_XML;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        io.muserver.rest.UriPattern uriPattern1 = io.muserver.rest.UriPattern.uriTemplateToRegex("hi!");
        io.muserver.rest.PathMatch pathMatch3 = uriPattern1.matcher("");
        boolean boolean4 = pathMatch3.prefixMatches();
        boolean boolean5 = pathMatch3.prefixMatches();
        boolean boolean6 = pathMatch3.fullyMatches();
        org.junit.Assert.assertNotNull(uriPattern1);
        org.junit.Assert.assertNotNull(pathMatch3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        io.muserver.WebSocketHandlerBuilder webSocketHandlerBuilder0 = new io.muserver.WebSocketHandlerBuilder();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        io.muserver.openapi.ResponsesObjectBuilder responsesObjectBuilder0 = io.muserver.openapi.ResponsesObjectBuilder.responsesObject();
        io.muserver.openapi.ResponseObject responseObject1 = null;
        io.muserver.openapi.ResponsesObjectBuilder responsesObjectBuilder2 = responsesObjectBuilder0.withDefaultValue(responseObject1);
        org.junit.Assert.assertNotNull(responsesObjectBuilder0);
        org.junit.Assert.assertNotNull(responsesObjectBuilder2);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderValues.CLOSE;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "close");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        io.muserver.openapi.ResponseObjectBuilder responseObjectBuilder0 = io.muserver.openapi.ResponseObjectBuilder.responseObject();
        org.junit.Assert.assertNotNull(responseObjectBuilder0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        io.muserver.openapi.InfoObjectBuilder infoObjectBuilder0 = new io.muserver.openapi.InfoObjectBuilder();
        io.muserver.openapi.LicenseObject licenseObject1 = null;
        io.muserver.openapi.InfoObjectBuilder infoObjectBuilder2 = infoObjectBuilder0.withLicense(licenseObject1);
        io.muserver.openapi.InfoObject infoObject3 = infoObjectBuilder2.build();
        java.lang.String str4 = infoObject3.title;
        io.muserver.openapi.ContactObject contactObject5 = infoObject3.contact;
        org.junit.Assert.assertNotNull(infoObjectBuilder2);
        org.junit.Assert.assertNotNull(infoObject3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "API Documentation" + "'", str4, "API Documentation");
        org.junit.Assert.assertNull(contactObject5);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        java.lang.CharSequence charSequence0 = io.muserver.HeaderNames.ORIGIN;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "origin");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        io.muserver.openapi.ExampleObjectBuilder exampleObjectBuilder0 = new io.muserver.openapi.ExampleObjectBuilder();
        java.net.URI uRI1 = null;
        io.muserver.openapi.ExampleObjectBuilder exampleObjectBuilder2 = exampleObjectBuilder0.withExternalValue(uRI1);
        io.muserver.openapi.ExampleObject exampleObject3 = exampleObjectBuilder0.build();
        java.net.URI uRI4 = exampleObject3.externalValue();
        java.lang.String str5 = exampleObject3.description;
        java.lang.Object obj6 = exampleObject3.value();
        org.junit.Assert.assertNotNull(exampleObjectBuilder2);
        org.junit.Assert.assertNotNull(exampleObject3);
        org.junit.Assert.assertNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        io.muserver.openapi.XmlObjectBuilder xmlObjectBuilder0 = io.muserver.openapi.XmlObjectBuilder.xmlObject();
        io.muserver.openapi.XmlObjectBuilder xmlObjectBuilder2 = xmlObjectBuilder0.withPrefix("%0A");
        java.net.URI uRI3 = null;
        io.muserver.openapi.XmlObjectBuilder xmlObjectBuilder4 = xmlObjectBuilder0.withNamespace(uRI3);
        org.junit.Assert.assertNotNull(xmlObjectBuilder0);
        org.junit.Assert.assertNotNull(xmlObjectBuilder2);
        org.junit.Assert.assertNotNull(xmlObjectBuilder4);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder1 = io.muserver.handlers.ResourceHandlerBuilder.fileHandler("");
        org.junit.Assert.assertNotNull(resourceHandlerBuilder1);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        io.muserver.ParameterizedHeader parameterizedHeader1 = io.muserver.ParameterizedHeader.fromString("io.muserver.MU_REQUEST");
        java.lang.String str3 = parameterizedHeader1.parameter("io.muserver.MU_REQUEST");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = parameterizedHeader1.parameters();
        org.junit.Assert.assertNotNull(parameterizedHeader1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.handlers.ResourceHandler.Builder builder1 = io.muserver.handlers.ResourceHandler.fileHandler(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        io.muserver.openapi.EncodingObjectBuilder encodingObjectBuilder0 = io.muserver.openapi.EncodingObjectBuilder.encodingObject();
        io.muserver.openapi.EncodingObject encodingObject1 = encodingObjectBuilder0.build();
        java.lang.String str2 = encodingObject1.contentType();
        java.lang.String str3 = encodingObject1.contentType();
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            encodingObject1.writeJson(writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(encodingObjectBuilder0);
        org.junit.Assert.assertNotNull(encodingObject1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        io.muserver.openapi.XmlObjectBuilder xmlObjectBuilder0 = new io.muserver.openapi.XmlObjectBuilder();
        io.muserver.openapi.XmlObjectBuilder xmlObjectBuilder2 = xmlObjectBuilder0.withPrefix("io.muserver.MU_REQUEST");
        org.junit.Assert.assertNotNull(xmlObjectBuilder2);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.FONT_OTF;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        io.muserver.CookieBuilder cookieBuilder0 = io.muserver.CookieBuilder.newCookie();
        io.muserver.CookieBuilder cookieBuilder2 = cookieBuilder0.withMaxAgeInSeconds(10L);
        // The following exception was thrown during execution in test generation
        try {
            io.muserver.Cookie cookie3 = cookieBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: A cookie name must be specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cookieBuilder0);
        org.junit.Assert.assertNotNull(cookieBuilder2);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        io.muserver.Http2ConfigBuilder http2ConfigBuilder0 = new io.muserver.Http2ConfigBuilder();
        io.muserver.Http2ConfigBuilder http2ConfigBuilder2 = http2ConfigBuilder0.enabled(true);
        io.muserver.Http2Config http2Config3 = http2ConfigBuilder0.build();
        org.junit.Assert.assertNotNull(http2ConfigBuilder2);
        org.junit.Assert.assertNotNull(http2Config3);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        io.muserver.openapi.ExampleObjectBuilder exampleObjectBuilder0 = new io.muserver.openapi.ExampleObjectBuilder();
        java.net.URI uRI1 = null;
        io.muserver.openapi.ExampleObjectBuilder exampleObjectBuilder2 = exampleObjectBuilder0.withExternalValue(uRI1);
        io.muserver.openapi.ExampleObject exampleObject3 = exampleObjectBuilder0.build();
        java.lang.CharSequence charSequence4 = io.muserver.ContentTypes.FONT_TTF;
        io.muserver.openapi.ExampleObjectBuilder exampleObjectBuilder5 = exampleObjectBuilder0.withValue((java.lang.Object) charSequence4);
        org.junit.Assert.assertNotNull(exampleObjectBuilder2);
        org.junit.Assert.assertNotNull(exampleObject3);
        org.junit.Assert.assertNotNull(charSequence4);
        org.junit.Assert.assertEquals(charSequence4.toString(), "font/ttf");
        org.junit.Assert.assertNotNull(exampleObjectBuilder5);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        io.muserver.ResponseState responseState0 = io.muserver.ResponseState.STREAMING;
        org.junit.Assert.assertTrue("'" + responseState0 + "' != '" + io.muserver.ResponseState.STREAMING + "'", responseState0.equals(io.muserver.ResponseState.STREAMING));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        io.muserver.handlers.ResourceType resourceType0 = io.muserver.handlers.ResourceType.AUDIO_MIDI;
        org.junit.Assert.assertNotNull(resourceType0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        io.muserver.MuServerBuilder muServerBuilder0 = new io.muserver.MuServerBuilder();
        javax.net.ssl.SSLContext sSLContext2 = io.muserver.SSLContextBuilder.unsignedLocalhostCert();
        io.muserver.MuServerBuilder muServerBuilder3 = muServerBuilder0.withHttpsConnection(0, sSLContext2);
        javax.net.ssl.SSLContext sSLContext5 = io.muserver.SSLContextBuilder.unsignedLocalhostCert();
        io.muserver.MuServerBuilder muServerBuilder6 = muServerBuilder3.withHttpsConnection((-1), sSLContext5);
        java.util.concurrent.ExecutorService executorService7 = null;
        io.muserver.MuServerBuilder muServerBuilder8 = muServerBuilder3.withHandlerExecutor(executorService7);
        io.muserver.MuServerBuilder muServerBuilder10 = muServerBuilder3.withNioThreads(1);
        org.junit.Assert.assertNotNull(sSLContext2);
        org.junit.Assert.assertNotNull(muServerBuilder3);
        org.junit.Assert.assertNotNull(sSLContext5);
        org.junit.Assert.assertNotNull(muServerBuilder6);
        org.junit.Assert.assertNotNull(muServerBuilder8);
        org.junit.Assert.assertNotNull(muServerBuilder10);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        io.muserver.MuServerBuilder muServerBuilder0 = new io.muserver.MuServerBuilder();
        javax.net.ssl.SSLContext sSLContext2 = io.muserver.SSLContextBuilder.unsignedLocalhostCert();
        io.muserver.MuServerBuilder muServerBuilder3 = muServerBuilder0.withHttpsConnection(0, sSLContext2);
        javax.net.ssl.SSLContext sSLContext5 = io.muserver.SSLContextBuilder.unsignedLocalhostCert();
        io.muserver.MuServerBuilder muServerBuilder6 = muServerBuilder3.withHttpsConnection((-1), sSLContext5);
        io.muserver.MuServerBuilder muServerBuilder8 = new io.muserver.MuServerBuilder();
        javax.net.ssl.SSLContext sSLContext10 = io.muserver.SSLContextBuilder.unsignedLocalhostCert();
        io.muserver.MuServerBuilder muServerBuilder11 = muServerBuilder8.withHttpsConnection(0, sSLContext10);
        io.muserver.MuServerBuilder muServerBuilder13 = new io.muserver.MuServerBuilder();
        javax.net.ssl.SSLContext sSLContext15 = io.muserver.SSLContextBuilder.unsignedLocalhostCert();
        io.muserver.MuServerBuilder muServerBuilder16 = muServerBuilder13.withHttpsConnection(0, sSLContext15);
        io.muserver.MuServerBuilder muServerBuilder17 = muServerBuilder11.withHttpsConnection(100, sSLContext15);
        io.muserver.MuServerBuilder muServerBuilder18 = muServerBuilder3.withHttpsConnection((int) ' ', sSLContext15);
        org.junit.Assert.assertNotNull(sSLContext2);
        org.junit.Assert.assertNotNull(muServerBuilder3);
        org.junit.Assert.assertNotNull(sSLContext5);
        org.junit.Assert.assertNotNull(muServerBuilder6);
        org.junit.Assert.assertNotNull(sSLContext10);
        org.junit.Assert.assertNotNull(muServerBuilder11);
        org.junit.Assert.assertNotNull(sSLContext15);
        org.junit.Assert.assertNotNull(muServerBuilder16);
        org.junit.Assert.assertNotNull(muServerBuilder17);
        org.junit.Assert.assertNotNull(muServerBuilder18);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        io.muserver.openapi.InfoObjectBuilder infoObjectBuilder0 = new io.muserver.openapi.InfoObjectBuilder();
        io.muserver.openapi.LicenseObject licenseObject1 = null;
        io.muserver.openapi.InfoObjectBuilder infoObjectBuilder2 = infoObjectBuilder0.withLicense(licenseObject1);
        io.muserver.openapi.InfoObject infoObject3 = infoObjectBuilder2.build();
        java.lang.String str4 = infoObject3.title;
        java.lang.String str5 = infoObject3.version;
        java.lang.String str6 = infoObject3.version;
        org.junit.Assert.assertNotNull(infoObjectBuilder2);
        org.junit.Assert.assertNotNull(infoObject3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "API Documentation" + "'", str4, "API Documentation");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0" + "'", str5, "1.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.0" + "'", str6, "1.0");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder2 = io.muserver.handlers.ResourceHandlerBuilder.fileOrClasspath("\n", "hi!");
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder4 = resourceHandlerBuilder2.withDirectoryListing(true);
        io.muserver.handlers.ResourceHandlerBuilder resourceHandlerBuilder6 = resourceHandlerBuilder2.withDefaultFile("by=;for=;host=hi!;proto=");
        org.junit.Assert.assertNotNull(resourceHandlerBuilder2);
        org.junit.Assert.assertNotNull(resourceHandlerBuilder4);
        org.junit.Assert.assertNotNull(resourceHandlerBuilder6);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        io.muserver.openapi.SchemaObjectBuilder schemaObjectBuilder0 = io.muserver.openapi.SchemaObjectBuilder.schemaObject();
        org.junit.Assert.assertNotNull(schemaObjectBuilder0);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        io.muserver.openapi.SecuritySchemeObjectBuilder securitySchemeObjectBuilder0 = io.muserver.openapi.SecuritySchemeObjectBuilder.securitySchemeObject();
        io.muserver.openapi.OAuthFlowsObject oAuthFlowsObject1 = null;
        io.muserver.openapi.SecuritySchemeObjectBuilder securitySchemeObjectBuilder2 = securitySchemeObjectBuilder0.withFlows(oAuthFlowsObject1);
        java.net.URI uRI3 = null;
        io.muserver.openapi.SecuritySchemeObjectBuilder securitySchemeObjectBuilder4 = securitySchemeObjectBuilder2.withOpenIdConnectUrl(uRI3);
        org.junit.Assert.assertNotNull(securitySchemeObjectBuilder0);
        org.junit.Assert.assertNotNull(securitySchemeObjectBuilder2);
        org.junit.Assert.assertNotNull(securitySchemeObjectBuilder4);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        io.muserver.HttpsConfigBuilder httpsConfigBuilder0 = new io.muserver.HttpsConfigBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        io.muserver.HttpsConfigBuilder httpsConfigBuilder3 = httpsConfigBuilder0.withProtocols(strArray2);
        io.muserver.rest.RestHandlerBuilder restHandlerBuilder4 = new io.muserver.rest.RestHandlerBuilder((java.lang.Object[]) strArray2);
        javax.ws.rs.ext.WriterInterceptor writerInterceptor5 = null;
        io.muserver.rest.RestHandlerBuilder restHandlerBuilder6 = restHandlerBuilder4.addWriterInterceptor(writerInterceptor5);
        io.muserver.openapi.OpenAPIObjectBuilder openAPIObjectBuilder7 = io.muserver.openapi.OpenAPIObjectBuilder.openAPIObject();
        io.muserver.rest.RestHandlerBuilder restHandlerBuilder8 = restHandlerBuilder4.withOpenApiDocument(openAPIObjectBuilder7);
        io.muserver.rest.CollectionParameterStrategy collectionParameterStrategy9 = io.muserver.rest.CollectionParameterStrategy.SPLIT_ON_COMMA;
        io.muserver.rest.RestHandlerBuilder restHandlerBuilder10 = restHandlerBuilder4.withCollectionParameterStrategy(collectionParameterStrategy9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(httpsConfigBuilder3);
        org.junit.Assert.assertNotNull(restHandlerBuilder6);
        org.junit.Assert.assertNotNull(openAPIObjectBuilder7);
        org.junit.Assert.assertNotNull(restHandlerBuilder8);
        org.junit.Assert.assertTrue("'" + collectionParameterStrategy9 + "' != '" + io.muserver.rest.CollectionParameterStrategy.SPLIT_ON_COMMA + "'", collectionParameterStrategy9.equals(io.muserver.rest.CollectionParameterStrategy.SPLIT_ON_COMMA));
        org.junit.Assert.assertNotNull(restHandlerBuilder10);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        java.lang.CharSequence charSequence0 = io.muserver.ContentTypes.TEXT_EVENT_STREAM;
        org.junit.Assert.assertNotNull(charSequence0);
        org.junit.Assert.assertEquals(charSequence0.toString(), "text/event-stream");
    }
}

