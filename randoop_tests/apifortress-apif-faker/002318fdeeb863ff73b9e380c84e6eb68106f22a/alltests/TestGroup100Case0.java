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
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.DISCOVER;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.DISCOVER + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.DISCOVER));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.MASTERCARD;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.MASTERCARD + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.MASTERCARD));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        int int0 = com.apifortress.apiffaker.Util.getMODE_INSERT_FLAT();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        int int0 = com.apifortress.apiffaker.Util.getMODE_REMOVE();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.AOL;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.AOL + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.AOL));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        int int0 = com.apifortress.apiffaker.Main.getRANDOM();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.DANKORT;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.DANKORT + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.DANKORT));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.NETSCAPE;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.NETSCAPE + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.NETSCAPE));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.CHROME;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.CHROME + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.CHROME));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        boolean boolean3 = f2.getTemplateStyle();
        boolean boolean4 = f2.getTemplateStyle();
        org.junit.Assert.assertNotNull(f2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        int int0 = com.apifortress.apiffaker.Util.getMODE_SUBSTITUTE_FLAT();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.cityPrefix();
        java.lang.String str3 = f0.mobile();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Russian Federation" + "'", str1, "Russian Federation");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lake" + "'", str2, "Lake");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(851) 684-2176" + "'", str3, "(851) 684-2176");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        java.lang.Object obj5 = util1.setLocale("hi!");
        com.apifortress.apiffaker.F f6 = util1.getFaker();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertNotNull(f6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.validSSN();
        java.lang.String str6 = f0.password((int) (short) 0, (int) (short) 1, true, false);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "080218+6478" + "'", str1, "080218+6478");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
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
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.emailAddress();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cocos (Keeling) Islands" + "'", str1, "Cocos (Keeling) Islands");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Kiev" + "'", str2, "Europe/Kiev");
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
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.domainName();
        java.lang.String str7 = f0.fullAddress();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aruba" + "'", str1, "Aruba");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Pacific/Pago_Pago" + "'", str2, "Pacific/Pago_Pago");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "powlowski.io" + "'", str6, "powlowski.io");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Suite 039 431 Hermann Shore, Jeffersonmouth, WV 56001-4935" + "'", str7, "Suite 039 431 Hermann Shore, Jeffersonmouth, WV 56001-4935");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        com.github.javafaker.CreditCardType creditCardType7 = com.github.javafaker.CreditCardType.AMERICAN_EXPRESS;
        java.lang.Object obj8 = f0.collection((int) (byte) 1, (java.lang.Object) creditCardType7);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Bhutan" + "'", str1, "Bhutan");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "U" + "'", str5, "U");
        org.junit.Assert.assertTrue("'" + creditCardType7 + "' != '" + com.github.javafaker.CreditCardType.AMERICAN_EXPRESS + "'", creditCardType7.equals(com.github.javafaker.CreditCardType.AMERICAN_EXPRESS));
        org.junit.Assert.assertNull(obj8);
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
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1040a13f-216c-40a3-9a5f-5d8f0bed5ee5" + "'", str1, "1040a13f-216c-40a3-9a5f-5d8f0bed5ee5");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        com.apifortress.apiffaker.F f3 = new com.apifortress.apiffaker.F();
        java.lang.String str4 = f3.country();
        java.lang.String str8 = f3.password(1, 1, true);
        java.lang.String str9 = f3.url();
        java.lang.Object obj10 = util1.fillModel((java.lang.Object) str9);
        org.junit.Assert.assertNotNull(f2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Heard Island and McDonald Islands" + "'", str4, "Heard Island and McDonald Islands");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "B" + "'", str8, "B");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "www.gordon-grady.com" + "'", str9, "www.gordon-grady.com");
// flaky:         org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "www.gordon-grady.com" + "'", obj10, "www.gordon-grady.com");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.Util util4 = new com.apifortress.apiffaker.Util("");
        java.lang.Object obj5 = null;
        com.apifortress.apiffaker.F f6 = new com.apifortress.apiffaker.F();
        java.lang.String str7 = f6.country();
        java.lang.String str8 = f6.timeZone();
        int int11 = f6.integer((int) (short) 10, (int) (short) 10);
        util1.manipulateNode(0, (java.lang.Object) "", obj5, (java.lang.Object) int11, (int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Armenia" + "'", str7, "Armenia");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Europe/Athens" + "'", str8, "Europe/Athens");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.apifortress.apiffaker.Main main0 = new com.apifortress.apiffaker.Main();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.productName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = f0.zipCode("Armenia");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: address.postcode_by_state.Armenia resulted in null expression");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Sleek Wool Clock" + "'", str1, "Sleek Wool Clock");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.github.javafaker.service.FakerIDN fakerIDN0 = new com.github.javafaker.service.FakerIDN();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        int int3 = util1.deepCount((java.lang.Object) "Brazil");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = util1.fillModel((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke method single() on null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.coatLength();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "wire" + "'", str3, "wire");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.github.javafaker.Faker faker0 = null;
        com.github.javafaker.Currency currency1 = new com.github.javafaker.Currency(faker0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = currency1.code();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        java.lang.String str4 = f0.streetAddress((java.lang.Boolean) false);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "02eb02fa-bac5-4bf3-a733-288c9e25ef8e" + "'", str1, "02eb02fa-bac5-4bf3-a733-288c9e25ef8e");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.42d + "'", double2 == 29.42d);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99994 Geri Rapids" + "'", str4, "99994 Geri Rapids");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.productName();
        java.lang.String str2 = f0.zipCode();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Gorgeous Leather Lamp" + "'", str1, "Gorgeous Leather Lamp");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "66623-5528" + "'", str2, "66623-5528");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = internet2.password((int) (byte) 100, (int) (short) -1, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.apifortress.apiffaker.Main.stressTest(33, 1, (int) (byte) 100);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        java.lang.Object obj3 = util1.newNode("Republic of Korea");
        org.junit.Assert.assertNotNull(obj3);
// flaky:         org.junit.Assert.assertEquals(obj3.toString(), "[citySuffix_0, ${citySuffix}]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[citySuffix_0, ${citySuffix}]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[citySuffix_0, ${citySuffix}]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.LASER;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.LASER + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.LASER));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str5 = f0.password(6, (int) (short) 10);
        java.lang.String str6 = f0.country();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tajikistan" + "'", str1, "Tajikistan");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US Dollar" + "'", str2, "US Dollar");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ymtmuoajk" + "'", str5, "ymtmuoajk");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Niger" + "'", str6, "Niger");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.gender();
        java.lang.String str4 = dog2.size();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "male" + "'", str3, "male");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "medium" + "'", str4, "medium");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.domainWord();
        java.lang.String str4 = internet2.ipV4Cidr();
        java.lang.String str5 = internet2.ipV6Cidr();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = internet2.password(197, (int) ' ', false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "erdman" + "'", str3, "erdman");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.189.77.101/29" + "'", str4, "4.189.77.101/29");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10fc:16c6:e3df:70f5:e46b:a8e1:f181:aeac/60" + "'", str5, "10fc:16c6:e3df:70f5:e46b:a8e1:f181:aeac/60");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("590427-1763");
        java.lang.Object obj2 = util1.newNode();
        org.junit.Assert.assertNotNull(obj2);
// flaky:         org.junit.Assert.assertEquals(obj2.toString(), "[country_0, ${country}]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "[country_0, ${country}]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[country_0, ${country}]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.JCB;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.JCB + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.JCB));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.zipCode();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "34838-3458" + "'", str3, "34838-3458");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.cityName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tonga" + "'", str1, "Tonga");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Africa/Johannesburg" + "'", str2, "Africa/Johannesburg");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "New Chong" + "'", str3, "New Chong");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        int int0 = com.apifortress.apiffaker.Util.getMODE_FILL();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str3 = f0.countryCodeSL3d();
        int int5 = f0.integer((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Malaysia" + "'", str1, "Malaysia");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "New Zealand Dollar" + "'", str2, "New Zealand Dollar");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "irl" + "'", str3, "irl");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.currencyCode();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GEL" + "'", str1, "GEL");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.domainWord();
        java.lang.String str4 = internet2.ipV4Cidr();
        java.lang.String str6 = internet2.macAddress("czlfomrdtndepqo");
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ohara" + "'", str3, "ohara");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "45.195.71.142/4" + "'", str4, "45.195.71.142/4");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "czlfomrdtndepqo:09:02:f9:41:b3" + "'", str6, "czlfomrdtndepqo:09:02:f9:41:b3");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("Europe/Tallinn");
        com.github.javafaker.Commerce commerce5 = faker1.commerce();
        java.lang.String str6 = commerce5.department();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Europe/Tallinn" + "'", str4, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(commerce5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Outdoors" + "'", str6, "Outdoors");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: locale is required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Job job3 = new com.github.javafaker.Job(faker1);
        java.lang.String str4 = job3.field();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Legal" + "'", str4, "Legal");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("Europe/Tallinn");
        com.github.javafaker.Currency currency5 = faker1.currency();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Europe/Tallinn" + "'", str4, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(currency5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = address2.countyByZipCode("East");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: address.county_by_postcode.East resulted in null expression");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "East" + "'", str3, "East");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        com.github.javafaker.Matz matz3 = faker1.matz();
        java.lang.String str4 = matz3.quote();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(matz3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Smart people underestimate the ordinarity of ordinary people." + "'", str4, "Smart people underestimate the ordinarity of ordinary people.");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        com.apifortress.apiffaker.F f4 = util1.getFaker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = util1.fillModel("Asia/Ulaanbaatar");
            org.junit.Assert.fail("Expected exception of type groovy.json.JsonException; message: Unable to determine the current character, it is not a string, number, array, or object??The current character read is 'A' with an int value of 65?Unable to determine the current character, it is not a string, number, array, or object?line number 1?index number 0?Asia/Ulaanbaatar?^");
        } catch (groovy.json.JsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(f4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("Europe/Tallinn");
        com.github.javafaker.Company company5 = faker1.company();
        java.lang.String str6 = company5.url();
        java.lang.String str7 = company5.suffix();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Europe/Tallinn" + "'", str4, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(company5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.kozeystrosinandpurdy.com" + "'", str6, "www.kozeystrosinandpurdy.com");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "and Sons" + "'", str7, "and Sons");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        java.lang.String str4 = address2.buildingNumber();
        java.lang.String str5 = address2.fullAddress();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "West" + "'", str3, "West");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "03095" + "'", str4, "03095");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Apt. 554 03198 Gislason Light, Merryberg, OR 42123-7690" + "'", str5, "Apt. 554 03198 Gislason Light, Merryberg, OR 42123-7690");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str5 = f0.password(7, 33, false, true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!fevxyjc^trj" + "'", str5, "!fevxyjc^trj");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        java.lang.String str3 = weather2.temperatureFahrenheit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = weather2.temperatureFahrenheit(197, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-5\260F" + "'", str3, "-5\260F");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        int int0 = com.apifortress.apiffaker.Util.getMODE_INSERT();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.github.javafaker.idnumbers.EnIdNumber enIdNumber0 = new com.github.javafaker.idnumbers.EnIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = com.github.javafaker.Faker.instance(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Weather weather4 = faker2.weather();
        java.lang.String str5 = enIdNumber0.getValidSsn(faker2);
        com.github.javafaker.Beer beer6 = faker2.beer();
        com.github.javafaker.LeagueOfLegends leagueOfLegends7 = faker2.leagueOfLegends();
        com.github.javafaker.Address address8 = faker2.address();
        org.junit.Assert.assertNotNull(faker2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(weather4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "134-88-7201" + "'", str5, "134-88-7201");
        org.junit.Assert.assertNotNull(beer6);
        org.junit.Assert.assertNotNull(leagueOfLegends7);
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        java.lang.String str4 = address2.streetName();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "South" + "'", str3, "South");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Bobby Points" + "'", str4, "Bobby Points");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
// flaky:         com.apifortress.apiffaker.Main.stressTest(100, (int) '#');
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = f0.password((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Saint Barthelemy" + "'", str1, "Saint Barthelemy");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Krasnoyarsk" + "'", str2, "Asia/Krasnoyarsk");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.HowIMetYourMother howIMetYourMother3 = faker1.howIMetYourMother();
        java.lang.String str4 = howIMetYourMother3.highFive();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(howIMetYourMother3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Self Five" + "'", str4, "Self Five");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
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
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("Europe/Tallinn");
        com.github.javafaker.Options options5 = faker1.options();
        com.github.javafaker.service.files.EnFile[] enFileArray6 = new com.github.javafaker.service.files.EnFile[] {};
        java.util.ArrayList<com.github.javafaker.service.files.EnFile> enFileList7 = new java.util.ArrayList<com.github.javafaker.service.files.EnFile>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.github.javafaker.service.files.EnFile>) enFileList7, enFileArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.service.files.EnFile enFile9 = options5.nextElement((java.util.List<com.github.javafaker.service.files.EnFile>) enFileList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Europe/Tallinn" + "'", str4, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(enFileArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str5 = f0.password(6, (int) (short) 10);
        boolean boolean6 = f0.bool();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Greece" + "'", str1, "Greece");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Jordanian Dinar" + "'", str2, "Jordanian Dinar");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "uyhctdnd" + "'", str5, "uyhctdnd");
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
// flaky:         com.apifortress.apiffaker.Main.stressTest((int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("Europe/Tallinn");
        com.github.javafaker.Company company5 = faker1.company();
        java.lang.String str6 = company5.url();
        java.lang.String str7 = company5.url();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Europe/Tallinn" + "'", str4, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(company5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.blick-hamill.net" + "'", str6, "www.blick-hamill.net");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "www.grimesinc.org" + "'", str7, "www.grimesinc.org");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        char char5 = lorem3.character(true);
        java.util.List<java.lang.String> strList6 = lorem3.words();
        java.util.List<java.lang.String> strList8 = lorem3.sentences(910);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(lorem3);
// flaky:         org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'k' + "'", char5 == 'k');
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.breed();
        java.lang.String str4 = dog2.name();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Appenzeller" + "'", str3, "Appenzeller");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Angel" + "'", str4, "Angel");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        java.lang.Object obj5 = util1.setLocale("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = util1.fillModel("Heard Island and McDonald Islands");
            org.junit.Assert.fail("Expected exception of type groovy.json.JsonException; message: Unable to determine the current character, it is not a string, number, array, or object??The current character read is 'H' with an int value of 72?Unable to determine the current character, it is not a string, number, array, or object?line number 1?index number 0?Heard Island and McDonald Islands?^");
        } catch (groovy.json.JsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.github.javafaker.idnumbers.EnIdNumber enIdNumber0 = new com.github.javafaker.idnumbers.EnIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = com.github.javafaker.Faker.instance(random1);
        com.github.javafaker.Weather weather3 = faker2.weather();
        com.github.javafaker.Number number4 = faker2.number();
        com.github.javafaker.Commerce commerce5 = faker2.commerce();
        java.lang.String str6 = enIdNumber0.getValidSsn(faker2);
        org.junit.Assert.assertNotNull(faker2);
        org.junit.Assert.assertNotNull(weather3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(commerce5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "606-55-1563" + "'", str6, "606-55-1563");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Commerce commerce4 = faker1.commerce();
        com.github.javafaker.University university5 = faker1.university();
        java.lang.String str6 = university5.name();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(commerce4);
        org.junit.Assert.assertNotNull(university5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Southern Konopelski University" + "'", str6, "Southern Konopelski University");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.productName();
        java.lang.String str2 = f0.firstName();
        int int4 = f0.integer((int) (short) 100);
        java.lang.String str5 = f0.firstName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Gorgeous Aluminum Car" + "'", str1, "Gorgeous Aluminum Car");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cristobal" + "'", str2, "Cristobal");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lyle" + "'", str5, "Lyle");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = internet2.emailAddress("UnbelievableReward517368");
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        java.lang.String str5 = faker1.regexify("Asia/Ulaanbaatar");
        com.github.javafaker.Superhero superhero6 = faker1.superhero();
        java.lang.String str7 = superhero6.power();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Asia/Ulaanbaatar" + "'", str5, "Asia/Ulaanbaatar");
        org.junit.Assert.assertNotNull(superhero6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Wishing" + "'", str7, "Wishing");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("Europe/Tallinn");
        com.github.javafaker.Company company5 = faker1.company();
        java.lang.String str6 = company5.suffix();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Europe/Tallinn" + "'", str4, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(company5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Group" + "'", str6, "Group");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        java.lang.String str3 = weather2.temperatureFahrenheit();
        java.lang.String str4 = weather2.temperatureFahrenheit();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "30\260F" + "'", str3, "30\260F");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "77\260F" + "'", str4, "77\260F");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        java.lang.String str4 = address2.buildingNumber();
        java.lang.String str5 = address2.country();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "North" + "'", str3, "North");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10135" + "'", str4, "10135");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tajikistan" + "'", str5, "Tajikistan");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.uuid();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = internet2.password(10, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6de0f1e6-bbcf-432a-8b83-e32cb1b34764" + "'", str3, "6de0f1e6-bbcf-432a-8b83-e32cb1b34764");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        java.lang.String str7 = f0.invalidID();
        java.lang.String str8 = f0.state();
        int int11 = f0.integer(33, (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Uzbekistan" + "'", str1, "Uzbekistan");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.chieko-torp.io" + "'", str6, "www.chieko-torp.io");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "666-14-0036" + "'", str7, "666-14-0036");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Arkansas" + "'", str8, "Arkansas");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.HowIMetYourMother howIMetYourMother3 = faker1.howIMetYourMother();
        com.github.javafaker.GameOfThrones gameOfThrones4 = faker1.gameOfThrones();
        com.github.javafaker.Demographic demographic5 = faker1.demographic();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(howIMetYourMother3);
        org.junit.Assert.assertNotNull(gameOfThrones4);
        org.junit.Assert.assertNotNull(demographic5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        int int4 = f0.integer(2);
        double double8 = f0.decimal((long) 32, (long) 2, (int) 'g');
        java.lang.String str9 = f0.companyName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Spain" + "'", str1, "Spain");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Afghani" + "'", str2, "Afghani");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.046665074975902d + "'", double8 == 8.046665074975902d);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Upton, Green and Hammes" + "'", str9, "Upton, Green and Hammes");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.DINERS_CLUB;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.DINERS_CLUB + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.DINERS_CLUB));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Hacker hacker3 = faker1.hacker();
        java.lang.String str4 = hacker3.noun();
        java.lang.String str5 = hacker3.verb();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(hacker3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "driver" + "'", str4, "driver");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "navigate" + "'", str5, "navigate");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        char char4 = lorem3.character();
        java.lang.String str5 = lorem3.paragraph();
        java.lang.String str6 = lorem3.paragraph();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(lorem3);
// flaky:         org.junit.Assert.assertTrue("'" + char4 + "' != '" + '6' + "'", char4 == '6');
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Illo cum dolores. Quis reprehenderit rem est. Amet molestiae consequatur sunt numquam maiores. Sint cumque ullam distinctio praesentium est." + "'", str5, "Illo cum dolores. Quis reprehenderit rem est. Amet molestiae consequatur sunt numquam maiores. Sint cumque ullam distinctio praesentium est.");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Enim facere architecto iste repellat a. Soluta eum nobis doloribus doloremque et asperiores. Dolores esse quo consequuntur quo. Et voluptas dolores non. Architecto vitae quo quisquam." + "'", str6, "Enim facere architecto iste repellat a. Soluta eum nobis doloribus doloremque et asperiores. Dolores esse quo consequuntur quo. Et voluptas dolores non. Architecto vitae quo quisquam.");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Commerce commerce4 = faker1.commerce();
        java.lang.String str5 = commerce4.promotionCode();
        java.lang.String str6 = commerce4.promotionCode();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(commerce4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SpectacularBenefit347124" + "'", str5, "SpectacularBenefit347124");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IncrediblePromotion106835" + "'", str6, "IncrediblePromotion106835");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        char char5 = lorem3.character(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = lorem3.characters(910, (int) (short) 100, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(lorem3);
// flaky:         org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'u' + "'", char5 == 'u');
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        char char5 = lorem3.character(true);
        java.lang.String str7 = lorem3.characters(false);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(lorem3);
// flaky:         org.junit.Assert.assertTrue("'" + char5 + "' != '" + '5' + "'", char5 == '5');
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9osgj82t0sd33evgyqvhndjqtuvth57x3l9fhaxwqwy19z5ghw6od4f89si1364zh8vyo6cuh1l8lw64i3ghio40cem9d7peuuuir26r54e9tomwtt2c807cqaxcq3zkrcj624dkevtcjbr41piitlytqqlve4abo3cvewxvzsinrnw40nt61uhregltmnhpxtu4ug7kq6hdj6rcsfg5i8r286p2o39spkqlimrtddfr9hoz9idiu3p9prkrudp" + "'", str7, "9osgj82t0sd33evgyqvhndjqtuvth57x3l9fhaxwqwy19z5ghw6od4f89si1364zh8vyo6cuh1l8lw64i3ghio40cem9d7peuuuir26r54e9tomwtt2c807cqaxcq3zkrcj624dkevtcjbr41piitlytqqlve4abo3cvewxvzsinrnw40nt61uhregltmnhpxtu4ug7kq6hdj6rcsfg5i8r286p2o39spkqlimrtddfr9hoz9idiu3p9prkrudp");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.invalidSSN();
        f0.setLocale("z");
        java.lang.String str4 = f0.profession();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "738188+0741" + "'", str1, "738188+0741");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "bookkeeper" + "'", str4, "bookkeeper");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        java.lang.String str4 = address2.countryCode();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Port" + "'", str3, "Port");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MD" + "'", str4, "MD");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        java.lang.String str7 = f0.invalidID();
        com.apifortress.apiffaker.F f9 = new com.apifortress.apiffaker.F();
        java.lang.String str10 = f9.country();
        java.lang.Object obj11 = f0.collection(6, (java.lang.Object) f9);
        java.lang.String str12 = f9.validSSN();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ukraine" + "'", str1, "Ukraine");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.gerald-balistreri.info" + "'", str6, "www.gerald-balistreri.info");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "910-47-6363" + "'", str7, "910-47-6363");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Norfolk Island" + "'", str10, "Norfolk Island");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "090803-7427" + "'", str12, "090803-7427");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        char char5 = lorem3.character(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = lorem3.characters(32, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(lorem3);
// flaky:         org.junit.Assert.assertTrue("'" + char5 + "' != '" + '5' + "'", char5 == '5');
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = address2.zipCodeByState("Colombia");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: address.postcode_by_state.Colombia resulted in null expression");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
// flaky:         com.apifortress.apiffaker.Main.stressTest((int) (byte) 0, (int) 'g');
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.SAFARI;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.SAFARI + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.SAFARI));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.timeZone();
        java.lang.String str4 = address2.streetName();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Asia/Magadan" + "'", str3, "Asia/Magadan");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deeann Fords" + "'", str4, "Deeann Fords");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        java.lang.String str4 = address2.latitude();
        java.lang.String str5 = address2.lastName();
        java.lang.String str6 = address2.streetSuffix();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "South" + "'", str3, "South");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-17.471499" + "'", str4, "-17.471499");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Klein" + "'", str5, "Klein");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course" + "'", str6, "Course");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        java.lang.Object obj7 = util1.manipulateModel((int) 'b', "03095", (int) ' ');
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 3095 + "'", obj7, 3095);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        java.lang.String str3 = f0.suffix();
        java.lang.String str4 = f0.countryCodeSL();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e07c4b0c-9c7f-4733-9747-af6f1950ac13" + "'", str1, "e07c4b0c-9c7f-4733-9747-af6f1950ac13");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 59.87d + "'", double2 == 59.87d);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Inc" + "'", str3, "Inc");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hu" + "'", str4, "hu");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        boolean boolean3 = f2.getTemplateStyle();
        f2.setTemplateStyle(true);
        java.lang.String str6 = f2.productName();
        org.junit.Assert.assertNotNull(f2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ergonomic Plastic Lamp" + "'", str6, "Ergonomic Plastic Lamp");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Number number3 = faker1.number();
        long long6 = number3.numberBetween((long) (byte) -1, 0L);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.sound();
        java.lang.String str4 = dog2.coatLength();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bow wow" + "'", str3, "bow wow");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "curly" + "'", str4, "curly");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        com.github.javafaker.Avatar avatar3 = faker1.avatar();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(avatar3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.OPERA;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.OPERA + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.OPERA));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.timeZone();
        java.lang.String str4 = address2.fullAddress();
        java.lang.String str5 = address2.citySuffix();
        java.lang.String str6 = address2.stateAbbr();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "America/Caracas" + "'", str3, "America/Caracas");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Apt. 431 750 Deshawn Lake, New Reneaberg, GA 62754" + "'", str4, "Apt. 431 750 Deshawn Lake, New Reneaberg, GA 62754");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "view" + "'", str5, "view");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UT" + "'", str6, "UT");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        java.lang.String str3 = f0.suffix();
        java.lang.String str4 = f0.fullAddress();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8cee9ef2-46f5-4354-90ab-78e483c79c7b" + "'", str1, "8cee9ef2-46f5-4354-90ab-78e483c79c7b");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 58.65d + "'", double2 == 58.65d);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LLC" + "'", str3, "LLC");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "972 Hegmann Cliff, Brianfort, AL 96813-3768" + "'", str4, "972 Hegmann Cliff, Brianfort, AL 96813-3768");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.domainWord();
        java.lang.String str4 = internet2.ipV4Cidr();
        java.lang.String str5 = internet2.userAgentAny();
        java.lang.String str6 = internet2.url();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "langosh" + "'", str3, "langosh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "216.252.27.122/31" + "'", str4, "216.252.27.122/31");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.90 Safari/537.36" + "'", str5, "Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.90 Safari/537.36");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.chet-rath.co" + "'", str6, "www.chet-rath.co");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Number number3 = faker1.number();
        java.lang.String str4 = number3.digit();
        double double8 = number3.randomDouble(80, 1698789516108L, 0L);
        int int9 = number3.randomDigit();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(number3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5" + "'", str4, "5");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.2742535675067554E12d + "'", double8 == 1.2742535675067554E12d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        java.lang.String str4 = address2.buildingNumber();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = address2.countyByZipCode("738188+0741");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: address.county_by_postcode.738188+0741 resulted in null expression");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Port" + "'", str3, "Port");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "117" + "'", str4, "117");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.domainWord();
        java.lang.String str4 = internet2.domainName();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "rowe" + "'", str3, "rowe");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kuhic.io" + "'", str4, "kuhic.io");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        int int5 = f0.integer(0);
        java.lang.String str6 = f0.price();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Djibouti" + "'", str1, "Djibouti");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Berlin" + "'", str2, "Europe/Berlin");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "39.48" + "'", str3, "39.48");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26 + "'", int5 == 26);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "97.87" + "'", str6, "97.87");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.uuid();
        java.lang.String str7 = f0.domainSuffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Venezuela" + "'", str1, "Venezuela");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "w" + "'", str5, "w");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7d5f3866-3e78-4f53-b2d4-1056cc7c4b25" + "'", str6, "7d5f3866-3e78-4f53-b2d4-1056cc7c4b25");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "co" + "'", str7, "co");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Number number3 = faker1.number();
        java.lang.String str4 = number3.digit();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = number3.randomNumber(26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(number3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.github.javafaker.idnumbers.EnIdNumber enIdNumber0 = new com.github.javafaker.idnumbers.EnIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = com.github.javafaker.Faker.instance(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Weather weather4 = faker2.weather();
        java.lang.String str5 = enIdNumber0.getValidSsn(faker2);
        com.github.javafaker.service.RandomService randomService6 = faker2.random();
        org.junit.Assert.assertNotNull(faker2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(weather4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "826-44-1955" + "'", str5, "826-44-1955");
        org.junit.Assert.assertNotNull(randomService6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        int int5 = f0.integer(0);
        java.lang.String str6 = f0.password();
        double double10 = f0.decimal((long) 4, (long) (byte) 1, 75);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cameroon" + "'", str1, "Cameroon");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Pacific/Fiji" + "'", str2, "Pacific/Fiji");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40.80" + "'", str3, "40.80");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "vvgnnehvy" + "'", str6, "vvgnnehvy");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.6741471041084708d + "'", double10 == 1.6741471041084708d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("Europe/Tallinn");
        com.github.javafaker.Options options5 = faker1.options();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = com.github.javafaker.Faker.instance(random6);
        com.github.javafaker.Dog dog8 = faker7.dog();
        com.github.javafaker.Hacker hacker9 = faker7.hacker();
        java.lang.String str10 = hacker9.noun();
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = com.github.javafaker.Faker.instance(random11);
        com.github.javafaker.Dog dog13 = faker12.dog();
        com.github.javafaker.Hacker hacker14 = faker12.hacker();
        java.lang.String str15 = hacker14.noun();
        java.lang.String str16 = hacker14.verb();
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = com.github.javafaker.Faker.instance(random17);
        com.github.javafaker.Dog dog19 = faker18.dog();
        com.github.javafaker.Hacker hacker20 = faker18.hacker();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = com.github.javafaker.Faker.instance(random21);
        com.github.javafaker.Dog dog23 = faker22.dog();
        com.github.javafaker.Hacker hacker24 = faker22.hacker();
        java.util.Random random25 = null;
        com.github.javafaker.Faker faker26 = com.github.javafaker.Faker.instance(random25);
        com.github.javafaker.Dog dog27 = faker26.dog();
        com.github.javafaker.Hacker hacker28 = faker26.hacker();
        java.lang.String str29 = hacker28.noun();
        java.lang.String str30 = hacker28.verb();
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = com.github.javafaker.Faker.instance(random31);
        com.github.javafaker.Dog dog33 = faker32.dog();
        com.github.javafaker.Hacker hacker34 = faker32.hacker();
        java.lang.String str35 = hacker34.noun();
        java.lang.String str36 = hacker34.verb();
        com.github.javafaker.Hacker[] hackerArray37 = new com.github.javafaker.Hacker[] { hacker9, hacker14, hacker20, hacker24, hacker28, hacker34 };
        com.github.javafaker.Hacker hacker38 = options5.nextElement(hackerArray37);
        java.lang.String str39 = hacker38.adjective();
        java.lang.String str40 = hacker38.abbreviation();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Europe/Tallinn" + "'", str4, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(faker7);
        org.junit.Assert.assertNotNull(dog8);
        org.junit.Assert.assertNotNull(hacker9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "card" + "'", str10, "card");
        org.junit.Assert.assertNotNull(faker12);
        org.junit.Assert.assertNotNull(dog13);
        org.junit.Assert.assertNotNull(hacker14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "program" + "'", str15, "program");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "parse" + "'", str16, "parse");
        org.junit.Assert.assertNotNull(faker18);
        org.junit.Assert.assertNotNull(dog19);
        org.junit.Assert.assertNotNull(hacker20);
        org.junit.Assert.assertNotNull(faker22);
        org.junit.Assert.assertNotNull(dog23);
        org.junit.Assert.assertNotNull(hacker24);
        org.junit.Assert.assertNotNull(faker26);
        org.junit.Assert.assertNotNull(dog27);
        org.junit.Assert.assertNotNull(hacker28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "matrix" + "'", str29, "matrix");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "connect" + "'", str30, "connect");
        org.junit.Assert.assertNotNull(faker32);
        org.junit.Assert.assertNotNull(dog33);
        org.junit.Assert.assertNotNull(hacker34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "capacitor" + "'", str35, "capacitor");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "index" + "'", str36, "index");
        org.junit.Assert.assertNotNull(hackerArray37);
        org.junit.Assert.assertNotNull(hacker38);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "online" + "'", str39, "online");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "COM" + "'", str40, "COM");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        java.lang.String str7 = f0.invalidID();
        java.lang.String str8 = f0.countryCodeSL3d();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Samoa" + "'", str1, "Samoa");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P" + "'", str5, "P");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.dannie-ledner.com" + "'", str6, "www.dannie-ledner.com");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "903-52-5861" + "'", str7, "903-52-5861");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "stp" + "'", str8, "stp");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        java.lang.String str4 = address2.latitude();
        java.lang.String str5 = address2.lastName();
        java.lang.String str6 = address2.city();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "New" + "'", str3, "New");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-70.574630" + "'", str4, "-70.574630");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ullrich" + "'", str5, "Ullrich");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "East Dennis" + "'", str6, "East Dennis");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        java.lang.String str4 = address2.latitude();
        java.lang.String str5 = address2.countryCode();
        java.lang.String str6 = address2.timeZone();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "South" + "'", str3, "South");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-76.218129" + "'", str4, "-76.218129");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MO" + "'", str5, "MO");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pacific/Auckland" + "'", str6, "Pacific/Auckland");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Hacker hacker3 = faker1.hacker();
        com.github.javafaker.Avatar avatar4 = faker1.avatar();
        java.lang.String str6 = faker1.bothify("390714-7882");
        com.github.javafaker.Cat cat7 = faker1.cat();
        java.lang.String str8 = cat7.registry();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(avatar4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "390714-7882" + "'", str6, "390714-7882");
        org.junit.Assert.assertNotNull(cat7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cat Aficionado Association" + "'", str8, "Cat Aficionado Association");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        int int3 = randomService1.nextInt((int) 'g');
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27 + "'", int3 == 27);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.github.javafaker.idnumbers.EnIdNumber enIdNumber0 = new com.github.javafaker.idnumbers.EnIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = com.github.javafaker.Faker.instance(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Weather weather4 = faker2.weather();
        java.lang.String str5 = enIdNumber0.getValidSsn(faker2);
        com.github.javafaker.Beer beer6 = faker2.beer();
        com.github.javafaker.Beer beer7 = faker2.beer();
        com.github.javafaker.DateAndTime dateAndTime8 = faker2.date();
        java.util.concurrent.TimeUnit timeUnit10 = null;
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = dateAndTime8.future(0, timeUnit10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(weather4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "642-75-6515" + "'", str5, "642-75-6515");
        org.junit.Assert.assertNotNull(beer6);
        org.junit.Assert.assertNotNull(beer7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Friends friends3 = faker1.friends();
        java.lang.String str6 = faker1.letterify("666-14-0036", true);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(friends3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "666-14-0036" + "'", str6, "666-14-0036");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Friends friends3 = faker1.friends();
        com.github.javafaker.Cat cat4 = faker1.cat();
        com.github.javafaker.Superhero superhero5 = faker1.superhero();
        java.lang.String str6 = superhero5.prefix();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(friends3);
        org.junit.Assert.assertNotNull(cat4);
        org.junit.Assert.assertNotNull(superhero5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Illustrious" + "'", str6, "Illustrious");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.domainWord();
        java.lang.String str4 = internet2.uuid();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mertz" + "'", str3, "mertz");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "43d9cf67-1ba4-424e-88d3-ca74177537a8" + "'", str4, "43d9cf67-1ba4-424e-88d3-ca74177537a8");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.HowIMetYourMother howIMetYourMother3 = faker1.howIMetYourMother();
        com.github.javafaker.GameOfThrones gameOfThrones4 = faker1.gameOfThrones();
        com.github.javafaker.Options options5 = faker1.options();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(howIMetYourMother3);
        org.junit.Assert.assertNotNull(gameOfThrones4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        java.lang.String str7 = f0.invalidID();
        com.apifortress.apiffaker.F f9 = new com.apifortress.apiffaker.F();
        java.lang.String str10 = f9.country();
        java.lang.Object obj11 = f0.collection(6, (java.lang.Object) f9);
        java.lang.String str13 = f9.streetAddress((java.lang.Boolean) false);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Haiti" + "'", str1, "Haiti");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "V" + "'", str5, "V");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.berry-bechtelar.com" + "'", str6, "www.berry-bechtelar.com");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "985-64-4848" + "'", str7, "985-64-4848");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Netherlands Antilles" + "'", str10, "Netherlands Antilles");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "05307 Romaguera Field" + "'", str13, "05307 Romaguera Field");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Robin robin4 = faker1.robin();
        java.lang.String str5 = robin4.quote();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(robin4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Holy Alter Ego" + "'", str5, "Holy Alter Ego");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("Europe/Tallinn");
        com.github.javafaker.Commerce commerce5 = faker1.commerce();
        java.lang.String str7 = commerce5.promotionCode(33);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Europe/Tallinn" + "'", str4, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(commerce5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MarvelousBounty708598573503101587228626409443818" + "'", str7, "MarvelousBounty708598573503101587228626409443818");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.HowIMetYourMother howIMetYourMother3 = faker1.howIMetYourMother();
        com.github.javafaker.GameOfThrones gameOfThrones4 = faker1.gameOfThrones();
        com.github.javafaker.Lebowski lebowski5 = new com.github.javafaker.Lebowski(faker1);
        com.github.javafaker.PhoneNumber phoneNumber6 = faker1.phoneNumber();
        java.lang.String str7 = phoneNumber6.phoneNumber();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(howIMetYourMother3);
        org.junit.Assert.assertNotNull(gameOfThrones4);
        org.junit.Assert.assertNotNull(phoneNumber6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "372.909.9186 x4018" + "'", str7, "372.909.9186 x4018");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.github.javafaker.idnumbers.EnIdNumber enIdNumber0 = new com.github.javafaker.idnumbers.EnIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = com.github.javafaker.Faker.instance(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Weather weather4 = faker2.weather();
        java.lang.String str5 = enIdNumber0.getValidSsn(faker2);
        com.github.javafaker.Beer beer6 = faker2.beer();
        com.github.javafaker.LeagueOfLegends leagueOfLegends7 = faker2.leagueOfLegends();
        com.github.javafaker.Robin robin8 = faker2.robin();
        org.junit.Assert.assertNotNull(faker2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(weather4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "524-77-9670" + "'", str5, "524-77-9670");
        org.junit.Assert.assertNotNull(beer6);
        org.junit.Assert.assertNotNull(leagueOfLegends7);
        org.junit.Assert.assertNotNull(robin8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        com.github.javafaker.Shakespeare shakespeare4 = faker1.shakespeare();
        java.lang.String str5 = shakespeare4.romeoAndJulietQuote();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertNotNull(shakespeare4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tempt not a desperate man." + "'", str5, "Tempt not a desperate man.");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("Europe/Tallinn");
        com.github.javafaker.Company company5 = faker1.company();
        java.lang.String str6 = company5.url();
        java.lang.String str7 = company5.industry();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Europe/Tallinn" + "'", str4, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(company5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.gislason-schowalter.biz" + "'", str6, "www.gislason-schowalter.biz");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Program Development" + "'", str7, "Program Development");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        com.github.javafaker.Shakespeare shakespeare4 = faker1.shakespeare();
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.date();
        java.util.Date date6 = null;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = dateAndTime5.between(date6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertNotNull(shakespeare4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        java.lang.String str4 = f0.password(28, (int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "d2f19304-d4d4-448b-ae2a-21b5ddb3bee1" + "'", str1, "d2f19304-d4d4-448b-ae2a-21b5ddb3bee1");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mfhjtbxpjxgeydxbjsxhpxjftpycnsuxdmn" + "'", str4, "mfhjtbxpjxgeydxbjsxhpxjftpycnsuxdmn");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Commerce commerce4 = faker1.commerce();
        com.github.javafaker.Superhero superhero5 = faker1.superhero();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(commerce4);
        org.junit.Assert.assertNotNull(superhero5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        int int6 = f0.streetAddressNumber();
        java.lang.String str7 = f0.streetSuffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Turks and Caicos Islands" + "'", str1, "Turks and Caicos Islands");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Bratislava" + "'", str2, "Europe/Bratislava");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 564 + "'", int6 == 564);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Station" + "'", str7, "Station");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.fullName();
        java.lang.String str7 = f0.domainName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Samoa" + "'", str1, "Samoa");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Bucharest" + "'", str2, "Europe/Bucharest");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dr. Doyle Little" + "'", str6, "Dr. Doyle Little");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "schaden.org" + "'", str7, "schaden.org");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        java.lang.String str4 = ancient3.primordial();
        java.lang.String str5 = ancient3.god();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tartarus" + "'", str4, "Tartarus");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hades" + "'", str5, "Hades");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Lebowski lebowski2 = faker0.lebowski();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(lebowski2);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.streetAddress();
        java.lang.String str4 = address2.countryCode();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20104 Dooley Union" + "'", str3, "20104 Dooley Union");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GF" + "'", str4, "GF");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.domainSuffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Bouvet Island (Bouvetoya)" + "'", str1, "Bouvet Island (Bouvetoya)");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "America/Monterrey" + "'", str2, "America/Monterrey");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org" + "'", str6, "org");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str3 = f0.suffix();
        java.lang.String str4 = f0.invalidSSN();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Solomon Islands" + "'", str1, "Solomon Islands");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Guyana Dollar" + "'", str2, "Guyana Dollar");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "and Sons" + "'", str3, "and Sons");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "826000+2213" + "'", str4, "826000+2213");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.domainWord();
        java.lang.String str4 = internet2.ipV4Cidr();
        java.lang.String str5 = internet2.ipV6Cidr();
        java.lang.String str10 = internet2.image((java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Boolean) true, "Bhutan");
        java.lang.String str11 = internet2.ipV6Address();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jast" + "'", str3, "jast");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "191.148.24.66/11" + "'", str4, "191.148.24.66/11");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e4ec:7d93:01d5:cb8b:00ff:dca7:950a:0f5c/118" + "'", str5, "e4ec:7d93:01d5:cb8b:00ff:dca7:950a:0f5c/118");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://lorempixel.com/g/100/2/nature/Bhutan" + "'", str10, "http://lorempixel.com/g/100/2/nature/Bhutan");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "f631:75b1:3bcd:e847:9bfa:8937:d361:dc03" + "'", str11, "f631:75b1:3bcd:e847:9bfa:8937:d361:dc03");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        java.lang.String str5 = faker1.regexify("Asia/Ulaanbaatar");
        com.github.javafaker.Superhero superhero6 = faker1.superhero();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        java.lang.String str8 = demographic7.race();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Asia/Ulaanbaatar" + "'", str5, "Asia/Ulaanbaatar");
        org.junit.Assert.assertNotNull(superhero6);
        org.junit.Assert.assertNotNull(demographic7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "American Indian or Alaska Native" + "'", str8, "American Indian or Alaska Native");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str2 = code1.ean8();
        java.lang.String str3 = code1.asin();
        org.junit.Assert.assertNotNull(code1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "79987943" + "'", str2, "79987943");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "B000I4W7S6" + "'", str3, "B000I4W7S6");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.size();
        java.lang.String str4 = dog2.gender();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "small" + "'", str3, "small");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "female" + "'", str4, "female");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        boolean boolean3 = f2.getTemplateStyle();
        int[] intArray7 = f2.integerList((int) (short) 100, (int) (byte) -1, (int) (short) 0);
        java.lang.String str8 = f2.buildingNumber();
        org.junit.Assert.assertNotNull(f2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4896" + "'", str8, "4896");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.invalidSSN();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = f0.password(910, 75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "870073-1654" + "'", str1, "870073-1654");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        char char5 = lorem3.character(true);
        char char7 = lorem3.character(false);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(lorem3);
// flaky:         org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'g' + "'", char5 == 'g');
// flaky:         org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'u' + "'", char7 == 'u');
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        int int4 = f0.integer(2);
        java.lang.String str5 = f0.suffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tajikistan" + "'", str1, "Tajikistan");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CFA Franc BEAC" + "'", str2, "CFA Franc BEAC");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "and Sons" + "'", str5, "and Sons");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Hacker hacker3 = faker1.hacker();
        com.github.javafaker.Avatar avatar4 = faker1.avatar();
        com.github.javafaker.Matz matz5 = faker1.matz();
        java.lang.String str6 = matz5.quote();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(avatar4);
        org.junit.Assert.assertNotNull(matz5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Most of the tasks we do are for humans. For example, a tax calculation is counting numbers so the government can pull money out from my wallet, but government consists of humans." + "'", str6, "Most of the tasks we do are for humans. For example, a tax calculation is counting numbers so the government can pull money out from my wallet, but government consists of humans.");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Commerce commerce4 = faker1.commerce();
        java.lang.String str5 = commerce4.department();
        java.lang.String str6 = commerce4.material();
        java.lang.String str7 = commerce4.price();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(commerce4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clothing, Electronics & Kids" + "'", str5, "Clothing, Electronics & Kids");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Plastic" + "'", str6, "Plastic");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "37.43" + "'", str7, "37.43");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.domainWord();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = internet2.password(0, (int) (byte) 10, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kerluke" + "'", str3, "kerluke");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.github.javafaker.idnumbers.EnIdNumber enIdNumber0 = new com.github.javafaker.idnumbers.EnIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = com.github.javafaker.Faker.instance(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Weather weather4 = faker2.weather();
        java.lang.String str5 = enIdNumber0.getValidSsn(faker2);
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = com.github.javafaker.Faker.instance(random6);
        com.github.javafaker.Dog dog8 = faker7.dog();
        com.github.javafaker.HowIMetYourMother howIMetYourMother9 = faker7.howIMetYourMother();
        java.lang.String str10 = enIdNumber0.getValidSsn(faker7);
        org.junit.Assert.assertNotNull(faker2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(weather4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "345-13-0298" + "'", str5, "345-13-0298");
        org.junit.Assert.assertNotNull(faker7);
        org.junit.Assert.assertNotNull(dog8);
        org.junit.Assert.assertNotNull(howIMetYourMother9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "379-38-6705" + "'", str10, "379-38-6705");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        int int6 = f0.streetAddressNumber();
        java.lang.String str7 = f0.domainName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "El Salvador" + "'", str1, "El Salvador");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Ljubljana" + "'", str2, "Europe/Ljubljana");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 460 + "'", int6 == 460);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "batz.name" + "'", str7, "batz.name");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("Europe/Tallinn");
        com.github.javafaker.Company company5 = faker1.company();
        com.github.javafaker.Company company6 = faker1.company();
        java.lang.String str7 = company6.industry();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Europe/Tallinn" + "'", str4, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(company6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Political Organization" + "'", str7, "Political Organization");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.domainWord();
        java.lang.String str4 = internet2.ipV4Cidr();
        java.lang.String str5 = internet2.ipV6Cidr();
        java.lang.String str6 = internet2.domainName();
        java.lang.String str8 = internet2.macAddress("");
        java.lang.String str9 = internet2.ipV6Cidr();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "carroll" + "'", str3, "carroll");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "85.173.10.248/25" + "'", str4, "85.173.10.248/25");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5e64:9671:5684:8467:564c:a4a0:a112:c554/95" + "'", str5, "5e64:9671:5684:8467:564c:a4a0:a112:c554/95");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mohr.io" + "'", str6, "mohr.io");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "99:bb:42:2a:46:7a" + "'", str8, "99:bb:42:2a:46:7a");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2c5d:0234:5fa1:803e:8874:6031:6722:3df4/106" + "'", str9, "2c5d:0234:5fa1:803e:8874:6031:6722:3df4/106");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("Europe/Tallinn");
        com.github.javafaker.Options options5 = faker1.options();
        java.util.List<com.github.javafaker.service.files.EnFile> enFileList6 = com.github.javafaker.service.files.EnFile.getFiles();
        com.github.javafaker.service.files.EnFile enFile7 = options5.nextElement(enFileList6);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Europe/Tallinn" + "'", str4, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(enFileList6);
        org.junit.Assert.assertNotNull(enFile7);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Commerce commerce4 = faker1.commerce();
        java.lang.String str5 = commerce4.price();
        java.lang.String str6 = commerce4.department();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(commerce4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "27.52" + "'", str5, "27.52");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Jewelry" + "'", str6, "Jewelry");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        int int3 = f2.integer();
        org.junit.Assert.assertNotNull(f2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Friends friends3 = faker1.friends();
        com.github.javafaker.Company company4 = faker1.company();
        java.lang.String str5 = company4.industry();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(friends3);
        org.junit.Assert.assertNotNull(company4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Political Organization" + "'", str5, "Political Organization");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        int int5 = f0.integer(0);
        java.lang.String str6 = f0.password();
        java.lang.String str7 = f0.domainSuffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Syrian Arab Republic" + "'", str1, "Syrian Arab Republic");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Tehran" + "'", str2, "Asia/Tehran");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86.76" + "'", str3, "86.76");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hwujrrrkotvo" + "'", str6, "hwujrrrkotvo");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "biz" + "'", str7, "biz");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        com.github.javafaker.Weather weather3 = faker1.weather();
        java.lang.String str4 = weather3.temperatureFahrenheit();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(weather3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "84\260F" + "'", str4, "84\260F");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.safeEmailAddress();
        com.github.javafaker.Internet.UserAgent userAgent4 = com.github.javafaker.Internet.UserAgent.INTERNET_EXPLORER;
        java.lang.String str5 = internet2.userAgent(userAgent4);
        java.lang.String str6 = internet2.domainWord();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertTrue("'" + userAgent4 + "' != '" + com.github.javafaker.Internet.UserAgent.INTERNET_EXPLORER + "'", userAgent4.equals(com.github.javafaker.Internet.UserAgent.INTERNET_EXPLORER));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko" + "'", str5, "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dickens" + "'", str6, "dickens");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.cityPrefix();
        java.lang.String str3 = f0.invalidSSN();
        java.lang.String str4 = f0.streetName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Virgin Islands, British" + "'", str1, "Virgin Islands, British");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Port" + "'", str2, "Port");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "117649-9670" + "'", str3, "117649-9670");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ortiz Glens" + "'", str4, "Ortiz Glens");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("590427-1763");
        java.lang.Object obj3 = util1.newNode("New Zealand Dollar");
        com.apifortress.apiffaker.F f4 = util1.getFaker();
        org.junit.Assert.assertNotNull(obj3);
// flaky:         org.junit.Assert.assertEquals(obj3.toString(), "[country_0, ${country}]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[country_0, ${country}]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[country_0, ${country}]");
        org.junit.Assert.assertNotNull(f4);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("Europe/Tallinn");
        com.github.javafaker.Stock stock5 = faker1.stock();
        java.lang.String str6 = stock5.nsdqSymbol();
        java.lang.String str7 = stock5.nsdqSymbol();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Europe/Tallinn" + "'", str4, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(stock5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EDUC" + "'", str6, "EDUC");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IVFVC" + "'", str7, "IVFVC");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Beer beer2 = faker1.beer();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(beer2);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        com.github.javafaker.Overwatch overwatch4 = faker1.overwatch();
        java.lang.String str5 = overwatch4.quote();
        java.lang.String str6 = overwatch4.quote();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertNotNull(overwatch4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "G\351ill do mo thoil!" + "'", str5, "G\351ill do mo thoil!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Activating Self Destruct Sequence." + "'", str6, "Activating Self Destruct Sequence.");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.uuid();
        java.lang.String str4 = internet2.url();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "d2a1dca1-accc-4b82-ae79-964096f78d4b" + "'", str3, "d2a1dca1-accc-4b82-ae79-964096f78d4b");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "www.daysi-hagenes.co" + "'", str4, "www.daysi-hagenes.co");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = address2.zipCodeByState("379-38-6705");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: address.postcode_by_state.379-38-6705 resulted in null expression");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "North" + "'", str3, "North");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("Europe/Tallinn");
        com.github.javafaker.Options options5 = faker1.options();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = com.github.javafaker.Faker.instance(random6);
        com.github.javafaker.Dog dog8 = faker7.dog();
        com.github.javafaker.Hacker hacker9 = faker7.hacker();
        java.lang.String str10 = hacker9.noun();
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = com.github.javafaker.Faker.instance(random11);
        com.github.javafaker.Dog dog13 = faker12.dog();
        com.github.javafaker.Hacker hacker14 = faker12.hacker();
        java.lang.String str15 = hacker14.noun();
        java.lang.String str16 = hacker14.verb();
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = com.github.javafaker.Faker.instance(random17);
        com.github.javafaker.Dog dog19 = faker18.dog();
        com.github.javafaker.Hacker hacker20 = faker18.hacker();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = com.github.javafaker.Faker.instance(random21);
        com.github.javafaker.Dog dog23 = faker22.dog();
        com.github.javafaker.Hacker hacker24 = faker22.hacker();
        java.util.Random random25 = null;
        com.github.javafaker.Faker faker26 = com.github.javafaker.Faker.instance(random25);
        com.github.javafaker.Dog dog27 = faker26.dog();
        com.github.javafaker.Hacker hacker28 = faker26.hacker();
        java.lang.String str29 = hacker28.noun();
        java.lang.String str30 = hacker28.verb();
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = com.github.javafaker.Faker.instance(random31);
        com.github.javafaker.Dog dog33 = faker32.dog();
        com.github.javafaker.Hacker hacker34 = faker32.hacker();
        java.lang.String str35 = hacker34.noun();
        java.lang.String str36 = hacker34.verb();
        com.github.javafaker.Hacker[] hackerArray37 = new com.github.javafaker.Hacker[] { hacker9, hacker14, hacker20, hacker24, hacker28, hacker34 };
        com.github.javafaker.Hacker hacker38 = options5.nextElement(hackerArray37);
        java.lang.String str39 = hacker38.adjective();
        java.lang.String str40 = hacker38.noun();
        java.lang.String str41 = hacker38.verb();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Europe/Tallinn" + "'", str4, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(faker7);
        org.junit.Assert.assertNotNull(dog8);
        org.junit.Assert.assertNotNull(hacker9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "program" + "'", str10, "program");
        org.junit.Assert.assertNotNull(faker12);
        org.junit.Assert.assertNotNull(dog13);
        org.junit.Assert.assertNotNull(hacker14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "port" + "'", str15, "port");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "parse" + "'", str16, "parse");
        org.junit.Assert.assertNotNull(faker18);
        org.junit.Assert.assertNotNull(dog19);
        org.junit.Assert.assertNotNull(hacker20);
        org.junit.Assert.assertNotNull(faker22);
        org.junit.Assert.assertNotNull(dog23);
        org.junit.Assert.assertNotNull(hacker24);
        org.junit.Assert.assertNotNull(faker26);
        org.junit.Assert.assertNotNull(dog27);
        org.junit.Assert.assertNotNull(hacker28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "driver" + "'", str29, "driver");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "parse" + "'", str30, "parse");
        org.junit.Assert.assertNotNull(faker32);
        org.junit.Assert.assertNotNull(dog33);
        org.junit.Assert.assertNotNull(hacker34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hard drive" + "'", str35, "hard drive");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "generate" + "'", str36, "generate");
        org.junit.Assert.assertNotNull(hackerArray37);
        org.junit.Assert.assertNotNull(hacker38);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "neural" + "'", str39, "neural");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "application" + "'", str40, "application");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "copy" + "'", str41, "copy");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        int int5 = f0.integer(0);
        java.lang.String str6 = f0.domainName();
        java.lang.String str7 = f0.secondaryAddress();
        java.lang.String str8 = f0.currencyCode();
        java.lang.String str9 = f0.countryCode();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Latvia" + "'", str1, "Latvia");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/London" + "'", str2, "Europe/London");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "79.75" + "'", str3, "79.75");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 91 + "'", int5 == 91);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "rippin.io" + "'", str6, "rippin.io");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Suite 581" + "'", str7, "Suite 581");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUD" + "'", str8, "AUD");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SD" + "'", str9, "SD");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.domainName();
        java.lang.String str7 = f0.url();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Congo" + "'", str1, "Congo");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Kolkata" + "'", str2, "Asia/Kolkata");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "lowe.biz" + "'", str6, "lowe.biz");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "www.maybell-hammes.info" + "'", str7, "www.maybell-hammes.info");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        java.lang.String str4 = address2.stateAbbr();
        java.lang.String str5 = address2.citySuffix();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Port" + "'", str3, "Port");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NV" + "'", str4, "NV");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mouth" + "'", str5, "mouth");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        java.lang.String str2 = internet1.publicIpV4Address();
        org.junit.Assert.assertNotNull(internet1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "138.193.96.181" + "'", str2, "138.193.96.181");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = com.github.javafaker.Faker.instance(random5);
        com.github.javafaker.Internet internet7 = faker6.internet();
        java.lang.String str9 = faker6.bothify("Europe/Tallinn");
        com.github.javafaker.File file10 = faker6.file();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code13 = faker12.code();
        com.github.javafaker.Pokemon pokemon14 = faker12.pokemon();
        util1.manipulateNode((int) 'a', (java.lang.Object) faker6, (java.lang.Object) "Specialist", (java.lang.Object) pokemon14, 75);
        org.junit.Assert.assertNotNull(faker6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Europe/Tallinn" + "'", str9, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNotNull(code13);
        org.junit.Assert.assertNotNull(pokemon14);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.github.javafaker.idnumbers.EnIdNumber enIdNumber0 = new com.github.javafaker.idnumbers.EnIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = com.github.javafaker.Faker.instance(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Weather weather4 = faker2.weather();
        java.lang.String str5 = enIdNumber0.getValidSsn(faker2);
        com.github.javafaker.Beer beer6 = faker2.beer();
        java.lang.String str7 = beer6.malt();
        java.lang.String str8 = beer6.name();
        org.junit.Assert.assertNotNull(faker2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(weather4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "753-93-7800" + "'", str5, "753-93-7800");
        org.junit.Assert.assertNotNull(beer6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pale" + "'", str7, "Pale");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Sierra Nevada Celebration Ale" + "'", str8, "Sierra Nevada Celebration Ale");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.lang.String str1 = com.github.javafaker.service.FakerIDN.toASCII("http://lorempixel.com/g/100/2/nature/Bhutan");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://lorempixel.com/g/100/2/nature/Bhutan" + "'", str1, "http://lorempixel.com/g/100/2/nature/Bhutan");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        int int5 = f0.integer(0);
        double double7 = f0.decimal((long) 'k');
        java.lang.String str8 = f0.lastName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Taiwan" + "'", str1, "Taiwan");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Moscow" + "'", str2, "Europe/Moscow");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9.00" + "'", str3, "9.00");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 90 + "'", int5 == 90);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.12d + "'", double7 == 103.12d);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ondricka" + "'", str8, "Ondricka");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        com.github.javafaker.Shakespeare shakespeare4 = faker1.shakespeare();
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.date();
        com.github.javafaker.DragonBall dragonBall6 = faker1.dragonBall();
        com.github.javafaker.Ancient ancient7 = faker1.ancient();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertNotNull(shakespeare4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(dragonBall6);
        org.junit.Assert.assertNotNull(ancient7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.HowIMetYourMother howIMetYourMother3 = faker1.howIMetYourMother();
        java.lang.String str4 = howIMetYourMother3.catchPhrase();
        java.lang.String str5 = howIMetYourMother3.character();
        java.lang.String str6 = howIMetYourMother3.quote();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(howIMetYourMother3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Legendary" + "'", str4, "Legendary");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Virginia Mosby" + "'", str5, "Virginia Mosby");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2019re going to get older whether we like it or not, so the only question is whether we get on with our lives, or desperately cling to the past." + "'", str6, "\u2019re going to get older whether we like it or not, so the only question is whether we get on with our lives, or desperately cling to the past.");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        com.github.javafaker.Shakespeare shakespeare4 = faker1.shakespeare();
        java.lang.String str5 = shakespeare4.kingRichardIIIQuote();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertNotNull(shakespeare4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Conscience is but a word that cowards use, devised at first to keep the strong in awe." + "'", str5, "Conscience is but a word that cowards use, devised at first to keep the strong in awe.");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.validSSN();
        f0.setTemplateStyle(false);
        java.lang.String str4 = f0.streetAddress();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "810421-3072" + "'", str1, "810421-3072");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8053 Baumbach Branch" + "'", str4, "8053 Baumbach Branch");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        char char5 = lorem3.character(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = lorem3.characters((int) 'r', 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(lorem3);
// flaky:         org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'e' + "'", char5 == 'e');
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str3 = f0.countryCodeSL3d();
        int[] intArray5 = f0.integerList((int) (byte) 1);
        java.lang.String str6 = f0.password();
        java.lang.String str7 = f0.password();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Dominican Republic" + "'", str1, "Dominican Republic");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aruban Florin" + "'", str2, "Aruban Florin");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nam" + "'", str3, "nam");
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[6, 51, 55, 51, 9, 75, 20, 18, 49, 28]");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ofekxxmazsiwj" + "'", str6, "ofekxxmazsiwj");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mmmqpstn" + "'", str7, "mmmqpstn");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("Europe/Tallinn");
        com.github.javafaker.Options options5 = faker1.options();
        java.util.Random random6 = null;
        com.github.javafaker.Faker faker7 = com.github.javafaker.Faker.instance(random6);
        com.github.javafaker.Dog dog8 = faker7.dog();
        com.github.javafaker.Hacker hacker9 = faker7.hacker();
        java.lang.String str10 = hacker9.noun();
        java.util.Random random11 = null;
        com.github.javafaker.Faker faker12 = com.github.javafaker.Faker.instance(random11);
        com.github.javafaker.Dog dog13 = faker12.dog();
        com.github.javafaker.Hacker hacker14 = faker12.hacker();
        java.lang.String str15 = hacker14.noun();
        java.lang.String str16 = hacker14.verb();
        java.util.Random random17 = null;
        com.github.javafaker.Faker faker18 = com.github.javafaker.Faker.instance(random17);
        com.github.javafaker.Dog dog19 = faker18.dog();
        com.github.javafaker.Hacker hacker20 = faker18.hacker();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = com.github.javafaker.Faker.instance(random21);
        com.github.javafaker.Dog dog23 = faker22.dog();
        com.github.javafaker.Hacker hacker24 = faker22.hacker();
        java.util.Random random25 = null;
        com.github.javafaker.Faker faker26 = com.github.javafaker.Faker.instance(random25);
        com.github.javafaker.Dog dog27 = faker26.dog();
        com.github.javafaker.Hacker hacker28 = faker26.hacker();
        java.lang.String str29 = hacker28.noun();
        java.lang.String str30 = hacker28.verb();
        java.util.Random random31 = null;
        com.github.javafaker.Faker faker32 = com.github.javafaker.Faker.instance(random31);
        com.github.javafaker.Dog dog33 = faker32.dog();
        com.github.javafaker.Hacker hacker34 = faker32.hacker();
        java.lang.String str35 = hacker34.noun();
        java.lang.String str36 = hacker34.verb();
        com.github.javafaker.Hacker[] hackerArray37 = new com.github.javafaker.Hacker[] { hacker9, hacker14, hacker20, hacker24, hacker28, hacker34 };
        com.github.javafaker.Hacker hacker38 = options5.nextElement(hackerArray37);
        java.util.Random random39 = null;
        com.github.javafaker.Faker faker40 = com.github.javafaker.Faker.instance(random39);
        com.github.javafaker.Internet internet41 = faker40.internet();
        java.lang.String str43 = faker40.bothify("Europe/Tallinn");
        com.github.javafaker.Options options44 = faker40.options();
        java.util.List<com.github.javafaker.service.files.EnFile> enFileList45 = com.github.javafaker.service.files.EnFile.getFiles();
        com.github.javafaker.service.files.EnFile enFile46 = options44.nextElement(enFileList45);
        com.github.javafaker.service.files.EnFile[] enFileArray47 = new com.github.javafaker.service.files.EnFile[] { enFile46 };
        java.util.ArrayList<com.github.javafaker.service.files.EnFile> enFileList48 = new java.util.ArrayList<com.github.javafaker.service.files.EnFile>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.github.javafaker.service.files.EnFile>) enFileList48, enFileArray47);
        com.github.javafaker.service.files.EnFile enFile50 = options5.nextElement((java.util.List<com.github.javafaker.service.files.EnFile>) enFileList48);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Europe/Tallinn" + "'", str4, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(faker7);
        org.junit.Assert.assertNotNull(dog8);
        org.junit.Assert.assertNotNull(hacker9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "panel" + "'", str10, "panel");
        org.junit.Assert.assertNotNull(faker12);
        org.junit.Assert.assertNotNull(dog13);
        org.junit.Assert.assertNotNull(hacker14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "alarm" + "'", str15, "alarm");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "synthesize" + "'", str16, "synthesize");
        org.junit.Assert.assertNotNull(faker18);
        org.junit.Assert.assertNotNull(dog19);
        org.junit.Assert.assertNotNull(hacker20);
        org.junit.Assert.assertNotNull(faker22);
        org.junit.Assert.assertNotNull(dog23);
        org.junit.Assert.assertNotNull(hacker24);
        org.junit.Assert.assertNotNull(faker26);
        org.junit.Assert.assertNotNull(dog27);
        org.junit.Assert.assertNotNull(hacker28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "microchip" + "'", str29, "microchip");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "compress" + "'", str30, "compress");
        org.junit.Assert.assertNotNull(faker32);
        org.junit.Assert.assertNotNull(dog33);
        org.junit.Assert.assertNotNull(hacker34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "application" + "'", str35, "application");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "connect" + "'", str36, "connect");
        org.junit.Assert.assertNotNull(hackerArray37);
        org.junit.Assert.assertNotNull(hacker38);
        org.junit.Assert.assertNotNull(faker40);
        org.junit.Assert.assertNotNull(internet41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Europe/Tallinn" + "'", str43, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(options44);
        org.junit.Assert.assertNotNull(enFileList45);
        org.junit.Assert.assertNotNull(enFile46);
        org.junit.Assert.assertNotNull(enFileArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(enFile50);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        java.lang.String str3 = f2.currencyCode();
        java.lang.String str4 = f2.firstName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = f2.password((int) '2', 7, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(f2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "XCD" + "'", str3, "XCD");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Brandon" + "'", str4, "Brandon");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Number number3 = faker1.number();
        java.lang.String str4 = number3.digit();
        long long7 = number3.numberBetween((long) 12, (long) 'k');
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(number3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2" + "'", str4, "2");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57L + "'", long7 == 57L);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.timeZone();
        java.lang.String str4 = address2.fullAddress();
        java.lang.String str5 = address2.citySuffix();
        java.lang.String str6 = address2.country();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Europe/London" + "'", str3, "Europe/London");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "863 Ortiz Isle, Haagfurt, NV 04901-2427" + "'", str4, "863 Ortiz Isle, Haagfurt, NV 04901-2427");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "borough" + "'", str5, "borough");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "South Georgia and the South Sandwich Islands" + "'", str6, "South Georgia and the South Sandwich Islands");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.countryCodeSL();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cuba" + "'", str1, "Cuba");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "America/Godthab" + "'", str2, "America/Godthab");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ke" + "'", str6, "ke");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.safeEmailAddress();
        java.lang.String str9 = internet2.password((-1), (int) (byte) -1, false, false, true);
        java.lang.String str10 = internet2.macAddress();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "87:32:41:86:1a:a9" + "'", str10, "87:32:41:86:1a:a9");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        com.github.javafaker.Shakespeare shakespeare4 = faker1.shakespeare();
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.date();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = dateAndTime5.future((int) ' ', timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertNotNull(shakespeare4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.HowIMetYourMother howIMetYourMother3 = faker1.howIMetYourMother();
        com.github.javafaker.GameOfThrones gameOfThrones4 = faker1.gameOfThrones();
        com.github.javafaker.Lebowski lebowski5 = new com.github.javafaker.Lebowski(faker1);
        com.github.javafaker.PhoneNumber phoneNumber6 = faker1.phoneNumber();
        com.github.javafaker.Number number7 = faker1.number();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(howIMetYourMother3);
        org.junit.Assert.assertNotNull(gameOfThrones4);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        java.lang.String str4 = address2.citySuffix();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "West" + "'", str3, "West");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chester" + "'", str4, "chester");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str4 = faker1.bothify("Europe/Tallinn");
        com.github.javafaker.Options options5 = faker1.options();
        com.github.javafaker.Music music6 = faker1.music();
        java.lang.String str7 = music6.genre();
        java.lang.String str8 = music6.instrument();
        java.lang.String str9 = music6.genre();
        java.lang.String str10 = music6.genre();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Europe/Tallinn" + "'", str4, "Europe/Tallinn");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(music6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Rap" + "'", str7, "Rap");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Xylophone" + "'", str8, "Xylophone");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Electronic" + "'", str9, "Electronic");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pop" + "'", str10, "Pop");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.ipV6Address();
        java.lang.String str4 = internet2.ipV6Cidr();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7a53:8c74:4390:81c7:30c1:4ee6:7397:fd33" + "'", str3, "7a53:8c74:4390:81c7:30c1:4ee6:7397:fd33");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8621:5c09:dbf9:4d0a:9b12:661c:e9fb:c3f1/116" + "'", str4, "8621:5c09:dbf9:4d0a:9b12:661c:e9fb:c3f1/116");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Friends friends1 = faker0.friends();
        java.lang.String str2 = friends1.character();
        org.junit.Assert.assertNotNull(friends1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doug" + "'", str2, "Doug");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.github.javafaker.Faker faker0 = com.github.javafaker.Faker.instance();
        org.junit.Assert.assertNotNull(faker0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Friends friends3 = faker1.friends();
        com.github.javafaker.Cat cat4 = faker1.cat();
        com.github.javafaker.Superhero superhero5 = faker1.superhero();
        java.lang.String str6 = superhero5.name();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(friends3);
        org.junit.Assert.assertNotNull(cat4);
        org.junit.Assert.assertNotNull(superhero5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Magnificent Rocket Raccoon" + "'", str6, "Magnificent Rocket Raccoon");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.domainName();
        java.lang.String str7 = f0.validID();
        java.lang.String str8 = f0.cityPrefix();
        double double10 = f0.decimal((long) 89);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "China" + "'", str1, "China");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Belgrade" + "'", str2, "Europe/Belgrade");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "strosin.net" + "'", str6, "strosin.net");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "596-64-8163" + "'", str7, "596-64-8163");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Port" + "'", str8, "Port");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 89.68d + "'", double10 == 89.68d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        java.lang.String str2 = randomService1.hex();
        int int4 = randomService1.nextInt((int) 'g');
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "89061D97" + "'", str2, "89061D97");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 88 + "'", int4 == 88);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Crypto crypto3 = faker1.crypto();
        java.lang.String str4 = crypto3.md5();
        java.lang.String str5 = crypto3.sha512();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(crypto3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8b9ddb107823b604d04e7a396652b315" + "'", str4, "8b9ddb107823b604d04e7a396652b315");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3f1017ff2d051fa751b4bf0ce50d03f904a866ba6ab76ed23fbae205b477c28fe79a14d6064db496ba00895cf93220d7bdaaf63c0b36e1dc6ed117e8198baf50" + "'", str5, "3f1017ff2d051fa751b4bf0ce50d03f904a866ba6ab76ed23fbae205b477c28fe79a14d6064db496ba00895cf93220d7bdaaf63c0b36e1dc6ed117e8198baf50");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.domainWord();
        java.lang.String str4 = internet2.ipV4Cidr();
        java.lang.String str5 = internet2.privateIpV4Address();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jast" + "'", str3, "jast");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "63.31.63.186/18" + "'", str4, "63.31.63.186/18");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192.168.113.112" + "'", str5, "192.168.113.112");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.github.javafaker.idnumbers.EnIdNumber enIdNumber0 = new com.github.javafaker.idnumbers.EnIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = com.github.javafaker.Faker.instance(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Weather weather4 = faker2.weather();
        java.lang.String str5 = enIdNumber0.getValidSsn(faker2);
        com.github.javafaker.Beer beer6 = faker2.beer();
        com.github.javafaker.Beer beer7 = faker2.beer();
        com.github.javafaker.University university8 = faker2.university();
        org.junit.Assert.assertNotNull(faker2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(weather4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "332-11-9207" + "'", str5, "332-11-9207");
        org.junit.Assert.assertNotNull(beer6);
        org.junit.Assert.assertNotNull(beer7);
        org.junit.Assert.assertNotNull(university8);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Job job3 = new com.github.javafaker.Job(faker1);
        com.github.javafaker.LeagueOfLegends leagueOfLegends4 = faker1.leagueOfLegends();
        java.lang.String str5 = leagueOfLegends4.rank();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(leagueOfLegends4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Bronze IV" + "'", str5, "Bronze IV");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        java.lang.String str5 = faker1.expression("Carapils");
        com.github.javafaker.Weather weather6 = faker1.weather();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Carapils" + "'", str5, "Carapils");
        org.junit.Assert.assertNotNull(weather6);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Robin robin4 = faker1.robin();
        com.github.javafaker.Educator educator5 = faker1.educator();
        java.lang.String str6 = educator5.course();
        java.lang.String str7 = educator5.campus();
        java.lang.String str8 = educator5.campus();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(robin4);
        org.junit.Assert.assertNotNull(educator5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Associate Degree in Biomedical Science" + "'", str6, "Associate Degree in Biomedical Science");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Vertapple Campus" + "'", str7, "Vertapple Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Iceborough Campus" + "'", str8, "Iceborough Campus");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        char char4 = lorem3.character();
        java.lang.String str6 = lorem3.characters(33);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(lorem3);
// flaky:         org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'j' + "'", char4 == 'j');
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "vc6yqunhjlbpyiic85imglcnpdmpx8gp5" + "'", str6, "vc6yqunhjlbpyiic85imglcnpdmpx8gp5");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Esports esports3 = faker1.esports();
        java.lang.String str4 = esports3.event();
        java.lang.String str5 = esports3.player();
        java.lang.String str6 = esports3.player();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(esports3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ESL Cologne" + "'", str4, "ESL Cologne");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KennyS" + "'", str5, "KennyS");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Silvername" + "'", str6, "Silvername");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.github.javafaker.idnumbers.EnIdNumber enIdNumber0 = new com.github.javafaker.idnumbers.EnIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = com.github.javafaker.Faker.instance(random1);
        com.github.javafaker.Address address3 = faker2.address();
        com.github.javafaker.Weather weather4 = faker2.weather();
        java.lang.String str5 = enIdNumber0.getValidSsn(faker2);
        com.github.javafaker.Beer beer6 = faker2.beer();
        java.lang.String str7 = beer6.malt();
        java.lang.String str8 = beer6.yeast();
        java.lang.String str9 = beer6.name();
        java.lang.String str10 = beer6.style();
        java.lang.String str11 = beer6.name();
        org.junit.Assert.assertNotNull(faker2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(weather4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "594-11-3868" + "'", str5, "594-11-3868");
        org.junit.Assert.assertNotNull(beer6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Munich" + "'", str7, "Munich");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2308 - Munich Lager" + "'", str8, "2308 - Munich Lager");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Old Rasputin Russian Imperial Stout" + "'", str9, "Old Rasputin Russian Imperial Stout");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Porter" + "'", str10, "Porter");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Two Hearted Ale" + "'", str11, "Two Hearted Ale");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        java.lang.String str5 = faker1.regexify("Asia/Ulaanbaatar");
        com.github.javafaker.Superhero superhero6 = faker1.superhero();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        java.lang.String str8 = demographic7.sex();
        java.lang.String str9 = demographic7.race();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Asia/Ulaanbaatar" + "'", str5, "Asia/Ulaanbaatar");
        org.junit.Assert.assertNotNull(superhero6);
        org.junit.Assert.assertNotNull(demographic7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Female" + "'", str8, "Female");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Asian" + "'", str9, "Asian");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        com.apifortress.apiffaker.F f4 = util1.getFaker();
        com.apifortress.apiffaker.F f5 = util1.getFaker();
        java.lang.Object obj7 = util1.setLocale("IVFVC");
        org.junit.Assert.assertNull(f4);
        org.junit.Assert.assertNull(f5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        com.github.javafaker.Overwatch overwatch4 = faker1.overwatch();
        java.lang.String str5 = overwatch4.location();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertNotNull(overwatch4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ch\342teau Guillard" + "'", str5, "Ch\342teau Guillard");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        java.lang.String str4 = lorem3.paragraph();
        java.lang.String str7 = lorem3.characters((int) ' ', false);
        java.lang.String str9 = lorem3.fixedString(0);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(lorem3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Qui optio qui nulla eligendi sint veritatis. Molestiae pariatur tenetur. Unde eos ea et eius id rerum unde. Maxime eligendi perferendis repellendus." + "'", str4, "Qui optio qui nulla eligendi sint veritatis. Molestiae pariatur tenetur. Unde eos ea et eius id rerum unde. Maxime eligendi perferendis repellendus.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cxltyq2kds0zdrv5ftrvznyotsqjpg0b" + "'", str7, "cxltyq2kds0zdrv5ftrvznyotsqjpg0b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        java.lang.String str3 = weather2.temperatureCelsius();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = weather2.temperatureFahrenheit(197, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-6\260C" + "'", str3, "-6\260C");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.cityPrefix();
        java.lang.String str3 = f0.invalidID();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Poland" + "'", str1, "Poland");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "South" + "'", str2, "South");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "826-00-8072" + "'", str3, "826-00-8072");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        com.github.javafaker.Shakespeare shakespeare4 = faker1.shakespeare();
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.date();
        com.github.javafaker.DragonBall dragonBall6 = faker1.dragonBall();
        java.lang.String str7 = dragonBall6.character();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertNotNull(shakespeare4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(dragonBall6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Kid Trunks" + "'", str7, "Kid Trunks");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Esports esports3 = faker1.esports();
        com.github.javafaker.Team team4 = faker1.team();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(esports3);
        org.junit.Assert.assertNotNull(team4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Job job3 = new com.github.javafaker.Job(faker1);
        com.github.javafaker.LeagueOfLegends leagueOfLegends4 = faker1.leagueOfLegends();
        java.lang.String str5 = leagueOfLegends4.quote();
        java.lang.String str6 = leagueOfLegends4.rank();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(leagueOfLegends4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "I'll scout ahead!" + "'", str5, "I'll scout ahead!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Platinum II" + "'", str6, "Platinum II");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        java.lang.String str3 = weather2.temperatureFahrenheit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = weather2.temperatureFahrenheit((int) ' ', 27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36\260F" + "'", str3, "36\260F");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        java.lang.String str7 = f0.invalidID();
        java.lang.String str8 = f0.zipCode();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Moldova" + "'", str1, "Moldova");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "B" + "'", str5, "B");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.rickie-witting.org" + "'", str6, "www.rickie-witting.org");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "046-43-0000" + "'", str7, "046-43-0000");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "53903" + "'", str8, "53903");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Crypto crypto3 = faker1.crypto();
        com.github.javafaker.Number number4 = faker1.number();
        com.github.javafaker.Commerce commerce5 = faker1.commerce();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(crypto3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(commerce5);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        java.lang.String str6 = internet1.image((java.lang.Integer) 75, (java.lang.Integer) 12, (java.lang.Boolean) false, "b");
        java.lang.String str7 = internet1.uuid();
        org.junit.Assert.assertNotNull(internet1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://lorempixel.com/75/12/animals/b" + "'", str6, "http://lorempixel.com/75/12/animals/b");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bab6707c-8f41-4441-b8cf-2fd3941877f6" + "'", str7, "bab6707c-8f41-4441-b8cf-2fd3941877f6");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Esports esports3 = faker1.esports();
        java.lang.String str4 = esports3.event();
        java.lang.String str5 = esports3.player();
        java.lang.String str6 = esports3.league();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(esports3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Worlds" + "'", str4, "Worlds");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Froggen" + "'", str5, "Froggen");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IEM" + "'", str6, "IEM");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Hacker hacker3 = faker1.hacker();
        java.lang.String str4 = hacker3.verb();
        java.lang.String str5 = hacker3.adjective();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(hacker3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hack" + "'", str4, "hack");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "solid state" + "'", str5, "solid state");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        boolean boolean3 = f2.getTemplateStyle();
        f2.setTemplateStyle(true);
        java.lang.String str6 = f2.streetSuffix();
        org.junit.Assert.assertNotNull(f2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ports" + "'", str6, "Ports");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        char char5 = lorem3.character(true);
        java.lang.String str9 = lorem3.characters((int) (byte) 100, true, true);
        java.lang.String str14 = lorem3.characters((int) ' ', (int) (short) 100, true, false);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(lorem3);
// flaky:         org.junit.Assert.assertTrue("'" + char5 + "' != '" + 's' + "'", char5 == 's');
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "kE9BaH3ePOVdnJ5piRxazTQF67opNS3Ds2hCVjMTAU6nyG4o2P7qsyX3oFAaxCZU25xs2W8P5r2E04WIiRtsiVcCTQwk34V0aX58" + "'", str9, "kE9BaH3ePOVdnJ5piRxazTQF67opNS3Ds2hCVjMTAU6nyG4o2P7qsyX3oFAaxCZU25xs2W8P5r2E04WIiRtsiVcCTQwk34V0aX58");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fRhKzbDnJflpAEXiXJNUEGPztTZEKLOsShsaLlFQCYaqOm" + "'", str14, "fRhKzbDnJflpAEXiXJNUEGPztTZEKLOsShsaLlFQCYaqOm");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        java.lang.String str5 = faker1.regexify("Asia/Ulaanbaatar");
        com.github.javafaker.Superhero superhero6 = faker1.superhero();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        java.lang.String str8 = demographic7.educationalAttainment();
        java.lang.String str9 = demographic7.maritalStatus();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Asia/Ulaanbaatar" + "'", str5, "Asia/Ulaanbaatar");
        org.junit.Assert.assertNotNull(superhero6);
        org.junit.Assert.assertNotNull(demographic7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No schooling completed" + "'", str8, "No schooling completed");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Never married" + "'", str9, "Never married");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str2 = code1.ean8();
        java.lang.String str3 = code1.isbn10();
        org.junit.Assert.assertNotNull(code1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "43529681" + "'", str2, "43529681");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1888734671" + "'", str3, "1888734671");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.HowIMetYourMother howIMetYourMother3 = faker1.howIMetYourMother();
        com.github.javafaker.GameOfThrones gameOfThrones4 = faker1.gameOfThrones();
        java.lang.String str5 = gameOfThrones4.house();
        java.lang.String str6 = gameOfThrones4.quote();
        java.lang.String str7 = gameOfThrones4.quote();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(howIMetYourMother3);
        org.junit.Assert.assertNotNull(gameOfThrones4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Orkwood of Orkmont" + "'", str5, "Orkwood of Orkmont");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "And so he spoke, and so he spoke, that Lord of Castamere, but now the rains weep o'er his hall, with no one there to hear. Yes, now the rains weep o'er his hall, and not a soul to hear." + "'", str6, "And so he spoke, and so he spoke, that Lord of Castamere, but now the rains weep o'er his hall, with no one there to hear. Yes, now the rains weep o'er his hall, and not a soul to hear.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "The North remembers." + "'", str7, "The North remembers.");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.domainWord();
        java.lang.String str4 = internet2.ipV4Cidr();
        java.lang.String str5 = internet2.ipV6Cidr();
        java.lang.String str10 = internet2.image((java.lang.Integer) 100, (java.lang.Integer) 2, (java.lang.Boolean) true, "Bhutan");
        java.lang.String str12 = internet2.password(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = internet2.password(48, (int) (byte) 1, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "herzog" + "'", str3, "herzog");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "84.120.246.5/7" + "'", str4, "84.120.246.5/7");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9692:7651:aea0:61a2:0b95:f925:94f5:29ba/33" + "'", str5, "9692:7651:aea0:61a2:0b95:f925:94f5:29ba/33");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://lorempixel.com/g/100/2/business/Bhutan" + "'", str10, "http://lorempixel.com/g/100/2/business/Bhutan");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "9zdf4ew16of" + "'", str12, "9zdf4ew16of");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Hacker hacker3 = faker1.hacker();
        com.github.javafaker.Avatar avatar4 = faker1.avatar();
        java.lang.String str6 = faker1.bothify("021-32-6631");
        com.github.javafaker.DragonBall dragonBall7 = faker1.dragonBall();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(avatar4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "021-32-6631" + "'", str6, "021-32-6631");
        org.junit.Assert.assertNotNull(dragonBall7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Job job3 = new com.github.javafaker.Job(faker1);
        java.lang.String str4 = job3.position();
        java.lang.String str5 = job3.position();
        java.lang.String str6 = job3.position();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Liaison" + "'", str4, "Liaison");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Director" + "'", str5, "Director");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Executive" + "'", str6, "Executive");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        int int5 = f0.integer(0);
        double double7 = f0.decimal((long) 'k');
        java.lang.String str8 = f0.buildingNumber();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Paraguay" + "'", str1, "Paraguay");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Sarajevo" + "'", str2, "Europe/Sarajevo");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "17.32" + "'", str3, "17.32");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.12d + "'", double7 == 104.12d);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "45977" + "'", str8, "45977");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.domainWord();
        java.lang.String str4 = internet2.ipV4Cidr();
        java.lang.String str5 = internet2.slug();
        java.lang.String str6 = internet2.ipV6Address();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cole" + "'", str3, "cole");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "46.84.158.92/9" + "'", str4, "46.84.158.92/9");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "velit_velit" + "'", str5, "velit_velit");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dffd:26c8:17a7:5ee0:e531:a76f:2571:eb90" + "'", str6, "dffd:26c8:17a7:5ee0:e531:a76f:2571:eb90");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.Friends friends3 = faker1.friends();
        com.github.javafaker.Company company4 = faker1.company();
        java.lang.String str5 = company4.logo();
        java.lang.String str6 = company4.bs();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(friends3);
        org.junit.Assert.assertNotNull(company4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "https://pigment.github.io/fake-logos/logos/medium/color/2.png" + "'", str5, "https://pigment.github.io/fake-logos/logos/medium/color/2.png");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "morph intuitive supply-chains" + "'", str6, "morph intuitive supply-chains");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        java.lang.Object obj5 = util1.setLocale("hi!");
        java.lang.Object obj6 = util1.newNode();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertNotNull(obj6);
// flaky:         org.junit.Assert.assertEquals(obj6.toString(), "[streetAddress_0, ${streetAddress}]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[streetAddress_0, ${streetAddress}]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[streetAddress_0, ${streetAddress}]");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        char char5 = lorem3.character(true);
        java.lang.String str7 = lorem3.fixedString(0);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(lorem3);
// flaky:         org.junit.Assert.assertTrue("'" + char5 + "' != '" + '9' + "'", char5 == '9');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        java.lang.Boolean boolean2 = randomService1.nextBoolean();
// flaky:         org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.HowIMetYourMother howIMetYourMother3 = faker1.howIMetYourMother();
        java.lang.String str4 = howIMetYourMother3.catchPhrase();
        java.lang.String str5 = howIMetYourMother3.character();
        java.lang.String str6 = howIMetYourMother3.highFive();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(howIMetYourMother3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Challenege Accepted" + "'", str4, "Challenege Accepted");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Claudia Grice" + "'", str5, "Claudia Grice");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple High Fives" + "'", str6, "Multiple High Fives");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        java.lang.String str4 = address2.latitude();
        java.lang.String str5 = address2.countryCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = address2.zipCodeByState("240752-5688");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: address.postcode_by_state.240752-5688 resulted in null expression");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "West" + "'", str3, "West");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-33.079619" + "'", str4, "-33.079619");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "BF" + "'", str5, "BF");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Robin robin4 = faker1.robin();
        com.github.javafaker.Educator educator5 = faker1.educator();
        java.lang.String str6 = educator5.course();
        java.lang.String str7 = educator5.campus();
        java.lang.String str8 = educator5.course();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(robin4);
        org.junit.Assert.assertNotNull(educator5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Bachelor of Nursing" + "'", str6, "Bachelor of Nursing");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Bluemeadow Campus" + "'", str7, "Bluemeadow Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Master of Law" + "'", str8, "Master of Law");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.productName();
        java.lang.String str7 = f0.currency();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = f0.password((int) '9');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Denmark" + "'", str1, "Denmark");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Bangkok" + "'", str2, "Asia/Bangkok");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lightweight Iron Keyboard" + "'", str6, "Lightweight Iron Keyboard");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cayman Islands Dollar" + "'", str7, "Cayman Islands Dollar");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.HowIMetYourMother howIMetYourMother3 = faker1.howIMetYourMother();
        com.github.javafaker.GameOfThrones gameOfThrones4 = faker1.gameOfThrones();
        com.github.javafaker.Lebowski lebowski5 = new com.github.javafaker.Lebowski(faker1);
        com.github.javafaker.PhoneNumber phoneNumber6 = faker1.phoneNumber();
        java.lang.String str7 = phoneNumber6.cellPhone();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(howIMetYourMother3);
        org.junit.Assert.assertNotNull(gameOfThrones4);
        org.junit.Assert.assertNotNull(phoneNumber6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "933-568-7319" + "'", str7, "933-568-7319");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Hacker hacker3 = faker1.hacker();
        com.github.javafaker.RickAndMorty rickAndMorty4 = faker1.rickAndMorty();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(hacker3);
        org.junit.Assert.assertNotNull(rickAndMorty4);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        java.lang.String str7 = f0.domainWord();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Sudan" + "'", str1, "Sudan");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "c" + "'", str5, "c");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.rupert-wolff.com" + "'", str6, "www.rupert-wolff.com");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "harris" + "'", str7, "harris");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str2 = code1.ean8();
        java.lang.String str3 = code1.ean13();
        java.lang.String str5 = code1.isbn10(true);
        org.junit.Assert.assertNotNull(code1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "85764132" + "'", str2, "85764132");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7065087359895" + "'", str3, "7065087359895");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1-19-120144-9" + "'", str5, "1-19-120144-9");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.productName();
        java.lang.String str2 = f0.firstName();
        java.lang.String str3 = f0.uuid();
        java.lang.String str4 = f0.streetAddress();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Rustic Paper Keyboard" + "'", str1, "Rustic Paper Keyboard");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Eli" + "'", str2, "Eli");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96de8a1b-7dd8-4324-966e-b9cb70891544" + "'", str3, "96de8a1b-7dd8-4324-966e-b9cb70891544");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "980 Nitzsche Knoll" + "'", str4, "980 Nitzsche Knoll");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str2 = code1.isbn10();
        org.junit.Assert.assertNotNull(code1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1895210496" + "'", str2, "1895210496");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        int int6 = f0.streetAddressNumber();
        java.lang.String str7 = f0.password();
        java.lang.String str8 = f0.suffix();
        java.lang.String str9 = f0.productName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Moldova" + "'", str1, "Moldova");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Kolkata" + "'", str2, "Asia/Kolkata");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 324 + "'", int6 == 324);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "sxtqipitahdmj" + "'", str7, "sxtqipitahdmj");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "and Sons" + "'", str8, "and Sons");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Gorgeous Copper Pants" + "'", str9, "Gorgeous Copper Pants");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str2 = code1.ean8();
        java.lang.String str4 = code1.isbn13(true);
        org.junit.Assert.assertNotNull(code1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "96966013" + "'", str2, "96966013");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "979-0-15-065662-2" + "'", str4, "979-0-15-065662-2");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        com.github.javafaker.Weather weather3 = faker1.weather();
        java.lang.String str4 = weather3.temperatureCelsius();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(weather3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-8\260C" + "'", str4, "-8\260C");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Job job3 = new com.github.javafaker.Job(faker1);
        java.lang.String str4 = job3.position();
        java.lang.String str5 = job3.position();
        java.lang.String str6 = job3.title();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Director" + "'", str4, "Director");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Executive" + "'", str5, "Executive");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Corporate Legal Producer" + "'", str6, "Corporate Legal Producer");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        com.github.javafaker.Lorem lorem3 = faker1.lorem();
        char char5 = lorem3.character(true);
        java.lang.String str9 = lorem3.characters((int) (byte) 100, true, true);
        java.lang.String str10 = lorem3.characters();
        char char11 = lorem3.character();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
        org.junit.Assert.assertNotNull(lorem3);
// flaky:         org.junit.Assert.assertTrue("'" + char5 + "' != '" + '9' + "'", char5 == '9');
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fO9vAyf2E6GLn0Dt1SpY6LtLa9flYr0zJAR0mYqfCeuHW5KRER847kq2vXx7YBIHsDcOinjc5zul29I93wQ62jji2j7kmAv6pib3" + "'", str9, "fO9vAyf2E6GLn0Dt1SpY6LtLa9flYr0zJAR0mYqfCeuHW5KRER847kq2vXx7YBIHsDcOinjc5zul29I93wQ62jji2j7kmAv6pib3");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7eelzdcnwupclglw5wi4roiz4i6unzfupw176nug4vmjzda73zlkzf3hf5hb5aiucxaalskkn4pwuq4l1600e6veqwx9mmo38rkekri4s3v3mrbmhhzu6qw7yhib5o1ty40omx0bjab5q72el0xkfvn0trelobh0x6h3gltzkcyh36ncsv21rwstpioo80kjgz7fq0n6vxvn5adph2recuba5ttzwblrl6v5zds2loq0jg7lfh3tu80ap6by23m" + "'", str10, "7eelzdcnwupclglw5wi4roiz4i6unzfupw176nug4vmjzda73zlkzf3hf5hb5aiucxaalskkn4pwuq4l1600e6veqwx9mmo38rkekri4s3v3mrbmhhzu6qw7yhib5o1ty40omx0bjab5q72el0xkfvn0trelobh0x6h3gltzkcyh36ncsv21rwstpioo80kjgz7fq0n6vxvn5adph2recuba5ttzwblrl6v5zds2loq0jg7lfh3tu80ap6by23m");
// flaky:         org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'o' + "'", char11 == 'o');
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.domainWord();
        java.lang.String str4 = internet2.ipV4Cidr();
        java.lang.String str5 = internet2.ipV6Cidr();
        java.lang.String str6 = internet2.ipV6Cidr();
        java.lang.String str8 = internet2.macAddress("979-0-15-065662-2");
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cremin" + "'", str3, "cremin");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "78.134.36.58/18" + "'", str4, "78.134.36.58/18");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "21a0:14e3:0541:6ca1:5ddf:16b5:9510:fb59/68" + "'", str5, "21a0:14e3:0541:6ca1:5ddf:16b5:9510:fb59/68");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4179:c920:001a:138e:9be7:8e7e:6261:0ea1/125" + "'", str6, "4179:c920:001a:138e:9be7:8e7e:6261:0ea1/125");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "979-0-15-065662-2:96:b3:ec:64:bb" + "'", str8, "979-0-15-065662-2:96:b3:ec:64:bb");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("590427-1763");
        java.lang.Object obj3 = util1.newNode("New Zealand Dollar");
        java.lang.Object obj4 = util1.newNode();
        org.junit.Assert.assertNotNull(obj3);
// flaky:         org.junit.Assert.assertEquals(obj3.toString(), "[countryCodeSL_0, ${countryCodeSL}]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[countryCodeSL_0, ${countryCodeSL}]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[countryCodeSL_0, ${countryCodeSL}]");
        org.junit.Assert.assertNotNull(obj4);
// flaky:         org.junit.Assert.assertEquals(obj4.toString(), "[industry_1, ${industry}]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[industry_1, ${industry}]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[industry_1, ${industry}]");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.fullAddress();
        java.lang.String str4 = f0.zipCode();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Republic of Korea" + "'", str1, "Republic of Korea");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Irkutsk" + "'", str2, "Asia/Irkutsk");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "692 Blaine Mews, North Terriechester, WI 83162" + "'", str3, "692 Blaine Mews, North Terriechester, WI 83162");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "91417-0249" + "'", str4, "91417-0249");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.safeEmailAddress();
        java.lang.String str4 = internet2.domainSuffix();
        com.github.javafaker.Internet.UserAgent userAgent5 = com.github.javafaker.Internet.UserAgent.FIREFOX;
        java.lang.String str6 = internet2.userAgent(userAgent5);
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net" + "'", str4, "net");
        org.junit.Assert.assertTrue("'" + userAgent5 + "' != '" + com.github.javafaker.Internet.UserAgent.FIREFOX + "'", userAgent5.equals(com.github.javafaker.Internet.UserAgent.FIREFOX));
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:54.0) Gecko/20100101 Firefox/54.0" + "'", str6, "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:54.0) Gecko/20100101 Firefox/54.0");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Pokemon pokemon2 = faker0.pokemon();
        java.lang.String str3 = pokemon2.name();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(pokemon2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Flareon" + "'", str3, "Flareon");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Crypto crypto3 = faker1.crypto();
        com.github.javafaker.Number number4 = faker1.number();
        double double8 = number4.randomDouble(1, (int) '6', 48);
        long long9 = number4.randomNumber();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(crypto3);
        org.junit.Assert.assertNotNull(number4);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.2d + "'", double8 == 52.2d);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 26537950L + "'", long9 == 26537950L);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        com.github.javafaker.Overwatch overwatch4 = faker1.overwatch();
        com.github.javafaker.Country country5 = faker1.country();
        java.lang.String str6 = country5.currency();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertNotNull(overwatch4);
        org.junit.Assert.assertNotNull(country5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Loti" + "'", str6, "Loti");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.timeZone();
        java.lang.String str4 = address2.stateAbbr();
        java.lang.String str5 = address2.longitude();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Europe/London" + "'", str3, "Europe/London");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MD" + "'", str4, "MD");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76.933627" + "'", str5, "76.933627");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Commerce commerce4 = faker1.commerce();
        java.lang.String str6 = faker1.numerify("nicolas");
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(commerce4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "nicolas" + "'", str6, "nicolas");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Number number3 = faker1.number();
        com.github.javafaker.Commerce commerce4 = faker1.commerce();
        java.lang.String str5 = commerce4.productName();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(commerce4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Small Wooden Table" + "'", str5, "Small Wooden Table");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Ancient ancient3 = faker1.ancient();
        com.github.javafaker.Cat cat4 = faker1.cat();
        java.lang.String str5 = cat4.name();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(ancient3);
        org.junit.Assert.assertNotNull(cat4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coco" + "'", str5, "Coco");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Job job3 = new com.github.javafaker.Job(faker1);
        com.github.javafaker.LeagueOfLegends leagueOfLegends4 = faker1.leagueOfLegends();
        java.lang.String str5 = leagueOfLegends4.masteries();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
        org.junit.Assert.assertNotNull(leagueOfLegends4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Expose Weakness" + "'", str5, "Expose Weakness");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.memePhrase();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "big ol' pupper" + "'", str3, "big ol' pupper");
    }
}
