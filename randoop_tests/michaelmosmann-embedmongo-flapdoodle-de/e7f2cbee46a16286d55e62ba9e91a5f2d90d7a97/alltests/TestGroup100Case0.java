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
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = null;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = de.flapdoodle.embedmongo.LocalArtifactStore.checkArtifact(runtimeConfig0, distribution1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = null;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = de.flapdoodle.embedmongo.Downloader.getDownloadUrl(runtimeConfig0, distribution1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        java.io.File file4 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable5 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file4);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess6 = mongodExecutable5.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        java.io.File file4 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable5 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file4);
        // The following exception was thrown during execution in test generation
        try {
            mongodExecutable5.cleanup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_4;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_4 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_4));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        de.flapdoodle.embedmongo.distribution.BitSize bitSize0 = de.flapdoodle.embedmongo.distribution.BitSize.B64;
        org.junit.Assert.assertTrue("'" + bitSize0 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B64 + "'", bitSize0.equals(de.flapdoodle.embedmongo.distribution.BitSize.B64));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1_0;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1_0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1_0));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.io.File file0 = null;
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = de.flapdoodle.embedmongo.Files.moveFile(file0, file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = de.flapdoodle.embedmongo.Paths.getPath(distribution3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_6;
        java.lang.Class<?> wildcardClass1 = version0.getClass();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_6 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_6));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        java.lang.Class<?> wildcardClass1 = mongoDBRuntime0.getClass();
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempFile("");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempfile: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform2 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize3 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = new de.flapdoodle.embedmongo.distribution.Distribution(version1, platform2, bitSize3);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file5 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize3 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize3.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform2 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize3 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = new de.flapdoodle.embedmongo.distribution.Distribution(version1, platform2, bitSize3);
        de.flapdoodle.embedmongo.distribution.Version version5 = distribution4.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize3 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize3.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version5 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version5.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.distribution.Version version4 = distribution3.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = de.flapdoodle.embedmongo.Paths.getPath(distribution3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform2 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize3 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = new de.flapdoodle.embedmongo.distribution.Distribution(version1, platform2, bitSize3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = de.flapdoodle.embedmongo.Downloader.getDownloadUrl(runtimeConfig0, distribution4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize3 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize3.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_0_4;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_0_4 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_0_4));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType0 = de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ;
        org.junit.Assert.assertTrue("'" + archiveType0 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType0.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        de.flapdoodle.embedmongo.Paths paths0 = new de.flapdoodle.embedmongo.Paths();
        java.lang.Class<?> wildcardClass1 = paths0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform2 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize3 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = new de.flapdoodle.embedmongo.distribution.Distribution(version1, platform2, bitSize3);
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = mongoDBRuntime0.checkDistribution(distribution5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Could not move /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-c21b8656-1a90-4e23-97d3-a46f484557bb.TGZ to /Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-2.1.0.tgz");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize3 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize3.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(distribution5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.distribution.Version version4 = distribution3.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version5 = distribution3.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + version5 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version5.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version2 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform3 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize4 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = new de.flapdoodle.embedmongo.distribution.Distribution(version2, platform3, bitSize4);
        de.flapdoodle.embedmongo.distribution.Version version6 = distribution5.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = de.flapdoodle.embedmongo.LocalArtifactStore.checkArtifact(runtimeConfig0, distribution5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version2 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version2.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize4 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize4.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.progress("hi!", 0);
        standardConsoleProgressListener0.progress("", (-1));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.io.InputStream inputStream0 = null;
        de.flapdoodle.embedmongo.distribution.Version version2 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig5 = new de.flapdoodle.embedmongo.config.MongodConfig(version2, (int) (short) -1, false);
        java.io.File file6 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable7 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig5, file6);
        java.io.File file9 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable10 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig5, file9);
        boolean boolean11 = de.flapdoodle.embedmongo.Files.forceDelete(file9);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.Files.write(inputStream0, (long) 'a', file9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file9.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-0acccf36-b9a1-4671-a05b-8305846a3c1b");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.distribution.Version version4 = distribution3.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version5 = distribution3.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.extract.IExtractor iExtractor6 = de.flapdoodle.embedmongo.extract.Extractors.getExtractor(distribution3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + version5 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version5.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        java.lang.String str2 = de.flapdoodle.embedmongo.Paths.getPath(distribution1);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str2, "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.distribution.Version version4 = distribution3.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.util.regex.Pattern pattern5 = de.flapdoodle.embedmongo.Paths.getMongodExecutablePattern(distribution3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.extract.IExtractor iExtractor4 = de.flapdoodle.embedmongo.extract.Extractors.getExtractor(distribution3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution2 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = mongoDBRuntime0.checkDistribution(distribution2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Could not move /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-067a4080-d1d3-42d5-ab30-05c03c0a80d4.TGZ to /Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        java.lang.Class<?> wildcardClass4 = distribution3.getClass();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        java.lang.String str4 = iTempNaming1.nameFor("hi!", "mongod");
        org.junit.Assert.assertNotNull(iTempNaming1);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod" + "'", str4, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        java.io.File file4 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable5 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file4);
        java.io.File file6 = mongodExecutable5.getFile();
        // The following exception was thrown during execution in test generation
        try {
            mongodExecutable5.cleanup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("", "hi!");
        standardConsoleProgressListener0.done("");
        standardConsoleProgressListener0.progress("osx/mongodb-osx-i386-1.8.0-rc0.tgz", 100);
        standardConsoleProgressListener0.progress("http://fastdl.mongodb.org/", 10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        de.flapdoodle.embedmongo.extract.TgzExtractor tgzExtractor0 = new de.flapdoodle.embedmongo.extract.TgzExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig1.getDefaultfileNaming();
        de.flapdoodle.embedmongo.distribution.Version version4 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version4, (int) (short) -1, false);
        java.io.File file8 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable9 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig7, file8);
        java.io.File file11 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable12 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig7, file11);
        boolean boolean13 = de.flapdoodle.embedmongo.Files.forceDelete(file11);
        de.flapdoodle.embedmongo.distribution.Version version14 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig17 = new de.flapdoodle.embedmongo.config.MongodConfig(version14, (int) (short) -1, false);
        java.io.File file18 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable19 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig17, file18);
        java.io.File file21 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable22 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig17, file21);
        boolean boolean23 = de.flapdoodle.embedmongo.Files.forceDelete(file21);
        java.util.regex.Pattern pattern24 = null;
        // The following exception was thrown during execution in test generation
        try {
            tgzExtractor0.extract(runtimeConfig1, file11, file21, pattern24);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-7337806a-358a-4667-b09c-32d678fde7a7 (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertEquals(file11.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file11.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-7337806a-358a-4667-b09c-32d678fde7a7");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file21.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-2d509385-f4db-48d0-86c4-40fe1f3bf14b");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution2 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version1);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig5 = new de.flapdoodle.embedmongo.config.MongodConfig(version1, (int) '4', false);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodExecutable mongodExecutable6 = mongoDBRuntime0.prepare(mongodConfig5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Could not move /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-445e83e1-a7cf-4024-adca-140769620a7c.TGZ to /Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version2 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version2);
        java.lang.String str4 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution3);
        java.io.File file5 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution3);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform7 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize8 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution9 = new de.flapdoodle.embedmongo.distribution.Distribution(version6, platform7, bitSize8);
        de.flapdoodle.embedmongo.distribution.Version version10 = distribution9.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version11 = distribution9.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file12 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version2 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version2.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongod" + "'", str4, "mongod");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file5.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-069abfc4-8016-4b4d-a485-6f6fffa1f959.TGZ");
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize8 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize8.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version10 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version10.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + version11 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version11.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        de.flapdoodle.embedmongo.distribution.Version version4 = mongodConfig3.getVersion();
        java.lang.String str5 = mongodConfig3.getDatabaseDir();
        org.junit.Assert.assertNull(version4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        de.flapdoodle.embedmongo.LocalArtifactStore localArtifactStore0 = new de.flapdoodle.embedmongo.LocalArtifactStore();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig0.getDefaultfileNaming();
        java.lang.String str5 = iTempNaming2.nameFor("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod", "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming2);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/" + "'", str5, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /Users/yhcrown/hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http:/fastdl.mongodb.org");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_6_5;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_6_5 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_6_5));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        de.flapdoodle.embedmongo.extract.TgzExtractor tgzExtractor0 = new de.flapdoodle.embedmongo.extract.TgzExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig1.getDefaultfileNaming();
        de.flapdoodle.embedmongo.distribution.Version version4 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version4, (int) (short) -1, false);
        java.io.File file8 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable9 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig7, file8);
        java.io.File file11 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable12 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig7, file11);
        java.io.File file14 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        boolean boolean15 = de.flapdoodle.embedmongo.Files.forceDelete(file14);
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tgzExtractor0.extract(runtimeConfig1, file11, file14, pattern16);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-1ae442fa-bc84-4ee9-beb9-bc0e3757e583 (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertEquals(file11.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file11.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-1ae442fa-bc84-4ee9-beb9-bc0e3757e583");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file14.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-06730a8b-6dd3-4c55-a563-4606ce8363eb");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        java.lang.Class<?> wildcardClass2 = version0.getClass();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.info(".embedmongo", ".embedmongo");
        consoleOneLineProgressListener0.done("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/");
        consoleOneLineProgressListener0.progress("", 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming0 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        java.lang.String str3 = userTempNaming0.nameFor("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/", ".embedmongo");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo" + "'", str3, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_2_rc0;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_2_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_2_rc0));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_0_1;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_0_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_0_1));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("", "hi!");
        standardConsoleProgressListener0.done("");
        standardConsoleProgressListener0.progress("osx/mongodb-osx-i386-1.8.0-rc0.tgz", 100);
        standardConsoleProgressListener0.start("mongod");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.progress("http://fastdl.mongodb.org/", (int) (short) 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig1 = null;
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodExecutable mongodExecutable2 = mongoDBRuntime0.prepare(mongodConfig1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        de.flapdoodle.embedmongo.extract.ZipExtractor zipExtractor0 = new de.flapdoodle.embedmongo.extract.ZipExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming3 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming3);
        java.io.File file6 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.distribution.Version version7 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig10 = new de.flapdoodle.embedmongo.config.MongodConfig(version7, (int) (short) -1, false);
        java.io.File file11 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable12 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig10, file11);
        java.io.File file14 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable15 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig10, file14);
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipExtractor0.extract(runtimeConfig1, file6, file14, pattern16);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-b1b3c11d-f577-449a-957c-d074239c7b4b (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-b1b3c11d-f577-449a-957c-d074239c7b4b");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file14.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-d6bf96b3-151b-4146-b675-230e28286b16");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.io.InputStream inputStream0 = null;
        java.io.File file3 = de.flapdoodle.embedmongo.Files.createOrCheckDir("hi!");
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.Files.write(inputStream0, (long) (byte) 10, file3);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution7);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize9 = distribution7.getBitsize();
        java.lang.String str10 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution7);
        java.lang.String str11 = de.flapdoodle.embedmongo.Paths.getPath(distribution7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + bitSize9 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize9.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongod" + "'", str10, "mongod");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str11, "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        de.flapdoodle.embedmongo.extract.TgzExtractor tgzExtractor0 = new de.flapdoodle.embedmongo.extract.TgzExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming3 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming3);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming5 = runtimeConfig1.getDefaultfileNaming();
        java.io.File file7 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.distribution.Version version8 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig11 = new de.flapdoodle.embedmongo.config.MongodConfig(version8, (int) (short) -1, false);
        java.io.File file12 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable13 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig11, file12);
        java.io.File file15 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable16 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig11, file15);
        java.util.regex.Pattern pattern17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tgzExtractor0.extract(runtimeConfig1, file7, file15, pattern17);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-f52816fe-344f-4b6f-aaae-2d1a6d67e91f (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertNotNull(iTempNaming5);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file7.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-f52816fe-344f-4b6f-aaae-2d1a6d67e91f");
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file15.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-1b7d625c-2542-48aa-be0f-19148b692820");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        java.io.File file4 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable5 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file4);
        java.io.File file7 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable8 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file7);
        java.lang.Class<?> wildcardClass9 = mongodConfig3.getClass();
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file7.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-01895707-e97b-478f-abbc-cd80883eedd8");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        java.io.File file4 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable5 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file4);
        java.io.File file7 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable8 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file7);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess9 = mongodExecutable8.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-ad9ea89d-008a-45db-a933-7c1d5ea9f2c2\": error=13, Permission denied");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file7.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-ad9ea89d-008a-45db-a933-7c1d5ea9f2c2");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = null;
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version3);
        java.lang.String str5 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution4);
        java.io.File file6 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig1, distribution4);
        java.lang.String str7 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution4);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongod" + "'", str5, "mongod");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-d468fc08-1cc9-4441-a64e-d3d8f0cc3806.TGZ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongod" + "'", str7, "mongod");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = null;
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str2 = runtimeConfig1.getArtifactStorePath();
        java.lang.String str3 = runtimeConfig1.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig4 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming5 = runtimeConfig4.getExecutableNaming();
        runtimeConfig1.setDefaultfileNaming(iTempNaming5);
        de.flapdoodle.embedmongo.distribution.Version version7 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution8 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version7);
        java.io.File file9 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig1, distribution8);
        java.io.File file11 = de.flapdoodle.embedmongo.Files.createOrCheckDir("mongod");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = de.flapdoodle.embedmongo.LocalArtifactStore.store(runtimeConfig0, distribution8, file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".embedmongo" + "'", str2, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://fastdl.mongodb.org/" + "'", str3, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming5);
        org.junit.Assert.assertTrue("'" + version7 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version7.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "mongod");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("", "hi!");
        standardConsoleProgressListener0.done("");
        standardConsoleProgressListener0.progress("osx/mongodb-osx-i386-1.8.0-rc0.tgz", 100);
        standardConsoleProgressListener0.progress("", (int) (short) 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution7);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize9 = distribution7.getBitsize();
        java.lang.String str10 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution7);
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType11 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + bitSize9 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize9.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongod" + "'", str10, "mongod");
        org.junit.Assert.assertTrue("'" + archiveType11 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType11.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = distribution1.getBitsize();
        de.flapdoodle.embedmongo.distribution.Version version3 = distribution1.getVersion();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        java.lang.String str2 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution1);
        de.flapdoodle.embedmongo.extract.IExtractor iExtractor3 = de.flapdoodle.embedmongo.extract.Extractors.getExtractor(distribution1);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig4 = null;
        java.io.File file6 = de.flapdoodle.embedmongo.Files.createOrCheckDir("mongod");
        java.io.File file8 = de.flapdoodle.embedmongo.Files.createOrCheckDir("mongod");
        java.util.regex.Pattern pattern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            iExtractor3.extract(runtimeConfig4, file6, file8, pattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongod" + "'", str2, "mongod");
        org.junit.Assert.assertNotNull(iExtractor3);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "mongod");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "mongod");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        // The following exception was thrown during execution in test generation
        try {
            consoleOneLineProgressListener0.progress(".embedmongo", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Percent < 0: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig2.getDefaultfileNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming4);
        java.lang.String str6 = runtimeConfig0.getArtifactStorePath();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".embedmongo" + "'", str6, ".embedmongo");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_1;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_1));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/", "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        standardConsoleProgressListener0.progress("hi!", (int) (short) 100);
        standardConsoleProgressListener0.progress("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo", (int) (short) 100);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempDir("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http:/fastdl.mongodb.org/-yhcrown-.embedmongo-ba787d02-0a33-48d7-9045-daf1c1185fc4");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        de.flapdoodle.embedmongo.extract.TgzExtractor tgzExtractor0 = new de.flapdoodle.embedmongo.extract.TgzExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = null;
        java.io.File file3 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        de.flapdoodle.embedmongo.distribution.Version version4 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version4, (int) (short) -1, false);
        java.io.File file8 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable9 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig7, file8);
        java.io.File file11 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable12 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig7, file11);
        boolean boolean13 = de.flapdoodle.embedmongo.Files.forceDelete(file11);
        boolean boolean14 = de.flapdoodle.embedmongo.Files.forceDelete(file11);
        de.flapdoodle.embedmongo.distribution.Version version15 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution16 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version15);
        java.lang.String str17 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution16);
        de.flapdoodle.embedmongo.distribution.Version version18 = distribution16.getVersion();
        java.util.regex.Pattern pattern19 = de.flapdoodle.embedmongo.Paths.getMongodExecutablePattern(distribution16);
        // The following exception was thrown during execution in test generation
        try {
            tgzExtractor0.extract(runtimeConfig1, file3, file11, pattern19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file3.toString(), "/Users/yhcrown/hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertEquals(file11.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file11.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-baa5df77-a6f1-421d-a579-fc33fc40b39f");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + version15 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version15.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongod" + "'", str17, "mongod");
        org.junit.Assert.assertTrue("'" + version18 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version18.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(pattern19);
        org.junit.Assert.assertEquals(pattern19.toString(), ".*mongod");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution7);
        de.flapdoodle.embedmongo.distribution.Version version9 = distribution7.getVersion();
        java.lang.Class<?> wildcardClass10 = distribution7.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        boolean boolean0 = de.flapdoodle.embedmongo.runtime.Network.localhostIsIPv6();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.io.InputStream inputStream0 = null;
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        java.lang.String str6 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution5);
        java.io.File file7 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig2, distribution5);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.Files.write(inputStream0, (long) '4', file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongod" + "'", str6, "mongod");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file7.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-08465d67-dad8-41a5-95e6-d1930db239a2.TGZ");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener1 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener1.done("http://fastdl.mongodb.org/");
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) consoleOneLineProgressListener1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("", "hi!");
        standardConsoleProgressListener0.done("");
        standardConsoleProgressListener0.progress("osx/mongodb-osx-i386-1.8.0-rc0.tgz", 100);
        standardConsoleProgressListener0.info("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/", "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        standardConsoleProgressListener4.done("http://fastdl.mongodb.org/");
        standardConsoleProgressListener4.progress("http://fastdl.mongodb.org/", (int) (byte) 100);
        standardConsoleProgressListener4.progress("", 1);
        org.junit.Assert.assertNotNull(iTempNaming1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /Users/yhcrown/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.progress("osx/mongodb-osx-i386-1.8.0-rc0.tgz", (int) (short) 10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.progress("", (int) 'a');
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime4 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Version version5 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform6 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize7 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution8 = new de.flapdoodle.embedmongo.distribution.Distribution(version5, platform6, bitSize7);
        de.flapdoodle.embedmongo.distribution.Version version9 = distribution8.getVersion();
        de.flapdoodle.embedmongo.distribution.Distribution distribution10 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version9);
        java.lang.String str11 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = false; // flaky: mongoDBRuntime4.checkDistribution(distribution10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Could not move /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-yhcrown-.TGZ to /Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-2.1.0.tgz");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(mongoDBRuntime4);
        org.junit.Assert.assertTrue("'" + version5 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version5.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize7 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize7.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertNotNull(distribution10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongod" + "'", str11, "mongod");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution7);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize9 = distribution7.getBitsize();
        de.flapdoodle.embedmongo.distribution.Platform platform10 = distribution7.getPlatform();
        de.flapdoodle.embedmongo.distribution.BitSize bitSize11 = distribution7.getBitsize();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + bitSize9 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize9.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + platform10 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform10.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertTrue("'" + bitSize11 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize11.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime4 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Version version5 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig8 = new de.flapdoodle.embedmongo.config.MongodConfig(version5, (int) (short) -1, false);
        java.io.File file9 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable10 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig8, file9);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodExecutable mongodExecutable11 = mongoDBRuntime4.prepare(mongodConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(mongoDBRuntime4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.info(".embedmongo", ".embedmongo");
        consoleOneLineProgressListener0.done("http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.io.File file1 = null; // flaky: de.flapdoodle.embedmongo.Files.createTempFile(".embedmongo");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertEquals(file1.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file1.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/.embedmongo");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version2 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version2);
        java.lang.String str4 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution3);
        java.io.File file5 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution3);
        java.lang.String str6 = de.flapdoodle.embedmongo.Paths.getPath(distribution3);
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType7 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution3);
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType8 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution3);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version2 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version2.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongod" + "'", str4, "mongod");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file5.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-b8ea08c6-ec7c-4a7d-a74e-b26e7405f094.TGZ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str6, "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertTrue("'" + archiveType7 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType7.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
        org.junit.Assert.assertTrue("'" + archiveType8 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType8.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        java.io.File file4 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable5 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file4);
        java.io.File file6 = mongodExecutable5.getFile();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess7 = mongodExecutable5.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.done("hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming4 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform7 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize8 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution9 = new de.flapdoodle.embedmongo.distribution.Distribution(version6, platform7, bitSize8);
        de.flapdoodle.embedmongo.distribution.Version version10 = distribution9.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file11 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize8 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize8.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version10 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version10.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        standardConsoleProgressListener4.done("http://fastdl.mongodb.org/");
        standardConsoleProgressListener4.progress("http://fastdl.mongodb.org/", (int) (byte) 100);
        standardConsoleProgressListener4.start("http://fastdl.mongodb.org/");
        standardConsoleProgressListener4.start("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        org.junit.Assert.assertNotNull(iTempNaming1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = distribution1.getBitsize();
        java.lang.String str3 = de.flapdoodle.embedmongo.Paths.getPath(distribution1);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str3, "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType0 = de.flapdoodle.embedmongo.distribution.ArchiveType.ZIP;
        org.junit.Assert.assertTrue("'" + archiveType0 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.ZIP + "'", archiveType0.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.ZIP));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("V1_8_0_rc0:OS_X:B32");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertEquals(file1.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file1.toString(), "/Users/yhcrown/V1_8_0_rc0:OS_X:B32");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime4 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig5 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig5.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version7 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution8 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version7);
        java.lang.String str9 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution8);
        java.io.File file10 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig5, distribution8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = mongoDBRuntime4.checkDistribution(distribution8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempfile: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-yhcrown-.TGZ");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(mongoDBRuntime4);
        org.junit.Assert.assertNotNull(iTempNaming6);
        org.junit.Assert.assertTrue("'" + version7 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version7.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongod" + "'", str9, "mongod");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertEquals(file10.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file10.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-3f35b404-81ad-45f2-a97c-8e9039973405.TGZ");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("", "hi!");
        standardConsoleProgressListener0.done("");
        standardConsoleProgressListener0.done("");
        standardConsoleProgressListener0.progress("http://fastdl.mongodb.org/", (int) (short) 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        de.flapdoodle.embedmongo.extract.TgzExtractor tgzExtractor0 = new de.flapdoodle.embedmongo.extract.TgzExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming3 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming3);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming5 = runtimeConfig1.getDefaultfileNaming();
        java.lang.String str6 = runtimeConfig1.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig7 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming8 = runtimeConfig7.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming9 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig7.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming9);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming11 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig7.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming11);
        runtimeConfig1.setExecutableNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming11);
        java.io.File file15 = de.flapdoodle.embedmongo.Files.createOrCheckDir("hi!");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig16 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming17 = runtimeConfig16.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version18 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution19 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version18);
        java.lang.String str20 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution19);
        java.io.File file21 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig16, distribution19);
        boolean boolean22 = de.flapdoodle.embedmongo.Files.moveFile(file15, file21);
        boolean boolean23 = de.flapdoodle.embedmongo.Files.forceDelete(file15);
        java.io.File file24 = null;
        de.flapdoodle.embedmongo.distribution.Version version25 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution26 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version25);
        java.lang.String str27 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution26);
        de.flapdoodle.embedmongo.distribution.Version version28 = distribution26.getVersion();
        java.util.regex.Pattern pattern29 = de.flapdoodle.embedmongo.Paths.getMongodExecutablePattern(distribution26);
        // The following exception was thrown during execution in test generation
        try {
            tgzExtractor0.extract(runtimeConfig1, file15, file24, pattern29);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertNotNull(iTempNaming5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://fastdl.mongodb.org/" + "'", str6, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming8);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNull("file15.getParent() == null", file15.getParent());
        org.junit.Assert.assertEquals(file15.toString(), "hi!");
        org.junit.Assert.assertNotNull(iTempNaming17);
        org.junit.Assert.assertTrue("'" + version18 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version18.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongod" + "'", str20, "mongod");
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file21.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-e67695dc-4b20-42f0-989b-fd7b67bebc44.TGZ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + version25 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version25.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "mongod" + "'", str27, "mongod");
        org.junit.Assert.assertTrue("'" + version28 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version28.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(pattern29);
        org.junit.Assert.assertEquals(pattern29.toString(), ".*mongod");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start(".embedmongo");
        consoleOneLineProgressListener0.done("mongod");
        consoleOneLineProgressListener0.info("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/", ".embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        de.flapdoodle.embedmongo.extract.ZipExtractor zipExtractor0 = new de.flapdoodle.embedmongo.extract.ZipExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming3 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming3);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming5 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming5);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming7 = runtimeConfig1.getExecutableNaming();
        java.io.File file9 = de.flapdoodle.embedmongo.Files.createOrCheckDir("hi!");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig10 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming11 = runtimeConfig10.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version12 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution13 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version12);
        java.lang.String str14 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution13);
        java.io.File file15 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig10, distribution13);
        boolean boolean16 = de.flapdoodle.embedmongo.Files.moveFile(file9, file15);
        java.io.File file18 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.distribution.Version version19 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution20 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version19);
        java.lang.String str21 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution20);
        de.flapdoodle.embedmongo.distribution.Version version22 = distribution20.getVersion();
        java.util.regex.Pattern pattern23 = de.flapdoodle.embedmongo.Paths.getMongodExecutablePattern(distribution20);
        zipExtractor0.extract(runtimeConfig1, file15, file18, pattern23);
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertNotNull(iTempNaming7);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(iTempNaming11);
        org.junit.Assert.assertTrue("'" + version12 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version12.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongod" + "'", str14, "mongod");
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file15.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-9db2174d-d863-4aff-affb-2459d929cdfa.TGZ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file18.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-ac816ced-ef14-41a1-8e0a-20cfa7a6c723");
        org.junit.Assert.assertTrue("'" + version19 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version19.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "mongod" + "'", str21, "mongod");
        org.junit.Assert.assertTrue("'" + version22 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version22.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(pattern23);
        org.junit.Assert.assertEquals(pattern23.toString(), ".*mongod");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempFile("http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("", "hi!");
        standardConsoleProgressListener0.progress("mongod", (int) (byte) 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version2 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version2);
        java.lang.String str4 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution3);
        java.io.File file5 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution3);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig6 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming7 = runtimeConfig6.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version8 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution9 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version8);
        java.lang.String str10 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution9);
        java.io.File file11 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig6, distribution9);
        java.io.File file13 = de.flapdoodle.embedmongo.Files.createOrCheckDir("hi!");
        boolean boolean14 = de.flapdoodle.embedmongo.LocalArtifactStore.store(runtimeConfig0, distribution9, file13);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version2 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version2.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongod" + "'", str4, "mongod");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file5.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-f80cf226-51c5-4268-9778-1af4c910e797.TGZ");
        org.junit.Assert.assertNotNull(iTempNaming7);
        org.junit.Assert.assertTrue("'" + version8 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version8.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongod" + "'", str10, "mongod");
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertEquals(file11.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file11.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-5309c652-7be7-42a0-8df2-9b1406e061e1.TGZ");
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig0.getDefaultfileNaming();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version5 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution6 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version5);
        java.lang.String str7 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution6);
        java.io.File file8 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig3, distribution6);
        de.flapdoodle.embedmongo.distribution.Platform platform9 = distribution6.getPlatform();
        java.io.File file10 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution6);
        java.lang.String str11 = distribution6.toString();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertTrue("'" + version5 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version5.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongod" + "'", str7, "mongod");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file8.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-25a2ed65-9e8f-4a89-be8d-23e751200afe.TGZ");
        org.junit.Assert.assertTrue("'" + platform9 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform9.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "V1_8_0_rc0:OS_X:B32" + "'", str11, "V1_8_0_rc0:OS_X:B32");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 0, false, "hi!");
        int int5 = mongodConfig4.getPort();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.io.InputStream inputStream0 = null;
        java.io.File file3 = de.flapdoodle.embedmongo.Files.createOrCheckDir("hi!");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig4 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming5 = runtimeConfig4.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.lang.String str8 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution7);
        java.io.File file9 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig4, distribution7);
        boolean boolean10 = de.flapdoodle.embedmongo.Files.moveFile(file3, file9);
        boolean boolean11 = de.flapdoodle.embedmongo.Files.forceDelete(file3);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.Files.write(inputStream0, 1L, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
        org.junit.Assert.assertNotNull(iTempNaming5);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongod" + "'", str8, "mongod");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file9.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-a9000f0a-6dae-48e3-84cb-f897d66990a3.TGZ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.distribution.Version version4 = distribution3.getVersion();
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig9 = new de.flapdoodle.embedmongo.config.MongodConfig(version4, (-1), true, ".embedmongo-e8610fdb-2aa3-4b77-85b8-662731bb17afhi!");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertNotNull(distribution5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime4 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig5 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig5.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version7 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution8 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version7);
        java.lang.String str9 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution8);
        java.io.File file10 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig5, distribution8);
        de.flapdoodle.embedmongo.distribution.Platform platform11 = distribution8.getPlatform();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = mongoDBRuntime4.checkDistribution(distribution8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempfile: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-yhcrown-.TGZ");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(mongoDBRuntime4);
        org.junit.Assert.assertNotNull(iTempNaming6);
        org.junit.Assert.assertTrue("'" + version7 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version7.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongod" + "'", str9, "mongod");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertEquals(file10.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file10.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-2768d261-2331-4a2e-aab1-2addee1e8709.TGZ");
        org.junit.Assert.assertTrue("'" + platform11 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform11.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version2 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version2);
        java.lang.String str4 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution3);
        java.io.File file5 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution3);
        java.lang.String str6 = runtimeConfig0.getDownloadPath();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version2 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version2.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongod" + "'", str4, "mongod");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file5.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-c604c0a3-c066-4fdf-b141-3a677362b1b3.TGZ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://fastdl.mongodb.org/" + "'", str6, "http://fastdl.mongodb.org/");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming3 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming3);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming5 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming5);
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming7 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming7);
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming7);
        runtimeConfig0.setDownloadPath("V1_8_0_rc0:OS_X:B32");
        org.junit.Assert.assertNotNull(iTempNaming2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig4 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig5 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig5.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming7 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig5.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming7);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming9 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig5.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming9);
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming11 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig5.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming11);
        runtimeConfig4.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming11);
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming11);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempDir(".embedmongo");
        boolean boolean2 = de.flapdoodle.embedmongo.Files.forceDelete(file1);
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertEquals(file1.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file1.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/.embedmongo-8e98aefb-3910-459b-8a54-d13810b3275f");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckDir("");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: ");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        java.io.File file4 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable5 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file4);
        de.flapdoodle.embedmongo.distribution.Version version6 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig9 = new de.flapdoodle.embedmongo.config.MongodConfig(version6, (int) (short) -1, false);
        java.io.File file10 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable11 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig9, file10);
        java.io.File file13 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable14 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig9, file13);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess15 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig3, mongodExecutable14);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-3f149889-74d9-4c54-abeb-6f3dc2cc3b48\": error=13, Permission denied");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file13.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-3f149889-74d9-4c54-abeb-6f3dc2cc3b48");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig5 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (-1), false, "");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_9_0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 0, true, "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_9_0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_9_0));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.info(".embedmongo", ".embedmongo");
        consoleOneLineProgressListener0.done("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/");
        consoleOneLineProgressListener0.start("hi!");
        consoleOneLineProgressListener0.progress(".embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!", 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) '4', false);
        int int5 = mongodConfig4.getPort();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http://fastdl.mongodb.org/");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /Users/yhcrown/hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http:/fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http:/fastdl.mongodb.org");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        consoleOneLineProgressListener0.start("");
        consoleOneLineProgressListener0.info("mongod", ".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!");
        consoleOneLineProgressListener0.start("http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig0.getDefaultfileNaming();
        java.lang.String str5 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime6 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig7 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming8 = runtimeConfig7.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming9 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig7.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming9);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming11 = runtimeConfig7.getDefaultfileNaming();
        java.lang.String str12 = runtimeConfig7.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig13 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming14 = runtimeConfig13.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming15 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig13.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming15);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming17 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig13.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming17);
        runtimeConfig7.setExecutableNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming17);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig20 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming21 = runtimeConfig20.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming22 = runtimeConfig20.getDefaultfileNaming();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig23 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming24 = runtimeConfig23.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version25 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution26 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version25);
        java.lang.String str27 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution26);
        java.io.File file28 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig23, distribution26);
        de.flapdoodle.embedmongo.distribution.Platform platform29 = distribution26.getPlatform();
        java.io.File file30 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig20, distribution26);
        java.io.File file31 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig7, distribution26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = mongoDBRuntime6.checkDistribution(distribution26);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempfile: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-yhcrown-.TGZ");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://fastdl.mongodb.org/" + "'", str5, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(mongoDBRuntime6);
        org.junit.Assert.assertNotNull(iTempNaming8);
        org.junit.Assert.assertNotNull(iTempNaming11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://fastdl.mongodb.org/" + "'", str12, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming14);
        org.junit.Assert.assertNotNull(iTempNaming21);
        org.junit.Assert.assertNotNull(iTempNaming22);
        org.junit.Assert.assertNotNull(iTempNaming24);
        org.junit.Assert.assertTrue("'" + version25 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version25.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "mongod" + "'", str27, "mongod");
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertEquals(file28.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file28.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-3b09d07e-6bf7-44e5-8431-0422243de6c2.TGZ");
        org.junit.Assert.assertTrue("'" + platform29 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform29.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertNull(file30);
        org.junit.Assert.assertNull(file31);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.io.InputStream inputStream0 = null;
        java.io.File file3 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        boolean boolean4 = de.flapdoodle.embedmongo.Files.forceDelete(file3);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.Files.write(inputStream0, (long) (byte) 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file3.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-66efdbac-6b49-4a75-871e-971ffac5f798");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.start("");
        standardConsoleProgressListener0.start("V1_8_0_rc0:OS_X:B32");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        java.lang.String str4 = runtimeConfig0.getDownloadPath();
        java.lang.String str5 = runtimeConfig0.getDownloadPath();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://fastdl.mongodb.org/" + "'", str4, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://fastdl.mongodb.org/" + "'", str5, "http://fastdl.mongodb.org/");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("", "hi!");
        standardConsoleProgressListener0.done("");
        standardConsoleProgressListener0.done("");
        standardConsoleProgressListener0.done("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("hi!", ".embedmongo");
        standardConsoleProgressListener0.info("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo", "http://fastdl.mongodb.org/");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 0, true);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 10, true, "hi!");
        de.flapdoodle.embedmongo.distribution.Version version8 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig11 = new de.flapdoodle.embedmongo.config.MongodConfig(version8, (int) (short) -1, false);
        java.io.File file12 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable13 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig11, file12);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess14 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig7, mongodExecutable13);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.io.File file0 = null;
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version3);
        java.lang.String str5 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution4);
        java.io.File file6 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig1, distribution4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = de.flapdoodle.embedmongo.Files.moveFile(file0, file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongod" + "'", str5, "mongod");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-f2564d29-4a32-4fe4-bb37-257cd17ad3f1.TGZ");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming3 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming3);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming5 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming5);
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming7 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming7);
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming7);
        de.flapdoodle.embedmongo.distribution.Version version10 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution11 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version10);
        java.lang.String str12 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution11);
        de.flapdoodle.embedmongo.distribution.Version version13 = distribution11.getVersion();
        java.util.regex.Pattern pattern14 = de.flapdoodle.embedmongo.Paths.getMongodExecutablePattern(distribution11);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file15 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution11);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempfile: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-yhcrown-.TGZ");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertTrue("'" + version10 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version10.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongod" + "'", str12, "mongod");
        org.junit.Assert.assertTrue("'" + version13 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version13.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(pattern14);
        org.junit.Assert.assertEquals(pattern14.toString(), ".*mongod");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        java.io.File file4 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable5 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file4);
        java.io.File file6 = mongodExecutable5.getFile();
        java.io.File file7 = mongodExecutable5.getFile();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess8 = mongodExecutable5.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig6 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str7 = runtimeConfig6.getArtifactStorePath();
        java.lang.String str8 = runtimeConfig6.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig9 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming10 = runtimeConfig9.getExecutableNaming();
        runtimeConfig6.setDefaultfileNaming(iTempNaming10);
        de.flapdoodle.embedmongo.distribution.Version version12 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution13 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version12);
        java.io.File file14 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig6, distribution13);
        boolean boolean15 = de.flapdoodle.embedmongo.LocalArtifactStore.checkArtifact(runtimeConfig0, distribution13);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming16 = runtimeConfig0.getExecutableNaming();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".embedmongo" + "'", str7, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://fastdl.mongodb.org/" + "'", str8, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming10);
        org.junit.Assert.assertTrue("'" + version12 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version12.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iTempNaming16);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) '4', false);
        java.lang.Class<?> wildcardClass5 = version0.getClass();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming3 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming3);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming5 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming5);
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming7 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming7);
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming7);
        java.lang.String str12 = userTempNaming7.nameFor("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo", "http://fastdl.mongodb.org/");
        java.lang.String str15 = userTempNaming7.nameFor(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!", "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http://fastdl.mongodb.org/" + "'", str12, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http://fastdl.mongodb.org/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!-yhcrown-http://fastdl.mongodb.org/" + "'", str15, ".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!-yhcrown-http://fastdl.mongodb.org/");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig0.getDefaultfileNaming();
        java.lang.String str5 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig6 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming7 = runtimeConfig6.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming8 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig6.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming8);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming10 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig6.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming10);
        runtimeConfig0.setExecutableNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming10);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig13 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming14 = runtimeConfig13.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming15 = runtimeConfig13.getDefaultfileNaming();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig16 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming17 = runtimeConfig16.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version18 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution19 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version18);
        java.lang.String str20 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution19);
        java.io.File file21 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig16, distribution19);
        de.flapdoodle.embedmongo.distribution.Platform platform22 = distribution19.getPlatform();
        java.io.File file23 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig13, distribution19);
        java.io.File file24 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution19);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig25 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming26 = runtimeConfig25.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming27 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig25.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming27);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming29 = runtimeConfig25.getDefaultfileNaming();
        java.lang.String str30 = runtimeConfig25.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig31 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming32 = runtimeConfig31.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming33 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig31.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming33);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming35 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig31.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming35);
        runtimeConfig25.setExecutableNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming35);
        runtimeConfig0.setExecutableNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming35);
        java.lang.String str41 = uUIDTempNaming35.nameFor("http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz", "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://fastdl.mongodb.org/" + "'", str5, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming7);
        org.junit.Assert.assertNotNull(iTempNaming14);
        org.junit.Assert.assertNotNull(iTempNaming15);
        org.junit.Assert.assertNotNull(iTempNaming17);
        org.junit.Assert.assertTrue("'" + version18 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version18.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongod" + "'", str20, "mongod");
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file21.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-71c9db95-0a51-448b-9eaa-296903c713b6.TGZ");
        org.junit.Assert.assertTrue("'" + platform22 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform22.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNotNull(iTempNaming26);
        org.junit.Assert.assertNotNull(iTempNaming29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://fastdl.mongodb.org/" + "'", str30, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming32);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz-0c7cb925-7f2a-42f1-87d3-ba62578ae509osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str41, "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz-0c7cb925-7f2a-42f1-87d3-ba62578ae509osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        de.flapdoodle.embedmongo.distribution.Version version4 = mongodConfig3.getVersion();
        int int5 = mongodConfig3.getPort();
        int int6 = mongodConfig3.getPort();
        de.flapdoodle.embedmongo.distribution.Version version7 = mongodConfig3.getVersion();
        org.junit.Assert.assertNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(version7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        consoleOneLineProgressListener0.start("");
        consoleOneLineProgressListener0.done(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig0.getDefaultfileNaming();
        java.lang.String str5 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime6 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Version version7 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution8 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version7);
        java.lang.String str9 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution8);
        de.flapdoodle.embedmongo.distribution.Version version10 = distribution8.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = mongoDBRuntime6.checkDistribution(distribution8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempfile: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-yhcrown-.TGZ");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://fastdl.mongodb.org/" + "'", str5, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(mongoDBRuntime6);
        org.junit.Assert.assertTrue("'" + version7 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version7.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongod" + "'", str9, "mongod");
        org.junit.Assert.assertTrue("'" + version10 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version10.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming0 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        java.lang.String str3 = userTempNaming0.nameFor("mongod", ".embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!");
        java.lang.String str6 = userTempNaming0.nameFor("http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz-0c7cb925-7f2a-42f1-87d3-ba62578ae509osx/mongodb-osx-i386-1.8.0-rc0.tgz", "mongod");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongod-yhcrown-.embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!" + "'", str3, "mongod-yhcrown-.embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz-0c7cb925-7f2a-42f1-87d3-ba62578ae509osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-mongod" + "'", str6, "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz-0c7cb925-7f2a-42f1-87d3-ba62578ae509osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-mongod");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig0.getDefaultfileNaming();
        java.lang.String str5 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.output.IProgressListener iProgressListener6 = runtimeConfig0.getProgressListener();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://fastdl.mongodb.org/" + "'", str5, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iProgressListener6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution7);
        java.lang.String str9 = de.flapdoodle.embedmongo.Paths.getPath(distribution7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str9, "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        standardConsoleProgressListener4.done("http://fastdl.mongodb.org/");
        standardConsoleProgressListener4.progress("http://fastdl.mongodb.org/", (int) (byte) 100);
        standardConsoleProgressListener4.start("http://fastdl.mongodb.org/");
        standardConsoleProgressListener4.progress(".embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!", (int) 'a');
        standardConsoleProgressListener4.done(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!");
        org.junit.Assert.assertNotNull(iTempNaming1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 0, false, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 1, true);
        java.lang.String str8 = mongodConfig7.getDatabaseDir();
        de.flapdoodle.embedmongo.distribution.Version version9 = mongodConfig7.getVersion();
        de.flapdoodle.embedmongo.distribution.Distribution distribution10 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version9);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertNotNull(distribution10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = null;
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version3);
        java.lang.String str5 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution4);
        java.io.File file6 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig1, distribution4);
        java.lang.String str7 = de.flapdoodle.embedmongo.Paths.getPath(distribution4);
        java.util.regex.Pattern pattern8 = de.flapdoodle.embedmongo.Paths.getMongodExecutablePattern(distribution4);
        java.io.File file10 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        boolean boolean11 = de.flapdoodle.embedmongo.Files.forceDelete(file10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = de.flapdoodle.embedmongo.LocalArtifactStore.store(runtimeConfig0, distribution4, file10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongod" + "'", str5, "mongod");
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-f1327795-0e62-4d5f-8fff-5e73374b63ae.TGZ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str7, "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(pattern8);
        org.junit.Assert.assertEquals(pattern8.toString(), ".*mongod");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertEquals(file10.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file10.toString(), "/Users/yhcrown/hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempFile("http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz-0c7cb925-7f2a-42f1-87d3-ba62578ae509osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-mongod");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig0.getDefaultfileNaming();
        java.lang.String str5 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig6 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming7 = runtimeConfig6.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming8 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig6.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming8);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming10 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig6.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming10);
        runtimeConfig0.setExecutableNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming10);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig13 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming14 = runtimeConfig13.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming15 = runtimeConfig13.getDefaultfileNaming();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig16 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming17 = runtimeConfig16.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version18 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution19 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version18);
        java.lang.String str20 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution19);
        java.io.File file21 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig16, distribution19);
        de.flapdoodle.embedmongo.distribution.Platform platform22 = distribution19.getPlatform();
        java.io.File file23 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig13, distribution19);
        java.io.File file24 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution19);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig25 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming26 = runtimeConfig25.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming27 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig25.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming27);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming29 = runtimeConfig25.getDefaultfileNaming();
        java.lang.String str30 = runtimeConfig25.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig31 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming32 = runtimeConfig31.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming33 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig31.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming33);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming35 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig31.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming35);
        runtimeConfig25.setExecutableNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming35);
        runtimeConfig0.setExecutableNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming35);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime39 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.output.IProgressListener iProgressListener40 = runtimeConfig0.getProgressListener();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://fastdl.mongodb.org/" + "'", str5, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming7);
        org.junit.Assert.assertNotNull(iTempNaming14);
        org.junit.Assert.assertNotNull(iTempNaming15);
        org.junit.Assert.assertNotNull(iTempNaming17);
        org.junit.Assert.assertTrue("'" + version18 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version18.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongod" + "'", str20, "mongod");
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file21.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-2ad9c163-19de-430b-a116-c88052d122a9.TGZ");
        org.junit.Assert.assertTrue("'" + platform22 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform22.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNotNull(iTempNaming26);
        org.junit.Assert.assertNotNull(iTempNaming29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://fastdl.mongodb.org/" + "'", str30, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming32);
        org.junit.Assert.assertNotNull(mongoDBRuntime39);
        org.junit.Assert.assertNotNull(iProgressListener40);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig0.getDefaultfileNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming5 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setExecutableNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming5);
        runtimeConfig0.setDownloadPath("mongod-yhcrown-.embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig0.getDefaultfileNaming();
        runtimeConfig0.setDownloadPath("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        de.flapdoodle.embedmongo.distribution.Version version7 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform8 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize9 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution10 = new de.flapdoodle.embedmongo.distribution.Distribution(version7, platform8, bitSize9);
        de.flapdoodle.embedmongo.distribution.Distribution distribution11 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version7);
        java.lang.String str12 = de.flapdoodle.embedmongo.Downloader.getDownloadUrl(runtimeConfig0, distribution11);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertTrue("'" + version7 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version7.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize9 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize9.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(distribution11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgzosx/mongodb-osx-i386-2.1.0.tgz" + "'", str12, "osx/mongodb-osx-i386-1.8.0-rc0.tgzosx/mongodb-osx-i386-2.1.0.tgz");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("", "hi!");
        standardConsoleProgressListener0.done("");
        standardConsoleProgressListener0.progress("osx/mongodb-osx-i386-1.8.0-rc0.tgz", 100);
        standardConsoleProgressListener0.done("hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig0.getDefaultfileNaming();
        java.lang.String str5 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig6 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming7 = runtimeConfig6.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming8 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig6.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming8);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming10 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig6.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming10);
        runtimeConfig0.setExecutableNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming10);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig13 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming14 = runtimeConfig13.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming15 = runtimeConfig13.getDefaultfileNaming();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig16 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming17 = runtimeConfig16.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version18 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution19 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version18);
        java.lang.String str20 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution19);
        java.io.File file21 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig16, distribution19);
        de.flapdoodle.embedmongo.distribution.Platform platform22 = distribution19.getPlatform();
        java.io.File file23 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig13, distribution19);
        java.io.File file24 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution19);
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType25 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution19);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://fastdl.mongodb.org/" + "'", str5, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming7);
        org.junit.Assert.assertNotNull(iTempNaming14);
        org.junit.Assert.assertNotNull(iTempNaming15);
        org.junit.Assert.assertNotNull(iTempNaming17);
        org.junit.Assert.assertTrue("'" + version18 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version18.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongod" + "'", str20, "mongod");
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file21.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-8ce16b6f-6a98-42ce-9c4b-1f0cbbb18b7b.TGZ");
        org.junit.Assert.assertTrue("'" + platform22 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform22.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertTrue("'" + archiveType25 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType25.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig6 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str7 = runtimeConfig6.getArtifactStorePath();
        java.lang.String str8 = runtimeConfig6.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig9 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming10 = runtimeConfig9.getExecutableNaming();
        runtimeConfig6.setDefaultfileNaming(iTempNaming10);
        de.flapdoodle.embedmongo.distribution.Version version12 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution13 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version12);
        java.io.File file14 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig6, distribution13);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming15 = runtimeConfig6.getExecutableNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming15);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming17 = runtimeConfig0.getExecutableNaming();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".embedmongo" + "'", str7, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://fastdl.mongodb.org/" + "'", str8, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming10);
        org.junit.Assert.assertTrue("'" + version12 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version12.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(iTempNaming15);
        org.junit.Assert.assertNotNull(iTempNaming17);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming4 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming4);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig6 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming7 = runtimeConfig6.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming8 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig6.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming8);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming10 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig6.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming10);
        java.lang.String str14 = uUIDTempNaming10.nameFor(".embedmongo", "hi!");
        runtimeConfig0.setExecutableNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming10);
        de.flapdoodle.embedmongo.output.IProgressListener iProgressListener16 = runtimeConfig0.getProgressListener();
        iProgressListener16.progress("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/", (int) (byte) 10);
        iProgressListener16.progress("hi!", (int) (byte) 10);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming7);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!" + "'", str14, ".embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!");
        org.junit.Assert.assertNotNull(iProgressListener16);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_0;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_0));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution7);
        de.flapdoodle.embedmongo.distribution.Version version9 = distribution7.getVersion();
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig13 = new de.flapdoodle.embedmongo.config.MongodConfig(version9, 0, true, "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz-0c7cb925-7f2a-42f1-87d3-ba62578ae509osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 0, false, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 1, true);
        java.lang.String str8 = mongodConfig7.getDatabaseDir();
        de.flapdoodle.embedmongo.distribution.Version version9 = mongodConfig7.getVersion();
        boolean boolean10 = mongodConfig7.isIpv6();
        de.flapdoodle.embedmongo.distribution.Version version11 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig14 = new de.flapdoodle.embedmongo.config.MongodConfig(version11, (int) (short) -1, false);
        java.io.File file15 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable16 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig14, file15);
        java.io.File file17 = mongodExecutable16.getFile();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess18 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig7, mongodExecutable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(file17);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig5 = new de.flapdoodle.embedmongo.config.MongodConfig(version1, 0, false, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable6 = mongoDBRuntime0.prepare(mongodConfig5);
        java.io.File file7 = mongodExecutable6.getFile();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess8 = mongodExecutable6.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/extract-b6dcffc9-802a-479f-9592-129a9caf3e19mongod\": error=86, Bad CPU type in executable");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertNotNull(mongodExecutable6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file7.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/extract-b6dcffc9-802a-479f-9592-129a9caf3e19mongod");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.info(".embedmongo", ".embedmongo");
        consoleOneLineProgressListener0.done("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/");
        consoleOneLineProgressListener0.done("");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime4 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Version version5 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig8 = new de.flapdoodle.embedmongo.config.MongodConfig(version5, (int) (short) -1, false);
        de.flapdoodle.embedmongo.distribution.Version version9 = mongodConfig8.getVersion();
        int int10 = mongodConfig8.getPort();
        java.lang.String str11 = mongodConfig8.getDatabaseDir();
        int int12 = mongodConfig8.getPort();
        de.flapdoodle.embedmongo.distribution.Version version13 = mongodConfig8.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodExecutable mongodExecutable14 = mongoDBRuntime4.prepare(mongodConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(mongoDBRuntime4);
        org.junit.Assert.assertNull(version9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(version13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckDir("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http://fastdl.mongodb.org/");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http:/fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http:/fastdl.mongodb.org");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime4 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file6 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(mongoDBRuntime4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/", "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        standardConsoleProgressListener0.start(".embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 0, false, "hi!");
        java.lang.String str5 = mongodConfig4.getDatabaseDir();
        de.flapdoodle.embedmongo.distribution.Version version6 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig9 = new de.flapdoodle.embedmongo.config.MongodConfig(version6, (int) (short) -1, false);
        java.io.File file10 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable11 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig9, file10);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess12 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig4, mongodExecutable11);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        consoleOneLineProgressListener0.start("");
        consoleOneLineProgressListener0.info("mongod", "");
        // The following exception was thrown during execution in test generation
        try {
            consoleOneLineProgressListener0.progress("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution7);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming9 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.output.IProgressListener iProgressListener10 = runtimeConfig0.getProgressListener();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(iTempNaming9);
        org.junit.Assert.assertNotNull(iProgressListener10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig4 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str5 = runtimeConfig4.getArtifactStorePath();
        java.lang.String str6 = runtimeConfig4.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig7 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming8 = runtimeConfig7.getExecutableNaming();
        runtimeConfig4.setDefaultfileNaming(iTempNaming8);
        de.flapdoodle.embedmongo.distribution.Version version10 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution11 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version10);
        java.io.File file12 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig4, distribution11);
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType13 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution11);
        boolean boolean14 = de.flapdoodle.embedmongo.LocalArtifactStore.checkArtifact(runtimeConfig0, distribution11);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".embedmongo" + "'", str5, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://fastdl.mongodb.org/" + "'", str6, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming8);
        org.junit.Assert.assertTrue("'" + version10 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version10.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution11);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertTrue("'" + archiveType13 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType13.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        de.flapdoodle.embedmongo.distribution.Version version4 = mongodConfig3.getVersion();
        int int5 = mongodConfig3.getPort();
        int int6 = mongodConfig3.getPort();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig7 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming8 = runtimeConfig7.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version9 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution10 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version9);
        java.lang.String str11 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution10);
        java.io.File file12 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig7, distribution10);
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable13 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file12);
        org.junit.Assert.assertNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(iTempNaming8);
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongod" + "'", str11, "mongod");
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertEquals(file12.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file12.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-2566063c-552f-4d78-8e21-c77c7a6afb08.TGZ");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        standardConsoleProgressListener4.done("http://fastdl.mongodb.org/");
        standardConsoleProgressListener4.progress("http://fastdl.mongodb.org/", (int) (byte) 100);
        standardConsoleProgressListener4.info("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo", "");
        standardConsoleProgressListener4.start("");
        standardConsoleProgressListener4.done("osx/mongodb-osx-i386-1.8.0-rc0.tgzosx/mongodb-osx-i386-2.1.0.tgz");
        org.junit.Assert.assertNotNull(iTempNaming1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        standardConsoleProgressListener4.done("http://fastdl.mongodb.org/");
        standardConsoleProgressListener4.progress("http://fastdl.mongodb.org/", (int) (byte) 100);
        standardConsoleProgressListener4.start("V1_8_0_rc0:OS_X:B32");
        org.junit.Assert.assertNotNull(iTempNaming1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = de.flapdoodle.embedmongo.distribution.Platform.OS_X;
        de.flapdoodle.embedmongo.distribution.Version version2 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version2);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig6 = new de.flapdoodle.embedmongo.config.MongodConfig(version2, (int) '4', false);
        de.flapdoodle.embedmongo.distribution.Platform platform7 = de.flapdoodle.embedmongo.distribution.Platform.Linux;
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig8 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str9 = runtimeConfig8.getArtifactStorePath();
        java.lang.String str10 = runtimeConfig8.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig11 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming12 = runtimeConfig11.getExecutableNaming();
        runtimeConfig8.setDefaultfileNaming(iTempNaming12);
        de.flapdoodle.embedmongo.distribution.Version version14 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution15 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version14);
        java.io.File file16 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig8, distribution15);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize17 = distribution15.getBitsize();
        de.flapdoodle.embedmongo.distribution.Distribution distribution18 = new de.flapdoodle.embedmongo.distribution.Distribution(version2, platform7, bitSize17);
        de.flapdoodle.embedmongo.distribution.Distribution distribution19 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize17);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertTrue("'" + platform1 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform1.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertTrue("'" + version2 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version2.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution3);
        org.junit.Assert.assertTrue("'" + platform7 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.Linux + "'", platform7.equals(de.flapdoodle.embedmongo.distribution.Platform.Linux));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".embedmongo" + "'", str9, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://fastdl.mongodb.org/" + "'", str10, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming12);
        org.junit.Assert.assertTrue("'" + version14 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version14.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertTrue("'" + bitSize17 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize17.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 0, false, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 1, true);
        java.lang.String str8 = mongodConfig7.getDatabaseDir();
        de.flapdoodle.embedmongo.distribution.Version version9 = mongodConfig7.getVersion();
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess11 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig7, mongodExecutable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.distribution.Version version4 = distribution3.getVersion();
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig9 = new de.flapdoodle.embedmongo.config.MongodConfig(version4, 0, true, ".embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertNotNull(distribution5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        boolean boolean2 = de.flapdoodle.embedmongo.Files.forceDelete(file1);
        boolean boolean3 = de.flapdoodle.embedmongo.Files.forceDelete(file1);
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertEquals(file1.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file1.toString(), "/Users/yhcrown/hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming4 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming4);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig6 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming7 = runtimeConfig6.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming8 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig6.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming8);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming10 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig6.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming10);
        java.lang.String str14 = uUIDTempNaming10.nameFor(".embedmongo", "hi!");
        runtimeConfig0.setExecutableNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming10);
        de.flapdoodle.embedmongo.output.IProgressListener iProgressListener16 = runtimeConfig0.getProgressListener();
        iProgressListener16.info("mongod-yhcrown-.embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!", "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz-0c7cb925-7f2a-42f1-87d3-ba62578ae509osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-mongod");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming7);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".embedmongo-1f8e1186-a571-4def-b53e-5761c6cb9a4ahi!" + "'", str14, ".embedmongo-1f8e1186-a571-4def-b53e-5761c6cb9a4ahi!");
        org.junit.Assert.assertNotNull(iProgressListener16);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        java.lang.String str6 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming7 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming7);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming9 = runtimeConfig0.getDefaultfileNaming();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig10 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming11 = runtimeConfig10.getExecutableNaming();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig12 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming13 = runtimeConfig12.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming14 = runtimeConfig12.getDefaultfileNaming();
        runtimeConfig10.setDefaultfileNaming(iTempNaming14);
        runtimeConfig0.setDefaultfileNaming(iTempNaming14);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig17 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming18 = runtimeConfig17.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming19 = runtimeConfig17.getDefaultfileNaming();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig20 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming21 = runtimeConfig20.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version22 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution23 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version22);
        java.lang.String str24 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution23);
        java.io.File file25 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig20, distribution23);
        de.flapdoodle.embedmongo.distribution.Platform platform26 = distribution23.getPlatform();
        java.io.File file27 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig17, distribution23);
        java.lang.String str28 = de.flapdoodle.embedmongo.Downloader.getDownloadUrl(runtimeConfig0, distribution23);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://fastdl.mongodb.org/" + "'", str6, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming9);
        org.junit.Assert.assertNotNull(iTempNaming11);
        org.junit.Assert.assertNotNull(iTempNaming13);
        org.junit.Assert.assertNotNull(iTempNaming14);
        org.junit.Assert.assertNotNull(iTempNaming18);
        org.junit.Assert.assertNotNull(iTempNaming19);
        org.junit.Assert.assertNotNull(iTempNaming21);
        org.junit.Assert.assertTrue("'" + version22 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version22.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "mongod" + "'", str24, "mongod");
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertEquals(file25.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file25.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-b5b5eee7-4b2a-45b4-abcd-5be1adb501d8.TGZ");
        org.junit.Assert.assertTrue("'" + platform26 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform26.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str28, "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_7_6;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = de.flapdoodle.embedmongo.distribution.Platform.Windows;
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig2.getDefaultfileNaming();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig5 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig5.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version7 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution8 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version7);
        java.lang.String str9 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution8);
        java.io.File file10 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig5, distribution8);
        de.flapdoodle.embedmongo.distribution.Platform platform11 = distribution8.getPlatform();
        java.io.File file12 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig2, distribution8);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize13 = distribution8.getBitsize();
        de.flapdoodle.embedmongo.distribution.Distribution distribution14 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize13);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig18 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 0, true, "V1_8_0_rc0:OS_X:B32");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_7_6 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_7_6));
        org.junit.Assert.assertTrue("'" + platform1 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.Windows + "'", platform1.equals(de.flapdoodle.embedmongo.distribution.Platform.Windows));
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertNotNull(iTempNaming6);
        org.junit.Assert.assertTrue("'" + version7 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version7.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongod" + "'", str9, "mongod");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertEquals(file10.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file10.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-b2906dac-8a16-442a-a4f1-6f42dd3cf1a6.TGZ");
        org.junit.Assert.assertTrue("'" + platform11 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform11.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertTrue("'" + bitSize13 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize13.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        consoleOneLineProgressListener0.start("");
        consoleOneLineProgressListener0.info("mongod", "");
        consoleOneLineProgressListener0.progress(".embedmongo-91400b37-9b33-4e1d-bb07-dd4527440011hi!", (int) (byte) 100);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        de.flapdoodle.embedmongo.distribution.Version version4 = mongodConfig3.getVersion();
        int int5 = mongodConfig3.getPort();
        java.lang.String str6 = mongodConfig3.getDatabaseDir();
        int int7 = mongodConfig3.getPort();
        java.io.File file9 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable10 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file9);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess11 = mongodExecutable10.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-8299eaa0-e252-4b9b-890e-87c9de531c10\": error=13, Permission denied");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file9.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-8299eaa0-e252-4b9b-890e-87c9de531c10");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempDir(".embedmongo-e8610fdb-2aa3-4b77-85b8-662731bb17afhi!");
        boolean boolean2 = de.flapdoodle.embedmongo.Files.forceDelete(file1);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version5 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution6 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version5);
        java.lang.String str7 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution6);
        java.io.File file8 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig3, distribution6);
        boolean boolean9 = de.flapdoodle.embedmongo.Files.moveFile(file1, file8);
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertEquals(file1.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file1.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/.embedmongo-e8610fdb-2aa3-4b77-85b8-662731bb17afhi!-ec8ed1cc-94bf-4f23-8365-abeb1445ad1f");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertTrue("'" + version5 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version5.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongod" + "'", str7, "mongod");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file8.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-1adb35e3-4698-4b3f-ada3-daaabb8d302b.TGZ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig0 = null;
        de.flapdoodle.embedmongo.distribution.Version version1 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version1, (int) (short) -1, false);
        de.flapdoodle.embedmongo.distribution.Version version5 = mongodConfig4.getVersion();
        int int6 = mongodConfig4.getPort();
        java.lang.String str7 = mongodConfig4.getDatabaseDir();
        int int8 = mongodConfig4.getPort();
        java.io.File file10 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable11 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig4, file10);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess12 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig0, mongodExecutable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(version5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertEquals(file10.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file10.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-733bc085-889e-4464-9c2c-278731d01ad9");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz-0c7cb925-7f2a-42f1-87d3-ba62578ae509osx/mongodb-osx-i386-1.8.0-rc0.tgz");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /Users/yhcrown/http:/fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz-0c7cb925-7f2a-42f1-87d3-ba62578ae509osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.info(".embedmongo", ".embedmongo");
        consoleOneLineProgressListener0.info(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!", ".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!");
        consoleOneLineProgressListener0.start("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo");
        consoleOneLineProgressListener0.info(".embedmongo-1f8e1186-a571-4def-b53e-5761c6cb9a4ahi!", "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http://fastdl.mongodb.org/");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version1 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version1, (int) (short) -1, false);
        java.io.File file5 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable6 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig4, file5);
        java.io.File file8 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable9 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig4, file8);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodExecutable mongodExecutable10 = mongoDBRuntime0.prepare(mongodConfig4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file8.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-64a96f4d-6166-4d39-8dca-2a2a8459b430");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!-3c39bb81-041a-4296-a9bf-2a8feb8a5c49http://fastdl.mongodb.org/");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /Users/yhcrown/.embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!-3c39bb81-041a-4296-a9bf-2a8feb8a5c49http:/fastdl.mongodb.org");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_5;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = de.flapdoodle.embedmongo.distribution.Platform.OS_X;
        de.flapdoodle.embedmongo.distribution.Version version2 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version2);
        java.lang.String str4 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution3);
        de.flapdoodle.embedmongo.extract.IExtractor iExtractor5 = de.flapdoodle.embedmongo.extract.Extractors.getExtractor(distribution3);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize6 = distribution3.getBitsize();
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize6);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_5 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_5));
        org.junit.Assert.assertTrue("'" + platform1 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform1.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertTrue("'" + version2 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version2.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongod" + "'", str4, "mongod");
        org.junit.Assert.assertNotNull(iExtractor5);
        org.junit.Assert.assertTrue("'" + bitSize6 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize6.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        consoleOneLineProgressListener0.start("");
        consoleOneLineProgressListener0.info("mongod", ".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!");
        // The following exception was thrown during execution in test generation
        try {
            consoleOneLineProgressListener0.progress("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Percent < 0: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.start("hi!");
        standardConsoleProgressListener0.start(".embedmongo");
        standardConsoleProgressListener0.start("");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempFile(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!-yhcrown-http://fastdl.mongodb.org/");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 0, false, "hi!");
        de.flapdoodle.embedmongo.distribution.Version version5 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig8 = new de.flapdoodle.embedmongo.config.MongodConfig(version5, (int) (short) -1, false);
        java.io.File file9 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable10 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig8, file9);
        java.io.File file11 = mongodExecutable10.getFile();
        java.io.File file12 = mongodExecutable10.getFile();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess13 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig4, mongodExecutable10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNull(file12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckDir(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), ".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.io.InputStream inputStream0 = null;
        de.flapdoodle.embedmongo.distribution.Version version2 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig5 = new de.flapdoodle.embedmongo.config.MongodConfig(version2, (int) (short) -1, false);
        java.io.File file6 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable7 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig5, file6);
        java.io.File file9 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable10 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig5, file9);
        boolean boolean11 = de.flapdoodle.embedmongo.Files.forceDelete(file9);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.Files.write(inputStream0, (long) (byte) 1, file9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file9.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-c269cb8f-947c-4d43-b327-bdd41b9b3a34");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener3 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener3);
        standardConsoleProgressListener3.start("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempDir("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http://fastdl.mongodb.org/");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http:/fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http:/fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http:/fastdl.mongodb.org/-384497d0-6c23-49f7-8f34-0213c4086724");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        java.lang.String str6 = runtimeConfig0.getDownloadPath();
        runtimeConfig0.setDownloadPath(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!-3c39bb81-041a-4296-a9bf-2a8feb8a5c49http://fastdl.mongodb.org/");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime9 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Version version10 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform11 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize12 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution13 = new de.flapdoodle.embedmongo.distribution.Distribution(version10, platform11, bitSize12);
        de.flapdoodle.embedmongo.distribution.Version version14 = distribution13.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version15 = distribution13.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = mongoDBRuntime9.checkDistribution(distribution13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://fastdl.mongodb.org/" + "'", str6, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(mongoDBRuntime9);
        org.junit.Assert.assertTrue("'" + version10 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version10.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize12 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize12.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version14 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version14.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + version15 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version15.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("", "hi!");
        standardConsoleProgressListener0.done("");
        standardConsoleProgressListener0.progress("osx/mongodb-osx-i386-1.8.0-rc0.tgz", 100);
        standardConsoleProgressListener0.done("http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz-0c7cb925-7f2a-42f1-87d3-ba62578ae509osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-mongod-3c7e603b-cf61-44a7-94a0-649513875a7dhi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("", "hi!");
        standardConsoleProgressListener0.done("");
        standardConsoleProgressListener0.done("");
        standardConsoleProgressListener0.start(".embedmongo-e8610fdb-2aa3-4b77-85b8-662731bb17afhi!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        java.lang.String str6 = runtimeConfig0.getDownloadPath();
        java.lang.String str7 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming8 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming8);
        de.flapdoodle.embedmongo.output.IProgressListener iProgressListener10 = runtimeConfig0.getProgressListener();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://fastdl.mongodb.org/" + "'", str6, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://fastdl.mongodb.org/" + "'", str7, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iProgressListener10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform7 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize8 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution9 = new de.flapdoodle.embedmongo.distribution.Distribution(version6, platform7, bitSize8);
        de.flapdoodle.embedmongo.distribution.Version version10 = distribution9.getVersion();
        de.flapdoodle.embedmongo.distribution.Distribution distribution11 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version10);
        boolean boolean12 = de.flapdoodle.embedmongo.LocalArtifactStore.checkArtifact(runtimeConfig0, distribution11);
        de.flapdoodle.embedmongo.distribution.Version version13 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution14 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version13);
        java.lang.String str15 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution14);
        de.flapdoodle.embedmongo.extract.IExtractor iExtractor16 = de.flapdoodle.embedmongo.extract.Extractors.getExtractor(distribution14);
        java.lang.String str17 = de.flapdoodle.embedmongo.Downloader.getDownloadUrl(runtimeConfig0, distribution14);
        de.flapdoodle.embedmongo.distribution.Version version18 = distribution14.getVersion();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize8 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize8.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version10 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version10.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertNotNull(distribution11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + version13 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version13.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongod" + "'", str15, "mongod");
        org.junit.Assert.assertNotNull(iExtractor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str17, "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertTrue("'" + version18 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version18.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming4 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming4);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig6 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming7 = runtimeConfig6.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming8 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig6.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming8);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming10 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig6.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming10);
        java.lang.String str14 = uUIDTempNaming10.nameFor(".embedmongo", "hi!");
        runtimeConfig0.setExecutableNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming10);
        de.flapdoodle.embedmongo.output.IProgressListener iProgressListener16 = runtimeConfig0.getProgressListener();
        runtimeConfig0.setDownloadPath(".embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming7);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".embedmongo-ba2a8c5b-c282-409e-86d3-279a628a2feehi!" + "'", str14, ".embedmongo-ba2a8c5b-c282-409e-86d3-279a628a2feehi!");
        org.junit.Assert.assertNotNull(iProgressListener16);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution7);
        java.lang.String str9 = distribution7.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "V1_8_0_rc0:OS_X:B32" + "'", str9, "V1_8_0_rc0:OS_X:B32");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_2;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig5 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (byte) 1, true, "V1_8_0_rc0:Linux:B32");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_2 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_2));
        org.junit.Assert.assertNotNull(distribution1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (byte) 0, false, "");
        de.flapdoodle.embedmongo.distribution.Version version5 = mongodConfig4.getVersion();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertTrue("'" + version5 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version5.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution7);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize9 = distribution7.getBitsize();
        de.flapdoodle.embedmongo.distribution.Platform platform10 = distribution7.getPlatform();
        java.lang.String str11 = distribution7.toString();
        java.lang.String str12 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + bitSize9 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize9.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + platform10 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform10.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "V1_8_0_rc0:OS_X:B32" + "'", str11, "V1_8_0_rc0:OS_X:B32");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongod" + "'", str12, "mongod");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming0 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        java.lang.String str3 = userTempNaming0.nameFor("mongod", ".embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!");
        java.lang.String str6 = userTempNaming0.nameFor("V1_8_0_rc0:Linux:B32", "osx/mongodb-osx-i386-1.8.0-rc0.tgzosx/mongodb-osx-i386-2.1.0.tgz");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongod-yhcrown-.embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!" + "'", str3, "mongod-yhcrown-.embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "V1_8_0_rc0:Linux:B32-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgzosx/mongodb-osx-i386-2.1.0.tgz" + "'", str6, "V1_8_0_rc0:Linux:B32-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgzosx/mongodb-osx-i386-2.1.0.tgz");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_2;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        java.lang.String str2 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution1);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_2 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_2));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongod" + "'", str2, "mongod");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        java.lang.String str6 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming7 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming7);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming9 = runtimeConfig0.getDefaultfileNaming();
        runtimeConfig0.setDownloadPath("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        runtimeConfig0.setDownloadPath("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://fastdl.mongodb.org/" + "'", str6, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming9);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) '4', false);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig8 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) 'a', true, "V1_8_0_rc0:Linux:B32");
        java.io.File file10 = de.flapdoodle.embedmongo.Files.createTempDir(".embedmongo-e8610fdb-2aa3-4b77-85b8-662731bb17afhi!");
        boolean boolean11 = de.flapdoodle.embedmongo.Files.forceDelete(file10);
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable12 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig8, file10);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime13 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version14 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig18 = new de.flapdoodle.embedmongo.config.MongodConfig(version14, 0, false, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable19 = mongoDBRuntime13.prepare(mongodConfig18);
        java.io.File file20 = mongodExecutable19.getFile();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess21 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig8, mongodExecutable19);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/extract-cc734db7-cf71-4895-9721-b78a1f91cbc5mongod\": error=86, Bad CPU type in executable");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertEquals(file10.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file10.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/.embedmongo-e8610fdb-2aa3-4b77-85b8-662731bb17afhi!-c622de8c-7b76-405f-9dd8-2702a2e410b0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(mongoDBRuntime13);
        org.junit.Assert.assertTrue("'" + version14 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version14.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertNotNull(mongodExecutable19);
        org.junit.Assert.assertNotNull(file20);
        org.junit.Assert.assertEquals(file20.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file20.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/extract-cc734db7-cf71-4895-9721-b78a1f91cbc5mongod");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        java.lang.String str6 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming7 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming7);
        java.lang.String str11 = uUIDTempNaming7.nameFor(".embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!", "V1_8_0_rc0:Linux:B32");
        java.lang.String str14 = uUIDTempNaming7.nameFor("V1_8_0_rc0:Linux:B32", "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://fastdl.mongodb.org/" + "'", str6, "http://fastdl.mongodb.org/");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!-459a0b78-fde0-4915-87e7-7a2e4238ec2cV1_8_0_rc0:Linux:B32" + "'", str11, ".embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!-459a0b78-fde0-4915-87e7-7a2e4238ec2cV1_8_0_rc0:Linux:B32");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "V1_8_0_rc0:Linux:B32-c276ccc1-3c73-4eec-ab48-92d9ce516c66http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str14, "V1_8_0_rc0:Linux:B32-c276ccc1-3c73-4eec-ab48-92d9ce516c66http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution7);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize9 = distribution7.getBitsize();
        java.lang.String str10 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution7);
        de.flapdoodle.embedmongo.distribution.Platform platform11 = distribution7.getPlatform();
        java.lang.String str12 = distribution7.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + bitSize9 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize9.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongod" + "'", str10, "mongod");
        org.junit.Assert.assertTrue("'" + platform11 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform11.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "V1_8_0_rc0:OS_X:B32" + "'", str12, "V1_8_0_rc0:OS_X:B32");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) '4', false);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig8 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) 'a', true, "V1_8_0_rc0:Linux:B32");
        java.io.File file10 = de.flapdoodle.embedmongo.Files.createTempDir(".embedmongo-e8610fdb-2aa3-4b77-85b8-662731bb17afhi!");
        boolean boolean11 = de.flapdoodle.embedmongo.Files.forceDelete(file10);
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable12 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig8, file10);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess13 = mongodExecutable12.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/.embedmongo-e8610fdb-2aa3-4b77-85b8-662731bb17afhi!-d0ce9ede-f0e2-4d63-8368-0df59dce4b18\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertEquals(file10.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file10.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/.embedmongo-e8610fdb-2aa3-4b77-85b8-662731bb17afhi!-d0ce9ede-f0e2-4d63-8368-0df59dce4b18");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.info(".embedmongo", ".embedmongo");
        consoleOneLineProgressListener0.info(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!", ".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!");
        consoleOneLineProgressListener0.progress(".embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!", 100);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir(".embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertEquals(file1.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file1.toString(), "/Users/yhcrown/.embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        java.lang.String str6 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming7 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming7);
        java.lang.String str11 = uUIDTempNaming7.nameFor("http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz-0c7cb925-7f2a-42f1-87d3-ba62578ae509osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-mongod", "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo");
        java.lang.String str14 = uUIDTempNaming7.nameFor(".embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!", ".embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!-459a0b78-fde0-4915-87e7-7a2e4238ec2cV1_8_0_rc0:Linux:B32");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://fastdl.mongodb.org/" + "'", str6, "http://fastdl.mongodb.org/");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz-0c7cb925-7f2a-42f1-87d3-ba62578ae509osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-mongod-a8ebaf18-2f0f-471b-b794-e172bfa6f32dhi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo" + "'", str11, "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz-0c7cb925-7f2a-42f1-87d3-ba62578ae509osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-mongod-a8ebaf18-2f0f-471b-b794-e172bfa6f32dhi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!-0fd529ab-73a9-432d-9807-367128cf9b62.embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!-459a0b78-fde0-4915-87e7-7a2e4238ec2cV1_8_0_rc0:Linux:B32" + "'", str14, ".embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!-0fd529ab-73a9-432d-9807-367128cf9b62.embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!-459a0b78-fde0-4915-87e7-7a2e4238ec2cV1_8_0_rc0:Linux:B32");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckDir("http://fastdl.mongodb.org/");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: http:/fastdl.mongodb.org");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming4);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig0.getDefaultfileNaming();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertNotNull(iTempNaming6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        java.lang.String str4 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming5 = runtimeConfig0.getDefaultfileNaming();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig6 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming7 = runtimeConfig6.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming8 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig6.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming8);
        java.lang.String str10 = runtimeConfig6.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig11 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming12 = runtimeConfig11.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming13 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig11.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming13);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener15 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig11.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener15);
        de.flapdoodle.embedmongo.distribution.Version version17 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform18 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize19 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution20 = new de.flapdoodle.embedmongo.distribution.Distribution(version17, platform18, bitSize19);
        de.flapdoodle.embedmongo.distribution.Version version21 = distribution20.getVersion();
        de.flapdoodle.embedmongo.distribution.Distribution distribution22 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version21);
        boolean boolean23 = de.flapdoodle.embedmongo.LocalArtifactStore.checkArtifact(runtimeConfig11, distribution22);
        de.flapdoodle.embedmongo.distribution.Platform platform24 = distribution22.getPlatform();
        java.lang.String str25 = de.flapdoodle.embedmongo.Downloader.getDownloadUrl(runtimeConfig6, distribution22);
        boolean boolean26 = de.flapdoodle.embedmongo.LocalArtifactStore.checkArtifact(runtimeConfig0, distribution22);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://fastdl.mongodb.org/" + "'", str4, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming5);
        org.junit.Assert.assertNotNull(iTempNaming7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://fastdl.mongodb.org/" + "'", str10, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming12);
        org.junit.Assert.assertTrue("'" + version17 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version17.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize19 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize19.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version21 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version21.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertNotNull(distribution22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + platform24 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform24.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://fastdl.mongodb.org/osx/mongodb-osx-i386-2.1.0.tgz" + "'", str25, "http://fastdl.mongodb.org/osx/mongodb-osx-i386-2.1.0.tgz");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 0, true);
        int int4 = mongodConfig3.getPort();
        de.flapdoodle.embedmongo.distribution.Version version5 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig8 = new de.flapdoodle.embedmongo.config.MongodConfig(version5, (int) (short) -1, false);
        java.io.File file9 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable10 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig8, file9);
        java.io.File file11 = mongodExecutable10.getFile();
        java.io.File file12 = mongodExecutable10.getFile();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess13 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig3, mongodExecutable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNull(file12);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        consoleOneLineProgressListener0.start("");
        consoleOneLineProgressListener0.info("mongod", ".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!");
        consoleOneLineProgressListener0.done(".embedmongo-e8610fdb-2aa3-4b77-85b8-662731bb17afhi!");
        consoleOneLineProgressListener0.done("hi!");
        consoleOneLineProgressListener0.info(".embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!-ad696ddc-61ca-405c-bb6d-9b8ff14b3a61V1_8_0_rc0:Linux:B32", ".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.done(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!-3c39bb81-041a-4296-a9bf-2a8feb8a5c49http://fastdl.mongodb.org/");
        consoleOneLineProgressListener0.info(".embedmongo-e8610fdb-2aa3-4b77-85b8-662731bb17afhi!", "http://fastdl.mongodb.org/");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        standardConsoleProgressListener4.done("http://fastdl.mongodb.org/");
        standardConsoleProgressListener4.progress("http://fastdl.mongodb.org/", (int) (byte) 100);
        standardConsoleProgressListener4.info("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo", "");
        standardConsoleProgressListener4.info(".embedmongo-ba2a8c5b-c282-409e-86d3-279a628a2feehi!", ".embedmongo-e8610fdb-2aa3-4b77-85b8-662731bb17afhi!");
        org.junit.Assert.assertNotNull(iTempNaming1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime4 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.output.IProgressListener iProgressListener5 = runtimeConfig0.getProgressListener();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig6 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming7 = runtimeConfig6.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming8 = runtimeConfig6.getDefaultfileNaming();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig9 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming10 = runtimeConfig9.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version11 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution12 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version11);
        java.lang.String str13 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution12);
        java.io.File file14 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig9, distribution12);
        de.flapdoodle.embedmongo.distribution.Platform platform15 = distribution12.getPlatform();
        java.io.File file16 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig6, distribution12);
        java.io.File file17 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution12);
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener18 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener18.info(".embedmongo", ".embedmongo");
        consoleOneLineProgressListener18.info(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!", ".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!");
        consoleOneLineProgressListener18.start("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo");
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) consoleOneLineProgressListener18);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming28 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version29 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform30 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize31 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution32 = new de.flapdoodle.embedmongo.distribution.Distribution(version29, platform30, bitSize31);
        de.flapdoodle.embedmongo.distribution.Version version33 = distribution32.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version34 = distribution32.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file35 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(mongoDBRuntime4);
        org.junit.Assert.assertNotNull(iProgressListener5);
        org.junit.Assert.assertNotNull(iTempNaming7);
        org.junit.Assert.assertNotNull(iTempNaming8);
        org.junit.Assert.assertNotNull(iTempNaming10);
        org.junit.Assert.assertTrue("'" + version11 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version11.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongod" + "'", str13, "mongod");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file14.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-9aaf0c03-f07e-448e-830b-97f0ad9cb93e.TGZ");
        org.junit.Assert.assertTrue("'" + platform15 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform15.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNotNull(iTempNaming28);
        org.junit.Assert.assertTrue("'" + version29 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version29.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize31 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize31.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version33 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version33.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + version34 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version34.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckDir(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!-3c39bb81-041a-4296-a9bf-2a8feb8a5c49http://fastdl.mongodb.org/");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: .embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!-3c39bb81-041a-4296-a9bf-2a8feb8a5c49http:/fastdl.mongodb.org");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("V1_8_0_rc0:Linux:B32");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertEquals(file1.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file1.toString(), "/Users/yhcrown/V1_8_0_rc0:Linux:B32");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.io.File file1 = null; // flaky: de.flapdoodle.embedmongo.Files.createTempFile("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertEquals(file1.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file1.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str2 = runtimeConfig1.getArtifactStorePath();
        java.lang.String str3 = runtimeConfig1.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig4 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming5 = runtimeConfig4.getExecutableNaming();
        runtimeConfig1.setDefaultfileNaming(iTempNaming5);
        de.flapdoodle.embedmongo.distribution.Version version7 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution8 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version7);
        java.io.File file9 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig1, distribution8);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize10 = distribution8.getBitsize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = mongoDBRuntime0.checkDistribution(distribution8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Could not move /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-bbc14d97-dbef-45ca-a8e8-81770dd4e430.TGZ to /Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".embedmongo" + "'", str2, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://fastdl.mongodb.org/" + "'", str3, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming5);
        org.junit.Assert.assertTrue("'" + version7 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version7.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertTrue("'" + bitSize10 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize10.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig5 = new de.flapdoodle.embedmongo.config.MongodConfig(version1, 0, false, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable6 = mongoDBRuntime0.prepare(mongodConfig5);
        int int7 = mongodConfig5.getPort();
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertNotNull(mongodExecutable6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig6 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str7 = runtimeConfig6.getArtifactStorePath();
        java.lang.String str8 = runtimeConfig6.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig9 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming10 = runtimeConfig9.getExecutableNaming();
        runtimeConfig6.setDefaultfileNaming(iTempNaming10);
        de.flapdoodle.embedmongo.distribution.Version version12 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution13 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version12);
        java.io.File file14 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig6, distribution13);
        boolean boolean15 = de.flapdoodle.embedmongo.LocalArtifactStore.checkArtifact(runtimeConfig0, distribution13);
        de.flapdoodle.embedmongo.extract.IExtractor iExtractor16 = de.flapdoodle.embedmongo.extract.Extractors.getExtractor(distribution13);
        de.flapdoodle.embedmongo.distribution.Version version17 = distribution13.getVersion();
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType18 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution13);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".embedmongo" + "'", str7, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://fastdl.mongodb.org/" + "'", str8, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming10);
        org.junit.Assert.assertTrue("'" + version12 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version12.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iExtractor16);
        org.junit.Assert.assertTrue("'" + version17 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version17.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertTrue("'" + archiveType18 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType18.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution7);
        de.flapdoodle.embedmongo.distribution.Version version9 = distribution7.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version10 = distribution7.getVersion();
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType11 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertTrue("'" + version10 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version10.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertTrue("'" + archiveType11 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType11.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime4 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig5 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig5.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming7 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig5.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming7);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime9 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig5);
        de.flapdoodle.embedmongo.output.IProgressListener iProgressListener10 = runtimeConfig5.getProgressListener();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig11 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming12 = runtimeConfig11.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming13 = runtimeConfig11.getDefaultfileNaming();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig14 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming15 = runtimeConfig14.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version16 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution17 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version16);
        java.lang.String str18 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution17);
        java.io.File file19 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig14, distribution17);
        de.flapdoodle.embedmongo.distribution.Platform platform20 = distribution17.getPlatform();
        java.io.File file21 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig11, distribution17);
        java.io.File file22 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig5, distribution17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = mongoDBRuntime4.checkDistribution(distribution17);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempfile: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-yhcrown-.TGZ");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(mongoDBRuntime4);
        org.junit.Assert.assertNotNull(iTempNaming6);
        org.junit.Assert.assertNotNull(mongoDBRuntime9);
        org.junit.Assert.assertNotNull(iProgressListener10);
        org.junit.Assert.assertNotNull(iTempNaming12);
        org.junit.Assert.assertNotNull(iTempNaming13);
        org.junit.Assert.assertNotNull(iTempNaming15);
        org.junit.Assert.assertTrue("'" + version16 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version16.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "mongod" + "'", str18, "mongod");
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file19.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-c6c34134-e474-4069-9cb7-05669d994acc.TGZ");
        org.junit.Assert.assertTrue("'" + platform20 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform20.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNull(file22);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version2 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version2);
        java.lang.String str4 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution3);
        java.io.File file5 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution3);
        java.lang.String str6 = de.flapdoodle.embedmongo.Paths.getPath(distribution3);
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType7 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution3);
        de.flapdoodle.embedmongo.distribution.Version version8 = distribution3.getVersion();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version2 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version2.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongod" + "'", str4, "mongod");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file5.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-c962c646-2de5-46bc-92a3-1344c17ab3e0.TGZ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str6, "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertTrue("'" + archiveType7 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType7.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
        org.junit.Assert.assertTrue("'" + version8 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version8.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming4 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming4);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming7 = runtimeConfig0.getDefaultfileNaming();
        java.lang.String str8 = runtimeConfig0.getDownloadPath();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming6);
        org.junit.Assert.assertNotNull(iTempNaming7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://fastdl.mongodb.org/" + "'", str8, "http://fastdl.mongodb.org/");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.done("http://fastdl.mongodb.org/");
        consoleOneLineProgressListener0.progress("mongod", (int) (byte) 10);
        consoleOneLineProgressListener0.info("V1_8_0_rc0:Linux:B32-c276ccc1-3c73-4eec-ab48-92d9ce516c66http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz", "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz-0c7cb925-7f2a-42f1-87d3-ba62578ae509osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-mongod");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        consoleOneLineProgressListener0.start("");
        consoleOneLineProgressListener0.info("mongod", ".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!");
        consoleOneLineProgressListener0.done(".embedmongo-e8610fdb-2aa3-4b77-85b8-662731bb17afhi!");
        consoleOneLineProgressListener0.done("hi!");
        consoleOneLineProgressListener0.info(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!-yhcrown-http://fastdl.mongodb.org/", "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming0 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        java.lang.String str3 = uUIDTempNaming0.nameFor(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!", "http://fastdl.mongodb.org/");
        java.lang.String str6 = uUIDTempNaming0.nameFor(".embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!", "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!-a5dc42b3-3bbc-41dd-93e0-f2651fba6510http://fastdl.mongodb.org/" + "'", str3, ".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!-a5dc42b3-3bbc-41dd-93e0-f2651fba6510http://fastdl.mongodb.org/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ".embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!-3777c0d6-078e-461f-84ef-19352d4593achttp://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str6, ".embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!-3777c0d6-078e-461f-84ef-19352d4593achttp://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http://fastdl.mongodb.org/");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /Users/yhcrown/hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http:/fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http:/fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http:/fastdl.mongodb.org");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        runtimeConfig0.setDownloadPath("mongod-yhcrown-.embedmongo-0afc076d-8aa3-4f15-90ae-af62c4f9f9ddhi!");
        org.junit.Assert.assertNotNull(iTempNaming1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 0, false, "hi!");
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig8 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (byte) -1, false, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        de.flapdoodle.embedmongo.extract.ZipExtractor zipExtractor0 = new de.flapdoodle.embedmongo.extract.ZipExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming3 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming3);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming5 = runtimeConfig1.getDefaultfileNaming();
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.lang.String str8 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution7);
        java.io.File file9 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig1, distribution7);
        java.io.File file10 = null;
        de.flapdoodle.embedmongo.distribution.Version version11 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig14 = new de.flapdoodle.embedmongo.config.MongodConfig(version11, (int) (short) -1, false);
        java.io.File file15 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable16 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig14, file15);
        java.io.File file18 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable19 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig14, file18);
        boolean boolean20 = de.flapdoodle.embedmongo.Files.forceDelete(file18);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig21 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming22 = runtimeConfig21.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version23 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution24 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version23);
        java.lang.String str25 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution24);
        java.io.File file26 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig21, distribution24);
        java.lang.String str27 = de.flapdoodle.embedmongo.Paths.getPath(distribution24);
        java.util.regex.Pattern pattern28 = de.flapdoodle.embedmongo.Paths.getMongodExecutablePattern(distribution24);
        // The following exception was thrown during execution in test generation
        try {
            zipExtractor0.extract(runtimeConfig1, file10, file18, pattern28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertNotNull(iTempNaming5);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongod" + "'", str8, "mongod");
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file18.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-f95f13f3-5245-49ce-af2b-1fcbfe104f17");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iTempNaming22);
        org.junit.Assert.assertTrue("'" + version23 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version23.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "mongod" + "'", str25, "mongod");
        org.junit.Assert.assertNotNull(file26);
        org.junit.Assert.assertEquals(file26.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file26.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-0fa41ef8-f179-45c1-8295-3664759b38c0.TGZ");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str27, "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(pattern28);
        org.junit.Assert.assertEquals(pattern28.toString(), ".*mongod");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempFile("V1_8_0_rc0:Linux:B32-c276ccc1-3c73-4eec-ab48-92d9ce516c66http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig0.getDefaultfileNaming();
        java.lang.String str5 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime6 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Version version7 = de.flapdoodle.embedmongo.distribution.Version.V1_8_2;
        de.flapdoodle.embedmongo.distribution.Distribution distribution8 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = mongoDBRuntime6.checkDistribution(distribution8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempfile: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-yhcrown-.TGZ");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://fastdl.mongodb.org/" + "'", str5, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(mongoDBRuntime6);
        org.junit.Assert.assertTrue("'" + version7 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_2 + "'", version7.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_2));
        org.junit.Assert.assertNotNull(distribution8);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        de.flapdoodle.embedmongo.distribution.Distribution distribution0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.regex.Pattern pattern1 = de.flapdoodle.embedmongo.Paths.getMongodExecutablePattern(distribution0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        java.lang.String str6 = runtimeConfig0.getDownloadPath();
        java.lang.String str7 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener8 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener8.info("", "hi!");
        standardConsoleProgressListener8.done("");
        standardConsoleProgressListener8.done("");
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener8);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://fastdl.mongodb.org/" + "'", str6, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://fastdl.mongodb.org/" + "'", str7, "http://fastdl.mongodb.org/");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) '4', false);
        de.flapdoodle.embedmongo.distribution.Platform platform5 = de.flapdoodle.embedmongo.distribution.Platform.Linux;
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig6 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str7 = runtimeConfig6.getArtifactStorePath();
        java.lang.String str8 = runtimeConfig6.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig9 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming10 = runtimeConfig9.getExecutableNaming();
        runtimeConfig6.setDefaultfileNaming(iTempNaming10);
        de.flapdoodle.embedmongo.distribution.Version version12 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution13 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version12);
        java.io.File file14 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig6, distribution13);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize15 = distribution13.getBitsize();
        de.flapdoodle.embedmongo.distribution.Distribution distribution16 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform5, bitSize15);
        java.lang.String str17 = distribution16.toString();
        java.lang.String str18 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution16);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertTrue("'" + platform5 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.Linux + "'", platform5.equals(de.flapdoodle.embedmongo.distribution.Platform.Linux));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".embedmongo" + "'", str7, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://fastdl.mongodb.org/" + "'", str8, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming10);
        org.junit.Assert.assertTrue("'" + version12 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version12.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertTrue("'" + bitSize15 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize15.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "V1_8_0_rc0:Linux:B32" + "'", str17, "V1_8_0_rc0:Linux:B32");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "mongod" + "'", str18, "mongod");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        java.lang.String str2 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution1);
        de.flapdoodle.embedmongo.extract.IExtractor iExtractor3 = de.flapdoodle.embedmongo.extract.Extractors.getExtractor(distribution1);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize4 = distribution1.getBitsize();
        java.lang.String str5 = distribution1.toString();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongod" + "'", str2, "mongod");
        org.junit.Assert.assertNotNull(iExtractor3);
        org.junit.Assert.assertTrue("'" + bitSize4 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize4.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "V1_8_0_rc0:OS_X:B32" + "'", str5, "V1_8_0_rc0:OS_X:B32");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        java.lang.String str6 = runtimeConfig0.getDownloadPath();
        java.lang.String str7 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming8 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming8);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig10 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming11 = runtimeConfig10.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming12 = runtimeConfig10.getDefaultfileNaming();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig13 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming14 = runtimeConfig13.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version15 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution16 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version15);
        java.lang.String str17 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution16);
        java.io.File file18 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig13, distribution16);
        de.flapdoodle.embedmongo.distribution.Platform platform19 = distribution16.getPlatform();
        java.io.File file20 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig10, distribution16);
        java.io.File file21 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution16);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://fastdl.mongodb.org/" + "'", str6, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://fastdl.mongodb.org/" + "'", str7, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming11);
        org.junit.Assert.assertNotNull(iTempNaming12);
        org.junit.Assert.assertNotNull(iTempNaming14);
        org.junit.Assert.assertTrue("'" + version15 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version15.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongod" + "'", str17, "mongod");
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file18.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-29d9f2c2-a7f6-4011-bc8c-99e83e8fad4c.TGZ");
        org.junit.Assert.assertTrue("'" + platform19 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform19.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNull(file21);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) '4', false);
        java.io.File file6 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        boolean boolean7 = de.flapdoodle.embedmongo.Files.forceDelete(file6);
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable8 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig4, file6);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-dab130ab-67cb-4982-8d97-ef8b8acd1acf");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming4 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) uUIDTempNaming4);
        java.lang.String str8 = uUIDTempNaming4.nameFor(".embedmongo", "hi!");
        java.lang.Class<?> wildcardClass9 = uUIDTempNaming4.getClass();
        org.junit.Assert.assertNotNull(iTempNaming1);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".embedmongo-07506e74-d199-45f6-9565-a366138e3571hi!" + "'", str8, ".embedmongo-07506e74-d199-45f6-9565-a366138e3571hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 0, false, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 1, true);
        java.lang.String str8 = mongodConfig7.getDatabaseDir();
        de.flapdoodle.embedmongo.distribution.Version version9 = mongodConfig7.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version10 = mongodConfig7.getVersion();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertTrue("'" + version10 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version10.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 0, true);
        boolean boolean4 = mongodConfig3.isIpv6();
        boolean boolean5 = mongodConfig3.isIpv6();
        int int6 = mongodConfig3.getPort();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        consoleOneLineProgressListener0.start("");
        consoleOneLineProgressListener0.info("mongod", ".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!");
        consoleOneLineProgressListener0.done(".embedmongo-e8610fdb-2aa3-4b77-85b8-662731bb17afhi!");
        consoleOneLineProgressListener0.done("hi!");
        // The following exception was thrown during execution in test generation
        try {
            consoleOneLineProgressListener0.progress("V1_8_0_rc0:Linux:B32-c276ccc1-3c73-4eec-ab48-92d9ce516c66http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig0.getDefaultfileNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming5 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setExecutableNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming5);
        java.lang.String str9 = userTempNaming5.nameFor("hi!", "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo");
        java.lang.String str12 = userTempNaming5.nameFor("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo", "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http://fastdl.mongodb.org/");
        java.lang.String str15 = userTempNaming5.nameFor("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http://fastdl.mongodb.org/", ".embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!-ad696ddc-61ca-405c-bb6d-9b8ff14b3a61V1_8_0_rc0:Linux:B32");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!-yhcrown-hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo" + "'", str9, "hi!-yhcrown-hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http://fastdl.mongodb.org/" + "'", str12, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http://fastdl.mongodb.org/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http://fastdl.mongodb.org/-yhcrown-.embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!-ad696ddc-61ca-405c-bb6d-9b8ff14b3a61V1_8_0_rc0:Linux:B32" + "'", str15, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo-yhcrown-http://fastdl.mongodb.org/-yhcrown-.embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!-ad696ddc-61ca-405c-bb6d-9b8ff14b3a61V1_8_0_rc0:Linux:B32");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        consoleOneLineProgressListener0.info("hi!", "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        consoleOneLineProgressListener0.done("V1_8_0_rc0:OS_X:B32");
        // The following exception was thrown during execution in test generation
        try {
            consoleOneLineProgressListener0.progress(".embedmongo-efc91f14-8d1a-4ef7-b173-b607091cd3b1hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Percent < 0: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        java.lang.String str6 = runtimeConfig0.getDownloadPath();
        runtimeConfig0.setDownloadPath(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!-3c39bb81-041a-4296-a9bf-2a8feb8a5c49http://fastdl.mongodb.org/");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime9 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Version version10 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig14 = new de.flapdoodle.embedmongo.config.MongodConfig(version10, 0, false, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig17 = new de.flapdoodle.embedmongo.config.MongodConfig(version10, 1, true);
        java.lang.String str18 = mongodConfig17.getDatabaseDir();
        de.flapdoodle.embedmongo.distribution.Version version19 = mongodConfig17.getVersion();
        boolean boolean20 = mongodConfig17.isIpv6();
        int int21 = mongodConfig17.getPort();
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable22 = mongoDBRuntime9.prepare(mongodConfig17);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://fastdl.mongodb.org/" + "'", str6, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(mongoDBRuntime9);
        org.junit.Assert.assertTrue("'" + version10 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version10.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + version19 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version19.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(mongodExecutable22);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener3 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener3);
        standardConsoleProgressListener3.done("mongod");
        standardConsoleProgressListener3.start(".embedmongo-4ed2002b-f3ff-4292-bf20-2c53fad7eb2bhi!-a5dc42b3-3bbc-41dd-93e0-f2651fba6510http://fastdl.mongodb.org/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        de.flapdoodle.embedmongo.distribution.Distribution distribution0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = de.flapdoodle.embedmongo.Paths.getPath(distribution0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 0, false, "hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod");
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 1, true);
        de.flapdoodle.embedmongo.distribution.Version version8 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform9 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize10 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution11 = new de.flapdoodle.embedmongo.distribution.Distribution(version8, platform9, bitSize10);
        de.flapdoodle.embedmongo.distribution.Version version12 = distribution11.getVersion();
        de.flapdoodle.embedmongo.distribution.Distribution distribution13 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version12);
        de.flapdoodle.embedmongo.distribution.Platform platform14 = distribution13.getPlatform();
        de.flapdoodle.embedmongo.distribution.Version version15 = de.flapdoodle.embedmongo.distribution.Version.V1_7_6;
        de.flapdoodle.embedmongo.distribution.Platform platform16 = de.flapdoodle.embedmongo.distribution.Platform.Windows;
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig17 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming18 = runtimeConfig17.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming19 = runtimeConfig17.getDefaultfileNaming();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig20 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming21 = runtimeConfig20.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version22 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution23 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version22);
        java.lang.String str24 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution23);
        java.io.File file25 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig20, distribution23);
        de.flapdoodle.embedmongo.distribution.Platform platform26 = distribution23.getPlatform();
        java.io.File file27 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig17, distribution23);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize28 = distribution23.getBitsize();
        de.flapdoodle.embedmongo.distribution.Distribution distribution29 = new de.flapdoodle.embedmongo.distribution.Distribution(version15, platform16, bitSize28);
        de.flapdoodle.embedmongo.distribution.Distribution distribution30 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform14, bitSize28);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig34 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 1, false, "hi!-yhcrown-hi!-cdae04fa-4e9f-49db-a564-3b608e708770mongod-8a5b6e71-c664-462b-be95-e5c333b9e7d5http://fastdl.mongodb.org/-yhcrown-.embedmongo");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertTrue("'" + version8 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version8.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize10 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize10.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version12 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version12.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertNotNull(distribution13);
        org.junit.Assert.assertTrue("'" + platform14 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform14.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertTrue("'" + version15 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_7_6 + "'", version15.equals(de.flapdoodle.embedmongo.distribution.Version.V1_7_6));
        org.junit.Assert.assertTrue("'" + platform16 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.Windows + "'", platform16.equals(de.flapdoodle.embedmongo.distribution.Platform.Windows));
        org.junit.Assert.assertNotNull(iTempNaming18);
        org.junit.Assert.assertNotNull(iTempNaming19);
        org.junit.Assert.assertNotNull(iTempNaming21);
        org.junit.Assert.assertTrue("'" + version22 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version22.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "mongod" + "'", str24, "mongod");
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertEquals(file25.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
// flaky:         org.junit.Assert.assertEquals(file25.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-1f24a67b-54e5-44f0-ba80-7599a2312f18.TGZ");
        org.junit.Assert.assertTrue("'" + platform26 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform26.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertTrue("'" + bitSize28 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize28.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }
}
