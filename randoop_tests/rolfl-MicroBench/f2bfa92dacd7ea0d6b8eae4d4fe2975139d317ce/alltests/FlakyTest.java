package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test015_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.lang.String str1 = net.tuis.ubench.UUtils.readResource("");
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net\n" + "'", str1, "net\n");
    }
}