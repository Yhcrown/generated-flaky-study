import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTests{
    public static boolean debug = false;


    public void test327_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        org.seasar.mayaa.impl.CycleLocalVariablesImpl cycleLocalVariablesImpl0 = new org.seasar.mayaa.impl.CycleLocalVariablesImpl();
         cycleLocalVariablesImpl0.clearGlobalVariable("javaee_5.xsd");
    }
}