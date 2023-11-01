import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = org.languagetool.Language.isLanguageSupported("var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = org.languagetool.Language.isLanguageSupported("var evt = document.createEvent(\"Events\");evt.initEvent(\"hi!\", true, false);var element = document.getElementById(\"English (US)\");element.dispatchEvent(evt);");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        java.lang.String[] strArray4 = language0.getUnpairedRuleStartSymbols();
        java.lang.String str5 = language0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = language0.isVariant();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.languagetool.Language language1 = org.languagetool.Language.getLanguageForShortName("hi!:");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = australianEnglishOnlySpelling0.isVariant();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.languagetool.Language language1 = org.languagetool.Language.getLanguageForName("English (US)");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        java.lang.String[] strArray4 = language0.getUnpairedRuleStartSymbols();
        java.lang.String str5 = language0.getShortNameWithVariant();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker6 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = language0.hasVariant();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.languagetool.Language language1 = org.languagetool.Language.getLanguageForName("hi!:");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = org.languagetool.Language.isLanguageSupported("Testlanguage");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.languagetool.Language language1 = org.languagetool.Language.getLanguageForShortName("en");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.languagetool.Language language1 = org.languagetool.Language.getLanguageForName("A form element does not have a corresponding label or has more than 1 corresponding label.");
    }
}

