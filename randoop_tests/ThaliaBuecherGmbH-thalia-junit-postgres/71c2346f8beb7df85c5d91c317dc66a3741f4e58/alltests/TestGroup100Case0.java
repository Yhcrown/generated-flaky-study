import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroup100Case0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test01");
        de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion postgreVersion1 = null;
        // The following exception was thrown during execution in test generation
        try {
            de.thalia.junit.postgres.PostgresEmbedder.PerTestPostgresInstance perTestPostgresInstance2 = new de.thalia.junit.postgres.PostgresEmbedder.PerTestPostgresInstance((int) (short) 0, postgreVersion1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test03");
        de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion postgreVersion1 = null;
        // The following exception was thrown during execution in test generation
        try {
            de.thalia.junit.postgres.PostgresEmbedder.PerTestPostgresInstance perTestPostgresInstance2 = new de.thalia.junit.postgres.PostgresEmbedder.PerTestPostgresInstance((int) (byte) -1, postgreVersion1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test04");
        de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion postgreVersion1 = null;
        // The following exception was thrown during execution in test generation
        try {
            de.thalia.junit.postgres.PostgresEmbedder postgresEmbedder2 = new de.thalia.junit.postgres.PostgresEmbedder((int) (byte) 10, postgreVersion1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test05");
        de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion postgreVersion1 = null;
        // The following exception was thrown during execution in test generation
        try {
            de.thalia.junit.postgres.PostgresEmbedder postgresEmbedder2 = new de.thalia.junit.postgres.PostgresEmbedder(1, postgreVersion1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test06");
        de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion postgreVersion1 = null;
        // The following exception was thrown during execution in test generation
        try {
            de.thalia.junit.postgres.PostgresEmbedder.PerTestPostgresInstance perTestPostgresInstance2 = new de.thalia.junit.postgres.PostgresEmbedder.PerTestPostgresInstance(0, postgreVersion1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test07");
        int int0 = de.thalia.junit.postgres.PostgresEmbedder.freePortNumber();
// flaky:         org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64680 + "'", int0 == 64680);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test08");
        de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion postgreVersion0 = de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion.V10_3;
        org.junit.Assert.assertTrue("'" + postgreVersion0 + "' != '" + de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion.V10_3 + "'", postgreVersion0.equals(de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion.V10_3));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test09");
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder0 = de.thalia.junit.postgres.PostgresEmbedderRule.builder();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder2 = builder0.withPort((int) (byte) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test10");
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder0 = de.thalia.junit.postgres.PostgresEmbedderRule.builder();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder1 = builder0.asJVMSingleton();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder3 = builder1.withPort((int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = builder1.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test11");
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder0 = de.thalia.junit.postgres.PostgresEmbedderRule.builder();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder1 = builder0.asJVMSingleton();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder3 = builder1.withPort((int) (byte) -1);
        de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion postgreVersion4 = de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion.V9_6_8;
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder5 = builder3.withVersion(postgreVersion4);
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder7 = builder3.withPort((int) (byte) 100);
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder8 = builder7.asJVMSingleton();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + postgreVersion4 + "' != '" + de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion.V9_6_8 + "'", postgreVersion4.equals(de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion.V9_6_8));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test12");
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder0 = de.thalia.junit.postgres.PostgresEmbedderRule.builder();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder1 = builder0.asJVMSingleton();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder3 = builder1.withPort((int) (byte) -1);
        de.thalia.junit.postgres.PostgresEmbedderRule postgresEmbedderRule4 = builder3.build();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder6 = builder3.withPort(0);
        de.thalia.junit.postgres.PostgresEmbedderRule postgresEmbedderRule7 = builder6.build();
        de.thalia.junit.postgres.PostgresEmbedder postgresEmbedder8 = postgresEmbedderRule7.getPostgresEmbedder();
        org.junit.runners.model.Statement statement9 = null;
        org.junit.runner.Description description10 = null;
        org.junit.runners.model.Statement statement11 = postgresEmbedderRule7.apply(statement9, description10);
        de.thalia.junit.postgres.PostgresEmbedder postgresEmbedder12 = postgresEmbedderRule7.getPostgresEmbedder();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(postgresEmbedderRule4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(postgresEmbedderRule7);
        org.junit.Assert.assertNull(postgresEmbedder8);
        org.junit.Assert.assertNotNull(statement11);
        org.junit.Assert.assertNull(postgresEmbedder12);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test13");
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder0 = de.thalia.junit.postgres.PostgresEmbedderRule.builder();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder1 = builder0.asJVMSingleton();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder3 = builder1.withPort((int) (byte) -1);
        de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion postgreVersion4 = de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion.V9_6_8;
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder5 = builder3.withVersion(postgreVersion4);
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder7 = builder3.withPort((int) (byte) 100);
        de.thalia.junit.postgres.PostgresEmbedderRule postgresEmbedderRule8 = builder7.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + postgreVersion4 + "' != '" + de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion.V9_6_8 + "'", postgreVersion4.equals(de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion.V9_6_8));
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(postgresEmbedderRule8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test14");
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder0 = de.thalia.junit.postgres.PostgresEmbedderRule.builder();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder1 = builder0.asJVMSingleton();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder3 = builder0.withPort((int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = builder3.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test15");
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder0 = de.thalia.junit.postgres.PostgresEmbedderRule.builder();
        de.thalia.junit.postgres.PostgresEmbedderRule postgresEmbedderRule1 = builder0.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(postgresEmbedderRule1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test16");
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder0 = de.thalia.junit.postgres.PostgresEmbedderRule.builder();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder1 = builder0.asJVMSingleton();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder3 = builder1.withPort((int) (byte) -1);
        de.thalia.junit.postgres.PostgresEmbedderRule postgresEmbedderRule4 = builder3.build();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder6 = builder3.withPort(0);
        de.thalia.junit.postgres.PostgresEmbedderRule postgresEmbedderRule7 = builder6.build();
        javax.sql.DataSource dataSource8 = postgresEmbedderRule7.getDataSource();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(postgresEmbedderRule4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(postgresEmbedderRule7);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test17");
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder0 = de.thalia.junit.postgres.PostgresEmbedderRule.builder();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder1 = builder0.asJVMSingleton();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder3 = builder1.withPort((int) (byte) -1);
        de.thalia.junit.postgres.PostgresEmbedderRule postgresEmbedderRule4 = builder3.build();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder6 = builder3.withPort(0);
        de.thalia.junit.postgres.PostgresEmbedderRule postgresEmbedderRule7 = builder6.build();
        de.thalia.junit.postgres.PostgresEmbedder postgresEmbedder8 = postgresEmbedderRule7.getPostgresEmbedder();
        org.junit.runners.model.Statement statement9 = null;
        org.junit.runner.Description description10 = null;
        org.junit.runners.model.Statement statement11 = postgresEmbedderRule7.apply(statement9, description10);
        javax.sql.DataSource dataSource12 = postgresEmbedderRule7.getDataSource();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(postgresEmbedderRule4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(postgresEmbedderRule7);
        org.junit.Assert.assertNull(postgresEmbedder8);
        org.junit.Assert.assertNotNull(statement11);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test18");
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder0 = de.thalia.junit.postgres.PostgresEmbedderRule.builder();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder1 = builder0.asJVMSingleton();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder3 = builder1.withPort((int) (byte) -1);
        de.thalia.junit.postgres.PostgresEmbedderRule postgresEmbedderRule4 = builder1.build();
        java.lang.Class<?> wildcardClass5 = builder1.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(postgresEmbedderRule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test19");
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder0 = de.thalia.junit.postgres.PostgresEmbedderRule.builder();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder1 = builder0.asJVMSingleton();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder3 = builder1.withPort((int) (byte) -1);
        de.thalia.junit.postgres.PostgresEmbedderRule postgresEmbedderRule4 = builder3.build();
        javax.sql.DataSource dataSource5 = postgresEmbedderRule4.getDataSource();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(postgresEmbedderRule4);
        org.junit.Assert.assertNull(dataSource5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test20");
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder0 = de.thalia.junit.postgres.PostgresEmbedderRule.builder();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder1 = builder0.asJVMSingleton();
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder3 = builder1.withPort((int) (byte) -1);
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder4 = builder3.asJVMSingleton();
        de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion postgreVersion5 = de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion.V9_5_12;
        de.thalia.junit.postgres.PostgresEmbedderRule.Builder builder6 = builder3.withVersion(postgreVersion5);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + postgreVersion5 + "' != '" + de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion.V9_5_12 + "'", postgreVersion5.equals(de.thalia.junit.postgres.PostgresEmbedder.PostgreVersion.V9_5_12));
        org.junit.Assert.assertNotNull(builder6);
    }
}
