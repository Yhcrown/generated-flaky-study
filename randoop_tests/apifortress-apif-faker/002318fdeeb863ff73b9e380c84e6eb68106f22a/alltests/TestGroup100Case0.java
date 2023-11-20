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
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.FORBRUGSFORENINGEN;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.FORBRUGSFORENINGEN + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.FORBRUGSFORENINGEN));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.util.List<com.github.javafaker.service.files.EnFile> enFileList0 = com.github.javafaker.service.files.EnFile.getFiles();
        org.junit.Assert.assertNotNull(enFileList0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.DISCOVER;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.DISCOVER + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.DISCOVER));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = util1.manipulateModel(0, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type groovy.json.JsonException; message: Unable to determine the current character, it is not a string, number, array, or object??The current character read is 'h' with an int value of 104?Unable to determine the current character, it is not a string, number, array, or object?line number 1?index number 0?hi!?^");
        } catch (groovy.json.JsonException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.MASTERCARD;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.MASTERCARD + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.MASTERCARD));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        int int0 = com.apifortress.apiffaker.Util.getMODE_INSERT_FLAT();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.FIREFOX;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.FIREFOX + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.FIREFOX));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.util.Locale locale0 = null;
        com.github.javafaker.service.RandomService randomService1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.service.FakeValuesService fakeValuesService2 = new com.github.javafaker.service.FakeValuesService(locale0, randomService1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: locale is required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        // The following exception was thrown during execution in test generation
        try {
            util1.manipulateNode(6, (java.lang.Object) 100L, (java.lang.Object) (-1), (java.lang.Object) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke method integer() on null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = f0.zipCode("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: address.postcode_by_state.hi! resulted in null expression");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        int int0 = com.apifortress.apiffaker.Util.getMODE_REMOVE();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.AOL;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.AOL + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.AOL));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        int int0 = com.apifortress.apiffaker.Main.getRANDOM();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.DANKORT;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.DANKORT + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.DANKORT));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.NETSCAPE;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.NETSCAPE + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.NETSCAPE));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.CHROME;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.CHROME + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.CHROME));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.util.Locale locale0 = null;
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = com.github.javafaker.Faker.instance(locale0, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: locale is required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.github.javafaker.Faker faker0 = null;
        com.github.javafaker.Job job1 = new com.github.javafaker.Job(faker0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = job1.field();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        int int0 = com.apifortress.apiffaker.Util.getMODE_SUBSTITUTE_FLAT();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.AMERICAN_EXPRESS;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.AMERICAN_EXPRESS + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.AMERICAN_EXPRESS));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.INTERNET_EXPLORER;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.INTERNET_EXPLORER + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.INTERNET_EXPLORER));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.github.javafaker.Faker faker0 = null;
        com.github.javafaker.Lebowski lebowski1 = new com.github.javafaker.Lebowski(faker0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = lebowski1.quote();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.github.javafaker.Faker faker0 = null;
        com.github.javafaker.Job job1 = new com.github.javafaker.Job(faker0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = job1.keySkills();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        java.lang.Object obj5 = util1.setLocale("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = util1.fillModel("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Text must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.github.javafaker.Faker faker0 = null;
        com.github.javafaker.Lebowski lebowski1 = new com.github.javafaker.Lebowski(faker0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = lebowski1.character();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.cityPrefix();
        java.lang.String str3 = f0.invalidSSN();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Bouvet Island (Bouvetoya)" + "'", str1, "Bouvet Island (Bouvetoya)");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "East" + "'", str2, "East");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "907545+0322" + "'", str3, "907545+0322");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.github.javafaker.Faker faker0 = null;
        com.github.javafaker.Currency currency1 = new com.github.javafaker.Currency(faker0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = currency1.name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.util.Locale locale0 = null;
        java.util.Random random1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, random1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: locale is required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        int int5 = f0.integer(0);
        java.lang.String str6 = f0.domainName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Somalia" + "'", str1, "Somalia");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Karachi" + "'", str2, "Asia/Karachi");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "14.60" + "'", str3, "14.60");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 14 + "'", int5 == 14);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "balistreri.co" + "'", str6, "balistreri.co");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.domainName();
        java.lang.String str7 = f0.fullAddress();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Congo" + "'", str1, "Congo");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Africa/Cairo" + "'", str2, "Africa/Cairo");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fahey.co" + "'", str6, "fahey.co");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3133 Gabrielle Throughway, South Rickymouth, MD 23293-9727" + "'", str7, "3133 Gabrielle Throughway, South Rickymouth, MD 23293-9727");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = f0.password(7, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5e3f54ca-a79b-405b-b8a5-095a9b38a273" + "'", str1, "5e3f54ca-a79b-405b-b8a5-095a9b38a273");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        com.apifortress.apiffaker.F f3 = new com.apifortress.apiffaker.F();
        java.lang.String str4 = f3.country();
        java.lang.String str5 = f3.timeZone();
        int int8 = f3.integer((int) (short) 10, (int) (short) 10);
        java.lang.Object obj9 = util1.fillModel((java.lang.Object) int8);
        org.junit.Assert.assertNotNull(f2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ethiopia" + "'", str4, "Ethiopia");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Europe/Bratislava" + "'", str5, "Europe/Bratislava");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        com.apifortress.apiffaker.F f4 = util1.getFaker();
        org.junit.Assert.assertNull(f4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        java.lang.String str3 = f2.currencyCode();
        java.lang.String str4 = f2.profession();
        org.junit.Assert.assertNotNull(f2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZAR" + "'", str3, "ZAR");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gardener" + "'", str4, "gardener");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        int int0 = com.apifortress.apiffaker.Util.getMODE_SUBSTITUTE();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.OPERA;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.OPERA + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.OPERA));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.validSSN();
        java.lang.String str2 = f0.fullName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "240803-3567" + "'", str1, "240803-3567");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ron Schaden" + "'", str2, "Ron Schaden");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
// flaky:         com.apifortress.apiffaker.Main.stressTest(7, (int) (byte) 10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Commerce commerce2 = faker1.commerce();
        java.lang.String str3 = commerce2.material();
        java.lang.String str4 = commerce2.price();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(commerce2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aluminum" + "'", str3, "Aluminum");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "46.81" + "'", str4, "46.81");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        int int0 = com.apifortress.apiffaker.Util.getMODE_REMOVE_FLAT();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.apifortress.apiffaker.Util util0 = new com.apifortress.apiffaker.Util();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str7 = internet2.image((java.lang.Integer) 749, (java.lang.Integer) 6, (java.lang.Boolean) false, "CFA Franc BEAC");
        java.lang.String str8 = internet2.ipV4Cidr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = internet2.password(100, (int) (short) 0, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://lorempixel.com/749/6/business/CFA Franc BEAC" + "'", str7, "http://lorempixel.com/749/6/business/CFA Franc BEAC");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "140.84.140.165/10" + "'", str8, "140.84.140.165/10");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Commerce commerce2 = faker1.commerce();
        com.github.javafaker.Beer beer3 = faker1.beer();
        java.lang.String str4 = beer3.name();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(commerce2);
        org.junit.Assert.assertNotNull(beer3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Oak Aged Yeti Imperial Stout" + "'", str4, "Oak Aged Yeti Imperial Stout");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        com.github.javafaker.Medical medical3 = faker1.medical();
        com.github.javafaker.GameOfThrones gameOfThrones4 = faker1.gameOfThrones();
        com.github.javafaker.Artist artist5 = faker1.artist();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
        org.junit.Assert.assertNotNull(medical3);
        org.junit.Assert.assertNotNull(gameOfThrones4);
        org.junit.Assert.assertNotNull(artist5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        int int0 = com.apifortress.apiffaker.Util.getMODE_FILL();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker1.resolve("19.18.185.47");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: 19.18.185.47 resulted in null expression");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.lang.String str1 = com.github.javafaker.service.FakerIDN.toASCII("rimxwebrurba");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rimxwebrurba" + "'", str1, "rimxwebrurba");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str3 = f0.suffix();
        java.lang.String str4 = f0.uuid();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Taiwan" + "'", str1, "Taiwan");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "East Caribbean Dollar" + "'", str2, "East Caribbean Dollar");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Inc" + "'", str3, "Inc");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0893c693-6b02-4151-b25a-2cfab03efe1d" + "'", str4, "0893c693-6b02-4151-b25a-2cfab03efe1d");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        java.lang.String str3 = weather2.temperatureFahrenheit();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "43\260F" + "'", str3, "43\260F");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.domainName();
        java.lang.String str7 = f0.validID();
        java.lang.String str8 = f0.firstName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = f0.password((int) (short) 10, (int) (byte) 1, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Albania" + "'", str1, "Albania");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Tokyo" + "'", str2, "Asia/Tokyo");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "koelpin.biz" + "'", str6, "koelpin.biz");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "338-70-0388" + "'", str7, "338-70-0388");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Sang" + "'", str8, "Sang");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        java.lang.String str3 = cat2.name();
        java.lang.String str4 = cat2.name();
        java.lang.String str5 = cat2.breed();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Max" + "'", str3, "Max");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lucy" + "'", str4, "Lucy");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Arabian Mau" + "'", str5, "Arabian Mau");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        com.github.javafaker.Medical medical3 = faker1.medical();
        com.github.javafaker.GameOfThrones gameOfThrones4 = faker1.gameOfThrones();
        java.lang.String str5 = gameOfThrones4.dragon();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
        org.junit.Assert.assertNotNull(medical3);
        org.junit.Assert.assertNotNull(gameOfThrones4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Meraxes" + "'", str5, "Meraxes");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        java.lang.String str4 = f0.currency();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = f0.password(100, 14, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Malawi" + "'", str1, "Malawi");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Vladivostok" + "'", str2, "Asia/Vladivostok");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81.37" + "'", str3, "81.37");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CFP Franc" + "'", str4, "CFP Franc");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        int[] intArray9 = f0.integerList((int) 'a', 10);
        double double12 = f0.decimal((long) 485, (long) 580);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Gibraltar" + "'", str1, "Gibraltar");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "S" + "'", str5, "S");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.elva-leannon.biz" + "'", str6, "www.elva-leannon.biz");
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[71, 23, 48, 19, 50, 38, 23, 71, 61, 50]");
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 558.63d + "'", double12 == 558.63d);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        java.lang.Object obj3 = util1.fillModel((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = util1.manipulateModel((-1), "Saint Helena", 894);
            org.junit.Assert.fail("Expected exception of type groovy.json.JsonException; message: Unable to determine the current character, it is not a string, number, array, or object??The current character read is 'S' with an int value of 83?Unable to determine the current character, it is not a string, number, array, or object?line number 1?index number 0?Saint Helena?^");
        } catch (groovy.json.JsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str5 = f0.password(6, (int) (short) 10);
        java.lang.String str10 = f0.password((int) (short) -1, 4, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Kyrgyz Republic" + "'", str1, "Kyrgyz Republic");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "No universal currency" + "'", str2, "No universal currency");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ohwvtgo" + "'", str5, "ohwvtgo");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "lWb" + "'", str10, "lWb");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.github.javafaker.Faker faker0 = null;
        com.github.javafaker.Job job1 = new com.github.javafaker.Job(faker0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = job1.seniority();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        com.github.javafaker.Medical medical3 = faker1.medical();
        com.github.javafaker.GameOfThrones gameOfThrones4 = faker1.gameOfThrones();
        com.github.javafaker.Robin robin5 = faker1.robin();
        java.lang.String str6 = robin5.quote();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
        org.junit.Assert.assertNotNull(medical3);
        org.junit.Assert.assertNotNull(gameOfThrones4);
        org.junit.Assert.assertNotNull(robin5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Holy Hallelujah" + "'", str6, "Holy Hallelujah");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.productName();
        java.lang.String str2 = f0.streetSuffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Awesome Linen Computer" + "'", str1, "Awesome Linen Computer");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Extension" + "'", str2, "Extension");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Code code2 = faker1.code();
        com.github.javafaker.Avatar avatar3 = faker1.avatar();
        com.github.javafaker.Code code4 = faker1.code();
        java.lang.String str5 = code4.isbnGroup();
        java.lang.String str6 = code4.isbnGs1();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(avatar3);
        org.junit.Assert.assertNotNull(code4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "978" + "'", str6, "978");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.userAgentAny();
        java.lang.String str4 = internet2.image();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)" + "'", str3, "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://lorempixel.com/640/350/city/" + "'", str4, "http://lorempixel.com/640/350/city/");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        java.lang.Object obj5 = util1.setLocale("hi!");
        com.apifortress.apiffaker.F f6 = util1.getFaker();
        com.apifortress.apiffaker.F f7 = new com.apifortress.apiffaker.F();
        java.lang.String str8 = f7.country();
        java.lang.String str9 = f7.timeZone();
        int int12 = f7.integer((int) (short) 10, (int) (short) 10);
        int int13 = f7.streetAddressNumber();
        util1.setFaker(f7);
        int[] intArray16 = f7.integerList(0);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertNotNull(f6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Guam" + "'", str8, "Guam");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pacific/Port_Moresby" + "'", str9, "Pacific/Port_Moresby");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 42 + "'", int13 == 42);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[87, 43, 76, 42, 97, 58, 90, 29, 12, 16]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str3 = f0.suffix();
        java.lang.String str7 = f0.password((int) (short) -1, (int) ' ', false);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Wallis and Futuna" + "'", str1, "Wallis and Futuna");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Falkland Islands Pound" + "'", str2, "Falkland Islands Pound");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LLC" + "'", str3, "LLC");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aulwqwwzpeybknaeplwsjyego" + "'", str7, "aulwqwwzpeybknaeplwsjyego");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.age();
        java.lang.String str4 = dog2.gender();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "young" + "'", str3, "young");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "female" + "'", str4, "female");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.cityPrefix();
        java.lang.String str3 = f0.mobile();
        java.lang.String str4 = f0.suffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Bangladesh" + "'", str1, "Bangladesh");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Port" + "'", str2, "Port");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "864-504-2261" + "'", str3, "864-504-2261");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "and Sons" + "'", str4, "and Sons");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        java.lang.Object obj5 = util1.setLocale("hi!");
        com.apifortress.apiffaker.F f6 = util1.getFaker();
        com.apifortress.apiffaker.F f7 = new com.apifortress.apiffaker.F();
        java.lang.String str8 = f7.country();
        java.lang.String str9 = f7.timeZone();
        int int12 = f7.integer((int) (short) 10, (int) (short) 10);
        int int13 = f7.streetAddressNumber();
        util1.setFaker(f7);
        java.lang.String str15 = f7.suffix();
        java.lang.String str16 = f7.countryCodeSL();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertNotNull(f6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Saint Kitts and Nevis" + "'", str8, "Saint Kitts and Nevis");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pacific/Midway" + "'", str9, "Pacific/Midway");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 61 + "'", int13 == 61);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LLC" + "'", str15, "LLC");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "my" + "'", str16, "my");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Artist artist2 = faker1.artist();
        java.lang.String str3 = artist2.name();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(artist2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rembrandt" + "'", str3, "Rembrandt");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
// flaky:         com.apifortress.apiffaker.Main.stressTest((int) (byte) 0, 6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.ipV6Cidr();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "75d5:3ec0:74d0:81b7:c4f5:6e76:c7e5:611a/114" + "'", str3, "75d5:3ec0:74d0:81b7:c4f5:6e76:c7e5:611a/114");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        com.github.javafaker.Medical medical3 = faker1.medical();
        com.github.javafaker.GameOfThrones gameOfThrones4 = faker1.gameOfThrones();
        java.lang.String str5 = gameOfThrones4.city();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
        org.junit.Assert.assertNotNull(medical3);
        org.junit.Assert.assertNotNull(gameOfThrones4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "White Harbor" + "'", str5, "White Harbor");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        int[] intArray3 = f0.integerList();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "38afde45-e40c-42a5-9f87-3cec06be1db2" + "'", str1, "38afde45-e40c-42a5-9f87-3cec06be1db2");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.14d + "'", double2 == 23.14d);
        org.junit.Assert.assertNotNull(intArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[70, 77, 87, 9, 30, 46, 66, 83, 73, 31]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.github.javafaker.Faker faker0 = null;
        com.github.javafaker.Lebowski lebowski1 = new com.github.javafaker.Lebowski(faker0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = lebowski1.actor();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Code code2 = faker1.code();
        com.github.javafaker.Avatar avatar3 = faker1.avatar();
        java.lang.String str4 = avatar3.image();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(avatar3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "https://s3.amazonaws.com/uifaces/faces/twitter/megdraws/128.jpg" + "'", str4, "https://s3.amazonaws.com/uifaces/faces/twitter/megdraws/128.jpg");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.Util util5 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f6 = util5.getFaker();
        com.apifortress.apiffaker.Util util8 = new com.apifortress.apiffaker.Util("hi!");
        util1.manipulateNode(0, (java.lang.Object) "Morocco", (java.lang.Object) f6, (java.lang.Object) util8, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = util1.fillModel("Asia/Hong_Kong");
            org.junit.Assert.fail("Expected exception of type groovy.json.JsonException; message: Unable to determine the current character, it is not a string, number, array, or object??The current character read is 'A' with an int value of 65?Unable to determine the current character, it is not a string, number, array, or object?line number 1?index number 0?Asia/Hong_Kong?^");
        } catch (groovy.json.JsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(f6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        java.lang.String str3 = f0.lastName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "f3062a9b-2350-4fa1-92d4-68ad65d0747f" + "'", str1, "f3062a9b-2350-4fa1-92d4-68ad65d0747f");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 42.85d + "'", double2 == 42.85d);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medhurst" + "'", str3, "Medhurst");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        java.lang.Object obj5 = util1.setLocale("hi!");
        com.apifortress.apiffaker.F f6 = util1.getFaker();
        com.apifortress.apiffaker.Util util8 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f9 = util8.getFaker();
        boolean boolean10 = f9.getTemplateStyle();
        boolean boolean11 = f9.getTemplateStyle();
        util1.setFaker(f9);
        java.lang.Object obj14 = util1.newNode("rimxwebrurba");
        com.apifortress.apiffaker.Util util16 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f17 = null;
        util16.setFaker(f17);
        java.lang.Object obj20 = util16.setLocale("hi!");
        com.apifortress.apiffaker.F f21 = util16.getFaker();
        com.apifortress.apiffaker.Util util23 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f24 = util23.getFaker();
        boolean boolean25 = f24.getTemplateStyle();
        boolean boolean26 = f24.getTemplateStyle();
        util16.setFaker(f24);
        util1.setFaker(f24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = util1.fillModel("I");
            org.junit.Assert.fail("Expected exception of type groovy.json.JsonException; message: Unable to determine the current character, it is not a string, number, array, or object??The current character read is 'I' with an int value of 73?Unable to determine the current character, it is not a string, number, array, or object?line number 1?index number 0?I?^");
        } catch (groovy.json.JsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertNotNull(f6);
        org.junit.Assert.assertNotNull(f9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj14);
// flaky:         org.junit.Assert.assertEquals(obj14.toString(), "[url_0, ${url}]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[url_0, ${url}]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[url_0, ${url}]");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + true + "'", obj20, true);
        org.junit.Assert.assertNotNull(f21);
        org.junit.Assert.assertNotNull(f24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
// flaky:         com.apifortress.apiffaker.Main.stressTest(14, 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.publicIpV4Address();
        java.lang.String str6 = internet2.password((int) (byte) -1, (int) '4');
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "188.213.9.81" + "'", str3, "188.213.9.81");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7l486363apx797dmpmr66vvhwrlnmgnaxyx" + "'", str6, "7l486363apx797dmpmr66vvhwrlnmgnaxyx");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        java.lang.Object obj5 = util1.setLocale("hi!");
        com.apifortress.apiffaker.F f6 = util1.getFaker();
        com.apifortress.apiffaker.Util util8 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f9 = util8.getFaker();
        boolean boolean10 = f9.getTemplateStyle();
        boolean boolean11 = f9.getTemplateStyle();
        util1.setFaker(f9);
        java.lang.String str13 = f9.password();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertNotNull(f6);
        org.junit.Assert.assertNotNull(f9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "djaddobqo" + "'", str13, "djaddobqo");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Color color4 = faker1.color();
        com.github.javafaker.Beer beer5 = faker1.beer();
        com.github.javafaker.Friends friends6 = faker1.friends();
        java.lang.String str7 = friends6.location();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(beer5);
        org.junit.Assert.assertNotNull(friends6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Marcel's" + "'", str7, "Marcel's");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        boolean boolean3 = f2.getTemplateStyle();
        boolean boolean4 = f2.getTemplateStyle();
        java.lang.String str5 = f2.country();
        org.junit.Assert.assertNotNull(f2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mauritania" + "'", str5, "Mauritania");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.github.javafaker.service.FakeValuesGrouping fakeValuesGrouping0 = new com.github.javafaker.service.FakeValuesGrouping();
        java.util.Map map2 = fakeValuesGrouping0.get("Tahoma");
        com.github.javafaker.service.FakeValues fakeValues3 = null;
        fakeValuesGrouping0.add(fakeValues3);
        org.junit.Assert.assertNull(map2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        java.lang.String str2 = f0.suffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "156b62fe-ee17-4f13-a360-db4f8a4a9c5c" + "'", str1, "156b62fe-ee17-4f13-a360-db4f8a4a9c5c");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Group" + "'", str2, "Group");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.invalidSSN();
        java.lang.String str7 = f0.password((-1), (int) '4', true, false, true);
        java.lang.String str8 = f0.country();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "149489-4060" + "'", str1, "149489-4060");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LHpMC8z27tK43Nk8W9k" + "'", str7, "LHpMC8z27tK43Nk8W9k");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wallis and Futuna" + "'", str8, "Wallis and Futuna");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Code code2 = faker1.code();
        com.github.javafaker.Avatar avatar3 = faker1.avatar();
        com.github.javafaker.Code code4 = faker1.code();
        java.lang.String str5 = code4.isbn10();
        java.lang.String str6 = code4.gtin8();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(avatar3);
        org.junit.Assert.assertNotNull(code4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1135636761" + "'", str5, "1135636761");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "04293903" + "'", str6, "04293903");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Commerce commerce2 = faker1.commerce();
        com.github.javafaker.Beer beer3 = faker1.beer();
        java.lang.String str4 = beer3.hop();
        java.lang.String str5 = beer3.name();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(commerce2);
        org.junit.Assert.assertNotNull(beer3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Sterling" + "'", str4, "Sterling");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chimay Grande R\351serve" + "'", str5, "Chimay Grande R\351serve");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.apifortress.apiffaker.Main.setRANDOM(894);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.invalidSSN();
        java.lang.String str7 = f0.password((-1), (int) '4', true, false, true);
        f0.setTemplateStyle(true);
        java.lang.String str10 = f0.domainSuffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "786442+5792" + "'", str1, "786442+5792");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "r0XTYF4cbW16zK461PBGSc9YEyW0j6V" + "'", str7, "r0XTYF4cbW16zK461PBGSc9YEyW0j6V");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org" + "'", str10, "org");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        java.lang.String str5 = faker1.regexify("Sweden");
        com.github.javafaker.RockBand rockBand6 = faker1.rockBand();
        java.lang.String str7 = rockBand6.name();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Sweden" + "'", str5, "Sweden");
        org.junit.Assert.assertNotNull(rockBand6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Kansas" + "'", str7, "Kansas");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str7 = internet2.image((java.lang.Integer) 749, (java.lang.Integer) 6, (java.lang.Boolean) false, "CFA Franc BEAC");
        java.lang.String str8 = internet2.ipV4Cidr();
        java.lang.String str9 = internet2.ipV4Address();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://lorempixel.com/749/6/technics/CFA Franc BEAC" + "'", str7, "http://lorempixel.com/749/6/technics/CFA Franc BEAC");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "174.162.192.249/15" + "'", str8, "174.162.192.249/15");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "26.98.84.247" + "'", str9, "26.98.84.247");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Stock stock3 = faker1.stock();
        com.github.javafaker.Zelda zelda4 = faker1.zelda();
        java.lang.String str5 = zelda4.character();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(stock3);
        org.junit.Assert.assertNotNull(zelda4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Agahnim" + "'", str5, "Agahnim");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Internet internet3 = faker1.internet();
        java.lang.String str5 = faker1.numerify("a2b36e6c-d014-45fe-ae08-460b82ec80ff");
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a2b36e6c-d014-45fe-ae08-460b82ec80ff" + "'", str5, "a2b36e6c-d014-45fe-ae08-460b82ec80ff");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.SAFARI;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.SAFARI + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.SAFARI));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Code code2 = faker1.code();
        java.lang.String str3 = code2.isbnGs1();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(code2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "978" + "'", str3, "978");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Stock stock3 = faker1.stock();
        com.github.javafaker.Job job4 = faker1.job();
        java.lang.String str5 = job4.position();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(stock3);
        org.junit.Assert.assertNotNull(job4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Technician" + "'", str5, "Technician");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Color color4 = faker1.color();
        java.lang.String str6 = faker1.bothify("Mexico");
        com.github.javafaker.RickAndMorty rickAndMorty7 = faker1.rickAndMorty();
        java.lang.String str8 = rickAndMorty7.quote();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mexico" + "'", str6, "Mexico");
        org.junit.Assert.assertNotNull(rickAndMorty7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pluto's a planet." + "'", str8, "Pluto's a planet.");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.validSSN();
        java.lang.String str4 = f0.password(0, 749);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "791104+0512" + "'", str1, "791104+0512");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foukeycamutejzteuuhwxqhimywhuszvtehspdpuewqifuqtbasqxjrqmectnkpzvhmxlevkgqaujyftlbldbjsqfhxuckpmuxukxanabixweixiecngecscmykhjhzlsotzaixnrwknvochatlakrtyrrmjvsantkuhpbhgillaqdcrhqqtvmhnskegomagyxodkczhxovapbdgljmwdqudkvwiualazrypgevfeljvyrbqlswkeldmhfdtejyvccfayqgsjnrbprcsohlnuewdvfwvvwbocabiajiqitettatnynexzazxxrwmqqvcbvdvnldcvvyenhcxrigtdaintoqblczplktyuhtgzcozwhvsflnyyzjqditlxmfbambmbpmtlmocqliad" + "'", str4, "foukeycamutejzteuuhwxqhimywhuszvtehspdpuewqifuqtbasqxjrqmectnkpzvhmxlevkgqaujyftlbldbjsqfhxuckpmuxukxanabixweixiecngecscmykhjhzlsotzaixnrwknvochatlakrtyrrmjvsantkuhpbhgillaqdcrhqqtvmhnskegomagyxodkczhxovapbdgljmwdqudkvwiualazrypgevfeljvyrbqlswkeldmhfdtejyvccfayqgsjnrbprcsohlnuewdvfwvvwbocabiajiqitettatnynexzazxxrwmqqvcbvdvnldcvvyenhcxrigtdaintoqblczplktyuhtgzcozwhvsflnyyzjqditlxmfbambmbpmtlmocqliad");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Finance finance5 = faker1.finance();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("Guam");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Commerce commerce2 = faker1.commerce();
        com.github.javafaker.Beer beer3 = faker1.beer();
        java.lang.String str4 = beer3.hop();
        java.lang.String str5 = beer3.style();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(commerce2);
        org.junit.Assert.assertNotNull(beer3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tahoma" + "'", str4, "Tahoma");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Merican Ale" + "'", str5, "Merican Ale");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.Util util5 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f6 = util5.getFaker();
        com.apifortress.apiffaker.Util util8 = new com.apifortress.apiffaker.Util("hi!");
        util1.manipulateNode(0, (java.lang.Object) "Morocco", (java.lang.Object) f6, (java.lang.Object) util8, 2);
        int int12 = util8.flatCount((java.lang.Object) "110.99.50.37");
        org.junit.Assert.assertNotNull(f6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Stock stock3 = faker1.stock();
        com.github.javafaker.Zelda zelda4 = faker1.zelda();
        java.lang.String str5 = zelda4.game();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(stock3);
        org.junit.Assert.assertNotNull(zelda4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Phantom Hourglass" + "'", str5, "Phantom Hourglass");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        java.lang.String str3 = cat2.name();
        java.lang.String str4 = cat2.registry();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Jasper" + "'", str3, "Jasper");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Felis Britannica" + "'", str4, "Felis Britannica");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Color color4 = faker1.color();
        com.github.javafaker.Beer beer5 = faker1.beer();
        com.github.javafaker.Code code6 = faker1.code();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(beer5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str7 = internet2.image((java.lang.Integer) 749, (java.lang.Integer) 6, (java.lang.Boolean) false, "CFA Franc BEAC");
        java.lang.String str8 = internet2.macAddress();
        java.lang.String str9 = internet2.domainSuffix();
        java.lang.String str14 = internet2.image((java.lang.Integer) 14, (java.lang.Integer) 7, (java.lang.Boolean) false, "130.245.158.111");
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://lorempixel.com/749/6/food/CFA Franc BEAC" + "'", str7, "http://lorempixel.com/749/6/food/CFA Franc BEAC");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "37:9a:c4:78:87:55" + "'", str8, "37:9a:c4:78:87:55");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "info" + "'", str9, "info");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://lorempixel.com/14/7/transport/130.245.158.111" + "'", str14, "http://lorempixel.com/14/7/transport/130.245.158.111");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.apifortress.apiffaker.Main.setRANDOM((int) (short) 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        boolean boolean3 = f2.getTemplateStyle();
        java.lang.String str4 = f2.promotionCode();
        double double7 = f2.decimal((long) 10, (long) (byte) 100);
        java.lang.String str8 = f2.city();
        org.junit.Assert.assertNotNull(f2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OverwhelmingWinning214324" + "'", str4, "OverwhelmingWinning214324");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 46.23d + "'", double7 == 46.23d);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cherryborough" + "'", str8, "Cherryborough");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.invalidSSN();
        java.lang.String str7 = f0.password((-1), (int) '4', true, false, true);
        java.lang.String str8 = f0.citySuffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "946460+3546" + "'", str1, "946460+3546");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ZU8QMK65558w6Ps1455Siw9wC8wpRV015lPLK6cRQYuR7Y3gge" + "'", str7, "ZU8QMK65558w6Ps1455Siw9wC8wpRV015lPLK6cRQYuR7Y3gge");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mouth" + "'", str8, "mouth");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.productName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Israel" + "'", str1, "Israel");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "q" + "'", str5, "q");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mediocre Silk Pants" + "'", str6, "Mediocre Silk Pants");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        com.github.javafaker.Commerce commerce3 = faker1.commerce();
        java.lang.String str5 = commerce3.promotionCode(61);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
        org.junit.Assert.assertNotNull(commerce3);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnbelievableRebate6344289188895168673683070079611216415125537867073880404673830" + "'", str5, "UnbelievableRebate6344289188895168673683070079611216415125537867073880404673830");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        boolean boolean3 = f2.getTemplateStyle();
        f2.setTemplateStyle(true);
        java.lang.String str6 = f2.creditCardNumber();
        org.junit.Assert.assertNotNull(f2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1228-1221-1221-1431" + "'", str6, "1228-1221-1221-1431");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Commerce commerce2 = faker1.commerce();
        com.github.javafaker.Beer beer3 = faker1.beer();
        com.github.javafaker.Shakespeare shakespeare4 = faker1.shakespeare();
        java.lang.String str5 = shakespeare4.asYouLikeItQuote();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(commerce2);
        org.junit.Assert.assertNotNull(beer3);
        org.junit.Assert.assertNotNull(shakespeare4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Can one desire too much of a good thing?." + "'", str5, "Can one desire too much of a good thing?.");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Code code2 = faker1.code();
        java.lang.String str3 = code2.ean13();
        java.lang.String str4 = code2.gtin8();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(code2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6165347333458" + "'", str3, "6165347333458");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "45334702" + "'", str4, "45334702");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        boolean boolean3 = f2.getTemplateStyle();
        boolean boolean4 = f2.getTemplateStyle();
        java.lang.String str5 = f2.promotionCode();
        org.junit.Assert.assertNotNull(f2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OverwhelmingDiscount191482" + "'", str5, "OverwhelmingDiscount191482");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = util1.newNode("Pluto's a planet.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke method integer() on null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        java.lang.String str5 = faker1.regexify("Sweden");
        com.github.javafaker.RockBand rockBand6 = faker1.rockBand();
        com.github.javafaker.Weather weather7 = faker1.weather();
        java.lang.String str8 = weather7.temperatureCelsius();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Sweden" + "'", str5, "Sweden");
        org.junit.Assert.assertNotNull(rockBand6);
        org.junit.Assert.assertNotNull(weather7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-29\260C" + "'", str8, "-29\260C");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Stock stock3 = faker1.stock();
        java.lang.String str4 = stock3.nyseSymbol();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(stock3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ACV" + "'", str4, "ACV");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Commerce commerce2 = faker1.commerce();
        java.lang.String str3 = commerce2.material();
        java.lang.String str6 = commerce2.price((double) (-1.0f), 10.0d);
        java.lang.String str7 = commerce2.department();
        java.lang.String str8 = commerce2.department();
        java.lang.String str9 = commerce2.productName();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(commerce2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Granite" + "'", str3, "Granite");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5.60" + "'", str6, "5.60");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Jewelry" + "'", str7, "Jewelry");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Grocery" + "'", str8, "Grocery");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Incredible Aluminum Knife" + "'", str9, "Incredible Aluminum Knife");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Address address4 = faker1.address();
        java.lang.String str5 = address4.stateAbbr();
        java.lang.String str6 = address4.city();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = address4.zipCodeByState("Pacific/Pago_Pago");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: address.postcode_by_state.Pacific/Pago_Pago resulted in null expression");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(address4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ND" + "'", str5, "ND");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Gutmannfurt" + "'", str6, "Gutmannfurt");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        int[] intArray9 = f0.integerList((int) 'a', 10);
        boolean boolean10 = f0.getTemplateStyle();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Swaziland" + "'", str1, "Swaziland");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.zane-prosacco.biz" + "'", str6, "www.zane-prosacco.biz");
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[46, 74, 13, 63, 44, 10, 24, 22, 40, 19]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.github.javafaker.idnumbers.SvSEIdNumber svSEIdNumber0 = new com.github.javafaker.idnumbers.SvSEIdNumber();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        com.github.javafaker.Pokemon pokemon3 = faker1.pokemon();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
        org.junit.Assert.assertNotNull(pokemon3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Commerce commerce2 = faker1.commerce();
        com.github.javafaker.Beer beer3 = faker1.beer();
        java.lang.String str4 = beer3.yeast();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(commerce2);
        org.junit.Assert.assertNotNull(beer3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1275 - Thames Valley Ale" + "'", str4, "1275 - Thames Valley Ale");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        int int6 = f0.streetAddressNumber();
        java.lang.String str7 = f0.password();
        java.lang.String str9 = f0.streetAddress((java.lang.Boolean) false);
        java.lang.String str10 = f0.productName();
        double double14 = f0.decimal((long) 374, (long) 894, (int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Niger" + "'", str1, "Niger");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "America/Los_Angeles" + "'", str2, "America/Los_Angeles");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 827 + "'", int6 == 827);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "xrngoovdp" + "'", str7, "xrngoovdp");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9372 Micah Green" + "'", str9, "9372 Micah Green");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Practical Wooden Knife" + "'", str10, "Practical Wooden Knife");
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 786.2125890748266d + "'", double14 == 786.2125890748266d);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = f0.password(42, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Color color4 = faker1.color();
        java.lang.String str5 = color4.hex();
        java.lang.String str6 = color4.name();
        java.lang.String str7 = color4.hex();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(color4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#771F6E" + "'", str5, "#771F6E");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "blue" + "'", str6, "blue");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#8305E6" + "'", str7, "#8305E6");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.publicIpV4Address();
        java.lang.String str4 = internet2.ipV6Cidr();
        java.lang.String str5 = internet2.emailAddress();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = internet2.password(580, 61, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "43.207.235.231" + "'", str3, "43.207.235.231");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "9a0a:64fe:e957:bf3f:4467:8cf2:ab3e:d945/95" + "'", str4, "9a0a:64fe:e957:bf3f:4467:8cf2:ab3e:d945/95");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Stock stock5 = faker1.stock();
        com.github.javafaker.Hipster hipster6 = faker1.hipster();
        java.lang.String str7 = hipster6.word();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(stock5);
        org.junit.Assert.assertNotNull(hipster6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "williamsburg" + "'", str7, "williamsburg");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Color color4 = faker1.color();
        com.github.javafaker.Beer beer5 = faker1.beer();
        com.github.javafaker.Friends friends6 = faker1.friends();
        com.github.javafaker.Esports esports7 = faker1.esports();
        com.github.javafaker.App app8 = faker1.app();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(beer5);
        org.junit.Assert.assertNotNull(friends6);
        org.junit.Assert.assertNotNull(esports7);
        org.junit.Assert.assertNotNull(app8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        int int0 = com.apifortress.apiffaker.Util.getMODE_INSERT();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: locale is required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.productName();
        java.lang.String str2 = f0.invalidSSN();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mediocre Copper Bottle" + "'", str1, "Mediocre Copper Bottle");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "719762-3047" + "'", str2, "719762-3047");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.SWITCH;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.SWITCH + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.SWITCH));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Commerce commerce2 = faker1.commerce();
        java.lang.String str3 = commerce2.material();
        java.lang.String str6 = commerce2.price((double) (-1.0f), 10.0d);
        java.lang.String str7 = commerce2.department();
        java.lang.String str8 = commerce2.department();
        java.lang.String str10 = commerce2.promotionCode((int) (short) 1);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(commerce2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cotton" + "'", str3, "Cotton");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "8.76" + "'", str6, "8.76");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Electronics" + "'", str7, "Electronics");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Books & Movies" + "'", str8, "Books & Movies");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "BreathtakingBenefit5" + "'", str10, "BreathtakingBenefit5");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.url();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panama" + "'", str1, "Panama");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Atlantic/Azores" + "'", str2, "Atlantic/Azores");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.azucena-turner.co" + "'", str6, "www.azucena-turner.co");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        java.lang.String str5 = faker1.regexify("Sweden");
        com.github.javafaker.RockBand rockBand6 = faker1.rockBand();
        com.github.javafaker.Stock stock7 = faker1.stock();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Sweden" + "'", str5, "Sweden");
        org.junit.Assert.assertNotNull(rockBand6);
        org.junit.Assert.assertNotNull(stock7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Commerce commerce2 = faker1.commerce();
        java.lang.String str3 = commerce2.material();
        java.lang.String str4 = commerce2.productName();
        java.lang.String str5 = commerce2.price();
        java.lang.String str6 = commerce2.department();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(commerce2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Copper" + "'", str3, "Copper");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lightweight Leather Watch" + "'", str4, "Lightweight Leather Watch");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.79" + "'", str5, "0.79");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Games, Outdoors & Shoes" + "'", str6, "Games, Outdoors & Shoes");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.currencyCode();
        double double9 = f0.decimal((long) (short) 100, 1700470093997L);
        int[] intArray10 = f0.integerList();
        java.lang.String str11 = f0.domainName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tunisia" + "'", str1, "Tunisia");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Australia/Brisbane" + "'", str2, "Australia/Brisbane");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "USD" + "'", str6, "USD");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.2435779242899E11d + "'", double9 == 8.2435779242899E11d);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[7, 28, 63, 83, 52, 42, 41, 7, 52, 31]");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "gibson.co" + "'", str11, "gibson.co");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        java.lang.String str4 = ancient3.god();
        java.lang.String str5 = ancient3.hero();
        java.lang.String str6 = ancient3.hero();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Artemis" + "'", str4, "Artemis");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Atalanta" + "'", str5, "Atalanta");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chrysippus" + "'", str6, "Chrysippus");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.github.javafaker.Faker faker0 = com.github.javafaker.Faker.instance();
        com.github.javafaker.DragonBall dragonBall1 = faker0.dragonBall();
        org.junit.Assert.assertNotNull(faker0);
        org.junit.Assert.assertNotNull(dragonBall1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        java.lang.String str4 = ancient3.god();
        java.lang.String str5 = ancient3.god();
        java.lang.String str6 = ancient3.hero();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Athena" + "'", str4, "Athena");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hades" + "'", str5, "Hades");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Atalanta" + "'", str6, "Atalanta");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Finance finance3 = faker1.finance();
        java.lang.String str4 = finance3.iban();
        java.lang.String str5 = finance3.bic();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(finance3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IE41VSRK86102980873063" + "'", str4, "IE41VSRK86102980873063");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "NHVVVY16" + "'", str5, "NHVVVY16");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        java.lang.String str4 = f0.currency();
        java.lang.String str5 = f0.fullAddress();
        java.lang.String str6 = f0.domainSuffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Azerbaijan" + "'", str1, "Azerbaijan");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Pacific/Pago_Pago" + "'", str2, "Pacific/Pago_Pago");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48.07" + "'", str3, "48.07");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Canadian Dollar" + "'", str4, "Canadian Dollar");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "66015 Jay Tunnel, Lakinville, MS 92915" + "'", str5, "66015 Jay Tunnel, Lakinville, MS 92915");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com" + "'", str6, "com");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.publicIpV4Address();
        java.lang.String str4 = internet2.ipV6Cidr();
        java.lang.String str5 = internet2.ipV4Address();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "201.153.118.42" + "'", str3, "201.153.118.42");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "c575:d4a3:5464:7f9e:1dee:274d:0bdb:9748/91" + "'", str4, "c575:d4a3:5464:7f9e:1dee:274d:0bdb:9748/91");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "45.210.228.74" + "'", str5, "45.210.228.74");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Currency currency5 = faker1.currency();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        char char8 = lorem6.character(false);
        java.lang.String str11 = lorem6.sentence((-1), 5);
        java.lang.String str12 = lorem6.characters();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(currency5);
        org.junit.Assert.assertNotNull(lorem6);
// flaky:         org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'e' + "'", char8 == 'e');
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "whdnrecz7pb3tj5q8dqon40quowplkebjwsupvbx59nme1hxqhtrfzk4hiwyhio4e9g7cox0ia1uegpacbkuvvh44wichvf57m2sh1h6s63y3cwnos3ca966m3s6lvgg8xj4nm3l84nr3prmvh2y45vl598cax6jio1kyalnpkbnlapp5l5m56dbv8szfmuw0d9avx0xxv9eqo751c0bypjvl7aegtnkwbgydpjfu7zftqlitajeuyu4ymdmhku" + "'", str12, "whdnrecz7pb3tj5q8dqon40quowplkebjwsupvbx59nme1hxqhtrfzk4hiwyhio4e9g7cox0ia1uegpacbkuvvh44wichvf57m2sh1h6s63y3cwnos3ca966m3s6lvgg8xj4nm3l84nr3prmvh2y45vl598cax6jio1kyalnpkbnlapp5l5m56dbv8szfmuw0d9avx0xxv9eqo751c0bypjvl7aegtnkwbgydpjfu7zftqlitajeuyu4ymdmhku");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Finance finance3 = faker1.finance();
        com.github.javafaker.CreditCardType creditCardType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = finance3.creditCard(creditCardType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(finance3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.fullName();
        java.lang.String str7 = f0.cityName();
        int[] intArray9 = f0.integerList(3);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Zimbabwe" + "'", str1, "Zimbabwe");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Tashkent" + "'", str2, "Asia/Tashkent");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mrs. Cherlyn Harber" + "'", str6, "Mrs. Cherlyn Harber");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lake Adachester" + "'", str7, "Lake Adachester");
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[78, 49, 73, 3, 86, 17, 28, 27, 91, 69]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        com.github.javafaker.Medical medical3 = faker1.medical();
        java.lang.String str4 = medical3.medicineName();
        java.lang.String str5 = medical3.medicineName();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
        org.junit.Assert.assertNotNull(medical3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "QUININE ARSENATE" + "'", str4, "QUININE ARSENATE");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LABURNUM ANAGYROIDES FLOWERING TOP" + "'", str5, "LABURNUM ANAGYROIDES FLOWERING TOP");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.validSSN();
        java.lang.String str6 = f0.password((int) (short) 0, (int) (short) 1, true, false);
        java.lang.String str7 = f0.suffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "930320-4540" + "'", str1, "930320-4540");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Group" + "'", str7, "Group");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.Object obj8 = f0.collection((int) (byte) 1, (java.lang.Object) "I");
        java.lang.String str9 = f0.currencyCode();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Kyrgyz Republic" + "'", str1, "Kyrgyz Republic");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e" + "'", str5, "e");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "Data generator 'I' does not exist in extension F" + "'", obj8, "Data generator 'I' does not exist in extension F");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "XCD" + "'", str9, "XCD");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.publicIpV4Address();
        java.lang.String str4 = internet2.ipV6Cidr();
        java.lang.String str5 = internet2.privateIpV4Address();
        java.lang.String str6 = internet2.slug();
        java.lang.String str12 = internet2.password((int) (byte) 0, (int) (byte) 1, false, false, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = internet2.password((int) 'e', (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "108.167.185.165" + "'", str3, "108.167.185.165");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "bd29:19a2:c484:b36b:0d80:d92e:0994:6bb6/115" + "'", str4, "bd29:19a2:c484:b36b:0d80:d92e:0994:6bb6/115");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "172.22.132.77" + "'", str5, "172.22.132.77");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fugit_molestiae" + "'", str6, "fugit_molestiae");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.emailAddress();
        java.lang.String str4 = f0.domainWord();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Czech Republic" + "'", str1, "Czech Republic");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "America/Chihuahua" + "'", str2, "America/Chihuahua");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "conn" + "'", str4, "conn");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = f2.password((int) 'v', 14, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(f2);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Commerce commerce2 = faker1.commerce();
        com.github.javafaker.Beer beer3 = faker1.beer();
        java.lang.String str4 = beer3.hop();
        java.lang.String str5 = beer3.yeast();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(commerce2);
        org.junit.Assert.assertNotNull(beer3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Horizon" + "'", str4, "Horizon");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3724 - Belgian Saison" + "'", str5, "3724 - Belgian Saison");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str3 = f0.suffix();
        java.lang.String str4 = f0.promotionCode();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Slovenia" + "'", str1, "Slovenia");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US Dollar" + "'", str2, "US Dollar");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LLC" + "'", str3, "LLC");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "BreathtakingBenefit133767" + "'", str4, "BreathtakingBenefit133767");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        com.apifortress.apiffaker.F f6 = new com.apifortress.apiffaker.F();
        java.lang.String str7 = f6.country();
        java.lang.String str8 = f6.currency();
        java.lang.String str11 = f6.password(6, (int) (short) 10);
        util1.manipulateNode((int) (byte) 1, (java.lang.Object) "XCD", (java.lang.Object) 6, (java.lang.Object) "543502-2318", (int) (byte) -1);
        com.apifortress.apiffaker.F f15 = util1.getFaker();
        java.lang.Object obj17 = util1.setLocale("e");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "British Indian Ocean Territory (Chagos Archipelago)" + "'", str7, "British Indian Ocean Territory (Chagos Archipelago)");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Rand" + "'", str8, "Rand");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "umlrmas" + "'", str11, "umlrmas");
        org.junit.Assert.assertNull(f15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        boolean boolean3 = f2.getTemplateStyle();
        f2.setTemplateStyle(true);
        java.lang.String str6 = f2.creditCardType();
        java.lang.Object obj9 = f2.collection(485, (java.lang.Object) "26.157.128.68");
        org.junit.Assert.assertNotNull(f2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "discover" + "'", str6, "discover");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Pokemon pokemon3 = faker1.pokemon();
        com.github.javafaker.DragonBall dragonBall4 = faker1.dragonBall();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(pokemon3);
        org.junit.Assert.assertNotNull(dragonBall4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        boolean boolean3 = f2.getTemplateStyle();
        f2.setTemplateStyle(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = f2.password(4, 3, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(f2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str3 = f0.suffix();
        java.lang.String str4 = f0.cityPrefix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Macedonia" + "'", str1, "Macedonia");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Dalasi" + "'", str2, "Dalasi");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Inc" + "'", str3, "Inc");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "New" + "'", str4, "New");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.publicIpV4Address();
        java.lang.String str4 = internet2.ipV6Cidr();
        java.lang.String str5 = internet2.privateIpV4Address();
        java.lang.String str6 = internet2.slug();
        java.lang.String str12 = internet2.password((int) (byte) 0, (int) (byte) 1, false, false, false);
        java.lang.String str13 = internet2.emailAddress();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "108.23.194.204" + "'", str3, "108.23.194.204");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ae70:9ce4:072b:b3a2:3b80:3a6f:2d5a:7736/27" + "'", str4, "ae70:9ce4:072b:b3a2:3b80:3a6f:2d5a:7736/27");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169.254.196.37" + "'", str5, "169.254.196.37");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "deserunt_ipsa" + "'", str6, "deserunt_ipsa");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "angelique.okon@yahoo.com" + "'", str13, "angelique.okon@yahoo.com");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Stock stock3 = faker1.stock();
        com.github.javafaker.Zelda zelda4 = faker1.zelda();
        com.github.javafaker.Currency currency5 = new com.github.javafaker.Currency(faker1);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(stock3);
        org.junit.Assert.assertNotNull(zelda4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        java.lang.Object obj5 = util1.setLocale("hi!");
        com.apifortress.apiffaker.F f6 = util1.getFaker();
        com.apifortress.apiffaker.F f7 = new com.apifortress.apiffaker.F();
        java.lang.String str8 = f7.country();
        java.lang.String str9 = f7.timeZone();
        int int12 = f7.integer((int) (short) 10, (int) (short) 10);
        int int13 = f7.streetAddressNumber();
        util1.setFaker(f7);
        java.lang.String str15 = f7.timeZone();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertNotNull(f6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Germany" + "'", str8, "Germany");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pacific/Apia" + "'", str9, "Pacific/Apia");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 949 + "'", int13 == 949);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "America/New_York" + "'", str15, "America/New_York");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Currency currency5 = faker1.currency();
        com.github.javafaker.Currency currency6 = new com.github.javafaker.Currency(faker1);
        com.github.javafaker.Food food7 = faker1.food();
        java.lang.String str8 = food7.spice();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(currency5);
        org.junit.Assert.assertNotNull(food7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mace Ground" + "'", str8, "Mace Ground");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.Util util5 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f6 = util5.getFaker();
        com.apifortress.apiffaker.Util util8 = new com.apifortress.apiffaker.Util("hi!");
        util1.manipulateNode(0, (java.lang.Object) "Morocco", (java.lang.Object) f6, (java.lang.Object) util8, 2);
        int int12 = util1.deepCount((java.lang.Object) "281027+2381");
        int int14 = util1.deepCount((java.lang.Object) "MVR");
        org.junit.Assert.assertNotNull(f6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.domainWord();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "grimes" + "'", str3, "grimes");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.fullName();
        java.lang.String str7 = f0.timeZone();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Iceland" + "'", str1, "Iceland");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Karachi" + "'", str2, "Asia/Karachi");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nga Sanford" + "'", str6, "Nga Sanford");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Europe/Moscow" + "'", str7, "Europe/Moscow");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Commerce commerce2 = faker1.commerce();
        com.github.javafaker.Beer beer3 = faker1.beer();
        com.github.javafaker.Shakespeare shakespeare4 = faker1.shakespeare();
        java.lang.String str5 = shakespeare4.kingRichardIIIQuote();
        java.lang.String str6 = shakespeare4.asYouLikeItQuote();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(commerce2);
        org.junit.Assert.assertNotNull(beer3);
        org.junit.Assert.assertNotNull(shakespeare4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "So wise so young, they say, do never live long." + "'", str5, "So wise so young, they say, do never live long.");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "The fool doth think he is wise, but the wise man knows himself to be a fool." + "'", str6, "The fool doth think he is wise, but the wise man knows himself to be a fool.");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Currency currency5 = faker1.currency();
        com.github.javafaker.Currency currency6 = new com.github.javafaker.Currency(faker1);
        com.github.javafaker.Food food7 = faker1.food();
        java.lang.String str8 = food7.ingredient();
        java.lang.String str9 = food7.ingredient();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(currency5);
        org.junit.Assert.assertNotNull(food7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Eggplant" + "'", str8, "Eggplant");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Beef" + "'", str9, "Beef");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.fullName();
        java.lang.String str7 = f0.cityName();
        java.lang.String str8 = f0.invalidSSN();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "South Africa" + "'", str1, "South Africa");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "America/Los_Angeles" + "'", str2, "America/Los_Angeles");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mr. Joaquina Ernser" + "'", str6, "Mr. Joaquina Ernser");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "North Solshire" + "'", str7, "North Solshire");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "905192-2047" + "'", str8, "905192-2047");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Currency currency5 = faker1.currency();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        char char8 = lorem6.character(false);
        java.lang.String str9 = lorem6.word();
        java.lang.String str12 = lorem6.sentence((int) (short) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = lorem6.characters(14, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(currency5);
        org.junit.Assert.assertNotNull(lorem6);
// flaky:         org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'h' + "'", char8 == 'h');
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "voluptatem" + "'", str9, "voluptatem");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dolorem deleniti nostrum reiciendis eum rerum non illo nihil expedita maiores officiis id sunt quos dolorem enim deserunt quas occaecati vero facilis voluptas facilis veniam explicabo eos." + "'", str12, "Dolorem deleniti nostrum reiciendis eum rerum non illo nihil expedita maiores officiis id sunt quos dolorem enim deserunt quas occaecati vero facilis voluptas facilis veniam explicabo eos.");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        com.github.javafaker.Medical medical3 = faker1.medical();
        com.github.javafaker.GameOfThrones gameOfThrones4 = faker1.gameOfThrones();
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.date();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = dateAndTime5.future((int) '3', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
        org.junit.Assert.assertNotNull(medical3);
        org.junit.Assert.assertNotNull(gameOfThrones4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Code code2 = faker1.code();
        com.github.javafaker.Avatar avatar3 = faker1.avatar();
        com.github.javafaker.Code code4 = faker1.code();
        com.github.javafaker.Ancient ancient5 = faker1.ancient();
        java.lang.String str7 = faker1.expression("M32Rgms9");
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(avatar3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(ancient5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "M32Rgms9" + "'", str7, "M32Rgms9");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Color color5 = faker1.color();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Currency currency5 = faker1.currency();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        java.lang.String str7 = lorem6.characters();
        java.util.List<java.lang.String> strList9 = lorem6.paragraphs(14);
        java.lang.String str11 = lorem6.fixedString((int) 'v');
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(currency5);
        org.junit.Assert.assertNotNull(lorem6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "f419elkozr9kozw93db4fq3rgmhk1luftmehfrjjsoipgozoodanz19x2hecym79akxwzj555yg1aqfnyfdmub1suz71n0iqenotfsjh9yx8zj7ld4y654fvtetnhhgrd75gxitwq8gynrsf8wbhv4eqwkue73lvug610intyv1gx8mptv6dwo7m2uc6aywfrdt4x7wtnwlgdc8mi8h4lf5n68yo50vm6cttn593zk6bra3f0g8wqtt84dsa8br" + "'", str7, "f419elkozr9kozw93db4fq3rgmhk1luftmehfrjjsoipgozoodanz19x2hecym79akxwzj555yg1aqfnyfdmub1suz71n0iqenotfsjh9yx8zj7ld4y654fvtetnhhgrd75gxitwq8gynrsf8wbhv4eqwkue73lvug610intyv1gx8mptv6dwo7m2uc6aywfrdt4x7wtnwlgdc8mi8h4lf5n68yo50vm6cttn593zk6bra3f0g8wqtt84dsa8br");
        org.junit.Assert.assertNotNull(strList9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ut tenetur eos amet nobis.Non aut qui aut hic aperiam aut.Inventore corporis quis quaerat quam modi.Id voluptatem quam" + "'", str11, "Ut tenetur eos amet nobis.Non aut qui aut hic aperiam aut.Inventore corporis quis quaerat quam modi.Id voluptatem quam");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Internet internet3 = faker1.internet();
        com.github.javafaker.Country country4 = faker1.country();
        java.lang.String str5 = country4.countryCode2();
        java.lang.String str6 = country4.countryCode3();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(country4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "lr" + "'", str5, "lr");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "lka" + "'", str6, "lka");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
// flaky:         com.apifortress.apiffaker.Main.stressTest((int) (byte) -1, 894);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        com.github.javafaker.Commerce commerce3 = faker1.commerce();
        com.github.javafaker.Robin robin4 = faker1.robin();
        com.github.javafaker.Job job5 = faker1.job();
        java.lang.String str6 = job5.seniority();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
        org.junit.Assert.assertNotNull(commerce3);
        org.junit.Assert.assertNotNull(robin4);
        org.junit.Assert.assertNotNull(job5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Corporate" + "'", str6, "Corporate");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Stock stock3 = faker1.stock();
        com.github.javafaker.Zelda zelda4 = faker1.zelda();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = faker1.resolve("Oman");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Oman resulted in null expression");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(stock3);
        org.junit.Assert.assertNotNull(zelda4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.apifortress.apiffaker.Main.setRANDOM(6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Internet internet3 = faker1.internet();
        com.github.javafaker.University university4 = faker1.university();
        java.lang.String str5 = university4.prefix();
        java.lang.String str6 = university4.suffix();
        java.lang.String str7 = university4.name();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(university4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Southern" + "'", str5, "Southern");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "College" + "'", str6, "College");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Northern Corkery" + "'", str7, "Northern Corkery");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        java.lang.String str3 = weather2.temperatureCelsius();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = weather2.temperatureCelsius((int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-10\260C" + "'", str3, "-10\260C");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        boolean boolean3 = f2.getTemplateStyle();
        int[] intArray7 = f2.integerList((int) (short) 100, (int) (byte) -1, (int) (short) 0);
        f2.setTemplateStyle(true);
        java.lang.Object obj12 = f2.collection((-1), (java.lang.Object) "149489-4060");
        org.junit.Assert.assertNotNull(f2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        double double5 = f0.decimal(100L);
        double double9 = f0.decimal((long) 6, (long) 'e', (int) (byte) 0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Netherlands Antilles" + "'", str1, "Netherlands Antilles");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Skopje" + "'", str2, "Europe/Skopje");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "38.86" + "'", str3, "38.86");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 77.0d + "'", double9 == 77.0d);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str4 = faker1.regexify("Sweden");
        com.github.javafaker.Shakespeare shakespeare5 = faker1.shakespeare();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Sweden" + "'", str4, "Sweden");
        org.junit.Assert.assertNotNull(shakespeare5);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Code code2 = faker1.code();
        com.github.javafaker.Avatar avatar3 = faker1.avatar();
        com.github.javafaker.Code code4 = faker1.code();
        java.lang.String str5 = code4.isbn13();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(avatar3);
        org.junit.Assert.assertNotNull(code4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9790972260960" + "'", str5, "9790972260960");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        com.github.javafaker.Medical medical3 = faker1.medical();
        com.github.javafaker.GameOfThrones gameOfThrones4 = faker1.gameOfThrones();
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.date();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = dateAndTime5.past((int) 'a', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
        org.junit.Assert.assertNotNull(medical3);
        org.junit.Assert.assertNotNull(gameOfThrones4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Currency currency5 = faker1.currency();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        char char8 = lorem6.character(false);
        java.lang.String str11 = lorem6.sentence((-1), 5);
        java.lang.String str15 = lorem6.characters((int) (byte) -1, false, false);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(currency5);
        org.junit.Assert.assertNotNull(lorem6);
// flaky:         org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'm' + "'", char8 == 'm');
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Odit tenetur dolor." + "'", str11, "Odit tenetur dolor.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        boolean boolean3 = f2.getTemplateStyle();
        java.lang.String str4 = f2.promotionCode();
        double double7 = f2.decimal((long) 10, (long) (byte) 100);
        java.lang.String str8 = f2.url();
        org.junit.Assert.assertNotNull(f2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "First-ClassPromotion397485" + "'", str4, "First-ClassPromotion397485");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.3d + "'", double7 == 30.3d);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "www.alene-lynch.info" + "'", str8, "www.alene-lynch.info");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.github.javafaker.Faker faker0 = com.github.javafaker.Faker.instance();
        com.github.javafaker.HitchhikersGuideToTheGalaxy hitchhikersGuideToTheGalaxy1 = faker0.hitchhikersGuideToTheGalaxy();
        com.github.javafaker.Stock stock2 = faker0.stock();
        org.junit.Assert.assertNotNull(faker0);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy1);
        org.junit.Assert.assertNotNull(stock2);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Color color4 = faker1.color();
        com.github.javafaker.Beer beer5 = faker1.beer();
        com.github.javafaker.Friends friends6 = faker1.friends();
        java.lang.String str7 = friends6.character();
        java.lang.String str8 = friends6.quote();
        java.lang.String str9 = friends6.location();
        java.lang.String str10 = friends6.quote();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(beer5);
        org.junit.Assert.assertNotNull(friends6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chloe" + "'", str7, "Chloe");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2019re gonna love it!" + "'", str8, "\u2019re gonna love it!");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Central Perk" + "'", str9, "Central Perk");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2019\u2019s divorced." + "'", str10, "\u2019\u2019s divorced.");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        com.github.javafaker.Commerce commerce3 = faker1.commerce();
        java.lang.String str5 = commerce3.promotionCode(894);
        java.lang.String str6 = commerce3.productName();
        java.lang.String str7 = commerce3.material();
        java.lang.String str8 = commerce3.color();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
        org.junit.Assert.assertNotNull(commerce3);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OverwhelmingPromotion500703783374110781030218744041126657003758916217746774578390787014588247361850149555880346940888156737956125707871054048605531565537636554361344146523041503269110487582529248840775573374576448242239361428375696873223541824360378236885108076542774425881058166315328694703607939161677222810842021673090244647408514055194484258995828662500058341832805368283722252822750464400448474159280868208100646461083108253004436189324156105688645140617558557862658663828266951833584124881056542975797302145780676562039651716504821728356430847014179602025480470709320951973622381246551448821369004106953868307412118062160644276321752244763641366253726844204320142602722162030756166161535262124675270365561414923650257307764002156617625364808726206915449441549004445981475418325726327769588643070028100510707571150659773122283758820380660597518976932971638680268849606641392246312375131231516453654632855870071" + "'", str5, "OverwhelmingPromotion500703783374110781030218744041126657003758916217746774578390787014588247361850149555880346940888156737956125707871054048605531565537636554361344146523041503269110487582529248840775573374576448242239361428375696873223541824360378236885108076542774425881058166315328694703607939161677222810842021673090244647408514055194484258995828662500058341832805368283722252822750464400448474159280868208100646461083108253004436189324156105688645140617558557862658663828266951833584124881056542975797302145780676562039651716504821728356430847014179602025480470709320951973622381246551448821369004106953868307412118062160644276321752244763641366253726844204320142602722162030756166161535262124675270365561414923650257307764002156617625364808726206915449441549004445981475418325726327769588643070028100510707571150659773122283758820380660597518976932971638680268849606641392246312375131231516453654632855870071");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Gorgeous Paper Table" + "'", str6, "Gorgeous Paper Table");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cotton" + "'", str7, "Cotton");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ivory" + "'", str8, "ivory");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Commerce commerce2 = faker1.commerce();
        java.lang.String str3 = commerce2.material();
        java.lang.String str6 = commerce2.price((double) (-1.0f), 10.0d);
        java.lang.String str7 = commerce2.department();
        java.lang.String str8 = commerce2.material();
        java.lang.String str11 = commerce2.price(46.23d, 0.0d);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(commerce2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cotton" + "'", str3, "Cotton");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.05" + "'", str6, "1.05");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Baby & Home" + "'", str7, "Baby & Home");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wool" + "'", str8, "Wool");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "20.45" + "'", str11, "20.45");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.coatLength();
        java.lang.String str4 = dog2.size();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "wire" + "'", str3, "wire");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "medium" + "'", str4, "medium");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.url();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "www.dick-schmitt.io" + "'", str3, "www.dick-schmitt.io");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        boolean boolean3 = f2.getTemplateStyle();
        java.lang.String str4 = f2.firstName();
        org.junit.Assert.assertNotNull(f2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lelah" + "'", str4, "Lelah");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Internet internet3 = faker1.internet();
        com.github.javafaker.Country country4 = faker1.country();
        java.lang.String str5 = country4.countryCode3();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(country4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ner" + "'", str5, "ner");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Address address4 = faker1.address();
        java.lang.String str5 = address4.secondaryAddress();
        java.lang.String str6 = address4.buildingNumber();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(address4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Apt. 178" + "'", str5, "Apt. 178");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3519" + "'", str6, "3519");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        com.github.javafaker.Medical medical3 = faker1.medical();
        com.github.javafaker.GameOfThrones gameOfThrones4 = faker1.gameOfThrones();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.IdNumber idNumber6 = faker1.idNumber();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
        org.junit.Assert.assertNotNull(medical3);
        org.junit.Assert.assertNotNull(gameOfThrones4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(idNumber6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.github.javafaker.Faker faker0 = com.github.javafaker.Faker.instance();
        com.github.javafaker.HitchhikersGuideToTheGalaxy hitchhikersGuideToTheGalaxy1 = faker0.hitchhikersGuideToTheGalaxy();
        com.github.javafaker.HowIMetYourMother howIMetYourMother2 = faker0.howIMetYourMother();
        org.junit.Assert.assertNotNull(faker0);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy1);
        org.junit.Assert.assertNotNull(howIMetYourMother2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Artist artist2 = faker1.artist();
        com.github.javafaker.HowIMetYourMother howIMetYourMother3 = faker1.howIMetYourMother();
        java.lang.String str4 = howIMetYourMother3.highFive();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(artist2);
        org.junit.Assert.assertNotNull(howIMetYourMother3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Arthritis Five" + "'", str4, "Arthritis Five");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Commerce commerce2 = faker1.commerce();
        java.lang.String str3 = commerce2.material();
        java.lang.String str4 = commerce2.material();
        java.lang.String str5 = commerce2.promotionCode();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(commerce2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Paper" + "'", str3, "Paper");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Granite" + "'", str4, "Granite");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MarvelousReward634811" + "'", str5, "MarvelousReward634811");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.age();
        java.lang.String str4 = dog2.coatLength();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "adult" + "'", str3, "adult");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "curly" + "'", str4, "curly");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Address address4 = faker1.address();
        java.lang.String str5 = address4.stateAbbr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = address4.zipCodeByState("Hades");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: address.postcode_by_state.Hades resulted in null expression");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(address4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RI" + "'", str5, "RI");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Address address4 = faker1.address();
        java.lang.String str5 = address4.stateAbbr();
        java.lang.String str6 = address4.city();
        java.lang.String str7 = address4.timeZone();
        java.lang.String str8 = address4.cityPrefix();
        java.lang.String str9 = address4.zipCode();
        java.lang.String str10 = address4.streetSuffix();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(address4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MN" + "'", str5, "MN");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Kerryville" + "'", str6, "Kerryville");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Europe/Moscow" + "'", str7, "Europe/Moscow");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "South" + "'", str8, "South");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25596-8848" + "'", str9, "25596-8848");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Forks" + "'", str10, "Forks");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Internet internet3 = faker1.internet();
        com.github.javafaker.Country country4 = faker1.country();
        java.lang.String str5 = country4.flag();
        java.lang.String str6 = country4.currencyCode();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(country4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://flags.fmcdn.net/data/flags/w580/bb.png" + "'", str5, "http://flags.fmcdn.net/data/flags/w580/bb.png");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EUR" + "'", str6, "EUR");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.github.javafaker.Faker faker0 = com.github.javafaker.Faker.instance();
        com.github.javafaker.HitchhikersGuideToTheGalaxy hitchhikersGuideToTheGalaxy1 = faker0.hitchhikersGuideToTheGalaxy();
        java.lang.String str2 = hitchhikersGuideToTheGalaxy1.location();
        java.lang.String str3 = hitchhikersGuideToTheGalaxy1.character();
        org.junit.Assert.assertNotNull(faker0);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cathedral of Chalesm" + "'", str2, "Cathedral of Chalesm");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pizpot Gargravarr" + "'", str3, "Pizpot Gargravarr");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Currency currency5 = faker1.currency();
        com.github.javafaker.Currency currency6 = new com.github.javafaker.Currency(faker1);
        java.lang.String str8 = faker1.bothify("angelique.okon@yahoo.com");
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(currency5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "angelique.okon@yahoo.com" + "'", str8, "angelique.okon@yahoo.com");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Color color4 = faker1.color();
        com.github.javafaker.Beer beer5 = faker1.beer();
        com.github.javafaker.Friends friends6 = faker1.friends();
        com.github.javafaker.Esports esports7 = faker1.esports();
        java.lang.String str8 = esports7.player();
        java.lang.String str9 = esports7.team();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(beer5);
        org.junit.Assert.assertNotNull(friends6);
        org.junit.Assert.assertNotNull(esports7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "shroud" + "'", str8, "shroud");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EnVyUs" + "'", str9, "EnVyUs");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Code code2 = faker1.code();
        java.lang.String str3 = code2.ean13();
        java.lang.String str4 = code2.isbnGs1();
        java.lang.String str5 = code2.isbn13();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(code2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7958510757484" + "'", str3, "7958510757484");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "978" + "'", str4, "978");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9790414646291" + "'", str5, "9790414646291");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Currency currency5 = faker1.currency();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        com.github.javafaker.Superhero superhero7 = faker1.superhero();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(currency5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(superhero7);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Code code2 = faker1.code();
        com.github.javafaker.Avatar avatar3 = faker1.avatar();
        com.github.javafaker.Code code4 = faker1.code();
        java.lang.String str5 = code4.isbnGs1();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(avatar3);
        org.junit.Assert.assertNotNull(code4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "978" + "'", str5, "978");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Internet internet3 = faker1.internet();
        com.github.javafaker.Country country4 = faker1.country();
        com.github.javafaker.TwinPeaks twinPeaks5 = faker1.twinPeaks();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(internet3);
        org.junit.Assert.assertNotNull(country4);
        org.junit.Assert.assertNotNull(twinPeaks5);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        java.lang.String str3 = weather2.temperatureCelsius();
        java.lang.String str4 = weather2.description();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-24\260C" + "'", str3, "-24\260C");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cloudy periods" + "'", str4, "Cloudy periods");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Stock stock3 = faker1.stock();
        com.github.javafaker.Job job4 = faker1.job();
        java.lang.String str5 = job4.seniority();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(stock3);
        org.junit.Assert.assertNotNull(job4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Future" + "'", str5, "Future");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.currencyCode();
        double double9 = f0.decimal((long) (short) 100, 1700470093997L);
        java.lang.String str10 = f0.capital();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "United Kingdom" + "'", str1, "United Kingdom");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Vienna" + "'", str2, "Europe/Vienna");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CUC" + "'", str6, "CUC");
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.69078990272327E12d + "'", double9 == 1.69078990272327E12d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tunis" + "'", str10, "Tunis");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        java.lang.String str3 = f0.streetSuffix();
        java.lang.String str4 = f0.buildingNumber();
        int[] intArray7 = f0.integerList(42, (int) (short) 0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "b414b923-8648-4dae-84cc-55f4f6c59324" + "'", str1, "b414b923-8648-4dae-84cc-55f4f6c59324");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 27.92d + "'", double2 == 27.92d);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Skyway" + "'", str3, "Skyway");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41155" + "'", str4, "41155");
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[17, 39, 6, 3, 2, 33, 34, 35, 36, 37]");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Color color4 = faker1.color();
        java.lang.String str6 = faker1.bothify("Mexico");
        com.github.javafaker.Company company7 = faker1.company();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mexico" + "'", str6, "Mexico");
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Currency currency5 = faker1.currency();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        java.lang.String str7 = lorem6.characters();
        java.lang.String str9 = lorem6.sentence(0);
        java.lang.String str10 = lorem6.paragraph();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(currency5);
        org.junit.Assert.assertNotNull(lorem6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ps87d0h82won7yxhaq1mncsyxfm0nvy10efbrtfmu64wiied9bjpsfftgg99ftad7rpfs676cjxmdytm6l2n2b1iqr91uxmkoj68ca0h043wwynwfkr7ageh9kskrz6jxm6kklbi2t4gonngmr8gj24vbihaubsp3rmkjkvya6x1k0628nr0l290hi4j0ihzb7dkehegvzfzt1sdx032h7dznox7x304jmvl4a2uyj1a2rc9hqjm259ctogioun" + "'", str7, "ps87d0h82won7yxhaq1mncsyxfm0nvy10efbrtfmu64wiied9bjpsfftgg99ftad7rpfs676cjxmdytm6l2n2b1iqr91uxmkoj68ca0h043wwynwfkr7ageh9kskrz6jxm6kklbi2t4gonngmr8gj24vbihaubsp3rmkjkvya6x1k0628nr0l290hi4j0ihzb7dkehegvzfzt1sdx032h7dznox7x304jmvl4a2uyj1a2rc9hqjm259ctogioun");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Aspernatur dolorem saepe." + "'", str9, "Aspernatur dolorem saepe.");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Dolor sed corrupti corporis voluptatum minima voluptas. Modi iure vero perspiciatis aperiam. Non porro ea et accusantium sed iure. Quibusdam ratione ut architecto rerum voluptatem et. Aliquam tenetur voluptas ut laborum iste dicta." + "'", str10, "Dolor sed corrupti corporis voluptatum minima voluptas. Modi iure vero perspiciatis aperiam. Non porro ea et accusantium sed iure. Quibusdam ratione ut architecto rerum voluptatem et. Aliquam tenetur voluptas ut laborum iste dicta.");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        java.lang.String str3 = f0.streetSuffix();
        java.lang.String str4 = f0.buildingNumber();
        java.lang.String str5 = f0.firstName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "850f2d4d-d337-43c6-9028-12df4ec37ef7" + "'", str1, "850f2d4d-d337-43c6-9028-12df4ec37ef7");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.49d + "'", double2 == 4.49d);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Fords" + "'", str3, "Fords");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "02997" + "'", str4, "02997");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Quinn" + "'", str5, "Quinn");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        double double5 = f0.decimal(100L);
        double double9 = f0.decimal(1700470093997L, (long) 4, (int) '9');
        java.lang.String str10 = f0.citySuffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Malawi" + "'", str1, "Malawi");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Lisbon" + "'", str2, "Europe/Lisbon");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96.54" + "'", str3, "96.54");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.4754956935686045E12d + "'", double9 == 1.4754956935686045E12d);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "land" + "'", str10, "land");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Pokemon pokemon3 = faker1.pokemon();
        java.lang.String str4 = pokemon3.location();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(pokemon3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Nuvema Town" + "'", str4, "Nuvema Town");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.github.javafaker.Faker faker0 = com.github.javafaker.Faker.instance();
        java.lang.String str2 = faker0.bothify("Asia/Tokyo");
        com.github.javafaker.LeagueOfLegends leagueOfLegends3 = faker0.leagueOfLegends();
        java.lang.String str4 = leagueOfLegends3.masteries();
        java.lang.String str5 = leagueOfLegends3.masteries();
        org.junit.Assert.assertNotNull(faker0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Tokyo" + "'", str2, "Asia/Tokyo");
        org.junit.Assert.assertNotNull(leagueOfLegends3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Sorcery" + "'", str4, "Sorcery");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Runic Affinity" + "'", str5, "Runic Affinity");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Currency currency5 = faker1.currency();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        java.lang.String str7 = lorem6.characters();
        java.lang.String str9 = lorem6.sentence(0);
        char char10 = lorem6.character();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(currency5);
        org.junit.Assert.assertNotNull(lorem6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6nh3286ntcl6878tlrfggmlvpmdhxwamyrcmiryh42odzbxvhqfrgzw7sfl3ktn73ydujshoo2a73dz2rm71zdhu62426yfs3o2o4fwjltu7tr693ohgrm36ffxpg91kcm2n1wnej55y1ztid3kunjfw3205ig23k0hpcbtlfhl4xmlhdn57pw5degptr0m9hc8vu334n2tcco2w857sl1pg1ppe85tzudukxitrwzlrkikxct29ce6hykjws3y" + "'", str7, "6nh3286ntcl6878tlrfggmlvpmdhxwamyrcmiryh42odzbxvhqfrgzw7sfl3ktn73ydujshoo2a73dz2rm71zdhu62426yfs3o2o4fwjltu7tr693ohgrm36ffxpg91kcm2n1wnej55y1ztid3kunjfw3205ig23k0hpcbtlfhl4xmlhdn57pw5degptr0m9hc8vu334n2tcco2w857sl1pg1ppe85tzudukxitrwzlrkikxct29ce6hykjws3y");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Perferendis officia nemo ut voluptatum." + "'", str9, "Perferendis officia nemo ut voluptatum.");
// flaky:         org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'a' + "'", char10 == 'a');
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Address address4 = faker1.address();
        java.lang.String str5 = address4.stateAbbr();
        java.lang.String str6 = address4.city();
        java.lang.String str7 = address4.timeZone();
        java.lang.String str8 = address4.cityPrefix();
        java.lang.String str9 = address4.longitude();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(address4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Feestchester" + "'", str6, "Feestchester");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Europe/Kiev" + "'", str7, "Europe/Kiev");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lake" + "'", str8, "Lake");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "82.230831" + "'", str9, "82.230831");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Address address4 = faker1.address();
        java.lang.String str5 = address4.stateAbbr();
        java.lang.String str6 = address4.streetSuffix();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = address4.zipCodeByState("Marble");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: address.postcode_by_state.Marble resulted in null expression");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(address4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FL" + "'", str5, "FL");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Stravenue" + "'", str6, "Stravenue");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Pokemon pokemon3 = faker1.pokemon();
        com.github.javafaker.Food food4 = faker1.food();
        com.github.javafaker.HitchhikersGuideToTheGalaxy hitchhikersGuideToTheGalaxy5 = faker1.hitchhikersGuideToTheGalaxy();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(pokemon3);
        org.junit.Assert.assertNotNull(food4);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.github.javafaker.service.FakeValuesGrouping fakeValuesGrouping0 = new com.github.javafaker.service.FakeValuesGrouping();
        java.util.Map map2 = fakeValuesGrouping0.get("Tahoma");
        java.util.Map map4 = fakeValuesGrouping0.get("CoolDeal660422781138301893631634353743256548086622340011040531443014551742085760545805310339965719122098630088189087983560895175158252007940292656897211277578757476511477510201235260035216793744932163436548417805345823353143283013982821328510262847662273273280281561073627353359105113557286260620319380491116535104681249314819670242161806526484872833613873610283115638537438888336115185109650557854766545588163883665866647832980006027146763520166683810165763223151699004986545564520675504178101646609509739865546867733781777525577227070300260957322276174363186120761168953705218633370803732427125581181787071695504294355310757632547580467271713528272400765120272881581765321102262402486171419603748613154060784534675525007382716674268336116239067317214360180185145797587524762460658508231860011485680609741865783835583355318528022438620971470344518244008694222325191555625332168700924160210573582586128");
        org.junit.Assert.assertNull(map2);
        org.junit.Assert.assertNull(map4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Artist artist2 = faker1.artist();
        com.github.javafaker.HowIMetYourMother howIMetYourMother3 = faker1.howIMetYourMother();
        java.lang.String str4 = howIMetYourMother3.catchPhrase();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(artist2);
        org.junit.Assert.assertNotNull(howIMetYourMother3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Suit Up" + "'", str4, "Suit Up");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.github.javafaker.Faker faker0 = com.github.javafaker.Faker.instance();
        java.lang.String str2 = faker0.bothify("Asia/Tokyo");
        com.github.javafaker.LeagueOfLegends leagueOfLegends3 = faker0.leagueOfLegends();
        java.lang.String str4 = leagueOfLegends3.location();
        org.junit.Assert.assertNotNull(faker0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Tokyo" + "'", str2, "Asia/Tokyo");
        org.junit.Assert.assertNotNull(leagueOfLegends3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Zaun" + "'", str4, "Zaun");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.breed();
        java.lang.String str4 = dog2.sound();
        java.lang.String str5 = dog2.memePhrase();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Dingo" + "'", str3, "Dingo");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "woof woof" + "'", str4, "woof woof");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "blep" + "'", str5, "blep");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Address address4 = faker1.address();
        java.lang.String str5 = address4.stateAbbr();
        java.lang.String str6 = address4.streetAddressNumber();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(address4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CO" + "'", str5, "CO");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "147" + "'", str6, "147");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Code code2 = faker1.code();
        com.github.javafaker.Esports esports3 = faker1.esports();
        java.lang.String str4 = esports3.league();
        java.lang.String str5 = esports3.event();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(esports3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ESL" + "'", str4, "ESL");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "League All Stars" + "'", str5, "League All Stars");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        java.lang.String str5 = faker1.regexify("Sweden");
        com.github.javafaker.RockBand rockBand6 = faker1.rockBand();
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.IdNumber idNumber8 = faker1.idNumber();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Sweden" + "'", str5, "Sweden");
        org.junit.Assert.assertNotNull(rockBand6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(idNumber8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        com.github.javafaker.Commerce commerce3 = faker1.commerce();
        com.github.javafaker.Robin robin4 = faker1.robin();
        com.github.javafaker.Book book5 = faker1.book();
        java.lang.String str6 = book5.publisher();
        java.lang.String str7 = book5.author();
        java.lang.String str8 = book5.publisher();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
        org.junit.Assert.assertNotNull(commerce3);
        org.junit.Assert.assertNotNull(robin4);
        org.junit.Assert.assertNotNull(book5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Andr\351 Deutsch" + "'", str6, "Andr\351 Deutsch");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Miss Chong Harber" + "'", str7, "Miss Chong Harber");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cengage Learning" + "'", str8, "Cengage Learning");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.github.javafaker.service.FakerIDN fakerIDN0 = new com.github.javafaker.service.FakerIDN();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Commerce commerce2 = faker1.commerce();
        com.github.javafaker.Bool bool3 = faker1.bool();
        boolean boolean4 = bool3.bool();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(commerce2);
        org.junit.Assert.assertNotNull(bool3);
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.breed();
        java.lang.String str4 = dog2.memePhrase();
        java.lang.String str5 = dog2.size();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cardigan Corgi" + "'", str3, "Cardigan Corgi");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "heck no pal" + "'", str4, "heck no pal");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "medium" + "'", str5, "medium");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.PhoneNumber phoneNumber2 = faker1.phoneNumber();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(phoneNumber2);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Color color4 = faker1.color();
        java.lang.String str6 = faker1.bothify("Mexico");
        com.github.javafaker.RickAndMorty rickAndMorty7 = faker1.rickAndMorty();
        com.github.javafaker.StarTrek starTrek8 = faker1.starTrek();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mexico" + "'", str6, "Mexico");
        org.junit.Assert.assertNotNull(rickAndMorty7);
        org.junit.Assert.assertNotNull(starTrek8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Number number5 = faker1.number();
        double double9 = number5.randomDouble((int) (short) 1, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(number5);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.5d + "'", double9 == 4.5d);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.Object obj8 = f0.collection((int) (byte) 1, (java.lang.Object) "I");
        java.lang.String str9 = f0.streetName();
        java.lang.String str10 = f0.validSSN();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Slovakia (Slovak Republic)" + "'", str1, "Slovakia (Slovak Republic)");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P" + "'", str5, "P");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "Data generator 'I' does not exist in extension F" + "'", obj8, "Data generator 'I' does not exist in extension F");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Kerluke Unions" + "'", str9, "Kerluke Unions");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "751216-8688" + "'", str10, "751216-8688");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Currency currency5 = faker1.currency();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        java.util.List<java.lang.String> strList8 = lorem6.words((-1));
        java.util.List<java.lang.String> strList10 = lorem6.sentences(827);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(currency5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Stock stock3 = faker1.stock();
        com.github.javafaker.Zelda zelda4 = faker1.zelda();
        com.github.javafaker.Hipster hipster5 = faker1.hipster();
        java.lang.String str6 = hipster5.word();
        java.lang.String str7 = hipster5.word();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(stock3);
        org.junit.Assert.assertNotNull(zelda4);
        org.junit.Assert.assertNotNull(hipster5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "truffaut" + "'", str6, "truffaut");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "tote bag" + "'", str7, "tote bag");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.github.javafaker.idnumbers.EnIdNumber enIdNumber0 = new com.github.javafaker.idnumbers.EnIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = com.github.javafaker.Faker.instance(random1);
        com.github.javafaker.Commerce commerce3 = faker2.commerce();
        com.github.javafaker.Beer beer4 = faker2.beer();
        java.lang.String str5 = enIdNumber0.getValidSsn(faker2);
        org.junit.Assert.assertNotNull(faker2);
        org.junit.Assert.assertNotNull(commerce3);
        org.junit.Assert.assertNotNull(beer4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "810-72-6286" + "'", str5, "810-72-6286");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        java.lang.String str5 = faker1.regexify("Sweden");
        com.github.javafaker.RockBand rockBand6 = faker1.rockBand();
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        java.util.concurrent.TimeUnit timeUnit9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = dateAndTime7.past(894, timeUnit9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Sweden" + "'", str5, "Sweden");
        org.junit.Assert.assertNotNull(rockBand6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Internet internet3 = faker1.internet();
        java.lang.String str4 = internet3.macAddress();
        java.lang.String str5 = internet3.ipV4Address();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(internet3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "7f:a3:41:45:ff:69" + "'", str4, "7f:a3:41:45:ff:69");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "158.98.249.125" + "'", str5, "158.98.249.125");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("41.72");
        com.github.javafaker.Currency currency5 = faker1.currency();
        com.github.javafaker.Address address6 = faker1.address();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "41.72" + "'", str4, "41.72");
        org.junit.Assert.assertNotNull(currency5);
        org.junit.Assert.assertNotNull(address6);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Commerce commerce2 = faker1.commerce();
        java.lang.String str3 = commerce2.material();
        java.lang.String str4 = commerce2.productName();
        java.lang.String str5 = commerce2.price();
        java.lang.String str6 = commerce2.color();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(commerce2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Paper" + "'", str3, "Paper");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Heavy Duty Aluminum Bottle" + "'", str4, "Heavy Duty Aluminum Bottle");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96.02" + "'", str5, "96.02");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "silver" + "'", str6, "silver");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Code code2 = faker1.code();
        com.github.javafaker.Esports esports3 = faker1.esports();
        com.github.javafaker.Ancient ancient4 = faker1.ancient();
        com.github.javafaker.Address address5 = faker1.address();
        com.github.javafaker.Food food6 = faker1.food();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(esports3);
        org.junit.Assert.assertNotNull(ancient4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertNotNull(food6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Address address4 = faker1.address();
        java.lang.String str5 = address4.stateAbbr();
        java.lang.String str6 = address4.streetPrefix();
        java.lang.String str7 = address4.latitude();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = address4.zipCodeByState("37:9a:c4:78:87:55");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: address.postcode_by_state.37:9a:c4:78:87:55 resulted in null expression");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(address4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ID" + "'", str5, "ID");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "xx" + "'", str6, "xx");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-40.914956" + "'", str7, "-40.914956");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Hipster hipster3 = faker1.hipster();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(hipster3);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Code code2 = faker1.code();
        com.github.javafaker.Avatar avatar3 = faker1.avatar();
        com.github.javafaker.Code code4 = faker1.code();
        java.lang.String str5 = code4.isbnGroup();
        java.lang.String str6 = code4.ean13();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(avatar3);
        org.junit.Assert.assertNotNull(code4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4365709666237" + "'", str6, "4365709666237");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Address address4 = faker1.address();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(pokemon5);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        java.lang.Object obj5 = util1.setLocale("hi!");
        com.apifortress.apiffaker.F f6 = util1.getFaker();
        com.apifortress.apiffaker.Util util8 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f9 = util8.getFaker();
        boolean boolean10 = f9.getTemplateStyle();
        boolean boolean11 = f9.getTemplateStyle();
        util1.setFaker(f9);
        java.lang.String str13 = f9.creditCardNumber();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertNotNull(f6);
        org.junit.Assert.assertNotNull(f9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1234-2121-1221-1211" + "'", str13, "1234-2121-1221-1211");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Address address4 = faker1.address();
        java.lang.String str5 = address4.stateAbbr();
        java.lang.String str6 = address4.streetSuffix();
        java.lang.String str7 = address4.lastName();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(address4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TX" + "'", str5, "TX");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Knoll" + "'", str6, "Knoll");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Padberg" + "'", str7, "Padberg");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.apifortress.apiffaker.Main.setRANDOM((int) ' ');
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.productName();
        java.lang.String str2 = f0.firstName();
        java.lang.String str3 = f0.citySuffix();
        java.lang.String str4 = f0.currency();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Heavy Duty Wooden Knife" + "'", str1, "Heavy Duty Wooden Knife");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Luann" + "'", str2, "Luann");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "haven" + "'", str3, "haven");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Brunei Dollar" + "'", str4, "Brunei Dollar");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.github.javafaker.Faker faker0 = com.github.javafaker.Faker.instance();
        java.lang.String str2 = faker0.bothify("Asia/Tokyo");
        com.github.javafaker.Options options3 = faker0.options();
        org.junit.Assert.assertNotNull(faker0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Tokyo" + "'", str2, "Asia/Tokyo");
        org.junit.Assert.assertNotNull(options3);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Address address4 = faker1.address();
        java.lang.String str5 = address4.stateAbbr();
        java.lang.String str6 = address4.streetSuffix();
        java.lang.String str7 = address4.stateAbbr();
        java.lang.String str8 = address4.streetAddress();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(address4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UT" + "'", str5, "UT");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Crossroad" + "'", str6, "Crossroad");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "WV" + "'", str7, "WV");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1047 Leonel Plains" + "'", str8, "1047 Leonel Plains");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Code code2 = faker1.code();
        com.github.javafaker.Avatar avatar3 = faker1.avatar();
        com.github.javafaker.Code code4 = faker1.code();
        java.lang.String str5 = code4.isbn10();
        java.lang.String str7 = code4.isbn13(false);
        java.lang.String str8 = code4.gtin8();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(avatar3);
        org.junit.Assert.assertNotNull(code4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1107620252" + "'", str5, "1107620252");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9791910989653" + "'", str7, "9791910989653");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "51378752" + "'", str8, "51378752");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Cat cat2 = faker1.cat();
        com.github.javafaker.Medical medical3 = faker1.medical();
        com.github.javafaker.Hobbit hobbit4 = faker1.hobbit();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(cat2);
        org.junit.Assert.assertNotNull(medical3);
        org.junit.Assert.assertNotNull(hobbit4);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        com.github.javafaker.Esports esports4 = faker1.esports();
        com.github.javafaker.Lebowski lebowski5 = faker1.lebowski();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertNotNull(esports4);
        org.junit.Assert.assertNotNull(lebowski5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.publicIpV4Address();
        java.lang.String str5 = internet2.emailAddress("Asia/Karachi");
        java.lang.String str6 = internet2.slug();
        java.lang.String str7 = internet2.ipV4Cidr();
        java.lang.String str8 = internet2.domainSuffix();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "56.159.227.117" + "'", str3, "56.159.227.117");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "et_alias" + "'", str6, "et_alias");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "245.133.139.141/20" + "'", str7, "245.133.139.141/20");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "biz" + "'", str8, "biz");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.lang.String str1 = com.github.javafaker.service.FakerIDN.toASCII("CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CA" + "'", str1, "CA");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        java.lang.String str5 = faker1.regexify("Sweden");
        com.github.javafaker.RockBand rockBand6 = faker1.rockBand();
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        com.github.javafaker.Hobbit hobbit8 = faker1.hobbit();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Sweden" + "'", str5, "Sweden");
        org.junit.Assert.assertNotNull(rockBand6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(hobbit8);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        java.lang.String str7 = f0.invalidID();
        boolean boolean8 = f0.bool();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Saudi Arabia" + "'", str1, "Saudi Arabia");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.nerissa-wyman.com" + "'", str6, "www.nerissa-wyman.com");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "000-51-4366" + "'", str7, "000-51-4366");
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        double double2 = randomService1.nextDouble();
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9115751420481853d + "'", double2 == 0.9115751420481853d);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.github.javafaker.Faker faker0 = com.github.javafaker.Faker.instance();
        com.github.javafaker.HitchhikersGuideToTheGalaxy hitchhikersGuideToTheGalaxy1 = faker0.hitchhikersGuideToTheGalaxy();
        java.lang.String str2 = hitchhikersGuideToTheGalaxy1.starship();
        org.junit.Assert.assertNotNull(faker0);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Vogon Constructor Fleet" + "'", str2, "Vogon Constructor Fleet");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str7 = internet2.image((java.lang.Integer) 749, (java.lang.Integer) 6, (java.lang.Boolean) false, "CFA Franc BEAC");
        java.lang.String str8 = internet2.macAddress();
        java.lang.String str9 = internet2.domainSuffix();
        java.lang.String str10 = internet2.domainSuffix();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://lorempixel.com/749/6/technics/CFA Franc BEAC" + "'", str7, "http://lorempixel.com/749/6/technics/CFA Franc BEAC");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2e:1c:81:69:12:e1" + "'", str8, "2e:1c:81:69:12:e1");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "biz" + "'", str9, "biz");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org" + "'", str10, "org");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        com.github.javafaker.Team team4 = faker1.team();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertNotNull(team4);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.DragonBall dragonBall3 = faker1.dragonBall();
        java.lang.String str5 = faker1.regexify("Sweden");
        com.github.javafaker.RockBand rockBand6 = faker1.rockBand();
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        java.util.Date date10 = dateAndTime7.birthday((int) (byte) 0, 6);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(dragonBall3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Sweden" + "'", str5, "Sweden");
        org.junit.Assert.assertNotNull(rockBand6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Mar 04 11:25:58 CST 2019");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Code code2 = faker1.code();
        com.github.javafaker.Avatar avatar3 = faker1.avatar();
        com.github.javafaker.Code code4 = faker1.code();
        com.github.javafaker.Ancient ancient5 = faker1.ancient();
        java.lang.String str6 = ancient5.god();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(avatar3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(ancient5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dionysus" + "'", str6, "Dionysus");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Code code2 = faker1.code();
        java.lang.String str3 = code2.ean13();
        java.lang.String str4 = code2.asin();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(code2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5536721898114" + "'", str3, "5536721898114");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "B0006YBTS2" + "'", str4, "B0006YBTS2");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.zipCode();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Serbia" + "'", str1, "Serbia");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "America/Mexico_City" + "'", str2, "America/Mexico_City");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "61610" + "'", str6, "61610");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.cityPrefix();
        java.lang.String str3 = f0.mobile();
        boolean boolean4 = f0.isTemplateStyle();
        java.lang.String str6 = f0.streetAddress((java.lang.Boolean) false);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Uganda" + "'", str1, "Uganda");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "North" + "'", str2, "North");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(750) 756-1607" + "'", str3, "(750) 756-1607");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "850 Rippin Squares" + "'", str6, "850 Rippin Squares");
    }
}
