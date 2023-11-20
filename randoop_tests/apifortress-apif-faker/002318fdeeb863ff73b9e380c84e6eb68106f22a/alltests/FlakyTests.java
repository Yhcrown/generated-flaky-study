import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTests{
    public static boolean debug = false;


    public void test019_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.cityPrefix();
        java.lang.String str3 = f0.mobile();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Russian Federation" + "'", str1, "Russian Federation");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lake" + "'", str2, "Lake");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(851) 684-2176" + "'", str3, "(851) 684-2176");
    }

    public void test019_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.cityPrefix();
        java.lang.String str3 = f0.mobile();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Russian Federation" + "'", str1, "Russian Federation");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lake" + "'", str2, "Lake");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(851) 684-2176" + "'", str3, "(851) 684-2176");
    }

    public void test019_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.cityPrefix();
        java.lang.String str3 = f0.mobile();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Russian Federation" + "'", str1, "Russian Federation");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lake" + "'", str2, "Lake");
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(851) 684-2176" + "'", str3, "(851) 684-2176");
    }

    public void test022_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.validSSN();
        java.lang.String str6 = f0.password((int) (short) 0, (int) (short) 1, true, false);
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "080218+6478" + "'", str1, "080218+6478");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    public void test026_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.emailAddress();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cocos (Keeling) Islands" + "'", str1, "Cocos (Keeling) Islands");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Kiev" + "'", str2, "Europe/Kiev");
    }

    public void test026_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.emailAddress();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cocos (Keeling) Islands" + "'", str1, "Cocos (Keeling) Islands");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Kiev" + "'", str2, "Europe/Kiev");
    }

    public void test029_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.domainName();
        java.lang.String str7 = f0.fullAddress();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aruba" + "'", str1, "Aruba");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Pacific/Pago_Pago" + "'", str2, "Pacific/Pago_Pago");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "powlowski.io" + "'", str6, "powlowski.io");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Suite 039 431 Hermann Shore, Jeffersonmouth, WV 56001-4935" + "'", str7, "Suite 039 431 Hermann Shore, Jeffersonmouth, WV 56001-4935");
    }

    public void test029_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.domainName();
        java.lang.String str7 = f0.fullAddress();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aruba" + "'", str1, "Aruba");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Pacific/Pago_Pago" + "'", str2, "Pacific/Pago_Pago");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "powlowski.io" + "'", str6, "powlowski.io");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Suite 039 431 Hermann Shore, Jeffersonmouth, WV 56001-4935" + "'", str7, "Suite 039 431 Hermann Shore, Jeffersonmouth, WV 56001-4935");
    }

    public void test029_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "powlowski.io" + "'", str6, "powlowski.io");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Suite 039 431 Hermann Shore, Jeffersonmouth, WV 56001-4935" + "'", str7, "Suite 039 431 Hermann Shore, Jeffersonmouth, WV 56001-4935");
    }

    public void test029_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Suite 039 431 Hermann Shore, Jeffersonmouth, WV 56001-4935" + "'", str7, "Suite 039 431 Hermann Shore, Jeffersonmouth, WV 56001-4935");
    }

    public void test030_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        com.github.javafaker.CreditCardType creditCardType7 = com.github.javafaker.CreditCardType.AMERICAN_EXPRESS;
        java.lang.Object obj8 = f0.collection((int) (byte) 1, (java.lang.Object) creditCardType7);
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Bhutan" + "'", str1, "Bhutan");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "U" + "'", str5, "U");
        org.junit.Assert.assertTrue("'" + creditCardType7 + "' != '" + com.github.javafaker.CreditCardType.AMERICAN_EXPRESS + "'", creditCardType7.equals(com.github.javafaker.CreditCardType.AMERICAN_EXPRESS));
        org.junit.Assert.assertNull(obj8);
    }

    public void test030_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        com.github.javafaker.CreditCardType creditCardType7 = com.github.javafaker.CreditCardType.AMERICAN_EXPRESS;
        java.lang.Object obj8 = f0.collection((int) (byte) 1, (java.lang.Object) creditCardType7);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Bhutan" + "'", str1, "Bhutan");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "U" + "'", str5, "U");
        org.junit.Assert.assertTrue("'" + creditCardType7 + "' != '" + com.github.javafaker.CreditCardType.AMERICAN_EXPRESS + "'", creditCardType7.equals(com.github.javafaker.CreditCardType.AMERICAN_EXPRESS));
        org.junit.Assert.assertNull(obj8);
    }

    public void test031_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1040a13f-216c-40a3-9a5f-5d8f0bed5ee5" + "'", str1, "1040a13f-216c-40a3-9a5f-5d8f0bed5ee5");
    }

    public void test032_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Heard Island and McDonald Islands" + "'", str4, "Heard Island and McDonald Islands");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "B" + "'", str8, "B");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "www.gordon-grady.com" + "'", str9, "www.gordon-grady.com");
// flaky:         org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "www.gordon-grady.com" + "'", obj10, "www.gordon-grady.com");
    }

    public void test032_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "B" + "'", str8, "B");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "www.gordon-grady.com" + "'", str9, "www.gordon-grady.com");
// flaky:         org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "www.gordon-grady.com" + "'", obj10, "www.gordon-grady.com");
    }

    public void test032_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "www.gordon-grady.com" + "'", str9, "www.gordon-grady.com");
// flaky:         org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "www.gordon-grady.com" + "'", obj10, "www.gordon-grady.com");
    }

    public void test032_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "www.gordon-grady.com" + "'", obj10, "www.gordon-grady.com");
    }

    public void test033_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Armenia" + "'", str7, "Armenia");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Europe/Athens" + "'", str8, "Europe/Athens");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    public void test033_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Europe/Athens" + "'", str8, "Europe/Athens");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    public void test035_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Sleek Wool Clock" + "'", str1, "Sleek Wool Clock");
    }

    public void test039_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.coatLength();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "wire" + "'", str3, "wire");
    }

    public void test041_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        java.lang.String str4 = f0.streetAddress((java.lang.Boolean) false);
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "02eb02fa-bac5-4bf3-a733-288c9e25ef8e" + "'", str1, "02eb02fa-bac5-4bf3-a733-288c9e25ef8e");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.42d + "'", double2 == 29.42d);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99994 Geri Rapids" + "'", str4, "99994 Geri Rapids");
    }

    public void test041_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        java.lang.String str4 = f0.streetAddress((java.lang.Boolean) false);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "02eb02fa-bac5-4bf3-a733-288c9e25ef8e" + "'", str1, "02eb02fa-bac5-4bf3-a733-288c9e25ef8e");
         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.42d + "'", double2 == 29.42d);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99994 Geri Rapids" + "'", str4, "99994 Geri Rapids");
    }

    public void test041_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        java.lang.String str4 = f0.streetAddress((java.lang.Boolean) false);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "02eb02fa-bac5-4bf3-a733-288c9e25ef8e" + "'", str1, "02eb02fa-bac5-4bf3-a733-288c9e25ef8e");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.42d + "'", double2 == 29.42d);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "99994 Geri Rapids" + "'", str4, "99994 Geri Rapids");
    }

    public void test042_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.productName();
        java.lang.String str2 = f0.zipCode();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Gorgeous Leather Lamp" + "'", str1, "Gorgeous Leather Lamp");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "66623-5528" + "'", str2, "66623-5528");
    }

    public void test042_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.productName();
        java.lang.String str2 = f0.zipCode();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Gorgeous Leather Lamp" + "'", str1, "Gorgeous Leather Lamp");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "66623-5528" + "'", str2, "66623-5528");
    }

    public void test045_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        java.lang.Object obj3 = util1.newNode("Republic of Korea");
        org.junit.Assert.assertNotNull(obj3);
         org.junit.Assert.assertEquals(obj3.toString(), "[citySuffix_0, ${citySuffix}

    public void test047_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str5 = f0.password(6, (int) (short) 10);
        java.lang.String str6 = f0.country();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tajikistan" + "'", str1, "Tajikistan");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US Dollar" + "'", str2, "US Dollar");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ymtmuoajk" + "'", str5, "ymtmuoajk");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Niger" + "'", str6, "Niger");
    }

    public void test047_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str5 = f0.password(6, (int) (short) 10);
        java.lang.String str6 = f0.country();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tajikistan" + "'", str1, "Tajikistan");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US Dollar" + "'", str2, "US Dollar");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ymtmuoajk" + "'", str5, "ymtmuoajk");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Niger" + "'", str6, "Niger");
    }

    public void test047_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str5 = f0.password(6, (int) (short) 10);
        java.lang.String str6 = f0.country();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tajikistan" + "'", str1, "Tajikistan");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "US Dollar" + "'", str2, "US Dollar");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ymtmuoajk" + "'", str5, "ymtmuoajk");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Niger" + "'", str6, "Niger");
    }

    public void test047_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Niger" + "'", str6, "Niger");
    }

    public void test048_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.gender();
        java.lang.String str4 = dog2.size();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "male" + "'", str3, "male");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "medium" + "'", str4, "medium");
    }

    public void test048_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "medium" + "'", str4, "medium");
    }

    public void test049_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "erdman" + "'", str3, "erdman");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.189.77.101/29" + "'", str4, "4.189.77.101/29");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10fc:16c6:e3df:70f5:e46b:a8e1:f181:aeac/60" + "'", str5, "10fc:16c6:e3df:70f5:e46b:a8e1:f181:aeac/60");
    }

    public void test049_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.189.77.101/29" + "'", str4, "4.189.77.101/29");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10fc:16c6:e3df:70f5:e46b:a8e1:f181:aeac/60" + "'", str5, "10fc:16c6:e3df:70f5:e46b:a8e1:f181:aeac/60");
    }

    public void test049_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10fc:16c6:e3df:70f5:e46b:a8e1:f181:aeac/60" + "'", str5, "10fc:16c6:e3df:70f5:e46b:a8e1:f181:aeac/60");
    }

    public void test050_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("590427-1763");
        java.lang.Object obj2 = util1.newNode();
        org.junit.Assert.assertNotNull(obj2);
         org.junit.Assert.assertEquals(obj2.toString(), "[country_0, ${country}

    public void test052_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.zipCode();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "34838-3458" + "'", str3, "34838-3458");
    }

    public void test053_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.cityName();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tonga" + "'", str1, "Tonga");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Africa/Johannesburg" + "'", str2, "Africa/Johannesburg");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "New Chong" + "'", str3, "New Chong");
    }

    public void test053_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.cityName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tonga" + "'", str1, "Tonga");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Africa/Johannesburg" + "'", str2, "Africa/Johannesburg");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "New Chong" + "'", str3, "New Chong");
    }

    public void test053_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.cityName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tonga" + "'", str1, "Tonga");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Africa/Johannesburg" + "'", str2, "Africa/Johannesburg");
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "New Chong" + "'", str3, "New Chong");
    }

    public void test055_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str3 = f0.countryCodeSL3d();
        int int5 = f0.integer((int) (short) 100);
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Malaysia" + "'", str1, "Malaysia");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "New Zealand Dollar" + "'", str2, "New Zealand Dollar");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "irl" + "'", str3, "irl");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    public void test055_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str3 = f0.countryCodeSL3d();
        int int5 = f0.integer((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Malaysia" + "'", str1, "Malaysia");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "New Zealand Dollar" + "'", str2, "New Zealand Dollar");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "irl" + "'", str3, "irl");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    public void test055_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str3 = f0.countryCodeSL3d();
        int int5 = f0.integer((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Malaysia" + "'", str1, "Malaysia");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "New Zealand Dollar" + "'", str2, "New Zealand Dollar");
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "irl" + "'", str3, "irl");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    public void test056_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.currencyCode();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GEL" + "'", str1, "GEL");
    }

    public void test057_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ohara" + "'", str3, "ohara");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "45.195.71.142/4" + "'", str4, "45.195.71.142/4");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "czlfomrdtndepqo:09:02:f9:41:b3" + "'", str6, "czlfomrdtndepqo:09:02:f9:41:b3");
    }

    public void test057_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "45.195.71.142/4" + "'", str4, "45.195.71.142/4");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "czlfomrdtndepqo:09:02:f9:41:b3" + "'", str6, "czlfomrdtndepqo:09:02:f9:41:b3");
    }

    public void test057_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "czlfomrdtndepqo:09:02:f9:41:b3" + "'", str6, "czlfomrdtndepqo:09:02:f9:41:b3");
    }

    public void test058_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Outdoors" + "'", str6, "Outdoors");
    }

    public void test060_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        com.github.javafaker.Job job3 = new com.github.javafaker.Job(faker1);
        java.lang.String str4 = job3.field();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Legal" + "'", str4, "Legal");
    }

    public void test062_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "East" + "'", str3, "East");
    }

    public void test063_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Smart people underestimate the ordinarity of ordinary people." + "'", str4, "Smart people underestimate the ordinarity of ordinary people.");
    }

    public void test065_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.kozeystrosinandpurdy.com" + "'", str6, "www.kozeystrosinandpurdy.com");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "and Sons" + "'", str7, "and Sons");
    }

    public void test065_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "and Sons" + "'", str7, "and Sons");
    }

    public void test066_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "West" + "'", str3, "West");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "03095" + "'", str4, "03095");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Apt. 554 03198 Gislason Light, Merryberg, OR 42123-7690" + "'", str5, "Apt. 554 03198 Gislason Light, Merryberg, OR 42123-7690");
    }

    public void test066_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "03095" + "'", str4, "03095");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Apt. 554 03198 Gislason Light, Merryberg, OR 42123-7690" + "'", str5, "Apt. 554 03198 Gislason Light, Merryberg, OR 42123-7690");
    }

    public void test066_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Apt. 554 03198 Gislason Light, Merryberg, OR 42123-7690" + "'", str5, "Apt. 554 03198 Gislason Light, Merryberg, OR 42123-7690");
    }

    public void test067_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str5 = f0.password(7, 33, false, true);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!fevxyjc^trj" + "'", str5, "!fevxyjc^trj");
    }

    public void test068_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-5\260F" + "'", str3, "-5\260F");
    }

    public void test070_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "134-88-7201" + "'", str5, "134-88-7201");
        org.junit.Assert.assertNotNull(beer6);
        org.junit.Assert.assertNotNull(leagueOfLegends7);
        org.junit.Assert.assertNotNull(address8);
    }

    public void test071_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        java.lang.String str4 = address2.streetName();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "South" + "'", str3, "South");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Bobby Points" + "'", str4, "Bobby Points");
    }

    public void test071_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Bobby Points" + "'", str4, "Bobby Points");
    }

    public void test072_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
         com.apifortress.apiffaker.Main.stressTest(100, (int) '#');
    }

    public void test073_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Saint Barthelemy" + "'", str1, "Saint Barthelemy");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Krasnoyarsk" + "'", str2, "Asia/Krasnoyarsk");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    public void test073_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Krasnoyarsk" + "'", str2, "Asia/Krasnoyarsk");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    public void test074_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Self Five" + "'", str4, "Self Five");
    }

    public void test077_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str5 = f0.password(6, (int) (short) 10);
        boolean boolean6 = f0.bool();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Greece" + "'", str1, "Greece");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Jordanian Dinar" + "'", str2, "Jordanian Dinar");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "uyhctdnd" + "'", str5, "uyhctdnd");
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    public void test077_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str5 = f0.password(6, (int) (short) 10);
        boolean boolean6 = f0.bool();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Greece" + "'", str1, "Greece");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Jordanian Dinar" + "'", str2, "Jordanian Dinar");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "uyhctdnd" + "'", str5, "uyhctdnd");
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    public void test077_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str5 = f0.password(6, (int) (short) 10);
        boolean boolean6 = f0.bool();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Greece" + "'", str1, "Greece");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Jordanian Dinar" + "'", str2, "Jordanian Dinar");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "uyhctdnd" + "'", str5, "uyhctdnd");
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    public void test077_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    public void test078_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
         com.apifortress.apiffaker.Main.stressTest((int) (byte) 1, (int) (byte) 10);
    }

    public void test079_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.blick-hamill.net" + "'", str6, "www.blick-hamill.net");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "www.grimesinc.org" + "'", str7, "www.grimesinc.org");
    }

    public void test079_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "www.grimesinc.org" + "'", str7, "www.grimesinc.org");
    }

    public void test080_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'k' + "'", char5 == 'k');
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
    }

    public void test081_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.breed();
        java.lang.String str4 = dog2.name();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Appenzeller" + "'", str3, "Appenzeller");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Angel" + "'", str4, "Angel");
    }

    public void test081_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Angel" + "'", str4, "Angel");
    }

    public void test083_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "606-55-1563" + "'", str6, "606-55-1563");
    }

    public void test084_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Southern Konopelski University" + "'", str6, "Southern Konopelski University");
    }

    public void test086_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.productName();
        java.lang.String str2 = f0.firstName();
        int int4 = f0.integer((int) (short) 100);
        java.lang.String str5 = f0.firstName();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Gorgeous Aluminum Car" + "'", str1, "Gorgeous Aluminum Car");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cristobal" + "'", str2, "Cristobal");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lyle" + "'", str5, "Lyle");
    }

    public void test086_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.productName();
        java.lang.String str2 = f0.firstName();
        int int4 = f0.integer((int) (short) 100);
        java.lang.String str5 = f0.firstName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Gorgeous Aluminum Car" + "'", str1, "Gorgeous Aluminum Car");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cristobal" + "'", str2, "Cristobal");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lyle" + "'", str5, "Lyle");
    }

    public void test086_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lyle" + "'", str5, "Lyle");
    }

    public void test088_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Wishing" + "'", str7, "Wishing");
    }

    public void test089_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Group" + "'", str6, "Group");
    }

    public void test090_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Weather weather2 = faker1.weather();
        java.lang.String str3 = weather2.temperatureFahrenheit();
        java.lang.String str4 = weather2.temperatureFahrenheit();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(weather2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "30\260F" + "'", str3, "30\260F");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "77\260F" + "'", str4, "77\260F");
    }

    public void test090_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "77\260F" + "'", str4, "77\260F");
    }

    public void test091_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "North" + "'", str3, "North");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10135" + "'", str4, "10135");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tajikistan" + "'", str5, "Tajikistan");
    }

    public void test091_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10135" + "'", str4, "10135");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tajikistan" + "'", str5, "Tajikistan");
    }

    public void test091_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tajikistan" + "'", str5, "Tajikistan");
    }

    public void test092_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6de0f1e6-bbcf-432a-8b83-e32cb1b34764" + "'", str3, "6de0f1e6-bbcf-432a-8b83-e32cb1b34764");
    }

    public void test093_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        java.lang.String str7 = f0.invalidID();
        java.lang.String str8 = f0.state();
        int int11 = f0.integer(33, (-1));
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Uzbekistan" + "'", str1, "Uzbekistan");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.chieko-torp.io" + "'", str6, "www.chieko-torp.io");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "666-14-0036" + "'", str7, "666-14-0036");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Arkansas" + "'", str8, "Arkansas");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    public void test093_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.chieko-torp.io" + "'", str6, "www.chieko-torp.io");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "666-14-0036" + "'", str7, "666-14-0036");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Arkansas" + "'", str8, "Arkansas");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    public void test093_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.chieko-torp.io" + "'", str6, "www.chieko-torp.io");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "666-14-0036" + "'", str7, "666-14-0036");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Arkansas" + "'", str8, "Arkansas");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    public void test093_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "666-14-0036" + "'", str7, "666-14-0036");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Arkansas" + "'", str8, "Arkansas");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    public void test093_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Arkansas" + "'", str8, "Arkansas");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    public void test093_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    public void test095_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        int int4 = f0.integer(2);
        double double8 = f0.decimal((long) 32, (long) 2, (int) 'g');
        java.lang.String str9 = f0.companyName();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Spain" + "'", str1, "Spain");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Afghani" + "'", str2, "Afghani");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.046665074975902d + "'", double8 == 8.046665074975902d);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Upton, Green and Hammes" + "'", str9, "Upton, Green and Hammes");
    }

    public void test095_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        int int4 = f0.integer(2);
        double double8 = f0.decimal((long) 32, (long) 2, (int) 'g');
        java.lang.String str9 = f0.companyName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Spain" + "'", str1, "Spain");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Afghani" + "'", str2, "Afghani");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.046665074975902d + "'", double8 == 8.046665074975902d);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Upton, Green and Hammes" + "'", str9, "Upton, Green and Hammes");
    }

    public void test095_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.046665074975902d + "'", double8 == 8.046665074975902d);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Upton, Green and Hammes" + "'", str9, "Upton, Green and Hammes");
    }

    public void test095_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.046665074975902d + "'", double8 == 8.046665074975902d);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Upton, Green and Hammes" + "'", str9, "Upton, Green and Hammes");
    }

    public void test095_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Upton, Green and Hammes" + "'", str9, "Upton, Green and Hammes");
    }

    public void test097_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "driver" + "'", str4, "driver");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "navigate" + "'", str5, "navigate");
    }

    public void test097_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "navigate" + "'", str5, "navigate");
    }

    public void test098_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + char4 + "' != '" + '6' + "'", char4 == '6');
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Illo cum dolores. Quis reprehenderit rem est. Amet molestiae consequatur sunt numquam maiores. Sint cumque ullam distinctio praesentium est." + "'", str5, "Illo cum dolores. Quis reprehenderit rem est. Amet molestiae consequatur sunt numquam maiores. Sint cumque ullam distinctio praesentium est.");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Enim facere architecto iste repellat a. Soluta eum nobis doloribus doloremque et asperiores. Dolores esse quo consequuntur quo. Et voluptas dolores non. Architecto vitae quo quisquam." + "'", str6, "Enim facere architecto iste repellat a. Soluta eum nobis doloribus doloremque et asperiores. Dolores esse quo consequuntur quo. Et voluptas dolores non. Architecto vitae quo quisquam.");
    }

    public void test098_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Illo cum dolores. Quis reprehenderit rem est. Amet molestiae consequatur sunt numquam maiores. Sint cumque ullam distinctio praesentium est." + "'", str5, "Illo cum dolores. Quis reprehenderit rem est. Amet molestiae consequatur sunt numquam maiores. Sint cumque ullam distinctio praesentium est.");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Enim facere architecto iste repellat a. Soluta eum nobis doloribus doloremque et asperiores. Dolores esse quo consequuntur quo. Et voluptas dolores non. Architecto vitae quo quisquam." + "'", str6, "Enim facere architecto iste repellat a. Soluta eum nobis doloribus doloremque et asperiores. Dolores esse quo consequuntur quo. Et voluptas dolores non. Architecto vitae quo quisquam.");
    }

    public void test098_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Enim facere architecto iste repellat a. Soluta eum nobis doloribus doloremque et asperiores. Dolores esse quo consequuntur quo. Et voluptas dolores non. Architecto vitae quo quisquam." + "'", str6, "Enim facere architecto iste repellat a. Soluta eum nobis doloribus doloremque et asperiores. Dolores esse quo consequuntur quo. Et voluptas dolores non. Architecto vitae quo quisquam.");
    }

    public void test099_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SpectacularBenefit347124" + "'", str5, "SpectacularBenefit347124");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IncrediblePromotion106835" + "'", str6, "IncrediblePromotion106835");
    }

    public void test099_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IncrediblePromotion106835" + "'", str6, "IncrediblePromotion106835");
    }

    public void test100_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'u' + "'", char5 == 'u');
    }

    public void test101_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + char5 + "' != '" + '5' + "'", char5 == '5');
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9osgj82t0sd33evgyqvhndjqtuvth57x3l9fhaxwqwy19z5ghw6od4f89si1364zh8vyo6cuh1l8lw64i3ghio40cem9d7peuuuir26r54e9tomwtt2c807cqaxcq3zkrcj624dkevtcjbr41piitlytqqlve4abo3cvewxvzsinrnw40nt61uhregltmnhpxtu4ug7kq6hdj6rcsfg5i8r286p2o39spkqlimrtddfr9hoz9idiu3p9prkrudp" + "'", str7, "9osgj82t0sd33evgyqvhndjqtuvth57x3l9fhaxwqwy19z5ghw6od4f89si1364zh8vyo6cuh1l8lw64i3ghio40cem9d7peuuuir26r54e9tomwtt2c807cqaxcq3zkrcj624dkevtcjbr41piitlytqqlve4abo3cvewxvzsinrnw40nt61uhregltmnhpxtu4ug7kq6hdj6rcsfg5i8r286p2o39spkqlimrtddfr9hoz9idiu3p9prkrudp");
    }

    public void test101_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9osgj82t0sd33evgyqvhndjqtuvth57x3l9fhaxwqwy19z5ghw6od4f89si1364zh8vyo6cuh1l8lw64i3ghio40cem9d7peuuuir26r54e9tomwtt2c807cqaxcq3zkrcj624dkevtcjbr41piitlytqqlve4abo3cvewxvzsinrnw40nt61uhregltmnhpxtu4ug7kq6hdj6rcsfg5i8r286p2o39spkqlimrtddfr9hoz9idiu3p9prkrudp" + "'", str7, "9osgj82t0sd33evgyqvhndjqtuvth57x3l9fhaxwqwy19z5ghw6od4f89si1364zh8vyo6cuh1l8lw64i3ghio40cem9d7peuuuir26r54e9tomwtt2c807cqaxcq3zkrcj624dkevtcjbr41piitlytqqlve4abo3cvewxvzsinrnw40nt61uhregltmnhpxtu4ug7kq6hdj6rcsfg5i8r286p2o39spkqlimrtddfr9hoz9idiu3p9prkrudp");
    }

    public void test102_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.invalidSSN();
        f0.setLocale("z");
        java.lang.String str4 = f0.profession();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "738188+0741" + "'", str1, "738188+0741");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "bookkeeper" + "'", str4, "bookkeeper");
    }

    public void test102_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.invalidSSN();
        f0.setLocale("z");
        java.lang.String str4 = f0.profession();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "738188+0741" + "'", str1, "738188+0741");
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "bookkeeper" + "'", str4, "bookkeeper");
    }

    public void test103_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        java.lang.String str4 = address2.countryCode();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Port" + "'", str3, "Port");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MD" + "'", str4, "MD");
    }

    public void test103_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MD" + "'", str4, "MD");
    }

    public void test104_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ukraine" + "'", str1, "Ukraine");
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

    public void test104_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.gerald-balistreri.info" + "'", str6, "www.gerald-balistreri.info");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "910-47-6363" + "'", str7, "910-47-6363");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Norfolk Island" + "'", str10, "Norfolk Island");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "090803-7427" + "'", str12, "090803-7427");
    }

    public void test104_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.gerald-balistreri.info" + "'", str6, "www.gerald-balistreri.info");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "910-47-6363" + "'", str7, "910-47-6363");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Norfolk Island" + "'", str10, "Norfolk Island");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "090803-7427" + "'", str12, "090803-7427");
    }

    public void test104_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "910-47-6363" + "'", str7, "910-47-6363");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Norfolk Island" + "'", str10, "Norfolk Island");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "090803-7427" + "'", str12, "090803-7427");
    }

    public void test104_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Norfolk Island" + "'", str10, "Norfolk Island");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "090803-7427" + "'", str12, "090803-7427");
    }

    public void test104_6() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "090803-7427" + "'", str12, "090803-7427");
    }

    public void test105_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + char5 + "' != '" + '5' + "'", char5 == '5');
    }

    public void test107_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
         com.apifortress.apiffaker.Main.stressTest((int) (byte) 0, (int) 'g');
    }

    public void test109_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.timeZone();
        java.lang.String str4 = address2.streetName();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Asia/Magadan" + "'", str3, "Asia/Magadan");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deeann Fords" + "'", str4, "Deeann Fords");
    }

    public void test109_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Deeann Fords" + "'", str4, "Deeann Fords");
    }

    public void test110_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "South" + "'", str3, "South");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-17.471499" + "'", str4, "-17.471499");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Klein" + "'", str5, "Klein");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course" + "'", str6, "Course");
    }

    public void test110_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-17.471499" + "'", str4, "-17.471499");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Klein" + "'", str5, "Klein");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course" + "'", str6, "Course");
    }

    public void test110_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Klein" + "'", str5, "Klein");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course" + "'", str6, "Course");
    }

    public void test110_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Course" + "'", str6, "Course");
    }

    public void test112_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        java.lang.String str3 = f0.suffix();
        java.lang.String str4 = f0.countryCodeSL();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e07c4b0c-9c7f-4733-9747-af6f1950ac13" + "'", str1, "e07c4b0c-9c7f-4733-9747-af6f1950ac13");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 59.87d + "'", double2 == 59.87d);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Inc" + "'", str3, "Inc");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hu" + "'", str4, "hu");
    }

    public void test112_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        java.lang.String str3 = f0.suffix();
        java.lang.String str4 = f0.countryCodeSL();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e07c4b0c-9c7f-4733-9747-af6f1950ac13" + "'", str1, "e07c4b0c-9c7f-4733-9747-af6f1950ac13");
         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 59.87d + "'", double2 == 59.87d);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Inc" + "'", str3, "Inc");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hu" + "'", str4, "hu");
    }

    public void test112_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        java.lang.String str3 = f0.suffix();
        java.lang.String str4 = f0.countryCodeSL();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e07c4b0c-9c7f-4733-9747-af6f1950ac13" + "'", str1, "e07c4b0c-9c7f-4733-9747-af6f1950ac13");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 59.87d + "'", double2 == 59.87d);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Inc" + "'", str3, "Inc");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hu" + "'", str4, "hu");
    }

    public void test112_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hu" + "'", str4, "hu");
    }

    public void test113_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        boolean boolean3 = f2.getTemplateStyle();
        f2.setTemplateStyle(true);
        java.lang.String str6 = f2.productName();
        org.junit.Assert.assertNotNull(f2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ergonomic Plastic Lamp" + "'", str6, "Ergonomic Plastic Lamp");
    }

    public void test115_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.sound();
        java.lang.String str4 = dog2.coatLength();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bow wow" + "'", str3, "bow wow");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "curly" + "'", str4, "curly");
    }

    public void test115_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "curly" + "'", str4, "curly");
    }

    public void test118_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "America/Caracas" + "'", str3, "America/Caracas");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Apt. 431 750 Deshawn Lake, New Reneaberg, GA 62754" + "'", str4, "Apt. 431 750 Deshawn Lake, New Reneaberg, GA 62754");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "view" + "'", str5, "view");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UT" + "'", str6, "UT");
    }

    public void test118_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Apt. 431 750 Deshawn Lake, New Reneaberg, GA 62754" + "'", str4, "Apt. 431 750 Deshawn Lake, New Reneaberg, GA 62754");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "view" + "'", str5, "view");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UT" + "'", str6, "UT");
    }

    public void test118_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "view" + "'", str5, "view");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UT" + "'", str6, "UT");
    }

    public void test118_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UT" + "'", str6, "UT");
    }

    public void test119_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        java.lang.String str3 = f0.suffix();
        java.lang.String str4 = f0.fullAddress();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8cee9ef2-46f5-4354-90ab-78e483c79c7b" + "'", str1, "8cee9ef2-46f5-4354-90ab-78e483c79c7b");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 58.65d + "'", double2 == 58.65d);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LLC" + "'", str3, "LLC");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "972 Hegmann Cliff, Brianfort, AL 96813-3768" + "'", str4, "972 Hegmann Cliff, Brianfort, AL 96813-3768");
    }

    public void test119_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        java.lang.String str3 = f0.suffix();
        java.lang.String str4 = f0.fullAddress();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8cee9ef2-46f5-4354-90ab-78e483c79c7b" + "'", str1, "8cee9ef2-46f5-4354-90ab-78e483c79c7b");
         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 58.65d + "'", double2 == 58.65d);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LLC" + "'", str3, "LLC");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "972 Hegmann Cliff, Brianfort, AL 96813-3768" + "'", str4, "972 Hegmann Cliff, Brianfort, AL 96813-3768");
    }

    public void test119_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        double double2 = f0.decimal();
        java.lang.String str3 = f0.suffix();
        java.lang.String str4 = f0.fullAddress();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8cee9ef2-46f5-4354-90ab-78e483c79c7b" + "'", str1, "8cee9ef2-46f5-4354-90ab-78e483c79c7b");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 58.65d + "'", double2 == 58.65d);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LLC" + "'", str3, "LLC");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "972 Hegmann Cliff, Brianfort, AL 96813-3768" + "'", str4, "972 Hegmann Cliff, Brianfort, AL 96813-3768");
    }

    public void test119_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "972 Hegmann Cliff, Brianfort, AL 96813-3768" + "'", str4, "972 Hegmann Cliff, Brianfort, AL 96813-3768");
    }

    public void test120_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "langosh" + "'", str3, "langosh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "216.252.27.122/31" + "'", str4, "216.252.27.122/31");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.90 Safari/537.36" + "'", str5, "Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.90 Safari/537.36");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.chet-rath.co" + "'", str6, "www.chet-rath.co");
    }

    public void test120_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "216.252.27.122/31" + "'", str4, "216.252.27.122/31");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.90 Safari/537.36" + "'", str5, "Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.90 Safari/537.36");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.chet-rath.co" + "'", str6, "www.chet-rath.co");
    }

    public void test120_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.90 Safari/537.36" + "'", str5, "Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.90 Safari/537.36");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.chet-rath.co" + "'", str6, "www.chet-rath.co");
    }

    public void test120_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.chet-rath.co" + "'", str6, "www.chet-rath.co");
    }

    public void test121_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5" + "'", str4, "5");
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.2742535675067554E12d + "'", double8 == 1.2742535675067554E12d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    public void test121_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.2742535675067554E12d + "'", double8 == 1.2742535675067554E12d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    public void test121_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    public void test122_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Port" + "'", str3, "Port");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "117" + "'", str4, "117");
    }

    public void test122_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "117" + "'", str4, "117");
    }

    public void test123_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.domainWord();
        java.lang.String str4 = internet2.domainName();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "rowe" + "'", str3, "rowe");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kuhic.io" + "'", str4, "kuhic.io");
    }

    public void test123_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kuhic.io" + "'", str4, "kuhic.io");
    }

    public void test124_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        int int5 = f0.integer(0);
        java.lang.String str6 = f0.price();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Djibouti" + "'", str1, "Djibouti");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Berlin" + "'", str2, "Europe/Berlin");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "39.48" + "'", str3, "39.48");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26 + "'", int5 == 26);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "97.87" + "'", str6, "97.87");
    }

    public void test124_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        int int5 = f0.integer(0);
        java.lang.String str6 = f0.price();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Djibouti" + "'", str1, "Djibouti");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Berlin" + "'", str2, "Europe/Berlin");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "39.48" + "'", str3, "39.48");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26 + "'", int5 == 26);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "97.87" + "'", str6, "97.87");
    }

    public void test124_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "39.48" + "'", str3, "39.48");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26 + "'", int5 == 26);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "97.87" + "'", str6, "97.87");
    }

    public void test124_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26 + "'", int5 == 26);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "97.87" + "'", str6, "97.87");
    }

    public void test124_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "97.87" + "'", str6, "97.87");
    }

    public void test125_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.uuid();
        java.lang.String str7 = f0.domainSuffix();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Venezuela" + "'", str1, "Venezuela");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "w" + "'", str5, "w");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7d5f3866-3e78-4f53-b2d4-1056cc7c4b25" + "'", str6, "7d5f3866-3e78-4f53-b2d4-1056cc7c4b25");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "co" + "'", str7, "co");
    }

    public void test125_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.uuid();
        java.lang.String str7 = f0.domainSuffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Venezuela" + "'", str1, "Venezuela");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "w" + "'", str5, "w");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7d5f3866-3e78-4f53-b2d4-1056cc7c4b25" + "'", str6, "7d5f3866-3e78-4f53-b2d4-1056cc7c4b25");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "co" + "'", str7, "co");
    }

    public void test125_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.uuid();
        java.lang.String str7 = f0.domainSuffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Venezuela" + "'", str1, "Venezuela");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "w" + "'", str5, "w");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7d5f3866-3e78-4f53-b2d4-1056cc7c4b25" + "'", str6, "7d5f3866-3e78-4f53-b2d4-1056cc7c4b25");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "co" + "'", str7, "co");
    }

    public void test125_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "co" + "'", str7, "co");
    }

    public void test126_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
    }

    public void test127_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "826-44-1955" + "'", str5, "826-44-1955");
        org.junit.Assert.assertNotNull(randomService6);
    }

    public void test128_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        int int5 = f0.integer(0);
        java.lang.String str6 = f0.password();
        double double10 = f0.decimal((long) 4, (long) (byte) 1, 75);
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cameroon" + "'", str1, "Cameroon");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Pacific/Fiji" + "'", str2, "Pacific/Fiji");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40.80" + "'", str3, "40.80");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "vvgnnehvy" + "'", str6, "vvgnnehvy");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.6741471041084708d + "'", double10 == 1.6741471041084708d);
    }

    public void test128_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Pacific/Fiji" + "'", str2, "Pacific/Fiji");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40.80" + "'", str3, "40.80");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "vvgnnehvy" + "'", str6, "vvgnnehvy");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.6741471041084708d + "'", double10 == 1.6741471041084708d);
    }

    public void test128_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40.80" + "'", str3, "40.80");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "vvgnnehvy" + "'", str6, "vvgnnehvy");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.6741471041084708d + "'", double10 == 1.6741471041084708d);
    }

    public void test128_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "vvgnnehvy" + "'", str6, "vvgnnehvy");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.6741471041084708d + "'", double10 == 1.6741471041084708d);
    }

    public void test128_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "vvgnnehvy" + "'", str6, "vvgnnehvy");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.6741471041084708d + "'", double10 == 1.6741471041084708d);
    }

    public void test128_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.6741471041084708d + "'", double10 == 1.6741471041084708d);
    }

    public void test129_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "card" + "'", str10, "card");
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

    public void test129_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "program" + "'", str15, "program");
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

    public void test129_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "parse" + "'", str16, "parse");
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

    public void test129_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "matrix" + "'", str29, "matrix");
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

    public void test129_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "connect" + "'", str30, "connect");
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

    public void test129_6() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "capacitor" + "'", str35, "capacitor");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "index" + "'", str36, "index");
        org.junit.Assert.assertNotNull(hackerArray37);
        org.junit.Assert.assertNotNull(hacker38);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "online" + "'", str39, "online");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "COM" + "'", str40, "COM");
    }

    public void test129_7() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "index" + "'", str36, "index");
        org.junit.Assert.assertNotNull(hackerArray37);
        org.junit.Assert.assertNotNull(hacker38);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "online" + "'", str39, "online");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "COM" + "'", str40, "COM");
    }

    public void test129_8() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "online" + "'", str39, "online");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "COM" + "'", str40, "COM");
    }

    public void test129_9() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "COM" + "'", str40, "COM");
    }

    public void test130_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        java.lang.String str7 = f0.invalidID();
        java.lang.String str8 = f0.countryCodeSL3d();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Samoa" + "'", str1, "Samoa");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P" + "'", str5, "P");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.dannie-ledner.com" + "'", str6, "www.dannie-ledner.com");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "903-52-5861" + "'", str7, "903-52-5861");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "stp" + "'", str8, "stp");
    }

    public void test130_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        java.lang.String str7 = f0.invalidID();
        java.lang.String str8 = f0.countryCodeSL3d();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Samoa" + "'", str1, "Samoa");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P" + "'", str5, "P");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.dannie-ledner.com" + "'", str6, "www.dannie-ledner.com");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "903-52-5861" + "'", str7, "903-52-5861");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "stp" + "'", str8, "stp");
    }

    public void test130_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.dannie-ledner.com" + "'", str6, "www.dannie-ledner.com");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "903-52-5861" + "'", str7, "903-52-5861");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "stp" + "'", str8, "stp");
    }

    public void test130_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "903-52-5861" + "'", str7, "903-52-5861");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "stp" + "'", str8, "stp");
    }

    public void test130_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "stp" + "'", str8, "stp");
    }

    public void test132_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "New" + "'", str3, "New");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-70.574630" + "'", str4, "-70.574630");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ullrich" + "'", str5, "Ullrich");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "East Dennis" + "'", str6, "East Dennis");
    }

    public void test132_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-70.574630" + "'", str4, "-70.574630");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ullrich" + "'", str5, "Ullrich");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "East Dennis" + "'", str6, "East Dennis");
    }

    public void test132_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ullrich" + "'", str5, "Ullrich");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "East Dennis" + "'", str6, "East Dennis");
    }

    public void test132_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "East Dennis" + "'", str6, "East Dennis");
    }

    public void test133_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "South" + "'", str3, "South");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-76.218129" + "'", str4, "-76.218129");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MO" + "'", str5, "MO");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pacific/Auckland" + "'", str6, "Pacific/Auckland");
    }

    public void test133_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-76.218129" + "'", str4, "-76.218129");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MO" + "'", str5, "MO");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pacific/Auckland" + "'", str6, "Pacific/Auckland");
    }

    public void test133_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MO" + "'", str5, "MO");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pacific/Auckland" + "'", str6, "Pacific/Auckland");
    }

    public void test133_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pacific/Auckland" + "'", str6, "Pacific/Auckland");
    }

    public void test134_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cat Aficionado Association" + "'", str8, "Cat Aficionado Association");
    }

    public void test135_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        int int3 = randomService1.nextInt((int) 'g');
         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27 + "'", int3 == 27);
    }

    public void test136_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "642-75-6515" + "'", str5, "642-75-6515");
        org.junit.Assert.assertNotNull(beer6);
        org.junit.Assert.assertNotNull(beer7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    public void test138_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Illustrious" + "'", str6, "Illustrious");
    }

    public void test139_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.domainWord();
        java.lang.String str4 = internet2.uuid();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mertz" + "'", str3, "mertz");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "43d9cf67-1ba4-424e-88d3-ca74177537a8" + "'", str4, "43d9cf67-1ba4-424e-88d3-ca74177537a8");
    }

    public void test139_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "43d9cf67-1ba4-424e-88d3-ca74177537a8" + "'", str4, "43d9cf67-1ba4-424e-88d3-ca74177537a8");
    }

    public void test141_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Haiti" + "'", str1, "Haiti");
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

    public void test141_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "V" + "'", str5, "V");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.berry-bechtelar.com" + "'", str6, "www.berry-bechtelar.com");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "985-64-4848" + "'", str7, "985-64-4848");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Netherlands Antilles" + "'", str10, "Netherlands Antilles");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "05307 Romaguera Field" + "'", str13, "05307 Romaguera Field");
    }

    public void test141_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.berry-bechtelar.com" + "'", str6, "www.berry-bechtelar.com");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "985-64-4848" + "'", str7, "985-64-4848");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Netherlands Antilles" + "'", str10, "Netherlands Antilles");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "05307 Romaguera Field" + "'", str13, "05307 Romaguera Field");
    }

    public void test141_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "985-64-4848" + "'", str7, "985-64-4848");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Netherlands Antilles" + "'", str10, "Netherlands Antilles");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "05307 Romaguera Field" + "'", str13, "05307 Romaguera Field");
    }

    public void test141_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Netherlands Antilles" + "'", str10, "Netherlands Antilles");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "05307 Romaguera Field" + "'", str13, "05307 Romaguera Field");
    }

    public void test141_6() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "05307 Romaguera Field" + "'", str13, "05307 Romaguera Field");
    }

    public void test142_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Holy Alter Ego" + "'", str5, "Holy Alter Ego");
    }

    public void test143_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MarvelousBounty708598573503101587228626409443818" + "'", str7, "MarvelousBounty708598573503101587228626409443818");
    }

    public void test144_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "372.909.9186 x4018" + "'", str7, "372.909.9186 x4018");
    }

    public void test145_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "524-77-9670" + "'", str5, "524-77-9670");
        org.junit.Assert.assertNotNull(beer6);
        org.junit.Assert.assertNotNull(leagueOfLegends7);
        org.junit.Assert.assertNotNull(robin8);
    }

    public void test146_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tempt not a desperate man." + "'", str5, "Tempt not a desperate man.");
    }

    public void test147_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.gislason-schowalter.biz" + "'", str6, "www.gislason-schowalter.biz");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Program Development" + "'", str7, "Program Development");
    }

    public void test147_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Program Development" + "'", str7, "Program Development");
    }

    public void test149_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        java.lang.String str4 = f0.password(28, (int) '4');
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "d2f19304-d4d4-448b-ae2a-21b5ddb3bee1" + "'", str1, "d2f19304-d4d4-448b-ae2a-21b5ddb3bee1");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mfhjtbxpjxgeydxbjsxhpxjftpycnsuxdmn" + "'", str4, "mfhjtbxpjxgeydxbjsxhpxjftpycnsuxdmn");
    }

    public void test149_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.uuid();
        java.lang.String str4 = f0.password(28, (int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "d2f19304-d4d4-448b-ae2a-21b5ddb3bee1" + "'", str1, "d2f19304-d4d4-448b-ae2a-21b5ddb3bee1");
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mfhjtbxpjxgeydxbjsxhpxjftpycnsuxdmn" + "'", str4, "mfhjtbxpjxgeydxbjsxhpxjftpycnsuxdmn");
    }

    public void test151_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        int int6 = f0.streetAddressNumber();
        java.lang.String str7 = f0.streetSuffix();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Turks and Caicos Islands" + "'", str1, "Turks and Caicos Islands");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Bratislava" + "'", str2, "Europe/Bratislava");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 564 + "'", int6 == 564);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Station" + "'", str7, "Station");
    }

    public void test151_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        int int6 = f0.streetAddressNumber();
        java.lang.String str7 = f0.streetSuffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Turks and Caicos Islands" + "'", str1, "Turks and Caicos Islands");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Bratislava" + "'", str2, "Europe/Bratislava");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 564 + "'", int6 == 564);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Station" + "'", str7, "Station");
    }

    public void test151_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 564 + "'", int6 == 564);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Station" + "'", str7, "Station");
    }

    public void test151_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Station" + "'", str7, "Station");
    }

    public void test152_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.fullName();
        java.lang.String str7 = f0.domainName();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Samoa" + "'", str1, "Samoa");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Bucharest" + "'", str2, "Europe/Bucharest");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dr. Doyle Little" + "'", str6, "Dr. Doyle Little");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "schaden.org" + "'", str7, "schaden.org");
    }

    public void test152_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.fullName();
        java.lang.String str7 = f0.domainName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Samoa" + "'", str1, "Samoa");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Bucharest" + "'", str2, "Europe/Bucharest");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dr. Doyle Little" + "'", str6, "Dr. Doyle Little");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "schaden.org" + "'", str7, "schaden.org");
    }

    public void test152_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dr. Doyle Little" + "'", str6, "Dr. Doyle Little");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "schaden.org" + "'", str7, "schaden.org");
    }

    public void test152_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "schaden.org" + "'", str7, "schaden.org");
    }

    public void test153_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tartarus" + "'", str4, "Tartarus");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hades" + "'", str5, "Hades");
    }

    public void test153_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hades" + "'", str5, "Hades");
    }

    public void test155_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.streetAddress();
        java.lang.String str4 = address2.countryCode();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20104 Dooley Union" + "'", str3, "20104 Dooley Union");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GF" + "'", str4, "GF");
    }

    public void test155_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GF" + "'", str4, "GF");
    }

    public void test156_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.domainSuffix();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Bouvet Island (Bouvetoya)" + "'", str1, "Bouvet Island (Bouvetoya)");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "America/Monterrey" + "'", str2, "America/Monterrey");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org" + "'", str6, "org");
    }

    public void test156_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.domainSuffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Bouvet Island (Bouvetoya)" + "'", str1, "Bouvet Island (Bouvetoya)");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "America/Monterrey" + "'", str2, "America/Monterrey");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org" + "'", str6, "org");
    }

    public void test156_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org" + "'", str6, "org");
    }

    public void test157_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str3 = f0.suffix();
        java.lang.String str4 = f0.invalidSSN();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Solomon Islands" + "'", str1, "Solomon Islands");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Guyana Dollar" + "'", str2, "Guyana Dollar");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "and Sons" + "'", str3, "and Sons");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "826000+2213" + "'", str4, "826000+2213");
    }

    public void test157_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str3 = f0.suffix();
        java.lang.String str4 = f0.invalidSSN();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Solomon Islands" + "'", str1, "Solomon Islands");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Guyana Dollar" + "'", str2, "Guyana Dollar");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "and Sons" + "'", str3, "and Sons");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "826000+2213" + "'", str4, "826000+2213");
    }

    public void test157_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str3 = f0.suffix();
        java.lang.String str4 = f0.invalidSSN();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Solomon Islands" + "'", str1, "Solomon Islands");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Guyana Dollar" + "'", str2, "Guyana Dollar");
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "and Sons" + "'", str3, "and Sons");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "826000+2213" + "'", str4, "826000+2213");
    }

    public void test157_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "826000+2213" + "'", str4, "826000+2213");
    }

    public void test158_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jast" + "'", str3, "jast");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "191.148.24.66/11" + "'", str4, "191.148.24.66/11");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e4ec:7d93:01d5:cb8b:00ff:dca7:950a:0f5c/118" + "'", str5, "e4ec:7d93:01d5:cb8b:00ff:dca7:950a:0f5c/118");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://lorempixel.com/g/100/2/nature/Bhutan" + "'", str10, "http://lorempixel.com/g/100/2/nature/Bhutan");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "f631:75b1:3bcd:e847:9bfa:8937:d361:dc03" + "'", str11, "f631:75b1:3bcd:e847:9bfa:8937:d361:dc03");
    }

    public void test158_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "191.148.24.66/11" + "'", str4, "191.148.24.66/11");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e4ec:7d93:01d5:cb8b:00ff:dca7:950a:0f5c/118" + "'", str5, "e4ec:7d93:01d5:cb8b:00ff:dca7:950a:0f5c/118");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://lorempixel.com/g/100/2/nature/Bhutan" + "'", str10, "http://lorempixel.com/g/100/2/nature/Bhutan");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "f631:75b1:3bcd:e847:9bfa:8937:d361:dc03" + "'", str11, "f631:75b1:3bcd:e847:9bfa:8937:d361:dc03");
    }

    public void test158_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e4ec:7d93:01d5:cb8b:00ff:dca7:950a:0f5c/118" + "'", str5, "e4ec:7d93:01d5:cb8b:00ff:dca7:950a:0f5c/118");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://lorempixel.com/g/100/2/nature/Bhutan" + "'", str10, "http://lorempixel.com/g/100/2/nature/Bhutan");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "f631:75b1:3bcd:e847:9bfa:8937:d361:dc03" + "'", str11, "f631:75b1:3bcd:e847:9bfa:8937:d361:dc03");
    }

    public void test158_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://lorempixel.com/g/100/2/nature/Bhutan" + "'", str10, "http://lorempixel.com/g/100/2/nature/Bhutan");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "f631:75b1:3bcd:e847:9bfa:8937:d361:dc03" + "'", str11, "f631:75b1:3bcd:e847:9bfa:8937:d361:dc03");
    }

    public void test158_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "f631:75b1:3bcd:e847:9bfa:8937:d361:dc03" + "'", str11, "f631:75b1:3bcd:e847:9bfa:8937:d361:dc03");
    }

    public void test159_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "American Indian or Alaska Native" + "'", str8, "American Indian or Alaska Native");
    }

    public void test160_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str2 = code1.ean8();
        java.lang.String str3 = code1.asin();
        org.junit.Assert.assertNotNull(code1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "79987943" + "'", str2, "79987943");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "B000I4W7S6" + "'", str3, "B000I4W7S6");
    }

    public void test160_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str2 = code1.ean8();
        java.lang.String str3 = code1.asin();
        org.junit.Assert.assertNotNull(code1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "79987943" + "'", str2, "79987943");
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "B000I4W7S6" + "'", str3, "B000I4W7S6");
    }

    public void test161_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.size();
        java.lang.String str4 = dog2.gender();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "small" + "'", str3, "small");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "female" + "'", str4, "female");
    }

    public void test161_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "female" + "'", str4, "female");
    }

    public void test162_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4896" + "'", str8, "4896");
    }

    public void test163_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "870073-1654" + "'", str1, "870073-1654");
    }

    public void test164_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'g' + "'", char5 == 'g');
// flaky:         org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'u' + "'", char7 == 'u');
    }

    public void test164_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'u' + "'", char7 == 'u');
    }

    public void test165_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        int int4 = f0.integer(2);
        java.lang.String str5 = f0.suffix();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tajikistan" + "'", str1, "Tajikistan");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CFA Franc BEAC" + "'", str2, "CFA Franc BEAC");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "and Sons" + "'", str5, "and Sons");
    }

    public void test165_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        int int4 = f0.integer(2);
        java.lang.String str5 = f0.suffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tajikistan" + "'", str1, "Tajikistan");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CFA Franc BEAC" + "'", str2, "CFA Franc BEAC");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "and Sons" + "'", str5, "and Sons");
    }

    public void test165_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        int int4 = f0.integer(2);
        java.lang.String str5 = f0.suffix();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tajikistan" + "'", str1, "Tajikistan");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CFA Franc BEAC" + "'", str2, "CFA Franc BEAC");
         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "and Sons" + "'", str5, "and Sons");
    }

    public void test165_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "and Sons" + "'", str5, "and Sons");
    }

    public void test166_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Most of the tasks we do are for humans. For example, a tax calculation is counting numbers so the government can pull money out from my wallet, but government consists of humans." + "'", str6, "Most of the tasks we do are for humans. For example, a tax calculation is counting numbers so the government can pull money out from my wallet, but government consists of humans.");
    }

    public void test167_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Clothing, Electronics & Kids" + "'", str5, "Clothing, Electronics & Kids");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Plastic" + "'", str6, "Plastic");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "37.43" + "'", str7, "37.43");
    }

    public void test167_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Plastic" + "'", str6, "Plastic");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "37.43" + "'", str7, "37.43");
    }

    public void test167_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "37.43" + "'", str7, "37.43");
    }

    public void test168_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kerluke" + "'", str3, "kerluke");
    }

    public void test169_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "345-13-0298" + "'", str5, "345-13-0298");
        org.junit.Assert.assertNotNull(faker7);
        org.junit.Assert.assertNotNull(dog8);
        org.junit.Assert.assertNotNull(howIMetYourMother9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "379-38-6705" + "'", str10, "379-38-6705");
    }

    public void test169_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "379-38-6705" + "'", str10, "379-38-6705");
    }

    public void test170_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        int int6 = f0.streetAddressNumber();
        java.lang.String str7 = f0.domainName();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "El Salvador" + "'", str1, "El Salvador");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Ljubljana" + "'", str2, "Europe/Ljubljana");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 460 + "'", int6 == 460);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "batz.name" + "'", str7, "batz.name");
    }

    public void test170_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        int int6 = f0.streetAddressNumber();
        java.lang.String str7 = f0.domainName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "El Salvador" + "'", str1, "El Salvador");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Ljubljana" + "'", str2, "Europe/Ljubljana");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 460 + "'", int6 == 460);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "batz.name" + "'", str7, "batz.name");
    }

    public void test170_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 460 + "'", int6 == 460);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "batz.name" + "'", str7, "batz.name");
    }

    public void test170_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "batz.name" + "'", str7, "batz.name");
    }

    public void test171_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Political Organization" + "'", str7, "Political Organization");
    }

    public void test172_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "carroll" + "'", str3, "carroll");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "85.173.10.248/25" + "'", str4, "85.173.10.248/25");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5e64:9671:5684:8467:564c:a4a0:a112:c554/95" + "'", str5, "5e64:9671:5684:8467:564c:a4a0:a112:c554/95");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mohr.io" + "'", str6, "mohr.io");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "99:bb:42:2a:46:7a" + "'", str8, "99:bb:42:2a:46:7a");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2c5d:0234:5fa1:803e:8874:6031:6722:3df4/106" + "'", str9, "2c5d:0234:5fa1:803e:8874:6031:6722:3df4/106");
    }

    public void test172_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "85.173.10.248/25" + "'", str4, "85.173.10.248/25");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5e64:9671:5684:8467:564c:a4a0:a112:c554/95" + "'", str5, "5e64:9671:5684:8467:564c:a4a0:a112:c554/95");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mohr.io" + "'", str6, "mohr.io");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "99:bb:42:2a:46:7a" + "'", str8, "99:bb:42:2a:46:7a");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2c5d:0234:5fa1:803e:8874:6031:6722:3df4/106" + "'", str9, "2c5d:0234:5fa1:803e:8874:6031:6722:3df4/106");
    }

    public void test172_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5e64:9671:5684:8467:564c:a4a0:a112:c554/95" + "'", str5, "5e64:9671:5684:8467:564c:a4a0:a112:c554/95");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mohr.io" + "'", str6, "mohr.io");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "99:bb:42:2a:46:7a" + "'", str8, "99:bb:42:2a:46:7a");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2c5d:0234:5fa1:803e:8874:6031:6722:3df4/106" + "'", str9, "2c5d:0234:5fa1:803e:8874:6031:6722:3df4/106");
    }

    public void test172_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mohr.io" + "'", str6, "mohr.io");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "99:bb:42:2a:46:7a" + "'", str8, "99:bb:42:2a:46:7a");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2c5d:0234:5fa1:803e:8874:6031:6722:3df4/106" + "'", str9, "2c5d:0234:5fa1:803e:8874:6031:6722:3df4/106");
    }

    public void test172_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "99:bb:42:2a:46:7a" + "'", str8, "99:bb:42:2a:46:7a");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2c5d:0234:5fa1:803e:8874:6031:6722:3df4/106" + "'", str9, "2c5d:0234:5fa1:803e:8874:6031:6722:3df4/106");
    }

    public void test172_6() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2c5d:0234:5fa1:803e:8874:6031:6722:3df4/106" + "'", str9, "2c5d:0234:5fa1:803e:8874:6031:6722:3df4/106");
    }

    public void test174_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "27.52" + "'", str5, "27.52");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Jewelry" + "'", str6, "Jewelry");
    }

    public void test174_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Jewelry" + "'", str6, "Jewelry");
    }

    public void test175_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        int int3 = f2.integer();
        org.junit.Assert.assertNotNull(f2);
         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
    }

    public void test176_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Political Organization" + "'", str5, "Political Organization");
    }

    public void test177_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        int int5 = f0.integer(0);
        java.lang.String str6 = f0.password();
        java.lang.String str7 = f0.domainSuffix();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Syrian Arab Republic" + "'", str1, "Syrian Arab Republic");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Tehran" + "'", str2, "Asia/Tehran");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86.76" + "'", str3, "86.76");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hwujrrrkotvo" + "'", str6, "hwujrrrkotvo");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "biz" + "'", str7, "biz");
    }

    public void test177_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Tehran" + "'", str2, "Asia/Tehran");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86.76" + "'", str3, "86.76");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hwujrrrkotvo" + "'", str6, "hwujrrrkotvo");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "biz" + "'", str7, "biz");
    }

    public void test177_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86.76" + "'", str3, "86.76");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hwujrrrkotvo" + "'", str6, "hwujrrrkotvo");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "biz" + "'", str7, "biz");
    }

    public void test177_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hwujrrrkotvo" + "'", str6, "hwujrrrkotvo");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "biz" + "'", str7, "biz");
    }

    public void test177_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hwujrrrkotvo" + "'", str6, "hwujrrrkotvo");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "biz" + "'", str7, "biz");
    }

    public void test177_6() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "biz" + "'", str7, "biz");
    }

    public void test178_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "84\260F" + "'", str4, "84\260F");
    }

    public void test179_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko" + "'", str5, "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dickens" + "'", str6, "dickens");
    }

    public void test179_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dickens" + "'", str6, "dickens");
    }

    public void test180_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.cityPrefix();
        java.lang.String str3 = f0.invalidSSN();
        java.lang.String str4 = f0.streetName();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Virgin Islands, British" + "'", str1, "Virgin Islands, British");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Port" + "'", str2, "Port");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "117649-9670" + "'", str3, "117649-9670");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ortiz Glens" + "'", str4, "Ortiz Glens");
    }

    public void test180_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.cityPrefix();
        java.lang.String str3 = f0.invalidSSN();
        java.lang.String str4 = f0.streetName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Virgin Islands, British" + "'", str1, "Virgin Islands, British");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Port" + "'", str2, "Port");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "117649-9670" + "'", str3, "117649-9670");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ortiz Glens" + "'", str4, "Ortiz Glens");
    }

    public void test180_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.cityPrefix();
        java.lang.String str3 = f0.invalidSSN();
        java.lang.String str4 = f0.streetName();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Virgin Islands, British" + "'", str1, "Virgin Islands, British");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Port" + "'", str2, "Port");
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "117649-9670" + "'", str3, "117649-9670");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ortiz Glens" + "'", str4, "Ortiz Glens");
    }

    public void test180_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ortiz Glens" + "'", str4, "Ortiz Glens");
    }

    public void test181_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("590427-1763");
        java.lang.Object obj3 = util1.newNode("New Zealand Dollar");
        com.apifortress.apiffaker.F f4 = util1.getFaker();
        org.junit.Assert.assertNotNull(obj3);
         org.junit.Assert.assertEquals(obj3.toString(), "[country_0, ${country}

    public void test182_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EDUC" + "'", str6, "EDUC");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IVFVC" + "'", str7, "IVFVC");
    }

    public void test182_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IVFVC" + "'", str7, "IVFVC");
    }

    public void test184_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "G\351ill do mo thoil!" + "'", str5, "G\351ill do mo thoil!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Activating Self Destruct Sequence." + "'", str6, "Activating Self Destruct Sequence.");
    }

    public void test184_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Activating Self Destruct Sequence." + "'", str6, "Activating Self Destruct Sequence.");
    }

    public void test185_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.uuid();
        java.lang.String str4 = internet2.url();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "d2a1dca1-accc-4b82-ae79-964096f78d4b" + "'", str3, "d2a1dca1-accc-4b82-ae79-964096f78d4b");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "www.daysi-hagenes.co" + "'", str4, "www.daysi-hagenes.co");
    }

    public void test185_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "www.daysi-hagenes.co" + "'", str4, "www.daysi-hagenes.co");
    }

    public void test186_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "North" + "'", str3, "North");
    }

    public void test187_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "program" + "'", str10, "program");
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

    public void test187_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "port" + "'", str15, "port");
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

    public void test187_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "parse" + "'", str16, "parse");
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

    public void test187_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "driver" + "'", str29, "driver");
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

    public void test187_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "parse" + "'", str30, "parse");
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

    public void test187_6() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hard drive" + "'", str35, "hard drive");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "generate" + "'", str36, "generate");
        org.junit.Assert.assertNotNull(hackerArray37);
        org.junit.Assert.assertNotNull(hacker38);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "neural" + "'", str39, "neural");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "application" + "'", str40, "application");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "copy" + "'", str41, "copy");
    }

    public void test187_7() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "generate" + "'", str36, "generate");
        org.junit.Assert.assertNotNull(hackerArray37);
        org.junit.Assert.assertNotNull(hacker38);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "neural" + "'", str39, "neural");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "application" + "'", str40, "application");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "copy" + "'", str41, "copy");
    }

    public void test187_8() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "neural" + "'", str39, "neural");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "application" + "'", str40, "application");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "copy" + "'", str41, "copy");
    }

    public void test187_9() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "application" + "'", str40, "application");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "copy" + "'", str41, "copy");
    }

    public void test187_10() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "copy" + "'", str41, "copy");
    }

    public void test188_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Latvia" + "'", str1, "Latvia");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/London" + "'", str2, "Europe/London");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "79.75" + "'", str3, "79.75");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 91 + "'", int5 == 91);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "rippin.io" + "'", str6, "rippin.io");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Suite 581" + "'", str7, "Suite 581");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUD" + "'", str8, "AUD");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SD" + "'", str9, "SD");
    }

    public void test188_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/London" + "'", str2, "Europe/London");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "79.75" + "'", str3, "79.75");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 91 + "'", int5 == 91);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "rippin.io" + "'", str6, "rippin.io");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Suite 581" + "'", str7, "Suite 581");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUD" + "'", str8, "AUD");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SD" + "'", str9, "SD");
    }

    public void test188_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "79.75" + "'", str3, "79.75");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 91 + "'", int5 == 91);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "rippin.io" + "'", str6, "rippin.io");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Suite 581" + "'", str7, "Suite 581");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUD" + "'", str8, "AUD");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SD" + "'", str9, "SD");
    }

    public void test188_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 91 + "'", int5 == 91);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "rippin.io" + "'", str6, "rippin.io");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Suite 581" + "'", str7, "Suite 581");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUD" + "'", str8, "AUD");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SD" + "'", str9, "SD");
    }

    public void test188_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "rippin.io" + "'", str6, "rippin.io");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Suite 581" + "'", str7, "Suite 581");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUD" + "'", str8, "AUD");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SD" + "'", str9, "SD");
    }

    public void test188_6() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Suite 581" + "'", str7, "Suite 581");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUD" + "'", str8, "AUD");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SD" + "'", str9, "SD");
    }

    public void test188_7() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AUD" + "'", str8, "AUD");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SD" + "'", str9, "SD");
    }

    public void test188_8() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SD" + "'", str9, "SD");
    }

    public void test189_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.domainName();
        java.lang.String str7 = f0.url();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Congo" + "'", str1, "Congo");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Kolkata" + "'", str2, "Asia/Kolkata");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "lowe.biz" + "'", str6, "lowe.biz");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "www.maybell-hammes.info" + "'", str7, "www.maybell-hammes.info");
    }

    public void test189_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.domainName();
        java.lang.String str7 = f0.url();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Congo" + "'", str1, "Congo");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Kolkata" + "'", str2, "Asia/Kolkata");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "lowe.biz" + "'", str6, "lowe.biz");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "www.maybell-hammes.info" + "'", str7, "www.maybell-hammes.info");
    }

    public void test189_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "lowe.biz" + "'", str6, "lowe.biz");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "www.maybell-hammes.info" + "'", str7, "www.maybell-hammes.info");
    }

    public void test189_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "www.maybell-hammes.info" + "'", str7, "www.maybell-hammes.info");
    }

    public void test190_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Port" + "'", str3, "Port");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NV" + "'", str4, "NV");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mouth" + "'", str5, "mouth");
    }

    public void test190_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "NV" + "'", str4, "NV");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mouth" + "'", str5, "mouth");
    }

    public void test190_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mouth" + "'", str5, "mouth");
    }

    public void test191_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        java.lang.String str2 = internet1.publicIpV4Address();
        org.junit.Assert.assertNotNull(internet1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "138.193.96.181" + "'", str2, "138.193.96.181");
    }

    public void test193_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "753-93-7800" + "'", str5, "753-93-7800");
        org.junit.Assert.assertNotNull(beer6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pale" + "'", str7, "Pale");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Sierra Nevada Celebration Ale" + "'", str8, "Sierra Nevada Celebration Ale");
    }

    public void test193_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pale" + "'", str7, "Pale");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Sierra Nevada Celebration Ale" + "'", str8, "Sierra Nevada Celebration Ale");
    }

    public void test193_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Sierra Nevada Celebration Ale" + "'", str8, "Sierra Nevada Celebration Ale");
    }

    public void test195_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        int int5 = f0.integer(0);
        double double7 = f0.decimal((long) 'k');
        java.lang.String str8 = f0.lastName();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Taiwan" + "'", str1, "Taiwan");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Moscow" + "'", str2, "Europe/Moscow");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9.00" + "'", str3, "9.00");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 90 + "'", int5 == 90);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.12d + "'", double7 == 103.12d);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ondricka" + "'", str8, "Ondricka");
    }

    public void test195_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Moscow" + "'", str2, "Europe/Moscow");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9.00" + "'", str3, "9.00");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 90 + "'", int5 == 90);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.12d + "'", double7 == 103.12d);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ondricka" + "'", str8, "Ondricka");
    }

    public void test195_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9.00" + "'", str3, "9.00");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 90 + "'", int5 == 90);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.12d + "'", double7 == 103.12d);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ondricka" + "'", str8, "Ondricka");
    }

    public void test195_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 90 + "'", int5 == 90);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.12d + "'", double7 == 103.12d);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ondricka" + "'", str8, "Ondricka");
    }

    public void test195_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 103.12d + "'", double7 == 103.12d);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ondricka" + "'", str8, "Ondricka");
    }

    public void test195_6() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ondricka" + "'", str8, "Ondricka");
    }

    public void test197_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Legendary" + "'", str4, "Legendary");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Virginia Mosby" + "'", str5, "Virginia Mosby");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2019re going to get older whether we like it or not, so the only question is whether we get on with our lives, or desperately cling to the past." + "'", str6, "\u2019re going to get older whether we like it or not, so the only question is whether we get on with our lives, or desperately cling to the past.");
    }

    public void test197_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Virginia Mosby" + "'", str5, "Virginia Mosby");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2019re going to get older whether we like it or not, so the only question is whether we get on with our lives, or desperately cling to the past." + "'", str6, "\u2019re going to get older whether we like it or not, so the only question is whether we get on with our lives, or desperately cling to the past.");
    }

    public void test197_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2019re going to get older whether we like it or not, so the only question is whether we get on with our lives, or desperately cling to the past." + "'", str6, "\u2019re going to get older whether we like it or not, so the only question is whether we get on with our lives, or desperately cling to the past.");
    }

    public void test198_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Conscience is but a word that cowards use, devised at first to keep the strong in awe." + "'", str5, "Conscience is but a word that cowards use, devised at first to keep the strong in awe.");
    }

    public void test199_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.validSSN();
        f0.setTemplateStyle(false);
        java.lang.String str4 = f0.streetAddress();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "810421-3072" + "'", str1, "810421-3072");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8053 Baumbach Branch" + "'", str4, "8053 Baumbach Branch");
    }

    public void test199_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.validSSN();
        f0.setTemplateStyle(false);
        java.lang.String str4 = f0.streetAddress();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "810421-3072" + "'", str1, "810421-3072");
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8053 Baumbach Branch" + "'", str4, "8053 Baumbach Branch");
    }

    public void test200_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'e' + "'", char5 == 'e');
    }

    public void test201_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.currency();
        java.lang.String str3 = f0.countryCodeSL3d();
        int[] intArray5 = f0.integerList((int) (byte) 1);
        java.lang.String str6 = f0.password();
        java.lang.String str7 = f0.password();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Dominican Republic" + "'", str1, "Dominican Republic");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aruban Florin" + "'", str2, "Aruban Florin");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nam" + "'", str3, "nam");
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[6, 51, 55, 51, 9, 75, 20, 18, 49, 28]");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ofekxxmazsiwj" + "'", str6, "ofekxxmazsiwj");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mmmqpstn" + "'", str7, "mmmqpstn");
    }

    public void test201_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aruban Florin" + "'", str2, "Aruban Florin");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nam" + "'", str3, "nam");
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[6, 51, 55, 51, 9, 75, 20, 18, 49, 28]");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ofekxxmazsiwj" + "'", str6, "ofekxxmazsiwj");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mmmqpstn" + "'", str7, "mmmqpstn");
    }

    public void test201_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nam" + "'", str3, "nam");
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[6, 51, 55, 51, 9, 75, 20, 18, 49, 28]");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ofekxxmazsiwj" + "'", str6, "ofekxxmazsiwj");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mmmqpstn" + "'", str7, "mmmqpstn");
    }

    public void test201_4() throws Throwable {
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
         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[6, 51, 55, 51, 9, 75, 20, 18, 49, 28]");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ofekxxmazsiwj" + "'", str6, "ofekxxmazsiwj");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mmmqpstn" + "'", str7, "mmmqpstn");
    }

    public void test201_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ofekxxmazsiwj" + "'", str6, "ofekxxmazsiwj");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mmmqpstn" + "'", str7, "mmmqpstn");
    }

    public void test201_6() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mmmqpstn" + "'", str7, "mmmqpstn");
    }

    public void test202_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "panel" + "'", str10, "panel");
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

    public void test202_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "alarm" + "'", str15, "alarm");
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

    public void test202_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "synthesize" + "'", str16, "synthesize");
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

    public void test202_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "microchip" + "'", str29, "microchip");
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

    public void test202_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "compress" + "'", str30, "compress");
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

    public void test202_6() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "application" + "'", str35, "application");
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

    public void test202_7() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "connect" + "'", str36, "connect");
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

    public void test203_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "XCD" + "'", str3, "XCD");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Brandon" + "'", str4, "Brandon");
    }

    public void test203_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Brandon" + "'", str4, "Brandon");
    }

    public void test204_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2" + "'", str4, "2");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57L + "'", long7 == 57L);
    }

    public void test204_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57L + "'", long7 == 57L);
    }

    public void test205_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Europe/London" + "'", str3, "Europe/London");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "863 Ortiz Isle, Haagfurt, NV 04901-2427" + "'", str4, "863 Ortiz Isle, Haagfurt, NV 04901-2427");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "borough" + "'", str5, "borough");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "South Georgia and the South Sandwich Islands" + "'", str6, "South Georgia and the South Sandwich Islands");
    }

    public void test205_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "863 Ortiz Isle, Haagfurt, NV 04901-2427" + "'", str4, "863 Ortiz Isle, Haagfurt, NV 04901-2427");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "borough" + "'", str5, "borough");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "South Georgia and the South Sandwich Islands" + "'", str6, "South Georgia and the South Sandwich Islands");
    }

    public void test205_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "borough" + "'", str5, "borough");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "South Georgia and the South Sandwich Islands" + "'", str6, "South Georgia and the South Sandwich Islands");
    }

    public void test205_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "South Georgia and the South Sandwich Islands" + "'", str6, "South Georgia and the South Sandwich Islands");
    }

    public void test206_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.countryCodeSL();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cuba" + "'", str1, "Cuba");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "America/Godthab" + "'", str2, "America/Godthab");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ke" + "'", str6, "ke");
    }

    public void test206_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        int int5 = f0.integer((int) (short) 10, (int) (short) 10);
        java.lang.String str6 = f0.countryCodeSL();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cuba" + "'", str1, "Cuba");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "America/Godthab" + "'", str2, "America/Godthab");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ke" + "'", str6, "ke");
    }

    public void test206_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ke" + "'", str6, "ke");
    }

    public void test207_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "87:32:41:86:1a:a9" + "'", str10, "87:32:41:86:1a:a9");
    }

    public void test210_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Address address2 = faker1.address();
        java.lang.String str3 = address2.cityPrefix();
        java.lang.String str4 = address2.citySuffix();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(address2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "West" + "'", str3, "West");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chester" + "'", str4, "chester");
    }

    public void test210_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "chester" + "'", str4, "chester");
    }

    public void test211_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Rap" + "'", str7, "Rap");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Xylophone" + "'", str8, "Xylophone");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Electronic" + "'", str9, "Electronic");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pop" + "'", str10, "Pop");
    }

    public void test211_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Xylophone" + "'", str8, "Xylophone");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Electronic" + "'", str9, "Electronic");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pop" + "'", str10, "Pop");
    }

    public void test211_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Electronic" + "'", str9, "Electronic");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pop" + "'", str10, "Pop");
    }

    public void test211_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pop" + "'", str10, "Pop");
    }

    public void test212_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        java.lang.String str3 = internet2.ipV6Address();
        java.lang.String str4 = internet2.ipV6Cidr();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(internet2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7a53:8c74:4390:81c7:30c1:4ee6:7397:fd33" + "'", str3, "7a53:8c74:4390:81c7:30c1:4ee6:7397:fd33");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8621:5c09:dbf9:4d0a:9b12:661c:e9fb:c3f1/116" + "'", str4, "8621:5c09:dbf9:4d0a:9b12:661c:e9fb:c3f1/116");
    }

    public void test212_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8621:5c09:dbf9:4d0a:9b12:661c:e9fb:c3f1/116" + "'", str4, "8621:5c09:dbf9:4d0a:9b12:661c:e9fb:c3f1/116");
    }

    public void test213_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Friends friends1 = faker0.friends();
        java.lang.String str2 = friends1.character();
        org.junit.Assert.assertNotNull(friends1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doug" + "'", str2, "Doug");
    }

    public void test215_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Magnificent Rocket Raccoon" + "'", str6, "Magnificent Rocket Raccoon");
    }

    public void test216_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "China" + "'", str1, "China");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Belgrade" + "'", str2, "Europe/Belgrade");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "strosin.net" + "'", str6, "strosin.net");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "596-64-8163" + "'", str7, "596-64-8163");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Port" + "'", str8, "Port");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 89.68d + "'", double10 == 89.68d);
    }

    public void test216_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Belgrade" + "'", str2, "Europe/Belgrade");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "strosin.net" + "'", str6, "strosin.net");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "596-64-8163" + "'", str7, "596-64-8163");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Port" + "'", str8, "Port");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 89.68d + "'", double10 == 89.68d);
    }

    public void test216_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "strosin.net" + "'", str6, "strosin.net");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "596-64-8163" + "'", str7, "596-64-8163");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Port" + "'", str8, "Port");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 89.68d + "'", double10 == 89.68d);
    }

    public void test216_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "596-64-8163" + "'", str7, "596-64-8163");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Port" + "'", str8, "Port");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 89.68d + "'", double10 == 89.68d);
    }

    public void test216_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Port" + "'", str8, "Port");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 89.68d + "'", double10 == 89.68d);
    }

    public void test216_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 89.68d + "'", double10 == 89.68d);
    }

    public void test217_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        java.lang.String str2 = randomService1.hex();
        int int4 = randomService1.nextInt((int) 'g');
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "89061D97" + "'", str2, "89061D97");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 88 + "'", int4 == 88);
    }

    public void test217_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        java.lang.String str2 = randomService1.hex();
        int int4 = randomService1.nextInt((int) 'g');
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "89061D97" + "'", str2, "89061D97");
         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 88 + "'", int4 == 88);
    }

    public void test218_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8b9ddb107823b604d04e7a396652b315" + "'", str4, "8b9ddb107823b604d04e7a396652b315");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3f1017ff2d051fa751b4bf0ce50d03f904a866ba6ab76ed23fbae205b477c28fe79a14d6064db496ba00895cf93220d7bdaaf63c0b36e1dc6ed117e8198baf50" + "'", str5, "3f1017ff2d051fa751b4bf0ce50d03f904a866ba6ab76ed23fbae205b477c28fe79a14d6064db496ba00895cf93220d7bdaaf63c0b36e1dc6ed117e8198baf50");
    }

    public void test218_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3f1017ff2d051fa751b4bf0ce50d03f904a866ba6ab76ed23fbae205b477c28fe79a14d6064db496ba00895cf93220d7bdaaf63c0b36e1dc6ed117e8198baf50" + "'", str5, "3f1017ff2d051fa751b4bf0ce50d03f904a866ba6ab76ed23fbae205b477c28fe79a14d6064db496ba00895cf93220d7bdaaf63c0b36e1dc6ed117e8198baf50");
    }

    public void test219_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jast" + "'", str3, "jast");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "63.31.63.186/18" + "'", str4, "63.31.63.186/18");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192.168.113.112" + "'", str5, "192.168.113.112");
    }

    public void test219_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "63.31.63.186/18" + "'", str4, "63.31.63.186/18");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192.168.113.112" + "'", str5, "192.168.113.112");
    }

    public void test219_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192.168.113.112" + "'", str5, "192.168.113.112");
    }

    public void test220_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "332-11-9207" + "'", str5, "332-11-9207");
        org.junit.Assert.assertNotNull(beer6);
        org.junit.Assert.assertNotNull(beer7);
        org.junit.Assert.assertNotNull(university8);
    }

    public void test221_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Bronze IV" + "'", str5, "Bronze IV");
    }

    public void test223_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Associate Degree in Biomedical Science" + "'", str6, "Associate Degree in Biomedical Science");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Vertapple Campus" + "'", str7, "Vertapple Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Iceborough Campus" + "'", str8, "Iceborough Campus");
    }

    public void test223_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Vertapple Campus" + "'", str7, "Vertapple Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Iceborough Campus" + "'", str8, "Iceborough Campus");
    }

    public void test223_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Iceborough Campus" + "'", str8, "Iceborough Campus");
    }

    public void test224_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'j' + "'", char4 == 'j');
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "vc6yqunhjlbpyiic85imglcnpdmpx8gp5" + "'", str6, "vc6yqunhjlbpyiic85imglcnpdmpx8gp5");
    }

    public void test224_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "vc6yqunhjlbpyiic85imglcnpdmpx8gp5" + "'", str6, "vc6yqunhjlbpyiic85imglcnpdmpx8gp5");
    }

    public void test225_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ESL Cologne" + "'", str4, "ESL Cologne");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KennyS" + "'", str5, "KennyS");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Silvername" + "'", str6, "Silvername");
    }

    public void test225_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "KennyS" + "'", str5, "KennyS");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Silvername" + "'", str6, "Silvername");
    }

    public void test225_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Silvername" + "'", str6, "Silvername");
    }

    public void test226_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "594-11-3868" + "'", str5, "594-11-3868");
        org.junit.Assert.assertNotNull(beer6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Munich" + "'", str7, "Munich");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2308 - Munich Lager" + "'", str8, "2308 - Munich Lager");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Old Rasputin Russian Imperial Stout" + "'", str9, "Old Rasputin Russian Imperial Stout");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Porter" + "'", str10, "Porter");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Two Hearted Ale" + "'", str11, "Two Hearted Ale");
    }

    public void test226_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Munich" + "'", str7, "Munich");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2308 - Munich Lager" + "'", str8, "2308 - Munich Lager");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Old Rasputin Russian Imperial Stout" + "'", str9, "Old Rasputin Russian Imperial Stout");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Porter" + "'", str10, "Porter");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Two Hearted Ale" + "'", str11, "Two Hearted Ale");
    }

    public void test226_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2308 - Munich Lager" + "'", str8, "2308 - Munich Lager");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Old Rasputin Russian Imperial Stout" + "'", str9, "Old Rasputin Russian Imperial Stout");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Porter" + "'", str10, "Porter");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Two Hearted Ale" + "'", str11, "Two Hearted Ale");
    }

    public void test226_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Old Rasputin Russian Imperial Stout" + "'", str9, "Old Rasputin Russian Imperial Stout");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Porter" + "'", str10, "Porter");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Two Hearted Ale" + "'", str11, "Two Hearted Ale");
    }

    public void test226_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Porter" + "'", str10, "Porter");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Two Hearted Ale" + "'", str11, "Two Hearted Ale");
    }

    public void test226_6() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Two Hearted Ale" + "'", str11, "Two Hearted Ale");
    }

    public void test227_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Female" + "'", str8, "Female");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Asian" + "'", str9, "Asian");
    }

    public void test227_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Asian" + "'", str9, "Asian");
    }

    public void test229_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ch\342teau Guillard" + "'", str5, "Ch\342teau Guillard");
    }

    public void test230_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Qui optio qui nulla eligendi sint veritatis. Molestiae pariatur tenetur. Unde eos ea et eius id rerum unde. Maxime eligendi perferendis repellendus." + "'", str4, "Qui optio qui nulla eligendi sint veritatis. Molestiae pariatur tenetur. Unde eos ea et eius id rerum unde. Maxime eligendi perferendis repellendus.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cxltyq2kds0zdrv5ftrvznyotsqjpg0b" + "'", str7, "cxltyq2kds0zdrv5ftrvznyotsqjpg0b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    public void test230_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cxltyq2kds0zdrv5ftrvznyotsqjpg0b" + "'", str7, "cxltyq2kds0zdrv5ftrvznyotsqjpg0b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    public void test231_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-6\260C" + "'", str3, "-6\260C");
    }

    public void test232_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.cityPrefix();
        java.lang.String str3 = f0.invalidID();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Poland" + "'", str1, "Poland");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "South" + "'", str2, "South");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "826-00-8072" + "'", str3, "826-00-8072");
    }

    public void test232_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.cityPrefix();
        java.lang.String str3 = f0.invalidID();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Poland" + "'", str1, "Poland");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "South" + "'", str2, "South");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "826-00-8072" + "'", str3, "826-00-8072");
    }

    public void test232_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.cityPrefix();
        java.lang.String str3 = f0.invalidID();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Poland" + "'", str1, "Poland");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "South" + "'", str2, "South");
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "826-00-8072" + "'", str3, "826-00-8072");
    }

    public void test233_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Kid Trunks" + "'", str7, "Kid Trunks");
    }

    public void test235_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "I'll scout ahead!" + "'", str5, "I'll scout ahead!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Platinum II" + "'", str6, "Platinum II");
    }

    public void test235_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Platinum II" + "'", str6, "Platinum II");
    }

    public void test236_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36\260F" + "'", str3, "36\260F");
    }

    public void test237_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        java.lang.String str7 = f0.invalidID();
        java.lang.String str8 = f0.zipCode();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Moldova" + "'", str1, "Moldova");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "B" + "'", str5, "B");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.rickie-witting.org" + "'", str6, "www.rickie-witting.org");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "046-43-0000" + "'", str7, "046-43-0000");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "53903" + "'", str8, "53903");
    }

    public void test237_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        java.lang.String str7 = f0.invalidID();
        java.lang.String str8 = f0.zipCode();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Moldova" + "'", str1, "Moldova");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "B" + "'", str5, "B");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.rickie-witting.org" + "'", str6, "www.rickie-witting.org");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "046-43-0000" + "'", str7, "046-43-0000");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "53903" + "'", str8, "53903");
    }

    public void test237_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.rickie-witting.org" + "'", str6, "www.rickie-witting.org");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "046-43-0000" + "'", str7, "046-43-0000");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "53903" + "'", str8, "53903");
    }

    public void test237_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "046-43-0000" + "'", str7, "046-43-0000");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "53903" + "'", str8, "53903");
    }

    public void test237_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "53903" + "'", str8, "53903");
    }

    public void test239_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        java.lang.String str6 = internet1.image((java.lang.Integer) 75, (java.lang.Integer) 12, (java.lang.Boolean) false, "b");
        java.lang.String str7 = internet1.uuid();
        org.junit.Assert.assertNotNull(internet1);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://lorempixel.com/75/12/animals/b" + "'", str6, "http://lorempixel.com/75/12/animals/b");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bab6707c-8f41-4441-b8cf-2fd3941877f6" + "'", str7, "bab6707c-8f41-4441-b8cf-2fd3941877f6");
    }

    public void test239_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Internet internet1 = faker0.internet();
        java.lang.String str6 = internet1.image((java.lang.Integer) 75, (java.lang.Integer) 12, (java.lang.Boolean) false, "b");
        java.lang.String str7 = internet1.uuid();
        org.junit.Assert.assertNotNull(internet1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://lorempixel.com/75/12/animals/b" + "'", str6, "http://lorempixel.com/75/12/animals/b");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bab6707c-8f41-4441-b8cf-2fd3941877f6" + "'", str7, "bab6707c-8f41-4441-b8cf-2fd3941877f6");
    }

    public void test240_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Worlds" + "'", str4, "Worlds");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Froggen" + "'", str5, "Froggen");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IEM" + "'", str6, "IEM");
    }

    public void test240_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Froggen" + "'", str5, "Froggen");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IEM" + "'", str6, "IEM");
    }

    public void test240_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IEM" + "'", str6, "IEM");
    }

    public void test241_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hack" + "'", str4, "hack");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "solid state" + "'", str5, "solid state");
    }

    public void test241_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "solid state" + "'", str5, "solid state");
    }

    public void test242_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("hi!");
        com.apifortress.apiffaker.F f2 = util1.getFaker();
        boolean boolean3 = f2.getTemplateStyle();
        f2.setTemplateStyle(true);
        java.lang.String str6 = f2.streetSuffix();
        org.junit.Assert.assertNotNull(f2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ports" + "'", str6, "Ports");
    }

    public void test243_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + char5 + "' != '" + 's' + "'", char5 == 's');
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "kE9BaH3ePOVdnJ5piRxazTQF67opNS3Ds2hCVjMTAU6nyG4o2P7qsyX3oFAaxCZU25xs2W8P5r2E04WIiRtsiVcCTQwk34V0aX58" + "'", str9, "kE9BaH3ePOVdnJ5piRxazTQF67opNS3Ds2hCVjMTAU6nyG4o2P7qsyX3oFAaxCZU25xs2W8P5r2E04WIiRtsiVcCTQwk34V0aX58");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fRhKzbDnJflpAEXiXJNUEGPztTZEKLOsShsaLlFQCYaqOm" + "'", str14, "fRhKzbDnJflpAEXiXJNUEGPztTZEKLOsShsaLlFQCYaqOm");
    }

    public void test243_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "kE9BaH3ePOVdnJ5piRxazTQF67opNS3Ds2hCVjMTAU6nyG4o2P7qsyX3oFAaxCZU25xs2W8P5r2E04WIiRtsiVcCTQwk34V0aX58" + "'", str9, "kE9BaH3ePOVdnJ5piRxazTQF67opNS3Ds2hCVjMTAU6nyG4o2P7qsyX3oFAaxCZU25xs2W8P5r2E04WIiRtsiVcCTQwk34V0aX58");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fRhKzbDnJflpAEXiXJNUEGPztTZEKLOsShsaLlFQCYaqOm" + "'", str14, "fRhKzbDnJflpAEXiXJNUEGPztTZEKLOsShsaLlFQCYaqOm");
    }

    public void test243_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fRhKzbDnJflpAEXiXJNUEGPztTZEKLOsShsaLlFQCYaqOm" + "'", str14, "fRhKzbDnJflpAEXiXJNUEGPztTZEKLOsShsaLlFQCYaqOm");
    }

    public void test244_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No schooling completed" + "'", str8, "No schooling completed");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Never married" + "'", str9, "Never married");
    }

    public void test244_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Never married" + "'", str9, "Never married");
    }

    public void test245_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str2 = code1.ean8();
        java.lang.String str3 = code1.isbn10();
        org.junit.Assert.assertNotNull(code1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "43529681" + "'", str2, "43529681");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1888734671" + "'", str3, "1888734671");
    }

    public void test245_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str2 = code1.ean8();
        java.lang.String str3 = code1.isbn10();
        org.junit.Assert.assertNotNull(code1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "43529681" + "'", str2, "43529681");
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1888734671" + "'", str3, "1888734671");
    }

    public void test246_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Orkwood of Orkmont" + "'", str5, "Orkwood of Orkmont");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "And so he spoke, and so he spoke, that Lord of Castamere, but now the rains weep o'er his hall, with no one there to hear. Yes, now the rains weep o'er his hall, and not a soul to hear." + "'", str6, "And so he spoke, and so he spoke, that Lord of Castamere, but now the rains weep o'er his hall, with no one there to hear. Yes, now the rains weep o'er his hall, and not a soul to hear.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "The North remembers." + "'", str7, "The North remembers.");
    }

    public void test246_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "And so he spoke, and so he spoke, that Lord of Castamere, but now the rains weep o'er his hall, with no one there to hear. Yes, now the rains weep o'er his hall, and not a soul to hear." + "'", str6, "And so he spoke, and so he spoke, that Lord of Castamere, but now the rains weep o'er his hall, with no one there to hear. Yes, now the rains weep o'er his hall, and not a soul to hear.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "The North remembers." + "'", str7, "The North remembers.");
    }

    public void test246_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "The North remembers." + "'", str7, "The North remembers.");
    }

    public void test247_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "herzog" + "'", str3, "herzog");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "84.120.246.5/7" + "'", str4, "84.120.246.5/7");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9692:7651:aea0:61a2:0b95:f925:94f5:29ba/33" + "'", str5, "9692:7651:aea0:61a2:0b95:f925:94f5:29ba/33");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://lorempixel.com/g/100/2/business/Bhutan" + "'", str10, "http://lorempixel.com/g/100/2/business/Bhutan");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "9zdf4ew16of" + "'", str12, "9zdf4ew16of");
    }

    public void test247_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "84.120.246.5/7" + "'", str4, "84.120.246.5/7");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9692:7651:aea0:61a2:0b95:f925:94f5:29ba/33" + "'", str5, "9692:7651:aea0:61a2:0b95:f925:94f5:29ba/33");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://lorempixel.com/g/100/2/business/Bhutan" + "'", str10, "http://lorempixel.com/g/100/2/business/Bhutan");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "9zdf4ew16of" + "'", str12, "9zdf4ew16of");
    }

    public void test247_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9692:7651:aea0:61a2:0b95:f925:94f5:29ba/33" + "'", str5, "9692:7651:aea0:61a2:0b95:f925:94f5:29ba/33");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://lorempixel.com/g/100/2/business/Bhutan" + "'", str10, "http://lorempixel.com/g/100/2/business/Bhutan");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "9zdf4ew16of" + "'", str12, "9zdf4ew16of");
    }

    public void test247_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://lorempixel.com/g/100/2/business/Bhutan" + "'", str10, "http://lorempixel.com/g/100/2/business/Bhutan");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "9zdf4ew16of" + "'", str12, "9zdf4ew16of");
    }

    public void test247_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "9zdf4ew16of" + "'", str12, "9zdf4ew16of");
    }

    public void test249_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Liaison" + "'", str4, "Liaison");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Director" + "'", str5, "Director");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Executive" + "'", str6, "Executive");
    }

    public void test249_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Director" + "'", str5, "Director");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Executive" + "'", str6, "Executive");
    }

    public void test249_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Executive" + "'", str6, "Executive");
    }

    public void test250_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.price();
        int int5 = f0.integer(0);
        double double7 = f0.decimal((long) 'k');
        java.lang.String str8 = f0.buildingNumber();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Paraguay" + "'", str1, "Paraguay");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Sarajevo" + "'", str2, "Europe/Sarajevo");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "17.32" + "'", str3, "17.32");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.12d + "'", double7 == 104.12d);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "45977" + "'", str8, "45977");
    }

    public void test250_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Europe/Sarajevo" + "'", str2, "Europe/Sarajevo");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "17.32" + "'", str3, "17.32");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.12d + "'", double7 == 104.12d);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "45977" + "'", str8, "45977");
    }

    public void test250_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "17.32" + "'", str3, "17.32");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.12d + "'", double7 == 104.12d);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "45977" + "'", str8, "45977");
    }

    public void test250_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.12d + "'", double7 == 104.12d);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "45977" + "'", str8, "45977");
    }

    public void test250_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 104.12d + "'", double7 == 104.12d);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "45977" + "'", str8, "45977");
    }

    public void test250_6() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "45977" + "'", str8, "45977");
    }

    public void test251_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cole" + "'", str3, "cole");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "46.84.158.92/9" + "'", str4, "46.84.158.92/9");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "velit_velit" + "'", str5, "velit_velit");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dffd:26c8:17a7:5ee0:e531:a76f:2571:eb90" + "'", str6, "dffd:26c8:17a7:5ee0:e531:a76f:2571:eb90");
    }

    public void test251_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "46.84.158.92/9" + "'", str4, "46.84.158.92/9");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "velit_velit" + "'", str5, "velit_velit");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dffd:26c8:17a7:5ee0:e531:a76f:2571:eb90" + "'", str6, "dffd:26c8:17a7:5ee0:e531:a76f:2571:eb90");
    }

    public void test251_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "velit_velit" + "'", str5, "velit_velit");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dffd:26c8:17a7:5ee0:e531:a76f:2571:eb90" + "'", str6, "dffd:26c8:17a7:5ee0:e531:a76f:2571:eb90");
    }

    public void test251_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dffd:26c8:17a7:5ee0:e531:a76f:2571:eb90" + "'", str6, "dffd:26c8:17a7:5ee0:e531:a76f:2571:eb90");
    }

    public void test252_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "https://pigment.github.io/fake-logos/logos/medium/color/2.png" + "'", str5, "https://pigment.github.io/fake-logos/logos/medium/color/2.png");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "morph intuitive supply-chains" + "'", str6, "morph intuitive supply-chains");
    }

    public void test252_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "morph intuitive supply-chains" + "'", str6, "morph intuitive supply-chains");
    }

    public void test253_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("");
        com.apifortress.apiffaker.F f2 = null;
        util1.setFaker(f2);
        java.lang.Object obj5 = util1.setLocale("hi!");
        java.lang.Object obj6 = util1.newNode();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + true + "'", obj5, true);
        org.junit.Assert.assertNotNull(obj6);
         org.junit.Assert.assertEquals(obj6.toString(), "[streetAddress_0, ${streetAddress}

    public void test254_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + char5 + "' != '" + '9' + "'", char5 == '9');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    public void test255_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        java.lang.Boolean boolean2 = randomService1.nextBoolean();
         org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + true + "'", boolean2, true);
    }

    public void test256_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Challenege Accepted" + "'", str4, "Challenege Accepted");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Claudia Grice" + "'", str5, "Claudia Grice");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple High Fives" + "'", str6, "Multiple High Fives");
    }

    public void test256_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Claudia Grice" + "'", str5, "Claudia Grice");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple High Fives" + "'", str6, "Multiple High Fives");
    }

    public void test256_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple High Fives" + "'", str6, "Multiple High Fives");
    }

    public void test257_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "West" + "'", str3, "West");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-33.079619" + "'", str4, "-33.079619");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "BF" + "'", str5, "BF");
    }

    public void test257_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-33.079619" + "'", str4, "-33.079619");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "BF" + "'", str5, "BF");
    }

    public void test257_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "BF" + "'", str5, "BF");
    }

    public void test258_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Bachelor of Nursing" + "'", str6, "Bachelor of Nursing");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Bluemeadow Campus" + "'", str7, "Bluemeadow Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Master of Law" + "'", str8, "Master of Law");
    }

    public void test258_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Bluemeadow Campus" + "'", str7, "Bluemeadow Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Master of Law" + "'", str8, "Master of Law");
    }

    public void test258_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Master of Law" + "'", str8, "Master of Law");
    }

    public void test259_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Denmark" + "'", str1, "Denmark");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Bangkok" + "'", str2, "Asia/Bangkok");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lightweight Iron Keyboard" + "'", str6, "Lightweight Iron Keyboard");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cayman Islands Dollar" + "'", str7, "Cayman Islands Dollar");
    }

    public void test259_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Bangkok" + "'", str2, "Asia/Bangkok");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lightweight Iron Keyboard" + "'", str6, "Lightweight Iron Keyboard");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cayman Islands Dollar" + "'", str7, "Cayman Islands Dollar");
    }

    public void test259_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lightweight Iron Keyboard" + "'", str6, "Lightweight Iron Keyboard");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cayman Islands Dollar" + "'", str7, "Cayman Islands Dollar");
    }

    public void test259_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cayman Islands Dollar" + "'", str7, "Cayman Islands Dollar");
    }

    public void test260_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "933-568-7319" + "'", str7, "933-568-7319");
    }

    public void test262_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        java.lang.String str7 = f0.domainWord();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Sudan" + "'", str1, "Sudan");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "c" + "'", str5, "c");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.rupert-wolff.com" + "'", str6, "www.rupert-wolff.com");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "harris" + "'", str7, "harris");
    }

    public void test262_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        java.lang.String str7 = f0.domainWord();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Sudan" + "'", str1, "Sudan");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "c" + "'", str5, "c");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.rupert-wolff.com" + "'", str6, "www.rupert-wolff.com");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "harris" + "'", str7, "harris");
    }

    public void test262_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str5 = f0.password(1, 1, true);
        java.lang.String str6 = f0.url();
        java.lang.String str7 = f0.domainWord();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Sudan" + "'", str1, "Sudan");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "c" + "'", str5, "c");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "www.rupert-wolff.com" + "'", str6, "www.rupert-wolff.com");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "harris" + "'", str7, "harris");
    }

    public void test262_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "harris" + "'", str7, "harris");
    }

    public void test263_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str2 = code1.ean8();
        java.lang.String str3 = code1.ean13();
        java.lang.String str5 = code1.isbn10(true);
        org.junit.Assert.assertNotNull(code1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "85764132" + "'", str2, "85764132");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7065087359895" + "'", str3, "7065087359895");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1-19-120144-9" + "'", str5, "1-19-120144-9");
    }

    public void test263_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str2 = code1.ean8();
        java.lang.String str3 = code1.ean13();
        java.lang.String str5 = code1.isbn10(true);
        org.junit.Assert.assertNotNull(code1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "85764132" + "'", str2, "85764132");
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7065087359895" + "'", str3, "7065087359895");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1-19-120144-9" + "'", str5, "1-19-120144-9");
    }

    public void test263_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1-19-120144-9" + "'", str5, "1-19-120144-9");
    }

    public void test264_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.productName();
        java.lang.String str2 = f0.firstName();
        java.lang.String str3 = f0.uuid();
        java.lang.String str4 = f0.streetAddress();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Rustic Paper Keyboard" + "'", str1, "Rustic Paper Keyboard");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Eli" + "'", str2, "Eli");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96de8a1b-7dd8-4324-966e-b9cb70891544" + "'", str3, "96de8a1b-7dd8-4324-966e-b9cb70891544");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "980 Nitzsche Knoll" + "'", str4, "980 Nitzsche Knoll");
    }

    public void test264_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.productName();
        java.lang.String str2 = f0.firstName();
        java.lang.String str3 = f0.uuid();
        java.lang.String str4 = f0.streetAddress();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Rustic Paper Keyboard" + "'", str1, "Rustic Paper Keyboard");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Eli" + "'", str2, "Eli");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96de8a1b-7dd8-4324-966e-b9cb70891544" + "'", str3, "96de8a1b-7dd8-4324-966e-b9cb70891544");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "980 Nitzsche Knoll" + "'", str4, "980 Nitzsche Knoll");
    }

    public void test264_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.productName();
        java.lang.String str2 = f0.firstName();
        java.lang.String str3 = f0.uuid();
        java.lang.String str4 = f0.streetAddress();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Rustic Paper Keyboard" + "'", str1, "Rustic Paper Keyboard");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Eli" + "'", str2, "Eli");
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96de8a1b-7dd8-4324-966e-b9cb70891544" + "'", str3, "96de8a1b-7dd8-4324-966e-b9cb70891544");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "980 Nitzsche Knoll" + "'", str4, "980 Nitzsche Knoll");
    }

    public void test264_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "980 Nitzsche Knoll" + "'", str4, "980 Nitzsche Knoll");
    }

    public void test265_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str2 = code1.isbn10();
        org.junit.Assert.assertNotNull(code1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1895210496" + "'", str2, "1895210496");
    }

    public void test266_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Moldova" + "'", str1, "Moldova");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Kolkata" + "'", str2, "Asia/Kolkata");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 324 + "'", int6 == 324);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "sxtqipitahdmj" + "'", str7, "sxtqipitahdmj");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "and Sons" + "'", str8, "and Sons");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Gorgeous Copper Pants" + "'", str9, "Gorgeous Copper Pants");
    }

    public void test266_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Kolkata" + "'", str2, "Asia/Kolkata");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 324 + "'", int6 == 324);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "sxtqipitahdmj" + "'", str7, "sxtqipitahdmj");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "and Sons" + "'", str8, "and Sons");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Gorgeous Copper Pants" + "'", str9, "Gorgeous Copper Pants");
    }

    public void test266_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 324 + "'", int6 == 324);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "sxtqipitahdmj" + "'", str7, "sxtqipitahdmj");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "and Sons" + "'", str8, "and Sons");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Gorgeous Copper Pants" + "'", str9, "Gorgeous Copper Pants");
    }

    public void test266_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "sxtqipitahdmj" + "'", str7, "sxtqipitahdmj");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "and Sons" + "'", str8, "and Sons");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Gorgeous Copper Pants" + "'", str9, "Gorgeous Copper Pants");
    }

    public void test266_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "and Sons" + "'", str8, "and Sons");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Gorgeous Copper Pants" + "'", str9, "Gorgeous Copper Pants");
    }

    public void test266_6() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Gorgeous Copper Pants" + "'", str9, "Gorgeous Copper Pants");
    }

    public void test267_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str2 = code1.ean8();
        java.lang.String str4 = code1.isbn13(true);
        org.junit.Assert.assertNotNull(code1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "96966013" + "'", str2, "96966013");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "979-0-15-065662-2" + "'", str4, "979-0-15-065662-2");
    }

    public void test267_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        java.lang.String str2 = code1.ean8();
        java.lang.String str4 = code1.isbn13(true);
        org.junit.Assert.assertNotNull(code1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "96966013" + "'", str2, "96966013");
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "979-0-15-065662-2" + "'", str4, "979-0-15-065662-2");
    }

    public void test268_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-8\260C" + "'", str4, "-8\260C");
    }

    public void test269_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Director" + "'", str4, "Director");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Executive" + "'", str5, "Executive");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Corporate Legal Producer" + "'", str6, "Corporate Legal Producer");
    }

    public void test269_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Executive" + "'", str5, "Executive");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Corporate Legal Producer" + "'", str6, "Corporate Legal Producer");
    }

    public void test269_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Corporate Legal Producer" + "'", str6, "Corporate Legal Producer");
    }

    public void test270_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + char5 + "' != '" + '9' + "'", char5 == '9');
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fO9vAyf2E6GLn0Dt1SpY6LtLa9flYr0zJAR0mYqfCeuHW5KRER847kq2vXx7YBIHsDcOinjc5zul29I93wQ62jji2j7kmAv6pib3" + "'", str9, "fO9vAyf2E6GLn0Dt1SpY6LtLa9flYr0zJAR0mYqfCeuHW5KRER847kq2vXx7YBIHsDcOinjc5zul29I93wQ62jji2j7kmAv6pib3");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7eelzdcnwupclglw5wi4roiz4i6unzfupw176nug4vmjzda73zlkzf3hf5hb5aiucxaalskkn4pwuq4l1600e6veqwx9mmo38rkekri4s3v3mrbmhhzu6qw7yhib5o1ty40omx0bjab5q72el0xkfvn0trelobh0x6h3gltzkcyh36ncsv21rwstpioo80kjgz7fq0n6vxvn5adph2recuba5ttzwblrl6v5zds2loq0jg7lfh3tu80ap6by23m" + "'", str10, "7eelzdcnwupclglw5wi4roiz4i6unzfupw176nug4vmjzda73zlkzf3hf5hb5aiucxaalskkn4pwuq4l1600e6veqwx9mmo38rkekri4s3v3mrbmhhzu6qw7yhib5o1ty40omx0bjab5q72el0xkfvn0trelobh0x6h3gltzkcyh36ncsv21rwstpioo80kjgz7fq0n6vxvn5adph2recuba5ttzwblrl6v5zds2loq0jg7lfh3tu80ap6by23m");
// flaky:         org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'o' + "'", char11 == 'o');
    }

    public void test270_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fO9vAyf2E6GLn0Dt1SpY6LtLa9flYr0zJAR0mYqfCeuHW5KRER847kq2vXx7YBIHsDcOinjc5zul29I93wQ62jji2j7kmAv6pib3" + "'", str9, "fO9vAyf2E6GLn0Dt1SpY6LtLa9flYr0zJAR0mYqfCeuHW5KRER847kq2vXx7YBIHsDcOinjc5zul29I93wQ62jji2j7kmAv6pib3");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7eelzdcnwupclglw5wi4roiz4i6unzfupw176nug4vmjzda73zlkzf3hf5hb5aiucxaalskkn4pwuq4l1600e6veqwx9mmo38rkekri4s3v3mrbmhhzu6qw7yhib5o1ty40omx0bjab5q72el0xkfvn0trelobh0x6h3gltzkcyh36ncsv21rwstpioo80kjgz7fq0n6vxvn5adph2recuba5ttzwblrl6v5zds2loq0jg7lfh3tu80ap6by23m" + "'", str10, "7eelzdcnwupclglw5wi4roiz4i6unzfupw176nug4vmjzda73zlkzf3hf5hb5aiucxaalskkn4pwuq4l1600e6veqwx9mmo38rkekri4s3v3mrbmhhzu6qw7yhib5o1ty40omx0bjab5q72el0xkfvn0trelobh0x6h3gltzkcyh36ncsv21rwstpioo80kjgz7fq0n6vxvn5adph2recuba5ttzwblrl6v5zds2loq0jg7lfh3tu80ap6by23m");
// flaky:         org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'o' + "'", char11 == 'o');
    }

    public void test270_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7eelzdcnwupclglw5wi4roiz4i6unzfupw176nug4vmjzda73zlkzf3hf5hb5aiucxaalskkn4pwuq4l1600e6veqwx9mmo38rkekri4s3v3mrbmhhzu6qw7yhib5o1ty40omx0bjab5q72el0xkfvn0trelobh0x6h3gltzkcyh36ncsv21rwstpioo80kjgz7fq0n6vxvn5adph2recuba5ttzwblrl6v5zds2loq0jg7lfh3tu80ap6by23m" + "'", str10, "7eelzdcnwupclglw5wi4roiz4i6unzfupw176nug4vmjzda73zlkzf3hf5hb5aiucxaalskkn4pwuq4l1600e6veqwx9mmo38rkekri4s3v3mrbmhhzu6qw7yhib5o1ty40omx0bjab5q72el0xkfvn0trelobh0x6h3gltzkcyh36ncsv21rwstpioo80kjgz7fq0n6vxvn5adph2recuba5ttzwblrl6v5zds2loq0jg7lfh3tu80ap6by23m");
// flaky:         org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'o' + "'", char11 == 'o');
    }

    public void test270_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'o' + "'", char11 == 'o');
    }

    public void test271_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cremin" + "'", str3, "cremin");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "78.134.36.58/18" + "'", str4, "78.134.36.58/18");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "21a0:14e3:0541:6ca1:5ddf:16b5:9510:fb59/68" + "'", str5, "21a0:14e3:0541:6ca1:5ddf:16b5:9510:fb59/68");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4179:c920:001a:138e:9be7:8e7e:6261:0ea1/125" + "'", str6, "4179:c920:001a:138e:9be7:8e7e:6261:0ea1/125");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "979-0-15-065662-2:96:b3:ec:64:bb" + "'", str8, "979-0-15-065662-2:96:b3:ec:64:bb");
    }

    public void test271_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "78.134.36.58/18" + "'", str4, "78.134.36.58/18");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "21a0:14e3:0541:6ca1:5ddf:16b5:9510:fb59/68" + "'", str5, "21a0:14e3:0541:6ca1:5ddf:16b5:9510:fb59/68");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4179:c920:001a:138e:9be7:8e7e:6261:0ea1/125" + "'", str6, "4179:c920:001a:138e:9be7:8e7e:6261:0ea1/125");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "979-0-15-065662-2:96:b3:ec:64:bb" + "'", str8, "979-0-15-065662-2:96:b3:ec:64:bb");
    }

    public void test271_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "21a0:14e3:0541:6ca1:5ddf:16b5:9510:fb59/68" + "'", str5, "21a0:14e3:0541:6ca1:5ddf:16b5:9510:fb59/68");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4179:c920:001a:138e:9be7:8e7e:6261:0ea1/125" + "'", str6, "4179:c920:001a:138e:9be7:8e7e:6261:0ea1/125");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "979-0-15-065662-2:96:b3:ec:64:bb" + "'", str8, "979-0-15-065662-2:96:b3:ec:64:bb");
    }

    public void test271_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4179:c920:001a:138e:9be7:8e7e:6261:0ea1/125" + "'", str6, "4179:c920:001a:138e:9be7:8e7e:6261:0ea1/125");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "979-0-15-065662-2:96:b3:ec:64:bb" + "'", str8, "979-0-15-065662-2:96:b3:ec:64:bb");
    }

    public void test271_5() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "979-0-15-065662-2:96:b3:ec:64:bb" + "'", str8, "979-0-15-065662-2:96:b3:ec:64:bb");
    }

    public void test272_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.apifortress.apiffaker.Util util1 = new com.apifortress.apiffaker.Util("590427-1763");
        java.lang.Object obj3 = util1.newNode("New Zealand Dollar");
        java.lang.Object obj4 = util1.newNode();
        org.junit.Assert.assertNotNull(obj3);
         org.junit.Assert.assertEquals(obj3.toString(), "[countryCodeSL_0, ${countryCodeSL}

    public void test273_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.fullAddress();
        java.lang.String str4 = f0.zipCode();
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Republic of Korea" + "'", str1, "Republic of Korea");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Irkutsk" + "'", str2, "Asia/Irkutsk");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "692 Blaine Mews, North Terriechester, WI 83162" + "'", str3, "692 Blaine Mews, North Terriechester, WI 83162");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "91417-0249" + "'", str4, "91417-0249");
    }

    public void test273_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.fullAddress();
        java.lang.String str4 = f0.zipCode();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Republic of Korea" + "'", str1, "Republic of Korea");
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Irkutsk" + "'", str2, "Asia/Irkutsk");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "692 Blaine Mews, North Terriechester, WI 83162" + "'", str3, "692 Blaine Mews, North Terriechester, WI 83162");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "91417-0249" + "'", str4, "91417-0249");
    }

    public void test273_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.apifortress.apiffaker.F f0 = new com.apifortress.apiffaker.F();
        java.lang.String str1 = f0.country();
        java.lang.String str2 = f0.timeZone();
        java.lang.String str3 = f0.fullAddress();
        java.lang.String str4 = f0.zipCode();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Republic of Korea" + "'", str1, "Republic of Korea");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asia/Irkutsk" + "'", str2, "Asia/Irkutsk");
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "692 Blaine Mews, North Terriechester, WI 83162" + "'", str3, "692 Blaine Mews, North Terriechester, WI 83162");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "91417-0249" + "'", str4, "91417-0249");
    }

    public void test273_4() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "91417-0249" + "'", str4, "91417-0249");
    }

    public void test274_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net" + "'", str4, "net");
        org.junit.Assert.assertTrue("'" + userAgent5 + "' != '" + com.github.javafaker.Internet.UserAgent.FIREFOX + "'", userAgent5.equals(com.github.javafaker.Internet.UserAgent.FIREFOX));
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:54.0) Gecko/20100101 Firefox/54.0" + "'", str6, "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:54.0) Gecko/20100101 Firefox/54.0");
    }

    public void test274_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:54.0) Gecko/20100101 Firefox/54.0" + "'", str6, "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:54.0) Gecko/20100101 Firefox/54.0");
    }

    public void test275_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Code code1 = faker0.code();
        com.github.javafaker.Pokemon pokemon2 = faker0.pokemon();
        java.lang.String str3 = pokemon2.name();
        org.junit.Assert.assertNotNull(code1);
        org.junit.Assert.assertNotNull(pokemon2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Flareon" + "'", str3, "Flareon");
    }

    public void test276_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.2d + "'", double8 == 52.2d);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 26537950L + "'", long9 == 26537950L);
    }

    public void test276_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 26537950L + "'", long9 == 26537950L);
    }

    public void test277_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Loti" + "'", str6, "Loti");
    }

    public void test278_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Europe/London" + "'", str3, "Europe/London");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MD" + "'", str4, "MD");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76.933627" + "'", str5, "76.933627");
    }

    public void test278_2() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MD" + "'", str4, "MD");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76.933627" + "'", str5, "76.933627");
    }

    public void test278_3() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76.933627" + "'", str5, "76.933627");
    }

    public void test280_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Small Wooden Table" + "'", str5, "Small Wooden Table");
    }

    public void test281_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coco" + "'", str5, "Coco");
    }

    public void test282_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Expose Weakness" + "'", str5, "Expose Weakness");
    }

    public void test283_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.Dog dog2 = faker1.dog();
        java.lang.String str3 = dog2.memePhrase();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(dog2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "big ol' pupper" + "'", str3, "big ol' pupper");
    }
}