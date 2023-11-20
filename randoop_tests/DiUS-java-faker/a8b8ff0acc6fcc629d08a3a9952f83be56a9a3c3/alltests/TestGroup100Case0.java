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
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.JCB;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.JCB + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.JCB));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        com.github.javafaker.Dune.Quote quote0 = com.github.javafaker.Dune.Quote.PARDOT_KYNES;
        org.junit.Assert.assertTrue("'" + quote0 + "' != '" + com.github.javafaker.Dune.Quote.PARDOT_KYNES + "'", quote0.equals(com.github.javafaker.Dune.Quote.PARDOT_KYNES));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.github.javafaker.Dune.Quote quote0 = com.github.javafaker.Dune.Quote.GUILD_NAIVGATOR;
        org.junit.Assert.assertTrue("'" + quote0 + "' != '" + com.github.javafaker.Dune.Quote.GUILD_NAIVGATOR + "'", quote0.equals(com.github.javafaker.Dune.Quote.GUILD_NAIVGATOR));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.github.javafaker.idnumbers.SvSEIdNumber svSEIdNumber0 = new com.github.javafaker.idnumbers.SvSEIdNumber();
        com.github.javafaker.Faker faker1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = svSEIdNumber0.getValidSsn(faker1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.github.javafaker.Faker faker0 = null;
        com.github.javafaker.ProgrammingLanguage programmingLanguage1 = new com.github.javafaker.ProgrammingLanguage(faker0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = programmingLanguage1.creator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.github.javafaker.Dune.Quote quote0 = com.github.javafaker.Dune.Quote.YUEH;
        org.junit.Assert.assertTrue("'" + quote0 + "' != '" + com.github.javafaker.Dune.Quote.YUEH + "'", quote0.equals(com.github.javafaker.Dune.Quote.YUEH));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.github.javafaker.Dune.Saying saying0 = com.github.javafaker.Dune.Saying.ORANGE_CATHOLIC_BIBLE;
        org.junit.Assert.assertTrue("'" + saying0 + "' != '" + com.github.javafaker.Dune.Saying.ORANGE_CATHOLIC_BIBLE + "'", saying0.equals(com.github.javafaker.Dune.Saying.ORANGE_CATHOLIC_BIBLE));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.SOLO;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.SOLO + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.SOLO));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.github.javafaker.Dune.Saying saying0 = com.github.javafaker.Dune.Saying.BENE_GESSERIT;
        org.junit.Assert.assertTrue("'" + saying0 + "' != '" + com.github.javafaker.Dune.Saying.BENE_GESSERIT + "'", saying0.equals(com.github.javafaker.Dune.Saying.BENE_GESSERIT));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.github.javafaker.Dune.Quote quote0 = com.github.javafaker.Dune.Quote.LETO;
        org.junit.Assert.assertTrue("'" + quote0 + "' != '" + com.github.javafaker.Dune.Quote.LETO + "'", quote0.equals(com.github.javafaker.Dune.Quote.LETO));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.github.javafaker.Dune.Quote quote0 = com.github.javafaker.Dune.Quote.IRULAN;
        org.junit.Assert.assertTrue("'" + quote0 + "' != '" + com.github.javafaker.Dune.Quote.IRULAN + "'", quote0.equals(com.github.javafaker.Dune.Quote.IRULAN));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.github.javafaker.Dune.Quote quote0 = com.github.javafaker.Dune.Quote.STILGAR;
        org.junit.Assert.assertTrue("'" + quote0 + "' != '" + com.github.javafaker.Dune.Quote.STILGAR + "'", quote0.equals(com.github.javafaker.Dune.Quote.STILGAR));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.util.Locale locale0 = null;
        com.github.javafaker.service.RandomService randomService1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0, randomService1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: locale is required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.github.javafaker.Dune.Saying saying0 = com.github.javafaker.Dune.Saying.MUADDIB;
        org.junit.Assert.assertTrue("'" + saying0 + "' != '" + com.github.javafaker.Dune.Saying.MUADDIB + "'", saying0.equals(com.github.javafaker.Dune.Saying.MUADDIB));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String str1 = com.github.javafaker.service.FakerIDN.toASCII("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.github.javafaker.Faker faker0 = null;
        com.github.javafaker.ProgrammingLanguage programmingLanguage1 = new com.github.javafaker.ProgrammingLanguage(faker0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = programmingLanguage1.name();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.DANKORT;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.DANKORT + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.DANKORT));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.github.javafaker.Dune.Quote quote0 = com.github.javafaker.Dune.Quote.MOHIAM;
        org.junit.Assert.assertTrue("'" + quote0 + "' != '" + com.github.javafaker.Dune.Quote.MOHIAM + "'", quote0.equals(com.github.javafaker.Dune.Quote.MOHIAM));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.brand();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Fujifilm" + "'", str3, "Fujifilm");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.CHROME;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.CHROME + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.CHROME));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.SWITCH;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.SWITCH + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.SWITCH));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        java.lang.String str4 = book3.publisher();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Target Books" + "'", str4, "Target Books");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        java.lang.String str4 = food3.sushi();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Small amberjack" + "'", str4, "Small amberjack");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        java.lang.String str3 = randomService1.hex((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.github.javafaker.Faker faker0 = null;
        com.github.javafaker.Barcode barcode1 = new com.github.javafaker.Barcode(faker0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = barcode1.data();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.github.javafaker.Dune.Saying saying0 = com.github.javafaker.Dune.Saying.FREMEN;
        java.lang.Class<?> wildcardClass1 = saying0.getClass();
        org.junit.Assert.assertTrue("'" + saying0 + "' != '" + com.github.javafaker.Dune.Saying.FREMEN + "'", saying0.equals(com.github.javafaker.Dune.Saying.FREMEN));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.VISA;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.VISA + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.VISA));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Basketball basketball5 = faker1.basketball();
        com.github.javafaker.University university6 = faker1.university();
        java.lang.String str7 = university6.prefix();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(basketball5);
        org.junit.Assert.assertNotNull(university6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Eastern" + "'", str7, "Eastern");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.github.javafaker.service.RandomService randomService0 = new com.github.javafaker.service.RandomService();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Basketball basketball5 = faker1.basketball();
        java.lang.String str6 = basketball5.positions();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(basketball5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Center" + "'", str6, "Center");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        java.lang.String str7 = bojackHorseman6.characters();
        java.lang.String str8 = bojackHorseman6.quotes();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mr Peanutbutter" + "'", str7, "Mr Peanutbutter");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Spaghetti or not, here I come" + "'", str8, "Spaghetti or not, here I come");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        java.lang.String str4 = slackEmoji3.foodAndDrink();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":banana:" + "'", str4, ":banana:");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.MASTERCARD;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.MASTERCARD + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.MASTERCARD));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.Cat cat4 = faker1.cat();
        java.lang.String str5 = cat4.registry();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(cat4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cat Aficionado Association" + "'", str5, "Cat Aficionado Association");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker1.resolve("Japanese style-chunky omelette");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Japanese style-chunky omelette resulted in null expression");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(avatar2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Gender gender5 = faker1.gender();
        com.github.javafaker.ChuckNorris chuckNorris6 = faker1.chuckNorris();
        com.github.javafaker.Hacker hacker7 = faker1.hacker();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(chuckNorris6);
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        java.lang.String str7 = bojackHorseman6.tongueTwisters();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Courtney Portnoy portrayed the formerly portly consort in the seaport resort" + "'", str7, "Courtney Portnoy portrayed the formerly portly consort in the seaport resort");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        java.lang.String str5 = hacker4.ingverb();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "overriding" + "'", str5, "overriding");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.ChuckNorris chuckNorris8 = faker1.chuckNorris();
        java.lang.String str9 = chuckNorris8.fact();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(chuckNorris8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "When a bug sees Chuck Norris, it flees screaming in terror, and then immediately self-destructs to avoid being roundhouse-kicked." + "'", str9, "When a bug sees Chuck Norris, it flees screaming in terror, and then immediately self-destructs to avoid being roundhouse-kicked.");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.github.javafaker.Dune.Quote quote0 = com.github.javafaker.Dune.Quote.DUNCAN;
        org.junit.Assert.assertTrue("'" + quote0 + "' != '" + com.github.javafaker.Dune.Quote.DUNCAN + "'", quote0.equals(com.github.javafaker.Dune.Quote.DUNCAN));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Hacker hacker5 = faker1.hacker();
        java.lang.String str7 = faker1.letterify("Mr Peanutbutter");
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mr Peanutbutter" + "'", str7, "Mr Peanutbutter");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.github.javafaker.Dune.Quote quote0 = com.github.javafaker.Dune.Quote.GURNEY;
        org.junit.Assert.assertTrue("'" + quote0 + "' != '" + com.github.javafaker.Dune.Quote.GURNEY + "'", quote0.equals(com.github.javafaker.Dune.Quote.GURNEY));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str7 = code5.gtin8();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9780357202050" + "'", str6, "9780357202050");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "22426369" + "'", str7, "22426369");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.Ancient ancient8 = faker1.ancient();
        java.lang.String str9 = ancient8.god();
        java.lang.String str10 = ancient8.primordial();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Aphrodite" + "'", str9, "Aphrodite");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ourea" + "'", str10, "Ourea");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Hacker hacker5 = faker1.hacker();
        java.lang.String str6 = hacker5.abbreviation();
        java.lang.String str7 = hacker5.adjective();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "USB" + "'", str6, "USB");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "back-end" + "'", str7, "back-end");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str7 = code5.asin();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9791898871766" + "'", str6, "9791898871766");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "B0002TJ4JM" + "'", str7, "B0002TJ4JM");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.Educator educator7 = faker1.educator();
        java.lang.String str8 = educator7.secondarySchool();
        java.lang.String str9 = educator7.secondarySchool();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(educator7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Icelyn Secondary College" + "'", str8, "Icelyn Secondary College");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Mallowpond High School" + "'", str9, "Mallowpond High School");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Barcode barcode6 = faker1.barcode();
        com.github.javafaker.Dog dog7 = faker1.dog();
        java.lang.String str8 = dog7.gender();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(barcode6);
        org.junit.Assert.assertNotNull(dog7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "male" + "'", str8, "male");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.SlackEmoji slackEmoji2 = faker1.slackEmoji();
        java.lang.String str3 = slackEmoji2.celebration();
        java.lang.String str4 = slackEmoji2.emoji();
        org.junit.Assert.assertNotNull(slackEmoji2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gift_heart:" + "'", str3, ":gift_heart:");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":ring:" + "'", str4, ":ring:");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        long long3 = randomService1.nextLong((long) 'a');
        java.lang.String str5 = randomService1.hex((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int8 = randomService1.nextInt(42598, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F3A67DA8B8" + "'", str5, "F3A67DA8B8");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.Cat cat4 = faker1.cat();
        java.lang.String str6 = faker1.regexify("Forktail");
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(cat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Forktail" + "'", str6, "Forktail");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DragonBall dragonBall2 = faker1.dragonBall();
        java.lang.String str5 = faker1.bothify("9780357202050", true);
        org.junit.Assert.assertNotNull(dragonBall2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9780357202050" + "'", str5, "9780357202050");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        java.lang.String str4 = food3.measurement();
        java.lang.String str5 = food3.fruit();
        java.lang.String str6 = food3.dish();
        java.lang.String str7 = food3.dish();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/4 quart" + "'", str4, "1/4 quart");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lychees" + "'", str5, "Lychees");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pasta Carbonara" + "'", str6, "Pasta Carbonara");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Sushi" + "'", str7, "Sushi");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Lebowski lebowski4 = new com.github.javafaker.Lebowski(faker1);
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Team team5 = faker1.team();
        java.lang.String str6 = team5.state();
        java.lang.String str7 = team5.sport();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(team5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Wyoming" + "'", str6, "Wyoming");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "football" + "'", str7, "football");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.camera();
        java.lang.String str4 = photography2.shutter();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nikon F-401" + "'", str3, "Nikon F-401");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32000" + "'", str4, "32000");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Music music2 = faker1.music();
        java.lang.String str3 = music2.genre();
        org.junit.Assert.assertNotNull(music2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "World" + "'", str3, "World");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.provisionalResponseCode();
        byte[] byteArray6 = sip4.bodyBytes();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 199 + "'", int5 == 199);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[118, 61, 48, 10, 111, 61, 82, 101, 102, 117, 103, 105, 111, 32, 52, 55, 49, 99, 48, 49, 97, 52, 45, 56, 100, 50, 49, 45, 52, 97, 53, 101, 45, 97, 97, 57, 100, 45, 99, 102, 55, 57, 54, 48, 56, 55, 101, 49, 49, 48, 32, 73, 78, 32, 73, 80, 52, 32, 112, 97, 103, 97, 99, 46, 111, 114, 103, 10, 115, 61, 45, 10, 99, 61, 73, 78, 32, 73, 80, 52, 32, 49, 49, 46, 49, 48, 51, 46, 56, 53, 46, 49, 48, 55, 10, 116, 61, 48, 32, 48, 10, 109, 61, 97, 117, 100, 105, 111, 32, 52, 50, 56, 51, 54, 32, 82, 84, 80, 47, 65, 86, 80, 32, 48, 10, 97, 61, 114, 116, 112, 109, 97, 112, 58, 48, 32, 80, 67, 77, 85, 47, 56, 48, 48, 48]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.github.javafaker.Dune.Quote quote0 = com.github.javafaker.Dune.Quote.LIET_KYNES;
        org.junit.Assert.assertTrue("'" + quote0 + "' != '" + com.github.javafaker.Dune.Quote.LIET_KYNES + "'", quote0.equals(com.github.javafaker.Dune.Quote.LIET_KYNES));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.GameOfThrones gameOfThrones7 = faker1.gameOfThrones();
        java.lang.String str8 = gameOfThrones7.dragon();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(gameOfThrones7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Valryon" + "'", str8, "Valryon");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.FORBRUGSFORENINGEN;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.FORBRUGSFORENINGEN + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.FORBRUGSFORENINGEN));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        com.github.javafaker.Dog dog4 = faker1.dog();
        java.lang.String str5 = dog4.size();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(dog4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "extra large" + "'", str5, "extra large");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Team team5 = faker1.team();
        com.github.javafaker.Coin coin6 = faker1.coin();
        java.lang.String str7 = coin6.flip();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(team5);
        org.junit.Assert.assertNotNull(coin6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Tails" + "'", str7, "Tails");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Photography photography6 = faker1.photography();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(photography6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Medical medical4 = faker1.medical();
        java.lang.String str5 = medical4.medicineName();
        java.lang.String str6 = medical4.medicineName();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(medical4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OCTINOXATE" + "'", str5, "OCTINOXATE");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CELECOXIB" + "'", str6, "CELECOXIB");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Job job4 = faker1.job();
        java.lang.String str5 = job4.title();
        java.lang.String str6 = job4.field();
        java.lang.String str7 = job4.title();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(job4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief IT Liaison" + "'", str5, "Chief IT Liaison");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Marketing" + "'", str6, "Marketing");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Direct Mining Technician" + "'", str7, "Direct Mining Technician");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.util.Locale locale0 = null;
        java.util.Random random1 = null;
        com.github.javafaker.service.RandomService randomService2 = new com.github.javafaker.service.RandomService(random1);
        long long4 = randomService2.nextLong((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale0, randomService2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: locale is required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 62L + "'", long4 == 62L);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DragonBall dragonBall2 = faker1.dragonBall();
        com.github.javafaker.Dune dune3 = faker1.dune();
        com.github.javafaker.Dune.Saying saying4 = com.github.javafaker.Dune.Saying.MENTAT;
        java.lang.String str5 = dune3.saying(saying4);
        java.lang.String str6 = dune3.quote();
        java.lang.String str7 = dune3.planet();
        org.junit.Assert.assertNotNull(dragonBall2);
        org.junit.Assert.assertNotNull(dune3);
        org.junit.Assert.assertTrue("'" + saying4 + "' != '" + com.github.javafaker.Dune.Saying.MENTAT + "'", saying4.equals(com.github.javafaker.Dune.Saying.MENTAT));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A process cannot be understood by stopping it. Understanding must move with the flow of the process, must join it and flow with it." + "'", str5, "A process cannot be understood by stopping it. Understanding must move with the flow of the process, must join it and flow with it.");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2014 no matter the mood! Mood's a thing for cattle or making love or playing the baliset. It's not for fighting." + "'", str6, "\u2014 no matter the mood! Mood's a thing for cattle or making love or playing the baliset. It's not for fighting.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Kaitain" + "'", str7, "Kaitain");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.File file8 = faker1.file();
        java.lang.String str9 = file8.extension();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(file8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "jpeg" + "'", str9, "jpeg");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        long long3 = randomService1.nextLong((long) 'a');
        java.lang.String str5 = randomService1.hex((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = randomService1.nextLong((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 86L + "'", long3 == 86L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "01962844B4" + "'", str5, "01962844B4");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.Ancient ancient8 = faker1.ancient();
        java.lang.String str9 = ancient8.hero();
        java.lang.String str10 = ancient8.primordial();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Semele" + "'", str9, "Semele");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Phanes" + "'", str10, "Phanes");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        com.github.javafaker.Dog dog4 = faker1.dog();
        com.github.javafaker.Team team5 = faker1.team();
        java.lang.String str6 = team5.sport();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(dog4);
        org.junit.Assert.assertNotNull(team5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "sumo" + "'", str6, "sumo");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.SlackEmoji slackEmoji2 = faker1.slackEmoji();
        java.lang.String str3 = slackEmoji2.activity();
        java.lang.String str4 = slackEmoji2.emoji();
        org.junit.Assert.assertNotNull(slackEmoji2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":bath:" + "'", str3, ":bath:");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":sunny:" + "'", str4, ":sunny:");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        java.lang.String str5 = faker1.numerify("Grandson");
        com.github.javafaker.Mountain mountain6 = faker1.mountain();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Grandson" + "'", str5, "Grandson");
        org.junit.Assert.assertNotNull(mountain6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Superhero superhero6 = faker1.superhero();
        java.lang.String str7 = superhero6.prefix();
        java.lang.String str8 = superhero6.name();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(superhero6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Green" + "'", str7, "Green");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Riddler Eyes" + "'", str8, "Riddler Eyes");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str7 = code5.ean8();
        java.lang.String str8 = code5.isbnGroup();
        java.lang.String str9 = code5.isbnRegistrant();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9780521030465" + "'", str6, "9780521030465");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "43633111" + "'", str7, "43633111");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "427-35307" + "'", str9, "427-35307");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Basketball basketball5 = faker1.basketball();
        com.github.javafaker.University university6 = faker1.university();
        java.lang.String str7 = university6.name();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(basketball5);
        org.junit.Assert.assertNotNull(university6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "East Heidenreich" + "'", str7, "East Heidenreich");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        java.lang.String str5 = medical4.symptoms();
        java.lang.String str6 = medical4.medicineName();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Double vision (Diplopia)" + "'", str5, "Double vision (Diplopia)");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HYOSCYAMINE SULFATE" + "'", str6, "HYOSCYAMINE SULFATE");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        com.github.javafaker.Hobbit hobbit4 = faker1.hobbit();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(hobbit4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.FIREFOX;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.FIREFOX + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.FIREFOX));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        java.lang.String str8 = faker1.expression("Small amberjack");
        com.github.javafaker.Barcode barcode9 = faker1.barcode();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Small amberjack" + "'", str8, "Small amberjack");
        org.junit.Assert.assertNotNull(barcode9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.DISCOVER;
        java.lang.Class<?> wildcardClass1 = creditCardType0.getClass();
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.DISCOVER + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.DISCOVER));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.aperture();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "f/0.95" + "'", str3, "f/0.95");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.GameOfThrones gameOfThrones7 = faker1.gameOfThrones();
        com.github.javafaker.Educator educator8 = faker1.educator();
        java.lang.String str9 = educator8.university();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(gameOfThrones7);
        org.junit.Assert.assertNotNull(educator8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Icelyn College" + "'", str9, "Icelyn College");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        com.github.javafaker.Lebowski lebowski4 = faker1.lebowski();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(lebowski4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Hacker hacker5 = faker1.hacker();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        com.github.javafaker.Lebowski lebowski7 = faker1.lebowski();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lebowski7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Hacker hacker5 = faker1.hacker();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        com.github.javafaker.Coin coin7 = faker1.coin();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(coin7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Color color3 = faker1.color();
        com.github.javafaker.Code code4 = faker1.code();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.rtpPort();
        int int6 = sip4.rtpPort();
        int int7 = sip4.serverErrorResponseCode();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 40836 + "'", int5 == 40836);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46134 + "'", int6 == 46134);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 580 + "'", int7 == 580);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        java.lang.String str4 = food3.dish();
        java.lang.String str5 = food3.sushi();
        java.lang.String str6 = food3.sushi();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pierogi" + "'", str4, "Pierogi");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Japanese horse mackerel" + "'", str5, "Japanese horse mackerel");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Alaskan pink shrimp" + "'", str6, "Alaskan pink shrimp");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.AOL;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.AOL + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.AOL));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Job job4 = faker1.job();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Sip sip6 = faker1.sip();
        java.lang.String str7 = sip6.clientErrorResponsePhrase();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(job4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(sip6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Forbidden" + "'", str7, "Forbidden");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        java.lang.String str5 = hacker4.verb();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "copy" + "'", str5, "copy");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.Ancient ancient8 = faker1.ancient();
        com.github.javafaker.Friends friends9 = faker1.friends();
        com.github.javafaker.Hipster hipster10 = faker1.hipster();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
        org.junit.Assert.assertNotNull(friends9);
        org.junit.Assert.assertNotNull(hipster10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Basketball basketball5 = faker1.basketball();
        com.github.javafaker.University university6 = faker1.university();
        com.github.javafaker.Relationships relationships7 = faker1.relationships();
        java.lang.String str8 = relationships7.direct();
        java.lang.String str9 = relationships7.direct();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(basketball5);
        org.junit.Assert.assertNotNull(university6);
        org.junit.Assert.assertNotNull(relationships7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Father" + "'", str8, "Father");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Father" + "'", str9, "Father");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        java.lang.String str5 = medical4.symptoms();
        java.lang.String str6 = medical4.hospitalName();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dizziness" + "'", str5, "Dizziness");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "KATE DISHMAN REHABILITATION HOSPITAL" + "'", str6, "KATE DISHMAN REHABILITATION HOSPITAL");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        java.lang.String str6 = pokemon5.location();
        java.lang.String str7 = pokemon5.name();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dendemille Town" + "'", str6, "Dendemille Town");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Tentacool" + "'", str7, "Tentacool");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.camera();
        java.lang.String str4 = photography2.lens();
        java.lang.String str5 = photography2.iso();
        java.lang.String str6 = photography2.term();
        java.lang.String str7 = photography2.iso();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pentax K-5" + "'", str3, "Pentax K-5");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "135mm/4" + "'", str4, "135mm/4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "25600" + "'", str5, "25600");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "shutter" + "'", str6, "shutter");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3200" + "'", str7, "3200");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.github.javafaker.CreditCardType creditCardType0 = com.github.javafaker.CreditCardType.AMERICAN_EXPRESS;
        org.junit.Assert.assertTrue("'" + creditCardType0 + "' != '" + com.github.javafaker.CreditCardType.AMERICAN_EXPRESS + "'", creditCardType0.equals(com.github.javafaker.CreditCardType.AMERICAN_EXPRESS));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Superhero superhero6 = faker1.superhero();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        java.lang.String str8 = demographic7.maritalStatus();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(superhero6);
        org.junit.Assert.assertNotNull(demographic7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Married" + "'", str8, "Married");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.util.Locale locale0 = null;
        java.util.Random random1 = null;
        com.github.javafaker.service.RandomService randomService2 = new com.github.javafaker.service.RandomService(random1);
        long long3 = randomService2.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0, randomService2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: locale is required");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2823922512655180983L + "'", long3 == 2823922512655180983L);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        java.lang.String str7 = englandFootBall6.league();
        java.lang.String str8 = englandFootBall6.team();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EFLLeaguetwo" + "'", str7, "EFLLeaguetwo");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PortsmouthF.C." + "'", str8, "PortsmouthF.C.");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.github.javafaker.idnumbers.SvSEIdNumber svSEIdNumber0 = new com.github.javafaker.idnumbers.SvSEIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Photography photography3 = faker2.photography();
        com.github.javafaker.Food food4 = faker2.food();
        com.github.javafaker.Job job5 = faker2.job();
        java.lang.String str6 = svSEIdNumber0.getValidSsn(faker2);
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Photography photography9 = faker8.photography();
        com.github.javafaker.IdNumber idNumber10 = faker8.idNumber();
        com.github.javafaker.App app11 = faker8.app();
        java.lang.String str12 = svSEIdNumber0.getValidSsn(faker8);
        org.junit.Assert.assertNotNull(photography3);
        org.junit.Assert.assertNotNull(food4);
        org.junit.Assert.assertNotNull(job5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "830212+9179" + "'", str6, "830212+9179");
        org.junit.Assert.assertNotNull(photography9);
        org.junit.Assert.assertNotNull(idNumber10);
        org.junit.Assert.assertNotNull(app11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "350619+3477" + "'", str12, "350619+3477");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.INTERNET_EXPLORER;
        java.lang.String str1 = userAgent0.toString();
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.INTERNET_EXPLORER + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.INTERNET_EXPLORER));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "internet_explorer" + "'", str1, "internet_explorer");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str7 = code5.ean8();
        java.lang.String str8 = code5.isbnGroup();
        java.lang.String str9 = code5.ean8();
        java.lang.String str11 = code5.isbn10(false);
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9780041882162" + "'", str6, "9780041882162");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "82908546" + "'", str7, "82908546");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "24713221" + "'", str9, "24713221");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0046063994" + "'", str11, "0046063994");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        java.lang.String str6 = pokemon5.location();
        java.lang.String str7 = pokemon5.location();
        java.lang.String str8 = pokemon5.location();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Kiloude City" + "'", str6, "Kiloude City");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Four Island" + "'", str7, "Four Island");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Petalburg City" + "'", str8, "Petalburg City");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.github.javafaker.Dune.Quote quote0 = com.github.javafaker.Dune.Quote.PAUL;
        org.junit.Assert.assertTrue("'" + quote0 + "' != '" + com.github.javafaker.Dune.Quote.PAUL + "'", quote0.equals(com.github.javafaker.Dune.Quote.PAUL));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.github.javafaker.Dune.Quote quote0 = com.github.javafaker.Dune.Quote.PITER;
        org.junit.Assert.assertTrue("'" + quote0 + "' != '" + com.github.javafaker.Dune.Quote.PITER + "'", quote0.equals(com.github.javafaker.Dune.Quote.PITER));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str7 = code5.ean8();
        java.lang.String str8 = code5.isbnGroup();
        java.lang.String str9 = code5.gtin8();
        java.lang.String str10 = code5.isbn13();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781002480205" + "'", str6, "9781002480205");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "71882499" + "'", str7, "71882499");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "94612608" + "'", str9, "94612608");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9790006186280" + "'", str10, "9790006186280");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Hacker hacker5 = faker1.hacker();
        com.github.javafaker.Hacker hacker6 = faker1.hacker();
        com.github.javafaker.DragonBall dragonBall7 = faker1.dragonBall();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertNotNull(dragonBall7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.camera();
        java.lang.String str4 = photography2.camera();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Canon EOS-1D" + "'", str3, "Canon EOS-1D");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Sony DSLR-A350" + "'", str4, "Sony DSLR-A350");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.GameOfThrones gameOfThrones7 = faker1.gameOfThrones();
        com.github.javafaker.Educator educator8 = faker1.educator();
        java.lang.String str9 = educator8.campus();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(gameOfThrones7);
        org.junit.Assert.assertNotNull(educator8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lakeacre Campus" + "'", str9, "Lakeacre Campus");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        java.lang.String str4 = idNumber3.invalidSvSeSsn();
        java.lang.String str5 = idNumber3.valid();
        java.lang.String str6 = idNumber3.validSvSeSsn();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "462780-9595" + "'", str4, "462780-9595");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "657-14-8066" + "'", str5, "657-14-8066");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "990603+2082" + "'", str6, "990603+2082");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.camera();
        java.lang.String str4 = photography2.lens();
        java.lang.String str5 = photography2.iso();
        java.lang.String str6 = photography2.term();
        java.lang.String str7 = photography2.lens();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u03b1390" + "'", str3, "\u03b1390");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "wide-angle" + "'", str4, "wide-angle");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1000" + "'", str5, "1000");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35mm" + "'", str6, "35mm");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "17mm/2.0" + "'", str7, "17mm/2.0");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.AquaTeenHungerForce aquaTeenHungerForce4 = faker1.aquaTeenHungerForce();
        java.lang.String str5 = aquaTeenHungerForce4.character();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(aquaTeenHungerForce4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Frylock" + "'", str5, "Frylock");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.Cat cat4 = faker1.cat();
        com.github.javafaker.Educator educator5 = faker1.educator();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(cat4);
        org.junit.Assert.assertNotNull(educator5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str8 = code5.isbn10(true);
        java.lang.String str9 = code5.isbn10();
        java.lang.String str11 = code5.isbn13(true);
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781833276848" + "'", str6, "9781833276848");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1-09-674017-6" + "'", str8, "1-09-674017-6");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1819963039" + "'", str9, "1819963039");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "979-0-9909838-5-8" + "'", str11, "979-0-9909838-5-8");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        java.lang.String str5 = app4.name();
        java.lang.String str6 = app4.version();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cardify" + "'", str5, "Cardify");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.85" + "'", str6, "0.85");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Buffy buffy4 = faker1.buffy();
        java.lang.String str5 = buffy4.bigBads();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(buffy4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "The First Evil" + "'", str5, "The First Evil");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.camera();
        java.lang.String str4 = photography2.lens();
        java.lang.String str5 = photography2.iso();
        java.lang.String str6 = photography2.brand();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LOMO-135M" + "'", str3, "LOMO-135M");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "50mm/1.2" + "'", str4, "50mm/1.2");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "64" + "'", str5, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Canon" + "'", str6, "Canon");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DragonBall dragonBall2 = faker1.dragonBall();
        java.lang.String str3 = dragonBall2.character();
        java.lang.String str4 = dragonBall2.character();
        org.junit.Assert.assertNotNull(dragonBall2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "King Kai" + "'", str3, "King Kai");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Future Trunks" + "'", str4, "Future Trunks");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.Ancient ancient8 = faker1.ancient();
        java.lang.String str9 = ancient8.god();
        java.lang.String str10 = ancient8.hero();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ares" + "'", str9, "Ares");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Aeneas" + "'", str10, "Aeneas");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Basketball basketball5 = faker1.basketball();
        com.github.javafaker.University university6 = faker1.university();
        com.github.javafaker.Relationships relationships7 = faker1.relationships();
        java.lang.String str8 = relationships7.direct();
        java.lang.String str9 = relationships7.any();
        java.lang.String str10 = relationships7.direct();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(basketball5);
        org.junit.Assert.assertNotNull(university6);
        org.junit.Assert.assertNotNull(relationships7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Father" + "'", str8, "Father");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Brother-in-law" + "'", str9, "Brother-in-law");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Sister" + "'", str10, "Sister");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.File file8 = faker1.file();
        java.lang.String str13 = file8.fileName("Brother", ":banana:", "Mr Peanutbutter", "Nail");
        java.lang.String str14 = file8.extension();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "BrotherNail:banana:.Mr Peanutbutter" + "'", str13, "BrotherNail:banana:.Mr Peanutbutter");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ppt" + "'", str14, "ppt");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Options options4 = faker1.options();
        java.lang.String[] strArray8 = new java.lang.String[] { "657-14-8066", "Canon PowerShot G", "OCTINOXATE" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.lang.String str11 = options4.nextElement((java.util.List<java.lang.String>) strList9);
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Canon PowerShot G" + "'", str11, "Canon PowerShot G");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Barcode barcode6 = faker1.barcode();
        com.github.javafaker.Dog dog7 = faker1.dog();
        com.github.javafaker.Country country8 = faker1.country();
        com.github.javafaker.AquaTeenHungerForce aquaTeenHungerForce9 = faker1.aquaTeenHungerForce();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(barcode6);
        org.junit.Assert.assertNotNull(dog7);
        org.junit.Assert.assertNotNull(country8);
        org.junit.Assert.assertNotNull(aquaTeenHungerForce9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Hacker hacker5 = faker1.hacker();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        java.lang.String str8 = lorem6.paragraph(1);
        java.lang.String str9 = lorem6.characters();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(lorem6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Sunt temporibus quia et eligendi. Numquam sunt ab velit magnam aut rerum est. Sit asperiores voluptate occaecati." + "'", str8, "Sunt temporibus quia et eligendi. Numquam sunt ab velit magnam aut rerum est. Sit asperiores voluptate occaecati.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "quf5n27z2og3uj4xx8jjdkm8exv73acml69w9usnknc41gl0o6v73lpg2fbd47hfc4oqm16topkwp8gnpolkm61y7l5x820ptjmyk64zu19sembq7pcdr3p94wydal4qs739tw3kzvzvgcxd729fmw54ube8kh91clpbrkgwrw5pe86lr1wh30d5sqgsoib51g5v4x42o2s8iy28vcw0ucdvqdlp8824woy1tdeg9v496g2fyzeje8pe55ck6zf" + "'", str9, "quf5n27z2og3uj4xx8jjdkm8exv73acml69w9usnknc41gl0o6v73lpg2fbd47hfc4oqm16topkwp8gnpolkm61y7l5x820ptjmyk64zu19sembq7pcdr3p94wydal4qs739tw3kzvzvgcxd729fmw54ube8kh91clpbrkgwrw5pe86lr1wh30d5sqgsoib51g5v4x42o2s8iy28vcw0ucdvqdlp8824woy1tdeg9v496g2fyzeje8pe55ck6zf");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        java.lang.String str4 = slackEmoji3.emoji();
        java.lang.String str5 = slackEmoji3.foodAndDrink();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":factory:" + "'", str4, ":factory:");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":rice:" + "'", str5, ":rice:");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.IdNumber idNumber5 = faker1.idNumber();
        java.lang.String str8 = faker1.bothify("http://lorempixel.com/199/100/cats/Diomedes", true);
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(idNumber5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://lorempixel.com/199/100/cats/Diomedes" + "'", str8, "http://lorempixel.com/199/100/cats/Diomedes");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        com.github.javafaker.Job job7 = new com.github.javafaker.Job(faker1);
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Team team5 = faker1.team();
        com.github.javafaker.Kaamelott kaamelott6 = faker1.kaamelott();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(team5);
        org.junit.Assert.assertNotNull(kaamelott6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.Cat cat4 = faker1.cat();
        java.lang.String str5 = cat4.name();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(cat4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Max" + "'", str5, "Max");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("Wyoming");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("Griffin");
        java.lang.String str12 = internet9.privateIpV4Address();
        java.lang.String str13 = internet9.password();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = internet9.password((int) (short) 100, (int) '4', true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wyoming" + "'", str8, "Wyoming");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Griffin:87:8b:bc:3c:dc" + "'", str11, "Griffin:87:8b:bc:3c:dc");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "172.27.214.118" + "'", str12, "172.27.214.118");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "85wmdmxzndf" + "'", str13, "85wmdmxzndf");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Options options4 = faker1.options();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Avatar avatar7 = faker6.avatar();
        com.github.javafaker.SlackEmoji slackEmoji8 = faker6.slackEmoji();
        com.github.javafaker.Medical medical9 = faker6.medical();
        com.github.javafaker.Robin robin10 = faker6.robin();
        com.github.javafaker.BojackHorseman bojackHorseman11 = faker6.bojackHorseman();
        com.github.javafaker.Demographic demographic12 = faker6.demographic();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Avatar avatar15 = faker14.avatar();
        com.github.javafaker.SlackEmoji slackEmoji16 = faker14.slackEmoji();
        com.github.javafaker.Medical medical17 = faker14.medical();
        com.github.javafaker.Robin robin18 = faker14.robin();
        com.github.javafaker.BojackHorseman bojackHorseman19 = faker14.bojackHorseman();
        com.github.javafaker.Demographic demographic20 = faker14.demographic();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Avatar avatar23 = faker22.avatar();
        com.github.javafaker.SlackEmoji slackEmoji24 = faker22.slackEmoji();
        com.github.javafaker.Medical medical25 = faker22.medical();
        com.github.javafaker.Robin robin26 = faker22.robin();
        com.github.javafaker.BojackHorseman bojackHorseman27 = faker22.bojackHorseman();
        com.github.javafaker.Demographic demographic28 = faker22.demographic();
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Avatar avatar31 = faker30.avatar();
        com.github.javafaker.SlackEmoji slackEmoji32 = faker30.slackEmoji();
        com.github.javafaker.Medical medical33 = faker30.medical();
        com.github.javafaker.Robin robin34 = faker30.robin();
        com.github.javafaker.BojackHorseman bojackHorseman35 = faker30.bojackHorseman();
        com.github.javafaker.Demographic demographic36 = faker30.demographic();
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Avatar avatar39 = faker38.avatar();
        com.github.javafaker.SlackEmoji slackEmoji40 = faker38.slackEmoji();
        com.github.javafaker.Medical medical41 = faker38.medical();
        com.github.javafaker.Robin robin42 = faker38.robin();
        com.github.javafaker.BojackHorseman bojackHorseman43 = faker38.bojackHorseman();
        com.github.javafaker.Demographic demographic44 = faker38.demographic();
        com.github.javafaker.Demographic[] demographicArray45 = new com.github.javafaker.Demographic[] { demographic12, demographic20, demographic28, demographic36, demographic44 };
        com.github.javafaker.Demographic demographic46 = options4.option(demographicArray45);
        java.util.Random random47 = null;
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random47);
        com.github.javafaker.Avatar avatar49 = faker48.avatar();
        com.github.javafaker.SlackEmoji slackEmoji50 = faker48.slackEmoji();
        com.github.javafaker.Medical medical51 = faker48.medical();
        com.github.javafaker.Robin robin52 = faker48.robin();
        com.github.javafaker.BojackHorseman bojackHorseman53 = faker48.bojackHorseman();
        com.github.javafaker.Demographic demographic54 = faker48.demographic();
        com.github.javafaker.Ancient ancient55 = faker48.ancient();
        com.github.javafaker.Friends friends56 = faker48.friends();
        java.util.Random random57 = null;
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random57);
        com.github.javafaker.Avatar avatar59 = faker58.avatar();
        com.github.javafaker.SlackEmoji slackEmoji60 = faker58.slackEmoji();
        com.github.javafaker.Medical medical61 = faker58.medical();
        com.github.javafaker.Robin robin62 = faker58.robin();
        com.github.javafaker.BojackHorseman bojackHorseman63 = faker58.bojackHorseman();
        com.github.javafaker.Demographic demographic64 = faker58.demographic();
        com.github.javafaker.Ancient ancient65 = faker58.ancient();
        com.github.javafaker.Friends friends66 = faker58.friends();
        com.github.javafaker.Friends[] friendsArray67 = new com.github.javafaker.Friends[] { friends56, friends66 };
        com.github.javafaker.Friends friends68 = options4.nextElement(friendsArray67);
        java.lang.String str69 = friends68.quote();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(avatar7);
        org.junit.Assert.assertNotNull(slackEmoji8);
        org.junit.Assert.assertNotNull(medical9);
        org.junit.Assert.assertNotNull(robin10);
        org.junit.Assert.assertNotNull(bojackHorseman11);
        org.junit.Assert.assertNotNull(demographic12);
        org.junit.Assert.assertNotNull(avatar15);
        org.junit.Assert.assertNotNull(slackEmoji16);
        org.junit.Assert.assertNotNull(medical17);
        org.junit.Assert.assertNotNull(robin18);
        org.junit.Assert.assertNotNull(bojackHorseman19);
        org.junit.Assert.assertNotNull(demographic20);
        org.junit.Assert.assertNotNull(avatar23);
        org.junit.Assert.assertNotNull(slackEmoji24);
        org.junit.Assert.assertNotNull(medical25);
        org.junit.Assert.assertNotNull(robin26);
        org.junit.Assert.assertNotNull(bojackHorseman27);
        org.junit.Assert.assertNotNull(demographic28);
        org.junit.Assert.assertNotNull(avatar31);
        org.junit.Assert.assertNotNull(slackEmoji32);
        org.junit.Assert.assertNotNull(medical33);
        org.junit.Assert.assertNotNull(robin34);
        org.junit.Assert.assertNotNull(bojackHorseman35);
        org.junit.Assert.assertNotNull(demographic36);
        org.junit.Assert.assertNotNull(avatar39);
        org.junit.Assert.assertNotNull(slackEmoji40);
        org.junit.Assert.assertNotNull(medical41);
        org.junit.Assert.assertNotNull(robin42);
        org.junit.Assert.assertNotNull(bojackHorseman43);
        org.junit.Assert.assertNotNull(demographic44);
        org.junit.Assert.assertNotNull(demographicArray45);
        org.junit.Assert.assertNotNull(demographic46);
        org.junit.Assert.assertNotNull(avatar49);
        org.junit.Assert.assertNotNull(slackEmoji50);
        org.junit.Assert.assertNotNull(medical51);
        org.junit.Assert.assertNotNull(robin52);
        org.junit.Assert.assertNotNull(bojackHorseman53);
        org.junit.Assert.assertNotNull(demographic54);
        org.junit.Assert.assertNotNull(ancient55);
        org.junit.Assert.assertNotNull(friends56);
        org.junit.Assert.assertNotNull(avatar59);
        org.junit.Assert.assertNotNull(slackEmoji60);
        org.junit.Assert.assertNotNull(medical61);
        org.junit.Assert.assertNotNull(robin62);
        org.junit.Assert.assertNotNull(bojackHorseman63);
        org.junit.Assert.assertNotNull(demographic64);
        org.junit.Assert.assertNotNull(ancient65);
        org.junit.Assert.assertNotNull(friends66);
        org.junit.Assert.assertNotNull(friendsArray67);
        org.junit.Assert.assertNotNull(friends68);
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\u2026\u2019re extinct?" + "'", str69, "\u2026\u2019re extinct?");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.github.javafaker.idnumbers.EnIdNumber enIdNumber0 = new com.github.javafaker.idnumbers.EnIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Avatar avatar3 = faker2.avatar();
        com.github.javafaker.SlackEmoji slackEmoji4 = faker2.slackEmoji();
        com.github.javafaker.Medical medical5 = faker2.medical();
        com.github.javafaker.Robin robin6 = faker2.robin();
        com.github.javafaker.BojackHorseman bojackHorseman7 = faker2.bojackHorseman();
        com.github.javafaker.Demographic demographic8 = faker2.demographic();
        java.lang.String str9 = enIdNumber0.getValidSsn(faker2);
        java.util.Random random10 = null;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Photography photography12 = faker11.photography();
        java.lang.String str13 = enIdNumber0.getValidSsn(faker11);
        org.junit.Assert.assertNotNull(avatar3);
        org.junit.Assert.assertNotNull(slackEmoji4);
        org.junit.Assert.assertNotNull(medical5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertNotNull(bojackHorseman7);
        org.junit.Assert.assertNotNull(demographic8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "216-15-7073" + "'", str9, "216-15-7073");
        org.junit.Assert.assertNotNull(photography12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "164-55-6004" + "'", str13, "164-55-6004");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Superhero superhero6 = faker1.superhero();
        java.lang.String str7 = superhero6.prefix();
        java.lang.String str8 = superhero6.descriptor();
        java.lang.String str9 = superhero6.power();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(superhero6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "General" + "'", str7, "General");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Century" + "'", str8, "Century");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Aerokinesis" + "'", str9, "Aerokinesis");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Barcode barcode6 = faker1.barcode();
        com.github.javafaker.Dog dog7 = faker1.dog();
        java.lang.String str8 = dog7.breed();
        java.lang.String str9 = dog7.memePhrase();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(barcode6);
        org.junit.Assert.assertNotNull(dog7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Giant Schnauzer" + "'", str8, "Giant Schnauzer");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "big ol' pupper" + "'", str9, "big ol' pupper");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.lens();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u2013\u20135.6" + "'", str3, "\u2013\u20135.6");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        com.github.javafaker.Coin coin4 = faker1.coin();
        com.github.javafaker.Relationships relationships5 = faker1.relationships();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(coin4);
        org.junit.Assert.assertNotNull(relationships5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Barcode barcode6 = faker1.barcode();
        com.github.javafaker.App app7 = faker1.app();
        com.github.javafaker.Matz matz8 = faker1.matz();
        java.lang.String str9 = matz8.quote();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(barcode6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(matz8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "In our daily lives as programmers, we process text strings a lot. So I tried to work hard on text processing, namely the string class and regular expressions. Regular expressions are built into the language and are very tuned up for use." + "'", str9, "In our daily lives as programmers, we process text strings a lot. So I tried to work hard on text processing, namely the string class and regular expressions. Regular expressions are built into the language and are very tuned up for use.");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Gender gender5 = faker1.gender();
        com.github.javafaker.ChuckNorris chuckNorris6 = faker1.chuckNorris();
        com.github.javafaker.Witcher witcher7 = faker1.witcher();
        java.lang.String str8 = witcher7.monster();
        java.lang.String str9 = witcher7.school();
        java.lang.String str10 = witcher7.quote();
        java.lang.String str11 = witcher7.school();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(chuckNorris6);
        org.junit.Assert.assertNotNull(witcher7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "The Caretaker" + "'", str8, "The Caretaker");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Griffin" + "'", str9, "Griffin");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Oh year... the Elder Blood can be fiery" + "'", str10, "Oh year... the Elder Blood can be fiery");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Manticore" + "'", str11, "Manticore");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Hacker hacker5 = faker1.hacker();
        java.lang.String str7 = faker1.expression("Tacos");
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Tacos" + "'", str7, "Tacos");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Options options4 = faker1.options();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Avatar avatar7 = faker6.avatar();
        com.github.javafaker.SlackEmoji slackEmoji8 = faker6.slackEmoji();
        com.github.javafaker.Medical medical9 = faker6.medical();
        com.github.javafaker.Robin robin10 = faker6.robin();
        com.github.javafaker.BojackHorseman bojackHorseman11 = faker6.bojackHorseman();
        com.github.javafaker.Demographic demographic12 = faker6.demographic();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Avatar avatar15 = faker14.avatar();
        com.github.javafaker.SlackEmoji slackEmoji16 = faker14.slackEmoji();
        com.github.javafaker.Medical medical17 = faker14.medical();
        com.github.javafaker.Robin robin18 = faker14.robin();
        com.github.javafaker.BojackHorseman bojackHorseman19 = faker14.bojackHorseman();
        com.github.javafaker.Demographic demographic20 = faker14.demographic();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Avatar avatar23 = faker22.avatar();
        com.github.javafaker.SlackEmoji slackEmoji24 = faker22.slackEmoji();
        com.github.javafaker.Medical medical25 = faker22.medical();
        com.github.javafaker.Robin robin26 = faker22.robin();
        com.github.javafaker.BojackHorseman bojackHorseman27 = faker22.bojackHorseman();
        com.github.javafaker.Demographic demographic28 = faker22.demographic();
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Avatar avatar31 = faker30.avatar();
        com.github.javafaker.SlackEmoji slackEmoji32 = faker30.slackEmoji();
        com.github.javafaker.Medical medical33 = faker30.medical();
        com.github.javafaker.Robin robin34 = faker30.robin();
        com.github.javafaker.BojackHorseman bojackHorseman35 = faker30.bojackHorseman();
        com.github.javafaker.Demographic demographic36 = faker30.demographic();
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Avatar avatar39 = faker38.avatar();
        com.github.javafaker.SlackEmoji slackEmoji40 = faker38.slackEmoji();
        com.github.javafaker.Medical medical41 = faker38.medical();
        com.github.javafaker.Robin robin42 = faker38.robin();
        com.github.javafaker.BojackHorseman bojackHorseman43 = faker38.bojackHorseman();
        com.github.javafaker.Demographic demographic44 = faker38.demographic();
        com.github.javafaker.Demographic[] demographicArray45 = new com.github.javafaker.Demographic[] { demographic12, demographic20, demographic28, demographic36, demographic44 };
        com.github.javafaker.Demographic demographic46 = options4.option(demographicArray45);
        java.lang.String str47 = demographic46.sex();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(avatar7);
        org.junit.Assert.assertNotNull(slackEmoji8);
        org.junit.Assert.assertNotNull(medical9);
        org.junit.Assert.assertNotNull(robin10);
        org.junit.Assert.assertNotNull(bojackHorseman11);
        org.junit.Assert.assertNotNull(demographic12);
        org.junit.Assert.assertNotNull(avatar15);
        org.junit.Assert.assertNotNull(slackEmoji16);
        org.junit.Assert.assertNotNull(medical17);
        org.junit.Assert.assertNotNull(robin18);
        org.junit.Assert.assertNotNull(bojackHorseman19);
        org.junit.Assert.assertNotNull(demographic20);
        org.junit.Assert.assertNotNull(avatar23);
        org.junit.Assert.assertNotNull(slackEmoji24);
        org.junit.Assert.assertNotNull(medical25);
        org.junit.Assert.assertNotNull(robin26);
        org.junit.Assert.assertNotNull(bojackHorseman27);
        org.junit.Assert.assertNotNull(demographic28);
        org.junit.Assert.assertNotNull(avatar31);
        org.junit.Assert.assertNotNull(slackEmoji32);
        org.junit.Assert.assertNotNull(medical33);
        org.junit.Assert.assertNotNull(robin34);
        org.junit.Assert.assertNotNull(bojackHorseman35);
        org.junit.Assert.assertNotNull(demographic36);
        org.junit.Assert.assertNotNull(avatar39);
        org.junit.Assert.assertNotNull(slackEmoji40);
        org.junit.Assert.assertNotNull(medical41);
        org.junit.Assert.assertNotNull(robin42);
        org.junit.Assert.assertNotNull(bojackHorseman43);
        org.junit.Assert.assertNotNull(demographic44);
        org.junit.Assert.assertNotNull(demographicArray45);
        org.junit.Assert.assertNotNull(demographic46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Male" + "'", str47, "Male");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Gender gender5 = faker1.gender();
        com.github.javafaker.ChuckNorris chuckNorris6 = faker1.chuckNorris();
        com.github.javafaker.Witcher witcher7 = faker1.witcher();
        java.lang.String str8 = witcher7.monster();
        java.lang.String str9 = witcher7.school();
        java.lang.String str10 = witcher7.location();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(chuckNorris6);
        org.junit.Assert.assertNotNull(witcher7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water Hag" + "'", str8, "Water Hag");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Viper" + "'", str9, "Viper");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Stygga" + "'", str10, "Stygga");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Basketball basketball5 = faker1.basketball();
        java.lang.String str7 = faker1.numerify("Sony DSLR-A350");
        com.github.javafaker.TwinPeaks twinPeaks8 = faker1.twinPeaks();
        java.lang.String str9 = twinPeaks8.location();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(basketball5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Sony DSLR-A350" + "'", str7, "Sony DSLR-A350");
        org.junit.Assert.assertNotNull(twinPeaks8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Palmer House" + "'", str9, "Palmer House");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.AquaTeenHungerForce aquaTeenHungerForce4 = faker1.aquaTeenHungerForce();
        com.github.javafaker.DragonBall dragonBall5 = faker1.dragonBall();
        java.lang.String str6 = dragonBall5.character();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(aquaTeenHungerForce4);
        org.junit.Assert.assertNotNull(dragonBall5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Li Shenlong" + "'", str6, "Li Shenlong");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        java.lang.String str4 = faker1.numerify("port");
        com.github.javafaker.Zelda zelda5 = faker1.zelda();
        java.lang.String str6 = zelda5.character();
        java.lang.String str7 = zelda5.character();
        java.lang.String str8 = zelda5.game();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "port" + "'", str4, "port");
        org.junit.Assert.assertNotNull(zelda5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Decci" + "'", str6, "Decci");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ciela" + "'", str7, "Ciela");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "The Wind Waker" + "'", str8, "The Wind Waker");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Options options4 = faker1.options();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Avatar avatar7 = faker6.avatar();
        com.github.javafaker.SlackEmoji slackEmoji8 = faker6.slackEmoji();
        com.github.javafaker.Medical medical9 = faker6.medical();
        com.github.javafaker.Robin robin10 = faker6.robin();
        com.github.javafaker.BojackHorseman bojackHorseman11 = faker6.bojackHorseman();
        com.github.javafaker.Demographic demographic12 = faker6.demographic();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Avatar avatar15 = faker14.avatar();
        com.github.javafaker.SlackEmoji slackEmoji16 = faker14.slackEmoji();
        com.github.javafaker.Medical medical17 = faker14.medical();
        com.github.javafaker.Robin robin18 = faker14.robin();
        com.github.javafaker.BojackHorseman bojackHorseman19 = faker14.bojackHorseman();
        com.github.javafaker.Demographic demographic20 = faker14.demographic();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Avatar avatar23 = faker22.avatar();
        com.github.javafaker.SlackEmoji slackEmoji24 = faker22.slackEmoji();
        com.github.javafaker.Medical medical25 = faker22.medical();
        com.github.javafaker.Robin robin26 = faker22.robin();
        com.github.javafaker.BojackHorseman bojackHorseman27 = faker22.bojackHorseman();
        com.github.javafaker.Demographic demographic28 = faker22.demographic();
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Avatar avatar31 = faker30.avatar();
        com.github.javafaker.SlackEmoji slackEmoji32 = faker30.slackEmoji();
        com.github.javafaker.Medical medical33 = faker30.medical();
        com.github.javafaker.Robin robin34 = faker30.robin();
        com.github.javafaker.BojackHorseman bojackHorseman35 = faker30.bojackHorseman();
        com.github.javafaker.Demographic demographic36 = faker30.demographic();
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Avatar avatar39 = faker38.avatar();
        com.github.javafaker.SlackEmoji slackEmoji40 = faker38.slackEmoji();
        com.github.javafaker.Medical medical41 = faker38.medical();
        com.github.javafaker.Robin robin42 = faker38.robin();
        com.github.javafaker.BojackHorseman bojackHorseman43 = faker38.bojackHorseman();
        com.github.javafaker.Demographic demographic44 = faker38.demographic();
        com.github.javafaker.Demographic[] demographicArray45 = new com.github.javafaker.Demographic[] { demographic12, demographic20, demographic28, demographic36, demographic44 };
        com.github.javafaker.Demographic demographic46 = options4.option(demographicArray45);
        java.util.Random random47 = null;
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random47);
        com.github.javafaker.Avatar avatar49 = faker48.avatar();
        com.github.javafaker.SlackEmoji slackEmoji50 = faker48.slackEmoji();
        com.github.javafaker.Medical medical51 = faker48.medical();
        com.github.javafaker.Robin robin52 = faker48.robin();
        com.github.javafaker.BojackHorseman bojackHorseman53 = faker48.bojackHorseman();
        com.github.javafaker.Demographic demographic54 = faker48.demographic();
        com.github.javafaker.Ancient ancient55 = faker48.ancient();
        com.github.javafaker.Friends friends56 = faker48.friends();
        java.util.Random random57 = null;
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random57);
        com.github.javafaker.Avatar avatar59 = faker58.avatar();
        com.github.javafaker.SlackEmoji slackEmoji60 = faker58.slackEmoji();
        com.github.javafaker.Medical medical61 = faker58.medical();
        com.github.javafaker.Robin robin62 = faker58.robin();
        com.github.javafaker.BojackHorseman bojackHorseman63 = faker58.bojackHorseman();
        com.github.javafaker.Demographic demographic64 = faker58.demographic();
        com.github.javafaker.Ancient ancient65 = faker58.ancient();
        com.github.javafaker.Friends friends66 = faker58.friends();
        com.github.javafaker.Friends[] friendsArray67 = new com.github.javafaker.Friends[] { friends56, friends66 };
        com.github.javafaker.Friends friends68 = options4.nextElement(friendsArray67);
        java.lang.String str69 = friends68.location();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(avatar7);
        org.junit.Assert.assertNotNull(slackEmoji8);
        org.junit.Assert.assertNotNull(medical9);
        org.junit.Assert.assertNotNull(robin10);
        org.junit.Assert.assertNotNull(bojackHorseman11);
        org.junit.Assert.assertNotNull(demographic12);
        org.junit.Assert.assertNotNull(avatar15);
        org.junit.Assert.assertNotNull(slackEmoji16);
        org.junit.Assert.assertNotNull(medical17);
        org.junit.Assert.assertNotNull(robin18);
        org.junit.Assert.assertNotNull(bojackHorseman19);
        org.junit.Assert.assertNotNull(demographic20);
        org.junit.Assert.assertNotNull(avatar23);
        org.junit.Assert.assertNotNull(slackEmoji24);
        org.junit.Assert.assertNotNull(medical25);
        org.junit.Assert.assertNotNull(robin26);
        org.junit.Assert.assertNotNull(bojackHorseman27);
        org.junit.Assert.assertNotNull(demographic28);
        org.junit.Assert.assertNotNull(avatar31);
        org.junit.Assert.assertNotNull(slackEmoji32);
        org.junit.Assert.assertNotNull(medical33);
        org.junit.Assert.assertNotNull(robin34);
        org.junit.Assert.assertNotNull(bojackHorseman35);
        org.junit.Assert.assertNotNull(demographic36);
        org.junit.Assert.assertNotNull(avatar39);
        org.junit.Assert.assertNotNull(slackEmoji40);
        org.junit.Assert.assertNotNull(medical41);
        org.junit.Assert.assertNotNull(robin42);
        org.junit.Assert.assertNotNull(bojackHorseman43);
        org.junit.Assert.assertNotNull(demographic44);
        org.junit.Assert.assertNotNull(demographicArray45);
        org.junit.Assert.assertNotNull(demographic46);
        org.junit.Assert.assertNotNull(avatar49);
        org.junit.Assert.assertNotNull(slackEmoji50);
        org.junit.Assert.assertNotNull(medical51);
        org.junit.Assert.assertNotNull(robin52);
        org.junit.Assert.assertNotNull(bojackHorseman53);
        org.junit.Assert.assertNotNull(demographic54);
        org.junit.Assert.assertNotNull(ancient55);
        org.junit.Assert.assertNotNull(friends56);
        org.junit.Assert.assertNotNull(avatar59);
        org.junit.Assert.assertNotNull(slackEmoji60);
        org.junit.Assert.assertNotNull(medical61);
        org.junit.Assert.assertNotNull(robin62);
        org.junit.Assert.assertNotNull(bojackHorseman63);
        org.junit.Assert.assertNotNull(demographic64);
        org.junit.Assert.assertNotNull(ancient65);
        org.junit.Assert.assertNotNull(friends66);
        org.junit.Assert.assertNotNull(friendsArray67);
        org.junit.Assert.assertNotNull(friends68);
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "945 Grove St Apt. 20" + "'", str69, "945 Grove St Apt. 20");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.Cat cat4 = faker1.cat();
        java.lang.String str5 = cat4.breed();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(cat4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Snowshoe" + "'", str5, "Snowshoe");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("Wyoming");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str10 = internet9.ipV4Address();
        java.lang.String str11 = internet9.ipV6Address();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wyoming" + "'", str8, "Wyoming");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "58.210.31.141" + "'", str10, "58.210.31.141");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "724a:2352:c4d9:d921:8b2c:1607:ed93:a2be" + "'", str11, "724a:2352:c4d9:d921:8b2c:1607:ed93:a2be");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Artist artist5 = faker1.artist();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(artist5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Basketball basketball5 = faker1.basketball();
        com.github.javafaker.University university6 = faker1.university();
        com.github.javafaker.Relationships relationships7 = faker1.relationships();
        com.github.javafaker.Job job8 = faker1.job();
        com.github.javafaker.Food food9 = faker1.food();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(basketball5);
        org.junit.Assert.assertNotNull(university6);
        org.junit.Assert.assertNotNull(relationships7);
        org.junit.Assert.assertNotNull(job8);
        org.junit.Assert.assertNotNull(food9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.Cat cat4 = faker1.cat();
        com.github.javafaker.Stock stock5 = faker1.stock();
        java.lang.String str6 = stock5.nsdqSymbol();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(cat4);
        org.junit.Assert.assertNotNull(stock5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "SHOS" + "'", str6, "SHOS");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("Wyoming");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("Griffin");
        java.lang.String str12 = internet9.slug();
        java.lang.String str14 = internet9.emailAddress("Canon PowerShot G");
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wyoming" + "'", str8, "Wyoming");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Griffin:0d:73:20:a3:1b" + "'", str11, "Griffin:0d:73:20:a3:1b");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nesciunt_omnis" + "'", str12, "nesciunt_omnis");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Canon PowerShot G@yahoo.com" + "'", str14, "Canon PowerShot G@yahoo.com");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.Educator educator7 = faker1.educator();
        com.github.javafaker.Beer beer8 = faker1.beer();
        java.lang.String str9 = beer8.style();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(educator7);
        org.junit.Assert.assertNotNull(beer8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "India Pale Ale" + "'", str9, "India Pale Ale");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        long long3 = randomService1.nextLong((long) 'a');
        java.lang.String str5 = randomService1.hex((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int8 = randomService1.nextInt(41106, 580);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 22L + "'", long3 == 22L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6A467B32AB" + "'", str5, "6A467B32AB");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Hacker hacker5 = faker1.hacker();
        com.github.javafaker.LeagueOfLegends leagueOfLegends6 = faker1.leagueOfLegends();
        java.lang.String str7 = leagueOfLegends6.location();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(leagueOfLegends6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Demacia" + "'", str7, "Demacia");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Music music2 = faker1.music();
        java.lang.String str3 = music2.chord();
        java.lang.String str4 = music2.key();
        org.junit.Assert.assertNotNull(music2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Amaj7" + "'", str3, "Amaj7");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Gb" + "'", str4, "Gb");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Job job6 = new com.github.javafaker.Job(faker1);
        com.github.javafaker.University university7 = faker1.university();
        com.github.javafaker.PrincessBride princessBride8 = faker1.princessBride();
        com.github.javafaker.Pokemon pokemon9 = faker1.pokemon();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(university7);
        org.junit.Assert.assertNotNull(princessBride8);
        org.junit.Assert.assertNotNull(pokemon9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Color color3 = faker1.color();
        java.lang.String str4 = color3.name();
        java.lang.String str5 = color3.hex();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(color3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "magenta" + "'", str4, "magenta");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#282474" + "'", str5, "#282474");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Gender gender5 = faker1.gender();
        com.github.javafaker.Esports esports6 = faker1.esports();
        java.lang.String str7 = esports6.event();
        java.lang.String str8 = esports6.game();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(esports6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MLG Meadowlands" + "'", str7, "MLG Meadowlands");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StarCraft II" + "'", str8, "StarCraft II");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.Ancient ancient8 = faker1.ancient();
        com.github.javafaker.Friends friends9 = faker1.friends();
        java.lang.String str12 = faker1.bothify(":tanabata_tree:", false);
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
        org.junit.Assert.assertNotNull(friends9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":tanabata_tree:" + "'", str12, ":tanabata_tree:");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        com.github.javafaker.Dog dog4 = faker1.dog();
        com.github.javafaker.Team team5 = faker1.team();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker1.phoneNumber();
        java.lang.String str7 = phoneNumber6.cellPhone();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(dog4);
        org.junit.Assert.assertNotNull(team5);
        org.junit.Assert.assertNotNull(phoneNumber6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(935) 608-9929" + "'", str7, "(935) 608-9929");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Gender gender5 = faker1.gender();
        com.github.javafaker.ChuckNorris chuckNorris6 = faker1.chuckNorris();
        com.github.javafaker.Robin robin7 = faker1.robin();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(chuckNorris6);
        org.junit.Assert.assertNotNull(robin7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Job job4 = faker1.job();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Sip sip6 = faker1.sip();
        java.lang.String str7 = sip6.nameAddress();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(job4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(sip6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.File file8 = faker1.file();
        java.lang.String str9 = file8.mimeType();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(file8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "video/mp4" + "'", str9, "video/mp4");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.FunnyName funnyName5 = faker1.funnyName();
        com.github.javafaker.Hacker hacker6 = faker1.hacker();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(funnyName5);
        org.junit.Assert.assertNotNull(hacker6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        com.github.javafaker.Dog dog4 = faker1.dog();
        java.lang.String str5 = dog4.age();
        java.lang.String str6 = dog4.breed();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(dog4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "puppy" + "'", str5, "puppy");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Leonberg" + "'", str6, "Leonberg");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.ChuckNorris chuckNorris8 = faker1.chuckNorris();
        com.github.javafaker.HarryPotter harryPotter9 = faker1.harryPotter();
        com.github.javafaker.ElderScrolls elderScrolls10 = faker1.elderScrolls();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(chuckNorris8);
        org.junit.Assert.assertNotNull(harryPotter9);
        org.junit.Assert.assertNotNull(elderScrolls10);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DragonBall dragonBall2 = faker1.dragonBall();
        com.github.javafaker.Dune dune3 = faker1.dune();
        java.lang.String str4 = dune3.quote();
        java.lang.String str5 = dune3.planet();
        org.junit.Assert.assertNotNull(dragonBall2);
        org.junit.Assert.assertNotNull(dune3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No more terrible disaster could befall your people than for them to fall into the hands of a Hero." + "'", str4, "No more terrible disaster could befall your people than for them to fall into the hands of a Hero.");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dune" + "'", str5, "Dune");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Music music2 = faker1.music();
        java.lang.String str3 = music2.key();
        org.junit.Assert.assertNotNull(music2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Gb" + "'", str3, "Gb");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("Wyoming");
        com.github.javafaker.Internet internet9 = faker1.internet();
        com.github.javafaker.Esports esports10 = faker1.esports();
        java.lang.String str11 = esports10.player();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wyoming" + "'", str8, "Wyoming");
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(esports10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Surefour" + "'", str11, "Surefour");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.Beer beer7 = faker1.beer();
        com.github.javafaker.Finance finance8 = faker1.finance();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(beer7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Gender gender5 = faker1.gender();
        com.github.javafaker.ChuckNorris chuckNorris6 = faker1.chuckNorris();
        com.github.javafaker.Matz matz7 = faker1.matz();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(chuckNorris6);
        org.junit.Assert.assertNotNull(matz7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.Educator educator7 = faker1.educator();
        java.lang.String str8 = educator7.secondarySchool();
        java.lang.String str9 = educator7.campus();
        java.lang.String str10 = educator7.campus();
        java.lang.String str11 = educator7.campus();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(educator7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mallowtown High School" + "'", str8, "Mallowtown High School");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Brighthurst Campus" + "'", str9, "Brighthurst Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mallowpond Campus" + "'", str10, "Mallowpond Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Marblewald Campus" + "'", str11, "Marblewald Campus");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.Company company6 = faker1.company();
        java.lang.String str7 = company6.suffix();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(company6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Inc" + "'", str7, "Inc");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Options options4 = faker1.options();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Avatar avatar7 = faker6.avatar();
        com.github.javafaker.Barcode barcode8 = new com.github.javafaker.Barcode(faker6);
        com.github.javafaker.Hobbit hobbit9 = faker6.hobbit();
        java.util.Random random10 = null;
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random10);
        com.github.javafaker.Avatar avatar12 = faker11.avatar();
        com.github.javafaker.Barcode barcode13 = new com.github.javafaker.Barcode(faker11);
        com.github.javafaker.Hobbit hobbit14 = faker11.hobbit();
        java.util.Random random15 = null;
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Avatar avatar17 = faker16.avatar();
        com.github.javafaker.Barcode barcode18 = new com.github.javafaker.Barcode(faker16);
        com.github.javafaker.Hobbit hobbit19 = faker16.hobbit();
        java.util.Random random20 = null;
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random20);
        com.github.javafaker.Avatar avatar22 = faker21.avatar();
        com.github.javafaker.Barcode barcode23 = new com.github.javafaker.Barcode(faker21);
        com.github.javafaker.Hobbit hobbit24 = faker21.hobbit();
        java.util.Random random25 = null;
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Avatar avatar27 = faker26.avatar();
        com.github.javafaker.Barcode barcode28 = new com.github.javafaker.Barcode(faker26);
        com.github.javafaker.Hobbit hobbit29 = faker26.hobbit();
        java.util.Random random30 = null;
        com.github.javafaker.Faker faker31 = new com.github.javafaker.Faker(random30);
        com.github.javafaker.Avatar avatar32 = faker31.avatar();
        com.github.javafaker.Barcode barcode33 = new com.github.javafaker.Barcode(faker31);
        com.github.javafaker.Hobbit hobbit34 = faker31.hobbit();
        com.github.javafaker.Hobbit[] hobbitArray35 = new com.github.javafaker.Hobbit[] { hobbit9, hobbit14, hobbit19, hobbit24, hobbit29, hobbit34 };
        com.github.javafaker.Hobbit hobbit36 = options4.nextElement(hobbitArray35);
        com.github.javafaker.BojackHorseman[] bojackHorsemanArray37 = new com.github.javafaker.BojackHorseman[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.BojackHorseman bojackHorseman38 = options4.option(bojackHorsemanArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(avatar7);
        org.junit.Assert.assertNotNull(hobbit9);
        org.junit.Assert.assertNotNull(avatar12);
        org.junit.Assert.assertNotNull(hobbit14);
        org.junit.Assert.assertNotNull(avatar17);
        org.junit.Assert.assertNotNull(hobbit19);
        org.junit.Assert.assertNotNull(avatar22);
        org.junit.Assert.assertNotNull(hobbit24);
        org.junit.Assert.assertNotNull(avatar27);
        org.junit.Assert.assertNotNull(hobbit29);
        org.junit.Assert.assertNotNull(avatar32);
        org.junit.Assert.assertNotNull(hobbit34);
        org.junit.Assert.assertNotNull(hobbitArray35);
        org.junit.Assert.assertNotNull(hobbit36);
        org.junit.Assert.assertNotNull(bojackHorsemanArray37);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Job job6 = new com.github.javafaker.Job(faker1);
        java.lang.String str7 = job6.keySkills();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Fast learner" + "'", str7, "Fast learner");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("Wyoming");
        com.github.javafaker.Internet internet9 = faker1.internet();
        com.github.javafaker.Esports esports10 = faker1.esports();
        com.github.javafaker.Kaamelott kaamelott11 = faker1.kaamelott();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wyoming" + "'", str8, "Wyoming");
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(esports10);
        org.junit.Assert.assertNotNull(kaamelott11);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.Ancient ancient8 = faker1.ancient();
        com.github.javafaker.Friends friends9 = faker1.friends();
        com.github.javafaker.HitchhikersGuideToTheGalaxy hitchhikersGuideToTheGalaxy10 = faker1.hitchhikersGuideToTheGalaxy();
        java.lang.String str11 = hitchhikersGuideToTheGalaxy10.specie();
        java.lang.String str12 = hitchhikersGuideToTheGalaxy10.starship();
        java.lang.String str13 = hitchhikersGuideToTheGalaxy10.specie();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
        org.junit.Assert.assertNotNull(friends9);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Vogon" + "'", str11, "Vogon");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Krikkit One" + "'", str12, "Krikkit One");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Arcturan Megagrasshopper" + "'", str13, "Arcturan Megagrasshopper");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.Ancient ancient8 = faker1.ancient();
        com.github.javafaker.Friends friends9 = faker1.friends();
        com.github.javafaker.Lebowski lebowski10 = faker1.lebowski();
        java.lang.String str11 = lebowski10.character();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
        org.junit.Assert.assertNotNull(friends9);
        org.junit.Assert.assertNotNull(lebowski10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Jesus Quintana" + "'", str11, "Jesus Quintana");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.Educator educator7 = faker1.educator();
        com.github.javafaker.Beer beer8 = faker1.beer();
        java.lang.String str9 = beer8.name();
        java.lang.String str10 = beer8.hop();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(educator7);
        org.junit.Assert.assertNotNull(beer8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Trappistes Rochefort 10" + "'", str9, "Trappistes Rochefort 10");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Saaz" + "'", str10, "Saaz");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DragonBall dragonBall2 = faker1.dragonBall();
        com.github.javafaker.Dune dune3 = faker1.dune();
        java.lang.String str4 = dune3.quote();
        java.lang.String str5 = dune3.title();
        org.junit.Assert.assertNotNull(dragonBall2);
        org.junit.Assert.assertNotNull(dune3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "The Guild... they're fighting me in the mental vaults. They're behind everything. They fear the one who will come, who will know more, who will see more. The Guild is behind everything. It's not finished yet. I'm not formed." + "'", str4, "The Guild... they're fighting me in the mental vaults. They're behind everything. They fear the one who will come, who will know more, who will see more. The Guild is behind everything. It's not finished yet. I'm not formed.");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Fish Speaker" + "'", str5, "Fish Speaker");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.Name name8 = faker1.name();
        java.lang.String str9 = name8.fullName();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(name8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Artie Donnelly" + "'", str9, "Artie Donnelly");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Gender gender5 = faker1.gender();
        com.github.javafaker.Esports esports6 = faker1.esports();
        java.lang.String str7 = esports6.event();
        java.lang.String str8 = esports6.event();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(esports6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "League All Stars" + "'", str7, "League All Stars");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "League All Stars" + "'", str8, "League All Stars");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.SlackEmoji slackEmoji2 = faker1.slackEmoji();
        java.lang.String str3 = slackEmoji2.celebration();
        java.lang.String str4 = slackEmoji2.activity();
        java.lang.String str5 = slackEmoji2.emoji();
        org.junit.Assert.assertNotNull(slackEmoji2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":flags:" + "'", str3, ":flags:");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":mahjong:" + "'", str4, ":mahjong:");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":clock11:" + "'", str5, ":clock11:");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Barcode barcode6 = faker1.barcode();
        com.github.javafaker.Dog dog7 = faker1.dog();
        com.github.javafaker.Country country8 = faker1.country();
        java.lang.String str9 = country8.flag();
        java.lang.String str10 = country8.countryCode3();
        java.lang.String str11 = country8.capital();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(barcode6);
        org.junit.Assert.assertNotNull(dog7);
        org.junit.Assert.assertNotNull(country8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://flags.fmcdn.net/data/flags/w580/li.png" + "'", str9, "http://flags.fmcdn.net/data/flags/w580/li.png");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mhl" + "'", str10, "mhl");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ashgabat" + "'", str11, "Ashgabat");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("Wyoming");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str14 = internet9.image((java.lang.Integer) 199, (java.lang.Integer) 100, (java.lang.Boolean) false, "Diomedes");
        java.lang.String str15 = internet9.domainSuffix();
        java.lang.String str16 = internet9.ipV4Address();
        java.lang.String str19 = internet9.password((int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = internet9.password((int) '5', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wyoming" + "'", str8, "Wyoming");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://lorempixel.com/199/100/abstract/Diomedes" + "'", str14, "http://lorempixel.com/199/100/abstract/Diomedes");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "info" + "'", str15, "info");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "77.220.220.164" + "'", str16, "77.220.220.164");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Hacker hacker5 = faker1.hacker();
        com.github.javafaker.Team team6 = faker1.team();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(team6);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Superhero superhero6 = faker1.superhero();
        com.github.javafaker.Dune dune7 = faker1.dune();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(superhero6);
        org.junit.Assert.assertNotNull(dune7);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Superhero superhero6 = faker1.superhero();
        java.lang.String str7 = superhero6.prefix();
        java.lang.String str8 = superhero6.suffix();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(superhero6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Illustrious" + "'", str7, "Illustrious");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Woman" + "'", str8, "Woman");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        java.lang.String str4 = food3.dish();
        java.lang.String str5 = food3.measurement();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hummus" + "'", str4, "Hummus");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 quart" + "'", str5, "1 quart");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.GameOfThrones gameOfThrones7 = faker1.gameOfThrones();
        com.github.javafaker.Lorem lorem8 = faker1.lorem();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(gameOfThrones7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Job job4 = faker1.job();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Sip sip6 = faker1.sip();
        int int7 = sip6.messagingPort();
        java.lang.String str8 = sip6.contentType();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(job4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(sip6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4268 + "'", int7 == 4268);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "application/resource-lists" + "'", str8, "application/resource-lists");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.provisionalResponseCode();
        int int6 = sip4.messagingPort();
        java.lang.String str7 = sip4.provisionalResponsePhrase();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 181 + "'", int5 == 181);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3904 + "'", int6 == 3904);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Call Is Being Forwarded" + "'", str7, "Call Is Being Forwarded");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.Ancient ancient8 = faker1.ancient();
        com.github.javafaker.Friends friends9 = faker1.friends();
        com.github.javafaker.HitchhikersGuideToTheGalaxy hitchhikersGuideToTheGalaxy10 = faker1.hitchhikersGuideToTheGalaxy();
        java.lang.String str11 = hitchhikersGuideToTheGalaxy10.specie();
        java.lang.String str12 = hitchhikersGuideToTheGalaxy10.starship();
        java.lang.String str13 = hitchhikersGuideToTheGalaxy10.character();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
        org.junit.Assert.assertNotNull(friends9);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ravenous Bugblatter Beast of Traal" + "'", str11, "Ravenous Bugblatter Beast of Traal");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Heart of Gold" + "'", str12, "Heart of Gold");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Trin Tragula" + "'", str13, "Trin Tragula");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Hacker hacker5 = faker1.hacker();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        java.util.List<java.lang.String> strList8 = lorem6.paragraphs((int) (byte) 1);
        java.lang.String str9 = lorem6.word();
        java.lang.String str10 = lorem6.sentence();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(strList8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "consequuntur" + "'", str9, "consequuntur");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Quidem omnis quis impedit est sint unde." + "'", str10, "Quidem omnis quis impedit est sint unde.");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("Wyoming");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str10 = internet9.userAgentAny();
        java.lang.String str12 = internet9.emailAddress("427-35307");
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wyoming" + "'", str8, "Wyoming");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mozilla/5.0 (Windows NT 5.1; rv:7.0.1) Gecko/20100101 Firefox/7.0.1" + "'", str10, "Mozilla/5.0 (Windows NT 5.1; rv:7.0.1) Gecko/20100101 Firefox/7.0.1");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DragonBall dragonBall2 = faker1.dragonBall();
        com.github.javafaker.Dune dune3 = faker1.dune();
        com.github.javafaker.Dune.Saying saying4 = com.github.javafaker.Dune.Saying.MENTAT;
        java.lang.String str5 = dune3.saying(saying4);
        java.lang.String str6 = dune3.quote();
        com.github.javafaker.Dune.Quote quote7 = com.github.javafaker.Dune.Quote.ALIA;
        java.lang.String str8 = dune3.quote(quote7);
        java.lang.String str9 = dune3.title();
        org.junit.Assert.assertNotNull(dragonBall2);
        org.junit.Assert.assertNotNull(dune3);
        org.junit.Assert.assertTrue("'" + saying4 + "' != '" + com.github.javafaker.Dune.Saying.MENTAT + "'", saying4.equals(com.github.javafaker.Dune.Saying.MENTAT));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Memory never recaptures reality. Memory reconstructs reality. Reconstructions change the original, becoming external frames of reference that inevitably fail." + "'", str5, "Memory never recaptures reality. Memory reconstructs reality. Reconstructions change the original, becoming external frames of reference that inevitably fail.");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "I made my peace gesture. The forms of kanly have been obeyed!" + "'", str6, "I made my peace gesture. The forms of kanly have been obeyed!");
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + com.github.javafaker.Dune.Quote.ALIA + "'", quote7.equals(com.github.javafaker.Dune.Quote.ALIA));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "The Guild... they're fighting me in the mental vaults. They're behind everything. They fear the one who will come, who will know more, who will see more. The Guild is behind everything. It's not finished yet. I'm not formed." + "'", str8, "The Guild... they're fighting me in the mental vaults. They're behind everything. They fear the one who will come, who will know more, who will see more. The Guild is behind everything. It's not finished yet. I'm not formed.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Fish Speaker" + "'", str9, "Fish Speaker");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Job job4 = faker1.job();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Sip sip6 = faker1.sip();
        com.github.javafaker.Yoda yoda7 = faker1.yoda();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(job4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(sip6);
        org.junit.Assert.assertNotNull(yoda7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.OPERA;
        java.lang.String str1 = userAgent0.toString();
        java.lang.String str2 = userAgent0.toString();
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.OPERA + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.OPERA));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "opera" + "'", str1, "opera");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "opera" + "'", str2, "opera");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Medical medical4 = faker1.medical();
        java.lang.String str5 = medical4.medicineName();
        java.lang.String str6 = medical4.hospitalName();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(medical4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ATROPINE" + "'", str5, "ATROPINE");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GALION COMMUNITY HOSPITAL" + "'", str6, "GALION COMMUNITY HOSPITAL");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Company company6 = faker1.company();
        java.lang.String str7 = company6.name();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(company6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mosciski, Bosco and Sawayn" + "'", str7, "Mosciski, Bosco and Sawayn");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Gender gender5 = faker1.gender();
        com.github.javafaker.Beer beer6 = faker1.beer();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(beer6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        java.lang.String str5 = hacker4.noun();
        java.lang.String str6 = hacker4.ingverb();
        java.lang.String str7 = hacker4.adjective();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "alarm" + "'", str5, "alarm");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "compressing" + "'", str6, "compressing");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "primary" + "'", str7, "primary");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Basketball basketball5 = faker1.basketball();
        com.github.javafaker.University university6 = faker1.university();
        com.github.javafaker.Relationships relationships7 = faker1.relationships();
        java.lang.String str8 = relationships7.direct();
        java.lang.String str9 = relationships7.any();
        java.lang.String str10 = relationships7.inLaw();
        java.lang.String str11 = relationships7.extended();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(basketball5);
        org.junit.Assert.assertNotNull(university6);
        org.junit.Assert.assertNotNull(relationships7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Father" + "'", str8, "Father");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Sister" + "'", str9, "Sister");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Brother-in-law" + "'", str10, "Brother-in-law");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Grandfather" + "'", str11, "Grandfather");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Hacker hacker5 = faker1.hacker();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        java.lang.String str8 = lorem6.paragraph(1);
        java.lang.String str13 = lorem6.characters((-1), (int) (short) 0, true, true);
        char char14 = lorem6.character();
        java.lang.String str15 = lorem6.word();
        java.lang.String str20 = lorem6.characters((int) '5', 3904, false, true);
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(lorem6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Pariatur ducimus corrupti velit quos aperiam. Consequatur accusamus quod delectus tenetur hic aliquam. Ex ullam dolores." + "'", str8, "Pariatur ducimus corrupti velit quos aperiam. Consequatur accusamus quod delectus tenetur hic aliquam. Ex ullam dolores.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertTrue("'" + char14 + "' != '" + '1' + "'", char14 == '1');
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "voluptatibus" + "'", str15, "voluptatibus");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2e0w0fzvtur8eeqxom1lodfapj7feba0l437iv19qo76r18apdudj4" + "'", str20, "2e0w0fzvtur8eeqxom1lodfapj7feba0l437iv19qo76r18apdudj4");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        java.lang.String str4 = idNumber3.valid();
        java.lang.String str5 = idNumber3.invalid();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "257-85-1167" + "'", str4, "257-85-1167");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "723-00-5744" + "'", str5, "723-00-5744");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("Wyoming");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("Griffin");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = internet9.password((int) ' ', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wyoming" + "'", str8, "Wyoming");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Griffin:d9:97:b3:59:18" + "'", str11, "Griffin:d9:97:b3:59:18");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.File file8 = faker1.file();
        com.github.javafaker.Medical medical9 = faker1.medical();
        com.github.javafaker.Gender gender10 = faker1.gender();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNotNull(medical9);
        org.junit.Assert.assertNotNull(gender10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.github.javafaker.service.FakeValuesGrouping fakeValuesGrouping0 = new com.github.javafaker.service.FakeValuesGrouping();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.camera();
        java.lang.String str4 = photography2.lens();
        java.lang.String str5 = photography2.shutter();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nikon S3M" + "'", str3, "Nikon S3M");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "135mm/4" + "'", str4, "135mm/4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.github.javafaker.Dune.Quote quote0 = com.github.javafaker.Dune.Quote.EMPEROR;
        org.junit.Assert.assertTrue("'" + quote0 + "' != '" + com.github.javafaker.Dune.Quote.EMPEROR + "'", quote0.equals(com.github.javafaker.Dune.Quote.EMPEROR));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.rtpPort();
        int int6 = sip4.rtpPort();
        java.lang.String str7 = sip4.provisionalResponsePhrase();
        int int8 = sip4.serverErrorResponseCode();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 44888 + "'", int5 == 44888);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40042 + "'", int6 == 40042);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Queued" + "'", str7, "Queued");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 501 + "'", int8 == 501);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Options options4 = faker1.options();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Avatar avatar7 = faker6.avatar();
        com.github.javafaker.SlackEmoji slackEmoji8 = faker6.slackEmoji();
        com.github.javafaker.Medical medical9 = faker6.medical();
        com.github.javafaker.Robin robin10 = faker6.robin();
        com.github.javafaker.BojackHorseman bojackHorseman11 = faker6.bojackHorseman();
        com.github.javafaker.Demographic demographic12 = faker6.demographic();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Avatar avatar15 = faker14.avatar();
        com.github.javafaker.SlackEmoji slackEmoji16 = faker14.slackEmoji();
        com.github.javafaker.Medical medical17 = faker14.medical();
        com.github.javafaker.Robin robin18 = faker14.robin();
        com.github.javafaker.BojackHorseman bojackHorseman19 = faker14.bojackHorseman();
        com.github.javafaker.Demographic demographic20 = faker14.demographic();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Avatar avatar23 = faker22.avatar();
        com.github.javafaker.SlackEmoji slackEmoji24 = faker22.slackEmoji();
        com.github.javafaker.Medical medical25 = faker22.medical();
        com.github.javafaker.Robin robin26 = faker22.robin();
        com.github.javafaker.BojackHorseman bojackHorseman27 = faker22.bojackHorseman();
        com.github.javafaker.Demographic demographic28 = faker22.demographic();
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Avatar avatar31 = faker30.avatar();
        com.github.javafaker.SlackEmoji slackEmoji32 = faker30.slackEmoji();
        com.github.javafaker.Medical medical33 = faker30.medical();
        com.github.javafaker.Robin robin34 = faker30.robin();
        com.github.javafaker.BojackHorseman bojackHorseman35 = faker30.bojackHorseman();
        com.github.javafaker.Demographic demographic36 = faker30.demographic();
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Avatar avatar39 = faker38.avatar();
        com.github.javafaker.SlackEmoji slackEmoji40 = faker38.slackEmoji();
        com.github.javafaker.Medical medical41 = faker38.medical();
        com.github.javafaker.Robin robin42 = faker38.robin();
        com.github.javafaker.BojackHorseman bojackHorseman43 = faker38.bojackHorseman();
        com.github.javafaker.Demographic demographic44 = faker38.demographic();
        com.github.javafaker.Demographic[] demographicArray45 = new com.github.javafaker.Demographic[] { demographic12, demographic20, demographic28, demographic36, demographic44 };
        com.github.javafaker.Demographic demographic46 = options4.option(demographicArray45);
        java.lang.String str47 = demographic46.maritalStatus();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(avatar7);
        org.junit.Assert.assertNotNull(slackEmoji8);
        org.junit.Assert.assertNotNull(medical9);
        org.junit.Assert.assertNotNull(robin10);
        org.junit.Assert.assertNotNull(bojackHorseman11);
        org.junit.Assert.assertNotNull(demographic12);
        org.junit.Assert.assertNotNull(avatar15);
        org.junit.Assert.assertNotNull(slackEmoji16);
        org.junit.Assert.assertNotNull(medical17);
        org.junit.Assert.assertNotNull(robin18);
        org.junit.Assert.assertNotNull(bojackHorseman19);
        org.junit.Assert.assertNotNull(demographic20);
        org.junit.Assert.assertNotNull(avatar23);
        org.junit.Assert.assertNotNull(slackEmoji24);
        org.junit.Assert.assertNotNull(medical25);
        org.junit.Assert.assertNotNull(robin26);
        org.junit.Assert.assertNotNull(bojackHorseman27);
        org.junit.Assert.assertNotNull(demographic28);
        org.junit.Assert.assertNotNull(avatar31);
        org.junit.Assert.assertNotNull(slackEmoji32);
        org.junit.Assert.assertNotNull(medical33);
        org.junit.Assert.assertNotNull(robin34);
        org.junit.Assert.assertNotNull(bojackHorseman35);
        org.junit.Assert.assertNotNull(demographic36);
        org.junit.Assert.assertNotNull(avatar39);
        org.junit.Assert.assertNotNull(slackEmoji40);
        org.junit.Assert.assertNotNull(medical41);
        org.junit.Assert.assertNotNull(robin42);
        org.junit.Assert.assertNotNull(bojackHorseman43);
        org.junit.Assert.assertNotNull(demographic44);
        org.junit.Assert.assertNotNull(demographicArray45);
        org.junit.Assert.assertNotNull(demographic46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Widowed" + "'", str47, "Widowed");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.Nation nation7 = faker1.nation();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(nation7);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.Beer beer7 = faker1.beer();
        com.github.javafaker.Hacker hacker8 = faker1.hacker();
        java.lang.String str9 = hacker8.adjective();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(beer7);
        org.junit.Assert.assertNotNull(hacker8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "primary" + "'", str9, "primary");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Job job4 = faker1.job();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Sip sip6 = faker1.sip();
        com.github.javafaker.Coin coin7 = faker1.coin();
        com.github.javafaker.Photography photography8 = faker1.photography();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(job4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(sip6);
        org.junit.Assert.assertNotNull(coin7);
        org.junit.Assert.assertNotNull(photography8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.Beer beer7 = faker1.beer();
        java.lang.String str8 = beer7.hop();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(beer7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cluster" + "'", str8, "Cluster");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = com.github.javafaker.Faker.instance(random0);
        com.github.javafaker.StarTrek starTrek2 = faker1.starTrek();
        java.lang.String str3 = starTrek2.location();
        java.lang.String str4 = starTrek2.villain();
        org.junit.Assert.assertNotNull(faker1);
        org.junit.Assert.assertNotNull(starTrek2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Beta Quadrant" + "'", str3, "Beta Quadrant");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "God of Sha Ka Ree" + "'", str4, "God of Sha Ka Ree");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Music music2 = faker1.music();
        java.lang.String str3 = music2.instrument();
        java.lang.String str4 = music2.key();
        org.junit.Assert.assertNotNull(music2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Trumpet" + "'", str3, "Trumpet");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ab" + "'", str4, "Ab");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Barcode barcode6 = faker1.barcode();
        com.github.javafaker.Dog dog7 = faker1.dog();
        java.lang.String str8 = dog7.size();
        java.lang.String str9 = dog7.gender();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(barcode6);
        org.junit.Assert.assertNotNull(dog7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "large" + "'", str8, "large");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "male" + "'", str9, "male");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("Wyoming");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str10 = internet9.ipV4Address();
        java.lang.String str15 = internet9.image((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Boolean) true, "Fujifilm");
        java.lang.String str16 = internet9.url();
        com.github.javafaker.Internet.UserAgent userAgent17 = com.github.javafaker.Internet.UserAgent.OPERA;
        java.lang.String str18 = internet9.userAgent(userAgent17);
        java.lang.String str19 = userAgent17.toString();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wyoming" + "'", str8, "Wyoming");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "214.111.58.168" + "'", str10, "214.111.58.168");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://lorempixel.com/g/-1/0/people/Fujifilm" + "'", str15, "http://lorempixel.com/g/-1/0/people/Fujifilm");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "www.lizbeth-veum.biz" + "'", str16, "www.lizbeth-veum.biz");
        org.junit.Assert.assertTrue("'" + userAgent17 + "' != '" + com.github.javafaker.Internet.UserAgent.OPERA + "'", userAgent17.equals(com.github.javafaker.Internet.UserAgent.OPERA));
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36 OPR/43.0.2442.991" + "'", str18, "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36 OPR/43.0.2442.991");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "opera" + "'", str19, "opera");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.Cat cat4 = faker1.cat();
        com.github.javafaker.Currency currency5 = new com.github.javafaker.Currency(faker1);
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(cat4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.github.javafaker.Internet.UserAgent userAgent0 = com.github.javafaker.Internet.UserAgent.SAFARI;
        org.junit.Assert.assertTrue("'" + userAgent0 + "' != '" + com.github.javafaker.Internet.UserAgent.SAFARI + "'", userAgent0.equals(com.github.javafaker.Internet.UserAgent.SAFARI));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("Wyoming");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str14 = internet9.image((java.lang.Integer) 199, (java.lang.Integer) 100, (java.lang.Boolean) false, "Diomedes");
        java.lang.String str15 = internet9.domainSuffix();
        java.lang.String str16 = internet9.url();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wyoming" + "'", str8, "Wyoming");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://lorempixel.com/199/100/technics/Diomedes" + "'", str14, "http://lorempixel.com/199/100/technics/Diomedes");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "net" + "'", str15, "net");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "www.ashlee-sawayn.org" + "'", str16, "www.ashlee-sawayn.org");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Medical medical4 = faker1.medical();
        java.lang.String str5 = medical4.hospitalName();
        java.lang.String str6 = medical4.hospitalName();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(medical4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JACK C. MONTGOMERY VA MEDICAL CENTER" + "'", str5, "JACK C. MONTGOMERY VA MEDICAL CENTER");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TEXAS HEALTH ARLINGTON MEMORIAL HOSPITAL" + "'", str6, "TEXAS HEALTH ARLINGTON MEMORIAL HOSPITAL");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Hacker hacker5 = faker1.hacker();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        java.util.List<java.lang.String> strList8 = lorem6.paragraphs((int) (byte) 1);
        java.lang.String str9 = lorem6.paragraph();
        char char10 = lorem6.character();
        java.lang.String str12 = lorem6.sentence((int) '4');
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(strList8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Tempore perspiciatis et debitis ab ullam. Ipsa deserunt repudiandae laboriosam accusamus rem ea. Veritatis asperiores sint voluptates eos. Reprehenderit ex cum et et repellat." + "'", str9, "Tempore perspiciatis et debitis ab ullam. Ipsa deserunt repudiandae laboriosam accusamus rem ea. Veritatis asperiores sint voluptates eos. Reprehenderit ex cum et et repellat.");
// flaky:         org.junit.Assert.assertTrue("'" + char10 + "' != '" + '3' + "'", char10 == '3');
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hic qui tenetur nostrum ut et eaque sit molestiae ea est voluptatem rem voluptate voluptatum amet nemo inventore qui nam ut sequi harum libero sit consequatur inventore assumenda deserunt ullam reiciendis quo eum voluptate officia dolore quisquam deserunt explicabo illo consequatur facilis debitis architecto est enim quam impedit ipsa consequuntur aut officia id rerum molestiae unde." + "'", str12, "Hic qui tenetur nostrum ut et eaque sit molestiae ea est voluptatem rem voluptate voluptatum amet nemo inventore qui nam ut sequi harum libero sit consequatur inventore assumenda deserunt ullam reiciendis quo eum voluptate officia dolore quisquam deserunt explicabo illo consequatur facilis debitis architecto est enim quam impedit ipsa consequuntur aut officia id rerum molestiae unde.");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        java.lang.String str4 = faker1.numerify("port");
        com.github.javafaker.Zelda zelda5 = faker1.zelda();
        java.lang.String str6 = zelda5.character();
        java.lang.String str7 = zelda5.game();
        java.lang.String str8 = zelda5.game();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "port" + "'", str4, "port");
        org.junit.Assert.assertNotNull(zelda5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Kuhn Sidajj" + "'", str6, "Kuhn Sidajj");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Phantom Hourglass" + "'", str7, "Phantom Hourglass");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Link's Awakening" + "'", str8, "Link's Awakening");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        com.github.javafaker.Coin coin4 = faker1.coin();
        com.github.javafaker.DragonBall dragonBall5 = faker1.dragonBall();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(coin4);
        org.junit.Assert.assertNotNull(dragonBall5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Stock stock6 = faker1.stock();
        java.lang.String str8 = faker1.bothify("17mm/2.0");
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(stock6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "17mm/2.0" + "'", str8, "17mm/2.0");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        java.lang.String str5 = faker1.numerify("Grandson");
        com.github.javafaker.TwinPeaks twinPeaks6 = faker1.twinPeaks();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Grandson" + "'", str5, "Grandson");
        org.junit.Assert.assertNotNull(twinPeaks6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.ChuckNorris chuckNorris8 = faker1.chuckNorris();
        com.github.javafaker.HarryPotter harryPotter9 = faker1.harryPotter();
        java.lang.String str10 = harryPotter9.location();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(chuckNorris8);
        org.junit.Assert.assertNotNull(harryPotter9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Diagon Alley" + "'", str10, "Diagon Alley");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.github.javafaker.idnumbers.SvSEIdNumber svSEIdNumber0 = new com.github.javafaker.idnumbers.SvSEIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Photography photography3 = faker2.photography();
        com.github.javafaker.Food food4 = faker2.food();
        com.github.javafaker.Job job5 = faker2.job();
        java.lang.String str6 = svSEIdNumber0.getValidSsn(faker2);
        com.github.javafaker.SlackEmoji slackEmoji7 = faker2.slackEmoji();
        java.lang.String str8 = slackEmoji7.foodAndDrink();
        org.junit.Assert.assertNotNull(photography3);
        org.junit.Assert.assertNotNull(food4);
        org.junit.Assert.assertNotNull(job5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "201105+4224" + "'", str6, "201105+4224");
        org.junit.Assert.assertNotNull(slackEmoji7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + ":sake:" + "'", str8, ":sake:");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Gender gender5 = faker1.gender();
        com.github.javafaker.ChuckNorris chuckNorris6 = faker1.chuckNorris();
        com.github.javafaker.Witcher witcher7 = faker1.witcher();
        java.lang.String str8 = witcher7.monster();
        java.lang.String str9 = witcher7.witcher();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(chuckNorris6);
        org.junit.Assert.assertNotNull(witcher7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Berserker" + "'", str8, "Berserker");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Eskel" + "'", str9, "Eskel");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Options options4 = faker1.options();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Avatar avatar7 = faker6.avatar();
        com.github.javafaker.SlackEmoji slackEmoji8 = faker6.slackEmoji();
        com.github.javafaker.Medical medical9 = faker6.medical();
        com.github.javafaker.Robin robin10 = faker6.robin();
        com.github.javafaker.BojackHorseman bojackHorseman11 = faker6.bojackHorseman();
        com.github.javafaker.Demographic demographic12 = faker6.demographic();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Avatar avatar15 = faker14.avatar();
        com.github.javafaker.SlackEmoji slackEmoji16 = faker14.slackEmoji();
        com.github.javafaker.Medical medical17 = faker14.medical();
        com.github.javafaker.Robin robin18 = faker14.robin();
        com.github.javafaker.BojackHorseman bojackHorseman19 = faker14.bojackHorseman();
        com.github.javafaker.Demographic demographic20 = faker14.demographic();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Avatar avatar23 = faker22.avatar();
        com.github.javafaker.SlackEmoji slackEmoji24 = faker22.slackEmoji();
        com.github.javafaker.Medical medical25 = faker22.medical();
        com.github.javafaker.Robin robin26 = faker22.robin();
        com.github.javafaker.BojackHorseman bojackHorseman27 = faker22.bojackHorseman();
        com.github.javafaker.Demographic demographic28 = faker22.demographic();
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Avatar avatar31 = faker30.avatar();
        com.github.javafaker.SlackEmoji slackEmoji32 = faker30.slackEmoji();
        com.github.javafaker.Medical medical33 = faker30.medical();
        com.github.javafaker.Robin robin34 = faker30.robin();
        com.github.javafaker.BojackHorseman bojackHorseman35 = faker30.bojackHorseman();
        com.github.javafaker.Demographic demographic36 = faker30.demographic();
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Avatar avatar39 = faker38.avatar();
        com.github.javafaker.SlackEmoji slackEmoji40 = faker38.slackEmoji();
        com.github.javafaker.Medical medical41 = faker38.medical();
        com.github.javafaker.Robin robin42 = faker38.robin();
        com.github.javafaker.BojackHorseman bojackHorseman43 = faker38.bojackHorseman();
        com.github.javafaker.Demographic demographic44 = faker38.demographic();
        com.github.javafaker.Demographic[] demographicArray45 = new com.github.javafaker.Demographic[] { demographic12, demographic20, demographic28, demographic36, demographic44 };
        com.github.javafaker.Demographic demographic46 = options4.option(demographicArray45);
        java.util.Random random47 = null;
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random47);
        com.github.javafaker.Avatar avatar49 = faker48.avatar();
        com.github.javafaker.SlackEmoji slackEmoji50 = faker48.slackEmoji();
        com.github.javafaker.Medical medical51 = faker48.medical();
        com.github.javafaker.Robin robin52 = faker48.robin();
        com.github.javafaker.BojackHorseman bojackHorseman53 = faker48.bojackHorseman();
        com.github.javafaker.Demographic demographic54 = faker48.demographic();
        com.github.javafaker.Ancient ancient55 = faker48.ancient();
        com.github.javafaker.Friends friends56 = faker48.friends();
        java.util.Random random57 = null;
        com.github.javafaker.Faker faker58 = new com.github.javafaker.Faker(random57);
        com.github.javafaker.Avatar avatar59 = faker58.avatar();
        com.github.javafaker.SlackEmoji slackEmoji60 = faker58.slackEmoji();
        com.github.javafaker.Medical medical61 = faker58.medical();
        com.github.javafaker.Robin robin62 = faker58.robin();
        com.github.javafaker.BojackHorseman bojackHorseman63 = faker58.bojackHorseman();
        com.github.javafaker.Demographic demographic64 = faker58.demographic();
        com.github.javafaker.Ancient ancient65 = faker58.ancient();
        com.github.javafaker.Friends friends66 = faker58.friends();
        com.github.javafaker.Friends[] friendsArray67 = new com.github.javafaker.Friends[] { friends56, friends66 };
        com.github.javafaker.Friends friends68 = options4.nextElement(friendsArray67);
        com.github.javafaker.Dune.Saying saying69 = com.github.javafaker.Dune.Saying.FREMEN;
        java.lang.Class<?> wildcardClass70 = saying69.getClass();
        java.lang.Class[] classArray72 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray73 = (java.lang.Class<?>[]) classArray72;
        wildcardClassArray73[0] = wildcardClass70;
        java.lang.Class<?> wildcardClass76 = options4.option(wildcardClassArray73);
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(avatar7);
        org.junit.Assert.assertNotNull(slackEmoji8);
        org.junit.Assert.assertNotNull(medical9);
        org.junit.Assert.assertNotNull(robin10);
        org.junit.Assert.assertNotNull(bojackHorseman11);
        org.junit.Assert.assertNotNull(demographic12);
        org.junit.Assert.assertNotNull(avatar15);
        org.junit.Assert.assertNotNull(slackEmoji16);
        org.junit.Assert.assertNotNull(medical17);
        org.junit.Assert.assertNotNull(robin18);
        org.junit.Assert.assertNotNull(bojackHorseman19);
        org.junit.Assert.assertNotNull(demographic20);
        org.junit.Assert.assertNotNull(avatar23);
        org.junit.Assert.assertNotNull(slackEmoji24);
        org.junit.Assert.assertNotNull(medical25);
        org.junit.Assert.assertNotNull(robin26);
        org.junit.Assert.assertNotNull(bojackHorseman27);
        org.junit.Assert.assertNotNull(demographic28);
        org.junit.Assert.assertNotNull(avatar31);
        org.junit.Assert.assertNotNull(slackEmoji32);
        org.junit.Assert.assertNotNull(medical33);
        org.junit.Assert.assertNotNull(robin34);
        org.junit.Assert.assertNotNull(bojackHorseman35);
        org.junit.Assert.assertNotNull(demographic36);
        org.junit.Assert.assertNotNull(avatar39);
        org.junit.Assert.assertNotNull(slackEmoji40);
        org.junit.Assert.assertNotNull(medical41);
        org.junit.Assert.assertNotNull(robin42);
        org.junit.Assert.assertNotNull(bojackHorseman43);
        org.junit.Assert.assertNotNull(demographic44);
        org.junit.Assert.assertNotNull(demographicArray45);
        org.junit.Assert.assertNotNull(demographic46);
        org.junit.Assert.assertNotNull(avatar49);
        org.junit.Assert.assertNotNull(slackEmoji50);
        org.junit.Assert.assertNotNull(medical51);
        org.junit.Assert.assertNotNull(robin52);
        org.junit.Assert.assertNotNull(bojackHorseman53);
        org.junit.Assert.assertNotNull(demographic54);
        org.junit.Assert.assertNotNull(ancient55);
        org.junit.Assert.assertNotNull(friends56);
        org.junit.Assert.assertNotNull(avatar59);
        org.junit.Assert.assertNotNull(slackEmoji60);
        org.junit.Assert.assertNotNull(medical61);
        org.junit.Assert.assertNotNull(robin62);
        org.junit.Assert.assertNotNull(bojackHorseman63);
        org.junit.Assert.assertNotNull(demographic64);
        org.junit.Assert.assertNotNull(ancient65);
        org.junit.Assert.assertNotNull(friends66);
        org.junit.Assert.assertNotNull(friendsArray67);
        org.junit.Assert.assertNotNull(friends68);
        org.junit.Assert.assertTrue("'" + saying69 + "' != '" + com.github.javafaker.Dune.Saying.FREMEN + "'", saying69.equals(com.github.javafaker.Dune.Saying.FREMEN));
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(classArray72);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Barcode barcode6 = faker1.barcode();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        java.lang.String str8 = demographic7.maritalStatus();
        java.lang.String str9 = demographic7.demonym();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(barcode6);
        org.junit.Assert.assertNotNull(demographic7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Never married" + "'", str8, "Never married");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Afghan" + "'", str9, "Afghan");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Hacker hacker5 = faker1.hacker();
        com.github.javafaker.Lebowski lebowski6 = new com.github.javafaker.Lebowski(faker1);
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(hacker5);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Gender gender5 = faker1.gender();
        java.lang.String str6 = gender5.binaryTypes();
        java.lang.String str7 = gender5.types();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Male" + "'", str6, "Male");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Female" + "'", str7, "Female");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("Wyoming");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str10 = internet9.avatar();
        java.lang.String str11 = internet9.ipV4Address();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wyoming" + "'", str8, "Wyoming");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "https://s3.amazonaws.com/uifaces/faces/twitter/alan_zhang_/128.jpg" + "'", str10, "https://s3.amazonaws.com/uifaces/faces/twitter/alan_zhang_/128.jpg");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35.78.130.162" + "'", str11, "35.78.130.162");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        java.lang.String str4 = idNumber3.invalidSvSeSsn();
        java.lang.String str5 = idNumber3.valid();
        java.lang.String str6 = idNumber3.invalid();
        java.lang.String str7 = idNumber3.invalidSvSeSsn();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "955590-0031" + "'", str4, "955590-0031");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207-74-8204" + "'", str5, "207-74-8204");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "483-74-0000" + "'", str6, "483-74-0000");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "247900-5004" + "'", str7, "247900-5004");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.lang.String str1 = com.github.javafaker.service.FakerIDN.toASCII("5000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5000" + "'", str1, "5000");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.Educator educator7 = faker1.educator();
        java.lang.String str8 = educator7.secondarySchool();
        java.lang.String str9 = educator7.campus();
        java.lang.String str10 = educator7.campus();
        java.lang.String str11 = educator7.secondarySchool();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(educator7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Falconholt High" + "'", str8, "Falconholt High");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Brookville Campus" + "'", str9, "Brookville Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lakeacre Campus" + "'", str10, "Lakeacre Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Marblewald High" + "'", str11, "Marblewald High");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Basketball basketball5 = faker1.basketball();
        com.github.javafaker.University university6 = faker1.university();
        com.github.javafaker.Relationships relationships7 = faker1.relationships();
        java.lang.String str8 = relationships7.direct();
        java.lang.String str9 = relationships7.spouse();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(basketball5);
        org.junit.Assert.assertNotNull(university6);
        org.junit.Assert.assertNotNull(relationships7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Brother" + "'", str8, "Brother");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Wife" + "'", str9, "Wife");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Animal animal5 = faker1.animal();
        com.github.javafaker.Currency currency6 = faker1.currency();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(animal5);
        org.junit.Assert.assertNotNull(currency6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.ChuckNorris chuckNorris8 = faker1.chuckNorris();
        com.github.javafaker.HarryPotter harryPotter9 = faker1.harryPotter();
        java.lang.String str10 = harryPotter9.book();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(chuckNorris8);
        org.junit.Assert.assertNotNull(harryPotter9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Harry Potter and the Order of the Phoenix" + "'", str10, "Harry Potter and the Order of the Phoenix");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        com.github.javafaker.IdNumber idNumber7 = faker1.idNumber();
        com.github.javafaker.ChuckNorris chuckNorris8 = faker1.chuckNorris();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertNotNull(idNumber7);
        org.junit.Assert.assertNotNull(chuckNorris8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.Educator educator7 = faker1.educator();
        com.github.javafaker.Beer beer8 = faker1.beer();
        com.github.javafaker.EnglandFootBall englandFootBall9 = faker1.englandfootball();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(educator7);
        org.junit.Assert.assertNotNull(beer8);
        org.junit.Assert.assertNotNull(englandFootBall9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.ChuckNorris chuckNorris8 = faker1.chuckNorris();
        com.github.javafaker.HarryPotter harryPotter9 = faker1.harryPotter();
        java.lang.String str10 = harryPotter9.quote();
        java.lang.String str11 = harryPotter9.spell();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(chuckNorris8);
        org.junit.Assert.assertNotNull(harryPotter9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Things we lose have a way of coming back to us in the end, if not always in the way we expect." + "'", str10, "Things we lose have a way of coming back to us in the end, if not always in the way we expect.");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Expelliarmus" + "'", str11, "Expelliarmus");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.Beer beer7 = faker1.beer();
        com.github.javafaker.TwinPeaks twinPeaks8 = faker1.twinPeaks();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(beer7);
        org.junit.Assert.assertNotNull(twinPeaks8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("Wyoming");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str10 = internet9.ipV4Address();
        java.lang.String str15 = internet9.image((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Boolean) true, "Fujifilm");
        java.lang.String str16 = internet9.url();
        com.github.javafaker.Internet.UserAgent userAgent17 = com.github.javafaker.Internet.UserAgent.OPERA;
        java.lang.String str18 = internet9.userAgent(userAgent17);
        java.lang.String str19 = internet9.uuid();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wyoming" + "'", str8, "Wyoming");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "205.144.106.116" + "'", str10, "205.144.106.116");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://lorempixel.com/g/-1/0/abstract/Fujifilm" + "'", str15, "http://lorempixel.com/g/-1/0/abstract/Fujifilm");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "www.herschel-breitenberg.name" + "'", str16, "www.herschel-breitenberg.name");
        org.junit.Assert.assertTrue("'" + userAgent17 + "' != '" + com.github.javafaker.Internet.UserAgent.OPERA + "'", userAgent17.equals(com.github.javafaker.Internet.UserAgent.OPERA));
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Opera/9.80 (Windows NT 6.0) Presto/2.12.388 Version/12.14" + "'", str18, "Opera/9.80 (Windows NT 6.0) Presto/2.12.388 Version/12.14");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "55d197fa-ce84-4b16-85cd-a399adb84d4e" + "'", str19, "55d197fa-ce84-4b16-85cd-a399adb84d4e");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Hacker hacker5 = faker1.hacker();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        java.lang.String str8 = lorem6.paragraph(1);
        java.lang.String str13 = lorem6.characters((-1), (int) (short) 0, true, true);
        char char14 = lorem6.character();
        java.lang.String str16 = lorem6.sentence((int) '5');
        java.util.List<java.lang.String> strList18 = lorem6.words(199);
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(lorem6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Quos laboriosam quasi ut nobis. Itaque nesciunt dolores et est aut vel nam. Deleniti officia odio eius." + "'", str8, "Quos laboriosam quasi ut nobis. Itaque nesciunt dolores et est aut vel nam. Deleniti officia odio eius.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'g' + "'", char14 == 'g');
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Eum provident ut totam necessitatibus ut necessitatibus quas ducimus occaecati sunt repellat error quia vel ut ab iste et veritatis sint eum quia laborum quis corporis ullam adipisci eum aut pariatur autem eos recusandae autem omnis ut nisi beatae optio eos officia fugit unde suscipit quasi consectetur ad autem et voluptatibus reprehenderit distinctio voluptatum id." + "'", str16, "Eum provident ut totam necessitatibus ut necessitatibus quas ducimus occaecati sunt repellat error quia vel ut ab iste et veritatis sint eum quia laborum quis corporis ullam adipisci eum aut pariatur autem eos recusandae autem omnis ut nisi beatae optio eos officia fugit unde suscipit quasi consectetur ad autem et voluptatibus reprehenderit distinctio voluptatum id.");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Job job4 = faker1.job();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Sip sip6 = faker1.sip();
        com.github.javafaker.Coin coin7 = faker1.coin();
        java.lang.String str8 = coin7.flip();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(job4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(sip6);
        org.junit.Assert.assertNotNull(coin7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Tails" + "'", str8, "Tails");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.Educator educator7 = faker1.educator();
        java.lang.String str10 = faker1.letterify("149.186.156.211", false);
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(educator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "149.186.156.211" + "'", str10, "149.186.156.211");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Options options4 = faker1.options();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Avatar avatar7 = faker6.avatar();
        com.github.javafaker.SlackEmoji slackEmoji8 = faker6.slackEmoji();
        com.github.javafaker.Medical medical9 = faker6.medical();
        com.github.javafaker.Robin robin10 = faker6.robin();
        com.github.javafaker.BojackHorseman bojackHorseman11 = faker6.bojackHorseman();
        com.github.javafaker.Demographic demographic12 = faker6.demographic();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Avatar avatar15 = faker14.avatar();
        com.github.javafaker.SlackEmoji slackEmoji16 = faker14.slackEmoji();
        com.github.javafaker.Medical medical17 = faker14.medical();
        com.github.javafaker.Robin robin18 = faker14.robin();
        com.github.javafaker.BojackHorseman bojackHorseman19 = faker14.bojackHorseman();
        com.github.javafaker.Demographic demographic20 = faker14.demographic();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Avatar avatar23 = faker22.avatar();
        com.github.javafaker.SlackEmoji slackEmoji24 = faker22.slackEmoji();
        com.github.javafaker.Medical medical25 = faker22.medical();
        com.github.javafaker.Robin robin26 = faker22.robin();
        com.github.javafaker.BojackHorseman bojackHorseman27 = faker22.bojackHorseman();
        com.github.javafaker.Demographic demographic28 = faker22.demographic();
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Avatar avatar31 = faker30.avatar();
        com.github.javafaker.SlackEmoji slackEmoji32 = faker30.slackEmoji();
        com.github.javafaker.Medical medical33 = faker30.medical();
        com.github.javafaker.Robin robin34 = faker30.robin();
        com.github.javafaker.BojackHorseman bojackHorseman35 = faker30.bojackHorseman();
        com.github.javafaker.Demographic demographic36 = faker30.demographic();
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Avatar avatar39 = faker38.avatar();
        com.github.javafaker.SlackEmoji slackEmoji40 = faker38.slackEmoji();
        com.github.javafaker.Medical medical41 = faker38.medical();
        com.github.javafaker.Robin robin42 = faker38.robin();
        com.github.javafaker.BojackHorseman bojackHorseman43 = faker38.bojackHorseman();
        com.github.javafaker.Demographic demographic44 = faker38.demographic();
        com.github.javafaker.Demographic[] demographicArray45 = new com.github.javafaker.Demographic[] { demographic12, demographic20, demographic28, demographic36, demographic44 };
        com.github.javafaker.Demographic demographic46 = options4.option(demographicArray45);
        java.lang.String str47 = demographic46.race();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(avatar7);
        org.junit.Assert.assertNotNull(slackEmoji8);
        org.junit.Assert.assertNotNull(medical9);
        org.junit.Assert.assertNotNull(robin10);
        org.junit.Assert.assertNotNull(bojackHorseman11);
        org.junit.Assert.assertNotNull(demographic12);
        org.junit.Assert.assertNotNull(avatar15);
        org.junit.Assert.assertNotNull(slackEmoji16);
        org.junit.Assert.assertNotNull(medical17);
        org.junit.Assert.assertNotNull(robin18);
        org.junit.Assert.assertNotNull(bojackHorseman19);
        org.junit.Assert.assertNotNull(demographic20);
        org.junit.Assert.assertNotNull(avatar23);
        org.junit.Assert.assertNotNull(slackEmoji24);
        org.junit.Assert.assertNotNull(medical25);
        org.junit.Assert.assertNotNull(robin26);
        org.junit.Assert.assertNotNull(bojackHorseman27);
        org.junit.Assert.assertNotNull(demographic28);
        org.junit.Assert.assertNotNull(avatar31);
        org.junit.Assert.assertNotNull(slackEmoji32);
        org.junit.Assert.assertNotNull(medical33);
        org.junit.Assert.assertNotNull(robin34);
        org.junit.Assert.assertNotNull(bojackHorseman35);
        org.junit.Assert.assertNotNull(demographic36);
        org.junit.Assert.assertNotNull(avatar39);
        org.junit.Assert.assertNotNull(slackEmoji40);
        org.junit.Assert.assertNotNull(medical41);
        org.junit.Assert.assertNotNull(robin42);
        org.junit.Assert.assertNotNull(bojackHorseman43);
        org.junit.Assert.assertNotNull(demographic44);
        org.junit.Assert.assertNotNull(demographicArray45);
        org.junit.Assert.assertNotNull(demographic46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Native Hawaiian or Other Pacific Islander" + "'", str47, "Native Hawaiian or Other Pacific Islander");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str7 = code5.isbn10(true);
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0-365-51462-4" + "'", str7, "0-365-51462-4");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Options options4 = faker1.options();
        java.util.Random random5 = null;
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Avatar avatar7 = faker6.avatar();
        com.github.javafaker.SlackEmoji slackEmoji8 = faker6.slackEmoji();
        com.github.javafaker.Medical medical9 = faker6.medical();
        com.github.javafaker.Robin robin10 = faker6.robin();
        com.github.javafaker.BojackHorseman bojackHorseman11 = faker6.bojackHorseman();
        com.github.javafaker.Demographic demographic12 = faker6.demographic();
        java.util.Random random13 = null;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random13);
        com.github.javafaker.Avatar avatar15 = faker14.avatar();
        com.github.javafaker.SlackEmoji slackEmoji16 = faker14.slackEmoji();
        com.github.javafaker.Medical medical17 = faker14.medical();
        com.github.javafaker.Robin robin18 = faker14.robin();
        com.github.javafaker.BojackHorseman bojackHorseman19 = faker14.bojackHorseman();
        com.github.javafaker.Demographic demographic20 = faker14.demographic();
        java.util.Random random21 = null;
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Avatar avatar23 = faker22.avatar();
        com.github.javafaker.SlackEmoji slackEmoji24 = faker22.slackEmoji();
        com.github.javafaker.Medical medical25 = faker22.medical();
        com.github.javafaker.Robin robin26 = faker22.robin();
        com.github.javafaker.BojackHorseman bojackHorseman27 = faker22.bojackHorseman();
        com.github.javafaker.Demographic demographic28 = faker22.demographic();
        java.util.Random random29 = null;
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random29);
        com.github.javafaker.Avatar avatar31 = faker30.avatar();
        com.github.javafaker.SlackEmoji slackEmoji32 = faker30.slackEmoji();
        com.github.javafaker.Medical medical33 = faker30.medical();
        com.github.javafaker.Robin robin34 = faker30.robin();
        com.github.javafaker.BojackHorseman bojackHorseman35 = faker30.bojackHorseman();
        com.github.javafaker.Demographic demographic36 = faker30.demographic();
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Avatar avatar39 = faker38.avatar();
        com.github.javafaker.SlackEmoji slackEmoji40 = faker38.slackEmoji();
        com.github.javafaker.Medical medical41 = faker38.medical();
        com.github.javafaker.Robin robin42 = faker38.robin();
        com.github.javafaker.BojackHorseman bojackHorseman43 = faker38.bojackHorseman();
        com.github.javafaker.Demographic demographic44 = faker38.demographic();
        com.github.javafaker.Demographic[] demographicArray45 = new com.github.javafaker.Demographic[] { demographic12, demographic20, demographic28, demographic36, demographic44 };
        com.github.javafaker.Demographic demographic46 = options4.option(demographicArray45);
        java.util.Random random47 = null;
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random47);
        com.github.javafaker.Avatar avatar49 = faker48.avatar();
        com.github.javafaker.SlackEmoji slackEmoji50 = faker48.slackEmoji();
        com.github.javafaker.Medical medical51 = faker48.medical();
        com.github.javafaker.Robin robin52 = faker48.robin();
        com.github.javafaker.BojackHorseman bojackHorseman53 = faker48.bojackHorseman();
        java.lang.String str54 = bojackHorseman53.tongueTwisters();
        java.util.Random random55 = null;
        com.github.javafaker.Faker faker56 = new com.github.javafaker.Faker(random55);
        com.github.javafaker.Avatar avatar57 = faker56.avatar();
        com.github.javafaker.SlackEmoji slackEmoji58 = faker56.slackEmoji();
        com.github.javafaker.Medical medical59 = faker56.medical();
        com.github.javafaker.Robin robin60 = faker56.robin();
        com.github.javafaker.BojackHorseman bojackHorseman61 = faker56.bojackHorseman();
        java.util.Random random62 = null;
        com.github.javafaker.Faker faker63 = new com.github.javafaker.Faker(random62);
        com.github.javafaker.Avatar avatar64 = faker63.avatar();
        com.github.javafaker.SlackEmoji slackEmoji65 = faker63.slackEmoji();
        com.github.javafaker.Medical medical66 = faker63.medical();
        com.github.javafaker.Robin robin67 = faker63.robin();
        com.github.javafaker.BojackHorseman bojackHorseman68 = faker63.bojackHorseman();
        java.util.Random random69 = null;
        com.github.javafaker.Faker faker70 = new com.github.javafaker.Faker(random69);
        com.github.javafaker.Avatar avatar71 = faker70.avatar();
        com.github.javafaker.SlackEmoji slackEmoji72 = faker70.slackEmoji();
        com.github.javafaker.Medical medical73 = faker70.medical();
        com.github.javafaker.Robin robin74 = faker70.robin();
        com.github.javafaker.BojackHorseman bojackHorseman75 = faker70.bojackHorseman();
        java.lang.String str76 = bojackHorseman75.characters();
        com.github.javafaker.BojackHorseman[] bojackHorsemanArray77 = new com.github.javafaker.BojackHorseman[] { bojackHorseman53, bojackHorseman61, bojackHorseman68, bojackHorseman75 };
        com.github.javafaker.BojackHorseman bojackHorseman78 = options4.nextElement(bojackHorsemanArray77);
        com.github.javafaker.service.FakeValuesGrouping fakeValuesGrouping79 = new com.github.javafaker.service.FakeValuesGrouping();
        com.github.javafaker.service.FakeValuesGrouping fakeValuesGrouping80 = new com.github.javafaker.service.FakeValuesGrouping();
        com.github.javafaker.service.FakeValuesGrouping fakeValuesGrouping81 = new com.github.javafaker.service.FakeValuesGrouping();
        com.github.javafaker.service.FakeValuesGrouping fakeValuesGrouping82 = new com.github.javafaker.service.FakeValuesGrouping();
        com.github.javafaker.service.FakeValuesInterface[] fakeValuesInterfaceArray83 = new com.github.javafaker.service.FakeValuesInterface[] { fakeValuesGrouping79, fakeValuesGrouping80, fakeValuesGrouping81, fakeValuesGrouping82 };
        com.github.javafaker.service.FakeValuesInterface fakeValuesInterface84 = options4.option(fakeValuesInterfaceArray83);
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(avatar7);
        org.junit.Assert.assertNotNull(slackEmoji8);
        org.junit.Assert.assertNotNull(medical9);
        org.junit.Assert.assertNotNull(robin10);
        org.junit.Assert.assertNotNull(bojackHorseman11);
        org.junit.Assert.assertNotNull(demographic12);
        org.junit.Assert.assertNotNull(avatar15);
        org.junit.Assert.assertNotNull(slackEmoji16);
        org.junit.Assert.assertNotNull(medical17);
        org.junit.Assert.assertNotNull(robin18);
        org.junit.Assert.assertNotNull(bojackHorseman19);
        org.junit.Assert.assertNotNull(demographic20);
        org.junit.Assert.assertNotNull(avatar23);
        org.junit.Assert.assertNotNull(slackEmoji24);
        org.junit.Assert.assertNotNull(medical25);
        org.junit.Assert.assertNotNull(robin26);
        org.junit.Assert.assertNotNull(bojackHorseman27);
        org.junit.Assert.assertNotNull(demographic28);
        org.junit.Assert.assertNotNull(avatar31);
        org.junit.Assert.assertNotNull(slackEmoji32);
        org.junit.Assert.assertNotNull(medical33);
        org.junit.Assert.assertNotNull(robin34);
        org.junit.Assert.assertNotNull(bojackHorseman35);
        org.junit.Assert.assertNotNull(demographic36);
        org.junit.Assert.assertNotNull(avatar39);
        org.junit.Assert.assertNotNull(slackEmoji40);
        org.junit.Assert.assertNotNull(medical41);
        org.junit.Assert.assertNotNull(robin42);
        org.junit.Assert.assertNotNull(bojackHorseman43);
        org.junit.Assert.assertNotNull(demographic44);
        org.junit.Assert.assertNotNull(demographicArray45);
        org.junit.Assert.assertNotNull(demographic46);
        org.junit.Assert.assertNotNull(avatar49);
        org.junit.Assert.assertNotNull(slackEmoji50);
        org.junit.Assert.assertNotNull(medical51);
        org.junit.Assert.assertNotNull(robin52);
        org.junit.Assert.assertNotNull(bojackHorseman53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "That's sorta been thwarted unfortunately cos Courtney's purportedly falling short of shoring up fourth quadrant support" + "'", str54, "That's sorta been thwarted unfortunately cos Courtney's purportedly falling short of shoring up fourth quadrant support");
        org.junit.Assert.assertNotNull(avatar57);
        org.junit.Assert.assertNotNull(slackEmoji58);
        org.junit.Assert.assertNotNull(medical59);
        org.junit.Assert.assertNotNull(robin60);
        org.junit.Assert.assertNotNull(bojackHorseman61);
        org.junit.Assert.assertNotNull(avatar64);
        org.junit.Assert.assertNotNull(slackEmoji65);
        org.junit.Assert.assertNotNull(medical66);
        org.junit.Assert.assertNotNull(robin67);
        org.junit.Assert.assertNotNull(bojackHorseman68);
        org.junit.Assert.assertNotNull(avatar71);
        org.junit.Assert.assertNotNull(slackEmoji72);
        org.junit.Assert.assertNotNull(medical73);
        org.junit.Assert.assertNotNull(robin74);
        org.junit.Assert.assertNotNull(bojackHorseman75);
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Charley Witherspoon" + "'", str76, "Charley Witherspoon");
        org.junit.Assert.assertNotNull(bojackHorsemanArray77);
        org.junit.Assert.assertNotNull(bojackHorseman78);
        org.junit.Assert.assertNotNull(fakeValuesInterfaceArray83);
        org.junit.Assert.assertNotNull(fakeValuesInterface84);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Basketball basketball5 = faker1.basketball();
        java.lang.String str6 = basketball5.coaches();
        java.lang.String str7 = basketball5.coaches();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(basketball5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "David Fizdale" + "'", str6, "David Fizdale");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "David Fizdale" + "'", str7, "David Fizdale");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.Name name8 = faker1.name();
        java.lang.String str9 = name8.prefix();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(name8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Mr." + "'", str9, "Mr.");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.Name name8 = faker1.name();
        java.lang.String str9 = name8.username();
        java.lang.String str10 = name8.lastName();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(name8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tanesha.bechtelar" + "'", str9, "tanesha.bechtelar");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Wyman" + "'", str10, "Wyman");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("Wyoming");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("Griffin");
        java.lang.String str12 = internet9.domainSuffix();
        java.lang.String str14 = internet9.safeEmailAddress("Father");
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wyoming" + "'", str8, "Wyoming");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Griffin:a0:04:b3:53:fb" + "'", str11, "Griffin:a0:04:b3:53:fb");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "biz" + "'", str12, "biz");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str7 = code5.ean8();
        java.lang.String str8 = code5.isbnGroup();
        java.lang.String str9 = code5.gtin8();
        java.lang.String str11 = code5.isbn13(true);
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9791024195636" + "'", str6, "9791024195636");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66806028" + "'", str7, "66806028");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "54007901" + "'", str9, "54007901");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "979-0-7334-2755-7" + "'", str11, "979-0-7334-2755-7");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Bool bool3 = faker1.bool();
        com.github.javafaker.BackToTheFuture backToTheFuture4 = faker1.backToTheFuture();
        java.lang.String str5 = backToTheFuture4.date();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(bool3);
        org.junit.Assert.assertNotNull(backToTheFuture4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "October 25, 1985" + "'", str5, "October 25, 1985");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.IdNumber idNumber5 = faker1.idNumber();
        com.github.javafaker.Esports esports6 = faker1.esports();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(idNumber5);
        org.junit.Assert.assertNotNull(esports6);
    }
}
