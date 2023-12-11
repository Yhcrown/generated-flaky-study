package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test260_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileName fileName3 = csvBangConfiguration0.fileName;
        csvBangConfiguration0.isAsynchronousWrite = true;
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration6 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper8 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream9 = csvFileWrapper8.getOutPutStream();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext10 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState11 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration6, csvFileWrapper8, csvFileContext10);
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration csvFieldConfiguration12 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration();
        java.lang.String str13 = csvFieldConfiguration12.nullReplaceString;
        java.lang.String str14 = csvFieldConfiguration12.nullReplaceString;
        csvFieldConfiguration12.name = "com.github.lecogiteur.csvbang.exception.CsvBangIOException: ";
        java.lang.String str17 = csvFieldConfiguration12.nullReplaceString;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType18 = com.github.lecogiteur.csvbang.util.EndLineType.PARAGRAPH_SEPARATOR;
        char[] charArray19 = endLineType18.getCharacters();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext20 = new com.github.lecogiteur.csvbang.file.CsvFileContext(csvBangConfiguration0, csvFileWrapper8, (java.lang.Object) csvFieldConfiguration12, (java.lang.Object) endLineType18);
        org.junit.Assert.assertNull(fileName3);
        org.junit.Assert.assertNull(fileOutputStream9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + endLineType18 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.PARAGRAPH_SEPARATOR + "'", endLineType18.equals(com.github.lecogiteur.csvbang.util.EndLineType.PARAGRAPH_SEPARATOR));
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "\u2029");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "\u2029");
         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "\u2029]");
    }
}