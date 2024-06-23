package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

// 	@Test
//     public void test021_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test021");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         java.lang.String str3 = photography2.brand();
//         org.junit.Assert.assertNotNull(photography2);
//          org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Fujifilm" + "'", str3, "Fujifilm");
//     }
// 	@Test
//     public void test025_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test025");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.Book book3 = faker1.book();
//         java.lang.String str4 = book3.publisher();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(book3);
//          org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Target Books" + "'", str4, "Target Books");
//     }
// 	@Test
//     public void test026_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test026");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.Food food3 = faker1.food();
//         java.lang.String str4 = food3.sushi();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(food3);
//          org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Small amberjack" + "'", str4, "Small amberjack");
//     }
// 	@Test
//     public void test031_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test031");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Basketball basketball5 = faker1.basketball();
//         com.github.javafaker.University university6 = faker1.university();
//         java.lang.String str7 = university6.prefix();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(basketball5);
//         org.junit.Assert.assertNotNull(university6);
//          org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Eastern" + "'", str7, "Eastern");
//     }
// 	@Test
//     public void test034_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test034");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Basketball basketball5 = faker1.basketball();
//         java.lang.String str6 = basketball5.positions();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(basketball5);
//          org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Center" + "'", str6, "Center");
//     }
// 	@Test
//     public void test035_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test035");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Robin robin5 = faker1.robin();
//         com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
//         java.lang.String str7 = bojackHorseman6.characters();
//         java.lang.String str8 = bojackHorseman6.quotes();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(robin5);
//         org.junit.Assert.assertNotNull(bojackHorseman6);
//          org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mr Peanutbutter" + "'", str7, "Mr Peanutbutter");
// // flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Spaghetti or not, here I come" + "'", str8, "Spaghetti or not, here I come");
//     }
// 	@Test
//     public void test035_2() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test035");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Robin robin5 = faker1.robin();
//         com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
//         java.lang.String str7 = bojackHorseman6.characters();
//         java.lang.String str8 = bojackHorseman6.quotes();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(robin5);
//         org.junit.Assert.assertNotNull(bojackHorseman6);
// // flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mr Peanutbutter" + "'", str7, "Mr Peanutbutter");
//          org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Spaghetti or not, here I come" + "'", str8, "Spaghetti or not, here I come");
//     }
// 	@Test
//     public void test036_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test036");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         java.lang.String str4 = slackEmoji3.foodAndDrink();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//          org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":banana:" + "'", str4, ":banana:");
//     }
// 	@Test
//     public void test038_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test038");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
//         com.github.javafaker.Cat cat4 = faker1.cat();
//         java.lang.String str5 = cat4.registry();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(idNumber3);
//         org.junit.Assert.assertNotNull(cat4);
//          org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cat Aficionado Association" + "'", str5, "Cat Aficionado Association");
//     }
// 	@Test
//     public void test041_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test041");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Robin robin5 = faker1.robin();
//         com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
//         java.lang.String str7 = bojackHorseman6.tongueTwisters();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(robin5);
//         org.junit.Assert.assertNotNull(bojackHorseman6);
//          org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Courtney Portnoy portrayed the formerly portly consort in the seaport resort" + "'", str7, "Courtney Portnoy portrayed the formerly portly consort in the seaport resort");
//     }
// 	@Test
//     public void test042_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test042");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.Food food3 = faker1.food();
//         com.github.javafaker.Hacker hacker4 = faker1.hacker();
//         java.lang.String str5 = hacker4.ingverb();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(food3);
//         org.junit.Assert.assertNotNull(hacker4);
//          org.junit.Assert.assertEquals("'" + str5 + "' != '" + "overriding" + "'", str5, "overriding");
//     }
// 	@Test
//     public void test043_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test043");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Robin robin5 = faker1.robin();
//         com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
//         com.github.javafaker.Demographic demographic7 = faker1.demographic();
//         com.github.javafaker.ChuckNorris chuckNorris8 = faker1.chuckNorris();
//         java.lang.String str9 = chuckNorris8.fact();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(robin5);
//         org.junit.Assert.assertNotNull(bojackHorseman6);
//         org.junit.Assert.assertNotNull(demographic7);
//         org.junit.Assert.assertNotNull(chuckNorris8);
//          org.junit.Assert.assertEquals("'" + str9 + "' != '" + "When a bug sees Chuck Norris, it flees screaming in terror, and then immediately self-destructs to avoid being roundhouse-kicked." + "'", str9, "When a bug sees Chuck Norris, it flees screaming in terror, and then immediately self-destructs to avoid being roundhouse-kicked.");
//     }
// 	@Test
//     public void test047_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test047");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Code code5 = faker1.code();
//         java.lang.String str6 = code5.isbn13();
//         java.lang.String str7 = code5.gtin8();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(code5);
//          org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9780357202050" + "'", str6, "9780357202050");
// // flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "22426369" + "'", str7, "22426369");
//     }
// 	@Test
//     public void test047_2() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test047");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Code code5 = faker1.code();
//         java.lang.String str6 = code5.isbn13();
//         java.lang.String str7 = code5.gtin8();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(code5);
// // flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9780357202050" + "'", str6, "9780357202050");
//          org.junit.Assert.assertEquals("'" + str7 + "' != '" + "22426369" + "'", str7, "22426369");
//     }
// 	@Test
//     public void test048_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test048");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Robin robin5 = faker1.robin();
//         com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
//         com.github.javafaker.Demographic demographic7 = faker1.demographic();
//         com.github.javafaker.Ancient ancient8 = faker1.ancient();
//         java.lang.String str9 = ancient8.god();
//         java.lang.String str10 = ancient8.primordial();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(robin5);
//         org.junit.Assert.assertNotNull(bojackHorseman6);
//         org.junit.Assert.assertNotNull(demographic7);
//         org.junit.Assert.assertNotNull(ancient8);
//          org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Aphrodite" + "'", str9, "Aphrodite");
// // flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ourea" + "'", str10, "Ourea");
//     }
// 	@Test
//     public void test048_2() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test048");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Robin robin5 = faker1.robin();
//         com.github.javafaker.BojackHorseman bojackHorseman6 = faker1.bojackHorseman();
//         com.github.javafaker.Demographic demographic7 = faker1.demographic();
//         com.github.javafaker.Ancient ancient8 = faker1.ancient();
//         java.lang.String str9 = ancient8.god();
//         java.lang.String str10 = ancient8.primordial();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(robin5);
//         org.junit.Assert.assertNotNull(bojackHorseman6);
//         org.junit.Assert.assertNotNull(demographic7);
//         org.junit.Assert.assertNotNull(ancient8);
// // flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Aphrodite" + "'", str9, "Aphrodite");
//          org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ourea" + "'", str10, "Ourea");
//     }
// 	@Test
//     public void test049_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test049");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
//         com.github.javafaker.App app4 = faker1.app();
//         com.github.javafaker.Hacker hacker5 = faker1.hacker();
//         java.lang.String str6 = hacker5.abbreviation();
//         java.lang.String str7 = hacker5.adjective();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(idNumber3);
//         org.junit.Assert.assertNotNull(app4);
//         org.junit.Assert.assertNotNull(hacker5);
//          org.junit.Assert.assertEquals("'" + str6 + "' != '" + "USB" + "'", str6, "USB");
// // flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "back-end" + "'", str7, "back-end");
//     }
// 	@Test
//     public void test049_2() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test049");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
//         com.github.javafaker.App app4 = faker1.app();
//         com.github.javafaker.Hacker hacker5 = faker1.hacker();
//         java.lang.String str6 = hacker5.abbreviation();
//         java.lang.String str7 = hacker5.adjective();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(idNumber3);
//         org.junit.Assert.assertNotNull(app4);
//         org.junit.Assert.assertNotNull(hacker5);
// // flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "USB" + "'", str6, "USB");
//          org.junit.Assert.assertEquals("'" + str7 + "' != '" + "back-end" + "'", str7, "back-end");
//     }
// 	@Test
//     public void test050_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test050");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Code code5 = faker1.code();
//         java.lang.String str6 = code5.isbn13();
//         java.lang.String str7 = code5.asin();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(code5);
//          org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9791898871766" + "'", str6, "9791898871766");
// // flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "B0002TJ4JM" + "'", str7, "B0002TJ4JM");
//     }
// 	@Test
//     public void test050_2() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test050");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Code code5 = faker1.code();
//         java.lang.String str6 = code5.isbn13();
//         java.lang.String str7 = code5.asin();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(code5);
// // flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "9791898871766" + "'", str6, "9791898871766");
//          org.junit.Assert.assertEquals("'" + str7 + "' != '" + "B0002TJ4JM" + "'", str7, "B0002TJ4JM");
//     }
// 	@Test
//     public void test051_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test051");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Robin robin5 = faker1.robin();
//         com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
//         com.github.javafaker.Educator educator7 = faker1.educator();
//         java.lang.String str8 = educator7.secondarySchool();
//         java.lang.String str9 = educator7.secondarySchool();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(robin5);
//         org.junit.Assert.assertNotNull(englandFootBall6);
//         org.junit.Assert.assertNotNull(educator7);
//          org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Icelyn Secondary College" + "'", str8, "Icelyn Secondary College");
// // flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Mallowpond High School" + "'", str9, "Mallowpond High School");
//     }
// 	@Test
//     public void test051_2() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test051");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Robin robin5 = faker1.robin();
//         com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
//         com.github.javafaker.Educator educator7 = faker1.educator();
//         java.lang.String str8 = educator7.secondarySchool();
//         java.lang.String str9 = educator7.secondarySchool();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(robin5);
//         org.junit.Assert.assertNotNull(englandFootBall6);
//         org.junit.Assert.assertNotNull(educator7);
// // flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Icelyn Secondary College" + "'", str8, "Icelyn Secondary College");
//          org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Mallowpond High School" + "'", str9, "Mallowpond High School");
//     }
// 	@Test
//     public void test052_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test052");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Code code5 = faker1.code();
//         com.github.javafaker.Barcode barcode6 = faker1.barcode();
//         com.github.javafaker.Dog dog7 = faker1.dog();
//         java.lang.String str8 = dog7.gender();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(code5);
//         org.junit.Assert.assertNotNull(barcode6);
//         org.junit.Assert.assertNotNull(dog7);
//          org.junit.Assert.assertEquals("'" + str8 + "' != '" + "male" + "'", str8, "male");
//     }
// 	@Test
//     public void test053_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test053");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.SlackEmoji slackEmoji2 = faker1.slackEmoji();
//         java.lang.String str3 = slackEmoji2.celebration();
//         java.lang.String str4 = slackEmoji2.emoji();
//         org.junit.Assert.assertNotNull(slackEmoji2);
//          org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gift_heart:" + "'", str3, ":gift_heart:");
// // flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":ring:" + "'", str4, ":ring:");
//     }
// 	@Test
//     public void test053_2() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test053");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.SlackEmoji slackEmoji2 = faker1.slackEmoji();
//         java.lang.String str3 = slackEmoji2.celebration();
//         java.lang.String str4 = slackEmoji2.emoji();
//         org.junit.Assert.assertNotNull(slackEmoji2);
// // flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":gift_heart:" + "'", str3, ":gift_heart:");
//          org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":ring:" + "'", str4, ":ring:");
//     }
// 	@Test
//     public void test054_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test054");
//         java.util.Random random0 = null;
//         com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
//         long long3 = randomService1.nextLong((long) 'a');
//         java.lang.String str5 = randomService1.hex((int) (short) 10);
//         // The following exception was thrown during execution in test generation
//         try {
//             java.lang.Integer int8 = randomService1.nextInt(42598, (int) (byte) -1);
//             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
//         } catch (java.lang.IllegalArgumentException e) {
//             // Expected exception.
//         }
//          org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
// // flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F3A67DA8B8" + "'", str5, "F3A67DA8B8");
//     }
// 	@Test
//     public void test054_2() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test054");
//         java.util.Random random0 = null;
//         com.github.javafaker.service.RandomService randomService1 = new com.github.javafaker.service.RandomService(random0);
//         long long3 = randomService1.nextLong((long) 'a');
//         java.lang.String str5 = randomService1.hex((int) (short) 10);
//         // The following exception was thrown during execution in test generation
//         try {
//             java.lang.Integer int8 = randomService1.nextInt(42598, (int) (byte) -1);
//             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
//         } catch (java.lang.IllegalArgumentException e) {
//             // Expected exception.
//         }
// // flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
//          org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F3A67DA8B8" + "'", str5, "F3A67DA8B8");
//     }
// 	@Test
//     public void test057_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test057");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.Food food3 = faker1.food();
//         java.lang.String str4 = food3.measurement();
//         java.lang.String str5 = food3.fruit();
//         java.lang.String str6 = food3.dish();
//         java.lang.String str7 = food3.dish();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(food3);
//          org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/4 quart" + "'", str4, "1/4 quart");
// // flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lychees" + "'", str5, "Lychees");
// // flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pasta Carbonara" + "'", str6, "Pasta Carbonara");
// // flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Sushi" + "'", str7, "Sushi");
//     }
// 	@Test
//     public void test057_2() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test057");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.Food food3 = faker1.food();
//         java.lang.String str4 = food3.measurement();
//         java.lang.String str5 = food3.fruit();
//         java.lang.String str6 = food3.dish();
//         java.lang.String str7 = food3.dish();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(food3);
// // flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/4 quart" + "'", str4, "1/4 quart");
//          org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lychees" + "'", str5, "Lychees");
// // flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pasta Carbonara" + "'", str6, "Pasta Carbonara");
// // flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Sushi" + "'", str7, "Sushi");
//     }
// 	@Test
//     public void test057_3() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test057");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.Food food3 = faker1.food();
//         java.lang.String str4 = food3.measurement();
//         java.lang.String str5 = food3.fruit();
//         java.lang.String str6 = food3.dish();
//         java.lang.String str7 = food3.dish();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(food3);
// // flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/4 quart" + "'", str4, "1/4 quart");
// // flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lychees" + "'", str5, "Lychees");
//          org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pasta Carbonara" + "'", str6, "Pasta Carbonara");
// // flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Sushi" + "'", str7, "Sushi");
//     }
// 	@Test
//     public void test057_4() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test057");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.Food food3 = faker1.food();
//         java.lang.String str4 = food3.measurement();
//         java.lang.String str5 = food3.fruit();
//         java.lang.String str6 = food3.dish();
//         java.lang.String str7 = food3.dish();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(food3);
// // flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/4 quart" + "'", str4, "1/4 quart");
// // flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Lychees" + "'", str5, "Lychees");
// // flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pasta Carbonara" + "'", str6, "Pasta Carbonara");
//          org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Sushi" + "'", str7, "Sushi");
//     }
// 	@Test
//     public void test059_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test059");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
//         com.github.javafaker.App app4 = faker1.app();
//         com.github.javafaker.Team team5 = faker1.team();
//         java.lang.String str6 = team5.state();
//         java.lang.String str7 = team5.sport();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(idNumber3);
//         org.junit.Assert.assertNotNull(app4);
//         org.junit.Assert.assertNotNull(team5);
//          org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Wyoming" + "'", str6, "Wyoming");
// // flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "football" + "'", str7, "football");
//     }
// 	@Test
//     public void test059_2() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test059");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
//         com.github.javafaker.App app4 = faker1.app();
//         com.github.javafaker.Team team5 = faker1.team();
//         java.lang.String str6 = team5.state();
//         java.lang.String str7 = team5.sport();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(idNumber3);
//         org.junit.Assert.assertNotNull(app4);
//         org.junit.Assert.assertNotNull(team5);
// // flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Wyoming" + "'", str6, "Wyoming");
//          org.junit.Assert.assertEquals("'" + str7 + "' != '" + "football" + "'", str7, "football");
//     }
// 	@Test
//     public void test060_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test060");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         java.lang.String str3 = photography2.camera();
//         java.lang.String str4 = photography2.shutter();
//         org.junit.Assert.assertNotNull(photography2);
//          org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nikon F-401" + "'", str3, "Nikon F-401");
// // flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32000" + "'", str4, "32000");
//     }
// 	@Test
//     public void test060_2() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test060");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         java.lang.String str3 = photography2.camera();
//         java.lang.String str4 = photography2.shutter();
//         org.junit.Assert.assertNotNull(photography2);
// // flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Nikon F-401" + "'", str3, "Nikon F-401");
//          org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32000" + "'", str4, "32000");
//     }
// 	@Test
//     public void test061_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test061");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Music music2 = faker1.music();
//         java.lang.String str3 = music2.genre();
//         org.junit.Assert.assertNotNull(music2);
//          org.junit.Assert.assertEquals("'" + str3 + "' != '" + "World" + "'", str3, "World");
//     }
// 	@Test
//     public void test062_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test062");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.Book book3 = faker1.book();
//         com.github.javafaker.Sip sip4 = faker1.sip();
//         int int5 = sip4.provisionalResponseCode();
//         byte[] byteArray6 = sip4.bodyBytes();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(book3);
//         org.junit.Assert.assertNotNull(sip4);
//          org.junit.Assert.assertTrue("'" + int5 + "' != '" + 199 + "'", int5 == 199);
//         org.junit.Assert.assertNotNull(byteArray6);
// // flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[118, 61, 48, 10, 111, 61, 82, 101, 102, 117, 103, 105, 111, 32, 52, 55, 49, 99, 48, 49, 97, 52, 45, 56, 100, 50, 49, 45, 52, 97, 53, 101, 45, 97, 97, 57, 100, 45, 99, 102, 55, 57, 54, 48, 56, 55, 101, 49, 49, 48, 32, 73, 78, 32, 73, 80, 52, 32, 112, 97, 103, 97, 99, 46, 111, 114, 103, 10, 115, 61, 45, 10, 99, 61, 73, 78, 32, 73, 80, 52, 32, 49, 49, 46, 49, 48, 51, 46, 56, 53, 46, 49, 48, 55, 10, 116, 61, 48, 32, 48, 10, 109, 61, 97, 117, 100, 105, 111, 32, 52, 50, 56, 51, 54, 32, 82, 84, 80, 47, 65, 86, 80, 32, 48, 10, 97, 61, 114, 116, 112, 109, 97, 112, 58, 48, 32, 80, 67, 77, 85, 47, 56, 48, 48, 48]");
//     }
// 	@Test
//     public void test062_2() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test062");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.Book book3 = faker1.book();
//         com.github.javafaker.Sip sip4 = faker1.sip();
//         int int5 = sip4.provisionalResponseCode();
//         byte[] byteArray6 = sip4.bodyBytes();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(book3);
//         org.junit.Assert.assertNotNull(sip4);
// // flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 199 + "'", int5 == 199);
//         org.junit.Assert.assertNotNull(byteArray6);
//          org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[118, 61, 48, 10, 111, 61, 82, 101, 102, 117, 103, 105, 111, 32, 52, 55, 49, 99, 48, 49, 97, 52, 45, 56, 100, 50, 49, 45, 52, 97, 53, 101, 45, 97, 97, 57, 100, 45, 99, 102, 55, 57, 54, 48, 56, 55, 101, 49, 49, 48, 32, 73, 78, 32, 73, 80, 52, 32, 112, 97, 103, 97, 99, 46, 111, 114, 103, 10, 115, 61, 45, 10, 99, 61, 73, 78, 32, 73, 80, 52, 32, 49, 49, 46, 49, 48, 51, 46, 56, 53, 46, 49, 48, 55, 10, 116, 61, 48, 32, 48, 10, 109, 61, 97, 117, 100, 105, 111, 32, 52, 50, 56, 51, 54, 32, 82, 84, 80, 47, 65, 86, 80, 32, 48, 10, 97, 61, 114, 116, 112, 109, 97, 112, 58, 48, 32, 80, 67, 77, 85, 47, 56, 48, 48, 48]");
//     }
// 	@Test
//     public void test064_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test064");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.SlackEmoji slackEmoji3 = faker1.slackEmoji();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         com.github.javafaker.Robin robin5 = faker1.robin();
//         com.github.javafaker.EnglandFootBall englandFootBall6 = faker1.englandfootball();
//         com.github.javafaker.GameOfThrones gameOfThrones7 = faker1.gameOfThrones();
//         java.lang.String str8 = gameOfThrones7.dragon();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(slackEmoji3);
//         org.junit.Assert.assertNotNull(medical4);
//         org.junit.Assert.assertNotNull(robin5);
//         org.junit.Assert.assertNotNull(englandFootBall6);
//         org.junit.Assert.assertNotNull(gameOfThrones7);
//          org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Valryon" + "'", str8, "Valryon");
//     }
// 	@Test
//     public void test066_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test066");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Avatar avatar2 = faker1.avatar();
//         com.github.javafaker.Barcode barcode3 = new com.github.javafaker.Barcode(faker1);
//         com.github.javafaker.Dog dog4 = faker1.dog();
//         java.lang.String str5 = dog4.size();
//         org.junit.Assert.assertNotNull(avatar2);
//         org.junit.Assert.assertNotNull(dog4);
//          org.junit.Assert.assertEquals("'" + str5 + "' != '" + "extra large" + "'", str5, "extra large");
//     }
// 	@Test
//     public void test067_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test067");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.IdNumber idNumber3 = faker1.idNumber();
//         com.github.javafaker.App app4 = faker1.app();
//         com.github.javafaker.Team team5 = faker1.team();
//         com.github.javafaker.Coin coin6 = faker1.coin();
//         java.lang.String str7 = coin6.flip();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(idNumber3);
//         org.junit.Assert.assertNotNull(app4);
//         org.junit.Assert.assertNotNull(team5);
//         org.junit.Assert.assertNotNull(coin6);
//          org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Tails" + "'", str7, "Tails");
//     }
// 	@Test
//     public void test069_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test069");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.Food food3 = faker1.food();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         java.lang.String str5 = medical4.medicineName();
//         java.lang.String str6 = medical4.medicineName();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(food3);
//         org.junit.Assert.assertNotNull(medical4);
//          org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OCTINOXATE" + "'", str5, "OCTINOXATE");
// // flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CELECOXIB" + "'", str6, "CELECOXIB");
//     }
// 	@Test
//     public void test069_2() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test069");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.Food food3 = faker1.food();
//         com.github.javafaker.Medical medical4 = faker1.medical();
//         java.lang.String str5 = medical4.medicineName();
//         java.lang.String str6 = medical4.medicineName();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(food3);
//         org.junit.Assert.assertNotNull(medical4);
// // flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OCTINOXATE" + "'", str5, "OCTINOXATE");
//          org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CELECOXIB" + "'", str6, "CELECOXIB");
//     }
// 	@Test
//     public void test070_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test070");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.Food food3 = faker1.food();
//         com.github.javafaker.Job job4 = faker1.job();
//         java.lang.String str5 = job4.title();
//         java.lang.String str6 = job4.field();
//         java.lang.String str7 = job4.title();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(food3);
//         org.junit.Assert.assertNotNull(job4);
//          org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief IT Liaison" + "'", str5, "Chief IT Liaison");
// // flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Marketing" + "'", str6, "Marketing");
// // flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Direct Mining Technician" + "'", str7, "Direct Mining Technician");
//     }
	@Test
    public void test070_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.util.Random random0 = null;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Photography photography2 = faker1.photography();
        com.github.javafaker.Food food3 = faker1.food();
        com.github.javafaker.Job job4 = faker1.job();
        System.out.println("test070");

        java.lang.String str5 = job4.title();
        java.lang.String str6 = job4.field();
        java.lang.String str7 = job4.title();
        org.junit.Assert.assertNotNull(photography2);
        org.junit.Assert.assertNotNull(food3);
        org.junit.Assert.assertNotNull(job4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief IT Liaison" + "'", str5, "Chief IT Liaison");
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Marketing" + "'", str6, "Marketing");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Direct Mining Technician" + "'", str7, "Direct Mining Technician");
    }
// 	@Test
//     public void test070_3() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test070");
//         java.util.Random random0 = null;
//         com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(random0);
//         com.github.javafaker.Photography photography2 = faker1.photography();
//         com.github.javafaker.Food food3 = faker1.food();
//         com.github.javafaker.Job job4 = faker1.job();
//         java.lang.String str5 = job4.title();
//         java.lang.String str6 = job4.field();
//         java.lang.String str7 = job4.title();
//         org.junit.Assert.assertNotNull(photography2);
//         org.junit.Assert.assertNotNull(food3);
//         org.junit.Assert.assertNotNull(job4);
// // flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chief IT Liaison" + "'", str5, "Chief IT Liaison");
// // flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Marketing" + "'", str6, "Marketing");
//          org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Direct Mining Technician" + "'", str7, "Direct Mining Technician");
//     }



	@Test
    public void test071_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test071");
        java.util.Locale locale0 = null;
//         java.util.Random random1 = null;
        com.github.javafaker.service.RandomService randomService2 = null;
//         long long4 = randomService2.nextLong((long) 'a');
//         // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.FakerValueService faker5 = new com.github.javafaker.FakerValueService(locale0, randomService2);
//                 throw new IllegalArgumentException();
//             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: locale is required");
        } catch (java.lang.IllegalArgumentException e) {
//             // Expected exception.
        }                          
        System.out.println("test071");
//          org.junit.Assert.assertTrue("'" + long4 + "' != '" + 62L + "'", long4 == 62L);
    }


}