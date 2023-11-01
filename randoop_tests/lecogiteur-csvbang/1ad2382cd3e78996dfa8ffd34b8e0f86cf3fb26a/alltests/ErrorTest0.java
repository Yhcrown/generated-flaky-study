import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.github.lecogiteur.csvbang.formatter.DateCsvFormatter dateCsvFormatter0 = new com.github.lecogiteur.csvbang.formatter.DateCsvFormatter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = dateCsvFormatter0.format((java.lang.Object) false, "");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration0 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration0.maxFileSize = ' ';
        java.lang.String str3 = csvBangConfiguration0.footer;
        com.github.lecogiteur.csvbang.util.EndLineType endLineType4 = com.github.lecogiteur.csvbang.util.EndLineType.NEXT_LINE;
        java.lang.String str5 = endLineType4.toString();
        java.util.regex.Pattern pattern6 = endLineType4.getPattern();
        csvBangConfiguration0.patternCommentCharacter = pattern6;
        csvBangConfiguration0.isAppendToFile = true;
        com.github.lecogiteur.csvbang.pool.CsvFilePool csvFilePool13 = com.github.lecogiteur.csvbang.factory.CsvFilePoolFactory.createPool(csvBangConfiguration0, "hi!", (java.lang.Object) 10L, (java.lang.Object) (-1));
        com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration csvBangConfiguration14 = new com.github.lecogiteur.csvbang.configuration.CsvBangConfiguration();
        csvBangConfiguration14.maxFileSize = ' ';
        java.lang.String str17 = csvBangConfiguration14.footer;
        long long18 = csvBangConfiguration14.maxRecordByFile;
        java.util.Collection<java.lang.reflect.AnnotatedElement> annotatedElementCollection19 = csvBangConfiguration14.commentsBefore;
        java.util.regex.Pattern pattern20 = csvBangConfiguration14.patternCommentCharacter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.github.lecogiteur.csvbang.writer.BlockCsvWriter<java.lang.Throwable> throwableBlockCsvWriter21 = new com.github.lecogiteur.csvbang.writer.BlockCsvWriter<java.lang.Throwable>(csvFilePool13, csvBangConfiguration14);
    }
}

