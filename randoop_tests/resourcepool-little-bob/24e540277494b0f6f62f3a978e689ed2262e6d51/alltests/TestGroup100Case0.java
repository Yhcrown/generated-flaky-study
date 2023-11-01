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
        io.resourcepool.dictionary.loader.FortuneLoader fortuneLoader0 = new io.resourcepool.dictionary.loader.FortuneLoader();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        io.resourcepool.model.Gender gender1 = io.resourcepool.model.Gender.parse("hi!");
        org.junit.Assert.assertNull(gender1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        io.resourcepool.model.Language language0 = io.resourcepool.model.Language.ENGLISH;
        org.junit.Assert.assertTrue("'" + language0 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language0.equals(io.resourcepool.model.Language.ENGLISH));
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
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.model.GivenName givenName1 = givenNamesDictionary0.pick();
        org.junit.Assert.assertNotNull(givenName1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick((int) 'a');
        int int3 = surnamesDictionary0.size();
        java.lang.String str4 = surnamesDictionary0.pick();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Shaull" + "'", str4, "Shaull");
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
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.Gender gender5 = givenName4.gender;
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertTrue("'" + gender5 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender5.equals(io.resourcepool.model.Gender.MALE));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick((int) 'a');
        int int3 = surnamesDictionary0.size();
        java.lang.Class<?> wildcardClass4 = surnamesDictionary0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
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
        java.lang.String str23 = surnamesDictionary0.pick();
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Firehi!" + "'", str11, "Firehi!");
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!9" + "'", str15, "hi!9");
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50000 + "'", int22 == 50000);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Shaull" + "'", str23, "Shaull");
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
        io.resourcepool.generator.Query.Builder builder23 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary24 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary25 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray26 = new io.resourcepool.model.Language[] {};
        int int27 = surnamesDictionary25.size(languageArray26);
        int int28 = givenNamesDictionary24.size(languageArray26);
        io.resourcepool.generator.Query.Builder builder29 = builder23.languages(languageArray26);
        int int30 = surnamesDictionary0.size(languageArray26);
        io.resourcepool.model.Language language31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = surnamesDictionary0.pick(language31);
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!40" + "'", str11, "hi!40");
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!48" + "'", str15, "hi!48");
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50000 + "'", int22 == 50000);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(languageArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.lang.String str7 = simpleNameGenerator0.nextSurname();
        java.lang.String str8 = simpleNameGenerator0.nextNickname();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mamie23" + "'", str8, "Mamie23");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.FullName fullName6 = givenName4.toFullName("Mamie23");
        java.lang.String str7 = fullName6.surname;
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mamie23" + "'", str7, "Mamie23");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes(20000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 11812 elements in the Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
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
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
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
        io.resourcepool.generator.Query.Builder builder23 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary24 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary25 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray26 = new io.resourcepool.model.Language[] {};
        int int27 = surnamesDictionary25.size(languageArray26);
        int int28 = givenNamesDictionary24.size(languageArray26);
        io.resourcepool.generator.Query.Builder builder29 = builder23.languages(languageArray26);
        int int30 = surnamesDictionary0.size(languageArray26);
        io.resourcepool.generator.Query query31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList32 = surnamesDictionary0.pick(query31);
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!54" + "'", str11, "hi!54");
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!12" + "'", str15, "hi!12");
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50000 + "'", int22 == 50000);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(languageArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
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
        io.resourcepool.generator.Query.Builder builder23 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary24 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary25 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray26 = new io.resourcepool.model.Language[] {};
        int int27 = surnamesDictionary25.size(languageArray26);
        int int28 = givenNamesDictionary24.size(languageArray26);
        io.resourcepool.generator.Query.Builder builder29 = builder23.languages(languageArray26);
        int int30 = surnamesDictionary0.size(languageArray26);
        java.lang.String str31 = surnamesDictionary0.pick();
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!87" + "'", str11, "hi!87");
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!18" + "'", str15, "hi!18");
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50000 + "'", int22 == 50000);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(languageArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Shaull" + "'", str31, "Shaull");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.FullName fullName6 = givenName4.toFullName("Mamie23");
        java.lang.String str7 = fullName6.toString();
        java.lang.String str8 = fullName6.toString();
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FullName{givenName='Shaull', surname='Mamie23', nickname='', gender=MALE}" + "'", str7, "FullName{givenName='Shaull', surname='Mamie23', nickname='', gender=MALE}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FullName{givenName='Shaull', surname='Mamie23', nickname='', gender=MALE}" + "'", str8, "FullName{givenName='Shaull', surname='Mamie23', nickname='', gender=MALE}");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList8 = simpleNameGenerator0.nextNicknames(4305);
        java.lang.String str9 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames((int) (byte) 100);
        java.util.List<io.resourcepool.model.FullName> fullNameList13 = simpleNameGenerator0.nextNames(0);
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
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        java.lang.String str11 = givenName10.toString();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GivenName{givenName='Mary', nickname='Mamie23', gender=FEMALE}" + "'", str11, "GivenName{givenName='Mary', nickname='Mamie23', gender=FEMALE}");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
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
        java.util.List<io.resourcepool.model.Fortune> fortuneList11 = fortunesDictionary0.pick(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fortuneList11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        java.lang.String str2 = fortune1.text;
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "If at first you don't succeed, try something else." + "'", str2, "If at first you don't succeed, try something else.");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        io.resourcepool.model.GivenName givenName1 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.model.FullName fullName3 = givenName1.toFullName("hi!96");
        org.junit.Assert.assertNotNull(givenName1);
        org.junit.Assert.assertNotNull(fullName3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int1 = fortunesDictionary0.size();
        int int2 = fortunesDictionary0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11812 + "'", int2 == 11812);
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
        io.resourcepool.model.Language language1 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune(language1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.resourcepool.model.Language language0 = io.resourcepool.model.Language.random();
        java.lang.String str1 = language0.getLocaleCode();
        java.util.List<io.resourcepool.model.Fortune> fortuneList2 = io.resourcepool.dictionary.loader.FortuneLoader.load(language0);
        org.junit.Assert.assertTrue("'" + language0 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language0.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en" + "'", str1, "en");
        org.junit.Assert.assertNotNull(fortuneList2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList3 = simpleFortuneGenerator0.nextFortunes(10);
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language4);
        io.resourcepool.model.Fortune fortune7 = simpleFortuneGenerator0.nextFortune(language4);
        java.lang.String str8 = fortune7.text;
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortuneList3);
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(fortune7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "If at first you don't succeed, try something else." + "'", str8, "If at first you don't succeed, try something else.");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
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
        io.resourcepool.model.Fortune fortune11 = fortune10.clone();
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.resourcepool.model.Gender gender2 = null;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "Cutiehi!", gender2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
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
        java.util.List<io.resourcepool.model.GivenName> givenNameList13 = givenNamesDictionary0.pick((int) 'a');
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
        io.resourcepool.generator.Query query26 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray24);
        java.util.List<java.lang.String> strList27 = surnamesDictionary14.pick(query26);
        java.util.List<io.resourcepool.model.GivenName> givenNameList28 = givenNamesDictionary0.pick(query26);
        int int29 = givenNamesDictionary0.size();
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
        org.junit.Assert.assertNotNull(givenNameList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4305 + "'", int29 == 4305);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.lang.String str7 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(0);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary12 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList14 = surnamesDictionary12.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary16 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray17 = new io.resourcepool.model.Language[] {};
        int int18 = surnamesDictionary16.size(languageArray17);
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language20 = io.resourcepool.model.Language.random();
        java.lang.String str21 = language20.getLocaleCode();
        io.resourcepool.model.Language[] languageArray22 = new io.resourcepool.model.Language[] { language19, language20 };
        int int23 = surnamesDictionary16.size(languageArray22);
        io.resourcepool.generator.Query query24 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray22);
        java.util.List<java.lang.String> strList25 = surnamesDictionary12.pick(query24);
        java.util.List<io.resourcepool.model.FullName> fullNameList26 = simpleNameGenerator0.nextNames(query24);
        java.util.List<io.resourcepool.model.GivenName> givenNameList28 = simpleNameGenerator0.nextGivenNames((int) '#');
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en" + "'", str21, "en");
        org.junit.Assert.assertNotNull(languageArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(fullNameList26);
        org.junit.Assert.assertNotNull(givenNameList28);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList8 = simpleNameGenerator0.nextNicknames(4305);
        java.lang.String str9 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames((int) (byte) 0);
        java.util.List<io.resourcepool.model.FullName> fullNameList13 = simpleNameGenerator0.nextNames(11812);
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        io.resourcepool.model.Gender gender1 = io.resourcepool.model.Gender.parse("hi!28");
        org.junit.Assert.assertNull(gender1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        io.resourcepool.model.FullName fullName7 = simpleNameGenerator0.nextName();
        io.resourcepool.model.GivenName givenName8 = simpleNameGenerator0.nextGivenName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(fullName7);
        org.junit.Assert.assertNotNull(givenName8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.lang.String str7 = fullName6.surname;
        java.lang.String str8 = fullName6.givenName;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mary" + "'", str8, "Mary");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        io.resourcepool.model.Fortune fortune2 = new io.resourcepool.model.Fortune("Mary", "hi!87");
        java.lang.String str3 = fortune2.text;
        java.lang.String str4 = fortune2.text;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mary" + "'", str3, "Mary");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mary" + "'", str4, "Mary");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.lang.String str7 = simpleNameGenerator0.nextNickname();
        io.resourcepool.model.GivenName givenName8 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.model.Gender gender9 = givenName8.gender;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mamie23" + "'", str7, "Mamie23");
        org.junit.Assert.assertNotNull(givenName8);
        org.junit.Assert.assertTrue("'" + gender9 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender9.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList3 = simpleFortuneGenerator0.nextFortunes(10);
        java.util.List<io.resourcepool.model.Fortune> fortuneList5 = simpleFortuneGenerator0.nextFortunes((-1));
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortuneList3);
        org.junit.Assert.assertNotNull(fortuneList5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary3 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray4 = new io.resourcepool.model.Language[] {};
        int int5 = surnamesDictionary3.size(languageArray4);
        int int6 = surnamesDictionary0.size(languageArray4);
        java.lang.String str7 = surnamesDictionary0.pick();
        int int8 = surnamesDictionary0.size();
        int int9 = surnamesDictionary0.size();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(languageArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        io.resourcepool.model.Gender gender0 = io.resourcepool.model.Gender.FEMALE;
        org.junit.Assert.assertTrue("'" + gender0 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender0.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary3 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray4 = new io.resourcepool.model.Language[] {};
        int int5 = surnamesDictionary3.size(languageArray4);
        int int6 = surnamesDictionary0.size(languageArray4);
        int int7 = surnamesDictionary0.size();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(languageArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
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
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary11 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList13 = surnamesDictionary11.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary14 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray15 = new io.resourcepool.model.Language[] {};
        int int16 = surnamesDictionary14.size(languageArray15);
        int int17 = surnamesDictionary11.size(languageArray15);
        int int18 = givenNamesDictionary0.size(languageArray15);
        java.util.List<io.resourcepool.model.GivenName> givenNameList20 = givenNamesDictionary0.pick(1);
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(givenNameList20);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.lang.String str7 = simpleNameGenerator0.nextNickname();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mamie23" + "'", str7, "Mamie23");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList8 = simpleNameGenerator0.nextNicknames(4305);
        java.lang.String str9 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(2000);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary12 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary13 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray14 = new io.resourcepool.model.Language[] {};
        int int15 = surnamesDictionary13.size(languageArray14);
        int int16 = givenNamesDictionary12.size(languageArray14);
        java.util.List<io.resourcepool.model.GivenName> givenNameList18 = givenNamesDictionary12.pick((int) ' ');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary19 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray20 = new io.resourcepool.model.Language[] {};
        int int21 = surnamesDictionary19.size(languageArray20);
        int int22 = givenNamesDictionary12.size(languageArray20);
        int int23 = givenNamesDictionary12.size();
        java.util.List<io.resourcepool.model.GivenName> givenNameList25 = givenNamesDictionary12.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary26 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList28 = surnamesDictionary26.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary30 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray31 = new io.resourcepool.model.Language[] {};
        int int32 = surnamesDictionary30.size(languageArray31);
        io.resourcepool.model.Language language33 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language34 = io.resourcepool.model.Language.random();
        java.lang.String str35 = language34.getLocaleCode();
        io.resourcepool.model.Language[] languageArray36 = new io.resourcepool.model.Language[] { language33, language34 };
        int int37 = surnamesDictionary30.size(languageArray36);
        io.resourcepool.generator.Query query38 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray36);
        java.util.List<java.lang.String> strList39 = surnamesDictionary26.pick(query38);
        java.util.List<io.resourcepool.model.GivenName> givenNameList40 = givenNamesDictionary12.pick(query38);
        java.util.List<io.resourcepool.model.FullName> fullNameList41 = simpleNameGenerator0.nextNames(query38);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Shaull" + "'", str9, "Shaull");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(languageArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(givenNameList18);
        org.junit.Assert.assertNotNull(languageArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4305 + "'", int23 == 4305);
        org.junit.Assert.assertNotNull(givenNameList25);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + language33 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language33.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language34 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language34.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "en" + "'", str35, "en");
        org.junit.Assert.assertNotNull(languageArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20000 + "'", int37 == 20000);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(givenNameList40);
        org.junit.Assert.assertNotNull(fullNameList41);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(1);
        java.lang.String str12 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList14 = simpleNameGenerator0.nextSurnames((int) (short) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Shaull" + "'", str12, "Shaull");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList3 = simpleFortuneGenerator0.nextFortunes(10);
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language4);
        io.resourcepool.model.Fortune fortune7 = simpleFortuneGenerator0.nextFortune(language4);
        io.resourcepool.model.Fortune fortune8 = simpleFortuneGenerator0.nextFortune();
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortuneList3);
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(fortune7);
        org.junit.Assert.assertNotNull(fortune8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.lang.String str7 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(0);
        java.lang.String str12 = simpleNameGenerator0.nextNickname();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList14 = simpleNameGenerator0.nextGivenNames(50000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mamie23" + "'", str12, "Mamie23");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.resourcepool.model.Gender gender3 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.FullName fullName4 = new io.resourcepool.model.FullName("hi!4", "Ultrahi!", "hi!53", gender3);
        org.junit.Assert.assertTrue("'" + gender3 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender3.equals(io.resourcepool.model.Gender.MALE));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "Shaull", gender2);
        java.lang.String str4 = givenName3.nickname;
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator5 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        io.resourcepool.model.GivenName givenName6 = simpleNameGenerator5.nextGivenName();
        boolean boolean7 = givenName3.equals((java.lang.Object) givenName6);
        io.resourcepool.model.Gender gender8 = givenName6.gender;
        java.lang.String str9 = givenName6.givenName;
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Shaull" + "'", str4, "Shaull");
        org.junit.Assert.assertNotNull(givenName6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + gender8 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender8.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Mary" + "'", str9, "Mary");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(1);
        java.lang.String str12 = simpleNameGenerator0.nextSurname();
        java.util.List<io.resourcepool.model.FullName> fullNameList14 = simpleNameGenerator0.nextNames(50000);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Shaull" + "'", str12, "Shaull");
        org.junit.Assert.assertNotNull(fullNameList14);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.resourcepool.generator.Query.Builder builder0 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray1 = null;
        io.resourcepool.generator.Query.Builder builder2 = builder0.languages(languageArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.resourcepool.generator.Query.Builder builder4 = builder0.count(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Count must be greater than zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        io.resourcepool.generator.Query.Builder builder0 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray1 = null;
        io.resourcepool.generator.Query.Builder builder2 = builder0.languages(languageArray1);
        io.resourcepool.generator.Query query3 = builder2.build();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary4 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary5 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] {};
        int int7 = surnamesDictionary5.size(languageArray6);
        int int8 = givenNamesDictionary4.size(languageArray6);
        java.util.List<io.resourcepool.model.GivenName> givenNameList10 = givenNamesDictionary4.pick((int) ' ');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary11 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray12 = new io.resourcepool.model.Language[] {};
        int int13 = surnamesDictionary11.size(languageArray12);
        int int14 = givenNamesDictionary4.size(languageArray12);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary15 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList17 = surnamesDictionary15.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary18 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray19 = new io.resourcepool.model.Language[] {};
        int int20 = surnamesDictionary18.size(languageArray19);
        int int21 = surnamesDictionary15.size(languageArray19);
        int int22 = givenNamesDictionary4.size(languageArray19);
        io.resourcepool.generator.Query.Builder builder23 = builder2.languages(languageArray19);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(query3);
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(givenNameList10);
        org.junit.Assert.assertNotNull(languageArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(languageArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.lang.String str7 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames(1);
        io.resourcepool.model.FullName fullName10 = simpleNameGenerator0.nextName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(fullName10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        java.lang.String str11 = givenName10.givenName;
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary12 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary13 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray14 = new io.resourcepool.model.Language[] {};
        int int15 = surnamesDictionary13.size(languageArray14);
        int int16 = givenNamesDictionary12.size(languageArray14);
        java.util.List<io.resourcepool.model.GivenName> givenNameList18 = givenNamesDictionary12.pick(10);
        boolean boolean19 = givenName10.equals((java.lang.Object) 10);
        io.resourcepool.model.FullName fullName21 = givenName10.toFullName("Cutiehi!");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator22 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.lang.String str23 = simpleNameGenerator22.nextSurname();
        java.lang.Class<?> wildcardClass24 = simpleNameGenerator22.getClass();
        boolean boolean25 = fullName21.equals((java.lang.Object) simpleNameGenerator22);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mary" + "'", str11, "Mary");
        org.junit.Assert.assertNotNull(languageArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(givenNameList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fullName21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Shaull" + "'", str23, "Shaull");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
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
        io.resourcepool.generator.Query query12 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray10);
        java.util.List<java.lang.String> strList13 = surnamesDictionary0.pick(query12);
        io.resourcepool.model.Language language15 = io.resourcepool.model.Language.random();
        java.lang.String str16 = language15.getLocaleCode();
        java.lang.String str17 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language15);
        java.lang.String str18 = surnamesDictionary0.pick(language15);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + language7 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language7.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language8 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language8.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en" + "'", str9, "en");
        org.junit.Assert.assertNotNull(languageArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + language15 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language15.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en" + "'", str16, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!40" + "'", str17, "hi!40");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Shaull" + "'", str18, "Shaull");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList3 = simpleFortuneGenerator0.nextFortunes(10);
        io.resourcepool.model.Fortune fortune4 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList6 = simpleFortuneGenerator0.nextFortunes((int) (byte) -1);
        io.resourcepool.generator.Query.Builder builder7 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray8 = null;
        io.resourcepool.generator.Query.Builder builder9 = builder7.languages(languageArray8);
        io.resourcepool.generator.Query query10 = builder7.build();
        java.util.List<io.resourcepool.model.Fortune> fortuneList11 = simpleFortuneGenerator0.nextFortunes(query10);
        int int12 = query10.count;
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortuneList3);
        org.junit.Assert.assertNotNull(fortune4);
        org.junit.Assert.assertNotNull(fortuneList6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(query10);
        org.junit.Assert.assertNotNull(fortuneList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        java.util.List<java.lang.String> strList4 = surnamesDictionary0.pick((int) (byte) -1);
        io.resourcepool.generator.Query.Builder builder5 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary6 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary7 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] {};
        int int9 = surnamesDictionary7.size(languageArray8);
        int int10 = givenNamesDictionary6.size(languageArray8);
        io.resourcepool.generator.Query.Builder builder11 = builder5.languages(languageArray8);
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
        io.resourcepool.generator.Query.Builder builder22 = builder5.languages(languageArray17);
        int int23 = surnamesDictionary0.size(languageArray17);
        java.lang.String str24 = surnamesDictionary0.pick();
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11812 + "'", int13 == 11812);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(languageArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Shaull" + "'", str24, "Shaull");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        io.resourcepool.model.Gender gender8 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName9 = new io.resourcepool.model.GivenName("Shaull", "", gender8);
        io.resourcepool.model.FullName fullName10 = new io.resourcepool.model.FullName("hi!24", "hi!96", "Soberhi!", gender8);
        io.resourcepool.model.FullName fullName11 = new io.resourcepool.model.FullName("hi!62", "", "", gender8);
        java.lang.String str12 = fullName11.surname;
        org.junit.Assert.assertTrue("'" + gender8 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender8.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
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
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(1);
        java.lang.String str12 = simpleNameGenerator0.nextSurname();
        java.util.List<io.resourcepool.model.FullName> fullNameList14 = simpleNameGenerator0.nextNames((-1));
        java.util.List<java.lang.String> strList16 = simpleNameGenerator0.nextNicknames((int) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Shaull" + "'", str12, "Shaull");
        org.junit.Assert.assertNotNull(fullNameList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes(11812);
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Fortune fortune6 = simpleFortuneGenerator0.nextFortune(language5);
        java.lang.String str7 = fortune6.text;
        java.lang.String str8 = fortune6.text;
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertNotNull(fortune6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "If at first you don't succeed, try something else." + "'", str7, "If at first you don't succeed, try something else.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "If at first you don't succeed, try something else." + "'", str8, "If at first you don't succeed, try something else.");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
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
        io.resourcepool.generator.Query query11 = new io.resourcepool.generator.Query((int) ' ', languageArray6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11812 + "'", int2 == 11812);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList3 = simpleFortuneGenerator0.nextFortunes((int) (short) 1);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortuneList3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        java.lang.String str5 = givenName4.nickname;
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator6 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList8 = simpleNameGenerator6.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList10 = simpleNameGenerator6.nextGivenNames(100);
        java.lang.String str11 = simpleNameGenerator6.nextSurname();
        java.util.List<java.lang.String> strList13 = simpleNameGenerator6.nextNicknames(100);
        java.util.List<java.lang.String> strList15 = simpleNameGenerator6.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList17 = simpleNameGenerator6.nextSurnames(1);
        java.lang.String str18 = simpleNameGenerator6.nextSurname();
        java.util.List<io.resourcepool.model.FullName> fullNameList20 = simpleNameGenerator6.nextNames((-1));
        boolean boolean21 = givenName4.equals((java.lang.Object) fullNameList20);
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(givenNameList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Shaull" + "'", str11, "Shaull");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Shaull" + "'", str18, "Shaull");
        org.junit.Assert.assertNotNull(fullNameList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
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
        io.resourcepool.generator.Query.Builder builder23 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary24 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary25 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray26 = new io.resourcepool.model.Language[] {};
        int int27 = surnamesDictionary25.size(languageArray26);
        int int28 = givenNamesDictionary24.size(languageArray26);
        io.resourcepool.generator.Query.Builder builder29 = builder23.languages(languageArray26);
        int int30 = surnamesDictionary0.size(languageArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList32 = surnamesDictionary0.pick(50000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 20000 elements in Surnames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!61" + "'", str11, "hi!61");
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!60" + "'", str15, "hi!60");
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50000 + "'", int22 == 50000);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(languageArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int1 = givenNamesDictionary0.size();
        io.resourcepool.model.GivenName givenName2 = givenNamesDictionary0.pick();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList4 = givenNamesDictionary0.pick(50000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4305 + "'", int1 == 4305);
        org.junit.Assert.assertNotNull(givenName2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        java.lang.String str5 = givenName4.givenName;
        io.resourcepool.model.GivenName givenName6 = givenName4.clone();
        java.lang.String str7 = givenName4.givenName;
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(givenName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<io.resourcepool.model.FullName> fullNameList11 = simpleNameGenerator0.nextNames((int) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(fullNameList11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        io.resourcepool.model.Fortune fortune1 = fortunesDictionary0.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator2 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator2.nextFortunes(1);
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        java.lang.String str6 = language5.getLocaleCode();
        io.resourcepool.model.Fortune fortune7 = simpleFortuneGenerator2.nextFortune(language5);
        io.resourcepool.model.Fortune fortune8 = fortunesDictionary0.pick(language5);
        io.resourcepool.model.Fortune fortune9 = fortune8.clone();
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(fortune7);
        org.junit.Assert.assertNotNull(fortune8);
        org.junit.Assert.assertNotNull(fortune9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int1 = fortunesDictionary0.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary2 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList4 = surnamesDictionary2.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary6 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray7 = new io.resourcepool.model.Language[] {};
        int int8 = surnamesDictionary6.size(languageArray7);
        io.resourcepool.model.Language language9 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language10 = io.resourcepool.model.Language.random();
        java.lang.String str11 = language10.getLocaleCode();
        io.resourcepool.model.Language[] languageArray12 = new io.resourcepool.model.Language[] { language9, language10 };
        int int13 = surnamesDictionary6.size(languageArray12);
        io.resourcepool.generator.Query query14 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray12);
        java.util.List<java.lang.String> strList15 = surnamesDictionary2.pick(query14);
        java.util.List<io.resourcepool.model.Fortune> fortuneList16 = fortunesDictionary0.pick(query14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(languageArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language10 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language10.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
        org.junit.Assert.assertNotNull(languageArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(fortuneList16);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList3 = simpleFortuneGenerator0.nextFortunes(10);
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language4);
        io.resourcepool.model.Fortune fortune7 = simpleFortuneGenerator0.nextFortune(language4);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary8 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList10 = surnamesDictionary8.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary12 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray13 = new io.resourcepool.model.Language[] {};
        int int14 = surnamesDictionary12.size(languageArray13);
        io.resourcepool.model.Language language15 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language16 = io.resourcepool.model.Language.random();
        java.lang.String str17 = language16.getLocaleCode();
        io.resourcepool.model.Language[] languageArray18 = new io.resourcepool.model.Language[] { language15, language16 };
        int int19 = surnamesDictionary12.size(languageArray18);
        io.resourcepool.generator.Query query20 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray18);
        java.util.List<java.lang.String> strList21 = surnamesDictionary8.pick(query20);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator22 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList24 = simpleNameGenerator22.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList26 = simpleNameGenerator22.nextGivenNames(100);
        java.util.List<java.lang.String> strList28 = simpleNameGenerator22.nextSurnames((int) (byte) 1);
        java.lang.String str29 = simpleNameGenerator22.nextSurname();
        java.util.List<java.lang.String> strList31 = simpleNameGenerator22.nextSurnames(1);
        java.util.List<java.lang.String> strList33 = simpleNameGenerator22.nextSurnames(0);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary34 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList36 = surnamesDictionary34.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary38 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray39 = new io.resourcepool.model.Language[] {};
        int int40 = surnamesDictionary38.size(languageArray39);
        io.resourcepool.model.Language language41 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language42 = io.resourcepool.model.Language.random();
        java.lang.String str43 = language42.getLocaleCode();
        io.resourcepool.model.Language[] languageArray44 = new io.resourcepool.model.Language[] { language41, language42 };
        int int45 = surnamesDictionary38.size(languageArray44);
        io.resourcepool.generator.Query query46 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray44);
        java.util.List<java.lang.String> strList47 = surnamesDictionary34.pick(query46);
        java.util.List<io.resourcepool.model.FullName> fullNameList48 = simpleNameGenerator22.nextNames(query46);
        java.util.List<java.lang.String> strList49 = surnamesDictionary8.pick(query46);
        java.util.List<io.resourcepool.model.Fortune> fortuneList50 = simpleFortuneGenerator0.nextFortunes(query46);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortuneList3);
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(fortune7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(languageArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + language15 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language15.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertNotNull(languageArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20000 + "'", int19 == 20000);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(givenNameList26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Shaull" + "'", str29, "Shaull");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(languageArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + language41 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language41.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language42 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language42.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "en" + "'", str43, "en");
        org.junit.Assert.assertNotNull(languageArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20000 + "'", int45 == 20000);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(fullNameList48);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(fortuneList50);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        java.lang.String str5 = givenName4.nickname;
        java.lang.String str6 = givenName4.givenName;
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Shaull" + "'", str6, "Shaull");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        java.lang.String str11 = givenName10.nickname;
        java.lang.String str12 = givenName10.nickname;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mamie23" + "'", str11, "Mamie23");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mamie23" + "'", str12, "Mamie23");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.lang.String str7 = fullName6.surname;
        java.lang.String str8 = fullName6.toString();
        io.resourcepool.model.Gender gender9 = fullName6.gender;
        java.lang.String str10 = fullName6.nickname;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}" + "'", str8, "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}");
        org.junit.Assert.assertTrue("'" + gender9 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender9.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mamie23" + "'", str10, "Mamie23");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        java.util.List<io.resourcepool.model.GivenName> givenNameList2 = givenNamesDictionary0.pick((-1));
        org.junit.Assert.assertNotNull(givenNameList2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.lang.String str1 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList3 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<java.lang.String> strList5 = simpleNameGenerator0.nextSurnames(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Shaull" + "'", str1, "Shaull");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "Shaull", gender2);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator4 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList6 = simpleFortuneGenerator4.nextFortunes(1);
        io.resourcepool.model.Language language7 = io.resourcepool.model.Language.random();
        java.lang.String str8 = language7.getLocaleCode();
        io.resourcepool.model.Fortune fortune9 = simpleFortuneGenerator4.nextFortune(language7);
        io.resourcepool.model.Fortune fortune10 = fortune9.clone();
        boolean boolean11 = givenName3.equals((java.lang.Object) fortune10);
        java.lang.String str12 = fortune10.text;
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(fortuneList6);
        org.junit.Assert.assertTrue("'" + language7 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language7.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
        org.junit.Assert.assertNotNull(fortune9);
        org.junit.Assert.assertNotNull(fortune10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "If at first you don't succeed, try something else." + "'", str12, "If at first you don't succeed, try something else.");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        int int1 = surnamesDictionary0.size();
        java.util.List<java.lang.String> strList3 = surnamesDictionary0.pick((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20000 + "'", int1 == 20000);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
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
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        java.lang.String str11 = givenName10.givenName;
        io.resourcepool.model.FullName fullName13 = givenName10.toFullName("hi!4");
        java.lang.String str14 = fullName13.nickname;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mary" + "'", str11, "Mary");
        org.junit.Assert.assertNotNull(fullName13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Mamie23" + "'", str14, "Mamie23");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes(11812);
        java.util.List<io.resourcepool.model.Fortune> fortuneList6 = simpleFortuneGenerator0.nextFortunes((-1));
        io.resourcepool.model.Language language7 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Fortune fortune8 = simpleFortuneGenerator0.nextFortune(language7);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertNotNull(fortuneList6);
        org.junit.Assert.assertTrue("'" + language7 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language7.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertNotNull(fortune8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick((int) 'a');
        int int3 = surnamesDictionary0.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary4 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray5 = new io.resourcepool.model.Language[] {};
        int int6 = surnamesDictionary4.size(languageArray5);
        io.resourcepool.model.Language language7 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language8 = io.resourcepool.model.Language.random();
        java.lang.String str9 = language8.getLocaleCode();
        io.resourcepool.model.Language[] languageArray10 = new io.resourcepool.model.Language[] { language7, language8 };
        int int11 = surnamesDictionary4.size(languageArray10);
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.random();
        java.lang.String str14 = language13.getLocaleCode();
        java.lang.String str15 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language13);
        io.resourcepool.model.Language language17 = io.resourcepool.model.Language.random();
        java.lang.String str18 = language17.getLocaleCode();
        java.lang.String str19 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language17);
        io.resourcepool.model.Language language20 = io.resourcepool.model.Language.random();
        java.lang.String str21 = language20.getLocaleCode();
        io.resourcepool.model.Language language22 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language23 = io.resourcepool.model.Language.random();
        java.lang.String str24 = language23.getLocaleCode();
        io.resourcepool.model.Language[] languageArray25 = new io.resourcepool.model.Language[] { language13, language17, language20, language22, language23 };
        int int26 = surnamesDictionary4.size(languageArray25);
        int int27 = surnamesDictionary0.size(languageArray25);
        int int28 = surnamesDictionary0.size();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary29 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int30 = givenNamesDictionary29.size();
        io.resourcepool.model.Language language31 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language[] languageArray32 = new io.resourcepool.model.Language[] { language31 };
        int int33 = givenNamesDictionary29.size(languageArray32);
        int int34 = surnamesDictionary0.size(languageArray32);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + language7 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language7.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language8 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language8.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en" + "'", str9, "en");
        org.junit.Assert.assertNotNull(languageArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!76" + "'", str15, "hi!76");
        org.junit.Assert.assertTrue("'" + language17 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language17.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en" + "'", str18, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!37" + "'", str19, "hi!37");
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en" + "'", str21, "en");
        org.junit.Assert.assertTrue("'" + language22 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language22.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language23 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language23.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en" + "'", str24, "en");
        org.junit.Assert.assertNotNull(languageArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 50000 + "'", int26 == 50000);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 50000 + "'", int27 == 50000);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20000 + "'", int28 == 20000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4305 + "'", int30 == 4305);
        org.junit.Assert.assertTrue("'" + language31 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language31.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertNotNull(languageArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2000 + "'", int33 == 2000);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10000 + "'", int34 == 10000);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 0);
        io.resourcepool.model.GivenName givenName7 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.model.GivenName givenName8 = givenName7.clone();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(givenName7);
        org.junit.Assert.assertNotNull(givenName8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes(0);
        org.junit.Assert.assertNotNull(fortuneList2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        io.resourcepool.model.Language language0 = io.resourcepool.model.Language.FRENCH;
        java.util.List<io.resourcepool.model.Fortune> fortuneList1 = io.resourcepool.dictionary.loader.FortuneLoader.load(language0);
        java.util.List<io.resourcepool.model.GivenName> givenNameList2 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language0);
        org.junit.Assert.assertTrue("'" + language0 + "' != '" + io.resourcepool.model.Language.FRENCH + "'", language0.equals(io.resourcepool.model.Language.FRENCH));
        org.junit.Assert.assertNotNull(fortuneList1);
        org.junit.Assert.assertNotNull(givenNameList2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary2 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray3 = new io.resourcepool.model.Language[] {};
        int int4 = surnamesDictionary2.size(languageArray3);
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language6 = io.resourcepool.model.Language.random();
        java.lang.String str7 = language6.getLocaleCode();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] { language5, language6 };
        int int9 = surnamesDictionary2.size(languageArray8);
        io.resourcepool.generator.Query query10 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray8);
        java.util.List<java.lang.String> strList11 = surnamesDictionary0.pick(query10);
        java.lang.String str12 = surnamesDictionary0.pick();
        java.util.List<java.lang.String> strList14 = surnamesDictionary0.pick(10);
        int int15 = surnamesDictionary0.size();
        org.junit.Assert.assertNotNull(languageArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language6 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language6.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Shaull" + "'", str12, "Shaull");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        java.util.List<java.lang.String> strList4 = surnamesDictionary0.pick((int) (byte) -1);
        io.resourcepool.generator.Query.Builder builder5 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary6 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary7 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] {};
        int int9 = surnamesDictionary7.size(languageArray8);
        int int10 = givenNamesDictionary6.size(languageArray8);
        io.resourcepool.generator.Query.Builder builder11 = builder5.languages(languageArray8);
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
        io.resourcepool.generator.Query.Builder builder22 = builder5.languages(languageArray17);
        int int23 = surnamesDictionary0.size(languageArray17);
        int int24 = surnamesDictionary0.size();
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11812 + "'", int13 == 11812);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(languageArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20000 + "'", int24 == 20000);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary3 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray4 = new io.resourcepool.model.Language[] {};
        int int5 = surnamesDictionary3.size(languageArray4);
        int int6 = surnamesDictionary0.size(languageArray4);
        java.lang.String str7 = surnamesDictionary0.pick();
        java.lang.String str8 = surnamesDictionary0.pick();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary9 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray11 = new io.resourcepool.model.Language[] {};
        int int12 = surnamesDictionary10.size(languageArray11);
        int int13 = givenNamesDictionary9.size(languageArray11);
        java.util.List<io.resourcepool.model.GivenName> givenNameList15 = givenNamesDictionary9.pick(1);
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
        io.resourcepool.generator.Query.Builder builder39 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary40 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary41 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray42 = new io.resourcepool.model.Language[] {};
        int int43 = surnamesDictionary41.size(languageArray42);
        int int44 = givenNamesDictionary40.size(languageArray42);
        io.resourcepool.generator.Query.Builder builder45 = builder39.languages(languageArray42);
        int int46 = surnamesDictionary16.size(languageArray42);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary48 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray49 = new io.resourcepool.model.Language[] {};
        int int50 = surnamesDictionary48.size(languageArray49);
        io.resourcepool.model.Language language51 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language52 = io.resourcepool.model.Language.random();
        java.lang.String str53 = language52.getLocaleCode();
        io.resourcepool.model.Language[] languageArray54 = new io.resourcepool.model.Language[] { language51, language52 };
        int int55 = surnamesDictionary48.size(languageArray54);
        io.resourcepool.generator.Query query56 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray54);
        java.util.List<java.lang.String> strList57 = surnamesDictionary16.pick(query56);
        io.resourcepool.model.Language[] languageArray58 = query56.languages;
        java.util.List<io.resourcepool.model.GivenName> givenNameList59 = givenNamesDictionary9.pick(query56);
        java.util.List<java.lang.String> strList60 = surnamesDictionary0.pick(query56);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(languageArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertNotNull(languageArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(givenNameList15);
        org.junit.Assert.assertNotNull(languageArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en" + "'", str21, "en");
        org.junit.Assert.assertNotNull(languageArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertTrue("'" + language25 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language25.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en" + "'", str26, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!93" + "'", str27, "hi!93");
        org.junit.Assert.assertTrue("'" + language29 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language29.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en" + "'", str30, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!31" + "'", str31, "hi!31");
        org.junit.Assert.assertTrue("'" + language32 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language32.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "en" + "'", str33, "en");
        org.junit.Assert.assertTrue("'" + language34 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language34.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language35 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language35.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "en" + "'", str36, "en");
        org.junit.Assert.assertNotNull(languageArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 50000 + "'", int38 == 50000);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(languageArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(languageArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + language51 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language51.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language52 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language52.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "en" + "'", str53, "en");
        org.junit.Assert.assertNotNull(languageArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 20000 + "'", int55 == 20000);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(languageArray58);
        org.junit.Assert.assertNotNull(givenNameList59);
        org.junit.Assert.assertNotNull(strList60);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 0);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator7 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune8 = simpleFortuneGenerator7.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList10 = simpleFortuneGenerator7.nextFortunes(10);
        io.resourcepool.model.Fortune fortune11 = simpleFortuneGenerator7.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList13 = simpleFortuneGenerator7.nextFortunes((int) (byte) -1);
        io.resourcepool.generator.Query.Builder builder14 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray15 = null;
        io.resourcepool.generator.Query.Builder builder16 = builder14.languages(languageArray15);
        io.resourcepool.generator.Query query17 = builder14.build();
        java.util.List<io.resourcepool.model.Fortune> fortuneList18 = simpleFortuneGenerator7.nextFortunes(query17);
        java.util.List<io.resourcepool.model.FullName> fullNameList19 = simpleNameGenerator0.nextNames(query17);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(fortune8);
        org.junit.Assert.assertNotNull(fortuneList10);
        org.junit.Assert.assertNotNull(fortune11);
        org.junit.Assert.assertNotNull(fortuneList13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(query17);
        org.junit.Assert.assertNotNull(fortuneList18);
        org.junit.Assert.assertNotNull(fullNameList19);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.FullName fullName10 = simpleNameGenerator0.nextName();
        io.resourcepool.model.GivenName givenName11 = simpleNameGenerator0.nextGivenName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList13 = simpleNameGenerator0.nextGivenNames(20000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(fullName10);
        org.junit.Assert.assertNotNull(givenName11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.lang.String str3 = simpleNameGenerator0.nextNickname();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator4 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList6 = simpleFortuneGenerator4.nextFortunes((int) (short) -1);
        java.util.List<io.resourcepool.model.Fortune> fortuneList8 = simpleFortuneGenerator4.nextFortunes((int) (short) 100);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator9 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList11 = simpleNameGenerator9.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList13 = simpleNameGenerator9.nextGivenNames(100);
        java.util.List<java.lang.String> strList15 = simpleNameGenerator9.nextSurnames((int) (byte) 1);
        java.lang.String str16 = simpleNameGenerator9.nextSurname();
        java.util.List<java.lang.String> strList18 = simpleNameGenerator9.nextSurnames(1);
        java.util.List<java.lang.String> strList20 = simpleNameGenerator9.nextSurnames(0);
        java.lang.String str21 = simpleNameGenerator9.nextNickname();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary22 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary24 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray25 = new io.resourcepool.model.Language[] {};
        int int26 = surnamesDictionary24.size(languageArray25);
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language28 = io.resourcepool.model.Language.random();
        java.lang.String str29 = language28.getLocaleCode();
        io.resourcepool.model.Language[] languageArray30 = new io.resourcepool.model.Language[] { language27, language28 };
        int int31 = surnamesDictionary24.size(languageArray30);
        io.resourcepool.generator.Query query32 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray30);
        java.util.List<java.lang.String> strList33 = surnamesDictionary22.pick(query32);
        java.util.List<io.resourcepool.model.FullName> fullNameList34 = simpleNameGenerator9.nextNames(query32);
        java.util.List<io.resourcepool.model.Fortune> fortuneList35 = simpleFortuneGenerator4.nextFortunes(query32);
        java.util.List<io.resourcepool.model.FullName> fullNameList36 = simpleNameGenerator0.nextNames(query32);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mamie23" + "'", str3, "Mamie23");
        org.junit.Assert.assertNotNull(fortuneList6);
        org.junit.Assert.assertNotNull(fortuneList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(givenNameList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Shaull" + "'", str16, "Shaull");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Mamie23" + "'", str21, "Mamie23");
        org.junit.Assert.assertNotNull(languageArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en" + "'", str29, "en");
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(fullNameList34);
        org.junit.Assert.assertNotNull(fortuneList35);
        org.junit.Assert.assertNotNull(fullNameList36);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        java.util.List<java.lang.String> strList4 = surnamesDictionary0.pick((int) (byte) -1);
        io.resourcepool.generator.Query.Builder builder5 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary6 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary7 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] {};
        int int9 = surnamesDictionary7.size(languageArray8);
        int int10 = givenNamesDictionary6.size(languageArray8);
        io.resourcepool.generator.Query.Builder builder11 = builder5.languages(languageArray8);
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
        io.resourcepool.generator.Query.Builder builder22 = builder5.languages(languageArray17);
        int int23 = surnamesDictionary0.size(languageArray17);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary24 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray25 = new io.resourcepool.model.Language[] {};
        int int26 = surnamesDictionary24.size(languageArray25);
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language28 = io.resourcepool.model.Language.random();
        java.lang.String str29 = language28.getLocaleCode();
        io.resourcepool.model.Language[] languageArray30 = new io.resourcepool.model.Language[] { language27, language28 };
        int int31 = surnamesDictionary24.size(languageArray30);
        java.util.List<java.lang.String> strList33 = surnamesDictionary24.pick((int) (byte) 10);
        int int34 = surnamesDictionary24.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary35 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList37 = surnamesDictionary35.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary38 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray39 = new io.resourcepool.model.Language[] {};
        int int40 = surnamesDictionary38.size(languageArray39);
        int int41 = surnamesDictionary35.size(languageArray39);
        java.lang.String str42 = surnamesDictionary35.pick();
        java.lang.String str43 = surnamesDictionary35.pick();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary44 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList46 = surnamesDictionary44.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary47 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray48 = new io.resourcepool.model.Language[] {};
        int int49 = surnamesDictionary47.size(languageArray48);
        int int50 = surnamesDictionary44.size(languageArray48);
        java.lang.String str51 = surnamesDictionary44.pick();
        java.lang.String str52 = surnamesDictionary44.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator53 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList55 = simpleFortuneGenerator53.nextFortunes(1);
        io.resourcepool.model.Language language56 = io.resourcepool.model.Language.random();
        java.lang.String str57 = language56.getLocaleCode();
        io.resourcepool.model.Fortune fortune58 = simpleFortuneGenerator53.nextFortune(language56);
        java.lang.String str59 = surnamesDictionary44.pick(language56);
        java.util.List<java.lang.String> strList60 = io.resourcepool.dictionary.loader.NameLoader.loadSurnames(language56);
        java.lang.String str61 = surnamesDictionary35.pick(language56);
        java.lang.String str62 = surnamesDictionary24.pick(language56);
        java.lang.String str63 = surnamesDictionary0.pick(language56);
        java.util.List<io.resourcepool.model.GivenName> givenNameList64 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language56);
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11812 + "'", int13 == 11812);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(languageArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(languageArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en" + "'", str29, "en");
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20000 + "'", int34 == 20000);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(languageArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Shaull" + "'", str42, "Shaull");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Shaull" + "'", str43, "Shaull");
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(languageArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Shaull" + "'", str51, "Shaull");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Shaull" + "'", str52, "Shaull");
        org.junit.Assert.assertNotNull(fortuneList55);
        org.junit.Assert.assertTrue("'" + language56 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language56.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "en" + "'", str57, "en");
        org.junit.Assert.assertNotNull(fortune58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Shaull" + "'", str59, "Shaull");
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Shaull" + "'", str61, "Shaull");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Shaull" + "'", str62, "Shaull");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Shaull" + "'", str63, "Shaull");
        org.junit.Assert.assertNotNull(givenNameList64);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 0);
        io.resourcepool.model.GivenName givenName7 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary8 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary9 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray10 = new io.resourcepool.model.Language[] {};
        int int11 = surnamesDictionary9.size(languageArray10);
        int int12 = givenNamesDictionary8.size(languageArray10);
        java.util.List<io.resourcepool.model.GivenName> givenNameList14 = givenNamesDictionary8.pick((int) ' ');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary15 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray16 = new io.resourcepool.model.Language[] {};
        int int17 = surnamesDictionary15.size(languageArray16);
        int int18 = givenNamesDictionary8.size(languageArray16);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary19 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList21 = surnamesDictionary19.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary22 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray23 = new io.resourcepool.model.Language[] {};
        int int24 = surnamesDictionary22.size(languageArray23);
        int int25 = surnamesDictionary19.size(languageArray23);
        int int26 = givenNamesDictionary8.size(languageArray23);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary27 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary28 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray29 = new io.resourcepool.model.Language[] {};
        int int30 = surnamesDictionary28.size(languageArray29);
        int int31 = givenNamesDictionary27.size(languageArray29);
        java.util.List<io.resourcepool.model.GivenName> givenNameList33 = givenNamesDictionary27.pick((int) ' ');
        java.util.List<io.resourcepool.model.GivenName> givenNameList35 = givenNamesDictionary27.pick((int) (short) 100);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary36 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray37 = new io.resourcepool.model.Language[] {};
        int int38 = surnamesDictionary36.size(languageArray37);
        io.resourcepool.model.Language language39 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language40 = io.resourcepool.model.Language.random();
        java.lang.String str41 = language40.getLocaleCode();
        io.resourcepool.model.Language[] languageArray42 = new io.resourcepool.model.Language[] { language39, language40 };
        int int43 = surnamesDictionary36.size(languageArray42);
        io.resourcepool.model.Language language45 = io.resourcepool.model.Language.random();
        java.lang.String str46 = language45.getLocaleCode();
        java.lang.String str47 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language45);
        io.resourcepool.model.Language language49 = io.resourcepool.model.Language.random();
        java.lang.String str50 = language49.getLocaleCode();
        java.lang.String str51 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language49);
        io.resourcepool.model.Language language52 = io.resourcepool.model.Language.random();
        java.lang.String str53 = language52.getLocaleCode();
        io.resourcepool.model.Language language54 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language55 = io.resourcepool.model.Language.random();
        java.lang.String str56 = language55.getLocaleCode();
        io.resourcepool.model.Language[] languageArray57 = new io.resourcepool.model.Language[] { language45, language49, language52, language54, language55 };
        int int58 = surnamesDictionary36.size(languageArray57);
        io.resourcepool.generator.Query.Builder builder59 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary60 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary61 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray62 = new io.resourcepool.model.Language[] {};
        int int63 = surnamesDictionary61.size(languageArray62);
        int int64 = givenNamesDictionary60.size(languageArray62);
        io.resourcepool.generator.Query.Builder builder65 = builder59.languages(languageArray62);
        int int66 = surnamesDictionary36.size(languageArray62);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary68 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray69 = new io.resourcepool.model.Language[] {};
        int int70 = surnamesDictionary68.size(languageArray69);
        io.resourcepool.model.Language language71 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language72 = io.resourcepool.model.Language.random();
        java.lang.String str73 = language72.getLocaleCode();
        io.resourcepool.model.Language[] languageArray74 = new io.resourcepool.model.Language[] { language71, language72 };
        int int75 = surnamesDictionary68.size(languageArray74);
        io.resourcepool.generator.Query query76 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray74);
        java.util.List<java.lang.String> strList77 = surnamesDictionary36.pick(query76);
        io.resourcepool.model.Language[] languageArray78 = query76.languages;
        java.util.List<io.resourcepool.model.GivenName> givenNameList79 = givenNamesDictionary27.pick(query76);
        java.util.List<io.resourcepool.model.GivenName> givenNameList80 = givenNamesDictionary8.pick(query76);
        java.util.List<io.resourcepool.model.FullName> fullNameList81 = simpleNameGenerator0.nextNames(query76);
        int int82 = query76.count;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(givenName7);
        org.junit.Assert.assertNotNull(languageArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(givenNameList14);
        org.junit.Assert.assertNotNull(languageArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(languageArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(givenNameList33);
        org.junit.Assert.assertNotNull(givenNameList35);
        org.junit.Assert.assertNotNull(languageArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + language39 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language39.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language40 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language40.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "en" + "'", str41, "en");
        org.junit.Assert.assertNotNull(languageArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20000 + "'", int43 == 20000);
        org.junit.Assert.assertTrue("'" + language45 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language45.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "en" + "'", str46, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!45" + "'", str47, "hi!45");
        org.junit.Assert.assertTrue("'" + language49 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language49.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "en" + "'", str50, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Soberhi!" + "'", str51, "Soberhi!");
        org.junit.Assert.assertTrue("'" + language52 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language52.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "en" + "'", str53, "en");
        org.junit.Assert.assertTrue("'" + language54 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language54.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language55 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language55.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "en" + "'", str56, "en");
        org.junit.Assert.assertNotNull(languageArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 50000 + "'", int58 == 50000);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(languageArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(languageArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + language71 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language71.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language72 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language72.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "en" + "'", str73, "en");
        org.junit.Assert.assertNotNull(languageArray74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 20000 + "'", int75 == 20000);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(languageArray78);
        org.junit.Assert.assertNotNull(givenNameList79);
        org.junit.Assert.assertNotNull(givenNameList80);
        org.junit.Assert.assertNotNull(fullNameList81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
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
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes(11812);
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Fortune fortune6 = simpleFortuneGenerator0.nextFortune(language5);
        io.resourcepool.model.Fortune fortune7 = fortune6.clone();
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertNotNull(fortune6);
        org.junit.Assert.assertNotNull(fortune7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
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
        java.util.List<io.resourcepool.model.Fortune> fortuneList12 = fortunesDictionary1.pick(2000);
        java.util.List<io.resourcepool.model.Fortune> fortuneList14 = fortunesDictionary1.pick(11812);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary15 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary16 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray17 = new io.resourcepool.model.Language[] {};
        int int18 = surnamesDictionary16.size(languageArray17);
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language20 = io.resourcepool.model.Language.random();
        java.lang.String str21 = language20.getLocaleCode();
        io.resourcepool.model.Language[] languageArray22 = new io.resourcepool.model.Language[] { language19, language20 };
        int int23 = surnamesDictionary16.size(languageArray22);
        int int24 = fortunesDictionary15.size(languageArray22);
        int int25 = fortunesDictionary1.size(languageArray22);
        io.resourcepool.generator.Query query26 = new io.resourcepool.generator.Query((int) '#', languageArray22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11812 + "'", int2 == 11812);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(fortuneList12);
        org.junit.Assert.assertNotNull(fortuneList14);
        org.junit.Assert.assertNotNull(languageArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en" + "'", str21, "en");
        org.junit.Assert.assertNotNull(languageArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20000 + "'", int24 == 20000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20000 + "'", int25 == 20000);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        java.lang.String str5 = givenName4.nickname;
        java.lang.String str6 = givenName4.toString();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary7 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary8 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray9 = new io.resourcepool.model.Language[] {};
        int int10 = surnamesDictionary8.size(languageArray9);
        int int11 = givenNamesDictionary7.size(languageArray9);
        java.util.List<io.resourcepool.model.GivenName> givenNameList13 = givenNamesDictionary7.pick(10);
        boolean boolean14 = givenName4.equals((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GivenName{givenName='Shaull', nickname='', gender=MALE}" + "'", str6, "GivenName{givenName='Shaull', nickname='', gender=MALE}");
        org.junit.Assert.assertNotNull(languageArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(givenNameList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        io.resourcepool.model.Fortune fortune2 = new io.resourcepool.model.Fortune("hi!62", "hi!7");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        java.lang.String str3 = surnamesDictionary0.pick();
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        java.lang.String str6 = language5.getLocaleCode();
        java.lang.String str7 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language5);
        java.lang.String str8 = surnamesDictionary0.pick(language5);
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Shaull" + "'", str3, "Shaull");
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!8" + "'", str7, "hi!8");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.lang.String str7 = fullName6.surname;
        java.lang.String str8 = fullName6.toString();
        io.resourcepool.model.Gender gender9 = fullName6.gender;
        io.resourcepool.model.Gender gender10 = fullName6.gender;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}" + "'", str8, "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}");
        org.junit.Assert.assertTrue("'" + gender9 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender9.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertTrue("'" + gender10 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender10.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList3 = simpleFortuneGenerator0.nextFortunes(10);
        io.resourcepool.model.Fortune fortune4 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune5 = simpleFortuneGenerator0.nextFortune();
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortuneList3);
        org.junit.Assert.assertNotNull(fortune4);
        org.junit.Assert.assertNotNull(fortune5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.lang.String str7 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.FullName> fullNameList11 = simpleNameGenerator0.nextNames(10000);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(fullNameList11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        io.resourcepool.model.Fortune fortune2 = new io.resourcepool.model.Fortune("hi!9", "hi!93");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
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
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.lang.String str3 = fortune2.text;
        java.lang.String str4 = fortune2.text;
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "If at first you don't succeed, try something else." + "'", str3, "If at first you don't succeed, try something else.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "If at first you don't succeed, try something else." + "'", str4, "If at first you don't succeed, try something else.");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        java.lang.String str11 = givenName10.givenName;
        io.resourcepool.model.FullName fullName13 = givenName10.toFullName("hi!4");
        java.lang.String str14 = fullName13.surname;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mary" + "'", str11, "Mary");
        org.junit.Assert.assertNotNull(fullName13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!4" + "'", str14, "hi!4");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.lang.String str7 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(0);
        java.lang.String str12 = simpleNameGenerator0.nextNickname();
        java.util.List<io.resourcepool.model.FullName> fullNameList14 = simpleNameGenerator0.nextNames(0);
        java.lang.String str15 = simpleNameGenerator0.nextSurname();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary16 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary17 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray18 = new io.resourcepool.model.Language[] {};
        int int19 = surnamesDictionary17.size(languageArray18);
        int int20 = givenNamesDictionary16.size(languageArray18);
        java.util.List<io.resourcepool.model.GivenName> givenNameList22 = givenNamesDictionary16.pick(10);
        java.util.List<io.resourcepool.model.GivenName> givenNameList24 = givenNamesDictionary16.pick(0);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary25 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary26 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray27 = new io.resourcepool.model.Language[] {};
        int int28 = surnamesDictionary26.size(languageArray27);
        int int29 = givenNamesDictionary25.size(languageArray27);
        java.util.List<io.resourcepool.model.GivenName> givenNameList31 = givenNamesDictionary25.pick((int) ' ');
        java.util.List<io.resourcepool.model.GivenName> givenNameList33 = givenNamesDictionary25.pick((int) (short) 100);
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
        io.resourcepool.generator.Query.Builder builder57 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary58 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary59 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray60 = new io.resourcepool.model.Language[] {};
        int int61 = surnamesDictionary59.size(languageArray60);
        int int62 = givenNamesDictionary58.size(languageArray60);
        io.resourcepool.generator.Query.Builder builder63 = builder57.languages(languageArray60);
        int int64 = surnamesDictionary34.size(languageArray60);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary66 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray67 = new io.resourcepool.model.Language[] {};
        int int68 = surnamesDictionary66.size(languageArray67);
        io.resourcepool.model.Language language69 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language70 = io.resourcepool.model.Language.random();
        java.lang.String str71 = language70.getLocaleCode();
        io.resourcepool.model.Language[] languageArray72 = new io.resourcepool.model.Language[] { language69, language70 };
        int int73 = surnamesDictionary66.size(languageArray72);
        io.resourcepool.generator.Query query74 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray72);
        java.util.List<java.lang.String> strList75 = surnamesDictionary34.pick(query74);
        io.resourcepool.model.Language[] languageArray76 = query74.languages;
        java.util.List<io.resourcepool.model.GivenName> givenNameList77 = givenNamesDictionary25.pick(query74);
        java.util.List<io.resourcepool.model.GivenName> givenNameList78 = givenNamesDictionary16.pick(query74);
        java.util.List<io.resourcepool.model.FullName> fullNameList79 = simpleNameGenerator0.nextNames(query74);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mamie23" + "'", str12, "Mamie23");
        org.junit.Assert.assertNotNull(fullNameList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Shaull" + "'", str15, "Shaull");
        org.junit.Assert.assertNotNull(languageArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(givenNameList22);
        org.junit.Assert.assertNotNull(givenNameList24);
        org.junit.Assert.assertNotNull(languageArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(givenNameList31);
        org.junit.Assert.assertNotNull(givenNameList33);
        org.junit.Assert.assertNotNull(languageArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en" + "'", str39, "en");
        org.junit.Assert.assertNotNull(languageArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20000 + "'", int41 == 20000);
        org.junit.Assert.assertTrue("'" + language43 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language43.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "en" + "'", str44, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!29" + "'", str45, "hi!29");
        org.junit.Assert.assertTrue("'" + language47 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language47.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "en" + "'", str48, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!85" + "'", str49, "hi!85");
        org.junit.Assert.assertTrue("'" + language50 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language50.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "en" + "'", str51, "en");
        org.junit.Assert.assertTrue("'" + language52 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language52.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language53 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language53.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "en" + "'", str54, "en");
        org.junit.Assert.assertNotNull(languageArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 50000 + "'", int56 == 50000);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(languageArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(languageArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + language69 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language69.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language70 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language70.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "en" + "'", str71, "en");
        org.junit.Assert.assertNotNull(languageArray72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 20000 + "'", int73 == 20000);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(languageArray76);
        org.junit.Assert.assertNotNull(givenNameList77);
        org.junit.Assert.assertNotNull(givenNameList78);
        org.junit.Assert.assertNotNull(fullNameList79);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
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
        java.lang.String str23 = surnamesDictionary0.pick();
        io.resourcepool.model.Language language24 = io.resourcepool.model.Language.random();
        java.lang.String str25 = language24.getLocaleCode();
        java.util.List<java.lang.String> strList26 = io.resourcepool.dictionary.loader.NameLoader.loadSurnames(language24);
        java.lang.String str27 = surnamesDictionary0.pick(language24);
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!20" + "'", str11, "hi!20");
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cutiehi!" + "'", str15, "Cutiehi!");
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 50000 + "'", int22 == 50000);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Shaull" + "'", str23, "Shaull");
        org.junit.Assert.assertTrue("'" + language24 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language24.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Shaull" + "'", str27, "Shaull");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<io.resourcepool.model.FullName> fullNameList6 = simpleNameGenerator0.nextNames((int) (byte) 1);
        java.util.List<java.lang.String> strList8 = simpleNameGenerator0.nextNicknames((int) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(fullNameList6);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        java.lang.String str6 = language5.getLocaleCode();
        io.resourcepool.model.Language[] languageArray7 = new io.resourcepool.model.Language[] { language4, language5 };
        int int8 = surnamesDictionary1.size(languageArray7);
        int int9 = fortunesDictionary0.size(languageArray7);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary10 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int11 = givenNamesDictionary10.size();
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language[] languageArray13 = new io.resourcepool.model.Language[] { language12 };
        int int14 = givenNamesDictionary10.size(languageArray13);
        int int15 = fortunesDictionary0.size(languageArray13);
        io.resourcepool.model.Fortune fortune16 = fortunesDictionary0.pick();
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(languageArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4305 + "'", int11 == 4305);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertNotNull(languageArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10000 + "'", int15 == 10000);
        org.junit.Assert.assertNotNull(fortune16);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        io.resourcepool.model.GivenName givenName1 = simpleNameGenerator0.nextGivenName();
        java.lang.String str2 = simpleNameGenerator0.nextNickname();
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(2000);
        org.junit.Assert.assertNotNull(givenName1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Mamie23" + "'", str2, "Mamie23");
        org.junit.Assert.assertNotNull(givenNameList4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        java.lang.String str11 = givenName10.givenName;
        io.resourcepool.model.FullName fullName13 = givenName10.toFullName("hi!4");
        io.resourcepool.model.FullName fullName15 = givenName10.toFullName("hi!21");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mary" + "'", str11, "Mary");
        org.junit.Assert.assertNotNull(fullName13);
        org.junit.Assert.assertNotNull(fullName15);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary2 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray3 = new io.resourcepool.model.Language[] {};
        int int4 = surnamesDictionary2.size(languageArray3);
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language6 = io.resourcepool.model.Language.random();
        java.lang.String str7 = language6.getLocaleCode();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] { language5, language6 };
        int int9 = surnamesDictionary2.size(languageArray8);
        io.resourcepool.generator.Query query10 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray8);
        java.util.List<java.lang.String> strList11 = surnamesDictionary0.pick(query10);
        java.lang.String str12 = surnamesDictionary0.pick();
        java.util.List<java.lang.String> strList14 = surnamesDictionary0.pick(10);
        java.lang.String str15 = surnamesDictionary0.pick();
        org.junit.Assert.assertNotNull(languageArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language6 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language6.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Shaull" + "'", str12, "Shaull");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Shaull" + "'", str15, "Shaull");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList8 = simpleNameGenerator0.nextNicknames(4305);
        io.resourcepool.model.GivenName givenName9 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.model.FullName fullName10 = simpleNameGenerator0.nextName();
        boolean boolean12 = fullName10.equals((java.lang.Object) 10.0f);
        java.lang.String str13 = fullName10.givenName;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(givenName9);
        org.junit.Assert.assertNotNull(fullName10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Mary" + "'", str13, "Mary");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
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
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int1 = givenNamesDictionary0.size();
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.random();
        java.lang.String str4 = language3.getLocaleCode();
        java.lang.String str5 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language3);
        java.lang.String str6 = language3.getLocaleCode();
        java.util.List<io.resourcepool.model.Fortune> fortuneList7 = io.resourcepool.dictionary.loader.FortuneLoader.load(language3);
        io.resourcepool.model.GivenName givenName8 = givenNamesDictionary0.pick(language3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4305 + "'", int1 == 4305);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!36" + "'", str5, "hi!36");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(fortuneList7);
        org.junit.Assert.assertNotNull(givenName8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.resourcepool.model.Fortune fortune2 = new io.resourcepool.model.Fortune("hi!5", "hi!6");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        java.lang.String str5 = givenName4.givenName;
        io.resourcepool.model.GivenName givenName6 = givenName4.clone();
        io.resourcepool.model.GivenName givenName7 = givenName6.clone();
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(givenName6);
        org.junit.Assert.assertNotNull(givenName7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes(11812);
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Fortune fortune6 = simpleFortuneGenerator0.nextFortune(language5);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator7 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.lang.String str8 = simpleNameGenerator7.nextSurname();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary9 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray11 = new io.resourcepool.model.Language[] {};
        int int12 = surnamesDictionary10.size(languageArray11);
        int int13 = givenNamesDictionary9.size(languageArray11);
        java.util.List<io.resourcepool.model.GivenName> givenNameList15 = givenNamesDictionary9.pick(10);
        java.util.List<io.resourcepool.model.GivenName> givenNameList17 = givenNamesDictionary9.pick(0);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary18 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary19 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray20 = new io.resourcepool.model.Language[] {};
        int int21 = surnamesDictionary19.size(languageArray20);
        int int22 = givenNamesDictionary18.size(languageArray20);
        java.util.List<io.resourcepool.model.GivenName> givenNameList24 = givenNamesDictionary18.pick((int) ' ');
        java.util.List<io.resourcepool.model.GivenName> givenNameList26 = givenNamesDictionary18.pick((int) (short) 100);
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
        io.resourcepool.generator.Query.Builder builder50 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary51 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary52 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray53 = new io.resourcepool.model.Language[] {};
        int int54 = surnamesDictionary52.size(languageArray53);
        int int55 = givenNamesDictionary51.size(languageArray53);
        io.resourcepool.generator.Query.Builder builder56 = builder50.languages(languageArray53);
        int int57 = surnamesDictionary27.size(languageArray53);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary59 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray60 = new io.resourcepool.model.Language[] {};
        int int61 = surnamesDictionary59.size(languageArray60);
        io.resourcepool.model.Language language62 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language63 = io.resourcepool.model.Language.random();
        java.lang.String str64 = language63.getLocaleCode();
        io.resourcepool.model.Language[] languageArray65 = new io.resourcepool.model.Language[] { language62, language63 };
        int int66 = surnamesDictionary59.size(languageArray65);
        io.resourcepool.generator.Query query67 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray65);
        java.util.List<java.lang.String> strList68 = surnamesDictionary27.pick(query67);
        io.resourcepool.model.Language[] languageArray69 = query67.languages;
        java.util.List<io.resourcepool.model.GivenName> givenNameList70 = givenNamesDictionary18.pick(query67);
        java.util.List<io.resourcepool.model.GivenName> givenNameList71 = givenNamesDictionary9.pick(query67);
        java.util.List<io.resourcepool.model.FullName> fullNameList72 = simpleNameGenerator7.nextNames(query67);
        java.util.List<io.resourcepool.model.Fortune> fortuneList73 = simpleFortuneGenerator0.nextFortunes(query67);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertNotNull(fortune6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertNotNull(languageArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(givenNameList15);
        org.junit.Assert.assertNotNull(givenNameList17);
        org.junit.Assert.assertNotNull(languageArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(givenNameList24);
        org.junit.Assert.assertNotNull(givenNameList26);
        org.junit.Assert.assertNotNull(languageArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + language30 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language30.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language31 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language31.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "en" + "'", str32, "en");
        org.junit.Assert.assertNotNull(languageArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20000 + "'", int34 == 20000);
        org.junit.Assert.assertTrue("'" + language36 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language36.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "en" + "'", str37, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!13" + "'", str38, "hi!13");
        org.junit.Assert.assertTrue("'" + language40 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language40.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "en" + "'", str41, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!18" + "'", str42, "hi!18");
        org.junit.Assert.assertTrue("'" + language43 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language43.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "en" + "'", str44, "en");
        org.junit.Assert.assertTrue("'" + language45 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language45.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language46 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language46.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "en" + "'", str47, "en");
        org.junit.Assert.assertNotNull(languageArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 50000 + "'", int49 == 50000);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(languageArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(languageArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + language62 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language62.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language63 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language63.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "en" + "'", str64, "en");
        org.junit.Assert.assertNotNull(languageArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 20000 + "'", int66 == 20000);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(languageArray69);
        org.junit.Assert.assertNotNull(givenNameList70);
        org.junit.Assert.assertNotNull(givenNameList71);
        org.junit.Assert.assertNotNull(fullNameList72);
        org.junit.Assert.assertNotNull(fortuneList73);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        io.resourcepool.generator.Query.Builder builder0 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary1 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary2 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray3 = new io.resourcepool.model.Language[] {};
        int int4 = surnamesDictionary2.size(languageArray3);
        int int5 = givenNamesDictionary1.size(languageArray3);
        io.resourcepool.generator.Query.Builder builder6 = builder0.languages(languageArray3);
        io.resourcepool.generator.Query.Builder builder8 = builder0.count(4305);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(languageArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        io.resourcepool.model.Gender gender5 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName6 = new io.resourcepool.model.GivenName("Shaull", "", gender5);
        io.resourcepool.model.FullName fullName7 = new io.resourcepool.model.FullName("Ultrahi!", "If at first you don't succeed, try something else.", "hi!21", gender5);
        java.lang.String str8 = fullName7.toString();
        java.lang.String str9 = fullName7.givenName;
        org.junit.Assert.assertTrue("'" + gender5 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender5.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FullName{givenName='Ultrahi!', surname='hi!21', nickname='If at first you don't succeed, try something else.', gender=MALE}" + "'", str8, "FullName{givenName='Ultrahi!', surname='hi!21', nickname='If at first you don't succeed, try something else.', gender=MALE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ultrahi!" + "'", str9, "Ultrahi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        java.lang.String str11 = givenName10.givenName;
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary12 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary13 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray14 = new io.resourcepool.model.Language[] {};
        int int15 = surnamesDictionary13.size(languageArray14);
        int int16 = givenNamesDictionary12.size(languageArray14);
        java.util.List<io.resourcepool.model.GivenName> givenNameList18 = givenNamesDictionary12.pick(10);
        boolean boolean19 = givenName10.equals((java.lang.Object) 10);
        io.resourcepool.model.FullName fullName21 = givenName10.toFullName("Cutiehi!");
        java.lang.String str22 = fullName21.toString();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mary" + "'", str11, "Mary");
        org.junit.Assert.assertNotNull(languageArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(givenNameList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fullName21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "FullName{givenName='Mary', surname='Cutiehi!', nickname='Mamie23', gender=FEMALE}" + "'", str22, "FullName{givenName='Mary', surname='Cutiehi!', nickname='Mamie23', gender=FEMALE}");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        io.resourcepool.model.Fortune fortune2 = new io.resourcepool.model.Fortune("hi!9", "hi!77");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
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
        java.util.List<io.resourcepool.model.Fortune> fortuneList11 = fortunesDictionary0.pick(2000);
        io.resourcepool.model.Fortune fortune12 = fortunesDictionary0.pick();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary13 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray14 = new io.resourcepool.model.Language[] {};
        int int15 = surnamesDictionary13.size(languageArray14);
        java.util.List<java.lang.String> strList17 = surnamesDictionary13.pick((int) (byte) -1);
        io.resourcepool.generator.Query.Builder builder18 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary19 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary20 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] {};
        int int22 = surnamesDictionary20.size(languageArray21);
        int int23 = givenNamesDictionary19.size(languageArray21);
        io.resourcepool.generator.Query.Builder builder24 = builder18.languages(languageArray21);
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
        io.resourcepool.generator.Query.Builder builder35 = builder18.languages(languageArray30);
        int int36 = surnamesDictionary13.size(languageArray30);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary37 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray38 = new io.resourcepool.model.Language[] {};
        int int39 = surnamesDictionary37.size(languageArray38);
        io.resourcepool.model.Language language40 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language41 = io.resourcepool.model.Language.random();
        java.lang.String str42 = language41.getLocaleCode();
        io.resourcepool.model.Language[] languageArray43 = new io.resourcepool.model.Language[] { language40, language41 };
        int int44 = surnamesDictionary37.size(languageArray43);
        java.util.List<java.lang.String> strList46 = surnamesDictionary37.pick((int) (byte) 10);
        int int47 = surnamesDictionary37.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary48 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList50 = surnamesDictionary48.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary51 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray52 = new io.resourcepool.model.Language[] {};
        int int53 = surnamesDictionary51.size(languageArray52);
        int int54 = surnamesDictionary48.size(languageArray52);
        java.lang.String str55 = surnamesDictionary48.pick();
        java.lang.String str56 = surnamesDictionary48.pick();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary57 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList59 = surnamesDictionary57.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary60 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray61 = new io.resourcepool.model.Language[] {};
        int int62 = surnamesDictionary60.size(languageArray61);
        int int63 = surnamesDictionary57.size(languageArray61);
        java.lang.String str64 = surnamesDictionary57.pick();
        java.lang.String str65 = surnamesDictionary57.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator66 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList68 = simpleFortuneGenerator66.nextFortunes(1);
        io.resourcepool.model.Language language69 = io.resourcepool.model.Language.random();
        java.lang.String str70 = language69.getLocaleCode();
        io.resourcepool.model.Fortune fortune71 = simpleFortuneGenerator66.nextFortune(language69);
        java.lang.String str72 = surnamesDictionary57.pick(language69);
        java.util.List<java.lang.String> strList73 = io.resourcepool.dictionary.loader.NameLoader.loadSurnames(language69);
        java.lang.String str74 = surnamesDictionary48.pick(language69);
        java.lang.String str75 = surnamesDictionary37.pick(language69);
        java.lang.String str76 = surnamesDictionary13.pick(language69);
        io.resourcepool.model.Fortune fortune77 = fortunesDictionary0.pick(language69);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fortuneList11);
        org.junit.Assert.assertNotNull(fortune12);
        org.junit.Assert.assertNotNull(languageArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11812 + "'", int26 == 11812);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(languageArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + language40 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language40.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language41 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language41.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "en" + "'", str42, "en");
        org.junit.Assert.assertNotNull(languageArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 20000 + "'", int44 == 20000);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20000 + "'", int47 == 20000);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(languageArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Shaull" + "'", str55, "Shaull");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Shaull" + "'", str56, "Shaull");
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(languageArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Shaull" + "'", str64, "Shaull");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Shaull" + "'", str65, "Shaull");
        org.junit.Assert.assertNotNull(fortuneList68);
        org.junit.Assert.assertTrue("'" + language69 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language69.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "en" + "'", str70, "en");
        org.junit.Assert.assertNotNull(fortune71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Shaull" + "'", str72, "Shaull");
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Shaull" + "'", str74, "Shaull");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Shaull" + "'", str75, "Shaull");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Shaull" + "'", str76, "Shaull");
        org.junit.Assert.assertNotNull(fortune77);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        java.lang.String str5 = givenName4.nickname;
        io.resourcepool.model.Gender gender6 = givenName4.gender;
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + gender6 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender6.equals(io.resourcepool.model.Gender.MALE));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.lang.String str7 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(0);
        io.resourcepool.model.FullName fullName12 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList14 = simpleNameGenerator0.nextSurnames((int) (byte) -1);
        io.resourcepool.generator.Query query15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.FullName> fullNameList16 = simpleNameGenerator0.nextNames(query15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(fullName12);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(1);
        java.lang.String str12 = simpleNameGenerator0.nextSurname();
        java.util.List<io.resourcepool.model.FullName> fullNameList14 = simpleNameGenerator0.nextNames((-1));
        io.resourcepool.model.GivenName givenName15 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.model.GivenName givenName16 = givenName15.clone();
        java.lang.String str17 = givenName15.givenName;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Shaull" + "'", str12, "Shaull");
        org.junit.Assert.assertNotNull(fullNameList14);
        org.junit.Assert.assertNotNull(givenName15);
        org.junit.Assert.assertNotNull(givenName16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Mary" + "'", str17, "Mary");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        io.resourcepool.generator.Query.Builder builder0 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary1 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary2 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray3 = new io.resourcepool.model.Language[] {};
        int int4 = surnamesDictionary2.size(languageArray3);
        int int5 = givenNamesDictionary1.size(languageArray3);
        io.resourcepool.generator.Query.Builder builder6 = builder0.languages(languageArray3);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary7 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int8 = fortunesDictionary7.size();
        io.resourcepool.generator.Query.Builder builder9 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary10 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary11 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray12 = new io.resourcepool.model.Language[] {};
        int int13 = surnamesDictionary11.size(languageArray12);
        int int14 = givenNamesDictionary10.size(languageArray12);
        io.resourcepool.generator.Query.Builder builder15 = builder9.languages(languageArray12);
        int int16 = fortunesDictionary7.size(languageArray12);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary17 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray18 = new io.resourcepool.model.Language[] {};
        int int19 = surnamesDictionary17.size(languageArray18);
        io.resourcepool.model.Language language20 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language21 = io.resourcepool.model.Language.random();
        java.lang.String str22 = language21.getLocaleCode();
        io.resourcepool.model.Language[] languageArray23 = new io.resourcepool.model.Language[] { language20, language21 };
        int int24 = surnamesDictionary17.size(languageArray23);
        io.resourcepool.model.Language language26 = io.resourcepool.model.Language.random();
        java.lang.String str27 = language26.getLocaleCode();
        java.lang.String str28 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language26);
        io.resourcepool.model.Language language30 = io.resourcepool.model.Language.random();
        java.lang.String str31 = language30.getLocaleCode();
        java.lang.String str32 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language30);
        io.resourcepool.model.Language language33 = io.resourcepool.model.Language.random();
        java.lang.String str34 = language33.getLocaleCode();
        io.resourcepool.model.Language language35 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language36 = io.resourcepool.model.Language.random();
        java.lang.String str37 = language36.getLocaleCode();
        io.resourcepool.model.Language[] languageArray38 = new io.resourcepool.model.Language[] { language26, language30, language33, language35, language36 };
        int int39 = surnamesDictionary17.size(languageArray38);
        int int40 = fortunesDictionary7.size(languageArray38);
        io.resourcepool.generator.Query.Builder builder41 = builder0.languages(languageArray38);
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
        io.resourcepool.generator.Query.Builder builder52 = builder41.languages(languageArray47);
        io.resourcepool.generator.Query query53 = builder52.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(languageArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11812 + "'", int8 == 11812);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(languageArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(languageArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language21 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language21.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en" + "'", str22, "en");
        org.junit.Assert.assertNotNull(languageArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20000 + "'", int24 == 20000);
        org.junit.Assert.assertTrue("'" + language26 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language26.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en" + "'", str27, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!28" + "'", str28, "hi!28");
        org.junit.Assert.assertTrue("'" + language30 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language30.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en" + "'", str31, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!84" + "'", str32, "hi!84");
        org.junit.Assert.assertTrue("'" + language33 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language33.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "en" + "'", str34, "en");
        org.junit.Assert.assertTrue("'" + language35 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language35.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language36 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language36.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "en" + "'", str37, "en");
        org.junit.Assert.assertNotNull(languageArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 50000 + "'", int39 == 50000);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 50000 + "'", int40 == 50000);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 11812 + "'", int43 == 11812);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(languageArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(query53);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<io.resourcepool.model.FullName> fullNameList8 = simpleNameGenerator0.nextNames((int) (short) 10);
        java.util.List<java.lang.String> strList10 = simpleNameGenerator0.nextSurnames(11812);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(fullNameList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList3 = simpleFortuneGenerator0.nextFortunes(10);
        io.resourcepool.model.Fortune fortune4 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList6 = simpleFortuneGenerator0.nextFortunes((int) (short) 10);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator7 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList9 = simpleFortuneGenerator7.nextFortunes(1);
        io.resourcepool.model.Language language10 = io.resourcepool.model.Language.random();
        java.lang.String str11 = language10.getLocaleCode();
        io.resourcepool.model.Fortune fortune12 = simpleFortuneGenerator7.nextFortune(language10);
        java.util.List<io.resourcepool.model.Fortune> fortuneList14 = simpleFortuneGenerator7.nextFortunes((int) (short) 0);
        java.util.List<io.resourcepool.model.Fortune> fortuneList16 = simpleFortuneGenerator7.nextFortunes((int) '4');
        io.resourcepool.model.Fortune fortune17 = simpleFortuneGenerator7.nextFortune();
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        java.lang.String str20 = language19.getLocaleCode();
        java.lang.String str21 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language19);
        java.lang.String str22 = language19.getLocaleCode();
        java.util.List<io.resourcepool.model.Fortune> fortuneList23 = io.resourcepool.dictionary.loader.FortuneLoader.load(language19);
        io.resourcepool.model.Fortune fortune24 = simpleFortuneGenerator7.nextFortune(language19);
        io.resourcepool.model.Fortune fortune25 = simpleFortuneGenerator0.nextFortune(language19);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortuneList3);
        org.junit.Assert.assertNotNull(fortune4);
        org.junit.Assert.assertNotNull(fortuneList6);
        org.junit.Assert.assertNotNull(fortuneList9);
        org.junit.Assert.assertTrue("'" + language10 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language10.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
        org.junit.Assert.assertNotNull(fortune12);
        org.junit.Assert.assertNotNull(fortuneList14);
        org.junit.Assert.assertNotNull(fortuneList16);
        org.junit.Assert.assertNotNull(fortune17);
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!61" + "'", str21, "hi!61");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en" + "'", str22, "en");
        org.junit.Assert.assertNotNull(fortuneList23);
        org.junit.Assert.assertNotNull(fortune24);
        org.junit.Assert.assertNotNull(fortune25);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(1);
        java.lang.String str12 = simpleNameGenerator0.nextSurname();
        java.util.List<io.resourcepool.model.FullName> fullNameList14 = simpleNameGenerator0.nextNames((-1));
        io.resourcepool.model.GivenName givenName15 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary16 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList18 = surnamesDictionary16.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary20 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] {};
        int int22 = surnamesDictionary20.size(languageArray21);
        io.resourcepool.model.Language language23 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language24 = io.resourcepool.model.Language.random();
        java.lang.String str25 = language24.getLocaleCode();
        io.resourcepool.model.Language[] languageArray26 = new io.resourcepool.model.Language[] { language23, language24 };
        int int27 = surnamesDictionary20.size(languageArray26);
        io.resourcepool.generator.Query query28 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray26);
        java.util.List<java.lang.String> strList29 = surnamesDictionary16.pick(query28);
        java.util.List<io.resourcepool.model.FullName> fullNameList30 = simpleNameGenerator0.nextNames(query28);
        java.lang.String str31 = simpleNameGenerator0.nextNickname();
        java.lang.String str32 = simpleNameGenerator0.nextNickname();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Shaull" + "'", str12, "Shaull");
        org.junit.Assert.assertNotNull(fullNameList14);
        org.junit.Assert.assertNotNull(givenName15);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + language23 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language23.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language24 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language24.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
        org.junit.Assert.assertNotNull(languageArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20000 + "'", int27 == 20000);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(fullNameList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Mamie23" + "'", str31, "Mamie23");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Mamie23" + "'", str32, "Mamie23");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.FullName fullName6 = givenName4.toFullName("Mamie23");
        java.lang.String str7 = givenName4.nickname;
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator11 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList13 = simpleNameGenerator11.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList15 = simpleNameGenerator11.nextGivenNames(100);
        java.lang.String str16 = simpleNameGenerator11.nextSurname();
        io.resourcepool.model.FullName fullName17 = simpleNameGenerator11.nextName();
        io.resourcepool.model.Gender gender18 = fullName17.gender;
        io.resourcepool.model.FullName fullName19 = new io.resourcepool.model.FullName("", "Soberhi!", "", gender18);
        boolean boolean20 = givenName4.equals((java.lang.Object) "");
        java.lang.String str21 = givenName4.givenName;
        java.lang.String str22 = givenName4.toString();
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(givenNameList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Shaull" + "'", str16, "Shaull");
        org.junit.Assert.assertNotNull(fullName17);
        org.junit.Assert.assertTrue("'" + gender18 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender18.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Shaull" + "'", str21, "Shaull");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "GivenName{givenName='Shaull', nickname='', gender=MALE}" + "'", str22, "GivenName{givenName='Shaull', nickname='', gender=MALE}");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.lang.String str1 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList3 = simpleNameGenerator0.nextSurnames(1);
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
        io.resourcepool.generator.Query query16 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray14);
        java.util.List<java.lang.String> strList17 = surnamesDictionary4.pick(query16);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator18 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList20 = simpleNameGenerator18.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList22 = simpleNameGenerator18.nextGivenNames(100);
        java.util.List<java.lang.String> strList24 = simpleNameGenerator18.nextSurnames((int) (byte) 1);
        java.lang.String str25 = simpleNameGenerator18.nextSurname();
        java.util.List<java.lang.String> strList27 = simpleNameGenerator18.nextSurnames(1);
        java.util.List<java.lang.String> strList29 = simpleNameGenerator18.nextSurnames(0);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary30 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList32 = surnamesDictionary30.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary34 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray35 = new io.resourcepool.model.Language[] {};
        int int36 = surnamesDictionary34.size(languageArray35);
        io.resourcepool.model.Language language37 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.random();
        java.lang.String str39 = language38.getLocaleCode();
        io.resourcepool.model.Language[] languageArray40 = new io.resourcepool.model.Language[] { language37, language38 };
        int int41 = surnamesDictionary34.size(languageArray40);
        io.resourcepool.generator.Query query42 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray40);
        java.util.List<java.lang.String> strList43 = surnamesDictionary30.pick(query42);
        java.util.List<io.resourcepool.model.FullName> fullNameList44 = simpleNameGenerator18.nextNames(query42);
        java.util.List<java.lang.String> strList45 = surnamesDictionary4.pick(query42);
        java.util.List<io.resourcepool.model.FullName> fullNameList46 = simpleNameGenerator0.nextNames(query42);
        io.resourcepool.model.GivenName givenName47 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.model.FullName fullName48 = simpleNameGenerator0.nextName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Shaull" + "'", str1, "Shaull");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(languageArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + language11 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language11.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertNotNull(languageArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(givenNameList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Shaull" + "'", str25, "Shaull");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(languageArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en" + "'", str39, "en");
        org.junit.Assert.assertNotNull(languageArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20000 + "'", int41 == 20000);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(fullNameList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(fullNameList46);
        org.junit.Assert.assertNotNull(givenName47);
        org.junit.Assert.assertNotNull(fullName48);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
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
        java.util.List<io.resourcepool.model.Fortune> fortuneList11 = fortunesDictionary0.pick(2000);
        java.util.List<io.resourcepool.model.Fortune> fortuneList13 = fortunesDictionary0.pick(11812);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary14 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary15 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray16 = new io.resourcepool.model.Language[] {};
        int int17 = surnamesDictionary15.size(languageArray16);
        io.resourcepool.model.Language language18 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language19 = io.resourcepool.model.Language.random();
        java.lang.String str20 = language19.getLocaleCode();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] { language18, language19 };
        int int22 = surnamesDictionary15.size(languageArray21);
        int int23 = fortunesDictionary14.size(languageArray21);
        int int24 = fortunesDictionary0.size(languageArray21);
        int int25 = fortunesDictionary0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fortuneList11);
        org.junit.Assert.assertNotNull(fortuneList13);
        org.junit.Assert.assertNotNull(languageArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en" + "'", str20, "en");
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20000 + "'", int22 == 20000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20000 + "'", int24 == 20000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11812 + "'", int25 == 11812);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        int int4 = surnamesDictionary0.size(languageArray2);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary5 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] {};
        int int7 = surnamesDictionary5.size(languageArray6);
        java.util.List<java.lang.String> strList9 = surnamesDictionary5.pick((int) (byte) -1);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary10 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary11 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray12 = new io.resourcepool.model.Language[] {};
        int int13 = surnamesDictionary11.size(languageArray12);
        int int14 = givenNamesDictionary10.size(languageArray12);
        int int15 = surnamesDictionary5.size(languageArray12);
        int int16 = surnamesDictionary0.size(languageArray12);
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        io.resourcepool.model.Language language0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<io.resourcepool.model.GivenName> givenNameList1 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        io.resourcepool.model.Gender gender4 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName5 = new io.resourcepool.model.GivenName("Shaull", "Shaull", gender4);
        io.resourcepool.model.GivenName givenName6 = new io.resourcepool.model.GivenName("", "hi!", gender4);
        java.lang.String str7 = givenName6.toString();
        org.junit.Assert.assertTrue("'" + gender4 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender4.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GivenName{givenName='', nickname='hi!', gender=MALE}" + "'", str7, "GivenName{givenName='', nickname='hi!', gender=MALE}");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        int int4 = givenNamesDictionary0.size(languageArray2);
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = givenNamesDictionary0.pick((int) ' ');
        java.util.List<io.resourcepool.model.GivenName> givenNameList8 = givenNamesDictionary0.pick((int) (short) 100);
        io.resourcepool.model.Language language9 = io.resourcepool.model.Language.random();
        java.lang.String str10 = language9.getLocaleCode();
        io.resourcepool.model.GivenName givenName11 = givenNamesDictionary0.pick(language9);
        java.lang.String str12 = givenName11.nickname;
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(givenNameList8);
        org.junit.Assert.assertTrue("'" + language9 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language9.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "en" + "'", str10, "en");
        org.junit.Assert.assertNotNull(givenName11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mamie23" + "'", str12, "Mamie23");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
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
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary21 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary22 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray23 = new io.resourcepool.model.Language[] {};
        int int24 = surnamesDictionary22.size(languageArray23);
        int int25 = givenNamesDictionary21.size(languageArray23);
        java.util.List<io.resourcepool.model.GivenName> givenNameList27 = givenNamesDictionary21.pick((int) ' ');
        java.util.List<io.resourcepool.model.GivenName> givenNameList29 = givenNamesDictionary21.pick((int) (short) 100);
        io.resourcepool.model.Language language30 = io.resourcepool.model.Language.random();
        java.lang.String str31 = language30.getLocaleCode();
        io.resourcepool.model.GivenName givenName32 = givenNamesDictionary21.pick(language30);
        java.lang.String str33 = language30.getLocaleCode();
        io.resourcepool.model.Fortune fortune34 = fortunesDictionary0.pick(language30);
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
        org.junit.Assert.assertNotNull(languageArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(givenNameList27);
        org.junit.Assert.assertNotNull(givenNameList29);
        org.junit.Assert.assertTrue("'" + language30 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language30.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "en" + "'", str31, "en");
        org.junit.Assert.assertNotNull(givenName32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "en" + "'", str33, "en");
        org.junit.Assert.assertNotNull(fortune34);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        java.lang.String str6 = language5.getLocaleCode();
        io.resourcepool.model.Language[] languageArray7 = new io.resourcepool.model.Language[] { language4, language5 };
        int int8 = surnamesDictionary1.size(languageArray7);
        int int9 = fortunesDictionary0.size(languageArray7);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary10 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int11 = givenNamesDictionary10.size();
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language[] languageArray13 = new io.resourcepool.model.Language[] { language12 };
        int int14 = givenNamesDictionary10.size(languageArray13);
        int int15 = fortunesDictionary0.size(languageArray13);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator16 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList18 = simpleNameGenerator16.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList20 = simpleNameGenerator16.nextGivenNames(100);
        java.util.List<java.lang.String> strList22 = simpleNameGenerator16.nextSurnames((int) (byte) 1);
        java.lang.String str23 = simpleNameGenerator16.nextSurname();
        java.util.List<java.lang.String> strList25 = simpleNameGenerator16.nextSurnames(1);
        java.util.List<java.lang.String> strList27 = simpleNameGenerator16.nextSurnames(0);
        java.lang.String str28 = simpleNameGenerator16.nextNickname();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary29 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary31 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray32 = new io.resourcepool.model.Language[] {};
        int int33 = surnamesDictionary31.size(languageArray32);
        io.resourcepool.model.Language language34 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language35 = io.resourcepool.model.Language.random();
        java.lang.String str36 = language35.getLocaleCode();
        io.resourcepool.model.Language[] languageArray37 = new io.resourcepool.model.Language[] { language34, language35 };
        int int38 = surnamesDictionary31.size(languageArray37);
        io.resourcepool.generator.Query query39 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray37);
        java.util.List<java.lang.String> strList40 = surnamesDictionary29.pick(query39);
        java.util.List<io.resourcepool.model.FullName> fullNameList41 = simpleNameGenerator16.nextNames(query39);
        java.util.List<io.resourcepool.model.Fortune> fortuneList42 = fortunesDictionary0.pick(query39);
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(languageArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4305 + "'", int11 == 4305);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertNotNull(languageArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10000 + "'", int15 == 10000);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(givenNameList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Shaull" + "'", str23, "Shaull");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Mamie23" + "'", str28, "Mamie23");
        org.junit.Assert.assertNotNull(languageArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + language34 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language34.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language35 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language35.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "en" + "'", str36, "en");
        org.junit.Assert.assertNotNull(languageArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20000 + "'", int38 == 20000);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(fullNameList41);
        org.junit.Assert.assertNotNull(fortuneList42);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        io.resourcepool.model.FullName fullName7 = simpleNameGenerator0.nextName();
        java.lang.String str8 = fullName7.surname;
        io.resourcepool.model.Gender gender9 = fullName7.gender;
        io.resourcepool.model.Gender gender10 = fullName7.gender;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(fullName7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertTrue("'" + gender9 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender9.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertTrue("'" + gender10 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender10.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        int int4 = givenNamesDictionary0.size(languageArray2);
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = givenNamesDictionary0.pick(10);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary7 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary8 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray9 = new io.resourcepool.model.Language[] {};
        int int10 = surnamesDictionary8.size(languageArray9);
        int int11 = givenNamesDictionary7.size(languageArray9);
        java.util.List<io.resourcepool.model.GivenName> givenNameList13 = givenNamesDictionary7.pick((int) ' ');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary14 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray15 = new io.resourcepool.model.Language[] {};
        int int16 = surnamesDictionary14.size(languageArray15);
        int int17 = givenNamesDictionary7.size(languageArray15);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary18 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList20 = surnamesDictionary18.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary21 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray22 = new io.resourcepool.model.Language[] {};
        int int23 = surnamesDictionary21.size(languageArray22);
        int int24 = surnamesDictionary18.size(languageArray22);
        int int25 = givenNamesDictionary7.size(languageArray22);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary26 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary27 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray28 = new io.resourcepool.model.Language[] {};
        int int29 = surnamesDictionary27.size(languageArray28);
        int int30 = givenNamesDictionary26.size(languageArray28);
        java.util.List<io.resourcepool.model.GivenName> givenNameList32 = givenNamesDictionary26.pick((int) ' ');
        java.util.List<io.resourcepool.model.GivenName> givenNameList34 = givenNamesDictionary26.pick((int) (short) 100);
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
        io.resourcepool.generator.Query.Builder builder58 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary59 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary60 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray61 = new io.resourcepool.model.Language[] {};
        int int62 = surnamesDictionary60.size(languageArray61);
        int int63 = givenNamesDictionary59.size(languageArray61);
        io.resourcepool.generator.Query.Builder builder64 = builder58.languages(languageArray61);
        int int65 = surnamesDictionary35.size(languageArray61);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary67 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray68 = new io.resourcepool.model.Language[] {};
        int int69 = surnamesDictionary67.size(languageArray68);
        io.resourcepool.model.Language language70 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language71 = io.resourcepool.model.Language.random();
        java.lang.String str72 = language71.getLocaleCode();
        io.resourcepool.model.Language[] languageArray73 = new io.resourcepool.model.Language[] { language70, language71 };
        int int74 = surnamesDictionary67.size(languageArray73);
        io.resourcepool.generator.Query query75 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray73);
        java.util.List<java.lang.String> strList76 = surnamesDictionary35.pick(query75);
        io.resourcepool.model.Language[] languageArray77 = query75.languages;
        java.util.List<io.resourcepool.model.GivenName> givenNameList78 = givenNamesDictionary26.pick(query75);
        java.util.List<io.resourcepool.model.GivenName> givenNameList79 = givenNamesDictionary7.pick(query75);
        java.util.List<io.resourcepool.model.GivenName> givenNameList80 = givenNamesDictionary0.pick(query75);
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(languageArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(givenNameList13);
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(languageArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(languageArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(givenNameList32);
        org.junit.Assert.assertNotNull(givenNameList34);
        org.junit.Assert.assertNotNull(languageArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language39 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language39.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "en" + "'", str40, "en");
        org.junit.Assert.assertNotNull(languageArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20000 + "'", int42 == 20000);
        org.junit.Assert.assertTrue("'" + language44 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language44.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "en" + "'", str45, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!43" + "'", str46, "hi!43");
        org.junit.Assert.assertTrue("'" + language48 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language48.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "en" + "'", str49, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!53" + "'", str50, "hi!53");
        org.junit.Assert.assertTrue("'" + language51 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language51.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "en" + "'", str52, "en");
        org.junit.Assert.assertTrue("'" + language53 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language53.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language54 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language54.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "en" + "'", str55, "en");
        org.junit.Assert.assertNotNull(languageArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 50000 + "'", int57 == 50000);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(languageArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(languageArray68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + language70 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language70.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language71 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language71.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "en" + "'", str72, "en");
        org.junit.Assert.assertNotNull(languageArray73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 20000 + "'", int74 == 20000);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(languageArray77);
        org.junit.Assert.assertNotNull(givenNameList78);
        org.junit.Assert.assertNotNull(givenNameList79);
        org.junit.Assert.assertNotNull(givenNameList80);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary1 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray2 = new io.resourcepool.model.Language[] {};
        int int3 = surnamesDictionary1.size(languageArray2);
        int int4 = givenNamesDictionary0.size(languageArray2);
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = givenNamesDictionary0.pick((int) ' ');
        java.util.List<io.resourcepool.model.GivenName> givenNameList8 = givenNamesDictionary0.pick((int) (short) 100);
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
        io.resourcepool.generator.Query.Builder builder32 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary33 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary34 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray35 = new io.resourcepool.model.Language[] {};
        int int36 = surnamesDictionary34.size(languageArray35);
        int int37 = givenNamesDictionary33.size(languageArray35);
        io.resourcepool.generator.Query.Builder builder38 = builder32.languages(languageArray35);
        int int39 = surnamesDictionary9.size(languageArray35);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary41 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray42 = new io.resourcepool.model.Language[] {};
        int int43 = surnamesDictionary41.size(languageArray42);
        io.resourcepool.model.Language language44 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language45 = io.resourcepool.model.Language.random();
        java.lang.String str46 = language45.getLocaleCode();
        io.resourcepool.model.Language[] languageArray47 = new io.resourcepool.model.Language[] { language44, language45 };
        int int48 = surnamesDictionary41.size(languageArray47);
        io.resourcepool.generator.Query query49 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray47);
        java.util.List<java.lang.String> strList50 = surnamesDictionary9.pick(query49);
        io.resourcepool.model.Language[] languageArray51 = query49.languages;
        java.util.List<io.resourcepool.model.GivenName> givenNameList52 = givenNamesDictionary0.pick(query49);
        int int53 = query49.count;
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(givenNameList8);
        org.junit.Assert.assertNotNull(languageArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertTrue("'" + language18 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language18.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en" + "'", str19, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!99" + "'", str20, "hi!99");
        org.junit.Assert.assertTrue("'" + language22 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language22.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en" + "'", str23, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!21" + "'", str24, "hi!21");
        org.junit.Assert.assertTrue("'" + language25 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language25.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en" + "'", str26, "en");
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en" + "'", str29, "en");
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 50000 + "'", int31 == 50000);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(languageArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(languageArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + language44 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language44.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language45 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language45.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "en" + "'", str46, "en");
        org.junit.Assert.assertNotNull(languageArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 20000 + "'", int48 == 20000);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(languageArray51);
        org.junit.Assert.assertNotNull(givenNameList52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        io.resourcepool.generator.Query.Builder builder0 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray1 = null;
        io.resourcepool.generator.Query.Builder builder2 = builder0.languages(languageArray1);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary3 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary4 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray5 = new io.resourcepool.model.Language[] {};
        int int6 = surnamesDictionary4.size(languageArray5);
        int int7 = givenNamesDictionary3.size(languageArray5);
        java.util.List<io.resourcepool.model.GivenName> givenNameList9 = givenNamesDictionary3.pick((int) ' ');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray11 = new io.resourcepool.model.Language[] {};
        int int12 = surnamesDictionary10.size(languageArray11);
        int int13 = givenNamesDictionary3.size(languageArray11);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary14 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList16 = surnamesDictionary14.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary17 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray18 = new io.resourcepool.model.Language[] {};
        int int19 = surnamesDictionary17.size(languageArray18);
        int int20 = surnamesDictionary14.size(languageArray18);
        int int21 = givenNamesDictionary3.size(languageArray18);
        io.resourcepool.generator.Query.Builder builder22 = builder2.languages(languageArray18);
        io.resourcepool.generator.Query.Builder builder24 = builder2.count((int) (byte) 1);
        io.resourcepool.generator.Query query25 = builder24.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(givenNameList9);
        org.junit.Assert.assertNotNull(languageArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(languageArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(query25);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<io.resourcepool.model.FullName> fullNameList8 = simpleNameGenerator0.nextNames((int) (short) 10);
        io.resourcepool.model.FullName fullName9 = simpleNameGenerator0.nextName();
        java.util.List<io.resourcepool.model.FullName> fullNameList11 = simpleNameGenerator0.nextNames(0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(fullNameList8);
        org.junit.Assert.assertNotNull(fullName9);
        org.junit.Assert.assertNotNull(fullNameList11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        boolean boolean8 = fullName6.equals((java.lang.Object) "hi!93");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
        java.lang.String str7 = fullName6.surname;
        java.lang.String str8 = fullName6.toString();
        java.lang.String str9 = fullName6.toString();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}" + "'", str8, "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}" + "'", str9, "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
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
        java.lang.String str11 = givenName10.givenName;
        io.resourcepool.model.FullName fullName13 = givenName10.toFullName("hi!4");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator14 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList16 = simpleFortuneGenerator14.nextFortunes((int) (short) -1);
        java.util.List<io.resourcepool.model.Fortune> fortuneList18 = simpleFortuneGenerator14.nextFortunes((int) (short) 100);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator19 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList21 = simpleNameGenerator19.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList23 = simpleNameGenerator19.nextGivenNames(100);
        java.util.List<java.lang.String> strList25 = simpleNameGenerator19.nextSurnames((int) (byte) 1);
        java.lang.String str26 = simpleNameGenerator19.nextSurname();
        java.util.List<java.lang.String> strList28 = simpleNameGenerator19.nextSurnames(1);
        java.util.List<java.lang.String> strList30 = simpleNameGenerator19.nextSurnames(0);
        java.lang.String str31 = simpleNameGenerator19.nextNickname();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary32 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary34 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray35 = new io.resourcepool.model.Language[] {};
        int int36 = surnamesDictionary34.size(languageArray35);
        io.resourcepool.model.Language language37 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.random();
        java.lang.String str39 = language38.getLocaleCode();
        io.resourcepool.model.Language[] languageArray40 = new io.resourcepool.model.Language[] { language37, language38 };
        int int41 = surnamesDictionary34.size(languageArray40);
        io.resourcepool.generator.Query query42 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray40);
        java.util.List<java.lang.String> strList43 = surnamesDictionary32.pick(query42);
        java.util.List<io.resourcepool.model.FullName> fullNameList44 = simpleNameGenerator19.nextNames(query42);
        java.util.List<io.resourcepool.model.Fortune> fortuneList45 = simpleFortuneGenerator14.nextFortunes(query42);
        boolean boolean46 = fullName13.equals((java.lang.Object) simpleFortuneGenerator14);
        java.util.List<io.resourcepool.model.Fortune> fortuneList48 = simpleFortuneGenerator14.nextFortunes((int) (byte) 10);
        io.resourcepool.model.Fortune fortune49 = simpleFortuneGenerator14.nextFortune();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mary" + "'", str11, "Mary");
        org.junit.Assert.assertNotNull(fullName13);
        org.junit.Assert.assertNotNull(fortuneList16);
        org.junit.Assert.assertNotNull(fortuneList18);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(givenNameList23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Shaull" + "'", str26, "Shaull");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Mamie23" + "'", str31, "Mamie23");
        org.junit.Assert.assertNotNull(languageArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en" + "'", str39, "en");
        org.junit.Assert.assertNotNull(languageArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20000 + "'", int41 == 20000);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(fullNameList44);
        org.junit.Assert.assertNotNull(fortuneList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(fortuneList48);
        org.junit.Assert.assertNotNull(fortune49);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList3 = simpleFortuneGenerator0.nextFortunes(10);
        io.resourcepool.model.Fortune fortune4 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList6 = simpleFortuneGenerator0.nextFortunes((int) (byte) -1);
        io.resourcepool.model.Language language7 = io.resourcepool.model.Language.random();
        java.lang.String str8 = language7.getLocaleCode();
        java.util.List<io.resourcepool.model.GivenName> givenNameList9 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language7);
        io.resourcepool.model.Fortune fortune10 = simpleFortuneGenerator0.nextFortune(language7);
        java.lang.String str11 = fortune10.text;
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortuneList3);
        org.junit.Assert.assertNotNull(fortune4);
        org.junit.Assert.assertNotNull(fortuneList6);
        org.junit.Assert.assertTrue("'" + language7 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language7.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
        org.junit.Assert.assertNotNull(givenNameList9);
        org.junit.Assert.assertNotNull(fortune10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "If at first you don't succeed, try something else." + "'", str11, "If at first you don't succeed, try something else.");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList13 = simpleNameGenerator0.nextSurnames((int) 'a');
        java.util.List<io.resourcepool.model.GivenName> givenNameList15 = simpleNameGenerator0.nextGivenNames((int) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(givenNameList15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes(11812);
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Fortune fortune6 = simpleFortuneGenerator0.nextFortune(language5);
        java.util.List<io.resourcepool.model.Fortune> fortuneList8 = simpleFortuneGenerator0.nextFortunes((int) '4');
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertNotNull(fortune6);
        org.junit.Assert.assertNotNull(fortuneList8);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        io.resourcepool.model.Language language1 = io.resourcepool.model.Language.FRENCH;
        java.util.List<io.resourcepool.model.Fortune> fortuneList2 = io.resourcepool.dictionary.loader.FortuneLoader.load(language1);
        java.lang.String str3 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!37", language1);
        org.junit.Assert.assertTrue("'" + language1 + "' != '" + io.resourcepool.model.Language.FRENCH + "'", language1.equals(io.resourcepool.model.Language.FRENCH));
        org.junit.Assert.assertNotNull(fortuneList2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!3715" + "'", str3, "hi!3715");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.lang.String str1 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList3 = simpleNameGenerator0.nextSurnames(1);
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
        io.resourcepool.generator.Query query16 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray14);
        java.util.List<java.lang.String> strList17 = surnamesDictionary4.pick(query16);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator18 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList20 = simpleNameGenerator18.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList22 = simpleNameGenerator18.nextGivenNames(100);
        java.util.List<java.lang.String> strList24 = simpleNameGenerator18.nextSurnames((int) (byte) 1);
        java.lang.String str25 = simpleNameGenerator18.nextSurname();
        java.util.List<java.lang.String> strList27 = simpleNameGenerator18.nextSurnames(1);
        java.util.List<java.lang.String> strList29 = simpleNameGenerator18.nextSurnames(0);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary30 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList32 = surnamesDictionary30.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary34 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray35 = new io.resourcepool.model.Language[] {};
        int int36 = surnamesDictionary34.size(languageArray35);
        io.resourcepool.model.Language language37 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.random();
        java.lang.String str39 = language38.getLocaleCode();
        io.resourcepool.model.Language[] languageArray40 = new io.resourcepool.model.Language[] { language37, language38 };
        int int41 = surnamesDictionary34.size(languageArray40);
        io.resourcepool.generator.Query query42 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray40);
        java.util.List<java.lang.String> strList43 = surnamesDictionary30.pick(query42);
        java.util.List<io.resourcepool.model.FullName> fullNameList44 = simpleNameGenerator18.nextNames(query42);
        java.util.List<java.lang.String> strList45 = surnamesDictionary4.pick(query42);
        java.util.List<io.resourcepool.model.FullName> fullNameList46 = simpleNameGenerator0.nextNames(query42);
        io.resourcepool.model.GivenName givenName47 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.model.GivenName givenName48 = givenName47.clone();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Shaull" + "'", str1, "Shaull");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(languageArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + language11 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language11.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertNotNull(languageArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(givenNameList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Shaull" + "'", str25, "Shaull");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(languageArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en" + "'", str39, "en");
        org.junit.Assert.assertNotNull(languageArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20000 + "'", int41 == 20000);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(fullNameList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(fullNameList46);
        org.junit.Assert.assertNotNull(givenName47);
        org.junit.Assert.assertNotNull(givenName48);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int1 = givenNamesDictionary0.size();
        io.resourcepool.model.GivenName givenName2 = givenNamesDictionary0.pick();
        io.resourcepool.generator.Query.Builder builder3 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray4 = null;
        io.resourcepool.generator.Query.Builder builder5 = builder3.languages(languageArray4);
        io.resourcepool.generator.Query query6 = builder3.build();
        java.util.List<io.resourcepool.model.GivenName> givenNameList7 = givenNamesDictionary0.pick(query6);
        io.resourcepool.model.GivenName givenName8 = givenNamesDictionary0.pick();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4305 + "'", int1 == 4305);
        org.junit.Assert.assertNotNull(givenName2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(query6);
        org.junit.Assert.assertNotNull(givenNameList7);
        org.junit.Assert.assertNotNull(givenName8);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        java.util.List<java.lang.String> strList4 = surnamesDictionary0.pick((int) (byte) -1);
        io.resourcepool.generator.Query.Builder builder5 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary6 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary7 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] {};
        int int9 = surnamesDictionary7.size(languageArray8);
        int int10 = givenNamesDictionary6.size(languageArray8);
        io.resourcepool.generator.Query.Builder builder11 = builder5.languages(languageArray8);
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
        io.resourcepool.generator.Query.Builder builder22 = builder5.languages(languageArray17);
        int int23 = surnamesDictionary0.size(languageArray17);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary24 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray25 = new io.resourcepool.model.Language[] {};
        int int26 = surnamesDictionary24.size(languageArray25);
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language28 = io.resourcepool.model.Language.random();
        java.lang.String str29 = language28.getLocaleCode();
        io.resourcepool.model.Language[] languageArray30 = new io.resourcepool.model.Language[] { language27, language28 };
        int int31 = surnamesDictionary24.size(languageArray30);
        java.util.List<java.lang.String> strList33 = surnamesDictionary24.pick((int) (byte) 10);
        int int34 = surnamesDictionary24.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary35 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList37 = surnamesDictionary35.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary38 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray39 = new io.resourcepool.model.Language[] {};
        int int40 = surnamesDictionary38.size(languageArray39);
        int int41 = surnamesDictionary35.size(languageArray39);
        java.lang.String str42 = surnamesDictionary35.pick();
        java.lang.String str43 = surnamesDictionary35.pick();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary44 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList46 = surnamesDictionary44.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary47 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray48 = new io.resourcepool.model.Language[] {};
        int int49 = surnamesDictionary47.size(languageArray48);
        int int50 = surnamesDictionary44.size(languageArray48);
        java.lang.String str51 = surnamesDictionary44.pick();
        java.lang.String str52 = surnamesDictionary44.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator53 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList55 = simpleFortuneGenerator53.nextFortunes(1);
        io.resourcepool.model.Language language56 = io.resourcepool.model.Language.random();
        java.lang.String str57 = language56.getLocaleCode();
        io.resourcepool.model.Fortune fortune58 = simpleFortuneGenerator53.nextFortune(language56);
        java.lang.String str59 = surnamesDictionary44.pick(language56);
        java.util.List<java.lang.String> strList60 = io.resourcepool.dictionary.loader.NameLoader.loadSurnames(language56);
        java.lang.String str61 = surnamesDictionary35.pick(language56);
        java.lang.String str62 = surnamesDictionary24.pick(language56);
        java.lang.String str63 = surnamesDictionary0.pick(language56);
        int int64 = surnamesDictionary0.size();
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11812 + "'", int13 == 11812);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(languageArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(languageArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en" + "'", str29, "en");
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20000 + "'", int34 == 20000);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(languageArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Shaull" + "'", str42, "Shaull");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Shaull" + "'", str43, "Shaull");
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(languageArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Shaull" + "'", str51, "Shaull");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Shaull" + "'", str52, "Shaull");
        org.junit.Assert.assertNotNull(fortuneList55);
        org.junit.Assert.assertTrue("'" + language56 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language56.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "en" + "'", str57, "en");
        org.junit.Assert.assertNotNull(fortune58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Shaull" + "'", str59, "Shaull");
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Shaull" + "'", str61, "Shaull");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Shaull" + "'", str62, "Shaull");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Shaull" + "'", str63, "Shaull");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 20000 + "'", int64 == 20000);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.FullName fullName10 = simpleNameGenerator0.nextName();
        io.resourcepool.model.GivenName givenName11 = simpleNameGenerator0.nextGivenName();
        java.util.List<io.resourcepool.model.GivenName> givenNameList13 = simpleNameGenerator0.nextGivenNames((int) ' ');
        java.lang.String str14 = simpleNameGenerator0.nextNickname();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(fullName10);
        org.junit.Assert.assertNotNull(givenName11);
        org.junit.Assert.assertNotNull(givenNameList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Mamie23" + "'", str14, "Mamie23");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.lang.String str7 = simpleNameGenerator0.nextNickname();
        java.lang.String str8 = simpleNameGenerator0.nextSurname();
        java.util.List<io.resourcepool.model.FullName> fullNameList10 = simpleNameGenerator0.nextNames((int) (byte) 100);
        io.resourcepool.model.FullName fullName11 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList13 = simpleNameGenerator0.nextSurnames(1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mamie23" + "'", str7, "Mamie23");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertNotNull(fullNameList10);
        org.junit.Assert.assertNotNull(fullName11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        java.lang.String str11 = givenName10.givenName;
        io.resourcepool.model.FullName fullName13 = givenName10.toFullName("hi!4");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator14 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList16 = simpleFortuneGenerator14.nextFortunes((int) (short) -1);
        java.util.List<io.resourcepool.model.Fortune> fortuneList18 = simpleFortuneGenerator14.nextFortunes((int) (short) 100);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator19 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList21 = simpleNameGenerator19.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList23 = simpleNameGenerator19.nextGivenNames(100);
        java.util.List<java.lang.String> strList25 = simpleNameGenerator19.nextSurnames((int) (byte) 1);
        java.lang.String str26 = simpleNameGenerator19.nextSurname();
        java.util.List<java.lang.String> strList28 = simpleNameGenerator19.nextSurnames(1);
        java.util.List<java.lang.String> strList30 = simpleNameGenerator19.nextSurnames(0);
        java.lang.String str31 = simpleNameGenerator19.nextNickname();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary32 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary34 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray35 = new io.resourcepool.model.Language[] {};
        int int36 = surnamesDictionary34.size(languageArray35);
        io.resourcepool.model.Language language37 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.random();
        java.lang.String str39 = language38.getLocaleCode();
        io.resourcepool.model.Language[] languageArray40 = new io.resourcepool.model.Language[] { language37, language38 };
        int int41 = surnamesDictionary34.size(languageArray40);
        io.resourcepool.generator.Query query42 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray40);
        java.util.List<java.lang.String> strList43 = surnamesDictionary32.pick(query42);
        java.util.List<io.resourcepool.model.FullName> fullNameList44 = simpleNameGenerator19.nextNames(query42);
        java.util.List<io.resourcepool.model.Fortune> fortuneList45 = simpleFortuneGenerator14.nextFortunes(query42);
        boolean boolean46 = fullName13.equals((java.lang.Object) simpleFortuneGenerator14);
        java.util.List<io.resourcepool.model.Fortune> fortuneList48 = simpleFortuneGenerator14.nextFortunes((int) (byte) 10);
        io.resourcepool.model.Fortune fortune49 = simpleFortuneGenerator14.nextFortune();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mary" + "'", str11, "Mary");
        org.junit.Assert.assertNotNull(fullName13);
        org.junit.Assert.assertNotNull(fortuneList16);
        org.junit.Assert.assertNotNull(fortuneList18);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(givenNameList23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Shaull" + "'", str26, "Shaull");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Mamie23" + "'", str31, "Mamie23");
        org.junit.Assert.assertNotNull(languageArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en" + "'", str39, "en");
        org.junit.Assert.assertNotNull(languageArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20000 + "'", int41 == 20000);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(fullNameList44);
        org.junit.Assert.assertNotNull(fortuneList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(fortuneList48);
        org.junit.Assert.assertNotNull(fortune49);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList8 = simpleNameGenerator0.nextNicknames(4305);
        java.lang.String str9 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(2000);
        io.resourcepool.model.GivenName givenName12 = simpleNameGenerator0.nextGivenName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Shaull" + "'", str9, "Shaull");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(givenName12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes(11812);
        java.util.List<io.resourcepool.model.Fortune> fortuneList6 = simpleFortuneGenerator0.nextFortunes(10000);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertNotNull(fortuneList6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList3 = simpleFortuneGenerator0.nextFortunes(10);
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        java.util.List<io.resourcepool.model.GivenName> givenNameList6 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language4);
        io.resourcepool.model.Fortune fortune7 = simpleFortuneGenerator0.nextFortune(language4);
        java.util.List<java.lang.String> strList8 = io.resourcepool.dictionary.loader.NameLoader.loadSurnames(language4);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortuneList3);
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(fortune7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary2 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray3 = new io.resourcepool.model.Language[] {};
        int int4 = surnamesDictionary2.size(languageArray3);
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language6 = io.resourcepool.model.Language.random();
        java.lang.String str7 = language6.getLocaleCode();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] { language5, language6 };
        int int9 = surnamesDictionary2.size(languageArray8);
        io.resourcepool.generator.Query query10 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray8);
        java.util.List<java.lang.String> strList11 = surnamesDictionary0.pick(query10);
        java.lang.String str12 = surnamesDictionary0.pick();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary13 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray14 = new io.resourcepool.model.Language[] {};
        int int15 = surnamesDictionary13.size(languageArray14);
        io.resourcepool.model.Language language16 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language17 = io.resourcepool.model.Language.random();
        java.lang.String str18 = language17.getLocaleCode();
        io.resourcepool.model.Language[] languageArray19 = new io.resourcepool.model.Language[] { language16, language17 };
        int int20 = surnamesDictionary13.size(languageArray19);
        io.resourcepool.model.Language language22 = io.resourcepool.model.Language.random();
        java.lang.String str23 = language22.getLocaleCode();
        java.lang.String str24 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language22);
        io.resourcepool.model.Language language26 = io.resourcepool.model.Language.random();
        java.lang.String str27 = language26.getLocaleCode();
        java.lang.String str28 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language26);
        io.resourcepool.model.Language language29 = io.resourcepool.model.Language.random();
        java.lang.String str30 = language29.getLocaleCode();
        io.resourcepool.model.Language language31 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language32 = io.resourcepool.model.Language.random();
        java.lang.String str33 = language32.getLocaleCode();
        io.resourcepool.model.Language[] languageArray34 = new io.resourcepool.model.Language[] { language22, language26, language29, language31, language32 };
        int int35 = surnamesDictionary13.size(languageArray34);
        io.resourcepool.generator.Query.Builder builder36 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary37 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary38 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray39 = new io.resourcepool.model.Language[] {};
        int int40 = surnamesDictionary38.size(languageArray39);
        int int41 = givenNamesDictionary37.size(languageArray39);
        io.resourcepool.generator.Query.Builder builder42 = builder36.languages(languageArray39);
        int int43 = surnamesDictionary13.size(languageArray39);
        int int44 = surnamesDictionary0.size(languageArray39);
        org.junit.Assert.assertNotNull(languageArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language6 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language6.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Shaull" + "'", str12, "Shaull");
        org.junit.Assert.assertNotNull(languageArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language17 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language17.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en" + "'", str18, "en");
        org.junit.Assert.assertNotNull(languageArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20000 + "'", int20 == 20000);
        org.junit.Assert.assertTrue("'" + language22 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language22.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en" + "'", str23, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Stupidhi!" + "'", str24, "Stupidhi!");
        org.junit.Assert.assertTrue("'" + language26 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language26.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en" + "'", str27, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!88" + "'", str28, "hi!88");
        org.junit.Assert.assertTrue("'" + language29 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language29.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en" + "'", str30, "en");
        org.junit.Assert.assertTrue("'" + language31 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language31.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language32 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language32.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "en" + "'", str33, "en");
        org.junit.Assert.assertNotNull(languageArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 50000 + "'", int35 == 50000);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(languageArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList13 = simpleNameGenerator0.nextSurnames((int) 'a');
        io.resourcepool.model.GivenName givenName14 = simpleNameGenerator0.nextGivenName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(givenName14);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList3 = simpleFortuneGenerator0.nextFortunes(10);
        io.resourcepool.model.Fortune fortune4 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList6 = simpleFortuneGenerator0.nextFortunes((int) (byte) -1);
        io.resourcepool.model.Language language7 = io.resourcepool.model.Language.random();
        java.lang.String str8 = language7.getLocaleCode();
        java.util.List<io.resourcepool.model.GivenName> givenNameList9 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language7);
        io.resourcepool.model.Fortune fortune10 = simpleFortuneGenerator0.nextFortune(language7);
        io.resourcepool.model.Fortune fortune11 = simpleFortuneGenerator0.nextFortune();
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortuneList3);
        org.junit.Assert.assertNotNull(fortune4);
        org.junit.Assert.assertNotNull(fortuneList6);
        org.junit.Assert.assertTrue("'" + language7 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language7.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
        org.junit.Assert.assertNotNull(givenNameList9);
        org.junit.Assert.assertNotNull(fortune10);
        org.junit.Assert.assertNotNull(fortune11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes((int) (short) -1);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary3 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.generator.Query.Builder builder4 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary5 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary6 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray7 = new io.resourcepool.model.Language[] {};
        int int8 = surnamesDictionary6.size(languageArray7);
        int int9 = givenNamesDictionary5.size(languageArray7);
        io.resourcepool.generator.Query.Builder builder10 = builder4.languages(languageArray7);
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
        io.resourcepool.generator.Query.Builder builder21 = builder4.languages(languageArray16);
        int int22 = givenNamesDictionary3.size(languageArray16);
        int int23 = givenNamesDictionary3.size();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary24 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary25 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray26 = new io.resourcepool.model.Language[] {};
        int int27 = surnamesDictionary25.size(languageArray26);
        int int28 = givenNamesDictionary24.size(languageArray26);
        java.util.List<io.resourcepool.model.GivenName> givenNameList30 = givenNamesDictionary24.pick((int) ' ');
        java.util.List<io.resourcepool.model.GivenName> givenNameList32 = givenNamesDictionary24.pick((int) (short) 100);
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
        io.resourcepool.generator.Query.Builder builder56 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary57 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary58 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray59 = new io.resourcepool.model.Language[] {};
        int int60 = surnamesDictionary58.size(languageArray59);
        int int61 = givenNamesDictionary57.size(languageArray59);
        io.resourcepool.generator.Query.Builder builder62 = builder56.languages(languageArray59);
        int int63 = surnamesDictionary33.size(languageArray59);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary65 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray66 = new io.resourcepool.model.Language[] {};
        int int67 = surnamesDictionary65.size(languageArray66);
        io.resourcepool.model.Language language68 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language69 = io.resourcepool.model.Language.random();
        java.lang.String str70 = language69.getLocaleCode();
        io.resourcepool.model.Language[] languageArray71 = new io.resourcepool.model.Language[] { language68, language69 };
        int int72 = surnamesDictionary65.size(languageArray71);
        io.resourcepool.generator.Query query73 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray71);
        java.util.List<java.lang.String> strList74 = surnamesDictionary33.pick(query73);
        io.resourcepool.model.Language[] languageArray75 = query73.languages;
        java.util.List<io.resourcepool.model.GivenName> givenNameList76 = givenNamesDictionary24.pick(query73);
        java.util.List<io.resourcepool.model.GivenName> givenNameList77 = givenNamesDictionary3.pick(query73);
        java.util.List<io.resourcepool.model.Fortune> fortuneList78 = simpleFortuneGenerator0.nextFortunes(query73);
        org.junit.Assert.assertNotNull(fortuneList2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(languageArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11812 + "'", int12 == 11812);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(languageArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4305 + "'", int23 == 4305);
        org.junit.Assert.assertNotNull(languageArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(givenNameList30);
        org.junit.Assert.assertNotNull(givenNameList32);
        org.junit.Assert.assertNotNull(languageArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + language36 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language36.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en" + "'", str38, "en");
        org.junit.Assert.assertNotNull(languageArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20000 + "'", int40 == 20000);
        org.junit.Assert.assertTrue("'" + language42 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language42.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "en" + "'", str43, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!5" + "'", str44, "hi!5");
        org.junit.Assert.assertTrue("'" + language46 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language46.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "en" + "'", str47, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Lighthi!" + "'", str48, "Lighthi!");
        org.junit.Assert.assertTrue("'" + language49 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language49.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "en" + "'", str50, "en");
        org.junit.Assert.assertTrue("'" + language51 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language51.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language52 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language52.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "en" + "'", str53, "en");
        org.junit.Assert.assertNotNull(languageArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 50000 + "'", int55 == 50000);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(languageArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(languageArray66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + language68 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language68.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language69 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language69.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "en" + "'", str70, "en");
        org.junit.Assert.assertNotNull(languageArray71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 20000 + "'", int72 == 20000);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(languageArray75);
        org.junit.Assert.assertNotNull(givenNameList76);
        org.junit.Assert.assertNotNull(givenNameList77);
        org.junit.Assert.assertNotNull(fortuneList78);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
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
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary20 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] {};
        int int22 = surnamesDictionary20.size(languageArray21);
        io.resourcepool.model.Language language23 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language24 = io.resourcepool.model.Language.random();
        java.lang.String str25 = language24.getLocaleCode();
        io.resourcepool.model.Language[] languageArray26 = new io.resourcepool.model.Language[] { language23, language24 };
        int int27 = surnamesDictionary20.size(languageArray26);
        io.resourcepool.model.Language language29 = io.resourcepool.model.Language.random();
        java.lang.String str30 = language29.getLocaleCode();
        java.lang.String str31 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language29);
        io.resourcepool.model.Language language33 = io.resourcepool.model.Language.random();
        java.lang.String str34 = language33.getLocaleCode();
        java.lang.String str35 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language33);
        io.resourcepool.model.Language language36 = io.resourcepool.model.Language.random();
        java.lang.String str37 = language36.getLocaleCode();
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language39 = io.resourcepool.model.Language.random();
        java.lang.String str40 = language39.getLocaleCode();
        io.resourcepool.model.Language[] languageArray41 = new io.resourcepool.model.Language[] { language29, language33, language36, language38, language39 };
        int int42 = surnamesDictionary20.size(languageArray41);
        int int43 = fortunesDictionary10.size(languageArray41);
        int int44 = surnamesDictionary0.size(languageArray41);
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Shaull" + "'", str9, "Shaull");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11812 + "'", int11 == 11812);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + language23 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language23.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language24 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language24.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
        org.junit.Assert.assertNotNull(languageArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20000 + "'", int27 == 20000);
        org.junit.Assert.assertTrue("'" + language29 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language29.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en" + "'", str30, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!33" + "'", str31, "hi!33");
        org.junit.Assert.assertTrue("'" + language33 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language33.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "en" + "'", str34, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!22" + "'", str35, "hi!22");
        org.junit.Assert.assertTrue("'" + language36 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language36.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "en" + "'", str37, "en");
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language39 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language39.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "en" + "'", str40, "en");
        org.junit.Assert.assertNotNull(languageArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 50000 + "'", int42 == 50000);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 50000 + "'", int43 == 50000);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 50000 + "'", int44 == 50000);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        io.resourcepool.model.Gender gender2 = null;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("hi!24", "Mamie23", gender2);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes(1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.random();
        java.lang.String str4 = language3.getLocaleCode();
        io.resourcepool.model.Fortune fortune5 = simpleFortuneGenerator0.nextFortune(language3);
        java.util.List<io.resourcepool.model.Fortune> fortuneList7 = simpleFortuneGenerator0.nextFortunes((int) (short) 0);
        io.resourcepool.model.Fortune fortune8 = simpleFortuneGenerator0.nextFortune();
        org.junit.Assert.assertNotNull(fortuneList2);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertNotNull(fortune5);
        org.junit.Assert.assertNotNull(fortuneList7);
        org.junit.Assert.assertNotNull(fortune8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator8 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList10 = simpleNameGenerator8.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList12 = simpleNameGenerator8.nextGivenNames(100);
        java.lang.String str13 = simpleNameGenerator8.nextSurname();
        io.resourcepool.model.FullName fullName14 = simpleNameGenerator8.nextName();
        java.lang.String str15 = fullName14.surname;
        io.resourcepool.model.Gender gender16 = fullName14.gender;
        io.resourcepool.model.GivenName givenName17 = new io.resourcepool.model.GivenName("hi!28", "If at first you don't succeed, try something else.", gender16);
        io.resourcepool.model.GivenName givenName18 = new io.resourcepool.model.GivenName("FullName{givenName='Shaull', surname='Mamie23', nickname='', gender=MALE}", "hi!51", gender16);
        io.resourcepool.model.GivenName givenName19 = new io.resourcepool.model.GivenName("hi!55", "hi!55", gender16);
        io.resourcepool.model.GivenName givenName20 = new io.resourcepool.model.GivenName("hi!37", "Ultrahi!", gender16);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(givenNameList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Shaull" + "'", str13, "Shaull");
        org.junit.Assert.assertNotNull(fullName14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Shaull" + "'", str15, "Shaull");
        org.junit.Assert.assertTrue("'" + gender16 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender16.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<io.resourcepool.model.FullName> fullNameList8 = simpleNameGenerator0.nextNames((int) (short) 10);
        io.resourcepool.model.FullName fullName9 = simpleNameGenerator0.nextName();
        java.lang.String str10 = simpleNameGenerator0.nextSurname();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(fullNameList8);
        org.junit.Assert.assertNotNull(fullName9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Shaull" + "'", str10, "Shaull");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes(11812);
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Fortune fortune6 = simpleFortuneGenerator0.nextFortune(language5);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary7 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary8 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray9 = new io.resourcepool.model.Language[] {};
        int int10 = surnamesDictionary8.size(languageArray9);
        int int11 = givenNamesDictionary7.size(languageArray9);
        java.util.List<io.resourcepool.model.GivenName> givenNameList13 = givenNamesDictionary7.pick((int) ' ');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary14 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray15 = new io.resourcepool.model.Language[] {};
        int int16 = surnamesDictionary14.size(languageArray15);
        int int17 = givenNamesDictionary7.size(languageArray15);
        int int18 = givenNamesDictionary7.size();
        java.util.List<io.resourcepool.model.GivenName> givenNameList20 = givenNamesDictionary7.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary21 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList23 = surnamesDictionary21.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary25 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray26 = new io.resourcepool.model.Language[] {};
        int int27 = surnamesDictionary25.size(languageArray26);
        io.resourcepool.model.Language language28 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language29 = io.resourcepool.model.Language.random();
        java.lang.String str30 = language29.getLocaleCode();
        io.resourcepool.model.Language[] languageArray31 = new io.resourcepool.model.Language[] { language28, language29 };
        int int32 = surnamesDictionary25.size(languageArray31);
        io.resourcepool.generator.Query query33 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray31);
        java.util.List<java.lang.String> strList34 = surnamesDictionary21.pick(query33);
        java.util.List<io.resourcepool.model.GivenName> givenNameList35 = givenNamesDictionary7.pick(query33);
        java.util.List<io.resourcepool.model.Fortune> fortuneList36 = simpleFortuneGenerator0.nextFortunes(query33);
        java.util.List<io.resourcepool.model.Fortune> fortuneList38 = simpleFortuneGenerator0.nextFortunes((int) (short) 10);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertNotNull(fortune6);
        org.junit.Assert.assertNotNull(languageArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(givenNameList13);
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4305 + "'", int18 == 4305);
        org.junit.Assert.assertNotNull(givenNameList20);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language29 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language29.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en" + "'", str30, "en");
        org.junit.Assert.assertNotNull(languageArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20000 + "'", int32 == 20000);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(givenNameList35);
        org.junit.Assert.assertNotNull(fortuneList36);
        org.junit.Assert.assertNotNull(fortuneList38);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.lang.String str7 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(0);
        io.resourcepool.model.FullName fullName12 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList14 = simpleNameGenerator0.nextSurnames((int) (byte) -1);
        java.util.List<io.resourcepool.model.FullName> fullNameList16 = simpleNameGenerator0.nextNames((int) '4');
        java.util.List<io.resourcepool.model.FullName> fullNameList18 = simpleNameGenerator0.nextNames((int) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(fullName12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(fullNameList16);
        org.junit.Assert.assertNotNull(fullNameList18);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.random();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = io.resourcepool.dictionary.loader.FortuneLoader.load(language3);
        java.lang.String str5 = surnamesDictionary0.pick(language3);
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator3 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList5 = simpleNameGenerator3.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList7 = simpleNameGenerator3.nextGivenNames(100);
        java.lang.String str8 = simpleNameGenerator3.nextSurname();
        java.util.List<java.lang.String> strList10 = simpleNameGenerator3.nextNicknames(100);
        java.util.List<java.lang.String> strList12 = simpleNameGenerator3.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName13 = simpleNameGenerator3.nextGivenName();
        io.resourcepool.model.Gender gender14 = givenName13.gender;
        io.resourcepool.model.FullName fullName15 = new io.resourcepool.model.FullName("hi!57", "hi!87", "GivenName{givenName='Mary', nickname='Mamie23', gender=FEMALE}", gender14);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator16 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList18 = simpleNameGenerator16.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList20 = simpleNameGenerator16.nextGivenNames(100);
        java.util.List<java.lang.String> strList22 = simpleNameGenerator16.nextSurnames((int) (byte) 0);
        java.util.List<io.resourcepool.model.FullName> fullNameList24 = simpleNameGenerator16.nextNames(11812);
        boolean boolean25 = fullName15.equals((java.lang.Object) 11812);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(givenNameList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(givenName13);
        org.junit.Assert.assertTrue("'" + gender14 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender14.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(givenNameList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(fullNameList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.lang.String str7 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(0);
        java.lang.String str12 = simpleNameGenerator0.nextNickname();
        java.util.List<io.resourcepool.model.FullName> fullNameList14 = simpleNameGenerator0.nextNames(0);
        java.util.List<io.resourcepool.model.GivenName> givenNameList16 = simpleNameGenerator0.nextGivenNames(1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mamie23" + "'", str12, "Mamie23");
        org.junit.Assert.assertNotNull(fullNameList14);
        org.junit.Assert.assertNotNull(givenNameList16);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
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
        java.util.List<io.resourcepool.model.Fortune> fortuneList11 = fortunesDictionary0.pick(2000);
        io.resourcepool.model.Fortune fortune12 = fortunesDictionary0.pick();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary13 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray14 = new io.resourcepool.model.Language[] {};
        int int15 = surnamesDictionary13.size(languageArray14);
        io.resourcepool.model.Language language16 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language17 = io.resourcepool.model.Language.random();
        java.lang.String str18 = language17.getLocaleCode();
        io.resourcepool.model.Language[] languageArray19 = new io.resourcepool.model.Language[] { language16, language17 };
        int int20 = surnamesDictionary13.size(languageArray19);
        int int21 = fortunesDictionary0.size(languageArray19);
        io.resourcepool.model.Fortune fortune22 = fortunesDictionary0.pick();
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
        io.resourcepool.generator.Query.Builder builder47 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary48 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary49 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray50 = new io.resourcepool.model.Language[] {};
        int int51 = surnamesDictionary49.size(languageArray50);
        int int52 = givenNamesDictionary48.size(languageArray50);
        io.resourcepool.generator.Query.Builder builder53 = builder47.languages(languageArray50);
        int int54 = surnamesDictionary24.size(languageArray50);
        io.resourcepool.generator.Query query55 = new io.resourcepool.generator.Query((int) '4', languageArray50);
        int int56 = fortunesDictionary0.size(languageArray50);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary57 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary58 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray59 = new io.resourcepool.model.Language[] {};
        int int60 = surnamesDictionary58.size(languageArray59);
        int int61 = givenNamesDictionary57.size(languageArray59);
        java.util.List<io.resourcepool.model.GivenName> givenNameList63 = givenNamesDictionary57.pick((int) ' ');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary64 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray65 = new io.resourcepool.model.Language[] {};
        int int66 = surnamesDictionary64.size(languageArray65);
        int int67 = givenNamesDictionary57.size(languageArray65);
        int int68 = givenNamesDictionary57.size();
        java.util.List<io.resourcepool.model.GivenName> givenNameList70 = givenNamesDictionary57.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary71 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList73 = surnamesDictionary71.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary75 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray76 = new io.resourcepool.model.Language[] {};
        int int77 = surnamesDictionary75.size(languageArray76);
        io.resourcepool.model.Language language78 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language79 = io.resourcepool.model.Language.random();
        java.lang.String str80 = language79.getLocaleCode();
        io.resourcepool.model.Language[] languageArray81 = new io.resourcepool.model.Language[] { language78, language79 };
        int int82 = surnamesDictionary75.size(languageArray81);
        io.resourcepool.generator.Query query83 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray81);
        java.util.List<java.lang.String> strList84 = surnamesDictionary71.pick(query83);
        java.util.List<io.resourcepool.model.GivenName> givenNameList85 = givenNamesDictionary57.pick(query83);
        java.util.List<io.resourcepool.model.Fortune> fortuneList86 = fortunesDictionary0.pick(query83);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fortuneList11);
        org.junit.Assert.assertNotNull(fortune12);
        org.junit.Assert.assertNotNull(languageArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language17 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language17.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en" + "'", str18, "en");
        org.junit.Assert.assertNotNull(languageArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20000 + "'", int20 == 20000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20000 + "'", int21 == 20000);
        org.junit.Assert.assertNotNull(fortune22);
        org.junit.Assert.assertNotNull(languageArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language28 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language28.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en" + "'", str29, "en");
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
        org.junit.Assert.assertTrue("'" + language33 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language33.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "en" + "'", str34, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!46" + "'", str35, "hi!46");
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en" + "'", str38, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!66" + "'", str39, "hi!66");
        org.junit.Assert.assertTrue("'" + language40 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language40.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "en" + "'", str41, "en");
        org.junit.Assert.assertTrue("'" + language42 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language42.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language43 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language43.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "en" + "'", str44, "en");
        org.junit.Assert.assertNotNull(languageArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 50000 + "'", int46 == 50000);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(languageArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(languageArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(givenNameList63);
        org.junit.Assert.assertNotNull(languageArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 4305 + "'", int68 == 4305);
        org.junit.Assert.assertNotNull(givenNameList70);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(languageArray76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + language78 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language78.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language79 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language79.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "en" + "'", str80, "en");
        org.junit.Assert.assertNotNull(languageArray81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 20000 + "'", int82 == 20000);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(givenNameList85);
        org.junit.Assert.assertNotNull(fortuneList86);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary2 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray3 = new io.resourcepool.model.Language[] {};
        int int4 = surnamesDictionary2.size(languageArray3);
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language6 = io.resourcepool.model.Language.random();
        java.lang.String str7 = language6.getLocaleCode();
        io.resourcepool.model.Language[] languageArray8 = new io.resourcepool.model.Language[] { language5, language6 };
        int int9 = surnamesDictionary2.size(languageArray8);
        io.resourcepool.generator.Query query10 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray8);
        java.util.List<java.lang.String> strList11 = surnamesDictionary0.pick(query10);
        int int12 = surnamesDictionary0.size();
        org.junit.Assert.assertNotNull(languageArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language6 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language6.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        io.resourcepool.model.Gender gender1 = io.resourcepool.model.Gender.parse("hi!37");
        org.junit.Assert.assertNull(gender1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
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
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary11 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList13 = surnamesDictionary11.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary14 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray15 = new io.resourcepool.model.Language[] {};
        int int16 = surnamesDictionary14.size(languageArray15);
        int int17 = surnamesDictionary11.size(languageArray15);
        int int18 = givenNamesDictionary0.size(languageArray15);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary19 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary20 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] {};
        int int22 = surnamesDictionary20.size(languageArray21);
        int int23 = givenNamesDictionary19.size(languageArray21);
        java.util.List<io.resourcepool.model.GivenName> givenNameList25 = givenNamesDictionary19.pick((int) ' ');
        java.util.List<io.resourcepool.model.GivenName> givenNameList27 = givenNamesDictionary19.pick((int) (short) 100);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary28 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray29 = new io.resourcepool.model.Language[] {};
        int int30 = surnamesDictionary28.size(languageArray29);
        io.resourcepool.model.Language language31 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language32 = io.resourcepool.model.Language.random();
        java.lang.String str33 = language32.getLocaleCode();
        io.resourcepool.model.Language[] languageArray34 = new io.resourcepool.model.Language[] { language31, language32 };
        int int35 = surnamesDictionary28.size(languageArray34);
        io.resourcepool.model.Language language37 = io.resourcepool.model.Language.random();
        java.lang.String str38 = language37.getLocaleCode();
        java.lang.String str39 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language37);
        io.resourcepool.model.Language language41 = io.resourcepool.model.Language.random();
        java.lang.String str42 = language41.getLocaleCode();
        java.lang.String str43 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language41);
        io.resourcepool.model.Language language44 = io.resourcepool.model.Language.random();
        java.lang.String str45 = language44.getLocaleCode();
        io.resourcepool.model.Language language46 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language47 = io.resourcepool.model.Language.random();
        java.lang.String str48 = language47.getLocaleCode();
        io.resourcepool.model.Language[] languageArray49 = new io.resourcepool.model.Language[] { language37, language41, language44, language46, language47 };
        int int50 = surnamesDictionary28.size(languageArray49);
        io.resourcepool.generator.Query.Builder builder51 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary52 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary53 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray54 = new io.resourcepool.model.Language[] {};
        int int55 = surnamesDictionary53.size(languageArray54);
        int int56 = givenNamesDictionary52.size(languageArray54);
        io.resourcepool.generator.Query.Builder builder57 = builder51.languages(languageArray54);
        int int58 = surnamesDictionary28.size(languageArray54);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary60 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray61 = new io.resourcepool.model.Language[] {};
        int int62 = surnamesDictionary60.size(languageArray61);
        io.resourcepool.model.Language language63 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language64 = io.resourcepool.model.Language.random();
        java.lang.String str65 = language64.getLocaleCode();
        io.resourcepool.model.Language[] languageArray66 = new io.resourcepool.model.Language[] { language63, language64 };
        int int67 = surnamesDictionary60.size(languageArray66);
        io.resourcepool.generator.Query query68 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray66);
        java.util.List<java.lang.String> strList69 = surnamesDictionary28.pick(query68);
        io.resourcepool.model.Language[] languageArray70 = query68.languages;
        java.util.List<io.resourcepool.model.GivenName> givenNameList71 = givenNamesDictionary19.pick(query68);
        java.util.List<io.resourcepool.model.GivenName> givenNameList72 = givenNamesDictionary0.pick(query68);
        io.resourcepool.model.GivenName givenName73 = givenNamesDictionary0.pick();
        io.resourcepool.model.Gender gender74 = givenName73.gender;
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(givenNameList6);
        org.junit.Assert.assertNotNull(languageArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(givenNameList25);
        org.junit.Assert.assertNotNull(givenNameList27);
        org.junit.Assert.assertNotNull(languageArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + language31 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language31.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language32 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language32.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "en" + "'", str33, "en");
        org.junit.Assert.assertNotNull(languageArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20000 + "'", int35 == 20000);
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en" + "'", str38, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!77" + "'", str39, "hi!77");
        org.junit.Assert.assertTrue("'" + language41 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language41.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "en" + "'", str42, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!79" + "'", str43, "hi!79");
        org.junit.Assert.assertTrue("'" + language44 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language44.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "en" + "'", str45, "en");
        org.junit.Assert.assertTrue("'" + language46 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language46.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language47 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language47.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "en" + "'", str48, "en");
        org.junit.Assert.assertNotNull(languageArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 50000 + "'", int50 == 50000);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(languageArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(languageArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + language63 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language63.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language64 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language64.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "en" + "'", str65, "en");
        org.junit.Assert.assertNotNull(languageArray66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 20000 + "'", int67 == 20000);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(languageArray70);
        org.junit.Assert.assertNotNull(givenNameList71);
        org.junit.Assert.assertNotNull(givenNameList72);
        org.junit.Assert.assertNotNull(givenName73);
        org.junit.Assert.assertTrue("'" + gender74 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender74.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        io.resourcepool.model.Fortune fortune1 = fortunesDictionary0.pick();
        java.util.List<io.resourcepool.model.Fortune> fortuneList3 = fortunesDictionary0.pick((-1));
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortuneList3);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes((int) (short) -1);
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes((int) (short) 100);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary5 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary6 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray7 = new io.resourcepool.model.Language[] {};
        int int8 = surnamesDictionary6.size(languageArray7);
        int int9 = givenNamesDictionary5.size(languageArray7);
        java.util.List<io.resourcepool.model.GivenName> givenNameList11 = givenNamesDictionary5.pick((int) ' ');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary12 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray13 = new io.resourcepool.model.Language[] {};
        int int14 = surnamesDictionary12.size(languageArray13);
        int int15 = givenNamesDictionary5.size(languageArray13);
        int int16 = givenNamesDictionary5.size();
        java.util.List<io.resourcepool.model.GivenName> givenNameList18 = givenNamesDictionary5.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary20 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] {};
        int int22 = surnamesDictionary20.size(languageArray21);
        io.resourcepool.model.Language language23 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language24 = io.resourcepool.model.Language.random();
        java.lang.String str25 = language24.getLocaleCode();
        io.resourcepool.model.Language[] languageArray26 = new io.resourcepool.model.Language[] { language23, language24 };
        int int27 = surnamesDictionary20.size(languageArray26);
        io.resourcepool.model.Language language29 = io.resourcepool.model.Language.random();
        java.lang.String str30 = language29.getLocaleCode();
        java.lang.String str31 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language29);
        io.resourcepool.model.Language language33 = io.resourcepool.model.Language.random();
        java.lang.String str34 = language33.getLocaleCode();
        java.lang.String str35 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language33);
        io.resourcepool.model.Language language36 = io.resourcepool.model.Language.random();
        java.lang.String str37 = language36.getLocaleCode();
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language39 = io.resourcepool.model.Language.random();
        java.lang.String str40 = language39.getLocaleCode();
        io.resourcepool.model.Language[] languageArray41 = new io.resourcepool.model.Language[] { language29, language33, language36, language38, language39 };
        int int42 = surnamesDictionary20.size(languageArray41);
        io.resourcepool.generator.Query.Builder builder43 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary44 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary45 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray46 = new io.resourcepool.model.Language[] {};
        int int47 = surnamesDictionary45.size(languageArray46);
        int int48 = givenNamesDictionary44.size(languageArray46);
        io.resourcepool.generator.Query.Builder builder49 = builder43.languages(languageArray46);
        int int50 = surnamesDictionary20.size(languageArray46);
        io.resourcepool.generator.Query query51 = new io.resourcepool.generator.Query((int) '4', languageArray46);
        java.util.List<io.resourcepool.model.GivenName> givenNameList52 = givenNamesDictionary5.pick(query51);
        java.util.List<io.resourcepool.model.Fortune> fortuneList53 = simpleFortuneGenerator0.nextFortunes(query51);
        int int54 = query51.count;
        org.junit.Assert.assertNotNull(fortuneList2);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertNotNull(languageArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(givenNameList11);
        org.junit.Assert.assertNotNull(languageArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4305 + "'", int16 == 4305);
        org.junit.Assert.assertNotNull(givenNameList18);
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + language23 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language23.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language24 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language24.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
        org.junit.Assert.assertNotNull(languageArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20000 + "'", int27 == 20000);
        org.junit.Assert.assertTrue("'" + language29 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language29.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "en" + "'", str30, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!89" + "'", str31, "hi!89");
        org.junit.Assert.assertTrue("'" + language33 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language33.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "en" + "'", str34, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!33" + "'", str35, "hi!33");
        org.junit.Assert.assertTrue("'" + language36 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language36.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "en" + "'", str37, "en");
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language39 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language39.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "en" + "'", str40, "en");
        org.junit.Assert.assertNotNull(languageArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 50000 + "'", int42 == 50000);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(languageArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(givenNameList52);
        org.junit.Assert.assertNotNull(fortuneList53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 52 + "'", int54 == 52);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
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
        io.resourcepool.generator.Query.Builder builder24 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary25 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary26 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray27 = new io.resourcepool.model.Language[] {};
        int int28 = surnamesDictionary26.size(languageArray27);
        int int29 = givenNamesDictionary25.size(languageArray27);
        io.resourcepool.generator.Query.Builder builder30 = builder24.languages(languageArray27);
        int int31 = surnamesDictionary1.size(languageArray27);
        io.resourcepool.generator.Query query32 = new io.resourcepool.generator.Query((int) '4', languageArray27);
        int int33 = query32.count;
        org.junit.Assert.assertNotNull(languageArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(languageArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + language10 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language10.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en" + "'", str11, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!61" + "'", str12, "hi!61");
        org.junit.Assert.assertTrue("'" + language14 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language14.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lighthi!" + "'", str16, "Lighthi!");
        org.junit.Assert.assertTrue("'" + language17 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language17.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en" + "'", str18, "en");
        org.junit.Assert.assertTrue("'" + language19 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language19.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en" + "'", str21, "en");
        org.junit.Assert.assertNotNull(languageArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 50000 + "'", int23 == 50000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(languageArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int1 = givenNamesDictionary0.size();
        io.resourcepool.model.GivenName givenName2 = givenNamesDictionary0.pick();
        java.lang.String str3 = givenName2.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4305 + "'", int1 == 4305);
        org.junit.Assert.assertNotNull(givenName2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GivenName{givenName='Mary', nickname='Mamie23', gender=FEMALE}" + "'", str3, "GivenName{givenName='Mary', nickname='Mamie23', gender=FEMALE}");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.lang.String str1 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList3 = simpleNameGenerator0.nextSurnames(1);
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
        io.resourcepool.generator.Query query16 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray14);
        java.util.List<java.lang.String> strList17 = surnamesDictionary4.pick(query16);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator18 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList20 = simpleNameGenerator18.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList22 = simpleNameGenerator18.nextGivenNames(100);
        java.util.List<java.lang.String> strList24 = simpleNameGenerator18.nextSurnames((int) (byte) 1);
        java.lang.String str25 = simpleNameGenerator18.nextSurname();
        java.util.List<java.lang.String> strList27 = simpleNameGenerator18.nextSurnames(1);
        java.util.List<java.lang.String> strList29 = simpleNameGenerator18.nextSurnames(0);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary30 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList32 = surnamesDictionary30.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary34 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray35 = new io.resourcepool.model.Language[] {};
        int int36 = surnamesDictionary34.size(languageArray35);
        io.resourcepool.model.Language language37 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.random();
        java.lang.String str39 = language38.getLocaleCode();
        io.resourcepool.model.Language[] languageArray40 = new io.resourcepool.model.Language[] { language37, language38 };
        int int41 = surnamesDictionary34.size(languageArray40);
        io.resourcepool.generator.Query query42 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray40);
        java.util.List<java.lang.String> strList43 = surnamesDictionary30.pick(query42);
        java.util.List<io.resourcepool.model.FullName> fullNameList44 = simpleNameGenerator18.nextNames(query42);
        java.util.List<java.lang.String> strList45 = surnamesDictionary4.pick(query42);
        java.util.List<io.resourcepool.model.FullName> fullNameList46 = simpleNameGenerator0.nextNames(query42);
        io.resourcepool.model.GivenName givenName47 = simpleNameGenerator0.nextGivenName();
        java.util.List<java.lang.String> strList49 = simpleNameGenerator0.nextNicknames((int) '4');
        io.resourcepool.model.GivenName givenName50 = simpleNameGenerator0.nextGivenName();
        java.util.List<io.resourcepool.model.FullName> fullNameList52 = simpleNameGenerator0.nextNames(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Shaull" + "'", str1, "Shaull");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(languageArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + language11 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language11.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertNotNull(languageArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(givenNameList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Shaull" + "'", str25, "Shaull");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(languageArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en" + "'", str39, "en");
        org.junit.Assert.assertNotNull(languageArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20000 + "'", int41 == 20000);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(fullNameList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(fullNameList46);
        org.junit.Assert.assertNotNull(givenName47);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(givenName50);
        org.junit.Assert.assertNotNull(fullNameList52);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        io.resourcepool.model.Fortune fortune1 = fortunesDictionary0.pick();
        io.resourcepool.model.Fortune fortune2 = fortune1.clone();
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        java.util.List<io.resourcepool.model.FullName> fullNameList12 = simpleNameGenerator0.nextNames(20000);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertNotNull(fullNameList12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        io.resourcepool.model.Gender gender8 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName9 = new io.resourcepool.model.GivenName("Shaull", "", gender8);
        io.resourcepool.model.FullName fullName10 = new io.resourcepool.model.FullName("hi!24", "hi!96", "Soberhi!", gender8);
        io.resourcepool.model.FullName fullName11 = new io.resourcepool.model.FullName("hi!62", "", "", gender8);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator12 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList14 = simpleFortuneGenerator12.nextFortunes(1);
        io.resourcepool.model.Language language15 = io.resourcepool.model.Language.random();
        java.lang.String str16 = language15.getLocaleCode();
        io.resourcepool.model.Fortune fortune17 = simpleFortuneGenerator12.nextFortune(language15);
        boolean boolean18 = fullName11.equals((java.lang.Object) simpleFortuneGenerator12);
        org.junit.Assert.assertTrue("'" + gender8 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender8.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(fortuneList14);
        org.junit.Assert.assertTrue("'" + language15 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language15.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en" + "'", str16, "en");
        org.junit.Assert.assertNotNull(fortune17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        io.resourcepool.model.Gender gender10 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName11 = new io.resourcepool.model.GivenName("Shaull", "", gender10);
        io.resourcepool.model.FullName fullName12 = new io.resourcepool.model.FullName("Ultrahi!", "If at first you don't succeed, try something else.", "hi!21", gender10);
        io.resourcepool.model.FullName fullName13 = new io.resourcepool.model.FullName("Firehi!", "hi!4", "hi!57", gender10);
        io.resourcepool.model.GivenName givenName14 = new io.resourcepool.model.GivenName("hi!83", "hi!0", gender10);
        org.junit.Assert.assertTrue("'" + gender10 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender10.equals(io.resourcepool.model.Gender.MALE));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator8 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune9 = simpleFortuneGenerator8.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList11 = simpleFortuneGenerator8.nextFortunes(10);
        io.resourcepool.model.Fortune fortune12 = simpleFortuneGenerator8.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList14 = simpleFortuneGenerator8.nextFortunes((int) (byte) -1);
        io.resourcepool.generator.Query.Builder builder15 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray16 = null;
        io.resourcepool.generator.Query.Builder builder17 = builder15.languages(languageArray16);
        io.resourcepool.generator.Query query18 = builder15.build();
        java.util.List<io.resourcepool.model.Fortune> fortuneList19 = simpleFortuneGenerator8.nextFortunes(query18);
        java.util.List<java.lang.String> strList20 = surnamesDictionary0.pick(query18);
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertNotNull(fortune9);
        org.junit.Assert.assertNotNull(fortuneList11);
        org.junit.Assert.assertNotNull(fortune12);
        org.junit.Assert.assertNotNull(fortuneList14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(query18);
        org.junit.Assert.assertNotNull(fortuneList19);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator3 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList5 = simpleNameGenerator3.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList7 = simpleNameGenerator3.nextGivenNames(100);
        java.lang.String str8 = simpleNameGenerator3.nextSurname();
        io.resourcepool.model.FullName fullName9 = simpleNameGenerator3.nextName();
        io.resourcepool.model.Gender gender10 = fullName9.gender;
        io.resourcepool.model.FullName fullName11 = new io.resourcepool.model.FullName("", "Soberhi!", "", gender10);
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator12 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune13 = simpleFortuneGenerator12.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList15 = simpleFortuneGenerator12.nextFortunes(10);
        io.resourcepool.model.Language language16 = io.resourcepool.model.Language.random();
        java.lang.String str17 = language16.getLocaleCode();
        java.util.List<io.resourcepool.model.GivenName> givenNameList18 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language16);
        io.resourcepool.model.Fortune fortune19 = simpleFortuneGenerator12.nextFortune(language16);
        io.resourcepool.model.Fortune fortune20 = fortune19.clone();
        boolean boolean21 = fullName11.equals((java.lang.Object) fortune19);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(givenNameList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertNotNull(fullName9);
        org.junit.Assert.assertTrue("'" + gender10 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender10.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertNotNull(fortune13);
        org.junit.Assert.assertNotNull(fortuneList15);
        org.junit.Assert.assertTrue("'" + language16 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language16.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en" + "'", str17, "en");
        org.junit.Assert.assertNotNull(givenNameList18);
        org.junit.Assert.assertNotNull(fortune19);
        org.junit.Assert.assertNotNull(fortune20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
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
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(1);
        java.lang.String str12 = simpleNameGenerator0.nextSurname();
        java.util.List<io.resourcepool.model.FullName> fullNameList14 = simpleNameGenerator0.nextNames((-1));
        io.resourcepool.model.GivenName givenName15 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary16 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList18 = surnamesDictionary16.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary20 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] {};
        int int22 = surnamesDictionary20.size(languageArray21);
        io.resourcepool.model.Language language23 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language24 = io.resourcepool.model.Language.random();
        java.lang.String str25 = language24.getLocaleCode();
        io.resourcepool.model.Language[] languageArray26 = new io.resourcepool.model.Language[] { language23, language24 };
        int int27 = surnamesDictionary20.size(languageArray26);
        io.resourcepool.generator.Query query28 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray26);
        java.util.List<java.lang.String> strList29 = surnamesDictionary16.pick(query28);
        java.util.List<io.resourcepool.model.FullName> fullNameList30 = simpleNameGenerator0.nextNames(query28);
        io.resourcepool.model.Language[] languageArray31 = query28.languages;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Shaull" + "'", str12, "Shaull");
        org.junit.Assert.assertNotNull(fullNameList14);
        org.junit.Assert.assertNotNull(givenName15);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + language23 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language23.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language24 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language24.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
        org.junit.Assert.assertNotNull(languageArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20000 + "'", int27 == 20000);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(fullNameList30);
        org.junit.Assert.assertNotNull(languageArray31);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.lang.String str7 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName8 = simpleNameGenerator0.nextName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertNotNull(fullName8);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes(1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.random();
        java.lang.String str4 = language3.getLocaleCode();
        io.resourcepool.model.Fortune fortune5 = simpleFortuneGenerator0.nextFortune(language3);
        java.util.List<io.resourcepool.model.Fortune> fortuneList7 = simpleFortuneGenerator0.nextFortunes((int) (short) 0);
        java.util.List<io.resourcepool.model.Fortune> fortuneList9 = simpleFortuneGenerator0.nextFortunes((int) '4');
        io.resourcepool.model.Fortune fortune10 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.random();
        java.lang.String str13 = language12.getLocaleCode();
        java.lang.String str14 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language12);
        java.lang.String str15 = language12.getLocaleCode();
        java.util.List<io.resourcepool.model.Fortune> fortuneList16 = io.resourcepool.dictionary.loader.FortuneLoader.load(language12);
        io.resourcepool.model.Fortune fortune17 = simpleFortuneGenerator0.nextFortune(language12);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator18 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList20 = simpleNameGenerator18.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList22 = simpleNameGenerator18.nextGivenNames(100);
        java.util.List<java.lang.String> strList24 = simpleNameGenerator18.nextSurnames((int) (byte) 1);
        java.lang.String str25 = simpleNameGenerator18.nextSurname();
        java.util.List<java.lang.String> strList27 = simpleNameGenerator18.nextSurnames(1);
        java.util.List<java.lang.String> strList29 = simpleNameGenerator18.nextSurnames(0);
        java.lang.String str30 = simpleNameGenerator18.nextNickname();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary31 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary33 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray34 = new io.resourcepool.model.Language[] {};
        int int35 = surnamesDictionary33.size(languageArray34);
        io.resourcepool.model.Language language36 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language37 = io.resourcepool.model.Language.random();
        java.lang.String str38 = language37.getLocaleCode();
        io.resourcepool.model.Language[] languageArray39 = new io.resourcepool.model.Language[] { language36, language37 };
        int int40 = surnamesDictionary33.size(languageArray39);
        io.resourcepool.generator.Query query41 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray39);
        java.util.List<java.lang.String> strList42 = surnamesDictionary31.pick(query41);
        java.util.List<io.resourcepool.model.FullName> fullNameList43 = simpleNameGenerator18.nextNames(query41);
        java.util.List<io.resourcepool.model.Fortune> fortuneList44 = simpleFortuneGenerator0.nextFortunes(query41);
        org.junit.Assert.assertNotNull(fortuneList2);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertNotNull(fortune5);
        org.junit.Assert.assertNotNull(fortuneList7);
        org.junit.Assert.assertNotNull(fortuneList9);
        org.junit.Assert.assertNotNull(fortune10);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!83" + "'", str14, "hi!83");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertNotNull(fortuneList16);
        org.junit.Assert.assertNotNull(fortune17);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(givenNameList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Shaull" + "'", str25, "Shaull");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Mamie23" + "'", str30, "Mamie23");
        org.junit.Assert.assertNotNull(languageArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + language36 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language36.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en" + "'", str38, "en");
        org.junit.Assert.assertNotNull(languageArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20000 + "'", int40 == 20000);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(fullNameList43);
        org.junit.Assert.assertNotNull(fortuneList44);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.lang.String str7 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(0);
        io.resourcepool.model.FullName fullName12 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList14 = simpleNameGenerator0.nextSurnames((int) (byte) -1);
        java.util.List<io.resourcepool.model.FullName> fullNameList16 = simpleNameGenerator0.nextNames((int) '4');
        io.resourcepool.model.GivenName givenName17 = simpleNameGenerator0.nextGivenName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(fullName12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(fullNameList16);
        org.junit.Assert.assertNotNull(givenName17);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList8 = simpleNameGenerator0.nextNicknames(20000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot pick more than 4305 elements in GivenNames Dictionary");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
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
        java.util.List<io.resourcepool.model.Fortune> fortuneList12 = fortunesDictionary0.pick((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11812 + "'", int1 == 11812);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(languageArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(fortune10);
        org.junit.Assert.assertNotNull(fortuneList12);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        io.resourcepool.model.Gender gender4 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName5 = new io.resourcepool.model.GivenName("Shaull", "Shaull", gender4);
        io.resourcepool.model.GivenName givenName6 = new io.resourcepool.model.GivenName("", "hi!", gender4);
        io.resourcepool.model.GivenName givenName7 = givenName6.clone();
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary8 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary9 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray10 = new io.resourcepool.model.Language[] {};
        int int11 = surnamesDictionary9.size(languageArray10);
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.random();
        java.lang.String str14 = language13.getLocaleCode();
        io.resourcepool.model.Language[] languageArray15 = new io.resourcepool.model.Language[] { language12, language13 };
        int int16 = surnamesDictionary9.size(languageArray15);
        int int17 = fortunesDictionary8.size(languageArray15);
        boolean boolean18 = givenName6.equals((java.lang.Object) int17);
        org.junit.Assert.assertTrue("'" + gender4 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender4.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName7);
        org.junit.Assert.assertNotNull(languageArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(1);
        java.lang.String str12 = simpleNameGenerator0.nextSurname();
        java.util.List<io.resourcepool.model.FullName> fullNameList14 = simpleNameGenerator0.nextNames((-1));
        io.resourcepool.model.GivenName givenName15 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.model.GivenName givenName16 = givenName15.clone();
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator20 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList22 = simpleNameGenerator20.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList24 = simpleNameGenerator20.nextGivenNames(100);
        java.lang.String str25 = simpleNameGenerator20.nextSurname();
        io.resourcepool.model.FullName fullName26 = simpleNameGenerator20.nextName();
        io.resourcepool.model.Gender gender27 = fullName26.gender;
        io.resourcepool.model.FullName fullName28 = new io.resourcepool.model.FullName("", "Soberhi!", "", gender27);
        boolean boolean29 = givenName15.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Shaull" + "'", str12, "Shaull");
        org.junit.Assert.assertNotNull(fullNameList14);
        org.junit.Assert.assertNotNull(givenName15);
        org.junit.Assert.assertNotNull(givenName16);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(givenNameList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Shaull" + "'", str25, "Shaull");
        org.junit.Assert.assertNotNull(fullName26);
        org.junit.Assert.assertTrue("'" + gender27 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender27.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        java.lang.String str11 = givenName10.nickname;
        io.resourcepool.model.GivenName givenName12 = givenName10.clone();
        io.resourcepool.model.FullName fullName14 = givenName12.toFullName("hi!29");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mamie23" + "'", str11, "Mamie23");
        org.junit.Assert.assertNotNull(givenName12);
        org.junit.Assert.assertNotNull(fullName14);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator1 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.lang.String str2 = simpleNameGenerator1.nextSurname();
        java.util.List<java.lang.String> strList4 = simpleNameGenerator1.nextSurnames(1);
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
        io.resourcepool.generator.Query query17 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray15);
        java.util.List<java.lang.String> strList18 = surnamesDictionary5.pick(query17);
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator19 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList21 = simpleNameGenerator19.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList23 = simpleNameGenerator19.nextGivenNames(100);
        java.util.List<java.lang.String> strList25 = simpleNameGenerator19.nextSurnames((int) (byte) 1);
        java.lang.String str26 = simpleNameGenerator19.nextSurname();
        java.util.List<java.lang.String> strList28 = simpleNameGenerator19.nextSurnames(1);
        java.util.List<java.lang.String> strList30 = simpleNameGenerator19.nextSurnames(0);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary31 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList33 = surnamesDictionary31.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary35 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray36 = new io.resourcepool.model.Language[] {};
        int int37 = surnamesDictionary35.size(languageArray36);
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language39 = io.resourcepool.model.Language.random();
        java.lang.String str40 = language39.getLocaleCode();
        io.resourcepool.model.Language[] languageArray41 = new io.resourcepool.model.Language[] { language38, language39 };
        int int42 = surnamesDictionary35.size(languageArray41);
        io.resourcepool.generator.Query query43 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray41);
        java.util.List<java.lang.String> strList44 = surnamesDictionary31.pick(query43);
        java.util.List<io.resourcepool.model.FullName> fullNameList45 = simpleNameGenerator19.nextNames(query43);
        java.util.List<java.lang.String> strList46 = surnamesDictionary5.pick(query43);
        java.util.List<io.resourcepool.model.FullName> fullNameList47 = simpleNameGenerator1.nextNames(query43);
        java.util.List<java.lang.String> strList48 = surnamesDictionary0.pick(query43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Shaull" + "'", str2, "Shaull");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(languageArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(givenNameList23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Shaull" + "'", str26, "Shaull");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(languageArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language39 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language39.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "en" + "'", str40, "en");
        org.junit.Assert.assertNotNull(languageArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20000 + "'", int42 == 20000);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(fullNameList45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(fullNameList47);
        org.junit.Assert.assertNotNull(strList48);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune3 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune4 = simpleFortuneGenerator0.nextFortune();
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortune3);
        org.junit.Assert.assertNotNull(fortune4);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        io.resourcepool.model.Language language1 = io.resourcepool.model.Language.random();
        java.lang.String str2 = language1.getLocaleCode();
        java.lang.String str3 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language1);
        java.lang.String str4 = language1.getLocaleCode();
        java.util.List<io.resourcepool.model.Fortune> fortuneList5 = io.resourcepool.dictionary.loader.FortuneLoader.load(language1);
        java.util.List<io.resourcepool.model.Fortune> fortuneList6 = io.resourcepool.dictionary.loader.FortuneLoader.load(language1);
        org.junit.Assert.assertTrue("'" + language1 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language1.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!43" + "'", str3, "hi!43");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertNotNull(fortuneList5);
        org.junit.Assert.assertNotNull(fortuneList6);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int1 = givenNamesDictionary0.size();
        io.resourcepool.model.GivenName givenName2 = givenNamesDictionary0.pick();
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.random();
        java.lang.String str4 = language3.getLocaleCode();
        java.util.List<io.resourcepool.model.GivenName> givenNameList5 = io.resourcepool.dictionary.loader.NameLoader.loadGivenNames(language3);
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3 };
        int int7 = givenNamesDictionary0.size(languageArray6);
        int int8 = givenNamesDictionary0.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary9 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray10 = new io.resourcepool.model.Language[] {};
        int int11 = surnamesDictionary9.size(languageArray10);
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language13 = io.resourcepool.model.Language.random();
        java.lang.String str14 = language13.getLocaleCode();
        io.resourcepool.model.Language[] languageArray15 = new io.resourcepool.model.Language[] { language12, language13 };
        int int16 = surnamesDictionary9.size(languageArray15);
        io.resourcepool.model.Language language17 = io.resourcepool.model.Language.random();
        java.lang.String str18 = surnamesDictionary9.pick(language17);
        io.resourcepool.model.GivenName givenName19 = givenNamesDictionary0.pick(language17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4305 + "'", int1 == 4305);
        org.junit.Assert.assertNotNull(givenName2);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertNotNull(givenNameList5);
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4305 + "'", int8 == 4305);
        org.junit.Assert.assertNotNull(languageArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language13 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language13.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertTrue("'" + language17 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language17.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Shaull" + "'", str18, "Shaull");
        org.junit.Assert.assertNotNull(givenName19);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.lang.String str7 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(0);
        java.lang.String str12 = simpleNameGenerator0.nextNickname();
        java.util.List<io.resourcepool.model.FullName> fullNameList14 = simpleNameGenerator0.nextNames(0);
        java.lang.String str15 = simpleNameGenerator0.nextSurname();
        java.lang.String str16 = simpleNameGenerator0.nextNickname();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mamie23" + "'", str12, "Mamie23");
        org.junit.Assert.assertNotNull(fullNameList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Shaull" + "'", str15, "Shaull");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Mamie23" + "'", str16, "Mamie23");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(1);
        java.lang.String str12 = simpleNameGenerator0.nextSurname();
        java.util.List<io.resourcepool.model.FullName> fullNameList14 = simpleNameGenerator0.nextNames((-1));
        io.resourcepool.model.GivenName givenName15 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.model.GivenName givenName16 = givenName15.clone();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary17 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList19 = surnamesDictionary17.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary20 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray21 = new io.resourcepool.model.Language[] {};
        int int22 = surnamesDictionary20.size(languageArray21);
        int int23 = surnamesDictionary17.size(languageArray21);
        java.lang.String str24 = surnamesDictionary17.pick();
        java.lang.String str25 = surnamesDictionary17.pick();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary26 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList28 = surnamesDictionary26.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary29 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray30 = new io.resourcepool.model.Language[] {};
        int int31 = surnamesDictionary29.size(languageArray30);
        int int32 = surnamesDictionary26.size(languageArray30);
        java.lang.String str33 = surnamesDictionary26.pick();
        java.lang.String str34 = surnamesDictionary26.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator35 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList37 = simpleFortuneGenerator35.nextFortunes(1);
        io.resourcepool.model.Language language38 = io.resourcepool.model.Language.random();
        java.lang.String str39 = language38.getLocaleCode();
        io.resourcepool.model.Fortune fortune40 = simpleFortuneGenerator35.nextFortune(language38);
        java.lang.String str41 = surnamesDictionary26.pick(language38);
        java.util.List<java.lang.String> strList42 = io.resourcepool.dictionary.loader.NameLoader.loadSurnames(language38);
        java.lang.String str43 = surnamesDictionary17.pick(language38);
        boolean boolean44 = givenName16.equals((java.lang.Object) str43);
        java.lang.String str45 = givenName16.toString();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Shaull" + "'", str12, "Shaull");
        org.junit.Assert.assertNotNull(fullNameList14);
        org.junit.Assert.assertNotNull(givenName15);
        org.junit.Assert.assertNotNull(givenName16);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(languageArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Shaull" + "'", str24, "Shaull");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Shaull" + "'", str25, "Shaull");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Shaull" + "'", str33, "Shaull");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Shaull" + "'", str34, "Shaull");
        org.junit.Assert.assertNotNull(fortuneList37);
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en" + "'", str39, "en");
        org.junit.Assert.assertNotNull(fortune40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Shaull" + "'", str41, "Shaull");
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Shaull" + "'", str43, "Shaull");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "GivenName{givenName='Mary', nickname='Mamie23', gender=FEMALE}" + "'", str45, "GivenName{givenName='Mary', nickname='Mamie23', gender=FEMALE}");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary0 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        io.resourcepool.model.Fortune fortune1 = fortunesDictionary0.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator2 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator2.nextFortunes(1);
        io.resourcepool.model.Language language5 = io.resourcepool.model.Language.random();
        java.lang.String str6 = language5.getLocaleCode();
        io.resourcepool.model.Fortune fortune7 = simpleFortuneGenerator2.nextFortune(language5);
        io.resourcepool.model.Fortune fortune8 = fortunesDictionary0.pick(language5);
        io.resourcepool.generator.Query.Builder builder9 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary10 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary11 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray12 = new io.resourcepool.model.Language[] {};
        int int13 = surnamesDictionary11.size(languageArray12);
        int int14 = givenNamesDictionary10.size(languageArray12);
        io.resourcepool.generator.Query.Builder builder15 = builder9.languages(languageArray12);
        int int16 = fortunesDictionary0.size(languageArray12);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary17 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray18 = new io.resourcepool.model.Language[] {};
        int int19 = surnamesDictionary17.size(languageArray18);
        io.resourcepool.model.Language language20 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language21 = io.resourcepool.model.Language.random();
        java.lang.String str22 = language21.getLocaleCode();
        io.resourcepool.model.Language[] languageArray23 = new io.resourcepool.model.Language[] { language20, language21 };
        int int24 = surnamesDictionary17.size(languageArray23);
        java.util.List<java.lang.String> strList26 = surnamesDictionary17.pick((int) (byte) 10);
        int int27 = surnamesDictionary17.size();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary28 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList30 = surnamesDictionary28.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary31 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray32 = new io.resourcepool.model.Language[] {};
        int int33 = surnamesDictionary31.size(languageArray32);
        int int34 = surnamesDictionary28.size(languageArray32);
        java.lang.String str35 = surnamesDictionary28.pick();
        java.lang.String str36 = surnamesDictionary28.pick();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary37 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList39 = surnamesDictionary37.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary40 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray41 = new io.resourcepool.model.Language[] {};
        int int42 = surnamesDictionary40.size(languageArray41);
        int int43 = surnamesDictionary37.size(languageArray41);
        java.lang.String str44 = surnamesDictionary37.pick();
        java.lang.String str45 = surnamesDictionary37.pick();
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator46 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList48 = simpleFortuneGenerator46.nextFortunes(1);
        io.resourcepool.model.Language language49 = io.resourcepool.model.Language.random();
        java.lang.String str50 = language49.getLocaleCode();
        io.resourcepool.model.Fortune fortune51 = simpleFortuneGenerator46.nextFortune(language49);
        java.lang.String str52 = surnamesDictionary37.pick(language49);
        java.util.List<java.lang.String> strList53 = io.resourcepool.dictionary.loader.NameLoader.loadSurnames(language49);
        java.lang.String str54 = surnamesDictionary28.pick(language49);
        java.lang.String str55 = surnamesDictionary17.pick(language49);
        io.resourcepool.model.Fortune fortune56 = fortunesDictionary0.pick(language49);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortuneList4);
        org.junit.Assert.assertTrue("'" + language5 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language5.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertNotNull(fortune7);
        org.junit.Assert.assertNotNull(fortune8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(languageArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(languageArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + language20 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language20.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language21 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language21.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en" + "'", str22, "en");
        org.junit.Assert.assertNotNull(languageArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20000 + "'", int24 == 20000);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20000 + "'", int27 == 20000);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(languageArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Shaull" + "'", str35, "Shaull");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Shaull" + "'", str36, "Shaull");
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Shaull" + "'", str44, "Shaull");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Shaull" + "'", str45, "Shaull");
        org.junit.Assert.assertNotNull(fortuneList48);
        org.junit.Assert.assertTrue("'" + language49 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language49.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "en" + "'", str50, "en");
        org.junit.Assert.assertNotNull(fortune51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Shaull" + "'", str52, "Shaull");
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Shaull" + "'", str54, "Shaull");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Shaull" + "'", str55, "Shaull");
        org.junit.Assert.assertNotNull(fortune56);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        io.resourcepool.model.GivenName givenName1 = simpleNameGenerator0.nextGivenName();
        java.util.List<java.lang.String> strList3 = simpleNameGenerator0.nextSurnames((int) '#');
        org.junit.Assert.assertNotNull(givenName1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList7 = simpleNameGenerator0.nextNicknames(100);
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames((int) '4');
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.model.FullName fullName12 = givenName10.toFullName("Mary");
        java.lang.String str13 = givenName10.toString();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertNotNull(fullName12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GivenName{givenName='Mary', nickname='Mamie23', gender=FEMALE}" + "'", str13, "GivenName{givenName='Mary', nickname='Mamie23', gender=FEMALE}");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        java.util.List<io.resourcepool.model.Fortune> fortuneList2 = simpleFortuneGenerator0.nextFortunes(1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.random();
        java.lang.String str4 = language3.getLocaleCode();
        io.resourcepool.model.Fortune fortune5 = simpleFortuneGenerator0.nextFortune(language3);
        java.util.List<io.resourcepool.model.Fortune> fortuneList7 = simpleFortuneGenerator0.nextFortunes((int) (short) 0);
        java.util.List<io.resourcepool.model.Fortune> fortuneList9 = simpleFortuneGenerator0.nextFortunes((int) '4');
        io.resourcepool.model.Fortune fortune10 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Language language12 = io.resourcepool.model.Language.random();
        java.lang.String str13 = language12.getLocaleCode();
        java.lang.String str14 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language12);
        java.lang.String str15 = language12.getLocaleCode();
        java.util.List<io.resourcepool.model.Fortune> fortuneList16 = io.resourcepool.dictionary.loader.FortuneLoader.load(language12);
        io.resourcepool.model.Fortune fortune17 = simpleFortuneGenerator0.nextFortune(language12);
        io.resourcepool.model.Fortune fortune18 = simpleFortuneGenerator0.nextFortune();
        org.junit.Assert.assertNotNull(fortuneList2);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertNotNull(fortune5);
        org.junit.Assert.assertNotNull(fortuneList7);
        org.junit.Assert.assertNotNull(fortuneList9);
        org.junit.Assert.assertNotNull(fortune10);
        org.junit.Assert.assertTrue("'" + language12 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language12.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!19" + "'", str14, "hi!19");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertNotNull(fortuneList16);
        org.junit.Assert.assertNotNull(fortune17);
        org.junit.Assert.assertNotNull(fortune18);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 0);
        io.resourcepool.model.FullName fullName7 = simpleNameGenerator0.nextName();
        java.lang.String str8 = simpleNameGenerator0.nextNickname();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(fullName7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mamie23" + "'", str8, "Mamie23");
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
        io.resourcepool.model.GivenName givenName10 = simpleNameGenerator0.nextGivenName();
        java.lang.String str11 = givenName10.givenName;
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary12 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary13 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray14 = new io.resourcepool.model.Language[] {};
        int int15 = surnamesDictionary13.size(languageArray14);
        int int16 = givenNamesDictionary12.size(languageArray14);
        java.util.List<io.resourcepool.model.GivenName> givenNameList18 = givenNamesDictionary12.pick(10);
        boolean boolean19 = givenName10.equals((java.lang.Object) 10);
        io.resourcepool.model.FullName fullName21 = givenName10.toFullName("Cutiehi!");
        java.lang.String str22 = fullName21.surname;
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(givenName10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mary" + "'", str11, "Mary");
        org.junit.Assert.assertNotNull(languageArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(givenNameList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fullName21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cutiehi!" + "'", str22, "Cutiehi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        java.lang.String str3 = surnamesDictionary0.pick();
        java.util.List<java.lang.String> strList5 = surnamesDictionary0.pick((int) (short) 100);
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Shaull" + "'", str3, "Shaull");
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
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
        java.util.List<io.resourcepool.model.GivenName> givenNameList13 = givenNamesDictionary0.pick((int) 'a');
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
        io.resourcepool.generator.Query query26 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray24);
        java.util.List<java.lang.String> strList27 = surnamesDictionary14.pick(query26);
        java.util.List<io.resourcepool.model.GivenName> givenNameList28 = givenNamesDictionary0.pick(query26);
        io.resourcepool.model.GivenName givenName29 = givenNamesDictionary0.pick();
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
        org.junit.Assert.assertNotNull(givenNameList28);
        org.junit.Assert.assertNotNull(givenName29);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 1);
        java.lang.String str7 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList9 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames(0);
        io.resourcepool.model.FullName fullName12 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList14 = simpleNameGenerator0.nextSurnames((int) (byte) -1);
        java.util.List<java.lang.String> strList16 = simpleNameGenerator0.nextNicknames((int) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(fullName12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        io.resourcepool.generator.impl.SimpleFortuneGenerator simpleFortuneGenerator0 = new io.resourcepool.generator.impl.SimpleFortuneGenerator();
        io.resourcepool.model.Fortune fortune1 = simpleFortuneGenerator0.nextFortune();
        io.resourcepool.model.Fortune fortune2 = simpleFortuneGenerator0.nextFortune();
        java.util.List<io.resourcepool.model.Fortune> fortuneList4 = simpleFortuneGenerator0.nextFortunes(100);
        org.junit.Assert.assertNotNull(fortune1);
        org.junit.Assert.assertNotNull(fortune2);
        org.junit.Assert.assertNotNull(fortuneList4);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList2 = surnamesDictionary0.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary3 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray4 = new io.resourcepool.model.Language[] {};
        int int5 = surnamesDictionary3.size(languageArray4);
        int int6 = surnamesDictionary0.size(languageArray4);
        java.lang.String str7 = surnamesDictionary0.pick();
        java.lang.String str8 = surnamesDictionary0.pick();
        int int9 = surnamesDictionary0.size();
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
        java.util.List<io.resourcepool.model.Fortune> fortuneList21 = fortunesDictionary10.pick(2000);
        io.resourcepool.model.Fortune fortune22 = fortunesDictionary10.pick();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary23 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray24 = new io.resourcepool.model.Language[] {};
        int int25 = surnamesDictionary23.size(languageArray24);
        io.resourcepool.model.Language language26 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.random();
        java.lang.String str28 = language27.getLocaleCode();
        io.resourcepool.model.Language[] languageArray29 = new io.resourcepool.model.Language[] { language26, language27 };
        int int30 = surnamesDictionary23.size(languageArray29);
        int int31 = fortunesDictionary10.size(languageArray29);
        io.resourcepool.model.Fortune fortune32 = fortunesDictionary10.pick();
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
        io.resourcepool.generator.Query.Builder builder57 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary58 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary59 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray60 = new io.resourcepool.model.Language[] {};
        int int61 = surnamesDictionary59.size(languageArray60);
        int int62 = givenNamesDictionary58.size(languageArray60);
        io.resourcepool.generator.Query.Builder builder63 = builder57.languages(languageArray60);
        int int64 = surnamesDictionary34.size(languageArray60);
        io.resourcepool.generator.Query query65 = new io.resourcepool.generator.Query((int) '4', languageArray60);
        int int66 = fortunesDictionary10.size(languageArray60);
        int int67 = surnamesDictionary0.size(languageArray60);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(languageArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Shaull" + "'", str7, "Shaull");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Shaull" + "'", str8, "Shaull");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11812 + "'", int11 == 11812);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(languageArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fortuneList21);
        org.junit.Assert.assertNotNull(fortune22);
        org.junit.Assert.assertNotNull(languageArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + language26 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language26.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en" + "'", str28, "en");
        org.junit.Assert.assertNotNull(languageArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20000 + "'", int30 == 20000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
        org.junit.Assert.assertNotNull(fortune32);
        org.junit.Assert.assertNotNull(languageArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language38 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language38.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en" + "'", str39, "en");
        org.junit.Assert.assertNotNull(languageArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20000 + "'", int41 == 20000);
        org.junit.Assert.assertTrue("'" + language43 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language43.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "en" + "'", str44, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!78" + "'", str45, "hi!78");
        org.junit.Assert.assertTrue("'" + language47 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language47.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "en" + "'", str48, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!32" + "'", str49, "hi!32");
        org.junit.Assert.assertTrue("'" + language50 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language50.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "en" + "'", str51, "en");
        org.junit.Assert.assertTrue("'" + language52 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language52.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language53 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language53.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "en" + "'", str54, "en");
        org.junit.Assert.assertNotNull(languageArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 50000 + "'", int56 == 50000);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(languageArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.util.List<java.lang.String> strList6 = simpleNameGenerator0.nextSurnames((int) (byte) 0);
        io.resourcepool.model.GivenName givenName7 = simpleNameGenerator0.nextGivenName();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary8 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary9 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray10 = new io.resourcepool.model.Language[] {};
        int int11 = surnamesDictionary9.size(languageArray10);
        int int12 = givenNamesDictionary8.size(languageArray10);
        java.util.List<io.resourcepool.model.GivenName> givenNameList14 = givenNamesDictionary8.pick((int) ' ');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary15 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray16 = new io.resourcepool.model.Language[] {};
        int int17 = surnamesDictionary15.size(languageArray16);
        int int18 = givenNamesDictionary8.size(languageArray16);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary19 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList21 = surnamesDictionary19.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary22 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray23 = new io.resourcepool.model.Language[] {};
        int int24 = surnamesDictionary22.size(languageArray23);
        int int25 = surnamesDictionary19.size(languageArray23);
        int int26 = givenNamesDictionary8.size(languageArray23);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary27 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary28 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray29 = new io.resourcepool.model.Language[] {};
        int int30 = surnamesDictionary28.size(languageArray29);
        int int31 = givenNamesDictionary27.size(languageArray29);
        java.util.List<io.resourcepool.model.GivenName> givenNameList33 = givenNamesDictionary27.pick((int) ' ');
        java.util.List<io.resourcepool.model.GivenName> givenNameList35 = givenNamesDictionary27.pick((int) (short) 100);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary36 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray37 = new io.resourcepool.model.Language[] {};
        int int38 = surnamesDictionary36.size(languageArray37);
        io.resourcepool.model.Language language39 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language40 = io.resourcepool.model.Language.random();
        java.lang.String str41 = language40.getLocaleCode();
        io.resourcepool.model.Language[] languageArray42 = new io.resourcepool.model.Language[] { language39, language40 };
        int int43 = surnamesDictionary36.size(languageArray42);
        io.resourcepool.model.Language language45 = io.resourcepool.model.Language.random();
        java.lang.String str46 = language45.getLocaleCode();
        java.lang.String str47 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language45);
        io.resourcepool.model.Language language49 = io.resourcepool.model.Language.random();
        java.lang.String str50 = language49.getLocaleCode();
        java.lang.String str51 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language49);
        io.resourcepool.model.Language language52 = io.resourcepool.model.Language.random();
        java.lang.String str53 = language52.getLocaleCode();
        io.resourcepool.model.Language language54 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language55 = io.resourcepool.model.Language.random();
        java.lang.String str56 = language55.getLocaleCode();
        io.resourcepool.model.Language[] languageArray57 = new io.resourcepool.model.Language[] { language45, language49, language52, language54, language55 };
        int int58 = surnamesDictionary36.size(languageArray57);
        io.resourcepool.generator.Query.Builder builder59 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary60 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary61 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray62 = new io.resourcepool.model.Language[] {};
        int int63 = surnamesDictionary61.size(languageArray62);
        int int64 = givenNamesDictionary60.size(languageArray62);
        io.resourcepool.generator.Query.Builder builder65 = builder59.languages(languageArray62);
        int int66 = surnamesDictionary36.size(languageArray62);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary68 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray69 = new io.resourcepool.model.Language[] {};
        int int70 = surnamesDictionary68.size(languageArray69);
        io.resourcepool.model.Language language71 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language72 = io.resourcepool.model.Language.random();
        java.lang.String str73 = language72.getLocaleCode();
        io.resourcepool.model.Language[] languageArray74 = new io.resourcepool.model.Language[] { language71, language72 };
        int int75 = surnamesDictionary68.size(languageArray74);
        io.resourcepool.generator.Query query76 = new io.resourcepool.generator.Query((int) (byte) 0, languageArray74);
        java.util.List<java.lang.String> strList77 = surnamesDictionary36.pick(query76);
        io.resourcepool.model.Language[] languageArray78 = query76.languages;
        java.util.List<io.resourcepool.model.GivenName> givenNameList79 = givenNamesDictionary27.pick(query76);
        java.util.List<io.resourcepool.model.GivenName> givenNameList80 = givenNamesDictionary8.pick(query76);
        java.util.List<io.resourcepool.model.FullName> fullNameList81 = simpleNameGenerator0.nextNames(query76);
        java.lang.String str82 = simpleNameGenerator0.nextNickname();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(givenName7);
        org.junit.Assert.assertNotNull(languageArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(givenNameList14);
        org.junit.Assert.assertNotNull(languageArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(languageArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(givenNameList33);
        org.junit.Assert.assertNotNull(givenNameList35);
        org.junit.Assert.assertNotNull(languageArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + language39 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language39.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language40 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language40.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "en" + "'", str41, "en");
        org.junit.Assert.assertNotNull(languageArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20000 + "'", int43 == 20000);
        org.junit.Assert.assertTrue("'" + language45 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language45.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "en" + "'", str46, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!11" + "'", str47, "hi!11");
        org.junit.Assert.assertTrue("'" + language49 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language49.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "en" + "'", str50, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!16" + "'", str51, "hi!16");
        org.junit.Assert.assertTrue("'" + language52 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language52.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "en" + "'", str53, "en");
        org.junit.Assert.assertTrue("'" + language54 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language54.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language55 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language55.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "en" + "'", str56, "en");
        org.junit.Assert.assertNotNull(languageArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 50000 + "'", int58 == 50000);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(languageArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(languageArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + language71 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language71.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language72 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language72.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "en" + "'", str73, "en");
        org.junit.Assert.assertNotNull(languageArray74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 20000 + "'", int75 == 20000);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(languageArray78);
        org.junit.Assert.assertNotNull(givenNameList79);
        org.junit.Assert.assertNotNull(givenNameList80);
        org.junit.Assert.assertNotNull(fullNameList81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Mamie23" + "'", str82, "Mamie23");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        io.resourcepool.model.FullName fullName7 = simpleNameGenerator0.nextName();
        java.lang.String str8 = fullName7.toString();
        java.lang.String str9 = fullName7.givenName;
        boolean boolean11 = fullName7.equals((java.lang.Object) "hi!45");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(fullName7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}" + "'", str8, "FullName{givenName='Mary', surname='Shaull', nickname='Mamie23', gender=FEMALE}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Mary" + "'", str9, "Mary");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        io.resourcepool.model.Gender gender2 = io.resourcepool.model.Gender.MALE;
        io.resourcepool.model.GivenName givenName3 = new io.resourcepool.model.GivenName("Shaull", "", gender2);
        io.resourcepool.model.GivenName givenName4 = givenName3.clone();
        io.resourcepool.model.FullName fullName6 = givenName4.toFullName("Mamie23");
        java.lang.String str7 = givenName4.nickname;
        io.resourcepool.model.FullName fullName9 = givenName4.toFullName("hi!10");
        org.junit.Assert.assertTrue("'" + gender2 + "' != '" + io.resourcepool.model.Gender.MALE + "'", gender2.equals(io.resourcepool.model.Gender.MALE));
        org.junit.Assert.assertNotNull(givenName4);
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(fullName9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator6 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList8 = simpleNameGenerator6.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList10 = simpleNameGenerator6.nextGivenNames(100);
        java.lang.String str11 = simpleNameGenerator6.nextSurname();
        io.resourcepool.model.FullName fullName12 = simpleNameGenerator6.nextName();
        java.lang.String str13 = fullName12.surname;
        io.resourcepool.model.Gender gender14 = fullName12.gender;
        io.resourcepool.model.GivenName givenName15 = new io.resourcepool.model.GivenName("hi!28", "If at first you don't succeed, try something else.", gender14);
        io.resourcepool.model.GivenName givenName16 = new io.resourcepool.model.GivenName("FullName{givenName='Shaull', surname='Mamie23', nickname='', gender=MALE}", "hi!51", gender14);
        io.resourcepool.model.GivenName givenName17 = new io.resourcepool.model.GivenName("hi!55", "hi!55", gender14);
        io.resourcepool.model.Gender gender18 = givenName17.gender;
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(givenNameList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Shaull" + "'", str11, "Shaull");
        org.junit.Assert.assertNotNull(fullName12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Shaull" + "'", str13, "Shaull");
        org.junit.Assert.assertTrue("'" + gender14 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender14.equals(io.resourcepool.model.Gender.FEMALE));
        org.junit.Assert.assertTrue("'" + gender18 + "' != '" + io.resourcepool.model.Gender.FEMALE + "'", gender18.equals(io.resourcepool.model.Gender.FEMALE));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        io.resourcepool.generator.Query.Builder builder1 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary2 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary3 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray4 = new io.resourcepool.model.Language[] {};
        int int5 = surnamesDictionary3.size(languageArray4);
        int int6 = givenNamesDictionary2.size(languageArray4);
        io.resourcepool.generator.Query.Builder builder7 = builder1.languages(languageArray4);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary8 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int9 = fortunesDictionary8.size();
        io.resourcepool.generator.Query.Builder builder10 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary11 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary12 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray13 = new io.resourcepool.model.Language[] {};
        int int14 = surnamesDictionary12.size(languageArray13);
        int int15 = givenNamesDictionary11.size(languageArray13);
        io.resourcepool.generator.Query.Builder builder16 = builder10.languages(languageArray13);
        int int17 = fortunesDictionary8.size(languageArray13);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary18 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray19 = new io.resourcepool.model.Language[] {};
        int int20 = surnamesDictionary18.size(languageArray19);
        io.resourcepool.model.Language language21 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language22 = io.resourcepool.model.Language.random();
        java.lang.String str23 = language22.getLocaleCode();
        io.resourcepool.model.Language[] languageArray24 = new io.resourcepool.model.Language[] { language21, language22 };
        int int25 = surnamesDictionary18.size(languageArray24);
        io.resourcepool.model.Language language27 = io.resourcepool.model.Language.random();
        java.lang.String str28 = language27.getLocaleCode();
        java.lang.String str29 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language27);
        io.resourcepool.model.Language language31 = io.resourcepool.model.Language.random();
        java.lang.String str32 = language31.getLocaleCode();
        java.lang.String str33 = io.resourcepool.util.NicknameCreator.fromFirstName("hi!", language31);
        io.resourcepool.model.Language language34 = io.resourcepool.model.Language.random();
        java.lang.String str35 = language34.getLocaleCode();
        io.resourcepool.model.Language language36 = io.resourcepool.model.Language.random();
        io.resourcepool.model.Language language37 = io.resourcepool.model.Language.random();
        java.lang.String str38 = language37.getLocaleCode();
        io.resourcepool.model.Language[] languageArray39 = new io.resourcepool.model.Language[] { language27, language31, language34, language36, language37 };
        int int40 = surnamesDictionary18.size(languageArray39);
        int int41 = fortunesDictionary8.size(languageArray39);
        io.resourcepool.generator.Query.Builder builder42 = builder1.languages(languageArray39);
        io.resourcepool.dictionary.impl.FortunesDictionary fortunesDictionary43 = new io.resourcepool.dictionary.impl.FortunesDictionary();
        int int44 = fortunesDictionary43.size();
        io.resourcepool.generator.Query.Builder builder45 = io.resourcepool.generator.Query.builder();
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary46 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary47 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray48 = new io.resourcepool.model.Language[] {};
        int int49 = surnamesDictionary47.size(languageArray48);
        int int50 = givenNamesDictionary46.size(languageArray48);
        io.resourcepool.generator.Query.Builder builder51 = builder45.languages(languageArray48);
        int int52 = fortunesDictionary43.size(languageArray48);
        io.resourcepool.generator.Query.Builder builder53 = builder42.languages(languageArray48);
        io.resourcepool.generator.Query query54 = new io.resourcepool.generator.Query((int) ' ', languageArray48);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(languageArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11812 + "'", int9 == 11812);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(languageArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(languageArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + language21 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language21.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language22 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language22.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en" + "'", str23, "en");
        org.junit.Assert.assertNotNull(languageArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20000 + "'", int25 == 20000);
        org.junit.Assert.assertTrue("'" + language27 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language27.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en" + "'", str28, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!53" + "'", str29, "hi!53");
        org.junit.Assert.assertTrue("'" + language31 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language31.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "en" + "'", str32, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!31" + "'", str33, "hi!31");
        org.junit.Assert.assertTrue("'" + language34 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language34.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "en" + "'", str35, "en");
        org.junit.Assert.assertTrue("'" + language36 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language36.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language37 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language37.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en" + "'", str38, "en");
        org.junit.Assert.assertNotNull(languageArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 50000 + "'", int40 == 50000);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 50000 + "'", int41 == 50000);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 11812 + "'", int44 == 11812);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(languageArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        io.resourcepool.generator.impl.SimpleNameGenerator simpleNameGenerator0 = new io.resourcepool.generator.impl.SimpleNameGenerator();
        java.util.List<java.lang.String> strList2 = simpleNameGenerator0.nextSurnames(1);
        java.util.List<io.resourcepool.model.GivenName> givenNameList4 = simpleNameGenerator0.nextGivenNames(100);
        java.lang.String str5 = simpleNameGenerator0.nextSurname();
        io.resourcepool.model.FullName fullName6 = simpleNameGenerator0.nextName();
        java.util.List<java.lang.String> strList8 = simpleNameGenerator0.nextNicknames(4305);
        java.lang.String str9 = simpleNameGenerator0.nextSurname();
        java.util.List<java.lang.String> strList11 = simpleNameGenerator0.nextSurnames((int) (byte) 100);
        io.resourcepool.model.FullName fullName12 = simpleNameGenerator0.nextName();
        io.resourcepool.model.FullName fullName13 = simpleNameGenerator0.nextName();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(givenNameList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Shaull" + "'", str5, "Shaull");
        org.junit.Assert.assertNotNull(fullName6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Shaull" + "'", str9, "Shaull");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(fullName12);
        org.junit.Assert.assertNotNull(fullName13);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        io.resourcepool.generator.Query.Builder builder0 = io.resourcepool.generator.Query.builder();
        io.resourcepool.generator.Query.Builder builder2 = builder0.count(10000);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary0 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray1 = new io.resourcepool.model.Language[] {};
        int int2 = surnamesDictionary0.size(languageArray1);
        io.resourcepool.model.Language language3 = io.resourcepool.model.Language.ENGLISH;
        io.resourcepool.model.Language language4 = io.resourcepool.model.Language.random();
        java.lang.String str5 = language4.getLocaleCode();
        io.resourcepool.model.Language[] languageArray6 = new io.resourcepool.model.Language[] { language3, language4 };
        int int7 = surnamesDictionary0.size(languageArray6);
        io.resourcepool.model.Language language8 = io.resourcepool.model.Language.random();
        java.lang.String str9 = surnamesDictionary0.pick(language8);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary10 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        int int11 = surnamesDictionary10.size();
        io.resourcepool.generator.Query.Builder builder12 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray13 = null;
        io.resourcepool.generator.Query.Builder builder14 = builder12.languages(languageArray13);
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary15 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary16 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray17 = new io.resourcepool.model.Language[] {};
        int int18 = surnamesDictionary16.size(languageArray17);
        int int19 = givenNamesDictionary15.size(languageArray17);
        java.util.List<io.resourcepool.model.GivenName> givenNameList21 = givenNamesDictionary15.pick((int) ' ');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary22 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray23 = new io.resourcepool.model.Language[] {};
        int int24 = surnamesDictionary22.size(languageArray23);
        int int25 = givenNamesDictionary15.size(languageArray23);
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary26 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        java.util.List<java.lang.String> strList28 = surnamesDictionary26.pick((int) 'a');
        io.resourcepool.dictionary.impl.SurnamesDictionary surnamesDictionary29 = new io.resourcepool.dictionary.impl.SurnamesDictionary();
        io.resourcepool.model.Language[] languageArray30 = new io.resourcepool.model.Language[] {};
        int int31 = surnamesDictionary29.size(languageArray30);
        int int32 = surnamesDictionary26.size(languageArray30);
        int int33 = givenNamesDictionary15.size(languageArray30);
        io.resourcepool.generator.Query.Builder builder34 = builder14.languages(languageArray30);
        int int35 = surnamesDictionary10.size(languageArray30);
        int int36 = surnamesDictionary0.size(languageArray30);
        org.junit.Assert.assertNotNull(languageArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + language3 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language3.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertTrue("'" + language4 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language4.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en" + "'", str5, "en");
        org.junit.Assert.assertNotNull(languageArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + language8 + "' != '" + io.resourcepool.model.Language.ENGLISH + "'", language8.equals(io.resourcepool.model.Language.ENGLISH));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Shaull" + "'", str9, "Shaull");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(languageArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(givenNameList21);
        org.junit.Assert.assertNotNull(languageArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        io.resourcepool.dictionary.impl.GivenNamesDictionary givenNamesDictionary0 = new io.resourcepool.dictionary.impl.GivenNamesDictionary();
        int int1 = givenNamesDictionary0.size();
        io.resourcepool.model.GivenName givenName2 = givenNamesDictionary0.pick();
        io.resourcepool.generator.Query.Builder builder3 = io.resourcepool.generator.Query.builder();
        io.resourcepool.model.Language[] languageArray4 = null;
        io.resourcepool.generator.Query.Builder builder5 = builder3.languages(languageArray4);
        io.resourcepool.generator.Query query6 = builder3.build();
        java.util.List<io.resourcepool.model.GivenName> givenNameList7 = givenNamesDictionary0.pick(query6);
        java.util.List<io.resourcepool.model.GivenName> givenNameList9 = givenNamesDictionary0.pick(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4305 + "'", int1 == 4305);
        org.junit.Assert.assertNotNull(givenName2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(query6);
        org.junit.Assert.assertNotNull(givenNameList7);
        org.junit.Assert.assertNotNull(givenNameList9);
    }
}
