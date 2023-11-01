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
        java.lang.String str0 = io.configrd.core.source.RepoDef.NAMED_PATHS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "named" + "'", str0, "named");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.net.URI uRI0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = io.configrd.core.util.UriUtil.getUsername(uRI0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str0 = io.configrd.core.util.Environment.ENV_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "app.env" + "'", str0, "app.env");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = io.configrd.core.source.RepoDef.URI_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "uri" + "'", str0, "uri");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        io.configrd.core.processor.YamlProcessor yamlProcessor0 = new io.configrd.core.processor.YamlProcessor();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        boolean boolean1 = io.configrd.core.util.UriUtil.hasFile("uri");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap1 = io.configrd.core.processor.PropertiesProcessor.asProperties(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String str0 = io.configrd.core.util.Environment.SUBNET_ADDRESS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "subnet" + "'", str0, "subnet");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        boolean boolean1 = io.configrd.core.util.UriUtil.hasFile("named");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.String str0 = io.configrd.core.util.Environment.OS_VERSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "os.version" + "'", str0, "os.version");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI7 = io.configrd.core.util.UriUtil.buildURI("named", "Hengchens-MBP", "", (int) (short) 0, "uri", "subnet", "os.version");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected scheme name at index 0: ://urisubnet/os.version");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str0 = io.configrd.core.util.Environment.HOST_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hostname" + "'", str0, "hostname");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.configrd.core.util.StringUtils stringUtils1 = new io.configrd.core.util.StringUtils(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = io.configrd.core.source.RepoDef.NAME_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap1 = io.configrd.core.processor.JsonProcessor.asProperties(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.String str0 = io.configrd.core.ConfigSourceResolver.DEFAULT_CONFIG_FILE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "configrd.yaml" + "'", str0, "configrd.yaml");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = io.configrd.core.util.Environment.execReadToString("app.env");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.io.IOException: Cannot run program \"app.env\": error=2, No such file or directory");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.String str0 = io.configrd.core.source.RepoDef.TRUST_CERTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "trustCert" + "'", str0, "trustCert");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.net.URI uRI0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create(uRI0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.net.URI uRI0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.configrd.core.util.URITraverse uRITraverse1 = new io.configrd.core.util.URITraverse(uRI0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.net.URI uRI0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = io.configrd.core.util.UriUtil.getPassword(uRI0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        boolean boolean1 = io.configrd.core.util.StringUtils.hasText("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        io.configrd.core.http.HttpConfigSourceFactory httpConfigSourceFactory0 = new io.configrd.core.http.HttpConfigSourceFactory();
        boolean boolean2 = httpConfigSourceFactory0.isCompatible("subnet");
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.configrd.core.http.DefaultHttpConfigSource defaultHttpConfigSource5 = httpConfigSourceFactory0.newConfigSource("trustCert", strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Missing required values. Uri, configFileName are all required,Uri must have a value.,Repo's sourceName must be specified.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.lang.String str0 = io.configrd.core.ConfigSourceResolver.DEFAULT_TRUST_CERTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "false" + "'", str0, "false");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        io.configrd.core.util.Environment environment0 = new io.configrd.core.util.Environment();
        java.util.Properties properties1 = environment0.getProperties();
        java.lang.String str2 = environment0.detectEnvironment();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        io.configrd.core.util.Environment environment0 = new io.configrd.core.util.Environment();
        java.util.Properties properties1 = environment0.getProperties();
        java.lang.Class<?> wildcardClass2 = properties1.getClass();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        io.configrd.core.file.FileRepoDef fileRepoDef1 = new io.configrd.core.file.FileRepoDef("Hengchens-MBP");
        java.lang.String str2 = fileRepoDef1.getFileName();
        java.lang.String str3 = fileRepoDef1.getSourceName();
        java.lang.String str4 = fileRepoDef1.getFileName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        io.configrd.core.util.UriUtil uriUtil0 = new io.configrd.core.util.UriUtil();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        io.configrd.core.processor.JsonProcessor jsonProcessor0 = new io.configrd.core.processor.JsonProcessor();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.String str0 = io.configrd.core.source.RepoDef.SOURCE_NAME_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sourceName" + "'", str0, "sourceName");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        boolean boolean1 = io.configrd.core.util.StringUtils.hasText("uri");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.String str0 = io.configrd.core.source.StreamSource.FILE_SYSTEM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "file" + "'", str0, "file");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.configrd.core.util.Environment environment0 = new io.configrd.core.util.Environment();
        java.lang.String str1 = environment0.detectHostName();
        java.util.Properties properties2 = environment0.getProperties();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hengchens-MBP" + "'", str1, "Hengchens-MBP");
        org.junit.Assert.assertNotNull(properties2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.lang.String str0 = io.configrd.core.source.SecuredRepo.PASSWORD_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "password" + "'", str0, "password");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.lang.String str0 = io.configrd.core.source.SecuredRepo.USERNAME_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "username" + "'", str0, "username");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.String str0 = io.configrd.core.source.FileBasedRepo.HOSTS_FILE_NAME_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "hostsName" + "'", str0, "hostsName");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        io.configrd.core.http.HttpConfigSourceFactory httpConfigSourceFactory0 = new io.configrd.core.http.HttpConfigSourceFactory();
        boolean boolean2 = httpConfigSourceFactory0.isCompatible("subnet");
        java.lang.String str3 = httpConfigSourceFactory0.getSourceName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http" + "'", str3, "http");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String str0 = io.configrd.core.ConfigSourceResolver.DEFAULT_SOURCENAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "file" + "'", str0, "file");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String str0 = io.configrd.core.util.Environment.IP_ADDRESS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ip" + "'", str0, "ip");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.lang.String str0 = io.configrd.core.source.FileBasedRepo.FILE_NAME_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "fileName" + "'", str0, "fileName");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.configrd.core.util.UriUtil.UriValidator uriValidator1 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator2 = uriValidator1.hasUsername();
        org.junit.Assert.assertNotNull(uriValidator1);
        org.junit.Assert.assertNotNull(uriValidator2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.lang.String str0 = io.configrd.core.source.SecuredRepo.AUTH_METHOD_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "authMethod" + "'", str0, "authMethod");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = httpRepoDef1.getNamed();
        httpRepoDef1.setFileName("authMethod");
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        io.configrd.core.util.URITraverse uRITraverse6 = new io.configrd.core.util.URITraverse(uRI3, "http");
        java.lang.String str7 = uRITraverse6.decend();
        boolean boolean8 = uRITraverse6.hasNextUp();
        boolean boolean9 = uRITraverse6.hasNextDown();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null:named/http/app.env" + "'", str7, "null:named/http/app.env");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        io.configrd.core.util.TemplateReplace templateReplace0 = new io.configrd.core.util.TemplateReplace();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        io.configrd.core.DefaultMergeStrategy defaultMergeStrategy0 = new io.configrd.core.DefaultMergeStrategy();
        defaultMergeStrategy0.clear();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = defaultMergeStrategy0.merge();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = defaultMergeStrategy0.merge();
        io.configrd.core.DefaultMergeStrategy defaultMergeStrategy4 = new io.configrd.core.DefaultMergeStrategy();
        defaultMergeStrategy4.clear();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = defaultMergeStrategy4.merge();
        defaultMergeStrategy0.addConfig(strMap6);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        defaultMergeStrategy0.addConfig(strMap8);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.lang.String str0 = io.configrd.core.ConfigSourceResolver.DEFAULT_REPO_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "default" + "'", str0, "default");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.lang.String str0 = io.configrd.core.source.RepoDef.CONFIGRD_CONFIG_FILENAME_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "configrdFileName" + "'", str0, "configrdFileName");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        okhttp3.MediaType mediaType0 = io.configrd.core.http.DefaultHttpStreamSource.JSON;
        org.junit.Assert.assertNotNull(mediaType0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        io.configrd.core.util.DirectoryTraverse directoryTraverse2 = new io.configrd.core.util.DirectoryTraverse("named", "os.version");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        io.configrd.core.http.HttpConfigSourceFactory httpConfigSourceFactory0 = new io.configrd.core.http.HttpConfigSourceFactory();
        boolean boolean2 = httpConfigSourceFactory0.isCompatible("subnet");
        boolean boolean4 = httpConfigSourceFactory0.isCompatible("subnet");
        io.configrd.core.util.URIBuilder uRIBuilder7 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI9 = uRIBuilder7.build("app.env");
        java.net.URI uRI10 = io.configrd.core.util.UriUtil.stripFile(uRI9);
        java.lang.String str11 = io.configrd.core.util.UriUtil.getPassword(uRI10);
        io.configrd.core.source.StreamPacket streamPacket12 = new io.configrd.core.source.StreamPacket(uRI10);
        java.net.URI uRI13 = streamPacket12.getUri();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = streamPacket12.putIfAbsent("false", obj15);
        // The following exception was thrown during execution in test generation
        try {
            io.configrd.core.http.DefaultHttpStreamSource defaultHttpStreamSource17 = httpConfigSourceFactory0.newStreamSource("", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Missing required values. Uri, configFileName are all required,Uri must have a value.,Repo's sourceName must be specified.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(uRIBuilder7);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertNotNull(uRI10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(uRI13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        boolean boolean1 = io.configrd.core.processor.PropertiesProcessor.isPropertiesFile("password");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        httpRepoDef1.setPassword("os.version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        io.configrd.core.exception.InitializationException initializationException1 = new io.configrd.core.exception.InitializationException("");
        io.configrd.core.exception.InitializationException initializationException3 = new io.configrd.core.exception.InitializationException("");
        io.configrd.core.exception.InitializationException initializationException5 = new io.configrd.core.exception.InitializationException("");
        initializationException3.addSuppressed((java.lang.Throwable) initializationException5);
        java.lang.Throwable[] throwableArray7 = initializationException3.getSuppressed();
        initializationException1.addSuppressed((java.lang.Throwable) initializationException3);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setPasswordIfMissing("hostsName");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        boolean boolean1 = io.configrd.core.util.StringUtils.hasText("Hengchens-MBP");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        io.configrd.core.exception.AuthenticationException authenticationException1 = new io.configrd.core.exception.AuthenticationException("name");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        io.configrd.core.processor.PropertiesProcessor propertiesProcessor0 = new io.configrd.core.processor.PropertiesProcessor();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        boolean boolean5 = io.configrd.core.util.UriUtil.hasFile(uRI4);
        boolean boolean6 = io.configrd.core.util.UriUtil.hasFile(uRI4);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI2 = uRIBuilder1.build();
        java.io.InputStream inputStream3 = null;
        io.configrd.core.source.StreamPacket streamPacket4 = new io.configrd.core.source.StreamPacket(uRI2, inputStream3);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = io.configrd.core.processor.JsonProcessor.asProperties(byteArray6);
            org.junit.Assert.fail("Expected exception of type com.jsoniter.spi.JsonException; message: deserialize: trailing garbage found, head: 3, peek: ??d, buf: ??d???");
        } catch (com.jsoniter.spi.JsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 100, 10, 10, 1]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.util.Optional<java.lang.String> strOptional1 = io.configrd.core.util.UriUtil.getFileName("trustCert");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder3.setFileName("hi!");
        io.configrd.core.util.URIBuilder uRIBuilder7 = uRIBuilder5.setScheme("username");
        java.lang.Class<?> wildcardClass8 = uRIBuilder7.getClass();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
        org.junit.Assert.assertNotNull(uRIBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.io.InputStream inputStream1 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = io.configrd.core.processor.ProcessorSelector.process("null:named/http/app.env", inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            io.configrd.core.ConfigSourceResolver configSourceResolver3 = new io.configrd.core.ConfigSourceResolver(strMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        boolean boolean5 = io.configrd.core.util.UriUtil.hasFile(uRI4);
        java.io.InputStream inputStream6 = null;
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI4, inputStream6);
        java.util.Set<java.lang.String> strSet8 = streamPacket7.keySet();
        io.configrd.core.http.HttpRepoDef httpRepoDef10 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str11 = httpRepoDef10.getAuthMethod();
        httpRepoDef10.setTrustCert((java.lang.Boolean) true);
        java.lang.String[] strArray14 = httpRepoDef10.valid();
        java.lang.Object obj15 = streamPacket7.get((java.lang.Object) strArray14);
        io.configrd.core.file.FileRepoDef fileRepoDef17 = new io.configrd.core.file.FileRepoDef("Hengchens-MBP");
        java.lang.String str18 = fileRepoDef17.getFileName();
        fileRepoDef17.setFileName("");
        io.configrd.core.util.UriUtil.UriValidator uriValidator22 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator23 = uriValidator22.hasPassword();
        boolean boolean24 = streamPacket7.remove((java.lang.Object) fileRepoDef17, (java.lang.Object) uriValidator22);
        io.configrd.core.util.UriUtil.UriValidator uriValidator25 = uriValidator22.hasFile();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HttpBasicAuth" + "'", str11, "HttpBasicAuth");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(uriValidator22);
        org.junit.Assert.assertNotNull(uriValidator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(uriValidator25);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.configrd.core.processor.ProcessorSelector.Type type0 = io.configrd.core.processor.ProcessorSelector.Type.TEXT;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = io.configrd.core.processor.ProcessorSelector.process(type0, byteArray7);
        java.math.BigInteger bigInteger9 = io.configrd.core.util.FNV.fnv1_32(byteArray7);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + io.configrd.core.processor.ProcessorSelector.Type.TEXT + "'", type0.equals(io.configrd.core.processor.ProcessorSelector.Type.TEXT));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 0, 1, 100]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(bigInteger9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.io.InputStream inputStream4 = null;
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI3, inputStream4, (-1L));
        io.configrd.core.util.URITraverse uRITraverse8 = new io.configrd.core.util.URITraverse(uRI3, "file");
        java.lang.String str10 = uRITraverse8.at(0);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null:file/app.env" + "'", str10, "null:file/app.env");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        java.lang.String[] strArray5 = httpRepoDef1.valid();
        java.lang.String str6 = httpRepoDef1.getConfigrdFileName();
        java.lang.String str7 = httpRepoDef1.getConfigrdFileName();
        httpRepoDef1.setSourceName("trustCert");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.configrd.core.ConfigSourceResolver configSourceResolver0 = new io.configrd.core.ConfigSourceResolver();
        java.util.Optional<io.configrd.core.source.ConfigSource> configSourceOptional2 = configSourceResolver0.findConfigSourceByName("named");
        org.junit.Assert.assertNotNull(configSourceOptional2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        io.configrd.core.file.FileRepoDef fileRepoDef1 = new io.configrd.core.file.FileRepoDef("ip");
        fileRepoDef1.setHostsName("username");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        java.lang.String str5 = httpRepoDef1.getPassword();
        httpRepoDef1.setFileName("ip");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.String str0 = io.configrd.core.source.StreamSource.HTTPS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http" + "'", str0, "http");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        io.configrd.core.exception.InitializationException initializationException1 = new io.configrd.core.exception.InitializationException("");
        io.configrd.core.exception.InitializationException initializationException3 = new io.configrd.core.exception.InitializationException("");
        initializationException1.addSuppressed((java.lang.Throwable) initializationException3);
        java.lang.Throwable[] throwableArray5 = initializationException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        io.configrd.core.util.Environment environment0 = new io.configrd.core.util.Environment();
        environment0.setHostName("file");
        environment0.setProperty("HttpBasicAuth", "HttpBasicAuth");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("uri");
        java.net.URI uRI3 = uRIBuilder1.build("false");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder1.setPath("named/");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        io.configrd.core.util.URIBuilder uRIBuilder6 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI8 = uRIBuilder6.build("app.env");
        java.io.InputStream inputStream9 = null;
        io.configrd.core.source.StreamPacket streamPacket11 = new io.configrd.core.source.StreamPacket(uRI8, inputStream9, (-1L));
        io.configrd.core.util.URITraverse uRITraverse13 = new io.configrd.core.util.URITraverse(uRI8, "file");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = io.configrd.core.util.UriUtil.getPath(uRI4, uRI8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Uri doesn't contain root uri to offset path from.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRIBuilder6);
        org.junit.Assert.assertNotNull(uRI8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.lang.String str0 = io.configrd.core.util.StringUtils.DEFAULT_PLACEHOLDER_SUFFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "}" + "'", str0, "}");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.lang.String str0 = io.configrd.core.util.Environment.APP_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "app.name" + "'", str0, "app.name");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.net.URI uRI0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.configrd.core.util.URITraverse uRITraverse2 = new io.configrd.core.util.URITraverse(uRI0, "named/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        io.configrd.core.exception.InitializationException initializationException1 = new io.configrd.core.exception.InitializationException("");
        java.lang.String str2 = initializationException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "io.configrd.core.exception.InitializationException: " + "'", str2, "io.configrd.core.exception.InitializationException: ");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        java.lang.String str5 = httpRepoDef1.getPassword();
        java.lang.String str6 = httpRepoDef1.getUsername();
        java.lang.String str7 = httpRepoDef1.getUsername();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        io.configrd.core.util.DirectoryTraverse directoryTraverse2 = new io.configrd.core.util.DirectoryTraverse("", "fileName");
        boolean boolean3 = directoryTraverse2.hasNextDown();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        io.configrd.core.util.Environment environment0 = new io.configrd.core.util.Environment();
        environment0.setApplicationName("HttpBasicAuth");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        boolean boolean5 = io.configrd.core.util.UriUtil.hasFile(uRI4);
        java.io.InputStream inputStream6 = null;
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI4, inputStream6);
        java.util.Set<java.lang.String> strSet8 = streamPacket7.keySet();
        java.net.URI uRI9 = streamPacket7.getUri();
        io.configrd.core.util.URITraverse uRITraverse10 = new io.configrd.core.util.URITraverse(uRI9);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(uRI9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        io.configrd.core.util.Environment environment0 = new io.configrd.core.util.Environment();
        java.util.Properties properties1 = environment0.getProperties();
        java.util.Properties properties2 = environment0.getProperties();
        java.lang.String str3 = environment0.detectHostName();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(properties2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hengchens-MBP" + "'", str3, "Hengchens-MBP");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        io.configrd.core.util.FNV fNV0 = new io.configrd.core.util.FNV();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        boolean boolean5 = io.configrd.core.util.UriUtil.hasFile(uRI4);
        java.io.InputStream inputStream6 = null;
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI4, inputStream6);
        java.util.Set<java.lang.String> strSet8 = streamPacket7.keySet();
        io.configrd.core.http.HttpRepoDef httpRepoDef10 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str11 = httpRepoDef10.getAuthMethod();
        httpRepoDef10.setTrustCert((java.lang.Boolean) true);
        java.lang.String[] strArray14 = httpRepoDef10.valid();
        java.lang.Object obj15 = streamPacket7.get((java.lang.Object) strArray14);
        io.configrd.core.file.FileRepoDef fileRepoDef17 = new io.configrd.core.file.FileRepoDef("Hengchens-MBP");
        java.lang.String str18 = fileRepoDef17.getFileName();
        fileRepoDef17.setFileName("");
        io.configrd.core.util.UriUtil.UriValidator uriValidator22 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator23 = uriValidator22.hasPassword();
        boolean boolean24 = streamPacket7.remove((java.lang.Object) fileRepoDef17, (java.lang.Object) uriValidator22);
        io.configrd.core.util.Environment environment26 = new io.configrd.core.util.Environment();
        java.util.Properties properties27 = environment26.getProperties();
        java.lang.String str28 = environment26.detectHostName();
        java.util.Properties properties29 = environment26.getProperties();
        java.lang.Object obj30 = streamPacket7.put("named/", (java.lang.Object) environment26);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HttpBasicAuth" + "'", str11, "HttpBasicAuth");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(uriValidator22);
        org.junit.Assert.assertNotNull(uriValidator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hengchens-MBP" + "'", str28, "Hengchens-MBP");
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        httpRepoDef1.setUsername("name");
        java.lang.String str4 = httpRepoDef1.getName();
        java.lang.String str5 = httpRepoDef1.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "name" + "'", str5, "name");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        boolean boolean5 = io.configrd.core.util.UriUtil.hasFile(uRI4);
        java.io.InputStream inputStream6 = null;
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI4, inputStream6);
        java.util.Set<java.lang.String> strSet8 = streamPacket7.keySet();
        io.configrd.core.http.HttpRepoDef httpRepoDef10 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str11 = httpRepoDef10.getAuthMethod();
        httpRepoDef10.setTrustCert((java.lang.Boolean) true);
        java.lang.String[] strArray14 = httpRepoDef10.valid();
        java.lang.Object obj15 = streamPacket7.get((java.lang.Object) strArray14);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = streamPacket7.putIfAbsent("trustCert", obj17);
        // The following exception was thrown during execution in test generation
        try {
            io.configrd.core.ConfigSourceResolver configSourceResolver19 = new io.configrd.core.ConfigSourceResolver((java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HttpBasicAuth" + "'", str11, "HttpBasicAuth");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        io.configrd.core.http.HttpConfigSourceFactory httpConfigSourceFactory0 = new io.configrd.core.http.HttpConfigSourceFactory();
        boolean boolean2 = httpConfigSourceFactory0.isCompatible("named");
        java.lang.String str3 = httpConfigSourceFactory0.getSourceName();
        io.configrd.core.util.URIBuilder uRIBuilder6 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI8 = uRIBuilder6.build("app.env");
        java.net.URI uRI9 = io.configrd.core.util.UriUtil.stripFile(uRI8);
        boolean boolean10 = io.configrd.core.util.UriUtil.hasFile(uRI9);
        java.io.InputStream inputStream11 = null;
        io.configrd.core.source.StreamPacket streamPacket12 = new io.configrd.core.source.StreamPacket(uRI9, inputStream11);
        java.util.Set<java.lang.String> strSet13 = streamPacket12.keySet();
        io.configrd.core.http.HttpRepoDef httpRepoDef15 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str16 = httpRepoDef15.getAuthMethod();
        httpRepoDef15.setTrustCert((java.lang.Boolean) true);
        java.lang.String[] strArray19 = httpRepoDef15.valid();
        java.lang.Object obj20 = streamPacket12.get((java.lang.Object) strArray19);
        // The following exception was thrown during execution in test generation
        try {
            io.configrd.core.http.DefaultHttpConfigSource defaultHttpConfigSource21 = httpConfigSourceFactory0.newConfigSource("http", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Missing required values. Uri, configFileName are all required,Uri must have a value.,Repo's sourceName must be specified.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http" + "'", str3, "http");
        org.junit.Assert.assertNotNull(uRIBuilder6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HttpBasicAuth" + "'", str16, "HttpBasicAuth");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        io.configrd.core.DefaultMergeStrategy defaultMergeStrategy0 = new io.configrd.core.DefaultMergeStrategy();
        defaultMergeStrategy0.clear();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = defaultMergeStrategy0.merge();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = defaultMergeStrategy0.merge();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = defaultMergeStrategy0.merge();
        defaultMergeStrategy0.clear();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        io.configrd.core.util.URITraverse uRITraverse6 = new io.configrd.core.util.URITraverse(uRI3, "http");
        java.lang.String str7 = uRITraverse6.decend();
        boolean boolean8 = uRITraverse6.hasNextDown();
        java.lang.String str9 = uRITraverse6.ascend();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null:named/http/app.env" + "'", str7, "null:named/http/app.env");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null:http/app.env" + "'", str9, "null:http/app.env");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        boolean boolean5 = io.configrd.core.util.UriUtil.hasFile(uRI4);
        java.io.InputStream inputStream6 = null;
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI4, inputStream6);
        java.util.Set<java.lang.String> strSet8 = streamPacket7.keySet();
        java.net.URI uRI9 = streamPacket7.getUri();
        boolean boolean10 = streamPacket7.hasContent();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI4);
        io.configrd.core.util.URIBuilder uRIBuilder9 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI11 = uRIBuilder9.build("app.env");
        java.net.URI uRI12 = io.configrd.core.util.UriUtil.stripFile(uRI11);
        java.lang.String str13 = io.configrd.core.util.UriUtil.getPassword(uRI12);
        io.configrd.core.source.StreamPacket streamPacket14 = new io.configrd.core.source.StreamPacket(uRI12);
        java.lang.String str15 = io.configrd.core.util.UriUtil.getPath(uRI12);
        java.lang.Object obj16 = streamPacket6.replace("192.168.1.88", (java.lang.Object) str15);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(uRIBuilder9);
        org.junit.Assert.assertNotNull(uRI11);
        org.junit.Assert.assertNotNull(uRI12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "named/" + "'", str15, "named/");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder3.setFileName("hi!");
        io.configrd.core.util.URIBuilder uRIBuilder7 = uRIBuilder5.setFileName("password");
        java.net.URI uRI8 = uRIBuilder7.build();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
        org.junit.Assert.assertNotNull(uRIBuilder7);
        org.junit.Assert.assertNotNull(uRI8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.lang.String str0 = io.configrd.core.util.Environment.OS_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "os.name" + "'", str0, "os.name");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.configrd.core.exception.AuthenticationException authenticationException1 = new io.configrd.core.exception.AuthenticationException("authMethod");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        io.configrd.core.util.UriUtil.UriValidator uriValidator1 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator2 = uriValidator1.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator3 = uriValidator1.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator4 = uriValidator1.hasFile();
        io.configrd.core.util.UriUtil.UriValidator uriValidator5 = uriValidator4.hasUsername();
        org.junit.Assert.assertNotNull(uriValidator1);
        org.junit.Assert.assertNotNull(uriValidator2);
        org.junit.Assert.assertNotNull(uriValidator3);
        org.junit.Assert.assertNotNull(uriValidator4);
        org.junit.Assert.assertNotNull(uriValidator5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.lang.String str0 = io.configrd.core.ConfigSourceResolver.DEFAULT_PROPERTIES_FILE_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "default.properties" + "'", str0, "default.properties");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        io.configrd.core.file.FileConfigSourceFactory fileConfigSourceFactory0 = new io.configrd.core.file.FileConfigSourceFactory();
        io.configrd.core.util.URIBuilder uRIBuilder3 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI5 = uRIBuilder3.build("app.env");
        java.net.URI uRI6 = io.configrd.core.util.UriUtil.stripFile(uRI5);
        boolean boolean7 = io.configrd.core.util.UriUtil.hasFile(uRI6);
        java.io.InputStream inputStream8 = null;
        io.configrd.core.source.StreamPacket streamPacket9 = new io.configrd.core.source.StreamPacket(uRI6, inputStream8);
        java.util.Set<java.lang.String> strSet10 = streamPacket9.keySet();
        io.configrd.core.http.HttpRepoDef httpRepoDef12 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str13 = httpRepoDef12.getAuthMethod();
        httpRepoDef12.setTrustCert((java.lang.Boolean) true);
        java.lang.String[] strArray16 = httpRepoDef12.valid();
        java.lang.Object obj17 = streamPacket9.get((java.lang.Object) strArray16);
        // The following exception was thrown during execution in test generation
        try {
            io.configrd.core.file.DefaultFileStreamSource defaultFileStreamSource18 = fileConfigSourceFactory0.newStreamSource("null:file/app.env", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNotNull(uRI6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HttpBasicAuth" + "'", str13, "HttpBasicAuth");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder1.setUsername("authMethod");
        io.configrd.core.util.URIBuilder uRIBuilder7 = uRIBuilder5.setPassword("ip");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
        org.junit.Assert.assertNotNull(uRIBuilder7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.io.InputStream inputStream4 = null;
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI3, inputStream4, (-1L));
        io.configrd.core.util.URITraverse uRITraverse8 = new io.configrd.core.util.URITraverse(uRI3, "file");
        java.lang.String str10 = uRITraverse8.at((int) ' ');
        java.lang.String str11 = uRITraverse8.ascend();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/file/app.env" + "'", str10, "null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/file/app.env");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null:named/file/app.env" + "'", str11, "null:named/file/app.env");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.configrd.core.util.UriUtil.UriValidator uriValidator1 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator2 = uriValidator1.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator3 = uriValidator1.hasScheme();
        io.configrd.core.util.UriUtil.UriValidator uriValidator4 = uriValidator3.hasPath();
        org.junit.Assert.assertNotNull(uriValidator1);
        org.junit.Assert.assertNotNull(uriValidator2);
        org.junit.Assert.assertNotNull(uriValidator3);
        org.junit.Assert.assertNotNull(uriValidator4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        io.configrd.core.ConfigSourceResolver configSourceResolver0 = new io.configrd.core.ConfigSourceResolver();
        java.util.Optional<io.configrd.core.source.ConfigSource> configSourceOptional2 = configSourceResolver0.findConfigSourceByName("name");
        java.util.Optional<io.configrd.core.source.ConfigSource> configSourceOptional4 = configSourceResolver0.findConfigSourceByName("os.name");
        org.junit.Assert.assertNotNull(configSourceOptional2);
        org.junit.Assert.assertNotNull(configSourceOptional4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder1.setFileName("http");
        java.lang.String[] strArray10 = new java.lang.String[] { "trustCert", "", "subnet", "hostsName" };
        io.configrd.core.util.URIBuilder uRIBuilder11 = uRIBuilder1.setFragment(strArray10);
        java.lang.String str12 = uRIBuilder1.toString();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(uRIBuilder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null://Hengchens-MBP@/named/http#trustCert,,subnet,hostsName" + "'", str12, "null://Hengchens-MBP@/named/http#trustCert,,subnet,hostsName");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.lang.String str4 = io.configrd.core.util.UriUtil.getPassword(uRI3);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.configrd.core.util.DirectoryTraverse directoryTraverse2 = new io.configrd.core.util.DirectoryTraverse("authMethod", "192.168.1.88");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.configrd.core.processor.ProcessorSelector.Type type0 = io.configrd.core.processor.ProcessorSelector.Type.TEXT;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = io.configrd.core.processor.ProcessorSelector.process(type0, byteArray7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = io.configrd.core.processor.PropertiesProcessor.asProperties(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = io.configrd.core.processor.JsonProcessor.asProperties(byteArray7);
            org.junit.Assert.fail("Expected exception of type com.jsoniter.spi.JsonException; message: read: premature end, head: 2, peek: ??, buf: ?????d");
        } catch (com.jsoniter.spi.JsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + io.configrd.core.processor.ProcessorSelector.Type.TEXT + "'", type0.equals(io.configrd.core.processor.ProcessorSelector.Type.TEXT));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 0, 1, 100]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        io.configrd.core.util.UriUtil.UriValidator uriValidator1 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator2 = uriValidator1.hasPath();
        io.configrd.core.util.UriUtil.UriValidator uriValidator3 = uriValidator1.hasHost();
        io.configrd.core.util.UriUtil.UriValidator uriValidator4 = uriValidator1.hasFile();
        org.junit.Assert.assertNotNull(uriValidator1);
        org.junit.Assert.assertNotNull(uriValidator2);
        org.junit.Assert.assertNotNull(uriValidator3);
        org.junit.Assert.assertNotNull(uriValidator4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPassword(uRI5);
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI5);
        java.net.URI uRI8 = streamPacket7.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef9 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        java.lang.String str10 = fileRepoDef9.getConfigrdFileName();
        java.lang.String str11 = fileRepoDef9.getHostsName();
        org.junit.Assert.assertNotNull(uRIBuilder2);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        io.configrd.core.util.URITraverse uRITraverse6 = new io.configrd.core.util.URITraverse(uRI3, "http");
        java.lang.String str7 = uRITraverse6.decend();
        java.lang.String str9 = uRITraverse6.at((int) '#');
        java.lang.String str11 = uRITraverse6.at((int) (byte) 0);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null:named/http/app.env" + "'", str7, "null:named/http/app.env");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/http/app.env" + "'", str9, "null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/http/app.env");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null:http/app.env" + "'", str11, "null:http/app.env");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        boolean boolean1 = io.configrd.core.processor.PropertiesProcessor.isPropertiesFile("file");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        io.configrd.core.processor.ProcessorSelector.Type type0 = io.configrd.core.processor.ProcessorSelector.Type.TEXT;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = io.configrd.core.processor.ProcessorSelector.process(type0, byteArray7);
        java.lang.String str9 = io.configrd.core.processor.PropertiesProcessor.toText(strMap8);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + io.configrd.core.processor.ProcessorSelector.Type.TEXT + "'", type0.equals(io.configrd.core.processor.ProcessorSelector.Type.TEXT));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 0, 1, 100]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        io.configrd.core.http.HttpConfigSourceFactory httpConfigSourceFactory0 = new io.configrd.core.http.HttpConfigSourceFactory();
        boolean boolean2 = httpConfigSourceFactory0.isCompatible("subnet");
        boolean boolean4 = httpConfigSourceFactory0.isCompatible("null:named/file/app.env");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        java.lang.String[] strArray5 = httpRepoDef1.valid();
        java.lang.String str6 = httpRepoDef1.getConfigrdFileName();
        java.lang.String str7 = httpRepoDef1.getConfigrdFileName();
        httpRepoDef1.setName("default");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.net.URI uRI7 = io.configrd.core.util.UriUtil.buildURI("HttpBasicAuth", "os.version", "null://Hengchens-MBP@/named/http#trustCert,,subnet,hostsName", (int) (short) 0, "named/", "os.name", "named/");
        org.junit.Assert.assertNotNull(uRI7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPassword(uRI5);
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI5);
        java.net.URI uRI8 = streamPacket7.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef9 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        java.lang.Object obj10 = streamPacket7.clone();
        java.io.InputStream inputStream11 = streamPacket7.getInputStream();
        java.lang.Class<?> wildcardClass12 = inputStream11.getClass();
        org.junit.Assert.assertNotNull(uRIBuilder2);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{}");
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        io.configrd.core.file.FileRepoDef fileRepoDef1 = new io.configrd.core.file.FileRepoDef("Hengchens-MBP");
        java.lang.String str2 = fileRepoDef1.getFileName();
        java.lang.String str3 = fileRepoDef1.getSourceName();
        java.lang.String str4 = fileRepoDef1.getSourceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.net.URI uRI7 = io.configrd.core.util.UriUtil.buildURI("false", "username", "hostsName", (int) (byte) 100, "named/", "app.name", "false");
        org.junit.Assert.assertNotNull(uRI7);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        io.configrd.core.DefaultMergeStrategy defaultMergeStrategy0 = new io.configrd.core.DefaultMergeStrategy();
        defaultMergeStrategy0.clear();
        defaultMergeStrategy0.clear();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPassword(uRI5);
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI5);
        java.net.URI uRI8 = streamPacket7.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef9 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        java.lang.Object obj10 = streamPacket7.clone();
        java.io.InputStream inputStream11 = streamPacket7.getInputStream();
        inputStream11.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = io.configrd.core.processor.PropertiesProcessor.asProperties(inputStream11);
        inputStream11.close();
        inputStream11.close();
        org.junit.Assert.assertNotNull(uRIBuilder2);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{}");
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        io.configrd.core.file.FileRepoDef fileRepoDef1 = new io.configrd.core.file.FileRepoDef("Hengchens-MBP");
        java.lang.String str2 = fileRepoDef1.getFileName();
        java.lang.String str3 = fileRepoDef1.getFileName();
        fileRepoDef1.setUri("subnet");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        io.configrd.core.ConfigSourceResolver configSourceResolver0 = new io.configrd.core.ConfigSourceResolver();
        java.util.Optional<io.configrd.core.source.ConfigSource> configSourceOptional2 = configSourceResolver0.findConfigSourceByName("hostname");
        org.junit.Assert.assertNotNull(configSourceOptional2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("configrd.yaml");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder1.setPath("hi!");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setPath("hostname");
        java.net.URI uRI5 = uRIBuilder3.build("os.version");
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPath(uRI5);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hostname/os.version" + "'", str6, "hostname/os.version");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        httpRepoDef1.setUri("username");
        io.configrd.core.http.DefaultHttpStreamSource defaultHttpStreamSource7 = new io.configrd.core.http.DefaultHttpStreamSource(httpRepoDef1);
        java.lang.String str8 = defaultHttpStreamSource7.getSourceName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<? extends io.configrd.core.source.PropertyPacket> wildcardOptional10 = defaultHttpStreamSource7.stream("default.properties");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Uri null:username/default.properties is not valid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http" + "'", str8, "http");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder1.setFileName("http");
        java.net.URI uRI6 = uRIBuilder5.build();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
        org.junit.Assert.assertNotNull(uRI6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.io.InputStream inputStream4 = null;
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI3, inputStream4, (-1L));
        io.configrd.core.util.URITraverse uRITraverse8 = new io.configrd.core.util.URITraverse(uRI3, "file");
        boolean boolean9 = uRITraverse8.hasNextUp();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.configrd.core.ConfigSourceResolver configSourceResolver0 = new io.configrd.core.ConfigSourceResolver();
        java.util.Optional<io.configrd.core.source.ConfigSource> configSourceOptional2 = configSourceResolver0.findConfigSourceByName("name");
        io.configrd.core.util.URIBuilder uRIBuilder6 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI8 = uRIBuilder6.build("app.env");
        java.net.URI uRI9 = io.configrd.core.util.UriUtil.stripFile(uRI8);
        java.lang.String str10 = io.configrd.core.util.UriUtil.getPassword(uRI9);
        io.configrd.core.source.StreamPacket streamPacket11 = new io.configrd.core.source.StreamPacket(uRI9);
        java.net.URI uRI12 = streamPacket11.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef13 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket11);
        java.util.Optional<io.configrd.core.source.ConfigSource> configSourceOptional14 = configSourceResolver0.newConfigSource("io.configrd.core.exception.InitializationException: ", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket11);
        org.junit.Assert.assertNotNull(configSourceOptional2);
        org.junit.Assert.assertNotNull(uRIBuilder6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(uRI12);
        org.junit.Assert.assertNotNull(configSourceOptional14);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.configrd.core.util.UriUtil.UriValidator uriValidator1 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator2 = uriValidator1.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator3 = uriValidator1.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator4 = uriValidator1.hasFile();
        io.configrd.core.util.UriUtil.UriValidator uriValidator5 = uriValidator1.hasFile();
        io.configrd.core.util.UriUtil.UriValidator uriValidator6 = uriValidator1.hasPassword();
        org.junit.Assert.assertNotNull(uriValidator1);
        org.junit.Assert.assertNotNull(uriValidator2);
        org.junit.Assert.assertNotNull(uriValidator3);
        org.junit.Assert.assertNotNull(uriValidator4);
        org.junit.Assert.assertNotNull(uriValidator5);
        org.junit.Assert.assertNotNull(uriValidator6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        boolean boolean1 = io.configrd.core.processor.JsonProcessor.isJsonFile("hostname/os.version");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        boolean boolean1 = io.configrd.core.util.UriUtil.hasFile("http");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        boolean boolean4 = uRIBuilder1.hasFileName();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.util.Optional<java.lang.String> strOptional1 = io.configrd.core.util.UriUtil.getFileName("os.name");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        io.configrd.core.http.HttpConfigSourceFactory httpConfigSourceFactory0 = new io.configrd.core.http.HttpConfigSourceFactory();
        boolean boolean2 = httpConfigSourceFactory0.isCompatible("subnet");
        boolean boolean4 = httpConfigSourceFactory0.isCompatible("subnet");
        boolean boolean6 = httpConfigSourceFactory0.isCompatible("named");
        io.configrd.core.util.URIBuilder uRIBuilder9 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI11 = uRIBuilder9.build("app.env");
        java.net.URI uRI12 = io.configrd.core.util.UriUtil.stripFile(uRI11);
        boolean boolean13 = io.configrd.core.util.UriUtil.hasFile(uRI12);
        java.io.InputStream inputStream14 = null;
        io.configrd.core.source.StreamPacket streamPacket15 = new io.configrd.core.source.StreamPacket(uRI12, inputStream14);
        java.util.Set<java.lang.String> strSet16 = streamPacket15.keySet();
        io.configrd.core.http.HttpRepoDef httpRepoDef18 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str19 = httpRepoDef18.getAuthMethod();
        httpRepoDef18.setTrustCert((java.lang.Boolean) true);
        java.lang.String[] strArray22 = httpRepoDef18.valid();
        java.lang.Object obj23 = streamPacket15.get((java.lang.Object) strArray22);
        // The following exception was thrown during execution in test generation
        try {
            io.configrd.core.http.DefaultHttpConfigSource defaultHttpConfigSource24 = httpConfigSourceFactory0.newConfigSource("password", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Missing required values. Uri, configFileName are all required,Uri must have a value.,Repo's sourceName must be specified.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(uRIBuilder9);
        org.junit.Assert.assertNotNull(uRI11);
        org.junit.Assert.assertNotNull(uRI12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HttpBasicAuth" + "'", str19, "HttpBasicAuth");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPassword(uRI5);
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI5);
        java.net.URI uRI8 = streamPacket7.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef9 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        io.configrd.core.http.HttpRepoDef httpRepoDef11 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str12 = httpRepoDef11.getAuthMethod();
        httpRepoDef11.setTrustCert((java.lang.Boolean) true);
        java.lang.String str15 = httpRepoDef11.getPassword();
        java.lang.String str16 = httpRepoDef11.getUsername();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = httpRepoDef11.getNamed();
        streamPacket7.putAll(strMap17);
        org.junit.Assert.assertNotNull(uRIBuilder2);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HttpBasicAuth" + "'", str12, "HttpBasicAuth");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder3.setFileName("hi!");
        io.configrd.core.util.URIBuilder uRIBuilder7 = uRIBuilder3.setPath("app.name");
        io.configrd.core.util.URIBuilder uRIBuilder9 = uRIBuilder3.setHost("null:named/file/app.env");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
        org.junit.Assert.assertNotNull(uRIBuilder7);
        org.junit.Assert.assertNotNull(uRIBuilder9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.lang.String str0 = io.configrd.core.util.Environment.PREFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "configrd." + "'", str0, "configrd.");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        io.configrd.core.util.Environment environment0 = new io.configrd.core.util.Environment();
        java.util.Properties properties1 = environment0.getProperties();
        environment0.setHostName("trustCert");
        java.util.Properties properties4 = environment0.getProperties();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        boolean boolean1 = io.configrd.core.processor.JsonProcessor.isJsonFile("fileName");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI4);
        java.net.URI uRI7 = streamPacket6.getUri();
        io.configrd.core.http.HttpRepoDef httpRepoDef10 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str11 = httpRepoDef10.getUsername();
        java.lang.Object obj12 = streamPacket6.replace("named/", (java.lang.Object) str11);
        boolean boolean13 = streamPacket6.hasContent();
        java.lang.String str14 = streamPacket6.getETag();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        httpRepoDef1.setUri("username");
        io.configrd.core.http.DefaultHttpStreamSource defaultHttpStreamSource7 = new io.configrd.core.http.DefaultHttpStreamSource(httpRepoDef1);
        java.lang.String str8 = defaultHttpStreamSource7.getSourceName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<? extends io.configrd.core.source.PropertyPacket> wildcardOptional10 = defaultHttpStreamSource7.stream("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Uri null:username is not valid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http" + "'", str8, "http");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        io.configrd.core.util.EncryptUtil encryptUtil0 = new io.configrd.core.util.EncryptUtil();
        encryptUtil0.encrypt();
        java.lang.String str2 = encryptUtil0.password();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "secret" + "'", str2, "secret");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.configrd.core.util.Environment environment0 = new io.configrd.core.util.Environment();
        java.util.Properties properties1 = environment0.getProperties();
        java.lang.String str2 = environment0.detectHostName();
        java.lang.String str3 = environment0.detectIP();
        java.lang.String str4 = environment0.detectIP();
        java.lang.String str5 = environment0.detectHostName();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hengchens-MBP" + "'", str2, "Hengchens-MBP");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "192.168.1.88" + "'", str3, "192.168.1.88");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "192.168.1.88" + "'", str4, "192.168.1.88");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hengchens-MBP" + "'", str5, "Hengchens-MBP");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        io.configrd.core.processor.ProcessorSelector.Type type0 = io.configrd.core.processor.ProcessorSelector.Type.JSON;
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        java.math.BigInteger bigInteger5 = io.configrd.core.util.FNV.fnv1a_32(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap6 = io.configrd.core.processor.ProcessorSelector.process(type0, byteArray4);
            org.junit.Assert.fail("Expected exception of type com.jsoniter.spi.JsonException; message: read: premature end, head: 1, peek: ?, buf: ???");
        } catch (com.jsoniter.spi.JsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + io.configrd.core.processor.ProcessorSelector.Type.JSON + "'", type0.equals(io.configrd.core.processor.ProcessorSelector.Type.JSON));
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(bigInteger5);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.net.URI uRI7 = io.configrd.core.util.UriUtil.buildURI("uri", "name", "null:named/file/app.env", (int) (short) -1, "sourceName", "subnet", "uri");
        org.junit.Assert.assertNotNull(uRI7);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getConfigrdFileName();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPassword(uRI5);
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI5);
        java.net.URI uRI8 = streamPacket7.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef9 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        java.lang.Object obj10 = streamPacket7.clone();
        java.io.InputStream inputStream11 = streamPacket7.getInputStream();
        boolean boolean12 = streamPacket7.isEmpty();
        org.junit.Assert.assertNotNull(uRIBuilder2);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{}");
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/http/app.env");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.io.InputStream inputStream4 = null;
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI3, inputStream4, (-1L));
        byte[] byteArray7 = streamPacket6.bytes();
        streamPacket6.setEncoding("HttpBasicAuth");
        java.lang.String str10 = streamPacket6.getETag();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        io.configrd.core.ConfigSourceResolver configSourceResolver0 = new io.configrd.core.ConfigSourceResolver();
        java.util.Optional<io.configrd.core.source.ConfigSource> configSourceOptional2 = configSourceResolver0.findConfigSourceByName("name");
        java.util.Optional<io.configrd.core.source.ConfigSource> configSourceOptional4 = configSourceResolver0.findConfigSourceByName("192.168.1.88");
        java.util.Optional<io.configrd.core.source.ConfigSource> configSourceOptional6 = configSourceResolver0.findConfigSourceByName("fileName");
        org.junit.Assert.assertNotNull(configSourceOptional2);
        org.junit.Assert.assertNotNull(configSourceOptional4);
        org.junit.Assert.assertNotNull(configSourceOptional6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder1.setPort(0);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getUsername();
        java.lang.String[] strArray3 = httpRepoDef1.valid();
        httpRepoDef1.setUsername("HttpBasicAuth");
        httpRepoDef1.setConfigrdFileName("io.configrd.core.exception.InitializationException: ");
        java.lang.String str8 = httpRepoDef1.getUsername();
        java.lang.String str9 = httpRepoDef1.getSourceName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HttpBasicAuth" + "'", str8, "HttpBasicAuth");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPassword(uRI5);
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI5);
        java.net.URI uRI8 = streamPacket7.getUri();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = streamPacket7.putIfAbsent("false", obj10);
        java.util.Collection<java.lang.Object> objCollection12 = streamPacket7.values();
        io.configrd.core.util.UriUtil.UriValidator uriValidator14 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator15 = uriValidator14.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator16 = uriValidator14.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator17 = uriValidator14.hasFile();
        io.configrd.core.util.UriUtil.UriValidator uriValidator18 = uriValidator14.hasFile();
        io.configrd.core.DefaultMergeStrategy defaultMergeStrategy19 = new io.configrd.core.DefaultMergeStrategy();
        java.lang.Object obj20 = streamPacket7.getOrDefault((java.lang.Object) uriValidator18, (java.lang.Object) defaultMergeStrategy19);
        java.lang.String str21 = streamPacket7.getETag();
        io.configrd.core.file.FileRepoDef fileRepoDef22 = new io.configrd.core.file.FileRepoDef("file", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        org.junit.Assert.assertNotNull(uRIBuilder2);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objCollection12);
        org.junit.Assert.assertNotNull(uriValidator14);
        org.junit.Assert.assertNotNull(uriValidator15);
        org.junit.Assert.assertNotNull(uriValidator16);
        org.junit.Assert.assertNotNull(uriValidator17);
        org.junit.Assert.assertNotNull(uriValidator18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        io.configrd.core.util.Environment environment0 = new io.configrd.core.util.Environment();
        java.lang.Class<?> wildcardClass1 = environment0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        java.lang.String str5 = httpRepoDef1.getPassword();
        java.lang.String str6 = httpRepoDef1.getUsername();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = httpRepoDef1.getNamed();
        java.lang.String str8 = httpRepoDef1.getSourceName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = io.configrd.core.processor.JsonProcessor.asProperties(byteArray1);
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = io.configrd.core.processor.JsonProcessor.asProperties(byteArray1);
        java.math.BigInteger bigInteger4 = io.configrd.core.util.FNV.fnv1_64(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(bigInteger4);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getUsername();
        java.lang.String[] strArray3 = httpRepoDef1.valid();
        java.lang.String str4 = httpRepoDef1.getUri();
        java.lang.String str5 = httpRepoDef1.getHostsName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.configrd.core.ConfigSourceResolver configSourceResolver0 = new io.configrd.core.ConfigSourceResolver();
        java.util.Optional<io.configrd.core.source.ConfigSource> configSourceOptional2 = configSourceResolver0.findConfigSourceByName("null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/file/app.env");
        org.junit.Assert.assertNotNull(configSourceOptional2);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setSourceName("named");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setPath("hostname");
        java.net.URI uRI5 = uRIBuilder3.build("os.version");
        io.configrd.core.util.URIBuilder uRIBuilder8 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI10 = uRIBuilder8.build("app.env");
        java.net.URI uRI11 = io.configrd.core.util.UriUtil.stripFile(uRI10);
        java.lang.String str12 = io.configrd.core.util.UriUtil.getPassword(uRI11);
        io.configrd.core.source.StreamPacket streamPacket13 = new io.configrd.core.source.StreamPacket(uRI11);
        java.net.URI uRI14 = streamPacket13.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef15 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket13);
        java.lang.Object obj16 = streamPacket13.clone();
        java.io.InputStream inputStream17 = streamPacket13.getInputStream();
        io.configrd.core.source.StreamPacket streamPacket19 = new io.configrd.core.source.StreamPacket(uRI5, inputStream17, (long) 10);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNotNull(uRIBuilder8);
        org.junit.Assert.assertNotNull(uRI10);
        org.junit.Assert.assertNotNull(uRI11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(uRI14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{}");
        org.junit.Assert.assertNotNull(inputStream17);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        io.configrd.core.util.EncryptUtil encryptUtil0 = new io.configrd.core.util.EncryptUtil();
        encryptUtil0.encrypt();
        encryptUtil0.encrypt();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        io.configrd.core.http.HttpConfigSourceFactory httpConfigSourceFactory0 = new io.configrd.core.http.HttpConfigSourceFactory();
        boolean boolean2 = httpConfigSourceFactory0.isCompatible("named");
        java.lang.String str3 = httpConfigSourceFactory0.getSourceName();
        java.lang.String str4 = httpConfigSourceFactory0.getSourceName();
        java.lang.String str5 = httpConfigSourceFactory0.getSourceName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http" + "'", str3, "http");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http" + "'", str4, "http");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http" + "'", str5, "http");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder1.setPasswordIfMissing("sourceName");
        io.configrd.core.util.URIBuilder uRIBuilder7 = uRIBuilder5.setHost("fileName");
        java.net.URI uRI9 = uRIBuilder5.build("");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
        org.junit.Assert.assertNotNull(uRIBuilder7);
        org.junit.Assert.assertNotNull(uRI9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        httpRepoDef1.setUri("username");
        io.configrd.core.http.DefaultHttpStreamSource defaultHttpStreamSource7 = new io.configrd.core.http.DefaultHttpStreamSource(httpRepoDef1);
        defaultHttpStreamSource7.close();
        defaultHttpStreamSource7.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<? extends io.configrd.core.source.PropertyPacket> wildcardOptional11 = defaultHttpStreamSource7.stream("http");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Uri null:username/http/ is not valid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        io.configrd.core.processor.ProcessorSelector.Type type0 = io.configrd.core.processor.ProcessorSelector.Type.TEXT;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = io.configrd.core.processor.ProcessorSelector.process(type0, byteArray7);
        io.configrd.core.processor.ProcessorSelector.Type type9 = io.configrd.core.processor.ProcessorSelector.Type.TEXT;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = io.configrd.core.processor.ProcessorSelector.process(type9, byteArray16);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = io.configrd.core.processor.PropertiesProcessor.asProperties(byteArray16);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = io.configrd.core.processor.ProcessorSelector.process(type0, byteArray16);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + io.configrd.core.processor.ProcessorSelector.Type.TEXT + "'", type0.equals(io.configrd.core.processor.ProcessorSelector.Type.TEXT));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 0, 1, 100]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + io.configrd.core.processor.ProcessorSelector.Type.TEXT + "'", type9.equals(io.configrd.core.processor.ProcessorSelector.Type.TEXT));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 0, -1, 0, 1, 100]");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI4);
        java.net.URI uRI7 = streamPacket6.getUri();
        java.util.Properties properties8 = streamPacket6.getProperties();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        io.configrd.core.DefaultMergeStrategy defaultMergeStrategy0 = new io.configrd.core.DefaultMergeStrategy();
        defaultMergeStrategy0.clear();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        defaultMergeStrategy0.addConfig(strMap2);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        java.math.BigInteger bigInteger4 = io.configrd.core.util.FNV.fnv1a_32(byteArray3);
        java.math.BigInteger bigInteger5 = io.configrd.core.util.FNV.fnv1_32(byteArray3);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = io.configrd.core.processor.PropertiesProcessor.asProperties(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        io.configrd.core.file.FileRepoDef fileRepoDef1 = new io.configrd.core.file.FileRepoDef("ip");
        java.lang.String str2 = fileRepoDef1.getFileName();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder1.setPasswordIfMissing("sourceName");
        io.configrd.core.util.URIBuilder uRIBuilder7 = uRIBuilder5.setUsernameIfMissing("configrd.");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
        org.junit.Assert.assertNotNull(uRIBuilder7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        io.configrd.core.file.FileRepoDef fileRepoDef1 = new io.configrd.core.file.FileRepoDef("configrd.yaml");
        fileRepoDef1.setName("secret");
        fileRepoDef1.setFileName("");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        io.configrd.core.processor.ProcessorSelector processorSelector0 = new io.configrd.core.processor.ProcessorSelector();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI4);
        java.net.URI uRI7 = streamPacket6.getUri();
        io.configrd.core.util.StringUtils stringUtils8 = new io.configrd.core.util.StringUtils((java.util.Map<java.lang.String, java.lang.Object>) streamPacket6);
        io.configrd.core.util.URIBuilder uRIBuilder10 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI11 = uRIBuilder10.build();
        io.configrd.core.util.URIBuilder uRIBuilder12 = io.configrd.core.util.URIBuilder.create(uRI11);
        boolean boolean13 = uRIBuilder12.hasFileName();
        io.configrd.core.util.URIBuilder uRIBuilder15 = uRIBuilder12.setFileName("name");
        java.lang.String str16 = stringUtils8.fill((java.lang.Object) "name");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertNotNull(uRIBuilder10);
        org.junit.Assert.assertNotNull(uRI11);
        org.junit.Assert.assertNotNull(uRIBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(uRIBuilder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "name" + "'", str16, "name");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder1.setPasswordIfMissing("");
        io.configrd.core.util.URIBuilder uRIBuilder7 = uRIBuilder1.setUsernameIfMissing("uri");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
        org.junit.Assert.assertNotNull(uRIBuilder7);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setHostsName("hi!");
        java.lang.String str5 = httpRepoDef1.getConfigrdFileName();
        java.lang.String str6 = httpRepoDef1.getConfigrdFileName();
        java.lang.String str7 = httpRepoDef1.getUri();
        java.lang.String str8 = httpRepoDef1.getUsername();
        httpRepoDef1.setName("os.name");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI4);
        java.net.URI uRI7 = streamPacket6.getUri();
        io.configrd.core.http.HttpRepoDef httpRepoDef10 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str11 = httpRepoDef10.getUsername();
        java.lang.Object obj12 = streamPacket6.replace("named/", (java.lang.Object) str11);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = streamPacket6.putIfAbsent("name", obj14);
        java.util.Set<java.lang.String> strSet16 = streamPacket6.keySet();
        io.configrd.core.util.URIBuilder uRIBuilder18 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI20 = uRIBuilder18.build("app.env");
        java.net.URI uRI21 = io.configrd.core.util.UriUtil.stripFile(uRI20);
        boolean boolean22 = io.configrd.core.util.UriUtil.hasFile(uRI21);
        java.io.InputStream inputStream23 = null;
        io.configrd.core.source.StreamPacket streamPacket24 = new io.configrd.core.source.StreamPacket(uRI21, inputStream23);
        java.util.Set<java.lang.String> strSet25 = streamPacket24.keySet();
        java.net.URI uRI26 = streamPacket24.getUri();
        java.net.URI uRI27 = streamPacket24.getUri();
        io.configrd.core.util.URIBuilder uRIBuilder29 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI31 = uRIBuilder29.build("app.env");
        java.net.URI uRI32 = io.configrd.core.util.UriUtil.stripFile(uRI31);
        java.lang.String str33 = io.configrd.core.util.UriUtil.getPassword(uRI32);
        io.configrd.core.source.StreamPacket streamPacket34 = new io.configrd.core.source.StreamPacket(uRI32);
        java.net.URI uRI35 = streamPacket34.getUri();
        java.net.URI uRI36 = io.configrd.core.util.UriUtil.stripFile(uRI35);
        io.configrd.core.source.PropertyPacket propertyPacket37 = new io.configrd.core.source.PropertyPacket(uRI35);
        boolean boolean38 = streamPacket24.containsKey((java.lang.Object) uRI35);
        boolean boolean39 = streamPacket6.equals((java.lang.Object) boolean38);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(uRIBuilder18);
        org.junit.Assert.assertNotNull(uRI20);
        org.junit.Assert.assertNotNull(uRI21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(uRI26);
        org.junit.Assert.assertNotNull(uRI27);
        org.junit.Assert.assertNotNull(uRIBuilder29);
        org.junit.Assert.assertNotNull(uRI31);
        org.junit.Assert.assertNotNull(uRI32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(uRI35);
        org.junit.Assert.assertNotNull(uRI36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        io.configrd.core.util.Environment environment0 = new io.configrd.core.util.Environment();
        java.util.Properties properties1 = environment0.getProperties();
        java.lang.String str2 = environment0.detectHostName();
        java.util.Properties properties3 = environment0.getProperties();
        java.lang.String str4 = environment0.detectIP();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hengchens-MBP" + "'", str2, "Hengchens-MBP");
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "192.168.1.88" + "'", str4, "192.168.1.88");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPassword(uRI5);
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI5);
        java.net.URI uRI8 = streamPacket7.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef9 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        java.lang.String str10 = fileRepoDef9.getConfigrdFileName();
        java.lang.String str11 = fileRepoDef9.getConfigrdFileName();
        java.lang.String str12 = fileRepoDef9.getFileName();
        org.junit.Assert.assertNotNull(uRIBuilder2);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        io.configrd.core.util.URIBuilder uRIBuilder3 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI5 = uRIBuilder3.build("app.env");
        java.net.URI uRI6 = io.configrd.core.util.UriUtil.stripFile(uRI5);
        java.lang.String str7 = io.configrd.core.util.UriUtil.getPassword(uRI6);
        io.configrd.core.source.StreamPacket streamPacket8 = new io.configrd.core.source.StreamPacket(uRI6);
        java.net.URI uRI9 = streamPacket8.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef10 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket8);
        java.lang.Object obj11 = streamPacket8.clone();
        java.io.InputStream inputStream12 = streamPacket8.getInputStream();
        inputStream12.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = io.configrd.core.processor.PropertiesProcessor.asProperties(inputStream12);
        inputStream12.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = io.configrd.core.processor.ProcessorSelector.process("named/", inputStream12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap17 = io.configrd.core.processor.JsonProcessor.asProperties(inputStream12);
            org.junit.Assert.fail("Expected exception of type com.jsoniter.spi.JsonException; message: read: premature end, head: 0, peek: , buf: ");
        } catch (com.jsoniter.spi.JsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNotNull(uRI6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{}");
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.net.URI uRI7 = io.configrd.core.util.UriUtil.buildURI("file", "authMethod", "false", (int) ' ', "authMethod", "configrd.", "hostname/os.version");
        org.junit.Assert.assertNotNull(uRI7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        java.lang.String[] strArray5 = httpRepoDef1.valid();
        java.lang.String str6 = httpRepoDef1.getPassword();
        java.lang.String str7 = httpRepoDef1.getAuthMethod();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HttpBasicAuth" + "'", str7, "HttpBasicAuth");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        java.lang.String[] strArray5 = httpRepoDef1.valid();
        java.lang.String str6 = httpRepoDef1.getConfigrdFileName();
        java.lang.String str7 = httpRepoDef1.getUri();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("uri");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setPassword("fileName");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        io.configrd.core.util.Environment environment0 = new io.configrd.core.util.Environment();
        java.util.Properties properties1 = environment0.getProperties();
        environment0.setHostName("trustCert");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = environment0.getEnvironment();
        org.junit.Assert.assertNotNull(properties1);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        io.configrd.core.util.DirectoryTraverse directoryTraverse1 = new io.configrd.core.util.DirectoryTraverse("null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/file/app.env");
        java.lang.String str2 = directoryTraverse1.ascend();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/file/app.env" + "'", str2, "null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/file/app.env");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI4);
        java.util.Properties properties7 = streamPacket6.getProperties();
        streamPacket6.setETag("null:named/file/app.env");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setPath("hostname");
        java.net.URI uRI5 = uRIBuilder3.build("os.version");
        io.configrd.core.util.URIBuilder uRIBuilder8 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI10 = uRIBuilder8.build("app.env");
        java.net.URI uRI11 = io.configrd.core.util.UriUtil.stripFile(uRI10);
        java.lang.String str12 = io.configrd.core.util.UriUtil.getPassword(uRI11);
        io.configrd.core.source.StreamPacket streamPacket13 = new io.configrd.core.source.StreamPacket(uRI11);
        java.net.URI uRI14 = streamPacket13.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef15 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket13);
        java.lang.Object obj16 = streamPacket13.clone();
        java.io.InputStream inputStream17 = streamPacket13.getInputStream();
        io.configrd.core.source.StreamPacket streamPacket18 = new io.configrd.core.source.StreamPacket(uRI5, inputStream17);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNotNull(uRIBuilder8);
        org.junit.Assert.assertNotNull(uRI10);
        org.junit.Assert.assertNotNull(uRI11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(uRI14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{}");
        org.junit.Assert.assertNotNull(inputStream17);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI2 = uRIBuilder1.build();
        java.net.URI uRI3 = io.configrd.core.util.UriUtil.stripFile(uRI2);
        java.lang.String str4 = io.configrd.core.util.UriUtil.getPath(uRI2);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI2);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "named" + "'", str4, "named");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPassword(uRI5);
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI5);
        java.net.URI uRI8 = streamPacket7.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef9 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        java.lang.String str10 = fileRepoDef9.getHostsName();
        java.lang.String str11 = fileRepoDef9.getFileName();
        org.junit.Assert.assertNotNull(uRIBuilder2);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder1.setScheme("app.name");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        io.configrd.core.http.HttpConfigSourceFactory httpConfigSourceFactory0 = new io.configrd.core.http.HttpConfigSourceFactory();
        java.lang.String str1 = httpConfigSourceFactory0.getSourceName();
        java.lang.String str2 = httpConfigSourceFactory0.getSourceName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http" + "'", str1, "http");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http" + "'", str2, "http");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        boolean boolean5 = io.configrd.core.util.UriUtil.hasFile(uRI4);
        java.io.InputStream inputStream6 = null;
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI4, inputStream6);
        io.configrd.core.util.URIBuilder uRIBuilder8 = io.configrd.core.util.URIBuilder.create(uRI4);
        boolean boolean9 = io.configrd.core.util.CfgrdURI.isCfgrdURI(uRI4);
        io.configrd.core.util.UriUtil.UriValidator uriValidator10 = io.configrd.core.util.UriUtil.validate(uRI4);
        io.configrd.core.util.URITraverse uRITraverse12 = new io.configrd.core.util.URITraverse(uRI4, "}");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(uRIBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(uriValidator10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.io.InputStream inputStream4 = null;
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI3, inputStream4, (-1L));
        // The following exception was thrown during execution in test generation
        try {
            io.configrd.core.util.CfgrdURI cfgrdURI7 = new io.configrd.core.util.CfgrdURI(uRI3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cfgrd uri must start with 'cfgrd://'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        io.configrd.core.util.URITraverse uRITraverse6 = new io.configrd.core.util.URITraverse(uRI3, "http");
        java.lang.String str7 = uRITraverse6.decend();
        java.lang.String str8 = uRITraverse6.decend();
        int int9 = uRITraverse6.available();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null:named/http/app.env" + "'", str7, "null:named/http/app.env");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null:http/app.env" + "'", str8, "null:http/app.env");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        io.configrd.core.file.FileRepoDef fileRepoDef1 = new io.configrd.core.file.FileRepoDef("Hengchens-MBP");
        fileRepoDef1.setSourceName("named");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getUsername();
        java.lang.String[] strArray3 = httpRepoDef1.valid();
        httpRepoDef1.setUsername("HttpBasicAuth");
        httpRepoDef1.setConfigrdFileName("io.configrd.core.exception.InitializationException: ");
        java.lang.String str8 = httpRepoDef1.getUsername();
        java.lang.String str9 = httpRepoDef1.getConfigrdFileName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HttpBasicAuth" + "'", str8, "HttpBasicAuth");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "io.configrd.core.exception.InitializationException: " + "'", str9, "io.configrd.core.exception.InitializationException: ");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        httpRepoDef1.setUri("username");
        io.configrd.core.http.DefaultHttpStreamSource defaultHttpStreamSource7 = new io.configrd.core.http.DefaultHttpStreamSource(httpRepoDef1);
        java.lang.String str8 = httpRepoDef1.getHostsName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap1 = io.configrd.core.processor.PropertiesProcessor.asProperties(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        io.configrd.core.file.FileConfigSourceFactory fileConfigSourceFactory0 = new io.configrd.core.file.FileConfigSourceFactory();
        java.lang.String str1 = fileConfigSourceFactory0.getSourceName();
        boolean boolean3 = fileConfigSourceFactory0.isCompatible("default.properties");
        io.configrd.core.util.URIBuilder uRIBuilder6 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI8 = uRIBuilder6.build("app.env");
        java.net.URI uRI9 = io.configrd.core.util.UriUtil.stripFile(uRI8);
        java.lang.String str10 = io.configrd.core.util.UriUtil.getPassword(uRI9);
        io.configrd.core.source.StreamPacket streamPacket11 = new io.configrd.core.source.StreamPacket(uRI9);
        java.net.URI uRI12 = streamPacket11.getUri();
        io.configrd.core.http.HttpRepoDef httpRepoDef15 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str16 = httpRepoDef15.getUsername();
        java.lang.Object obj17 = streamPacket11.replace("named/", (java.lang.Object) str16);
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = streamPacket11.putIfAbsent("name", obj19);
        java.util.Set<java.lang.String> strSet21 = streamPacket11.keySet();
        io.configrd.core.util.URIBuilder uRIBuilder23 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI25 = uRIBuilder23.build("app.env");
        java.net.URI uRI26 = io.configrd.core.util.UriUtil.stripFile(uRI25);
        boolean boolean27 = io.configrd.core.util.UriUtil.hasFile(uRI26);
        java.io.InputStream inputStream28 = null;
        io.configrd.core.source.StreamPacket streamPacket29 = new io.configrd.core.source.StreamPacket(uRI26, inputStream28);
        java.util.Set<java.lang.String> strSet30 = streamPacket29.keySet();
        java.util.Properties properties31 = io.configrd.core.processor.PropertiesProcessor.asProperties((java.util.Map<java.lang.String, java.lang.Object>) streamPacket29);
        io.configrd.core.util.StringUtils stringUtils32 = new io.configrd.core.util.StringUtils((java.util.Map<java.lang.String, java.lang.Object>) streamPacket29);
        io.configrd.core.util.URIBuilder uRIBuilder34 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI36 = uRIBuilder34.build("app.env");
        java.net.URI uRI37 = io.configrd.core.util.UriUtil.stripFile(uRI36);
        io.configrd.core.util.URITraverse uRITraverse39 = new io.configrd.core.util.URITraverse(uRI36, "http");
        java.lang.String str40 = uRITraverse39.decend();
        boolean boolean41 = uRITraverse39.hasNextUp();
        boolean boolean42 = uRITraverse39.hasNextUp();
        java.lang.String str44 = uRITraverse39.at((int) (short) 100);
        java.lang.Object obj45 = streamPacket29.get((java.lang.Object) uRITraverse39);
        io.configrd.core.util.UriUtil.UriValidator uriValidator47 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator48 = uriValidator47.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator49 = uriValidator47.hasScheme();
        io.configrd.core.util.UriUtil.UriValidator uriValidator50 = uriValidator47.hasPath();
        java.lang.Object obj51 = streamPacket11.getOrDefault((java.lang.Object) streamPacket29, (java.lang.Object) uriValidator50);
        io.configrd.core.processor.ProcessorSelector.Type type52 = io.configrd.core.processor.ProcessorSelector.Type.TEXT;
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Map<java.lang.String, java.lang.Object> strMap60 = io.configrd.core.processor.ProcessorSelector.process(type52, byteArray59);
        io.configrd.core.exception.InitializationException initializationException62 = new io.configrd.core.exception.InitializationException("");
        io.configrd.core.exception.InitializationException initializationException64 = new io.configrd.core.exception.InitializationException("");
        initializationException62.addSuppressed((java.lang.Throwable) initializationException64);
        java.lang.Object obj66 = streamPacket11.getOrDefault((java.lang.Object) type52, (java.lang.Object) initializationException64);
        // The following exception was thrown during execution in test generation
        try {
            io.configrd.core.file.DefaultFileConfigSource defaultFileConfigSource67 = fileConfigSourceFactory0.newConfigSource("null:named/file/app.env", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "file" + "'", str1, "file");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(uRIBuilder6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(uRI12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(uRIBuilder23);
        org.junit.Assert.assertNotNull(uRI25);
        org.junit.Assert.assertNotNull(uRI26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(uRIBuilder34);
        org.junit.Assert.assertNotNull(uRI36);
        org.junit.Assert.assertNotNull(uRI37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "null:named/http/app.env" + "'", str40, "null:named/http/app.env");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/http/app.env" + "'", str44, "null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/http/app.env");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(uriValidator47);
        org.junit.Assert.assertNotNull(uriValidator48);
        org.junit.Assert.assertNotNull(uriValidator49);
        org.junit.Assert.assertNotNull(uriValidator50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + type52 + "' != '" + io.configrd.core.processor.ProcessorSelector.Type.TEXT + "'", type52.equals(io.configrd.core.processor.ProcessorSelector.Type.TEXT));
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[10, 0, -1, 0, 1, 100]");
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "io.configrd.core.exception.InitializationException: ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj66), "io.configrd.core.exception.InitializationException: ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "io.configrd.core.exception.InitializationException: ");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URI uRI7 = io.configrd.core.util.UriUtil.buildURI("username", "username", "", (int) (byte) -1, "named", "Hengchens-MBP", "app.name");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected scheme name at index 0: ://namedHengchens-MBP/app.name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        java.math.BigInteger bigInteger4 = io.configrd.core.util.FNV.fnv1a_32(byteArray3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = io.configrd.core.processor.PropertiesProcessor.asProperties(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap6 = io.configrd.core.processor.JsonProcessor.asProperties(byteArray3);
            org.junit.Assert.fail("Expected exception of type com.jsoniter.spi.JsonException; message: read: premature end, head: 1, peek: ?, buf: ???");
        } catch (com.jsoniter.spi.JsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        httpRepoDef1.setUri("username");
        java.lang.String str7 = httpRepoDef1.getFileName();
        java.lang.String str8 = httpRepoDef1.getUsername();
        httpRepoDef1.setFileName("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder1.setFileName("http");
        io.configrd.core.util.URIBuilder uRIBuilder7 = uRIBuilder1.setPasswordIfMissing("io.configrd.core.exception.InitializationException: ");
        io.configrd.core.util.URIBuilder uRIBuilder9 = uRIBuilder1.setUsername("null://Hengchens-MBP@/named/http#trustCert,,subnet,hostsName");
        java.lang.String str10 = uRIBuilder1.getFileName();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
        org.junit.Assert.assertNotNull(uRIBuilder7);
        org.junit.Assert.assertNotNull(uRIBuilder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http" + "'", str10, "http");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.slf4j.Logger logger0 = io.configrd.core.util.EncryptUtil.log;
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = io.configrd.core.processor.JsonProcessor.asProperties(byteArray1);
        java.math.BigInteger bigInteger3 = io.configrd.core.util.FNV.fnv1a_32(byteArray1);
        java.math.BigInteger bigInteger4 = io.configrd.core.util.FNV.fnv1a_64(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigInteger4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        io.configrd.core.util.URITraverse uRITraverse6 = new io.configrd.core.util.URITraverse(uRI3, "http");
        java.lang.String str7 = uRITraverse6.decend();
        boolean boolean8 = uRITraverse6.hasNextDown();
        boolean boolean9 = uRITraverse6.hasNextUp();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null:named/http/app.env" + "'", str7, "null:named/http/app.env");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI2 = uRIBuilder1.build();
        io.configrd.core.util.URIBuilder uRIBuilder4 = uRIBuilder1.setScheme("default");
        io.configrd.core.util.URIBuilder uRIBuilder6 = uRIBuilder1.setFileNameIfMissing("hostname");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI2);
        org.junit.Assert.assertNotNull(uRIBuilder4);
        org.junit.Assert.assertNotNull(uRIBuilder6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI4);
        java.net.URI uRI7 = streamPacket6.getUri();
        io.configrd.core.util.URIBuilder uRIBuilder9 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI11 = uRIBuilder9.build("app.env");
        java.net.URI uRI12 = io.configrd.core.util.UriUtil.stripFile(uRI11);
        boolean boolean13 = io.configrd.core.util.UriUtil.hasFile(uRI12);
        java.io.InputStream inputStream14 = null;
        io.configrd.core.source.StreamPacket streamPacket15 = new io.configrd.core.source.StreamPacket(uRI12, inputStream14);
        java.util.Set<java.lang.String> strSet16 = streamPacket15.keySet();
        java.net.URI uRI17 = streamPacket15.getUri();
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet18 = streamPacket15.entrySet();
        java.lang.Object obj19 = streamPacket6.remove((java.lang.Object) streamPacket15);
        java.lang.String str20 = io.configrd.core.processor.PropertiesProcessor.toText((java.util.Map<java.lang.String, java.lang.Object>) streamPacket6);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertNotNull(uRIBuilder9);
        org.junit.Assert.assertNotNull(uRI11);
        org.junit.Assert.assertNotNull(uRI12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(uRI17);
        org.junit.Assert.assertNotNull(strEntrySet18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = httpRepoDef1.getNamed();
        java.lang.String str3 = httpRepoDef1.getUsername();
        httpRepoDef1.setUri("io.configrd.core.exception.InitializationException: ");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPassword(uRI5);
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI5);
        java.net.URI uRI8 = streamPacket7.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef9 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        java.lang.Object obj10 = streamPacket7.clone();
        java.io.InputStream inputStream11 = streamPacket7.getInputStream();
        inputStream11.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = io.configrd.core.processor.PropertiesProcessor.asProperties(inputStream11);
        inputStream11.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = io.configrd.core.processor.PropertiesProcessor.asProperties(inputStream11);
        inputStream11.close();
        org.junit.Assert.assertNotNull(uRIBuilder2);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{}");
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        io.configrd.core.exception.InitializationException initializationException1 = new io.configrd.core.exception.InitializationException("app.env");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder1.setUsername("authMethod");
        io.configrd.core.util.URIBuilder uRIBuilder7 = uRIBuilder1.setFileName("os.version");
        java.lang.String[] strArray12 = new java.lang.String[] { "null://Hengchens-MBP@/named/http#trustCert,,subnet,hostsName", "null:named/file/app.env", "null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/http/app.env" };
        io.configrd.core.util.URIBuilder uRIBuilder13 = uRIBuilder1.setPath("null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/http/app.env", strArray12);
        boolean boolean14 = uRIBuilder13.hasFileName();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
        org.junit.Assert.assertNotNull(uRIBuilder7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(uRIBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        httpRepoDef1.setUri("username");
        java.lang.String str7 = httpRepoDef1.getFileName();
        java.lang.String str8 = httpRepoDef1.getUsername();
        java.lang.String str9 = httpRepoDef1.getHostsName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        boolean boolean5 = io.configrd.core.util.UriUtil.hasFile(uRI4);
        java.io.InputStream inputStream6 = null;
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI4, inputStream6);
        java.util.Set<java.lang.String> strSet8 = streamPacket7.keySet();
        java.util.Properties properties9 = io.configrd.core.processor.PropertiesProcessor.asProperties((java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        io.configrd.core.util.StringUtils stringUtils10 = new io.configrd.core.util.StringUtils((java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        io.configrd.core.util.URIBuilder uRIBuilder12 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI14 = uRIBuilder12.build("app.env");
        java.net.URI uRI15 = io.configrd.core.util.UriUtil.stripFile(uRI14);
        io.configrd.core.util.URITraverse uRITraverse17 = new io.configrd.core.util.URITraverse(uRI14, "http");
        java.lang.String str18 = uRITraverse17.decend();
        boolean boolean19 = uRITraverse17.hasNextUp();
        boolean boolean20 = uRITraverse17.hasNextUp();
        java.lang.String str22 = uRITraverse17.at((int) (short) 100);
        java.lang.Object obj23 = streamPacket7.get((java.lang.Object) uRITraverse17);
        boolean boolean24 = uRITraverse17.hasNextUp();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(uRIBuilder12);
        org.junit.Assert.assertNotNull(uRI14);
        org.junit.Assert.assertNotNull(uRI15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null:named/http/app.env" + "'", str18, "null:named/http/app.env");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/http/app.env" + "'", str22, "null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/http/app.env");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.configrd.core.processor.ProcessorSelector.Type type0 = io.configrd.core.processor.ProcessorSelector.Type.TEXT;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = io.configrd.core.processor.ProcessorSelector.process(type0, byteArray7);
        java.math.BigInteger bigInteger9 = io.configrd.core.util.FNV.fnv1a_32(byteArray7);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + io.configrd.core.processor.ProcessorSelector.Type.TEXT + "'", type0.equals(io.configrd.core.processor.ProcessorSelector.Type.TEXT));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 0, 1, 100]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(bigInteger9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        httpRepoDef1.setUri("username");
        io.configrd.core.http.DefaultHttpStreamSource defaultHttpStreamSource7 = new io.configrd.core.http.DefaultHttpStreamSource(httpRepoDef1);
        defaultHttpStreamSource7.close();
        defaultHttpStreamSource7.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<io.configrd.core.source.StreamPacket> streamPacketOptional11 = defaultHttpStreamSource7.streamFile("ip");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Uri null:username/ip/ is not valid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        boolean boolean1 = io.configrd.core.util.UriUtil.hasFile("192.168.1.88");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        httpRepoDef1.setUri("username");
        io.configrd.core.http.DefaultHttpStreamSource defaultHttpStreamSource7 = new io.configrd.core.http.DefaultHttpStreamSource(httpRepoDef1);
        defaultHttpStreamSource7.close();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<? extends io.configrd.core.source.PropertyPacket> wildcardOptional10 = defaultHttpStreamSource7.stream("authMethod");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Uri null:username/authMethod/ is not valid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        io.configrd.core.util.Environment environment0 = new io.configrd.core.util.Environment();
        java.lang.String str1 = environment0.detectHostName();
        environment0.setApplicationName("192.168.1.88");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hengchens-MBP" + "'", str1, "Hengchens-MBP");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPassword(uRI5);
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI5);
        java.util.Properties properties8 = streamPacket7.getProperties();
        io.configrd.core.file.FileRepoDef fileRepoDef9 = new io.configrd.core.file.FileRepoDef("configrd.yaml", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        io.configrd.core.file.FileRepoDef fileRepoDef12 = new io.configrd.core.file.FileRepoDef("Hengchens-MBP");
        java.lang.String str13 = fileRepoDef12.getFileName();
        fileRepoDef12.setFileName("");
        java.lang.Object obj16 = streamPacket7.replace("default", (java.lang.Object) "");
        java.util.Properties properties17 = io.configrd.core.processor.PropertiesProcessor.asProperties((java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        org.junit.Assert.assertNotNull(uRIBuilder2);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        io.configrd.core.util.UriUtil.UriValidator uriValidator1 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator2 = uriValidator1.hasPath();
        io.configrd.core.util.UriUtil.UriValidator uriValidator3 = uriValidator1.hasPassword();
        org.junit.Assert.assertNotNull(uriValidator1);
        org.junit.Assert.assertNotNull(uriValidator2);
        org.junit.Assert.assertNotNull(uriValidator3);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        io.configrd.core.processor.ProcessorSelector.Type type0 = io.configrd.core.processor.ProcessorSelector.Type.TEXT;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = io.configrd.core.processor.ProcessorSelector.process(type0, byteArray7);
        java.math.BigInteger bigInteger9 = io.configrd.core.util.FNV.fnv1_64(byteArray7);
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + io.configrd.core.processor.ProcessorSelector.Type.TEXT + "'", type0.equals(io.configrd.core.processor.ProcessorSelector.Type.TEXT));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 0, 1, 100]");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(bigInteger9);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder1.setFileName("http");
        io.configrd.core.util.URIBuilder uRIBuilder7 = uRIBuilder1.setPasswordIfMissing("io.configrd.core.exception.InitializationException: ");
        io.configrd.core.util.URIBuilder uRIBuilder9 = uRIBuilder1.setUsername("null://Hengchens-MBP@/named/http#trustCert,,subnet,hostsName");
        io.configrd.core.util.URIBuilder uRIBuilder11 = uRIBuilder9.setHost("username");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
        org.junit.Assert.assertNotNull(uRIBuilder7);
        org.junit.Assert.assertNotNull(uRIBuilder9);
        org.junit.Assert.assertNotNull(uRIBuilder11);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI4);
        java.net.URI uRI7 = streamPacket6.getUri();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = streamPacket6.putIfAbsent("false", obj9);
        java.util.Collection<java.lang.Object> objCollection11 = streamPacket6.values();
        io.configrd.core.util.UriUtil.UriValidator uriValidator13 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator14 = uriValidator13.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator15 = uriValidator13.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator16 = uriValidator13.hasFile();
        io.configrd.core.util.UriUtil.UriValidator uriValidator17 = uriValidator13.hasFile();
        io.configrd.core.DefaultMergeStrategy defaultMergeStrategy18 = new io.configrd.core.DefaultMergeStrategy();
        java.lang.Object obj19 = streamPacket6.getOrDefault((java.lang.Object) uriValidator17, (java.lang.Object) defaultMergeStrategy18);
        io.configrd.core.util.URIBuilder uRIBuilder22 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI24 = uRIBuilder22.build("app.env");
        java.net.URI uRI25 = io.configrd.core.util.UriUtil.stripFile(uRI24);
        boolean boolean26 = io.configrd.core.util.UriUtil.hasFile(uRI25);
        java.io.InputStream inputStream27 = null;
        io.configrd.core.source.StreamPacket streamPacket28 = new io.configrd.core.source.StreamPacket(uRI25, inputStream27);
        java.util.Set<java.lang.String> strSet29 = streamPacket28.keySet();
        java.util.Properties properties30 = io.configrd.core.processor.PropertiesProcessor.asProperties((java.util.Map<java.lang.String, java.lang.Object>) streamPacket28);
        io.configrd.core.http.HttpRepoDef httpRepoDef31 = new io.configrd.core.http.HttpRepoDef("os.version", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket28);
        defaultMergeStrategy18.addConfig((java.util.Map<java.lang.String, java.lang.Object>) streamPacket28);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objCollection11);
        org.junit.Assert.assertNotNull(uriValidator13);
        org.junit.Assert.assertNotNull(uriValidator14);
        org.junit.Assert.assertNotNull(uriValidator15);
        org.junit.Assert.assertNotNull(uriValidator16);
        org.junit.Assert.assertNotNull(uriValidator17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(uRIBuilder22);
        org.junit.Assert.assertNotNull(uRI24);
        org.junit.Assert.assertNotNull(uRI25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        io.configrd.core.util.Environment environment0 = new io.configrd.core.util.Environment();
        environment0.setHostName("file");
        environment0.setEnvironmentName("null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/http/app.env");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder3.setFileName("hi!");
        io.configrd.core.util.URIBuilder uRIBuilder7 = uRIBuilder3.setPath("app.name");
        java.lang.String str8 = uRIBuilder7.getFileName();
        io.configrd.core.util.URIBuilder uRIBuilder10 = uRIBuilder7.setPassword("subnet");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
        org.junit.Assert.assertNotNull(uRIBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "app.name" + "'", str8, "app.name");
        org.junit.Assert.assertNotNull(uRIBuilder10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        io.configrd.core.util.URITraverse uRITraverse5 = new io.configrd.core.util.URITraverse(uRI4);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        httpRepoDef1.setUri("username");
        io.configrd.core.http.DefaultHttpStreamSource defaultHttpStreamSource7 = new io.configrd.core.http.DefaultHttpStreamSource(httpRepoDef1);
        defaultHttpStreamSource7.close();
        defaultHttpStreamSource7.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<? extends io.configrd.core.source.PropertyPacket> wildcardOptional11 = defaultHttpStreamSource7.stream("trustCert");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Uri null:username/trustCert/ is not valid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getUsername();
        java.lang.String[] strArray3 = httpRepoDef1.valid();
        httpRepoDef1.setUsername("HttpBasicAuth");
        httpRepoDef1.setConfigrdFileName("ip");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI4);
        java.net.URI uRI7 = streamPacket6.getUri();
        io.configrd.core.util.StringUtils stringUtils8 = new io.configrd.core.util.StringUtils((java.util.Map<java.lang.String, java.lang.Object>) streamPacket6);
        io.configrd.core.http.HttpConfigSourceFactory httpConfigSourceFactory9 = new io.configrd.core.http.HttpConfigSourceFactory();
        boolean boolean11 = httpConfigSourceFactory9.isCompatible("subnet");
        java.lang.String str12 = httpConfigSourceFactory9.getSourceName();
        java.lang.String str13 = httpConfigSourceFactory9.getSourceName();
        java.lang.Object obj15 = streamPacket6.getOrDefault((java.lang.Object) str13, (java.lang.Object) "named/");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http" + "'", str12, "http");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http" + "'", str13, "http");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "named/" + "'", obj15, "named/");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        io.configrd.core.DefaultMergeStrategy defaultMergeStrategy0 = new io.configrd.core.DefaultMergeStrategy();
        defaultMergeStrategy0.clear();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = defaultMergeStrategy0.merge();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = defaultMergeStrategy0.merge();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = defaultMergeStrategy0.merge();
        io.configrd.core.util.URIBuilder uRIBuilder6 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI8 = uRIBuilder6.build("app.env");
        java.net.URI uRI9 = io.configrd.core.util.UriUtil.stripFile(uRI8);
        boolean boolean10 = io.configrd.core.util.UriUtil.hasFile(uRI9);
        java.io.InputStream inputStream11 = null;
        io.configrd.core.source.StreamPacket streamPacket12 = new io.configrd.core.source.StreamPacket(uRI9, inputStream11);
        defaultMergeStrategy0.addConfig((java.util.Map<java.lang.String, java.lang.Object>) streamPacket12);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = defaultMergeStrategy0.merge();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(uRIBuilder6);
        org.junit.Assert.assertNotNull(uRI8);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getFileName();
        java.lang.String str3 = httpRepoDef1.getUri();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        boolean boolean5 = io.configrd.core.util.UriUtil.hasFile(uRI4);
        java.io.InputStream inputStream6 = null;
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI4, inputStream6);
        java.util.Set<java.lang.String> strSet8 = streamPacket7.keySet();
        java.net.URI uRI9 = streamPacket7.getUri();
        java.net.URI uRI10 = streamPacket7.getUri();
        streamPacket7.setEncoding("false");
        java.util.Collection<java.lang.Object> objCollection13 = streamPacket7.values();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertNotNull(uRI10);
        org.junit.Assert.assertNotNull(objCollection13);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getUsername();
        java.lang.String[] strArray3 = httpRepoDef1.valid();
        java.lang.String str4 = httpRepoDef1.getUri();
        java.lang.String str5 = httpRepoDef1.getPassword();
        java.lang.String str6 = httpRepoDef1.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.io.InputStream inputStream4 = null;
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI3, inputStream4, (-1L));
        io.configrd.core.util.URITraverse uRITraverse8 = new io.configrd.core.util.URITraverse(uRI3, "file");
        boolean boolean9 = uRITraverse8.hasNextDown();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setPath("hostname");
        java.net.URI uRI5 = uRIBuilder3.build("os.version");
        io.configrd.core.util.URIBuilder uRIBuilder7 = uRIBuilder3.setUsername("null:file/app.env");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNotNull(uRIBuilder7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        boolean boolean5 = io.configrd.core.util.UriUtil.hasFile(uRI4);
        java.io.InputStream inputStream6 = null;
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI4, inputStream6);
        io.configrd.core.util.URIBuilder uRIBuilder8 = io.configrd.core.util.URIBuilder.create(uRI4);
        io.configrd.core.util.URIBuilder uRIBuilder10 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI11 = uRIBuilder10.build();
        java.net.URI uRI12 = io.configrd.core.util.UriUtil.stripFile(uRI11);
        java.lang.String str13 = io.configrd.core.util.UriUtil.getPath(uRI4, uRI12);
        boolean boolean14 = io.configrd.core.util.CfgrdURI.isCfgrdURI(uRI4);
        java.net.URI uRI15 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(uRIBuilder8);
        org.junit.Assert.assertNotNull(uRIBuilder10);
        org.junit.Assert.assertNotNull(uRI11);
        org.junit.Assert.assertNotNull(uRI12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/" + "'", str13, "/");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(uRI15);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getUsername();
        java.lang.String[] strArray3 = httpRepoDef1.valid();
        java.lang.String[] strArray4 = httpRepoDef1.valid();
        java.lang.String str5 = httpRepoDef1.getUsername();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        io.configrd.core.util.UriUtil.UriValidator uriValidator1 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator2 = uriValidator1.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator3 = uriValidator1.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator4 = uriValidator1.hasFile();
        io.configrd.core.util.UriUtil.UriValidator uriValidator5 = uriValidator1.hasFile();
        io.configrd.core.util.URIBuilder uRIBuilder7 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI9 = uRIBuilder7.build("app.env");
        java.net.URI uRI10 = io.configrd.core.util.UriUtil.stripFile(uRI9);
        boolean boolean11 = io.configrd.core.util.UriUtil.hasFile(uRI10);
        java.io.InputStream inputStream12 = null;
        io.configrd.core.source.StreamPacket streamPacket13 = new io.configrd.core.source.StreamPacket(uRI10, inputStream12);
        java.util.Set<java.lang.String> strSet14 = streamPacket13.keySet();
        io.configrd.core.http.HttpRepoDef httpRepoDef16 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str17 = httpRepoDef16.getAuthMethod();
        httpRepoDef16.setTrustCert((java.lang.Boolean) true);
        java.lang.String[] strArray20 = httpRepoDef16.valid();
        java.lang.Object obj21 = streamPacket13.get((java.lang.Object) strArray20);
        io.configrd.core.util.UriUtil.UriValidator uriValidator22 = uriValidator1.isScheme(strArray20);
        boolean boolean23 = uriValidator1.valid();
        java.lang.String[] strArray25 = io.configrd.core.util.UriUtil.getDirSegements("fileName");
        io.configrd.core.util.UriUtil.UriValidator uriValidator26 = uriValidator1.isScheme(strArray25);
        org.junit.Assert.assertNotNull(uriValidator1);
        org.junit.Assert.assertNotNull(uriValidator2);
        org.junit.Assert.assertNotNull(uriValidator3);
        org.junit.Assert.assertNotNull(uriValidator4);
        org.junit.Assert.assertNotNull(uriValidator5);
        org.junit.Assert.assertNotNull(uRIBuilder7);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertNotNull(uRI10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HttpBasicAuth" + "'", str17, "HttpBasicAuth");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(uriValidator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(uriValidator26);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("uri");
        java.net.URI uRI3 = uRIBuilder1.build("false");
        io.configrd.core.util.URITraverse uRITraverse5 = new io.configrd.core.util.URITraverse(uRI3, "named/");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI4);
        java.net.URI uRI7 = streamPacket6.getUri();
        io.configrd.core.http.HttpRepoDef httpRepoDef10 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str11 = httpRepoDef10.getUsername();
        java.lang.Object obj12 = streamPacket6.replace("named/", (java.lang.Object) str11);
        boolean boolean13 = streamPacket6.hasContent();
        java.util.Properties properties14 = streamPacket6.getProperties();
        io.configrd.core.http.HttpRepoDef httpRepoDef16 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str17 = httpRepoDef16.getAuthMethod();
        httpRepoDef16.setTrustCert((java.lang.Boolean) true);
        java.lang.String str20 = httpRepoDef16.getPassword();
        java.lang.String str21 = httpRepoDef16.getUsername();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = httpRepoDef16.getNamed();
        streamPacket6.putAll(strMap22);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HttpBasicAuth" + "'", str17, "HttpBasicAuth");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI2 = uRIBuilder1.build();
        java.net.URI uRI3 = io.configrd.core.util.UriUtil.stripFile(uRI2);
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getUsername(uRI4);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI2);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder1.setPasswordIfMissing("null:named/http/app.env");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        java.util.Optional<java.lang.String> strOptional6 = io.configrd.core.util.UriUtil.getFileName(uRI4);
        java.lang.String str7 = io.configrd.core.util.UriUtil.getLastDirSegment(uRI4);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strOptional6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "named" + "'", str7, "named");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("uri");
        java.net.URI uRI3 = uRIBuilder1.build("false");
        io.configrd.core.util.URITraverse uRITraverse5 = new io.configrd.core.util.URITraverse(uRI3, "secret");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        boolean boolean5 = io.configrd.core.util.UriUtil.hasFile(uRI4);
        java.io.InputStream inputStream6 = null;
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI4, inputStream6);
        java.util.Set<java.lang.String> strSet8 = streamPacket7.keySet();
        java.util.Properties properties9 = io.configrd.core.processor.PropertiesProcessor.asProperties((java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        io.configrd.core.util.StringUtils stringUtils10 = new io.configrd.core.util.StringUtils((java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        io.configrd.core.util.EncryptUtil encryptUtil11 = new io.configrd.core.util.EncryptUtil();
        java.lang.String str12 = stringUtils10.fill((java.lang.Object) encryptUtil11);
        io.configrd.core.util.URIBuilder uRIBuilder14 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI16 = uRIBuilder14.build("app.env");
        java.net.URI uRI17 = io.configrd.core.util.UriUtil.stripFile(uRI16);
        boolean boolean18 = io.configrd.core.util.UriUtil.hasFile(uRI17);
        java.io.InputStream inputStream19 = null;
        io.configrd.core.source.StreamPacket streamPacket20 = new io.configrd.core.source.StreamPacket(uRI17, inputStream19);
        java.util.Set<java.lang.String> strSet21 = streamPacket20.keySet();
        io.configrd.core.http.HttpRepoDef httpRepoDef23 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str24 = httpRepoDef23.getAuthMethod();
        httpRepoDef23.setTrustCert((java.lang.Boolean) true);
        java.lang.String[] strArray27 = httpRepoDef23.valid();
        java.lang.Object obj28 = streamPacket20.get((java.lang.Object) strArray27);
        java.lang.String str29 = stringUtils10.fill((java.lang.Object) strArray27);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(uRIBuilder14);
        org.junit.Assert.assertNotNull(uRI16);
        org.junit.Assert.assertNotNull(uRI17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HttpBasicAuth" + "'", str24, "HttpBasicAuth");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        io.configrd.core.util.Environment environment0 = new io.configrd.core.util.Environment();
        environment0.setHostName("file");
        java.lang.String str3 = environment0.detectIP();
        environment0.setEnvironmentName("named/");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "192.168.1.88" + "'", str3, "192.168.1.88");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        io.configrd.core.util.URIBuilder uRIBuilder3 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI5 = uRIBuilder3.build("app.env");
        java.net.URI uRI6 = io.configrd.core.util.UriUtil.stripFile(uRI5);
        java.lang.String str7 = io.configrd.core.util.UriUtil.getPassword(uRI6);
        io.configrd.core.source.StreamPacket streamPacket8 = new io.configrd.core.source.StreamPacket(uRI6);
        java.net.URI uRI9 = streamPacket8.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef10 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket8);
        java.lang.Object obj11 = streamPacket8.clone();
        java.io.InputStream inputStream12 = streamPacket8.getInputStream();
        inputStream12.close();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = io.configrd.core.processor.PropertiesProcessor.asProperties(inputStream12);
        io.configrd.core.file.FileRepoDef fileRepoDef15 = new io.configrd.core.file.FileRepoDef("ip", strMap14);
        fileRepoDef15.setUri("192.168.1.88");
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNotNull(uRI6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(uRI9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{}");
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setHostsName("hi!");
        java.lang.String str5 = httpRepoDef1.getConfigrdFileName();
        java.lang.String str6 = httpRepoDef1.getConfigrdFileName();
        java.lang.String str7 = httpRepoDef1.getUri();
        java.lang.String str8 = httpRepoDef1.getHostsName();
        java.lang.String str9 = httpRepoDef1.getAuthMethod();
        java.lang.String str10 = httpRepoDef1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HttpBasicAuth" + "'", str9, "HttpBasicAuth");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.io.InputStream inputStream4 = null;
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI3, inputStream4, (-1L));
        io.configrd.core.util.URITraverse uRITraverse8 = new io.configrd.core.util.URITraverse(uRI3, "file");
        boolean boolean9 = uRITraverse8.hasNextUp();
        java.lang.String str10 = uRITraverse8.ascend();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null:named/file/app.env" + "'", str10, "null:named/file/app.env");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setHostsName("hi!");
        java.lang.String str5 = httpRepoDef1.getConfigrdFileName();
        java.lang.String str6 = httpRepoDef1.getAuthMethod();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HttpBasicAuth" + "'", str6, "HttpBasicAuth");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        io.configrd.core.processor.ProcessorSelector.Type type0 = io.configrd.core.processor.ProcessorSelector.Type.JSON;
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        boolean boolean6 = io.configrd.core.util.UriUtil.hasFile(uRI5);
        java.io.InputStream inputStream7 = null;
        io.configrd.core.source.StreamPacket streamPacket8 = new io.configrd.core.source.StreamPacket(uRI5, inputStream7);
        java.util.Set<java.lang.String> strSet9 = streamPacket8.keySet();
        java.util.Properties properties10 = io.configrd.core.processor.PropertiesProcessor.asProperties((java.util.Map<java.lang.String, java.lang.Object>) streamPacket8);
        byte[] byteArray11 = streamPacket8.bytes();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap12 = io.configrd.core.processor.ProcessorSelector.process(type0, byteArray11);
            org.junit.Assert.fail("Expected exception of type com.jsoniter.spi.JsonException; message: read: premature end, head: 0, peek: , buf: ");
        } catch (com.jsoniter.spi.JsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + io.configrd.core.processor.ProcessorSelector.Type.JSON + "'", type0.equals(io.configrd.core.processor.ProcessorSelector.Type.JSON));
        org.junit.Assert.assertNotNull(uRIBuilder2);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI4);
        java.net.URI uRI7 = streamPacket6.getUri();
        io.configrd.core.http.HttpRepoDef httpRepoDef10 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str11 = httpRepoDef10.getUsername();
        java.lang.Object obj12 = streamPacket6.replace("named/", (java.lang.Object) str11);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = streamPacket6.putIfAbsent("name", obj14);
        java.util.Set<java.lang.String> strSet16 = streamPacket6.keySet();
        io.configrd.core.util.URIBuilder uRIBuilder18 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI20 = uRIBuilder18.build("app.env");
        java.net.URI uRI21 = io.configrd.core.util.UriUtil.stripFile(uRI20);
        boolean boolean22 = io.configrd.core.util.UriUtil.hasFile(uRI21);
        java.io.InputStream inputStream23 = null;
        io.configrd.core.source.StreamPacket streamPacket24 = new io.configrd.core.source.StreamPacket(uRI21, inputStream23);
        java.util.Set<java.lang.String> strSet25 = streamPacket24.keySet();
        java.util.Properties properties26 = io.configrd.core.processor.PropertiesProcessor.asProperties((java.util.Map<java.lang.String, java.lang.Object>) streamPacket24);
        io.configrd.core.util.StringUtils stringUtils27 = new io.configrd.core.util.StringUtils((java.util.Map<java.lang.String, java.lang.Object>) streamPacket24);
        io.configrd.core.util.URIBuilder uRIBuilder29 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI31 = uRIBuilder29.build("app.env");
        java.net.URI uRI32 = io.configrd.core.util.UriUtil.stripFile(uRI31);
        io.configrd.core.util.URITraverse uRITraverse34 = new io.configrd.core.util.URITraverse(uRI31, "http");
        java.lang.String str35 = uRITraverse34.decend();
        boolean boolean36 = uRITraverse34.hasNextUp();
        boolean boolean37 = uRITraverse34.hasNextUp();
        java.lang.String str39 = uRITraverse34.at((int) (short) 100);
        java.lang.Object obj40 = streamPacket24.get((java.lang.Object) uRITraverse34);
        io.configrd.core.util.UriUtil.UriValidator uriValidator42 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator43 = uriValidator42.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator44 = uriValidator42.hasScheme();
        io.configrd.core.util.UriUtil.UriValidator uriValidator45 = uriValidator42.hasPath();
        java.lang.Object obj46 = streamPacket6.getOrDefault((java.lang.Object) streamPacket24, (java.lang.Object) uriValidator45);
        io.configrd.core.ConfigSourceResolver configSourceResolver47 = new io.configrd.core.ConfigSourceResolver();
        java.util.Optional<io.configrd.core.source.ConfigSource> configSourceOptional49 = configSourceResolver47.findConfigSourceByName("name");
        java.lang.Object obj50 = streamPacket24.get((java.lang.Object) "name");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(uRIBuilder18);
        org.junit.Assert.assertNotNull(uRI20);
        org.junit.Assert.assertNotNull(uRI21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(uRIBuilder29);
        org.junit.Assert.assertNotNull(uRI31);
        org.junit.Assert.assertNotNull(uRI32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "null:named/http/app.env" + "'", str35, "null:named/http/app.env");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/http/app.env" + "'", str39, "null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/http/app.env");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(uriValidator42);
        org.junit.Assert.assertNotNull(uriValidator43);
        org.junit.Assert.assertNotNull(uriValidator44);
        org.junit.Assert.assertNotNull(uriValidator45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(configSourceOptional49);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        httpRepoDef1.setUri("username");
        io.configrd.core.http.DefaultHttpStreamSource defaultHttpStreamSource7 = new io.configrd.core.http.DefaultHttpStreamSource(httpRepoDef1);
        java.lang.String str8 = defaultHttpStreamSource7.getSourceName();
        defaultHttpStreamSource7.init();
        io.configrd.core.http.HttpRepoDef httpRepoDef10 = defaultHttpStreamSource7.getSourceConfig();
        defaultHttpStreamSource7.init();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HttpBasicAuth" + "'", str2, "HttpBasicAuth");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http" + "'", str8, "http");
        org.junit.Assert.assertNotNull(httpRepoDef10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        io.configrd.core.util.UriUtil.UriValidator uriValidator1 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator2 = uriValidator1.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator3 = uriValidator1.hasScheme();
        io.configrd.core.util.UriUtil.UriValidator uriValidator4 = uriValidator1.hasPath();
        io.configrd.core.util.UriUtil.UriValidator uriValidator5 = uriValidator1.hasScheme();
        org.junit.Assert.assertNotNull(uriValidator1);
        org.junit.Assert.assertNotNull(uriValidator2);
        org.junit.Assert.assertNotNull(uriValidator3);
        org.junit.Assert.assertNotNull(uriValidator4);
        org.junit.Assert.assertNotNull(uriValidator5);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.lang.String str0 = io.configrd.core.ConfigSourceResolver.DEFAULT_CONFIG_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "file:/srv/configrd/configrd.yaml" + "'", str0, "file:/srv/configrd/configrd.yaml");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        io.configrd.core.util.UriUtil.UriValidator uriValidator1 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator2 = uriValidator1.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator3 = uriValidator1.hasScheme();
        io.configrd.core.util.UriUtil.UriValidator uriValidator4 = uriValidator1.hasPath();
        io.configrd.core.util.UriUtil.UriValidator uriValidator5 = uriValidator1.hasHost();
        boolean boolean6 = uriValidator5.invalid();
        org.junit.Assert.assertNotNull(uriValidator1);
        org.junit.Assert.assertNotNull(uriValidator2);
        org.junit.Assert.assertNotNull(uriValidator3);
        org.junit.Assert.assertNotNull(uriValidator4);
        org.junit.Assert.assertNotNull(uriValidator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        io.configrd.core.util.UriUtil.UriValidator uriValidator1 = io.configrd.core.util.UriUtil.validate("uri");
        io.configrd.core.util.UriUtil.UriValidator uriValidator2 = uriValidator1.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator3 = uriValidator1.hasPassword();
        io.configrd.core.util.UriUtil.UriValidator uriValidator4 = uriValidator3.hasUsername();
        org.junit.Assert.assertNotNull(uriValidator1);
        org.junit.Assert.assertNotNull(uriValidator2);
        org.junit.Assert.assertNotNull(uriValidator3);
        org.junit.Assert.assertNotNull(uriValidator4);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder1.setUsername("authMethod");
        io.configrd.core.util.URIBuilder uRIBuilder7 = uRIBuilder5.setHost("null:named/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/null/http/app.env");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
        org.junit.Assert.assertNotNull(uRIBuilder7);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI4);
        java.net.URI uRI7 = streamPacket6.getUri();
        io.configrd.core.util.URIBuilder uRIBuilder10 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI12 = uRIBuilder10.build("app.env");
        java.net.URI uRI13 = io.configrd.core.util.UriUtil.stripFile(uRI12);
        io.configrd.core.util.URITraverse uRITraverse15 = new io.configrd.core.util.URITraverse(uRI12, "http");
        java.lang.String str16 = uRITraverse15.decend();
        boolean boolean18 = streamPacket6.replace("", (java.lang.Object) str16, (java.lang.Object) "default.properties");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertNotNull(uRIBuilder10);
        org.junit.Assert.assertNotNull(uRI12);
        org.junit.Assert.assertNotNull(uRI13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null:named/http/app.env" + "'", str16, "null:named/http/app.env");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI4);
        java.net.URI uRI7 = streamPacket6.getUri();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = streamPacket6.putIfAbsent("false", obj9);
        java.util.Collection<java.lang.Object> objCollection11 = streamPacket6.values();
        java.net.URI uRI12 = streamPacket6.getUri();
        java.lang.Object obj13 = streamPacket6.clone();
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objCollection11);
        org.junit.Assert.assertNotNull(uRI12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "{false=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "{false=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "{false=null}");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        boolean boolean6 = io.configrd.core.util.UriUtil.hasFile(uRI5);
        java.io.InputStream inputStream7 = null;
        io.configrd.core.source.StreamPacket streamPacket8 = new io.configrd.core.source.StreamPacket(uRI5, inputStream7);
        java.util.Set<java.lang.String> strSet9 = streamPacket8.keySet();
        java.util.Properties properties10 = io.configrd.core.processor.PropertiesProcessor.asProperties((java.util.Map<java.lang.String, java.lang.Object>) streamPacket8);
        io.configrd.core.http.HttpRepoDef httpRepoDef11 = new io.configrd.core.http.HttpRepoDef("os.version", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket8);
        httpRepoDef11.setConfigrdFileName("app.env");
        org.junit.Assert.assertNotNull(uRIBuilder2);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("configrd.yaml");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI3 = uRIBuilder1.build("app.env");
        java.net.URI uRI4 = io.configrd.core.util.UriUtil.stripFile(uRI3);
        java.lang.String str5 = io.configrd.core.util.UriUtil.getPassword(uRI4);
        io.configrd.core.source.StreamPacket streamPacket6 = new io.configrd.core.source.StreamPacket(uRI4);
        java.net.URI uRI7 = streamPacket6.getUri();
        io.configrd.core.http.HttpRepoDef httpRepoDef10 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str11 = httpRepoDef10.getUsername();
        java.lang.Object obj12 = streamPacket6.replace("named/", (java.lang.Object) str11);
        boolean boolean13 = streamPacket6.hasContent();
        int int14 = streamPacket6.size();
        io.configrd.core.util.StringUtils stringUtils15 = new io.configrd.core.util.StringUtils((java.util.Map<java.lang.String, java.lang.Object>) streamPacket6);
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRI3);
        org.junit.Assert.assertNotNull(uRI4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(uRI7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        io.configrd.core.util.URIBuilder uRIBuilder1 = io.configrd.core.util.URIBuilder.create("named");
        io.configrd.core.util.URIBuilder uRIBuilder3 = uRIBuilder1.setUsernameIfMissing("Hengchens-MBP");
        io.configrd.core.util.URIBuilder uRIBuilder5 = uRIBuilder3.setFileName("hi!");
        io.configrd.core.util.URIBuilder uRIBuilder7 = uRIBuilder3.setPath("app.name");
        io.configrd.core.util.URIBuilder uRIBuilder9 = uRIBuilder7.setFileNameIfMissing("/");
        org.junit.Assert.assertNotNull(uRIBuilder1);
        org.junit.Assert.assertNotNull(uRIBuilder3);
        org.junit.Assert.assertNotNull(uRIBuilder5);
        org.junit.Assert.assertNotNull(uRIBuilder7);
        org.junit.Assert.assertNotNull(uRIBuilder9);
    }
}

