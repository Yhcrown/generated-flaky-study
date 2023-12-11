package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test314_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        dev.codesoapbox.dummy4j.Dummy4j dummy4j0 = new dev.codesoapbox.dummy4j.Dummy4j();
        dev.codesoapbox.dummy4j.dummies.NationDummy nationDummy1 = dummy4j0.nation();
        java.lang.String str2 = nationDummy1.languageCodeTwoLetter();
        java.lang.String str3 = nationDummy1.languageCommon();
        org.junit.Assert.assertNotNull(nationDummy1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "he" + "'", str2, "he");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
    }
	@Test
    public void test314_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        dev.codesoapbox.dummy4j.Dummy4j dummy4j0 = new dev.codesoapbox.dummy4j.Dummy4j();
        dev.codesoapbox.dummy4j.dummies.NationDummy nationDummy1 = dummy4j0.nation();
        java.lang.String str2 = nationDummy1.languageCodeTwoLetter();
        java.lang.String str3 = nationDummy1.languageCommon();
        org.junit.Assert.assertNotNull(nationDummy1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "he" + "'", str2, "he");
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
    }
	@Test
    public void test316_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        dev.codesoapbox.dummy4j.Dummy4j dummy4j0 = new dev.codesoapbox.dummy4j.Dummy4j();
        dev.codesoapbox.dummy4j.dummies.NationDummy nationDummy1 = dummy4j0.nation();
        java.lang.String str2 = nationDummy1.languageCodeTwoLetter();
        java.lang.String str3 = nationDummy1.languageCodeThreeLetterCommon();
        org.junit.Assert.assertNotNull(nationDummy1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nl" + "'", str2, "nl");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fre" + "'", str3, "fre");
    }
	@Test
    public void test316_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        dev.codesoapbox.dummy4j.Dummy4j dummy4j0 = new dev.codesoapbox.dummy4j.Dummy4j();
        dev.codesoapbox.dummy4j.dummies.NationDummy nationDummy1 = dummy4j0.nation();
        java.lang.String str2 = nationDummy1.languageCodeTwoLetter();
        java.lang.String str3 = nationDummy1.languageCodeThreeLetterCommon();
        org.junit.Assert.assertNotNull(nationDummy1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nl" + "'", str2, "nl");
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fre" + "'", str3, "fre");
    }
	@Test
    public void test319_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        dev.codesoapbox.dummy4j.Dummy4j dummy4j0 = new dev.codesoapbox.dummy4j.Dummy4j();
        dev.codesoapbox.dummy4j.dummies.NameDummy nameDummy1 = dummy4j0.name();
        java.lang.String str2 = nameDummy1.lastName();
        org.junit.Assert.assertNotNull(nameDummy1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Holt" + "'", str2, "Holt");
    }
	@Test
    public void test327_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        dev.codesoapbox.dummy4j.Dummy4j dummy4j0 = new dev.codesoapbox.dummy4j.Dummy4j();
        dev.codesoapbox.dummy4j.dummies.NationDummy nationDummy1 = dummy4j0.nation();
        java.lang.String str2 = nationDummy1.countryCode();
        org.junit.Assert.assertNotNull(nationDummy1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CD" + "'", str2, "CD");
    }
	@Test
    public void test334_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        dev.codesoapbox.dummy4j.Dummy4j dummy4j0 = new dev.codesoapbox.dummy4j.Dummy4j();
        dev.codesoapbox.dummy4j.dummies.NameDummy nameDummy1 = dummy4j0.name();
        dev.codesoapbox.dummy4j.dummies.identifier.IdentifierDummy identifierDummy2 = dummy4j0.identifier();
        java.lang.String str3 = identifierDummy2.ean13();
        org.junit.Assert.assertNotNull(nameDummy1);
        org.junit.Assert.assertNotNull(identifierDummy2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6226624843555" + "'", str3, "6226624843555");
    }
	@Test
    public void test349_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        dev.codesoapbox.dummy4j.Dummy4j dummy4j0 = new dev.codesoapbox.dummy4j.Dummy4j();
        dev.codesoapbox.dummy4j.dummies.NameDummy nameDummy1 = dummy4j0.name();
        dev.codesoapbox.dummy4j.dummies.identifier.IdentifierDummy identifierDummy2 = dummy4j0.identifier();
        java.lang.String str3 = identifierDummy2.tac();
        java.lang.String str4 = identifierDummy2.orcid();
        org.junit.Assert.assertNotNull(nameDummy1);
        org.junit.Assert.assertNotNull(identifierDummy2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "01-450054" + "'", str3, "01-450054");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2884-0230-4334-8942" + "'", str4, "2884-0230-4334-8942");
    }
	@Test
    public void test349_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        dev.codesoapbox.dummy4j.Dummy4j dummy4j0 = new dev.codesoapbox.dummy4j.Dummy4j();
        dev.codesoapbox.dummy4j.dummies.NameDummy nameDummy1 = dummy4j0.name();
        dev.codesoapbox.dummy4j.dummies.identifier.IdentifierDummy identifierDummy2 = dummy4j0.identifier();
        java.lang.String str3 = identifierDummy2.tac();
        java.lang.String str4 = identifierDummy2.orcid();
        org.junit.Assert.assertNotNull(nameDummy1);
        org.junit.Assert.assertNotNull(identifierDummy2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "01-450054" + "'", str3, "01-450054");
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2884-0230-4334-8942" + "'", str4, "2884-0230-4334-8942");
    }
	@Test
    public void test358_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        dev.codesoapbox.dummy4j.Dummy4j dummy4j0 = new dev.codesoapbox.dummy4j.Dummy4j();
        dev.codesoapbox.dummy4j.dummies.NationDummy nationDummy1 = dummy4j0.nation();
        dev.codesoapbox.dummy4j.dummies.NatoPhoneticAlphabetDummy natoPhoneticAlphabetDummy2 = new dev.codesoapbox.dummy4j.dummies.NatoPhoneticAlphabetDummy(dummy4j0);
        dev.codesoapbox.dummy4j.dummies.NatoPhoneticAlphabetDummy natoPhoneticAlphabetDummy3 = new dev.codesoapbox.dummy4j.dummies.NatoPhoneticAlphabetDummy(dummy4j0);
        java.lang.String str4 = natoPhoneticAlphabetDummy3.word();
        org.junit.Assert.assertNotNull(nationDummy1);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Papa" + "'", str4, "Papa");
    }
	@Test
    public void test361_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        dev.codesoapbox.dummy4j.Dummy4j dummy4j0 = new dev.codesoapbox.dummy4j.Dummy4j();
        dev.codesoapbox.dummy4j.dummies.NationDummy nationDummy1 = dummy4j0.nation();
        dev.codesoapbox.dummy4j.dummies.NatoPhoneticAlphabetDummy natoPhoneticAlphabetDummy2 = new dev.codesoapbox.dummy4j.dummies.NatoPhoneticAlphabetDummy(dummy4j0);
        dev.codesoapbox.dummy4j.dummies.address.AddressDummy addressDummy3 = dummy4j0.address();
        dev.codesoapbox.dummy4j.Dummy4jBuilder dummy4jBuilder4 = new dev.codesoapbox.dummy4j.Dummy4jBuilder();
        dev.codesoapbox.dummy4j.Dummy4j dummy4j5 = null;
        dev.codesoapbox.dummy4j.dummies.shared.checkdigitformulas.ModTenFormula modTenFormula6 = null;
        dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.musicnumber.IsmnValidator ismnValidator7 = null;
        dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.musicnumber.IsmnBuilder ismnBuilder8 = new dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.musicnumber.IsmnBuilder(dummy4j5, modTenFormula6, ismnValidator7);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "-1" };
        dev.codesoapbox.dummy4j.dummies.identifier.internationalnumber.musicnumber.IsmnBuilder ismnBuilder12 = ismnBuilder8.withRandomSeparator(strArray11);
        dev.codesoapbox.dummy4j.Dummy4jBuilder dummy4jBuilder13 = dummy4jBuilder4.paths(strArray11);
        java.lang.CharSequence charSequence14 = dummy4j0.oneOf((java.lang.CharSequence[]) strArray11);
        org.junit.Assert.assertNotNull(nationDummy1);
        org.junit.Assert.assertNotNull(addressDummy3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(ismnBuilder12);
        org.junit.Assert.assertNotNull(dummy4jBuilder13);
         org.junit.Assert.assertEquals("'" + charSequence14 + "' != '" + "" + "'", charSequence14, "");
    }
	@Test
    public void test364_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        dev.codesoapbox.dummy4j.Dummy4j dummy4j0 = new dev.codesoapbox.dummy4j.Dummy4j();
        dev.codesoapbox.dummy4j.dummies.NationDummy nationDummy1 = dummy4j0.nation();
        dev.codesoapbox.dummy4j.dummies.NatoPhoneticAlphabetDummy natoPhoneticAlphabetDummy2 = new dev.codesoapbox.dummy4j.dummies.NatoPhoneticAlphabetDummy(dummy4j0);
        dev.codesoapbox.dummy4j.dummies.address.AddressDummy addressDummy3 = dummy4j0.address();
        java.lang.String str4 = addressDummy3.postCode();
        org.junit.Assert.assertNotNull(nationDummy1);
        org.junit.Assert.assertNotNull(addressDummy3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19713-9089" + "'", str4, "19713-9089");
    }
}