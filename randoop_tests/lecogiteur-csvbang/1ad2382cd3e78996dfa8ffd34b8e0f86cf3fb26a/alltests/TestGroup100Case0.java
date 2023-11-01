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
        com.github.lecogiteur.csvbang.util.EndLineType endLineType0 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = endLineType0.toBytes(charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + endLineType0 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType0.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT tYPE_FORMAT0 = com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.NONE;
        org.junit.Assert.assertTrue("'" + tYPE_FORMAT0 + "' != '" + com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.NONE + "'", tYPE_FORMAT0.equals(com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.NONE));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper0 = null;
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration1 = null;
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.lecogiteur.csvbang.file.FileReadyForWritingCsvFileState fileReadyForWritingCsvFileState3 = new com.github.lecogiteur.csvbang.file.FileReadyForWritingCsvFileState(csvFileWrapper0, csvBangConfiguration1, csvFileContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        boolean boolean1 = com.github.lecogiteur.csvbang.util.CsvbangUti.isStringNotBlank("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.github.lecogiteur.csvbang.util.Comment comment1 = new com.github.lecogiteur.csvbang.util.Comment("");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        boolean boolean1 = com.github.lecogiteur.csvbang.util.CsvbangUti.isStringBlank("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.String str0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_QUOTE_CHARACTER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT tYPE_FORMAT0 = com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.CURRENCY;
        org.junit.Assert.assertTrue("'" + tYPE_FORMAT0 + "' != '" + com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.CURRENCY + "'", tYPE_FORMAT0.equals(com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.CURRENCY));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_FIELD_NULL_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        int int0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_BLOCKING_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.lang.Throwable throwable0 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException1 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable0);
        java.lang.String str2 = csvBangException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.github.lecogiteur.csvbang.exception.CsvBangException" + "'", str2, "com.github.lecogiteur.csvbang.exception.CsvBangException");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        int int0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_FILE_MAX_RECORD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory csvFilePoolFactory0 = new com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        boolean boolean0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_ASYNCHRONOUS_WRITE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper8 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str9 = csvFileWrapper8.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration10 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration10.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper8, csvBangConfiguration10);
        // The following exception was thrown during execution in test generation
        try {
            fileToCloseForWritingCsvFileState6.open((java.lang.Object) csvBangConfiguration10);
            org.junit.Assert.fail("Expected exception of type com.github.lecogiteur.csvbang.exception.CsvBangException; message: The file /Users/yhcrown/Documents/flaky_java_projects/lecogiteur-csvbang/? is closed. We can't open it.");
        } catch (com.github.lecogiteur.csvbang.exception.CsvBangException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\205" + "'", str9, "\205");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.FileName fileName1 = null;
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool4 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration0, fileName1, (java.lang.Object) true, (java.lang.Object) (byte) 0);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration5 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration5.maxFileSize = ' ';
        csvBangConfiguration5.delimiter = "\205";
        com.github.lecogiteur.csvbang.pool.CsvbangExecutorService csvbangExecutorService10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.lecogiteur.csvbang.writer.AsynchronousCsvWriter<java.lang.Throwable> throwableAsynchronousCsvWriter11 = new com.github.lecogiteur.csvbang.writer.AsynchronousCsvWriter<java.lang.Throwable>((com.github.lecogiteur.csvbang.pool.CsvFilePool) multiCsvFilePool4, csvBangConfiguration5, csvbangExecutorService10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.FileName fileName1 = null;
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool4 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration0, fileName1, (java.lang.Object) true, (java.lang.Object) (byte) 0);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration5 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration5.maxFileSize = ' ';
        csvBangConfiguration5.delimiter = "\205";
        // The following exception was thrown during execution in test generation
        try {
            com.github.lecogiteur.csvbang.writer.SimpleCsvWriter<com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter> numberCsvFormatterSimpleCsvWriter10 = new com.github.lecogiteur.csvbang.writer.SimpleCsvWriter<com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter>((com.github.lecogiteur.csvbang.pool.CsvFilePool) multiCsvFilePool4, csvBangConfiguration5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.String str0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_START_RECORD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.FileName fileName1 = null;
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool4 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration0, fileName1, (java.lang.Object) true, (java.lang.Object) (byte) 0);
        java.lang.Throwable throwable5 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException6 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable5);
        java.lang.Throwable[] throwableArray7 = csvBangException6.getSuppressed();
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException8 = new com.github.lecogiteur.csvbang.exception.CsvBangException((java.lang.Throwable) csvBangException6);
        multiCsvFilePool4.setCustomHeader((java.lang.Object) csvBangException6);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        boolean boolean0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_PROCESS_FILE_BY_FILE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream3 = null;
        csvFileWrapper2.setOutputStream(fileOutputStream3);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext5 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration0, csvFileWrapper2, csvFileContext5);
        // The following exception was thrown during execution in test generation
        try {
            fileToOpenForWritingCsvFileState6.write((java.lang.Object) 1.0f, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT tYPE_FORMAT0 = com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.CUSTOM;
        org.junit.Assert.assertTrue("'" + tYPE_FORMAT0 + "' != '" + com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.CUSTOM + "'", tYPE_FORMAT0.equals(com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.CUSTOM));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.util.EndLineType endLineType7 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str8 = endLineType7.toString();
        java.util.regex.Pattern pattern9 = endLineType7.getPattern();
        // The following exception was thrown during execution in test generation
        try {
            fileToCloseForWritingCsvFileState6.write((java.lang.Object) pattern9, "");
            org.junit.Assert.fail("Expected exception of type com.github.lecogiteur.csvbang.exception.CsvBangException; message: The file is closed. We can't write in /Users/yhcrown/Documents/flaky_java_projects/lecogiteur-csvbang/? the content:  .");
        } catch (com.github.lecogiteur.csvbang.exception.CsvBangException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertTrue("'" + endLineType7 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType7.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\205" + "'", str8, "\205");
        org.junit.Assert.assertNotNull(pattern9);
        org.junit.Assert.assertEquals(pattern9.toString(), "\\Q\205\\E");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT tYPE_FORMAT0 = com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.DATE;
        org.junit.Assert.assertTrue("'" + tYPE_FORMAT0 + "' != '" + com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.DATE + "'", tYPE_FORMAT0.equals(com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.DATE));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.FileName fileName1 = null;
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool4 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration0, fileName1, (java.lang.Object) true, (java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext7 = multiCsvFilePool4.getFile(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.github.lecogiteur.csvbang.formatter.Default default0 = new com.github.lecogiteur.csvbang.formatter.Default();
        default0.setPattern("\205");
        default0.init();
        java.util.Locale locale4 = null;
        default0.setLocal(locale4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        int int0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_FILE_MAX_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        boolean boolean0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_HEADER;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.github.lecogiteur.csvbang.factory.FactoryCsvWriter factoryCsvWriter0 = new com.github.lecogiteur.csvbang.factory.FactoryCsvWriter();
        factoryCsvWriter0.setNumberOfWriterThread((int) (short) 1);
        factoryCsvWriter0.addPackage("\205");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.Throwable throwable1 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException2 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable1);
        java.lang.Throwable[] throwableArray3 = csvBangException2.getSuppressed();
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException4 = new com.github.lecogiteur.csvbang.exception.CsvBangException((java.lang.Throwable) csvBangException2);
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException5 = new com.github.lecogiteur.csvbang.exception.CsvBangException("hi!", (java.lang.Throwable) csvBangException4);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        java.lang.Throwable throwable17 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException18 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable17);
        // The following exception was thrown during execution in test generation
        try {
            fileToOpenForWritingCsvFileState16.open((java.lang.Object) csvBangException18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.github.lecogiteur.csvbang.exception.CsvBangCloseException csvBangCloseException1 = new com.github.lecogiteur.csvbang.exception.CsvBangCloseException(1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        java.lang.annotation.Annotation[] annotationArray7 = new java.lang.annotation.Annotation[] {};
        com.github.lecogiteur.csvbang.annotation.CsvFormat csvFormat8 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvFormatAnnotation(annotationArray7);
        // The following exception was thrown during execution in test generation
        try {
            fileToCloseForWritingCsvFileState6.write((java.lang.Object) csvFormat8, "\205");
            org.junit.Assert.fail("Expected exception of type com.github.lecogiteur.csvbang.exception.CsvBangException; message: The file is closed. We can't write in /Users/yhcrown/Documents/flaky_java_projects/lecogiteur-csvbang/? the content: ? .");
        } catch (com.github.lecogiteur.csvbang.exception.CsvBangException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(annotationArray7);
        org.junit.Assert.assertNull(csvFormat8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT tYPE_FORMAT0 = com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.BOOLEAN;
        org.junit.Assert.assertTrue("'" + tYPE_FORMAT0 + "' != '" + com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.BOOLEAN + "'", tYPE_FORMAT0.equals(com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.BOOLEAN));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        boolean boolean1 = com.github.lecogiteur.csvbang.util.CsvbangUti.isStringBlank("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.String str0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_CUSTOM_FOOTER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "null" + "'", str0, "null");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.footer = "";
        long long10 = csvBangConfiguration0.maxFile;
        long long11 = csvBangConfiguration0.maxFile;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.github.lecogiteur.csvbang.util.EndLineType endLineType0 = com.github.lecogiteur.csvbang.util.EndLineType.CARRIAGE_RETURN_LINE_FEED;
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = endLineType0.toBytes(charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + endLineType0 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.CARRIAGE_RETURN_LINE_FEED + "'", endLineType0.equals(com.github.lecogiteur.csvbang.util.EndLineType.CARRIAGE_RETURN_LINE_FEED));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        long long8 = csvBangConfiguration0.maxFileSize;
        java.lang.Character char9 = csvBangConfiguration0.quote;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        boolean boolean0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_APPEND_FILE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.lang.String str0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_CUSTOM_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "null" + "'", str0, "null");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        csvBangConfiguration0.endRecord = "";
        java.lang.String str6 = csvBangConfiguration0.footer;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        boolean boolean1 = com.github.lecogiteur.csvbang.util.CsvbangUti.isStringBlank("\205");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        java.lang.String str4 = csvBangConfiguration0.delimiter;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.github.lecogiteur.csvbang.util.CsvbangUti csvbangUti0 = new com.github.lecogiteur.csvbang.util.CsvbangUti();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.github.lecogiteur.csvbang.util.EndLineType endLineType0 = com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED_CARRIAGE_RETURN;
        org.junit.Assert.assertTrue("'" + endLineType0 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED_CARRIAGE_RETURN + "'", endLineType0.equals(com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED_CARRIAGE_RETURN));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.github.lecogiteur.csvbang.formatter.DateCsvFormatter dateCsvFormatter0 = new com.github.lecogiteur.csvbang.formatter.DateCsvFormatter();
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str3 = csvFileWrapper2.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration4 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration4.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState7 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper2, csvBangConfiguration4);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration8 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper10 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream11 = null;
        csvFileWrapper10.setOutputStream(fileOutputStream11);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext13 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState14 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration8, csvFileWrapper10, csvFileContext13);
        java.io.File file15 = csvFileWrapper10.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext16 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState17 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration4, csvFileWrapper10, csvFileContext16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateCsvFormatter0.format((java.lang.Object) csvFileWrapper10, "\205");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\205" + "'", str3, "\205");
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNull("file15.getParent() == null", file15.getParent());
        org.junit.Assert.assertEquals(file15.toString(), "\205");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.FileName fileName1 = null;
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool4 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration0, fileName1, (java.lang.Object) true, (java.lang.Object) (byte) 0);
        java.util.Collection<com.github.lecogiteur.csvbang.file.CsvFileContext> csvFileContextCollection5 = multiCsvFilePool4.getAllFiles();
        // The following exception was thrown during execution in test generation
        try {
            com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext8 = multiCsvFilePool4.getFile((int) (short) -1, (int) '\\');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvFileContextCollection5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        boolean boolean1 = com.github.lecogiteur.csvbang.util.CsvbangUti.isStringNotBlank(",");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.util.EndLineType endLineType7 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str8 = endLineType7.toString();
        java.lang.String str9 = endLineType7.toString();
        // The following exception was thrown during execution in test generation
        try {
            fileToCloseForWritingCsvFileState6.open((java.lang.Object) str9);
            org.junit.Assert.fail("Expected exception of type com.github.lecogiteur.csvbang.exception.CsvBangException; message: The file /Users/yhcrown/Documents/flaky_java_projects/lecogiteur-csvbang/? is closed. We can't open it.");
        } catch (com.github.lecogiteur.csvbang.exception.CsvBangException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertTrue("'" + endLineType7 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType7.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\205" + "'", str8, "\205");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\205" + "'", str9, "\205");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        char char8 = csvBangConfiguration0.escapeQuoteCharacter;
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection9 = csvBangConfiguration0.commentsBefore;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\\' + "'", char8 == '\\');
        org.junit.Assert.assertNull(annotatedElementCollection9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration17 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration17.maxFileSize = ' ';
        java.lang.String str20 = csvBangConfiguration17.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType21 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str22 = endLineType21.toString();
        java.util.regex.Pattern pattern23 = endLineType21.getPattern();
        csvBangConfiguration17.patternCommentCharacter = pattern23;
        csvBangConfiguration17.footer = "";
        csvBangConfiguration17.startComment = "";
        // The following exception was thrown during execution in test generation
        try {
            fileToOpenForWritingCsvFileState16.write((java.lang.Object) "", ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + endLineType21 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType21.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\205" + "'", str22, "\205");
        org.junit.Assert.assertNotNull(pattern23);
        org.junit.Assert.assertEquals(pattern23.toString(), "\\Q\205\\E");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.lang.Throwable throwable0 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException1 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable0);
        java.lang.Throwable[] throwableArray2 = csvBangException1.getSuppressed();
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException3 = new com.github.lecogiteur.csvbang.exception.CsvBangException((java.lang.Throwable) csvBangException1);
        com.github.lecogiteur.csvbang.exception.CsvBangIOException csvBangIOException5 = new com.github.lecogiteur.csvbang.exception.CsvBangIOException("null");
        csvBangException3.addSuppressed((java.lang.Throwable) csvBangIOException5);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.github.lecogiteur.csvbang.util.EndLineType endLineType0 = com.github.lecogiteur.csvbang.util.EndLineType.CARRIAGE_RETURN;
        org.junit.Assert.assertTrue("'" + endLineType0 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.CARRIAGE_RETURN + "'", endLineType0.equals(com.github.lecogiteur.csvbang.util.EndLineType.CARRIAGE_RETURN));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        int int0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_MAX_NUMBER_FILE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.isAppendToFile = true;
        com.github.lecogiteur.csvbang.pool.CsvFilePool csvFilePool13 = com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory.createPool(csvBangConfiguration0, "hi!", (java.lang.Object) 10L, (java.lang.Object) (-1));
        csvBangConfiguration0.isAsynchronousWrite = false;
        boolean boolean16 = csvBangConfiguration0.isFileByFile;
        csvBangConfiguration0.escapeQuoteCharacter = '\\';
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNotNull(csvFilePool13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.github.lecogiteur.csvbang.formatter.Default default0 = new com.github.lecogiteur.csvbang.formatter.Default();
        default0.setPattern("\205");
        java.util.Locale locale3 = null;
        default0.setLocal(locale3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        csvBangConfiguration0.endRecord = "";
        java.nio.charset.Charset charset6 = null;
        csvBangConfiguration0.charset = charset6;
        csvBangConfiguration0.startComment = "";
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection10 = csvBangConfiguration0.commentsBefore;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(annotatedElementCollection10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.Throwable throwable1 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException2 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable1);
        java.lang.Throwable[] throwableArray3 = csvBangException2.getSuppressed();
        com.github.lecogiteur.csvbang.exception.CsvBangIOException csvBangIOException4 = new com.github.lecogiteur.csvbang.exception.CsvBangIOException("hi!", (java.lang.Throwable) csvBangException2);
        java.lang.String str5 = csvBangIOException4.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!" + "'", str5, "com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.String str0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_FIELD_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration17 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration17.maxFileSize = ' ';
        java.lang.String str20 = csvBangConfiguration17.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType21 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str22 = endLineType21.toString();
        java.util.regex.Pattern pattern23 = endLineType21.getPattern();
        csvBangConfiguration17.patternCommentCharacter = pattern23;
        csvBangConfiguration17.footer = "";
        fileToOpenForWritingCsvFileState16.close((java.lang.Object) csvBangConfiguration17);
        fileToOpenForWritingCsvFileState16.close((java.lang.Object) false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + endLineType21 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType21.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\205" + "'", str22, "\205");
        org.junit.Assert.assertNotNull(pattern23);
        org.junit.Assert.assertEquals(pattern23.toString(), "\\Q\205\\E");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.github.lecogiteur.csvbang.formatter.Default default0 = new com.github.lecogiteur.csvbang.formatter.Default();
        default0.setPattern("\205");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        java.lang.String str7 = default0.format((java.lang.Object) csvBangConfiguration3, "\205");
        default0.setPattern("\205");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.github.lecogiteur.csvbang.util.Comment comment1 = new com.github.lecogiteur.csvbang.util.Comment("hi!");
        comment1.setComment("\205");
        comment1.setComment("hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = csvbangThreadPoolExecutor1.awaitTermination((long) (byte) 0, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        com.github.lecogiteur.csvbang.file.FileName fileName17 = null;
        csvBangConfiguration3.fileName = fileName17;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration7.maxFileSize = ' ';
        java.lang.String str10 = csvBangConfiguration7.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType11 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str12 = endLineType11.toString();
        java.util.regex.Pattern pattern13 = endLineType11.getPattern();
        csvBangConfiguration7.patternCommentCharacter = pattern13;
        csvBangConfiguration7.isAppendToFile = true;
        com.github.lecogiteur.csvbang.pool.CsvFilePool csvFilePool20 = com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory.createPool(csvBangConfiguration7, "hi!", (java.lang.Object) 10L, (java.lang.Object) (-1));
        csvBangConfiguration7.isAsynchronousWrite = false;
        boolean boolean23 = csvBangConfiguration7.isFileByFile;
        // The following exception was thrown during execution in test generation
        try {
            fileToCloseForWritingCsvFileState6.close((java.lang.Object) csvBangConfiguration7);
            org.junit.Assert.fail("Expected exception of type com.github.lecogiteur.csvbang.exception.CsvBangException; message: An error has occured when closed file");
        } catch (com.github.lecogiteur.csvbang.exception.CsvBangException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + endLineType11 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType11.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\205" + "'", str12, "\205");
        org.junit.Assert.assertNotNull(pattern13);
        org.junit.Assert.assertEquals(pattern13.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNotNull(csvFilePool20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        long long8 = csvBangConfiguration0.maxRecordByFile;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper10 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream11 = null;
        csvFileWrapper10.setOutputStream(fileOutputStream11);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext13 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState14 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration0, csvFileWrapper10, csvFileContext13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        boolean boolean0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_NO_END_RECORD;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream3 = null;
        csvFileWrapper2.setOutputStream(fileOutputStream3);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext5 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration0, csvFileWrapper2, csvFileContext5);
        com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter numberCsvFormatter7 = new com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter();
        fileToOpenForWritingCsvFileState6.close((java.lang.Object) numberCsvFormatter7);
        // The following exception was thrown during execution in test generation
        try {
            fileToOpenForWritingCsvFileState6.open((java.lang.Object) "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        boolean boolean2 = csvbangThreadPoolExecutor1.allowsCoreThreadTimeOut();
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<?> wildcardFuture4 = csvbangThreadPoolExecutor1.submit(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper18 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str19 = csvFileWrapper18.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration20 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration20.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState23 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper18, csvBangConfiguration20);
        fileToOpenForWritingCsvFileState16.close((java.lang.Object) fileToCloseForWritingCsvFileState23);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper26 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str27 = csvFileWrapper26.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration28 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration28.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState31 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper26, csvBangConfiguration28);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration32 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper34 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream35 = null;
        csvFileWrapper34.setOutputStream(fileOutputStream35);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext37 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState38 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration32, csvFileWrapper34, csvFileContext37);
        java.io.File file39 = csvFileWrapper34.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext40 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState41 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration28, csvFileWrapper34, csvFileContext40);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration42 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration42.maxFileSize = ' ';
        java.lang.String str45 = csvBangConfiguration42.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType46 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str47 = endLineType46.toString();
        java.util.regex.Pattern pattern48 = endLineType46.getPattern();
        csvBangConfiguration42.patternCommentCharacter = pattern48;
        csvBangConfiguration42.footer = "";
        fileToOpenForWritingCsvFileState41.close((java.lang.Object) csvBangConfiguration42);
        com.github.lecogiteur.csvbang.file.FileName fileName53 = null;
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration54 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration54.maxFileSize = ' ';
        java.lang.String str57 = csvBangConfiguration54.footer;
        csvBangConfiguration54.endRecord = "";
        java.nio.charset.Charset charset60 = null;
        csvBangConfiguration54.charset = charset60;
        java.lang.String str62 = csvBangConfiguration54.footer;
        csvBangConfiguration54.init();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration64 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration64.maxFileSize = ' ';
        java.lang.String str67 = csvBangConfiguration64.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType68 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str69 = endLineType68.toString();
        java.util.regex.Pattern pattern70 = endLineType68.getPattern();
        csvBangConfiguration64.patternCommentCharacter = pattern70;
        csvBangConfiguration64.footer = "";
        csvBangConfiguration64.startComment = "";
        csvBangConfiguration64.maxFileSize = 100L;
        com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool oneByOneCsvFilePool78 = new com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool(csvBangConfiguration42, fileName53, (java.lang.Object) csvBangConfiguration54, (java.lang.Object) csvBangConfiguration64);
        // The following exception was thrown during execution in test generation
        try {
            fileToCloseForWritingCsvFileState23.close((java.lang.Object) csvBangConfiguration42);
            org.junit.Assert.fail("Expected exception of type com.github.lecogiteur.csvbang.exception.CsvBangException; message: An error has occured when closed file");
        } catch (com.github.lecogiteur.csvbang.exception.CsvBangException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\205" + "'", str19, "\205");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\205" + "'", str27, "\205");
        org.junit.Assert.assertNotNull(file39);
        org.junit.Assert.assertNull("file39.getParent() == null", file39.getParent());
        org.junit.Assert.assertEquals(file39.toString(), "\205");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + endLineType46 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType46.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\205" + "'", str47, "\205");
        org.junit.Assert.assertNotNull(pattern48);
        org.junit.Assert.assertEquals(pattern48.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + endLineType68 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType68.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\205" + "'", str69, "\205");
        org.junit.Assert.assertNotNull(pattern70);
        org.junit.Assert.assertEquals(pattern70.toString(), "\\Q\205\\E");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        csvBangConfiguration0.endRecord = "";
        java.nio.charset.Charset charset6 = null;
        csvBangConfiguration0.charset = charset6;
        java.lang.String str8 = csvBangConfiguration0.footer;
        java.nio.charset.Charset charset9 = csvBangConfiguration0.charset;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(charset9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.annotation.Annotation[] annotationArray0 = new java.lang.annotation.Annotation[] {};
        com.github.lecogiteur.csvbang.annotation.CsvFormat csvFormat1 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvFormatAnnotation(annotationArray0);
        com.github.lecogiteur.csvbang.annotation.CsvFormat csvFormat2 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvFormatAnnotation(annotationArray0);
        org.junit.Assert.assertNotNull(annotationArray0);
        org.junit.Assert.assertNull(csvFormat1);
        org.junit.Assert.assertNull(csvFormat2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        boolean boolean2 = csvbangThreadPoolExecutor1.allowsCoreThreadTimeOut();
        java.lang.Runnable runnable3 = null;
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration4 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] csvFieldConfigurationArray5 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] {};
        java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration> csvFieldConfigurationList6 = new java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>) csvFieldConfigurationList6, csvFieldConfigurationArray5);
        csvBangConfiguration4.fields = csvFieldConfigurationList6;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.util.List<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>> csvFieldConfigurationListFuture9 = csvbangThreadPoolExecutor1.submit(runnable3, (java.util.List<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>) csvFieldConfigurationList6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(csvFieldConfigurationArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.Throwable throwable1 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException2 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable1);
        java.lang.Throwable[] throwableArray3 = csvBangException2.getSuppressed();
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException4 = new com.github.lecogiteur.csvbang.exception.CsvBangException((java.lang.Throwable) csvBangException2);
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException5 = new com.github.lecogiteur.csvbang.exception.CsvBangException("com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!", (java.lang.Throwable) csvBangException2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper18 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str19 = csvFileWrapper18.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration20 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration20.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState23 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper18, csvBangConfiguration20);
        fileToOpenForWritingCsvFileState16.close((java.lang.Object) fileToCloseForWritingCsvFileState23);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration25 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration25.maxFileSize = ' ';
        java.lang.String str28 = csvBangConfiguration25.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType29 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str30 = endLineType29.toString();
        java.util.regex.Pattern pattern31 = endLineType29.getPattern();
        csvBangConfiguration25.patternCommentCharacter = pattern31;
        csvBangConfiguration25.footer = "";
        // The following exception was thrown during execution in test generation
        try {
            fileToCloseForWritingCsvFileState23.open((java.lang.Object) csvBangConfiguration25);
            org.junit.Assert.fail("Expected exception of type com.github.lecogiteur.csvbang.exception.CsvBangException; message: The file /Users/yhcrown/Documents/flaky_java_projects/lecogiteur-csvbang/? is closed. We can't open it.");
        } catch (com.github.lecogiteur.csvbang.exception.CsvBangException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\205" + "'", str19, "\205");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + endLineType29 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType29.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\205" + "'", str30, "\205");
        org.junit.Assert.assertNotNull(pattern31);
        org.junit.Assert.assertEquals(pattern31.toString(), "\\Q\205\\E");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        csvbangThreadPoolExecutor1.shutdown();
        java.util.concurrent.ThreadFactory threadFactory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            csvbangThreadPoolExecutor1.setThreadFactory(threadFactory3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration17 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration17.maxFileSize = ' ';
        java.lang.String str20 = csvBangConfiguration17.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType21 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str22 = endLineType21.toString();
        java.util.regex.Pattern pattern23 = endLineType21.getPattern();
        csvBangConfiguration17.patternCommentCharacter = pattern23;
        csvBangConfiguration17.footer = "";
        fileToOpenForWritingCsvFileState16.close((java.lang.Object) csvBangConfiguration17);
        com.github.lecogiteur.csvbang.file.FileName fileName28 = null;
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration29 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration29.maxFileSize = ' ';
        java.lang.String str32 = csvBangConfiguration29.footer;
        csvBangConfiguration29.endRecord = "";
        java.nio.charset.Charset charset35 = null;
        csvBangConfiguration29.charset = charset35;
        java.lang.String str37 = csvBangConfiguration29.footer;
        csvBangConfiguration29.init();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration39 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration39.maxFileSize = ' ';
        java.lang.String str42 = csvBangConfiguration39.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType43 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str44 = endLineType43.toString();
        java.util.regex.Pattern pattern45 = endLineType43.getPattern();
        csvBangConfiguration39.patternCommentCharacter = pattern45;
        csvBangConfiguration39.footer = "";
        csvBangConfiguration39.startComment = "";
        csvBangConfiguration39.maxFileSize = 100L;
        com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool oneByOneCsvFilePool53 = new com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool(csvBangConfiguration17, fileName28, (java.lang.Object) csvBangConfiguration29, (java.lang.Object) csvBangConfiguration39);
        com.github.lecogiteur.csvbang.file.FileName fileName54 = null;
        csvBangConfiguration29.fileName = fileName54;
        csvBangConfiguration29.endRecord = "\205";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + endLineType21 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType21.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\205" + "'", str22, "\205");
        org.junit.Assert.assertNotNull(pattern23);
        org.junit.Assert.assertEquals(pattern23.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + endLineType43 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType43.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\205" + "'", str44, "\205");
        org.junit.Assert.assertNotNull(pattern45);
        org.junit.Assert.assertEquals(pattern45.toString(), "\\Q\205\\E");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        char char17 = csvBangConfiguration3.commentCharacter;
        csvBangConfiguration3.isAsynchronousWrite = true;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '#' + "'", char17 == '#');
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        java.lang.String str4 = csvbangThreadPoolExecutor1.toString();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = csvbangThreadPoolExecutor1.awaitTermination((long) (-1), timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection1 = com.github.lecogiteur.csvbang.util.ReflectionUti.scanPackageClass("hi!");
        org.junit.Assert.assertNotNull(wildcardClassCollection1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileName fileName3 = null;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        com.github.lecogiteur.csvbang.util.ConfigurationUti configurationUti5 = new com.github.lecogiteur.csvbang.util.ConfigurationUti();
        com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool oneByOneCsvFilePool6 = new com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool(csvBangConfiguration0, fileName3, (java.lang.Object) endLineType4, (java.lang.Object) configurationUti5);
        java.util.Collection<com.github.lecogiteur.csvbang.file.CsvFileContext> csvFileContextCollection7 = oneByOneCsvFilePool6.getAllFiles();
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertNotNull(csvFileContextCollection7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.github.lecogiteur.csvbang.formatter.Default default0 = new com.github.lecogiteur.csvbang.formatter.Default();
        default0.setPattern("\205");
        default0.setPattern("hi!");
        default0.init();
        java.util.Locale locale6 = null;
        default0.setLocal(locale6);
        java.util.Locale locale8 = null;
        default0.setLocal(locale8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.isAppendToFile = true;
        com.github.lecogiteur.csvbang.pool.CsvFilePool csvFilePool13 = com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory.createPool(csvBangConfiguration0, "hi!", (java.lang.Object) 10L, (java.lang.Object) (-1));
        csvBangConfiguration0.isAsynchronousWrite = false;
        boolean boolean16 = csvBangConfiguration0.isFileByFile;
        csvBangConfiguration0.startRecord = "com.github.lecogiteur.csvbang.exception.CsvBangException";
        java.lang.String str19 = csvBangConfiguration0.startRecord;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNotNull(csvFilePool13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "com.github.lecogiteur.csvbang.exception.CsvBangException" + "'", str19, "com.github.lecogiteur.csvbang.exception.CsvBangException");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        int int4 = csvbangThreadPoolExecutor1.getPoolSize();
        java.util.List<java.lang.Runnable> runnableList5 = csvbangThreadPoolExecutor1.shutdownNow();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(runnableList5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        java.lang.Runnable runnable5 = null;
        java.lang.Throwable[] throwableArray6 = new java.lang.Throwable[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.Throwable[]> throwableArrayFuture7 = csvbangThreadPoolExecutor1.submit(runnable5, throwableArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        char char17 = csvBangConfiguration3.commentCharacter;
        boolean boolean18 = csvBangConfiguration3.noEndRecordOnLastRecord;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '#' + "'", char17 == '#');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        char char17 = csvBangConfiguration3.commentCharacter;
        java.lang.String str18 = csvBangConfiguration3.footer;
        csvBangConfiguration3.maxRecordByFile = 10L;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '#' + "'", char17 == '#');
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            csvbangThreadPoolExecutor1.setKeepAliveTime((long) (byte) 0, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.lang.Throwable throwable1 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException2 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable1);
        java.lang.Throwable[] throwableArray3 = csvBangException2.getSuppressed();
        com.github.lecogiteur.csvbang.exception.CsvBangIOException csvBangIOException4 = new com.github.lecogiteur.csvbang.exception.CsvBangIOException("hi!", (java.lang.Throwable) csvBangException2);
        com.github.lecogiteur.csvbang.exception.CsvBangIOException csvBangIOException5 = new com.github.lecogiteur.csvbang.exception.CsvBangIOException((java.lang.Throwable) csvBangIOException4);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration17 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration17.maxFileSize = ' ';
        java.lang.String str20 = csvBangConfiguration17.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType21 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str22 = endLineType21.toString();
        java.util.regex.Pattern pattern23 = endLineType21.getPattern();
        csvBangConfiguration17.patternCommentCharacter = pattern23;
        csvBangConfiguration17.footer = "";
        fileToOpenForWritingCsvFileState16.close((java.lang.Object) csvBangConfiguration17);
        com.github.lecogiteur.csvbang.file.FileName fileName28 = null;
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration29 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration29.maxFileSize = ' ';
        java.lang.String str32 = csvBangConfiguration29.footer;
        csvBangConfiguration29.endRecord = "";
        java.nio.charset.Charset charset35 = null;
        csvBangConfiguration29.charset = charset35;
        java.lang.String str37 = csvBangConfiguration29.footer;
        csvBangConfiguration29.init();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration39 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration39.maxFileSize = ' ';
        java.lang.String str42 = csvBangConfiguration39.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType43 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str44 = endLineType43.toString();
        java.util.regex.Pattern pattern45 = endLineType43.getPattern();
        csvBangConfiguration39.patternCommentCharacter = pattern45;
        csvBangConfiguration39.footer = "";
        csvBangConfiguration39.startComment = "";
        csvBangConfiguration39.maxFileSize = 100L;
        com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool oneByOneCsvFilePool53 = new com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool(csvBangConfiguration17, fileName28, (java.lang.Object) csvBangConfiguration29, (java.lang.Object) csvBangConfiguration39);
        boolean boolean54 = csvBangConfiguration17.noEndRecordOnLastRecord;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + endLineType21 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType21.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\205" + "'", str22, "\205");
        org.junit.Assert.assertNotNull(pattern23);
        org.junit.Assert.assertEquals(pattern23.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + endLineType43 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType43.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\205" + "'", str44, "\205");
        org.junit.Assert.assertNotNull(pattern45);
        org.junit.Assert.assertEquals(pattern45.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        java.lang.String str4 = csvbangThreadPoolExecutor1.toString();
        java.util.concurrent.BlockingQueue<java.lang.Runnable> runnableQueue5 = csvbangThreadPoolExecutor1.getQueue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(runnableQueue5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream3 = null;
        csvFileWrapper2.setOutputStream(fileOutputStream3);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext5 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration0, csvFileWrapper2, csvFileContext5);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration7.maxFileSize = ' ';
        java.lang.String str10 = csvBangConfiguration7.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType11 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str12 = endLineType11.toString();
        java.util.regex.Pattern pattern13 = endLineType11.getPattern();
        csvBangConfiguration7.patternCommentCharacter = pattern13;
        csvBangConfiguration7.footer = "";
        csvBangConfiguration7.startComment = "";
        csvBangConfiguration7.maxFileSize = 100L;
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.lecogiteur.csvbang.file.FileReadyForWritingCsvFileState fileReadyForWritingCsvFileState22 = new com.github.lecogiteur.csvbang.file.FileReadyForWritingCsvFileState(csvFileWrapper2, csvBangConfiguration7, csvFileContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + endLineType11 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType11.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\205" + "'", str12, "\205");
        org.junit.Assert.assertNotNull(pattern13);
        org.junit.Assert.assertEquals(pattern13.toString(), "\\Q\205\\E");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream3 = csvFileWrapper2.getOutPutStream();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext4 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState5 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration0, csvFileWrapper2, csvFileContext4);
        csvBangConfiguration0.isAppendToFile = true;
        org.junit.Assert.assertNull(fileOutputStream3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT tYPE_FORMAT0 = com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.DEFAULT;
        org.junit.Assert.assertTrue("'" + tYPE_FORMAT0 + "' != '" + com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.DEFAULT + "'", tYPE_FORMAT0.equals(com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.DEFAULT));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.github.lecogiteur.csvbang.util.EndLineType endLineType0 = com.github.lecogiteur.csvbang.util.EndLineType.LINE_SEPARATOR;
        org.junit.Assert.assertTrue("'" + endLineType0 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.LINE_SEPARATOR + "'", endLineType0.equals(com.github.lecogiteur.csvbang.util.EndLineType.LINE_SEPARATOR));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.github.lecogiteur.csvbang.annotation.CsvComment.DIRECTION dIRECTION0 = com.github.lecogiteur.csvbang.annotation.CsvComment.DIRECTION.AFTER_RECORD;
        org.junit.Assert.assertTrue("'" + dIRECTION0 + "' != '" + com.github.lecogiteur.csvbang.annotation.CsvComment.DIRECTION.AFTER_RECORD + "'", dIRECTION0.equals(com.github.lecogiteur.csvbang.annotation.CsvComment.DIRECTION.AFTER_RECORD));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        java.util.concurrent.Callable<java.lang.Void> voidCallable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            csvbangThreadPoolExecutor1.submit((java.lang.Integer) 100, voidCallable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.file.FileName fileName4 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper6 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream7 = csvFileWrapper6.getOutPutStream();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration8 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration8.maxFileSize = ' ';
        java.lang.String str11 = csvBangConfiguration8.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType12 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str13 = endLineType12.toString();
        java.util.regex.Pattern pattern14 = endLineType12.getPattern();
        csvBangConfiguration8.patternCommentCharacter = pattern14;
        java.lang.String str16 = csvBangConfiguration8.header;
        com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool oneByOneCsvFilePool17 = new com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool(csvBangConfiguration0, fileName4, (java.lang.Object) fileOutputStream7, (java.lang.Object) str16);
        java.util.Collection<com.github.lecogiteur.csvbang.file.CsvFileContext> csvFileContextCollection18 = oneByOneCsvFilePool17.getAllFiles();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(fileOutputStream7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + endLineType12 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType12.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\205" + "'", str13, "\205");
        org.junit.Assert.assertNotNull(pattern14);
        org.junit.Assert.assertEquals(pattern14.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(csvFileContextCollection18);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        int int4 = csvbangThreadPoolExecutor1.getPoolSize();
        java.lang.Runnable runnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            csvbangThreadPoolExecutor1.execute(runnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.github.lecogiteur.csvbang.factory.FactoryCsvWriter factoryCsvWriter1 = new com.github.lecogiteur.csvbang.factory.FactoryCsvWriter("");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        long long3 = csvBangConfiguration0.maxRecordByFile;
        csvBangConfiguration0.maxFileSize = (byte) 1;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.lang.String str0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_DELIMITER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "," + "'", str0, ",");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.github.lecogiteur.csvbang.formatter.DateCsvFormatter dateCsvFormatter0 = new com.github.lecogiteur.csvbang.formatter.DateCsvFormatter();
        dateCsvFormatter0.init();
        java.util.Locale locale2 = null;
        dateCsvFormatter0.setLocal(locale2);
        dateCsvFormatter0.init();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration7.maxFileSize = ' ';
        java.lang.String str10 = csvBangConfiguration7.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType11 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str12 = endLineType11.toString();
        java.util.regex.Pattern pattern13 = endLineType11.getPattern();
        csvBangConfiguration7.patternCommentCharacter = pattern13;
        csvBangConfiguration7.quote = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState17 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + endLineType11 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType11.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\205" + "'", str12, "\205");
        org.junit.Assert.assertNotNull(pattern13);
        org.junit.Assert.assertEquals(pattern13.toString(), "\\Q\205\\E");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.FileName fileName1 = null;
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool4 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration0, fileName1, (java.lang.Object) true, (java.lang.Object) (byte) 0);
        java.util.Collection<com.github.lecogiteur.csvbang.file.CsvFileContext> csvFileContextCollection5 = multiCsvFilePool4.getAllFiles();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration6 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration6.maxFileSize = ' ';
        java.lang.String str9 = csvBangConfiguration6.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType10 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str11 = endLineType10.toString();
        java.util.regex.Pattern pattern12 = endLineType10.getPattern();
        csvBangConfiguration6.patternCommentCharacter = pattern12;
        csvBangConfiguration6.quote = ' ';
        multiCsvFilePool4.setCustomHeader((java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(csvFileContextCollection5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + endLineType10 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType10.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\205" + "'", str11, "\205");
        org.junit.Assert.assertNotNull(pattern12);
        org.junit.Assert.assertEquals(pattern12.toString(), "\\Q\205\\E");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        char char0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_QUOTE_ESCAPE_CHARACTER;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\\' + "'", char0 == '\\');
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        java.lang.String str4 = csvbangThreadPoolExecutor1.toString();
        // The following exception was thrown during execution in test generation
        try {
            csvbangThreadPoolExecutor1.setMaximumPoolSize((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.github.lecogiteur.csvbang.formatter.Default default0 = new com.github.lecogiteur.csvbang.formatter.Default();
        com.github.lecogiteur.csvbang.util.Comment comment1 = new com.github.lecogiteur.csvbang.util.Comment();
        java.lang.String str3 = default0.format((java.lang.Object) comment1, "\205");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] csvFieldConfigurationArray1 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] {};
        java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration> csvFieldConfigurationList2 = new java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>) csvFieldConfigurationList2, csvFieldConfigurationArray1);
        csvBangConfiguration0.fields = csvFieldConfigurationList2;
        com.github.lecogiteur.csvbang.util.Comment comment5 = new com.github.lecogiteur.csvbang.util.Comment((java.lang.Object) csvBangConfiguration0);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper6 = null;
        java.lang.Throwable throwable7 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException8 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable7);
        java.lang.Throwable[] throwableArray9 = csvBangException8.getSuppressed();
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException10 = new com.github.lecogiteur.csvbang.exception.CsvBangException((java.lang.Throwable) csvBangException8);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration11 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration11.maxFileSize = ' ';
        java.lang.String str14 = csvBangConfiguration11.footer;
        csvBangConfiguration11.endRecord = "";
        java.nio.charset.Charset charset17 = null;
        csvBangConfiguration11.charset = charset17;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType19 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str20 = endLineType19.toString();
        java.util.regex.Pattern pattern21 = endLineType19.getPattern();
        csvBangConfiguration11.patternCommentCharacter = pattern21;
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext23 = new com.github.lecogiteur.csvbang.file.CsvFileContext(csvBangConfiguration0, csvFileWrapper6, (java.lang.Object) csvBangException8, (java.lang.Object) csvBangConfiguration11);
        csvBangConfiguration0.startComment = "\205";
        org.junit.Assert.assertNotNull(csvFieldConfigurationArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + endLineType19 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType19.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\205" + "'", str20, "\205");
        org.junit.Assert.assertNotNull(pattern21);
        org.junit.Assert.assertEquals(pattern21.toString(), "\\Q\205\\E");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        int int4 = csvbangThreadPoolExecutor1.getPoolSize();
        java.util.List<java.lang.Runnable> runnableList5 = csvbangThreadPoolExecutor1.shutdownNow();
        boolean boolean6 = csvbangThreadPoolExecutor1.isShutdown();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(runnableList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        java.lang.String str0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_FILE_NAME_DATE_PATTERN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyyMMdd" + "'", str0, "yyyyMMdd");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<?> wildcardFuture3 = csvbangThreadPoolExecutor1.submit(runnable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream3 = null;
        csvFileWrapper2.setOutputStream(fileOutputStream3);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext5 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration0, csvFileWrapper2, csvFileContext5);
        com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter numberCsvFormatter7 = new com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter();
        fileToOpenForWritingCsvFileState6.close((java.lang.Object) numberCsvFormatter7);
        java.util.Locale locale9 = null;
        numberCsvFormatter7.setLocal(locale9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.FileName fileName1 = null;
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool4 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration0, fileName1, (java.lang.Object) true, (java.lang.Object) (byte) 0);
        java.util.Collection<com.github.lecogiteur.csvbang.file.CsvFileContext> csvFileContextCollection5 = multiCsvFilePool4.getAllFiles();
        java.util.Collection<com.github.lecogiteur.csvbang.file.CsvFileContext> csvFileContextCollection6 = multiCsvFilePool4.getAllFiles();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.lecogiteur.csvbang.writer.SimpleCsvWriter<com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor> csvbangThreadPoolExecutorSimpleCsvWriter8 = new com.github.lecogiteur.csvbang.writer.SimpleCsvWriter<com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor>((com.github.lecogiteur.csvbang.pool.CsvFilePool) multiCsvFilePool4, csvBangConfiguration7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvFileContextCollection5);
        org.junit.Assert.assertNotNull(csvFileContextCollection6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.util.Collection<java.lang.Class<?>> wildcardClassCollection1 = com.github.lecogiteur.csvbang.util.ReflectionUti.scanPackageClass("");
        org.junit.Assert.assertNull(wildcardClassCollection1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.github.lecogiteur.csvbang.factory.FactoryCsvWriter factoryCsvWriter1 = new com.github.lecogiteur.csvbang.factory.FactoryCsvWriter("com.github.lecogiteur.csvbang.exception.CsvBangException");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.github.lecogiteur.csvbang.formatter.Default default0 = new com.github.lecogiteur.csvbang.formatter.Default();
        default0.setPattern("\205");
        default0.setPattern("hi!");
        default0.setPattern("com.github.lecogiteur.csvbang.exception.CsvBangException");
        java.util.Locale locale7 = null;
        default0.setLocal(locale7);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration9 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration9.maxFileSize = ' ';
        java.lang.String str12 = csvBangConfiguration9.footer;
        csvBangConfiguration9.endRecord = "";
        java.nio.charset.Charset charset15 = null;
        csvBangConfiguration9.charset = charset15;
        java.lang.String str17 = csvBangConfiguration9.footer;
        java.lang.String str19 = default0.format((java.lang.Object) str17, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.footer = "";
        csvBangConfiguration0.startComment = "";
        csvBangConfiguration0.maxFileSize = 100L;
        boolean boolean14 = csvBangConfiguration0.isAppendToFile;
        boolean boolean15 = csvBangConfiguration0.noEndRecordOnLastRecord;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.util.concurrent.BlockingQueue<java.lang.Runnable> runnableQueue2 = csvbangThreadPoolExecutor1.getQueue();
        boolean boolean3 = csvbangThreadPoolExecutor1.isTerminated();
        org.junit.Assert.assertNotNull(runnableQueue2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.github.lecogiteur.csvbang.exception.CsvBangCloseException csvBangCloseException1 = new com.github.lecogiteur.csvbang.exception.CsvBangCloseException((int) (short) 100);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        int int0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_FIELD_POSITION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] csvFieldConfigurationArray1 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] {};
        java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration> csvFieldConfigurationList2 = new java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>) csvFieldConfigurationList2, csvFieldConfigurationArray1);
        csvBangConfiguration0.fields = csvFieldConfigurationList2;
        boolean boolean5 = com.github.lecogiteur.csvbang.util.CsvbangUti.isCollectionNotEmpty((java.util.Collection<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>) csvFieldConfigurationList2);
        boolean boolean6 = com.github.lecogiteur.csvbang.util.CsvbangUti.isCollectionNotEmpty((java.util.Collection<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>) csvFieldConfigurationList2);
        boolean boolean7 = com.github.lecogiteur.csvbang.util.CsvbangUti.isCollectionNotEmpty((java.util.Collection<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>) csvFieldConfigurationList2);
        org.junit.Assert.assertNotNull(csvFieldConfigurationArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.lang.Throwable throwable1 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException2 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable1);
        java.lang.Throwable[] throwableArray3 = csvBangException2.getSuppressed();
        com.github.lecogiteur.csvbang.exception.CsvBangIOException csvBangIOException4 = new com.github.lecogiteur.csvbang.exception.CsvBangIOException("hi!", (java.lang.Throwable) csvBangException2);
        java.lang.String str5 = csvBangException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.github.lecogiteur.csvbang.exception.CsvBangException" + "'", str5, "com.github.lecogiteur.csvbang.exception.CsvBangException");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream3 = null;
        csvFileWrapper2.setOutputStream(fileOutputStream3);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext5 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration0, csvFileWrapper2, csvFileContext5);
        com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter numberCsvFormatter7 = new com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter();
        fileToOpenForWritingCsvFileState6.close((java.lang.Object) numberCsvFormatter7);
        numberCsvFormatter7.setPattern("");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.footer = "";
        com.github.lecogiteur.csvbang.util.EndLineType endLineType10 = csvBangConfiguration0.defaultEndLineCharacter;
        csvBangConfiguration0.maxFile = 32L;
        csvBangConfiguration0.startComment = "hi!";
        csvBangConfiguration0.maxFile = (short) 10;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + endLineType10 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED + "'", endLineType10.equals(com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.github.lecogiteur.csvbang.util.EndLineType endLineType0 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.util.regex.Pattern pattern1 = endLineType0.getPattern();
        org.junit.Assert.assertTrue("'" + endLineType0 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType0.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\205\\E");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        csvbangThreadPoolExecutor1.shutdown();
        java.util.List<java.lang.Runnable> runnableList3 = csvbangThreadPoolExecutor1.shutdownNow();
        java.lang.Runnable runnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<?> wildcardFuture5 = csvbangThreadPoolExecutor1.submit(runnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(runnableList3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] csvFieldConfigurationArray1 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] {};
        java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration> csvFieldConfigurationList2 = new java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>) csvFieldConfigurationList2, csvFieldConfigurationArray1);
        csvBangConfiguration0.fields = csvFieldConfigurationList2;
        com.github.lecogiteur.csvbang.util.Comment comment5 = new com.github.lecogiteur.csvbang.util.Comment((java.lang.Object) csvBangConfiguration0);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper6 = null;
        java.lang.Throwable throwable7 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException8 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable7);
        java.lang.Throwable[] throwableArray9 = csvBangException8.getSuppressed();
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException10 = new com.github.lecogiteur.csvbang.exception.CsvBangException((java.lang.Throwable) csvBangException8);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration11 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration11.maxFileSize = ' ';
        java.lang.String str14 = csvBangConfiguration11.footer;
        csvBangConfiguration11.endRecord = "";
        java.nio.charset.Charset charset17 = null;
        csvBangConfiguration11.charset = charset17;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType19 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str20 = endLineType19.toString();
        java.util.regex.Pattern pattern21 = endLineType19.getPattern();
        csvBangConfiguration11.patternCommentCharacter = pattern21;
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext23 = new com.github.lecogiteur.csvbang.file.CsvFileContext(csvBangConfiguration0, csvFileWrapper6, (java.lang.Object) csvBangException8, (java.lang.Object) csvBangConfiguration11);
        int int24 = csvBangConfiguration0.blockSize;
        org.junit.Assert.assertNotNull(csvFieldConfigurationArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + endLineType19 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType19.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\205" + "'", str20, "\205");
        org.junit.Assert.assertNotNull(pattern21);
        org.junit.Assert.assertEquals(pattern21.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter numberCsvFormatter0 = new com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter();
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str3 = csvFileWrapper2.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration4 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration4.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState7 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper2, csvBangConfiguration4);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration8 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper10 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream11 = null;
        csvFileWrapper10.setOutputStream(fileOutputStream11);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext13 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState14 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration8, csvFileWrapper10, csvFileContext13);
        java.io.File file15 = csvFileWrapper10.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext16 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState17 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration4, csvFileWrapper10, csvFileContext16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = numberCsvFormatter0.format((java.lang.Object) fileToOpenForWritingCsvFileState17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\205" + "'", str3, "\205");
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNull("file15.getParent() == null", file15.getParent());
        org.junit.Assert.assertEquals(file15.toString(), "\205");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.startRecord = "com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration17 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration17.maxFileSize = ' ';
        java.lang.String str20 = csvBangConfiguration17.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType21 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str22 = endLineType21.toString();
        java.util.regex.Pattern pattern23 = endLineType21.getPattern();
        csvBangConfiguration17.patternCommentCharacter = pattern23;
        csvBangConfiguration17.footer = "";
        fileToOpenForWritingCsvFileState16.close((java.lang.Object) csvBangConfiguration17);
        com.github.lecogiteur.csvbang.file.FileName fileName28 = null;
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration29 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration29.maxFileSize = ' ';
        java.lang.String str32 = csvBangConfiguration29.footer;
        csvBangConfiguration29.endRecord = "";
        java.nio.charset.Charset charset35 = null;
        csvBangConfiguration29.charset = charset35;
        java.lang.String str37 = csvBangConfiguration29.footer;
        csvBangConfiguration29.init();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration39 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration39.maxFileSize = ' ';
        java.lang.String str42 = csvBangConfiguration39.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType43 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str44 = endLineType43.toString();
        java.util.regex.Pattern pattern45 = endLineType43.getPattern();
        csvBangConfiguration39.patternCommentCharacter = pattern45;
        csvBangConfiguration39.footer = "";
        csvBangConfiguration39.startComment = "";
        csvBangConfiguration39.maxFileSize = 100L;
        com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool oneByOneCsvFilePool53 = new com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool(csvBangConfiguration17, fileName28, (java.lang.Object) csvBangConfiguration29, (java.lang.Object) csvBangConfiguration39);
        csvBangConfiguration29.startRecord = ",";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + endLineType21 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType21.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\205" + "'", str22, "\205");
        org.junit.Assert.assertNotNull(pattern23);
        org.junit.Assert.assertEquals(pattern23.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + endLineType43 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType43.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\205" + "'", str44, "\205");
        org.junit.Assert.assertNotNull(pattern45);
        org.junit.Assert.assertEquals(pattern45.toString(), "\\Q\205\\E");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.isAppendToFile = true;
        com.github.lecogiteur.csvbang.pool.CsvFilePool csvFilePool13 = com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory.createPool(csvBangConfiguration0, "hi!", (java.lang.Object) 10L, (java.lang.Object) (-1));
        csvBangConfiguration0.maxFile = (short) 0;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNotNull(csvFilePool13);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.github.lecogiteur.csvbang.formatter.Default default0 = new com.github.lecogiteur.csvbang.formatter.Default();
        default0.setPattern("\205");
        default0.setPattern("hi!");
        default0.setPattern("com.github.lecogiteur.csvbang.exception.CsvBangException");
        java.util.Locale locale7 = null;
        default0.setLocal(locale7);
        default0.setPattern("com.github.lecogiteur.csvbang.exception.CsvBangException");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            csvbangThreadPoolExecutor1.setKeepAliveTime((long) 10, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper18 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str19 = csvFileWrapper18.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration20 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration20.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState23 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper18, csvBangConfiguration20);
        fileToOpenForWritingCsvFileState16.close((java.lang.Object) fileToCloseForWritingCsvFileState23);
        boolean boolean25 = fileToCloseForWritingCsvFileState23.isOpen();
        boolean boolean26 = fileToCloseForWritingCsvFileState23.isOpen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\205" + "'", str19, "\205");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.FileName fileName1 = null;
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool4 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration0, fileName1, (java.lang.Object) true, (java.lang.Object) (byte) 0);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration5 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration5.maxFileSize = ' ';
        java.lang.String str8 = csvBangConfiguration5.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType9 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str10 = endLineType9.toString();
        java.util.regex.Pattern pattern11 = endLineType9.getPattern();
        csvBangConfiguration5.patternCommentCharacter = pattern11;
        java.lang.String str13 = csvBangConfiguration5.header;
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection14 = csvBangConfiguration5.commentsAfter;
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection15 = csvBangConfiguration5.commentsBefore;
        multiCsvFilePool4.setCustomFooter((java.lang.Object) annotatedElementCollection15);
        // The following exception was thrown during execution in test generation
        try {
            com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext19 = multiCsvFilePool4.getFile((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + endLineType9 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType9.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\205" + "'", str10, "\205");
        org.junit.Assert.assertNotNull(pattern11);
        org.junit.Assert.assertEquals(pattern11.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(annotatedElementCollection14);
        org.junit.Assert.assertNull(annotatedElementCollection15);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException2 = new com.github.lecogiteur.csvbang.exception.CsvBangException("hi!");
        com.github.lecogiteur.csvbang.exception.CsvBangIOException csvBangIOException3 = new com.github.lecogiteur.csvbang.exception.CsvBangIOException("", (java.lang.Throwable) csvBangException2);
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException6 = new com.github.lecogiteur.csvbang.exception.CsvBangException("hi!");
        com.github.lecogiteur.csvbang.exception.CsvBangIOException csvBangIOException7 = new com.github.lecogiteur.csvbang.exception.CsvBangIOException("", (java.lang.Throwable) csvBangException6);
        csvBangException2.addSuppressed((java.lang.Throwable) csvBangIOException7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.lang.annotation.Annotation[] annotationArray0 = new java.lang.annotation.Annotation[] {};
        com.github.lecogiteur.csvbang.annotation.CsvFormat csvFormat1 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvFormatAnnotation(annotationArray0);
        com.github.lecogiteur.csvbang.annotation.CsvType csvType2 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvTypeAnnotation(annotationArray0);
        org.junit.Assert.assertNotNull(annotationArray0);
        org.junit.Assert.assertNull(csvFormat1);
        org.junit.Assert.assertNull(csvType2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.quote = ' ';
        csvBangConfiguration0.fileDatePattern = "com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.github.lecogiteur.csvbang.factory.FactoryCsvWriter factoryCsvWriter0 = new com.github.lecogiteur.csvbang.factory.FactoryCsvWriter();
        factoryCsvWriter0.setNumberOfWriterThread(1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean5 = csvbangThreadPoolExecutor1.awaitGroupTermination((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.isAppendToFile = true;
        com.github.lecogiteur.csvbang.pool.CsvFilePool csvFilePool13 = com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory.createPool(csvBangConfiguration0, "hi!", (java.lang.Object) 10L, (java.lang.Object) (-1));
        char char14 = csvBangConfiguration0.commentCharacter;
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection15 = csvBangConfiguration0.commentsAfter;
        csvBangConfiguration0.commentCharacter = ' ';
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection18 = csvBangConfiguration0.commentsAfter;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNotNull(csvFilePool13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '#' + "'", char14 == '#');
        org.junit.Assert.assertNull(annotatedElementCollection15);
        org.junit.Assert.assertNull(annotatedElementCollection18);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.footer = "";
        csvBangConfiguration0.startComment = "";
        java.lang.String str12 = csvBangConfiguration0.startComment;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.github.lecogiteur.csvbang.formatter.Default default0 = new com.github.lecogiteur.csvbang.formatter.Default();
        default0.setPattern("\205");
        default0.init();
        default0.init();
        com.github.lecogiteur.csvbang.util.ReflectionUti reflectionUti5 = new com.github.lecogiteur.csvbang.util.ReflectionUti();
        java.lang.String str7 = default0.format((java.lang.Object) reflectionUti5, "");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        java.lang.String str3 = csvFileWrapper1.getFileName();
        java.io.FileOutputStream fileOutputStream4 = null;
        csvFileWrapper1.setOutputStream(fileOutputStream4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\205" + "'", str3, "\205");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.util.concurrent.BlockingQueue<java.lang.Runnable> runnableQueue2 = csvbangThreadPoolExecutor1.getQueue();
        boolean boolean3 = csvbangThreadPoolExecutor1.isShutdown();
        org.junit.Assert.assertNotNull(runnableQueue2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.lang.annotation.Annotation annotation0 = null;
        java.lang.annotation.Annotation[] annotationArray1 = new java.lang.annotation.Annotation[] { annotation0 };
        com.github.lecogiteur.csvbang.annotation.CsvFooter csvFooter2 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvFooterAnnotation(annotationArray1);
        com.github.lecogiteur.csvbang.annotation.CsvHeader csvHeader3 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvHeaderAnnotation(annotationArray1);
        com.github.lecogiteur.csvbang.annotation.CsvType csvType4 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvTypeAnnotation(annotationArray1);
        org.junit.Assert.assertNotNull(annotationArray1);
        org.junit.Assert.assertNull(csvFooter2);
        org.junit.Assert.assertNull(csvHeader3);
        org.junit.Assert.assertNull(csvType4);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.github.lecogiteur.csvbang.formatter.BooleanCsvFormatter booleanCsvFormatter0 = new com.github.lecogiteur.csvbang.formatter.BooleanCsvFormatter();
        booleanCsvFormatter0.init();
        booleanCsvFormatter0.init();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        csvBangConfiguration0.endRecord = "";
        java.nio.charset.Charset charset6 = null;
        csvBangConfiguration0.charset = charset6;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType8 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str9 = endLineType8.toString();
        java.util.regex.Pattern pattern10 = endLineType8.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern10;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType12 = csvBangConfiguration0.defaultEndLineCharacter;
        com.github.lecogiteur.csvbang.file.FileName fileName13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration15 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration15.maxFileSize = ' ';
        java.lang.String str18 = csvBangConfiguration15.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType19 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str20 = endLineType19.toString();
        java.util.regex.Pattern pattern21 = endLineType19.getPattern();
        csvBangConfiguration15.patternCommentCharacter = pattern21;
        csvBangConfiguration15.quote = ' ';
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool25 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration0, fileName13, obj14, (java.lang.Object) csvBangConfiguration15);
        java.lang.Character char26 = csvBangConfiguration0.quote;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType8 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType8.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\205" + "'", str9, "\205");
        org.junit.Assert.assertNotNull(pattern10);
        org.junit.Assert.assertEquals(pattern10.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + endLineType12 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED + "'", endLineType12.equals(com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + endLineType19 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType19.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\205" + "'", str20, "\205");
        org.junit.Assert.assertNotNull(pattern21);
        org.junit.Assert.assertEquals(pattern21.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(char26);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.FileName fileName1 = null;
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration2 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper4 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream5 = null;
        csvFileWrapper4.setOutputStream(fileOutputStream5);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext7 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState8 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration2, csvFileWrapper4, csvFileContext7);
        com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter numberCsvFormatter9 = new com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter();
        fileToOpenForWritingCsvFileState8.close((java.lang.Object) numberCsvFormatter9);
        com.github.lecogiteur.csvbang.util.EndLineType endLineType11 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        char[] charArray12 = endLineType11.getCharacters();
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool13 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration0, fileName1, (java.lang.Object) fileToOpenForWritingCsvFileState8, (java.lang.Object) charArray12);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration14 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration14.maxFileSize = ' ';
        java.lang.String str17 = csvBangConfiguration14.footer;
        csvBangConfiguration14.endRecord = "";
        java.lang.String str20 = csvBangConfiguration14.endRecord;
        // The following exception was thrown during execution in test generation
        try {
            com.github.lecogiteur.csvbang.writer.BlockCsvWriter<java.text.SimpleDateFormat> simpleDateFormatBlockCsvWriter21 = new com.github.lecogiteur.csvbang.writer.BlockCsvWriter<java.text.SimpleDateFormat>((com.github.lecogiteur.csvbang.pool.CsvFilePool) multiCsvFilePool13, csvBangConfiguration14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + endLineType11 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType11.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\205");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\205");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\205]");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.github.lecogiteur.csvbang.exception.CsvBangIOException csvBangIOException1 = new com.github.lecogiteur.csvbang.exception.CsvBangIOException("");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.isAppendToFile = true;
        com.github.lecogiteur.csvbang.pool.CsvFilePool csvFilePool13 = com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory.createPool(csvBangConfiguration0, "hi!", (java.lang.Object) 10L, (java.lang.Object) (-1));
        char char14 = csvBangConfiguration0.commentCharacter;
        com.github.lecogiteur.csvbang.util.Comment comment15 = new com.github.lecogiteur.csvbang.util.Comment((java.lang.Object) csvBangConfiguration0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNotNull(csvFilePool13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '#' + "'", char14 == '#');
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        boolean boolean5 = csvbangThreadPoolExecutor1.allowsCoreThreadTimeOut();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        long long5 = csvbangThreadPoolExecutor1.getTaskCount();
        java.lang.Runnable runnable6 = null;
        boolean boolean7 = csvbangThreadPoolExecutor1.remove(runnable6);
        int int8 = csvbangThreadPoolExecutor1.getLargestPoolSize();
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor10 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable11 = null;
        boolean boolean12 = csvbangThreadPoolExecutor10.remove(runnable11);
        boolean boolean13 = csvbangThreadPoolExecutor10.isTerminated();
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor15 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.util.concurrent.ThreadFactory threadFactory16 = csvbangThreadPoolExecutor15.getThreadFactory();
        csvbangThreadPoolExecutor10.setThreadFactory(threadFactory16);
        csvbangThreadPoolExecutor1.setThreadFactory(threadFactory16);
        csvbangThreadPoolExecutor1.shutdown();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(threadFactory16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.footer = "";
        long long10 = csvBangConfiguration0.maxRecordByFile;
        boolean boolean11 = csvBangConfiguration0.isFileByFile;
        boolean boolean12 = csvBangConfiguration0.isFileByFile;
        csvBangConfiguration0.maxFileSize = (byte) 0;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        csvBangConfiguration0.endRecord = "";
        java.nio.charset.Charset charset6 = null;
        csvBangConfiguration0.charset = charset6;
        java.lang.String str8 = csvBangConfiguration0.footer;
        java.lang.String str9 = csvBangConfiguration0.startRecord;
        csvBangConfiguration0.maxFile = '\\';
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.isAppendToFile = true;
        com.github.lecogiteur.csvbang.pool.CsvFilePool csvFilePool13 = com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory.createPool(csvBangConfiguration0, "hi!", (java.lang.Object) 10L, (java.lang.Object) (-1));
        csvBangConfiguration0.delimiter = "";
        boolean boolean16 = csvBangConfiguration0.isAsynchronousWrite;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNotNull(csvFilePool13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.lang.annotation.Annotation annotation0 = null;
        java.lang.annotation.Annotation[] annotationArray1 = new java.lang.annotation.Annotation[] { annotation0 };
        com.github.lecogiteur.csvbang.annotation.CsvHeader csvHeader2 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvHeaderAnnotation(annotationArray1);
        com.github.lecogiteur.csvbang.annotation.CsvFile csvFile3 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvFileAnnotation(annotationArray1);
        com.github.lecogiteur.csvbang.annotation.CsvHeader csvHeader4 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvHeaderAnnotation(annotationArray1);
        com.github.lecogiteur.csvbang.annotation.CsvFooter csvFooter5 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvFooterAnnotation(annotationArray1);
        com.github.lecogiteur.csvbang.annotation.CsvComment csvComment6 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvCommentAnnotation(annotationArray1);
        org.junit.Assert.assertNotNull(annotationArray1);
        org.junit.Assert.assertNull(csvHeader2);
        org.junit.Assert.assertNull(csvFile3);
        org.junit.Assert.assertNull(csvHeader4);
        org.junit.Assert.assertNull(csvFooter5);
        org.junit.Assert.assertNull(csvComment6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        java.lang.String str4 = csvbangThreadPoolExecutor1.toString();
        java.util.concurrent.Callable<java.lang.Void> voidCallable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            csvbangThreadPoolExecutor1.submit((java.lang.Integer) (-1), voidCallable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] csvFieldConfigurationArray1 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] {};
        java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration> csvFieldConfigurationList2 = new java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>) csvFieldConfigurationList2, csvFieldConfigurationArray1);
        csvBangConfiguration0.fields = csvFieldConfigurationList2;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType5 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str6 = endLineType5.toString();
        csvBangConfiguration0.defaultEndLineCharacter = endLineType5;
        java.nio.charset.Charset charset8 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_CHARSET;
        byte[] byteArray9 = endLineType5.toBytes(charset8);
        org.junit.Assert.assertNotNull(csvFieldConfigurationArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + endLineType5 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType5.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\205" + "'", str6, "\205");
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-62, -123]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration2 = null;
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] csvFieldConfigurationArray4 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] {};
        java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration> csvFieldConfigurationList5 = new java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>) csvFieldConfigurationList5, csvFieldConfigurationArray4);
        csvBangConfiguration3.fields = csvFieldConfigurationList5;
        com.github.lecogiteur.csvbang.util.Comment comment8 = new com.github.lecogiteur.csvbang.util.Comment((java.lang.Object) csvBangConfiguration3);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = null;
        java.lang.Throwable throwable10 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException11 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable10);
        java.lang.Throwable[] throwableArray12 = csvBangException11.getSuppressed();
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException13 = new com.github.lecogiteur.csvbang.exception.CsvBangException((java.lang.Throwable) csvBangException11);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration14 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration14.maxFileSize = ' ';
        java.lang.String str17 = csvBangConfiguration14.footer;
        csvBangConfiguration14.endRecord = "";
        java.nio.charset.Charset charset20 = null;
        csvBangConfiguration14.charset = charset20;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType22 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str23 = endLineType22.toString();
        java.util.regex.Pattern pattern24 = endLineType22.getPattern();
        csvBangConfiguration14.patternCommentCharacter = pattern24;
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext26 = new com.github.lecogiteur.csvbang.file.CsvFileContext(csvBangConfiguration3, csvFileWrapper9, (java.lang.Object) csvBangException11, (java.lang.Object) csvBangConfiguration14);
        // The following exception was thrown during execution in test generation
        try {
            com.github.lecogiteur.csvbang.file.FileReadyForWritingCsvFileState fileReadyForWritingCsvFileState27 = new com.github.lecogiteur.csvbang.file.FileReadyForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration2, csvFileContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvFieldConfigurationArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + endLineType22 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType22.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\205" + "'", str23, "\205");
        org.junit.Assert.assertNotNull(pattern24);
        org.junit.Assert.assertEquals(pattern24.toString(), "\\Q\205\\E");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        csvbangThreadPoolExecutor1.shutdown();
        java.lang.Runnable runnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<?> wildcardFuture4 = csvbangThreadPoolExecutor1.submit(runnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration17 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration17.maxFileSize = ' ';
        java.lang.String str20 = csvBangConfiguration17.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType21 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str22 = endLineType21.toString();
        java.util.regex.Pattern pattern23 = endLineType21.getPattern();
        csvBangConfiguration17.patternCommentCharacter = pattern23;
        csvBangConfiguration17.footer = "";
        fileToOpenForWritingCsvFileState16.close((java.lang.Object) csvBangConfiguration17);
        boolean boolean28 = fileToOpenForWritingCsvFileState16.isOpen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + endLineType21 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType21.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\205" + "'", str22, "\205");
        org.junit.Assert.assertNotNull(pattern23);
        org.junit.Assert.assertEquals(pattern23.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.github.lecogiteur.csvbang.formatter.Default default0 = new com.github.lecogiteur.csvbang.formatter.Default();
        default0.setPattern("\205");
        default0.setPattern("hi!");
        default0.setPattern("com.github.lecogiteur.csvbang.exception.CsvBangException");
        default0.init();
        java.util.Locale locale8 = null;
        default0.setLocal(locale8);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        long long5 = csvbangThreadPoolExecutor1.getTaskCount();
        java.lang.Runnable runnable6 = null;
        boolean boolean7 = csvbangThreadPoolExecutor1.remove(runnable6);
        csvbangThreadPoolExecutor1.shutdown();
        java.util.List<java.lang.Runnable> runnableList9 = csvbangThreadPoolExecutor1.shutdownNow();
        boolean boolean10 = csvbangThreadPoolExecutor1.isTerminated();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(runnableList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.isAppendToFile = true;
        com.github.lecogiteur.csvbang.pool.CsvFilePool csvFilePool13 = com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory.createPool(csvBangConfiguration0, "hi!", (java.lang.Object) 10L, (java.lang.Object) (-1));
        csvBangConfiguration0.isAsynchronousWrite = false;
        boolean boolean16 = csvBangConfiguration0.isFileByFile;
        char char17 = csvBangConfiguration0.commentCharacter;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNotNull(csvFilePool13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '#' + "'", char17 == '#');
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT tYPE_FORMAT0 = com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.NO_CARRIAGE_RETURN;
        java.lang.Class<?> wildcardClass1 = tYPE_FORMAT0.getClass();
        org.junit.Assert.assertTrue("'" + tYPE_FORMAT0 + "' != '" + com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.NO_CARRIAGE_RETURN + "'", tYPE_FORMAT0.equals(com.github.lecogiteur.csvbang.annotation.CsvFormat.TYPE_FORMAT.NO_CARRIAGE_RETURN));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        int int4 = csvbangThreadPoolExecutor1.getPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            csvbangThreadPoolExecutor1.setCorePoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        long long5 = csvbangThreadPoolExecutor1.getTaskCount();
        boolean boolean6 = csvbangThreadPoolExecutor1.isTerminated();
        // The following exception was thrown during execution in test generation
        try {
            csvbangThreadPoolExecutor1.setMaximumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        csvbangThreadPoolExecutor1.shutdown();
        csvbangThreadPoolExecutor1.purge();
        java.lang.Runnable runnable4 = null;
        boolean boolean5 = csvbangThreadPoolExecutor1.remove(runnable4);
        // The following exception was thrown during execution in test generation
        try {
            csvbangThreadPoolExecutor1.setMaximumPoolSize(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        java.lang.String str8 = csvBangConfiguration0.header;
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection9 = csvBangConfiguration0.commentsAfter;
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection10 = csvBangConfiguration0.commentsBefore;
        com.github.lecogiteur.csvbang.file.FileName fileName11 = null;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType12 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str13 = endLineType12.toString();
        java.util.regex.Pattern pattern14 = endLineType12.getPattern();
        com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool oneByOneCsvFilePool16 = new com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool(csvBangConfiguration0, fileName11, (java.lang.Object) endLineType12, (java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext19 = oneByOneCsvFilePool16.getFile((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type com.github.lecogiteur.csvbang.exception.CsvBangException; message: No file available in pool for update. The maximum number files [-1] has been already created and are full.");
        } catch (com.github.lecogiteur.csvbang.exception.CsvBangException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(annotatedElementCollection9);
        org.junit.Assert.assertNull(annotatedElementCollection10);
        org.junit.Assert.assertTrue("'" + endLineType12 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType12.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\205" + "'", str13, "\205");
        org.junit.Assert.assertNotNull(pattern14);
        org.junit.Assert.assertEquals(pattern14.toString(), "\\Q\205\\E");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream3 = null;
        csvFileWrapper2.setOutputStream(fileOutputStream3);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext5 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration0, csvFileWrapper2, csvFileContext5);
        com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter numberCsvFormatter7 = new com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter();
        fileToOpenForWritingCsvFileState6.close((java.lang.Object) numberCsvFormatter7);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper10 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str11 = csvFileWrapper10.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration12 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration12.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState15 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper10, csvBangConfiguration12);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration16 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper18 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream19 = null;
        csvFileWrapper18.setOutputStream(fileOutputStream19);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext21 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState22 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration16, csvFileWrapper18, csvFileContext21);
        java.io.File file23 = csvFileWrapper18.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext24 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState25 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration12, csvFileWrapper18, csvFileContext24);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper27 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str28 = csvFileWrapper27.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration29 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration29.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState32 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper27, csvBangConfiguration29);
        fileToOpenForWritingCsvFileState25.close((java.lang.Object) fileToCloseForWritingCsvFileState32);
        // The following exception was thrown during execution in test generation
        try {
            fileToOpenForWritingCsvFileState6.write((java.lang.Object) fileToCloseForWritingCsvFileState32, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\205" + "'", str11, "\205");
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertNull("file23.getParent() == null", file23.getParent());
        org.junit.Assert.assertEquals(file23.toString(), "\205");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\205" + "'", str28, "\205");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream3 = null;
        csvFileWrapper2.setOutputStream(fileOutputStream3);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext5 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration0, csvFileWrapper2, csvFileContext5);
        java.io.File file7 = csvFileWrapper2.getFile();
        java.io.FileOutputStream fileOutputStream8 = csvFileWrapper2.getOutPutStream();
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "\205");
        org.junit.Assert.assertNull(fileOutputStream8);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration17 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration17.maxFileSize = ' ';
        java.lang.String str20 = csvBangConfiguration17.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType21 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str22 = endLineType21.toString();
        java.util.regex.Pattern pattern23 = endLineType21.getPattern();
        csvBangConfiguration17.patternCommentCharacter = pattern23;
        csvBangConfiguration17.footer = "";
        fileToOpenForWritingCsvFileState16.close((java.lang.Object) csvBangConfiguration17);
        com.github.lecogiteur.csvbang.file.FileName fileName28 = null;
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration29 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration29.maxFileSize = ' ';
        java.lang.String str32 = csvBangConfiguration29.footer;
        csvBangConfiguration29.endRecord = "";
        java.nio.charset.Charset charset35 = null;
        csvBangConfiguration29.charset = charset35;
        java.lang.String str37 = csvBangConfiguration29.footer;
        csvBangConfiguration29.init();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration39 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration39.maxFileSize = ' ';
        java.lang.String str42 = csvBangConfiguration39.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType43 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str44 = endLineType43.toString();
        java.util.regex.Pattern pattern45 = endLineType43.getPattern();
        csvBangConfiguration39.patternCommentCharacter = pattern45;
        csvBangConfiguration39.footer = "";
        csvBangConfiguration39.startComment = "";
        csvBangConfiguration39.maxFileSize = 100L;
        com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool oneByOneCsvFilePool53 = new com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool(csvBangConfiguration17, fileName28, (java.lang.Object) csvBangConfiguration29, (java.lang.Object) csvBangConfiguration39);
        com.github.lecogiteur.csvbang.formatter.Default default54 = new com.github.lecogiteur.csvbang.formatter.Default();
        default54.setPattern("\205");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration57 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration57.maxFileSize = ' ';
        java.lang.String str61 = default54.format((java.lang.Object) csvBangConfiguration57, "\205");
        // The following exception was thrown during execution in test generation
        try {
            com.github.lecogiteur.csvbang.writer.BlockCsvWriter<java.util.concurrent.ThreadFactory> threadFactoryBlockCsvWriter62 = new com.github.lecogiteur.csvbang.writer.BlockCsvWriter<java.util.concurrent.ThreadFactory>((com.github.lecogiteur.csvbang.pool.CsvFilePool) oneByOneCsvFilePool53, csvBangConfiguration57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + endLineType21 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType21.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\205" + "'", str22, "\205");
        org.junit.Assert.assertNotNull(pattern23);
        org.junit.Assert.assertEquals(pattern23.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + endLineType43 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType43.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\205" + "'", str44, "\205");
        org.junit.Assert.assertNotNull(pattern45);
        org.junit.Assert.assertEquals(pattern45.toString(), "\\Q\205\\E");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.github.lecogiteur.csvbang.formatter.DateCsvFormatter dateCsvFormatter0 = new com.github.lecogiteur.csvbang.formatter.DateCsvFormatter();
        java.util.Locale locale1 = null;
        dateCsvFormatter0.setLocal(locale1);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper4 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str5 = csvFileWrapper4.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration6 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration6.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState9 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper4, csvBangConfiguration6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateCsvFormatter0.format((java.lang.Object) fileToCloseForWritingCsvFileState9, "10");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        // The following exception was thrown during execution in test generation
        try {
            com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.lang.String str0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_END_RECORD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\n" + "'", str0, "\n");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.github.lecogiteur.csvbang.formatter.DateCsvFormatter dateCsvFormatter0 = new com.github.lecogiteur.csvbang.formatter.DateCsvFormatter();
        dateCsvFormatter0.init();
        dateCsvFormatter0.setPattern("");
        dateCsvFormatter0.setPattern("com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateCsvFormatter0.format((java.lang.Object) false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.FileName fileName1 = null;
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool4 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration0, fileName1, (java.lang.Object) true, (java.lang.Object) (byte) 0);
        java.util.Collection<com.github.lecogiteur.csvbang.file.CsvFileContext> csvFileContextCollection5 = multiCsvFilePool4.getAllFiles();
        java.util.Collection<com.github.lecogiteur.csvbang.file.CsvFileContext> csvFileContextCollection6 = multiCsvFilePool4.getAllFiles();
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor8 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable9 = null;
        boolean boolean10 = csvbangThreadPoolExecutor8.remove(runnable9);
        boolean boolean11 = csvbangThreadPoolExecutor8.isTerminated();
        long long12 = csvbangThreadPoolExecutor8.getTaskCount();
        java.lang.Runnable runnable13 = null;
        boolean boolean14 = csvbangThreadPoolExecutor8.remove(runnable13);
        int int15 = csvbangThreadPoolExecutor8.getLargestPoolSize();
        multiCsvFilePool4.setCustomFooter((java.lang.Object) int15);
        org.junit.Assert.assertNotNull(csvFileContextCollection5);
        org.junit.Assert.assertNotNull(csvFileContextCollection6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.github.lecogiteur.csvbang.factory.FactoryCsvWriter factoryCsvWriter1 = new com.github.lecogiteur.csvbang.factory.FactoryCsvWriter("com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.util.Locale locale1 = null;
        com.github.lecogiteur.csvbang.util.CsvBangDateFormat csvBangDateFormat2 = new com.github.lecogiteur.csvbang.util.CsvBangDateFormat("com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!", locale1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.github.lecogiteur.csvbang.exception.CsvBangCloseException csvBangCloseException1 = new com.github.lecogiteur.csvbang.exception.CsvBangCloseException((int) (short) -1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration17 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration17.maxFileSize = ' ';
        java.lang.String str20 = csvBangConfiguration17.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType21 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str22 = endLineType21.toString();
        java.util.regex.Pattern pattern23 = endLineType21.getPattern();
        csvBangConfiguration17.patternCommentCharacter = pattern23;
        csvBangConfiguration17.footer = "";
        fileToOpenForWritingCsvFileState16.close((java.lang.Object) csvBangConfiguration17);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration28 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration28.maxFileSize = ' ';
        java.lang.String str31 = csvBangConfiguration28.footer;
        csvBangConfiguration28.endRecord = "";
        java.nio.charset.Charset charset34 = null;
        csvBangConfiguration28.charset = charset34;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType36 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str37 = endLineType36.toString();
        java.util.regex.Pattern pattern38 = endLineType36.getPattern();
        csvBangConfiguration28.patternCommentCharacter = pattern38;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType40 = csvBangConfiguration28.defaultEndLineCharacter;
        com.github.lecogiteur.csvbang.file.FileName fileName41 = null;
        java.lang.Object obj42 = new java.lang.Object();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration43 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration43.maxFileSize = ' ';
        java.lang.String str46 = csvBangConfiguration43.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType47 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str48 = endLineType47.toString();
        java.util.regex.Pattern pattern49 = endLineType47.getPattern();
        csvBangConfiguration43.patternCommentCharacter = pattern49;
        csvBangConfiguration43.quote = ' ';
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool53 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration28, fileName41, obj42, (java.lang.Object) csvBangConfiguration43);
        fileToOpenForWritingCsvFileState16.close((java.lang.Object) multiCsvFilePool53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + endLineType21 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType21.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\205" + "'", str22, "\205");
        org.junit.Assert.assertNotNull(pattern23);
        org.junit.Assert.assertEquals(pattern23.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + endLineType36 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType36.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\205" + "'", str37, "\205");
        org.junit.Assert.assertNotNull(pattern38);
        org.junit.Assert.assertEquals(pattern38.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + endLineType40 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED + "'", endLineType40.equals(com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + endLineType47 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType47.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\205" + "'", str48, "\205");
        org.junit.Assert.assertNotNull(pattern49);
        org.junit.Assert.assertEquals(pattern49.toString(), "\\Q\205\\E");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) (byte) 100);
        csvbangThreadPoolExecutor1.shutdown();
        boolean boolean4 = csvbangThreadPoolExecutor1.awaitGroupTermination((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        long long5 = csvbangThreadPoolExecutor1.getTaskCount();
        java.lang.Runnable runnable6 = null;
        boolean boolean7 = csvbangThreadPoolExecutor1.remove(runnable6);
        int int8 = csvbangThreadPoolExecutor1.getLargestPoolSize();
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor10 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable11 = null;
        boolean boolean12 = csvbangThreadPoolExecutor10.remove(runnable11);
        boolean boolean13 = csvbangThreadPoolExecutor10.isTerminated();
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor15 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.util.concurrent.ThreadFactory threadFactory16 = csvbangThreadPoolExecutor15.getThreadFactory();
        csvbangThreadPoolExecutor10.setThreadFactory(threadFactory16);
        csvbangThreadPoolExecutor1.setThreadFactory(threadFactory16);
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = csvbangThreadPoolExecutor1.awaitTermination((long) 100, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(threadFactory16);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.footer = "";
        com.github.lecogiteur.csvbang.util.EndLineType endLineType10 = csvBangConfiguration0.defaultEndLineCharacter;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType11 = csvBangConfiguration0.defaultEndLineCharacter;
        int int12 = csvBangConfiguration0.blockSize;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + endLineType10 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED + "'", endLineType10.equals(com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED));
        org.junit.Assert.assertTrue("'" + endLineType11 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED + "'", endLineType11.equals(com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration17 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper19 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream20 = csvFileWrapper19.getOutPutStream();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext21 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState22 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration17, csvFileWrapper19, csvFileContext21);
        // The following exception was thrown during execution in test generation
        try {
            fileToOpenForWritingCsvFileState16.open((java.lang.Object) csvFileContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertNull(fileOutputStream20);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        csvBangConfiguration0.endRecord = "";
        java.lang.String str6 = csvBangConfiguration0.endRecord;
        csvBangConfiguration0.delimiter = "com.github.lecogiteur.csvbang.exception.CsvBangException";
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] csvFieldConfigurationArray9 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] {};
        java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration> csvFieldConfigurationList10 = new java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>) csvFieldConfigurationList10, csvFieldConfigurationArray9);
        csvBangConfiguration0.fields = csvFieldConfigurationList10;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(csvFieldConfigurationArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException2 = new com.github.lecogiteur.csvbang.exception.CsvBangException("hi!");
        com.github.lecogiteur.csvbang.exception.CsvBangIOException csvBangIOException3 = new com.github.lecogiteur.csvbang.exception.CsvBangIOException("", (java.lang.Throwable) csvBangException2);
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException4 = new com.github.lecogiteur.csvbang.exception.CsvBangException((java.lang.Throwable) csvBangIOException3);
        com.github.lecogiteur.csvbang.exception.CsvBangIOException csvBangIOException5 = new com.github.lecogiteur.csvbang.exception.CsvBangIOException((java.lang.Throwable) csvBangException4);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor6 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.util.concurrent.ThreadFactory threadFactory7 = csvbangThreadPoolExecutor6.getThreadFactory();
        csvbangThreadPoolExecutor1.setThreadFactory(threadFactory7);
        java.util.concurrent.Callable<java.lang.Void> voidCallable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            csvbangThreadPoolExecutor1.submit((java.lang.Integer) 100, voidCallable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(threadFactory7);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.github.lecogiteur.csvbang.formatter.CurrencyCsvFormatter currencyCsvFormatter0 = new com.github.lecogiteur.csvbang.formatter.CurrencyCsvFormatter();
        currencyCsvFormatter0.init();
        currencyCsvFormatter0.init();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.lang.annotation.Annotation annotation0 = null;
        java.lang.annotation.Annotation[] annotationArray1 = new java.lang.annotation.Annotation[] { annotation0 };
        com.github.lecogiteur.csvbang.annotation.CsvHeader csvHeader2 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvHeaderAnnotation(annotationArray1);
        com.github.lecogiteur.csvbang.annotation.CsvFile csvFile3 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvFileAnnotation(annotationArray1);
        com.github.lecogiteur.csvbang.annotation.CsvHeader csvHeader4 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvHeaderAnnotation(annotationArray1);
        com.github.lecogiteur.csvbang.annotation.CsvFooter csvFooter5 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvFooterAnnotation(annotationArray1);
        com.github.lecogiteur.csvbang.annotation.CsvField csvField6 = com.github.lecogiteur.csvbang.util.ReflectionUti.getCsvFieldAnnotation(annotationArray1);
        org.junit.Assert.assertNotNull(annotationArray1);
        org.junit.Assert.assertNull(csvHeader2);
        org.junit.Assert.assertNull(csvFile3);
        org.junit.Assert.assertNull(csvHeader4);
        org.junit.Assert.assertNull(csvFooter5);
        org.junit.Assert.assertNull(csvField6);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor6 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.util.concurrent.ThreadFactory threadFactory7 = csvbangThreadPoolExecutor6.getThreadFactory();
        csvbangThreadPoolExecutor1.setThreadFactory(threadFactory7);
        int int9 = csvbangThreadPoolExecutor1.getActiveCount();
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler10 = null;
        // The following exception was thrown during execution in test generation
        try {
            csvbangThreadPoolExecutor1.setRejectedExecutionHandler(rejectedExecutionHandler10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(threadFactory7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        char char0 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_COMMENT_CHARACTER;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '#' + "'", char0 == '#');
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        long long4 = csvBangConfiguration0.maxRecordByFile;
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection5 = csvBangConfiguration0.commentsBefore;
        java.util.regex.Pattern pattern6 = csvBangConfiguration0.patternCommentCharacter;
        csvBangConfiguration0.maxFile = (-1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(annotatedElementCollection5);
        org.junit.Assert.assertNull(pattern6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.github.lecogiteur.csvbang.util.CsvBangDateFormat csvBangDateFormat1 = new com.github.lecogiteur.csvbang.util.CsvBangDateFormat("10");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        int int4 = csvbangThreadPoolExecutor1.getPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            csvbangThreadPoolExecutor1.allowCoreThreadTimeOut(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Core threads must have nonzero keep alive times");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        java.lang.String str8 = csvBangConfiguration0.header;
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection9 = csvBangConfiguration0.commentsAfter;
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection10 = csvBangConfiguration0.commentsBefore;
        com.github.lecogiteur.csvbang.file.FileName fileName11 = null;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType12 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str13 = endLineType12.toString();
        java.util.regex.Pattern pattern14 = endLineType12.getPattern();
        com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool oneByOneCsvFilePool16 = new com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool(csvBangConfiguration0, fileName11, (java.lang.Object) endLineType12, (java.lang.Object) 10L);
        java.lang.String str17 = endLineType12.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(annotatedElementCollection9);
        org.junit.Assert.assertNull(annotatedElementCollection10);
        org.junit.Assert.assertTrue("'" + endLineType12 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType12.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\205" + "'", str13, "\205");
        org.junit.Assert.assertNotNull(pattern14);
        org.junit.Assert.assertEquals(pattern14.toString(), "\\Q\205\\E");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\205" + "'", str17, "\205");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        csvBangConfiguration0.endRecord = "";
        java.lang.String str6 = csvBangConfiguration0.endRecord;
        csvBangConfiguration0.delimiter = "com.github.lecogiteur.csvbang.exception.CsvBangException";
        csvBangConfiguration0.maxRecordByFile = (byte) 100;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        long long4 = csvbangThreadPoolExecutor1.getCompletedTaskCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor6 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.util.concurrent.ThreadFactory threadFactory7 = csvbangThreadPoolExecutor6.getThreadFactory();
        csvbangThreadPoolExecutor1.setThreadFactory(threadFactory7);
        java.util.List<java.lang.Runnable> runnableList9 = csvbangThreadPoolExecutor1.shutdownNow();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(threadFactory7);
        org.junit.Assert.assertNotNull(runnableList9);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        long long5 = csvbangThreadPoolExecutor1.getTaskCount();
        boolean boolean6 = csvbangThreadPoolExecutor1.isTerminated();
        int int7 = csvbangThreadPoolExecutor1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        csvbangThreadPoolExecutor1.shutdown();
        java.util.List<java.lang.Runnable> runnableList3 = csvbangThreadPoolExecutor1.shutdownNow();
        boolean boolean4 = csvbangThreadPoolExecutor1.allowsCoreThreadTimeOut();
        org.junit.Assert.assertNotNull(runnableList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException2 = new com.github.lecogiteur.csvbang.exception.CsvBangException("hi!");
        com.github.lecogiteur.csvbang.exception.CsvBangIOException csvBangIOException3 = new com.github.lecogiteur.csvbang.exception.CsvBangIOException("", (java.lang.Throwable) csvBangException2);
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException4 = new com.github.lecogiteur.csvbang.exception.CsvBangException((java.lang.Throwable) csvBangIOException3);
        java.lang.String str5 = csvBangIOException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.github.lecogiteur.csvbang.exception.CsvBangIOException: " + "'", str5, "com.github.lecogiteur.csvbang.exception.CsvBangIOException: ");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        boolean boolean2 = csvbangThreadPoolExecutor1.allowsCoreThreadTimeOut();
        java.util.List<java.lang.Runnable> runnableList3 = csvbangThreadPoolExecutor1.shutdownNow();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(runnableList3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream3 = null;
        csvFileWrapper2.setOutputStream(fileOutputStream3);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext5 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration0, csvFileWrapper2, csvFileContext5);
        java.io.FileOutputStream fileOutputStream7 = csvFileWrapper2.getOutPutStream();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration8 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration8.maxFileSize = ' ';
        java.lang.String str11 = csvBangConfiguration8.footer;
        long long12 = csvBangConfiguration8.maxRecordByFile;
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper2, csvBangConfiguration8);
        org.junit.Assert.assertNull(fileOutputStream7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        long long5 = csvbangThreadPoolExecutor1.getTaskCount();
        java.lang.Runnable runnable6 = null;
        boolean boolean7 = csvbangThreadPoolExecutor1.remove(runnable6);
        int int8 = csvbangThreadPoolExecutor1.getLargestPoolSize();
        int int9 = csvbangThreadPoolExecutor1.getLargestPoolSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream3 = null;
        csvFileWrapper2.setOutputStream(fileOutputStream3);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext5 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration0, csvFileWrapper2, csvFileContext5);
        com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter numberCsvFormatter7 = new com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter();
        fileToOpenForWritingCsvFileState6.close((java.lang.Object) numberCsvFormatter7);
        numberCsvFormatter7.setPattern(",");
        java.lang.Throwable throwable12 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException13 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable12);
        java.lang.Throwable[] throwableArray14 = csvBangException13.getSuppressed();
        com.github.lecogiteur.csvbang.exception.CsvBangIOException csvBangIOException15 = new com.github.lecogiteur.csvbang.exception.CsvBangIOException("com.github.lecogiteur.csvbang.exception.CsvBangException", (java.lang.Throwable) csvBangException13);
        java.lang.Throwable throwable17 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException18 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable17);
        java.lang.Throwable[] throwableArray19 = csvBangException18.getSuppressed();
        com.github.lecogiteur.csvbang.exception.CsvBangIOException csvBangIOException20 = new com.github.lecogiteur.csvbang.exception.CsvBangIOException("hi!", (java.lang.Throwable) csvBangException18);
        csvBangException13.addSuppressed((java.lang.Throwable) csvBangIOException20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = numberCsvFormatter7.format((java.lang.Object) csvBangIOException20, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.github.lecogiteur.csvbang.util.EndLineType endLineType0 = com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED;
        java.lang.String str1 = endLineType0.toString();
        org.junit.Assert.assertTrue("'" + endLineType0 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED + "'", endLineType0.equals(com.github.lecogiteur.csvbang.util.EndLineType.LINE_FEED));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.file.FileName fileName4 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper6 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream7 = csvFileWrapper6.getOutPutStream();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration8 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration8.maxFileSize = ' ';
        java.lang.String str11 = csvBangConfiguration8.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType12 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str13 = endLineType12.toString();
        java.util.regex.Pattern pattern14 = endLineType12.getPattern();
        csvBangConfiguration8.patternCommentCharacter = pattern14;
        java.lang.String str16 = csvBangConfiguration8.header;
        com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool oneByOneCsvFilePool17 = new com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool(csvBangConfiguration0, fileName4, (java.lang.Object) fileOutputStream7, (java.lang.Object) str16);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper19 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str20 = csvFileWrapper19.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration21 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration21.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState24 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper19, csvBangConfiguration21);
        java.io.File file25 = csvFileWrapper19.getFile();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration27 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration27.maxFileSize = ' ';
        long long30 = csvBangConfiguration27.maxRecordByFile;
        com.github.lecogiteur.csvbang.pool.CsvFilePool csvFilePool31 = com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory.createPool(csvBangConfiguration0, file25, (java.lang.Object) (byte) 0, (java.lang.Object) long30);
        csvBangConfiguration0.noEndRecordOnLastRecord = true;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(fileOutputStream7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + endLineType12 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType12.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\205" + "'", str13, "\205");
        org.junit.Assert.assertNotNull(pattern14);
        org.junit.Assert.assertEquals(pattern14.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\205" + "'", str20, "\205");
        org.junit.Assert.assertNotNull(file25);
        org.junit.Assert.assertNull("file25.getParent() == null", file25.getParent());
        org.junit.Assert.assertEquals(file25.toString(), "\205");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(csvFilePool31);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.github.lecogiteur.csvbang.formatter.Default default0 = new com.github.lecogiteur.csvbang.formatter.Default();
        default0.init();
        default0.init();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.github.lecogiteur.csvbang.util.CsvBangDateFormat csvBangDateFormat1 = new com.github.lecogiteur.csvbang.util.CsvBangDateFormat("");
        java.text.SimpleDateFormat simpleDateFormat2 = null;
        csvBangDateFormat1.set(simpleDateFormat2);
        csvBangDateFormat1.remove();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        csvBangConfiguration0.endRecord = "";
        java.nio.charset.Charset charset6 = null;
        csvBangConfiguration0.charset = charset6;
        csvBangConfiguration0.startComment = "";
        java.lang.String str10 = csvBangConfiguration0.footer;
        java.lang.String str11 = csvBangConfiguration0.fileDatePattern;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "yyyyMMdd" + "'", str11, "yyyyMMdd");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.github.lecogiteur.csvbang.formatter.BooleanCsvFormatter booleanCsvFormatter0 = new com.github.lecogiteur.csvbang.formatter.BooleanCsvFormatter();
        booleanCsvFormatter0.init();
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException2 = new com.github.lecogiteur.csvbang.exception.CsvBangException();
        java.lang.Throwable throwable3 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException4 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable3);
        csvBangException2.addSuppressed((java.lang.Throwable) csvBangException4);
        java.lang.String str7 = booleanCsvFormatter0.format((java.lang.Object) csvBangException4, "");
        java.util.Locale locale8 = null;
        booleanCsvFormatter0.setLocal(locale8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "unkowningBoolean" + "'", str7, "unkowningBoolean");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.github.lecogiteur.csvbang.exception.CsvBangIOException csvBangIOException0 = new com.github.lecogiteur.csvbang.exception.CsvBangIOException();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        long long5 = csvbangThreadPoolExecutor1.getTaskCount();
        java.lang.Runnable runnable6 = null;
        boolean boolean7 = csvbangThreadPoolExecutor1.remove(runnable6);
        boolean boolean8 = csvbangThreadPoolExecutor1.allowsCoreThreadTimeOut();
        java.util.concurrent.BlockingQueue<java.lang.Runnable> runnableQueue9 = csvbangThreadPoolExecutor1.getQueue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(runnableQueue9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.github.lecogiteur.csvbang.exception.CsvBangIOException csvBangIOException1 = new com.github.lecogiteur.csvbang.exception.CsvBangIOException(",");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper18 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str19 = csvFileWrapper18.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration20 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration20.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState23 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper18, csvBangConfiguration20);
        fileToOpenForWritingCsvFileState16.close((java.lang.Object) fileToCloseForWritingCsvFileState23);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper26 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream27 = null;
        csvFileWrapper26.setOutputStream(fileOutputStream27);
        // The following exception was thrown during execution in test generation
        try {
            fileToCloseForWritingCsvFileState23.open((java.lang.Object) fileOutputStream27);
            org.junit.Assert.fail("Expected exception of type com.github.lecogiteur.csvbang.exception.CsvBangException; message: The file /Users/yhcrown/Documents/flaky_java_projects/lecogiteur-csvbang/? is closed. We can't open it.");
        } catch (com.github.lecogiteur.csvbang.exception.CsvBangException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\205" + "'", str19, "\205");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.footer = "";
        csvBangConfiguration0.startComment = "";
        csvBangConfiguration0.maxFileSize = 100L;
        csvBangConfiguration0.isDisplayHeader = false;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream3 = null;
        csvFileWrapper2.setOutputStream(fileOutputStream3);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext5 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration0, csvFileWrapper2, csvFileContext5);
        com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter numberCsvFormatter7 = new com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter();
        fileToOpenForWritingCsvFileState6.close((java.lang.Object) numberCsvFormatter7);
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor10 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable11 = null;
        boolean boolean12 = csvbangThreadPoolExecutor10.remove(runnable11);
        boolean boolean13 = csvbangThreadPoolExecutor10.isTerminated();
        long long14 = csvbangThreadPoolExecutor10.getTaskCount();
        java.lang.Runnable runnable15 = null;
        boolean boolean16 = csvbangThreadPoolExecutor10.remove(runnable15);
        int int17 = csvbangThreadPoolExecutor10.getLargestPoolSize();
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor19 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable20 = null;
        boolean boolean21 = csvbangThreadPoolExecutor19.remove(runnable20);
        boolean boolean22 = csvbangThreadPoolExecutor19.isTerminated();
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor24 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.util.concurrent.ThreadFactory threadFactory25 = csvbangThreadPoolExecutor24.getThreadFactory();
        csvbangThreadPoolExecutor19.setThreadFactory(threadFactory25);
        csvbangThreadPoolExecutor10.setThreadFactory(threadFactory25);
        // The following exception was thrown during execution in test generation
        try {
            fileToOpenForWritingCsvFileState6.write((java.lang.Object) threadFactory25, "null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(threadFactory25);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        csvBangConfiguration0.endRecord = "";
        java.lang.String str6 = csvBangConfiguration0.endRecord;
        csvBangConfiguration0.header = "\205";
        csvBangConfiguration0.maxFile = (byte) 10;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration csvFieldConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration();
        java.lang.String str1 = csvFieldConfiguration0.nullReplaceString;
        java.lang.String str2 = csvFieldConfiguration0.nullReplaceString;
        csvFieldConfiguration0.position = 0;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.github.lecogiteur.csvbang.pool.WrapperCsvFileContext wrapperCsvFileContext0 = new com.github.lecogiteur.csvbang.pool.WrapperCsvFileContext();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.FileName fileName1 = null;
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool4 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration0, fileName1, (java.lang.Object) true, (java.lang.Object) (byte) 0);
        java.util.Collection<com.github.lecogiteur.csvbang.file.CsvFileContext> csvFileContextCollection5 = multiCsvFilePool4.getAllFiles();
        java.lang.Object obj6 = null;
        multiCsvFilePool4.setCustomHeader(obj6);
        multiCsvFilePool4.setCustomHeader((java.lang.Object) (byte) 100);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper11 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str12 = csvFileWrapper11.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration13 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration13.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper11, csvBangConfiguration13);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration17 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper19 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream20 = null;
        csvFileWrapper19.setOutputStream(fileOutputStream20);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext22 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState23 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration17, csvFileWrapper19, csvFileContext22);
        java.io.File file24 = csvFileWrapper19.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext25 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState26 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration13, csvFileWrapper19, csvFileContext25);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration27 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration27.maxFileSize = ' ';
        java.lang.String str30 = csvBangConfiguration27.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType31 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str32 = endLineType31.toString();
        java.util.regex.Pattern pattern33 = endLineType31.getPattern();
        csvBangConfiguration27.patternCommentCharacter = pattern33;
        csvBangConfiguration27.footer = "";
        fileToOpenForWritingCsvFileState26.close((java.lang.Object) csvBangConfiguration27);
        com.github.lecogiteur.csvbang.file.FileName fileName38 = null;
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration39 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration39.maxFileSize = ' ';
        java.lang.String str42 = csvBangConfiguration39.footer;
        csvBangConfiguration39.endRecord = "";
        java.nio.charset.Charset charset45 = null;
        csvBangConfiguration39.charset = charset45;
        java.lang.String str47 = csvBangConfiguration39.footer;
        csvBangConfiguration39.init();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration49 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration49.maxFileSize = ' ';
        java.lang.String str52 = csvBangConfiguration49.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType53 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str54 = endLineType53.toString();
        java.util.regex.Pattern pattern55 = endLineType53.getPattern();
        csvBangConfiguration49.patternCommentCharacter = pattern55;
        csvBangConfiguration49.footer = "";
        csvBangConfiguration49.startComment = "";
        csvBangConfiguration49.maxFileSize = 100L;
        com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool oneByOneCsvFilePool63 = new com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool(csvBangConfiguration27, fileName38, (java.lang.Object) csvBangConfiguration39, (java.lang.Object) csvBangConfiguration49);
        multiCsvFilePool4.setCustomFooter((java.lang.Object) csvBangConfiguration27);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration65 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration65.maxFileSize = ' ';
        java.lang.String str68 = csvBangConfiguration65.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType69 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str70 = endLineType69.toString();
        java.util.regex.Pattern pattern71 = endLineType69.getPattern();
        csvBangConfiguration65.patternCommentCharacter = pattern71;
        csvBangConfiguration65.isAppendToFile = true;
        com.github.lecogiteur.csvbang.pool.CsvFilePool csvFilePool78 = com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory.createPool(csvBangConfiguration65, "hi!", (java.lang.Object) 10L, (java.lang.Object) (-1));
        csvBangConfiguration65.isAsynchronousWrite = false;
        boolean boolean81 = csvBangConfiguration65.isFileByFile;
        csvBangConfiguration65.startRecord = "com.github.lecogiteur.csvbang.exception.CsvBangException";
        // The following exception was thrown during execution in test generation
        try {
            com.github.lecogiteur.csvbang.writer.BlockCsvWriter<com.github.lecogiteur.csvbang.formatter.CurrencyCsvFormatter> currencyCsvFormatterBlockCsvWriter84 = new com.github.lecogiteur.csvbang.writer.BlockCsvWriter<com.github.lecogiteur.csvbang.formatter.CurrencyCsvFormatter>((com.github.lecogiteur.csvbang.pool.CsvFilePool) multiCsvFilePool4, csvBangConfiguration65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvFileContextCollection5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\205" + "'", str12, "\205");
        org.junit.Assert.assertNotNull(file24);
        org.junit.Assert.assertNull("file24.getParent() == null", file24.getParent());
        org.junit.Assert.assertEquals(file24.toString(), "\205");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + endLineType31 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType31.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\205" + "'", str32, "\205");
        org.junit.Assert.assertNotNull(pattern33);
        org.junit.Assert.assertEquals(pattern33.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + endLineType53 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType53.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\205" + "'", str54, "\205");
        org.junit.Assert.assertNotNull(pattern55);
        org.junit.Assert.assertEquals(pattern55.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + endLineType69 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType69.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\205" + "'", str70, "\205");
        org.junit.Assert.assertNotNull(pattern71);
        org.junit.Assert.assertEquals(pattern71.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNotNull(csvFilePool78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        long long4 = csvBangConfiguration0.maxRecordByFile;
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection5 = csvBangConfiguration0.commentsBefore;
        java.util.regex.Pattern pattern6 = csvBangConfiguration0.patternCommentCharacter;
        csvBangConfiguration0.isDisplayHeader = false;
        csvBangConfiguration0.isDisplayHeader = false;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(annotatedElementCollection5);
        org.junit.Assert.assertNull(pattern6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.github.lecogiteur.csvbang.file.FileName fileName2 = new com.github.lecogiteur.csvbang.file.FileName("\205", ",");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.github.lecogiteur.csvbang.util.EndLineType endLineType0 = com.github.lecogiteur.csvbang.util.EndLineType.VERTICAL_TAB;
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration1 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration1.maxFileSize = ' ';
        java.lang.String str4 = csvBangConfiguration1.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType5 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str6 = endLineType5.toString();
        java.util.regex.Pattern pattern7 = endLineType5.getPattern();
        csvBangConfiguration1.patternCommentCharacter = pattern7;
        long long9 = csvBangConfiguration1.maxFileSize;
        java.nio.charset.Charset charset10 = csvBangConfiguration1.charset;
        byte[] byteArray11 = endLineType0.toBytes(charset10);
        org.junit.Assert.assertTrue("'" + endLineType0 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.VERTICAL_TAB + "'", endLineType0.equals(com.github.lecogiteur.csvbang.util.EndLineType.VERTICAL_TAB));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + endLineType5 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType5.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\205" + "'", str6, "\205");
        org.junit.Assert.assertNotNull(pattern7);
        org.junit.Assert.assertEquals(pattern7.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(charset10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[11]");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        long long5 = csvbangThreadPoolExecutor1.getTaskCount();
        java.lang.Runnable runnable6 = null;
        boolean boolean7 = csvbangThreadPoolExecutor1.remove(runnable6);
        boolean boolean8 = csvbangThreadPoolExecutor1.allowsCoreThreadTimeOut();
        long long9 = csvbangThreadPoolExecutor1.getCompletedTaskCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.footer = "";
        csvBangConfiguration0.startComment = "";
        csvBangConfiguration0.maxFileSize = 100L;
        csvBangConfiguration0.delimiter = ",";
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection16 = csvBangConfiguration0.commentsBefore;
        java.lang.String str17 = csvBangConfiguration0.startComment;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(annotatedElementCollection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        java.lang.String str4 = csvbangThreadPoolExecutor1.toString();
        java.lang.Runnable runnable5 = null;
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration6 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration6.maxFileSize = ' ';
        java.lang.String str9 = csvBangConfiguration6.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType10 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str11 = endLineType10.toString();
        java.util.regex.Pattern pattern12 = endLineType10.getPattern();
        csvBangConfiguration6.patternCommentCharacter = pattern12;
        long long14 = csvBangConfiguration6.maxFileSize;
        java.nio.charset.Charset charset15 = csvBangConfiguration6.charset;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.nio.charset.Charset> charsetFuture16 = csvbangThreadPoolExecutor1.submit(runnable5, charset15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + endLineType10 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType10.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\205" + "'", str11, "\205");
        org.junit.Assert.assertNotNull(pattern12);
        org.junit.Assert.assertEquals(pattern12.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNotNull(charset15);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        csvbangThreadPoolExecutor1.shutdown();
        java.util.List<java.lang.Runnable> runnableList3 = csvbangThreadPoolExecutor1.shutdownNow();
        java.util.List<java.lang.Runnable> runnableList4 = csvbangThreadPoolExecutor1.shutdownNow();
        java.lang.Runnable runnable5 = null;
        com.github.lecogiteur.csvbang.formatter.Default default6 = new com.github.lecogiteur.csvbang.formatter.Default();
        default6.setPattern("\205");
        default6.setPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<com.github.lecogiteur.csvbang.formatter.Default> defaultFuture11 = csvbangThreadPoolExecutor1.submit(runnable5, default6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(runnableList3);
        org.junit.Assert.assertNotNull(runnableList4);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration csvFieldConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration();
        java.lang.String str1 = csvFieldConfiguration0.nullReplaceString;
        com.github.lecogiteur.csvbang.formatter.CsvFormatter csvFormatter2 = csvFieldConfiguration0.format;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(csvFormatter2);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.github.lecogiteur.csvbang.formatter.DateCsvFormatter dateCsvFormatter0 = new com.github.lecogiteur.csvbang.formatter.DateCsvFormatter();
        java.util.Locale locale1 = null;
        dateCsvFormatter0.setLocal(locale1);
        java.util.Locale locale3 = null;
        dateCsvFormatter0.setLocal(locale3);
        java.util.Locale locale5 = null;
        dateCsvFormatter0.setLocal(locale5);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        long long4 = csvBangConfiguration0.maxRecordByFile;
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection5 = csvBangConfiguration0.commentsBefore;
        csvBangConfiguration0.isAsynchronousWrite = false;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(annotatedElementCollection5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration csvFieldConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration();
        java.lang.String str1 = csvFieldConfiguration0.nullReplaceString;
        java.lang.String str2 = csvFieldConfiguration0.nullReplaceString;
        csvFieldConfiguration0.name = "com.github.lecogiteur.csvbang.exception.CsvBangIOException: ";
        java.lang.String str5 = csvFieldConfiguration0.nullReplaceString;
        int int6 = csvFieldConfiguration0.position;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.github.lecogiteur.csvbang.formatter.DateCsvFormatter dateCsvFormatter0 = new com.github.lecogiteur.csvbang.formatter.DateCsvFormatter();
        dateCsvFormatter0.init();
        dateCsvFormatter0.setPattern("");
        dateCsvFormatter0.setPattern("com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!");
        dateCsvFormatter0.setPattern("com.github.lecogiteur.csvbang.exception.CsvBangException");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        long long5 = csvbangThreadPoolExecutor1.getTaskCount();
        csvbangThreadPoolExecutor1.shutdown();
        int int7 = csvbangThreadPoolExecutor1.getMaximumPoolSize();
        int int8 = csvbangThreadPoolExecutor1.prestartAllCoreThreads();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        long long3 = csvBangConfiguration0.maxRecordByFile;
        int int4 = csvBangConfiguration0.blockSize;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.footer = "";
        long long10 = csvBangConfiguration0.maxRecordByFile;
        java.nio.charset.Charset charset11 = com.github.lecogiteur.csvbang.util.IConstantsCsvBang.DEFAULT_CHARSET;
        csvBangConfiguration0.charset = charset11;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(charset11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] csvFieldConfigurationArray1 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] {};
        java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration> csvFieldConfigurationList2 = new java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>) csvFieldConfigurationList2, csvFieldConfigurationArray1);
        csvBangConfiguration0.fields = csvFieldConfigurationList2;
        com.github.lecogiteur.csvbang.util.Comment comment5 = new com.github.lecogiteur.csvbang.util.Comment((java.lang.Object) csvBangConfiguration0);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper6 = null;
        java.lang.Throwable throwable7 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException8 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable7);
        java.lang.Throwable[] throwableArray9 = csvBangException8.getSuppressed();
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException10 = new com.github.lecogiteur.csvbang.exception.CsvBangException((java.lang.Throwable) csvBangException8);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration11 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration11.maxFileSize = ' ';
        java.lang.String str14 = csvBangConfiguration11.footer;
        csvBangConfiguration11.endRecord = "";
        java.nio.charset.Charset charset17 = null;
        csvBangConfiguration11.charset = charset17;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType19 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str20 = endLineType19.toString();
        java.util.regex.Pattern pattern21 = endLineType19.getPattern();
        csvBangConfiguration11.patternCommentCharacter = pattern21;
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext23 = new com.github.lecogiteur.csvbang.file.CsvFileContext(csvBangConfiguration0, csvFileWrapper6, (java.lang.Object) csvBangException8, (java.lang.Object) csvBangConfiguration11);
        boolean boolean24 = csvFileContext23.isOpen();
        org.junit.Assert.assertNotNull(csvFieldConfigurationArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + endLineType19 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType19.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\205" + "'", str20, "\205");
        org.junit.Assert.assertNotNull(pattern21);
        org.junit.Assert.assertEquals(pattern21.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.isAppendToFile = true;
        com.github.lecogiteur.csvbang.pool.CsvFilePool csvFilePool13 = com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory.createPool(csvBangConfiguration0, "hi!", (java.lang.Object) 10L, (java.lang.Object) (-1));
        csvBangConfiguration0.isAsynchronousWrite = false;
        java.lang.String str16 = csvBangConfiguration0.header;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNotNull(csvFilePool13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.FileName fileName1 = null;
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration2 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper4 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream5 = null;
        csvFileWrapper4.setOutputStream(fileOutputStream5);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext7 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState8 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration2, csvFileWrapper4, csvFileContext7);
        com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter numberCsvFormatter9 = new com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter();
        fileToOpenForWritingCsvFileState8.close((java.lang.Object) numberCsvFormatter9);
        com.github.lecogiteur.csvbang.util.EndLineType endLineType11 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        char[] charArray12 = endLineType11.getCharacters();
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool13 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration0, fileName1, (java.lang.Object) fileToOpenForWritingCsvFileState8, (java.lang.Object) charArray12);
        boolean boolean14 = fileToOpenForWritingCsvFileState8.isOpen();
        org.junit.Assert.assertTrue("'" + endLineType11 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType11.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\205");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\205");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\205]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.github.lecogiteur.csvbang.formatter.DateCsvFormatter dateCsvFormatter0 = new com.github.lecogiteur.csvbang.formatter.DateCsvFormatter();
        dateCsvFormatter0.init();
        dateCsvFormatter0.setPattern("");
        dateCsvFormatter0.setPattern("com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!");
        dateCsvFormatter0.init();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.github.lecogiteur.csvbang.util.CsvBangDateFormat csvBangDateFormat1 = new com.github.lecogiteur.csvbang.util.CsvBangDateFormat(",");
        com.github.lecogiteur.csvbang.util.CsvBangDateFormat csvBangDateFormat3 = new com.github.lecogiteur.csvbang.util.CsvBangDateFormat("");
        com.github.lecogiteur.csvbang.util.CsvBangDateFormat csvBangDateFormat5 = new com.github.lecogiteur.csvbang.util.CsvBangDateFormat("");
        java.text.SimpleDateFormat simpleDateFormat6 = csvBangDateFormat5.get();
        csvBangDateFormat3.set(simpleDateFormat6);
        csvBangDateFormat1.set(simpleDateFormat6);
        org.junit.Assert.assertNotNull(simpleDateFormat6);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.FileName fileName1 = null;
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool4 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration0, fileName1, (java.lang.Object) true, (java.lang.Object) (byte) 0);
        java.util.Collection<com.github.lecogiteur.csvbang.file.CsvFileContext> csvFileContextCollection5 = multiCsvFilePool4.getAllFiles();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration6 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration6.maxFileSize = ' ';
        java.lang.String str9 = csvBangConfiguration6.footer;
        csvBangConfiguration6.endRecord = "";
        java.nio.charset.Charset charset12 = null;
        csvBangConfiguration6.charset = charset12;
        java.lang.String str14 = csvBangConfiguration6.footer;
        java.lang.String str15 = csvBangConfiguration6.startRecord;
        multiCsvFilePool4.setCustomHeader((java.lang.Object) str15);
        java.util.Collection<com.github.lecogiteur.csvbang.file.CsvFileContext> csvFileContextCollection17 = multiCsvFilePool4.getAllFiles();
        org.junit.Assert.assertNotNull(csvFileContextCollection5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(csvFileContextCollection17);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        csvbangThreadPoolExecutor1.shutdown();
        csvbangThreadPoolExecutor1.purge();
        java.lang.Runnable runnable4 = null;
        boolean boolean5 = csvbangThreadPoolExecutor1.remove(runnable4);
        java.lang.Runnable runnable6 = null;
        com.github.lecogiteur.csvbang.factory.FactoryCsvWriter factoryCsvWriter7 = new com.github.lecogiteur.csvbang.factory.FactoryCsvWriter();
        java.lang.Class<?> wildcardClass8 = factoryCsvWriter7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Future<java.lang.reflect.Type> typeFuture9 = csvbangThreadPoolExecutor1.submit(runnable6, (java.lang.reflect.Type) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.github.lecogiteur.csvbang.util.Comment comment1 = new com.github.lecogiteur.csvbang.util.Comment("hi!");
        comment1.setComment("\205");
        java.lang.String str4 = comment1.getComment();
        comment1.setComment("com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!");
        java.lang.String str7 = comment1.getComment();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\205" + "'", str4, "\205");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!" + "'", str7, "com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.footer = "";
        long long10 = csvBangConfiguration0.maxRecordByFile;
        boolean boolean11 = csvBangConfiguration0.isFileByFile;
        csvBangConfiguration0.quote = ' ';
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] csvFieldConfigurationArray1 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] {};
        java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration> csvFieldConfigurationList2 = new java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>) csvFieldConfigurationList2, csvFieldConfigurationArray1);
        csvBangConfiguration0.fields = csvFieldConfigurationList2;
        com.github.lecogiteur.csvbang.util.Comment comment5 = new com.github.lecogiteur.csvbang.util.Comment((java.lang.Object) csvBangConfiguration0);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper6 = null;
        java.lang.Throwable throwable7 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException8 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable7);
        java.lang.Throwable[] throwableArray9 = csvBangException8.getSuppressed();
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException10 = new com.github.lecogiteur.csvbang.exception.CsvBangException((java.lang.Throwable) csvBangException8);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration11 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration11.maxFileSize = ' ';
        java.lang.String str14 = csvBangConfiguration11.footer;
        csvBangConfiguration11.endRecord = "";
        java.nio.charset.Charset charset17 = null;
        csvBangConfiguration11.charset = charset17;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType19 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str20 = endLineType19.toString();
        java.util.regex.Pattern pattern21 = endLineType19.getPattern();
        csvBangConfiguration11.patternCommentCharacter = pattern21;
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext23 = new com.github.lecogiteur.csvbang.file.CsvFileContext(csvBangConfiguration0, csvFileWrapper6, (java.lang.Object) csvBangException8, (java.lang.Object) csvBangConfiguration11);
        // The following exception was thrown during execution in test generation
        try {
            csvFileContext23.open();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(csvFieldConfigurationArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + endLineType19 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType19.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\205" + "'", str20, "\205");
        org.junit.Assert.assertNotNull(pattern21);
        org.junit.Assert.assertEquals(pattern21.toString(), "\\Q\205\\E");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration csvFieldConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration();
        java.lang.String str1 = csvFieldConfiguration0.nullReplaceString;
        java.lang.String str2 = csvFieldConfiguration0.nullReplaceString;
        java.lang.String str3 = csvFieldConfiguration0.nullReplaceString;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        java.lang.Runnable runnable2 = null;
        boolean boolean3 = csvbangThreadPoolExecutor1.remove(runnable2);
        boolean boolean4 = csvbangThreadPoolExecutor1.isTerminated();
        long long5 = csvbangThreadPoolExecutor1.getTaskCount();
        csvbangThreadPoolExecutor1.shutdown();
        int int7 = csvbangThreadPoolExecutor1.getMaximumPoolSize();
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = csvbangThreadPoolExecutor1.getKeepAliveTime(timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration csvFieldConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration();
        java.lang.String str1 = csvFieldConfiguration0.nullReplaceString;
        java.lang.String str2 = csvFieldConfiguration0.nullReplaceString;
        csvFieldConfiguration0.name = "com.github.lecogiteur.csvbang.exception.CsvBangIOException: ";
        java.lang.reflect.AnnotatedElement annotatedElement5 = csvFieldConfiguration0.memberBean;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(annotatedElement5);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.github.lecogiteur.csvbang.formatter.BooleanCsvFormatter booleanCsvFormatter0 = new com.github.lecogiteur.csvbang.formatter.BooleanCsvFormatter();
        booleanCsvFormatter0.init();
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException2 = new com.github.lecogiteur.csvbang.exception.CsvBangException();
        java.lang.Throwable throwable3 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException4 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable3);
        csvBangException2.addSuppressed((java.lang.Throwable) csvBangException4);
        java.lang.String str7 = booleanCsvFormatter0.format((java.lang.Object) csvBangException4, "");
        booleanCsvFormatter0.setPattern("unkowningBoolean");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "unkowningBoolean" + "'", str7, "unkowningBoolean");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        char char17 = csvBangConfiguration3.commentCharacter;
        java.lang.String str18 = csvBangConfiguration3.footer;
        boolean boolean19 = csvBangConfiguration3.isAsynchronousWrite;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '#' + "'", char17 == '#');
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        csvBangConfiguration0.endRecord = "";
        csvBangConfiguration0.isDisplayHeader = true;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration csvFieldConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration();
        java.lang.String str1 = csvFieldConfiguration0.nullReplaceString;
        java.lang.String str2 = csvFieldConfiguration0.nullReplaceString;
        java.lang.String str3 = csvFieldConfiguration0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.file.FileName fileName4 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper6 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream7 = csvFileWrapper6.getOutPutStream();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration8 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration8.maxFileSize = ' ';
        java.lang.String str11 = csvBangConfiguration8.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType12 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str13 = endLineType12.toString();
        java.util.regex.Pattern pattern14 = endLineType12.getPattern();
        csvBangConfiguration8.patternCommentCharacter = pattern14;
        java.lang.String str16 = csvBangConfiguration8.header;
        com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool oneByOneCsvFilePool17 = new com.github.lecogiteur.csvbang.pool.OneByOneCsvFilePool(csvBangConfiguration0, fileName4, (java.lang.Object) fileOutputStream7, (java.lang.Object) str16);
        oneByOneCsvFilePool17.setCustomHeader((java.lang.Object) 1L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(fileOutputStream7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + endLineType12 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType12.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\205" + "'", str13, "\205");
        org.junit.Assert.assertNotNull(pattern14);
        org.junit.Assert.assertEquals(pattern14.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        java.lang.String str8 = csvBangConfiguration0.footer;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test260() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "\u2029]");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor csvbangThreadPoolExecutor1 = new com.github.lecogiteur.csvbang.pool.CsvbangThreadPoolExecutor((int) ' ');
        boolean boolean2 = csvbangThreadPoolExecutor1.allowsCoreThreadTimeOut();
        boolean boolean3 = csvbangThreadPoolExecutor1.allowsCoreThreadTimeOut();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream3 = null;
        csvFileWrapper2.setOutputStream(fileOutputStream3);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext5 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration0, csvFileWrapper2, csvFileContext5);
        com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter numberCsvFormatter7 = new com.github.lecogiteur.csvbang.formatter.NumberCsvFormatter();
        fileToOpenForWritingCsvFileState6.close((java.lang.Object) numberCsvFormatter7);
        numberCsvFormatter7.setPattern("com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!");
        com.github.lecogiteur.csvbang.annotation.CsvComment.DIRECTION dIRECTION11 = com.github.lecogiteur.csvbang.annotation.CsvComment.DIRECTION.BEFORE_RECORD;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = numberCsvFormatter7.format((java.lang.Object) dIRECTION11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dIRECTION11 + "' != '" + com.github.lecogiteur.csvbang.annotation.CsvComment.DIRECTION.BEFORE_RECORD + "'", dIRECTION11.equals(com.github.lecogiteur.csvbang.annotation.CsvComment.DIRECTION.BEFORE_RECORD));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.github.lecogiteur.csvbang.factory.FactoryCsvWriter factoryCsvWriter0 = new com.github.lecogiteur.csvbang.factory.FactoryCsvWriter();
        factoryCsvWriter0.setNumberOfWriterThread((int) (short) 1);
        factoryCsvWriter0.addPackage(",");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        csvBangConfiguration0.endRecord = "";
        java.nio.charset.Charset charset6 = null;
        csvBangConfiguration0.charset = charset6;
        java.lang.String str8 = csvBangConfiguration0.footer;
        csvBangConfiguration0.init();
        java.lang.Object obj11 = null;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType12 = com.github.lecogiteur.csvbang.util.EndLineType.CARRIAGE_RETURN_LINE_FEED;
        com.github.lecogiteur.csvbang.pool.CsvFilePool csvFilePool13 = com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory.createPool(csvBangConfiguration0, ",", obj11, (java.lang.Object) endLineType12);
        java.lang.String str14 = csvBangConfiguration0.header;
        com.github.lecogiteur.csvbang.file.FileName fileName15 = csvBangConfiguration0.fileName;
        java.lang.String str17 = fileName15.getNewFileName(false);
        com.github.lecogiteur.csvbang.file.FileName fileName18 = fileName15.clone();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + endLineType12 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.CARRIAGE_RETURN_LINE_FEED + "'", endLineType12.equals(com.github.lecogiteur.csvbang.util.EndLineType.CARRIAGE_RETURN_LINE_FEED));
        org.junit.Assert.assertNotNull(csvFilePool13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(fileName15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "out-1.csv" + "'", str17, "out-1.csv");
        org.junit.Assert.assertNotNull(fileName18);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        java.lang.String str8 = csvBangConfiguration0.header;
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection9 = csvBangConfiguration0.commentsAfter;
        boolean boolean10 = csvBangConfiguration0.isAsynchronousWrite;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(annotatedElementCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.github.lecogiteur.csvbang.formatter.BooleanCsvFormatter booleanCsvFormatter0 = new com.github.lecogiteur.csvbang.formatter.BooleanCsvFormatter();
        java.util.Locale locale1 = null;
        booleanCsvFormatter0.setLocal(locale1);
        java.lang.String str5 = booleanCsvFormatter0.format((java.lang.Object) ' ', "null");
        booleanCsvFormatter0.setPattern("out-1.csv");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unkowningBoolean" + "'", str5, "unkowningBoolean");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.isAppendToFile = true;
        com.github.lecogiteur.csvbang.pool.CsvFilePool csvFilePool13 = com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory.createPool(csvBangConfiguration0, "hi!", (java.lang.Object) 10L, (java.lang.Object) (-1));
        csvBangConfiguration0.delimiter = "";
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper17 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream18 = csvFileWrapper17.getOutPutStream();
        com.github.lecogiteur.csvbang.formatter.Default default20 = new com.github.lecogiteur.csvbang.formatter.Default();
        default20.setPattern("\205");
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext23 = new com.github.lecogiteur.csvbang.file.CsvFileContext(csvBangConfiguration0, csvFileWrapper17, (java.lang.Object) false, (java.lang.Object) "\205");
        csvFileContext23.close();
        csvFileContext23.close();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertNotNull(csvFilePool13);
        org.junit.Assert.assertNull(fileOutputStream18);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        csvBangConfiguration0.endRecord = "";
        java.nio.charset.Charset charset6 = null;
        csvBangConfiguration0.charset = charset6;
        java.lang.String str8 = csvBangConfiguration0.footer;
        csvBangConfiguration0.init();
        java.lang.Object obj11 = null;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType12 = com.github.lecogiteur.csvbang.util.EndLineType.CARRIAGE_RETURN_LINE_FEED;
        com.github.lecogiteur.csvbang.pool.CsvFilePool csvFilePool13 = com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory.createPool(csvBangConfiguration0, ",", obj11, (java.lang.Object) endLineType12);
        java.lang.String str14 = csvBangConfiguration0.header;
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection15 = csvBangConfiguration0.commentsBefore;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + endLineType12 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.CARRIAGE_RETURN_LINE_FEED + "'", endLineType12.equals(com.github.lecogiteur.csvbang.util.EndLineType.CARRIAGE_RETURN_LINE_FEED));
        org.junit.Assert.assertNotNull(csvFilePool13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(annotatedElementCollection15);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream3 = null;
        csvFileWrapper2.setOutputStream(fileOutputStream3);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext5 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration0, csvFileWrapper2, csvFileContext5);
        boolean boolean7 = fileToOpenForWritingCsvFileState6.isOpen();
        java.lang.Object obj8 = null;
        fileToOpenForWritingCsvFileState6.close(obj8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration3 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration3.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration3);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration7 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper9 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream10 = null;
        csvFileWrapper9.setOutputStream(fileOutputStream10);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext12 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState13 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration7, csvFileWrapper9, csvFileContext12);
        java.io.File file14 = csvFileWrapper9.getFile();
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext15 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState16 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration3, csvFileWrapper9, csvFileContext15);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper18 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str19 = csvFileWrapper18.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration20 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration20.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState23 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper18, csvBangConfiguration20);
        fileToOpenForWritingCsvFileState16.close((java.lang.Object) fileToCloseForWritingCsvFileState23);
        boolean boolean25 = fileToCloseForWritingCsvFileState23.isOpen();
        // The following exception was thrown during execution in test generation
        try {
            fileToCloseForWritingCsvFileState23.open((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type com.github.lecogiteur.csvbang.exception.CsvBangException; message: The file /Users/yhcrown/Documents/flaky_java_projects/lecogiteur-csvbang/? is closed. We can't open it.");
        } catch (com.github.lecogiteur.csvbang.exception.CsvBangException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "\205");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\205" + "'", str19, "\205");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.isAppendToFile = true;
        csvBangConfiguration0.delimiter = "com.github.lecogiteur.csvbang.exception.CsvBangException";
        java.lang.String str12 = csvBangConfiguration0.startRecord;
        java.lang.String str13 = csvBangConfiguration0.endRecord;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException1 = new com.github.lecogiteur.csvbang.exception.CsvBangException("unkowningBoolean");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = null;
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper2 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.io.FileOutputStream fileOutputStream3 = null;
        csvFileWrapper2.setOutputStream(fileOutputStream3);
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext5 = null;
        com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState fileToOpenForWritingCsvFileState6 = new com.github.lecogiteur.csvbang.file.FileToOpenForWritingCsvFileState(csvBangConfiguration0, csvFileWrapper2, csvFileContext5);
        boolean boolean7 = fileToOpenForWritingCsvFileState6.isOpen();
        boolean boolean8 = fileToOpenForWritingCsvFileState6.isOpen();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.github.lecogiteur.csvbang.formatter.Default default0 = new com.github.lecogiteur.csvbang.formatter.Default();
        default0.setPattern("\205");
        default0.setPattern("hi!");
        java.lang.String str7 = default0.format((java.lang.Object) 10L, "com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration8 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration8.maxFileSize = ' ';
        java.lang.String str11 = csvBangConfiguration8.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType12 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str13 = endLineType12.toString();
        java.util.regex.Pattern pattern14 = endLineType12.getPattern();
        csvBangConfiguration8.patternCommentCharacter = pattern14;
        csvBangConfiguration8.footer = "";
        long long18 = csvBangConfiguration8.maxFile;
        com.github.lecogiteur.csvbang.file.FileName fileName19 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException21 = new com.github.lecogiteur.csvbang.exception.CsvBangException("com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration22 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration22.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool25 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration8, fileName19, (java.lang.Object) "com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!", (java.lang.Object) ' ');
        java.lang.String str27 = default0.format((java.lang.Object) multiCsvFilePool25, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + endLineType12 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType12.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\205" + "'", str13, "\205");
        org.junit.Assert.assertNotNull(pattern14);
        org.junit.Assert.assertEquals(pattern14.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] csvFieldConfigurationArray1 = new com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration[] {};
        java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration> csvFieldConfigurationList2 = new java.util.ArrayList<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.github.lecogiteur.csvbang.configuration.CsvFieldConfiguration>) csvFieldConfigurationList2, csvFieldConfigurationArray1);
        csvBangConfiguration0.fields = csvFieldConfigurationList2;
        com.github.lecogiteur.csvbang.util.Comment comment5 = new com.github.lecogiteur.csvbang.util.Comment((java.lang.Object) csvBangConfiguration0);
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper6 = null;
        java.lang.Throwable throwable7 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException8 = new com.github.lecogiteur.csvbang.exception.CsvBangException(throwable7);
        java.lang.Throwable[] throwableArray9 = csvBangException8.getSuppressed();
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException10 = new com.github.lecogiteur.csvbang.exception.CsvBangException((java.lang.Throwable) csvBangException8);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration11 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration11.maxFileSize = ' ';
        java.lang.String str14 = csvBangConfiguration11.footer;
        csvBangConfiguration11.endRecord = "";
        java.nio.charset.Charset charset17 = null;
        csvBangConfiguration11.charset = charset17;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType19 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str20 = endLineType19.toString();
        java.util.regex.Pattern pattern21 = endLineType19.getPattern();
        csvBangConfiguration11.patternCommentCharacter = pattern21;
        com.github.lecogiteur.csvbang.file.CsvFileContext csvFileContext23 = new com.github.lecogiteur.csvbang.file.CsvFileContext(csvBangConfiguration0, csvFileWrapper6, (java.lang.Object) csvBangException8, (java.lang.Object) csvBangConfiguration11);
        csvFileContext23.close();
        org.junit.Assert.assertNotNull(csvFieldConfigurationArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + endLineType19 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType19.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\205" + "'", str20, "\205");
        org.junit.Assert.assertNotNull(pattern21);
        org.junit.Assert.assertEquals(pattern21.toString(), "\\Q\205\\E");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.github.lecogiteur.csvbang.formatter.DateCsvFormatter dateCsvFormatter0 = new com.github.lecogiteur.csvbang.formatter.DateCsvFormatter();
        java.util.Locale locale1 = null;
        dateCsvFormatter0.setLocal(locale1);
        java.util.Locale locale3 = null;
        dateCsvFormatter0.setLocal(locale3);
        dateCsvFormatter0.setPattern("com.github.lecogiteur.csvbang.exception.CsvBangIOException: ");
        dateCsvFormatter0.init();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.github.lecogiteur.csvbang.file.CsvFileWrapper csvFileWrapper1 = new com.github.lecogiteur.csvbang.file.CsvFileWrapper("\205");
        java.lang.String str2 = csvFileWrapper1.getFileName();
        java.lang.String str3 = csvFileWrapper1.getFileName();
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration4 = null;
        com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState fileToCloseForWritingCsvFileState5 = new com.github.lecogiteur.csvbang.file.FileToCloseForWritingCsvFileState(csvFileWrapper1, csvBangConfiguration4);
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration6 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration6.maxFileSize = ' ';
        java.lang.String str9 = csvBangConfiguration6.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType10 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str11 = endLineType10.toString();
        java.util.regex.Pattern pattern12 = endLineType10.getPattern();
        csvBangConfiguration6.patternCommentCharacter = pattern12;
        csvBangConfiguration6.footer = "";
        long long16 = csvBangConfiguration6.maxFile;
        com.github.lecogiteur.csvbang.file.FileName fileName17 = null;
        com.github.lecogiteur.csvbang.exception.CsvBangException csvBangException19 = new com.github.lecogiteur.csvbang.exception.CsvBangException("com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration20 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration20.maxFileSize = ' ';
        com.github.lecogiteur.csvbang.pool.MultiCsvFilePool multiCsvFilePool23 = new com.github.lecogiteur.csvbang.pool.MultiCsvFilePool(csvBangConfiguration6, fileName17, (java.lang.Object) "com.github.lecogiteur.csvbang.exception.CsvBangIOException: hi!", (java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            fileToCloseForWritingCsvFileState5.close((java.lang.Object) multiCsvFilePool23);
            org.junit.Assert.fail("Expected exception of type com.github.lecogiteur.csvbang.exception.CsvBangException; message: An error has occured when closed file");
        } catch (com.github.lecogiteur.csvbang.exception.CsvBangException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205" + "'", str2, "\205");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\205" + "'", str3, "\205");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + endLineType10 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType10.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\205" + "'", str11, "\205");
        org.junit.Assert.assertNotNull(pattern12);
        org.junit.Assert.assertEquals(pattern12.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.footer = "";
        long long10 = csvBangConfiguration0.maxFile;
        java.lang.Character char11 = csvBangConfiguration0.quote;
        csvBangConfiguration0.delimiter = "yyyyMMdd";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + endLineType4 + "' != '" + com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE + "'", endLineType4.equals(com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\205" + "'", str5, "\205");
        org.junit.Assert.assertNotNull(pattern6);
        org.junit.Assert.assertEquals(pattern6.toString(), "\\Q\205\\E");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(char11);
    }
}
