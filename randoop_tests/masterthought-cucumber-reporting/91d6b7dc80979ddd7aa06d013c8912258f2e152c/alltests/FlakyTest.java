package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test014_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = net.masterthought.cucumber.ReportResult.getCurrentTime();
         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "20 Nov 2023, 03:00" + "'", str0, "20 Nov 2023, 03:00");
    }
}