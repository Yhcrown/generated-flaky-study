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
        org.raoxunrong.demo.LanguageToolCheckerDemo languageToolCheckerDemo0 = new org.raoxunrong.demo.LanguageToolCheckerDemo();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        org.languagetool.Language language0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker1 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: language cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        org.raoxunrong.demo.SpellCheckerImprovedDemo spellCheckerImprovedDemo0 = new org.raoxunrong.demo.SpellCheckerImprovedDemo();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        org.raoxunrong.domain.page.CheckablePage checkablePage0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.raoxunrong.utils.HTMLTextLoader.getPlainText(checkablePage0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        org.openqa.selenium.WebDriver webDriver0 = null;
        org.raoxunrong.check.accessibility.filter.predicate.LabelOrphanedPredicate labelOrphanedPredicate1 = new org.raoxunrong.check.accessibility.filter.predicate.LabelOrphanedPredicate(webDriver0);
        org.openqa.selenium.WebElement webElement2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = labelOrphanedPredicate1.apply(webElement2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        org.raoxunrong.check.accessibility.filter.AnchorMissingFilter anchorMissingFilter0 = new org.raoxunrong.check.accessibility.filter.AnchorMissingFilter();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.openqa.selenium.WebElement> webElementCollection2 = anchorMissingFilter0.filter(checkablePage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        // The following exception was thrown during execution in test generation
        try {
            org.languagetool.Language language1 = org.languagetool.Language.getLanguageForShortName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: langCode cannot be empty or whitespace only");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String str1 = org.raoxunrong.utils.HTMLTextLoader.getText("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        org.raoxunrong.demo.WaveAccessibilityCheckDemo waveAccessibilityCheckDemo0 = new org.raoxunrong.demo.WaveAccessibilityCheckDemo();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker0 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            firefoxSpellCheckerImprovedChecker0.doCheck(checkablePage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        org.raoxunrong.profile.FirefoxProfileHandle firefoxProfileHandle0 = new org.raoxunrong.profile.FirefoxProfileHandle();
        org.openqa.selenium.firefox.FirefoxProfile firefoxProfile1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.openqa.selenium.firefox.FirefoxProfile firefoxProfile2 = firefoxProfileHandle0.installWAVE(firefoxProfile1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter labelOrphanedFilter0 = new org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.openqa.selenium.WebElement> webElementCollection2 = labelOrphanedFilter0.filter(checkablePage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        boolean boolean1 = org.languagetool.Language.isLanguageSupported("hi!:hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        org.languagetool.Language language1 = org.languagetool.Language.DEMO;
        java.util.Locale locale2 = language1.getLocaleWithCountry();
        org.languagetool.Language[] languageArray3 = new org.languagetool.Language[] { language0, language1 };
        org.languagetool.Language.LANGUAGES = languageArray3;
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(language1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(languageArray3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.util.List<org.languagetool.Language> languageList2 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType3 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList2, checkType3);
        java.lang.Class<?> wildcardClass5 = languageList2.getClass();
        org.junit.Assert.assertNotNull(languageList2);
        org.junit.Assert.assertTrue("'" + checkType3 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType3.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.raoxunrong.check.accessibility.firefox.FirefoxWaveAccessibilityChecker firefoxWaveAccessibilityChecker0 = new org.raoxunrong.check.accessibility.firefox.FirefoxWaveAccessibilityChecker();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            firefoxWaveAccessibilityChecker0.doCheck(checkablePage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        org.raoxunrong.utils.HTMLTextLoader hTMLTextLoader0 = new org.raoxunrong.utils.HTMLTextLoader();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        org.raoxunrong.check.accessibility.common.HtmlSourceAccessibilityChecker htmlSourceAccessibilityChecker0 = new org.raoxunrong.check.accessibility.common.HtmlSourceAccessibilityChecker();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlSourceAccessibilityChecker0.doCheck(checkablePage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        org.languagetool.Language language1 = org.languagetool.Language.getLanguageForName("hi!:hi!");
        org.junit.Assert.assertNull(language1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.raoxunrong.check.CheckType checkType1 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.utils.CheckedItemStatistic.generateReport("hi!:hi!", checkType1);
        org.junit.Assert.assertTrue("'" + checkType1 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType1.equals(org.raoxunrong.check.CheckType.SpellingCheck));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary2 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str2 = org.raoxunrong.check.JavascriptGenerator.generateDispatchEventScript("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);" + "'", str2, "var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        org.languagetool.Language language2 = org.languagetool.Language.DEMO;
        java.util.Locale locale3 = language2.getLocaleWithCountry();
        java.util.Locale locale4 = language2.getLocaleWithCountry();
        org.languagetool.Language language5 = org.languagetool.Language.DEMO;
        java.util.Locale locale6 = language5.getLocaleWithCountry();
        org.languagetool.Language language7 = org.languagetool.Language.DEMO;
        org.languagetool.Language language8 = org.languagetool.Language.DEMO;
        java.util.Locale locale9 = language8.getLocaleWithCountry();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker10 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language8);
        org.languagetool.Language[] languageArray11 = new org.languagetool.Language[] { language0, language2, language5, language7, language8 };
        java.util.ArrayList<org.languagetool.Language> languageList12 = new java.util.ArrayList<org.languagetool.Language>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.languagetool.Language>) languageList12, languageArray11);
        org.languagetool.Language.reInit((java.util.List<org.languagetool.Language>) languageList12);
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language7);
        org.junit.Assert.assertNotNull(language8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(languageArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter deprecatedElementsFilter0 = new org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.openqa.selenium.WebElement> webElementCollection2 = deprecatedElementsFilter0.filter(checkablePage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.raoxunrong.check.accessibility.firefox.FirefoxWaveAccessibilityChecker firefoxWaveAccessibilityChecker0 = new org.raoxunrong.check.accessibility.firefox.FirefoxWaveAccessibilityChecker();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            firefoxWaveAccessibilityChecker0.doCheck(checkablePage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        boolean boolean7 = collectionItem4.isPass();
        java.util.Collection collection8 = collectionItem4.getAdditionalInfo();
        java.lang.String str9 = collectionItem4.getItemName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType0 = org.raoxunrong.check.accessibility.AccessibilityType.AltMissing;
        org.junit.Assert.assertTrue("'" + accessibilityType0 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.AltMissing + "'", accessibilityType0.equals(org.raoxunrong.check.accessibility.AccessibilityType.AltMissing));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.raoxunrong.check.accessibility.filter.TitleMissingFilter titleMissingFilter0 = new org.raoxunrong.check.accessibility.filter.TitleMissingFilter();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.openqa.selenium.WebElement> webElementCollection2 = titleMissingFilter0.filter(checkablePage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker0 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            firefoxSpellCheckerImprovedChecker0.doCheck(checkablePage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary2 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("hi!:hi!", "hi!:hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi!:hi! is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.raoxunrong.check.accessibility.filter.EmptyElementsFilter emptyElementsFilter0 = new org.raoxunrong.check.accessibility.filter.EmptyElementsFilter();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.openqa.selenium.WebElement> webElementCollection2 = emptyElementsFilter0.filter(checkablePage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        boolean boolean4 = language0.isExternal();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        // The following exception was thrown during execution in test generation
        try {
            org.languagetool.Language language1 = org.languagetool.Language.getLanguageForShortName("var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);' is not a language code known to LanguageTool. Supported languages: [English, English (US), English (GB), English (Australian), English (Canadian), English (New Zealand), English (South African)]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.lang.String str2 = org.raoxunrong.check.JavascriptGenerator.generateDispatchEventScript("Testlanguage", "var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);" + "'", str2, "var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.util.Locale locale2 = language0.getLocaleWithCountry();
        java.util.Locale locale3 = language0.getLocaleWithCountry();
        org.languagetool.tokenizers.Tokenizer tokenizer4 = language0.getWordTokenizer();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(tokenizer4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary1 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.raoxunrong.profile.FirefoxProfileHandle firefoxProfileHandle0 = new org.raoxunrong.profile.FirefoxProfileHandle();
        org.openqa.selenium.firefox.FirefoxProfile firefoxProfile1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.openqa.selenium.firefox.FirefoxProfile firefoxProfile2 = firefoxProfileHandle0.installSpellChecker(firefoxProfile1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        java.util.List<org.languagetool.Language> languageList9 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType10 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem11 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList9, checkType10);
        boolean boolean12 = collectionItem4.equals((java.lang.Object) "hi!");
        boolean boolean13 = collectionItem4.isPass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(languageList9);
        org.junit.Assert.assertTrue("'" + checkType10 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType10.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.utils.CheckedItemStatistic.addCheckedItem((org.raoxunrong.domain.item.CheckedItem) collectionItem4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.lang.String str1 = org.raoxunrong.utils.HTMLTextLoader.getText("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        java.lang.String[] strArray4 = language0.getUnpairedRuleStartSymbols();
        boolean boolean5 = language0.isVariant();
        org.languagetool.rules.patterns.Unifier unifier6 = language0.getDisambiguationUnifier();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unifier6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary2 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("", "Testlanguage");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        java.lang.String[] strArray4 = language0.getUnpairedRuleStartSymbols();
        java.lang.String str5 = language0.getShortNameWithVariant();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker6 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "xx-XX" + "'", str5, "xx-XX");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary1 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);:hi!:hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);:hi!:hi! is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.openqa.selenium.WebDriver webDriver0 = null;
        org.raoxunrong.check.accessibility.filter.predicate.LabelMissingPredicate labelMissingPredicate1 = new org.raoxunrong.check.accessibility.filter.predicate.LabelMissingPredicate(webDriver0);
        org.openqa.selenium.WebElement webElement2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = labelMissingPredicate1.apply(webElement2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker3 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        defaultCustomisedDictionary0.addNewWord("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.util.List<org.languagetool.Language> languageList2 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType3 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList2, checkType3);
        java.util.Collection collection5 = collectionItem4.getAdditionalInfo();
        org.languagetool.Language language8 = org.languagetool.Language.DEMO;
        java.util.Locale locale9 = language8.getLocaleWithCountry();
        java.util.Locale locale10 = language8.getLocaleWithCountry();
        java.util.Locale locale11 = language8.getLocaleWithCountry();
        org.languagetool.Language language12 = org.languagetool.Language.DEMO;
        java.util.Locale locale13 = language12.getLocaleWithCountry();
        boolean boolean14 = language12.isExternal();
        java.lang.String str15 = language12.toString();
        org.languagetool.Language language16 = org.languagetool.Language.DEMO;
        java.util.Locale locale17 = language16.getLocaleWithCountry();
        java.util.Locale locale18 = language16.getLocaleWithCountry();
        java.lang.String str19 = language16.toString();
        org.languagetool.Language language20 = org.languagetool.Language.DEMO;
        java.util.Locale locale21 = language20.getLocaleWithCountry();
        boolean boolean22 = language20.isExternal();
        java.lang.String str23 = language20.toString();
        java.lang.String[] strArray24 = language20.getUnpairedRuleStartSymbols();
        boolean boolean25 = language20.isVariant();
        org.languagetool.Language language26 = org.languagetool.Language.DEMO;
        java.util.Locale locale27 = language26.getLocaleWithCountry();
        java.util.Locale locale28 = language26.getLocaleWithCountry();
        java.lang.String str29 = language26.toString();
        org.languagetool.Language language30 = org.languagetool.Language.DEMO;
        java.util.Locale locale31 = language30.getLocaleWithCountry();
        boolean boolean32 = language30.isExternal();
        java.lang.String str33 = language30.toString();
        boolean boolean34 = language30.isExternal();
        org.languagetool.Language language35 = org.languagetool.Language.DEMO;
        java.util.Locale locale36 = language35.getLocaleWithCountry();
        java.util.Locale locale37 = language35.getLocaleWithCountry();
        java.util.Locale locale38 = language35.getLocaleWithCountry();
        org.languagetool.Language language39 = org.languagetool.Language.DEMO;
        java.util.Locale locale40 = language39.getLocaleWithCountry();
        boolean boolean41 = language39.isExternal();
        java.lang.String str42 = language39.toString();
        org.languagetool.Language language43 = org.languagetool.Language.DEMO;
        java.util.Locale locale44 = language43.getLocaleWithCountry();
        java.lang.String str45 = language43.toString();
        org.languagetool.Language language46 = org.languagetool.Language.DEMO;
        java.util.Locale locale47 = language46.getLocaleWithCountry();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker48 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language46);
        org.languagetool.Language language49 = org.languagetool.Language.DEMO;
        java.util.Locale locale50 = language49.getLocaleWithCountry();
        java.util.Locale locale51 = language49.getLocaleWithCountry();
        org.languagetool.Language language52 = org.languagetool.Language.DEMO;
        org.languagetool.rules.patterns.Unifier unifier53 = language52.getDisambiguationUnifier();
        org.languagetool.Language language54 = org.languagetool.Language.DEMO;
        java.util.Locale locale55 = language54.getLocaleWithCountry();
        java.util.Locale locale56 = language54.getLocaleWithCountry();
        java.util.Locale locale57 = language54.getLocaleWithCountry();
        org.languagetool.Language language58 = org.languagetool.Language.DEMO;
        java.util.Locale locale59 = language58.getLocaleWithCountry();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker60 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language58);
        org.languagetool.Language language61 = org.languagetool.Language.DEMO;
        java.util.Locale locale62 = language61.getLocaleWithCountry();
        java.util.Locale locale63 = language61.getLocaleWithCountry();
        java.util.Locale locale64 = language61.getLocaleWithCountry();
        org.languagetool.Language language65 = org.languagetool.Language.DEMO;
        java.util.Locale locale66 = language65.getLocaleWithCountry();
        boolean boolean67 = language65.isExternal();
        java.lang.String str68 = language65.toString();
        java.lang.String[] strArray69 = language65.getUnpairedRuleStartSymbols();
        org.languagetool.Language[] languageArray70 = new org.languagetool.Language[] { language8, language12, language16, language20, language26, language30, language35, language39, language43, language46, language49, language52, language54, language58, language61, language65 };
        java.util.ArrayList<org.languagetool.Language> languageList71 = new java.util.ArrayList<org.languagetool.Language>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<org.languagetool.Language>) languageList71, languageArray70);
        org.raoxunrong.check.CheckType checkType75 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType76 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem77 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType75, checkType76);
        org.raoxunrong.domain.item.CheckedItem<java.util.Collection<org.languagetool.Language>> languageCollectionCheckedItem78 = new org.raoxunrong.domain.item.CheckedItem<java.util.Collection<org.languagetool.Language>>("", false, (java.util.Collection<org.languagetool.Language>) languageList71, checkType76);
        boolean boolean79 = collectionItem4.equals((java.lang.Object) languageList71);
        org.junit.Assert.assertNotNull(languageList2);
        org.junit.Assert.assertTrue("'" + checkType3 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType3.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(language8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Testlanguage" + "'", str15, "Testlanguage");
        org.junit.Assert.assertNotNull(language16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Testlanguage" + "'", str19, "Testlanguage");
        org.junit.Assert.assertNotNull(language20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Testlanguage" + "'", str23, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(language26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Testlanguage" + "'", str29, "Testlanguage");
        org.junit.Assert.assertNotNull(language30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Testlanguage" + "'", str33, "Testlanguage");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(language35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Testlanguage" + "'", str42, "Testlanguage");
        org.junit.Assert.assertNotNull(language43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Testlanguage" + "'", str45, "Testlanguage");
        org.junit.Assert.assertNotNull(language46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language52);
        org.junit.Assert.assertNotNull(unifier53);
        org.junit.Assert.assertNotNull(language54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Testlanguage" + "'", str68, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(languageArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + checkType75 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType75.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType76 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType76.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType0 = org.raoxunrong.check.accessibility.AccessibilityType.ElementDeprecated;
        java.lang.String str1 = accessibilityType0.getDescription();
        org.junit.Assert.assertTrue("'" + accessibilityType0 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.ElementDeprecated + "'", accessibilityType0.equals(org.raoxunrong.check.accessibility.AccessibilityType.ElementDeprecated));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A deprecated element is present, such as <marquee> or <blink>." + "'", str1, "A deprecated element is present, such as <marquee> or <blink>.");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter deprecatedElementsFilter5 = new org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter();
        boolean boolean6 = collectionItem4.equals((java.lang.Object) deprecatedElementsFilter5);
        java.util.Collection collection7 = collectionItem4.getAdditionalInfo();
        org.languagetool.Language language10 = org.languagetool.Language.DEMO;
        java.util.Locale locale11 = language10.getLocaleWithCountry();
        java.util.Locale locale12 = language10.getLocaleWithCountry();
        java.util.Locale locale13 = language10.getLocaleWithCountry();
        org.languagetool.Language language14 = org.languagetool.Language.DEMO;
        java.util.Locale locale15 = language14.getLocaleWithCountry();
        boolean boolean16 = language14.isExternal();
        java.lang.String str17 = language14.toString();
        org.languagetool.Language language18 = org.languagetool.Language.DEMO;
        java.util.Locale locale19 = language18.getLocaleWithCountry();
        java.util.Locale locale20 = language18.getLocaleWithCountry();
        java.lang.String str21 = language18.toString();
        org.languagetool.Language language22 = org.languagetool.Language.DEMO;
        java.util.Locale locale23 = language22.getLocaleWithCountry();
        boolean boolean24 = language22.isExternal();
        java.lang.String str25 = language22.toString();
        java.lang.String[] strArray26 = language22.getUnpairedRuleStartSymbols();
        boolean boolean27 = language22.isVariant();
        org.languagetool.Language language28 = org.languagetool.Language.DEMO;
        java.util.Locale locale29 = language28.getLocaleWithCountry();
        java.util.Locale locale30 = language28.getLocaleWithCountry();
        java.lang.String str31 = language28.toString();
        org.languagetool.Language language32 = org.languagetool.Language.DEMO;
        java.util.Locale locale33 = language32.getLocaleWithCountry();
        boolean boolean34 = language32.isExternal();
        java.lang.String str35 = language32.toString();
        boolean boolean36 = language32.isExternal();
        org.languagetool.Language language37 = org.languagetool.Language.DEMO;
        java.util.Locale locale38 = language37.getLocaleWithCountry();
        java.util.Locale locale39 = language37.getLocaleWithCountry();
        java.util.Locale locale40 = language37.getLocaleWithCountry();
        org.languagetool.Language language41 = org.languagetool.Language.DEMO;
        java.util.Locale locale42 = language41.getLocaleWithCountry();
        boolean boolean43 = language41.isExternal();
        java.lang.String str44 = language41.toString();
        org.languagetool.Language language45 = org.languagetool.Language.DEMO;
        java.util.Locale locale46 = language45.getLocaleWithCountry();
        java.lang.String str47 = language45.toString();
        org.languagetool.Language language48 = org.languagetool.Language.DEMO;
        java.util.Locale locale49 = language48.getLocaleWithCountry();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker50 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language48);
        org.languagetool.Language language51 = org.languagetool.Language.DEMO;
        java.util.Locale locale52 = language51.getLocaleWithCountry();
        java.util.Locale locale53 = language51.getLocaleWithCountry();
        org.languagetool.Language language54 = org.languagetool.Language.DEMO;
        org.languagetool.rules.patterns.Unifier unifier55 = language54.getDisambiguationUnifier();
        org.languagetool.Language language56 = org.languagetool.Language.DEMO;
        java.util.Locale locale57 = language56.getLocaleWithCountry();
        java.util.Locale locale58 = language56.getLocaleWithCountry();
        java.util.Locale locale59 = language56.getLocaleWithCountry();
        org.languagetool.Language language60 = org.languagetool.Language.DEMO;
        java.util.Locale locale61 = language60.getLocaleWithCountry();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker62 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language60);
        org.languagetool.Language language63 = org.languagetool.Language.DEMO;
        java.util.Locale locale64 = language63.getLocaleWithCountry();
        java.util.Locale locale65 = language63.getLocaleWithCountry();
        java.util.Locale locale66 = language63.getLocaleWithCountry();
        org.languagetool.Language language67 = org.languagetool.Language.DEMO;
        java.util.Locale locale68 = language67.getLocaleWithCountry();
        boolean boolean69 = language67.isExternal();
        java.lang.String str70 = language67.toString();
        java.lang.String[] strArray71 = language67.getUnpairedRuleStartSymbols();
        org.languagetool.Language[] languageArray72 = new org.languagetool.Language[] { language10, language14, language18, language22, language28, language32, language37, language41, language45, language48, language51, language54, language56, language60, language63, language67 };
        java.util.ArrayList<org.languagetool.Language> languageList73 = new java.util.ArrayList<org.languagetool.Language>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<org.languagetool.Language>) languageList73, languageArray72);
        org.raoxunrong.check.CheckType checkType77 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType78 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem79 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType77, checkType78);
        org.raoxunrong.domain.item.CheckedItem<java.util.Collection<org.languagetool.Language>> languageCollectionCheckedItem80 = new org.raoxunrong.domain.item.CheckedItem<java.util.Collection<org.languagetool.Language>>("", false, (java.util.Collection<org.languagetool.Language>) languageList73, checkType78);
        boolean boolean81 = collectionItem4.equals((java.lang.Object) false);
        java.util.Collection collection82 = collectionItem4.getAdditionalInfo();
        org.raoxunrong.check.CheckType checkType83 = collectionItem4.getCheckType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertNotNull(language10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Testlanguage" + "'", str17, "Testlanguage");
        org.junit.Assert.assertNotNull(language18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Testlanguage" + "'", str21, "Testlanguage");
        org.junit.Assert.assertNotNull(language22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Testlanguage" + "'", str25, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(language28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Testlanguage" + "'", str31, "Testlanguage");
        org.junit.Assert.assertNotNull(language32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Testlanguage" + "'", str35, "Testlanguage");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(language37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Testlanguage" + "'", str44, "Testlanguage");
        org.junit.Assert.assertNotNull(language45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Testlanguage" + "'", str47, "Testlanguage");
        org.junit.Assert.assertNotNull(language48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language54);
        org.junit.Assert.assertNotNull(unifier55);
        org.junit.Assert.assertNotNull(language56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Testlanguage" + "'", str70, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(languageArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + checkType77 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType77.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType78 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType78.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(collection82);
        org.junit.Assert.assertNull(checkType83);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.languagetool.Language language1 = org.languagetool.Language.getLanguageForShortName("xx-XX");
        java.lang.String str2 = language1.getShortNameWithVariant();
        java.util.ResourceBundle resourceBundle3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = language1.getTranslatedName(resourceBundle3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(language1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xx-XX" + "'", str2, "xx-XX");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary1 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("A deprecated element is present, such as <marquee> or <blink>.");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: A deprecated element is present, such as <marquee> or <blink>. is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.openqa.selenium.WebDriver webDriver0 = null;
        org.raoxunrong.check.accessibility.filter.predicate.AnchorMissingPredicate anchorMissingPredicate1 = new org.raoxunrong.check.accessibility.filter.predicate.AnchorMissingPredicate(webDriver0);
        org.openqa.selenium.WebDriver webDriver2 = anchorMissingPredicate1.getWebDriver();
        org.openqa.selenium.WebElement webElement3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = anchorMissingPredicate1.apply(webElement3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(webDriver2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.util.List<java.lang.String> strList2 = language0.getRuleFileName();
        org.languagetool.Language language3 = org.languagetool.Language.DEMO;
        java.util.Locale locale4 = language3.getLocaleWithCountry();
        java.lang.String str5 = language3.toString();
        boolean boolean6 = language3.isExternal();
        boolean boolean7 = language3.isVariant();
        boolean boolean8 = language0.equalsConsiderVariantsIfSpecified(language3);
        java.lang.String str9 = language3.getShortNameWithVariant();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker10 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language3);
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(language3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Testlanguage" + "'", str5, "Testlanguage");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "xx-XX" + "'", str9, "xx-XX");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem7 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType5, checkType6);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem8 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType5);
        java.lang.String str9 = plainTextItem8.getAdditionalInfo();
        org.languagetool.Language language10 = org.languagetool.Language.DEMO;
        org.languagetool.rules.patterns.Unifier unifier11 = language10.getDisambiguationUnifier();
        boolean boolean12 = plainTextItem8.equals((java.lang.Object) unifier11);
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(language10);
        org.junit.Assert.assertNotNull(unifier11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter deprecatedElementsFilter5 = new org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter();
        boolean boolean6 = collectionItem4.equals((java.lang.Object) deprecatedElementsFilter5);
        org.raoxunrong.domain.page.CheckablePage checkablePage7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.openqa.selenium.WebElement> webElementCollection8 = deprecatedElementsFilter5.filter(checkablePage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.openqa.selenium.WebDriver webDriver0 = null;
        org.raoxunrong.check.accessibility.filter.predicate.AnchorMissingPredicate anchorMissingPredicate1 = new org.raoxunrong.check.accessibility.filter.predicate.AnchorMissingPredicate(webDriver0);
        org.openqa.selenium.WebElement webElement2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = anchorMissingPredicate1.apply(webElement2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.lang.String str2 = language0.toString();
        org.languagetool.Language language3 = org.languagetool.Language.DEMO;
        java.util.Locale locale4 = language3.getLocaleWithCountry();
        java.lang.String str5 = language3.toString();
        boolean boolean6 = language3.isExternal();
        boolean boolean7 = language3.isVariant();
        boolean boolean8 = language0.equalsConsiderVariantsIfSpecified(language3);
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Testlanguage" + "'", str2, "Testlanguage");
        org.junit.Assert.assertNotNull(language3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Testlanguage" + "'", str5, "Testlanguage");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter deprecatedElementsFilter0 = new org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.openqa.selenium.WebElement> webElementCollection2 = deprecatedElementsFilter0.filter(checkablePage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.raoxunrong.check.CheckType checkType3 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType4 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem5 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType3, checkType4);
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.utils.CheckedItemStatistic.generateReport("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);", checkType4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Directory 'var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);' could not be created");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkType3 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType3.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType4 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType4.equals(org.raoxunrong.check.CheckType.SpellingCheck));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary1 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("Testlanguage");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: Testlanguage is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker2 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        java.lang.String str3 = language0.toString();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.openqa.selenium.WebDriver webDriver0 = null;
        org.raoxunrong.check.accessibility.filter.predicate.LabelMissingPredicate labelMissingPredicate1 = new org.raoxunrong.check.accessibility.filter.predicate.LabelMissingPredicate(webDriver0);
        org.openqa.selenium.WebElement webElement2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = labelMissingPredicate1.apply(webElement2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.lang.String str2 = language0.toString();
        boolean boolean3 = language0.isExternal();
        boolean boolean4 = language0.isVariant();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker5 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        java.util.List<java.lang.String> strList6 = language0.getRuleFileName();
        java.util.Locale locale7 = language0.getLocale();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Testlanguage" + "'", str2, "Testlanguage");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.languagetool.Language language1 = org.languagetool.Language.getLanguageForShortName("xx-XX");
        java.lang.String str2 = language1.getShortNameWithVariant();
        java.lang.String[] strArray3 = language1.getUnpairedRuleEndSymbols();
        org.junit.Assert.assertNotNull(language1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xx-XX" + "'", str2, "xx-XX");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl0 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter2 = webElementsFilterFactoryImpl0.buildFilter(accessibilityType1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.util.List<java.lang.String> strList2 = language0.getRuleFileName();
        org.languagetool.Language language3 = org.languagetool.Language.DEMO;
        java.util.Locale locale4 = language3.getLocaleWithCountry();
        java.lang.String str5 = language3.toString();
        boolean boolean6 = language3.isExternal();
        boolean boolean7 = language3.isVariant();
        boolean boolean8 = language0.equalsConsiderVariantsIfSpecified(language3);
        java.util.ResourceBundle resourceBundle9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = language3.getTranslatedName(resourceBundle9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(language3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Testlanguage" + "'", str5, "Testlanguage");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter deprecatedElementsFilter5 = new org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter();
        boolean boolean6 = collectionItem4.equals((java.lang.Object) deprecatedElementsFilter5);
        java.util.Collection collection7 = collectionItem4.getAdditionalInfo();
        java.util.Collection collection8 = collectionItem4.getAdditionalInfo();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.util.Locale locale2 = language0.getLocaleWithCountry();
        java.lang.String str3 = language0.toString();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker4 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        org.raoxunrong.domain.page.CheckablePage checkablePage5 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageToolChecker4.doCheck(checkablePage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.raoxunrong.domain.item.ElementDescription elementDescription2 = new org.raoxunrong.domain.item.ElementDescription("hi!", "");
        java.lang.String str3 = elementDescription2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:" + "'", str3, "hi!:");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter deprecatedElementsFilter5 = new org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter();
        boolean boolean6 = collectionItem4.equals((java.lang.Object) deprecatedElementsFilter5);
        java.util.Collection collection7 = collectionItem4.getAdditionalInfo();
        org.languagetool.Language language10 = org.languagetool.Language.DEMO;
        java.util.Locale locale11 = language10.getLocaleWithCountry();
        java.util.Locale locale12 = language10.getLocaleWithCountry();
        java.util.Locale locale13 = language10.getLocaleWithCountry();
        org.languagetool.Language language14 = org.languagetool.Language.DEMO;
        java.util.Locale locale15 = language14.getLocaleWithCountry();
        boolean boolean16 = language14.isExternal();
        java.lang.String str17 = language14.toString();
        org.languagetool.Language language18 = org.languagetool.Language.DEMO;
        java.util.Locale locale19 = language18.getLocaleWithCountry();
        java.util.Locale locale20 = language18.getLocaleWithCountry();
        java.lang.String str21 = language18.toString();
        org.languagetool.Language language22 = org.languagetool.Language.DEMO;
        java.util.Locale locale23 = language22.getLocaleWithCountry();
        boolean boolean24 = language22.isExternal();
        java.lang.String str25 = language22.toString();
        java.lang.String[] strArray26 = language22.getUnpairedRuleStartSymbols();
        boolean boolean27 = language22.isVariant();
        org.languagetool.Language language28 = org.languagetool.Language.DEMO;
        java.util.Locale locale29 = language28.getLocaleWithCountry();
        java.util.Locale locale30 = language28.getLocaleWithCountry();
        java.lang.String str31 = language28.toString();
        org.languagetool.Language language32 = org.languagetool.Language.DEMO;
        java.util.Locale locale33 = language32.getLocaleWithCountry();
        boolean boolean34 = language32.isExternal();
        java.lang.String str35 = language32.toString();
        boolean boolean36 = language32.isExternal();
        org.languagetool.Language language37 = org.languagetool.Language.DEMO;
        java.util.Locale locale38 = language37.getLocaleWithCountry();
        java.util.Locale locale39 = language37.getLocaleWithCountry();
        java.util.Locale locale40 = language37.getLocaleWithCountry();
        org.languagetool.Language language41 = org.languagetool.Language.DEMO;
        java.util.Locale locale42 = language41.getLocaleWithCountry();
        boolean boolean43 = language41.isExternal();
        java.lang.String str44 = language41.toString();
        org.languagetool.Language language45 = org.languagetool.Language.DEMO;
        java.util.Locale locale46 = language45.getLocaleWithCountry();
        java.lang.String str47 = language45.toString();
        org.languagetool.Language language48 = org.languagetool.Language.DEMO;
        java.util.Locale locale49 = language48.getLocaleWithCountry();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker50 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language48);
        org.languagetool.Language language51 = org.languagetool.Language.DEMO;
        java.util.Locale locale52 = language51.getLocaleWithCountry();
        java.util.Locale locale53 = language51.getLocaleWithCountry();
        org.languagetool.Language language54 = org.languagetool.Language.DEMO;
        org.languagetool.rules.patterns.Unifier unifier55 = language54.getDisambiguationUnifier();
        org.languagetool.Language language56 = org.languagetool.Language.DEMO;
        java.util.Locale locale57 = language56.getLocaleWithCountry();
        java.util.Locale locale58 = language56.getLocaleWithCountry();
        java.util.Locale locale59 = language56.getLocaleWithCountry();
        org.languagetool.Language language60 = org.languagetool.Language.DEMO;
        java.util.Locale locale61 = language60.getLocaleWithCountry();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker62 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language60);
        org.languagetool.Language language63 = org.languagetool.Language.DEMO;
        java.util.Locale locale64 = language63.getLocaleWithCountry();
        java.util.Locale locale65 = language63.getLocaleWithCountry();
        java.util.Locale locale66 = language63.getLocaleWithCountry();
        org.languagetool.Language language67 = org.languagetool.Language.DEMO;
        java.util.Locale locale68 = language67.getLocaleWithCountry();
        boolean boolean69 = language67.isExternal();
        java.lang.String str70 = language67.toString();
        java.lang.String[] strArray71 = language67.getUnpairedRuleStartSymbols();
        org.languagetool.Language[] languageArray72 = new org.languagetool.Language[] { language10, language14, language18, language22, language28, language32, language37, language41, language45, language48, language51, language54, language56, language60, language63, language67 };
        java.util.ArrayList<org.languagetool.Language> languageList73 = new java.util.ArrayList<org.languagetool.Language>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<org.languagetool.Language>) languageList73, languageArray72);
        org.raoxunrong.check.CheckType checkType77 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType78 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem79 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType77, checkType78);
        org.raoxunrong.domain.item.CheckedItem<java.util.Collection<org.languagetool.Language>> languageCollectionCheckedItem80 = new org.raoxunrong.domain.item.CheckedItem<java.util.Collection<org.languagetool.Language>>("", false, (java.util.Collection<org.languagetool.Language>) languageList73, checkType78);
        boolean boolean81 = collectionItem4.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass82 = collectionItem4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertNotNull(language10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Testlanguage" + "'", str17, "Testlanguage");
        org.junit.Assert.assertNotNull(language18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Testlanguage" + "'", str21, "Testlanguage");
        org.junit.Assert.assertNotNull(language22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Testlanguage" + "'", str25, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(language28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Testlanguage" + "'", str31, "Testlanguage");
        org.junit.Assert.assertNotNull(language32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Testlanguage" + "'", str35, "Testlanguage");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(language37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Testlanguage" + "'", str44, "Testlanguage");
        org.junit.Assert.assertNotNull(language45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Testlanguage" + "'", str47, "Testlanguage");
        org.junit.Assert.assertNotNull(language48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language54);
        org.junit.Assert.assertNotNull(unifier55);
        org.junit.Assert.assertNotNull(language56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Testlanguage" + "'", str70, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(languageArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + checkType77 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType77.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType78 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType78.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker3 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        org.raoxunrong.domain.page.CheckablePage checkablePage4 = null;
        // The following exception was thrown during execution in test generation
        try {
            firefoxSpellCheckerImprovedChecker3.doCheck(checkablePage4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary1 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        boolean boolean6 = collectionItem4.isPass();
        java.util.Collection collection7 = collectionItem4.getAdditionalInfo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(collection7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker3 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        defaultCustomisedDictionary0.addNewWord("");
        boolean boolean7 = defaultCustomisedDictionary0.isWord("xx-XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.util.List<java.lang.String> strList2 = language0.getRuleFileName();
        org.languagetool.Language language3 = org.languagetool.Language.DEMO;
        java.util.Locale locale4 = language3.getLocaleWithCountry();
        java.lang.String str5 = language3.toString();
        boolean boolean6 = language3.isExternal();
        boolean boolean7 = language3.isVariant();
        boolean boolean8 = language0.equalsConsiderVariantsIfSpecified(language3);
        java.lang.String str9 = language3.getShortNameWithVariant();
        org.languagetool.tokenizers.Tokenizer tokenizer10 = language3.getWordTokenizer();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(language3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Testlanguage" + "'", str5, "Testlanguage");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "xx-XX" + "'", str9, "xx-XX");
        org.junit.Assert.assertNotNull(tokenizer10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.languagetool.Language language1 = org.languagetool.Language.getLanguageForName("");
        org.junit.Assert.assertNull(language1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.languagetool.Language[] languageArray0 = null;
        org.languagetool.Language.LANGUAGES = languageArray0;
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl0 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType1 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter2 = webElementsFilterFactoryImpl0.buildFilter(accessibilityType1);
        org.raoxunrong.domain.page.CheckablePage checkablePage3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.openqa.selenium.WebElement> webElementCollection4 = webElementFilter2.filter(checkablePage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessibilityType1 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType1.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertNotNull(webElementFilter2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary1 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("A form label is present, but it is not associated with any form element");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: A form label is present, but it is not associated with any form element is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        boolean boolean4 = defaultCustomisedDictionary0.isWord("");
        boolean boolean6 = defaultCustomisedDictionary0.isWord("");
        defaultCustomisedDictionary0.addNewWord("hi!");
        boolean boolean10 = defaultCustomisedDictionary0.isWord("hi!:hi!");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker11 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary2 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("hi!", "hi!:");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        java.lang.String str2 = org.raoxunrong.check.JavascriptGenerator.generateDispatchEventScript("xx-XX", "var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"xx-XX\");element.dispatchEvent(evt);" + "'", str2, "var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"xx-XX\");element.dispatchEvent(evt);");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker2 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        org.raoxunrong.domain.page.CheckablePage checkablePage3 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageToolChecker2.doCheck(checkablePage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.lang.String str2 = org.raoxunrong.check.JavascriptGenerator.generateDispatchEventScript("English (US)", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "var evt = document.createEvent(\"Events\");evt.initEvent(\"hi!\", true, false);var element = document.getElementById(\"English (US)\");element.dispatchEvent(evt);" + "'", str2, "var evt = document.createEvent(\"Events\");evt.initEvent(\"hi!\", true, false);var element = document.getElementById(\"English (US)\");element.dispatchEvent(evt);");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.util.ResourceBundle resourceBundle0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.languagetool.Language.getAllMaintainers(resourceBundle0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.raoxunrong.check.CheckType checkType2 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType3 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem4 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType2, checkType3);
        java.lang.Class<?> wildcardClass5 = checkType3.getClass();
        org.junit.Assert.assertTrue("'" + checkType2 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType2.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType3 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType3.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType5 = org.raoxunrong.check.accessibility.AccessibilityType.LabelMissing;
        java.lang.String str6 = accessibilityType5.getDescription();
        boolean boolean7 = collectionItem4.equals((java.lang.Object) str6);
        org.junit.Assert.assertTrue("'" + accessibilityType5 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelMissing + "'", accessibilityType5.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelMissing));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A form element does not have a corresponding label or has more than 1 corresponding label." + "'", str6, "A form element does not have a corresponding label or has more than 1 corresponding label.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary1 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("var evt = document.createEvent(\"Events\");evt.initEvent(\"hi!\", true, false);var element = document.getElementById(\"English (US)\");element.dispatchEvent(evt);");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: var evt = document.createEvent(\"Events\");evt.initEvent(\"hi!\", true, false);var element = document.getElementById(\"English (US)\");element.dispatchEvent(evt); is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        boolean boolean7 = collectionItem4.isPass();
        org.raoxunrong.check.CheckType checkType8 = collectionItem4.getCheckType();
        java.util.Collection collection9 = collectionItem4.getAdditionalInfo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(checkType8);
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.raoxunrong.demo.CheckDemo checkDemo0 = new org.raoxunrong.demo.CheckDemo();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.util.Locale locale2 = language0.getLocaleWithCountry();
        java.lang.String str3 = language0.toString();
        java.lang.String str4 = language0.getShortNameWithVariant();
        java.lang.Class<?> wildcardClass5 = language0.getClass();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "xx-XX" + "'", str4, "xx-XX");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        boolean boolean4 = defaultCustomisedDictionary0.isWord("");
        boolean boolean6 = defaultCustomisedDictionary0.isWord("");
        defaultCustomisedDictionary0.addNewWord("");
        boolean boolean10 = defaultCustomisedDictionary0.isWord("A form element does not have a corresponding label or has more than 1 corresponding label.");
        defaultCustomisedDictionary0.addNewWord("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary2 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);", "var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt); is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem7 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType5, checkType6);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem8 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType5);
        org.raoxunrong.check.CheckType checkType9 = plainTextItem8.getCheckType();
        java.lang.String str10 = plainTextItem8.getItemName();
        org.raoxunrong.check.CheckType checkType16 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType17 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem18 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType16, checkType17);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem19 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType16);
        org.raoxunrong.check.CheckType checkType20 = plainTextItem19.getCheckType();
        java.lang.String str21 = plainTextItem19.getItemName();
        org.raoxunrong.check.CheckType checkType22 = plainTextItem19.getCheckType();
        boolean boolean23 = plainTextItem8.equals((java.lang.Object) plainTextItem19);
        org.raoxunrong.check.CheckType checkType24 = plainTextItem19.getCheckType();
        org.raoxunrong.utils.CheckedItemStatistic.addCheckedItem((org.raoxunrong.domain.item.CheckedItem) plainTextItem19);
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType9 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType9.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + checkType16 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType16.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType17 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType17.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType20 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType20.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + checkType22 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType22.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + checkType24 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType24.equals(org.raoxunrong.check.CheckType.SpellingCheck));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.lang.String str2 = org.raoxunrong.check.JavascriptGenerator.generateDispatchEventScript("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);", "var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"xx-XX\");element.dispatchEvent(evt);");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"xx-XX\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);\");element.dispatchEvent(evt);" + "'", str2, "var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"xx-XX\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);\");element.dispatchEvent(evt);");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        boolean boolean4 = defaultCustomisedDictionary0.isWord("");
        boolean boolean6 = defaultCustomisedDictionary0.isWord("");
        defaultCustomisedDictionary0.addNewWord("");
        defaultCustomisedDictionary0.addNewWord("hi!:hi!");
        defaultCustomisedDictionary0.addNewWord("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker3 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        defaultCustomisedDictionary0.addNewWord("");
        defaultCustomisedDictionary0.addNewWord("var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);");
        defaultCustomisedDictionary0.addNewWord("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.raoxunrong.domain.item.ElementDescription elementDescription2 = new org.raoxunrong.domain.item.ElementDescription("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);", "hi!:hi!");
        java.lang.String str3 = elementDescription2.toString();
        java.lang.String str4 = elementDescription2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);:hi!:hi!" + "'", str3, "var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);:hi!:hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);:hi!:hi!" + "'", str4, "var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);:hi!:hi!");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary2 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("hi!", "A form label is present, but it is not associated with any form element");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker3 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        defaultCustomisedDictionary0.addNewWord("");
        boolean boolean7 = defaultCustomisedDictionary0.isWord("Testlanguage");
        boolean boolean9 = defaultCustomisedDictionary0.isWord("xx-XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.util.List<java.lang.String> strList2 = language0.getRuleFileName();
        boolean boolean3 = language0.isExternal();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker4 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        org.raoxunrong.domain.page.CheckablePage checkablePage5 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageToolChecker4.doCheck(checkablePage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.util.List<org.languagetool.Language> languageList2 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType3 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        org.junit.Assert.assertNotNull(languageList2);
        org.junit.Assert.assertTrue("'" + checkType3 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType3.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.languagetool.Language language1 = org.languagetool.Language.getLanguageForLocale(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.raoxunrong.domain.item.ElementDescription elementDescription2 = new org.raoxunrong.domain.item.ElementDescription("hi!:", "English (US)");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.util.Locale locale2 = language0.getLocale();
        boolean boolean3 = language0.isExternal();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.openqa.selenium.WebDriver webDriver0 = null;
        org.raoxunrong.check.accessibility.filter.predicate.AnchorMissingPredicate anchorMissingPredicate1 = new org.raoxunrong.check.accessibility.filter.predicate.AnchorMissingPredicate(webDriver0);
        org.openqa.selenium.WebElement webElement2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = anchorMissingPredicate1.apply(webElement2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl0 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType1 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter2 = webElementsFilterFactoryImpl0.buildFilter(accessibilityType1);
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType3 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter4 = webElementsFilterFactoryImpl0.buildFilter(accessibilityType3);
        java.lang.String str5 = accessibilityType3.getDescription();
        org.junit.Assert.assertTrue("'" + accessibilityType1 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType1.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertNotNull(webElementFilter2);
        org.junit.Assert.assertTrue("'" + accessibilityType3 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType3.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertNotNull(webElementFilter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A form label is present, but it is not associated with any form element" + "'", str5, "A form label is present, but it is not associated with any form element");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        java.lang.String[] strArray4 = language0.getUnpairedRuleStartSymbols();
        java.lang.String str5 = language0.toString();
        java.lang.String str6 = language0.getShortNameWithVariant();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Testlanguage" + "'", str5, "Testlanguage");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "xx-XX" + "'", str6, "xx-XX");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.util.List<java.lang.String> strList3 = language0.getRuleFileName();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.lang.String str2 = org.raoxunrong.check.JavascriptGenerator.generateDispatchEventScript("The title is missing or not descriptive for the page or frame.", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"The title is missing or not descriptive for the page or frame.\");element.dispatchEvent(evt);" + "'", str2, "var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"The title is missing or not descriptive for the page or frame.\");element.dispatchEvent(evt);");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        boolean boolean7 = collectionItem4.isPass();
        java.util.Collection collection8 = collectionItem4.getAdditionalInfo();
        org.raoxunrong.check.CheckType checkType9 = collectionItem4.getCheckType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertNull(checkType9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        boolean boolean7 = collectionItem4.isPass();
        boolean boolean8 = collectionItem4.isPass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary1 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt); is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl0 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl1 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType2 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter3 = webElementsFilterFactoryImpl1.buildFilter(accessibilityType2);
        java.lang.String str4 = accessibilityType2.getDescription();
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter5 = webElementsFilterFactoryImpl0.buildFilter(accessibilityType2);
        org.raoxunrong.domain.page.CheckablePage checkablePage6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.openqa.selenium.WebElement> webElementCollection7 = webElementFilter5.filter(checkablePage6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessibilityType2 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType2.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertNotNull(webElementFilter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A form label is present, but it is not associated with any form element" + "'", str4, "A form label is present, but it is not associated with any form element");
        org.junit.Assert.assertNotNull(webElementFilter5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.raoxunrong.domain.item.ElementDescription elementDescription2 = new org.raoxunrong.domain.item.ElementDescription("hi!", "var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"The title is missing or not descriptive for the page or frame.\");element.dispatchEvent(evt);");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl accessibilityResultFilterImpl0 = new org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl2 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType3 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter4 = webElementsFilterFactoryImpl2.buildFilter(accessibilityType3);
        java.lang.String str5 = accessibilityType3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.raoxunrong.domain.item.ElementDescription> elementDescriptionCollection6 = accessibilityResultFilterImpl0.filterErrorElements(checkablePage1, accessibilityType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessibilityType3 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType3.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertNotNull(webElementFilter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A form label is present, but it is not associated with any form element" + "'", str5, "A form label is present, but it is not associated with any form element");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        boolean boolean4 = defaultCustomisedDictionary0.isWord("");
        boolean boolean6 = defaultCustomisedDictionary0.isWord("");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker7 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        boolean boolean9 = defaultCustomisedDictionary0.isWord("var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"The title is missing or not descriptive for the page or frame.\");element.dispatchEvent(evt);");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.raoxunrong.check.accessibility.filter.AnchorMissingFilter anchorMissingFilter0 = new org.raoxunrong.check.accessibility.filter.AnchorMissingFilter();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.openqa.selenium.WebElement> webElementCollection2 = anchorMissingFilter0.filter(checkablePage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.util.List<org.languagetool.Language> languageList2 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType3 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList2, checkType3);
        org.raoxunrong.check.CheckType checkType5 = collectionItem4.getCheckType();
        org.raoxunrong.domain.item.ElementDescription elementDescription8 = new org.raoxunrong.domain.item.ElementDescription("var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);", "var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);");
        java.lang.String str9 = elementDescription8.toString();
        boolean boolean10 = collectionItem4.equals((java.lang.Object) elementDescription8);
        org.junit.Assert.assertNotNull(languageList2);
        org.junit.Assert.assertTrue("'" + checkType3 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType3.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);:var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);" + "'", str9, "var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);:var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.languagetool.Language.isLanguageSupported("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: langCode cannot be empty or whitespace only");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.util.List<org.languagetool.Language> languageList4 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem6 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList4, checkType5);
        java.util.List<org.languagetool.Language> languageList9 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType10 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem11 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList9, checkType10);
        org.raoxunrong.check.CheckType checkType12 = collectionItem11.getCheckType();
        org.raoxunrong.domain.item.CheckedItem<java.util.Collection> collectionCheckedItem13 = new org.raoxunrong.domain.item.CheckedItem<java.util.Collection>("A form element does not have a corresponding label or has more than 1 corresponding label.", false, (java.util.Collection) languageList4, checkType12);
        java.util.Collection collection14 = collectionCheckedItem13.getAdditionalInfo();
        org.junit.Assert.assertNotNull(languageList4);
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(languageList9);
        org.junit.Assert.assertTrue("'" + checkType10 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType10.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType12 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType12.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter labelOrphanedFilter2 = new org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter();
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem7 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType5, checkType6);
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter> labelOrphanedFilterCheckedItem8 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter>("", false, labelOrphanedFilter2, checkType5);
        org.raoxunrong.domain.page.CheckablePage checkablePage9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.openqa.selenium.WebElement> webElementCollection10 = labelOrphanedFilter2.filter(checkablePage9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.util.List<org.languagetool.Language> languageList2 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType3 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList2, checkType3);
        java.util.Collection collection5 = collectionItem4.getAdditionalInfo();
        java.lang.Class<?> wildcardClass6 = collection5.getClass();
        org.junit.Assert.assertNotNull(languageList2);
        org.junit.Assert.assertTrue("'" + checkType3 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType3.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary1 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("The title is missing or not descriptive for the page or frame.");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: The title is missing or not descriptive for the page or frame. is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl accessibilityResultFilterImpl0 = new org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl2 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType3 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter4 = webElementsFilterFactoryImpl2.buildFilter(accessibilityType3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.raoxunrong.domain.item.ElementDescription> elementDescriptionCollection5 = accessibilityResultFilterImpl0.filterErrorElements(checkablePage1, accessibilityType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessibilityType3 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType3.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertNotNull(webElementFilter4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        boolean boolean4 = defaultCustomisedDictionary0.isWord("");
        boolean boolean6 = defaultCustomisedDictionary0.isWord("");
        defaultCustomisedDictionary0.addNewWord("");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker9 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker10 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        boolean boolean4 = defaultCustomisedDictionary0.isWord("");
        boolean boolean6 = defaultCustomisedDictionary0.isWord("");
        defaultCustomisedDictionary0.addNewWord("");
        boolean boolean10 = defaultCustomisedDictionary0.isWord("A form element does not have a corresponding label or has more than 1 corresponding label.");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker11 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        defaultCustomisedDictionary0.addNewWord("hi!:hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.util.Locale locale2 = language0.getLocaleWithCountry();
        java.lang.String str3 = language0.toString();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker4 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        java.util.ResourceBundle resourceBundle5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = language0.getTranslatedName(resourceBundle5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        boolean boolean4 = defaultCustomisedDictionary0.isWord("");
        boolean boolean6 = defaultCustomisedDictionary0.isWord("");
        defaultCustomisedDictionary0.addNewWord("");
        boolean boolean10 = defaultCustomisedDictionary0.isWord("A form element does not have a corresponding label or has more than 1 corresponding label.");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker11 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        defaultCustomisedDictionary0.addNewWord("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"xx-XX\");element.dispatchEvent(evt);");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter labelOrphanedFilter0 = new org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.openqa.selenium.WebElement> webElementCollection2 = labelOrphanedFilter0.filter(checkablePage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        org.languagetool.rules.patterns.Unifier unifier1 = language0.getDisambiguationUnifier();
        java.lang.String str2 = language0.getShortNameWithVariant();
        boolean boolean3 = language0.isExternal();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(unifier1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xx-XX" + "'", str2, "xx-XX");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        boolean boolean4 = defaultCustomisedDictionary0.isWord("");
        boolean boolean6 = defaultCustomisedDictionary0.isWord("");
        defaultCustomisedDictionary0.addNewWord("");
        boolean boolean10 = defaultCustomisedDictionary0.isWord("A form element does not have a corresponding label or has more than 1 corresponding label.");
        boolean boolean12 = defaultCustomisedDictionary0.isWord("var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker3 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        defaultCustomisedDictionary0.addNewWord("");
        defaultCustomisedDictionary0.addNewWord("var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);");
        defaultCustomisedDictionary0.addNewWord("");
        defaultCustomisedDictionary0.addNewWord("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);");
        defaultCustomisedDictionary0.addNewWord("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"xx-XX\");element.dispatchEvent(evt);");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl0 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl1 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType2 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter3 = webElementsFilterFactoryImpl1.buildFilter(accessibilityType2);
        java.lang.String str4 = accessibilityType2.getDescription();
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter5 = webElementsFilterFactoryImpl0.buildFilter(accessibilityType2);
        org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl accessibilityResultFilterImpl6 = new org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl((org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactory) webElementsFilterFactoryImpl0);
        org.junit.Assert.assertTrue("'" + accessibilityType2 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType2.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertNotNull(webElementFilter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A form label is present, but it is not associated with any form element" + "'", str4, "A form label is present, but it is not associated with any form element");
        org.junit.Assert.assertNotNull(webElementFilter5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.languagetool.Language[] languageArray0 = org.languagetool.Language.LANGUAGES;
        org.languagetool.Language.LANGUAGES = languageArray0;
        org.junit.Assert.assertNull(languageArray0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        java.util.List<org.languagetool.Language> languageList9 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType10 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem11 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList9, checkType10);
        boolean boolean12 = collectionItem4.equals((java.lang.Object) "hi!");
        java.lang.String str13 = collectionItem4.getItemName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(languageList9);
        org.junit.Assert.assertTrue("'" + checkType10 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType10.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker4 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        java.lang.String str5 = language0.getShortNameWithVariant();
        org.languagetool.rules.patterns.Unifier unifier6 = language0.getUnifier();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "xx-XX" + "'", str5, "xx-XX");
        org.junit.Assert.assertNotNull(unifier6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        boolean boolean7 = collectionItem4.isPass();
        java.lang.Class<?> wildcardClass8 = collectionItem4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl0 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl accessibilityResultFilterImpl1 = new org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl((org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactory) webElementsFilterFactoryImpl0);
        org.raoxunrong.domain.page.CheckablePage checkablePage2 = null;
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl3 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl4 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType5 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter6 = webElementsFilterFactoryImpl4.buildFilter(accessibilityType5);
        java.lang.String str7 = accessibilityType5.getDescription();
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter8 = webElementsFilterFactoryImpl3.buildFilter(accessibilityType5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.raoxunrong.domain.item.ElementDescription> elementDescriptionCollection9 = accessibilityResultFilterImpl1.filterErrorElements(checkablePage2, accessibilityType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessibilityType5 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType5.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertNotNull(webElementFilter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A form label is present, but it is not associated with any form element" + "'", str7, "A form label is present, but it is not associated with any form element");
        org.junit.Assert.assertNotNull(webElementFilter8);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker4 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker5 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType0 = org.raoxunrong.check.accessibility.AccessibilityType.AnchorMissing;
        java.lang.String str1 = accessibilityType0.getDescription();
        org.junit.Assert.assertTrue("'" + accessibilityType0 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.AnchorMissing + "'", accessibilityType0.equals(org.raoxunrong.check.accessibility.AccessibilityType.AnchorMissing));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A anchor link exists, but the anchor for the link does not exist." + "'", str1, "A anchor link exists, but the anchor for the link does not exist.");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.util.Collection collection5 = collectionItem4.getAdditionalInfo();
        org.raoxunrong.check.CheckType checkType6 = collectionItem4.getCheckType();
        org.languagetool.Language language7 = org.languagetool.Language.DEMO;
        java.util.Locale locale8 = language7.getLocaleWithCountry();
        java.util.Locale locale9 = language7.getLocaleWithCountry();
        java.util.Locale locale10 = language7.getLocaleWithCountry();
        org.languagetool.Language language11 = org.languagetool.Language.getLanguageForLocale(locale10);
        java.lang.String str12 = language11.toString();
        boolean boolean13 = collectionItem4.equals((java.lang.Object) str12);
        org.junit.Assert.assertNull(collection5);
        org.junit.Assert.assertNull(checkType6);
        org.junit.Assert.assertNotNull(language7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English (US)" + "'", str12, "English (US)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.lang.String str2 = org.raoxunrong.check.JavascriptGenerator.generateDispatchEventScript("A form element does not have a corresponding label or has more than 1 corresponding label.", "A form element does not have a corresponding label or has more than 1 corresponding label.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "var evt = document.createEvent(\"Events\");evt.initEvent(\"A form element does not have a corresponding label or has more than 1 corresponding label.\", true, false);var element = document.getElementById(\"A form element does not have a corresponding label or has more than 1 corresponding label.\");element.dispatchEvent(evt);" + "'", str2, "var evt = document.createEvent(\"Events\");evt.initEvent(\"A form element does not have a corresponding label or has more than 1 corresponding label.\", true, false);var element = document.getElementById(\"A form element does not have a corresponding label or has more than 1 corresponding label.\");element.dispatchEvent(evt);");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker3 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        defaultCustomisedDictionary0.addNewWord("");
        defaultCustomisedDictionary0.addNewWord("var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);");
        defaultCustomisedDictionary0.addNewWord("");
        boolean boolean11 = defaultCustomisedDictionary0.isWord("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"xx-XX\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);\");element.dispatchEvent(evt);");
        boolean boolean13 = defaultCustomisedDictionary0.isWord("A form element does not have a corresponding label or has more than 1 corresponding label.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        boolean boolean7 = collectionItem4.isPass();
        boolean boolean9 = collectionItem4.equals((java.lang.Object) (short) 10);
        boolean boolean10 = collectionItem4.isPass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.language.Contributor[] contributorArray1 = australianEnglishOnlySpelling0.getMaintainers();
        java.lang.String str2 = australianEnglishOnlySpelling0.getShortName();
        org.junit.Assert.assertNotNull(contributorArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        boolean boolean7 = collectionItem4.isPass();
        java.util.Collection collection8 = collectionItem4.getAdditionalInfo();
        boolean boolean9 = collectionItem4.isPass();
        boolean boolean10 = collectionItem4.isPass();
        java.lang.String str11 = collectionItem4.getItemName();
        java.lang.String str12 = collectionItem4.getItemName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        boolean boolean4 = defaultCustomisedDictionary0.isWord("");
        boolean boolean6 = defaultCustomisedDictionary0.isWord("");
        defaultCustomisedDictionary0.addNewWord("");
        boolean boolean10 = defaultCustomisedDictionary0.isWord("A form element does not have a corresponding label or has more than 1 corresponding label.");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker11 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        org.raoxunrong.domain.page.CheckablePage checkablePage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            firefoxSpellCheckerImprovedChecker11.doCheck(checkablePage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        boolean boolean7 = collectionItem4.isPass();
        org.raoxunrong.check.CheckType checkType13 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType14 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem15 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType13, checkType14);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem16 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType13);
        org.raoxunrong.check.CheckType checkType17 = plainTextItem16.getCheckType();
        java.lang.String str18 = plainTextItem16.getItemName();
        org.raoxunrong.check.CheckType checkType24 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType25 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem26 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType24, checkType25);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem27 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType24);
        org.raoxunrong.check.CheckType checkType28 = plainTextItem27.getCheckType();
        java.lang.String str29 = plainTextItem27.getItemName();
        org.raoxunrong.check.CheckType checkType30 = plainTextItem27.getCheckType();
        boolean boolean31 = plainTextItem16.equals((java.lang.Object) plainTextItem27);
        org.raoxunrong.check.CheckType checkType32 = plainTextItem27.getCheckType();
        boolean boolean33 = collectionItem4.equals((java.lang.Object) checkType32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + checkType13 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType13.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType14 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType14.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType17 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType17.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + checkType24 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType24.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType25 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType25.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType28 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType28.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + checkType30 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType30.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + checkType32 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType32.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        java.lang.String[] strArray4 = language0.getUnpairedRuleStartSymbols();
        java.lang.String str5 = language0.toString();
        java.util.Locale locale6 = language0.getLocale();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Testlanguage" + "'", str5, "Testlanguage");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl0 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl accessibilityResultFilterImpl1 = new org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl((org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactory) webElementsFilterFactoryImpl0);
        org.raoxunrong.domain.page.CheckablePage checkablePage2 = null;
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType3 = org.raoxunrong.check.accessibility.AccessibilityType.LabelMissing;
        java.lang.String str4 = accessibilityType3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.raoxunrong.domain.item.ElementDescription> elementDescriptionCollection5 = accessibilityResultFilterImpl1.filterErrorElements(checkablePage2, accessibilityType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessibilityType3 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelMissing + "'", accessibilityType3.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelMissing));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A form element does not have a corresponding label or has more than 1 corresponding label." + "'", str4, "A form element does not have a corresponding label or has more than 1 corresponding label.");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.lang.String str1 = org.raoxunrong.utils.HTMLTextLoader.getText("var evt = document.createEvent(\"Events\");evt.initEvent(\"A form element does not have a corresponding label or has more than 1 corresponding label.\", true, false);var element = document.getElementById(\"A form element does not have a corresponding label or has more than 1 corresponding label.\");element.dispatchEvent(evt);");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "var evt = document.createEvent(\"Events\");evt.initEvent(\"A form element does not have a corresponding label or has more than 1 corresponding label.\", true, false);var element = document.getElementById(\"A form element does not have a corresponding label or has more than 1 corresponding label.\");element.dispatchEvent(evt);" + "'", str1, "var evt = document.createEvent(\"Events\");evt.initEvent(\"A form element does not have a corresponding label or has more than 1 corresponding label.\", true, false);var element = document.getElementById(\"A form element does not have a corresponding label or has more than 1 corresponding label.\");element.dispatchEvent(evt);");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker3 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        defaultCustomisedDictionary0.addNewWord("");
        boolean boolean7 = defaultCustomisedDictionary0.isWord("var evt = document.createEvent(\"Events\");evt.initEvent(\"A form element does not have a corresponding label or has more than 1 corresponding label.\", true, false);var element = document.getElementById(\"A form element does not have a corresponding label or has more than 1 corresponding label.\");element.dispatchEvent(evt);");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter deprecatedElementsFilter5 = new org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter();
        boolean boolean6 = collectionItem4.equals((java.lang.Object) deprecatedElementsFilter5);
        java.util.Collection collection7 = collectionItem4.getAdditionalInfo();
        java.lang.String str8 = collectionItem4.getItemName();
        java.util.Collection collection9 = collectionItem4.getAdditionalInfo();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(collection9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.util.Locale locale2 = language0.getLocaleWithCountry();
        java.util.Locale locale3 = language0.getLocaleWithCountry();
        java.lang.String str4 = language0.toString();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker5 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Testlanguage" + "'", str4, "Testlanguage");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        boolean boolean7 = collectionItem4.isPass();
        org.raoxunrong.check.CheckType checkType13 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType14 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem15 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType13, checkType14);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem16 = new org.raoxunrong.domain.item.PlainTextItem("A form label is present, but it is not associated with any form element", false, "hi!:hi!", checkType14);
        boolean boolean17 = collectionItem4.equals((java.lang.Object) false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + checkType13 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType13.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType14 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType14.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl accessibilityResultFilterImpl0 = new org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType2 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.raoxunrong.domain.item.ElementDescription> elementDescriptionCollection3 = accessibilityResultFilterImpl0.filterErrorElements(checkablePage1, accessibilityType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessibilityType2 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType2.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.language.Contributor[] contributorArray1 = australianEnglishOnlySpelling0.getMaintainers();
        org.languagetool.Language language2 = australianEnglishOnlySpelling0.getDefaultVariant();
        java.lang.String str3 = australianEnglishOnlySpelling0.getName();
        org.junit.Assert.assertNotNull(contributorArray1);
        org.junit.Assert.assertNotNull(language2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English (Australian)" + "'", str3, "English (Australian)");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        boolean boolean7 = collectionItem4.isPass();
        boolean boolean9 = collectionItem4.equals((java.lang.Object) (short) 10);
        java.lang.String str10 = collectionItem4.getItemName();
        java.lang.String str11 = collectionItem4.getItemName();
        java.lang.String str12 = collectionItem4.getItemName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.raoxunrong.domain.item.ElementDescription elementDescription2 = new org.raoxunrong.domain.item.ElementDescription("A anchor link exists, but the anchor for the link does not exist.", "var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);:var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.lang.String str2 = language0.toString();
        boolean boolean3 = language0.isExternal();
        boolean boolean4 = language0.isExternal();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Testlanguage" + "'", str2, "Testlanguage");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        org.raoxunrong.check.CheckType checkType5 = collectionItem4.getCheckType();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        java.util.Collection collection7 = collectionItem4.getAdditionalInfo();
        boolean boolean8 = collectionItem4.isPass();
        org.junit.Assert.assertNull(checkType5);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.language.Contributor[] contributorArray1 = australianEnglishOnlySpelling0.getMaintainers();
        org.languagetool.tokenizers.SentenceTokenizer sentenceTokenizer2 = australianEnglishOnlySpelling0.getSentenceTokenizer();
        java.lang.String str3 = australianEnglishOnlySpelling0.toString();
        org.junit.Assert.assertNotNull(contributorArray1);
        org.junit.Assert.assertNotNull(sentenceTokenizer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English (Australian)" + "'", str3, "English (Australian)");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary2 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"xx-XX\");element.dispatchEvent(evt);", "var evt = document.createEvent(\"Events\");evt.initEvent(\"hi!\", true, false);var element = document.getElementById(\"English (US)\");element.dispatchEvent(evt);");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"xx-XX\");element.dispatchEvent(evt); is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem7 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType5, checkType6);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem8 = new org.raoxunrong.domain.item.PlainTextItem("A form label is present, but it is not associated with any form element", false, "hi!:hi!", checkType6);
        boolean boolean9 = plainTextItem8.isPass();
        boolean boolean11 = plainTextItem8.equals((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass12 = plainTextItem8.getClass();
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        org.languagetool.Language language2 = org.languagetool.Language.getLanguageForLocale(locale1);
        org.languagetool.Language language3 = org.languagetool.Language.getLanguageForLocale(locale1);
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language2);
        org.junit.Assert.assertNotNull(language3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl0 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl accessibilityResultFilterImpl1 = new org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl((org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactory) webElementsFilterFactoryImpl0);
        org.raoxunrong.domain.page.CheckablePage checkablePage2 = null;
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType3 = org.raoxunrong.check.accessibility.AccessibilityType.TitleMissing;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.raoxunrong.domain.item.ElementDescription> elementDescriptionCollection4 = accessibilityResultFilterImpl1.filterErrorElements(checkablePage2, accessibilityType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessibilityType3 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.TitleMissing + "'", accessibilityType3.equals(org.raoxunrong.check.accessibility.AccessibilityType.TitleMissing));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.util.Collection collection5 = collectionItem4.getAdditionalInfo();
        org.raoxunrong.check.CheckType checkType6 = collectionItem4.getCheckType();
        boolean boolean7 = collectionItem4.isPass();
        org.raoxunrong.demo.HtmlSourceAccessibilityCheckerDemo htmlSourceAccessibilityCheckerDemo10 = new org.raoxunrong.demo.HtmlSourceAccessibilityCheckerDemo();
        org.raoxunrong.check.CheckType checkType16 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType17 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem18 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType16, checkType17);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem19 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType16);
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.demo.HtmlSourceAccessibilityCheckerDemo> htmlSourceAccessibilityCheckerDemoCheckedItem20 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.demo.HtmlSourceAccessibilityCheckerDemo>("", true, htmlSourceAccessibilityCheckerDemo10, checkType16);
        boolean boolean21 = collectionItem4.equals((java.lang.Object) "");
        java.lang.String str22 = collectionItem4.getItemName();
        org.junit.Assert.assertNull(collection5);
        org.junit.Assert.assertNull(checkType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + checkType16 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType16.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType17 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType17.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.tagging.Tagger tagger1 = australianEnglishOnlySpelling0.getTagger();
        org.languagetool.Language language2 = australianEnglishOnlySpelling0.getDefaultVariant();
        org.languagetool.tagging.Tagger tagger3 = australianEnglishOnlySpelling0.getTagger();
        org.languagetool.synthesis.Synthesizer synthesizer4 = australianEnglishOnlySpelling0.getSynthesizer();
        org.languagetool.tagging.disambiguation.Disambiguator disambiguator5 = australianEnglishOnlySpelling0.getDisambiguator();
        org.junit.Assert.assertNotNull(tagger1);
        org.junit.Assert.assertNotNull(language2);
        org.junit.Assert.assertNotNull(tagger3);
        org.junit.Assert.assertNotNull(synthesizer4);
        org.junit.Assert.assertNotNull(disambiguator5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.openqa.selenium.WebDriver webDriver0 = null;
        org.raoxunrong.check.accessibility.filter.predicate.LabelOrphanedPredicate labelOrphanedPredicate1 = new org.raoxunrong.check.accessibility.filter.predicate.LabelOrphanedPredicate(webDriver0);
        org.openqa.selenium.WebDriver webDriver2 = labelOrphanedPredicate1.getWebDriver();
        org.openqa.selenium.WebDriver webDriver3 = labelOrphanedPredicate1.getWebDriver();
        org.openqa.selenium.WebElement webElement4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = labelOrphanedPredicate1.apply(webElement4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(webDriver2);
        org.junit.Assert.assertNull(webDriver3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.util.List<org.languagetool.Language> languageList5 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem7 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList5, checkType6);
        org.raoxunrong.check.CheckType checkType8 = collectionItem7.getCheckType();
        org.raoxunrong.domain.item.PlainTextItem plainTextItem9 = new org.raoxunrong.domain.item.PlainTextItem("xx-XX", false, "", checkType8);
        org.junit.Assert.assertNotNull(languageList5);
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType8 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType8.equals(org.raoxunrong.check.CheckType.SpellingCheck));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.util.Collection collection5 = collectionItem4.getAdditionalInfo();
        java.lang.String str6 = collectionItem4.getItemName();
        org.languagetool.Language[] languageArray7 = org.languagetool.Language.LANGUAGES;
        boolean boolean8 = collectionItem4.equals((java.lang.Object) languageArray7);
        java.util.Collection collection9 = collectionItem4.getAdditionalInfo();
        org.raoxunrong.check.CheckType checkType10 = collectionItem4.getCheckType();
        org.junit.Assert.assertNull(collection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(languageArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(collection9);
        org.junit.Assert.assertNull(checkType10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.lang.String str2 = language0.toString();
        java.util.Locale locale3 = language0.getLocale();
        java.lang.String str4 = language0.getShortNameWithVariant();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Testlanguage" + "'", str2, "Testlanguage");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "xx-XX" + "'", str4, "xx-XX");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.raoxunrong.check.CheckType checkType3 = org.raoxunrong.check.CheckType.AccessibilityCheck;
        org.raoxunrong.domain.item.PlainTextItem plainTextItem4 = new org.raoxunrong.domain.item.PlainTextItem("var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);", true, "var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);:var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);", checkType3);
        org.raoxunrong.check.CheckType checkType5 = plainTextItem4.getCheckType();
        org.junit.Assert.assertTrue("'" + checkType3 + "' != '" + org.raoxunrong.check.CheckType.AccessibilityCheck + "'", checkType3.equals(org.raoxunrong.check.CheckType.AccessibilityCheck));
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.AccessibilityCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.AccessibilityCheck));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        boolean boolean7 = collectionItem4.isPass();
        org.raoxunrong.check.CheckType checkType8 = collectionItem4.getCheckType();
        boolean boolean9 = collectionItem4.isPass();
        org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter labelOrphanedFilter10 = new org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter();
        boolean boolean11 = collectionItem4.equals((java.lang.Object) labelOrphanedFilter10);
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.utils.CheckedItemStatistic.addCheckedItem((org.raoxunrong.domain.item.CheckedItem) collectionItem4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(checkType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.util.Locale locale2 = language0.getLocale();
        java.util.Locale locale3 = language0.getLocale();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType0 = org.raoxunrong.check.accessibility.AccessibilityType.TitleMissing;
        java.lang.String str1 = accessibilityType0.getDescription();
        org.junit.Assert.assertTrue("'" + accessibilityType0 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.TitleMissing + "'", accessibilityType0.equals(org.raoxunrong.check.accessibility.AccessibilityType.TitleMissing));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "The title is missing or not descriptive for the page or frame." + "'", str1, "The title is missing or not descriptive for the page or frame.");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl accessibilityResultFilterImpl0 = new org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType2 = org.raoxunrong.check.accessibility.AccessibilityType.ElementEmpty;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.raoxunrong.domain.item.ElementDescription> elementDescriptionCollection3 = accessibilityResultFilterImpl0.filterErrorElements(checkablePage1, accessibilityType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessibilityType2 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.ElementEmpty + "'", accessibilityType2.equals(org.raoxunrong.check.accessibility.AccessibilityType.ElementEmpty));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.language.Contributor[] contributorArray1 = australianEnglishOnlySpelling0.getMaintainers();
        org.languagetool.tokenizers.SentenceTokenizer sentenceTokenizer2 = australianEnglishOnlySpelling0.getSentenceTokenizer();
        java.lang.String[] strArray3 = australianEnglishOnlySpelling0.getCountryVariants();
        org.junit.Assert.assertNotNull(contributorArray1);
        org.junit.Assert.assertNotNull(sentenceTokenizer2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem7 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType5, checkType6);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem8 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType5);
        java.lang.Class<?> wildcardClass9 = plainTextItem8.getClass();
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        java.lang.String[] strArray4 = language0.getUnpairedRuleStartSymbols();
        java.lang.String str5 = language0.getShortNameWithVariant();
        java.lang.String str6 = language0.getShortNameWithVariant();
        java.lang.String[] strArray7 = language0.getUnpairedRuleEndSymbols();
        java.util.ResourceBundle resourceBundle8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = language0.getTranslatedName(resourceBundle8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "xx-XX" + "'", str5, "xx-XX");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "xx-XX" + "'", str6, "xx-XX");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.lang.String str2 = org.raoxunrong.check.JavascriptGenerator.generateDispatchEventScript("var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"The title is missing or not descriptive for the page or frame.\");element.dispatchEvent(evt);", "A deprecated element is present, such as <marquee> or <blink>.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "var evt = document.createEvent(\"Events\");evt.initEvent(\"A deprecated element is present, such as <marquee> or <blink>.\", true, false);var element = document.getElementById(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"The title is missing or not descriptive for the page or frame.\");element.dispatchEvent(evt);\");element.dispatchEvent(evt);" + "'", str2, "var evt = document.createEvent(\"Events\");evt.initEvent(\"A deprecated element is present, such as <marquee> or <blink>.\", true, false);var element = document.getElementById(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"The title is missing or not descriptive for the page or frame.\");element.dispatchEvent(evt);\");element.dispatchEvent(evt);");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl0 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType1 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter2 = webElementsFilterFactoryImpl0.buildFilter(accessibilityType1);
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl3 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl4 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType5 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter6 = webElementsFilterFactoryImpl4.buildFilter(accessibilityType5);
        java.lang.String str7 = accessibilityType5.getDescription();
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter8 = webElementsFilterFactoryImpl3.buildFilter(accessibilityType5);
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType9 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter10 = webElementsFilterFactoryImpl3.buildFilter(accessibilityType9);
        java.lang.String str11 = accessibilityType9.getDescription();
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter12 = webElementsFilterFactoryImpl0.buildFilter(accessibilityType9);
        org.junit.Assert.assertTrue("'" + accessibilityType1 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType1.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertNotNull(webElementFilter2);
        org.junit.Assert.assertTrue("'" + accessibilityType5 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType5.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertNotNull(webElementFilter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A form label is present, but it is not associated with any form element" + "'", str7, "A form label is present, but it is not associated with any form element");
        org.junit.Assert.assertNotNull(webElementFilter8);
        org.junit.Assert.assertTrue("'" + accessibilityType9 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType9.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertNotNull(webElementFilter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A form label is present, but it is not associated with any form element" + "'", str11, "A form label is present, but it is not associated with any form element");
        org.junit.Assert.assertNotNull(webElementFilter12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        boolean boolean4 = defaultCustomisedDictionary0.isWord("");
        boolean boolean6 = defaultCustomisedDictionary0.isWord("");
        defaultCustomisedDictionary0.addNewWord("");
        boolean boolean10 = defaultCustomisedDictionary0.isWord("A form element does not have a corresponding label or has more than 1 corresponding label.");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker11 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        org.raoxunrong.domain.page.CheckablePage checkablePage12 = null;
        // The following exception was thrown during execution in test generation
        try {
            firefoxSpellCheckerImprovedChecker11.doCheck(checkablePage12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        java.lang.String[] strArray4 = language0.getUnpairedRuleStartSymbols();
        java.lang.String str5 = language0.toString();
        org.languagetool.Language language6 = org.languagetool.Language.DEMO;
        java.util.Locale locale7 = language6.getLocaleWithCountry();
        java.lang.String str8 = language6.toString();
        boolean boolean9 = language6.isExternal();
        boolean boolean10 = language0.equalsConsiderVariantsIfSpecified(language6);
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Testlanguage" + "'", str5, "Testlanguage");
        org.junit.Assert.assertNotNull(language6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Testlanguage" + "'", str8, "Testlanguage");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        java.lang.String[] strArray4 = language0.getUnpairedRuleStartSymbols();
        org.languagetool.Language language5 = org.languagetool.Language.DEMO;
        java.util.Locale locale6 = language5.getLocaleWithCountry();
        boolean boolean7 = language5.isExternal();
        org.languagetool.Language[] languageArray8 = new org.languagetool.Language[] { language0, language5 };
        org.languagetool.Language.LANGUAGES = languageArray8;
        org.languagetool.Language.LANGUAGES = languageArray8;
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(language5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageArray8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.util.Collection collection5 = collectionItem4.getAdditionalInfo();
        boolean boolean6 = collectionItem4.isPass();
        org.junit.Assert.assertNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.openqa.selenium.WebDriver webDriver2 = null;
        org.raoxunrong.check.accessibility.filter.predicate.LabelMissingPredicate labelMissingPredicate3 = new org.raoxunrong.check.accessibility.filter.predicate.LabelMissingPredicate(webDriver2);
        org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter labelOrphanedFilter6 = new org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter();
        org.raoxunrong.check.CheckType checkType9 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType10 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem11 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType9, checkType10);
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter> labelOrphanedFilterCheckedItem12 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter>("", false, labelOrphanedFilter6, checkType9);
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.accessibility.filter.predicate.WebElementPredicate> webElementPredicateCheckedItem13 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.accessibility.filter.predicate.WebElementPredicate>("hi!", true, (org.raoxunrong.check.accessibility.filter.predicate.WebElementPredicate) labelMissingPredicate3, checkType9);
        org.junit.Assert.assertTrue("'" + checkType9 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType9.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType10 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType10.equals(org.raoxunrong.check.CheckType.SpellingCheck));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isVariant();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl0 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType1 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter2 = webElementsFilterFactoryImpl0.buildFilter(accessibilityType1);
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType3 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter4 = webElementsFilterFactoryImpl0.buildFilter(accessibilityType3);
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType5 = org.raoxunrong.check.accessibility.AccessibilityType.LabelMissing;
        java.lang.String str6 = accessibilityType5.getDescription();
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter7 = webElementsFilterFactoryImpl0.buildFilter(accessibilityType5);
        java.lang.String str8 = accessibilityType5.getDescription();
        org.junit.Assert.assertTrue("'" + accessibilityType1 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType1.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertNotNull(webElementFilter2);
        org.junit.Assert.assertTrue("'" + accessibilityType3 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType3.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertNotNull(webElementFilter4);
        org.junit.Assert.assertTrue("'" + accessibilityType5 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelMissing + "'", accessibilityType5.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelMissing));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A form element does not have a corresponding label or has more than 1 corresponding label." + "'", str6, "A form element does not have a corresponding label or has more than 1 corresponding label.");
        org.junit.Assert.assertNotNull(webElementFilter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A form element does not have a corresponding label or has more than 1 corresponding label." + "'", str8, "A form element does not have a corresponding label or has more than 1 corresponding label.");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.language.Contributor[] contributorArray1 = australianEnglishOnlySpelling0.getMaintainers();
        java.lang.String str2 = australianEnglishOnlySpelling0.getName();
        java.lang.String[] strArray3 = australianEnglishOnlySpelling0.getCountryVariants();
        org.languagetool.Language language4 = australianEnglishOnlySpelling0.getDefaultVariant();
        org.junit.Assert.assertNotNull(contributorArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (Australian)" + "'", str2, "English (Australian)");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(language4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.raoxunrong.check.spellcheck.dic.CustomisedDictionary customisedDictionary0 = null;
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker1 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker(customisedDictionary0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        // The following exception was thrown during execution in test generation
        try {
            org.languagetool.Language language1 = org.languagetool.Language.getLanguageForShortName("A form element does not have a corresponding label or has more than 1 corresponding label.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'A form element does not have a corresponding label or has more than 1 corresponding label.' is not a language code known to LanguageTool. Supported languages: [English, English (US), English (GB), English (Australian), English (Canadian), English (New Zealand), English (South African)]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        org.languagetool.rules.patterns.Unifier unifier1 = language0.getDisambiguationUnifier();
        java.util.List<java.lang.String> strList2 = language0.getRuleFileName();
        org.languagetool.rules.patterns.Unifier unifier3 = language0.getDisambiguationUnifier();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(unifier1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(unifier3);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter labelOrphanedFilter2 = new org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter();
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem7 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType5, checkType6);
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter> labelOrphanedFilterCheckedItem8 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.accessibility.filter.LabelOrphanedFilter>("", false, labelOrphanedFilter2, checkType5);
        org.raoxunrong.utils.CheckedItemStatistic.addCheckedItem((org.raoxunrong.domain.item.CheckedItem) labelOrphanedFilterCheckedItem8);
        org.raoxunrong.utils.CheckedItemStatistic.addCheckedItem((org.raoxunrong.domain.item.CheckedItem) labelOrphanedFilterCheckedItem8);
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.language.Contributor[] contributorArray1 = australianEnglishOnlySpelling0.getMaintainers();
        java.lang.String str2 = australianEnglishOnlySpelling0.getName();
        java.util.List<java.lang.Class<? extends org.languagetool.rules.Rule>> wildcardClassList3 = australianEnglishOnlySpelling0.getRelevantRules();
        org.junit.Assert.assertNotNull(contributorArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (Australian)" + "'", str2, "English (Australian)");
        org.junit.Assert.assertNotNull(wildcardClassList3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem7 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType5, checkType6);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem8 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType5);
        boolean boolean9 = plainTextItem8.isPass();
        boolean boolean10 = plainTextItem8.isPass();
        java.lang.String str11 = plainTextItem8.getAdditionalInfo();
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.language.Contributor[] contributorArray1 = australianEnglishOnlySpelling0.getMaintainers();
        java.lang.String str2 = australianEnglishOnlySpelling0.getName();
        java.lang.String[] strArray3 = australianEnglishOnlySpelling0.getCountryVariants();
        java.util.List<java.lang.String> strList4 = australianEnglishOnlySpelling0.getRuleFileName();
        org.languagetool.Language language5 = australianEnglishOnlySpelling0.getDefaultVariant();
        org.junit.Assert.assertNotNull(contributorArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (Australian)" + "'", str2, "English (Australian)");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(language5);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl accessibilityResultFilterImpl0 = new org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl2 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType3 = org.raoxunrong.check.accessibility.AccessibilityType.TitleMissing;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter4 = webElementsFilterFactoryImpl2.buildFilter(accessibilityType3);
        java.lang.String str5 = accessibilityType3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.raoxunrong.domain.item.ElementDescription> elementDescriptionCollection6 = accessibilityResultFilterImpl0.filterErrorElements(checkablePage1, accessibilityType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessibilityType3 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.TitleMissing + "'", accessibilityType3.equals(org.raoxunrong.check.accessibility.AccessibilityType.TitleMissing));
        org.junit.Assert.assertNotNull(webElementFilter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "The title is missing or not descriptive for the page or frame." + "'", str5, "The title is missing or not descriptive for the page or frame.");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.openqa.selenium.WebDriver webDriver0 = null;
        org.raoxunrong.check.accessibility.filter.predicate.LabelOrphanedPredicate labelOrphanedPredicate1 = new org.raoxunrong.check.accessibility.filter.predicate.LabelOrphanedPredicate(webDriver0);
        org.openqa.selenium.WebDriver webDriver2 = labelOrphanedPredicate1.getWebDriver();
        org.openqa.selenium.WebElement webElement3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = labelOrphanedPredicate1.apply(webElement3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(webDriver2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        java.lang.String[] strArray4 = language0.getUnpairedRuleStartSymbols();
        java.lang.String str5 = language0.getShortNameWithVariant();
        java.lang.String str6 = language0.getShortNameWithVariant();
        java.lang.String[] strArray7 = language0.getUnpairedRuleEndSymbols();
        java.lang.String str8 = language0.getShortNameWithVariant();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "xx-XX" + "'", str5, "xx-XX");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "xx-XX" + "'", str6, "xx-XX");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "xx-XX" + "'", str8, "xx-XX");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.util.List<java.lang.String> strList2 = language0.getRuleFileName();
        org.languagetool.rules.patterns.Unifier unifier3 = language0.getUnifier();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(unifier3);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.language.Contributor[] contributorArray1 = australianEnglishOnlySpelling0.getMaintainers();
        java.lang.String[] strArray2 = australianEnglishOnlySpelling0.getUnpairedRuleStartSymbols();
        org.languagetool.language.Contributor[] contributorArray3 = australianEnglishOnlySpelling0.getMaintainers();
        org.languagetool.Language language4 = australianEnglishOnlySpelling0.getDefaultVariant();
        org.junit.Assert.assertNotNull(contributorArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(contributorArray3);
        org.junit.Assert.assertNotNull(language4);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        java.lang.String[] strArray4 = language0.getUnpairedRuleStartSymbols();
        boolean boolean5 = language0.hasVariant();
        java.lang.String[] strArray6 = language0.getUnpairedRuleEndSymbols();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        java.util.Collection collection7 = collectionItem4.getAdditionalInfo();
        java.util.Collection collection8 = collectionItem4.getAdditionalInfo();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertNull(collection8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem7 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType5, checkType6);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem8 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType5);
        java.lang.String str9 = plainTextItem8.getAdditionalInfo();
        boolean boolean11 = plainTextItem8.equals((java.lang.Object) (byte) -1);
        java.lang.String str12 = plainTextItem8.getItemName();
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.language.Contributor[] contributorArray1 = australianEnglishOnlySpelling0.getMaintainers();
        java.lang.String[] strArray2 = australianEnglishOnlySpelling0.getUnpairedRuleStartSymbols();
        org.languagetool.tagging.Tagger tagger3 = australianEnglishOnlySpelling0.getTagger();
        org.languagetool.synthesis.Synthesizer synthesizer4 = australianEnglishOnlySpelling0.getSynthesizer();
        org.languagetool.synthesis.Synthesizer synthesizer5 = australianEnglishOnlySpelling0.getSynthesizer();
        org.languagetool.synthesis.Synthesizer synthesizer6 = australianEnglishOnlySpelling0.getSynthesizer();
        org.junit.Assert.assertNotNull(contributorArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(tagger3);
        org.junit.Assert.assertNotNull(synthesizer4);
        org.junit.Assert.assertNotNull(synthesizer5);
        org.junit.Assert.assertNotNull(synthesizer6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        java.util.List<org.languagetool.Language> languageList3 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType4 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem5 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList3, checkType4);
        org.raoxunrong.check.CheckType checkType6 = collectionItem5.getCheckType();
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.utils.CheckedItemStatistic.generateReport("var evt = document.createEvent(\"Events\");evt.initEvent(\"A deprecated element is present, such as <marquee> or <blink>.\", true, false);var element = document.getElementById(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"The title is missing or not descriptive for the page or frame.\");element.dispatchEvent(evt);\");element.dispatchEvent(evt);", checkType6);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Directory 'var evt = document.createEvent(\"Events\");evt.initEvent(\"A deprecated element is present, such as <marquee> or <blink>.\", true, false);var element = document.getElementById(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"The title is missing or not descriptive for the page or frame.\");element.dispatchEvent(evt);\");element.dispatchEvent(evt);' could not be created");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageList3);
        org.junit.Assert.assertTrue("'" + checkType4 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType4.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.util.Collection collection4 = null;
        org.raoxunrong.check.CheckType checkType5 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem6 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection4, checkType5);
        java.lang.String str7 = collectionItem6.getItemName();
        java.util.Collection collection8 = collectionItem6.getAdditionalInfo();
        boolean boolean9 = collectionItem6.isPass();
        boolean boolean11 = collectionItem6.equals((java.lang.Object) (short) 10);
        java.lang.String str12 = collectionItem6.getItemName();
        java.util.List<org.languagetool.Language> languageList13 = org.languagetool.Language.getAllLanguages();
        boolean boolean14 = collectionItem6.equals((java.lang.Object) languageList13);
        java.util.List<org.languagetool.Language> languageList19 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType20 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem21 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList19, checkType20);
        java.util.List<org.languagetool.Language> languageList24 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType25 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem26 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList24, checkType25);
        org.raoxunrong.check.CheckType checkType27 = collectionItem26.getCheckType();
        org.raoxunrong.domain.item.CheckedItem<java.util.Collection> collectionCheckedItem28 = new org.raoxunrong.domain.item.CheckedItem<java.util.Collection>("A form element does not have a corresponding label or has more than 1 corresponding label.", false, (java.util.Collection) languageList19, checkType27);
        org.raoxunrong.domain.item.CollectionItem collectionItem29 = new org.raoxunrong.domain.item.CollectionItem("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);", true, (java.util.Collection) languageList13, checkType27);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(languageList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageList19);
        org.junit.Assert.assertTrue("'" + checkType20 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType20.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(languageList24);
        org.junit.Assert.assertTrue("'" + checkType25 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType25.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType27 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType27.equals(org.raoxunrong.check.CheckType.SpellingCheck));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        java.lang.String[] strArray1 = australianEnglishOnlySpelling0.getCountryVariants();
        java.util.Locale locale2 = australianEnglishOnlySpelling0.getLocale();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.raoxunrong.check.accessibility.filter.AltMissingFilter altMissingFilter0 = new org.raoxunrong.check.accessibility.filter.AltMissingFilter();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        org.languagetool.rules.patterns.Unifier unifier1 = language0.getDisambiguationUnifier();
        java.util.List<java.lang.String> strList2 = language0.getRuleFileName();
        org.languagetool.tokenizers.Tokenizer tokenizer3 = language0.getWordTokenizer();
        java.lang.String[] strArray4 = language0.getUnpairedRuleEndSymbols();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(unifier1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(tokenizer3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.language.Contributor[] contributorArray1 = australianEnglishOnlySpelling0.getMaintainers();
        org.languagetool.tokenizers.SentenceTokenizer sentenceTokenizer2 = australianEnglishOnlySpelling0.getSentenceTokenizer();
        org.languagetool.tokenizers.SentenceTokenizer sentenceTokenizer3 = australianEnglishOnlySpelling0.getSentenceTokenizer();
        boolean boolean4 = australianEnglishOnlySpelling0.isVariant();
        org.junit.Assert.assertNotNull(contributorArray1);
        org.junit.Assert.assertNotNull(sentenceTokenizer2);
        org.junit.Assert.assertNotNull(sentenceTokenizer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.raoxunrong.domain.item.ElementDescription elementDescription2 = new org.raoxunrong.domain.item.ElementDescription("A form element does not have a corresponding label or has more than 1 corresponding label.", "");
        java.lang.String str3 = elementDescription2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A form element does not have a corresponding label or has more than 1 corresponding label.:" + "'", str3, "A form element does not have a corresponding label or has more than 1 corresponding label.:");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        boolean boolean4 = defaultCustomisedDictionary0.isWord("");
        boolean boolean6 = defaultCustomisedDictionary0.isWord("");
        defaultCustomisedDictionary0.addNewWord("");
        boolean boolean10 = defaultCustomisedDictionary0.isWord("A form element does not have a corresponding label or has more than 1 corresponding label.");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker11 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        boolean boolean13 = defaultCustomisedDictionary0.isWord("var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.languagetool.Language language2 = org.languagetool.Language.DEMO;
        java.util.Locale locale3 = language2.getLocaleWithCountry();
        boolean boolean4 = language2.isExternal();
        java.lang.String str5 = language2.toString();
        java.lang.String[] strArray6 = language2.getUnpairedRuleStartSymbols();
        boolean boolean7 = language2.isVariant();
        org.languagetool.Language language8 = org.languagetool.Language.DEMO;
        org.languagetool.Language language9 = org.languagetool.Language.DEMO;
        java.util.Locale locale10 = language9.getLocaleWithCountry();
        boolean boolean11 = language9.isExternal();
        java.lang.String str12 = language9.toString();
        java.lang.String[] strArray13 = language9.getUnpairedRuleStartSymbols();
        boolean boolean14 = language9.isVariant();
        org.languagetool.Language language15 = org.languagetool.Language.DEMO;
        java.util.Locale locale16 = language15.getLocaleWithCountry();
        java.util.Locale locale17 = language15.getLocaleWithCountry();
        java.util.Locale locale18 = language15.getLocaleWithCountry();
        org.languagetool.tokenizers.Tokenizer tokenizer19 = language15.getWordTokenizer();
        org.languagetool.Language language20 = org.languagetool.Language.DEMO;
        java.util.Locale locale21 = language20.getLocaleWithCountry();
        java.util.List<java.lang.String> strList22 = language20.getRuleFileName();
        org.languagetool.Language language23 = org.languagetool.Language.DEMO;
        org.languagetool.rules.patterns.Unifier unifier24 = language23.getDisambiguationUnifier();
        org.languagetool.Language language25 = org.languagetool.Language.DEMO;
        java.util.Locale locale26 = language25.getLocaleWithCountry();
        org.languagetool.Language language27 = org.languagetool.Language.DEMO;
        java.util.Locale locale28 = language27.getLocaleWithCountry();
        boolean boolean29 = language27.isExternal();
        java.lang.String str30 = language27.toString();
        java.lang.String[] strArray31 = language27.getUnpairedRuleStartSymbols();
        org.languagetool.Language[] languageArray32 = new org.languagetool.Language[] { language2, language8, language9, language15, language20, language23, language25, language27 };
        java.util.ArrayList<org.languagetool.Language> languageList33 = new java.util.ArrayList<org.languagetool.Language>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.languagetool.Language>) languageList33, languageArray32);
        org.languagetool.Language.reInit((java.util.List<org.languagetool.Language>) languageList33);
        org.raoxunrong.check.CheckType checkType41 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType42 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem43 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType41, checkType42);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem44 = new org.raoxunrong.domain.item.PlainTextItem("A form label is present, but it is not associated with any form element", false, "hi!:hi!", checkType42);
        java.util.Collection<org.raoxunrong.domain.item.CheckedItem> checkedItemCollection45 = org.raoxunrong.utils.CheckedItemStatistic.getStatisticInfo(checkType42);
        org.raoxunrong.domain.item.CheckedItem<java.util.Collection> collectionCheckedItem46 = new org.raoxunrong.domain.item.CheckedItem<java.util.Collection>("var evt = document.createEvent(\"Events\");evt.initEvent(\"hi!\", true, false);var element = document.getElementById(\"English (US)\");element.dispatchEvent(evt);", false, (java.util.Collection) languageList33, checkType42);
        org.junit.Assert.assertNotNull(language2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Testlanguage" + "'", str5, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(language8);
        org.junit.Assert.assertNotNull(language9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Testlanguage" + "'", str12, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(language15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(tokenizer19);
        org.junit.Assert.assertNotNull(language20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(language23);
        org.junit.Assert.assertNotNull(unifier24);
        org.junit.Assert.assertNotNull(language25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Testlanguage" + "'", str30, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(languageArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + checkType41 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType41.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType42 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType42.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(checkedItemCollection45);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter deprecatedElementsFilter5 = new org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter();
        boolean boolean6 = collectionItem4.equals((java.lang.Object) deprecatedElementsFilter5);
        boolean boolean7 = collectionItem4.isPass();
        java.lang.Object obj8 = null;
        boolean boolean9 = collectionItem4.equals(obj8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem7 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType5, checkType6);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem8 = new org.raoxunrong.domain.item.PlainTextItem("A form label is present, but it is not associated with any form element", false, "hi!:hi!", checkType6);
        org.languagetool.Language language9 = org.languagetool.Language.DEMO;
        java.util.Locale locale10 = language9.getLocaleWithCountry();
        java.util.Locale locale11 = language9.getLocaleWithCountry();
        boolean boolean12 = plainTextItem8.equals((java.lang.Object) locale11);
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(language9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        boolean boolean7 = collectionItem4.isPass();
        java.util.Collection collection8 = collectionItem4.getAdditionalInfo();
        boolean boolean9 = collectionItem4.isPass();
        boolean boolean10 = collectionItem4.isPass();
        boolean boolean11 = collectionItem4.isPass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        java.lang.String[] strArray4 = language0.getUnpairedRuleStartSymbols();
        java.lang.String str5 = language0.toString();
        java.util.ResourceBundle resourceBundle6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = language0.getTranslatedName(resourceBundle6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Testlanguage" + "'", str5, "Testlanguage");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        boolean boolean7 = collectionItem4.isPass();
        boolean boolean9 = collectionItem4.equals((java.lang.Object) (short) 10);
        java.lang.String str10 = collectionItem4.getItemName();
        org.languagetool.Language language11 = org.languagetool.Language.DEMO;
        java.util.Locale locale12 = language11.getLocaleWithCountry();
        java.lang.String str13 = language11.toString();
        java.util.Locale locale14 = language11.getLocale();
        boolean boolean15 = collectionItem4.equals((java.lang.Object) language11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(language11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Testlanguage" + "'", str13, "Testlanguage");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl0 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType1 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter2 = webElementsFilterFactoryImpl0.buildFilter(accessibilityType1);
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType3 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter4 = webElementsFilterFactoryImpl0.buildFilter(accessibilityType3);
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter6 = webElementsFilterFactoryImpl0.buildFilter(accessibilityType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessibilityType1 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType1.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertNotNull(webElementFilter2);
        org.junit.Assert.assertTrue("'" + accessibilityType3 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType3.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertNotNull(webElementFilter4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker4 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        java.lang.String[] strArray5 = language0.getUnpairedRuleStartSymbols();
        java.lang.String[] strArray6 = language0.getUnpairedRuleEndSymbols();
        boolean boolean7 = language0.isExternal();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.languagetool.Language[] languageArray0 = org.languagetool.Language.REAL_LANGUAGES;
        org.languagetool.Language.LANGUAGES = languageArray0;
        org.junit.Assert.assertNotNull(languageArray0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        java.util.Locale locale2 = language0.getLocaleWithCountry();
        java.util.Locale locale3 = language0.getLocaleWithCountry();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker4 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "xx_XX");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.language.Contributor[] contributorArray1 = australianEnglishOnlySpelling0.getMaintainers();
        java.lang.String str2 = australianEnglishOnlySpelling0.getName();
        java.lang.String[] strArray3 = australianEnglishOnlySpelling0.getCountryVariants();
        org.languagetool.tagging.disambiguation.Disambiguator disambiguator4 = australianEnglishOnlySpelling0.getDisambiguator();
        java.util.List<java.lang.Class<? extends org.languagetool.rules.Rule>> wildcardClassList5 = australianEnglishOnlySpelling0.getRelevantRules();
        org.junit.Assert.assertNotNull(contributorArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (Australian)" + "'", str2, "English (Australian)");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(disambiguator4);
        org.junit.Assert.assertNotNull(wildcardClassList5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter deprecatedElementsFilter5 = new org.raoxunrong.check.accessibility.filter.DeprecatedElementsFilter();
        boolean boolean6 = collectionItem4.equals((java.lang.Object) deprecatedElementsFilter5);
        java.util.Collection collection7 = collectionItem4.getAdditionalInfo();
        org.languagetool.Language language10 = org.languagetool.Language.DEMO;
        java.util.Locale locale11 = language10.getLocaleWithCountry();
        java.util.Locale locale12 = language10.getLocaleWithCountry();
        java.util.Locale locale13 = language10.getLocaleWithCountry();
        org.languagetool.Language language14 = org.languagetool.Language.DEMO;
        java.util.Locale locale15 = language14.getLocaleWithCountry();
        boolean boolean16 = language14.isExternal();
        java.lang.String str17 = language14.toString();
        org.languagetool.Language language18 = org.languagetool.Language.DEMO;
        java.util.Locale locale19 = language18.getLocaleWithCountry();
        java.util.Locale locale20 = language18.getLocaleWithCountry();
        java.lang.String str21 = language18.toString();
        org.languagetool.Language language22 = org.languagetool.Language.DEMO;
        java.util.Locale locale23 = language22.getLocaleWithCountry();
        boolean boolean24 = language22.isExternal();
        java.lang.String str25 = language22.toString();
        java.lang.String[] strArray26 = language22.getUnpairedRuleStartSymbols();
        boolean boolean27 = language22.isVariant();
        org.languagetool.Language language28 = org.languagetool.Language.DEMO;
        java.util.Locale locale29 = language28.getLocaleWithCountry();
        java.util.Locale locale30 = language28.getLocaleWithCountry();
        java.lang.String str31 = language28.toString();
        org.languagetool.Language language32 = org.languagetool.Language.DEMO;
        java.util.Locale locale33 = language32.getLocaleWithCountry();
        boolean boolean34 = language32.isExternal();
        java.lang.String str35 = language32.toString();
        boolean boolean36 = language32.isExternal();
        org.languagetool.Language language37 = org.languagetool.Language.DEMO;
        java.util.Locale locale38 = language37.getLocaleWithCountry();
        java.util.Locale locale39 = language37.getLocaleWithCountry();
        java.util.Locale locale40 = language37.getLocaleWithCountry();
        org.languagetool.Language language41 = org.languagetool.Language.DEMO;
        java.util.Locale locale42 = language41.getLocaleWithCountry();
        boolean boolean43 = language41.isExternal();
        java.lang.String str44 = language41.toString();
        org.languagetool.Language language45 = org.languagetool.Language.DEMO;
        java.util.Locale locale46 = language45.getLocaleWithCountry();
        java.lang.String str47 = language45.toString();
        org.languagetool.Language language48 = org.languagetool.Language.DEMO;
        java.util.Locale locale49 = language48.getLocaleWithCountry();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker50 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language48);
        org.languagetool.Language language51 = org.languagetool.Language.DEMO;
        java.util.Locale locale52 = language51.getLocaleWithCountry();
        java.util.Locale locale53 = language51.getLocaleWithCountry();
        org.languagetool.Language language54 = org.languagetool.Language.DEMO;
        org.languagetool.rules.patterns.Unifier unifier55 = language54.getDisambiguationUnifier();
        org.languagetool.Language language56 = org.languagetool.Language.DEMO;
        java.util.Locale locale57 = language56.getLocaleWithCountry();
        java.util.Locale locale58 = language56.getLocaleWithCountry();
        java.util.Locale locale59 = language56.getLocaleWithCountry();
        org.languagetool.Language language60 = org.languagetool.Language.DEMO;
        java.util.Locale locale61 = language60.getLocaleWithCountry();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker62 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language60);
        org.languagetool.Language language63 = org.languagetool.Language.DEMO;
        java.util.Locale locale64 = language63.getLocaleWithCountry();
        java.util.Locale locale65 = language63.getLocaleWithCountry();
        java.util.Locale locale66 = language63.getLocaleWithCountry();
        org.languagetool.Language language67 = org.languagetool.Language.DEMO;
        java.util.Locale locale68 = language67.getLocaleWithCountry();
        boolean boolean69 = language67.isExternal();
        java.lang.String str70 = language67.toString();
        java.lang.String[] strArray71 = language67.getUnpairedRuleStartSymbols();
        org.languagetool.Language[] languageArray72 = new org.languagetool.Language[] { language10, language14, language18, language22, language28, language32, language37, language41, language45, language48, language51, language54, language56, language60, language63, language67 };
        java.util.ArrayList<org.languagetool.Language> languageList73 = new java.util.ArrayList<org.languagetool.Language>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<org.languagetool.Language>) languageList73, languageArray72);
        org.raoxunrong.check.CheckType checkType77 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType78 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem79 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType77, checkType78);
        org.raoxunrong.domain.item.CheckedItem<java.util.Collection<org.languagetool.Language>> languageCollectionCheckedItem80 = new org.raoxunrong.domain.item.CheckedItem<java.util.Collection<org.languagetool.Language>>("", false, (java.util.Collection<org.languagetool.Language>) languageList73, checkType78);
        boolean boolean81 = collectionItem4.equals((java.lang.Object) false);
        java.util.Collection collection82 = collectionItem4.getAdditionalInfo();
        java.lang.String str83 = collectionItem4.getItemName();
        boolean boolean84 = collectionItem4.isPass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(collection7);
        org.junit.Assert.assertNotNull(language10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Testlanguage" + "'", str17, "Testlanguage");
        org.junit.Assert.assertNotNull(language18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Testlanguage" + "'", str21, "Testlanguage");
        org.junit.Assert.assertNotNull(language22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Testlanguage" + "'", str25, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(language28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Testlanguage" + "'", str31, "Testlanguage");
        org.junit.Assert.assertNotNull(language32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Testlanguage" + "'", str35, "Testlanguage");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(language37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Testlanguage" + "'", str44, "Testlanguage");
        org.junit.Assert.assertNotNull(language45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Testlanguage" + "'", str47, "Testlanguage");
        org.junit.Assert.assertNotNull(language48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language54);
        org.junit.Assert.assertNotNull(unifier55);
        org.junit.Assert.assertNotNull(language56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(language67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Testlanguage" + "'", str70, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(languageArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + checkType77 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType77.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType78 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType78.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(collection82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.raoxunrong.domain.item.ElementDescription elementDescription2 = new org.raoxunrong.domain.item.ElementDescription("hi!", "hi!");
        java.lang.String str3 = elementDescription2.toString();
        java.lang.String str4 = elementDescription2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!:hi!" + "'", str3, "hi!:hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!:hi!" + "'", str4, "hi!:hi!");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        java.lang.String[] strArray1 = australianEnglishOnlySpelling0.getCountryVariants();
        org.languagetool.tagging.disambiguation.Disambiguator disambiguator2 = australianEnglishOnlySpelling0.getDisambiguator();
        org.languagetool.synthesis.Synthesizer synthesizer3 = australianEnglishOnlySpelling0.getSynthesizer();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(disambiguator2);
        org.junit.Assert.assertNotNull(synthesizer3);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        // The following exception was thrown during execution in test generation
        try {
            org.languagetool.Language language1 = org.languagetool.Language.getLanguageForShortName("A deprecated element is present, such as <marquee> or <blink>.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'A deprecated element is present, such as <marquee> or <blink>.' is not a language code known to LanguageTool. Supported languages: [English, English (US), English (GB), English (Australian), English (Canadian), English (New Zealand), English (South African)]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        // The following exception was thrown during execution in test generation
        try {
            org.languagetool.Language language1 = org.languagetool.Language.getLanguageForShortName("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);:hi!:hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);:hi!:hi!' is not a language code known to LanguageTool. Supported languages: [English, English (US), English (GB), English (Australian), English (Canadian), English (New Zealand), English (South African)]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary2 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean4 = defaultCustomisedDictionary2.isWord("");
        boolean boolean6 = defaultCustomisedDictionary2.isWord("");
        boolean boolean8 = defaultCustomisedDictionary2.isWord("");
        defaultCustomisedDictionary2.addNewWord("hi!");
        java.util.List<org.languagetool.Language> languageList16 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType17 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem18 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList16, checkType17);
        org.raoxunrong.check.CheckType checkType19 = collectionItem18.getCheckType();
        org.raoxunrong.domain.item.PlainTextItem plainTextItem20 = new org.raoxunrong.domain.item.PlainTextItem("A anchor link exists, but the anchor for the link does not exist.", false, "var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);:var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);", checkType19);
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary> defaultCustomisedDictionaryCheckedItem21 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary>("A anchor link exists, but the anchor for the link does not exist.", false, defaultCustomisedDictionary2, checkType19);
        defaultCustomisedDictionary2.addNewWord("Testlanguage");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageList16);
        org.junit.Assert.assertTrue("'" + checkType17 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType17.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType19 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType19.equals(org.raoxunrong.check.CheckType.SpellingCheck));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.languagetool.Language language2 = org.languagetool.Language.DEMO;
        java.util.Locale locale3 = language2.getLocaleWithCountry();
        java.util.List<java.lang.String> strList4 = language2.getRuleFileName();
        org.languagetool.Language language5 = org.languagetool.Language.DEMO;
        java.util.Locale locale6 = language5.getLocaleWithCountry();
        java.lang.String str7 = language5.toString();
        boolean boolean8 = language5.isExternal();
        boolean boolean9 = language5.isVariant();
        boolean boolean10 = language2.equalsConsiderVariantsIfSpecified(language5);
        java.lang.String str11 = language2.toString();
        java.util.List<java.lang.String> strList12 = language2.getRuleFileName();
        org.raoxunrong.check.CheckType checkType14 = org.raoxunrong.check.CheckType.AccessibilityCheck;
        org.raoxunrong.utils.CheckedItemStatistic.generateReport("A form element does not have a corresponding label or has more than 1 corresponding label.", checkType14);
        org.raoxunrong.domain.item.CheckedItem<java.util.Collection> collectionCheckedItem16 = new org.raoxunrong.domain.item.CheckedItem<java.util.Collection>("xx-XX", false, (java.util.Collection) strList12, checkType14);
        org.junit.Assert.assertNotNull(language2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(language5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Testlanguage" + "'", str7, "Testlanguage");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Testlanguage" + "'", str11, "Testlanguage");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + checkType14 + "' != '" + org.raoxunrong.check.CheckType.AccessibilityCheck + "'", checkType14.equals(org.raoxunrong.check.CheckType.AccessibilityCheck));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        java.lang.String str5 = collectionItem4.getItemName();
        java.util.Collection collection6 = collectionItem4.getAdditionalInfo();
        boolean boolean7 = collectionItem4.isPass();
        java.util.Collection collection8 = collectionItem4.getAdditionalInfo();
        boolean boolean9 = collectionItem4.isPass();
        boolean boolean10 = collectionItem4.isPass();
        java.util.Collection collection11 = collectionItem4.getAdditionalInfo();
        boolean boolean12 = collectionItem4.isPass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        boolean boolean4 = defaultCustomisedDictionary0.isWord("");
        boolean boolean6 = defaultCustomisedDictionary0.isWord("");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker7 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        org.raoxunrong.domain.page.CheckablePage checkablePage8 = null;
        // The following exception was thrown during execution in test generation
        try {
            firefoxSpellCheckerImprovedChecker7.doCheck(checkablePage8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker4 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        java.lang.String str5 = language0.getShortNameWithVariant();
        org.languagetool.tokenizers.Tokenizer tokenizer6 = language0.getWordTokenizer();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "xx-XX" + "'", str5, "xx-XX");
        org.junit.Assert.assertNotNull(tokenizer6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.language.Contributor[] contributorArray1 = australianEnglishOnlySpelling0.getMaintainers();
        org.languagetool.Language language2 = australianEnglishOnlySpelling0.getDefaultVariant();
        org.languagetool.tokenizers.SentenceTokenizer sentenceTokenizer3 = australianEnglishOnlySpelling0.getSentenceTokenizer();
        org.junit.Assert.assertNotNull(contributorArray1);
        org.junit.Assert.assertNotNull(language2);
        org.junit.Assert.assertNotNull(sentenceTokenizer3);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem7 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType5, checkType6);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem8 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType5);
        boolean boolean9 = plainTextItem8.isPass();
        org.raoxunrong.check.CheckType checkType10 = plainTextItem8.getCheckType();
        org.raoxunrong.check.CheckType checkType11 = plainTextItem8.getCheckType();
        boolean boolean12 = plainTextItem8.isPass();
        boolean boolean13 = plainTextItem8.isPass();
        org.languagetool.Language language14 = org.languagetool.Language.DEMO;
        java.util.Locale locale15 = language14.getLocaleWithCountry();
        java.util.Locale locale16 = language14.getLocaleWithCountry();
        java.lang.String str17 = language14.toString();
        java.lang.Class<?> wildcardClass18 = language14.getClass();
        boolean boolean19 = plainTextItem8.equals((java.lang.Object) language14);
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + checkType10 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType10.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType11 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType11.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(language14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "xx_XX");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Testlanguage" + "'", str17, "Testlanguage");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.util.List<org.languagetool.Language> languageList6 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType7 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem8 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList6, checkType7);
        org.raoxunrong.check.CheckType checkType9 = collectionItem8.getCheckType();
        org.raoxunrong.domain.item.PlainTextItem plainTextItem10 = new org.raoxunrong.domain.item.PlainTextItem("A anchor link exists, but the anchor for the link does not exist.", false, "var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);:var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);", checkType9);
        org.raoxunrong.utils.CheckedItemStatistic.generateReport("var evt = document.createEvent(\"Events\");evt.initEvent(\"hi!\", true, false);var element = document.getElementById(\"English (US)\");element.dispatchEvent(evt);", checkType9);
        org.junit.Assert.assertNotNull(languageList6);
        org.junit.Assert.assertTrue("'" + checkType7 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType7.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType9 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType9.equals(org.raoxunrong.check.CheckType.SpellingCheck));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.language.Contributor[] contributorArray1 = australianEnglishOnlySpelling0.getMaintainers();
        java.lang.String str2 = australianEnglishOnlySpelling0.getName();
        java.lang.String[] strArray3 = australianEnglishOnlySpelling0.getCountryVariants();
        org.languagetool.tagging.disambiguation.Disambiguator disambiguator4 = australianEnglishOnlySpelling0.getDisambiguator();
        org.languagetool.language.Contributor[] contributorArray5 = australianEnglishOnlySpelling0.getMaintainers();
        org.junit.Assert.assertNotNull(contributorArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (Australian)" + "'", str2, "English (Australian)");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(disambiguator4);
        org.junit.Assert.assertNotNull(contributorArray5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker2 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        java.util.Locale locale3 = language0.getLocale();
        java.lang.String[] strArray4 = language0.getUnpairedRuleEndSymbols();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.util.List<org.languagetool.Language> languageList5 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem7 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList5, checkType6);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem8 = new org.raoxunrong.domain.item.PlainTextItem("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);:hi!:hi!", true, "A deprecated element is present, such as <marquee> or <blink>.", checkType6);
        boolean boolean9 = plainTextItem8.isPass();
        boolean boolean10 = plainTextItem8.isPass();
        org.junit.Assert.assertNotNull(languageList5);
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        java.util.List<org.languagetool.Language> languageList7 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType8 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem9 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList7, checkType8);
        java.util.List<org.languagetool.Language> languageList12 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType13 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem14 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList12, checkType13);
        org.raoxunrong.check.CheckType checkType15 = collectionItem14.getCheckType();
        org.raoxunrong.domain.item.CheckedItem<java.util.Collection> collectionCheckedItem16 = new org.raoxunrong.domain.item.CheckedItem<java.util.Collection>("A form element does not have a corresponding label or has more than 1 corresponding label.", false, (java.util.Collection) languageList7, checkType15);
        org.raoxunrong.check.CheckType checkType17 = collectionCheckedItem16.getCheckType();
        org.raoxunrong.domain.item.PlainTextItem plainTextItem18 = new org.raoxunrong.domain.item.PlainTextItem("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);:hi!:hi!", true, "The title is missing or not descriptive for the page or frame.", checkType17);
        org.junit.Assert.assertNotNull(languageList7);
        org.junit.Assert.assertTrue("'" + checkType8 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType8.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(languageList12);
        org.junit.Assert.assertTrue("'" + checkType13 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType13.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType15 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType15.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType17 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType17.equals(org.raoxunrong.check.CheckType.SpellingCheck));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.raoxunrong.check.accessibility.filter.LabelMissingFilter labelMissingFilter0 = new org.raoxunrong.check.accessibility.filter.LabelMissingFilter();
        org.raoxunrong.domain.page.CheckablePage checkablePage1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<org.openqa.selenium.WebElement> webElementCollection2 = labelMissingFilter0.filter(checkablePage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.util.Collection collection2 = null;
        org.raoxunrong.check.CheckType checkType3 = null;
        org.raoxunrong.domain.item.CollectionItem collectionItem4 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, collection2, checkType3);
        org.raoxunrong.check.CheckType checkType5 = collectionItem4.getCheckType();
        boolean boolean6 = collectionItem4.isPass();
        org.raoxunrong.check.CheckType checkType7 = collectionItem4.getCheckType();
        org.junit.Assert.assertNull(checkType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(checkType7);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        java.lang.String[] strArray4 = language0.getUnpairedRuleStartSymbols();
        java.lang.String[] strArray5 = language0.getUnpairedRuleStartSymbols();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.language.Contributor[] contributorArray1 = australianEnglishOnlySpelling0.getMaintainers();
        java.lang.String str2 = australianEnglishOnlySpelling0.getName();
        java.lang.String[] strArray3 = australianEnglishOnlySpelling0.getCountryVariants();
        java.util.List<java.lang.String> strList4 = australianEnglishOnlySpelling0.getRuleFileName();
        java.util.Locale locale5 = australianEnglishOnlySpelling0.getLocale();
        org.junit.Assert.assertNotNull(contributorArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "English (Australian)" + "'", str2, "English (Australian)");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker4 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        org.raoxunrong.domain.page.CheckablePage checkablePage5 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageToolChecker4.doCheck(checkablePage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        org.languagetool.tagging.Tagger tagger1 = australianEnglishOnlySpelling0.getTagger();
        org.languagetool.Language language2 = australianEnglishOnlySpelling0.getDefaultVariant();
        org.languagetool.tagging.Tagger tagger3 = australianEnglishOnlySpelling0.getTagger();
        org.languagetool.synthesis.Synthesizer synthesizer4 = australianEnglishOnlySpelling0.getSynthesizer();
        java.lang.String[] strArray5 = australianEnglishOnlySpelling0.getUnpairedRuleStartSymbols();
        org.junit.Assert.assertNotNull(tagger1);
        org.junit.Assert.assertNotNull(language2);
        org.junit.Assert.assertNotNull(tagger3);
        org.junit.Assert.assertNotNull(synthesizer4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling0 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        java.lang.String[] strArray1 = australianEnglishOnlySpelling0.getCountryVariants();
        java.lang.String str2 = australianEnglishOnlySpelling0.getShortName();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en" + "'", str2, "en");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem7 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType5, checkType6);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem8 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType5);
        org.raoxunrong.check.CheckType checkType9 = plainTextItem8.getCheckType();
        java.lang.String str10 = plainTextItem8.getItemName();
        org.raoxunrong.check.CheckType checkType16 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType17 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem18 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType16, checkType17);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem19 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType16);
        org.raoxunrong.check.CheckType checkType20 = plainTextItem19.getCheckType();
        java.lang.String str21 = plainTextItem19.getItemName();
        org.raoxunrong.check.CheckType checkType22 = plainTextItem19.getCheckType();
        boolean boolean23 = plainTextItem8.equals((java.lang.Object) plainTextItem19);
        org.raoxunrong.check.CheckType checkType24 = plainTextItem19.getCheckType();
        java.util.Collection<org.raoxunrong.domain.item.CheckedItem> checkedItemCollection25 = org.raoxunrong.utils.CheckedItemStatistic.getStatisticInfo(checkType24);
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType9 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType9.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + checkType16 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType16.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType17 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType17.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType20 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType20.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + checkType22 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType22.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + checkType24 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType24.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(checkedItemCollection25);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl webElementsFilterFactoryImpl0 = new org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactoryImpl();
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType1 = org.raoxunrong.check.accessibility.AccessibilityType.TitleMissing;
        org.raoxunrong.check.accessibility.filter.WebElementFilter webElementFilter2 = webElementsFilterFactoryImpl0.buildFilter(accessibilityType1);
        org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl accessibilityResultFilterImpl3 = new org.raoxunrong.check.accessibility.filter.AccessibilityResultFilterImpl((org.raoxunrong.check.accessibility.filter.factory.WebElementsFilterFactory) webElementsFilterFactoryImpl0);
        org.junit.Assert.assertTrue("'" + accessibilityType1 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.TitleMissing + "'", accessibilityType1.equals(org.raoxunrong.check.accessibility.AccessibilityType.TitleMissing));
        org.junit.Assert.assertNotNull(webElementFilter2);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.languagetool.Language language2 = org.languagetool.Language.DEMO;
        java.util.Locale locale3 = language2.getLocaleWithCountry();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker4 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language2);
        java.util.Locale locale5 = language2.getLocale();
        java.util.List<org.languagetool.Language> languageList8 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType9 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem10 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList8, checkType9);
        org.raoxunrong.check.CheckType checkType11 = collectionItem10.getCheckType();
        java.util.Collection<org.raoxunrong.domain.item.CheckedItem> checkedItemCollection12 = org.raoxunrong.utils.CheckedItemStatistic.getStatisticInfo(checkType11);
        java.util.Collection<org.raoxunrong.domain.item.CheckedItem> checkedItemCollection13 = org.raoxunrong.utils.CheckedItemStatistic.getStatisticInfo(checkType11);
        org.raoxunrong.domain.item.CheckedItem<java.util.Locale> localeCheckedItem14 = new org.raoxunrong.domain.item.CheckedItem<java.util.Locale>("", true, locale5, checkType11);
        org.junit.Assert.assertNotNull(language2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(languageList8);
        org.junit.Assert.assertTrue("'" + checkType9 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType9.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType11 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType11.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(checkedItemCollection12);
        org.junit.Assert.assertNotNull(checkedItemCollection13);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem7 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType5, checkType6);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem8 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType5);
        boolean boolean9 = plainTextItem8.isPass();
        org.raoxunrong.domain.item.ElementDescription elementDescription12 = new org.raoxunrong.domain.item.ElementDescription("hi!", "");
        boolean boolean13 = plainTextItem8.equals((java.lang.Object) elementDescription12);
        org.raoxunrong.check.CheckType checkType14 = plainTextItem8.getCheckType();
        java.lang.String str15 = plainTextItem8.getItemName();
        boolean boolean16 = plainTextItem8.isPass();
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + checkType14 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType14.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem7 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType5, checkType6);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem8 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType5);
        boolean boolean9 = plainTextItem8.isPass();
        org.raoxunrong.domain.item.ElementDescription elementDescription12 = new org.raoxunrong.domain.item.ElementDescription("hi!", "");
        boolean boolean13 = plainTextItem8.equals((java.lang.Object) elementDescription12);
        org.raoxunrong.check.CheckType checkType14 = plainTextItem8.getCheckType();
        java.util.Collection<org.raoxunrong.domain.item.CheckedItem> checkedItemCollection15 = org.raoxunrong.utils.CheckedItemStatistic.getStatisticInfo(checkType14);
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + checkType14 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType14.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(checkedItemCollection15);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary defaultCustomisedDictionary0 = new org.raoxunrong.check.spellcheck.dic.DefaultCustomisedDictionary();
        boolean boolean2 = defaultCustomisedDictionary0.isWord("");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker3 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        defaultCustomisedDictionary0.addNewWord("");
        defaultCustomisedDictionary0.addNewWord("var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);");
        org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker firefoxSpellCheckerImprovedChecker8 = new org.raoxunrong.check.spellcheck.firefox.FirefoxSpellCheckerImprovedChecker((org.raoxunrong.check.spellcheck.dic.CustomisedDictionary) defaultCustomisedDictionary0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        org.languagetool.rules.patterns.Unifier unifier2 = language0.getDisambiguationUnifier();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker3 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language0);
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertNotNull(unifier2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary plainTextFileDictionary2 = new org.raoxunrong.check.spellcheck.dic.PlainTextFileDictionary("A anchor link exists, but the anchor for the link does not exist.", "Testlanguage");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: A anchor link exists, but the anchor for the link does not exist. is not exist");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.raoxunrong.check.CheckType checkType8 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType9 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem10 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType8, checkType9);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem11 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType8);
        org.raoxunrong.check.CheckType checkType12 = plainTextItem11.getCheckType();
        org.raoxunrong.check.CheckType checkType13 = plainTextItem11.getCheckType();
        org.raoxunrong.domain.item.PlainTextItem plainTextItem14 = new org.raoxunrong.domain.item.PlainTextItem("xx-XX", true, "A form element does not have a corresponding label or has more than 1 corresponding label.", checkType13);
        org.junit.Assert.assertTrue("'" + checkType8 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType8.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType9 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType9.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType12 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType12.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType13 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType13.equals(org.raoxunrong.check.CheckType.SpellingCheck));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.util.List<org.languagetool.Language> languageList4 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem6 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList4, checkType5);
        java.util.List<org.languagetool.Language> languageList9 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType10 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem11 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList9, checkType10);
        org.raoxunrong.check.CheckType checkType12 = collectionItem11.getCheckType();
        org.raoxunrong.domain.item.CheckedItem<java.util.Collection> collectionCheckedItem13 = new org.raoxunrong.domain.item.CheckedItem<java.util.Collection>("A form element does not have a corresponding label or has more than 1 corresponding label.", false, (java.util.Collection) languageList4, checkType12);
        org.raoxunrong.check.CheckType checkType14 = collectionCheckedItem13.getCheckType();
        java.lang.String str15 = collectionCheckedItem13.getItemName();
        org.languagetool.Language language16 = org.languagetool.Language.DEMO;
        java.util.Locale locale17 = language16.getLocaleWithCountry();
        boolean boolean18 = language16.isExternal();
        java.lang.String str19 = language16.toString();
        org.raoxunrong.check.spellcheck.common.LanguageToolChecker languageToolChecker20 = new org.raoxunrong.check.spellcheck.common.LanguageToolChecker(language16);
        java.lang.String[] strArray21 = language16.getUnpairedRuleStartSymbols();
        boolean boolean22 = collectionCheckedItem13.equals((java.lang.Object) language16);
        org.junit.Assert.assertNotNull(languageList4);
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(languageList9);
        org.junit.Assert.assertTrue("'" + checkType10 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType10.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType12 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType12.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType14 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType14.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A form element does not have a corresponding label or has more than 1 corresponding label." + "'", str15, "A form element does not have a corresponding label or has more than 1 corresponding label.");
        org.junit.Assert.assertNotNull(language16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Testlanguage" + "'", str19, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.util.List<org.languagetool.Language> languageList5 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem7 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList5, checkType6);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem8 = new org.raoxunrong.domain.item.PlainTextItem("var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);:hi!:hi!", true, "A deprecated element is present, such as <marquee> or <blink>.", checkType6);
        boolean boolean9 = plainTextItem8.isPass();
        org.raoxunrong.utils.CheckedItemStatistic.addCheckedItem((org.raoxunrong.domain.item.CheckedItem) plainTextItem8);
        java.lang.String str11 = plainTextItem8.getItemName();
        org.junit.Assert.assertNotNull(languageList5);
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);:hi!:hi!" + "'", str11, "var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);:hi!:hi!");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        java.util.List<org.languagetool.Language> languageList6 = org.languagetool.Language.getExternalLanguages();
        org.raoxunrong.check.CheckType checkType7 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CollectionItem collectionItem8 = new org.raoxunrong.domain.item.CollectionItem("hi!", false, (java.util.Collection) languageList6, checkType7);
        org.raoxunrong.check.CheckType checkType9 = collectionItem8.getCheckType();
        org.raoxunrong.domain.item.PlainTextItem plainTextItem10 = new org.raoxunrong.domain.item.PlainTextItem("A anchor link exists, but the anchor for the link does not exist.", false, "var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);:var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);", checkType9);
        // The following exception was thrown during execution in test generation
        try {
            org.raoxunrong.utils.CheckedItemStatistic.generateReport("", checkType9);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: /SpellingCheck.html (Read-only file system)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageList6);
        org.junit.Assert.assertTrue("'" + checkType7 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType7.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType9 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType9.equals(org.raoxunrong.check.CheckType.SpellingCheck));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.raoxunrong.check.CheckType checkType5 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType6 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem7 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType5, checkType6);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem8 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType5);
        boolean boolean9 = plainTextItem8.isPass();
        org.raoxunrong.check.CheckType checkType10 = plainTextItem8.getCheckType();
        org.raoxunrong.check.CheckType checkType11 = plainTextItem8.getCheckType();
        org.raoxunrong.check.CheckType checkType12 = plainTextItem8.getCheckType();
        org.junit.Assert.assertTrue("'" + checkType5 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType5.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType6 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType6.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + checkType10 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType10.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType11 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType11.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType12 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType12.equals(org.raoxunrong.check.CheckType.SpellingCheck));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.raoxunrong.check.accessibility.AccessibilityType accessibilityType0 = org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned;
        java.lang.String str1 = accessibilityType0.getDescription();
        org.junit.Assert.assertTrue("'" + accessibilityType0 + "' != '" + org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned + "'", accessibilityType0.equals(org.raoxunrong.check.accessibility.AccessibilityType.LabelOrphaned));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A form label is present, but it is not associated with any form element" + "'", str1, "A form label is present, but it is not associated with any form element");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.languagetool.Language language0 = org.languagetool.Language.DEMO;
        java.util.Locale locale1 = language0.getLocaleWithCountry();
        boolean boolean2 = language0.isExternal();
        java.lang.String str3 = language0.toString();
        java.lang.String[] strArray4 = language0.getUnpairedRuleStartSymbols();
        java.lang.String str5 = language0.getShortNameWithVariant();
        java.lang.String str6 = language0.getShortNameWithVariant();
        java.lang.String str7 = language0.toString();
        org.junit.Assert.assertNotNull(language0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "xx_XX");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Testlanguage" + "'", str3, "Testlanguage");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "xx-XX" + "'", str5, "xx-XX");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "xx-XX" + "'", str6, "xx-XX");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Testlanguage" + "'", str7, "Testlanguage");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        // The following exception was thrown during execution in test generation
        try {
            org.languagetool.Language language1 = org.languagetool.Language.getLanguageForShortName("var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);:var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);:var evt = document.createEvent(\"Events\");evt.initEvent(\"var evt = document.createEvent(\"Events\");evt.initEvent(\"\", true, false);var element = document.getElementById(\"\");element.dispatchEvent(evt);\", true, false);var element = document.getElementById(\"Testlanguage\");element.dispatchEvent(evt);' is not a language code known to LanguageTool. Supported languages: [English, English (US), English (GB), English (Australian), English (Canadian), English (New Zealand), English (South African)]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling australianEnglishOnlySpelling2 = new org.raoxunrong.check.spellcheck.language.AustralianEnglishOnlySpelling();
        java.lang.String[] strArray3 = australianEnglishOnlySpelling2.getCountryVariants();
        java.util.List<java.lang.Class<? extends org.languagetool.rules.Rule>> wildcardClassList4 = australianEnglishOnlySpelling2.getRelevantRules();
        org.raoxunrong.check.CheckType checkType11 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.check.CheckType checkType12 = org.raoxunrong.check.CheckType.SpellingCheck;
        org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType> checkTypeCheckedItem13 = new org.raoxunrong.domain.item.CheckedItem<org.raoxunrong.check.CheckType>("", true, checkType11, checkType12);
        org.raoxunrong.domain.item.PlainTextItem plainTextItem14 = new org.raoxunrong.domain.item.PlainTextItem("", false, "hi!", checkType11);
        boolean boolean15 = plainTextItem14.isPass();
        org.raoxunrong.check.CheckType checkType16 = plainTextItem14.getCheckType();
        org.raoxunrong.check.CheckType checkType17 = plainTextItem14.getCheckType();
        org.raoxunrong.utils.CheckedItemStatistic.addCheckedItem((org.raoxunrong.domain.item.CheckedItem) plainTextItem14);
        org.raoxunrong.check.CheckType checkType19 = plainTextItem14.getCheckType();
        java.util.Collection<org.raoxunrong.domain.item.CheckedItem> checkedItemCollection20 = org.raoxunrong.utils.CheckedItemStatistic.getStatisticInfo(checkType19);
        org.raoxunrong.utils.CheckedItemStatistic.generateReport("A deprecated element is present, such as <marquee> or <blink>.", checkType19);
        org.raoxunrong.domain.item.CollectionItem collectionItem22 = new org.raoxunrong.domain.item.CollectionItem("English (US)", true, (java.util.Collection) wildcardClassList4, checkType19);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClassList4);
        org.junit.Assert.assertTrue("'" + checkType11 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType11.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType12 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType12.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + checkType16 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType16.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType17 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType17.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertTrue("'" + checkType19 + "' != '" + org.raoxunrong.check.CheckType.SpellingCheck + "'", checkType19.equals(org.raoxunrong.check.CheckType.SpellingCheck));
        org.junit.Assert.assertNotNull(checkedItemCollection20);
    }
}

