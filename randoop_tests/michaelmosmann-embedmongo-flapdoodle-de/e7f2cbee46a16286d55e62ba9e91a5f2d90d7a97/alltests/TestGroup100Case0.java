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
        de.flapdoodle.embedmongo.distribution.Platform platform0 = de.flapdoodle.embedmongo.distribution.Platform.Linux;
        org.junit.Assert.assertTrue("'" + platform0 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.Linux + "'", platform0.equals(de.flapdoodle.embedmongo.distribution.Platform.Linux));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_6;
        java.lang.Class<?> wildcardClass1 = version0.getClass();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_6 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_6));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_9_0;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_9_0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_9_0));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        java.lang.Class<?> wildcardClass1 = mongoDBRuntime0.getClass();
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempFile("");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempfile: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType0 = de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ;
        org.junit.Assert.assertTrue("'" + archiveType0 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType0.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        de.flapdoodle.embedmongo.Paths paths0 = new de.flapdoodle.embedmongo.Paths();
        java.lang.Class<?> wildcardClass1 = paths0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig0.getDefaultfileNaming();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform2 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize3 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = new de.flapdoodle.embedmongo.distribution.Distribution(version1, platform2, bitSize3);
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = mongoDBRuntime0.checkDistribution(distribution5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Could not move /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-51337444-40aa-4ec0-9cd4-273f4103d4e0.TGZ to /Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-2.1.0.tgz");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize3 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize3.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(distribution5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
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
        org.junit.Assert.assertEquals(file9.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-679bfe9a-8e85-428c-8035-20ef35e9d2b6");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_2;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_2 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_2));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("", "hi!");
        standardConsoleProgressListener0.done("");
        standardConsoleProgressListener0.done("");
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        de.flapdoodle.embedmongo.distribution.Platform platform0 = de.flapdoodle.embedmongo.distribution.Platform.Windows;
        org.junit.Assert.assertTrue("'" + platform0 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.Windows + "'", platform0.equals(de.flapdoodle.embedmongo.distribution.Platform.Windows));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        java.lang.Class<?> wildcardClass1 = version0.getClass();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
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
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("", "hi!");
        standardConsoleProgressListener0.done("");
        standardConsoleProgressListener0.progress("osx/mongodb-osx-i386-1.8.0-rc0.tgz", 100);
        standardConsoleProgressListener0.progress("http://fastdl.mongodb.org/", 10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        java.io.File file6 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution5);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime7 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version8 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution9 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version8);
        boolean boolean10 = mongoDBRuntime7.checkDistribution(distribution9);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file11 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution9);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempfile: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-yhcrown-.TGZ");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file6.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(mongoDBRuntime7);
        org.junit.Assert.assertTrue("'" + version8 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version8.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        de.flapdoodle.embedmongo.extract.TgzExtractor tgzExtractor0 = new de.flapdoodle.embedmongo.extract.TgzExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming3 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming3);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener5 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig1.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener5);
        java.io.File file8 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig9 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming10 = runtimeConfig9.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming11 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig9.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming11);
        de.flapdoodle.embedmongo.distribution.Version version13 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution14 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version13);
        java.io.File file15 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig9, distribution14);
        java.util.regex.Pattern pattern16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tgzExtractor0.extract(runtimeConfig1, file8, file15, pattern16);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-42d367b7-4669-4adf-be02-e4d6ecb40b8a (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file8.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-42d367b7-4669-4adf-be02-e4d6ecb40b8a");
        org.junit.Assert.assertNotNull(iTempNaming10);
        org.junit.Assert.assertTrue("'" + version13 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version13.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution14);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file15.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckDir("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        de.flapdoodle.embedmongo.LocalArtifactStore localArtifactStore0 = new de.flapdoodle.embedmongo.LocalArtifactStore();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming4 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig2.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming4);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig2.getDefaultfileNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming6);
        java.lang.String str10 = iTempNaming6.nameFor("osx/mongodb-osx-i386-1.8.0-rc0.tgz", ".embedmongo");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertNotNull(iTempNaming6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo" + "'", str10, "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming0 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        java.lang.String str3 = uUIDTempNaming0.nameFor("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!" + "'", str3, "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_6_5;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_6_5 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_6_5));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        de.flapdoodle.embedmongo.extract.TgzExtractor tgzExtractor0 = new de.flapdoodle.embedmongo.extract.TgzExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming3 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming3);
        de.flapdoodle.embedmongo.distribution.Version version5 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution6 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version5);
        java.io.File file7 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig1, distribution6);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener8 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig1.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener8);
        java.io.File file11 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig12 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str13 = runtimeConfig12.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime14 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version15 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution16 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version15);
        boolean boolean17 = mongoDBRuntime14.checkDistribution(distribution16);
        java.io.File file18 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig12, distribution16);
        java.util.regex.Pattern pattern19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tgzExtractor0.extract(runtimeConfig1, file11, file18, pattern19);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-76673aa7-8747-4a63-9087-ff62b55030e4 (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertTrue("'" + version5 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version5.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertEquals(file11.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file11.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-76673aa7-8747-4a63-9087-ff62b55030e4");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".embedmongo" + "'", str13, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime14);
        org.junit.Assert.assertTrue("'" + version15 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version15.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file18.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-93093fe5-a7cf-4785-b59c-7d29251975dc.TGZ");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        java.lang.Class<?> wildcardClass1 = version0.getClass();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        de.flapdoodle.embedmongo.extract.ZipExtractor zipExtractor0 = new de.flapdoodle.embedmongo.extract.ZipExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = null;
        de.flapdoodle.embedmongo.distribution.Version version2 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig5 = new de.flapdoodle.embedmongo.config.MongodConfig(version2, (int) (short) -1, false);
        java.io.File file6 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable7 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig5, file6);
        java.io.File file9 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable10 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig5, file9);
        boolean boolean11 = de.flapdoodle.embedmongo.Files.forceDelete(file9);
        boolean boolean12 = de.flapdoodle.embedmongo.Files.forceDelete(file9);
        java.io.File file14 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        java.util.regex.Pattern pattern15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipExtractor0.extract(runtimeConfig1, file9, file14, pattern15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file9.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-a35c5ede-66d0-4208-b7ca-5cbbcb53312e");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file14.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-b35b50ee-61d5-4a5f-9cdd-6ee3bd3994bd");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_2_rc0;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_2_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_2_rc0));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.io.File file0 = null;
        boolean boolean1 = de.flapdoodle.embedmongo.Files.forceDelete(file0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.progress("hi!", 0);
        standardConsoleProgressListener0.progress("", (-1));
        standardConsoleProgressListener0.info("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo", ".embedmongo");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.info("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            consoleOneLineProgressListener0.progress("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Percent < 0: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.done("http://fastdl.mongodb.org/");
        consoleOneLineProgressListener0.done("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.info("", "http://fastdl.mongodb.org/");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        boolean boolean0 = de.flapdoodle.embedmongo.runtime.Network.localhostIsIPv6();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        java.io.File file6 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution5);
        java.lang.String str7 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution5);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file6.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongod" + "'", str7, "mongod");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming4);
        java.lang.String str8 = iTempNaming4.nameFor("", "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        java.lang.String str11 = iTempNaming4.nameFor("osx/mongodb-osx-i386-1.8.0-rc0.tgz", "-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str8, "-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz-3aede1fd-1a0c-4766-939a-31860b1cf8c4-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str11, "osx/mongodb-osx-i386-1.8.0-rc0.tgz-3aede1fd-1a0c-4766-939a-31860b1cf8c4-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        de.flapdoodle.embedmongo.extract.UUIDTempNaming uUIDTempNaming0 = new de.flapdoodle.embedmongo.extract.UUIDTempNaming();
        java.lang.String str3 = uUIDTempNaming0.nameFor("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!-52b04879-adbf-4a54-9e56-0ab55a002a54" + "'", str3, "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!-52b04879-adbf-4a54-9e56-0ab55a002a54");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        java.io.File file6 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution5);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener7 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener7);
        standardConsoleProgressListener7.info("-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz", "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file6.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        java.io.File file4 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable5 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file4);
        java.io.File file7 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable8 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file7);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess9 = mongodExecutable8.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-f9828139-f762-4045-8cd0-dfafc58d35bf\": error=13, Permission denied");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file7.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-f9828139-f762-4045-8cd0-dfafc58d35bf");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_4;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_4 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_4));
        org.junit.Assert.assertNotNull(distribution1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 0, true);
        int int4 = mongodConfig3.getPort();
        boolean boolean5 = mongodConfig3.isIpv6();
        de.flapdoodle.embedmongo.distribution.Version version6 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig9 = new de.flapdoodle.embedmongo.config.MongodConfig(version6, (int) (short) -1, false);
        java.io.File file10 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable11 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig9, file10);
        java.io.File file13 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable14 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig9, file13);
        java.io.File file15 = mongodExecutable14.getFile();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess16 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig3, mongodExecutable14);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-fabf9ffa-2a8e-4d5e-abd7-8722653b4d9a\": error=13, Permission denied");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file13.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-fabf9ffa-2a8e-4d5e-abd7-8722653b4d9a");
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file15.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-fabf9ffa-2a8e-4d5e-abd7-8722653b4d9a");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        java.lang.String str2 = de.flapdoodle.embedmongo.Paths.getPath(distribution1);
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType3 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution1);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str2, "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertTrue("'" + archiveType3 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType3.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /Users/yhcrown/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) '4', true);
        de.flapdoodle.embedmongo.distribution.Version version4 = mongodConfig3.getVersion();
        boolean boolean5 = mongodConfig3.isIpv6();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0));
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        java.lang.String str4 = iTempNaming1.nameFor("", "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str4, "-cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        de.flapdoodle.embedmongo.extract.ZipExtractor zipExtractor0 = new de.flapdoodle.embedmongo.extract.ZipExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming3 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming3);
        de.flapdoodle.embedmongo.distribution.Version version5 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution6 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version5);
        java.io.File file7 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig1, distribution6);
        java.io.File file9 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir(".embedmongo");
        java.io.File file10 = null;
        java.util.regex.Pattern pattern11 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipExtractor0.extract(runtimeConfig1, file9, file10, pattern11);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /Users/yhcrown/.embedmongo (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertTrue("'" + version5 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version5.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file7.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file9.toString(), "/Users/yhcrown/.embedmongo");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        java.io.File file4 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable5 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file4);
        java.io.File file7 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable8 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file7);
        java.io.File file9 = mongodExecutable8.getFile();
        boolean boolean10 = de.flapdoodle.embedmongo.Files.forceDelete(file9);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file7.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-1a2fbe56-a93b-4b85-a46e-6c25797796bb");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file9.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-1a2fbe56-a93b-4b85-a46e-6c25797796bb");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        de.flapdoodle.embedmongo.extract.ZipExtractor zipExtractor0 = new de.flapdoodle.embedmongo.extract.ZipExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming3 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming3);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming5 = runtimeConfig1.getDefaultfileNaming();
        java.io.File file7 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        boolean boolean8 = de.flapdoodle.embedmongo.Files.forceDelete(file7);
        java.io.File file9 = null;
        java.util.regex.Pattern pattern10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipExtractor0.extract(runtimeConfig1, file7, file9, pattern10);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-328644c5-d1f0-45cc-9527-692dbfe42540 (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertNotNull(iTempNaming5);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file7.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-328644c5-d1f0-45cc-9527-692dbfe42540");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        java.io.File file4 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable5 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file4);
        java.io.File file7 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable8 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file7);
        java.io.File file9 = mongodExecutable8.getFile();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess10 = mongodExecutable8.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-5d27dbf2-5d1c-40d6-bc53-9a022960f800\": error=13, Permission denied");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file7.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-5d27dbf2-5d1c-40d6-bc53-9a022960f800");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file9.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-5d27dbf2-5d1c-40d6-bc53-9a022960f800");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        de.flapdoodle.embedmongo.distribution.Platform platform0 = de.flapdoodle.embedmongo.distribution.Platform.OS_X;
        org.junit.Assert.assertTrue("'" + platform0 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform0.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempDir("-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz-d43a09f1-43d5-4873-95ec-d4e33aa212da");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version2 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version2);
        de.flapdoodle.embedmongo.distribution.Version version4 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version4, (int) (short) -1, false);
        java.io.File file8 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable9 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig7, file8);
        java.io.File file11 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable12 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig7, file11);
        java.io.File file13 = mongodExecutable12.getFile();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = de.flapdoodle.embedmongo.LocalArtifactStore.store(runtimeConfig0, distribution3, file13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Could not move /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-84a5bc7e-446f-4f59-9bd3-1bc2abdb6202 to /Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version2 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version2.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution3);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertEquals(file11.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file11.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-84a5bc7e-446f-4f59-9bd3-1bc2abdb6202");
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file13.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-84a5bc7e-446f-4f59-9bd3-1bc2abdb6202");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        de.flapdoodle.embedmongo.distribution.Version version4 = mongodConfig3.getVersion();
        int int5 = mongodConfig3.getPort();
        java.lang.String str6 = mongodConfig3.getDatabaseDir();
        org.junit.Assert.assertNull(version4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 0, true);
        int int4 = mongodConfig3.getPort();
        boolean boolean5 = mongodConfig3.isIpv6();
        de.flapdoodle.embedmongo.distribution.Version version6 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig9 = new de.flapdoodle.embedmongo.config.MongodConfig(version6, (int) (short) -1, false);
        java.io.File file10 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable11 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig9, file10);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess12 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig3, mongodExecutable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        de.flapdoodle.embedmongo.extract.TgzExtractor tgzExtractor0 = new de.flapdoodle.embedmongo.extract.TgzExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str2 = runtimeConfig1.getArtifactStorePath();
        java.lang.String str3 = runtimeConfig1.getDownloadPath();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig1.getExecutableNaming();
        java.io.File file6 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        boolean boolean7 = de.flapdoodle.embedmongo.Files.forceDelete(file6);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig8 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str9 = runtimeConfig8.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime10 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version11 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution12 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version11);
        boolean boolean13 = mongoDBRuntime10.checkDistribution(distribution12);
        java.io.File file14 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig8, distribution12);
        boolean boolean15 = de.flapdoodle.embedmongo.Files.moveFile(file6, file14);
        java.io.File file17 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir(".embedmongo");
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tgzExtractor0.extract(runtimeConfig1, file6, file17, pattern18);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-2e258679-ce23-4921-a7cd-9f73ed6a75e9 (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".embedmongo" + "'", str2, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://fastdl.mongodb.org/" + "'", str3, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file6.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-2e258679-ce23-4921-a7cd-9f73ed6a75e9");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".embedmongo" + "'", str9, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime10);
        org.junit.Assert.assertTrue("'" + version11 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version11.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file14.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-c3d863be-c83d-4828-9dd2-e9c4ad16fb32.TGZ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file17.toString(), "/Users/yhcrown/.embedmongo");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_5;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_5 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_5));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.start("http://fastdl.mongodb.org/");
        consoleOneLineProgressListener0.progress("-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz", (int) ' ');
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        de.flapdoodle.embedmongo.extract.ZipExtractor zipExtractor0 = new de.flapdoodle.embedmongo.extract.ZipExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming3 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming3);
        de.flapdoodle.embedmongo.distribution.Version version5 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution6 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version5);
        java.io.File file7 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig1, distribution6);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming8 = runtimeConfig1.getDefaultfileNaming();
        java.io.File file9 = null;
        de.flapdoodle.embedmongo.distribution.Version version10 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig13 = new de.flapdoodle.embedmongo.config.MongodConfig(version10, (int) (short) -1, false);
        java.io.File file14 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable15 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig13, file14);
        java.io.File file17 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable18 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig13, file17);
        java.io.File file19 = mongodExecutable18.getFile();
        java.io.File file21 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir(".embedmongo");
        boolean boolean22 = de.flapdoodle.embedmongo.Files.moveFile(file19, file21);
        java.util.regex.Pattern pattern23 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipExtractor0.extract(runtimeConfig1, file9, file21, pattern23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertTrue("'" + version5 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version5.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution6);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertEquals(file7.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file7.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(iTempNaming8);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file17.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-80da622b-b41e-47b6-863d-6484fcc8d3a6");
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file19.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-80da622b-b41e-47b6-863d-6484fcc8d3a6");
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file21.toString(), "/Users/yhcrown/.embedmongo");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 0, true);
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig8 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 0, false, "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertNotNull(distribution4);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener4 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener4);
        standardConsoleProgressListener4.done("http://fastdl.mongodb.org/");
        standardConsoleProgressListener4.done("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(iTempNaming1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime2 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform4 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize5 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution6 = new de.flapdoodle.embedmongo.distribution.Distribution(version3, platform4, bitSize5);
        de.flapdoodle.embedmongo.distribution.Version version7 = distribution6.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version8 = distribution6.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version9 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig12 = new de.flapdoodle.embedmongo.config.MongodConfig(version9, (int) (short) -1, false);
        java.io.File file13 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable14 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig12, file13);
        java.io.File file16 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable17 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig12, file16);
        java.io.File file18 = mongodExecutable17.getFile();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = de.flapdoodle.embedmongo.LocalArtifactStore.store(runtimeConfig0, distribution6, file18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(mongoDBRuntime2);
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize5 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize5.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version7 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version7.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + version8 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version8.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertEquals(file16.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file16.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-462329d8-52d4-4642-92e1-8ff65e97ced0");
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file18.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-462329d8-52d4-4642-92e1-8ff65e97ced0");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.done("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!-yhcrown-mongod");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.info("", "hi!-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.info("mongod", "-cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform5 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize6 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = new de.flapdoodle.embedmongo.distribution.Distribution(version4, platform5, bitSize6);
        de.flapdoodle.embedmongo.distribution.Version version8 = distribution7.getVersion();
        java.io.File file10 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        boolean boolean11 = de.flapdoodle.embedmongo.Files.forceDelete(file10);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig12 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str13 = runtimeConfig12.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime14 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version15 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution16 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version15);
        boolean boolean17 = mongoDBRuntime14.checkDistribution(distribution16);
        java.io.File file18 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig12, distribution16);
        boolean boolean19 = de.flapdoodle.embedmongo.Files.moveFile(file10, file18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = de.flapdoodle.embedmongo.LocalArtifactStore.store(runtimeConfig0, distribution7, file18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize6 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize6.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version8 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version8.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertEquals(file10.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file10.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-e4b7d409-0567-4e85-9ea4-a8597fcdf55c");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".embedmongo" + "'", str13, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime14);
        org.junit.Assert.assertTrue("'" + version15 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version15.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file18.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-6ab4abe0-a95d-4219-815a-c1b22f227a62.TGZ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_0;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_0));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_1;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_1));
        org.junit.Assert.assertNotNull(distribution1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) '#', false, "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        java.io.File file6 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution5);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig7 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str8 = runtimeConfig7.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime9 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version10 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution11 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version10);
        boolean boolean12 = mongoDBRuntime9.checkDistribution(distribution11);
        java.io.File file13 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig7, distribution11);
        java.lang.String str14 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution11);
        java.io.File file15 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution11);
        runtimeConfig0.setDownloadPath("-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file6.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".embedmongo" + "'", str8, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime9);
        org.junit.Assert.assertTrue("'" + version10 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version10.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file13.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-f8776d81-2021-4181-9d50-9e1442300336.TGZ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongod" + "'", str14, "mongod");
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file15.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        java.lang.String str4 = runtimeConfig0.getArtifactStorePath();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".embedmongo" + "'", str4, ".embedmongo");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.progress("hi!", 0);
        standardConsoleProgressListener0.info("-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo", "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo");
        standardConsoleProgressListener0.info("-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz", ".embedmongo");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.done("-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution2 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version1);
        boolean boolean3 = mongoDBRuntime0.checkDistribution(distribution2);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version4, (int) (short) 0, true);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig11 = new de.flapdoodle.embedmongo.config.MongodConfig(version4, (int) (short) 10, true, "hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable12 = mongoDBRuntime0.prepare(mongodConfig11);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess13 = mongodExecutable12.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/extract-d171841c-0d71-4466-a764-0cf0c2936071mongod\": error=86, Bad CPU type in executable");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertNotNull(mongodExecutable12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        java.io.File file6 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution5);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener7 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener7);
        java.lang.String str9 = runtimeConfig0.getDownloadPath();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file6.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://fastdl.mongodb.org/" + "'", str9, "http://fastdl.mongodb.org/");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempDir("hi!-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz-6eb3633b-03f5-46ab-9574-85df4a39e223");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType0 = de.flapdoodle.embedmongo.distribution.ArchiveType.ZIP;
        org.junit.Assert.assertTrue("'" + archiveType0 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.ZIP + "'", archiveType0.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.ZIP));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        java.io.File file6 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution5);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig7 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str8 = runtimeConfig7.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime9 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version10 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution11 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version10);
        boolean boolean12 = mongoDBRuntime9.checkDistribution(distribution11);
        java.io.File file13 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig7, distribution11);
        java.lang.String str14 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution11);
        java.io.File file15 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution11);
        java.lang.String str16 = runtimeConfig0.getArtifactStorePath();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution5);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file6.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".embedmongo" + "'", str8, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime9);
        org.junit.Assert.assertTrue("'" + version10 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version10.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file13.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-7860060a-6932-429a-aa98-e704775639b9.TGZ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongod" + "'", str14, "mongod");
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file15.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".embedmongo" + "'", str16, ".embedmongo");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener2 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener2.start("");
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener2);
        standardConsoleProgressListener2.progress("hi!-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz", (int) (byte) 100);
        org.junit.Assert.assertNotNull(iTempNaming1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        de.flapdoodle.embedmongo.extract.TgzExtractor tgzExtractor0 = new de.flapdoodle.embedmongo.extract.TgzExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener3 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener3.start("");
        runtimeConfig1.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener3);
        java.lang.String str7 = runtimeConfig1.getDownloadPath();
        java.io.File file9 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        boolean boolean10 = de.flapdoodle.embedmongo.Files.forceDelete(file9);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig11 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str12 = runtimeConfig11.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime13 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version14 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution15 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version14);
        boolean boolean16 = mongoDBRuntime13.checkDistribution(distribution15);
        java.io.File file17 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig11, distribution15);
        boolean boolean18 = de.flapdoodle.embedmongo.Files.moveFile(file9, file17);
        java.io.File file20 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir(".embedmongo");
        java.util.regex.Pattern pattern21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tgzExtractor0.extract(runtimeConfig1, file17, file20, pattern21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://fastdl.mongodb.org/" + "'", str7, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file9.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-ca83a713-ab76-401a-bbee-16d8a56f97c6");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".embedmongo" + "'", str12, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime13);
        org.junit.Assert.assertTrue("'" + version14 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version14.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file17.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-e11ae77c-8bbf-4899-bb00-9b68a839969d.TGZ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(file20);
        org.junit.Assert.assertEquals(file20.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file20.toString(), "/Users/yhcrown/.embedmongo");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        de.flapdoodle.embedmongo.extract.TgzExtractor tgzExtractor0 = new de.flapdoodle.embedmongo.extract.TgzExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str2 = runtimeConfig1.getArtifactStorePath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming5 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig3.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming5);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming7 = runtimeConfig3.getDefaultfileNaming();
        runtimeConfig1.setDefaultfileNaming(iTempNaming7);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming9 = runtimeConfig1.getDefaultfileNaming();
        de.flapdoodle.embedmongo.distribution.Version version10 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig13 = new de.flapdoodle.embedmongo.config.MongodConfig(version10, (int) (short) -1, false);
        java.io.File file14 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable15 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig13, file14);
        java.io.File file17 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable18 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig13, file17);
        java.io.File file19 = mongodExecutable18.getFile();
        java.io.File file21 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir(".embedmongo");
        boolean boolean22 = de.flapdoodle.embedmongo.Files.moveFile(file19, file21);
        de.flapdoodle.embedmongo.distribution.Version version23 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig26 = new de.flapdoodle.embedmongo.config.MongodConfig(version23, (int) (short) -1, false);
        java.io.File file27 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable28 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig26, file27);
        java.io.File file30 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable31 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig26, file30);
        java.io.File file32 = mongodExecutable31.getFile();
        java.util.regex.Pattern pattern33 = null;
        // The following exception was thrown during execution in test generation
        try {
            tgzExtractor0.extract(runtimeConfig1, file19, file32, pattern33);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-1e09dcd1-9911-45a7-b8c8-50954c4237f4 (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".embedmongo" + "'", str2, ".embedmongo");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertNotNull(iTempNaming7);
        org.junit.Assert.assertNotNull(iTempNaming9);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file17.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-1e09dcd1-9911-45a7-b8c8-50954c4237f4");
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertEquals(file19.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file19.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-1e09dcd1-9911-45a7-b8c8-50954c4237f4");
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file21.toString(), "/Users/yhcrown/.embedmongo");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(file30);
        org.junit.Assert.assertEquals(file30.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file30.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-31347cc4-746e-4fdc-9fb1-f854f76cbe8d");
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertEquals(file32.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file32.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-31347cc4-746e-4fdc-9fb1-f854f76cbe8d");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.distribution.Version version4 = distribution3.getVersion();
        de.flapdoodle.embedmongo.distribution.BitSize bitSize5 = distribution3.getBitsize();
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
        org.junit.Assert.assertTrue("'" + bitSize5 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize5.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming4 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig2.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming4);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig2.getDefaultfileNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming6);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig8 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str9 = runtimeConfig8.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime10 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version11 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution12 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version11);
        boolean boolean13 = mongoDBRuntime10.checkDistribution(distribution12);
        java.io.File file14 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig8, distribution12);
        de.flapdoodle.embedmongo.distribution.Platform platform15 = distribution12.getPlatform();
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType16 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution12);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize17 = distribution12.getBitsize();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file18 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution12);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempfile: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-yhcrown-.TGZ");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertNotNull(iTempNaming6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".embedmongo" + "'", str9, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime10);
        org.junit.Assert.assertTrue("'" + version11 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version11.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file14.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-1ffc6f8a-7ad8-422b-ae69-8a65244378ef.TGZ");
        org.junit.Assert.assertTrue("'" + platform15 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform15.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertTrue("'" + archiveType16 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType16.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
        org.junit.Assert.assertTrue("'" + bitSize17 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize17.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.start("http://fastdl.mongodb.org/");
        standardConsoleProgressListener0.info("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!", ".embedmongo");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime2 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str4 = runtimeConfig3.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime5 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        boolean boolean8 = mongoDBRuntime5.checkDistribution(distribution7);
        java.io.File file9 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig3, distribution7);
        de.flapdoodle.embedmongo.distribution.Platform platform10 = distribution7.getPlatform();
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType11 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution7);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize12 = distribution7.getBitsize();
        java.io.File file13 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution7);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(mongoDBRuntime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".embedmongo" + "'", str4, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime5);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file9.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-ab8cc16b-69ce-438f-97f0-14038fdc512e.TGZ");
        org.junit.Assert.assertTrue("'" + platform10 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform10.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertTrue("'" + archiveType11 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType11.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
        org.junit.Assert.assertTrue("'" + bitSize12 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize12.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file13.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempDir("hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz-c41f7333-f981-4354-8d03-520933e908d1");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (-1), true, "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!-yhcrown-mongod");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution2 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version1);
        boolean boolean3 = mongoDBRuntime0.checkDistribution(distribution2);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version4, (int) (short) 0, true);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig11 = new de.flapdoodle.embedmongo.config.MongodConfig(version4, (int) (short) 10, true, "hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable12 = mongoDBRuntime0.prepare(mongodConfig11);
        de.flapdoodle.embedmongo.distribution.Version version13 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform14 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize15 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution16 = new de.flapdoodle.embedmongo.distribution.Distribution(version13, platform14, bitSize15);
        de.flapdoodle.embedmongo.distribution.Version version17 = distribution16.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version18 = distribution16.getVersion();
        de.flapdoodle.embedmongo.distribution.Platform platform19 = distribution16.getPlatform();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = mongoDBRuntime0.checkDistribution(distribution16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertNotNull(mongodExecutable12);
        org.junit.Assert.assertTrue("'" + version13 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version13.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize15 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize15.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version17 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version17.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + version18 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version18.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertNull(platform19);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.distribution.Platform platform5 = distribution4.getPlatform();
        de.flapdoodle.embedmongo.distribution.Version version6 = distribution4.getVersion();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(distribution4);
        org.junit.Assert.assertTrue("'" + platform5 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform5.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempDir("-cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/-cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz-f721f03e-01c0-436c-918c-a73d6d5d7fb8");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version2 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version2);
        java.io.File file4 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution3);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime5 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        runtimeConfig0.setDownloadPath("");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version2 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version2.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file4.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(mongoDBRuntime5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempDir("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!-yhcrown-mongod");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!-yhcrown-mongod-3fb41436-1f31-408a-bdef-c56dd5a58718");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = null;
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime1 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        org.junit.Assert.assertNotNull(mongoDBRuntime1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener2 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener2.start("");
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener2);
        java.lang.String str6 = runtimeConfig0.getDownloadPath();
        java.lang.String str7 = runtimeConfig0.getDownloadPath();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://fastdl.mongodb.org/" + "'", str6, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://fastdl.mongodb.org/" + "'", str7, "http://fastdl.mongodb.org/");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempFile("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) '4', true);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 0, false, "");
        java.lang.String str8 = mongodConfig7.getDatabaseDir();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime2 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version3);
        boolean boolean5 = mongoDBRuntime2.checkDistribution(distribution4);
        java.io.File file6 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution4);
        java.lang.String str7 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution4);
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType8 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime2);
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file6.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-5c299897-e0dc-4de2-b17c-455da485946a.TGZ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongod" + "'", str7, "mongod");
        org.junit.Assert.assertTrue("'" + archiveType8 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType8.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming0 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        java.lang.String str3 = userTempNaming0.nameFor("hi!", "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        java.lang.String str6 = userTempNaming0.nameFor("", "hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str3, "hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-yhcrown-hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str6, "-yhcrown-hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        de.flapdoodle.embedmongo.extract.ZipExtractor zipExtractor0 = new de.flapdoodle.embedmongo.extract.ZipExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version3);
        java.io.File file5 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig1, distribution4);
        java.io.File file7 = de.flapdoodle.embedmongo.Files.createOrCheckDir("hi!");
        de.flapdoodle.embedmongo.distribution.Version version8 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig11 = new de.flapdoodle.embedmongo.config.MongodConfig(version8, (int) (short) -1, false);
        java.io.File file12 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable13 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig11, file12);
        java.io.File file15 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable16 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig11, file15);
        boolean boolean17 = de.flapdoodle.embedmongo.Files.forceDelete(file15);
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipExtractor0.extract(runtimeConfig1, file7, file15, pattern18);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution4);
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file5.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "hi!");
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file15.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-779c02a4-030b-4afd-9b3b-f45e7f6073f5");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        java.io.InputStream inputStream0 = null;
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming4 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig2.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig2, distribution7);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.Files.write(inputStream0, (long) (byte) 0, file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file8.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform4 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize5 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution6 = new de.flapdoodle.embedmongo.distribution.Distribution(version3, platform4, bitSize5);
        de.flapdoodle.embedmongo.distribution.Version version7 = distribution6.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version8 = distribution6.getVersion();
        de.flapdoodle.embedmongo.distribution.Platform platform9 = distribution6.getPlatform();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file10 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize5 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize5.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version7 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version7.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + version8 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version8.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertNull(platform9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 0, true);
        int int4 = mongodConfig3.getPort();
        de.flapdoodle.embedmongo.distribution.Version version5 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig8 = new de.flapdoodle.embedmongo.config.MongodConfig(version5, (int) (short) -1, false);
        java.io.File file9 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable10 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig8, file9);
        java.io.File file12 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable13 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig8, file12);
        java.io.File file14 = mongodExecutable13.getFile();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess15 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig3, mongodExecutable13);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-88a6ff3e-5f77-4d59-a381-768c32c8956f\": error=13, Permission denied");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertEquals(file12.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file12.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-88a6ff3e-5f77-4d59-a381-768c32c8956f");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file14.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-88a6ff3e-5f77-4d59-a381-768c32c8956f");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig6 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, true);
        de.flapdoodle.embedmongo.distribution.Version version7 = mongodConfig6.getVersion();
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig11 = new de.flapdoodle.embedmongo.config.MongodConfig(version7, (-1), false, "hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version7 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version7.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime2 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform4 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize5 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution6 = new de.flapdoodle.embedmongo.distribution.Distribution(version3, platform4, bitSize5);
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version3);
        boolean boolean8 = de.flapdoodle.embedmongo.LocalArtifactStore.checkArtifact(runtimeConfig0, distribution7);
        runtimeConfig0.setDownloadPath("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        runtimeConfig0.setDownloadPath("-yhcrown-hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(mongoDBRuntime2);
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize5 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize5.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) '4', true);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig6 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) 'a', true);
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig11 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 0, true, "mongod");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0));
        org.junit.Assert.assertNotNull(distribution7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime2 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version3);
        boolean boolean5 = mongoDBRuntime2.checkDistribution(distribution4);
        java.io.File file6 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution4);
        de.flapdoodle.embedmongo.distribution.Platform platform7 = distribution4.getPlatform();
        java.lang.String str8 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution4);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize9 = distribution4.getBitsize();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime2);
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file6.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-b1b4248c-b462-4ddf-8f77-3a3291e5c4c8.TGZ");
        org.junit.Assert.assertTrue("'" + platform7 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform7.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongod" + "'", str8, "mongod");
        org.junit.Assert.assertTrue("'" + bitSize9 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize9.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener3 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener3.start("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) consoleOneLineProgressListener3);
        consoleOneLineProgressListener3.done("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime2 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version3);
        boolean boolean5 = mongoDBRuntime2.checkDistribution(distribution4);
        java.io.File file6 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution4);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize7 = distribution4.getBitsize();
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType8 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime2);
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file6.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-5680db4e-a163-48fc-b0a9-aa65337ddd39.TGZ");
        org.junit.Assert.assertTrue("'" + bitSize7 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize7.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + archiveType8 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType8.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig6 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, true);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig7 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str8 = runtimeConfig7.getArtifactStorePath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig9 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming10 = runtimeConfig9.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming11 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig9.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming11);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming13 = runtimeConfig9.getDefaultfileNaming();
        runtimeConfig7.setDefaultfileNaming(iTempNaming13);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime15 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version16 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution17 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version16);
        boolean boolean18 = mongoDBRuntime15.checkDistribution(distribution17);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize19 = distribution17.getBitsize();
        java.io.File file20 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig7, distribution17);
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable21 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig6, file20);
        java.io.File file22 = mongodExecutable21.getFile();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".embedmongo" + "'", str8, ".embedmongo");
        org.junit.Assert.assertNotNull(iTempNaming10);
        org.junit.Assert.assertNotNull(iTempNaming13);
        org.junit.Assert.assertNotNull(mongoDBRuntime15);
        org.junit.Assert.assertTrue("'" + version16 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version16.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + bitSize19 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize19.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(file20);
        org.junit.Assert.assertEquals(file20.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file20.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file22.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.done("");
        // The following exception was thrown during execution in test generation
        try {
            consoleOneLineProgressListener0.progress("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!-52b04879-adbf-4a54-9e56-0ab55a002a54", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        java.io.File file4 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable5 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file4);
        java.lang.String str6 = mongodConfig3.getDatabaseDir();
        int int7 = mongodConfig3.getPort();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /Users/yhcrown/osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.done("http://fastdl.mongodb.org/");
        consoleOneLineProgressListener0.done("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.info("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz", "");
        consoleOneLineProgressListener0.start("hi!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming4 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig2.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming4);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig2.getDefaultfileNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming6);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime8 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version9 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution10 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version9);
        boolean boolean11 = mongoDBRuntime8.checkDistribution(distribution10);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize12 = distribution10.getBitsize();
        java.io.File file13 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution10);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime14 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Version version15 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution16 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version15);
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType17 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution16);
        boolean boolean18 = mongoDBRuntime14.checkDistribution(distribution16);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertNotNull(iTempNaming6);
        org.junit.Assert.assertNotNull(mongoDBRuntime8);
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + bitSize12 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize12.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file13.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(mongoDBRuntime14);
        org.junit.Assert.assertTrue("'" + version15 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version15.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution16);
        org.junit.Assert.assertTrue("'" + archiveType17 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType17.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        java.lang.String str6 = userTempNaming2.nameFor("hi!", "-4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        java.lang.String str9 = userTempNaming2.nameFor("hi!", "");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str6, "hi!-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!-yhcrown-" + "'", str9, "hi!-yhcrown-");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.io.InputStream inputStream0 = null;
        java.io.File file3 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.Files.write(inputStream0, (long) 100, file3);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-00ad072a-8ef8-4b8d-b98d-55d9f6dcbe4d (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file3.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-00ad072a-8ef8-4b8d-b98d-55d9f6dcbe4d");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_0_4;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 1, true);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform5 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize6 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = new de.flapdoodle.embedmongo.distribution.Distribution(version4, platform5, bitSize6);
        de.flapdoodle.embedmongo.distribution.Distribution distribution8 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        de.flapdoodle.embedmongo.distribution.Platform platform9 = distribution8.getPlatform();
        de.flapdoodle.embedmongo.distribution.BitSize bitSize10 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution11 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform9, bitSize10);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_0_4 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_0_4));
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize6 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize6.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(distribution8);
        org.junit.Assert.assertTrue("'" + platform9 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform9.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertTrue("'" + bitSize10 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize10.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.info("hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz", "hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) '4', true);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig6 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) 'a', true);
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        java.lang.String str8 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution7);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize9 = distribution7.getBitsize();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongod" + "'", str8, "mongod");
        org.junit.Assert.assertTrue("'" + bitSize9 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize9.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) '4', true);
        de.flapdoodle.embedmongo.distribution.Version version4 = mongodConfig3.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version5 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig8 = new de.flapdoodle.embedmongo.config.MongodConfig(version5, (int) (short) -1, false);
        java.io.File file9 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable10 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig8, file9);
        java.io.File file11 = mongodExecutable10.getFile();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess12 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig3, mongodExecutable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0));
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0));
        org.junit.Assert.assertNull(file11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.io.File file0 = null;
        java.io.File file2 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        boolean boolean3 = de.flapdoodle.embedmongo.Files.forceDelete(file2);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig4 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str5 = runtimeConfig4.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime6 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version7 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution8 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version7);
        boolean boolean9 = mongoDBRuntime6.checkDistribution(distribution8);
        java.io.File file10 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig4, distribution8);
        boolean boolean11 = de.flapdoodle.embedmongo.Files.moveFile(file2, file10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = de.flapdoodle.embedmongo.Files.moveFile(file0, file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file2.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-957a7b23-8861-4f83-9bca-9a679fe8d3b4");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".embedmongo" + "'", str5, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime6);
        org.junit.Assert.assertTrue("'" + version7 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version7.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertEquals(file10.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file10.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-a35fcaed-fe6d-496b-ab6e-25bead9828a9.TGZ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) '4', true);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig6 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) 'a', true);
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        java.lang.String str8 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution7);
        de.flapdoodle.embedmongo.distribution.Version version9 = distribution7.getVersion();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongod" + "'", str8, "mongod");
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming4 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig2.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming4);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig2.getDefaultfileNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming6);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime8 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version9 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution10 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version9);
        boolean boolean11 = mongoDBRuntime8.checkDistribution(distribution10);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize12 = distribution10.getBitsize();
        java.io.File file13 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution10);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener14 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener14.progress("hi!", 0);
        standardConsoleProgressListener14.info("-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo", "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo");
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener14);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertNotNull(iTempNaming6);
        org.junit.Assert.assertNotNull(mongoDBRuntime8);
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + bitSize12 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize12.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file13.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("hi!-yhcrown-");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertEquals(file1.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file1.toString(), "/Users/yhcrown/hi!-yhcrown-");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming4 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig2.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming4);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig2.getDefaultfileNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming6);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming8 = runtimeConfig0.getExecutableNaming();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertNotNull(iTempNaming6);
        org.junit.Assert.assertNotNull(iTempNaming8);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        de.flapdoodle.embedmongo.distribution.Version version0 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, false);
        java.lang.String str4 = mongodConfig3.getDatabaseDir();
        de.flapdoodle.embedmongo.distribution.Version version5 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform6 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize7 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution8 = new de.flapdoodle.embedmongo.distribution.Distribution(version5, platform6, bitSize7);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig11 = new de.flapdoodle.embedmongo.config.MongodConfig(version5, (int) (short) -1, true);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig12 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str13 = runtimeConfig12.getArtifactStorePath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig14 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming15 = runtimeConfig14.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming16 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig14.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming16);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming18 = runtimeConfig14.getDefaultfileNaming();
        runtimeConfig12.setDefaultfileNaming(iTempNaming18);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime20 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version21 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution22 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version21);
        boolean boolean23 = mongoDBRuntime20.checkDistribution(distribution22);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize24 = distribution22.getBitsize();
        java.io.File file25 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig12, distribution22);
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable26 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig11, file25);
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable27 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig3, file25);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess28 = mongodExecutable27.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz\": error=13, Permission denied");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + version5 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version5.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize7 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize7.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".embedmongo" + "'", str13, ".embedmongo");
        org.junit.Assert.assertNotNull(iTempNaming15);
        org.junit.Assert.assertNotNull(iTempNaming18);
        org.junit.Assert.assertNotNull(mongoDBRuntime20);
        org.junit.Assert.assertTrue("'" + version21 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version21.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + bitSize24 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize24.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertEquals(file25.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file25.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig8 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (byte) -1, true, "");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(distribution4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming4 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig2.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming4);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig2.getDefaultfileNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming6);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime8 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version9 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution10 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version9);
        boolean boolean11 = mongoDBRuntime8.checkDistribution(distribution10);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize12 = distribution10.getBitsize();
        java.io.File file13 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution10);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime14 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming15 = runtimeConfig0.getDefaultfileNaming();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertNotNull(iTempNaming6);
        org.junit.Assert.assertNotNull(mongoDBRuntime8);
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + bitSize12 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize12.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file13.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(mongoDBRuntime14);
        org.junit.Assert.assertNotNull(iTempNaming15);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        de.flapdoodle.embedmongo.extract.ZipExtractor zipExtractor0 = new de.flapdoodle.embedmongo.extract.ZipExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming3 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming3);
        de.flapdoodle.embedmongo.distribution.Version version5 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig8 = new de.flapdoodle.embedmongo.config.MongodConfig(version5, (int) (short) -1, false);
        java.io.File file9 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable10 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig8, file9);
        java.io.File file12 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable13 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig8, file12);
        boolean boolean14 = de.flapdoodle.embedmongo.Files.forceDelete(file12);
        boolean boolean15 = de.flapdoodle.embedmongo.Files.forceDelete(file12);
        de.flapdoodle.embedmongo.distribution.Version version16 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig19 = new de.flapdoodle.embedmongo.config.MongodConfig(version16, (int) (short) -1, false);
        java.io.File file20 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable21 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig19, file20);
        java.io.File file23 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable24 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig19, file23);
        de.flapdoodle.embedmongo.distribution.Version version25 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution26 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version25);
        java.util.regex.Pattern pattern27 = de.flapdoodle.embedmongo.Paths.getMongodExecutablePattern(distribution26);
        // The following exception was thrown during execution in test generation
        try {
            zipExtractor0.extract(runtimeConfig1, file12, file23, pattern27);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-dc507329-a6ba-4de9-b093-c5aeb2fceecb (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertEquals(file12.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file12.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-dc507329-a6ba-4de9-b093-c5aeb2fceecb");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file23.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-8a8bdbef-d12b-4578-a5cb-99dd6bfb6a26");
        org.junit.Assert.assertTrue("'" + version25 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version25.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution26);
        org.junit.Assert.assertNotNull(pattern27);
        org.junit.Assert.assertEquals(pattern27.toString(), ".*mongod");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.io.InputStream inputStream0 = null;
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming4 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig2.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig2, distribution7);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.Files.write(inputStream0, (long) '4', file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file8.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming0 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        java.lang.String str3 = userTempNaming0.nameFor("-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz", "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo");
        java.lang.String str6 = userTempNaming0.nameFor("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!", "mongod");
        java.lang.String str9 = userTempNaming0.nameFor("-4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz", "-yhcrown-hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo" + "'", str3, "-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!-yhcrown-mongod" + "'", str6, "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!-yhcrown-mongod");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown--yhcrown-hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str9, "-4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown--yhcrown-hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        de.flapdoodle.embedmongo.extract.TgzExtractor tgzExtractor0 = new de.flapdoodle.embedmongo.extract.TgzExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener3 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener3.start("");
        runtimeConfig1.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener3);
        java.lang.String str7 = runtimeConfig1.getDownloadPath();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming8 = runtimeConfig1.getDefaultfileNaming();
        de.flapdoodle.embedmongo.distribution.Version version9 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig12 = new de.flapdoodle.embedmongo.config.MongodConfig(version9, (int) (short) -1, false);
        java.io.File file13 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable14 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig12, file13);
        java.io.File file16 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable17 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig12, file16);
        boolean boolean18 = de.flapdoodle.embedmongo.Files.forceDelete(file16);
        boolean boolean19 = de.flapdoodle.embedmongo.Files.forceDelete(file16);
        de.flapdoodle.embedmongo.distribution.Version version20 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform21 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize22 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution23 = new de.flapdoodle.embedmongo.distribution.Distribution(version20, platform21, bitSize22);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig26 = new de.flapdoodle.embedmongo.config.MongodConfig(version20, (int) (short) -1, true);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig27 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str28 = runtimeConfig27.getArtifactStorePath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig29 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming30 = runtimeConfig29.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming31 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig29.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming31);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming33 = runtimeConfig29.getDefaultfileNaming();
        runtimeConfig27.setDefaultfileNaming(iTempNaming33);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime35 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version36 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution37 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version36);
        boolean boolean38 = mongoDBRuntime35.checkDistribution(distribution37);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize39 = distribution37.getBitsize();
        java.io.File file40 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig27, distribution37);
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable41 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig26, file40);
        boolean boolean42 = de.flapdoodle.embedmongo.Files.forceDelete(file40);
        de.flapdoodle.embedmongo.distribution.Version version43 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution44 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version43);
        java.util.regex.Pattern pattern45 = de.flapdoodle.embedmongo.Paths.getMongodExecutablePattern(distribution44);
        // The following exception was thrown during execution in test generation
        try {
            tgzExtractor0.extract(runtimeConfig1, file16, file40, pattern45);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-e3fbb0ed-ad3f-416b-99f8-311b7e515593 (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://fastdl.mongodb.org/" + "'", str7, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming8);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertEquals(file16.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file16.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-e3fbb0ed-ad3f-416b-99f8-311b7e515593");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + version20 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version20.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize22 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize22.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ".embedmongo" + "'", str28, ".embedmongo");
        org.junit.Assert.assertNotNull(iTempNaming30);
        org.junit.Assert.assertNotNull(iTempNaming33);
        org.junit.Assert.assertNotNull(mongoDBRuntime35);
        org.junit.Assert.assertTrue("'" + version36 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version36.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + bitSize39 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize39.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(file40);
        org.junit.Assert.assertEquals(file40.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file40.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + version43 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version43.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution44);
        org.junit.Assert.assertNotNull(pattern45);
        org.junit.Assert.assertEquals(pattern45.toString(), ".*mongod");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution2 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version1);
        boolean boolean3 = mongoDBRuntime0.checkDistribution(distribution2);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version4, (int) (short) 0, true);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig11 = new de.flapdoodle.embedmongo.config.MongodConfig(version4, (int) (short) 10, true, "hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable12 = mongoDBRuntime0.prepare(mongodConfig11);
        java.io.File file13 = mongodExecutable12.getFile();
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertNotNull(mongodExecutable12);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertEquals(file13.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file13.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/extract-8d189335-70ad-4aab-9a1d-2ba6bcd66d0bmongod");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.info("hi!", "hi!");
        consoleOneLineProgressListener0.done("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.start("-4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.done(".embedmongo");
        consoleOneLineProgressListener0.done("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform2 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize3 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = new de.flapdoodle.embedmongo.distribution.Distribution(version1, platform2, bitSize3);
        de.flapdoodle.embedmongo.distribution.Version version5 = distribution4.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version6 = distribution4.getVersion();
        de.flapdoodle.embedmongo.distribution.Platform platform7 = distribution4.getPlatform();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = mongoDBRuntime0.checkDistribution(distribution4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize3 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize3.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version5 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version5.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertNull(platform7);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener3 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener3.start("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) consoleOneLineProgressListener3);
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming7 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        java.lang.String str10 = userTempNaming7.nameFor("-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz", "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo");
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming7);
        java.lang.String str14 = userTempNaming7.nameFor("-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz", "-cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo" + "'", str10, "-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown--cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str14, "-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown--cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming4 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig2.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming4);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig2.getDefaultfileNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming6);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming8 = runtimeConfig0.getDefaultfileNaming();
        java.lang.String str9 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.output.IProgressListener iProgressListener10 = runtimeConfig0.getProgressListener();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertNotNull(iTempNaming6);
        org.junit.Assert.assertNotNull(iTempNaming8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://fastdl.mongodb.org/" + "'", str9, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iProgressListener10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime2 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version3);
        boolean boolean5 = mongoDBRuntime2.checkDistribution(distribution4);
        java.io.File file6 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution4);
        java.lang.String str7 = de.flapdoodle.embedmongo.Paths.getPath(distribution4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime2);
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file6.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-99322366-5f74-4855-990a-340c01f4e0e1.TGZ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str7, "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.done("http://fastdl.mongodb.org/");
        consoleOneLineProgressListener0.done("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!-yhcrown-mongod");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = null;
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version1, (int) (short) 0, true);
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version1);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform7 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize8 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution9 = new de.flapdoodle.embedmongo.distribution.Distribution(version6, platform7, bitSize8);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig12 = new de.flapdoodle.embedmongo.config.MongodConfig(version6, (int) (short) -1, true);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig13 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str14 = runtimeConfig13.getArtifactStorePath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig15 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming16 = runtimeConfig15.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming17 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig15.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming17);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming19 = runtimeConfig15.getDefaultfileNaming();
        runtimeConfig13.setDefaultfileNaming(iTempNaming19);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime21 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version22 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution23 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version22);
        boolean boolean24 = mongoDBRuntime21.checkDistribution(distribution23);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize25 = distribution23.getBitsize();
        java.io.File file26 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig13, distribution23);
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable27 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig12, file26);
        boolean boolean28 = de.flapdoodle.embedmongo.Files.forceDelete(file26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = de.flapdoodle.embedmongo.LocalArtifactStore.store(runtimeConfig0, distribution5, file26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertNotNull(distribution5);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize8 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize8.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ".embedmongo" + "'", str14, ".embedmongo");
        org.junit.Assert.assertNotNull(iTempNaming16);
        org.junit.Assert.assertNotNull(iTempNaming19);
        org.junit.Assert.assertNotNull(mongoDBRuntime21);
        org.junit.Assert.assertTrue("'" + version22 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version22.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + bitSize25 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize25.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(file26);
        org.junit.Assert.assertEquals(file26.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file26.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempFile("hi!");
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertEquals(file1.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file1.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 0, true);
        boolean boolean4 = mongodConfig3.isIpv6();
        int int5 = mongodConfig3.getPort();
        de.flapdoodle.embedmongo.distribution.Version version6 = mongodConfig3.getVersion();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.distribution.Version version2 = de.flapdoodle.embedmongo.distribution.Version.V2_1_0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version2);
        de.flapdoodle.embedmongo.distribution.Platform platform4 = distribution3.getPlatform();
        de.flapdoodle.embedmongo.distribution.BitSize bitSize5 = de.flapdoodle.embedmongo.distribution.BitSize.B64;
        de.flapdoodle.embedmongo.distribution.Distribution distribution6 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform4, bitSize5);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertTrue("'" + version2 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1_0 + "'", version2.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1_0));
        org.junit.Assert.assertNotNull(distribution3);
        org.junit.Assert.assertTrue("'" + platform4 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform4.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertTrue("'" + bitSize5 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B64 + "'", bitSize5.equals(de.flapdoodle.embedmongo.distribution.BitSize.B64));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.info("hi!", "hi!");
        consoleOneLineProgressListener0.done("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.start("-4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        // The following exception was thrown during execution in test generation
        try {
            consoleOneLineProgressListener0.progress("-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown--cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
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
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        java.io.File file6 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution5);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming7 = runtimeConfig0.getDefaultfileNaming();
        runtimeConfig0.setDownloadPath("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNotNull(iTempNaming7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        java.io.File file6 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution5);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig7 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str8 = runtimeConfig7.getArtifactStorePath();
        java.lang.String str9 = runtimeConfig7.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig10 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming11 = runtimeConfig10.getExecutableNaming();
        runtimeConfig7.setDefaultfileNaming(iTempNaming11);
        java.lang.String str15 = iTempNaming11.nameFor("", "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        runtimeConfig0.setDefaultfileNaming(iTempNaming11);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig17 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str18 = runtimeConfig17.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime19 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version20 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution21 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version20);
        boolean boolean22 = mongoDBRuntime19.checkDistribution(distribution21);
        java.io.File file23 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig17, distribution21);
        java.lang.String str24 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution21);
        java.lang.String str25 = de.flapdoodle.embedmongo.Paths.getMongodExecutable(distribution21);
        java.lang.String str26 = de.flapdoodle.embedmongo.Downloader.getDownloadUrl(runtimeConfig0, distribution21);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ".embedmongo" + "'", str8, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://fastdl.mongodb.org/" + "'", str9, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-b48b4d8a-d291-45f5-bc0e-be6a3804acf6osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str15, "-b48b4d8a-d291-45f5-bc0e-be6a3804acf6osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".embedmongo" + "'", str18, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime19);
        org.junit.Assert.assertTrue("'" + version20 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version20.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertEquals(file23.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file23.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-d209215b-e817-4990-bf4e-5706d624ccc8.TGZ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "mongod" + "'", str24, "mongod");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "mongod" + "'", str25, "mongod");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str26, "http://fastdl.mongodb.org/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime0 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution2 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version1);
        boolean boolean3 = mongoDBRuntime0.checkDistribution(distribution2);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform5 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize6 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = new de.flapdoodle.embedmongo.distribution.Distribution(version4, platform5, bitSize6);
        de.flapdoodle.embedmongo.distribution.Version version8 = distribution7.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version9 = distribution7.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = mongoDBRuntime0.checkDistribution(distribution7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoDBRuntime0);
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize6 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize6.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version8 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version8.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.start("http://fastdl.mongodb.org/");
        consoleOneLineProgressListener0.start("-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo");
        consoleOneLineProgressListener0.done(".embedmongo");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime2 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version3);
        boolean boolean5 = mongoDBRuntime2.checkDistribution(distribution4);
        java.io.File file6 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution4);
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType7 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime2);
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file6.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-db1dc0a0-e1d4-4e5c-a1f5-dd2fc33a21e9.TGZ");
        org.junit.Assert.assertTrue("'" + archiveType7 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType7.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime2 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version3);
        boolean boolean5 = mongoDBRuntime2.checkDistribution(distribution4);
        java.io.File file6 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution4);
        de.flapdoodle.embedmongo.distribution.Platform platform7 = distribution4.getPlatform();
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType8 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution4);
        de.flapdoodle.embedmongo.extract.IExtractor iExtractor9 = de.flapdoodle.embedmongo.extract.Extractors.getExtractor(distribution4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime2);
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertEquals(file6.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file6.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-12e14439-7f2c-4c55-9067-b8f736d459d0.TGZ");
        org.junit.Assert.assertTrue("'" + platform7 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform7.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertTrue("'" + archiveType8 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType8.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
        org.junit.Assert.assertNotNull(iExtractor9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        de.flapdoodle.embedmongo.extract.TgzExtractor tgzExtractor0 = new de.flapdoodle.embedmongo.extract.TgzExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime3 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig1);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform5 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize6 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = new de.flapdoodle.embedmongo.distribution.Distribution(version4, platform5, bitSize6);
        de.flapdoodle.embedmongo.distribution.Distribution distribution8 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        boolean boolean9 = de.flapdoodle.embedmongo.LocalArtifactStore.checkArtifact(runtimeConfig1, distribution8);
        runtimeConfig1.setDownloadPath("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig12 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str13 = runtimeConfig12.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime14 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version15 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution16 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version15);
        boolean boolean17 = mongoDBRuntime14.checkDistribution(distribution16);
        java.io.File file18 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig12, distribution16);
        de.flapdoodle.embedmongo.distribution.Platform platform19 = distribution16.getPlatform();
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType20 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution16);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize21 = distribution16.getBitsize();
        java.io.File file22 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig1, distribution16);
        java.io.File file24 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        java.io.File file25 = null;
        de.flapdoodle.embedmongo.distribution.Version version26 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution27 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version26);
        java.util.regex.Pattern pattern28 = de.flapdoodle.embedmongo.Paths.getMongodExecutablePattern(distribution27);
        // The following exception was thrown during execution in test generation
        try {
            tgzExtractor0.extract(runtimeConfig1, file24, file25, pattern28);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-1012576a-31fb-4a7d-9e04-a874591a89e1 (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertNotNull(mongoDBRuntime3);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize6 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize6.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(distribution8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ".embedmongo" + "'", str13, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime14);
        org.junit.Assert.assertTrue("'" + version15 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version15.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file18.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-06a419fa-8e1d-4df9-ba12-846bd6267353.TGZ");
        org.junit.Assert.assertTrue("'" + platform19 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform19.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertTrue("'" + archiveType20 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType20.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
        org.junit.Assert.assertTrue("'" + bitSize21 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize21.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertEquals(file22.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file22.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertEquals(file24.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file24.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-1012576a-31fb-4a7d-9e04-a874591a89e1");
        org.junit.Assert.assertTrue("'" + version26 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version26.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution27);
        org.junit.Assert.assertNotNull(pattern28);
        org.junit.Assert.assertEquals(pattern28.toString(), ".*mongod");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.done("http://fastdl.mongodb.org/");
        consoleOneLineProgressListener0.done("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.start("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!-yhcrown-mongod");
        // The following exception was thrown during execution in test generation
        try {
            consoleOneLineProgressListener0.progress("-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown--cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_7_6;
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_7_6 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_7_6));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.distribution.Version version4 = distribution3.getVersion();
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version4, (int) (short) 1, true);
        de.flapdoodle.embedmongo.distribution.Version version8 = mongodConfig7.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version9 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform10 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize11 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution12 = new de.flapdoodle.embedmongo.distribution.Distribution(version9, platform10, bitSize11);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig15 = new de.flapdoodle.embedmongo.config.MongodConfig(version9, (int) (short) -1, true);
        java.lang.String str16 = mongodConfig15.getDatabaseDir();
        java.io.File file18 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("mongod");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable19 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig15, file18);
        mongodExecutable19.cleanup();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess21 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig7, mongodExecutable19);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/Users/yhcrown/mongod\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + version8 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version8.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize11 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize11.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertEquals(file18.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file18.toString(), "/Users/yhcrown/mongod");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.done("");
        consoleOneLineProgressListener0.start(".embedmongo");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime2 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig6 = new de.flapdoodle.embedmongo.config.MongodConfig(version3, (int) '4', true);
        de.flapdoodle.embedmongo.distribution.Version version7 = mongodConfig6.getVersion();
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable8 = mongoDBRuntime2.prepare(mongodConfig6);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess9 = mongodExecutable8.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/extract-15687552-369f-44e5-a42a-d4f13ee9557cmongod\": error=86, Bad CPU type in executable");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(mongoDBRuntime2);
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0));
        org.junit.Assert.assertTrue("'" + version7 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0 + "'", version7.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0));
        org.junit.Assert.assertNotNull(mongodExecutable8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version2 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version2);
        java.io.File file4 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution3);
        de.flapdoodle.embedmongo.distribution.Platform platform5 = distribution3.getPlatform();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version2 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version2.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution3);
        org.junit.Assert.assertNotNull(file4);
        org.junit.Assert.assertEquals(file4.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file4.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertTrue("'" + platform5 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform5.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.done("http://fastdl.mongodb.org/");
        consoleOneLineProgressListener0.done("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.info("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz", "");
        consoleOneLineProgressListener0.done("");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime2 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform4 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize5 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution6 = new de.flapdoodle.embedmongo.distribution.Distribution(version3, platform4, bitSize5);
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version3);
        boolean boolean8 = de.flapdoodle.embedmongo.LocalArtifactStore.checkArtifact(runtimeConfig0, distribution7);
        runtimeConfig0.setDownloadPath("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig11 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str12 = runtimeConfig11.getArtifactStorePath();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime13 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version14 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution15 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version14);
        boolean boolean16 = mongoDBRuntime13.checkDistribution(distribution15);
        java.io.File file17 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig11, distribution15);
        de.flapdoodle.embedmongo.distribution.Platform platform18 = distribution15.getPlatform();
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType19 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution15);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize20 = distribution15.getBitsize();
        java.io.File file21 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution15);
        java.io.File file23 = de.flapdoodle.embedmongo.Files.createOrCheckDir("hi!");
        java.io.File file25 = de.flapdoodle.embedmongo.Files.createOrCheckDir("hi!");
        boolean boolean26 = de.flapdoodle.embedmongo.Files.moveFile(file23, file25);
        boolean boolean27 = de.flapdoodle.embedmongo.Files.moveFile(file21, file23);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(mongoDBRuntime2);
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize5 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize5.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".embedmongo" + "'", str12, ".embedmongo");
        org.junit.Assert.assertNotNull(mongoDBRuntime13);
        org.junit.Assert.assertTrue("'" + version14 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version14.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file17.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-e0b2b61d-77e9-4128-9176-6f6bdb605527.TGZ");
        org.junit.Assert.assertTrue("'" + platform18 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform18.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertTrue("'" + archiveType19 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType19.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
        org.junit.Assert.assertTrue("'" + bitSize20 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize20.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertEquals(file21.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file21.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertNull("file23.getParent() == null", file23.getParent());
        org.junit.Assert.assertEquals(file23.toString(), "hi!");
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNull("file25.getParent() == null", file25.getParent());
        org.junit.Assert.assertEquals(file25.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V2_1_0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        boolean boolean6 = de.flapdoodle.embedmongo.LocalArtifactStore.checkArtifact(runtimeConfig0, distribution5);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime7 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Version version8 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform9 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize10 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution11 = new de.flapdoodle.embedmongo.distribution.Distribution(version8, platform9, bitSize10);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig14 = new de.flapdoodle.embedmongo.config.MongodConfig(version8, (int) (short) -1, true);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig15 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str16 = runtimeConfig15.getArtifactStorePath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig17 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming18 = runtimeConfig17.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming19 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig17.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming19);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming21 = runtimeConfig17.getDefaultfileNaming();
        runtimeConfig15.setDefaultfileNaming(iTempNaming21);
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime23 = de.flapdoodle.embedmongo.MongoDBRuntime.getDefaultInstance();
        de.flapdoodle.embedmongo.distribution.Version version24 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution25 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version24);
        boolean boolean26 = mongoDBRuntime23.checkDistribution(distribution25);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize27 = distribution25.getBitsize();
        java.io.File file28 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig15, distribution25);
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable29 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig14, file28);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodExecutable mongodExecutable30 = mongoDBRuntime7.prepare(mongodConfig14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Could not move /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-5452e8e8-ee01-4fd8-b04a-145fc0ebba08.TGZ to /Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-2.1.0.tgz");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1_0 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1_0));
        org.junit.Assert.assertNotNull(distribution5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(mongoDBRuntime7);
        org.junit.Assert.assertTrue("'" + version8 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version8.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize10 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize10.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ".embedmongo" + "'", str16, ".embedmongo");
        org.junit.Assert.assertNotNull(iTempNaming18);
        org.junit.Assert.assertNotNull(iTempNaming21);
        org.junit.Assert.assertNotNull(mongoDBRuntime23);
        org.junit.Assert.assertTrue("'" + version24 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version24.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + bitSize27 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize27.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(file28);
        org.junit.Assert.assertEquals(file28.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file28.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckDir("-cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: -cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener2 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener2.start("");
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener2);
        java.lang.String str6 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming7 = runtimeConfig0.getDefaultfileNaming();
        de.flapdoodle.embedmongo.distribution.Distribution distribution8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file9 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://fastdl.mongodb.org/" + "'", str6, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming7);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("mongod");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming4 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig2.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig2, distribution7);
        boolean boolean9 = de.flapdoodle.embedmongo.Files.forceDelete(file8);
        boolean boolean10 = de.flapdoodle.embedmongo.Files.moveFile(file1, file8);
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertEquals(file1.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file1.toString(), "/Users/yhcrown/mongod");
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "/Users/yhcrown/.embedmongo/osx");
        org.junit.Assert.assertEquals(file8.toString(), "/Users/yhcrown/.embedmongo/osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.progress("-4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz", (-1));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 0, true);
        de.flapdoodle.embedmongo.distribution.Version version4 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig7 = new de.flapdoodle.embedmongo.config.MongodConfig(version4, (int) (short) -1, false);
        java.io.File file8 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable9 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig7, file8);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess10 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig3, mongodExecutable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        de.flapdoodle.embedmongo.extract.TgzExtractor tgzExtractor0 = new de.flapdoodle.embedmongo.extract.TgzExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming3 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig1.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming3);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming5 = runtimeConfig1.getDefaultfileNaming();
        de.flapdoodle.embedmongo.output.IProgressListener iProgressListener6 = runtimeConfig1.getProgressListener();
        java.io.File file7 = null;
        de.flapdoodle.embedmongo.distribution.Version version8 = null;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig11 = new de.flapdoodle.embedmongo.config.MongodConfig(version8, (int) (short) -1, false);
        java.io.File file12 = null;
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable13 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig11, file12);
        java.io.File file15 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable16 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig11, file15);
        java.io.File file17 = mongodExecutable16.getFile();
        de.flapdoodle.embedmongo.distribution.Version version18 = de.flapdoodle.embedmongo.distribution.Version.V2_1_0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution19 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version18);
        java.util.regex.Pattern pattern20 = de.flapdoodle.embedmongo.Paths.getMongodExecutablePattern(distribution19);
        // The following exception was thrown during execution in test generation
        try {
            tgzExtractor0.extract(runtimeConfig1, file7, file17, pattern20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertNotNull(iTempNaming5);
        org.junit.Assert.assertNotNull(iProgressListener6);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file15.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-7e32364d-d897-4339-90f4-06732e8c87a7");
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file17.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-7e32364d-d897-4339-90f4-06732e8c87a7");
        org.junit.Assert.assertTrue("'" + version18 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1_0 + "'", version18.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1_0));
        org.junit.Assert.assertNotNull(distribution19);
        org.junit.Assert.assertNotNull(pattern20);
        org.junit.Assert.assertEquals(pattern20.toString(), ".*mongod");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_0_1;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 0, false);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_0_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_0_1));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("hi!", ".embedmongo");
        standardConsoleProgressListener0.start("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo");
        standardConsoleProgressListener0.start("-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.done("http://fastdl.mongodb.org/");
        consoleOneLineProgressListener0.done("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.info("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz", "");
        consoleOneLineProgressListener0.done("-b48b4d8a-d291-45f5-bc0e-be6a3804acf6osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.done("-4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.done("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.start("-4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0;
        de.flapdoodle.embedmongo.distribution.Version version1 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform2 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize3 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution4 = new de.flapdoodle.embedmongo.distribution.Distribution(version1, platform2, bitSize3);
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version1);
        de.flapdoodle.embedmongo.distribution.Platform platform6 = distribution5.getPlatform();
        de.flapdoodle.embedmongo.distribution.Version version7 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform8 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize9 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution10 = new de.flapdoodle.embedmongo.distribution.Distribution(version7, platform8, bitSize9);
        de.flapdoodle.embedmongo.distribution.Distribution distribution11 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform6, bitSize9);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0));
        org.junit.Assert.assertTrue("'" + version1 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version1.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize3 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize3.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(distribution5);
        org.junit.Assert.assertTrue("'" + platform6 + "' != '" + de.flapdoodle.embedmongo.distribution.Platform.OS_X + "'", platform6.equals(de.flapdoodle.embedmongo.distribution.Platform.OS_X));
        org.junit.Assert.assertTrue("'" + version7 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version7.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize9 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize9.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig6 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, true);
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess8 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig6, mongodExecutable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempFile("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!-yhcrown-mongod");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.distribution.Version version4 = distribution3.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version5 = distribution3.getVersion();
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig9 = new de.flapdoodle.embedmongo.config.MongodConfig(version5, (int) (byte) -1, true, "mongod");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + version5 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version5.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckDir("hi!");
        java.io.File file3 = de.flapdoodle.embedmongo.Files.createOrCheckDir("hi!");
        boolean boolean4 = de.flapdoodle.embedmongo.Files.moveFile(file1, file3);
        boolean boolean5 = de.flapdoodle.embedmongo.Files.forceDelete(file3);
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertNull("file1.getParent() == null", file1.getParent());
        org.junit.Assert.assertEquals(file1.toString(), "hi!");
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener3 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener3.start("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) consoleOneLineProgressListener3);
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming7 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        java.lang.String str10 = userTempNaming7.nameFor("-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz", "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo");
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming7);
        de.flapdoodle.embedmongo.distribution.Version version12 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution13 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version12);
        java.lang.String str14 = de.flapdoodle.embedmongo.Paths.getPath(distribution13);
        de.flapdoodle.embedmongo.distribution.BitSize bitSize15 = distribution13.getBitsize();
        de.flapdoodle.embedmongo.distribution.ArchiveType archiveType16 = de.flapdoodle.embedmongo.Paths.getArchiveType(distribution13);
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file17 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution13);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempfile: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-yhcrown-.TGZ");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo" + "'", str10, "-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo");
        org.junit.Assert.assertTrue("'" + version12 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version12.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str14, "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertTrue("'" + bitSize15 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize15.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + archiveType16 + "' != '" + de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ + "'", archiveType16.equals(de.flapdoodle.embedmongo.distribution.ArchiveType.TGZ));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig4 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) 0, false, "hi!");
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig8 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (byte) 0, false, "");
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig12 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 0, true, "-4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown--yhcrown-hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming4 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig2.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming4);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig2.getDefaultfileNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming6);
        java.lang.String str8 = runtimeConfig0.getDownloadPath();
        java.lang.String str9 = runtimeConfig0.getDownloadPath();
        java.lang.String str10 = runtimeConfig0.getArtifactStorePath();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertNotNull(iTempNaming6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://fastdl.mongodb.org/" + "'", str8, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://fastdl.mongodb.org/" + "'", str9, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".embedmongo" + "'", str10, ".embedmongo");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        java.io.File file6 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution5);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener7 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener7.info("", "hi!");
        standardConsoleProgressListener7.done("");
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener7);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createOrCheckDir("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!-52b04879-adbf-4a54-9e56-0ab55a002a54");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-463298c6-3f5e-4613-a10a-af538615978ehi!-52b04879-adbf-4a54-9e56-0ab55a002a54");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.distribution.Version version2 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version2);
        java.io.File file4 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution3);
        de.flapdoodle.embedmongo.distribution.Version version5 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform6 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize7 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution8 = new de.flapdoodle.embedmongo.distribution.Distribution(version5, platform6, bitSize7);
        de.flapdoodle.embedmongo.distribution.Version version9 = distribution8.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version10 = distribution8.getVersion();
        de.flapdoodle.embedmongo.distribution.Platform platform11 = distribution8.getPlatform();
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file12 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig0, distribution8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version2 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version2.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertTrue("'" + version5 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version5.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize7 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize7.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + version10 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version10.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertNull(platform11);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener0 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener0.info("hi!", ".embedmongo");
        standardConsoleProgressListener0.done("mongod");
        standardConsoleProgressListener0.done("osx/mongodb-osx-i386-1.8.0-rc0.tgz-3aede1fd-1a0c-4766-939a-31860b1cf8c4-f9f4e70c-2243-43da-84ef-8a4cd1972daeosx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.done("");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        java.io.File file6 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution5);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener7 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener7);
        standardConsoleProgressListener7.info("-yhcrown-hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz", "-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig6 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, true);
        java.lang.String str7 = mongodConfig6.getDatabaseDir();
        java.io.File file9 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("mongod");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable10 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig6, file9);
        mongodExecutable10.cleanup();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess12 = mongodExecutable10.start();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/Users/yhcrown/mongod\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file9.toString(), "/Users/yhcrown/mongod");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
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
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        de.flapdoodle.embedmongo.extract.TgzExtractor tgzExtractor0 = new de.flapdoodle.embedmongo.extract.TgzExtractor();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig1 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming2 = runtimeConfig1.getExecutableNaming();
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener3 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        standardConsoleProgressListener3.start("");
        runtimeConfig1.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener3);
        java.lang.String str7 = runtimeConfig1.getDownloadPath();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming8 = runtimeConfig1.getDefaultfileNaming();
        de.flapdoodle.embedmongo.distribution.Version version9 = de.flapdoodle.embedmongo.distribution.Version.V1_8;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig12 = new de.flapdoodle.embedmongo.config.MongodConfig(version9, (int) (short) 0, true);
        de.flapdoodle.embedmongo.distribution.Distribution distribution13 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version9);
        java.io.File file14 = de.flapdoodle.embedmongo.Downloader.download(runtimeConfig1, distribution13);
        java.io.File file16 = de.flapdoodle.embedmongo.Files.createOrCheckDir("hi!");
        java.io.File file18 = de.flapdoodle.embedmongo.Files.createOrCheckDir("hi!");
        de.flapdoodle.embedmongo.distribution.Version version19 = de.flapdoodle.embedmongo.distribution.Version.V2_1_0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution20 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version19);
        java.util.regex.Pattern pattern21 = de.flapdoodle.embedmongo.Paths.getMongodExecutablePattern(distribution20);
        // The following exception was thrown during execution in test generation
        try {
            tgzExtractor0.extract(runtimeConfig1, file16, file18, pattern21);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://fastdl.mongodb.org/" + "'", str7, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming8);
        org.junit.Assert.assertTrue("'" + version9 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8 + "'", version9.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8));
        org.junit.Assert.assertNotNull(distribution13);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertEquals(file14.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file14.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/embedmongo-download-fa8f55d0-acc1-4d10-b457-8ce688117432.TGZ");
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNull("file16.getParent() == null", file16.getParent());
        org.junit.Assert.assertEquals(file16.toString(), "hi!");
        org.junit.Assert.assertNotNull(file18);
        org.junit.Assert.assertNull("file18.getParent() == null", file18.getParent());
        org.junit.Assert.assertEquals(file18.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + version19 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1_0 + "'", version19.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1_0));
        org.junit.Assert.assertNotNull(distribution20);
        org.junit.Assert.assertNotNull(pattern21);
        org.junit.Assert.assertEquals(pattern21.toString(), ".*mongod");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig5 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, 0, true, "hi!-yhcrown-");
        boolean boolean6 = mongodConfig5.isIpv6();
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        java.lang.String str2 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig3 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig3.getExecutableNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming4);
        java.lang.String str8 = iTempNaming4.nameFor("", "osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        java.lang.String str11 = iTempNaming4.nameFor("-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz", "-yhcrown-hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://fastdl.mongodb.org/" + "'", str2, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-f889d115-cb67-469b-b429-370709b224f2osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str8, "-f889d115-cb67-469b-b429-370709b224f2osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz-b38021f6-d41f-4da6-8113-b23e593b7492-yhcrown-hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str11, "-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz-b38021f6-d41f-4da6-8113-b23e593b7492-yhcrown-hi!-yhcrown-osx/mongodb-osx-i386-1.8.0-rc0.tgz");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform1 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize2 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution3 = new de.flapdoodle.embedmongo.distribution.Distribution(version0, platform1, bitSize2);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig6 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (short) -1, true);
        de.flapdoodle.embedmongo.distribution.Version version7 = mongodConfig6.getVersion();
        de.flapdoodle.embedmongo.distribution.Version version8 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform9 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize10 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution11 = new de.flapdoodle.embedmongo.distribution.Distribution(version8, platform9, bitSize10);
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig14 = new de.flapdoodle.embedmongo.config.MongodConfig(version8, (int) (short) -1, true);
        java.lang.String str15 = mongodConfig14.getDatabaseDir();
        java.io.File file17 = de.flapdoodle.embedmongo.Files.createOrCheckUserDir("mongod");
        de.flapdoodle.embedmongo.MongodExecutable mongodExecutable18 = new de.flapdoodle.embedmongo.MongodExecutable(mongodConfig14, file17);
        mongodExecutable18.cleanup();
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.MongodProcess mongodProcess20 = new de.flapdoodle.embedmongo.MongodProcess(mongodConfig6, mongodExecutable18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot run program \"/Users/yhcrown/mongod\": error=2, No such file or directory");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize2 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize2.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertTrue("'" + version7 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version7.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + version8 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version8.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize10 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize10.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertEquals(file17.getParent(), "/Users/yhcrown");
        org.junit.Assert.assertEquals(file17.toString(), "/Users/yhcrown/mongod");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.io.InputStream inputStream0 = null;
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming4 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig2.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming4);
        de.flapdoodle.embedmongo.distribution.Version version6 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version6);
        java.io.File file8 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig2, distribution7);
        boolean boolean9 = de.flapdoodle.embedmongo.Files.forceDelete(file8);
        // The following exception was thrown during execution in test generation
        try {
            de.flapdoodle.embedmongo.Files.write(inputStream0, (-1L), file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertTrue("'" + version6 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version6.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempDir("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Could not create Tempdir: /var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz-be9c9bef-30c2-452f-9d0e-7ec992aa728c");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener consoleOneLineProgressListener0 = new de.flapdoodle.embedmongo.output.ConsoleOneLineProgressListener();
        consoleOneLineProgressListener0.start("osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        consoleOneLineProgressListener0.start("http://fastdl.mongodb.org/");
        consoleOneLineProgressListener0.progress("", (int) (byte) 10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.distribution.Version version4 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution5 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version4);
        java.io.File file6 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig0, distribution5);
        de.flapdoodle.embedmongo.output.StandardConsoleProgressListener standardConsoleProgressListener7 = new de.flapdoodle.embedmongo.output.StandardConsoleProgressListener();
        runtimeConfig0.setProgressListener((de.flapdoodle.embedmongo.output.IProgressListener) standardConsoleProgressListener7);
        runtimeConfig0.setDownloadPath("");
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime11 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Version version12 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig15 = new de.flapdoodle.embedmongo.config.MongodConfig(version12, (int) '4', true);
        de.flapdoodle.embedmongo.distribution.Distribution distribution16 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version12);
        boolean boolean17 = mongoDBRuntime11.checkDistribution(distribution16);
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertTrue("'" + version4 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version4.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNotNull(mongoDBRuntime11);
        org.junit.Assert.assertTrue("'" + version12 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0 + "'", version12.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0));
        org.junit.Assert.assertNotNull(distribution16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.io.File file1 = de.flapdoodle.embedmongo.Files.createTempDir("hi!");
        boolean boolean2 = de.flapdoodle.embedmongo.Files.forceDelete(file1);
        boolean boolean3 = de.flapdoodle.embedmongo.Files.forceDelete(file1);
        org.junit.Assert.assertNotNull(file1);
        org.junit.Assert.assertEquals(file1.getParent(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T");
        org.junit.Assert.assertEquals(file1.toString(), "/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/hi!-0ce8b317-f50f-4a6d-b5a8-d63c3b201146");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        java.lang.String str6 = userTempNaming2.nameFor("osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo", "-4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        java.lang.String str9 = userTempNaming2.nameFor("-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown--cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz", "hi!");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz" + "'", str6, "osx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-.embedmongo-yhcrown--4db69dd6-0fba-460e-96be-616ad52a3119osx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown--cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-hi!" + "'", str9, "-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown--cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown-hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V2_1_0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution1 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version0);
        java.util.regex.Pattern pattern2 = de.flapdoodle.embedmongo.Paths.getMongodExecutablePattern(distribution1);
        java.util.regex.Pattern pattern3 = de.flapdoodle.embedmongo.Paths.getMongodExecutablePattern(distribution1);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1_0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1_0));
        org.junit.Assert.assertNotNull(distribution1);
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), ".*mongod");
        org.junit.Assert.assertNotNull(pattern3);
        org.junit.Assert.assertEquals(pattern3.toString(), ".*mongod");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        java.lang.String str1 = runtimeConfig0.getArtifactStorePath();
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig2 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming3 = runtimeConfig2.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming4 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig2.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming4);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming6 = runtimeConfig2.getDefaultfileNaming();
        runtimeConfig0.setDefaultfileNaming(iTempNaming6);
        java.lang.String str8 = runtimeConfig0.getDownloadPath();
        java.lang.String str9 = runtimeConfig0.getDownloadPath();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming10 = runtimeConfig0.getDefaultfileNaming();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".embedmongo" + "'", str1, ".embedmongo");
        org.junit.Assert.assertNotNull(iTempNaming3);
        org.junit.Assert.assertNotNull(iTempNaming6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://fastdl.mongodb.org/" + "'", str8, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://fastdl.mongodb.org/" + "'", str9, "http://fastdl.mongodb.org/");
        org.junit.Assert.assertNotNull(iTempNaming10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.MongoDBRuntime mongoDBRuntime2 = de.flapdoodle.embedmongo.MongoDBRuntime.getInstance(runtimeConfig0);
        de.flapdoodle.embedmongo.distribution.Version version3 = de.flapdoodle.embedmongo.distribution.Version.V2_1;
        de.flapdoodle.embedmongo.distribution.Platform platform4 = null;
        de.flapdoodle.embedmongo.distribution.BitSize bitSize5 = de.flapdoodle.embedmongo.distribution.BitSize.B32;
        de.flapdoodle.embedmongo.distribution.Distribution distribution6 = new de.flapdoodle.embedmongo.distribution.Distribution(version3, platform4, bitSize5);
        de.flapdoodle.embedmongo.distribution.Distribution distribution7 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version3);
        boolean boolean8 = de.flapdoodle.embedmongo.LocalArtifactStore.checkArtifact(runtimeConfig0, distribution7);
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig9 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming10 = runtimeConfig9.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming11 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig9.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming11);
        de.flapdoodle.embedmongo.distribution.Version version13 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0;
        de.flapdoodle.embedmongo.distribution.Distribution distribution14 = de.flapdoodle.embedmongo.distribution.Distribution.detectFor(version13);
        java.io.File file15 = de.flapdoodle.embedmongo.LocalArtifactStore.getArtifact(runtimeConfig9, distribution14);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming16 = runtimeConfig9.getDefaultfileNaming();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming17 = runtimeConfig9.getExecutableNaming();
        runtimeConfig0.setExecutableNaming(iTempNaming17);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming19 = runtimeConfig0.getDefaultfileNaming();
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(mongoDBRuntime2);
        org.junit.Assert.assertTrue("'" + version3 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V2_1 + "'", version3.equals(de.flapdoodle.embedmongo.distribution.Version.V2_1));
        org.junit.Assert.assertTrue("'" + bitSize5 + "' != '" + de.flapdoodle.embedmongo.distribution.BitSize.B32 + "'", bitSize5.equals(de.flapdoodle.embedmongo.distribution.BitSize.B32));
        org.junit.Assert.assertNotNull(distribution7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iTempNaming10);
        org.junit.Assert.assertTrue("'" + version13 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0 + "'", version13.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0_rc0));
        org.junit.Assert.assertNotNull(distribution14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(iTempNaming16);
        org.junit.Assert.assertNotNull(iTempNaming17);
        org.junit.Assert.assertNotNull(iTempNaming19);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        de.flapdoodle.embedmongo.config.RuntimeConfig runtimeConfig0 = new de.flapdoodle.embedmongo.config.RuntimeConfig();
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming1 = runtimeConfig0.getExecutableNaming();
        de.flapdoodle.embedmongo.extract.UserTempNaming userTempNaming2 = new de.flapdoodle.embedmongo.extract.UserTempNaming();
        runtimeConfig0.setDefaultfileNaming((de.flapdoodle.embedmongo.extract.ITempNaming) userTempNaming2);
        de.flapdoodle.embedmongo.extract.ITempNaming iTempNaming4 = runtimeConfig0.getDefaultfileNaming();
        de.flapdoodle.embedmongo.output.IProgressListener iProgressListener5 = runtimeConfig0.getProgressListener();
        runtimeConfig0.setDownloadPath("-91d8241b-34fb-44a6-bb23-64cbe7476f8fosx/mongodb-osx-i386-1.8.0-rc0.tgz-yhcrown--cbadada0-da72-4cc0-b403-6a68cf87219cosx/mongodb-osx-i386-1.8.0-rc0.tgz");
        org.junit.Assert.assertNotNull(iTempNaming1);
        org.junit.Assert.assertNotNull(iTempNaming4);
        org.junit.Assert.assertNotNull(iProgressListener5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        de.flapdoodle.embedmongo.distribution.Version version0 = de.flapdoodle.embedmongo.distribution.Version.V1_8_0;
        de.flapdoodle.embedmongo.config.MongodConfig mongodConfig3 = new de.flapdoodle.embedmongo.config.MongodConfig(version0, (int) (byte) 0, true);
        org.junit.Assert.assertTrue("'" + version0 + "' != '" + de.flapdoodle.embedmongo.distribution.Version.V1_8_0 + "'", version0.equals(de.flapdoodle.embedmongo.distribution.Version.V1_8_0));
    }
}

