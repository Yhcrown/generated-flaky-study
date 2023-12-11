package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test07_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test07");
        int int0 = de.thalia.junit.postgres.PostgresEmbedder.freePortNumber();
         org.junit.Assert.assertTrue("'" + int0 + "' != '" + 59839 + "'", int0 == 59839);
    }
}