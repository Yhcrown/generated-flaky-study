import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral((int) 'a');
        net.canadensys.lang.RomanNumeral romanNumeral3 = new net.canadensys.lang.RomanNumeral((int) 'a');
        java.lang.String str4 = romanNumeral3.toRomanNumeral();
        int int5 = romanNumeral3.toInt();
        int int6 = romanNumeral1.compareTo(romanNumeral3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on romanNumeral1 and romanNumeral3", romanNumeral1.equals(romanNumeral3) ? romanNumeral1.hashCode() == romanNumeral3.hashCode() : true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral((int) 'a');
        java.lang.String str2 = romanNumeral1.toRomanNumeral();
        int int3 = romanNumeral1.toInt();
        net.canadensys.lang.RomanNumeral romanNumeral5 = new net.canadensys.lang.RomanNumeral((int) 'a');
        java.lang.String str6 = romanNumeral5.toRomanNumeral();
        int int7 = romanNumeral5.toInt();
        int int8 = romanNumeral1.compareTo(romanNumeral5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on romanNumeral1 and romanNumeral5", romanNumeral1.equals(romanNumeral5) ? romanNumeral1.hashCode() == romanNumeral5.hashCode() : true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        net.canadensys.lang.RomanNumeral romanNumeral1 = new net.canadensys.lang.RomanNumeral(3999);
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince2 = net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_BRABANT;
        boolean boolean3 = romanNumeral1.equals((java.lang.Object) bEProvince2);
        boolean boolean5 = romanNumeral1.equals((java.lang.Object) 100.0f);
        net.canadensys.lang.RomanNumeral romanNumeral7 = new net.canadensys.lang.RomanNumeral(3999);
        net.canadensys.vocabulary.stateprovince.BEProvince bEProvince8 = net.canadensys.vocabulary.stateprovince.BEProvince.FLEMISH_BRABANT;
        boolean boolean9 = romanNumeral7.equals((java.lang.Object) bEProvince8);
        boolean boolean11 = romanNumeral7.equals((java.lang.Object) 100.0f);
        int int12 = romanNumeral1.compareTo(romanNumeral7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on romanNumeral1 and romanNumeral7", romanNumeral1.equals(romanNumeral7) ? romanNumeral1.hashCode() == romanNumeral7.hashCode() : true);
    }
}

