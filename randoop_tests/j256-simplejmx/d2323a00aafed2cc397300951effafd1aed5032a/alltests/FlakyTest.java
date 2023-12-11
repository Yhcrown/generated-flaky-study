package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test067_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.j256.simplejmx.server.JmxServer jmxServer1 = new com.j256.simplejmx.server.JmxServer((int) (byte) 1);
        jmxServer1.close();
         jmxServer1.start();
    }
}