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
        io.configrd.core.file.FileRepoDef fileRepoDef1 = new io.configrd.core.file.FileRepoDef("Hengchens-MBP");
        java.lang.String str2 = fileRepoDef1.getFileName();
        java.lang.String str3 = fileRepoDef1.getSourceName();
        java.lang.String str4 = fileRepoDef1.getFileName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = fileRepoDef1.valid();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        java.lang.String str2 = httpRepoDef1.getAuthMethod();
        httpRepoDef1.setTrustCert((java.lang.Boolean) true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.configrd.core.http.DefaultHttpStreamSource defaultHttpStreamSource5 = new io.configrd.core.http.DefaultHttpStreamSource(httpRepoDef1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        io.configrd.core.file.FileRepoDef fileRepoDef1 = new io.configrd.core.file.FileRepoDef("Hengchens-MBP");
        java.lang.String str2 = fileRepoDef1.getFileName();
        fileRepoDef1.setFileName("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = fileRepoDef1.valid();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        io.configrd.core.file.FileRepoDef fileRepoDef1 = new io.configrd.core.file.FileRepoDef("Hengchens-MBP");
        java.lang.String str2 = fileRepoDef1.getFileName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray3 = fileRepoDef1.valid();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        io.configrd.core.http.HttpRepoDef httpRepoDef1 = new io.configrd.core.http.HttpRepoDef("hi!");
        httpRepoDef1.setUsername("name");
        java.lang.String str4 = httpRepoDef1.getName();
        java.lang.String str5 = httpRepoDef1.getUsername();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.configrd.core.http.DefaultHttpStreamSource defaultHttpStreamSource6 = new io.configrd.core.http.DefaultHttpStreamSource(httpRepoDef1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        io.configrd.core.file.FileConfigSourceFactory fileConfigSourceFactory0 = new io.configrd.core.file.FileConfigSourceFactory();
        io.configrd.core.util.URIBuilder uRIBuilder4 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI6 = uRIBuilder4.build("app.env");
        java.net.URI uRI7 = io.configrd.core.util.UriUtil.stripFile(uRI6);
        java.lang.String str8 = io.configrd.core.util.UriUtil.getPassword(uRI7);
        io.configrd.core.source.StreamPacket streamPacket9 = new io.configrd.core.source.StreamPacket(uRI7);
        java.util.Properties properties10 = streamPacket9.getProperties();
        io.configrd.core.file.FileRepoDef fileRepoDef11 = new io.configrd.core.file.FileRepoDef("configrd.yaml", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.configrd.core.file.DefaultFileStreamSource defaultFileStreamSource12 = fileConfigSourceFactory0.newStreamSource("null:file/app.env", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket9);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPassword(uRI5);
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI5);
        java.net.URI uRI8 = streamPacket7.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef9 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray10 = fileRepoDef9.valid();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPassword(uRI5);
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI5);
        java.util.Properties properties8 = streamPacket7.getProperties();
        io.configrd.core.file.FileRepoDef fileRepoDef9 = new io.configrd.core.file.FileRepoDef("configrd.yaml", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.configrd.core.ConfigSourceResolver configSourceResolver10 = new io.configrd.core.ConfigSourceResolver((java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        io.configrd.core.file.FileConfigSourceFactory fileConfigSourceFactory0 = new io.configrd.core.file.FileConfigSourceFactory();
        java.lang.String str1 = fileConfigSourceFactory0.getSourceName();
        boolean boolean3 = fileConfigSourceFactory0.isCompatible("default.properties");
        io.configrd.core.DefaultMergeStrategy defaultMergeStrategy5 = new io.configrd.core.DefaultMergeStrategy();
        defaultMergeStrategy5.clear();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = defaultMergeStrategy5.merge();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = defaultMergeStrategy5.merge();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.configrd.core.file.DefaultFileConfigSource defaultFileConfigSource9 = fileConfigSourceFactory0.newConfigSource("app.name", strMap8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = io.configrd.core.processor.YamlProcessor.asProperties(inputStream12);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPassword(uRI5);
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI5);
        java.net.URI uRI8 = streamPacket7.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef9 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        java.lang.String str10 = fileRepoDef9.getHostsName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray11 = fileRepoDef9.valid();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        io.configrd.core.util.URIBuilder uRIBuilder2 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI4 = uRIBuilder2.build("app.env");
        java.net.URI uRI5 = io.configrd.core.util.UriUtil.stripFile(uRI4);
        java.lang.String str6 = io.configrd.core.util.UriUtil.getPassword(uRI5);
        io.configrd.core.source.StreamPacket streamPacket7 = new io.configrd.core.source.StreamPacket(uRI5);
        java.net.URI uRI8 = streamPacket7.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef9 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket7);
        java.lang.String str10 = fileRepoDef9.getConfigrdFileName();
        java.lang.String str11 = fileRepoDef9.getHostsName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray12 = fileRepoDef9.valid();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        io.configrd.core.file.FileConfigSourceFactory fileConfigSourceFactory0 = new io.configrd.core.file.FileConfigSourceFactory();
        java.lang.String str1 = fileConfigSourceFactory0.getSourceName();
        io.configrd.core.util.URIBuilder uRIBuilder5 = io.configrd.core.util.URIBuilder.create("named");
        java.net.URI uRI7 = uRIBuilder5.build("app.env");
        java.net.URI uRI8 = io.configrd.core.util.UriUtil.stripFile(uRI7);
        java.lang.String str9 = io.configrd.core.util.UriUtil.getPassword(uRI8);
        io.configrd.core.source.StreamPacket streamPacket10 = new io.configrd.core.source.StreamPacket(uRI8);
        java.net.URI uRI11 = streamPacket10.getUri();
        io.configrd.core.file.FileRepoDef fileRepoDef12 = new io.configrd.core.file.FileRepoDef("named/", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        io.configrd.core.file.DefaultFileConfigSource defaultFileConfigSource13 = fileConfigSourceFactory0.newConfigSource("app.name", (java.util.Map<java.lang.String, java.lang.Object>) streamPacket10);
    }
}

