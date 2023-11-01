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
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.parboiled.Rule rule1 = attributesPlugin0.OrderedList();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        gutenberg.itext.model.Markdown markdown1 = gutenberg.itext.model.Markdown.fromUTF8Resource("hi!");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        gutenberg.itext.TextStripper.Text text3 = new gutenberg.itext.TextStripper.Text((float) '4', "H4-font", (float) 4);
        text3.width = 1.0f;
        gutenberg.itext.TextStripper.Text text9 = new gutenberg.itext.TextStripper.Text((float) '4', "H4-font", (float) 4);
        text9.width = 1.0f;
        int int12 = text3.compareTo(text9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on text3 and text9", (text3.compareTo(text9) == 0) == text3.equals(text9));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        gutenberg.itext.TextStripper.Row row1 = new gutenberg.itext.TextStripper.Row((float) (byte) 10);
        gutenberg.itext.TextStripper.Row row3 = new gutenberg.itext.TextStripper.Row((float) (byte) 10);
        int int4 = row1.compareTo(row3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on row1 and row3", (row1.compareTo(row3) == 0) == row1.equals(row3));
    }
}

