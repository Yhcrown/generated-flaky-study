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
        io.resourcepool.model.Gender gender0 = io.resourcepool.model.Gender.MALE;
        java.lang.Class<?> wildcardClass1 = gender0.getClass();
        org.junit.Assert.assertTrue("'" + gender0 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender0.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        io.resourcepool.dictionary.loader.NameLoader nameLoader0 = new io.resourcepool.dictionary.loader.NameLoader();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        io.resourcepool.generator.Query query1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.FullName> fullNameList2 = simpleNameGenerator0.nextNames(query1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.lang.String str1 = simpleNameGenerator0.nextSurname();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Shaull" + "'", str1, "Shaull");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        io.resourcepool.dictionary.loader.FortuneLoader fortuneLoader0 = new io.resourcepool.dictionary.loader.FortuneLoader();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        io.resourcepool.model.Gender gender1 = io.resourcepool.model.Gender.parse("hi!");
        org.junit.Assert.assertNull(gender1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.generator.Query query1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick(query1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        io.resourcepool.model.GivenName givenName1 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.generator.Query query2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.FullName> fullNameList3 = simpleNameGenerator0.nextNames(query2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(givenName1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        io.resourcepool.generator.Query query7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.FullName> fullNameList8 = simpleNameGenerator0.nextNames(query7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick((int) 'a');
        int int3 = surnamesDictionary0.size();
        io.resourcepool.generator.Query query4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList5 = surnamesDictionary0.pick(query4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        io.resourcepool.model.Language language0 = io.resourcepool.model.Language.FRENCH;
        org.junit.Assert.assertTrue("'" + language0 + "' != '" + io.resourcepool.model.Language.FRENCH + "'", language0.equals(io.resourcepool.model.Language.FRENCH));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        int int4 = givenNamesDictionary0.size(languageArray2);
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = givenNamesDictionary0.pick(1);
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(givenNameList6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = simpleNameGenerator0.nextGivenNames((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = givenNameList6.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        boolean boolean8 = fullName6.equals((java.lang.Object) '4');
        java.lang.String str9 = fullName6.givenName;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Mary" + "'", str9, "Mary");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        int int1 = surnamesDictionary0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20000 + "'", int1 == 20000);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "Shaull", gender2);
        java.lang.String str4 = givenName3.nickname;
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator5 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator5.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList9 = simpleNameGenerator5.nextGivenNames(100);
        java.util.List<java.lang.String> strList11 = simpleNameGenerator5.nextSurnames((int) (byte) 1);
        boolean boolean12 = givenName3.equals((java.lang.Object) strList11);
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Shaull" + "'", str4, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(givenNameList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.generator.Query query1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes(query1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        java.util.List<java.lang.String> strList4 = surnamesDictionary0.pick((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = surnamesDictionary0.getClass();
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        io.resourcepool.model.Language language9 = io.resourcepool.model.Language.random();
        java.lang.String str10 = language9.getLocaleCode();
        java.lang.String str11 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language9);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.random();
        java.lang.String str14 = language13.getLocaleCode();
        java.lang.String str15 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language13);
        io.resourcepool.model.Language language16 = io.resourcepool.model.Language.random();
        java.lang.String str17 = language16.getLocaleCode();
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        java.lang.String str20 = language19.getLocaleCode();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] { language9, language13, language16, language18, language19 };
        int int22 = surnamesDictionary0.size(languageArray21);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary23 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int24 = fortunesDictionary23.size();
        io.resourcepool.generator.Query.Builder builder25 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary26 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary27 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray28 = new io.resourcepool.model.Language[] {};
        int int29 = surnamesDictionary27.size(languageArray28);
        int int30 = givenNamesDictionary26.size(languageArray28);
        io.resourcepool.generator.Query.Builder builder31 = builder25.languages(languageArray28);
        int int32 = fortunesDictionary23.size(languageArray28);
        int int33 = surnamesDictionary0.size(languageArray28);
        io.resourcepool.model.Language language34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = surnamesDictionary0.pick(language34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "TheOnlyhi!" + "'", str11, "TheOnlyhi!");
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!68" + "'", str15, "hi!68");
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50000 + "'", int22 == 50000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11812 + "'", int24 == 11812);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(languageArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.generator.Query query1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes(query1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.FullName fullName6 = givenName4.toFullName("hi!");
        java.lang.String str7 = fullName6.surname;
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int1 = givenNamesDictionary0.size();
        io.resourcepool.generator.Query query2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList3 = givenNamesDictionary0.pick(query2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4305 + "'", int1 == 4305);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        io.resourcepool.model.Language language9 = io.resourcepool.model.Language.random();
        java.lang.String str10 = language9.getLocaleCode();
        java.lang.String str11 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language9);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.random();
        java.lang.String str14 = language13.getLocaleCode();
        java.lang.String str15 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language13);
        io.resourcepool.model.Language language16 = io.resourcepool.model.Language.random();
        java.lang.String str17 = language16.getLocaleCode();
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        java.lang.String str20 = language19.getLocaleCode();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] { language9, language13, language16, language18, language19 };
        int int22 = surnamesDictionary0.size(languageArray21);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary23 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int24 = fortunesDictionary23.size();
        io.resourcepool.generator.Query.Builder builder25 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary26 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary27 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray28 = new io.resourcepool.model.Language[] {};
        int int29 = surnamesDictionary27.size(languageArray28);
        int int30 = givenNamesDictionary26.size(languageArray28);
        io.resourcepool.generator.Query.Builder builder31 = builder25.languages(languageArray28);
        int int32 = fortunesDictionary23.size(languageArray28);
        int int33 = surnamesDictionary0.size(languageArray28);
        io.resourcepool.generator.Query query34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList35 = surnamesDictionary0.pick(query34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!49" + "'", str11, "hi!49");
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!35" + "'", str15, "hi!35");
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50000 + "'", int22 == 50000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11812 + "'", int24 == 11812);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(languageArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.generator.Query query2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.Fortune> fortuneList3 = simpleFortuneGenerator0.nextFortunes(query2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fortune1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        io.resourcepool.model.FullName fullName7 = simpleNameGenerator0.nextName();
        java.lang.String str8 = fullName7.surname;
        java.lang.String str9 = fullName7.givenName;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(fullName7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Mary" + "'", str9, "Mary");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        io.resourcepool.generator.Query query3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.FullName> fullNameList4 = simpleNameGenerator0.nextNames(query3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.FullName fullName10 = simpleNameGenerator0.nextName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(fullName10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        java.util.List<java.lang.String> strList9 = surnamesDictionary0.pick((int) (byte) 10);
        int int10 = surnamesDictionary0.size();
        java.lang.String str11 = surnamesDictionary0.pick();
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Shaull" + "'", str11, "Shaull");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.lang.String str7 = fullName6.surname;
        java.lang.String str8 = fullName6.toString();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}" + "'", str8, "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        int int4 = givenNamesDictionary0.size(languageArray2);
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = givenNamesDictionary0.pick((int) ' ');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary7 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] {};
        int int9 = surnamesDictionary7.size(languageArray8);
        int int10 = givenNamesDictionary0.size(languageArray8);
        int int11 = givenNamesDictionary0.size();
        java.util.List<io.resourcepool.model.GivenName> givenNameList13 = givenNamesDictionary0.pick((int) (short) -1);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary14 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList16 = surnamesDictionary14.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary18 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray19 = new io.resourcepool.model.Language[] {};
        int int20 = surnamesDictionary18.size(languageArray19);
        io.resourcepool.model.Language language21 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language22 = io.resourcepool.model.Language.random();
        java.lang.String str23 = language22.getLocaleCode();
        io.resourcepool.model.Language[] languageArray24 = new io.resourcepool.model.Language[] { language21, language22 };
        int int25 = surnamesDictionary18.size(languageArray24);
        io.resourcepool.generator.Query query26 = new io.resourcepool.generator.Query(20000, languageArray24);
        java.util.List<java.lang.String> strList27 = surnamesDictionary14.pick(query26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList28 = givenNamesDictionary0.pick(query26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4305 + "'", int11 == 4305);
        org.junit.Assert.assertNotNull(givenNameList13);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(languageArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + language21 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language21.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language22 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language22.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en" + "'", str23, "en");
        org.junit.Assert.assertNotNull(languageArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20000 + "'", int25 == 20000);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        io.resourcepool.model.FullName fullName7 = simpleNameGenerator0.nextName();
        io.resourcepool.model.FullName fullName8 = simpleNameGenerator0.nextName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(fullName7);
        org.junit.Assert.assertNotNull(fullName8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.resourcepool.model.Language language1 = io.resourcepool.model.Language.random();
        java.lang.String str2 = language1.getLocaleCode();
        java.lang.String str3 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language1);
        java.lang.String str4 = language1.getLocaleCode();
        java.util.List<io.resourcepool.model.Fortune> fortuneList5 = io.resourcepool.dictionary.loader.FortuneLoader.load(language1);
        org.junit.Assert.assertTrue("'" + language1 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language1.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!85" + "'", str3, "hi!85");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertNotNull(fortuneList5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        java.lang.String str6 = language5.getLocaleCode();
        io.resourcepool.model.Language[] languageArray7 = new io.resourcepool.model.Language[] { language4, language5 };
        int int8 = surnamesDictionary1.size(languageArray7);
        io.resourcepool.generator.Query query9 = new io.resourcepool.generator.Query(20000, languageArray7);
        io.resourcepool.model.Language[] languageArray10 = query9.languages;
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(languageArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertNotNull(languageArray10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        int int1 = surnamesDictionary0.size();
        java.lang.Class<?> wildcardClass2 = surnamesDictionary0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20000 + "'", int1 == 20000);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Language language2 = io.resourcepool.model.Language.random();
        java.lang.String str3 = language2.getLocaleCode();
        io.resourcepool.model.Fortune fortune4 = simpleFortuneGenerator0.nextFortune(language2);
        io.resourcepool.model.Fortune fortune5 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune6 = simpleFortuneGenerator0.nextFortune();
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertTrue("'" + language2 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language2.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertNotNull(fortune4);
        org.junit.Assert.assertNotNull(fortune5);
        org.junit.Assert.assertNotNull(fortune6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        java.lang.String str5 = givenName4.givenName;
        io.resourcepool.model.GivenName givenName6 = givenName4.clone();
        java.lang.String str7 = givenName4.toString();
        io.resourcepool.model.FullName fullName9 = givenName4.toFullName("hi!16");
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(givenName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GivenName{givenName='Shaull', nickname='', gender=MALE}" + "'", str7, "GivenName{givenName='Shaull', nickname='', gender=MALE}");
        org.junit.Assert.assertNotNull(fullName9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        int int4 = givenNamesDictionary0.size(languageArray2);
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = givenNamesDictionary0.pick((int) ' ');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary7 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] {};
        int int9 = surnamesDictionary7.size(languageArray8);
        int int10 = givenNamesDictionary0.size(languageArray8);
        java.util.List<io.resourcepool.model.GivenName> givenNameList12 = givenNamesDictionary0.pick((int) (short) 100);
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(givenNameList12);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        io.resourcepool.util.NicknameCreator nicknameCreator0 = new io.resourcepool.util.NicknameCreator();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes((int) (short) 10);
        java.util.List<io.resourcepool.model.Fortune> fortuneList6 = simpleFortuneGenerator0.nextFortunes((int) (byte) 10);
        io.resourcepool.model.Language language7 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.resourcepool.model.Fortune fortune8 = simpleFortuneGenerator0.nextFortune(language7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertNotNull(fortuneList6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        int int1 = surnamesDictionary0.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary2 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray3 = new io.resourcepool.model.Language[] {};
        int int4 = surnamesDictionary2.size(languageArray3);
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language6 = io.resourcepool.model.Language.random();
        java.lang.String str7 = language6.getLocaleCode();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] { language5, language6 };
        int int9 = surnamesDictionary2.size(languageArray8);
        io.resourcepool.model.Language language11 = io.resourcepool.model.Language.random();
        java.lang.String str12 = language11.getLocaleCode();
        java.lang.String str13 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language11);
        io.resourcepool.model.Language language15 = io.resourcepool.model.Language.random();
        java.lang.String str16 = language15.getLocaleCode();
        java.lang.String str17 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language15);
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.random();
        java.lang.String str19 = language18.getLocaleCode();
        io.resourcepool.model.Language language20 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language21 = io.resourcepool.model.Language.random();
        java.lang.String str22 = language21.getLocaleCode();
        io.resourcepool.model.Language[] languageArray23 = new io.resourcepool.model.Language[] { language11, language15, language18, language20, language21 };
        int int24 = surnamesDictionary2.size(languageArray23);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary25 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int26 = fortunesDictionary25.size();
        io.resourcepool.generator.Query.Builder builder27 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary28 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary29 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray30 = new io.resourcepool.model.Language[] {};
        int int31 = surnamesDictionary29.size(languageArray30);
        int int32 = givenNamesDictionary28.size(languageArray30);
        io.resourcepool.generator.Query.Builder builder33 = builder27.languages(languageArray30);
        int int34 = fortunesDictionary25.size(languageArray30);
        int int35 = surnamesDictionary2.size(languageArray30);
        int int36 = surnamesDictionary0.size(languageArray30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20000 + "'", int1 == 20000);
        org.junit.Assert.assertNotNull(languageArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language6 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language6.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertTrue("'" + language11 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language11.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en" + "'", str12, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!18" + "'", str13, "hi!18");
        org.junit.Assert.assertTrue("'" + language15 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language15.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en" + "'", str16, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!5" + "'", str17, "hi!5");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en" + "'", str19, "en");
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language21 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language21.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en" + "'", str22, "en");
        org.junit.Assert.assertNotNull(languageArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50000 + "'", int24 == 50000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11812 + "'", int26 == 11812);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = fortune1.clone();
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        io.resourcepool.model.Gender gender1 = io.resourcepool.model.Gender.parse("Firehi!");
        org.junit.Assert.assertNull(gender1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList8 = simpleNameGenerator0.nextNicknames(4305);
        io.resourcepool.model.GivenName givenName9 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.model.GivenName givenName10 = givenName9.clone();
        io.resourcepool.model.FullName fullName12 = givenName9.toFullName("hi!48");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(givenName9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertNotNull(fullName12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        io.resourcepool.model.Gender gender1 = io.resourcepool.model.Gender.parse("hi!18");
        org.junit.Assert.assertNull(gender1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        io.resourcepool.model.Fortune fortune2 = new io.resourcepool.model.Fortune("hi!37", "hi!37");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.Gender gender4 = givenName3.gender;
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertTrue("'" + gender4 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender4.equals(io.resourcepool.model.Gender.MALE));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.generator.Query query10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.FullName> fullNameList11 = simpleNameGenerator0.nextNames(query10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.util.List<java.lang.String> strList8 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<java.lang.String> strList10 = simpleNameGenerator0.nextNicknames((int) (byte) 10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.Gender gender5 = givenName4.gender;
        java.lang.String str6 = givenName4.nickname;
        java.lang.String str7 = givenName4.toString();
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertTrue("'" + gender5 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender5.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GivenName{givenName='Shaull', nickname='', gender=MALE}" + "'", str7, "GivenName{givenName='Shaull', nickname='', gender=MALE}");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.FullName fullName6 = givenName4.toFullName("hi!");
        java.lang.String str7 = fullName6.toString();
        java.lang.String str8 = fullName6.toString();
        java.lang.String str9 = fullName6.givenName;
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FullName{givenName='Shaull', surname='hi!', nickname='', gender=MALE}" + "'", str7, "FullName{givenName='Shaull', surname='hi!', nickname='', gender=MALE}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FullName{givenName='Shaull', surname='hi!', nickname='', gender=MALE}" + "'", str8, "FullName{givenName='Shaull', surname='hi!', nickname='', gender=MALE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Shaull" + "'", str9, "Shaull");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary3 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray4 = new io.resourcepool.model.Language[] {};
        int int5 = surnamesDictionary3.size(languageArray4);
        int int6 = surnamesDictionary0.size(languageArray4);
        java.lang.String str7 = surnamesDictionary0.pick();
        int int8 = surnamesDictionary0.size();
        int int9 = surnamesDictionary0.size();
        java.lang.String str10 = surnamesDictionary0.pick();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(languageArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Shaull" + "'", str10, "Shaull");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Language language2 = io.resourcepool.model.Language.random();
        java.lang.String str3 = language2.getLocaleCode();
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language2);
        io.resourcepool.model.Fortune fortune5 = simpleFortuneGenerator0.nextFortune(language2);
        java.lang.String str6 = fortune5.text;
        java.lang.String str7 = fortune5.source;
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertTrue("'" + language2 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language2.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(fortune5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "If at first you don't succeed, try something else." + "'", str6, "If at first you don't succeed, try something else.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Laurance J. Peter" + "'", str7, "Laurance J. Peter");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextSurnames(4305);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int1 = fortunesDictionary0.size();
        io.resourcepool.generator.Query.Builder builder2 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary3 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary4 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray5 = new io.resourcepool.model.Language[] {};
        int int6 = surnamesDictionary4.size(languageArray5);
        int int7 = givenNamesDictionary3.size(languageArray5);
        io.resourcepool.generator.Query.Builder builder8 = builder2.languages(languageArray5);
        int int9 = fortunesDictionary0.size(languageArray5);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary11 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray12 = new io.resourcepool.model.Language[] {};
        int int13 = surnamesDictionary11.size(languageArray12);
        int int14 = surnamesDictionary10.size(languageArray12);
        int int15 = fortunesDictionary0.size(languageArray12);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary16 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray17 = new io.resourcepool.model.Language[] {};
        int int18 = surnamesDictionary16.size(languageArray17);
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language20 = io.resourcepool.model.Language.random();
        java.lang.String str21 = language20.getLocaleCode();
        io.resourcepool.model.Language[] languageArray22 = new io.resourcepool.model.Language[] { language19, language20 };
        int int23 = surnamesDictionary16.size(languageArray22);
        io.resourcepool.model.Language language25 = io.resourcepool.model.Language.random();
        java.lang.String str26 = language25.getLocaleCode();
        java.lang.String str27 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language25);
        io.resourcepool.model.Language language29 = io.resourcepool.model.Language.random();
        java.lang.String str30 = language29.getLocaleCode();
        java.lang.String str31 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language29);
        io.resourcepool.model.Language language32 = io.resourcepool.model.Language.random();
        java.lang.String str33 = language32.getLocaleCode();
        io.resourcepool.model.Language language34 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language35 = io.resourcepool.model.Language.random();
        java.lang.String str36 = language35.getLocaleCode();
        io.resourcepool.model.Language[] languageArray37 = new io.resourcepool.model.Language[] { language25, language29, language32, language34, language35 };
        int int38 = surnamesDictionary16.size(languageArray37);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary39 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int40 = fortunesDictionary39.size();
        io.resourcepool.generator.Query.Builder builder41 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary42 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary43 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray44 = new io.resourcepool.model.Language[] {};
        int int45 = surnamesDictionary43.size(languageArray44);
        int int46 = givenNamesDictionary42.size(languageArray44);
        io.resourcepool.generator.Query.Builder builder47 = builder41.languages(languageArray44);
        int int48 = fortunesDictionary39.size(languageArray44);
        int int49 = surnamesDictionary16.size(languageArray44);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary51 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray52 = new io.resourcepool.model.Language[] {};
        int int53 = surnamesDictionary51.size(languageArray52);
        io.resourcepool.model.Language language54 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language55 = io.resourcepool.model.Language.random();
        java.lang.String str56 = language55.getLocaleCode();
        io.resourcepool.model.Language[] languageArray57 = new io.resourcepool.model.Language[] { language54, language55 };
        int int58 = surnamesDictionary51.size(languageArray57);
        io.resourcepool.generator.Query query59 = new io.resourcepool.generator.Query(20000, languageArray57);
        java.util.List<java.lang.String> strList60 = surnamesDictionary16.pick(query59);
        java.util.List<io.resourcepool.model.Fortune> fortuneList61 = fortunesDictionary0.pick(query59);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(languageArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(languageArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en" + "'", str21, "en");
        org.junit.Assert.assertNotNull(languageArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertTrue("'" + language25 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language25.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en" + "'", str26, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!36" + "'", str27, "hi!36");
        org.junit.Assert.assertTrue("'" + language29 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language29.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en" + "'", str30, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!89" + "'", str31, "hi!89");
        org.junit.Assert.assertTrue("'" + language32 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language32.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "en" + "'", str33, "en");
        org.junit.Assert.assertTrue("'" + language34 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language34.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language35 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language35.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "en" + "'", str36, "en");
        org.junit.Assert.assertNotNull(languageArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 50000 + "'", int38 == 50000);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 11812 + "'", int40 == 11812);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(languageArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(languageArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + language54 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language54.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language55 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language55.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "en" + "'", str56, "en");
        org.junit.Assert.assertNotNull(languageArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 20000 + "'", int58 == 20000);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(fortuneList61);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList2 = givenNamesDictionary0.pick(10000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = simpleNameGenerator0.nextGivenNames(0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(givenNameList6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.model.Gender gender11 = givenName10.gender;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertTrue("'" + gender11 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender11.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int1 = givenNamesDictionary0.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary2 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary3 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList5 = surnamesDictionary3.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary7 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] {};
        int int9 = surnamesDictionary7.size(languageArray8);
        io.resourcepool.model.Language language10 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language11 = io.resourcepool.model.Language.random();
        java.lang.String str12 = language11.getLocaleCode();
        io.resourcepool.model.Language[] languageArray13 = new io.resourcepool.model.Language[] { language10, language11 };
        int int14 = surnamesDictionary7.size(languageArray13);
        io.resourcepool.generator.Query query15 = new io.resourcepool.generator.Query(20000, languageArray13);
        java.util.List<java.lang.String> strList16 = surnamesDictionary3.pick(query15);
        java.util.List<java.lang.String> strList17 = surnamesDictionary2.pick(query15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList18 = givenNamesDictionary0.pick(query15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4305 + "'", int1 == 4305);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + language10 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language10.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language11 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language11.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en" + "'", str12, "en");
        org.junit.Assert.assertNotNull(languageArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList3 = simpleFortuneGenerator0.nextFortunes(10000);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortuneList3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        io.resourcepool.model.Language language1 = io.resourcepool.model.Language.random();
        java.lang.String str2 = language1.getLocaleCode();
        java.lang.String str3 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language1);
        java.lang.String str4 = language1.getLocaleCode();
        java.util.List<io.resourcepool.model.GivenName> givenNameList5 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language1);
        org.junit.Assert.assertTrue("'" + language1 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language1.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!83" + "'", str3, "hi!83");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertNotNull(givenNameList5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        io.resourcepool.generator.Query.Builder builder0 = io.resourcepool.generator.Query.builder();
        // The following exception was thrown during execution in test generation
        try {
            io.resourcepool.generator.Query.Builder builder2 = builder0.count(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Count must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        io.resourcepool.model.Language language9 = io.resourcepool.model.Language.random();
        java.lang.String str10 = language9.getLocaleCode();
        java.lang.String str11 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language9);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.random();
        java.lang.String str14 = language13.getLocaleCode();
        java.lang.String str15 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language13);
        io.resourcepool.model.Language language16 = io.resourcepool.model.Language.random();
        java.lang.String str17 = language16.getLocaleCode();
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        java.lang.String str20 = language19.getLocaleCode();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] { language9, language13, language16, language18, language19 };
        int int22 = surnamesDictionary0.size(languageArray21);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary23 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int24 = fortunesDictionary23.size();
        io.resourcepool.generator.Query.Builder builder25 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary26 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary27 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray28 = new io.resourcepool.model.Language[] {};
        int int29 = surnamesDictionary27.size(languageArray28);
        int int30 = givenNamesDictionary26.size(languageArray28);
        io.resourcepool.generator.Query.Builder builder31 = builder25.languages(languageArray28);
        int int32 = fortunesDictionary23.size(languageArray28);
        int int33 = surnamesDictionary0.size(languageArray28);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary35 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray36 = new io.resourcepool.model.Language[] {};
        int int37 = surnamesDictionary35.size(languageArray36);
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language39 = io.resourcepool.model.Language.random();
        java.lang.String str40 = language39.getLocaleCode();
        io.resourcepool.model.Language[] languageArray41 = new io.resourcepool.model.Language[] { language38, language39 };
        int int42 = surnamesDictionary35.size(languageArray41);
        io.resourcepool.generator.Query query43 = new io.resourcepool.generator.Query(20000, languageArray41);
        java.util.List<java.lang.String> strList44 = surnamesDictionary0.pick(query43);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator45 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList47 = simpleNameGenerator45.nextSurnames(1);
        java.lang.String str48 = simpleNameGenerator45.nextNickname();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary49 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList51 = surnamesDictionary49.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary53 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray54 = new io.resourcepool.model.Language[] {};
        int int55 = surnamesDictionary53.size(languageArray54);
        io.resourcepool.model.Language language56 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language57 = io.resourcepool.model.Language.random();
        java.lang.String str58 = language57.getLocaleCode();
        io.resourcepool.model.Language[] languageArray59 = new io.resourcepool.model.Language[] { language56, language57 };
        int int60 = surnamesDictionary53.size(languageArray59);
        io.resourcepool.generator.Query query61 = new io.resourcepool.generator.Query(20000, languageArray59);
        java.util.List<java.lang.String> strList62 = surnamesDictionary49.pick(query61);
        java.util.List<io.resourcepool.model.FullName> fullNameList63 = simpleNameGenerator45.nextNames(query61);
        java.util.List<java.lang.String> strList64 = surnamesDictionary0.pick(query61);
        int int65 = surnamesDictionary0.size();
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!24" + "'", str11, "hi!24");
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Soberhi!" + "'", str15, "Soberhi!");
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50000 + "'", int22 == 50000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11812 + "'", int24 == 11812);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(languageArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(languageArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language39 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language39.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "en" + "'", str40, "en");
        org.junit.Assert.assertNotNull(languageArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20000 + "'", int42 == 20000);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Mamie23" + "'", str48, "Mamie23");
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(languageArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + language56 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language56.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language57 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language57.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "en" + "'", str58, "en");
        org.junit.Assert.assertNotNull(languageArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 20000 + "'", int60 == 20000);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(fullNameList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 20000 + "'", int65 == 20000);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        int int4 = givenNamesDictionary0.size(languageArray2);
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = givenNamesDictionary0.pick((int) ' ');
        java.util.List<io.resourcepool.model.GivenName> givenNameList8 = givenNamesDictionary0.pick(4305);
        java.util.List<io.resourcepool.model.GivenName> givenNameList10 = givenNamesDictionary0.pick((int) (short) 1);
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(givenNameList8);
        org.junit.Assert.assertNotNull(givenNameList10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextNicknames((int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<io.resourcepool.model.FullName> fullNameList8 = simpleNameGenerator0.nextNames((int) (short) 10);
        java.lang.String str9 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(fullNameList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Shaull" + "'", str9, "Shaull");
        org.junit.Assert.assertNotNull(givenName10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.FullName fullName6 = givenName4.toFullName("hi!");
        io.resourcepool.model.GivenName givenName7 = givenName4.clone();
        java.lang.String str8 = givenName7.toString();
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(givenName7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GivenName{givenName='Shaull', nickname='', gender=MALE}" + "'", str8, "GivenName{givenName='Shaull', nickname='', gender=MALE}");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        io.resourcepool.model.Language language9 = io.resourcepool.model.Language.random();
        java.lang.String str10 = language9.getLocaleCode();
        java.lang.String str11 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language9);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.random();
        java.lang.String str14 = language13.getLocaleCode();
        java.lang.String str15 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language13);
        io.resourcepool.model.Language language16 = io.resourcepool.model.Language.random();
        java.lang.String str17 = language16.getLocaleCode();
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        java.lang.String str20 = language19.getLocaleCode();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] { language9, language13, language16, language18, language19 };
        int int22 = surnamesDictionary0.size(languageArray21);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary23 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int24 = fortunesDictionary23.size();
        io.resourcepool.generator.Query.Builder builder25 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary26 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary27 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray28 = new io.resourcepool.model.Language[] {};
        int int29 = surnamesDictionary27.size(languageArray28);
        int int30 = givenNamesDictionary26.size(languageArray28);
        io.resourcepool.generator.Query.Builder builder31 = builder25.languages(languageArray28);
        int int32 = fortunesDictionary23.size(languageArray28);
        int int33 = surnamesDictionary0.size(languageArray28);
        java.lang.String str34 = surnamesDictionary0.pick();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary35 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int36 = givenNamesDictionary35.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary37 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList39 = surnamesDictionary37.pick((int) 'a');
        int int40 = surnamesDictionary37.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary41 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray42 = new io.resourcepool.model.Language[] {};
        int int43 = surnamesDictionary41.size(languageArray42);
        io.resourcepool.model.Language language44 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language45 = io.resourcepool.model.Language.random();
        java.lang.String str46 = language45.getLocaleCode();
        io.resourcepool.model.Language[] languageArray47 = new io.resourcepool.model.Language[] { language44, language45 };
        int int48 = surnamesDictionary41.size(languageArray47);
        io.resourcepool.model.Language language50 = io.resourcepool.model.Language.random();
        java.lang.String str51 = language50.getLocaleCode();
        java.lang.String str52 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language50);
        io.resourcepool.model.Language language54 = io.resourcepool.model.Language.random();
        java.lang.String str55 = language54.getLocaleCode();
        java.lang.String str56 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language54);
        io.resourcepool.model.Language language57 = io.resourcepool.model.Language.random();
        java.lang.String str58 = language57.getLocaleCode();
        io.resourcepool.model.Language language59 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language60 = io.resourcepool.model.Language.random();
        java.lang.String str61 = language60.getLocaleCode();
        io.resourcepool.model.Language[] languageArray62 = new io.resourcepool.model.Language[] { language50, language54, language57, language59, language60 };
        int int63 = surnamesDictionary41.size(languageArray62);
        int int64 = surnamesDictionary37.size(languageArray62);
        int int65 = givenNamesDictionary35.size(languageArray62);
        int int66 = surnamesDictionary0.size(languageArray62);
        java.lang.String str67 = surnamesDictionary0.pick();
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!77" + "'", str11, "hi!77");
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!63" + "'", str15, "hi!63");
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50000 + "'", int22 == 50000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11812 + "'", int24 == 11812);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(languageArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Shaull" + "'", str34, "Shaull");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4305 + "'", int36 == 4305);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20000 + "'", int40 == 20000);
        org.junit.Assert.assertNotNull(languageArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + language44 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language44.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language45 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language45.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "en" + "'", str46, "en");
        org.junit.Assert.assertNotNull(languageArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 20000 + "'", int48 == 20000);
        org.junit.Assert.assertTrue("'" + language50 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language50.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "en" + "'", str51, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!61" + "'", str52, "hi!61");
        org.junit.Assert.assertTrue("'" + language54 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language54.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "en" + "'", str55, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!96" + "'", str56, "hi!96");
        org.junit.Assert.assertTrue("'" + language57 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language57.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "en" + "'", str58, "en");
        org.junit.Assert.assertTrue("'" + language59 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language59.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language60 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language60.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "en" + "'", str61, "en");
        org.junit.Assert.assertNotNull(languageArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 50000 + "'", int63 == 50000);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 50000 + "'", int64 == 50000);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10000 + "'", int65 == 10000);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 50000 + "'", int66 == 50000);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Shaull" + "'", str67, "Shaull");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes(0);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator3 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune4 = simpleFortuneGenerator3.nextFortune();
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        java.lang.String str6 = language5.getLocaleCode();
        io.resourcepool.model.Fortune fortune7 = simpleFortuneGenerator3.nextFortune(language5);
        io.resourcepool.model.Fortune fortune8 = simpleFortuneGenerator0.nextFortune(language5);
        io.resourcepool.model.Fortune fortune9 = simpleFortuneGenerator0.nextFortune();
        org.junit.Assert.assertNotNull(fortuneList2);
        org.junit.Assert.assertNotNull(fortune4);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(fortune7);
        org.junit.Assert.assertNotNull(fortune8);
        org.junit.Assert.assertNotNull(fortune9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList12 = simpleNameGenerator0.nextGivenNames(50000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        io.resourcepool.model.Gender gender5 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName6 = new io.resourcepool.model.GivenName("Shaull", "Shaull", gender5);
        io.resourcepool.model.FullName fullName7 = new io.resourcepool.model.FullName("hi!13", "Laurance J. Peter", "hi!34", gender5);
        org.junit.Assert.assertTrue("'" + gender5 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender5.equals(io.resourcepool.model.Gender.MALE));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        io.resourcepool.model.Gender gender4 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName5 = new io.resourcepool.model.GivenName("Shaull", "Shaull", gender4);
        io.resourcepool.model.GivenName givenName6 = new io.resourcepool.model.GivenName("Mamie23", "Shaull", gender4);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary7 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList9 = surnamesDictionary7.pick((int) 'a');
        int int10 = surnamesDictionary7.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary11 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray12 = new io.resourcepool.model.Language[] {};
        int int13 = surnamesDictionary11.size(languageArray12);
        io.resourcepool.model.Language language14 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language15 = io.resourcepool.model.Language.random();
        java.lang.String str16 = language15.getLocaleCode();
        io.resourcepool.model.Language[] languageArray17 = new io.resourcepool.model.Language[] { language14, language15 };
        int int18 = surnamesDictionary11.size(languageArray17);
        io.resourcepool.model.Language language20 = io.resourcepool.model.Language.random();
        java.lang.String str21 = language20.getLocaleCode();
        java.lang.String str22 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language20);
        io.resourcepool.model.Language language24 = io.resourcepool.model.Language.random();
        java.lang.String str25 = language24.getLocaleCode();
        java.lang.String str26 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language24);
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.random();
        java.lang.String str28 = language27.getLocaleCode();
        io.resourcepool.model.Language language29 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language30 = io.resourcepool.model.Language.random();
        java.lang.String str31 = language30.getLocaleCode();
        io.resourcepool.model.Language[] languageArray32 = new io.resourcepool.model.Language[] { language20, language24, language27, language29, language30 };
        int int33 = surnamesDictionary11.size(languageArray32);
        int int34 = surnamesDictionary7.size(languageArray32);
        boolean boolean35 = givenName6.equals((java.lang.Object) languageArray32);
        java.lang.String str36 = givenName6.givenName;
        org.junit.Assert.assertTrue("'" + gender4 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender4.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertNotNull(languageArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + language14 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language14.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language15 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language15.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en" + "'", str16, "en");
        org.junit.Assert.assertNotNull(languageArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20000 + "'", int18 == 20000);
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en" + "'", str21, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!10" + "'", str22, "hi!10");
        org.junit.Assert.assertTrue("'" + language24 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language24.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!55" + "'", str26, "hi!55");
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en" + "'", str28, "en");
        org.junit.Assert.assertTrue("'" + language29 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language29.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language30 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language30.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en" + "'", str31, "en");
        org.junit.Assert.assertNotNull(languageArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 50000 + "'", int33 == 50000);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 50000 + "'", int34 == 50000);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Mamie23" + "'", str36, "Mamie23");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        io.resourcepool.generator.Query.Builder builder0 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray1 = null;
        io.resourcepool.generator.Query.Builder builder2 = builder0.languages(languageArray1);
        io.resourcepool.generator.Query.Builder builder4 = builder0.count((int) (byte) 1);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary5 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList7 = surnamesDictionary5.pick((int) 'a');
        int int8 = surnamesDictionary5.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary9 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray10 = new io.resourcepool.model.Language[] {};
        int int11 = surnamesDictionary9.size(languageArray10);
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.random();
        java.lang.String str14 = language13.getLocaleCode();
        io.resourcepool.model.Language[] languageArray15 = new io.resourcepool.model.Language[] { language12, language13 };
        int int16 = surnamesDictionary9.size(languageArray15);
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.random();
        java.lang.String str19 = language18.getLocaleCode();
        java.lang.String str20 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language18);
        io.resourcepool.model.Language language22 = io.resourcepool.model.Language.random();
        java.lang.String str23 = language22.getLocaleCode();
        java.lang.String str24 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language22);
        io.resourcepool.model.Language language25 = io.resourcepool.model.Language.random();
        java.lang.String str26 = language25.getLocaleCode();
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language28 = io.resourcepool.model.Language.random();
        java.lang.String str29 = language28.getLocaleCode();
        io.resourcepool.model.Language[] languageArray30 = new io.resourcepool.model.Language[] { language18, language22, language25, language27, language28 };
        int int31 = surnamesDictionary9.size(languageArray30);
        int int32 = surnamesDictionary5.size(languageArray30);
        io.resourcepool.generator.Query.Builder builder33 = builder0.languages(languageArray30);
        // The following exception was thrown during execution in test generation
        try {
            io.resourcepool.generator.Query.Builder builder35 = builder0.count(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Count must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertNotNull(languageArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en" + "'", str19, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cleverhi!" + "'", str20, "Cleverhi!");
        org.junit.Assert.assertTrue("'" + language22 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language22.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en" + "'", str23, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!22" + "'", str24, "hi!22");
        org.junit.Assert.assertTrue("'" + language25 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language25.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en" + "'", str26, "en");
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en" + "'", str29, "en");
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 50000 + "'", int31 == 50000);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 50000 + "'", int32 == 50000);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList13 = simpleNameGenerator0.nextSurnames(10);
        io.resourcepool.model.FullName fullName14 = simpleNameGenerator0.nextName();
        java.util.List<io.resourcepool.model.FullName> fullNameList16 = simpleNameGenerator0.nextNames((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(fullName14);
        org.junit.Assert.assertNotNull(fullNameList16);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        io.resourcepool.model.FullName fullName7 = simpleNameGenerator0.nextName();
        java.lang.String str8 = fullName7.toString();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(fullName7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}" + "'", str8, "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int1 = givenNamesDictionary0.size();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary2 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary3 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray4 = new io.resourcepool.model.Language[] {};
        int int5 = surnamesDictionary3.size(languageArray4);
        int int6 = givenNamesDictionary2.size(languageArray4);
        int int7 = givenNamesDictionary0.size(languageArray4);
        java.util.List<io.resourcepool.model.GivenName> givenNameList9 = givenNamesDictionary0.pick(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4305 + "'", int1 == 4305);
        org.junit.Assert.assertNotNull(languageArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(givenNameList9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.FullName fullName6 = givenName4.toFullName("hi!");
        java.lang.String str7 = fullName6.givenName;
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.FullName fullName5 = givenName3.toFullName("hi!13");
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(fullName5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        java.util.List<java.lang.String> strList9 = surnamesDictionary0.pick((int) (byte) 10);
        int int10 = surnamesDictionary0.size();
        io.resourcepool.model.Language language11 = io.resourcepool.model.Language.random();
        java.lang.String str12 = language11.getLocaleCode();
        java.util.List<io.resourcepool.model.Fortune> fortuneList13 = io.resourcepool.dictionary.loader.FortuneLoader.load(language11);
        java.lang.String str14 = surnamesDictionary0.pick(language11);
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertTrue("'" + language11 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language11.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en" + "'", str12, "en");
        org.junit.Assert.assertNotNull(fortuneList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Shaull" + "'", str14, "Shaull");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        io.resourcepool.generator.Query.Builder builder0 = io.resourcepool.generator.Query.builder();
        io.resourcepool.generator.Query query1 = builder0.build();
        int int2 = query1.count;
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(query1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator8 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList10 = simpleNameGenerator8.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList12 = simpleNameGenerator8.nextGivenNames(100);
        java.lang.String str13 = simpleNameGenerator8.nextSurname();
        io.resourcepool.model.FullName fullName14 = simpleNameGenerator8.nextName();
        java.lang.String str15 = fullName14.surname;
        io.resourcepool.model.Gender gender16 = fullName14.gender;
        io.resourcepool.model.GivenName givenName17 = new io.resourcepool.model.GivenName("Mamie23", "Ultimatehi!", gender16);
        io.resourcepool.model.FullName fullName18 = new io.resourcepool.model.FullName("TheOnlyhi!", "hi!91", "GivenName{givenName='Shaull', nickname='', gender=MALE}", gender16);
        io.resourcepool.model.FullName fullName19 = new io.resourcepool.model.FullName("hi!69", "", "hi!91", gender16);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(givenNameList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Shaull" + "'", str13, "Shaull");
        org.junit.Assert.assertNotNull(fullName14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Shaull" + "'", str15, "Shaull");
        org.junit.Assert.assertTrue("'" + gender16 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender16.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "Shaull", gender2);
        java.lang.String str4 = givenName3.nickname;
        io.resourcepool.model.GivenName givenName5 = givenName3.clone();
        java.lang.String str6 = givenName3.givenName;
        io.resourcepool.model.GivenName givenName7 = givenName3.clone();
        io.resourcepool.model.Gender gender8 = givenName7.gender;
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Shaull" + "'", str4, "Shaull");
        org.junit.Assert.assertNotNull(givenName5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Shaull" + "'", str6, "Shaull");
        org.junit.Assert.assertNotNull(givenName7);
        org.junit.Assert.assertTrue("'" + gender8 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender8.equals(io.resourcepool.model.Gender.MALE));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        io.resourcepool.model.FullName fullName7 = simpleNameGenerator0.nextName();
        io.resourcepool.model.FullName fullName8 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList10 = simpleNameGenerator0.nextNicknames((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(fullName7);
        org.junit.Assert.assertNotNull(fullName8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        io.resourcepool.model.Fortune fortune2 = new io.resourcepool.model.Fortune("en", "Mary");
        java.lang.String str3 = fortune2.text;
        java.lang.String str4 = fortune2.text;
        java.lang.String str5 = fortune2.text;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.Gender gender5 = givenName4.gender;
        io.resourcepool.model.FullName fullName7 = givenName4.toFullName("hi!48");
        boolean boolean9 = givenName4.equals((java.lang.Object) "Soberhi!");
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertTrue("'" + gender5 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender5.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(fullName7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        int int4 = givenNamesDictionary0.size(languageArray2);
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = givenNamesDictionary0.pick((int) ' ');
        java.util.List<io.resourcepool.model.GivenName> givenNameList8 = givenNamesDictionary0.pick(4305);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList10 = givenNamesDictionary0.pick(50000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(givenNameList8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        java.lang.String str8 = surnamesDictionary0.pick();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary9 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList11 = surnamesDictionary9.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary12 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray13 = new io.resourcepool.model.Language[] {};
        int int14 = surnamesDictionary12.size(languageArray13);
        int int15 = surnamesDictionary9.size(languageArray13);
        java.lang.String str16 = surnamesDictionary9.pick();
        java.lang.String str17 = surnamesDictionary9.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator18 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune19 = simpleFortuneGenerator18.nextFortune();
        io.resourcepool.model.Language language20 = io.resourcepool.model.Language.random();
        java.lang.String str21 = language20.getLocaleCode();
        io.resourcepool.model.Fortune fortune22 = simpleFortuneGenerator18.nextFortune(language20);
        java.lang.String str23 = surnamesDictionary9.pick(language20);
        java.util.List<java.lang.String> strList24 = io.resourcepool.dictionary.loader.NameLoader.loadSurnames(language20);
        java.lang.String str25 = surnamesDictionary0.pick(language20);
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(languageArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Shaull" + "'", str16, "Shaull");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Shaull" + "'", str17, "Shaull");
        org.junit.Assert.assertNotNull(fortune19);
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en" + "'", str21, "en");
        org.junit.Assert.assertNotNull(fortune22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Shaull" + "'", str23, "Shaull");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Shaull" + "'", str25, "Shaull");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int1 = fortunesDictionary0.size();
        io.resourcepool.generator.Query.Builder builder2 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary3 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary4 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray5 = new io.resourcepool.model.Language[] {};
        int int6 = surnamesDictionary4.size(languageArray5);
        int int7 = givenNamesDictionary3.size(languageArray5);
        io.resourcepool.generator.Query.Builder builder8 = builder2.languages(languageArray5);
        int int9 = fortunesDictionary0.size(languageArray5);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary10 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int11 = fortunesDictionary10.size();
        io.resourcepool.generator.Query.Builder builder12 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary13 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary14 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray15 = new io.resourcepool.model.Language[] {};
        int int16 = surnamesDictionary14.size(languageArray15);
        int int17 = givenNamesDictionary13.size(languageArray15);
        io.resourcepool.generator.Query.Builder builder18 = builder12.languages(languageArray15);
        int int19 = fortunesDictionary10.size(languageArray15);
        int int20 = fortunesDictionary0.size(languageArray15);
        io.resourcepool.model.Gender gender26 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName27 = new io.resourcepool.model.GivenName("Shaull", "Shaull", gender26);
        io.resourcepool.model.GivenName givenName28 = new io.resourcepool.model.GivenName("Mamie23", "Shaull", gender26);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary29 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList31 = surnamesDictionary29.pick((int) 'a');
        int int32 = surnamesDictionary29.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary33 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray34 = new io.resourcepool.model.Language[] {};
        int int35 = surnamesDictionary33.size(languageArray34);
        io.resourcepool.model.Language language36 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language37 = io.resourcepool.model.Language.random();
        java.lang.String str38 = language37.getLocaleCode();
        io.resourcepool.model.Language[] languageArray39 = new io.resourcepool.model.Language[] { language36, language37 };
        int int40 = surnamesDictionary33.size(languageArray39);
        io.resourcepool.model.Language language42 = io.resourcepool.model.Language.random();
        java.lang.String str43 = language42.getLocaleCode();
        java.lang.String str44 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language42);
        io.resourcepool.model.Language language46 = io.resourcepool.model.Language.random();
        java.lang.String str47 = language46.getLocaleCode();
        java.lang.String str48 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language46);
        io.resourcepool.model.Language language49 = io.resourcepool.model.Language.random();
        java.lang.String str50 = language49.getLocaleCode();
        io.resourcepool.model.Language language51 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language52 = io.resourcepool.model.Language.random();
        java.lang.String str53 = language52.getLocaleCode();
        io.resourcepool.model.Language[] languageArray54 = new io.resourcepool.model.Language[] { language42, language46, language49, language51, language52 };
        int int55 = surnamesDictionary33.size(languageArray54);
        int int56 = surnamesDictionary29.size(languageArray54);
        boolean boolean57 = givenName28.equals((java.lang.Object) languageArray54);
        io.resourcepool.generator.Query query58 = new io.resourcepool.generator.Query((int) '4', languageArray54);
        java.util.List<io.resourcepool.model.Fortune> fortuneList59 = fortunesDictionary0.pick(query58);
        java.util.List<io.resourcepool.model.Fortune> fortuneList61 = fortunesDictionary0.pick(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11812 + "'", int11 == 11812);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + gender26 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender26.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20000 + "'", int32 == 20000);
        org.junit.Assert.assertNotNull(languageArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + language36 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language36.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en" + "'", str38, "en");
        org.junit.Assert.assertNotNull(languageArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20000 + "'", int40 == 20000);
        org.junit.Assert.assertTrue("'" + language42 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language42.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "en" + "'", str43, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!51" + "'", str44, "hi!51");
        org.junit.Assert.assertTrue("'" + language46 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language46.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "en" + "'", str47, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!56" + "'", str48, "hi!56");
        org.junit.Assert.assertTrue("'" + language49 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language49.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "en" + "'", str50, "en");
        org.junit.Assert.assertTrue("'" + language51 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language51.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language52 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language52.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "en" + "'", str53, "en");
        org.junit.Assert.assertNotNull(languageArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 50000 + "'", int55 == 50000);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 50000 + "'", int56 == 50000);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(fortuneList59);
        org.junit.Assert.assertNotNull(fortuneList61);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        java.lang.String str5 = givenName4.givenName;
        io.resourcepool.model.GivenName givenName6 = givenName4.clone();
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator7 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator7.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList11 = simpleNameGenerator7.nextGivenNames(100);
        java.util.List<java.lang.String> strList13 = simpleNameGenerator7.nextSurnames((int) (byte) 1);
        java.util.List<java.lang.String> strList15 = simpleNameGenerator7.nextSurnames(1);
        boolean boolean16 = givenName6.equals((java.lang.Object) simpleNameGenerator7);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary17 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int18 = fortunesDictionary17.size();
        io.resourcepool.generator.Query.Builder builder19 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary20 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary21 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray22 = new io.resourcepool.model.Language[] {};
        int int23 = surnamesDictionary21.size(languageArray22);
        int int24 = givenNamesDictionary20.size(languageArray22);
        io.resourcepool.generator.Query.Builder builder25 = builder19.languages(languageArray22);
        int int26 = fortunesDictionary17.size(languageArray22);
        java.util.List<io.resourcepool.model.Fortune> fortuneList28 = fortunesDictionary17.pick((int) (short) 1);
        io.resourcepool.model.Fortune fortune29 = fortunesDictionary17.pick();
        boolean boolean30 = givenName6.equals((java.lang.Object) fortunesDictionary17);
        io.resourcepool.model.GivenName givenName31 = givenName6.clone();
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(givenName6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenNameList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11812 + "'", int18 == 11812);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(languageArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fortuneList28);
        org.junit.Assert.assertNotNull(fortune29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(givenName31);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList3 = surnamesDictionary1.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary4 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray5 = new io.resourcepool.model.Language[] {};
        int int6 = surnamesDictionary4.size(languageArray5);
        int int7 = surnamesDictionary1.size(languageArray5);
        java.lang.String str8 = surnamesDictionary1.pick();
        java.lang.String str9 = surnamesDictionary1.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator10 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune11 = simpleFortuneGenerator10.nextFortune();
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.random();
        java.lang.String str13 = language12.getLocaleCode();
        io.resourcepool.model.Fortune fortune14 = simpleFortuneGenerator10.nextFortune(language12);
        java.lang.String str15 = surnamesDictionary1.pick(language12);
        java.lang.String str16 = io.resourcepool.util.NicknameCreator.fromFirstName("GivenName{givenName='Shaull', nickname='', gender=MALE}", language12);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Shaull" + "'", str9, "Shaull");
        org.junit.Assert.assertNotNull(fortune11);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertNotNull(fortune14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Shaull" + "'", str15, "Shaull");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GivenName{givenName='Shaull', nickname='', gender=MALE}15" + "'", str16, "GivenName{givenName='Shaull', nickname='', gender=MALE}15");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.lang.String str7 = simpleNameGenerator0.nextNickname();
        java.lang.String str8 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.GivenName givenName9 = simpleNameGenerator0.nextGivenName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mamie23" + "'", str7, "Mamie23");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertNotNull(givenName9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        int int1 = surnamesDictionary0.size();
        java.lang.String str2 = surnamesDictionary0.pick();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20000 + "'", int1 == 20000);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Shaull" + "'", str2, "Shaull");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        int int4 = givenNamesDictionary0.size(languageArray2);
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = givenNamesDictionary0.pick((int) ' ');
        java.util.List<io.resourcepool.model.GivenName> givenNameList8 = givenNamesDictionary0.pick(4305);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary9 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList11 = surnamesDictionary9.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary12 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray13 = new io.resourcepool.model.Language[] {};
        int int14 = surnamesDictionary12.size(languageArray13);
        int int15 = surnamesDictionary9.size(languageArray13);
        java.lang.String str16 = surnamesDictionary9.pick();
        java.lang.String str17 = surnamesDictionary9.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator18 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune19 = simpleFortuneGenerator18.nextFortune();
        io.resourcepool.model.Language language20 = io.resourcepool.model.Language.random();
        java.lang.String str21 = language20.getLocaleCode();
        io.resourcepool.model.Fortune fortune22 = simpleFortuneGenerator18.nextFortune(language20);
        java.lang.String str23 = surnamesDictionary9.pick(language20);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary25 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray26 = new io.resourcepool.model.Language[] {};
        int int27 = surnamesDictionary25.size(languageArray26);
        io.resourcepool.model.Language language28 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language29 = io.resourcepool.model.Language.random();
        java.lang.String str30 = language29.getLocaleCode();
        io.resourcepool.model.Language[] languageArray31 = new io.resourcepool.model.Language[] { language28, language29 };
        int int32 = surnamesDictionary25.size(languageArray31);
        io.resourcepool.generator.Query query33 = new io.resourcepool.generator.Query(20000, languageArray31);
        java.util.List<java.lang.String> strList34 = surnamesDictionary9.pick(query33);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList35 = givenNamesDictionary0.pick(query33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(givenNameList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(languageArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Shaull" + "'", str16, "Shaull");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Shaull" + "'", str17, "Shaull");
        org.junit.Assert.assertNotNull(fortune19);
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en" + "'", str21, "en");
        org.junit.Assert.assertNotNull(fortune22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Shaull" + "'", str23, "Shaull");
        org.junit.Assert.assertNotNull(languageArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language29 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language29.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en" + "'", str30, "en");
        org.junit.Assert.assertNotNull(languageArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20000 + "'", int32 == 20000);
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        java.lang.String str5 = givenName4.givenName;
        io.resourcepool.model.GivenName givenName6 = givenName4.clone();
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator7 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator7.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList11 = simpleNameGenerator7.nextGivenNames(100);
        java.util.List<java.lang.String> strList13 = simpleNameGenerator7.nextSurnames((int) (byte) 1);
        java.util.List<java.lang.String> strList15 = simpleNameGenerator7.nextSurnames(1);
        boolean boolean16 = givenName6.equals((java.lang.Object) simpleNameGenerator7);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator17 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList19 = simpleNameGenerator17.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList21 = simpleNameGenerator17.nextGivenNames(100);
        java.lang.String str22 = simpleNameGenerator17.nextSurname();
        io.resourcepool.model.FullName fullName23 = simpleNameGenerator17.nextName();
        io.resourcepool.model.Gender gender24 = fullName23.gender;
        boolean boolean25 = givenName6.equals((java.lang.Object) gender24);
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(givenName6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenNameList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(givenNameList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Shaull" + "'", str22, "Shaull");
        org.junit.Assert.assertNotNull(fullName23);
        org.junit.Assert.assertTrue("'" + gender24 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender24.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        java.lang.String str5 = givenName4.givenName;
        io.resourcepool.model.GivenName givenName6 = givenName4.clone();
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator7 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator7.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList11 = simpleNameGenerator7.nextGivenNames(100);
        java.util.List<java.lang.String> strList13 = simpleNameGenerator7.nextSurnames((int) (byte) 1);
        java.util.List<java.lang.String> strList15 = simpleNameGenerator7.nextSurnames(1);
        boolean boolean16 = givenName6.equals((java.lang.Object) simpleNameGenerator7);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary17 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int18 = fortunesDictionary17.size();
        io.resourcepool.generator.Query.Builder builder19 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary20 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary21 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray22 = new io.resourcepool.model.Language[] {};
        int int23 = surnamesDictionary21.size(languageArray22);
        int int24 = givenNamesDictionary20.size(languageArray22);
        io.resourcepool.generator.Query.Builder builder25 = builder19.languages(languageArray22);
        int int26 = fortunesDictionary17.size(languageArray22);
        java.util.List<io.resourcepool.model.Fortune> fortuneList28 = fortunesDictionary17.pick((int) (short) 1);
        io.resourcepool.model.Fortune fortune29 = fortunesDictionary17.pick();
        boolean boolean30 = givenName6.equals((java.lang.Object) fortunesDictionary17);
        io.resourcepool.model.Gender gender31 = givenName6.gender;
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(givenName6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenNameList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11812 + "'", int18 == 11812);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(languageArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(fortuneList28);
        org.junit.Assert.assertNotNull(fortune29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + gender31 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender31.equals(io.resourcepool.model.Gender.MALE));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        io.resourcepool.model.FullName fullName7 = simpleNameGenerator0.nextName();
        io.resourcepool.model.FullName fullName8 = simpleNameGenerator0.nextName();
        io.resourcepool.model.GivenName givenName9 = simpleNameGenerator0.nextGivenName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(fullName7);
        org.junit.Assert.assertNotNull(fullName8);
        org.junit.Assert.assertNotNull(givenName9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int1 = givenNamesDictionary0.size();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary2 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary3 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray4 = new io.resourcepool.model.Language[] {};
        int int5 = surnamesDictionary3.size(languageArray4);
        int int6 = givenNamesDictionary2.size(languageArray4);
        int int7 = givenNamesDictionary0.size(languageArray4);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary8 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList10 = surnamesDictionary8.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary11 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray12 = new io.resourcepool.model.Language[] {};
        int int13 = surnamesDictionary11.size(languageArray12);
        int int14 = surnamesDictionary8.size(languageArray12);
        java.lang.String str15 = surnamesDictionary8.pick();
        java.lang.String str16 = surnamesDictionary8.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator17 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune18 = simpleFortuneGenerator17.nextFortune();
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        java.lang.String str20 = language19.getLocaleCode();
        io.resourcepool.model.Fortune fortune21 = simpleFortuneGenerator17.nextFortune(language19);
        java.lang.String str22 = surnamesDictionary8.pick(language19);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary24 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray25 = new io.resourcepool.model.Language[] {};
        int int26 = surnamesDictionary24.size(languageArray25);
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language28 = io.resourcepool.model.Language.random();
        java.lang.String str29 = language28.getLocaleCode();
        io.resourcepool.model.Language[] languageArray30 = new io.resourcepool.model.Language[] { language27, language28 };
        int int31 = surnamesDictionary24.size(languageArray30);
        io.resourcepool.generator.Query query32 = new io.resourcepool.generator.Query(20000, languageArray30);
        java.util.List<java.lang.String> strList33 = surnamesDictionary8.pick(query32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList34 = givenNamesDictionary0.pick(query32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4305 + "'", int1 == 4305);
        org.junit.Assert.assertNotNull(languageArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(languageArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Shaull" + "'", str15, "Shaull");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Shaull" + "'", str16, "Shaull");
        org.junit.Assert.assertNotNull(fortune18);
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(fortune21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Shaull" + "'", str22, "Shaull");
        org.junit.Assert.assertNotNull(languageArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en" + "'", str29, "en");
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary1 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int2 = fortunesDictionary1.size();
        io.resourcepool.generator.Query.Builder builder3 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary4 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary5 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] {};
        int int7 = surnamesDictionary5.size(languageArray6);
        int int8 = givenNamesDictionary4.size(languageArray6);
        io.resourcepool.generator.Query.Builder builder9 = builder3.languages(languageArray6);
        int int10 = fortunesDictionary1.size(languageArray6);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary11 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int12 = fortunesDictionary11.size();
        io.resourcepool.generator.Query.Builder builder13 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary14 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary15 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray16 = new io.resourcepool.model.Language[] {};
        int int17 = surnamesDictionary15.size(languageArray16);
        int int18 = givenNamesDictionary14.size(languageArray16);
        io.resourcepool.generator.Query.Builder builder19 = builder13.languages(languageArray16);
        int int20 = fortunesDictionary11.size(languageArray16);
        int int21 = fortunesDictionary1.size(languageArray16);
        io.resourcepool.generator.Query query22 = new io.resourcepool.generator.Query(20000, languageArray16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11812 + "'", int2 == 11812);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11812 + "'", int12 == 11812);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(languageArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames((int) '4');
        java.lang.String str12 = simpleNameGenerator0.nextNickname();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mamie23" + "'", str12, "Mamie23");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList13 = simpleNameGenerator0.nextSurnames(10);
        io.resourcepool.model.FullName fullName14 = simpleNameGenerator0.nextName();
        java.util.List<io.resourcepool.model.FullName> fullNameList16 = simpleNameGenerator0.nextNames(50000);
        java.util.List<java.lang.String> strList18 = simpleNameGenerator0.nextNicknames((int) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(fullName14);
        org.junit.Assert.assertNotNull(fullNameList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames((int) 'a');
        java.util.List<java.lang.String> strList4 = simpleNameGenerator0.nextNicknames(4305);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames(0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes((int) (short) 10);
        java.util.List<io.resourcepool.model.Fortune> fortuneList6 = simpleFortuneGenerator0.nextFortunes((int) (byte) 10);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator7 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune8 = simpleFortuneGenerator7.nextFortune();
        io.resourcepool.model.Language language9 = io.resourcepool.model.Language.random();
        java.lang.String str10 = language9.getLocaleCode();
        java.util.List<io.resourcepool.model.GivenName> givenNameList11 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language9);
        io.resourcepool.model.Fortune fortune12 = simpleFortuneGenerator7.nextFortune(language9);
        io.resourcepool.model.Fortune fortune13 = simpleFortuneGenerator0.nextFortune(language9);
        java.lang.String str14 = fortune13.source;
        java.lang.String str15 = fortune13.text;
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertNotNull(fortuneList6);
        org.junit.Assert.assertNotNull(fortune8);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
        org.junit.Assert.assertNotNull(givenNameList11);
        org.junit.Assert.assertNotNull(fortune12);
        org.junit.Assert.assertNotNull(fortune13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Laurance J. Peter" + "'", str14, "Laurance J. Peter");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "If at first you don't succeed, try something else." + "'", str15, "If at first you don't succeed, try something else.");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        java.lang.String str8 = surnamesDictionary0.pick();
        java.util.List<java.lang.String> strList10 = surnamesDictionary0.pick((int) (short) -1);
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.resourcepool.model.Language language0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList1 = io.resourcepool.dictionary.loader.NameLoader.loadSurnames(language0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.lang.String str7 = fullName6.surname;
        io.resourcepool.model.Gender gender8 = fullName6.gender;
        java.lang.String str9 = fullName6.nickname;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertTrue("'" + gender8 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender8.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Mamie23" + "'", str9, "Mamie23");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int1 = givenNamesDictionary0.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary2 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList4 = surnamesDictionary2.pick((int) 'a');
        int int5 = surnamesDictionary2.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary6 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray7 = new io.resourcepool.model.Language[] {};
        int int8 = surnamesDictionary6.size(languageArray7);
        io.resourcepool.model.Language language9 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language10 = io.resourcepool.model.Language.random();
        java.lang.String str11 = language10.getLocaleCode();
        io.resourcepool.model.Language[] languageArray12 = new io.resourcepool.model.Language[] { language9, language10 };
        int int13 = surnamesDictionary6.size(languageArray12);
        io.resourcepool.model.Language language15 = io.resourcepool.model.Language.random();
        java.lang.String str16 = language15.getLocaleCode();
        java.lang.String str17 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language15);
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        java.lang.String str20 = language19.getLocaleCode();
        java.lang.String str21 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language19);
        io.resourcepool.model.Language language22 = io.resourcepool.model.Language.random();
        java.lang.String str23 = language22.getLocaleCode();
        io.resourcepool.model.Language language24 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language25 = io.resourcepool.model.Language.random();
        java.lang.String str26 = language25.getLocaleCode();
        io.resourcepool.model.Language[] languageArray27 = new io.resourcepool.model.Language[] { language15, language19, language22, language24, language25 };
        int int28 = surnamesDictionary6.size(languageArray27);
        int int29 = surnamesDictionary2.size(languageArray27);
        int int30 = givenNamesDictionary0.size(languageArray27);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary31 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray32 = new io.resourcepool.model.Language[] {};
        int int33 = surnamesDictionary31.size(languageArray32);
        io.resourcepool.model.Language language34 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language35 = io.resourcepool.model.Language.random();
        java.lang.String str36 = language35.getLocaleCode();
        io.resourcepool.model.Language[] languageArray37 = new io.resourcepool.model.Language[] { language34, language35 };
        int int38 = surnamesDictionary31.size(languageArray37);
        io.resourcepool.model.Language language40 = io.resourcepool.model.Language.random();
        java.lang.String str41 = language40.getLocaleCode();
        java.lang.String str42 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language40);
        io.resourcepool.model.Language language44 = io.resourcepool.model.Language.random();
        java.lang.String str45 = language44.getLocaleCode();
        java.lang.String str46 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language44);
        io.resourcepool.model.Language language47 = io.resourcepool.model.Language.random();
        java.lang.String str48 = language47.getLocaleCode();
        io.resourcepool.model.Language language49 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language50 = io.resourcepool.model.Language.random();
        java.lang.String str51 = language50.getLocaleCode();
        io.resourcepool.model.Language[] languageArray52 = new io.resourcepool.model.Language[] { language40, language44, language47, language49, language50 };
        int int53 = surnamesDictionary31.size(languageArray52);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary54 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int55 = fortunesDictionary54.size();
        io.resourcepool.generator.Query.Builder builder56 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary57 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary58 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray59 = new io.resourcepool.model.Language[] {};
        int int60 = surnamesDictionary58.size(languageArray59);
        int int61 = givenNamesDictionary57.size(languageArray59);
        io.resourcepool.generator.Query.Builder builder62 = builder56.languages(languageArray59);
        int int63 = fortunesDictionary54.size(languageArray59);
        int int64 = surnamesDictionary31.size(languageArray59);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary66 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray67 = new io.resourcepool.model.Language[] {};
        int int68 = surnamesDictionary66.size(languageArray67);
        io.resourcepool.model.Language language69 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language70 = io.resourcepool.model.Language.random();
        java.lang.String str71 = language70.getLocaleCode();
        io.resourcepool.model.Language[] languageArray72 = new io.resourcepool.model.Language[] { language69, language70 };
        int int73 = surnamesDictionary66.size(languageArray72);
        io.resourcepool.generator.Query query74 = new io.resourcepool.generator.Query(20000, languageArray72);
        java.util.List<java.lang.String> strList75 = surnamesDictionary31.pick(query74);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator76 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList78 = simpleNameGenerator76.nextSurnames(1);
        java.lang.String str79 = simpleNameGenerator76.nextNickname();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary80 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList82 = surnamesDictionary80.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary84 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray85 = new io.resourcepool.model.Language[] {};
        int int86 = surnamesDictionary84.size(languageArray85);
        io.resourcepool.model.Language language87 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language88 = io.resourcepool.model.Language.random();
        java.lang.String str89 = language88.getLocaleCode();
        io.resourcepool.model.Language[] languageArray90 = new io.resourcepool.model.Language[] { language87, language88 };
        int int91 = surnamesDictionary84.size(languageArray90);
        io.resourcepool.generator.Query query92 = new io.resourcepool.generator.Query(20000, languageArray90);
        java.util.List<java.lang.String> strList93 = surnamesDictionary80.pick(query92);
        java.util.List<io.resourcepool.model.FullName> fullNameList94 = simpleNameGenerator76.nextNames(query92);
        java.util.List<java.lang.String> strList95 = surnamesDictionary31.pick(query92);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList96 = givenNamesDictionary0.pick(query92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4305 + "'", int1 == 4305);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20000 + "'", int5 == 20000);
        org.junit.Assert.assertNotNull(languageArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language10 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language10.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
        org.junit.Assert.assertNotNull(languageArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertTrue("'" + language15 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language15.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en" + "'", str16, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!30" + "'", str17, "hi!30");
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!5" + "'", str21, "hi!5");
        org.junit.Assert.assertTrue("'" + language22 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language22.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en" + "'", str23, "en");
        org.junit.Assert.assertTrue("'" + language24 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language24.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language25 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language25.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en" + "'", str26, "en");
        org.junit.Assert.assertNotNull(languageArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50000 + "'", int28 == 50000);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 50000 + "'", int29 == 50000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10000 + "'", int30 == 10000);
        org.junit.Assert.assertNotNull(languageArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + language34 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language34.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language35 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language35.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "en" + "'", str36, "en");
        org.junit.Assert.assertNotNull(languageArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20000 + "'", int38 == 20000);
        org.junit.Assert.assertTrue("'" + language40 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language40.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "en" + "'", str41, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!7" + "'", str42, "hi!7");
        org.junit.Assert.assertTrue("'" + language44 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language44.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "en" + "'", str45, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!36" + "'", str46, "hi!36");
        org.junit.Assert.assertTrue("'" + language47 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language47.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "en" + "'", str48, "en");
        org.junit.Assert.assertTrue("'" + language49 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language49.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language50 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language50.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "en" + "'", str51, "en");
        org.junit.Assert.assertNotNull(languageArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 50000 + "'", int53 == 50000);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 11812 + "'", int55 == 11812);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(languageArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(languageArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + language69 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language69.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language70 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language70.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "en" + "'", str71, "en");
        org.junit.Assert.assertNotNull(languageArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 20000 + "'", int73 == 20000);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Mamie23" + "'", str79, "Mamie23");
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(languageArray85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + language87 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language87.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language88 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language88.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "en" + "'", str89, "en");
        org.junit.Assert.assertNotNull(languageArray90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 20000 + "'", int91 == 20000);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNotNull(fullNameList94);
        org.junit.Assert.assertNotNull(strList95);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        java.util.List<io.resourcepool.model.GivenName> givenNameList2 = givenNamesDictionary0.pick(0);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator3 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList5 = simpleFortuneGenerator3.nextFortunes(0);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator6 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune7 = simpleFortuneGenerator6.nextFortune();
        io.resourcepool.model.Language language8 = io.resourcepool.model.Language.random();
        java.lang.String str9 = language8.getLocaleCode();
        io.resourcepool.model.Fortune fortune10 = simpleFortuneGenerator6.nextFortune(language8);
        io.resourcepool.model.Fortune fortune11 = simpleFortuneGenerator3.nextFortune(language8);
        io.resourcepool.model.GivenName givenName12 = givenNamesDictionary0.pick(language8);
        java.util.List<io.resourcepool.model.GivenName> givenNameList13 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language8);
        org.junit.Assert.assertNotNull(givenNameList2);
        org.junit.Assert.assertNotNull(fortuneList5);
        org.junit.Assert.assertNotNull(fortune7);
        org.junit.Assert.assertTrue("'" + language8 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language8.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en" + "'", str9, "en");
        org.junit.Assert.assertNotNull(fortune10);
        org.junit.Assert.assertNotNull(fortune11);
        org.junit.Assert.assertNotNull(givenName12);
        org.junit.Assert.assertNotNull(givenNameList13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        io.resourcepool.model.Language language9 = io.resourcepool.model.Language.random();
        java.lang.String str10 = language9.getLocaleCode();
        java.lang.String str11 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language9);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.random();
        java.lang.String str14 = language13.getLocaleCode();
        java.lang.String str15 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language13);
        io.resourcepool.model.Language language16 = io.resourcepool.model.Language.random();
        java.lang.String str17 = language16.getLocaleCode();
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        java.lang.String str20 = language19.getLocaleCode();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] { language9, language13, language16, language18, language19 };
        int int22 = surnamesDictionary0.size(languageArray21);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary23 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int24 = fortunesDictionary23.size();
        io.resourcepool.generator.Query.Builder builder25 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary26 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary27 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray28 = new io.resourcepool.model.Language[] {};
        int int29 = surnamesDictionary27.size(languageArray28);
        int int30 = givenNamesDictionary26.size(languageArray28);
        io.resourcepool.generator.Query.Builder builder31 = builder25.languages(languageArray28);
        int int32 = fortunesDictionary23.size(languageArray28);
        int int33 = surnamesDictionary0.size(languageArray28);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary35 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray36 = new io.resourcepool.model.Language[] {};
        int int37 = surnamesDictionary35.size(languageArray36);
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language39 = io.resourcepool.model.Language.random();
        java.lang.String str40 = language39.getLocaleCode();
        io.resourcepool.model.Language[] languageArray41 = new io.resourcepool.model.Language[] { language38, language39 };
        int int42 = surnamesDictionary35.size(languageArray41);
        io.resourcepool.generator.Query query43 = new io.resourcepool.generator.Query(20000, languageArray41);
        java.util.List<java.lang.String> strList44 = surnamesDictionary0.pick(query43);
        int int45 = surnamesDictionary0.size();
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!67" + "'", str11, "hi!67");
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!78" + "'", str15, "hi!78");
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50000 + "'", int22 == 50000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11812 + "'", int24 == 11812);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(languageArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(languageArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language39 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language39.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "en" + "'", str40, "en");
        org.junit.Assert.assertNotNull(languageArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20000 + "'", int42 == 20000);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20000 + "'", int45 == 20000);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes((int) (short) 10);
        java.util.List<io.resourcepool.model.Fortune> fortuneList6 = simpleFortuneGenerator0.nextFortunes((int) (short) 100);
        io.resourcepool.model.Language language7 = io.resourcepool.model.Language.random();
        java.lang.String str8 = language7.getLocaleCode();
        java.util.List<java.lang.String> strList9 = io.resourcepool.dictionary.loader.NameLoader.loadSurnames(language7);
        io.resourcepool.model.Fortune fortune10 = simpleFortuneGenerator0.nextFortune(language7);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertNotNull(fortuneList6);
        org.junit.Assert.assertTrue("'" + language7 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language7.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(fortune10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        java.lang.String str5 = givenName4.givenName;
        io.resourcepool.model.GivenName givenName6 = givenName4.clone();
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator7 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator7.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList11 = simpleNameGenerator7.nextGivenNames(100);
        java.util.List<java.lang.String> strList13 = simpleNameGenerator7.nextSurnames((int) (byte) 1);
        java.util.List<java.lang.String> strList15 = simpleNameGenerator7.nextSurnames(1);
        boolean boolean16 = givenName6.equals((java.lang.Object) simpleNameGenerator7);
        io.resourcepool.model.GivenName givenName17 = givenName6.clone();
        io.resourcepool.model.GivenName givenName18 = givenName6.clone();
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(givenName6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenNameList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(givenName17);
        org.junit.Assert.assertNotNull(givenName18);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<io.resourcepool.model.FullName> fullNameList8 = simpleNameGenerator0.nextNames(11812);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(fullNameList8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        io.resourcepool.model.Language language1 = null;
        java.lang.String str2 = null; // flaky: io.resourcepool.util.NicknameCreator.fromFirstName("en", language1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en61" + "'", str2, "en61");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator5 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator5.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList9 = simpleNameGenerator5.nextGivenNames(100);
        java.lang.String str10 = simpleNameGenerator5.nextSurname();
        io.resourcepool.model.FullName fullName11 = simpleNameGenerator5.nextName();
        java.lang.String str12 = fullName11.surname;
        io.resourcepool.model.Gender gender13 = fullName11.gender;
        io.resourcepool.model.GivenName givenName14 = new io.resourcepool.model.GivenName("Mamie23", "Ultimatehi!", gender13);
        io.resourcepool.model.FullName fullName15 = new io.resourcepool.model.FullName("TheOnlyhi!", "hi!91", "GivenName{givenName='Shaull', nickname='', gender=MALE}", gender13);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator16 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList18 = simpleNameGenerator16.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList20 = simpleNameGenerator16.nextGivenNames(100);
        java.lang.String str21 = simpleNameGenerator16.nextSurname();
        io.resourcepool.model.FullName fullName22 = simpleNameGenerator16.nextName();
        java.lang.String str23 = fullName22.surname;
        io.resourcepool.model.Gender gender24 = fullName22.gender;
        boolean boolean25 = fullName15.equals((java.lang.Object) fullName22);
        java.lang.String str26 = fullName15.nickname;
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(givenNameList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Shaull" + "'", str10, "Shaull");
        org.junit.Assert.assertNotNull(fullName11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Shaull" + "'", str12, "Shaull");
        org.junit.Assert.assertTrue("'" + gender13 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender13.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(givenNameList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Shaull" + "'", str21, "Shaull");
        org.junit.Assert.assertNotNull(fullName22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Shaull" + "'", str23, "Shaull");
        org.junit.Assert.assertTrue("'" + gender24 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender24.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!91" + "'", str26, "hi!91");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.FullName fullName12 = simpleNameGenerator0.nextName();
        java.util.List<io.resourcepool.model.GivenName> givenNameList14 = simpleNameGenerator0.nextGivenNames((int) (short) 100);
        java.lang.String str15 = simpleNameGenerator0.nextSurname();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(fullName12);
        org.junit.Assert.assertNotNull(givenNameList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Shaull" + "'", str15, "Shaull");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<io.resourcepool.model.FullName> fullNameList8 = simpleNameGenerator0.nextNames((int) (short) 10);
        java.lang.String str9 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName10 = simpleNameGenerator0.nextName();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary12 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray13 = new io.resourcepool.model.Language[] {};
        int int14 = surnamesDictionary12.size(languageArray13);
        io.resourcepool.model.Language language15 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language16 = io.resourcepool.model.Language.random();
        java.lang.String str17 = language16.getLocaleCode();
        io.resourcepool.model.Language[] languageArray18 = new io.resourcepool.model.Language[] { language15, language16 };
        int int19 = surnamesDictionary12.size(languageArray18);
        io.resourcepool.generator.Query query20 = new io.resourcepool.generator.Query(20000, languageArray18);
        java.util.List<io.resourcepool.model.FullName> fullNameList21 = simpleNameGenerator0.nextNames(query20);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(fullNameList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Shaull" + "'", str9, "Shaull");
        org.junit.Assert.assertNotNull(fullName10);
        org.junit.Assert.assertNotNull(languageArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + language15 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language15.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertNotNull(languageArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20000 + "'", int19 == 20000);
        org.junit.Assert.assertNotNull(fullNameList21);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary2 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray3 = new io.resourcepool.model.Language[] {};
        int int4 = surnamesDictionary2.size(languageArray3);
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language6 = io.resourcepool.model.Language.random();
        java.lang.String str7 = language6.getLocaleCode();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] { language5, language6 };
        int int9 = surnamesDictionary2.size(languageArray8);
        io.resourcepool.generator.Query query10 = new io.resourcepool.generator.Query(20000, languageArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList11 = givenNamesDictionary0.pick(query10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language6 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language6.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick((int) 'a');
        io.resourcepool.model.Language language3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = surnamesDictionary0.pick(language3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        java.lang.String str6 = language5.getLocaleCode();
        io.resourcepool.model.Language[] languageArray7 = new io.resourcepool.model.Language[] { language4, language5 };
        int int8 = surnamesDictionary1.size(languageArray7);
        io.resourcepool.model.Language language10 = io.resourcepool.model.Language.random();
        java.lang.String str11 = language10.getLocaleCode();
        java.lang.String str12 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language10);
        io.resourcepool.model.Language language14 = io.resourcepool.model.Language.random();
        java.lang.String str15 = language14.getLocaleCode();
        java.lang.String str16 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language14);
        io.resourcepool.model.Language language17 = io.resourcepool.model.Language.random();
        java.lang.String str18 = language17.getLocaleCode();
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language20 = io.resourcepool.model.Language.random();
        java.lang.String str21 = language20.getLocaleCode();
        io.resourcepool.model.Language[] languageArray22 = new io.resourcepool.model.Language[] { language10, language14, language17, language19, language20 };
        int int23 = surnamesDictionary1.size(languageArray22);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary24 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray25 = new io.resourcepool.model.Language[] {};
        int int26 = surnamesDictionary24.size(languageArray25);
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language28 = io.resourcepool.model.Language.random();
        java.lang.String str29 = language28.getLocaleCode();
        io.resourcepool.model.Language[] languageArray30 = new io.resourcepool.model.Language[] { language27, language28 };
        int int31 = surnamesDictionary24.size(languageArray30);
        io.resourcepool.model.Language language33 = io.resourcepool.model.Language.random();
        java.lang.String str34 = language33.getLocaleCode();
        java.lang.String str35 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language33);
        io.resourcepool.model.Language language37 = io.resourcepool.model.Language.random();
        java.lang.String str38 = language37.getLocaleCode();
        java.lang.String str39 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language37);
        io.resourcepool.model.Language language40 = io.resourcepool.model.Language.random();
        java.lang.String str41 = language40.getLocaleCode();
        io.resourcepool.model.Language language42 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language43 = io.resourcepool.model.Language.random();
        java.lang.String str44 = language43.getLocaleCode();
        io.resourcepool.model.Language[] languageArray45 = new io.resourcepool.model.Language[] { language33, language37, language40, language42, language43 };
        int int46 = surnamesDictionary24.size(languageArray45);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary47 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int48 = fortunesDictionary47.size();
        io.resourcepool.generator.Query.Builder builder49 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary50 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary51 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray52 = new io.resourcepool.model.Language[] {};
        int int53 = surnamesDictionary51.size(languageArray52);
        int int54 = givenNamesDictionary50.size(languageArray52);
        io.resourcepool.generator.Query.Builder builder55 = builder49.languages(languageArray52);
        int int56 = fortunesDictionary47.size(languageArray52);
        int int57 = surnamesDictionary24.size(languageArray52);
        int int58 = surnamesDictionary1.size(languageArray52);
        io.resourcepool.model.Language language59 = io.resourcepool.model.Language.random();
        java.lang.String str60 = language59.getLocaleCode();
        java.util.List<io.resourcepool.model.GivenName> givenNameList61 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language59);
        io.resourcepool.model.Language language62 = io.resourcepool.model.Language.random();
        java.lang.String str63 = language62.getLocaleCode();
        java.util.List<java.lang.String> strList64 = io.resourcepool.dictionary.loader.NameLoader.loadSurnames(language62);
        io.resourcepool.model.Language language66 = io.resourcepool.model.Language.random();
        java.lang.String str67 = language66.getLocaleCode();
        java.lang.String str68 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language66);
        io.resourcepool.model.Language[] languageArray69 = new io.resourcepool.model.Language[] { language59, language62, language66 };
        int int70 = surnamesDictionary1.size(languageArray69);
        io.resourcepool.generator.Query query71 = new io.resourcepool.generator.Query((int) '#', languageArray69);
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(languageArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + language10 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language10.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!11" + "'", str12, "hi!11");
        org.junit.Assert.assertTrue("'" + language14 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language14.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!84" + "'", str16, "hi!84");
        org.junit.Assert.assertTrue("'" + language17 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language17.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en" + "'", str18, "en");
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en" + "'", str21, "en");
        org.junit.Assert.assertNotNull(languageArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50000 + "'", int23 == 50000);
        org.junit.Assert.assertNotNull(languageArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en" + "'", str29, "en");
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
        org.junit.Assert.assertTrue("'" + language33 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language33.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "en" + "'", str34, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!97" + "'", str35, "hi!97");
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en" + "'", str38, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!45" + "'", str39, "hi!45");
        org.junit.Assert.assertTrue("'" + language40 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language40.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "en" + "'", str41, "en");
        org.junit.Assert.assertTrue("'" + language42 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language42.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language43 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language43.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "en" + "'", str44, "en");
        org.junit.Assert.assertNotNull(languageArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 50000 + "'", int46 == 50000);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 11812 + "'", int48 == 11812);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(languageArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + language59 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language59.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "en" + "'", str60, "en");
        org.junit.Assert.assertNotNull(givenNameList61);
        org.junit.Assert.assertTrue("'" + language62 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language62.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "en" + "'", str63, "en");
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertTrue("'" + language66 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language66.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "en" + "'", str67, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!9" + "'", str68, "hi!9");
        org.junit.Assert.assertNotNull(languageArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 30000 + "'", int70 == 30000);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList8 = simpleNameGenerator0.nextNicknames(4305);
        io.resourcepool.model.GivenName givenName9 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.model.Gender gender12 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName13 = new io.resourcepool.model.GivenName("Shaull", "", gender12);
        io.resourcepool.model.GivenName givenName14 = givenName13.clone();
        java.lang.String str15 = givenName14.givenName;
        io.resourcepool.model.GivenName givenName16 = givenName14.clone();
        boolean boolean17 = givenName9.equals((java.lang.Object) givenName14);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(givenName9);
        org.junit.Assert.assertTrue("'" + gender12 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender12.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Shaull" + "'", str15, "Shaull");
        org.junit.Assert.assertNotNull(givenName16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        io.resourcepool.model.Fortune fortune2 = new io.resourcepool.model.Fortune("hi!51", "hi!43");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int1 = fortunesDictionary0.size();
        io.resourcepool.generator.Query.Builder builder2 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary3 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary4 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray5 = new io.resourcepool.model.Language[] {};
        int int6 = surnamesDictionary4.size(languageArray5);
        int int7 = givenNamesDictionary3.size(languageArray5);
        io.resourcepool.generator.Query.Builder builder8 = builder2.languages(languageArray5);
        int int9 = fortunesDictionary0.size(languageArray5);
        io.resourcepool.model.Fortune fortune10 = fortunesDictionary0.pick();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary11 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray12 = new io.resourcepool.model.Language[] {};
        int int13 = surnamesDictionary11.size(languageArray12);
        io.resourcepool.model.Language language14 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language15 = io.resourcepool.model.Language.random();
        java.lang.String str16 = language15.getLocaleCode();
        io.resourcepool.model.Language[] languageArray17 = new io.resourcepool.model.Language[] { language14, language15 };
        int int18 = surnamesDictionary11.size(languageArray17);
        io.resourcepool.model.Language language20 = io.resourcepool.model.Language.random();
        java.lang.String str21 = language20.getLocaleCode();
        java.lang.String str22 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language20);
        io.resourcepool.model.Language language24 = io.resourcepool.model.Language.random();
        java.lang.String str25 = language24.getLocaleCode();
        java.lang.String str26 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language24);
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.random();
        java.lang.String str28 = language27.getLocaleCode();
        io.resourcepool.model.Language language29 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language30 = io.resourcepool.model.Language.random();
        java.lang.String str31 = language30.getLocaleCode();
        io.resourcepool.model.Language[] languageArray32 = new io.resourcepool.model.Language[] { language20, language24, language27, language29, language30 };
        int int33 = surnamesDictionary11.size(languageArray32);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary34 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int35 = fortunesDictionary34.size();
        io.resourcepool.generator.Query.Builder builder36 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary37 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary38 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray39 = new io.resourcepool.model.Language[] {};
        int int40 = surnamesDictionary38.size(languageArray39);
        int int41 = givenNamesDictionary37.size(languageArray39);
        io.resourcepool.generator.Query.Builder builder42 = builder36.languages(languageArray39);
        int int43 = fortunesDictionary34.size(languageArray39);
        int int44 = surnamesDictionary11.size(languageArray39);
        int int45 = fortunesDictionary0.size(languageArray39);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fortune10);
        org.junit.Assert.assertNotNull(languageArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + language14 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language14.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language15 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language15.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en" + "'", str16, "en");
        org.junit.Assert.assertNotNull(languageArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20000 + "'", int18 == 20000);
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en" + "'", str21, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "TheOnlyhi!" + "'", str22, "TheOnlyhi!");
        org.junit.Assert.assertTrue("'" + language24 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language24.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!53" + "'", str26, "hi!53");
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en" + "'", str28, "en");
        org.junit.Assert.assertTrue("'" + language29 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language29.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language30 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language30.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en" + "'", str31, "en");
        org.junit.Assert.assertNotNull(languageArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 50000 + "'", int33 == 50000);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 11812 + "'", int35 == 11812);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(languageArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary3 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray4 = new io.resourcepool.model.Language[] {};
        int int5 = surnamesDictionary3.size(languageArray4);
        int int6 = surnamesDictionary0.size(languageArray4);
        java.lang.String str7 = surnamesDictionary0.pick();
        int int8 = surnamesDictionary0.size();
        int int9 = surnamesDictionary0.size();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator10 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune11 = simpleFortuneGenerator10.nextFortune();
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.random();
        java.lang.String str13 = language12.getLocaleCode();
        java.util.List<io.resourcepool.model.GivenName> givenNameList14 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language12);
        io.resourcepool.model.Fortune fortune15 = simpleFortuneGenerator10.nextFortune(language12);
        java.lang.String str16 = surnamesDictionary0.pick(language12);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(languageArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertNotNull(fortune11);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertNotNull(givenNameList14);
        org.junit.Assert.assertNotNull(fortune15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Shaull" + "'", str16, "Shaull");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        io.resourcepool.model.FullName fullName7 = simpleNameGenerator0.nextName();
        java.lang.String str8 = fullName7.surname;
        io.resourcepool.model.Gender gender9 = fullName7.gender;
        java.lang.String str10 = fullName7.surname;
        io.resourcepool.model.Gender gender11 = fullName7.gender;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(fullName7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertTrue("'" + gender9 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender9.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Shaull" + "'", str10, "Shaull");
        org.junit.Assert.assertTrue("'" + gender11 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender11.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames((int) 'a');
        java.util.List<java.lang.String> strList4 = simpleNameGenerator0.nextNicknames(4305);
        io.resourcepool.model.GivenName givenName5 = simpleNameGenerator0.nextGivenName();
        java.util.List<io.resourcepool.model.FullName> fullNameList7 = simpleNameGenerator0.nextNames((int) (short) -1);
        java.util.List<io.resourcepool.model.FullName> fullNameList9 = simpleNameGenerator0.nextNames(30000);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(givenName5);
        org.junit.Assert.assertNotNull(fullNameList7);
        org.junit.Assert.assertNotNull(fullNameList9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        io.resourcepool.model.Fortune fortune2 = new io.resourcepool.model.Fortune("hi!38", "");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        java.util.List<java.lang.String> strList9 = surnamesDictionary0.pick((int) (byte) 10);
        io.resourcepool.model.Language[] languageArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = surnamesDictionary0.size(languageArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator7 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList9 = simpleFortuneGenerator7.nextFortunes(0);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator10 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune11 = simpleFortuneGenerator10.nextFortune();
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.random();
        java.lang.String str13 = language12.getLocaleCode();
        io.resourcepool.model.Fortune fortune14 = simpleFortuneGenerator10.nextFortune(language12);
        io.resourcepool.model.Fortune fortune15 = simpleFortuneGenerator7.nextFortune(language12);
        boolean boolean16 = fullName6.equals((java.lang.Object) simpleFortuneGenerator7);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary17 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList19 = surnamesDictionary17.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary20 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] {};
        int int22 = surnamesDictionary20.size(languageArray21);
        int int23 = surnamesDictionary17.size(languageArray21);
        java.lang.String str24 = surnamesDictionary17.pick();
        java.lang.String str25 = surnamesDictionary17.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator26 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune27 = simpleFortuneGenerator26.nextFortune();
        io.resourcepool.model.Language language28 = io.resourcepool.model.Language.random();
        java.lang.String str29 = language28.getLocaleCode();
        io.resourcepool.model.Fortune fortune30 = simpleFortuneGenerator26.nextFortune(language28);
        java.lang.String str31 = surnamesDictionary17.pick(language28);
        io.resourcepool.model.Fortune fortune32 = simpleFortuneGenerator7.nextFortune(language28);
        java.lang.String str33 = fortune32.text;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(fortuneList9);
        org.junit.Assert.assertNotNull(fortune11);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertNotNull(fortune14);
        org.junit.Assert.assertNotNull(fortune15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Shaull" + "'", str24, "Shaull");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Shaull" + "'", str25, "Shaull");
        org.junit.Assert.assertNotNull(fortune27);
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en" + "'", str29, "en");
        org.junit.Assert.assertNotNull(fortune30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Shaull" + "'", str31, "Shaull");
        org.junit.Assert.assertNotNull(fortune32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "If at first you don't succeed, try something else." + "'", str33, "If at first you don't succeed, try something else.");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes((int) (short) 10);
        java.util.List<io.resourcepool.model.Fortune> fortuneList6 = simpleFortuneGenerator0.nextFortunes((int) (byte) 10);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator7 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune8 = simpleFortuneGenerator7.nextFortune();
        io.resourcepool.model.Language language9 = io.resourcepool.model.Language.random();
        java.lang.String str10 = language9.getLocaleCode();
        java.util.List<io.resourcepool.model.GivenName> givenNameList11 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language9);
        io.resourcepool.model.Fortune fortune12 = simpleFortuneGenerator7.nextFortune(language9);
        io.resourcepool.model.Fortune fortune13 = simpleFortuneGenerator0.nextFortune(language9);
        java.util.List<io.resourcepool.model.Fortune> fortuneList15 = simpleFortuneGenerator0.nextFortunes((int) (short) 10);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertNotNull(fortuneList6);
        org.junit.Assert.assertNotNull(fortune8);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
        org.junit.Assert.assertNotNull(givenNameList11);
        org.junit.Assert.assertNotNull(fortune12);
        org.junit.Assert.assertNotNull(fortune13);
        org.junit.Assert.assertNotNull(fortuneList15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        io.resourcepool.model.FullName fullName7 = simpleNameGenerator0.nextName();
        java.lang.String str8 = fullName7.surname;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(fullName7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.lang.String str1 = simpleNameGenerator0.nextNickname();
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator2 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList4 = simpleNameGenerator2.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = simpleNameGenerator2.nextGivenNames(100);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary7 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList9 = surnamesDictionary7.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary11 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray12 = new io.resourcepool.model.Language[] {};
        int int13 = surnamesDictionary11.size(languageArray12);
        io.resourcepool.model.Language language14 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language15 = io.resourcepool.model.Language.random();
        java.lang.String str16 = language15.getLocaleCode();
        io.resourcepool.model.Language[] languageArray17 = new io.resourcepool.model.Language[] { language14, language15 };
        int int18 = surnamesDictionary11.size(languageArray17);
        io.resourcepool.generator.Query query19 = new io.resourcepool.generator.Query(20000, languageArray17);
        java.util.List<java.lang.String> strList20 = surnamesDictionary7.pick(query19);
        java.util.List<io.resourcepool.model.FullName> fullNameList21 = simpleNameGenerator2.nextNames(query19);
        java.util.List<io.resourcepool.model.FullName> fullNameList22 = simpleNameGenerator0.nextNames(query19);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mamie23" + "'", str1, "Mamie23");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + language14 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language14.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language15 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language15.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en" + "'", str16, "en");
        org.junit.Assert.assertNotNull(languageArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20000 + "'", int18 == 20000);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(fullNameList21);
        org.junit.Assert.assertNotNull(fullNameList22);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator4 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList6 = simpleNameGenerator4.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList8 = simpleNameGenerator4.nextGivenNames(100);
        java.lang.String str9 = simpleNameGenerator4.nextSurname();
        io.resourcepool.model.FullName fullName10 = simpleNameGenerator4.nextName();
        java.lang.String str11 = fullName10.surname;
        io.resourcepool.model.Gender gender12 = fullName10.gender;
        io.resourcepool.model.GivenName givenName13 = new io.resourcepool.model.GivenName("Mamie23", "Ultimatehi!", gender12);
        io.resourcepool.model.GivenName givenName14 = new io.resourcepool.model.GivenName("FullName{givenName='Shaull', surname='hi!', nickname='', gender=MALE}", "TheOnlyhi!", gender12);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(givenNameList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Shaull" + "'", str9, "Shaull");
        org.junit.Assert.assertNotNull(fullName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Shaull" + "'", str11, "Shaull");
        org.junit.Assert.assertTrue("'" + gender12 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender12.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick((int) 'a');
        int int3 = surnamesDictionary0.size();
        java.lang.String str4 = surnamesDictionary0.pick();
        java.lang.String str5 = surnamesDictionary0.pick();
        io.resourcepool.model.Language language7 = io.resourcepool.model.Language.random();
        java.lang.String str8 = language7.getLocaleCode();
        java.lang.String str9 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language7);
        java.lang.String str10 = surnamesDictionary0.pick(language7);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Shaull" + "'", str4, "Shaull");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertTrue("'" + language7 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language7.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!82" + "'", str9, "hi!82");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Shaull" + "'", str10, "Shaull");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<io.resourcepool.model.FullName> fullNameList8 = simpleNameGenerator0.nextNames((int) (short) 10);
        java.lang.String str9 = simpleNameGenerator0.nextSurname();
        java.util.List<io.resourcepool.model.FullName> fullNameList11 = simpleNameGenerator0.nextNames(0);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary12 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray13 = new io.resourcepool.model.Language[] {};
        int int14 = surnamesDictionary12.size(languageArray13);
        io.resourcepool.model.Language language15 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language16 = io.resourcepool.model.Language.random();
        java.lang.String str17 = language16.getLocaleCode();
        io.resourcepool.model.Language[] languageArray18 = new io.resourcepool.model.Language[] { language15, language16 };
        int int19 = surnamesDictionary12.size(languageArray18);
        io.resourcepool.model.Language language21 = io.resourcepool.model.Language.random();
        java.lang.String str22 = language21.getLocaleCode();
        java.lang.String str23 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language21);
        io.resourcepool.model.Language language25 = io.resourcepool.model.Language.random();
        java.lang.String str26 = language25.getLocaleCode();
        java.lang.String str27 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language25);
        io.resourcepool.model.Language language28 = io.resourcepool.model.Language.random();
        java.lang.String str29 = language28.getLocaleCode();
        io.resourcepool.model.Language language30 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language31 = io.resourcepool.model.Language.random();
        java.lang.String str32 = language31.getLocaleCode();
        io.resourcepool.model.Language[] languageArray33 = new io.resourcepool.model.Language[] { language21, language25, language28, language30, language31 };
        int int34 = surnamesDictionary12.size(languageArray33);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary35 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int36 = fortunesDictionary35.size();
        io.resourcepool.generator.Query.Builder builder37 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary38 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary39 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray40 = new io.resourcepool.model.Language[] {};
        int int41 = surnamesDictionary39.size(languageArray40);
        int int42 = givenNamesDictionary38.size(languageArray40);
        io.resourcepool.generator.Query.Builder builder43 = builder37.languages(languageArray40);
        int int44 = fortunesDictionary35.size(languageArray40);
        int int45 = surnamesDictionary12.size(languageArray40);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary47 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray48 = new io.resourcepool.model.Language[] {};
        int int49 = surnamesDictionary47.size(languageArray48);
        io.resourcepool.model.Language language50 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language51 = io.resourcepool.model.Language.random();
        java.lang.String str52 = language51.getLocaleCode();
        io.resourcepool.model.Language[] languageArray53 = new io.resourcepool.model.Language[] { language50, language51 };
        int int54 = surnamesDictionary47.size(languageArray53);
        io.resourcepool.generator.Query query55 = new io.resourcepool.generator.Query(20000, languageArray53);
        java.util.List<java.lang.String> strList56 = surnamesDictionary12.pick(query55);
        io.resourcepool.model.Language[] languageArray57 = query55.languages;
        java.util.List<io.resourcepool.model.FullName> fullNameList58 = simpleNameGenerator0.nextNames(query55);
        java.util.List<java.lang.String> strList60 = simpleNameGenerator0.nextNicknames((int) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(fullNameList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Shaull" + "'", str9, "Shaull");
        org.junit.Assert.assertNotNull(fullNameList11);
        org.junit.Assert.assertNotNull(languageArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + language15 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language15.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertNotNull(languageArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20000 + "'", int19 == 20000);
        org.junit.Assert.assertTrue("'" + language21 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language21.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en" + "'", str22, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!92" + "'", str23, "hi!92");
        org.junit.Assert.assertTrue("'" + language25 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language25.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en" + "'", str26, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!58" + "'", str27, "hi!58");
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en" + "'", str29, "en");
        org.junit.Assert.assertTrue("'" + language30 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language30.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language31 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language31.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "en" + "'", str32, "en");
        org.junit.Assert.assertNotNull(languageArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 50000 + "'", int34 == 50000);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 11812 + "'", int36 == 11812);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(languageArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(languageArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + language50 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language50.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language51 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language51.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "en" + "'", str52, "en");
        org.junit.Assert.assertNotNull(languageArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 20000 + "'", int54 == 20000);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(languageArray57);
        org.junit.Assert.assertNotNull(fullNameList58);
        org.junit.Assert.assertNotNull(strList60);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int1 = fortunesDictionary0.size();
        io.resourcepool.generator.Query.Builder builder2 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary3 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary4 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray5 = new io.resourcepool.model.Language[] {};
        int int6 = surnamesDictionary4.size(languageArray5);
        int int7 = givenNamesDictionary3.size(languageArray5);
        io.resourcepool.generator.Query.Builder builder8 = builder2.languages(languageArray5);
        int int9 = fortunesDictionary0.size(languageArray5);
        io.resourcepool.model.Fortune fortune10 = fortunesDictionary0.pick();
        io.resourcepool.model.Fortune fortune11 = fortunesDictionary0.pick();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fortune10);
        org.junit.Assert.assertNotNull(fortune11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        io.resourcepool.model.FullName fullName7 = simpleNameGenerator0.nextName();
        java.util.List<io.resourcepool.model.GivenName> givenNameList9 = simpleNameGenerator0.nextGivenNames((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList11 = simpleNameGenerator0.nextGivenNames(10000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(fullName7);
        org.junit.Assert.assertNotNull(givenNameList9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes(0);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator3 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune4 = simpleFortuneGenerator3.nextFortune();
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        java.lang.String str6 = language5.getLocaleCode();
        io.resourcepool.model.Fortune fortune7 = simpleFortuneGenerator3.nextFortune(language5);
        io.resourcepool.model.Fortune fortune8 = simpleFortuneGenerator0.nextFortune(language5);
        java.lang.String str9 = language5.getLocaleCode();
        org.junit.Assert.assertNotNull(fortuneList2);
        org.junit.Assert.assertNotNull(fortune4);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(fortune7);
        org.junit.Assert.assertNotNull(fortune8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en" + "'", str9, "en");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        java.util.List<io.resourcepool.model.GivenName> givenNameList2 = givenNamesDictionary0.pick(0);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator3 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList5 = simpleFortuneGenerator3.nextFortunes(0);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator6 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune7 = simpleFortuneGenerator6.nextFortune();
        io.resourcepool.model.Language language8 = io.resourcepool.model.Language.random();
        java.lang.String str9 = language8.getLocaleCode();
        io.resourcepool.model.Fortune fortune10 = simpleFortuneGenerator6.nextFortune(language8);
        io.resourcepool.model.Fortune fortune11 = simpleFortuneGenerator3.nextFortune(language8);
        io.resourcepool.model.GivenName givenName12 = givenNamesDictionary0.pick(language8);
        io.resourcepool.model.FullName fullName14 = givenName12.toFullName("hi!36");
        org.junit.Assert.assertNotNull(givenNameList2);
        org.junit.Assert.assertNotNull(fortuneList5);
        org.junit.Assert.assertNotNull(fortune7);
        org.junit.Assert.assertTrue("'" + language8 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language8.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en" + "'", str9, "en");
        org.junit.Assert.assertNotNull(fortune10);
        org.junit.Assert.assertNotNull(fortune11);
        org.junit.Assert.assertNotNull(givenName12);
        org.junit.Assert.assertNotNull(fullName14);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        io.resourcepool.model.Language language9 = io.resourcepool.model.Language.random();
        java.lang.String str10 = language9.getLocaleCode();
        java.lang.String str11 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language9);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.random();
        java.lang.String str14 = language13.getLocaleCode();
        java.lang.String str15 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language13);
        io.resourcepool.model.Language language16 = io.resourcepool.model.Language.random();
        java.lang.String str17 = language16.getLocaleCode();
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        java.lang.String str20 = language19.getLocaleCode();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] { language9, language13, language16, language18, language19 };
        int int22 = surnamesDictionary0.size(languageArray21);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary23 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int24 = fortunesDictionary23.size();
        io.resourcepool.generator.Query.Builder builder25 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary26 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary27 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray28 = new io.resourcepool.model.Language[] {};
        int int29 = surnamesDictionary27.size(languageArray28);
        int int30 = givenNamesDictionary26.size(languageArray28);
        io.resourcepool.generator.Query.Builder builder31 = builder25.languages(languageArray28);
        int int32 = fortunesDictionary23.size(languageArray28);
        int int33 = surnamesDictionary0.size(languageArray28);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary35 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray36 = new io.resourcepool.model.Language[] {};
        int int37 = surnamesDictionary35.size(languageArray36);
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language39 = io.resourcepool.model.Language.random();
        java.lang.String str40 = language39.getLocaleCode();
        io.resourcepool.model.Language[] languageArray41 = new io.resourcepool.model.Language[] { language38, language39 };
        int int42 = surnamesDictionary35.size(languageArray41);
        io.resourcepool.generator.Query query43 = new io.resourcepool.generator.Query(20000, languageArray41);
        java.util.List<java.lang.String> strList44 = surnamesDictionary0.pick(query43);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator45 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList47 = simpleNameGenerator45.nextSurnames(1);
        java.lang.String str48 = simpleNameGenerator45.nextNickname();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary49 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList51 = surnamesDictionary49.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary53 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray54 = new io.resourcepool.model.Language[] {};
        int int55 = surnamesDictionary53.size(languageArray54);
        io.resourcepool.model.Language language56 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language57 = io.resourcepool.model.Language.random();
        java.lang.String str58 = language57.getLocaleCode();
        io.resourcepool.model.Language[] languageArray59 = new io.resourcepool.model.Language[] { language56, language57 };
        int int60 = surnamesDictionary53.size(languageArray59);
        io.resourcepool.generator.Query query61 = new io.resourcepool.generator.Query(20000, languageArray59);
        java.util.List<java.lang.String> strList62 = surnamesDictionary49.pick(query61);
        java.util.List<io.resourcepool.model.FullName> fullNameList63 = simpleNameGenerator45.nextNames(query61);
        java.util.List<java.lang.String> strList64 = surnamesDictionary0.pick(query61);
        java.lang.String str65 = surnamesDictionary0.pick();
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!79" + "'", str11, "hi!79");
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!67" + "'", str15, "hi!67");
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50000 + "'", int22 == 50000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11812 + "'", int24 == 11812);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(languageArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(languageArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language39 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language39.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "en" + "'", str40, "en");
        org.junit.Assert.assertNotNull(languageArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20000 + "'", int42 == 20000);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Mamie23" + "'", str48, "Mamie23");
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(languageArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + language56 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language56.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language57 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language57.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "en" + "'", str58, "en");
        org.junit.Assert.assertNotNull(languageArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 20000 + "'", int60 == 20000);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(fullNameList63);
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Shaull" + "'", str65, "Shaull");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator3 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList5 = simpleNameGenerator3.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList7 = simpleNameGenerator3.nextGivenNames(100);
        java.lang.String str8 = simpleNameGenerator3.nextSurname();
        io.resourcepool.model.FullName fullName9 = simpleNameGenerator3.nextName();
        io.resourcepool.model.Gender gender10 = fullName9.gender;
        io.resourcepool.model.FullName fullName11 = new io.resourcepool.model.FullName("", "Mary", "", gender10);
        java.lang.String str12 = fullName11.nickname;
        java.lang.String str13 = fullName11.givenName;
        java.lang.String str14 = fullName11.toString();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(givenNameList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertNotNull(fullName9);
        org.junit.Assert.assertTrue("'" + gender10 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender10.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mary" + "'", str12, "Mary");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FullName{givenName='', surname='', nickname='Mary', gender=FEMALE}" + "'", str14, "FullName{givenName='', surname='', nickname='Mary', gender=FEMALE}");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.lang.String str7 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '#');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Language language2 = io.resourcepool.model.Language.random();
        java.lang.String str3 = language2.getLocaleCode();
        io.resourcepool.model.Fortune fortune4 = simpleFortuneGenerator0.nextFortune(language2);
        io.resourcepool.model.Fortune fortune5 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune6 = fortune5.clone();
        java.lang.String str7 = fortune6.text;
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertTrue("'" + language2 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language2.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
        org.junit.Assert.assertNotNull(fortune4);
        org.junit.Assert.assertNotNull(fortune5);
        org.junit.Assert.assertNotNull(fortune6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "If at first you don't succeed, try something else." + "'", str7, "If at first you don't succeed, try something else.");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int1 = givenNamesDictionary0.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary2 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList4 = surnamesDictionary2.pick((int) 'a');
        int int5 = surnamesDictionary2.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary6 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray7 = new io.resourcepool.model.Language[] {};
        int int8 = surnamesDictionary6.size(languageArray7);
        io.resourcepool.model.Language language9 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language10 = io.resourcepool.model.Language.random();
        java.lang.String str11 = language10.getLocaleCode();
        io.resourcepool.model.Language[] languageArray12 = new io.resourcepool.model.Language[] { language9, language10 };
        int int13 = surnamesDictionary6.size(languageArray12);
        io.resourcepool.model.Language language15 = io.resourcepool.model.Language.random();
        java.lang.String str16 = language15.getLocaleCode();
        java.lang.String str17 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language15);
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        java.lang.String str20 = language19.getLocaleCode();
        java.lang.String str21 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language19);
        io.resourcepool.model.Language language22 = io.resourcepool.model.Language.random();
        java.lang.String str23 = language22.getLocaleCode();
        io.resourcepool.model.Language language24 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language25 = io.resourcepool.model.Language.random();
        java.lang.String str26 = language25.getLocaleCode();
        io.resourcepool.model.Language[] languageArray27 = new io.resourcepool.model.Language[] { language15, language19, language22, language24, language25 };
        int int28 = surnamesDictionary6.size(languageArray27);
        int int29 = surnamesDictionary2.size(languageArray27);
        int int30 = givenNamesDictionary0.size(languageArray27);
        int int31 = givenNamesDictionary0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4305 + "'", int1 == 4305);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20000 + "'", int5 == 20000);
        org.junit.Assert.assertNotNull(languageArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language10 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language10.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
        org.junit.Assert.assertNotNull(languageArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertTrue("'" + language15 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language15.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en" + "'", str16, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!26" + "'", str17, "hi!26");
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!49" + "'", str21, "hi!49");
        org.junit.Assert.assertTrue("'" + language22 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language22.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en" + "'", str23, "en");
        org.junit.Assert.assertTrue("'" + language24 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language24.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language25 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language25.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en" + "'", str26, "en");
        org.junit.Assert.assertNotNull(languageArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50000 + "'", int28 == 50000);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 50000 + "'", int29 == 50000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10000 + "'", int30 == 10000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4305 + "'", int31 == 4305);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        int int4 = givenNamesDictionary0.size(languageArray2);
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        java.lang.String str6 = language5.getLocaleCode();
        java.util.List<java.lang.String> strList7 = io.resourcepool.dictionary.loader.NameLoader.loadSurnames(language5);
        java.util.List<io.resourcepool.model.GivenName> givenNameList8 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language5);
        io.resourcepool.model.GivenName givenName9 = givenNamesDictionary0.pick(language5);
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(givenNameList8);
        org.junit.Assert.assertNotNull(givenName9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.FullName fullName6 = givenName4.toFullName("hi!");
        java.lang.String str7 = givenName4.nickname;
        java.lang.String str8 = givenName4.givenName;
        io.resourcepool.model.GivenName givenName9 = givenName4.clone();
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertNotNull(givenName9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.resourcepool.generator.Query.Builder builder0 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray1 = null;
        io.resourcepool.generator.Query.Builder builder2 = builder0.languages(languageArray1);
        io.resourcepool.generator.Query.Builder builder4 = builder0.count((int) (byte) 1);
        io.resourcepool.generator.Query.Builder builder5 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray6 = null;
        io.resourcepool.generator.Query.Builder builder7 = builder5.languages(languageArray6);
        io.resourcepool.generator.Query.Builder builder9 = builder5.count((int) (byte) 1);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList12 = surnamesDictionary10.pick((int) 'a');
        int int13 = surnamesDictionary10.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary14 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray15 = new io.resourcepool.model.Language[] {};
        int int16 = surnamesDictionary14.size(languageArray15);
        io.resourcepool.model.Language language17 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.random();
        java.lang.String str19 = language18.getLocaleCode();
        io.resourcepool.model.Language[] languageArray20 = new io.resourcepool.model.Language[] { language17, language18 };
        int int21 = surnamesDictionary14.size(languageArray20);
        io.resourcepool.model.Language language23 = io.resourcepool.model.Language.random();
        java.lang.String str24 = language23.getLocaleCode();
        java.lang.String str25 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language23);
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.random();
        java.lang.String str28 = language27.getLocaleCode();
        java.lang.String str29 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language27);
        io.resourcepool.model.Language language30 = io.resourcepool.model.Language.random();
        java.lang.String str31 = language30.getLocaleCode();
        io.resourcepool.model.Language language32 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language33 = io.resourcepool.model.Language.random();
        java.lang.String str34 = language33.getLocaleCode();
        io.resourcepool.model.Language[] languageArray35 = new io.resourcepool.model.Language[] { language23, language27, language30, language32, language33 };
        int int36 = surnamesDictionary14.size(languageArray35);
        int int37 = surnamesDictionary10.size(languageArray35);
        io.resourcepool.generator.Query.Builder builder38 = builder5.languages(languageArray35);
        io.resourcepool.generator.Query.Builder builder39 = builder4.languages(languageArray35);
        io.resourcepool.generator.Query.Builder builder41 = builder4.count(10);
        io.resourcepool.generator.Query query42 = builder4.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + language17 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language17.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en" + "'", str19, "en");
        org.junit.Assert.assertNotNull(languageArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20000 + "'", int21 == 20000);
        org.junit.Assert.assertTrue("'" + language23 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language23.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en" + "'", str24, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Darkhi!" + "'", str25, "Darkhi!");
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en" + "'", str28, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!1" + "'", str29, "hi!1");
        org.junit.Assert.assertTrue("'" + language30 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language30.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en" + "'", str31, "en");
        org.junit.Assert.assertTrue("'" + language32 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language32.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language33 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language33.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "en" + "'", str34, "en");
        org.junit.Assert.assertNotNull(languageArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 50000 + "'", int36 == 50000);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 50000 + "'", int37 == 50000);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(query42);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        io.resourcepool.model.Fortune fortune2 = new io.resourcepool.model.Fortune("en", "Mary");
        io.resourcepool.model.Fortune fortune3 = fortune2.clone();
        java.lang.String str4 = fortune3.source;
        org.junit.Assert.assertNotNull(fortune3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mary" + "'", str4, "Mary");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList8 = simpleNameGenerator0.nextGivenNames(4305);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(givenNameList8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator5 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator5.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList9 = simpleNameGenerator5.nextGivenNames(100);
        java.lang.String str10 = simpleNameGenerator5.nextSurname();
        io.resourcepool.model.FullName fullName11 = simpleNameGenerator5.nextName();
        java.lang.String str12 = fullName11.surname;
        io.resourcepool.model.Gender gender13 = fullName11.gender;
        io.resourcepool.model.GivenName givenName14 = new io.resourcepool.model.GivenName("Mamie23", "Ultimatehi!", gender13);
        io.resourcepool.model.FullName fullName15 = new io.resourcepool.model.FullName("TheOnlyhi!", "hi!91", "GivenName{givenName='Shaull', nickname='', gender=MALE}", gender13);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator16 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList18 = simpleNameGenerator16.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList20 = simpleNameGenerator16.nextGivenNames(100);
        java.lang.String str21 = simpleNameGenerator16.nextSurname();
        io.resourcepool.model.FullName fullName22 = simpleNameGenerator16.nextName();
        java.lang.String str23 = fullName22.surname;
        io.resourcepool.model.Gender gender24 = fullName22.gender;
        boolean boolean25 = fullName15.equals((java.lang.Object) fullName22);
        java.lang.String str26 = fullName22.givenName;
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(givenNameList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Shaull" + "'", str10, "Shaull");
        org.junit.Assert.assertNotNull(fullName11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Shaull" + "'", str12, "Shaull");
        org.junit.Assert.assertTrue("'" + gender13 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender13.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(givenNameList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Shaull" + "'", str21, "Shaull");
        org.junit.Assert.assertNotNull(fullName22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Shaull" + "'", str23, "Shaull");
        org.junit.Assert.assertTrue("'" + gender24 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender24.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Mary" + "'", str26, "Mary");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames((int) 'a');
        java.util.List<java.lang.String> strList4 = simpleNameGenerator0.nextNicknames(4305);
        io.resourcepool.model.GivenName givenName5 = simpleNameGenerator0.nextGivenName();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextSurnames((int) (short) 100);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary8 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray9 = new io.resourcepool.model.Language[] {};
        int int10 = surnamesDictionary8.size(languageArray9);
        io.resourcepool.model.Language language11 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.random();
        java.lang.String str13 = language12.getLocaleCode();
        io.resourcepool.model.Language[] languageArray14 = new io.resourcepool.model.Language[] { language11, language12 };
        int int15 = surnamesDictionary8.size(languageArray14);
        io.resourcepool.model.Language language17 = io.resourcepool.model.Language.random();
        java.lang.String str18 = language17.getLocaleCode();
        java.lang.String str19 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language17);
        io.resourcepool.model.Language language21 = io.resourcepool.model.Language.random();
        java.lang.String str22 = language21.getLocaleCode();
        java.lang.String str23 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language21);
        io.resourcepool.model.Language language24 = io.resourcepool.model.Language.random();
        java.lang.String str25 = language24.getLocaleCode();
        io.resourcepool.model.Language language26 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.random();
        java.lang.String str28 = language27.getLocaleCode();
        io.resourcepool.model.Language[] languageArray29 = new io.resourcepool.model.Language[] { language17, language21, language24, language26, language27 };
        int int30 = surnamesDictionary8.size(languageArray29);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary31 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int32 = fortunesDictionary31.size();
        io.resourcepool.generator.Query.Builder builder33 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary34 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary35 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray36 = new io.resourcepool.model.Language[] {};
        int int37 = surnamesDictionary35.size(languageArray36);
        int int38 = givenNamesDictionary34.size(languageArray36);
        io.resourcepool.generator.Query.Builder builder39 = builder33.languages(languageArray36);
        int int40 = fortunesDictionary31.size(languageArray36);
        int int41 = surnamesDictionary8.size(languageArray36);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary43 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray44 = new io.resourcepool.model.Language[] {};
        int int45 = surnamesDictionary43.size(languageArray44);
        io.resourcepool.model.Language language46 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language47 = io.resourcepool.model.Language.random();
        java.lang.String str48 = language47.getLocaleCode();
        io.resourcepool.model.Language[] languageArray49 = new io.resourcepool.model.Language[] { language46, language47 };
        int int50 = surnamesDictionary43.size(languageArray49);
        io.resourcepool.generator.Query query51 = new io.resourcepool.generator.Query(20000, languageArray49);
        java.util.List<java.lang.String> strList52 = surnamesDictionary8.pick(query51);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator53 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList55 = simpleNameGenerator53.nextSurnames(1);
        java.lang.String str56 = simpleNameGenerator53.nextNickname();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary57 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList59 = surnamesDictionary57.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary61 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray62 = new io.resourcepool.model.Language[] {};
        int int63 = surnamesDictionary61.size(languageArray62);
        io.resourcepool.model.Language language64 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language65 = io.resourcepool.model.Language.random();
        java.lang.String str66 = language65.getLocaleCode();
        io.resourcepool.model.Language[] languageArray67 = new io.resourcepool.model.Language[] { language64, language65 };
        int int68 = surnamesDictionary61.size(languageArray67);
        io.resourcepool.generator.Query query69 = new io.resourcepool.generator.Query(20000, languageArray67);
        java.util.List<java.lang.String> strList70 = surnamesDictionary57.pick(query69);
        java.util.List<io.resourcepool.model.FullName> fullNameList71 = simpleNameGenerator53.nextNames(query69);
        java.util.List<java.lang.String> strList72 = surnamesDictionary8.pick(query69);
        java.util.List<io.resourcepool.model.FullName> fullNameList73 = simpleNameGenerator0.nextNames(query69);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(givenName5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(languageArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + language11 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language11.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertNotNull(languageArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertTrue("'" + language17 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language17.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en" + "'", str18, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!60" + "'", str19, "hi!60");
        org.junit.Assert.assertTrue("'" + language21 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language21.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en" + "'", str22, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!99" + "'", str23, "hi!99");
        org.junit.Assert.assertTrue("'" + language24 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language24.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
        org.junit.Assert.assertTrue("'" + language26 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language26.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en" + "'", str28, "en");
        org.junit.Assert.assertNotNull(languageArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50000 + "'", int30 == 50000);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 11812 + "'", int32 == 11812);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(languageArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(languageArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + language46 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language46.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language47 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language47.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "en" + "'", str48, "en");
        org.junit.Assert.assertNotNull(languageArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 20000 + "'", int50 == 20000);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Mamie23" + "'", str56, "Mamie23");
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(languageArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + language64 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language64.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language65 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language65.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "en" + "'", str66, "en");
        org.junit.Assert.assertNotNull(languageArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 20000 + "'", int68 == 20000);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(fullNameList71);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(fullNameList73);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.lang.String str1 = simpleNameGenerator0.nextNickname();
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary2 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int3 = fortunesDictionary2.size();
        io.resourcepool.generator.Query.Builder builder4 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary5 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary6 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray7 = new io.resourcepool.model.Language[] {};
        int int8 = surnamesDictionary6.size(languageArray7);
        int int9 = givenNamesDictionary5.size(languageArray7);
        io.resourcepool.generator.Query.Builder builder10 = builder4.languages(languageArray7);
        int int11 = fortunesDictionary2.size(languageArray7);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary12 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int13 = fortunesDictionary12.size();
        io.resourcepool.generator.Query.Builder builder14 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary15 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary16 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray17 = new io.resourcepool.model.Language[] {};
        int int18 = surnamesDictionary16.size(languageArray17);
        int int19 = givenNamesDictionary15.size(languageArray17);
        io.resourcepool.generator.Query.Builder builder20 = builder14.languages(languageArray17);
        int int21 = fortunesDictionary12.size(languageArray17);
        int int22 = fortunesDictionary2.size(languageArray17);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator23 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune24 = simpleFortuneGenerator23.nextFortune();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary25 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray26 = new io.resourcepool.model.Language[] {};
        int int27 = surnamesDictionary25.size(languageArray26);
        io.resourcepool.model.Language language28 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language29 = io.resourcepool.model.Language.random();
        java.lang.String str30 = language29.getLocaleCode();
        io.resourcepool.model.Language[] languageArray31 = new io.resourcepool.model.Language[] { language28, language29 };
        int int32 = surnamesDictionary25.size(languageArray31);
        io.resourcepool.model.Language language34 = io.resourcepool.model.Language.random();
        java.lang.String str35 = language34.getLocaleCode();
        java.lang.String str36 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language34);
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.random();
        java.lang.String str39 = language38.getLocaleCode();
        java.lang.String str40 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language38);
        io.resourcepool.model.Language language41 = io.resourcepool.model.Language.random();
        java.lang.String str42 = language41.getLocaleCode();
        io.resourcepool.model.Language language43 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language44 = io.resourcepool.model.Language.random();
        java.lang.String str45 = language44.getLocaleCode();
        io.resourcepool.model.Language[] languageArray46 = new io.resourcepool.model.Language[] { language34, language38, language41, language43, language44 };
        int int47 = surnamesDictionary25.size(languageArray46);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary48 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int49 = fortunesDictionary48.size();
        io.resourcepool.generator.Query.Builder builder50 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary51 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary52 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray53 = new io.resourcepool.model.Language[] {};
        int int54 = surnamesDictionary52.size(languageArray53);
        int int55 = givenNamesDictionary51.size(languageArray53);
        io.resourcepool.generator.Query.Builder builder56 = builder50.languages(languageArray53);
        int int57 = fortunesDictionary48.size(languageArray53);
        int int58 = surnamesDictionary25.size(languageArray53);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary60 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray61 = new io.resourcepool.model.Language[] {};
        int int62 = surnamesDictionary60.size(languageArray61);
        io.resourcepool.model.Language language63 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language64 = io.resourcepool.model.Language.random();
        java.lang.String str65 = language64.getLocaleCode();
        io.resourcepool.model.Language[] languageArray66 = new io.resourcepool.model.Language[] { language63, language64 };
        int int67 = surnamesDictionary60.size(languageArray66);
        io.resourcepool.generator.Query query68 = new io.resourcepool.generator.Query(20000, languageArray66);
        java.util.List<java.lang.String> strList69 = surnamesDictionary25.pick(query68);
        java.util.List<io.resourcepool.model.Fortune> fortuneList70 = simpleFortuneGenerator23.nextFortunes(query68);
        java.util.List<io.resourcepool.model.Fortune> fortuneList71 = fortunesDictionary2.pick(query68);
        int int72 = query68.count;
        java.util.List<io.resourcepool.model.FullName> fullNameList73 = simpleNameGenerator0.nextNames(query68);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mamie23" + "'", str1, "Mamie23");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11812 + "'", int3 == 11812);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(languageArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11812 + "'", int13 == 11812);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(languageArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(fortune24);
        org.junit.Assert.assertNotNull(languageArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language29 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language29.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en" + "'", str30, "en");
        org.junit.Assert.assertNotNull(languageArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20000 + "'", int32 == 20000);
        org.junit.Assert.assertTrue("'" + language34 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language34.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "en" + "'", str35, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!59" + "'", str36, "hi!59");
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en" + "'", str39, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Stupidhi!" + "'", str40, "Stupidhi!");
        org.junit.Assert.assertTrue("'" + language41 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language41.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "en" + "'", str42, "en");
        org.junit.Assert.assertTrue("'" + language43 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language43.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language44 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language44.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "en" + "'", str45, "en");
        org.junit.Assert.assertNotNull(languageArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 50000 + "'", int47 == 50000);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 11812 + "'", int49 == 11812);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(languageArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(languageArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + language63 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language63.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language64 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language64.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "en" + "'", str65, "en");
        org.junit.Assert.assertNotNull(languageArray66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 20000 + "'", int67 == 20000);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(fortuneList70);
        org.junit.Assert.assertNotNull(fortuneList71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 20000 + "'", int72 == 20000);
        org.junit.Assert.assertNotNull(fullNameList73);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.util.List<java.lang.String> strList8 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList10 = simpleNameGenerator0.nextGivenNames((int) ' ');
        java.lang.String str11 = simpleNameGenerator0.nextNickname();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(givenNameList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mamie23" + "'", str11, "Mamie23");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames((int) 'a');
        io.resourcepool.model.GivenName givenName3 = simpleNameGenerator0.nextGivenName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenName3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        io.resourcepool.generator.Query.Builder builder0 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray1 = null;
        io.resourcepool.generator.Query.Builder builder2 = builder0.languages(languageArray1);
        io.resourcepool.generator.Query.Builder builder4 = builder0.count((int) (byte) 1);
        io.resourcepool.generator.Query.Builder builder5 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray6 = null;
        io.resourcepool.generator.Query.Builder builder7 = builder5.languages(languageArray6);
        io.resourcepool.generator.Query.Builder builder9 = builder5.count((int) (byte) 1);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList12 = surnamesDictionary10.pick((int) 'a');
        int int13 = surnamesDictionary10.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary14 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray15 = new io.resourcepool.model.Language[] {};
        int int16 = surnamesDictionary14.size(languageArray15);
        io.resourcepool.model.Language language17 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.random();
        java.lang.String str19 = language18.getLocaleCode();
        io.resourcepool.model.Language[] languageArray20 = new io.resourcepool.model.Language[] { language17, language18 };
        int int21 = surnamesDictionary14.size(languageArray20);
        io.resourcepool.model.Language language23 = io.resourcepool.model.Language.random();
        java.lang.String str24 = language23.getLocaleCode();
        java.lang.String str25 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language23);
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.random();
        java.lang.String str28 = language27.getLocaleCode();
        java.lang.String str29 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language27);
        io.resourcepool.model.Language language30 = io.resourcepool.model.Language.random();
        java.lang.String str31 = language30.getLocaleCode();
        io.resourcepool.model.Language language32 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language33 = io.resourcepool.model.Language.random();
        java.lang.String str34 = language33.getLocaleCode();
        io.resourcepool.model.Language[] languageArray35 = new io.resourcepool.model.Language[] { language23, language27, language30, language32, language33 };
        int int36 = surnamesDictionary14.size(languageArray35);
        int int37 = surnamesDictionary10.size(languageArray35);
        io.resourcepool.generator.Query.Builder builder38 = builder5.languages(languageArray35);
        io.resourcepool.generator.Query.Builder builder39 = builder4.languages(languageArray35);
        io.resourcepool.generator.Query query40 = builder39.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + language17 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language17.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en" + "'", str19, "en");
        org.junit.Assert.assertNotNull(languageArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20000 + "'", int21 == 20000);
        org.junit.Assert.assertTrue("'" + language23 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language23.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en" + "'", str24, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!71" + "'", str25, "hi!71");
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en" + "'", str28, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!60" + "'", str29, "hi!60");
        org.junit.Assert.assertTrue("'" + language30 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language30.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en" + "'", str31, "en");
        org.junit.Assert.assertTrue("'" + language32 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language32.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language33 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language33.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "en" + "'", str34, "en");
        org.junit.Assert.assertNotNull(languageArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 50000 + "'", int36 == 50000);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 50000 + "'", int37 == 50000);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(query40);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList13 = simpleNameGenerator0.nextSurnames((int) 'a');
        java.util.List<java.lang.String> strList15 = simpleNameGenerator0.nextSurnames(11812);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes((int) (short) 10);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary5 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary6 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList8 = surnamesDictionary6.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray11 = new io.resourcepool.model.Language[] {};
        int int12 = surnamesDictionary10.size(languageArray11);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language14 = io.resourcepool.model.Language.random();
        java.lang.String str15 = language14.getLocaleCode();
        io.resourcepool.model.Language[] languageArray16 = new io.resourcepool.model.Language[] { language13, language14 };
        int int17 = surnamesDictionary10.size(languageArray16);
        io.resourcepool.generator.Query query18 = new io.resourcepool.generator.Query(20000, languageArray16);
        java.util.List<java.lang.String> strList19 = surnamesDictionary6.pick(query18);
        java.util.List<java.lang.String> strList20 = surnamesDictionary5.pick(query18);
        java.util.List<io.resourcepool.model.Fortune> fortuneList21 = simpleFortuneGenerator0.nextFortunes(query18);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator22 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune23 = simpleFortuneGenerator22.nextFortune();
        io.resourcepool.model.Fortune fortune24 = simpleFortuneGenerator22.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList26 = simpleFortuneGenerator22.nextFortunes((int) (short) 10);
        java.util.List<io.resourcepool.model.Fortune> fortuneList28 = simpleFortuneGenerator22.nextFortunes((int) (byte) 10);
        io.resourcepool.model.Fortune fortune29 = simpleFortuneGenerator22.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList31 = simpleFortuneGenerator22.nextFortunes((int) (short) 1);
        io.resourcepool.model.Fortune fortune32 = simpleFortuneGenerator22.nextFortune();
        io.resourcepool.model.Language language33 = io.resourcepool.model.Language.random();
        java.lang.String str34 = language33.getLocaleCode();
        java.util.List<io.resourcepool.model.Fortune> fortuneList35 = io.resourcepool.dictionary.loader.FortuneLoader.load(language33);
        io.resourcepool.model.Fortune fortune36 = simpleFortuneGenerator22.nextFortune(language33);
        io.resourcepool.model.Fortune fortune37 = simpleFortuneGenerator0.nextFortune(language33);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language14 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language14.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertNotNull(languageArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(fortuneList21);
        org.junit.Assert.assertNotNull(fortune23);
        org.junit.Assert.assertNotNull(fortune24);
        org.junit.Assert.assertNotNull(fortuneList26);
        org.junit.Assert.assertNotNull(fortuneList28);
        org.junit.Assert.assertNotNull(fortune29);
        org.junit.Assert.assertNotNull(fortuneList31);
        org.junit.Assert.assertNotNull(fortune32);
        org.junit.Assert.assertTrue("'" + language33 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language33.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "en" + "'", str34, "en");
        org.junit.Assert.assertNotNull(fortuneList35);
        org.junit.Assert.assertNotNull(fortune36);
        org.junit.Assert.assertNotNull(fortune37);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        java.lang.String str5 = givenName4.toString();
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GivenName{givenName='Shaull', nickname='', gender=MALE}" + "'", str5, "GivenName{givenName='Shaull', nickname='', gender=MALE}");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int1 = fortunesDictionary0.size();
        int int2 = fortunesDictionary0.size();
        io.resourcepool.model.Fortune fortune3 = fortunesDictionary0.pick();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11812 + "'", int2 == 11812);
        org.junit.Assert.assertNotNull(fortune3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        io.resourcepool.model.Language language9 = io.resourcepool.model.Language.random();
        java.lang.String str10 = language9.getLocaleCode();
        java.lang.String str11 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language9);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.random();
        java.lang.String str14 = language13.getLocaleCode();
        java.lang.String str15 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language13);
        io.resourcepool.model.Language language16 = io.resourcepool.model.Language.random();
        java.lang.String str17 = language16.getLocaleCode();
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        java.lang.String str20 = language19.getLocaleCode();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] { language9, language13, language16, language18, language19 };
        int int22 = surnamesDictionary0.size(languageArray21);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary23 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray24 = new io.resourcepool.model.Language[] {};
        int int25 = surnamesDictionary23.size(languageArray24);
        io.resourcepool.model.Language language26 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.random();
        java.lang.String str28 = language27.getLocaleCode();
        io.resourcepool.model.Language[] languageArray29 = new io.resourcepool.model.Language[] { language26, language27 };
        int int30 = surnamesDictionary23.size(languageArray29);
        io.resourcepool.model.Language language32 = io.resourcepool.model.Language.random();
        java.lang.String str33 = language32.getLocaleCode();
        java.lang.String str34 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language32);
        io.resourcepool.model.Language language36 = io.resourcepool.model.Language.random();
        java.lang.String str37 = language36.getLocaleCode();
        java.lang.String str38 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language36);
        io.resourcepool.model.Language language39 = io.resourcepool.model.Language.random();
        java.lang.String str40 = language39.getLocaleCode();
        io.resourcepool.model.Language language41 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language42 = io.resourcepool.model.Language.random();
        java.lang.String str43 = language42.getLocaleCode();
        io.resourcepool.model.Language[] languageArray44 = new io.resourcepool.model.Language[] { language32, language36, language39, language41, language42 };
        int int45 = surnamesDictionary23.size(languageArray44);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary46 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int47 = fortunesDictionary46.size();
        io.resourcepool.generator.Query.Builder builder48 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary49 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary50 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray51 = new io.resourcepool.model.Language[] {};
        int int52 = surnamesDictionary50.size(languageArray51);
        int int53 = givenNamesDictionary49.size(languageArray51);
        io.resourcepool.generator.Query.Builder builder54 = builder48.languages(languageArray51);
        int int55 = fortunesDictionary46.size(languageArray51);
        int int56 = surnamesDictionary23.size(languageArray51);
        int int57 = surnamesDictionary0.size(languageArray51);
        java.lang.String str58 = surnamesDictionary0.pick();
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!12" + "'", str11, "hi!12");
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!81" + "'", str15, "hi!81");
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50000 + "'", int22 == 50000);
        org.junit.Assert.assertNotNull(languageArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + language26 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language26.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en" + "'", str28, "en");
        org.junit.Assert.assertNotNull(languageArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20000 + "'", int30 == 20000);
        org.junit.Assert.assertTrue("'" + language32 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language32.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "en" + "'", str33, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!9" + "'", str34, "hi!9");
        org.junit.Assert.assertTrue("'" + language36 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language36.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "en" + "'", str37, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!98" + "'", str38, "hi!98");
        org.junit.Assert.assertTrue("'" + language39 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language39.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "en" + "'", str40, "en");
        org.junit.Assert.assertTrue("'" + language41 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language41.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language42 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language42.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "en" + "'", str43, "en");
        org.junit.Assert.assertNotNull(languageArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 50000 + "'", int45 == 50000);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 11812 + "'", int47 == 11812);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(languageArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Shaull" + "'", str58, "Shaull");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        io.resourcepool.model.Gender gender7 = fullName6.gender;
        java.lang.String str8 = fullName6.nickname;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertTrue("'" + gender7 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender7.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mamie23" + "'", str8, "Mamie23");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        int int8 = surnamesDictionary0.size();
        java.lang.String str9 = surnamesDictionary0.pick();
        int int10 = surnamesDictionary0.size();
        java.util.List<java.lang.String> strList12 = surnamesDictionary0.pick(1);
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Shaull" + "'", str9, "Shaull");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        int int4 = surnamesDictionary0.size(languageArray2);
        int int5 = surnamesDictionary0.size();
        java.lang.String str6 = surnamesDictionary0.pick();
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20000 + "'", int5 == 20000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Shaull" + "'", str6, "Shaull");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<io.resourcepool.model.FullName> fullNameList8 = simpleNameGenerator0.nextNames((int) (short) 10);
        java.lang.String str9 = simpleNameGenerator0.nextSurname();
        java.util.List<io.resourcepool.model.FullName> fullNameList11 = simpleNameGenerator0.nextNames((-1));
        io.resourcepool.model.GivenName givenName12 = simpleNameGenerator0.nextGivenName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(fullNameList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Shaull" + "'", str9, "Shaull");
        org.junit.Assert.assertNotNull(fullNameList11);
        org.junit.Assert.assertNotNull(givenName12);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.FullName fullName6 = givenName4.toFullName("hi!");
        java.lang.String str7 = givenName4.nickname;
        java.lang.String str8 = givenName4.givenName;
        java.lang.String str9 = givenName4.toString();
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GivenName{givenName='Shaull', nickname='', gender=MALE}" + "'", str9, "GivenName{givenName='Shaull', nickname='', gender=MALE}");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        java.lang.String str11 = givenName10.nickname;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mamie23" + "'", str11, "Mamie23");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int1 = fortunesDictionary0.size();
        io.resourcepool.generator.Query.Builder builder2 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary3 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary4 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray5 = new io.resourcepool.model.Language[] {};
        int int6 = surnamesDictionary4.size(languageArray5);
        int int7 = givenNamesDictionary3.size(languageArray5);
        io.resourcepool.generator.Query.Builder builder8 = builder2.languages(languageArray5);
        int int9 = fortunesDictionary0.size(languageArray5);
        java.util.List<io.resourcepool.model.Fortune> fortuneList11 = fortunesDictionary0.pick((int) (short) 1);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary12 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        java.util.List<io.resourcepool.model.GivenName> givenNameList14 = givenNamesDictionary12.pick(0);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator15 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList17 = simpleFortuneGenerator15.nextFortunes(0);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator18 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune19 = simpleFortuneGenerator18.nextFortune();
        io.resourcepool.model.Language language20 = io.resourcepool.model.Language.random();
        java.lang.String str21 = language20.getLocaleCode();
        io.resourcepool.model.Fortune fortune22 = simpleFortuneGenerator18.nextFortune(language20);
        io.resourcepool.model.Fortune fortune23 = simpleFortuneGenerator15.nextFortune(language20);
        io.resourcepool.model.GivenName givenName24 = givenNamesDictionary12.pick(language20);
        io.resourcepool.model.Fortune fortune25 = fortunesDictionary0.pick(language20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fortuneList11);
        org.junit.Assert.assertNotNull(givenNameList14);
        org.junit.Assert.assertNotNull(fortuneList17);
        org.junit.Assert.assertNotNull(fortune19);
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en" + "'", str21, "en");
        org.junit.Assert.assertNotNull(fortune22);
        org.junit.Assert.assertNotNull(fortune23);
        org.junit.Assert.assertNotNull(givenName24);
        org.junit.Assert.assertNotNull(fortune25);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int1 = fortunesDictionary0.size();
        int int2 = fortunesDictionary0.size();
        int int3 = fortunesDictionary0.size();
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary4 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int5 = fortunesDictionary4.size();
        io.resourcepool.generator.Query.Builder builder6 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary7 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary8 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray9 = new io.resourcepool.model.Language[] {};
        int int10 = surnamesDictionary8.size(languageArray9);
        int int11 = givenNamesDictionary7.size(languageArray9);
        io.resourcepool.generator.Query.Builder builder12 = builder6.languages(languageArray9);
        int int13 = fortunesDictionary4.size(languageArray9);
        io.resourcepool.model.Fortune fortune14 = fortunesDictionary4.pick();
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator15 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList17 = simpleNameGenerator15.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList19 = simpleNameGenerator15.nextGivenNames(100);
        java.lang.String str20 = simpleNameGenerator15.nextSurname();
        io.resourcepool.model.FullName fullName21 = simpleNameGenerator15.nextName();
        java.util.List<io.resourcepool.model.FullName> fullNameList23 = simpleNameGenerator15.nextNames((int) (short) 10);
        java.lang.String str24 = simpleNameGenerator15.nextSurname();
        java.util.List<io.resourcepool.model.FullName> fullNameList26 = simpleNameGenerator15.nextNames(0);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary27 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray28 = new io.resourcepool.model.Language[] {};
        int int29 = surnamesDictionary27.size(languageArray28);
        io.resourcepool.model.Language language30 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language31 = io.resourcepool.model.Language.random();
        java.lang.String str32 = language31.getLocaleCode();
        io.resourcepool.model.Language[] languageArray33 = new io.resourcepool.model.Language[] { language30, language31 };
        int int34 = surnamesDictionary27.size(languageArray33);
        io.resourcepool.model.Language language36 = io.resourcepool.model.Language.random();
        java.lang.String str37 = language36.getLocaleCode();
        java.lang.String str38 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language36);
        io.resourcepool.model.Language language40 = io.resourcepool.model.Language.random();
        java.lang.String str41 = language40.getLocaleCode();
        java.lang.String str42 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language40);
        io.resourcepool.model.Language language43 = io.resourcepool.model.Language.random();
        java.lang.String str44 = language43.getLocaleCode();
        io.resourcepool.model.Language language45 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language46 = io.resourcepool.model.Language.random();
        java.lang.String str47 = language46.getLocaleCode();
        io.resourcepool.model.Language[] languageArray48 = new io.resourcepool.model.Language[] { language36, language40, language43, language45, language46 };
        int int49 = surnamesDictionary27.size(languageArray48);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary50 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int51 = fortunesDictionary50.size();
        io.resourcepool.generator.Query.Builder builder52 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary53 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary54 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray55 = new io.resourcepool.model.Language[] {};
        int int56 = surnamesDictionary54.size(languageArray55);
        int int57 = givenNamesDictionary53.size(languageArray55);
        io.resourcepool.generator.Query.Builder builder58 = builder52.languages(languageArray55);
        int int59 = fortunesDictionary50.size(languageArray55);
        int int60 = surnamesDictionary27.size(languageArray55);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary62 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray63 = new io.resourcepool.model.Language[] {};
        int int64 = surnamesDictionary62.size(languageArray63);
        io.resourcepool.model.Language language65 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language66 = io.resourcepool.model.Language.random();
        java.lang.String str67 = language66.getLocaleCode();
        io.resourcepool.model.Language[] languageArray68 = new io.resourcepool.model.Language[] { language65, language66 };
        int int69 = surnamesDictionary62.size(languageArray68);
        io.resourcepool.generator.Query query70 = new io.resourcepool.generator.Query(20000, languageArray68);
        java.util.List<java.lang.String> strList71 = surnamesDictionary27.pick(query70);
        io.resourcepool.model.Language[] languageArray72 = query70.languages;
        java.util.List<io.resourcepool.model.FullName> fullNameList73 = simpleNameGenerator15.nextNames(query70);
        java.util.List<io.resourcepool.model.Fortune> fortuneList74 = fortunesDictionary4.pick(query70);
        java.util.List<io.resourcepool.model.Fortune> fortuneList75 = fortunesDictionary0.pick(query70);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11812 + "'", int2 == 11812);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11812 + "'", int3 == 11812);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11812 + "'", int5 == 11812);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(languageArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fortune14);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(givenNameList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Shaull" + "'", str20, "Shaull");
        org.junit.Assert.assertNotNull(fullName21);
        org.junit.Assert.assertNotNull(fullNameList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Shaull" + "'", str24, "Shaull");
        org.junit.Assert.assertNotNull(fullNameList26);
        org.junit.Assert.assertNotNull(languageArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + language30 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language30.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language31 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language31.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "en" + "'", str32, "en");
        org.junit.Assert.assertNotNull(languageArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20000 + "'", int34 == 20000);
        org.junit.Assert.assertTrue("'" + language36 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language36.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "en" + "'", str37, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!30" + "'", str38, "hi!30");
        org.junit.Assert.assertTrue("'" + language40 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language40.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "en" + "'", str41, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Masterhi!" + "'", str42, "Masterhi!");
        org.junit.Assert.assertTrue("'" + language43 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language43.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "en" + "'", str44, "en");
        org.junit.Assert.assertTrue("'" + language45 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language45.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language46 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language46.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "en" + "'", str47, "en");
        org.junit.Assert.assertNotNull(languageArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 50000 + "'", int49 == 50000);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 11812 + "'", int51 == 11812);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(languageArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(languageArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + language65 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language65.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language66 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language66.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "en" + "'", str67, "en");
        org.junit.Assert.assertNotNull(languageArray68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 20000 + "'", int69 == 20000);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(languageArray72);
        org.junit.Assert.assertNotNull(fullNameList73);
        org.junit.Assert.assertNotNull(fortuneList74);
        org.junit.Assert.assertNotNull(fortuneList75);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        io.resourcepool.model.Gender gender7 = fullName6.gender;
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary8 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary9 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray10 = new io.resourcepool.model.Language[] {};
        int int11 = surnamesDictionary9.size(languageArray10);
        int int12 = givenNamesDictionary8.size(languageArray10);
        java.util.List<io.resourcepool.model.GivenName> givenNameList14 = givenNamesDictionary8.pick((int) ' ');
        boolean boolean15 = fullName6.equals((java.lang.Object) givenNamesDictionary8);
        io.resourcepool.model.Gender gender16 = fullName6.gender;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertTrue("'" + gender7 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender7.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertNotNull(languageArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(givenNameList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + gender16 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender16.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.model.GivenName givenName1 = givenNamesDictionary0.pick();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary2 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray3 = new io.resourcepool.model.Language[] {};
        int int4 = surnamesDictionary2.size(languageArray3);
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language6 = io.resourcepool.model.Language.random();
        java.lang.String str7 = language6.getLocaleCode();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] { language5, language6 };
        int int9 = surnamesDictionary2.size(languageArray8);
        io.resourcepool.model.Language language11 = io.resourcepool.model.Language.random();
        java.lang.String str12 = language11.getLocaleCode();
        java.lang.String str13 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language11);
        io.resourcepool.model.Language language15 = io.resourcepool.model.Language.random();
        java.lang.String str16 = language15.getLocaleCode();
        java.lang.String str17 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language15);
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.random();
        java.lang.String str19 = language18.getLocaleCode();
        io.resourcepool.model.Language language20 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language21 = io.resourcepool.model.Language.random();
        java.lang.String str22 = language21.getLocaleCode();
        io.resourcepool.model.Language[] languageArray23 = new io.resourcepool.model.Language[] { language11, language15, language18, language20, language21 };
        int int24 = surnamesDictionary2.size(languageArray23);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary25 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int26 = fortunesDictionary25.size();
        io.resourcepool.generator.Query.Builder builder27 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary28 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary29 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray30 = new io.resourcepool.model.Language[] {};
        int int31 = surnamesDictionary29.size(languageArray30);
        int int32 = givenNamesDictionary28.size(languageArray30);
        io.resourcepool.generator.Query.Builder builder33 = builder27.languages(languageArray30);
        int int34 = fortunesDictionary25.size(languageArray30);
        int int35 = surnamesDictionary2.size(languageArray30);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary37 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray38 = new io.resourcepool.model.Language[] {};
        int int39 = surnamesDictionary37.size(languageArray38);
        io.resourcepool.model.Language language40 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language41 = io.resourcepool.model.Language.random();
        java.lang.String str42 = language41.getLocaleCode();
        io.resourcepool.model.Language[] languageArray43 = new io.resourcepool.model.Language[] { language40, language41 };
        int int44 = surnamesDictionary37.size(languageArray43);
        io.resourcepool.generator.Query query45 = new io.resourcepool.generator.Query(20000, languageArray43);
        java.util.List<java.lang.String> strList46 = surnamesDictionary2.pick(query45);
        io.resourcepool.model.Language[] languageArray47 = query45.languages;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList48 = givenNamesDictionary0.pick(query45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(givenName1);
        org.junit.Assert.assertNotNull(languageArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language6 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language6.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertTrue("'" + language11 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language11.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en" + "'", str12, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!21" + "'", str13, "hi!21");
        org.junit.Assert.assertTrue("'" + language15 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language15.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en" + "'", str16, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!64" + "'", str17, "hi!64");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en" + "'", str19, "en");
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language21 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language21.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en" + "'", str22, "en");
        org.junit.Assert.assertNotNull(languageArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50000 + "'", int24 == 50000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11812 + "'", int26 == 11812);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(languageArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + language40 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language40.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language41 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language41.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "en" + "'", str42, "en");
        org.junit.Assert.assertNotNull(languageArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 20000 + "'", int44 == 20000);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(languageArray47);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        io.resourcepool.model.Gender gender5 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName6 = new io.resourcepool.model.GivenName("Shaull", "Shaull", gender5);
        io.resourcepool.model.GivenName givenName7 = new io.resourcepool.model.GivenName("Mamie23", "Shaull", gender5);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary8 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList10 = surnamesDictionary8.pick((int) 'a');
        int int11 = surnamesDictionary8.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary12 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray13 = new io.resourcepool.model.Language[] {};
        int int14 = surnamesDictionary12.size(languageArray13);
        io.resourcepool.model.Language language15 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language16 = io.resourcepool.model.Language.random();
        java.lang.String str17 = language16.getLocaleCode();
        io.resourcepool.model.Language[] languageArray18 = new io.resourcepool.model.Language[] { language15, language16 };
        int int19 = surnamesDictionary12.size(languageArray18);
        io.resourcepool.model.Language language21 = io.resourcepool.model.Language.random();
        java.lang.String str22 = language21.getLocaleCode();
        java.lang.String str23 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language21);
        io.resourcepool.model.Language language25 = io.resourcepool.model.Language.random();
        java.lang.String str26 = language25.getLocaleCode();
        java.lang.String str27 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language25);
        io.resourcepool.model.Language language28 = io.resourcepool.model.Language.random();
        java.lang.String str29 = language28.getLocaleCode();
        io.resourcepool.model.Language language30 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language31 = io.resourcepool.model.Language.random();
        java.lang.String str32 = language31.getLocaleCode();
        io.resourcepool.model.Language[] languageArray33 = new io.resourcepool.model.Language[] { language21, language25, language28, language30, language31 };
        int int34 = surnamesDictionary12.size(languageArray33);
        int int35 = surnamesDictionary8.size(languageArray33);
        boolean boolean36 = givenName7.equals((java.lang.Object) languageArray33);
        io.resourcepool.generator.Query query37 = new io.resourcepool.generator.Query((int) '4', languageArray33);
        int int38 = query37.count;
        org.junit.Assert.assertTrue("'" + gender5 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender5.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(languageArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + language15 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language15.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertNotNull(languageArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20000 + "'", int19 == 20000);
        org.junit.Assert.assertTrue("'" + language21 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language21.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en" + "'", str22, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!18" + "'", str23, "hi!18");
        org.junit.Assert.assertTrue("'" + language25 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language25.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en" + "'", str26, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!47" + "'", str27, "hi!47");
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en" + "'", str29, "en");
        org.junit.Assert.assertTrue("'" + language30 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language30.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language31 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language31.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "en" + "'", str32, "en");
        org.junit.Assert.assertNotNull(languageArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 50000 + "'", int34 == 50000);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 50000 + "'", int35 == 50000);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        io.resourcepool.generator.Query.Builder builder0 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray1 = null;
        io.resourcepool.generator.Query.Builder builder2 = builder0.languages(languageArray1);
        io.resourcepool.generator.Query query3 = builder2.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(query3);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextNickname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mamie23" + "'", str5, "Mamie23");
        org.junit.Assert.assertNotNull(fullName6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList8 = simpleNameGenerator0.nextNicknames(4305);
        java.lang.String str9 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(4305);
        java.util.List<io.resourcepool.model.FullName> fullNameList13 = simpleNameGenerator0.nextNames((int) '#');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Shaull" + "'", str9, "Shaull");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(fullNameList13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.FullName fullName6 = givenName4.toFullName("hi!");
        boolean boolean8 = fullName6.equals((java.lang.Object) "hi!17");
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.FullName fullName6 = givenName4.toFullName("hi!");
        java.lang.String str7 = fullName6.toString();
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator8 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList10 = simpleNameGenerator8.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList12 = simpleNameGenerator8.nextGivenNames(100);
        java.lang.String str13 = simpleNameGenerator8.nextSurname();
        io.resourcepool.model.FullName fullName14 = simpleNameGenerator8.nextName();
        java.util.List<java.lang.String> strList16 = simpleNameGenerator8.nextNicknames(4305);
        io.resourcepool.model.GivenName givenName17 = simpleNameGenerator8.nextGivenName();
        java.util.List<java.lang.String> strList19 = simpleNameGenerator8.nextNicknames(4305);
        boolean boolean20 = fullName6.equals((java.lang.Object) 4305);
        java.lang.String str21 = fullName6.givenName;
        java.lang.String str22 = fullName6.toString();
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FullName{givenName='Shaull', surname='hi!', nickname='', gender=MALE}" + "'", str7, "FullName{givenName='Shaull', surname='hi!', nickname='', gender=MALE}");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(givenNameList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Shaull" + "'", str13, "Shaull");
        org.junit.Assert.assertNotNull(fullName14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(givenName17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Shaull" + "'", str21, "Shaull");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "FullName{givenName='Shaull', surname='hi!', nickname='', gender=MALE}" + "'", str22, "FullName{givenName='Shaull', surname='hi!', nickname='', gender=MALE}");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        io.resourcepool.model.Language language9 = io.resourcepool.model.Language.random();
        java.lang.String str10 = language9.getLocaleCode();
        java.lang.String str11 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language9);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.random();
        java.lang.String str14 = language13.getLocaleCode();
        java.lang.String str15 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language13);
        io.resourcepool.model.Language language16 = io.resourcepool.model.Language.random();
        java.lang.String str17 = language16.getLocaleCode();
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        java.lang.String str20 = language19.getLocaleCode();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] { language9, language13, language16, language18, language19 };
        int int22 = surnamesDictionary0.size(languageArray21);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary23 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int24 = fortunesDictionary23.size();
        io.resourcepool.generator.Query.Builder builder25 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary26 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary27 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray28 = new io.resourcepool.model.Language[] {};
        int int29 = surnamesDictionary27.size(languageArray28);
        int int30 = givenNamesDictionary26.size(languageArray28);
        io.resourcepool.generator.Query.Builder builder31 = builder25.languages(languageArray28);
        int int32 = fortunesDictionary23.size(languageArray28);
        int int33 = surnamesDictionary0.size(languageArray28);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary35 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray36 = new io.resourcepool.model.Language[] {};
        int int37 = surnamesDictionary35.size(languageArray36);
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language39 = io.resourcepool.model.Language.random();
        java.lang.String str40 = language39.getLocaleCode();
        io.resourcepool.model.Language[] languageArray41 = new io.resourcepool.model.Language[] { language38, language39 };
        int int42 = surnamesDictionary35.size(languageArray41);
        io.resourcepool.generator.Query query43 = new io.resourcepool.generator.Query(20000, languageArray41);
        java.util.List<java.lang.String> strList44 = surnamesDictionary0.pick(query43);
        java.lang.String str45 = surnamesDictionary0.pick();
        java.lang.String str46 = surnamesDictionary0.pick();
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!62" + "'", str11, "hi!62");
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!55" + "'", str15, "hi!55");
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50000 + "'", int22 == 50000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11812 + "'", int24 == 11812);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(languageArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(languageArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language39 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language39.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "en" + "'", str40, "en");
        org.junit.Assert.assertNotNull(languageArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20000 + "'", int42 == 20000);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Shaull" + "'", str45, "Shaull");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Shaull" + "'", str46, "Shaull");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes((int) (short) 10);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary5 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList7 = surnamesDictionary5.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary9 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray10 = new io.resourcepool.model.Language[] {};
        int int11 = surnamesDictionary9.size(languageArray10);
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.random();
        java.lang.String str14 = language13.getLocaleCode();
        io.resourcepool.model.Language[] languageArray15 = new io.resourcepool.model.Language[] { language12, language13 };
        int int16 = surnamesDictionary9.size(languageArray15);
        io.resourcepool.generator.Query query17 = new io.resourcepool.generator.Query(20000, languageArray15);
        java.util.List<java.lang.String> strList18 = surnamesDictionary5.pick(query17);
        java.util.List<io.resourcepool.model.Fortune> fortuneList19 = simpleFortuneGenerator0.nextFortunes(query17);
        io.resourcepool.model.Fortune fortune20 = simpleFortuneGenerator0.nextFortune();
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(languageArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(fortuneList19);
        org.junit.Assert.assertNotNull(fortune20);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        io.resourcepool.model.Fortune fortune2 = new io.resourcepool.model.Fortune("hi!50", "Mary");
        java.lang.String str3 = fortune2.text;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!50" + "'", str3, "hi!50");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes(0);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.random();
        java.lang.String str4 = language3.getLocaleCode();
        java.util.List<java.lang.String> strList5 = io.resourcepool.dictionary.loader.NameLoader.loadSurnames(language3);
        io.resourcepool.model.Fortune fortune6 = simpleFortuneGenerator0.nextFortune(language3);
        java.util.List<io.resourcepool.model.Fortune> fortuneList7 = io.resourcepool.dictionary.loader.FortuneLoader.load(language3);
        org.junit.Assert.assertNotNull(fortuneList2);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(fortune6);
        org.junit.Assert.assertNotNull(fortuneList7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes((int) (short) 10);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary5 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary6 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList8 = surnamesDictionary6.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray11 = new io.resourcepool.model.Language[] {};
        int int12 = surnamesDictionary10.size(languageArray11);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language14 = io.resourcepool.model.Language.random();
        java.lang.String str15 = language14.getLocaleCode();
        io.resourcepool.model.Language[] languageArray16 = new io.resourcepool.model.Language[] { language13, language14 };
        int int17 = surnamesDictionary10.size(languageArray16);
        io.resourcepool.generator.Query query18 = new io.resourcepool.generator.Query(20000, languageArray16);
        java.util.List<java.lang.String> strList19 = surnamesDictionary6.pick(query18);
        java.util.List<java.lang.String> strList20 = surnamesDictionary5.pick(query18);
        java.util.List<io.resourcepool.model.Fortune> fortuneList21 = simpleFortuneGenerator0.nextFortunes(query18);
        java.util.List<io.resourcepool.model.Fortune> fortuneList23 = simpleFortuneGenerator0.nextFortunes((int) '4');
        java.util.List<io.resourcepool.model.Fortune> fortuneList25 = simpleFortuneGenerator0.nextFortunes((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.Fortune> fortuneList27 = simpleFortuneGenerator0.nextFortunes(20000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 11812 elements in the Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language14 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language14.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertNotNull(languageArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(fortuneList21);
        org.junit.Assert.assertNotNull(fortuneList23);
        org.junit.Assert.assertNotNull(fortuneList25);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        java.lang.String str6 = language5.getLocaleCode();
        io.resourcepool.model.Language[] languageArray7 = new io.resourcepool.model.Language[] { language4, language5 };
        int int8 = surnamesDictionary1.size(languageArray7);
        io.resourcepool.model.Language language10 = io.resourcepool.model.Language.random();
        java.lang.String str11 = language10.getLocaleCode();
        java.lang.String str12 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language10);
        io.resourcepool.model.Language language14 = io.resourcepool.model.Language.random();
        java.lang.String str15 = language14.getLocaleCode();
        java.lang.String str16 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language14);
        io.resourcepool.model.Language language17 = io.resourcepool.model.Language.random();
        java.lang.String str18 = language17.getLocaleCode();
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language20 = io.resourcepool.model.Language.random();
        java.lang.String str21 = language20.getLocaleCode();
        io.resourcepool.model.Language[] languageArray22 = new io.resourcepool.model.Language[] { language10, language14, language17, language19, language20 };
        int int23 = surnamesDictionary1.size(languageArray22);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary24 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int25 = fortunesDictionary24.size();
        io.resourcepool.generator.Query.Builder builder26 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary27 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary28 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray29 = new io.resourcepool.model.Language[] {};
        int int30 = surnamesDictionary28.size(languageArray29);
        int int31 = givenNamesDictionary27.size(languageArray29);
        io.resourcepool.generator.Query.Builder builder32 = builder26.languages(languageArray29);
        int int33 = fortunesDictionary24.size(languageArray29);
        int int34 = surnamesDictionary1.size(languageArray29);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary36 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray37 = new io.resourcepool.model.Language[] {};
        int int38 = surnamesDictionary36.size(languageArray37);
        io.resourcepool.model.Language language39 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language40 = io.resourcepool.model.Language.random();
        java.lang.String str41 = language40.getLocaleCode();
        io.resourcepool.model.Language[] languageArray42 = new io.resourcepool.model.Language[] { language39, language40 };
        int int43 = surnamesDictionary36.size(languageArray42);
        io.resourcepool.generator.Query query44 = new io.resourcepool.generator.Query(20000, languageArray42);
        java.util.List<java.lang.String> strList45 = surnamesDictionary1.pick(query44);
        java.lang.String str46 = surnamesDictionary1.pick();
        io.resourcepool.model.Gender gender52 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName53 = new io.resourcepool.model.GivenName("Shaull", "Shaull", gender52);
        io.resourcepool.model.GivenName givenName54 = new io.resourcepool.model.GivenName("Mamie23", "Shaull", gender52);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary55 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList57 = surnamesDictionary55.pick((int) 'a');
        int int58 = surnamesDictionary55.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary59 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray60 = new io.resourcepool.model.Language[] {};
        int int61 = surnamesDictionary59.size(languageArray60);
        io.resourcepool.model.Language language62 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language63 = io.resourcepool.model.Language.random();
        java.lang.String str64 = language63.getLocaleCode();
        io.resourcepool.model.Language[] languageArray65 = new io.resourcepool.model.Language[] { language62, language63 };
        int int66 = surnamesDictionary59.size(languageArray65);
        io.resourcepool.model.Language language68 = io.resourcepool.model.Language.random();
        java.lang.String str69 = language68.getLocaleCode();
        java.lang.String str70 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language68);
        io.resourcepool.model.Language language72 = io.resourcepool.model.Language.random();
        java.lang.String str73 = language72.getLocaleCode();
        java.lang.String str74 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language72);
        io.resourcepool.model.Language language75 = io.resourcepool.model.Language.random();
        java.lang.String str76 = language75.getLocaleCode();
        io.resourcepool.model.Language language77 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language78 = io.resourcepool.model.Language.random();
        java.lang.String str79 = language78.getLocaleCode();
        io.resourcepool.model.Language[] languageArray80 = new io.resourcepool.model.Language[] { language68, language72, language75, language77, language78 };
        int int81 = surnamesDictionary59.size(languageArray80);
        int int82 = surnamesDictionary55.size(languageArray80);
        boolean boolean83 = givenName54.equals((java.lang.Object) languageArray80);
        io.resourcepool.generator.Query query84 = new io.resourcepool.generator.Query((int) '4', languageArray80);
        int int85 = surnamesDictionary1.size(languageArray80);
        io.resourcepool.model.Language language86 = io.resourcepool.model.Language.ENGLISH;
        java.lang.String str87 = surnamesDictionary1.pick(language86);
        java.lang.String str88 = language86.getLocaleCode();
        java.lang.String str89 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!59", language86);
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(languageArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + language10 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language10.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!41" + "'", str12, "hi!41");
        org.junit.Assert.assertTrue("'" + language14 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language14.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!46" + "'", str16, "hi!46");
        org.junit.Assert.assertTrue("'" + language17 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language17.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en" + "'", str18, "en");
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en" + "'", str21, "en");
        org.junit.Assert.assertNotNull(languageArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50000 + "'", int23 == 50000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11812 + "'", int25 == 11812);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(languageArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(languageArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + language39 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language39.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language40 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language40.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "en" + "'", str41, "en");
        org.junit.Assert.assertNotNull(languageArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20000 + "'", int43 == 20000);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Shaull" + "'", str46, "Shaull");
        org.junit.Assert.assertTrue("'" + gender52 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender52.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 20000 + "'", int58 == 20000);
        org.junit.Assert.assertNotNull(languageArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + language62 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language62.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language63 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language63.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "en" + "'", str64, "en");
        org.junit.Assert.assertNotNull(languageArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 20000 + "'", int66 == 20000);
        org.junit.Assert.assertTrue("'" + language68 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language68.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "en" + "'", str69, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!7" + "'", str70, "hi!7");
        org.junit.Assert.assertTrue("'" + language72 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language72.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "en" + "'", str73, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!67" + "'", str74, "hi!67");
        org.junit.Assert.assertTrue("'" + language75 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language75.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "en" + "'", str76, "en");
        org.junit.Assert.assertTrue("'" + language77 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language77.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language78 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language78.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "en" + "'", str79, "en");
        org.junit.Assert.assertNotNull(languageArray80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 50000 + "'", int81 == 50000);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 50000 + "'", int82 == 50000);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 50000 + "'", int85 == 50000);
        org.junit.Assert.assertTrue("'" + language86 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language86.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Shaull" + "'", str87, "Shaull");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "en" + "'", str88, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!596" + "'", str89, "hi!596");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        int int4 = givenNamesDictionary0.size(languageArray2);
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = givenNamesDictionary0.pick((int) ' ');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary7 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] {};
        int int9 = surnamesDictionary7.size(languageArray8);
        int int10 = givenNamesDictionary0.size(languageArray8);
        io.resourcepool.model.GivenName givenName11 = givenNamesDictionary0.pick();
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(givenName11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary4 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray5 = new io.resourcepool.model.Language[] {};
        int int6 = surnamesDictionary4.size(languageArray5);
        io.resourcepool.model.Language language7 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language8 = io.resourcepool.model.Language.random();
        java.lang.String str9 = language8.getLocaleCode();
        io.resourcepool.model.Language[] languageArray10 = new io.resourcepool.model.Language[] { language7, language8 };
        int int11 = surnamesDictionary4.size(languageArray10);
        io.resourcepool.generator.Query query12 = new io.resourcepool.generator.Query(20000, languageArray10);
        java.util.List<java.lang.String> strList13 = surnamesDictionary0.pick(query12);
        int int14 = surnamesDictionary0.size();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + language7 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language7.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language8 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language8.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en" + "'", str9, "en");
        org.junit.Assert.assertNotNull(languageArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes((int) (short) 10);
        java.util.List<io.resourcepool.model.Fortune> fortuneList6 = simpleFortuneGenerator0.nextFortunes((int) (byte) 10);
        io.resourcepool.model.Fortune fortune7 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList9 = simpleFortuneGenerator0.nextFortunes((int) (short) 1);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary11 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList13 = surnamesDictionary11.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary15 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray16 = new io.resourcepool.model.Language[] {};
        int int17 = surnamesDictionary15.size(languageArray16);
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        java.lang.String str20 = language19.getLocaleCode();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] { language18, language19 };
        int int22 = surnamesDictionary15.size(languageArray21);
        io.resourcepool.generator.Query query23 = new io.resourcepool.generator.Query(20000, languageArray21);
        java.util.List<java.lang.String> strList24 = surnamesDictionary11.pick(query23);
        java.util.List<java.lang.String> strList25 = surnamesDictionary10.pick(query23);
        java.util.List<io.resourcepool.model.Fortune> fortuneList26 = simpleFortuneGenerator0.nextFortunes(query23);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertNotNull(fortuneList6);
        org.junit.Assert.assertNotNull(fortune7);
        org.junit.Assert.assertNotNull(fortuneList9);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20000 + "'", int22 == 20000);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(fortuneList26);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        io.resourcepool.model.Gender gender5 = io.resourcepool.model.Gender.FEMALE;
        io.resourcepool.model.FullName fullName6 = new io.resourcepool.model.FullName("hi!91", "hi!83", "hi!1", gender5);
        io.resourcepool.model.GivenName givenName7 = new io.resourcepool.model.GivenName("hi!36", "hi!41", gender5);
        org.junit.Assert.assertTrue("'" + gender5 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender5.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        io.resourcepool.model.GivenName givenName5 = simpleNameGenerator0.nextGivenName();
        java.lang.String str6 = simpleNameGenerator0.nextNickname();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(givenName5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mamie23" + "'", str6, "Mamie23");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextNickname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextSurnames((int) (byte) 0);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary8 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList10 = surnamesDictionary8.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary11 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray12 = new io.resourcepool.model.Language[] {};
        int int13 = surnamesDictionary11.size(languageArray12);
        int int14 = surnamesDictionary8.size(languageArray12);
        java.lang.String str15 = surnamesDictionary8.pick();
        java.lang.String str16 = surnamesDictionary8.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator17 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune18 = simpleFortuneGenerator17.nextFortune();
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        java.lang.String str20 = language19.getLocaleCode();
        io.resourcepool.model.Fortune fortune21 = simpleFortuneGenerator17.nextFortune(language19);
        java.lang.String str22 = surnamesDictionary8.pick(language19);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary24 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray25 = new io.resourcepool.model.Language[] {};
        int int26 = surnamesDictionary24.size(languageArray25);
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language28 = io.resourcepool.model.Language.random();
        java.lang.String str29 = language28.getLocaleCode();
        io.resourcepool.model.Language[] languageArray30 = new io.resourcepool.model.Language[] { language27, language28 };
        int int31 = surnamesDictionary24.size(languageArray30);
        io.resourcepool.generator.Query query32 = new io.resourcepool.generator.Query(20000, languageArray30);
        java.util.List<java.lang.String> strList33 = surnamesDictionary8.pick(query32);
        java.util.List<io.resourcepool.model.FullName> fullNameList34 = simpleNameGenerator0.nextNames(query32);
        java.util.List<io.resourcepool.model.GivenName> givenNameList36 = simpleNameGenerator0.nextGivenNames((int) (byte) 0);
        java.util.List<java.lang.String> strList38 = simpleNameGenerator0.nextSurnames((-1));
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mamie23" + "'", str5, "Mamie23");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(languageArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Shaull" + "'", str15, "Shaull");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Shaull" + "'", str16, "Shaull");
        org.junit.Assert.assertNotNull(fortune18);
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(fortune21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Shaull" + "'", str22, "Shaull");
        org.junit.Assert.assertNotNull(languageArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en" + "'", str29, "en");
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(fullNameList34);
        org.junit.Assert.assertNotNull(givenNameList36);
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator7 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList9 = simpleFortuneGenerator7.nextFortunes(0);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator10 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune11 = simpleFortuneGenerator10.nextFortune();
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.random();
        java.lang.String str13 = language12.getLocaleCode();
        io.resourcepool.model.Fortune fortune14 = simpleFortuneGenerator10.nextFortune(language12);
        io.resourcepool.model.Fortune fortune15 = simpleFortuneGenerator7.nextFortune(language12);
        boolean boolean16 = fullName6.equals((java.lang.Object) simpleFortuneGenerator7);
        io.resourcepool.model.Fortune fortune17 = simpleFortuneGenerator7.nextFortune();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(fortuneList9);
        org.junit.Assert.assertNotNull(fortune11);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertNotNull(fortune14);
        org.junit.Assert.assertNotNull(fortune15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(fortune17);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary5 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary6 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList8 = surnamesDictionary6.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray11 = new io.resourcepool.model.Language[] {};
        int int12 = surnamesDictionary10.size(languageArray11);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language14 = io.resourcepool.model.Language.random();
        java.lang.String str15 = language14.getLocaleCode();
        io.resourcepool.model.Language[] languageArray16 = new io.resourcepool.model.Language[] { language13, language14 };
        int int17 = surnamesDictionary10.size(languageArray16);
        io.resourcepool.generator.Query query18 = new io.resourcepool.generator.Query(20000, languageArray16);
        java.util.List<java.lang.String> strList19 = surnamesDictionary6.pick(query18);
        java.util.List<java.lang.String> strList20 = surnamesDictionary5.pick(query18);
        java.util.List<io.resourcepool.model.FullName> fullNameList21 = simpleNameGenerator0.nextNames(query18);
        java.lang.String str22 = simpleNameGenerator0.nextNickname();
        io.resourcepool.model.GivenName givenName23 = simpleNameGenerator0.nextGivenName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language14 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language14.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertNotNull(languageArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(fullNameList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Mamie23" + "'", str22, "Mamie23");
        org.junit.Assert.assertNotNull(givenName23);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes((int) (short) 10);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary5 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary6 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList8 = surnamesDictionary6.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray11 = new io.resourcepool.model.Language[] {};
        int int12 = surnamesDictionary10.size(languageArray11);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language14 = io.resourcepool.model.Language.random();
        java.lang.String str15 = language14.getLocaleCode();
        io.resourcepool.model.Language[] languageArray16 = new io.resourcepool.model.Language[] { language13, language14 };
        int int17 = surnamesDictionary10.size(languageArray16);
        io.resourcepool.generator.Query query18 = new io.resourcepool.generator.Query(20000, languageArray16);
        java.util.List<java.lang.String> strList19 = surnamesDictionary6.pick(query18);
        java.util.List<java.lang.String> strList20 = surnamesDictionary5.pick(query18);
        java.util.List<io.resourcepool.model.Fortune> fortuneList21 = simpleFortuneGenerator0.nextFortunes(query18);
        java.util.List<io.resourcepool.model.Fortune> fortuneList23 = simpleFortuneGenerator0.nextFortunes((int) '4');
        java.util.List<io.resourcepool.model.Fortune> fortuneList25 = simpleFortuneGenerator0.nextFortunes((int) (byte) 1);
        java.util.List<io.resourcepool.model.Fortune> fortuneList27 = simpleFortuneGenerator0.nextFortunes((int) (byte) 0);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language14 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language14.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertNotNull(languageArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(fortuneList21);
        org.junit.Assert.assertNotNull(fortuneList23);
        org.junit.Assert.assertNotNull(fortuneList25);
        org.junit.Assert.assertNotNull(fortuneList27);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator7 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList9 = simpleFortuneGenerator7.nextFortunes(0);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator10 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune11 = simpleFortuneGenerator10.nextFortune();
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.random();
        java.lang.String str13 = language12.getLocaleCode();
        io.resourcepool.model.Fortune fortune14 = simpleFortuneGenerator10.nextFortune(language12);
        io.resourcepool.model.Fortune fortune15 = simpleFortuneGenerator7.nextFortune(language12);
        boolean boolean16 = fullName6.equals((java.lang.Object) simpleFortuneGenerator7);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary17 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList19 = surnamesDictionary17.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary20 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] {};
        int int22 = surnamesDictionary20.size(languageArray21);
        int int23 = surnamesDictionary17.size(languageArray21);
        java.lang.String str24 = surnamesDictionary17.pick();
        java.lang.String str25 = surnamesDictionary17.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator26 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune27 = simpleFortuneGenerator26.nextFortune();
        io.resourcepool.model.Language language28 = io.resourcepool.model.Language.random();
        java.lang.String str29 = language28.getLocaleCode();
        io.resourcepool.model.Fortune fortune30 = simpleFortuneGenerator26.nextFortune(language28);
        java.lang.String str31 = surnamesDictionary17.pick(language28);
        io.resourcepool.model.Fortune fortune32 = simpleFortuneGenerator7.nextFortune(language28);
        java.util.List<java.lang.String> strList33 = io.resourcepool.dictionary.loader.NameLoader.loadSurnames(language28);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(fortuneList9);
        org.junit.Assert.assertNotNull(fortune11);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertNotNull(fortune14);
        org.junit.Assert.assertNotNull(fortune15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Shaull" + "'", str24, "Shaull");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Shaull" + "'", str25, "Shaull");
        org.junit.Assert.assertNotNull(fortune27);
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en" + "'", str29, "en");
        org.junit.Assert.assertNotNull(fortune30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Shaull" + "'", str31, "Shaull");
        org.junit.Assert.assertNotNull(fortune32);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList13 = simpleNameGenerator0.nextSurnames((int) 'a');
        java.lang.String str14 = simpleNameGenerator0.nextNickname();
        java.util.List<io.resourcepool.model.FullName> fullNameList16 = simpleNameGenerator0.nextNames(11812);
        io.resourcepool.model.GivenName givenName17 = simpleNameGenerator0.nextGivenName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Mamie23" + "'", str14, "Mamie23");
        org.junit.Assert.assertNotNull(fullNameList16);
        org.junit.Assert.assertNotNull(givenName17);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes((int) (short) 10);
        java.util.List<io.resourcepool.model.Fortune> fortuneList6 = simpleFortuneGenerator0.nextFortunes((int) (byte) 10);
        io.resourcepool.model.Fortune fortune7 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList9 = simpleFortuneGenerator0.nextFortunes((int) (short) 1);
        io.resourcepool.model.Fortune fortune10 = simpleFortuneGenerator0.nextFortune();
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertNotNull(fortuneList6);
        org.junit.Assert.assertNotNull(fortune7);
        org.junit.Assert.assertNotNull(fortuneList9);
        org.junit.Assert.assertNotNull(fortune10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes((int) (short) 10);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary6 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int7 = fortunesDictionary6.size();
        io.resourcepool.generator.Query.Builder builder8 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary9 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray11 = new io.resourcepool.model.Language[] {};
        int int12 = surnamesDictionary10.size(languageArray11);
        int int13 = givenNamesDictionary9.size(languageArray11);
        io.resourcepool.generator.Query.Builder builder14 = builder8.languages(languageArray11);
        int int15 = fortunesDictionary6.size(languageArray11);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary16 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary17 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray18 = new io.resourcepool.model.Language[] {};
        int int19 = surnamesDictionary17.size(languageArray18);
        int int20 = surnamesDictionary16.size(languageArray18);
        int int21 = fortunesDictionary6.size(languageArray18);
        io.resourcepool.generator.Query query22 = new io.resourcepool.generator.Query((int) (short) 100, languageArray18);
        java.util.List<io.resourcepool.model.Fortune> fortuneList23 = simpleFortuneGenerator0.nextFortunes(query22);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11812 + "'", int7 == 11812);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(languageArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(languageArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(fortuneList23);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary8 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray9 = new io.resourcepool.model.Language[] {};
        int int10 = surnamesDictionary8.size(languageArray9);
        io.resourcepool.model.Language language11 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.random();
        java.lang.String str13 = language12.getLocaleCode();
        io.resourcepool.model.Language[] languageArray14 = new io.resourcepool.model.Language[] { language11, language12 };
        int int15 = surnamesDictionary8.size(languageArray14);
        io.resourcepool.model.Language language17 = io.resourcepool.model.Language.random();
        java.lang.String str18 = language17.getLocaleCode();
        java.lang.String str19 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language17);
        io.resourcepool.model.Language language21 = io.resourcepool.model.Language.random();
        java.lang.String str22 = language21.getLocaleCode();
        java.lang.String str23 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language21);
        io.resourcepool.model.Language language24 = io.resourcepool.model.Language.random();
        java.lang.String str25 = language24.getLocaleCode();
        io.resourcepool.model.Language language26 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.random();
        java.lang.String str28 = language27.getLocaleCode();
        io.resourcepool.model.Language[] languageArray29 = new io.resourcepool.model.Language[] { language17, language21, language24, language26, language27 };
        int int30 = surnamesDictionary8.size(languageArray29);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary31 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int32 = fortunesDictionary31.size();
        io.resourcepool.generator.Query.Builder builder33 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary34 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary35 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray36 = new io.resourcepool.model.Language[] {};
        int int37 = surnamesDictionary35.size(languageArray36);
        int int38 = givenNamesDictionary34.size(languageArray36);
        io.resourcepool.generator.Query.Builder builder39 = builder33.languages(languageArray36);
        int int40 = fortunesDictionary31.size(languageArray36);
        int int41 = surnamesDictionary8.size(languageArray36);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary43 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray44 = new io.resourcepool.model.Language[] {};
        int int45 = surnamesDictionary43.size(languageArray44);
        io.resourcepool.model.Language language46 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language47 = io.resourcepool.model.Language.random();
        java.lang.String str48 = language47.getLocaleCode();
        io.resourcepool.model.Language[] languageArray49 = new io.resourcepool.model.Language[] { language46, language47 };
        int int50 = surnamesDictionary43.size(languageArray49);
        io.resourcepool.generator.Query query51 = new io.resourcepool.generator.Query(20000, languageArray49);
        java.util.List<java.lang.String> strList52 = surnamesDictionary8.pick(query51);
        java.lang.String str53 = surnamesDictionary8.pick();
        io.resourcepool.model.Gender gender59 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName60 = new io.resourcepool.model.GivenName("Shaull", "Shaull", gender59);
        io.resourcepool.model.GivenName givenName61 = new io.resourcepool.model.GivenName("Mamie23", "Shaull", gender59);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary62 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList64 = surnamesDictionary62.pick((int) 'a');
        int int65 = surnamesDictionary62.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary66 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray67 = new io.resourcepool.model.Language[] {};
        int int68 = surnamesDictionary66.size(languageArray67);
        io.resourcepool.model.Language language69 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language70 = io.resourcepool.model.Language.random();
        java.lang.String str71 = language70.getLocaleCode();
        io.resourcepool.model.Language[] languageArray72 = new io.resourcepool.model.Language[] { language69, language70 };
        int int73 = surnamesDictionary66.size(languageArray72);
        io.resourcepool.model.Language language75 = io.resourcepool.model.Language.random();
        java.lang.String str76 = language75.getLocaleCode();
        java.lang.String str77 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language75);
        io.resourcepool.model.Language language79 = io.resourcepool.model.Language.random();
        java.lang.String str80 = language79.getLocaleCode();
        java.lang.String str81 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language79);
        io.resourcepool.model.Language language82 = io.resourcepool.model.Language.random();
        java.lang.String str83 = language82.getLocaleCode();
        io.resourcepool.model.Language language84 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language85 = io.resourcepool.model.Language.random();
        java.lang.String str86 = language85.getLocaleCode();
        io.resourcepool.model.Language[] languageArray87 = new io.resourcepool.model.Language[] { language75, language79, language82, language84, language85 };
        int int88 = surnamesDictionary66.size(languageArray87);
        int int89 = surnamesDictionary62.size(languageArray87);
        boolean boolean90 = givenName61.equals((java.lang.Object) languageArray87);
        io.resourcepool.generator.Query query91 = new io.resourcepool.generator.Query((int) '4', languageArray87);
        int int92 = surnamesDictionary8.size(languageArray87);
        int int93 = surnamesDictionary0.size(languageArray87);
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertNotNull(languageArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + language11 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language11.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertNotNull(languageArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertTrue("'" + language17 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language17.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en" + "'", str18, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!41" + "'", str19, "hi!41");
        org.junit.Assert.assertTrue("'" + language21 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language21.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en" + "'", str22, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!85" + "'", str23, "hi!85");
        org.junit.Assert.assertTrue("'" + language24 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language24.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
        org.junit.Assert.assertTrue("'" + language26 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language26.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en" + "'", str28, "en");
        org.junit.Assert.assertNotNull(languageArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50000 + "'", int30 == 50000);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 11812 + "'", int32 == 11812);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(languageArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(languageArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + language46 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language46.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language47 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language47.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "en" + "'", str48, "en");
        org.junit.Assert.assertNotNull(languageArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 20000 + "'", int50 == 20000);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Shaull" + "'", str53, "Shaull");
        org.junit.Assert.assertTrue("'" + gender59 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender59.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(strList64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 20000 + "'", int65 == 20000);
        org.junit.Assert.assertNotNull(languageArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + language69 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language69.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language70 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language70.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "en" + "'", str71, "en");
        org.junit.Assert.assertNotNull(languageArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 20000 + "'", int73 == 20000);
        org.junit.Assert.assertTrue("'" + language75 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language75.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "en" + "'", str76, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!86" + "'", str77, "hi!86");
        org.junit.Assert.assertTrue("'" + language79 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language79.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "en" + "'", str80, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!98" + "'", str81, "hi!98");
        org.junit.Assert.assertTrue("'" + language82 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language82.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "en" + "'", str83, "en");
        org.junit.Assert.assertTrue("'" + language84 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language84.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language85 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language85.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "en" + "'", str86, "en");
        org.junit.Assert.assertNotNull(languageArray87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 50000 + "'", int88 == 50000);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 50000 + "'", int89 == 50000);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 50000 + "'", int92 == 50000);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 50000 + "'", int93 == 50000);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        io.resourcepool.model.Gender gender2 = null;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Mamie23", "hi!44", gender2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes((int) (short) 10);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary5 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary6 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList8 = surnamesDictionary6.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray11 = new io.resourcepool.model.Language[] {};
        int int12 = surnamesDictionary10.size(languageArray11);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language14 = io.resourcepool.model.Language.random();
        java.lang.String str15 = language14.getLocaleCode();
        io.resourcepool.model.Language[] languageArray16 = new io.resourcepool.model.Language[] { language13, language14 };
        int int17 = surnamesDictionary10.size(languageArray16);
        io.resourcepool.generator.Query query18 = new io.resourcepool.generator.Query(20000, languageArray16);
        java.util.List<java.lang.String> strList19 = surnamesDictionary6.pick(query18);
        java.util.List<java.lang.String> strList20 = surnamesDictionary5.pick(query18);
        java.util.List<io.resourcepool.model.Fortune> fortuneList21 = simpleFortuneGenerator0.nextFortunes(query18);
        java.util.List<io.resourcepool.model.Fortune> fortuneList23 = simpleFortuneGenerator0.nextFortunes((int) '4');
        java.util.List<io.resourcepool.model.Fortune> fortuneList25 = simpleFortuneGenerator0.nextFortunes((int) (byte) 1);
        io.resourcepool.model.Fortune fortune26 = simpleFortuneGenerator0.nextFortune();
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language14 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language14.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertNotNull(languageArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(fortuneList21);
        org.junit.Assert.assertNotNull(fortuneList23);
        org.junit.Assert.assertNotNull(fortuneList25);
        org.junit.Assert.assertNotNull(fortune26);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator2 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList4 = simpleNameGenerator2.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = simpleNameGenerator2.nextGivenNames(100);
        java.lang.String str7 = simpleNameGenerator2.nextSurname();
        io.resourcepool.model.FullName fullName8 = simpleNameGenerator2.nextName();
        io.resourcepool.model.Gender gender9 = fullName8.gender;
        io.resourcepool.model.GivenName givenName10 = new io.resourcepool.model.GivenName("hi!63", "hi!63", gender9);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertNotNull(fullName8);
        org.junit.Assert.assertTrue("'" + gender9 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender9.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.lang.String str7 = simpleNameGenerator0.nextSurname();
        java.lang.String str8 = simpleNameGenerator0.nextSurname();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        io.resourcepool.model.Gender gender3 = io.resourcepool.model.Gender.FEMALE;
        io.resourcepool.model.FullName fullName4 = new io.resourcepool.model.FullName("hi!91", "hi!83", "hi!1", gender3);
        io.resourcepool.model.Gender gender5 = fullName4.gender;
        org.junit.Assert.assertTrue("'" + gender3 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender3.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertTrue("'" + gender5 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender5.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        java.util.List<java.lang.String> strList9 = surnamesDictionary0.pick((int) (byte) 10);
        int int10 = surnamesDictionary0.size();
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.random();
        java.lang.String str13 = language12.getLocaleCode();
        java.lang.String str14 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language12);
        java.lang.String str15 = language12.getLocaleCode();
        java.lang.String str16 = surnamesDictionary0.pick(language12);
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!27" + "'", str14, "hi!27");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Shaull" + "'", str16, "Shaull");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator5 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator5.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList9 = simpleNameGenerator5.nextGivenNames(100);
        java.lang.String str10 = simpleNameGenerator5.nextSurname();
        io.resourcepool.model.FullName fullName11 = simpleNameGenerator5.nextName();
        java.lang.String str12 = fullName11.surname;
        io.resourcepool.model.Gender gender13 = fullName11.gender;
        io.resourcepool.model.GivenName givenName14 = new io.resourcepool.model.GivenName("Mamie23", "Ultimatehi!", gender13);
        io.resourcepool.model.FullName fullName15 = new io.resourcepool.model.FullName("TheOnlyhi!", "hi!91", "GivenName{givenName='Shaull', nickname='', gender=MALE}", gender13);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator16 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList18 = simpleNameGenerator16.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList20 = simpleNameGenerator16.nextGivenNames(100);
        java.lang.String str21 = simpleNameGenerator16.nextSurname();
        io.resourcepool.model.FullName fullName22 = simpleNameGenerator16.nextName();
        java.lang.String str23 = fullName22.surname;
        io.resourcepool.model.Gender gender24 = fullName22.gender;
        boolean boolean25 = fullName15.equals((java.lang.Object) fullName22);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary26 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList28 = surnamesDictionary26.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary29 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray30 = new io.resourcepool.model.Language[] {};
        int int31 = surnamesDictionary29.size(languageArray30);
        int int32 = surnamesDictionary26.size(languageArray30);
        java.lang.String str33 = surnamesDictionary26.pick();
        java.lang.String str34 = surnamesDictionary26.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator35 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune36 = simpleFortuneGenerator35.nextFortune();
        io.resourcepool.model.Language language37 = io.resourcepool.model.Language.random();
        java.lang.String str38 = language37.getLocaleCode();
        io.resourcepool.model.Fortune fortune39 = simpleFortuneGenerator35.nextFortune(language37);
        java.lang.String str40 = surnamesDictionary26.pick(language37);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary42 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray43 = new io.resourcepool.model.Language[] {};
        int int44 = surnamesDictionary42.size(languageArray43);
        io.resourcepool.model.Language language45 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language46 = io.resourcepool.model.Language.random();
        java.lang.String str47 = language46.getLocaleCode();
        io.resourcepool.model.Language[] languageArray48 = new io.resourcepool.model.Language[] { language45, language46 };
        int int49 = surnamesDictionary42.size(languageArray48);
        io.resourcepool.generator.Query query50 = new io.resourcepool.generator.Query(20000, languageArray48);
        java.util.List<java.lang.String> strList51 = surnamesDictionary26.pick(query50);
        boolean boolean52 = fullName22.equals((java.lang.Object) surnamesDictionary26);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(givenNameList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Shaull" + "'", str10, "Shaull");
        org.junit.Assert.assertNotNull(fullName11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Shaull" + "'", str12, "Shaull");
        org.junit.Assert.assertTrue("'" + gender13 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender13.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(givenNameList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Shaull" + "'", str21, "Shaull");
        org.junit.Assert.assertNotNull(fullName22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Shaull" + "'", str23, "Shaull");
        org.junit.Assert.assertTrue("'" + gender24 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender24.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Shaull" + "'", str33, "Shaull");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Shaull" + "'", str34, "Shaull");
        org.junit.Assert.assertNotNull(fortune36);
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en" + "'", str38, "en");
        org.junit.Assert.assertNotNull(fortune39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Shaull" + "'", str40, "Shaull");
        org.junit.Assert.assertNotNull(languageArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + language45 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language45.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language46 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language46.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "en" + "'", str47, "en");
        org.junit.Assert.assertNotNull(languageArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 20000 + "'", int49 == 20000);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        io.resourcepool.model.GivenName givenName1 = simpleNameGenerator0.nextGivenName();
        java.lang.String str2 = simpleNameGenerator0.nextNickname();
        java.util.List<io.resourcepool.model.FullName> fullNameList4 = simpleNameGenerator0.nextNames((int) (byte) 100);
        org.junit.Assert.assertNotNull(givenName1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Mamie23" + "'", str2, "Mamie23");
        org.junit.Assert.assertNotNull(fullNameList4);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator5 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator5.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList9 = simpleNameGenerator5.nextGivenNames(100);
        java.lang.String str10 = simpleNameGenerator5.nextSurname();
        io.resourcepool.model.FullName fullName11 = simpleNameGenerator5.nextName();
        io.resourcepool.model.Gender gender12 = fullName11.gender;
        io.resourcepool.model.FullName fullName13 = new io.resourcepool.model.FullName("", "Mary", "", gender12);
        io.resourcepool.model.GivenName givenName14 = new io.resourcepool.model.GivenName("hi!82", "hi!10", gender12);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(givenNameList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Shaull" + "'", str10, "Shaull");
        org.junit.Assert.assertNotNull(fullName11);
        org.junit.Assert.assertTrue("'" + gender12 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender12.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary1 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int2 = fortunesDictionary1.size();
        io.resourcepool.generator.Query.Builder builder3 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary4 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary5 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] {};
        int int7 = surnamesDictionary5.size(languageArray6);
        int int8 = givenNamesDictionary4.size(languageArray6);
        io.resourcepool.generator.Query.Builder builder9 = builder3.languages(languageArray6);
        int int10 = fortunesDictionary1.size(languageArray6);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary11 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary12 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray13 = new io.resourcepool.model.Language[] {};
        int int14 = surnamesDictionary12.size(languageArray13);
        int int15 = surnamesDictionary11.size(languageArray13);
        int int16 = fortunesDictionary1.size(languageArray13);
        io.resourcepool.generator.Query query17 = new io.resourcepool.generator.Query((int) ' ', languageArray13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11812 + "'", int2 == 11812);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(languageArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.FullName fullName6 = givenName4.toFullName("hi!");
        io.resourcepool.model.GivenName givenName7 = givenName4.clone();
        io.resourcepool.model.Gender gender8 = givenName4.gender;
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(givenName7);
        org.junit.Assert.assertTrue("'" + gender8 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender8.equals(io.resourcepool.model.Gender.MALE));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes(0);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary3 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int4 = fortunesDictionary3.size();
        io.resourcepool.generator.Query.Builder builder5 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary6 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary7 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] {};
        int int9 = surnamesDictionary7.size(languageArray8);
        int int10 = givenNamesDictionary6.size(languageArray8);
        io.resourcepool.generator.Query.Builder builder11 = builder5.languages(languageArray8);
        int int12 = fortunesDictionary3.size(languageArray8);
        java.util.List<io.resourcepool.model.Fortune> fortuneList14 = fortunesDictionary3.pick((int) (short) 1);
        io.resourcepool.model.Fortune fortune15 = fortunesDictionary3.pick();
        io.resourcepool.model.Language language17 = io.resourcepool.model.Language.random();
        java.lang.String str18 = language17.getLocaleCode();
        java.lang.String str19 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language17);
        java.lang.String str20 = language17.getLocaleCode();
        io.resourcepool.model.Fortune fortune21 = fortunesDictionary3.pick(language17);
        io.resourcepool.model.Fortune fortune22 = simpleFortuneGenerator0.nextFortune(language17);
        io.resourcepool.model.Language language24 = io.resourcepool.model.Language.random();
        java.lang.String str25 = language24.getLocaleCode();
        java.lang.String str26 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language24);
        io.resourcepool.model.Fortune fortune27 = simpleFortuneGenerator0.nextFortune(language24);
        org.junit.Assert.assertNotNull(fortuneList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11812 + "'", int4 == 11812);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(fortuneList14);
        org.junit.Assert.assertNotNull(fortune15);
        org.junit.Assert.assertTrue("'" + language17 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language17.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en" + "'", str18, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!14" + "'", str19, "hi!14");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(fortune21);
        org.junit.Assert.assertNotNull(fortune22);
        org.junit.Assert.assertTrue("'" + language24 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language24.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!69" + "'", str26, "hi!69");
        org.junit.Assert.assertNotNull(fortune27);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        java.lang.String str11 = simpleNameGenerator0.nextNickname();
        java.util.List<java.lang.String> strList13 = simpleNameGenerator0.nextNicknames((int) ' ');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mamie23" + "'", str11, "Mamie23");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        io.resourcepool.model.Language language0 = io.resourcepool.model.Language.random();
        java.util.List<java.lang.String> strList1 = io.resourcepool.dictionary.loader.NameLoader.loadSurnames(language0);
        org.junit.Assert.assertTrue("'" + language0 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language0.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.lang.String str3 = simpleNameGenerator0.nextNickname();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary4 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList6 = surnamesDictionary4.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary8 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray9 = new io.resourcepool.model.Language[] {};
        int int10 = surnamesDictionary8.size(languageArray9);
        io.resourcepool.model.Language language11 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.random();
        java.lang.String str13 = language12.getLocaleCode();
        io.resourcepool.model.Language[] languageArray14 = new io.resourcepool.model.Language[] { language11, language12 };
        int int15 = surnamesDictionary8.size(languageArray14);
        io.resourcepool.generator.Query query16 = new io.resourcepool.generator.Query(20000, languageArray14);
        java.util.List<java.lang.String> strList17 = surnamesDictionary4.pick(query16);
        java.util.List<io.resourcepool.model.FullName> fullNameList18 = simpleNameGenerator0.nextNames(query16);
        java.util.List<java.lang.String> strList20 = simpleNameGenerator0.nextSurnames(10000);
        java.lang.Class<?> wildcardClass21 = strList20.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mamie23" + "'", str3, "Mamie23");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(languageArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + language11 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language11.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertNotNull(languageArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(fullNameList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.resourcepool.generator.Query.Builder builder0 = io.resourcepool.generator.Query.builder();
        io.resourcepool.generator.Query.Builder builder2 = builder0.count((int) 'a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator3 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList5 = simpleNameGenerator3.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList7 = simpleNameGenerator3.nextGivenNames(100);
        java.lang.String str8 = simpleNameGenerator3.nextSurname();
        io.resourcepool.model.FullName fullName9 = simpleNameGenerator3.nextName();
        io.resourcepool.model.Gender gender10 = fullName9.gender;
        io.resourcepool.model.FullName fullName11 = new io.resourcepool.model.FullName("", "Mary", "", gender10);
        java.lang.String str12 = fullName11.nickname;
        java.lang.String str13 = fullName11.givenName;
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary14 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int15 = givenNamesDictionary14.size();
        io.resourcepool.model.GivenName givenName16 = givenNamesDictionary14.pick();
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary18 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int19 = fortunesDictionary18.size();
        io.resourcepool.generator.Query.Builder builder20 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary21 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary22 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray23 = new io.resourcepool.model.Language[] {};
        int int24 = surnamesDictionary22.size(languageArray23);
        int int25 = givenNamesDictionary21.size(languageArray23);
        io.resourcepool.generator.Query.Builder builder26 = builder20.languages(languageArray23);
        int int27 = fortunesDictionary18.size(languageArray23);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary28 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary29 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray30 = new io.resourcepool.model.Language[] {};
        int int31 = surnamesDictionary29.size(languageArray30);
        int int32 = surnamesDictionary28.size(languageArray30);
        int int33 = fortunesDictionary18.size(languageArray30);
        io.resourcepool.generator.Query query34 = new io.resourcepool.generator.Query((int) (short) 100, languageArray30);
        java.util.List<io.resourcepool.model.GivenName> givenNameList35 = givenNamesDictionary14.pick(query34);
        boolean boolean36 = fullName11.equals((java.lang.Object) givenNamesDictionary14);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(givenNameList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertNotNull(fullName9);
        org.junit.Assert.assertTrue("'" + gender10 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender10.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mary" + "'", str12, "Mary");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4305 + "'", int15 == 4305);
        org.junit.Assert.assertNotNull(givenName16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11812 + "'", int19 == 11812);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(languageArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(givenNameList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        java.util.List<io.resourcepool.model.GivenName> givenNameList2 = givenNamesDictionary0.pick(0);
        io.resourcepool.model.GivenName givenName3 = givenNamesDictionary0.pick();
        int int4 = givenNamesDictionary0.size();
        org.junit.Assert.assertNotNull(givenNameList2);
        org.junit.Assert.assertNotNull(givenName3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4305 + "'", int4 == 4305);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator3 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList5 = simpleNameGenerator3.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList7 = simpleNameGenerator3.nextGivenNames(100);
        java.lang.String str8 = simpleNameGenerator3.nextSurname();
        io.resourcepool.model.FullName fullName9 = simpleNameGenerator3.nextName();
        io.resourcepool.model.Gender gender10 = fullName9.gender;
        io.resourcepool.model.FullName fullName11 = new io.resourcepool.model.FullName("", "Mary", "", gender10);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator12 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList14 = simpleNameGenerator12.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList16 = simpleNameGenerator12.nextGivenNames(100);
        java.lang.String str17 = simpleNameGenerator12.nextSurname();
        java.util.List<java.lang.String> strList19 = simpleNameGenerator12.nextNicknames(100);
        java.util.List<java.lang.String> strList21 = simpleNameGenerator12.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList23 = simpleNameGenerator12.nextSurnames((int) '4');
        boolean boolean24 = fullName11.equals((java.lang.Object) simpleNameGenerator12);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(givenNameList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertNotNull(fullName9);
        org.junit.Assert.assertTrue("'" + gender10 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender10.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(givenNameList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Shaull" + "'", str17, "Shaull");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary5 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary6 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList8 = surnamesDictionary6.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray11 = new io.resourcepool.model.Language[] {};
        int int12 = surnamesDictionary10.size(languageArray11);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language14 = io.resourcepool.model.Language.random();
        java.lang.String str15 = language14.getLocaleCode();
        io.resourcepool.model.Language[] languageArray16 = new io.resourcepool.model.Language[] { language13, language14 };
        int int17 = surnamesDictionary10.size(languageArray16);
        io.resourcepool.generator.Query query18 = new io.resourcepool.generator.Query(20000, languageArray16);
        java.util.List<java.lang.String> strList19 = surnamesDictionary6.pick(query18);
        java.util.List<java.lang.String> strList20 = surnamesDictionary5.pick(query18);
        java.util.List<io.resourcepool.model.FullName> fullNameList21 = simpleNameGenerator0.nextNames(query18);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator22 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList24 = simpleNameGenerator22.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList26 = simpleNameGenerator22.nextGivenNames(100);
        java.lang.String str27 = simpleNameGenerator22.nextSurname();
        io.resourcepool.model.FullName fullName28 = simpleNameGenerator22.nextName();
        java.util.List<io.resourcepool.model.FullName> fullNameList30 = simpleNameGenerator22.nextNames((int) (short) 10);
        java.lang.String str31 = simpleNameGenerator22.nextSurname();
        java.util.List<io.resourcepool.model.FullName> fullNameList33 = simpleNameGenerator22.nextNames(0);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary34 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray35 = new io.resourcepool.model.Language[] {};
        int int36 = surnamesDictionary34.size(languageArray35);
        io.resourcepool.model.Language language37 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.random();
        java.lang.String str39 = language38.getLocaleCode();
        io.resourcepool.model.Language[] languageArray40 = new io.resourcepool.model.Language[] { language37, language38 };
        int int41 = surnamesDictionary34.size(languageArray40);
        io.resourcepool.model.Language language43 = io.resourcepool.model.Language.random();
        java.lang.String str44 = language43.getLocaleCode();
        java.lang.String str45 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language43);
        io.resourcepool.model.Language language47 = io.resourcepool.model.Language.random();
        java.lang.String str48 = language47.getLocaleCode();
        java.lang.String str49 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language47);
        io.resourcepool.model.Language language50 = io.resourcepool.model.Language.random();
        java.lang.String str51 = language50.getLocaleCode();
        io.resourcepool.model.Language language52 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language53 = io.resourcepool.model.Language.random();
        java.lang.String str54 = language53.getLocaleCode();
        io.resourcepool.model.Language[] languageArray55 = new io.resourcepool.model.Language[] { language43, language47, language50, language52, language53 };
        int int56 = surnamesDictionary34.size(languageArray55);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary57 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int58 = fortunesDictionary57.size();
        io.resourcepool.generator.Query.Builder builder59 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary60 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary61 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray62 = new io.resourcepool.model.Language[] {};
        int int63 = surnamesDictionary61.size(languageArray62);
        int int64 = givenNamesDictionary60.size(languageArray62);
        io.resourcepool.generator.Query.Builder builder65 = builder59.languages(languageArray62);
        int int66 = fortunesDictionary57.size(languageArray62);
        int int67 = surnamesDictionary34.size(languageArray62);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary69 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray70 = new io.resourcepool.model.Language[] {};
        int int71 = surnamesDictionary69.size(languageArray70);
        io.resourcepool.model.Language language72 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language73 = io.resourcepool.model.Language.random();
        java.lang.String str74 = language73.getLocaleCode();
        io.resourcepool.model.Language[] languageArray75 = new io.resourcepool.model.Language[] { language72, language73 };
        int int76 = surnamesDictionary69.size(languageArray75);
        io.resourcepool.generator.Query query77 = new io.resourcepool.generator.Query(20000, languageArray75);
        java.util.List<java.lang.String> strList78 = surnamesDictionary34.pick(query77);
        io.resourcepool.model.Language[] languageArray79 = query77.languages;
        java.util.List<io.resourcepool.model.FullName> fullNameList80 = simpleNameGenerator22.nextNames(query77);
        java.util.List<io.resourcepool.model.FullName> fullNameList81 = simpleNameGenerator0.nextNames(query77);
        io.resourcepool.model.Language[] languageArray82 = query77.languages;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language14 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language14.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertNotNull(languageArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(fullNameList21);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(givenNameList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Shaull" + "'", str27, "Shaull");
        org.junit.Assert.assertNotNull(fullName28);
        org.junit.Assert.assertNotNull(fullNameList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Shaull" + "'", str31, "Shaull");
        org.junit.Assert.assertNotNull(fullNameList33);
        org.junit.Assert.assertNotNull(languageArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en" + "'", str39, "en");
        org.junit.Assert.assertNotNull(languageArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20000 + "'", int41 == 20000);
        org.junit.Assert.assertTrue("'" + language43 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language43.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "en" + "'", str44, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!1" + "'", str45, "hi!1");
        org.junit.Assert.assertTrue("'" + language47 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language47.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "en" + "'", str48, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!7" + "'", str49, "hi!7");
        org.junit.Assert.assertTrue("'" + language50 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language50.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "en" + "'", str51, "en");
        org.junit.Assert.assertTrue("'" + language52 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language52.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language53 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language53.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "en" + "'", str54, "en");
        org.junit.Assert.assertNotNull(languageArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 50000 + "'", int56 == 50000);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 11812 + "'", int58 == 11812);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(languageArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(languageArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + language72 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language72.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language73 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language73.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "en" + "'", str74, "en");
        org.junit.Assert.assertNotNull(languageArray75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 20000 + "'", int76 == 20000);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(languageArray79);
        org.junit.Assert.assertNotNull(fullNameList80);
        org.junit.Assert.assertNotNull(fullNameList81);
        org.junit.Assert.assertNotNull(languageArray82);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary5 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary6 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList8 = surnamesDictionary6.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray11 = new io.resourcepool.model.Language[] {};
        int int12 = surnamesDictionary10.size(languageArray11);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language14 = io.resourcepool.model.Language.random();
        java.lang.String str15 = language14.getLocaleCode();
        io.resourcepool.model.Language[] languageArray16 = new io.resourcepool.model.Language[] { language13, language14 };
        int int17 = surnamesDictionary10.size(languageArray16);
        io.resourcepool.generator.Query query18 = new io.resourcepool.generator.Query(20000, languageArray16);
        java.util.List<java.lang.String> strList19 = surnamesDictionary6.pick(query18);
        java.util.List<java.lang.String> strList20 = surnamesDictionary5.pick(query18);
        java.util.List<io.resourcepool.model.FullName> fullNameList21 = simpleNameGenerator0.nextNames(query18);
        io.resourcepool.model.FullName fullName22 = simpleNameGenerator0.nextName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language14 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language14.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertNotNull(languageArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(fullNameList21);
        org.junit.Assert.assertNotNull(fullName22);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes(0);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary4 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int5 = fortunesDictionary4.size();
        io.resourcepool.generator.Query.Builder builder6 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary7 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary8 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray9 = new io.resourcepool.model.Language[] {};
        int int10 = surnamesDictionary8.size(languageArray9);
        int int11 = givenNamesDictionary7.size(languageArray9);
        io.resourcepool.generator.Query.Builder builder12 = builder6.languages(languageArray9);
        int int13 = fortunesDictionary4.size(languageArray9);
        io.resourcepool.generator.Query query14 = new io.resourcepool.generator.Query((int) ' ', languageArray9);
        java.util.List<io.resourcepool.model.Fortune> fortuneList15 = simpleFortuneGenerator0.nextFortunes(query14);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator16 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList18 = simpleNameGenerator16.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList20 = simpleNameGenerator16.nextGivenNames(100);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary21 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary22 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList24 = surnamesDictionary22.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary26 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray27 = new io.resourcepool.model.Language[] {};
        int int28 = surnamesDictionary26.size(languageArray27);
        io.resourcepool.model.Language language29 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language30 = io.resourcepool.model.Language.random();
        java.lang.String str31 = language30.getLocaleCode();
        io.resourcepool.model.Language[] languageArray32 = new io.resourcepool.model.Language[] { language29, language30 };
        int int33 = surnamesDictionary26.size(languageArray32);
        io.resourcepool.generator.Query query34 = new io.resourcepool.generator.Query(20000, languageArray32);
        java.util.List<java.lang.String> strList35 = surnamesDictionary22.pick(query34);
        java.util.List<java.lang.String> strList36 = surnamesDictionary21.pick(query34);
        java.util.List<io.resourcepool.model.FullName> fullNameList37 = simpleNameGenerator16.nextNames(query34);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator38 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList40 = simpleNameGenerator38.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList42 = simpleNameGenerator38.nextGivenNames(100);
        java.lang.String str43 = simpleNameGenerator38.nextSurname();
        io.resourcepool.model.FullName fullName44 = simpleNameGenerator38.nextName();
        java.util.List<io.resourcepool.model.FullName> fullNameList46 = simpleNameGenerator38.nextNames((int) (short) 10);
        java.lang.String str47 = simpleNameGenerator38.nextSurname();
        java.util.List<io.resourcepool.model.FullName> fullNameList49 = simpleNameGenerator38.nextNames(0);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary50 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray51 = new io.resourcepool.model.Language[] {};
        int int52 = surnamesDictionary50.size(languageArray51);
        io.resourcepool.model.Language language53 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language54 = io.resourcepool.model.Language.random();
        java.lang.String str55 = language54.getLocaleCode();
        io.resourcepool.model.Language[] languageArray56 = new io.resourcepool.model.Language[] { language53, language54 };
        int int57 = surnamesDictionary50.size(languageArray56);
        io.resourcepool.model.Language language59 = io.resourcepool.model.Language.random();
        java.lang.String str60 = language59.getLocaleCode();
        java.lang.String str61 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language59);
        io.resourcepool.model.Language language63 = io.resourcepool.model.Language.random();
        java.lang.String str64 = language63.getLocaleCode();
        java.lang.String str65 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language63);
        io.resourcepool.model.Language language66 = io.resourcepool.model.Language.random();
        java.lang.String str67 = language66.getLocaleCode();
        io.resourcepool.model.Language language68 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language69 = io.resourcepool.model.Language.random();
        java.lang.String str70 = language69.getLocaleCode();
        io.resourcepool.model.Language[] languageArray71 = new io.resourcepool.model.Language[] { language59, language63, language66, language68, language69 };
        int int72 = surnamesDictionary50.size(languageArray71);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary73 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int74 = fortunesDictionary73.size();
        io.resourcepool.generator.Query.Builder builder75 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary76 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary77 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray78 = new io.resourcepool.model.Language[] {};
        int int79 = surnamesDictionary77.size(languageArray78);
        int int80 = givenNamesDictionary76.size(languageArray78);
        io.resourcepool.generator.Query.Builder builder81 = builder75.languages(languageArray78);
        int int82 = fortunesDictionary73.size(languageArray78);
        int int83 = surnamesDictionary50.size(languageArray78);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary85 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray86 = new io.resourcepool.model.Language[] {};
        int int87 = surnamesDictionary85.size(languageArray86);
        io.resourcepool.model.Language language88 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language89 = io.resourcepool.model.Language.random();
        java.lang.String str90 = language89.getLocaleCode();
        io.resourcepool.model.Language[] languageArray91 = new io.resourcepool.model.Language[] { language88, language89 };
        int int92 = surnamesDictionary85.size(languageArray91);
        io.resourcepool.generator.Query query93 = new io.resourcepool.generator.Query(20000, languageArray91);
        java.util.List<java.lang.String> strList94 = surnamesDictionary50.pick(query93);
        io.resourcepool.model.Language[] languageArray95 = query93.languages;
        java.util.List<io.resourcepool.model.FullName> fullNameList96 = simpleNameGenerator38.nextNames(query93);
        java.util.List<io.resourcepool.model.FullName> fullNameList97 = simpleNameGenerator16.nextNames(query93);
        java.util.List<io.resourcepool.model.Fortune> fortuneList98 = simpleFortuneGenerator0.nextFortunes(query93);
        org.junit.Assert.assertNotNull(fortuneList2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11812 + "'", int5 == 11812);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(languageArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fortuneList15);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(givenNameList20);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + language29 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language29.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language30 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language30.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en" + "'", str31, "en");
        org.junit.Assert.assertNotNull(languageArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20000 + "'", int33 == 20000);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(fullNameList37);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(givenNameList42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Shaull" + "'", str43, "Shaull");
        org.junit.Assert.assertNotNull(fullName44);
        org.junit.Assert.assertNotNull(fullNameList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Shaull" + "'", str47, "Shaull");
        org.junit.Assert.assertNotNull(fullNameList49);
        org.junit.Assert.assertNotNull(languageArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + language53 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language53.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language54 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language54.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "en" + "'", str55, "en");
        org.junit.Assert.assertNotNull(languageArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 20000 + "'", int57 == 20000);
        org.junit.Assert.assertTrue("'" + language59 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language59.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "en" + "'", str60, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!91" + "'", str61, "hi!91");
        org.junit.Assert.assertTrue("'" + language63 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language63.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "en" + "'", str64, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Ultimatehi!" + "'", str65, "Ultimatehi!");
        org.junit.Assert.assertTrue("'" + language66 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language66.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "en" + "'", str67, "en");
        org.junit.Assert.assertTrue("'" + language68 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language68.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language69 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language69.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "en" + "'", str70, "en");
        org.junit.Assert.assertNotNull(languageArray71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 50000 + "'", int72 == 50000);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 11812 + "'", int74 == 11812);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(languageArray78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(languageArray86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + language88 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language88.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language89 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language89.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "en" + "'", str90, "en");
        org.junit.Assert.assertNotNull(languageArray91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 20000 + "'", int92 == 20000);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNotNull(languageArray95);
        org.junit.Assert.assertNotNull(fullNameList96);
        org.junit.Assert.assertNotNull(fullNameList97);
        org.junit.Assert.assertNotNull(fortuneList98);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.lang.String str3 = simpleNameGenerator0.nextNickname();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary4 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList6 = surnamesDictionary4.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary8 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray9 = new io.resourcepool.model.Language[] {};
        int int10 = surnamesDictionary8.size(languageArray9);
        io.resourcepool.model.Language language11 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.random();
        java.lang.String str13 = language12.getLocaleCode();
        io.resourcepool.model.Language[] languageArray14 = new io.resourcepool.model.Language[] { language11, language12 };
        int int15 = surnamesDictionary8.size(languageArray14);
        io.resourcepool.generator.Query query16 = new io.resourcepool.generator.Query(20000, languageArray14);
        java.util.List<java.lang.String> strList17 = surnamesDictionary4.pick(query16);
        java.util.List<io.resourcepool.model.FullName> fullNameList18 = simpleNameGenerator0.nextNames(query16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList20 = simpleNameGenerator0.nextNicknames(20000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mamie23" + "'", str3, "Mamie23");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(languageArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + language11 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language11.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertNotNull(languageArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(fullNameList18);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int1 = fortunesDictionary0.size();
        io.resourcepool.generator.Query.Builder builder2 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary3 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary4 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray5 = new io.resourcepool.model.Language[] {};
        int int6 = surnamesDictionary4.size(languageArray5);
        int int7 = givenNamesDictionary3.size(languageArray5);
        io.resourcepool.generator.Query.Builder builder8 = builder2.languages(languageArray5);
        int int9 = fortunesDictionary0.size(languageArray5);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary10 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int11 = fortunesDictionary10.size();
        io.resourcepool.generator.Query.Builder builder12 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary13 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary14 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray15 = new io.resourcepool.model.Language[] {};
        int int16 = surnamesDictionary14.size(languageArray15);
        int int17 = givenNamesDictionary13.size(languageArray15);
        io.resourcepool.generator.Query.Builder builder18 = builder12.languages(languageArray15);
        int int19 = fortunesDictionary10.size(languageArray15);
        int int20 = fortunesDictionary0.size(languageArray15);
        io.resourcepool.model.Gender gender26 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName27 = new io.resourcepool.model.GivenName("Shaull", "Shaull", gender26);
        io.resourcepool.model.GivenName givenName28 = new io.resourcepool.model.GivenName("Mamie23", "Shaull", gender26);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary29 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList31 = surnamesDictionary29.pick((int) 'a');
        int int32 = surnamesDictionary29.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary33 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray34 = new io.resourcepool.model.Language[] {};
        int int35 = surnamesDictionary33.size(languageArray34);
        io.resourcepool.model.Language language36 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language37 = io.resourcepool.model.Language.random();
        java.lang.String str38 = language37.getLocaleCode();
        io.resourcepool.model.Language[] languageArray39 = new io.resourcepool.model.Language[] { language36, language37 };
        int int40 = surnamesDictionary33.size(languageArray39);
        io.resourcepool.model.Language language42 = io.resourcepool.model.Language.random();
        java.lang.String str43 = language42.getLocaleCode();
        java.lang.String str44 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language42);
        io.resourcepool.model.Language language46 = io.resourcepool.model.Language.random();
        java.lang.String str47 = language46.getLocaleCode();
        java.lang.String str48 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language46);
        io.resourcepool.model.Language language49 = io.resourcepool.model.Language.random();
        java.lang.String str50 = language49.getLocaleCode();
        io.resourcepool.model.Language language51 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language52 = io.resourcepool.model.Language.random();
        java.lang.String str53 = language52.getLocaleCode();
        io.resourcepool.model.Language[] languageArray54 = new io.resourcepool.model.Language[] { language42, language46, language49, language51, language52 };
        int int55 = surnamesDictionary33.size(languageArray54);
        int int56 = surnamesDictionary29.size(languageArray54);
        boolean boolean57 = givenName28.equals((java.lang.Object) languageArray54);
        io.resourcepool.generator.Query query58 = new io.resourcepool.generator.Query((int) '4', languageArray54);
        java.util.List<io.resourcepool.model.Fortune> fortuneList59 = fortunesDictionary0.pick(query58);
        java.util.List<io.resourcepool.model.Fortune> fortuneList61 = fortunesDictionary0.pick((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11812 + "'", int11 == 11812);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + gender26 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender26.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20000 + "'", int32 == 20000);
        org.junit.Assert.assertNotNull(languageArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + language36 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language36.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en" + "'", str38, "en");
        org.junit.Assert.assertNotNull(languageArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20000 + "'", int40 == 20000);
        org.junit.Assert.assertTrue("'" + language42 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language42.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "en" + "'", str43, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!7" + "'", str44, "hi!7");
        org.junit.Assert.assertTrue("'" + language46 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language46.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "en" + "'", str47, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!5" + "'", str48, "hi!5");
        org.junit.Assert.assertTrue("'" + language49 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language49.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "en" + "'", str50, "en");
        org.junit.Assert.assertTrue("'" + language51 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language51.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language52 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language52.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "en" + "'", str53, "en");
        org.junit.Assert.assertNotNull(languageArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 50000 + "'", int55 == 50000);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 50000 + "'", int56 == 50000);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(fortuneList59);
        org.junit.Assert.assertNotNull(fortuneList61);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.Gender gender5 = givenName4.gender;
        boolean boolean7 = givenName4.equals((java.lang.Object) "hi!43");
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertTrue("'" + gender5 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender5.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator2 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList4 = simpleNameGenerator2.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = simpleNameGenerator2.nextGivenNames(100);
        java.lang.String str7 = simpleNameGenerator2.nextSurname();
        io.resourcepool.model.FullName fullName8 = simpleNameGenerator2.nextName();
        java.util.List<java.lang.String> strList10 = simpleNameGenerator2.nextNicknames(4305);
        io.resourcepool.model.GivenName givenName11 = simpleNameGenerator2.nextGivenName();
        io.resourcepool.model.Gender gender12 = givenName11.gender;
        io.resourcepool.model.GivenName givenName13 = new io.resourcepool.model.GivenName("hi!48", "hi!38", gender12);
        java.lang.String str14 = givenName13.nickname;
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertNotNull(fullName8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(givenName11);
        org.junit.Assert.assertTrue("'" + gender12 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender12.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!38" + "'", str14, "hi!38");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary4 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray5 = new io.resourcepool.model.Language[] {};
        int int6 = surnamesDictionary4.size(languageArray5);
        io.resourcepool.model.Language language7 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language8 = io.resourcepool.model.Language.random();
        java.lang.String str9 = language8.getLocaleCode();
        io.resourcepool.model.Language[] languageArray10 = new io.resourcepool.model.Language[] { language7, language8 };
        int int11 = surnamesDictionary4.size(languageArray10);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary12 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int13 = fortunesDictionary12.size();
        io.resourcepool.generator.Query.Builder builder14 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary15 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary16 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray17 = new io.resourcepool.model.Language[] {};
        int int18 = surnamesDictionary16.size(languageArray17);
        int int19 = givenNamesDictionary15.size(languageArray17);
        io.resourcepool.generator.Query.Builder builder20 = builder14.languages(languageArray17);
        int int21 = fortunesDictionary12.size(languageArray17);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary22 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int23 = fortunesDictionary22.size();
        io.resourcepool.generator.Query.Builder builder24 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary25 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary26 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray27 = new io.resourcepool.model.Language[] {};
        int int28 = surnamesDictionary26.size(languageArray27);
        int int29 = givenNamesDictionary25.size(languageArray27);
        io.resourcepool.generator.Query.Builder builder30 = builder24.languages(languageArray27);
        int int31 = fortunesDictionary22.size(languageArray27);
        int int32 = fortunesDictionary12.size(languageArray27);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator33 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune34 = simpleFortuneGenerator33.nextFortune();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary35 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray36 = new io.resourcepool.model.Language[] {};
        int int37 = surnamesDictionary35.size(languageArray36);
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language39 = io.resourcepool.model.Language.random();
        java.lang.String str40 = language39.getLocaleCode();
        io.resourcepool.model.Language[] languageArray41 = new io.resourcepool.model.Language[] { language38, language39 };
        int int42 = surnamesDictionary35.size(languageArray41);
        io.resourcepool.model.Language language44 = io.resourcepool.model.Language.random();
        java.lang.String str45 = language44.getLocaleCode();
        java.lang.String str46 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language44);
        io.resourcepool.model.Language language48 = io.resourcepool.model.Language.random();
        java.lang.String str49 = language48.getLocaleCode();
        java.lang.String str50 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language48);
        io.resourcepool.model.Language language51 = io.resourcepool.model.Language.random();
        java.lang.String str52 = language51.getLocaleCode();
        io.resourcepool.model.Language language53 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language54 = io.resourcepool.model.Language.random();
        java.lang.String str55 = language54.getLocaleCode();
        io.resourcepool.model.Language[] languageArray56 = new io.resourcepool.model.Language[] { language44, language48, language51, language53, language54 };
        int int57 = surnamesDictionary35.size(languageArray56);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary58 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int59 = fortunesDictionary58.size();
        io.resourcepool.generator.Query.Builder builder60 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary61 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary62 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray63 = new io.resourcepool.model.Language[] {};
        int int64 = surnamesDictionary62.size(languageArray63);
        int int65 = givenNamesDictionary61.size(languageArray63);
        io.resourcepool.generator.Query.Builder builder66 = builder60.languages(languageArray63);
        int int67 = fortunesDictionary58.size(languageArray63);
        int int68 = surnamesDictionary35.size(languageArray63);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary70 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray71 = new io.resourcepool.model.Language[] {};
        int int72 = surnamesDictionary70.size(languageArray71);
        io.resourcepool.model.Language language73 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language74 = io.resourcepool.model.Language.random();
        java.lang.String str75 = language74.getLocaleCode();
        io.resourcepool.model.Language[] languageArray76 = new io.resourcepool.model.Language[] { language73, language74 };
        int int77 = surnamesDictionary70.size(languageArray76);
        io.resourcepool.generator.Query query78 = new io.resourcepool.generator.Query(20000, languageArray76);
        java.util.List<java.lang.String> strList79 = surnamesDictionary35.pick(query78);
        java.util.List<io.resourcepool.model.Fortune> fortuneList80 = simpleFortuneGenerator33.nextFortunes(query78);
        java.util.List<io.resourcepool.model.Fortune> fortuneList81 = fortunesDictionary12.pick(query78);
        int int82 = query78.count;
        java.util.List<java.lang.String> strList83 = surnamesDictionary4.pick(query78);
        boolean boolean84 = givenName3.equals((java.lang.Object) strList83);
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + language7 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language7.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language8 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language8.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en" + "'", str9, "en");
        org.junit.Assert.assertNotNull(languageArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11812 + "'", int13 == 11812);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(languageArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11812 + "'", int23 == 11812);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(languageArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(fortune34);
        org.junit.Assert.assertNotNull(languageArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language39 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language39.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "en" + "'", str40, "en");
        org.junit.Assert.assertNotNull(languageArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20000 + "'", int42 == 20000);
        org.junit.Assert.assertTrue("'" + language44 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language44.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "en" + "'", str45, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!29" + "'", str46, "hi!29");
        org.junit.Assert.assertTrue("'" + language48 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language48.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "en" + "'", str49, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!21" + "'", str50, "hi!21");
        org.junit.Assert.assertTrue("'" + language51 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language51.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "en" + "'", str52, "en");
        org.junit.Assert.assertTrue("'" + language53 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language53.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language54 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language54.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "en" + "'", str55, "en");
        org.junit.Assert.assertNotNull(languageArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 50000 + "'", int57 == 50000);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 11812 + "'", int59 == 11812);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(languageArray63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(languageArray71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + language73 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language73.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language74 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language74.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "en" + "'", str75, "en");
        org.junit.Assert.assertNotNull(languageArray76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 20000 + "'", int77 == 20000);
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertNotNull(fortuneList80);
        org.junit.Assert.assertNotNull(fortuneList81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 20000 + "'", int82 == 20000);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.lang.String str1 = simpleNameGenerator0.nextNickname();
        java.util.List<io.resourcepool.model.FullName> fullNameList3 = simpleNameGenerator0.nextNames((int) (byte) 10);
        java.lang.String str4 = simpleNameGenerator0.nextSurname();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mamie23" + "'", str1, "Mamie23");
        org.junit.Assert.assertNotNull(fullNameList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Shaull" + "'", str4, "Shaull");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList13 = simpleNameGenerator0.nextSurnames(10);
        java.util.List<io.resourcepool.model.FullName> fullNameList15 = simpleNameGenerator0.nextNames(20000);
        io.resourcepool.model.GivenName givenName16 = simpleNameGenerator0.nextGivenName();
        java.lang.String str17 = givenName16.nickname;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(fullNameList15);
        org.junit.Assert.assertNotNull(givenName16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Mamie23" + "'", str17, "Mamie23");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.lang.String str3 = fortune2.text;
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "If at first you don't succeed, try something else." + "'", str3, "If at first you don't succeed, try something else.");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<java.lang.String> strList13 = simpleNameGenerator0.nextSurnames((int) (short) 1);
        java.lang.String str14 = simpleNameGenerator0.nextNickname();
        java.util.List<io.resourcepool.model.FullName> fullNameList16 = simpleNameGenerator0.nextNames(30000);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Mamie23" + "'", str14, "Mamie23");
        org.junit.Assert.assertNotNull(fullNameList16);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.lang.String str1 = simpleNameGenerator0.nextNickname();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mamie23" + "'", str1, "Mamie23");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList13 = simpleNameGenerator0.nextSurnames(10);
        io.resourcepool.model.FullName fullName14 = simpleNameGenerator0.nextName();
        java.lang.String str15 = fullName14.toString();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(fullName14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}" + "'", str15, "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes(0);
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes((int) ' ');
        io.resourcepool.model.Fortune fortune5 = simpleFortuneGenerator0.nextFortune();
        org.junit.Assert.assertNotNull(fortuneList2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertNotNull(fortune5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator7 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList9 = simpleFortuneGenerator7.nextFortunes(0);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator10 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune11 = simpleFortuneGenerator10.nextFortune();
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.random();
        java.lang.String str13 = language12.getLocaleCode();
        io.resourcepool.model.Fortune fortune14 = simpleFortuneGenerator10.nextFortune(language12);
        io.resourcepool.model.Fortune fortune15 = simpleFortuneGenerator7.nextFortune(language12);
        boolean boolean16 = fullName6.equals((java.lang.Object) simpleFortuneGenerator7);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary17 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList19 = surnamesDictionary17.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary20 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] {};
        int int22 = surnamesDictionary20.size(languageArray21);
        int int23 = surnamesDictionary17.size(languageArray21);
        java.lang.String str24 = surnamesDictionary17.pick();
        java.lang.String str25 = surnamesDictionary17.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator26 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune27 = simpleFortuneGenerator26.nextFortune();
        io.resourcepool.model.Language language28 = io.resourcepool.model.Language.random();
        java.lang.String str29 = language28.getLocaleCode();
        io.resourcepool.model.Fortune fortune30 = simpleFortuneGenerator26.nextFortune(language28);
        java.lang.String str31 = surnamesDictionary17.pick(language28);
        io.resourcepool.model.Fortune fortune32 = simpleFortuneGenerator7.nextFortune(language28);
        java.util.List<io.resourcepool.model.Fortune> fortuneList33 = io.resourcepool.dictionary.loader.FortuneLoader.load(language28);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(fortuneList9);
        org.junit.Assert.assertNotNull(fortune11);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertNotNull(fortune14);
        org.junit.Assert.assertNotNull(fortune15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Shaull" + "'", str24, "Shaull");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Shaull" + "'", str25, "Shaull");
        org.junit.Assert.assertNotNull(fortune27);
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en" + "'", str29, "en");
        org.junit.Assert.assertNotNull(fortune30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Shaull" + "'", str31, "Shaull");
        org.junit.Assert.assertNotNull(fortune32);
        org.junit.Assert.assertNotNull(fortuneList33);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        int int4 = givenNamesDictionary0.size(languageArray2);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator5 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune6 = simpleFortuneGenerator5.nextFortune();
        io.resourcepool.model.Language language7 = io.resourcepool.model.Language.random();
        java.lang.String str8 = language7.getLocaleCode();
        io.resourcepool.model.Fortune fortune9 = simpleFortuneGenerator5.nextFortune(language7);
        io.resourcepool.model.GivenName givenName10 = givenNamesDictionary0.pick(language7);
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(fortune6);
        org.junit.Assert.assertTrue("'" + language7 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language7.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
        org.junit.Assert.assertNotNull(fortune9);
        org.junit.Assert.assertNotNull(givenName10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.lang.String str10 = simpleNameGenerator0.nextNickname();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mamie23" + "'", str10, "Mamie23");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames((int) 'a');
        java.util.List<java.lang.String> strList4 = simpleNameGenerator0.nextNicknames(4305);
        io.resourcepool.model.GivenName givenName5 = simpleNameGenerator0.nextGivenName();
        java.lang.String str6 = givenName5.toString();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(givenName5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GivenName{givenName='Mary', nickname='Mamie23', gender=FEMALE}" + "'", str6, "GivenName{givenName='Mary', nickname='Mamie23', gender=FEMALE}");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary1 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int2 = fortunesDictionary1.size();
        io.resourcepool.generator.Query.Builder builder3 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary4 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary5 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] {};
        int int7 = surnamesDictionary5.size(languageArray6);
        int int8 = givenNamesDictionary4.size(languageArray6);
        io.resourcepool.generator.Query.Builder builder9 = builder3.languages(languageArray6);
        int int10 = fortunesDictionary1.size(languageArray6);
        java.util.List<io.resourcepool.model.Fortune> fortuneList12 = fortunesDictionary1.pick((int) (short) 100);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary13 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int14 = fortunesDictionary13.size();
        io.resourcepool.generator.Query.Builder builder15 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary16 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary17 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray18 = new io.resourcepool.model.Language[] {};
        int int19 = surnamesDictionary17.size(languageArray18);
        int int20 = givenNamesDictionary16.size(languageArray18);
        io.resourcepool.generator.Query.Builder builder21 = builder15.languages(languageArray18);
        int int22 = fortunesDictionary13.size(languageArray18);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary23 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary24 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray25 = new io.resourcepool.model.Language[] {};
        int int26 = surnamesDictionary24.size(languageArray25);
        int int27 = surnamesDictionary23.size(languageArray25);
        int int28 = fortunesDictionary13.size(languageArray25);
        int int29 = fortunesDictionary1.size(languageArray25);
        io.resourcepool.generator.Query query30 = new io.resourcepool.generator.Query(10, languageArray25);
        int int31 = query30.count;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11812 + "'", int2 == 11812);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fortuneList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11812 + "'", int14 == 11812);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(languageArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(languageArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator1 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList3 = simpleFortuneGenerator1.nextFortunes(0);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator4 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune5 = simpleFortuneGenerator4.nextFortune();
        io.resourcepool.model.Language language6 = io.resourcepool.model.Language.random();
        java.lang.String str7 = language6.getLocaleCode();
        io.resourcepool.model.Fortune fortune8 = simpleFortuneGenerator4.nextFortune(language6);
        io.resourcepool.model.Fortune fortune9 = simpleFortuneGenerator1.nextFortune(language6);
        java.util.List<io.resourcepool.model.GivenName> givenNameList10 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language6);
        io.resourcepool.model.Fortune fortune11 = fortunesDictionary0.pick(language6);
        org.junit.Assert.assertNotNull(fortuneList3);
        org.junit.Assert.assertNotNull(fortune5);
        org.junit.Assert.assertTrue("'" + language6 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language6.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
        org.junit.Assert.assertNotNull(fortune8);
        org.junit.Assert.assertNotNull(fortune9);
        org.junit.Assert.assertNotNull(givenNameList10);
        org.junit.Assert.assertNotNull(fortune11);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        java.util.List<java.lang.String> strList12 = simpleNameGenerator0.nextSurnames((int) '#');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        io.resourcepool.model.GivenName givenName1 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.model.GivenName givenName2 = givenName1.clone();
        java.lang.String str3 = givenName1.toString();
        org.junit.Assert.assertNotNull(givenName1);
        org.junit.Assert.assertNotNull(givenName2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GivenName{givenName='Mary', nickname='Mamie23', gender=FEMALE}" + "'", str3, "GivenName{givenName='Mary', nickname='Mamie23', gender=FEMALE}");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        io.resourcepool.generator.Query query4 = new io.resourcepool.generator.Query(50000, languageArray2);
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int1 = fortunesDictionary0.size();
        io.resourcepool.generator.Query.Builder builder2 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary3 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary4 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray5 = new io.resourcepool.model.Language[] {};
        int int6 = surnamesDictionary4.size(languageArray5);
        int int7 = givenNamesDictionary3.size(languageArray5);
        io.resourcepool.generator.Query.Builder builder8 = builder2.languages(languageArray5);
        int int9 = fortunesDictionary0.size(languageArray5);
        java.util.List<io.resourcepool.model.Fortune> fortuneList11 = fortunesDictionary0.pick((int) (short) 100);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary12 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int13 = fortunesDictionary12.size();
        io.resourcepool.generator.Query.Builder builder14 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary15 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary16 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray17 = new io.resourcepool.model.Language[] {};
        int int18 = surnamesDictionary16.size(languageArray17);
        int int19 = givenNamesDictionary15.size(languageArray17);
        io.resourcepool.generator.Query.Builder builder20 = builder14.languages(languageArray17);
        int int21 = fortunesDictionary12.size(languageArray17);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary22 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary23 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray24 = new io.resourcepool.model.Language[] {};
        int int25 = surnamesDictionary23.size(languageArray24);
        int int26 = surnamesDictionary22.size(languageArray24);
        int int27 = fortunesDictionary12.size(languageArray24);
        int int28 = fortunesDictionary0.size(languageArray24);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary30 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int31 = fortunesDictionary30.size();
        io.resourcepool.generator.Query.Builder builder32 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary33 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary34 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray35 = new io.resourcepool.model.Language[] {};
        int int36 = surnamesDictionary34.size(languageArray35);
        int int37 = givenNamesDictionary33.size(languageArray35);
        io.resourcepool.generator.Query.Builder builder38 = builder32.languages(languageArray35);
        int int39 = fortunesDictionary30.size(languageArray35);
        java.util.List<io.resourcepool.model.Fortune> fortuneList41 = fortunesDictionary30.pick((int) (short) 100);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary42 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int43 = fortunesDictionary42.size();
        io.resourcepool.generator.Query.Builder builder44 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary45 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary46 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray47 = new io.resourcepool.model.Language[] {};
        int int48 = surnamesDictionary46.size(languageArray47);
        int int49 = givenNamesDictionary45.size(languageArray47);
        io.resourcepool.generator.Query.Builder builder50 = builder44.languages(languageArray47);
        int int51 = fortunesDictionary42.size(languageArray47);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary52 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary53 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray54 = new io.resourcepool.model.Language[] {};
        int int55 = surnamesDictionary53.size(languageArray54);
        int int56 = surnamesDictionary52.size(languageArray54);
        int int57 = fortunesDictionary42.size(languageArray54);
        int int58 = fortunesDictionary30.size(languageArray54);
        io.resourcepool.generator.Query query59 = new io.resourcepool.generator.Query(10, languageArray54);
        int int60 = fortunesDictionary0.size(languageArray54);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary61 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList63 = surnamesDictionary61.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary64 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray65 = new io.resourcepool.model.Language[] {};
        int int66 = surnamesDictionary64.size(languageArray65);
        int int67 = surnamesDictionary61.size(languageArray65);
        java.lang.String str68 = surnamesDictionary61.pick();
        java.lang.String str69 = surnamesDictionary61.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator70 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune71 = simpleFortuneGenerator70.nextFortune();
        io.resourcepool.model.Language language72 = io.resourcepool.model.Language.random();
        java.lang.String str73 = language72.getLocaleCode();
        io.resourcepool.model.Fortune fortune74 = simpleFortuneGenerator70.nextFortune(language72);
        java.lang.String str75 = surnamesDictionary61.pick(language72);
        io.resourcepool.model.Fortune fortune76 = fortunesDictionary0.pick(language72);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fortuneList11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11812 + "'", int13 == 11812);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(languageArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(languageArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 11812 + "'", int31 == 11812);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(languageArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(fortuneList41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 11812 + "'", int43 == 11812);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(languageArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(languageArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(strList63);
        org.junit.Assert.assertNotNull(languageArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Shaull" + "'", str68, "Shaull");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Shaull" + "'", str69, "Shaull");
        org.junit.Assert.assertNotNull(fortune71);
        org.junit.Assert.assertTrue("'" + language72 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language72.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "en" + "'", str73, "en");
        org.junit.Assert.assertNotNull(fortune74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Shaull" + "'", str75, "Shaull");
        org.junit.Assert.assertNotNull(fortune76);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes(0);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary4 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int5 = fortunesDictionary4.size();
        io.resourcepool.generator.Query.Builder builder6 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary7 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary8 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray9 = new io.resourcepool.model.Language[] {};
        int int10 = surnamesDictionary8.size(languageArray9);
        int int11 = givenNamesDictionary7.size(languageArray9);
        io.resourcepool.generator.Query.Builder builder12 = builder6.languages(languageArray9);
        int int13 = fortunesDictionary4.size(languageArray9);
        io.resourcepool.generator.Query query14 = new io.resourcepool.generator.Query((int) ' ', languageArray9);
        java.util.List<io.resourcepool.model.Fortune> fortuneList15 = simpleFortuneGenerator0.nextFortunes(query14);
        java.util.List<io.resourcepool.model.Fortune> fortuneList17 = simpleFortuneGenerator0.nextFortunes(100);
        org.junit.Assert.assertNotNull(fortuneList2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11812 + "'", int5 == 11812);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(languageArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(fortuneList15);
        org.junit.Assert.assertNotNull(fortuneList17);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick((int) 'a');
        int int3 = surnamesDictionary0.size();
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary5 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int6 = fortunesDictionary5.size();
        io.resourcepool.generator.Query.Builder builder7 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary8 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary9 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray10 = new io.resourcepool.model.Language[] {};
        int int11 = surnamesDictionary9.size(languageArray10);
        int int12 = givenNamesDictionary8.size(languageArray10);
        io.resourcepool.generator.Query.Builder builder13 = builder7.languages(languageArray10);
        int int14 = fortunesDictionary5.size(languageArray10);
        io.resourcepool.generator.Query query15 = new io.resourcepool.generator.Query(10, languageArray10);
        int int16 = surnamesDictionary0.size(languageArray10);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11812 + "'", int6 == 11812);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(languageArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList8 = simpleNameGenerator0.nextNicknames(4305);
        java.lang.String str9 = simpleNameGenerator0.nextNickname();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Mamie23" + "'", str9, "Mamie23");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.lang.String str7 = fullName6.surname;
        boolean boolean9 = fullName6.equals((java.lang.Object) "hi!34");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "Shaull", gender2);
        java.lang.String str4 = givenName3.nickname;
        io.resourcepool.model.FullName fullName6 = givenName3.toFullName("hi!57");
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Shaull" + "'", str4, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "Shaull", gender2);
        io.resourcepool.model.Gender gender4 = givenName3.gender;
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertTrue("'" + gender4 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender4.equals(io.resourcepool.model.Gender.MALE));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary1 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int2 = fortunesDictionary1.size();
        io.resourcepool.generator.Query.Builder builder3 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary4 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary5 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] {};
        int int7 = surnamesDictionary5.size(languageArray6);
        int int8 = givenNamesDictionary4.size(languageArray6);
        io.resourcepool.generator.Query.Builder builder9 = builder3.languages(languageArray6);
        int int10 = fortunesDictionary1.size(languageArray6);
        java.util.List<io.resourcepool.model.Fortune> fortuneList12 = fortunesDictionary1.pick((int) (short) 100);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary13 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int14 = fortunesDictionary13.size();
        io.resourcepool.generator.Query.Builder builder15 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary16 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary17 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray18 = new io.resourcepool.model.Language[] {};
        int int19 = surnamesDictionary17.size(languageArray18);
        int int20 = givenNamesDictionary16.size(languageArray18);
        io.resourcepool.generator.Query.Builder builder21 = builder15.languages(languageArray18);
        int int22 = fortunesDictionary13.size(languageArray18);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary23 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary24 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray25 = new io.resourcepool.model.Language[] {};
        int int26 = surnamesDictionary24.size(languageArray25);
        int int27 = surnamesDictionary23.size(languageArray25);
        int int28 = fortunesDictionary13.size(languageArray25);
        int int29 = fortunesDictionary1.size(languageArray25);
        io.resourcepool.generator.Query query30 = new io.resourcepool.generator.Query((int) ' ', languageArray25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11812 + "'", int2 == 11812);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fortuneList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11812 + "'", int14 == 11812);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(languageArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(languageArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        io.resourcepool.generator.Query.Builder builder0 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray1 = null;
        io.resourcepool.generator.Query.Builder builder2 = builder0.languages(languageArray1);
        io.resourcepool.generator.Query.Builder builder4 = builder0.count((int) (byte) 1);
        io.resourcepool.generator.Query.Builder builder5 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray6 = null;
        io.resourcepool.generator.Query.Builder builder7 = builder5.languages(languageArray6);
        io.resourcepool.generator.Query.Builder builder9 = builder5.count((int) (byte) 1);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList12 = surnamesDictionary10.pick((int) 'a');
        int int13 = surnamesDictionary10.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary14 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray15 = new io.resourcepool.model.Language[] {};
        int int16 = surnamesDictionary14.size(languageArray15);
        io.resourcepool.model.Language language17 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.random();
        java.lang.String str19 = language18.getLocaleCode();
        io.resourcepool.model.Language[] languageArray20 = new io.resourcepool.model.Language[] { language17, language18 };
        int int21 = surnamesDictionary14.size(languageArray20);
        io.resourcepool.model.Language language23 = io.resourcepool.model.Language.random();
        java.lang.String str24 = language23.getLocaleCode();
        java.lang.String str25 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language23);
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.random();
        java.lang.String str28 = language27.getLocaleCode();
        java.lang.String str29 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language27);
        io.resourcepool.model.Language language30 = io.resourcepool.model.Language.random();
        java.lang.String str31 = language30.getLocaleCode();
        io.resourcepool.model.Language language32 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language33 = io.resourcepool.model.Language.random();
        java.lang.String str34 = language33.getLocaleCode();
        io.resourcepool.model.Language[] languageArray35 = new io.resourcepool.model.Language[] { language23, language27, language30, language32, language33 };
        int int36 = surnamesDictionary14.size(languageArray35);
        int int37 = surnamesDictionary10.size(languageArray35);
        io.resourcepool.generator.Query.Builder builder38 = builder5.languages(languageArray35);
        io.resourcepool.generator.Query.Builder builder39 = builder4.languages(languageArray35);
        io.resourcepool.generator.Query.Builder builder41 = builder4.count(10);
        io.resourcepool.generator.Query.Builder builder43 = builder41.count(10000);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + language17 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language17.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en" + "'", str19, "en");
        org.junit.Assert.assertNotNull(languageArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20000 + "'", int21 == 20000);
        org.junit.Assert.assertTrue("'" + language23 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language23.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en" + "'", str24, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!3" + "'", str25, "hi!3");
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en" + "'", str28, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!1" + "'", str29, "hi!1");
        org.junit.Assert.assertTrue("'" + language30 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language30.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en" + "'", str31, "en");
        org.junit.Assert.assertTrue("'" + language32 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language32.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language33 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language33.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "en" + "'", str34, "en");
        org.junit.Assert.assertNotNull(languageArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 50000 + "'", int36 == 50000);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 50000 + "'", int37 == 50000);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        io.resourcepool.generator.Query.Builder builder0 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray1 = null;
        io.resourcepool.generator.Query.Builder builder2 = builder0.languages(languageArray1);
        io.resourcepool.generator.Query.Builder builder4 = builder0.count((int) (byte) 1);
        io.resourcepool.generator.Query.Builder builder5 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray6 = null;
        io.resourcepool.generator.Query.Builder builder7 = builder5.languages(languageArray6);
        io.resourcepool.generator.Query.Builder builder9 = builder5.count((int) (byte) 1);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList12 = surnamesDictionary10.pick((int) 'a');
        int int13 = surnamesDictionary10.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary14 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray15 = new io.resourcepool.model.Language[] {};
        int int16 = surnamesDictionary14.size(languageArray15);
        io.resourcepool.model.Language language17 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.random();
        java.lang.String str19 = language18.getLocaleCode();
        io.resourcepool.model.Language[] languageArray20 = new io.resourcepool.model.Language[] { language17, language18 };
        int int21 = surnamesDictionary14.size(languageArray20);
        io.resourcepool.model.Language language23 = io.resourcepool.model.Language.random();
        java.lang.String str24 = language23.getLocaleCode();
        java.lang.String str25 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language23);
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.random();
        java.lang.String str28 = language27.getLocaleCode();
        java.lang.String str29 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language27);
        io.resourcepool.model.Language language30 = io.resourcepool.model.Language.random();
        java.lang.String str31 = language30.getLocaleCode();
        io.resourcepool.model.Language language32 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language33 = io.resourcepool.model.Language.random();
        java.lang.String str34 = language33.getLocaleCode();
        io.resourcepool.model.Language[] languageArray35 = new io.resourcepool.model.Language[] { language23, language27, language30, language32, language33 };
        int int36 = surnamesDictionary14.size(languageArray35);
        int int37 = surnamesDictionary10.size(languageArray35);
        io.resourcepool.generator.Query.Builder builder38 = builder5.languages(languageArray35);
        io.resourcepool.generator.Query.Builder builder39 = builder4.languages(languageArray35);
        io.resourcepool.generator.Query.Builder builder41 = builder4.count(10);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary42 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int43 = fortunesDictionary42.size();
        io.resourcepool.generator.Query.Builder builder44 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary45 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary46 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray47 = new io.resourcepool.model.Language[] {};
        int int48 = surnamesDictionary46.size(languageArray47);
        int int49 = givenNamesDictionary45.size(languageArray47);
        io.resourcepool.generator.Query.Builder builder50 = builder44.languages(languageArray47);
        int int51 = fortunesDictionary42.size(languageArray47);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary52 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary53 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray54 = new io.resourcepool.model.Language[] {};
        int int55 = surnamesDictionary53.size(languageArray54);
        int int56 = surnamesDictionary52.size(languageArray54);
        int int57 = fortunesDictionary42.size(languageArray54);
        io.resourcepool.generator.Query.Builder builder58 = builder41.languages(languageArray54);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + language17 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language17.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en" + "'", str19, "en");
        org.junit.Assert.assertNotNull(languageArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20000 + "'", int21 == 20000);
        org.junit.Assert.assertTrue("'" + language23 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language23.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en" + "'", str24, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!16" + "'", str25, "hi!16");
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en" + "'", str28, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!79" + "'", str29, "hi!79");
        org.junit.Assert.assertTrue("'" + language30 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language30.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en" + "'", str31, "en");
        org.junit.Assert.assertTrue("'" + language32 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language32.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language33 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language33.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "en" + "'", str34, "en");
        org.junit.Assert.assertNotNull(languageArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 50000 + "'", int36 == 50000);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 50000 + "'", int37 == 50000);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 11812 + "'", int43 == 11812);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(languageArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(languageArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.model.GivenName givenName1 = givenNamesDictionary0.pick();
        java.util.List<io.resourcepool.model.GivenName> givenNameList3 = givenNamesDictionary0.pick(52);
        org.junit.Assert.assertNotNull(givenName1);
        org.junit.Assert.assertNotNull(givenNameList3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary3 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray4 = new io.resourcepool.model.Language[] {};
        int int5 = surnamesDictionary3.size(languageArray4);
        int int6 = surnamesDictionary0.size(languageArray4);
        java.lang.String str7 = surnamesDictionary0.pick();
        java.lang.String str8 = surnamesDictionary0.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator9 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune10 = simpleFortuneGenerator9.nextFortune();
        io.resourcepool.model.Language language11 = io.resourcepool.model.Language.random();
        java.lang.String str12 = language11.getLocaleCode();
        io.resourcepool.model.Fortune fortune13 = simpleFortuneGenerator9.nextFortune(language11);
        java.lang.String str14 = surnamesDictionary0.pick(language11);
        java.util.List<io.resourcepool.model.GivenName> givenNameList15 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language11);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(languageArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertNotNull(fortune10);
        org.junit.Assert.assertTrue("'" + language11 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language11.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en" + "'", str12, "en");
        org.junit.Assert.assertNotNull(fortune13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Shaull" + "'", str14, "Shaull");
        org.junit.Assert.assertNotNull(givenNameList15);
    }
}
