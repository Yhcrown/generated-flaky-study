import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTests{
    public static boolean debug = false;


    public void test022_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        long long2 = randomService1.nextLong();
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3475542030954430036L) + "'", long2 == (-3475542030954430036L));
    }

    public void test026_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        java.lang.String str4 = food3.sushi();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Japanese whiting" + "'", str4, "Japanese whiting");
    }

    public void test031_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Southern" + "'", str7, "Southern");
    }

    public void test033_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Point Guard" + "'", str6, "Point Guard");
    }

    public void test034_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ralph Stilton" + "'", str7, "Ralph Stilton");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "That's the problem with life, either you know what you want and you don't get what you want, or you get what you want and then you don't know what you want" + "'", str8, "That's the problem with life, either you know what you want and you don't get what you want, or you get what you want and then you don't know what you want");
    }

    public void test034_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ralph Stilton" + "'", str7, "Ralph Stilton");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "That's the problem with life, either you know what you want and you don't get what you want, or you get what you want and then you don't know what you want" + "'", str8, "That's the problem with life, either you know what you want and you don't get what you want, or you get what you want and then you don't know what you want");
    }

    public void test035_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        java.lang.String str4 = slackEmoji3.foodAndDrink();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":poultry_leg:" + "'", str4, ":poultry_leg:");
    }

    public void test039_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Courtney Portnoy portrayed the formerly portly consort in the seaport resort" + "'", str7, "Courtney Portnoy portrayed the formerly portly consort in the seaport resort");
    }

    public void test040_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        java.lang.String str5 = hacker4.ingverb();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "indexing" + "'", str5, "indexing");
    }

    public void test041_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chuck Norris doesn't use web standards as the web will conform to him." + "'", str9, "Chuck Norris doesn't use web standards as the web will conform to him.");
    }

    public void test045_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781805087038" + "'", str6, "9781805087038");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "46532190" + "'", str7, "46532190");
    }

    public void test045_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781805087038" + "'", str6, "9781805087038");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "46532190" + "'", str7, "46532190");
    }

    public void test046_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AGP" + "'", str6, "AGP");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "digital" + "'", str7, "digital");
    }

    public void test046_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AGP" + "'", str6, "AGP");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "digital" + "'", str7, "digital");
    }

    public void test047_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781037458224" + "'", str6, "9781037458224");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "B000I6QR9O" + "'", str7, "B000I6QR9O");
    }

    public void test047_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781037458224" + "'", str6, "9781037458224");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "B000I6QR9O" + "'", str7, "B000I6QR9O");
    }

    public void test048_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Brookville High" + "'", str8, "Brookville High");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ironbarrow Secondary College" + "'", str9, "Ironbarrow Secondary College");
    }

    public void test048_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Brookville High" + "'", str8, "Brookville High");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ironbarrow Secondary College" + "'", str9, "Ironbarrow Secondary College");
    }

    public void test049_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "female" + "'", str8, "female");
    }

    public void test050_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        long long3 = randomService1.nextLong((long) 'a');
        java.lang.String str5 = randomService1.hex((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int8 = randomService1.nextInt((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 63L + "'", long3 == 63L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "B463551983" + "'", str5, "B463551983");
    }

    public void test050_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        long long3 = randomService1.nextLong((long) 'a');
        java.lang.String str5 = randomService1.hex((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int8 = randomService1.nextInt((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 63L + "'", long3 == 63L);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "B463551983" + "'", str5, "B463551983");
    }

    public void test053_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
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
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2 pint" + "'", str4, "2 pint");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cherries" + "'", str5, "Cherries");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chicken Fajitas" + "'", str6, "Chicken Fajitas");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chicken Parm" + "'", str7, "Chicken Parm");
    }

    public void test053_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
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
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2 pint" + "'", str4, "2 pint");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cherries" + "'", str5, "Cherries");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chicken Fajitas" + "'", str6, "Chicken Fajitas");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chicken Parm" + "'", str7, "Chicken Parm");
    }

    public void test053_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
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
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2 pint" + "'", str4, "2 pint");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cherries" + "'", str5, "Cherries");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chicken Fajitas" + "'", str6, "Chicken Fajitas");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chicken Parm" + "'", str7, "Chicken Parm");
    }

    public void test053_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
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
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2 pint" + "'", str4, "2 pint");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cherries" + "'", str5, "Cherries");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chicken Fajitas" + "'", str6, "Chicken Fajitas");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chicken Parm" + "'", str7, "Chicken Parm");
    }

    public void test055_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Florida" + "'", str6, "Florida");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "pes\344pallo" + "'", str7, "pes\344pallo");
    }

    public void test055_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Florida" + "'", str6, "Florida");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "pes\344pallo" + "'", str7, "pes\344pallo");
    }

    public void test056_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Music music2 = faker1.music();
        java.lang.String str3 = music2.genre();
        org.junit.Assert.assertNotNull(music2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Folk" + "'", str3, "Folk");
    }

    public void test058_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Vhagar" + "'", str8, "Vhagar");
    }

    public void test060_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        com.github.javafaker.Dog dog4 = faker1.dog();
        java.lang.String str5 = dog4.size();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(dog4);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "medium" + "'", str5, "medium");
    }

    public void test061_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Tails" + "'", str7, "Tails");
    }

    public void test063_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Farming Administrator" + "'", str5, "Farming Administrator");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Marketing" + "'", str6, "Marketing");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Accounting Administrator" + "'", str7, "Accounting Administrator");
    }

    public void test063_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
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
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Farming Administrator" + "'", str5, "Farming Administrator");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Marketing" + "'", str6, "Marketing");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Accounting Administrator" + "'", str7, "Accounting Administrator");
    }

    public void test063_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
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
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Farming Administrator" + "'", str5, "Farming Administrator");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Marketing" + "'", str6, "Marketing");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Accounting Administrator" + "'", str7, "Accounting Administrator");
    }

    public void test064_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 62L + "'", long4 == 62L);
    }

    public void test065_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A process cannot be understood by stopping it. Understanding must move with the flow of the process, must join it and flow with it." + "'", str5, "A process cannot be understood by stopping it. Understanding must move with the flow of the process, must join it and flow with it.");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A popular man arouses the jealousy of the powerful." + "'", str6, "A popular man arouses the jealousy of the powerful.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Arrakis" + "'", str7, "Arrakis");
    }

    public void test065_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A popular man arouses the jealousy of the powerful." + "'", str6, "A popular man arouses the jealousy of the powerful.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Arrakis" + "'", str7, "Arrakis");
    }

    public void test065_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A popular man arouses the jealousy of the powerful." + "'", str6, "A popular man arouses the jealousy of the powerful.");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Arrakis" + "'", str7, "Arrakis");
    }

    public void test066_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mp3" + "'", str9, "mp3");
    }

    public void test067_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hermione" + "'", str9, "Hermione");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Uranus" + "'", str10, "Uranus");
    }

    public void test067_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hermione" + "'", str9, "Hermione");
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Uranus" + "'", str10, "Uranus");
    }

    public void test068_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "handball" + "'", str6, "handball");
    }

    public void test069_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.SlackEmoji slackEmoji2 = faker1.slackEmoji();
        java.lang.String str3 = slackEmoji2.activity();
        java.lang.String str4 = slackEmoji2.emoji();
        org.junit.Assert.assertNotNull(slackEmoji2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":dancer:" + "'", str3, ":dancer:");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":baby_bottle:" + "'", str4, ":baby_bottle:");
    }

    public void test069_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.SlackEmoji slackEmoji2 = faker1.slackEmoji();
        java.lang.String str3 = slackEmoji2.activity();
        java.lang.String str4 = slackEmoji2.emoji();
        org.junit.Assert.assertNotNull(slackEmoji2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":dancer:" + "'", str3, ":dancer:");
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":baby_bottle:" + "'", str4, ":baby_bottle:");
    }

    public void test070_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.camera();
        java.lang.String str4 = photography2.lens();
        java.lang.String str5 = photography2.iso();
        java.lang.String str6 = photography2.term();
        org.junit.Assert.assertNotNull(photography2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZENIT-VE" + "'", str3, "ZENIT-VE");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2013105mm/4" + "'", str4, "\u2013105mm/4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "64" + "'", str5, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35mm" + "'", str6, "35mm");
    }

    public void test070_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.camera();
        java.lang.String str4 = photography2.lens();
        java.lang.String str5 = photography2.iso();
        java.lang.String str6 = photography2.term();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZENIT-VE" + "'", str3, "ZENIT-VE");
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2013105mm/4" + "'", str4, "\u2013105mm/4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "64" + "'", str5, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35mm" + "'", str6, "35mm");
    }

    public void test070_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.camera();
        java.lang.String str4 = photography2.lens();
        java.lang.String str5 = photography2.iso();
        java.lang.String str6 = photography2.term();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZENIT-VE" + "'", str3, "ZENIT-VE");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2013105mm/4" + "'", str4, "\u2013105mm/4");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "64" + "'", str5, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35mm" + "'", str6, "35mm");
    }

    public void test070_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.camera();
        java.lang.String str4 = photography2.lens();
        java.lang.String str5 = photography2.iso();
        java.lang.String str6 = photography2.term();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZENIT-VE" + "'", str3, "ZENIT-VE");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2013105mm/4" + "'", str4, "\u2013105mm/4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "64" + "'", str5, "64");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35mm" + "'", str6, "35mm");
    }

    public void test072_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Illustrious" + "'", str7, "Illustrious");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Gamora" + "'", str8, "Gamora");
    }

    public void test072_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Illustrious" + "'", str7, "Illustrious");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Gamora" + "'", str8, "Gamora");
    }

    public void test074_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781512905816" + "'", str6, "9781512905816");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "87177022" + "'", str7, "87177022");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "585-71537" + "'", str9, "585-71537");
    }

    public void test074_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781512905816" + "'", str6, "9781512905816");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "87177022" + "'", str7, "87177022");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "585-71537" + "'", str9, "585-71537");
    }

    public void test074_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781512905816" + "'", str6, "9781512905816");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "87177022" + "'", str7, "87177022");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "585-71537" + "'", str9, "585-71537");
    }

    public void test074_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781512905816" + "'", str6, "9781512905816");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "87177022" + "'", str7, "87177022");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "585-71537" + "'", str9, "585-71537");
    }

    public void test075_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Northern Kansas Academy" + "'", str7, "Northern Kansas Academy");
    }

    public void test076_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Steatorrhea (Excess fat in stool)" + "'", str5, "Steatorrhea (Excess fat in stool)");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LUMACAFTOR" + "'", str6, "LUMACAFTOR");
    }

    public void test076_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
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
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Steatorrhea (Excess fat in stool)" + "'", str5, "Steatorrhea (Excess fat in stool)");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LUMACAFTOR" + "'", str6, "LUMACAFTOR");
    }

    public void test079_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str10 = internet9.ipV4Address();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "145.105.132.31" + "'", str10, "145.105.132.31");
    }

    public void test082_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Job job6 = new com.github.javafaker.Job(faker1);
        com.github.javafaker.University university7 = faker1.university();
        com.github.javafaker.Educator educator8 = faker1.educator();
        java.lang.String str9 = educator8.university();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(university7);
        org.junit.Assert.assertNotNull(educator8);
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Icelyn College" + "'", str9, "Icelyn College");
    }

    public void test085_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        java.lang.String str4 = food3.dish();
        java.lang.String str5 = food3.sushi();
        java.lang.String str6 = food3.sushi();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tacos" + "'", str4, "Tacos");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Trough shells" + "'", str5, "Trough shells");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Botan shrimp" + "'", str6, "Botan shrimp");
    }

    public void test085_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        java.lang.String str4 = food3.dish();
        java.lang.String str5 = food3.sushi();
        java.lang.String str6 = food3.sushi();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tacos" + "'", str4, "Tacos");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Trough shells" + "'", str5, "Trough shells");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Botan shrimp" + "'", str6, "Botan shrimp");
    }

    public void test085_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        java.lang.String str4 = food3.dish();
        java.lang.String str5 = food3.sushi();
        java.lang.String str6 = food3.sushi();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Tacos" + "'", str4, "Tacos");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Trough shells" + "'", str5, "Trough shells");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Botan shrimp" + "'", str6, "Botan shrimp");
    }

    public void test087_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Session Interval Too Small" + "'", str7, "Session Interval Too Small");
    }

    public void test088_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        java.lang.String str5 = hacker4.verb();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "program" + "'", str5, "program");
    }

    public void test089_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Sister" + "'", str8, "Sister");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Brother" + "'", str9, "Brother");
    }

    public void test089_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Sister" + "'", str8, "Sister");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Brother" + "'", str9, "Brother");
    }

    public void test090_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.github.javafaker.service.RandomService randomService0 = new com.github.javafaker.service.RandomService();
        long long2 = randomService0.nextLong((long) 42656);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26999L + "'", long2 == 26999L);
    }

    public void test091_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Inconsolable baby" + "'", str5, "Inconsolable baby");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OUR LADY OF THE LAKE REGIONAL MEDICAL CENTER" + "'", str6, "OUR LADY OF THE LAKE REGIONAL MEDICAL CENTER");
    }

    public void test091_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
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
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Inconsolable baby" + "'", str5, "Inconsolable baby");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OUR LADY OF THE LAKE REGIONAL MEDICAL CENTER" + "'", str6, "OUR LADY OF THE LAKE REGIONAL MEDICAL CENTER");
    }

    public void test092_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Seven Island" + "'", str6, "Seven Island");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mewtwo" + "'", str7, "Mewtwo");
    }

    public void test092_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Seven Island" + "'", str6, "Seven Island");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mewtwo" + "'", str7, "Mewtwo");
    }

    public void test094_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EFLLeagueone" + "'", str7, "EFLLeagueone");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PortValeF.C." + "'", str8, "PortValeF.C.");
    }

    public void test094_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EFLLeagueone" + "'", str7, "EFLLeagueone");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PortValeF.C." + "'", str8, "PortValeF.C.");
    }

    public void test095_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.github.javafaker.idnumbers.SvSEIdNumber svSEIdNumber0 = new com.github.javafaker.idnumbers.SvSEIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Photography photography3 = faker2.photography();
        com.github.javafaker.Food food4 = faker2.food();
        com.github.javafaker.Job job5 = faker2.job();
        java.lang.String str6 = svSEIdNumber0.getValidSsn(faker2);
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Avatar avatar9 = faker8.avatar();
        com.github.javafaker.SlackEmoji slackEmoji10 = faker8.slackEmoji();
        com.github.javafaker.Medical medical11 = faker8.medical();
        com.github.javafaker.Code code12 = faker8.code();
        com.github.javafaker.Barcode barcode13 = faker8.barcode();
        com.github.javafaker.App app14 = faker8.app();
        com.github.javafaker.Matz matz15 = faker8.matz();
        java.lang.String str16 = svSEIdNumber0.getValidSsn(faker8);
        org.junit.Assert.assertNotNull(photography3);
        org.junit.Assert.assertNotNull(food4);
        org.junit.Assert.assertNotNull(job5);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "040403-4613" + "'", str6, "040403-4613");
        org.junit.Assert.assertNotNull(avatar9);
        org.junit.Assert.assertNotNull(slackEmoji10);
        org.junit.Assert.assertNotNull(medical11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(barcode13);
        org.junit.Assert.assertNotNull(app14);
        org.junit.Assert.assertNotNull(matz15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "041114+0429" + "'", str16, "041114+0429");
    }

    public void test095_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.github.javafaker.idnumbers.SvSEIdNumber svSEIdNumber0 = new com.github.javafaker.idnumbers.SvSEIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Photography photography3 = faker2.photography();
        com.github.javafaker.Food food4 = faker2.food();
        com.github.javafaker.Job job5 = faker2.job();
        java.lang.String str6 = svSEIdNumber0.getValidSsn(faker2);
        java.util.Random random7 = null;
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Avatar avatar9 = faker8.avatar();
        com.github.javafaker.SlackEmoji slackEmoji10 = faker8.slackEmoji();
        com.github.javafaker.Medical medical11 = faker8.medical();
        com.github.javafaker.Code code12 = faker8.code();
        com.github.javafaker.Barcode barcode13 = faker8.barcode();
        com.github.javafaker.App app14 = faker8.app();
        com.github.javafaker.Matz matz15 = faker8.matz();
        java.lang.String str16 = svSEIdNumber0.getValidSsn(faker8);
        org.junit.Assert.assertNotNull(photography3);
        org.junit.Assert.assertNotNull(food4);
        org.junit.Assert.assertNotNull(job5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "040403-4613" + "'", str6, "040403-4613");
        org.junit.Assert.assertNotNull(avatar9);
        org.junit.Assert.assertNotNull(slackEmoji10);
        org.junit.Assert.assertNotNull(medical11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(barcode13);
        org.junit.Assert.assertNotNull(app14);
        org.junit.Assert.assertNotNull(matz15);
         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "041114+0429" + "'", str16, "041114+0429");
    }

    public void test097_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781980523000" + "'", str6, "9781980523000");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "22301994" + "'", str7, "22301994");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20795962" + "'", str9, "20795962");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0912413336" + "'", str11, "0912413336");
    }

    public void test097_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781980523000" + "'", str6, "9781980523000");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "22301994" + "'", str7, "22301994");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20795962" + "'", str9, "20795962");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0912413336" + "'", str11, "0912413336");
    }

    public void test097_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781980523000" + "'", str6, "9781980523000");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "22301994" + "'", str7, "22301994");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20795962" + "'", str9, "20795962");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0912413336" + "'", str11, "0912413336");
    }

    public void test097_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781980523000" + "'", str6, "9781980523000");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "22301994" + "'", str7, "22301994");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20795962" + "'", str9, "20795962");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0912413336" + "'", str11, "0912413336");
    }

    public void test097_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781980523000" + "'", str6, "9781980523000");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "22301994" + "'", str7, "22301994");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20795962" + "'", str9, "20795962");
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0912413336" + "'", str11, "0912413336");
    }

    public void test098_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "New Bark Town" + "'", str6, "New Bark Town");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Floaroma Town" + "'", str7, "Floaroma Town");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Icirrus City" + "'", str8, "Icirrus City");
    }

    public void test098_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "New Bark Town" + "'", str6, "New Bark Town");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Floaroma Town" + "'", str7, "Floaroma Town");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Icirrus City" + "'", str8, "Icirrus City");
    }

    public void test098_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "New Bark Town" + "'", str6, "New Bark Town");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Floaroma Town" + "'", str7, "Floaroma Town");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Icirrus City" + "'", str8, "Icirrus City");
    }

    public void test101_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781973231202" + "'", str6, "9781973231202");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "80623137" + "'", str7, "80623137");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "36674633" + "'", str9, "36674633");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9791015071932" + "'", str10, "9791015071932");
    }

    public void test101_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781973231202" + "'", str6, "9781973231202");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "80623137" + "'", str7, "80623137");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "36674633" + "'", str9, "36674633");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9791015071932" + "'", str10, "9791015071932");
    }

    public void test101_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781973231202" + "'", str6, "9781973231202");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "80623137" + "'", str7, "80623137");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "36674633" + "'", str9, "36674633");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9791015071932" + "'", str10, "9791015071932");
    }

    public void test101_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781973231202" + "'", str6, "9781973231202");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "80623137" + "'", str7, "80623137");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "36674633" + "'", str9, "36674633");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9791015071932" + "'", str10, "9791015071932");
    }

    public void test101_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9781973231202" + "'", str6, "9781973231202");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "80623137" + "'", str7, "80623137");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "36674633" + "'", str9, "36674633");
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9791015071932" + "'", str10, "9791015071932");
    }

    public void test103_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Job job4 = faker1.job();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Sip sip6 = faker1.sip();
        int int7 = sip6.messagingPort();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(job4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(sip6);
         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6298 + "'", int7 == 6298);
    }

    public void test105_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.camera();
        java.lang.String str4 = photography2.camera();
        org.junit.Assert.assertNotNull(photography2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZENIT-EM" + "'", str3, "ZENIT-EM");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Canon EOS 700D" + "'", str4, "Canon EOS 700D");
    }

    public void test105_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.camera();
        java.lang.String str4 = photography2.camera();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZENIT-EM" + "'", str3, "ZENIT-EM");
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Canon EOS 700D" + "'", str4, "Canon EOS 700D");
    }

    public void test106_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Job job6 = new com.github.javafaker.Job(faker1);
        com.github.javafaker.University university7 = faker1.university();
        com.github.javafaker.Educator educator8 = faker1.educator();
        java.lang.String str9 = educator8.campus();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(university7);
        org.junit.Assert.assertNotNull(educator8);
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ostbarrow Campus" + "'", str9, "Ostbarrow Campus");
    }

    public void test107_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Barcode barcode6 = faker1.barcode();
        com.github.javafaker.Dog dog7 = faker1.dog();
        java.lang.String str8 = dog7.breed();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(barcode6);
        org.junit.Assert.assertNotNull(dog7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chow" + "'", str8, "Chow");
    }

    public void test108_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.lens();
        org.junit.Assert.assertNotNull(photography2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fisheye" + "'", str3, "fisheye");
    }

    public void test109_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.AquaTeenHungerForce aquaTeenHungerForce4 = faker1.aquaTeenHungerForce();
        java.lang.String str5 = aquaTeenHungerForce4.character();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(aquaTeenHungerForce4);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Err" + "'", str5, "Err");
    }

    public void test112_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9790890520184" + "'", str6, "9790890520184");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1-555-83541-4" + "'", str8, "1-555-83541-4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1767186134" + "'", str9, "1767186134");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "979-0-528-78751-4" + "'", str11, "979-0-528-78751-4");
    }

    public void test112_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9790890520184" + "'", str6, "9790890520184");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1-555-83541-4" + "'", str8, "1-555-83541-4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1767186134" + "'", str9, "1767186134");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "979-0-528-78751-4" + "'", str11, "979-0-528-78751-4");
    }

    public void test112_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9790890520184" + "'", str6, "9790890520184");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1-555-83541-4" + "'", str8, "1-555-83541-4");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1767186134" + "'", str9, "1767186134");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "979-0-528-78751-4" + "'", str11, "979-0-528-78751-4");
    }

    public void test112_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9790890520184" + "'", str6, "9790890520184");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1-555-83541-4" + "'", str8, "1-555-83541-4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1767186134" + "'", str9, "1767186134");
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "979-0-528-78751-4" + "'", str11, "979-0-528-78751-4");
    }

    public void test113_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Y-Solowarm" + "'", str5, "Y-Solowarm");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3.3.8" + "'", str6, "3.3.8");
    }

    public void test113_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
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
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Y-Solowarm" + "'", str5, "Y-Solowarm");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3.3.8" + "'", str6, "3.3.8");
    }

    public void test114_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Buffy buffy4 = faker1.buffy();
        java.lang.String str5 = buffy4.bigBads();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(buffy4);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "The Anointed One" + "'", str5, "The Anointed One");
    }

    public void test115_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.camera();
        java.lang.String str4 = photography2.shutter();
        java.lang.String str5 = photography2.brand();
        org.junit.Assert.assertNotNull(photography2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Sony Alpha 550" + "'", str3, "Sony Alpha 550");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8000" + "'", str4, "8000");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Kodak" + "'", str5, "Kodak");
    }

    public void test115_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.camera();
        java.lang.String str4 = photography2.shutter();
        java.lang.String str5 = photography2.brand();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Sony Alpha 550" + "'", str3, "Sony Alpha 550");
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8000" + "'", str4, "8000");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Kodak" + "'", str5, "Kodak");
    }

    public void test115_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.camera();
        java.lang.String str4 = photography2.shutter();
        java.lang.String str5 = photography2.brand();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Sony Alpha 550" + "'", str3, "Sony Alpha 550");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8000" + "'", str4, "8000");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Kodak" + "'", str5, "Kodak");
    }

    public void test116_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DragonBall dragonBall2 = faker1.dragonBall();
        java.lang.String str3 = dragonBall2.character();
        java.lang.String str4 = dragonBall2.character();
        org.junit.Assert.assertNotNull(dragonBall2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Oolong" + "'", str3, "Oolong");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Dende" + "'", str4, "Dende");
    }

    public void test116_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DragonBall dragonBall2 = faker1.dragonBall();
        java.lang.String str3 = dragonBall2.character();
        java.lang.String str4 = dragonBall2.character();
        org.junit.Assert.assertNotNull(dragonBall2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Oolong" + "'", str3, "Oolong");
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Dende" + "'", str4, "Dende");
    }

    public void test118_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.AquaTeenHungerForce aquaTeenHungerForce4 = faker1.aquaTeenHungerForce();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        java.util.List<java.lang.String> strList7 = lorem5.paragraphs(43996);
        java.lang.String str8 = lorem5.word();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(aquaTeenHungerForce4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(strList7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "libero" + "'", str8, "libero");
    }

    public void test119_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str14 = internet9.image((java.lang.Integer) 43996, (java.lang.Integer) (-1), (java.lang.Boolean) false, "RSS");
        java.lang.String str15 = internet9.domainSuffix();
        java.lang.String str16 = internet9.ipV4Address();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://lorempixel.com/43996/-1/food/RSS" + "'", str14, "http://lorempixel.com/43996/-1/food/RSS");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "biz" + "'", str15, "biz");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "239.150.62.143" + "'", str16, "239.150.62.143");
    }

    public void test119_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str14 = internet9.image((java.lang.Integer) 43996, (java.lang.Integer) (-1), (java.lang.Boolean) false, "RSS");
        java.lang.String str15 = internet9.domainSuffix();
        java.lang.String str16 = internet9.ipV4Address();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://lorempixel.com/43996/-1/food/RSS" + "'", str14, "http://lorempixel.com/43996/-1/food/RSS");
         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "biz" + "'", str15, "biz");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "239.150.62.143" + "'", str16, "239.150.62.143");
    }

    public void test119_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str14 = internet9.image((java.lang.Integer) 43996, (java.lang.Integer) (-1), (java.lang.Boolean) false, "RSS");
        java.lang.String str15 = internet9.domainSuffix();
        java.lang.String str16 = internet9.ipV4Address();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://lorempixel.com/43996/-1/food/RSS" + "'", str14, "http://lorempixel.com/43996/-1/food/RSS");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "biz" + "'", str15, "biz");
         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "239.150.62.143" + "'", str16, "239.150.62.143");
    }

    public void test121_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Poseidon" + "'", str9, "Poseidon");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Odysseus" + "'", str10, "Odysseus");
    }

    public void test121_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Poseidon" + "'", str9, "Poseidon");
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Odysseus" + "'", str10, "Odysseus");
    }

    public void test122_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.File file8 = faker1.file();
        java.lang.String str13 = file8.fileName("Brother", "That's the problem with life, either you know what you want and you don't get what you want, or you get what you want and then you don't know what you want", "Government Manager", "Videl");
        java.lang.String str14 = file8.extension();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "BrotherVidelThat's the problem with life, either you know what you want and you don't get what you want, or you get what you want and then you don't know what you want.Government Manager" + "'", str13, "BrotherVidelThat's the problem with life, either you know what you want and you don't get what you want, or you get what you want and then you don't know what you want.Government Manager");
         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "pages" + "'", str14, "pages");
    }

    public void test123_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Demon King Piccolo" + "'", str6, "Demon King Piccolo");
    }

    public void test124_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
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
         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Monica and Chandler's House" + "'", str69, "Monica and Chandler's House");
    }

    public void test125_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
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
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
        org.junit.Assert.assertNotNull(friends9);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy10);
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mice" + "'", str11, "Mice");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vogon Constructor Fleet" + "'", str12, "Vogon Constructor Fleet");
    }

    public void test125_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
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
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
        org.junit.Assert.assertNotNull(friends9);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mice" + "'", str11, "Mice");
         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Vogon Constructor Fleet" + "'", str12, "Vogon Constructor Fleet");
    }

    public void test126_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.Cat cat4 = faker1.cat();
        java.lang.String str5 = cat4.registry();
        java.lang.String str6 = cat4.breed();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(cat4);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cat Fanciers' Association" + "'", str5, "Cat Fanciers' Association");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ukrainian Levkoy" + "'", str6, "Ukrainian Levkoy");
    }

    public void test126_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.Cat cat4 = faker1.cat();
        java.lang.String str5 = cat4.registry();
        java.lang.String str6 = cat4.breed();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(cat4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cat Fanciers' Association" + "'", str5, "Cat Fanciers' Association");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ukrainian Levkoy" + "'", str6, "Ukrainian Levkoy");
    }

    public void test130_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MNGA" + "'", str6, "MNGA");
    }

    public void test131_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("25061420");
        java.lang.String str12 = internet9.slug();
        java.lang.String str14 = internet9.emailAddress("Cherrygrove City");
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25061420:d5:29:0d:94:07" + "'", str11, "25061420:d5:29:0d:94:07");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "et_vero" + "'", str12, "et_vero");
    }

    public void test131_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("25061420");
        java.lang.String str12 = internet9.slug();
        java.lang.String str14 = internet9.emailAddress("Cherrygrove City");
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25061420:d5:29:0d:94:07" + "'", str11, "25061420:d5:29:0d:94:07");
         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "et_vero" + "'", str12, "et_vero");
    }

    public void test132_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Light Lager" + "'", str9, "Light Lager");
    }

    public void test133_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.rtpPort();
        int int6 = sip4.rtpPort();
        int int7 = sip4.serverErrorResponseCode();
        int int8 = sip4.messagingPort();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 44112 + "'", int5 == 44112);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 47564 + "'", int6 == 47564);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 505 + "'", int7 == 505);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1246 + "'", int8 == 1246);
    }

    public void test133_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.rtpPort();
        int int6 = sip4.rtpPort();
        int int7 = sip4.serverErrorResponseCode();
        int int8 = sip4.messagingPort();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 44112 + "'", int5 == 44112);
         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 47564 + "'", int6 == 47564);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 505 + "'", int7 == 505);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1246 + "'", int8 == 1246);
    }

    public void test133_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.rtpPort();
        int int6 = sip4.rtpPort();
        int int7 = sip4.serverErrorResponseCode();
        int int8 = sip4.messagingPort();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 44112 + "'", int5 == 44112);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 47564 + "'", int6 == 47564);
         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 505 + "'", int7 == 505);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1246 + "'", int8 == 1246);
    }

    public void test133_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.rtpPort();
        int int6 = sip4.rtpPort();
        int int7 = sip4.serverErrorResponseCode();
        int int8 = sip4.messagingPort();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 44112 + "'", int5 == 44112);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 47564 + "'", int6 == 47564);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 505 + "'", int7 == 505);
         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1246 + "'", int8 == 1246);
    }

    public void test134_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Music music2 = faker1.music();
        java.lang.String str3 = music2.chord();
        java.lang.String str4 = music2.key();
        org.junit.Assert.assertNotNull(music2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Fbm" + "'", str3, "Fbm");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "B" + "'", str4, "B");
    }

    public void test134_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Music music2 = faker1.music();
        java.lang.String str3 = music2.chord();
        java.lang.String str4 = music2.key();
        org.junit.Assert.assertNotNull(music2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Fbm" + "'", str3, "Fbm");
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "B" + "'", str4, "B");
    }

    public void test136_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        java.lang.String str4 = slackEmoji3.activity();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":walking:" + "'", str4, ":walking:");
    }

    public void test137_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Color color3 = faker1.color();
        java.lang.String str4 = color3.hex();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(color3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#80FDAF" + "'", str4, "#80FDAF");
    }

    public void test138_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        java.lang.String str4 = faker1.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda5 = faker1.zelda();
        java.lang.String str6 = zelda5.character();
        java.lang.String str7 = zelda5.game();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":crossed_flags:" + "'", str4, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda5);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Talon" + "'", str6, "Talon");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "The Legend of Zelda" + "'", str7, "The Legend of Zelda");
    }

    public void test138_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        java.lang.String str4 = faker1.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda5 = faker1.zelda();
        java.lang.String str6 = zelda5.character();
        java.lang.String str7 = zelda5.game();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":crossed_flags:" + "'", str4, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Talon" + "'", str6, "Talon");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "The Legend of Zelda" + "'", str7, "The Legend of Zelda");
    }

    public void test139_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Hacker hacker4 = faker1.hacker();
        com.github.javafaker.Gender gender5 = faker1.gender();
        com.github.javafaker.ChuckNorris chuckNorris6 = faker1.chuckNorris();
        com.github.javafaker.Witcher witcher7 = faker1.witcher();
        java.lang.String str8 = witcher7.quote();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(chuckNorris6);
        org.junit.Assert.assertNotNull(witcher7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u2026 Is it 1358 yet? No? Then fuck off!" + "'", str8, "\u2026 Is it 1358 yet? No? Then fuck off!");
    }

    public void test141_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        java.lang.String str5 = faker1.numerify("female");
        com.github.javafaker.Company company6 = faker1.company();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker1.phoneNumber();
        java.lang.String str8 = phoneNumber7.cellPhone();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "female" + "'", str5, "female");
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(phoneNumber7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "929-152-9771" + "'", str8, "929-152-9771");
    }

    public void test142_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str14 = internet9.image((java.lang.Integer) 43996, (java.lang.Integer) (-1), (java.lang.Boolean) false, "RSS");
        java.lang.String str15 = internet9.domainSuffix();
        java.lang.String str18 = internet9.password((int) (byte) -1, 100);
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://lorempixel.com/43996/-1/technics/RSS" + "'", str14, "http://lorempixel.com/43996/-1/technics/RSS");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org" + "'", str15, "org");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2cpmf1jr5vm19a7q8o144wxkbes1gcf20pceguc7hv554jp0p4anhupxnstw0yx1plbzu04a6bdgafj4sev7wc" + "'", str18, "2cpmf1jr5vm19a7q8o144wxkbes1gcf20pceguc7hv554jp0p4anhupxnstw0yx1plbzu04a6bdgafj4sev7wc");
    }

    public void test142_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str14 = internet9.image((java.lang.Integer) 43996, (java.lang.Integer) (-1), (java.lang.Boolean) false, "RSS");
        java.lang.String str15 = internet9.domainSuffix();
        java.lang.String str18 = internet9.password((int) (byte) -1, 100);
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://lorempixel.com/43996/-1/technics/RSS" + "'", str14, "http://lorempixel.com/43996/-1/technics/RSS");
         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org" + "'", str15, "org");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2cpmf1jr5vm19a7q8o144wxkbes1gcf20pceguc7hv554jp0p4anhupxnstw0yx1plbzu04a6bdgafj4sev7wc" + "'", str18, "2cpmf1jr5vm19a7q8o144wxkbes1gcf20pceguc7hv554jp0p4anhupxnstw0yx1plbzu04a6bdgafj4sev7wc");
    }

    public void test142_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str14 = internet9.image((java.lang.Integer) 43996, (java.lang.Integer) (-1), (java.lang.Boolean) false, "RSS");
        java.lang.String str15 = internet9.domainSuffix();
        java.lang.String str18 = internet9.password((int) (byte) -1, 100);
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://lorempixel.com/43996/-1/technics/RSS" + "'", str14, "http://lorempixel.com/43996/-1/technics/RSS");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org" + "'", str15, "org");
         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2cpmf1jr5vm19a7q8o144wxkbes1gcf20pceguc7hv554jp0p4anhupxnstw0yx1plbzu04a6bdgafj4sev7wc" + "'", str18, "2cpmf1jr5vm19a7q8o144wxkbes1gcf20pceguc7hv554jp0p4anhupxnstw0yx1plbzu04a6bdgafj4sev7wc");
    }

    public void test144_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.rtpPort();
        java.lang.String str6 = sip4.nameAddress();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 41056 + "'", int5 == 41056);
    }

    public void test145_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
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
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "application/font-woff" + "'", str9, "application/font-woff");
    }

    public void test146_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DragonBall dragonBall2 = faker1.dragonBall();
        com.github.javafaker.Dune dune3 = faker1.dune();
        java.lang.String str4 = dune3.quote();
        java.lang.String str5 = dune3.planet();
        org.junit.Assert.assertNotNull(dragonBall2);
        org.junit.Assert.assertNotNull(dune3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2014 no matter the mood! Mood's a thing for cattle or making love or playing the baliset. It's not for fighting." + "'", str4, "\u2014 no matter the mood! Mood's a thing for cattle or making love or playing the baliset. It's not for fighting.");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Richesse" + "'", str5, "Richesse");
    }

    public void test146_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DragonBall dragonBall2 = faker1.dragonBall();
        com.github.javafaker.Dune dune3 = faker1.dune();
        java.lang.String str4 = dune3.quote();
        java.lang.String str5 = dune3.planet();
        org.junit.Assert.assertNotNull(dragonBall2);
        org.junit.Assert.assertNotNull(dune3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2014 no matter the mood! Mood's a thing for cattle or making love or playing the baliset. It's not for fighting." + "'", str4, "\u2014 no matter the mood! Mood's a thing for cattle or making love or playing the baliset. It's not for fighting.");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Richesse" + "'", str5, "Richesse");
    }

    public void test147_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.AquaTeenHungerForce aquaTeenHungerForce4 = faker1.aquaTeenHungerForce();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        java.util.List<java.lang.String> strList7 = lorem5.paragraphs(43996);
        java.lang.String str8 = lorem5.paragraph();
        java.lang.String str9 = lorem5.word();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(aquaTeenHungerForce4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(strList7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Quisquam impedit est expedita consequuntur error voluptatem suscipit. Rerum maiores quae dolorem quibusdam. Natus in dignissimos ab. Eligendi enim repellendus sed praesentium nisi. Itaque quia voluptates." + "'", str8, "Quisquam impedit est expedita consequuntur error voluptatem suscipit. Rerum maiores quae dolorem quibusdam. Natus in dignissimos ab. Eligendi enim repellendus sed praesentium nisi. Itaque quia voluptates.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dolore" + "'", str9, "dolore");
    }

    public void test147_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.AquaTeenHungerForce aquaTeenHungerForce4 = faker1.aquaTeenHungerForce();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        java.util.List<java.lang.String> strList7 = lorem5.paragraphs(43996);
        java.lang.String str8 = lorem5.paragraph();
        java.lang.String str9 = lorem5.word();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(aquaTeenHungerForce4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(strList7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Quisquam impedit est expedita consequuntur error voluptatem suscipit. Rerum maiores quae dolorem quibusdam. Natus in dignissimos ab. Eligendi enim repellendus sed praesentium nisi. Itaque quia voluptates." + "'", str8, "Quisquam impedit est expedita consequuntur error voluptatem suscipit. Rerum maiores quae dolorem quibusdam. Natus in dignissimos ab. Eligendi enim repellendus sed praesentium nisi. Itaque quia voluptates.");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dolore" + "'", str9, "dolore");
    }

    public void test148_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.AquaTeenHungerForce aquaTeenHungerForce4 = faker1.aquaTeenHungerForce();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        char char6 = lorem5.character();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(aquaTeenHungerForce4);
        org.junit.Assert.assertNotNull(lorem5);
         org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'c' + "'", char6 == 'c');
    }

    public void test149_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Music music2 = faker1.music();
        java.lang.String str3 = music2.key();
        org.junit.Assert.assertNotNull(music2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "F#" + "'", str3, "F#");
    }

    public void test150_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Barcode barcode6 = faker1.barcode();
        com.github.javafaker.App app7 = faker1.app();
        com.github.javafaker.Matz matz8 = faker1.matz();
        com.github.javafaker.HarryPotter harryPotter9 = faker1.harryPotter();
        java.lang.String str10 = harryPotter9.house();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(barcode6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(matz8);
        org.junit.Assert.assertNotNull(harryPotter9);
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ravenclaw" + "'", str10, "Ravenclaw");
    }

    public void test151_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Brookville High" + "'", str8, "Brookville High");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Falconholt Campus" + "'", str9, "Falconholt Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lakeacre Campus" + "'", str10, "Lakeacre Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Icelyn Campus" + "'", str11, "Icelyn Campus");
    }

    public void test151_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Brookville High" + "'", str8, "Brookville High");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Falconholt Campus" + "'", str9, "Falconholt Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lakeacre Campus" + "'", str10, "Lakeacre Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Icelyn Campus" + "'", str11, "Icelyn Campus");
    }

    public void test151_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Brookville High" + "'", str8, "Brookville High");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Falconholt Campus" + "'", str9, "Falconholt Campus");
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lakeacre Campus" + "'", str10, "Lakeacre Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Icelyn Campus" + "'", str11, "Icelyn Campus");
    }

    public void test151_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Brookville High" + "'", str8, "Brookville High");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Falconholt Campus" + "'", str9, "Falconholt Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lakeacre Campus" + "'", str10, "Lakeacre Campus");
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Icelyn Campus" + "'", str11, "Icelyn Campus");
    }

    public void test152_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Barcode barcode6 = faker1.barcode();
        com.github.javafaker.Dog dog7 = faker1.dog();
        com.github.javafaker.Company company8 = faker1.company();
        java.lang.String str9 = company8.suffix();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(barcode6);
        org.junit.Assert.assertNotNull(dog7);
        org.junit.Assert.assertNotNull(company8);
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LLC" + "'", str9, "LLC");
    }

    public void test155_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Job job4 = faker1.job();
        java.lang.String str5 = job4.keySkills();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(job4);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Work under pressure" + "'", str5, "Work under pressure");
    }

    public void test157_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
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
        java.lang.String str12 = hitchhikersGuideToTheGalaxy10.specie();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
        org.junit.Assert.assertNotNull(friends9);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy10);
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hooloovoo" + "'", str11, "Hooloovoo");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mattress" + "'", str12, "Mattress");
    }

    public void test157_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
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
        java.lang.String str12 = hitchhikersGuideToTheGalaxy10.specie();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
        org.junit.Assert.assertNotNull(friends9);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hooloovoo" + "'", str11, "Hooloovoo");
         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Mattress" + "'", str12, "Mattress");
    }

    public void test158_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Color color3 = faker1.color();
        com.github.javafaker.Lebowski lebowski4 = faker1.lebowski();
        java.lang.String str5 = lebowski4.character();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(lebowski4);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Walter Sobchak" + "'", str5, "Walter Sobchak");
    }

    public void test159_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
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
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Avatar avatar39 = faker38.avatar();
        java.lang.String str41 = faker38.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda42 = faker38.zelda();
        java.lang.String str43 = zelda42.character();
        java.util.Random random44 = null;
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker(random44);
        com.github.javafaker.Avatar avatar46 = faker45.avatar();
        java.lang.String str48 = faker45.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda49 = faker45.zelda();
        java.util.Random random50 = null;
        com.github.javafaker.Faker faker51 = new com.github.javafaker.Faker(random50);
        com.github.javafaker.Avatar avatar52 = faker51.avatar();
        java.lang.String str54 = faker51.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda55 = faker51.zelda();
        java.util.Random random56 = null;
        com.github.javafaker.Faker faker57 = new com.github.javafaker.Faker(random56);
        com.github.javafaker.Avatar avatar58 = faker57.avatar();
        java.lang.String str60 = faker57.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda61 = faker57.zelda();
        java.lang.String str62 = zelda61.character();
        com.github.javafaker.Zelda[] zeldaArray63 = new com.github.javafaker.Zelda[] { zelda42, zelda49, zelda55, zelda61 };
        com.github.javafaker.Zelda zelda64 = options4.nextElement(zeldaArray63);
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
        org.junit.Assert.assertNotNull(avatar39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ":crossed_flags:" + "'", str41, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda42);
         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Rosa Sisters" + "'", str43, "Rosa Sisters");
        org.junit.Assert.assertNotNull(avatar46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ":crossed_flags:" + "'", str48, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda49);
        org.junit.Assert.assertNotNull(avatar52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + ":crossed_flags:" + "'", str54, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda55);
        org.junit.Assert.assertNotNull(avatar58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + ":crossed_flags:" + "'", str60, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda61);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Patch" + "'", str62, "Patch");
        org.junit.Assert.assertNotNull(zeldaArray63);
        org.junit.Assert.assertNotNull(zelda64);
    }

    public void test159_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
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
        java.util.Random random37 = null;
        com.github.javafaker.Faker faker38 = new com.github.javafaker.Faker(random37);
        com.github.javafaker.Avatar avatar39 = faker38.avatar();
        java.lang.String str41 = faker38.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda42 = faker38.zelda();
        java.lang.String str43 = zelda42.character();
        java.util.Random random44 = null;
        com.github.javafaker.Faker faker45 = new com.github.javafaker.Faker(random44);
        com.github.javafaker.Avatar avatar46 = faker45.avatar();
        java.lang.String str48 = faker45.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda49 = faker45.zelda();
        java.util.Random random50 = null;
        com.github.javafaker.Faker faker51 = new com.github.javafaker.Faker(random50);
        com.github.javafaker.Avatar avatar52 = faker51.avatar();
        java.lang.String str54 = faker51.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda55 = faker51.zelda();
        java.util.Random random56 = null;
        com.github.javafaker.Faker faker57 = new com.github.javafaker.Faker(random56);
        com.github.javafaker.Avatar avatar58 = faker57.avatar();
        java.lang.String str60 = faker57.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda61 = faker57.zelda();
        java.lang.String str62 = zelda61.character();
        com.github.javafaker.Zelda[] zeldaArray63 = new com.github.javafaker.Zelda[] { zelda42, zelda49, zelda55, zelda61 };
        com.github.javafaker.Zelda zelda64 = options4.nextElement(zeldaArray63);
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
        org.junit.Assert.assertNotNull(avatar39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ":crossed_flags:" + "'", str41, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda42);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Rosa Sisters" + "'", str43, "Rosa Sisters");
        org.junit.Assert.assertNotNull(avatar46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ":crossed_flags:" + "'", str48, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda49);
        org.junit.Assert.assertNotNull(avatar52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + ":crossed_flags:" + "'", str54, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda55);
        org.junit.Assert.assertNotNull(avatar58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + ":crossed_flags:" + "'", str60, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda61);
         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Patch" + "'", str62, "Patch");
        org.junit.Assert.assertNotNull(zeldaArray63);
        org.junit.Assert.assertNotNull(zelda64);
    }

    public void test160_1() throws Throwable {
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
        java.lang.String str9 = beer8.name();
        java.lang.String str10 = beer8.hop();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(educator7);
        org.junit.Assert.assertNotNull(beer8);
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Duvel" + "'", str9, "Duvel");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Simcoe" + "'", str10, "Simcoe");
    }

    public void test160_2() throws Throwable {
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
        java.lang.String str9 = beer8.name();
        java.lang.String str10 = beer8.hop();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(educator7);
        org.junit.Assert.assertNotNull(beer8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Duvel" + "'", str9, "Duvel");
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Simcoe" + "'", str10, "Simcoe");
    }

    public void test161_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DragonBall dragonBall2 = faker1.dragonBall();
        com.github.javafaker.Dune dune3 = faker1.dune();
        java.lang.String str4 = dune3.quote();
        java.lang.String str5 = dune3.title();
        org.junit.Assert.assertNotNull(dragonBall2);
        org.junit.Assert.assertNotNull(dune3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2014one hundred men." + "'", str4, "\u2014one hundred men.");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Duke" + "'", str5, "Duke");
    }

    public void test161_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DragonBall dragonBall2 = faker1.dragonBall();
        com.github.javafaker.Dune dune3 = faker1.dune();
        java.lang.String str4 = dune3.quote();
        java.lang.String str5 = dune3.title();
        org.junit.Assert.assertNotNull(dragonBall2);
        org.junit.Assert.assertNotNull(dune3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u2014one hundred men." + "'", str4, "\u2014one hundred men.");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Duke" + "'", str5, "Duke");
    }

    public void test162_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
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
        java.lang.String str10 = witcher7.school();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(chuckNorris6);
        org.junit.Assert.assertNotNull(witcher7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Foglet" + "'", str8, "Foglet");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Griffin" + "'", str9, "Griffin");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Wolf" + "'", str10, "Wolf");
    }

    public void test162_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
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
        java.lang.String str10 = witcher7.school();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(chuckNorris6);
        org.junit.Assert.assertNotNull(witcher7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Foglet" + "'", str8, "Foglet");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Griffin" + "'", str9, "Griffin");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Wolf" + "'", str10, "Wolf");
    }

    public void test162_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
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
        java.lang.String str10 = witcher7.school();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(chuckNorris6);
        org.junit.Assert.assertNotNull(witcher7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Foglet" + "'", str8, "Foglet");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Griffin" + "'", str9, "Griffin");
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Wolf" + "'", str10, "Wolf");
    }

    public void test163_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Esports esports5 = faker1.esports();
        java.lang.String str6 = esports5.player();
        java.lang.String str7 = esports5.event();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(esports5);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cArn" + "'", str6, "cArn");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MLG Meadowlands" + "'", str7, "MLG Meadowlands");
    }

    public void test163_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Esports esports5 = faker1.esports();
        java.lang.String str6 = esports5.player();
        java.lang.String str7 = esports5.event();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(esports5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "cArn" + "'", str6, "cArn");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MLG Meadowlands" + "'", str7, "MLG Meadowlands");
    }

    public void test164_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        java.lang.String str4 = slackEmoji3.emoji();
        java.lang.String str5 = slackEmoji3.emoji();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":oncoming_automobile:" + "'", str4, ":oncoming_automobile:");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":cn:" + "'", str5, ":cn:");
    }

    public void test164_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        java.lang.String str4 = slackEmoji3.emoji();
        java.lang.String str5 = slackEmoji3.emoji();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":oncoming_automobile:" + "'", str4, ":oncoming_automobile:");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":cn:" + "'", str5, ":cn:");
    }

    public void test165_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Barcode barcode6 = faker1.barcode();
        com.github.javafaker.Dog dog7 = faker1.dog();
        com.github.javafaker.Country country8 = faker1.country();
        java.lang.String str9 = country8.capital();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(barcode6);
        org.junit.Assert.assertNotNull(dog7);
        org.junit.Assert.assertNotNull(country8);
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Bamako" + "'", str9, "Bamako");
    }

    public void test166_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.github.javafaker.idnumbers.SvSEIdNumber svSEIdNumber0 = new com.github.javafaker.idnumbers.SvSEIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Photography photography3 = faker2.photography();
        com.github.javafaker.Food food4 = faker2.food();
        com.github.javafaker.Job job5 = faker2.job();
        java.lang.String str6 = svSEIdNumber0.getValidSsn(faker2);
        com.github.javafaker.Business business7 = faker2.business();
        java.lang.String str8 = business7.creditCardExpiry();
        org.junit.Assert.assertNotNull(photography3);
        org.junit.Assert.assertNotNull(food4);
        org.junit.Assert.assertNotNull(job5);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "380722+0292" + "'", str6, "380722+0292");
        org.junit.Assert.assertNotNull(business7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2015-11-11" + "'", str8, "2015-11-11");
    }

    public void test166_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.github.javafaker.idnumbers.SvSEIdNumber svSEIdNumber0 = new com.github.javafaker.idnumbers.SvSEIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Photography photography3 = faker2.photography();
        com.github.javafaker.Food food4 = faker2.food();
        com.github.javafaker.Job job5 = faker2.job();
        java.lang.String str6 = svSEIdNumber0.getValidSsn(faker2);
        com.github.javafaker.Business business7 = faker2.business();
        java.lang.String str8 = business7.creditCardExpiry();
        org.junit.Assert.assertNotNull(photography3);
        org.junit.Assert.assertNotNull(food4);
        org.junit.Assert.assertNotNull(job5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "380722+0292" + "'", str6, "380722+0292");
        org.junit.Assert.assertNotNull(business7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2015-11-11" + "'", str8, "2015-11-11");
    }

    public void test167_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Music music2 = faker1.music();
        java.lang.String str3 = music2.instrument();
        org.junit.Assert.assertNotNull(music2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Trumpet" + "'", str3, "Trumpet");
    }

    public void test169_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Superhero superhero6 = faker1.superhero();
        java.lang.String str7 = superhero6.prefix();
        java.lang.String str8 = superhero6.descriptor();
        java.lang.String str9 = superhero6.suffix();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(superhero6);
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "The" + "'", str7, "The");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Jolt" + "'", str8, "Jolt");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Brain" + "'", str9, "Brain");
    }

    public void test169_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Superhero superhero6 = faker1.superhero();
        java.lang.String str7 = superhero6.prefix();
        java.lang.String str8 = superhero6.descriptor();
        java.lang.String str9 = superhero6.suffix();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(superhero6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "The" + "'", str7, "The");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Jolt" + "'", str8, "Jolt");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Brain" + "'", str9, "Brain");
    }

    public void test169_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Superhero superhero6 = faker1.superhero();
        java.lang.String str7 = superhero6.prefix();
        java.lang.String str8 = superhero6.descriptor();
        java.lang.String str9 = superhero6.suffix();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(superhero6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "The" + "'", str7, "The");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Jolt" + "'", str8, "Jolt");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Brain" + "'", str9, "Brain");
    }

    public void test170_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        java.lang.String str4 = food3.dish();
        java.lang.String str5 = food3.measurement();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Sushi" + "'", str4, "Sushi");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 gallon" + "'", str5, "1 gallon");
    }

    public void test170_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        java.lang.String str4 = food3.dish();
        java.lang.String str5 = food3.measurement();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Sushi" + "'", str4, "Sushi");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 gallon" + "'", str5, "1 gallon");
    }

    public void test172_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.provisionalResponseCode();
        byte[] byteArray6 = sip4.bodyBytes();
        java.lang.String str7 = sip4.contentType();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[118, 61, 48, 10, 111, 61, 74, 101, 114, 101, 32, 51, 56, 53, 55, 56, 99, 56, 55, 45, 101, 48, 50, 56, 45, 52, 49, 51, 50, 45, 56, 56, 52, 57, 45, 97, 102, 49, 51, 49, 53, 98, 57, 101, 48, 55, 100, 32, 73, 78, 32, 73, 80, 52, 32, 109, 117, 114, 112, 104, 121, 46, 110, 97, 109, 101, 10, 115, 61, 45, 10, 99, 61, 73, 78, 32, 73, 80, 52, 32, 56, 51, 46, 49, 55, 49, 46, 57, 51, 46, 49, 53, 54, 10, 116, 61, 48, 32, 48, 10, 109, 61, 97, 117, 100, 105, 111, 32, 52, 55, 51, 51, 48, 32, 82, 84, 80, 47, 65, 86, 80, 32, 48, 10, 97, 61, 114, 116, 112, 109, 97, 112, 58, 48, 32, 80, 67, 77, 85, 47, 56, 48, 48, 48]");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multipart/related" + "'", str7, "multipart/related");
    }

    public void test172_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.provisionalResponseCode();
        byte[] byteArray6 = sip4.bodyBytes();
        java.lang.String str7 = sip4.contentType();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(byteArray6);
         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[118, 61, 48, 10, 111, 61, 74, 101, 114, 101, 32, 51, 56, 53, 55, 56, 99, 56, 55, 45, 101, 48, 50, 56, 45, 52, 49, 51, 50, 45, 56, 56, 52, 57, 45, 97, 102, 49, 51, 49, 53, 98, 57, 101, 48, 55, 100, 32, 73, 78, 32, 73, 80, 52, 32, 109, 117, 114, 112, 104, 121, 46, 110, 97, 109, 101, 10, 115, 61, 45, 10, 99, 61, 73, 78, 32, 73, 80, 52, 32, 56, 51, 46, 49, 55, 49, 46, 57, 51, 46, 49, 53, 54, 10, 116, 61, 48, 32, 48, 10, 109, 61, 97, 117, 100, 105, 111, 32, 52, 55, 51, 51, 48, 32, 82, 84, 80, 47, 65, 86, 80, 32, 48, 10, 97, 61, 114, 116, 112, 109, 97, 112, 58, 48, 32, 80, 67, 77, 85, 47, 56, 48, 48, 48]");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multipart/related" + "'", str7, "multipart/related");
    }

    public void test172_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.provisionalResponseCode();
        byte[] byteArray6 = sip4.bodyBytes();
        java.lang.String str7 = sip4.contentType();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(byteArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[118, 61, 48, 10, 111, 61, 74, 101, 114, 101, 32, 51, 56, 53, 55, 56, 99, 56, 55, 45, 101, 48, 50, 56, 45, 52, 49, 51, 50, 45, 56, 56, 52, 57, 45, 97, 102, 49, 51, 49, 53, 98, 57, 101, 48, 55, 100, 32, 73, 78, 32, 73, 80, 52, 32, 109, 117, 114, 112, 104, 121, 46, 110, 97, 109, 101, 10, 115, 61, 45, 10, 99, 61, 73, 78, 32, 73, 80, 52, 32, 56, 51, 46, 49, 55, 49, 46, 57, 51, 46, 49, 53, 54, 10, 116, 61, 48, 32, 48, 10, 109, 61, 97, 117, 100, 105, 111, 32, 52, 55, 51, 51, 48, 32, 82, 84, 80, 47, 65, 86, 80, 32, 48, 10, 97, 61, 114, 116, 112, 109, 97, 112, 58, 48, 32, 80, 67, 77, 85, 47, 56, 48, 48, 48]");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multipart/related" + "'", str7, "multipart/related");
    }

    public void test173_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        java.lang.String str5 = sip4.provisionalResponsePhrase();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Call Is Being Forwarded" + "'", str5, "Call Is Being Forwarded");
    }

    public void test174_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.AquaTeenHungerForce aquaTeenHungerForce4 = faker1.aquaTeenHungerForce();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        java.util.List<java.lang.String> strList7 = lorem5.paragraphs(43996);
        java.lang.String str8 = lorem5.paragraph();
        java.lang.String str9 = lorem5.sentence();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(aquaTeenHungerForce4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(strList7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "In quo qui omnis velit tenetur pariatur. Tenetur et et perspiciatis non voluptas ea fuga. Dignissimos assumenda iure et voluptatibus et autem et. Natus eum aut est dolor est iure. Accusamus accusantium est ipsam quos." + "'", str8, "In quo qui omnis velit tenetur pariatur. Tenetur et et perspiciatis non voluptas ea fuga. Dignissimos assumenda iure et voluptatibus et autem et. Natus eum aut est dolor est iure. Accusamus accusantium est ipsam quos.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debitis fugiat sint perspiciatis voluptas." + "'", str9, "Debitis fugiat sint perspiciatis voluptas.");
    }

    public void test174_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.AquaTeenHungerForce aquaTeenHungerForce4 = faker1.aquaTeenHungerForce();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        java.util.List<java.lang.String> strList7 = lorem5.paragraphs(43996);
        java.lang.String str8 = lorem5.paragraph();
        java.lang.String str9 = lorem5.sentence();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(aquaTeenHungerForce4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(strList7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "In quo qui omnis velit tenetur pariatur. Tenetur et et perspiciatis non voluptas ea fuga. Dignissimos assumenda iure et voluptatibus et autem et. Natus eum aut est dolor est iure. Accusamus accusantium est ipsam quos." + "'", str8, "In quo qui omnis velit tenetur pariatur. Tenetur et et perspiciatis non voluptas ea fuga. Dignissimos assumenda iure et voluptatibus et autem et. Natus eum aut est dolor est iure. Accusamus accusantium est ipsam quos.");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Debitis fugiat sint perspiciatis voluptas." + "'", str9, "Debitis fugiat sint perspiciatis voluptas.");
    }

    public void test175_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "It is by will alone I set my mind in motion. It is by the juice of Sapho that thoughts acquire speed, the lips acquire stains. The stains become a warning." + "'", str5, "It is by will alone I set my mind in motion. It is by the juice of Sapho that thoughts acquire speed, the lips acquire stains. The stains become a warning.");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2026\u2026 did not mean to be familiar." + "'", str6, "\u2026\u2026 did not mean to be familiar.");
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + com.github.javafaker.Dune.Quote.ALIA + "'", quote7.equals(com.github.javafaker.Dune.Quote.ALIA));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "The Guild... they're fighting me in the mental vaults. They're behind everything. They fear the one who will come, who will know more, who will see more. The Guild is behind everything. It's not finished yet. I'm not formed." + "'", str8, "The Guild... they're fighting me in the mental vaults. They're behind everything. They fear the one who will come, who will know more, who will see more. The Guild is behind everything. It's not finished yet. I'm not formed.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Earl" + "'", str9, "Earl");
    }

    public void test175_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
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
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "It is by will alone I set my mind in motion. It is by the juice of Sapho that thoughts acquire speed, the lips acquire stains. The stains become a warning." + "'", str5, "It is by will alone I set my mind in motion. It is by the juice of Sapho that thoughts acquire speed, the lips acquire stains. The stains become a warning.");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2026\u2026 did not mean to be familiar." + "'", str6, "\u2026\u2026 did not mean to be familiar.");
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + com.github.javafaker.Dune.Quote.ALIA + "'", quote7.equals(com.github.javafaker.Dune.Quote.ALIA));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "The Guild... they're fighting me in the mental vaults. They're behind everything. They fear the one who will come, who will know more, who will see more. The Guild is behind everything. It's not finished yet. I'm not formed." + "'", str8, "The Guild... they're fighting me in the mental vaults. They're behind everything. They fear the one who will come, who will know more, who will see more. The Guild is behind everything. It's not finished yet. I'm not formed.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Earl" + "'", str9, "Earl");
    }

    public void test175_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
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
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "It is by will alone I set my mind in motion. It is by the juice of Sapho that thoughts acquire speed, the lips acquire stains. The stains become a warning." + "'", str5, "It is by will alone I set my mind in motion. It is by the juice of Sapho that thoughts acquire speed, the lips acquire stains. The stains become a warning.");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u2026\u2026 did not mean to be familiar." + "'", str6, "\u2026\u2026 did not mean to be familiar.");
        org.junit.Assert.assertTrue("'" + quote7 + "' != '" + com.github.javafaker.Dune.Quote.ALIA + "'", quote7.equals(com.github.javafaker.Dune.Quote.ALIA));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "The Guild... they're fighting me in the mental vaults. They're behind everything. They fear the one who will come, who will know more, who will see more. The Guild is behind everything. It's not finished yet. I'm not formed." + "'", str8, "The Guild... they're fighting me in the mental vaults. They're behind everything. They fear the one who will come, who will know more, who will see more. The Guild is behind everything. It's not finished yet. I'm not formed.");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Earl" + "'", str9, "Earl");
    }

    public void test180_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bus" + "'", str5, "bus");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bypassing" + "'", str6, "bypassing");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bluetooth" + "'", str7, "bluetooth");
    }

    public void test180_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
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
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bus" + "'", str5, "bus");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bypassing" + "'", str6, "bypassing");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bluetooth" + "'", str7, "bluetooth");
    }

    public void test180_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
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
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bus" + "'", str5, "bus");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bypassing" + "'", str6, "bypassing");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bluetooth" + "'", str7, "bluetooth");
    }

    public void test181_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
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
        java.lang.String str11 = relationships7.extended();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(basketball5);
        org.junit.Assert.assertNotNull(university6);
        org.junit.Assert.assertNotNull(relationships7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mother" + "'", str8, "Mother");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Brother-in-law" + "'", str9, "Brother-in-law");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Brother" + "'", str10, "Brother");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Grandson" + "'", str11, "Grandson");
    }

    public void test181_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
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
        java.lang.String str11 = relationships7.extended();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(basketball5);
        org.junit.Assert.assertNotNull(university6);
        org.junit.Assert.assertNotNull(relationships7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mother" + "'", str8, "Mother");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Brother-in-law" + "'", str9, "Brother-in-law");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Brother" + "'", str10, "Brother");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Grandson" + "'", str11, "Grandson");
    }

    public void test181_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
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
        java.lang.String str11 = relationships7.extended();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(basketball5);
        org.junit.Assert.assertNotNull(university6);
        org.junit.Assert.assertNotNull(relationships7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mother" + "'", str8, "Mother");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Brother-in-law" + "'", str9, "Brother-in-law");
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Brother" + "'", str10, "Brother");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Grandson" + "'", str11, "Grandson");
    }

    public void test181_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
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
        java.lang.String str11 = relationships7.extended();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(basketball5);
        org.junit.Assert.assertNotNull(university6);
        org.junit.Assert.assertNotNull(relationships7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mother" + "'", str8, "Mother");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Brother-in-law" + "'", str9, "Brother-in-law");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Brother" + "'", str10, "Brother");
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Grandson" + "'", str11, "Grandson");
    }

    public void test182_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        java.lang.String str4 = idNumber3.valid();
        java.lang.String str5 = idNumber3.invalid();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "114-11-4788" + "'", str4, "114-11-4788");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "000-51-2720" + "'", str5, "000-51-2720");
    }

    public void test182_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        java.lang.String str4 = idNumber3.valid();
        java.lang.String str5 = idNumber3.invalid();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "114-11-4788" + "'", str4, "114-11-4788");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "000-51-2720" + "'", str5, "000-51-2720");
    }

    public void test183_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str10 = internet9.avatar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = internet9.password((int) (short) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "https://s3.amazonaws.com/uifaces/faces/twitter/mrjamesnoble/128.jpg" + "'", str10, "https://s3.amazonaws.com/uifaces/faces/twitter/mrjamesnoble/128.jpg");
    }

    public void test186_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Photography photography6 = faker1.photography();
        java.lang.String str7 = photography6.shutter();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(photography6);
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "15" + "'", str7, "15");
    }

    public void test188_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.rtpPort();
        int int6 = sip4.serverErrorResponseCode();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49004 + "'", int5 == 49004);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
    }

    public void test188_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.rtpPort();
        int int6 = sip4.serverErrorResponseCode();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49004 + "'", int5 == 49004);
         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
    }

    public void test190_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Superhero superhero6 = faker1.superhero();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        java.lang.String str8 = demographic7.maritalStatus();
        java.lang.String str9 = demographic7.maritalStatus();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(superhero6);
        org.junit.Assert.assertNotNull(demographic7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Separated" + "'", str8, "Separated");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Never married" + "'", str9, "Never married");
    }

    public void test190_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Superhero superhero6 = faker1.superhero();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        java.lang.String str8 = demographic7.maritalStatus();
        java.lang.String str9 = demographic7.maritalStatus();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(superhero6);
        org.junit.Assert.assertNotNull(demographic7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Separated" + "'", str8, "Separated");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Never married" + "'", str9, "Never married");
    }

    public void test192_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Job job4 = faker1.job();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Hacker hacker6 = faker1.hacker();
        java.lang.String str7 = hacker6.adjective();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(job4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(hacker6);
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1080p" + "'", str7, "1080p");
    }

    public void test193_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        java.lang.String str8 = faker1.expression("BoJack Horseman");
        com.github.javafaker.Barcode barcode9 = faker1.barcode();
        com.github.javafaker.Beer beer10 = faker1.beer();
        java.lang.String str11 = beer10.hop();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "BoJack Horseman" + "'", str8, "BoJack Horseman");
        org.junit.Assert.assertNotNull(barcode9);
        org.junit.Assert.assertNotNull(beer10);
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Vanguard" + "'", str11, "Vanguard");
    }

    public void test194_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Father" + "'", str8, "Father");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Wife" + "'", str9, "Wife");
    }

    public void test194_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Father" + "'", str8, "Father");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Wife" + "'", str9, "Wife");
    }

    public void test195_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str7 = code5.ean8();
        java.lang.String str8 = code5.ean13();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9780879822224" + "'", str6, "9780879822224");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "02625003" + "'", str7, "02625003");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7706802142643" + "'", str8, "7706802142643");
    }

    public void test195_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str7 = code5.ean8();
        java.lang.String str8 = code5.ean13();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9780879822224" + "'", str6, "9780879822224");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "02625003" + "'", str7, "02625003");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7706802142643" + "'", str8, "7706802142643");
    }

    public void test195_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str7 = code5.ean8();
        java.lang.String str8 = code5.ean13();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9780879822224" + "'", str6, "9780879822224");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "02625003" + "'", str7, "02625003");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7706802142643" + "'", str8, "7706802142643");
    }

    public void test196_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        com.github.javafaker.Dog dog4 = faker1.dog();
        java.lang.String str5 = dog4.age();
        java.lang.String str6 = dog4.breed();
        java.lang.String str7 = dog4.size();
        java.lang.String str8 = dog4.gender();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(dog4);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "young" + "'", str5, "young");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Borzoi" + "'", str6, "Borzoi");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "extra large" + "'", str7, "extra large");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "male" + "'", str8, "male");
    }

    public void test196_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        com.github.javafaker.Dog dog4 = faker1.dog();
        java.lang.String str5 = dog4.age();
        java.lang.String str6 = dog4.breed();
        java.lang.String str7 = dog4.size();
        java.lang.String str8 = dog4.gender();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(dog4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "young" + "'", str5, "young");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Borzoi" + "'", str6, "Borzoi");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "extra large" + "'", str7, "extra large");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "male" + "'", str8, "male");
    }

    public void test196_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        com.github.javafaker.Dog dog4 = faker1.dog();
        java.lang.String str5 = dog4.age();
        java.lang.String str6 = dog4.breed();
        java.lang.String str7 = dog4.size();
        java.lang.String str8 = dog4.gender();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(dog4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "young" + "'", str5, "young");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Borzoi" + "'", str6, "Borzoi");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "extra large" + "'", str7, "extra large");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "male" + "'", str8, "male");
    }

    public void test196_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        com.github.javafaker.Dog dog4 = faker1.dog();
        java.lang.String str5 = dog4.age();
        java.lang.String str6 = dog4.breed();
        java.lang.String str7 = dog4.size();
        java.lang.String str8 = dog4.gender();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(dog4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "young" + "'", str5, "young");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Borzoi" + "'", str6, "Borzoi");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "extra large" + "'", str7, "extra large");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "male" + "'", str8, "male");
    }

    public void test197_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str14 = internet9.image((java.lang.Integer) 43996, (java.lang.Integer) (-1), (java.lang.Boolean) false, "RSS");
        com.github.javafaker.Internet.UserAgent userAgent15 = com.github.javafaker.Internet.UserAgent.OPERA;
        java.lang.String str16 = internet9.userAgent(userAgent15);
        java.lang.String str17 = userAgent15.toString();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://lorempixel.com/43996/-1/abstract/RSS" + "'", str14, "http://lorempixel.com/43996/-1/abstract/RSS");
        org.junit.Assert.assertTrue("'" + userAgent15 + "' != '" + com.github.javafaker.Internet.UserAgent.OPERA + "'", userAgent15.equals(com.github.javafaker.Internet.UserAgent.OPERA));
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Opera/9.80 (X11; Linux i686; Ubuntu/14.10) Presto/2.12.388 Version/12.16" + "'", str16, "Opera/9.80 (X11; Linux i686; Ubuntu/14.10) Presto/2.12.388 Version/12.16");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "opera" + "'", str17, "opera");
    }

    public void test197_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str14 = internet9.image((java.lang.Integer) 43996, (java.lang.Integer) (-1), (java.lang.Boolean) false, "RSS");
        com.github.javafaker.Internet.UserAgent userAgent15 = com.github.javafaker.Internet.UserAgent.OPERA;
        java.lang.String str16 = internet9.userAgent(userAgent15);
        java.lang.String str17 = userAgent15.toString();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://lorempixel.com/43996/-1/abstract/RSS" + "'", str14, "http://lorempixel.com/43996/-1/abstract/RSS");
        org.junit.Assert.assertTrue("'" + userAgent15 + "' != '" + com.github.javafaker.Internet.UserAgent.OPERA + "'", userAgent15.equals(com.github.javafaker.Internet.UserAgent.OPERA));
         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Opera/9.80 (X11; Linux i686; Ubuntu/14.10) Presto/2.12.388 Version/12.16" + "'", str16, "Opera/9.80 (X11; Linux i686; Ubuntu/14.10) Presto/2.12.388 Version/12.16");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "opera" + "'", str17, "opera");
    }

    public void test198_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.github.javafaker.idnumbers.EnIdNumber enIdNumber0 = new com.github.javafaker.idnumbers.EnIdNumber();
        java.util.Random random1 = null;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Avatar avatar3 = faker2.avatar();
        com.github.javafaker.Barcode barcode4 = new com.github.javafaker.Barcode(faker2);
        java.lang.String str6 = faker2.numerify("female");
        com.github.javafaker.Mountain mountain7 = faker2.mountain();
        java.lang.String str8 = enIdNumber0.getValidSsn(faker2);
        com.github.javafaker.Currency currency9 = new com.github.javafaker.Currency(faker2);
        org.junit.Assert.assertNotNull(avatar3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "female" + "'", str6, "female");
        org.junit.Assert.assertNotNull(mountain7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "780-42-7950" + "'", str8, "780-42-7950");
    }

    public void test200_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("25061420");
        java.lang.String str12 = internet9.domainSuffix();
        java.lang.String str13 = internet9.image();
        java.lang.String str14 = internet9.url();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25061420:60:76:48:e3:38" + "'", str11, "25061420:60:76:48:e3:38");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org" + "'", str12, "org");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://lorempixel.com/1600/1200/people/" + "'", str13, "http://lorempixel.com/1600/1200/people/");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "www.carolina-murphy.info" + "'", str14, "www.carolina-murphy.info");
    }

    public void test200_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("25061420");
        java.lang.String str12 = internet9.domainSuffix();
        java.lang.String str13 = internet9.image();
        java.lang.String str14 = internet9.url();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25061420:60:76:48:e3:38" + "'", str11, "25061420:60:76:48:e3:38");
         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org" + "'", str12, "org");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://lorempixel.com/1600/1200/people/" + "'", str13, "http://lorempixel.com/1600/1200/people/");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "www.carolina-murphy.info" + "'", str14, "www.carolina-murphy.info");
    }

    public void test200_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("25061420");
        java.lang.String str12 = internet9.domainSuffix();
        java.lang.String str13 = internet9.image();
        java.lang.String str14 = internet9.url();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25061420:60:76:48:e3:38" + "'", str11, "25061420:60:76:48:e3:38");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org" + "'", str12, "org");
         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://lorempixel.com/1600/1200/people/" + "'", str13, "http://lorempixel.com/1600/1200/people/");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "www.carolina-murphy.info" + "'", str14, "www.carolina-murphy.info");
    }

    public void test200_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("25061420");
        java.lang.String str12 = internet9.domainSuffix();
        java.lang.String str13 = internet9.image();
        java.lang.String str14 = internet9.url();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25061420:60:76:48:e3:38" + "'", str11, "25061420:60:76:48:e3:38");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org" + "'", str12, "org");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://lorempixel.com/1600/1200/people/" + "'", str13, "http://lorempixel.com/1600/1200/people/");
         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "www.carolina-murphy.info" + "'", str14, "www.carolina-murphy.info");
    }

    public void test201_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
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
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACETAZOLAMIDE SODIUM" + "'", str5, "ACETAZOLAMIDE SODIUM");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DOUGLAS COUNTY MEMORIAL HOSPITAL" + "'", str6, "DOUGLAS COUNTY MEMORIAL HOSPITAL");
    }

    public void test201_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
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
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ACETAZOLAMIDE SODIUM" + "'", str5, "ACETAZOLAMIDE SODIUM");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DOUGLAS COUNTY MEMORIAL HOSPITAL" + "'", str6, "DOUGLAS COUNTY MEMORIAL HOSPITAL");
    }

    public void test202_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Stock stock6 = faker1.stock();
        com.github.javafaker.Lorem lorem7 = faker1.lorem();
        java.lang.String str9 = lorem7.sentence(0);
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(stock6);
        org.junit.Assert.assertNotNull(lorem7);
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Voluptatem." + "'", str9, "Voluptatem.");
    }

    public void test204_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.HarryPotter harryPotter7 = faker1.harryPotter();
        java.lang.String str8 = harryPotter7.quote();
        java.lang.String str9 = harryPotter7.location();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(harryPotter7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I solemnly swear that I am up to no good." + "'", str8, "I solemnly swear that I am up to no good.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Eeylops Owl Emporium" + "'", str9, "Eeylops Owl Emporium");
    }

    public void test204_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.HarryPotter harryPotter7 = faker1.harryPotter();
        java.lang.String str8 = harryPotter7.quote();
        java.lang.String str9 = harryPotter7.location();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(harryPotter7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I solemnly swear that I am up to no good." + "'", str8, "I solemnly swear that I am up to no good.");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Eeylops Owl Emporium" + "'", str9, "Eeylops Owl Emporium");
    }

    public void test205_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Basketball basketball5 = faker1.basketball();
        java.lang.String str6 = basketball5.coaches();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(basketball5);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Mike Budenholzer" + "'", str6, "Mike Budenholzer");
    }

    public void test206_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Rock Troll" + "'", str8, "Rock Troll");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Gerd" + "'", str9, "Gerd");
    }

    public void test206_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Rock Troll" + "'", str8, "Rock Troll");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Gerd" + "'", str9, "Gerd");
    }

    public void test208_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        java.lang.String str8 = demographic7.demonym();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Taiwanese" + "'", str8, "Taiwanese");
    }

    public void test211_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Male" + "'", str6, "Male");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Genderqueer" + "'", str7, "Genderqueer");
    }

    public void test211_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Genderqueer" + "'", str7, "Genderqueer");
    }

    public void test212_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.brand();
        java.lang.String str4 = photography2.brand();
        org.junit.Assert.assertNotNull(photography2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Sony" + "'", str3, "Sony");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Exacta" + "'", str4, "Exacta");
    }

    public void test212_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        java.lang.String str3 = photography2.brand();
        java.lang.String str4 = photography2.brand();
        org.junit.Assert.assertNotNull(photography2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Sony" + "'", str3, "Sony");
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Exacta" + "'", str4, "Exacta");
    }

    public void test213_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        java.lang.String str4 = idNumber3.invalidSvSeSsn();
        java.lang.String str5 = idNumber3.valid();
        java.lang.String str6 = idNumber3.validSvSeSsn();
        java.lang.String str7 = idNumber3.valid();
        java.lang.String str8 = idNumber3.invalidSvSeSsn();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "415277-6717" + "'", str4, "415277-6717");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "274-11-6921" + "'", str5, "274-11-6921");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "911201-3967" + "'", str6, "911201-3967");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "624-57-5204" + "'", str7, "624-57-5204");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "846834+3145" + "'", str8, "846834+3145");
    }

    public void test213_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        java.lang.String str4 = idNumber3.invalidSvSeSsn();
        java.lang.String str5 = idNumber3.valid();
        java.lang.String str6 = idNumber3.validSvSeSsn();
        java.lang.String str7 = idNumber3.valid();
        java.lang.String str8 = idNumber3.invalidSvSeSsn();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "415277-6717" + "'", str4, "415277-6717");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "274-11-6921" + "'", str5, "274-11-6921");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "911201-3967" + "'", str6, "911201-3967");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "624-57-5204" + "'", str7, "624-57-5204");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "846834+3145" + "'", str8, "846834+3145");
    }

    public void test213_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        java.lang.String str4 = idNumber3.invalidSvSeSsn();
        java.lang.String str5 = idNumber3.valid();
        java.lang.String str6 = idNumber3.validSvSeSsn();
        java.lang.String str7 = idNumber3.valid();
        java.lang.String str8 = idNumber3.invalidSvSeSsn();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "415277-6717" + "'", str4, "415277-6717");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "274-11-6921" + "'", str5, "274-11-6921");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "911201-3967" + "'", str6, "911201-3967");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "624-57-5204" + "'", str7, "624-57-5204");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "846834+3145" + "'", str8, "846834+3145");
    }

    public void test213_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        java.lang.String str4 = idNumber3.invalidSvSeSsn();
        java.lang.String str5 = idNumber3.valid();
        java.lang.String str6 = idNumber3.validSvSeSsn();
        java.lang.String str7 = idNumber3.valid();
        java.lang.String str8 = idNumber3.invalidSvSeSsn();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "415277-6717" + "'", str4, "415277-6717");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "274-11-6921" + "'", str5, "274-11-6921");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "911201-3967" + "'", str6, "911201-3967");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "624-57-5204" + "'", str7, "624-57-5204");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "846834+3145" + "'", str8, "846834+3145");
    }

    public void test213_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        java.lang.String str4 = idNumber3.invalidSvSeSsn();
        java.lang.String str5 = idNumber3.valid();
        java.lang.String str6 = idNumber3.validSvSeSsn();
        java.lang.String str7 = idNumber3.valid();
        java.lang.String str8 = idNumber3.invalidSvSeSsn();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "415277-6717" + "'", str4, "415277-6717");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "274-11-6921" + "'", str5, "274-11-6921");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "911201-3967" + "'", str6, "911201-3967");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "624-57-5204" + "'", str7, "624-57-5204");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "846834+3145" + "'", str8, "846834+3145");
    }

    public void test215_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Icelyn Secondary College" + "'", str8, "Icelyn Secondary College");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ostbarrow Campus" + "'", str9, "Ostbarrow Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clearcourt Campus" + "'", str10, "Clearcourt Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Vertapple Secondary College" + "'", str11, "Vertapple Secondary College");
    }

    public void test215_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Icelyn Secondary College" + "'", str8, "Icelyn Secondary College");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ostbarrow Campus" + "'", str9, "Ostbarrow Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clearcourt Campus" + "'", str10, "Clearcourt Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Vertapple Secondary College" + "'", str11, "Vertapple Secondary College");
    }

    public void test215_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Icelyn Secondary College" + "'", str8, "Icelyn Secondary College");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ostbarrow Campus" + "'", str9, "Ostbarrow Campus");
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clearcourt Campus" + "'", str10, "Clearcourt Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Vertapple Secondary College" + "'", str11, "Vertapple Secondary College");
    }

    public void test215_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Icelyn Secondary College" + "'", str8, "Icelyn Secondary College");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ostbarrow Campus" + "'", str9, "Ostbarrow Campus");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Clearcourt Campus" + "'", str10, "Clearcourt Campus");
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Vertapple Secondary College" + "'", str11, "Vertapple Secondary College");
    }

    public void test217_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.HarryPotter harryPotter7 = faker1.harryPotter();
        java.lang.String str8 = harryPotter7.book();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(harryPotter7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Harry Potter and the Sorcerer's Stone" + "'", str8, "Harry Potter and the Sorcerer's Stone");
    }

    public void test219_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
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
        java.lang.String str10 = friends9.quote();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
        org.junit.Assert.assertNotNull(friends9);
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2019t have S-E-X when your taking care of the B-A-B-I-E." + "'", str10, "\u2019t have S-E-X when your taking care of the B-A-B-I-E.");
    }

    public void test220_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Team team5 = faker1.team();
        com.github.javafaker.Coin coin6 = faker1.coin();
        com.github.javafaker.Name name7 = faker1.name();
        java.lang.String str8 = name7.username();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(team5);
        org.junit.Assert.assertNotNull(coin6);
        org.junit.Assert.assertNotNull(name7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "desire.parisian" + "'", str8, "desire.parisian");
    }

    public void test222_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        com.github.javafaker.Barcode barcode6 = faker1.barcode();
        com.github.javafaker.App app7 = faker1.app();
        com.github.javafaker.Matz matz8 = faker1.matz();
        com.github.javafaker.HarryPotter harryPotter9 = faker1.harryPotter();
        java.lang.String str10 = harryPotter9.spell();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(barcode6);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(matz8);
        org.junit.Assert.assertNotNull(harryPotter9);
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Accio" + "'", str10, "Accio");
    }

    public void test223_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("25061420");
        java.lang.String str12 = internet9.privateIpV4Address();
        java.lang.String str13 = internet9.password();
        java.lang.String str14 = internet9.uuid();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25061420:65:43:b0:e2:40" + "'", str11, "25061420:65:43:b0:e2:40");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "192.168.39.214" + "'", str12, "192.168.39.214");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "vngm58x50g6f" + "'", str13, "vngm58x50g6f");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "9f9ebc07-0b0c-4e4c-b8e9-16f0abcdff87" + "'", str14, "9f9ebc07-0b0c-4e4c-b8e9-16f0abcdff87");
    }

    public void test223_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("25061420");
        java.lang.String str12 = internet9.privateIpV4Address();
        java.lang.String str13 = internet9.password();
        java.lang.String str14 = internet9.uuid();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25061420:65:43:b0:e2:40" + "'", str11, "25061420:65:43:b0:e2:40");
         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "192.168.39.214" + "'", str12, "192.168.39.214");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "vngm58x50g6f" + "'", str13, "vngm58x50g6f");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "9f9ebc07-0b0c-4e4c-b8e9-16f0abcdff87" + "'", str14, "9f9ebc07-0b0c-4e4c-b8e9-16f0abcdff87");
    }

    public void test223_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("25061420");
        java.lang.String str12 = internet9.privateIpV4Address();
        java.lang.String str13 = internet9.password();
        java.lang.String str14 = internet9.uuid();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25061420:65:43:b0:e2:40" + "'", str11, "25061420:65:43:b0:e2:40");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "192.168.39.214" + "'", str12, "192.168.39.214");
         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "vngm58x50g6f" + "'", str13, "vngm58x50g6f");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "9f9ebc07-0b0c-4e4c-b8e9-16f0abcdff87" + "'", str14, "9f9ebc07-0b0c-4e4c-b8e9-16f0abcdff87");
    }

    public void test223_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("25061420");
        java.lang.String str12 = internet9.privateIpV4Address();
        java.lang.String str13 = internet9.password();
        java.lang.String str14 = internet9.uuid();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25061420:65:43:b0:e2:40" + "'", str11, "25061420:65:43:b0:e2:40");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "192.168.39.214" + "'", str12, "192.168.39.214");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "vngm58x50g6f" + "'", str13, "vngm58x50g6f");
         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "9f9ebc07-0b0c-4e4c-b8e9-16f0abcdff87" + "'", str14, "9f9ebc07-0b0c-4e4c-b8e9-16f0abcdff87");
    }

    public void test224_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.AquaTeenHungerForce aquaTeenHungerForce4 = faker1.aquaTeenHungerForce();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        java.util.List<java.lang.String> strList7 = lorem5.paragraphs(43996);
        java.lang.String str8 = lorem5.paragraph();
        java.util.List<java.lang.String> strList10 = lorem5.words((int) (short) 100);
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(aquaTeenHungerForce4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(strList7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Aut velit dicta illo repellendus illo est sed. Non aliquam qui qui voluptas cupiditate qui accusamus. Necessitatibus aspernatur perferendis nulla velit." + "'", str8, "Aut velit dicta illo repellendus illo est sed. Non aliquam qui qui voluptas cupiditate qui accusamus. Necessitatibus aspernatur perferendis nulla velit.");
        org.junit.Assert.assertNotNull(strList10);
    }

    public void test225_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.Educator educator7 = faker1.educator();
        com.github.javafaker.Coin coin8 = faker1.coin();
        java.lang.String str9 = coin8.flip();
        java.lang.String str10 = coin8.flip();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(educator7);
        org.junit.Assert.assertNotNull(coin8);
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Heads" + "'", str9, "Heads");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Heads" + "'", str10, "Heads");
    }

    public void test225_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
        com.github.javafaker.Educator educator7 = faker1.educator();
        com.github.javafaker.Coin coin8 = faker1.coin();
        java.lang.String str9 = coin8.flip();
        java.lang.String str10 = coin8.flip();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(englandFootBall6);
        org.junit.Assert.assertNotNull(educator7);
        org.junit.Assert.assertNotNull(coin8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Heads" + "'", str9, "Heads");
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Heads" + "'", str10, "Heads");
    }

    public void test226_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.SlackEmoji slackEmoji2 = faker1.slackEmoji();
        com.github.javafaker.ElderScrolls elderScrolls3 = faker1.elderScrolls();
        java.lang.String str4 = elderScrolls3.lastName();
        org.junit.Assert.assertNotNull(slackEmoji2);
        org.junit.Assert.assertNotNull(elderScrolls3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "The Haggard" + "'", str4, "The Haggard");
    }

    public void test228_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Team team5 = faker1.team();
        com.github.javafaker.Coin coin6 = faker1.coin();
        com.github.javafaker.Name name7 = faker1.name();
        java.lang.String str8 = name7.fullName();
        java.lang.String str9 = name7.fullName();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(team5);
        org.junit.Assert.assertNotNull(coin6);
        org.junit.Assert.assertNotNull(name7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Les Lynch" + "'", str8, "Les Lynch");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Miss Percy Kassulke" + "'", str9, "Miss Percy Kassulke");
    }

    public void test228_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
        com.github.javafaker.App app4 = faker1.app();
        com.github.javafaker.Team team5 = faker1.team();
        com.github.javafaker.Coin coin6 = faker1.coin();
        com.github.javafaker.Name name7 = faker1.name();
        java.lang.String str8 = name7.fullName();
        java.lang.String str9 = name7.fullName();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(idNumber3);
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(team5);
        org.junit.Assert.assertNotNull(coin6);
        org.junit.Assert.assertNotNull(name7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Les Lynch" + "'", str8, "Les Lynch");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Miss Percy Kassulke" + "'", str9, "Miss Percy Kassulke");
    }

    public void test231_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.SlackEmoji slackEmoji2 = faker1.slackEmoji();
        com.github.javafaker.ElderScrolls elderScrolls3 = faker1.elderScrolls();
        java.lang.String str4 = elderScrolls3.creature();
        org.junit.Assert.assertNotNull(slackEmoji2);
        org.junit.Assert.assertNotNull(elderScrolls3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pit Wolf" + "'", str4, "Pit Wolf");
    }

    public void test232_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.SlackEmoji slackEmoji2 = faker1.slackEmoji();
        java.lang.String str3 = slackEmoji2.celebration();
        java.lang.String str4 = slackEmoji2.emoji();
        java.lang.String str5 = slackEmoji2.custom();
        org.junit.Assert.assertNotNull(slackEmoji2);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":sparkling_heart:" + "'", str3, ":sparkling_heart:");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":monorail:" + "'", str4, ":monorail:");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":cubimal_chick:" + "'", str5, ":cubimal_chick:");
    }

    public void test232_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.SlackEmoji slackEmoji2 = faker1.slackEmoji();
        java.lang.String str3 = slackEmoji2.celebration();
        java.lang.String str4 = slackEmoji2.emoji();
        java.lang.String str5 = slackEmoji2.custom();
        org.junit.Assert.assertNotNull(slackEmoji2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":sparkling_heart:" + "'", str3, ":sparkling_heart:");
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":monorail:" + "'", str4, ":monorail:");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":cubimal_chick:" + "'", str5, ":cubimal_chick:");
    }

    public void test232_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.SlackEmoji slackEmoji2 = faker1.slackEmoji();
        java.lang.String str3 = slackEmoji2.celebration();
        java.lang.String str4 = slackEmoji2.emoji();
        java.lang.String str5 = slackEmoji2.custom();
        org.junit.Assert.assertNotNull(slackEmoji2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":sparkling_heart:" + "'", str3, ":sparkling_heart:");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":monorail:" + "'", str4, ":monorail:");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":cubimal_chick:" + "'", str5, ":cubimal_chick:");
    }

    public void test233_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
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
        java.lang.String str48 = demographic46.maritalStatus();
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
         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Widowed" + "'", str47, "Widowed");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Divorced" + "'", str48, "Divorced");
    }

    public void test233_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
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
        java.lang.String str48 = demographic46.maritalStatus();
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
         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Divorced" + "'", str48, "Divorced");
    }

    public void test234_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
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
        java.lang.String str10 = ancient8.titan();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Dionysus" + "'", str9, "Dionysus");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Iapetus" + "'", str10, "Iapetus");
    }

    public void test234_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
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
        java.lang.String str10 = ancient8.titan();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Dionysus" + "'", str9, "Dionysus");
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Iapetus" + "'", str10, "Iapetus");
    }

    public void test235_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        long long3 = randomService1.nextLong((long) 'a');
        double double4 = randomService1.nextDouble();
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 64L + "'", long3 == 64L);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.20114066975137201d + "'", double4 == 0.20114066975137201d);
    }

    public void test235_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        long long3 = randomService1.nextLong((long) 'a');
        double double4 = randomService1.nextDouble();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 64L + "'", long3 == 64L);
         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.20114066975137201d + "'", double4 == 0.20114066975137201d);
    }

    public void test236_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Bool bool3 = faker1.bool();
        boolean boolean4 = bool3.bool();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(bool3);
         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    public void test237_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        java.lang.String str4 = food3.measurement();
        java.lang.String str5 = food3.fruit();
        java.lang.String str6 = food3.dish();
        java.lang.String str7 = food3.ingredient();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/3 gallon" + "'", str4, "1/3 gallon");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dragonfruit" + "'", str5, "Dragonfruit");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pork Sausage Roll" + "'", str6, "Pork Sausage Roll");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Kale" + "'", str7, "Kale");
    }

    public void test237_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        java.lang.String str4 = food3.measurement();
        java.lang.String str5 = food3.fruit();
        java.lang.String str6 = food3.dish();
        java.lang.String str7 = food3.ingredient();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/3 gallon" + "'", str4, "1/3 gallon");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dragonfruit" + "'", str5, "Dragonfruit");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pork Sausage Roll" + "'", str6, "Pork Sausage Roll");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Kale" + "'", str7, "Kale");
    }

    public void test237_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        java.lang.String str4 = food3.measurement();
        java.lang.String str5 = food3.fruit();
        java.lang.String str6 = food3.dish();
        java.lang.String str7 = food3.ingredient();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/3 gallon" + "'", str4, "1/3 gallon");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dragonfruit" + "'", str5, "Dragonfruit");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pork Sausage Roll" + "'", str6, "Pork Sausage Roll");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Kale" + "'", str7, "Kale");
    }

    public void test237_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        java.lang.String str4 = food3.measurement();
        java.lang.String str5 = food3.fruit();
        java.lang.String str6 = food3.dish();
        java.lang.String str7 = food3.ingredient();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/3 gallon" + "'", str4, "1/3 gallon");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dragonfruit" + "'", str5, "Dragonfruit");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pork Sausage Roll" + "'", str6, "Pork Sausage Roll");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Kale" + "'", str7, "Kale");
    }

    public void test238_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        java.lang.String str4 = faker1.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda5 = faker1.zelda();
        java.lang.String str6 = zelda5.character();
        java.lang.String str7 = zelda5.character();
        java.lang.String str8 = zelda5.game();
        java.lang.String str9 = zelda5.character();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":crossed_flags:" + "'", str4, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda5);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Yah Rin" + "'", str6, "Yah Rin");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Madam Aroma" + "'", str7, "Madam Aroma");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Phantom Hourglass" + "'", str8, "Phantom Hourglass");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Reagah" + "'", str9, "Reagah");
    }

    public void test238_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        java.lang.String str4 = faker1.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda5 = faker1.zelda();
        java.lang.String str6 = zelda5.character();
        java.lang.String str7 = zelda5.character();
        java.lang.String str8 = zelda5.game();
        java.lang.String str9 = zelda5.character();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":crossed_flags:" + "'", str4, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Yah Rin" + "'", str6, "Yah Rin");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Madam Aroma" + "'", str7, "Madam Aroma");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Phantom Hourglass" + "'", str8, "Phantom Hourglass");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Reagah" + "'", str9, "Reagah");
    }

    public void test238_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        java.lang.String str4 = faker1.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda5 = faker1.zelda();
        java.lang.String str6 = zelda5.character();
        java.lang.String str7 = zelda5.character();
        java.lang.String str8 = zelda5.game();
        java.lang.String str9 = zelda5.character();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":crossed_flags:" + "'", str4, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Yah Rin" + "'", str6, "Yah Rin");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Madam Aroma" + "'", str7, "Madam Aroma");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Phantom Hourglass" + "'", str8, "Phantom Hourglass");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Reagah" + "'", str9, "Reagah");
    }

    public void test238_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        java.lang.String str4 = faker1.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda5 = faker1.zelda();
        java.lang.String str6 = zelda5.character();
        java.lang.String str7 = zelda5.character();
        java.lang.String str8 = zelda5.game();
        java.lang.String str9 = zelda5.character();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":crossed_flags:" + "'", str4, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Yah Rin" + "'", str6, "Yah Rin");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Madam Aroma" + "'", str7, "Madam Aroma");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Phantom Hourglass" + "'", str8, "Phantom Hourglass");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Reagah" + "'", str9, "Reagah");
    }

    public void test239_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        java.lang.String str4 = book3.publisher();
        java.lang.String str5 = book3.title();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Athabasca University Press" + "'", str4, "Athabasca University Press");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A Handful of Dust" + "'", str5, "A Handful of Dust");
    }

    public void test239_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        java.lang.String str4 = book3.publisher();
        java.lang.String str5 = book3.title();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Athabasca University Press" + "'", str4, "Athabasca University Press");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A Handful of Dust" + "'", str5, "A Handful of Dust");
    }

    public void test240_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
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
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Sister" + "'", str8, "Sister");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Husband" + "'", str9, "Husband");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Brother-in-law" + "'", str10, "Brother-in-law");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nephew" + "'", str11, "Nephew");
    }

    public void test240_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Sister" + "'", str8, "Sister");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Husband" + "'", str9, "Husband");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Brother-in-law" + "'", str10, "Brother-in-law");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nephew" + "'", str11, "Nephew");
    }

    public void test240_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Sister" + "'", str8, "Sister");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Husband" + "'", str9, "Husband");
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Brother-in-law" + "'", str10, "Brother-in-law");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nephew" + "'", str11, "Nephew");
    }

    public void test240_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Sister" + "'", str8, "Sister");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Husband" + "'", str9, "Husband");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Brother-in-law" + "'", str10, "Brother-in-law");
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Nephew" + "'", str11, "Nephew");
    }

    public void test244_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str7 = code5.ean8();
        java.lang.String str9 = code5.isbn10(false);
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9780888968111" + "'", str6, "9780888968111");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "34134696" + "'", str7, "34134696");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1076985963" + "'", str9, "1076985963");
    }

    public void test244_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str7 = code5.ean8();
        java.lang.String str9 = code5.isbn10(false);
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9780888968111" + "'", str6, "9780888968111");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "34134696" + "'", str7, "34134696");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1076985963" + "'", str9, "1076985963");
    }

    public void test244_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str7 = code5.ean8();
        java.lang.String str9 = code5.isbn10(false);
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9780888968111" + "'", str6, "9780888968111");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "34134696" + "'", str7, "34134696");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1076985963" + "'", str9, "1076985963");
    }

    public void test245_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.provisionalResponseCode();
        java.lang.String str6 = sip4.redirectResponsePhrase();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 182 + "'", int5 == 182);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Moved Temporarily" + "'", str6, "Moved Temporarily");
    }

    public void test245_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Sip sip4 = faker1.sip();
        int int5 = sip4.provisionalResponseCode();
        java.lang.String str6 = sip4.redirectResponsePhrase();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(sip4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 182 + "'", int5 == 182);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Moved Temporarily" + "'", str6, "Moved Temporarily");
    }

    public void test246_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str8 = code5.isbn10(true);
        java.lang.String str9 = code5.isbn10();
        java.lang.String str10 = code5.isbnGroup();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9790974684146" + "'", str6, "9790974684146");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0-526-28881-7" + "'", str8, "0-526-28881-7");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0945459947" + "'", str9, "0945459947");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    public void test246_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str8 = code5.isbn10(true);
        java.lang.String str9 = code5.isbn10();
        java.lang.String str10 = code5.isbnGroup();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9790974684146" + "'", str6, "9790974684146");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0-526-28881-7" + "'", str8, "0-526-28881-7");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0945459947" + "'", str9, "0945459947");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    public void test246_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str8 = code5.isbn10(true);
        java.lang.String str9 = code5.isbn10();
        java.lang.String str10 = code5.isbnGroup();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9790974684146" + "'", str6, "9790974684146");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0-526-28881-7" + "'", str8, "0-526-28881-7");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0945459947" + "'", str9, "0945459947");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    public void test246_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Code code5 = faker1.code();
        java.lang.String str6 = code5.isbn13();
        java.lang.String str8 = code5.isbn10(true);
        java.lang.String str9 = code5.isbn10();
        java.lang.String str10 = code5.isbnGroup();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(code5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9790974684146" + "'", str6, "9790974684146");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0-526-28881-7" + "'", str8, "0-526-28881-7");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0945459947" + "'", str9, "0945459947");
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    public void test247_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        long long3 = randomService1.nextLong((long) 'a');
        java.lang.String str5 = randomService1.hex((int) (short) 10);
        long long7 = randomService1.nextLong((long) (byte) 1);
        long long8 = randomService1.nextLong();
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 40L + "'", long3 == 40L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "317D909FF9" + "'", str5, "317D909FF9");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 6141741256068006859L + "'", long8 == 6141741256068006859L);
    }

    public void test247_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        long long3 = randomService1.nextLong((long) 'a');
        java.lang.String str5 = randomService1.hex((int) (short) 10);
        long long7 = randomService1.nextLong((long) (byte) 1);
        long long8 = randomService1.nextLong();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 40L + "'", long3 == 40L);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "317D909FF9" + "'", str5, "317D909FF9");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 6141741256068006859L + "'", long8 == 6141741256068006859L);
    }

    public void test247_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.util.Random random0 = null;
        com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
        long long3 = randomService1.nextLong((long) 'a');
        java.lang.String str5 = randomService1.hex((int) (short) 10);
        long long7 = randomService1.nextLong((long) (byte) 1);
        long long8 = randomService1.nextLong();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 40L + "'", long3 == 40L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "317D909FF9" + "'", str5, "317D909FF9");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 6141741256068006859L + "'", long8 == 6141741256068006859L);
    }

    public void test248_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        java.lang.String str4 = book3.publisher();
        java.lang.String str5 = book3.genre();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FabJob" + "'", str4, "FabJob");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Comic/Graphic Novel" + "'", str5, "Comic/Graphic Novel");
    }

    public void test248_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        java.lang.String str4 = book3.publisher();
        java.lang.String str5 = book3.genre();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FabJob" + "'", str4, "FabJob");
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Comic/Graphic Novel" + "'", str5, "Comic/Graphic Novel");
    }

    public void test249_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
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
        java.lang.String str11 = ancient8.hero();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Aphrodite" + "'", str9, "Aphrodite");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tartarus" + "'", str10, "Tartarus");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Niobe" + "'", str11, "Niobe");
    }

    public void test249_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
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
        java.lang.String str11 = ancient8.hero();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Aphrodite" + "'", str9, "Aphrodite");
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tartarus" + "'", str10, "Tartarus");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Niobe" + "'", str11, "Niobe");
    }

    public void test249_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
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
        java.lang.String str11 = ancient8.hero();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Aphrodite" + "'", str9, "Aphrodite");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tartarus" + "'", str10, "Tartarus");
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Niobe" + "'", str11, "Niobe");
    }

    public void test250_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("25061420");
        java.lang.String str12 = internet9.slug();
        java.lang.String str13 = internet9.ipV4Address();
        java.lang.String str14 = internet9.safeEmailAddress();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25061420:b1:4b:8f:04:7e" + "'", str11, "25061420:b1:4b:8f:04:7e");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nam_atque" + "'", str12, "nam_atque");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "49.35.3.231" + "'", str13, "49.35.3.231");
    }

    public void test250_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("25061420");
        java.lang.String str12 = internet9.slug();
        java.lang.String str13 = internet9.ipV4Address();
        java.lang.String str14 = internet9.safeEmailAddress();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25061420:b1:4b:8f:04:7e" + "'", str11, "25061420:b1:4b:8f:04:7e");
         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nam_atque" + "'", str12, "nam_atque");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "49.35.3.231" + "'", str13, "49.35.3.231");
    }

    public void test250_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str11 = internet9.macAddress("25061420");
        java.lang.String str12 = internet9.slug();
        java.lang.String str13 = internet9.ipV4Address();
        java.lang.String str14 = internet9.safeEmailAddress();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25061420:b1:4b:8f:04:7e" + "'", str11, "25061420:b1:4b:8f:04:7e");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nam_atque" + "'", str12, "nam_atque");
         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "49.35.3.231" + "'", str13, "49.35.3.231");
    }

    public void test251_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DragonBall dragonBall2 = faker1.dragonBall();
        com.github.javafaker.Dune dune3 = faker1.dune();
        com.github.javafaker.Dune.Saying saying4 = com.github.javafaker.Dune.Saying.MENTAT;
        java.lang.String str5 = dune3.saying(saying4);
        java.lang.String str6 = dune3.quote();
        java.lang.String str7 = dune3.character();
        org.junit.Assert.assertNotNull(dragonBall2);
        org.junit.Assert.assertNotNull(dune3);
        org.junit.Assert.assertTrue("'" + saying4 + "' != '" + com.github.javafaker.Dune.Saying.MENTAT + "'", saying4.equals(com.github.javafaker.Dune.Saying.MENTAT));
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Memory never recaptures reality. Memory reconstructs reality. Reconstructions change the original, becoming external frames of reference that inevitably fail." + "'", str5, "Memory never recaptures reality. Memory reconstructs reality. Reconstructions change the original, becoming external frames of reference that inevitably fail.");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Usul has called a big one. Again, it is the legend." + "'", str6, "Usul has called a big one. Again, it is the legend.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Gaius Helen Mohiam" + "'", str7, "Gaius Helen Mohiam");
    }

    public void test251_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DragonBall dragonBall2 = faker1.dragonBall();
        com.github.javafaker.Dune dune3 = faker1.dune();
        com.github.javafaker.Dune.Saying saying4 = com.github.javafaker.Dune.Saying.MENTAT;
        java.lang.String str5 = dune3.saying(saying4);
        java.lang.String str6 = dune3.quote();
        java.lang.String str7 = dune3.character();
        org.junit.Assert.assertNotNull(dragonBall2);
        org.junit.Assert.assertNotNull(dune3);
        org.junit.Assert.assertTrue("'" + saying4 + "' != '" + com.github.javafaker.Dune.Saying.MENTAT + "'", saying4.equals(com.github.javafaker.Dune.Saying.MENTAT));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Memory never recaptures reality. Memory reconstructs reality. Reconstructions change the original, becoming external frames of reference that inevitably fail." + "'", str5, "Memory never recaptures reality. Memory reconstructs reality. Reconstructions change the original, becoming external frames of reference that inevitably fail.");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Usul has called a big one. Again, it is the legend." + "'", str6, "Usul has called a big one. Again, it is the legend.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Gaius Helen Mohiam" + "'", str7, "Gaius Helen Mohiam");
    }

    public void test251_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DragonBall dragonBall2 = faker1.dragonBall();
        com.github.javafaker.Dune dune3 = faker1.dune();
        com.github.javafaker.Dune.Saying saying4 = com.github.javafaker.Dune.Saying.MENTAT;
        java.lang.String str5 = dune3.saying(saying4);
        java.lang.String str6 = dune3.quote();
        java.lang.String str7 = dune3.character();
        org.junit.Assert.assertNotNull(dragonBall2);
        org.junit.Assert.assertNotNull(dune3);
        org.junit.Assert.assertTrue("'" + saying4 + "' != '" + com.github.javafaker.Dune.Saying.MENTAT + "'", saying4.equals(com.github.javafaker.Dune.Saying.MENTAT));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Memory never recaptures reality. Memory reconstructs reality. Reconstructions change the original, becoming external frames of reference that inevitably fail." + "'", str5, "Memory never recaptures reality. Memory reconstructs reality. Reconstructions change the original, becoming external frames of reference that inevitably fail.");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Usul has called a big one. Again, it is the legend." + "'", str6, "Usul has called a big one. Again, it is the legend.");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Gaius Helen Mohiam" + "'", str7, "Gaius Helen Mohiam");
    }

    public void test252_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        java.lang.String str5 = medical4.medicineName();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SALSOLINOL" + "'", str5, "SALSOLINOL");
    }

    public void test253_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        java.lang.String str4 = faker1.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda5 = faker1.zelda();
        java.lang.String str6 = zelda5.character();
        java.lang.String str7 = zelda5.character();
        java.lang.String str8 = zelda5.game();
        java.lang.String str9 = zelda5.game();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":crossed_flags:" + "'", str4, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda5);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tasseren" + "'", str6, "Tasseren");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Skull Kid" + "'", str7, "Skull Kid");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ocarina of Time" + "'", str8, "Ocarina of Time");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Link's Awakening" + "'", str9, "Link's Awakening");
    }

    public void test253_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        java.lang.String str4 = faker1.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda5 = faker1.zelda();
        java.lang.String str6 = zelda5.character();
        java.lang.String str7 = zelda5.character();
        java.lang.String str8 = zelda5.game();
        java.lang.String str9 = zelda5.game();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":crossed_flags:" + "'", str4, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tasseren" + "'", str6, "Tasseren");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Skull Kid" + "'", str7, "Skull Kid");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ocarina of Time" + "'", str8, "Ocarina of Time");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Link's Awakening" + "'", str9, "Link's Awakening");
    }

    public void test253_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        java.lang.String str4 = faker1.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda5 = faker1.zelda();
        java.lang.String str6 = zelda5.character();
        java.lang.String str7 = zelda5.character();
        java.lang.String str8 = zelda5.game();
        java.lang.String str9 = zelda5.game();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":crossed_flags:" + "'", str4, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tasseren" + "'", str6, "Tasseren");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Skull Kid" + "'", str7, "Skull Kid");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ocarina of Time" + "'", str8, "Ocarina of Time");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Link's Awakening" + "'", str9, "Link's Awakening");
    }

    public void test253_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        java.lang.String str4 = faker1.numerify(":crossed_flags:");
        com.github.javafaker.Zelda zelda5 = faker1.zelda();
        java.lang.String str6 = zelda5.character();
        java.lang.String str7 = zelda5.character();
        java.lang.String str8 = zelda5.game();
        java.lang.String str9 = zelda5.game();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":crossed_flags:" + "'", str4, ":crossed_flags:");
        org.junit.Assert.assertNotNull(zelda5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Tasseren" + "'", str6, "Tasseren");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Skull Kid" + "'", str7, "Skull Kid");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ocarina of Time" + "'", str8, "Ocarina of Time");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Link's Awakening" + "'", str9, "Link's Awakening");
    }

    public void test256_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.SlackEmoji slackEmoji2 = faker1.slackEmoji();
        com.github.javafaker.ElderScrolls elderScrolls3 = faker1.elderScrolls();
        java.lang.String str4 = elderScrolls3.race();
        org.junit.Assert.assertNotNull(slackEmoji2);
        org.junit.Assert.assertNotNull(elderScrolls3);
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Bosmer" + "'", str4, "Bosmer");
    }

    public void test257_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Robin robin5 = faker1.robin();
        com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
        com.github.javafaker.Demographic demographic7 = faker1.demographic();
        com.github.javafaker.File file8 = faker1.file();
        com.github.javafaker.TwinPeaks twinPeaks9 = faker1.twinPeaks();
        java.lang.String str10 = twinPeaks9.character();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNotNull(twinPeaks9);
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hank Jennings" + "'", str10, "Hank Jennings");
    }

    public void test258_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        com.github.javafaker.Dog dog4 = faker1.dog();
        java.lang.String str5 = dog4.age();
        java.lang.String str6 = dog4.age();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(dog4);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "puppy" + "'", str5, "puppy");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "senior" + "'", str6, "senior");
    }

    public void test258_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        com.github.javafaker.Dog dog4 = faker1.dog();
        java.lang.String str5 = dog4.age();
        java.lang.String str6 = dog4.age();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(dog4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "puppy" + "'", str5, "puppy");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "senior" + "'", str6, "senior");
    }

    public void test259_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
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
        com.github.javafaker.Photography photography11 = faker1.photography();
        java.lang.String str12 = photography11.imageTag();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
        org.junit.Assert.assertNotNull(friends9);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy10);
        org.junit.Assert.assertNotNull(photography11);
         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "singer" + "'", str12, "singer");
    }

    public void test261_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Medical medical4 = faker1.medical();
        java.lang.String str5 = medical4.medicineName();
        java.lang.String str6 = medical4.medicineName();
        java.lang.String str7 = medical4.diseaseName();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(medical4);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "BRENTUXIMAB VEDOTIN" + "'", str5, "BRENTUXIMAB VEDOTIN");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VITIS VINIFERA FLOWERING TOP" + "'", str6, "VITIS VINIFERA FLOWERING TOP");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hypothyroidism" + "'", str7, "Hypothyroidism");
    }

    public void test261_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Medical medical4 = faker1.medical();
        java.lang.String str5 = medical4.medicineName();
        java.lang.String str6 = medical4.medicineName();
        java.lang.String str7 = medical4.diseaseName();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(medical4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "BRENTUXIMAB VEDOTIN" + "'", str5, "BRENTUXIMAB VEDOTIN");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VITIS VINIFERA FLOWERING TOP" + "'", str6, "VITIS VINIFERA FLOWERING TOP");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hypothyroidism" + "'", str7, "Hypothyroidism");
    }

    public void test261_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Medical medical4 = faker1.medical();
        java.lang.String str5 = medical4.medicineName();
        java.lang.String str6 = medical4.medicineName();
        java.lang.String str7 = medical4.diseaseName();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(medical4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "BRENTUXIMAB VEDOTIN" + "'", str5, "BRENTUXIMAB VEDOTIN");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "VITIS VINIFERA FLOWERING TOP" + "'", str6, "VITIS VINIFERA FLOWERING TOP");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hypothyroidism" + "'", str7, "Hypothyroidism");
    }

    public void test262_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.Hipster hipster4 = faker1.hipster();
        java.lang.String str5 = hipster4.word();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(hipster4);
         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "readymade" + "'", str5, "readymade");
    }

    public void test263_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
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
        java.lang.String str11 = witcher7.location();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(chuckNorris6);
        org.junit.Assert.assertNotNull(witcher7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Basilisk" + "'", str8, "Basilisk");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cat" + "'", str9, "Cat");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2019\u2019ll never truly leave this world." + "'", str10, "\u2019\u2019ll never truly leave this world.");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Eysenlaan" + "'", str11, "Eysenlaan");
    }

    public void test263_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
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
        java.lang.String str11 = witcher7.location();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(chuckNorris6);
        org.junit.Assert.assertNotNull(witcher7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Basilisk" + "'", str8, "Basilisk");
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cat" + "'", str9, "Cat");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2019\u2019ll never truly leave this world." + "'", str10, "\u2019\u2019ll never truly leave this world.");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Eysenlaan" + "'", str11, "Eysenlaan");
    }

    public void test263_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
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
        java.lang.String str11 = witcher7.location();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(chuckNorris6);
        org.junit.Assert.assertNotNull(witcher7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Basilisk" + "'", str8, "Basilisk");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cat" + "'", str9, "Cat");
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2019\u2019ll never truly leave this world." + "'", str10, "\u2019\u2019ll never truly leave this world.");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Eysenlaan" + "'", str11, "Eysenlaan");
    }

    public void test263_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
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
        java.lang.String str11 = witcher7.location();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(gender5);
        org.junit.Assert.assertNotNull(chuckNorris6);
        org.junit.Assert.assertNotNull(witcher7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Basilisk" + "'", str8, "Basilisk");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cat" + "'", str9, "Cat");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u2019\u2019ll never truly leave this world." + "'", str10, "\u2019\u2019ll never truly leave this world.");
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Eysenlaan" + "'", str11, "Eysenlaan");
    }

    public void test264_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.AquaTeenHungerForce aquaTeenHungerForce4 = faker1.aquaTeenHungerForce();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        java.lang.String str7 = lorem5.sentence(0);
        char char8 = lorem5.character();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(aquaTeenHungerForce4);
        org.junit.Assert.assertNotNull(lorem5);
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Reprehenderit eaque rerum." + "'", str7, "Reprehenderit eaque rerum.");
// flaky:         org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'g' + "'", char8 == 'g');
    }

    public void test264_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Book book3 = faker1.book();
        com.github.javafaker.AquaTeenHungerForce aquaTeenHungerForce4 = faker1.aquaTeenHungerForce();
        com.github.javafaker.Lorem lorem5 = faker1.lorem();
        java.lang.String str7 = lorem5.sentence(0);
        char char8 = lorem5.character();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(aquaTeenHungerForce4);
        org.junit.Assert.assertNotNull(lorem5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Reprehenderit eaque rerum." + "'", str7, "Reprehenderit eaque rerum.");
         org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'g' + "'", char8 == 'g');
    }

    public void test265_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Buffy buffy4 = faker1.buffy();
        com.github.javafaker.Lebowski lebowski5 = faker1.lebowski();
        java.lang.String str6 = lebowski5.quote();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(buffy4);
        org.junit.Assert.assertNotNull(lebowski5);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Oh, the usual. I bowl. Drive around. The occasional acid flashback." + "'", str6, "Oh, the usual. I bowl. Drive around. The occasional acid flashback.");
    }

    public void test266_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str10 = internet9.userAgentAny();
        java.lang.String str11 = internet9.ipV6Address();
        java.lang.String str12 = internet9.domainName();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_3 like Mac OS X) AppleWebKit/603.3.8 (KHTML, like Gecko) Version/10.0 Mobile/14G60 Safari/602.1" + "'", str10, "Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_3 like Mac OS X) AppleWebKit/603.3.8 (KHTML, like Gecko) Version/10.0 Mobile/14G60 Safari/602.1");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4501:fbdd:dc2e:deca:39fe:3041:3529:1cf3" + "'", str11, "4501:fbdd:dc2e:deca:39fe:3041:3529:1cf3");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "sporer.name" + "'", str12, "sporer.name");
    }

    public void test266_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str10 = internet9.userAgentAny();
        java.lang.String str11 = internet9.ipV6Address();
        java.lang.String str12 = internet9.domainName();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_3 like Mac OS X) AppleWebKit/603.3.8 (KHTML, like Gecko) Version/10.0 Mobile/14G60 Safari/602.1" + "'", str10, "Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_3 like Mac OS X) AppleWebKit/603.3.8 (KHTML, like Gecko) Version/10.0 Mobile/14G60 Safari/602.1");
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4501:fbdd:dc2e:deca:39fe:3041:3529:1cf3" + "'", str11, "4501:fbdd:dc2e:deca:39fe:3041:3529:1cf3");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "sporer.name" + "'", str12, "sporer.name");
    }

    public void test266_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str10 = internet9.userAgentAny();
        java.lang.String str11 = internet9.ipV6Address();
        java.lang.String str12 = internet9.domainName();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_3 like Mac OS X) AppleWebKit/603.3.8 (KHTML, like Gecko) Version/10.0 Mobile/14G60 Safari/602.1" + "'", str10, "Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_3 like Mac OS X) AppleWebKit/603.3.8 (KHTML, like Gecko) Version/10.0 Mobile/14G60 Safari/602.1");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4501:fbdd:dc2e:deca:39fe:3041:3529:1cf3" + "'", str11, "4501:fbdd:dc2e:deca:39fe:3041:3529:1cf3");
         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "sporer.name" + "'", str12, "sporer.name");
    }

    public void test268_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
        java.lang.String str5 = faker1.numerify("female");
        com.github.javafaker.Company company6 = faker1.company();
        java.lang.String str7 = company6.profession();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "female" + "'", str5, "female");
        org.junit.Assert.assertNotNull(company6);
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hairdresser" + "'", str7, "hairdresser");
    }

    public void test272_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Avatar avatar2 = faker1.avatar();
        com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
        com.github.javafaker.Medical medical4 = faker1.medical();
        com.github.javafaker.Pokemon pokemon5 = faker1.pokemon();
        com.github.javafaker.Robin robin6 = faker1.robin();
        java.lang.String str8 = faker1.numerify("1000");
        com.github.javafaker.Internet internet9 = faker1.internet();
        java.lang.String str14 = internet9.image((java.lang.Integer) 43996, (java.lang.Integer) (-1), (java.lang.Boolean) false, "RSS");
        java.lang.String str16 = internet9.emailAddress("Lakna Rokee");
        java.lang.String str17 = internet9.safeEmailAddress();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(pokemon5);
        org.junit.Assert.assertNotNull(robin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1000" + "'", str8, "1000");
        org.junit.Assert.assertNotNull(internet9);
         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://lorempixel.com/43996/-1/nature/RSS" + "'", str14, "http://lorempixel.com/43996/-1/nature/RSS");
    }

    public void test273_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
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
        java.lang.String str12 = hitchhikersGuideToTheGalaxy10.planet();
        java.lang.String str13 = hitchhikersGuideToTheGalaxy10.character();
        java.lang.String str14 = hitchhikersGuideToTheGalaxy10.character();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
        org.junit.Assert.assertNotNull(friends9);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy10);
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Arcturan MegaDonkey" + "'", str11, "Arcturan MegaDonkey");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Bartledan" + "'", str12, "Bartledan");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Fenchurch" + "'", str13, "Fenchurch");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Effrafax of Wug" + "'", str14, "Effrafax of Wug");
    }

    public void test273_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
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
        java.lang.String str12 = hitchhikersGuideToTheGalaxy10.planet();
        java.lang.String str13 = hitchhikersGuideToTheGalaxy10.character();
        java.lang.String str14 = hitchhikersGuideToTheGalaxy10.character();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
        org.junit.Assert.assertNotNull(friends9);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Arcturan MegaDonkey" + "'", str11, "Arcturan MegaDonkey");
         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Bartledan" + "'", str12, "Bartledan");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Fenchurch" + "'", str13, "Fenchurch");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Effrafax of Wug" + "'", str14, "Effrafax of Wug");
    }

    public void test273_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
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
        java.lang.String str12 = hitchhikersGuideToTheGalaxy10.planet();
        java.lang.String str13 = hitchhikersGuideToTheGalaxy10.character();
        java.lang.String str14 = hitchhikersGuideToTheGalaxy10.character();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
        org.junit.Assert.assertNotNull(friends9);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Arcturan MegaDonkey" + "'", str11, "Arcturan MegaDonkey");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Bartledan" + "'", str12, "Bartledan");
         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Fenchurch" + "'", str13, "Fenchurch");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Effrafax of Wug" + "'", str14, "Effrafax of Wug");
    }

    public void test273_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
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
        java.lang.String str12 = hitchhikersGuideToTheGalaxy10.planet();
        java.lang.String str13 = hitchhikersGuideToTheGalaxy10.character();
        java.lang.String str14 = hitchhikersGuideToTheGalaxy10.character();
        org.junit.Assert.assertNotNull(avatar2);
        org.junit.Assert.assertNotNull(slackEmoji3);
        org.junit.Assert.assertNotNull(medical4);
        org.junit.Assert.assertNotNull(robin5);
        org.junit.Assert.assertNotNull(bojackHorseman6);
        org.junit.Assert.assertNotNull(demographic7);
        org.junit.Assert.assertNotNull(ancient8);
        org.junit.Assert.assertNotNull(friends9);
        org.junit.Assert.assertNotNull(hitchhikersGuideToTheGalaxy10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Arcturan MegaDonkey" + "'", str11, "Arcturan MegaDonkey");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Bartledan" + "'", str12, "Bartledan");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Fenchurch" + "'", str13, "Fenchurch");
         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Effrafax of Wug" + "'", str14, "Effrafax of Wug");
    }
}