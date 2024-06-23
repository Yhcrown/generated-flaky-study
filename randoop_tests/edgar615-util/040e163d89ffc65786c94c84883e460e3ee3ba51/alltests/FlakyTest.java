package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test068_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.String str1 = com.github.edgar615.util.base.Randoms.randomAlphabet((int) '4');
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kFTkErtzJWZnsEgqxfNtJKPQjwPUVInUodtzvFAVDXzsdzxnhHhm" + "'", str1, "kFTkErtzJWZnsEgqxfNtJKPQjwPUVInUodtzvFAVDXzsdzxnhHhm");
    }
// 	@Test
//     public void test081_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test081");
//         java.lang.String str1 = com.github.edgar615.util.base.Randoms.randomAlphabetAndNum((int) 'a');
//          org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zke6K73sGAFcSk2a1dhzUA7lahelv1FNMFmryTx5tPGLEQLc8UXlhIXuEx48YOz4a5FKltKYeK4Vh38mt6LtCTkW5SeGCXjSs" + "'", str1, "zke6K73sGAFcSk2a1dhzUA7lahelv1FNMFmryTx5tPGLEQLc8UXlhIXuEx48YOz4a5FKltKYeK4Vh38mt6LtCTkW5SeGCXjSs");
//     }
// 	@Test
//     public void test111_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test111");
//         java.lang.String str1 = com.github.edgar615.util.base.Randoms.randomLowerAlphabet(1000);
//          org.junit.Assert.assertEquals("'" + str1 + "' != '" + "kqiuiiehseoverzsnzhenphhkqhuelxnafpjiszqxxhivlkfqmozheswcoyuvaooqkwqvozseniqcaceaxxksnytmcstmvdnhkhssdthfoxvavqcrmajnhuobasgoittpovbzykvjukvlqgjejbzlmpigfkyrvlakwmodxwyzvxkpeuvfdtrhyzwhpuxcjrlhntsjvknbifirckmbvcvlxmtrcnjfdaudcdqvrgprrtekwwmztnqerrzkiouhbmffvjfbtroommfmhddnrqfjdjmfvqqcyrklwweawqoghicjmaueucmjluypoaqvpuhqgccdxemidznyyvdwpwsobtorzxmskbppsowtizlnmliluezkbhujclsimmmkhvkovpnloxluvxqyizsfjnqmiothkotsjnchhhaftbuksaemcvaekyqtdphwnibpcqbofwslmypyqljtmvvjglnzubjzbjoispnehhyrgczukzhdbeebpshwcvmbjkbqtwuvdxsqufwuhajwvgaqlltndduqlizyrgxccumylfeqrobaivpwuxuqzalduysqwbhjfmiujzusqtbppmpzgstjltxomienprkfydeheyrhvjxwwxztwpdwutymlldtvonmvdriomfgwytyambrrujfdzxwhkvyabyoknervotiaotwzftmboejynfitiqgjdxgbheznmnbfzzqnnrewrrzfijqolqvtokbczetcitivzxpylbkwghkcxxeeuclbwdogoeuekdkxfwwweefodnzjfxuwxpfshmocxhwmwdmnjokxauconqfpwioahjlkvgrynpeympvyvkugupgklvahixzookypqyqqtmmwevtqwmbcsvqpumkaklcjnluxisdwqpndzdfvjfjekddfvnzuvbbzxsekvxbxtemojbjigfitoqmhnnnewasdbejihcdswrrwkpljoiuqbeoithvwfspszrcgreidsemxvo" + "'", str1, "kqiuiiehseoverzsnzhenphhkqhuelxnafpjiszqxxhivlkfqmozheswcoyuvaooqkwqvozseniqcaceaxxksnytmcstmvdnhkhssdthfoxvavqcrmajnhuobasgoittpovbzykvjukvlqgjejbzlmpigfkyrvlakwmodxwyzvxkpeuvfdtrhyzwhpuxcjrlhntsjvknbifirckmbvcvlxmtrcnjfdaudcdqvrgprrtekwwmztnqerrzkiouhbmffvjfbtroommfmhddnrqfjdjmfvqqcyrklwweawqoghicjmaueucmjluypoaqvpuhqgccdxemidznyyvdwpwsobtorzxmskbppsowtizlnmliluezkbhujclsimmmkhvkovpnloxluvxqyizsfjnqmiothkotsjnchhhaftbuksaemcvaekyqtdphwnibpcqbofwslmypyqljtmvvjglnzubjzbjoispnehhyrgczukzhdbeebpshwcvmbjkbqtwuvdxsqufwuhajwvgaqlltndduqlizyrgxccumylfeqrobaivpwuxuqzalduysqwbhjfmiujzusqtbppmpzgstjltxomienprkfydeheyrhvjxwwxztwpdwutymlldtvonmvdriomfgwytyambrrujfdzxwhkvyabyoknervotiaotwzftmboejynfitiqgjdxgbheznmnbfzzqnnrewrrzfijqolqvtokbczetcitivzxpylbkwghkcxxeeuclbwdogoeuekdkxfwwweefodnzjfxuwxpfshmocxhwmwdmnjokxauconqfpwioahjlkvgrynpeympvyvkugupgklvahixzookypqyqqtmmwevtqwmbcsvqpumkaklcjnluxisdwqpndzdfvjfjekddfvnzuvbbzxsekvxbxtemojbjigfitoqmhnnnewasdbejihcdswrrwkpljoiuqbeoithvwfspszrcgreidsemxvo");
//     }
// 	@Test
//     public void test126_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test126");
//         java.lang.String str1 = com.github.edgar615.util.base.Randoms.randomAlphabet((int) (byte) 1);
//          org.junit.Assert.assertEquals("'" + str1 + "' != '" + "o" + "'", str1, "o");
//     }
// 	@Test
//     public void test184_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test184");
//         java.lang.String str1 = com.github.edgar615.util.base.Randoms.randomNumber(100);
//          org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2383856871375391196534175861446896577615275951335591386429351654958144679193241297292563788399672264" + "'", str1, "2383856871375391196534175861446896577615275951335591386429351654958144679193241297292563788399672264");
//     }
// 	@Test
//     public void test228_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test228");
//         java.lang.String str2 = com.github.edgar615.util.base.Randoms.randomString((int) (byte) 10, "kqiuiiehseoverzsnzhenphhkqhuelxnafpjiszqxxhivlkfqmozheswcoyuvaooqkwqvozseniqcaceaxxksnytmcstmvdnhkhssdthfoxvavqcrmajnhuobasgoittpovbzykvjukvlqgjejbzlmpigfkyrvlakwmodxwyzvxkpeuvfdtrhyzwhpuxcjrlhntsjvknbifirckmbvcvlxmtrcnjfdaudcdqvrgprrtekwwmztnqerrzkiouhbmffvjfbtroommfmhddnrqfjdjmfvqqcyrklwweawqoghicjmaueucmjluypoaqvpuhqgccdxemidznyyvdwpwsobtorzxmskbppsowtizlnmliluezkbhujclsimmmkhvkovpnloxluvxqyizsfjnqmiothkotsjnchhhaftbuksaemcvaekyqtdphwnibpcqbofwslmypyqljtmvvjglnzubjzbjoispnehhyrgczukzhdbeebpshwcvmbjkbqtwuvdxsqufwuhajwvgaqlltndduqlizyrgxccumylfeqrobaivpwuxuqzalduysqwbhjfmiujzusqtbppmpzgstjltxomienprkfydeheyrhvjxwwxztwpdwutymlldtvonmvdriomfgwytyambrrujfdzxwhkvyabyoknervotiaotwzftmboejynfitiqgjdxgbheznmnbfzzqnnrewrrzfijqolqvtokbczetcitivzxpylbkwghkcxxeeuclbwdogoeuekdkxfwwweefodnzjfxuwxpfshmocxhwmwdmnjokxauconqfpwioahjlkvgrynpeympvyvkugupgklvahixzookypqyqqtmmwevtqwmbcsvqpumkaklcjnluxisdwqpndzdfvjfjekddfvnzuvbbzxsekvxbxtemojbjigfitoqmhnnnewasdbejihcdswrrwkpljoiuqbeoithvwfspszrcgreidsemxvo");
//          org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bcevygirny" + "'", str2, "bcevygirny");
//     }
// 	@Test
//     public void test240_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test240");
//         java.lang.String str2 = com.github.edgar615.util.base.Randoms.randomString((int) '4', "com.github.edgar615.util.reflect.ReflectionException: zke6K73sGAFcSk2a1dhzUA7lahelv1FNMFmryTx5tPGLEQLc8UXlhIXuEx48YOz4a5FKltKYeK4Vh38mt6LtCTkW5SeGCXjSs");
//          org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".tTti1GeS.yKMuzM.gx5tthhKtWiIKUlCre5PlKrauaQXXltn4po" + "'", str2, ".tTti1GeS.yKMuzM.gx5tthhKtWiIKUlCre5PlKrauaQXXltn4po");
//     }
// 	@Test
//     public void test242_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test242");
//         com.github.edgar615.util.uuid.DefaultUUIDFactory defaultUUIDFactory0 = new com.github.edgar615.util.uuid.DefaultUUIDFactory();
//         java.util.UUID uUID1 = defaultUUIDFactory0.uuid();
//         org.junit.Assert.assertNotNull(uUID1);
//          org.junit.Assert.assertEquals(uUID1.toString(), "4a1402c5-b70f-4d3b-addb-37dd66b2942a");
//     }
// 	@Test
//     public void test250_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test250");
//         com.github.edgar615.util.collection.ArraySkipList<java.util.UUID, java.lang.Object[]> uUIDArraySkipList1 = new com.github.edgar615.util.collection.ArraySkipList<java.util.UUID, java.lang.Object[]>((int) 'a');
//         com.github.edgar615.util.collection.ArraySkipList<java.util.UUID, java.lang.Object[]> uUIDArraySkipList3 = new com.github.edgar615.util.collection.ArraySkipList<java.util.UUID, java.lang.Object[]>((int) (byte) 10);
//         com.github.edgar615.util.collection.ArraySkipList<java.util.UUID, java.lang.Object[]> uUIDArraySkipList5 = new com.github.edgar615.util.collection.ArraySkipList<java.util.UUID, java.lang.Object[]>((int) (byte) 10);
//         com.github.edgar615.util.uuid.UUIDFactory uUIDFactory6 = com.github.edgar615.util.uuid.UUIDFactory.concurrentUUIDFactory();
//         java.util.UUID uUID7 = uUIDFactory6.uuid();
//         java.lang.Object[] objArray8 = uUIDArraySkipList5.get(uUID7);
//         java.lang.Object[] objArray9 = uUIDArraySkipList3.get(uUID7);
//         java.lang.String[] strArray11 = new java.lang.String[] { "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC" };
//         java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
//         boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
//         double[] doubleArray19 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
//         com.github.edgar615.util.sort.Sorts.bubble(doubleArray19);
//         boolean boolean21 = strList12.contains((java.lang.Object) doubleArray19);
//         java.lang.Object[] objArray22 = strList12.toArray();
//         java.lang.Object[] objArray23 = uUIDArraySkipList1.add(uUID7, objArray22);
//         org.junit.Assert.assertNotNull(uUIDFactory6);
//         org.junit.Assert.assertNotNull(uUID7);
//          org.junit.Assert.assertEquals(uUID7.toString(), "930d975a-a74b-40b8-bdcf-dd9e514e4004");
//         org.junit.Assert.assertNull(objArray8);
//         org.junit.Assert.assertNull(objArray9);
//         org.junit.Assert.assertNotNull(strArray11);
//         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
//         org.junit.Assert.assertNotNull(doubleArray19);
//         org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
//         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
//         org.junit.Assert.assertNotNull(objArray22);
//         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC]");
//         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC]");
//         org.junit.Assert.assertNull(objArray23);
//     }
// 	@Test
//     public void test262_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test262");
//         java.io.File file2 = com.github.edgar615.util.io.IOUtils.createTempDirectory("zke6K73sGAFcSk2a1dhzUA7lahelv1FNMFmryTx5tPGLEQLc8UXlhIXuEx48YOz4a5FKltKYeK4Vh38mt6LtCTkW5SeGCXjSs", "DefaultErrorCode{number=1008, message='Incomplete Parameter'}");
//         org.junit.Assert.assertNotNull(file2);
//          org.junit.Assert.assertEquals(file2.getParent(), "/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/zke6K73sGAFcSk2a1dhzUA7lahelv1FNMFmryTx5tPGLEQLc8UXlhIXuEx48YOz4a5FKltKYeK4Vh38mt6LtCTkW5SeGCXjSs988287619910513598");
// // flaky:         org.junit.Assert.assertEquals(file2.toString(), "/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/zke6K73sGAFcSk2a1dhzUA7lahelv1FNMFmryTx5tPGLEQLc8UXlhIXuEx48YOz4a5FKltKYeK4Vh38mt6LtCTkW5SeGCXjSs988287619910513598/DefaultErrorCode{number=1008, message='Incomplete Parameter'}");
//     }
// 	@Test
//     public void test262_2() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test262");
//         java.io.File file2 = com.github.edgar615.util.io.IOUtils.createTempDirectory("zke6K73sGAFcSk2a1dhzUA7lahelv1FNMFmryTx5tPGLEQLc8UXlhIXuEx48YOz4a5FKltKYeK4Vh38mt6LtCTkW5SeGCXjSs", "DefaultErrorCode{number=1008, message='Incomplete Parameter'}");
//         org.junit.Assert.assertNotNull(file2);
// // flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/zke6K73sGAFcSk2a1dhzUA7lahelv1FNMFmryTx5tPGLEQLc8UXlhIXuEx48YOz4a5FKltKYeK4Vh38mt6LtCTkW5SeGCXjSs988287619910513598");
//          org.junit.Assert.assertEquals(file2.toString(), "/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/zke6K73sGAFcSk2a1dhzUA7lahelv1FNMFmryTx5tPGLEQLc8UXlhIXuEx48YOz4a5FKltKYeK4Vh38mt6LtCTkW5SeGCXjSs988287619910513598/DefaultErrorCode{number=1008, message='Incomplete Parameter'}");
//     }
// 	@Test
//     public void test269_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test269");
//         java.lang.String str1 = com.github.edgar615.util.base.Randoms.randomUpperAlphabet(1000);
//          org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PLFMXYPUUTYJQHJIEKEMPDMUOMNGRFMSBCQWTNZJXTVBTASKXMYHWKYMJKGHCGYUVPZPKIGCMPQFMLZVDGGWHTJBTORTPEUGKVSKJOCCARHFIXUCACLMSJEMKWIZOAUMZYHYIOARWBIYNZCSTGEOVMENEXUUQCPTHVDQNNCOOQLTMXGXZDMRMUHBJXAQYPWRAKTTXLOWYVNYWQXJVIAURPMSFCVBYXYXILWFNRULEWOMHSUAHFEVTNXJWTOMLWBRMJXTITQYQZDQOKJKECSJTXFKVZXKQBRKBYIMCMEADSFJBTJKFXCMPYKNMRJCCWZTWYBFMIVZUPGZRLWEQWTEFVZRMKTIONXAHHGQOKXOUADLIHPOLWUCSQMZQAQDQTLAGGBLMVXPIHPJOWNCAGJPOXNZQUBEGFSRIROMZYDFIISKUYHPGZCXOJLBVBOQLCDDHUULUIRBCEKHQGVXAAFANTXQURMKTMHDZVLHOFNBONXNBIOWRQIXZIXVDLVKOPRBDRLJICVJQPOPAMYMZPWMGDFTXPABLYFHRRPMMIETJHZEZCPLDIEHRITDRFXAOMWTHNLILPTSSUIEUQTDHVVVQUTVYFMGZNZOOCMYQXUUWMGUCODMYZJEZXVCPVCLMSPDLUOAQLNHWPJPKIAKDZUASMQRZDBQTHLPVHUFHWRXGQEBILSIZNRVDBGYVJEGGWQSNZCOATGZQNSZMTVPLBUQJWITMSOJIVAEWSZDWDKDBBCUFAQGNAPOBGKCUAHYHYKWRMVHJBYRABLDHADYXCYQUQXINIODHFFYVLVJJOYONSRRFMISYELEWTBTTGFZUGBWHBZWVVGTNDWSBKPRZIIRXNDUDSBEXOWIEOKWRKXGPCLDHSQOQGILFMAUBBWFRICCUKWFWQWUVMJCCFMOMHBOLJJQDEUHVOCVOAPWTZJGFGEMANBXBUIWZXDVDFYDNRWFHEAPOPDAGIYFLQYLDVUWEDGCFPBOXTCQVSXUDRGU" + "'", str1, "PLFMXYPUUTYJQHJIEKEMPDMUOMNGRFMSBCQWTNZJXTVBTASKXMYHWKYMJKGHCGYUVPZPKIGCMPQFMLZVDGGWHTJBTORTPEUGKVSKJOCCARHFIXUCACLMSJEMKWIZOAUMZYHYIOARWBIYNZCSTGEOVMENEXUUQCPTHVDQNNCOOQLTMXGXZDMRMUHBJXAQYPWRAKTTXLOWYVNYWQXJVIAURPMSFCVBYXYXILWFNRULEWOMHSUAHFEVTNXJWTOMLWBRMJXTITQYQZDQOKJKECSJTXFKVZXKQBRKBYIMCMEADSFJBTJKFXCMPYKNMRJCCWZTWYBFMIVZUPGZRLWEQWTEFVZRMKTIONXAHHGQOKXOUADLIHPOLWUCSQMZQAQDQTLAGGBLMVXPIHPJOWNCAGJPOXNZQUBEGFSRIROMZYDFIISKUYHPGZCXOJLBVBOQLCDDHUULUIRBCEKHQGVXAAFANTXQURMKTMHDZVLHOFNBONXNBIOWRQIXZIXVDLVKOPRBDRLJICVJQPOPAMYMZPWMGDFTXPABLYFHRRPMMIETJHZEZCPLDIEHRITDRFXAOMWTHNLILPTSSUIEUQTDHVVVQUTVYFMGZNZOOCMYQXUUWMGUCODMYZJEZXVCPVCLMSPDLUOAQLNHWPJPKIAKDZUASMQRZDBQTHLPVHUFHWRXGQEBILSIZNRVDBGYVJEGGWQSNZCOATGZQNSZMTVPLBUQJWITMSOJIVAEWSZDWDKDBBCUFAQGNAPOBGKCUAHYHYKWRMVHJBYRABLDHADYXCYQUQXINIODHFFYVLVJJOYONSRRFMISYELEWTBTTGFZUGBWHBZWVVGTNDWSBKPRZIIRXNDUDSBEXOWIEOKWRKXGPCLDHSQOQGILFMAUBBWFRICCUKWFWQWUVMJCCFMOMHBOLJJQDEUHVOCVOAPWTZJGFGEMANBXBUIWZXDVDFYDNRWFHEAPOPDAGIYFLQYLDVUWEDGCFPBOXTCQVSXUDRGU");
//     }
// 	@Test
//     public void test287_1() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test287");
//         com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode1 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
//         short[] shortArray5 = new short[] { (short) 10, (short) 100, (byte) 10 };
//         java.util.Enumeration[] enumerationArray7 = new java.util.Enumeration[0];
//         @SuppressWarnings("unchecked")
//         java.util.Enumeration<java.lang.Object>[] objEnumerationArray8 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray7;
//         com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration9 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray8);
//         java.util.Enumeration[] enumerationArray11 = new java.util.Enumeration[1];
//         @SuppressWarnings("unchecked")
//         java.util.Enumeration<java.lang.Object>[] objEnumerationArray12 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray11;
//         objEnumerationArray12[0] = objCompoundEnumeration9;
//         float[] floatArray18 = new float[] { (short) 0, (short) 0 };
//         com.github.edgar615.util.sort.Sorts.selection(floatArray18);
//         com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_20 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode1, shortArray5, objEnumerationArray12, (java.lang.Comparable<java.lang.String>) "hi!", floatArray18);
//         short[] shortArray21 = strComparableTuple6_20.getT3();
//         java.io.File file24 = com.github.edgar615.util.io.IOUtils.createTempDirectory("CustomErrorCode{number=0, message='hi!'}", "HMACMD5");
//         boolean boolean25 = com.github.edgar615.util.io.IOUtils.forceDeletePath(file24);
//         boolean boolean26 = com.github.edgar615.util.io.IOUtils.deleteFile(file24);
//         boolean boolean27 = strComparableTuple6_20.equals((java.lang.Object) boolean26);
//         org.junit.Assert.assertTrue("'" + defaultErrorCode1 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode1.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
//         org.junit.Assert.assertNotNull(shortArray5);
//         org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 100, 10]");
//         org.junit.Assert.assertNotNull(enumerationArray7);
//         org.junit.Assert.assertNotNull(objEnumerationArray8);
//         org.junit.Assert.assertNotNull(enumerationArray11);
//         org.junit.Assert.assertNotNull(objEnumerationArray12);
//         org.junit.Assert.assertNotNull(floatArray18);
//         org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 0.0]");
//         org.junit.Assert.assertNotNull(strComparableTuple6_20);
//         org.junit.Assert.assertNotNull(shortArray21);
//         org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[10, 100, 10]");
//         org.junit.Assert.assertNotNull(file24);
//          org.junit.Assert.assertEquals(file24.getParent(), "/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/CustomErrorCode{number=0, message='hi!'}7728660471648441541");
// // flaky:         org.junit.Assert.assertEquals(file24.toString(), "/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/CustomErrorCode{number=0, message='hi!'}7728660471648441541/HMACMD5");
//         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
//         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
//         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
//     }
// 	@Test
//     public void test287_2() throws Throwable {
//         if (debug)
//             System.out.format("%n%s%n", "TestGroup100Case0.test287");
//         com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode1 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
//         short[] shortArray5 = new short[] { (short) 10, (short) 100, (byte) 10 };
//         java.util.Enumeration[] enumerationArray7 = new java.util.Enumeration[0];
//         @SuppressWarnings("unchecked")
//         java.util.Enumeration<java.lang.Object>[] objEnumerationArray8 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray7;
//         com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration9 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray8);
//         java.util.Enumeration[] enumerationArray11 = new java.util.Enumeration[1];
//         @SuppressWarnings("unchecked")
//         java.util.Enumeration<java.lang.Object>[] objEnumerationArray12 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray11;
//         objEnumerationArray12[0] = objCompoundEnumeration9;
//         float[] floatArray18 = new float[] { (short) 0, (short) 0 };
//         com.github.edgar615.util.sort.Sorts.selection(floatArray18);
//         com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_20 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode1, shortArray5, objEnumerationArray12, (java.lang.Comparable<java.lang.String>) "hi!", floatArray18);
//         short[] shortArray21 = strComparableTuple6_20.getT3();
//         java.io.File file24 = com.github.edgar615.util.io.IOUtils.createTempDirectory("CustomErrorCode{number=0, message='hi!'}", "HMACMD5");
//         boolean boolean25 = com.github.edgar615.util.io.IOUtils.forceDeletePath(file24);
//         boolean boolean26 = com.github.edgar615.util.io.IOUtils.deleteFile(file24);
//         boolean boolean27 = strComparableTuple6_20.equals((java.lang.Object) boolean26);
//         org.junit.Assert.assertTrue("'" + defaultErrorCode1 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode1.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
//         org.junit.Assert.assertNotNull(shortArray5);
//         org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 100, 10]");
//         org.junit.Assert.assertNotNull(enumerationArray7);
//         org.junit.Assert.assertNotNull(objEnumerationArray8);
//         org.junit.Assert.assertNotNull(enumerationArray11);
//         org.junit.Assert.assertNotNull(objEnumerationArray12);
//         org.junit.Assert.assertNotNull(floatArray18);
//         org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 0.0]");
//         org.junit.Assert.assertNotNull(strComparableTuple6_20);
//         org.junit.Assert.assertNotNull(shortArray21);
//         org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[10, 100, 10]");
//         org.junit.Assert.assertNotNull(file24);
// // flaky:         org.junit.Assert.assertEquals(file24.getParent(), "/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/CustomErrorCode{number=0, message='hi!'}7728660471648441541");
//          org.junit.Assert.assertEquals(file24.toString(), "/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/CustomErrorCode{number=0, message='hi!'}7728660471648441541/HMACMD5");
//         org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
//         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
//         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
//     }
}