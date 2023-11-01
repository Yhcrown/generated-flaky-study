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
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.String;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.String + "'", token0.equals(gutenberg.pygments.Token.String));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.StringChar;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.StringChar + "'", token0.equals(gutenberg.pygments.Token.StringChar));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.StringDouble;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.StringDouble + "'", token0.equals(gutenberg.pygments.Token.StringDouble));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.support.Var<org.pegdown.ast.AbbreviationNode> abbreviationNodeVar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule2 = attributesPlugin0.AbbreviationText(abbreviationNodeVar1);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        int int0 = org.pegdown.Extensions.HARDWRAPS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char1 = attributesPlugin0.currentChar();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        gutenberg.itext.TextStripper textStripper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.TextStripper.InternalListener internalListener1 = textStripper0.new InternalListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to gutenberg.itext.TextStripper$InternalListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.itextpdf.text.pdf.PdfPTable pdfPTable0 = null;
        gutenberg.util.Dimension dimension1 = null;
        gutenberg.itext.ITextUtils.applyWidth(pdfPTable0, dimension1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.NameException;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.NameException + "'", token0.equals(gutenberg.pygments.Token.NameException));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        java.lang.Class<? extends org.pegdown.ast.Node> wildcardClass3 = null;
        java.lang.Class[] classArray5 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<? extends org.pegdown.ast.Node>[] wildcardClassArray6 = (java.lang.Class<? extends org.pegdown.ast.Node>[]) classArray5;
        wildcardClassArray6[0] = wildcardClass3;
        gutenberg.pegdown.TreeNavigation.Ancestor ancestor9 = gutenberg.pegdown.TreeNavigation.ancestor(wildcardClassArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule10 = attributesPlugin0.Test((java.lang.Object) (byte) -1, (java.lang.Object) (short) 1, (java.lang.Object[]) wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.Byte");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(ancestor9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        gutenberg.util.AlignParser alignParser0 = new gutenberg.util.AlignParser();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        gutenberg.util.Margin margin4 = new gutenberg.util.Margin((float) (byte) 10, 10.0f, (float) ' ', (-1.0f));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.lang.String str0 = gutenberg.itext.Styles.TABLE_ALTERNATE_BACKGROUND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "table-alternate-background" + "'", str0, "table-alternate-background");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.itextpdf.text.Image image0 = null;
        com.itextpdf.text.Rectangle rectangle1 = null;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.ITextUtils.scaleToFit(image0, rectangle1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.StringRegex;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.StringRegex + "'", token0.equals(gutenberg.pygments.Token.StringRegex));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule1 = attributesPlugin0.DoubleAngleQuoted();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.pygments.LexerInfo lexerInfo2 = new gutenberg.pygments.LexerInfo("hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.Object obj0 = gutenberg.itext.pegdown.TableNodeProcessor.TABLE_SPACING_AFTER;
        org.junit.Assert.assertEquals("'" + obj0 + "' != '" + "table-spacing-after" + "'", obj0, "table-spacing-after");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.itextpdf.text.BaseColor baseColor0 = gutenberg.itext.Colors.VERY_LIGHT_GRAY;
        org.junit.Assert.assertNotNull(baseColor0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.itextpdf.text.BaseColor baseColor0 = null;
        gutenberg.itext.pegdown.SimpleNodeProcessor simpleNodeProcessor2 = new gutenberg.itext.pegdown.SimpleNodeProcessor(baseColor0, (-1.0f));
        gutenberg.pegdown.plugin.AttributesNode attributesNode5 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray6 = new org.pegdown.ast.Node[] { attributesNode5 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList7 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList7, nodeArray6);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode9 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList7);
        gutenberg.itext.pegdown.InvocationContext invocationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleNodeProcessor2.process((int) (short) 100, (org.pegdown.ast.Node) genericBoxNode9, invocationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.String str0 = gutenberg.itext.Styles.H4_FONT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "H4-font" + "'", str0, "H4-font");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule1 = attributesPlugin0.Bullet();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.itextpdf.text.Font font0 = null;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.FontDescriptor fontDescriptor1 = gutenberg.itext.FontDescriptor.fontDescriptor(font0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        char[] charArray5 = new char[] { '4', ' ', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.pegdown.ast.RootNode rootNode6 = attributesParser0.parseInternal(charArray5);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4 #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4 #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4,  , #, a]");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        int int0 = org.pegdown.Extensions.QUOTES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        java.lang.Class<? extends org.pegdown.ast.Node> wildcardClass3 = null;
        java.lang.Class[] classArray5 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<? extends org.pegdown.ast.Node>[] wildcardClassArray6 = (java.lang.Class<? extends org.pegdown.ast.Node>[]) classArray5;
        wildcardClassArray6[0] = wildcardClass3;
        gutenberg.pegdown.TreeNavigation.Ancestor ancestor9 = gutenberg.pegdown.TreeNavigation.ancestor(wildcardClassArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule10 = attributesPlugin0.ZeroOrMore((java.lang.Object) "H4-font", (java.lang.Object) (short) 0, (java.lang.Object[]) wildcardClassArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(ancestor9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.KeywordPseudo;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.KeywordPseudo + "'", token0.equals(gutenberg.pygments.Token.KeywordPseudo));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = attributesParser0.match();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.BaseParser<java.lang.Object> objBaseParser1 = attributesPlugin0.newInstance();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Illegal parser instance, you have to use Parboiled.createParser(...) to create your parser instance!");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule1 = attributesParser0.NonAutoLinkInline();
            org.junit.Assert.fail("Expected exception of type org.pegdown.ParsingTimeoutException; message: null");
        } catch (org.pegdown.ParsingTimeoutException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.itextpdf.text.BaseColor baseColor0 = gutenberg.itext.Colors.CYAN;
        org.junit.Assert.assertNotNull(baseColor0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule1 = attributesParser0.Verbatim();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Rule specification contains an unwrapped Boolean value, if you were trying to specify a parser action wrap the expression with ACTION(...)");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.lang.String str1 = gutenberg.util.Strings.unindentBlock("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule1 = attributesPlugin0.LinkTitle();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule1 = attributesPlugin0.Root();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        gutenberg.util.Dimension.Unit unit0 = gutenberg.util.Dimension.Unit.Px;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + gutenberg.util.Dimension.Unit.Px + "'", unit0.equals(gutenberg.util.Dimension.Unit.Px));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        gutenberg.itext.PageInfos pageInfos3 = null;
        gutenberg.itext.TableOfContents.Entry entry5 = new gutenberg.itext.TableOfContents.Entry("table-alternate-background", (int) (byte) -1, pageInfos3, "table-spacing-after");
        gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser> blockPluginParserCollector9 = new gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser>();
        java.util.List<org.pegdown.plugins.BlockPluginParser> blockPluginParserList10 = blockPluginParserCollector9.getCollected();
        gutenberg.itext.FontModifier fontModifier13 = gutenberg.itext.FontModifier.fontModifier();
        java.lang.Object[] objArray14 = new java.lang.Object[] { "table-spacing-after", 10.0d, blockPluginParserList10, (short) 10, true, fontModifier13 };
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule15 = attributesPlugin0.FirstOf((java.lang.Object) "table-alternate-background", (java.lang.Object) 100L, objArray14);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: '100' cannot be automatically converted to a parser Rule");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(blockPluginParserList10);
        org.junit.Assert.assertNotNull(fontModifier13);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String str0 = gutenberg.itext.Styles.CODE_FONT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "code-font" + "'", str0, "code-font");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.Comment;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.Comment + "'", token0.equals(gutenberg.pygments.Token.Comment));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.parboiled.Rule rule0 = org.parboiled.BaseParser.INDENT;
        org.junit.Assert.assertNotNull(rule0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = attributesPlugin0.match();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        org.parboiled.support.StringVar stringVar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = attributesPlugin0.HtmlBlockOpen(stringVar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.Keyword;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.Keyword + "'", token0.equals(gutenberg.pygments.Token.Keyword));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin1 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule2 = attributesPlugin1.BlankLine();
        gutenberg.pygments.Token token3 = gutenberg.pygments.Token.StringEscape;
        gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser> blockPluginParserCollector4 = new gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser>();
        java.util.List<org.pegdown.plugins.BlockPluginParser> blockPluginParserList5 = blockPluginParserCollector4.getCollected();
        java.lang.Object[] objArray7 = new java.lang.Object[] { blockPluginParserCollector4, "table-alternate-background" };
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule8 = attributesPlugin0.Optional((java.lang.Object) attributesPlugin1, (java.lang.Object) token3, objArray7);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: 'gutenberg.pegdown.plugin.AttributesPlugin@6e47650f' cannot be automatically converted to a parser Rule");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertTrue("'" + token3 + "' != '" + gutenberg.pygments.Token.StringEscape + "'", token3.equals(gutenberg.pygments.Token.StringEscape));
        org.junit.Assert.assertNotNull(blockPluginParserList5);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = attributesParser0.swap6();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = attributesPlugin0.popAsString();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        gutenberg.itext.FontModifier fontModifier1 = gutenberg.itext.FontModifier.fontModifier();
        com.itextpdf.text.BaseColor baseColor3 = gutenberg.itext.Colors.CYAN;
        gutenberg.util.MapBuilder<com.itextpdf.text.BaseColor, gutenberg.pygments.Token> baseColorMapBuilder5 = new gutenberg.util.MapBuilder<com.itextpdf.text.BaseColor, gutenberg.pygments.Token>();
        gutenberg.pygments.Token token6 = gutenberg.pygments.Token.Keyword;
        java.lang.Object[] objArray7 = new java.lang.Object[] { baseColor3, ' ', baseColorMapBuilder5, token6 };
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule8 = attributesPlugin0.Optional((java.lang.Object) fontModifier1, (java.lang.Object) (byte) 10, objArray7);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: 'gutenberg.itext.FontModifier@740049b' cannot be automatically converted to a parser Rule");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fontModifier1);
        org.junit.Assert.assertNotNull(baseColor3);
        org.junit.Assert.assertTrue("'" + token6 + "' != '" + gutenberg.pygments.Token.Keyword + "'", token6.equals(gutenberg.pygments.Token.Keyword));
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule2 = attributesPlugin0.InlineOrIntermediateEndline();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.LiteralDate;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.LiteralDate + "'", token0.equals(gutenberg.pygments.Token.LiteralDate));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.util.RGB rGB1 = gutenberg.util.RGB.rgb("table-alternate-background");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule1 = attributesPlugin0.Symbol();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.NameClass;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.NameClass + "'", token0.equals(gutenberg.pygments.Token.NameClass));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.itextpdf.text.BaseColor baseColor0 = gutenberg.itext.Colors.VERY2_LIGHT_GRAY;
        org.junit.Assert.assertNotNull(baseColor0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = attributesParser0.pop();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.DecEntity();
        gutenberg.util.MapBuilder<com.itextpdf.text.BaseColor, gutenberg.pygments.Token> baseColorMapBuilder2 = new gutenberg.util.MapBuilder<com.itextpdf.text.BaseColor, gutenberg.pygments.Token>();
        gutenberg.itext.FontModifier fontModifier3 = gutenberg.itext.FontModifier.fontModifier();
        java.lang.Class<? extends org.pegdown.ast.Node> wildcardClass5 = null;
        java.lang.Class[] classArray7 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<? extends org.pegdown.ast.Node>[] wildcardClassArray8 = (java.lang.Class<? extends org.pegdown.ast.Node>[]) classArray7;
        wildcardClassArray8[0] = wildcardClass5;
        gutenberg.pegdown.TreeNavigation.Ancestor ancestor11 = gutenberg.pegdown.TreeNavigation.ancestor(wildcardClassArray8);
        gutenberg.pygments.Token token12 = gutenberg.pygments.Token.StringRegex;
        gutenberg.pygments.Token token13 = gutenberg.pygments.Token.Keyword;
        java.lang.Object[] objArray14 = new java.lang.Object[] { baseColorMapBuilder2, fontModifier3, (-1L), wildcardClassArray8, token12, token13 };
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule15 = attributesPlugin0.Sequence((java.lang.Object[]) wildcardClassArray8);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: 'null' cannot be automatically converted to a parser Rule");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(fontModifier3);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(ancestor11);
        org.junit.Assert.assertTrue("'" + token12 + "' != '" + gutenberg.pygments.Token.StringRegex + "'", token12.equals(gutenberg.pygments.Token.StringRegex));
        org.junit.Assert.assertTrue("'" + token13 + "' != '" + gutenberg.pygments.Token.Keyword + "'", token13.equals(gutenberg.pygments.Token.Keyword));
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        gutenberg.itext.Configuration configuration0 = new gutenberg.itext.Configuration();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        gutenberg.util.Style.Italic italic0 = gutenberg.util.Style.Italic.False;
        org.junit.Assert.assertTrue("'" + italic0 + "' != '" + gutenberg.util.Style.Italic.False + "'", italic0.equals(gutenberg.util.Style.Italic.False));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        gutenberg.itext.pegdown.GenericBoxNodeProcessor genericBoxNodeProcessor0 = new gutenberg.itext.pegdown.GenericBoxNodeProcessor();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.DecEntity();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule2 = attributesPlugin0.NormalEndline();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.NameFunction;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.NameFunction + "'", token0.equals(gutenberg.pygments.Token.NameFunction));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule2 = attributesParser0.InlineHtml();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule2 = attributesParser0.Name();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        gutenberg.util.Style.Italic italic0 = gutenberg.util.Style.Italic.Inherit;
        org.junit.Assert.assertTrue("'" + italic0 + "' != '" + gutenberg.util.Style.Italic.Inherit + "'", italic0.equals(gutenberg.util.Style.Italic.Inherit));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        gutenberg.itext.pegdown.DefaultProcessor defaultProcessor0 = new gutenberg.itext.pegdown.DefaultProcessor();
        gutenberg.pegdown.plugin.AttributesNode attributesNode3 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray4 = new org.pegdown.ast.Node[] { attributesNode3 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList5 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList5, nodeArray4);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode7 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList5);
        gutenberg.itext.pegdown.InvocationContext invocationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultProcessor0.process((int) 'a', (org.pegdown.ast.Node) genericBoxNode7, invocationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        org.parboiled.support.Var<org.pegdown.ast.AbbreviationNode> abbreviationNodeVar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = attributesPlugin0.AbbreviationText(abbreviationNodeVar2);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        gutenberg.util.RGBFormatException rGBFormatException1 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray2 = rGBFormatException1.getSuppressed();
        gutenberg.util.WrappedRuntimeException wrappedRuntimeException3 = new gutenberg.util.WrappedRuntimeException((java.lang.Throwable) rGBFormatException1);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.NameVariableClass;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.NameVariableClass + "'", token0.equals(gutenberg.pygments.Token.NameVariableClass));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        gutenberg.pygments.Pygments pygments0 = null;
        gutenberg.pygments.StyleSheet styleSheet1 = null;
        gutenberg.itext.Styles styles2 = null;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.PygmentsAdapter pygmentsAdapter3 = new gutenberg.itext.PygmentsAdapter(pygments0, styleSheet1, styles2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pygments cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = attributesParser0.matchEnd();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.itextpdf.text.BaseColor baseColor0 = gutenberg.itext.Colors.GREEN_FLASHY;
        org.junit.Assert.assertNotNull(baseColor0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        gutenberg.pygments.Lexers lexers0 = new gutenberg.pygments.Lexers();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.itextpdf.text.pdf.BaseFont baseFont0 = null;
        com.itextpdf.text.BaseColor baseColor3 = null;
        gutenberg.itext.FontDescriptor fontDescriptor4 = gutenberg.itext.FontDescriptor.fontDescriptor(baseFont0, (float) (byte) 1, 0, baseColor3);
        com.itextpdf.text.pdf.BaseFont baseFont5 = fontDescriptor4.baseFont();
        org.junit.Assert.assertNotNull(fontDescriptor4);
        org.junit.Assert.assertNull(baseFont5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.String str0 = gutenberg.itext.Styles.INLINE_CODE_BACKGROUND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "inline-code-background" + "'", str0, "inline-code-background");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.support.Var<java.lang.Integer> intVar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule2 = attributesPlugin0.CodeFence(intVar1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        gutenberg.itext.pegdown.StrikeNodeProcessor strikeNodeProcessor0 = new gutenberg.itext.pegdown.StrikeNodeProcessor();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        gutenberg.pygments.Pygments pygments0 = null;
        gutenberg.pygments.Tokens tokens1 = null;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.pygments.Pygments.RFormatter rFormatter2 = pygments0.new RFormatter(tokens1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to gutenberg.pygments.Pygments$RFormatter with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.StringEscape;
        java.lang.String str1 = token0.shortName();
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.StringEscape + "'", token0.equals(gutenberg.pygments.Token.StringEscape));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "se" + "'", str1, "se");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        java.lang.Object obj4 = null;
        org.parboiled.Rule rule5 = attributesPlugin0.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj4);
        org.parboiled.Rule rule6 = attributesPlugin0.NormalChar();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule[] ruleArray7 = attributesPlugin0.blockPluginRules();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule5);
        org.junit.Assert.assertNotNull(rule6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        gutenberg.itext.pegdown.RefImageNodeProcessor refImageNodeProcessor0 = new gutenberg.itext.pegdown.RefImageNodeProcessor();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.Token;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.Token + "'", token0.equals(gutenberg.pygments.Token.Token));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule1 = attributesParser0.NormalEndline();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule2 = attributesParser0.AtxStart();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        int int0 = org.pegdown.Extensions.ABBREVIATIONS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.DecEntity();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule2 = attributesPlugin0.Code();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        java.lang.Object obj4 = null;
        org.parboiled.Rule rule5 = attributesPlugin0.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj4);
        org.parboiled.Rule rule6 = attributesPlugin0.NormalChar();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule7 = attributesPlugin0.AtxInline();
            org.junit.Assert.fail("Expected exception of type org.pegdown.ParsingTimeoutException; message: null");
        } catch (org.pegdown.ParsingTimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule5);
        org.junit.Assert.assertNotNull(rule6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.model.SourceCode sourceCode7 = gutenberg.itext.model.SourceCode.fromBytes(byteArray6);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException; message: java.lang.IllegalStateException: Expected BEGIN_OBJECT but was STRING at line 1 column 1");
        } catch (com.google.gson.JsonSyntaxException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1, 1, 100]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        gutenberg.util.MapBuilder<com.itextpdf.text.BaseColor, gutenberg.pygments.Token> baseColorMapBuilder0 = new gutenberg.util.MapBuilder<com.itextpdf.text.BaseColor, gutenberg.pygments.Token>();
        java.util.Map<com.itextpdf.text.BaseColor, gutenberg.pygments.Token> baseColorMap1 = baseColorMapBuilder0.map();
        org.junit.Assert.assertNotNull(baseColorMap1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        java.lang.Object obj4 = null;
        org.parboiled.Rule rule5 = attributesPlugin0.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = attributesPlugin0.currentIndex();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        gutenberg.itext.Styles styles0 = null;
        gutenberg.itext.DefaultHeaderCellStyler defaultHeaderCellStyler1 = new gutenberg.itext.DefaultHeaderCellStyler(styles0);
        gutenberg.itext.pegdown.TableBodyNodeProcessor tableBodyNodeProcessor2 = new gutenberg.itext.pegdown.TableBodyNodeProcessor((gutenberg.itext.CellStyler) defaultHeaderCellStyler1);
        gutenberg.pegdown.plugin.AttributeNode attributeNode6 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        java.lang.String str7 = attributeNode6.toString();
        gutenberg.itext.pegdown.InvocationContext invocationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tableBodyNodeProcessor2.process((int) (byte) 10, (org.pegdown.ast.Node) attributeNode6, invocationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AttributeNode{table-spacing-after:H4-font}" + "'", str7, "AttributeNode{table-spacing-after:H4-font}");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.NumberOct;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.NumberOct + "'", token0.equals(gutenberg.pygments.Token.NumberOct));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule2 = attributesPlugin0.NoneOf("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.StringBacktick;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.StringBacktick + "'", token0.equals(gutenberg.pygments.Token.StringBacktick));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.util.RGB rGB1 = gutenberg.util.RGB.rgb("code-font");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin4 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule5 = attributesPlugin4.BlankLine();
        java.lang.Object obj8 = null;
        org.parboiled.Rule rule9 = attributesPlugin4.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj8);
        gutenberg.pygments.Token token10 = gutenberg.pygments.Token.KeywordPseudo;
        java.lang.Object[] objArray11 = new java.lang.Object[] { token10 };
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule12 = attributesParser0.ZeroOrMore((java.lang.Object) 100L, obj8, objArray11);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: '100' cannot be automatically converted to a parser Rule");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule5);
        org.junit.Assert.assertNotNull(rule9);
        org.junit.Assert.assertTrue("'" + token10 + "' != '" + gutenberg.pygments.Token.KeywordPseudo + "'", token10.equals(gutenberg.pygments.Token.KeywordPseudo));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[KeywordPseudo]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[KeywordPseudo]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.lang.String str0 = gutenberg.itext.Styles.DEFAULT_COLOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "default-color" + "'", str0, "default-color");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.support.StringBuilderVar stringBuilderVar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule2 = attributesParser0.IndentedBlock(stringBuilderVar1);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule4 = attributesParser0.EmphOrStrongClose("table-alternate-background");
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser> blockPluginParserCollector0 = new gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser>();
        org.pegdown.plugins.BlockPluginParser blockPluginParser1 = null;
        blockPluginParserCollector0.consume(blockPluginParser1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        java.lang.Object obj4 = null;
        org.parboiled.Rule rule5 = attributesPlugin0.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj4);
        org.parboiled.Rule rule6 = attributesPlugin0.NormalChar();
        gutenberg.pegdown.plugin.AttributeNode attributeNode10 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        java.util.List<org.pegdown.ast.Node> nodeList11 = attributeNode10.getChildren();
        java.lang.Object[] objArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule13 = attributesPlugin0.OneOrMore((java.lang.Object) (byte) 1, (java.lang.Object) nodeList11, objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Argument 'moreRules' must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule5);
        org.junit.Assert.assertNotNull(rule6);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        gutenberg.util.RGB rGB3 = new gutenberg.util.RGB((int) '4', (int) (short) 10, 10);
        int int4 = rGB3.r();
        int int5 = rGB3.g();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.Whitespace;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.Whitespace + "'", token0.equals(gutenberg.pygments.Token.Whitespace));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        gutenberg.itext.FontModifier fontModifier0 = gutenberg.itext.FontModifier.fontModifier();
        gutenberg.itext.FontModifier fontModifier2 = fontModifier0.size((float) (-1L));
        gutenberg.itext.FontModifier fontModifier3 = fontModifier2.freeze();
        org.junit.Assert.assertNotNull(fontModifier0);
        org.junit.Assert.assertNotNull(fontModifier2);
        org.junit.Assert.assertNotNull(fontModifier3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.NameEntity;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.NameEntity + "'", token0.equals(gutenberg.pygments.Token.NameEntity));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token4 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) token4);
        gutenberg.util.SimpleKeyValues simpleKeyValues6 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin7 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule8 = attributesPlugin7.BlankLine();
        java.lang.Object obj11 = null;
        org.parboiled.Rule rule12 = attributesPlugin7.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj11);
        org.parboiled.Rule rule13 = attributesPlugin7.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional14 = simpleKeyValues6.getNullable((java.lang.Object) attributesPlugin7);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional15 = simpleKeyValues0.getBoolean((java.lang.Object) attributesPlugin7);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule16 = attributesPlugin7.TerminalEndline();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + token4 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token4.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(attributesParserOptional14);
        org.junit.Assert.assertNotNull(booleanOptional15);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        gutenberg.util.KeyValues keyValues0 = null;
        gutenberg.itext.Styles styles1 = null;
        gutenberg.itext.Sections sections2 = new gutenberg.itext.Sections(keyValues0, styles1);
        com.itextpdf.text.Section section3 = sections2.currentSection();
        java.lang.Class<?> wildcardClass4 = sections2.getClass();
        org.junit.Assert.assertNull(section3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        gutenberg.pegdown.plugin.AttributeNode attributeNode2 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        java.util.List<org.pegdown.ast.Node> nodeList3 = attributeNode2.getChildren();
        int int4 = attributeNode2.getEndIndex();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        gutenberg.itext.Styles styles0 = null;
        gutenberg.itext.DefaultHeaderCellStyler defaultHeaderCellStyler1 = new gutenberg.itext.DefaultHeaderCellStyler(styles0);
        gutenberg.itext.pegdown.TableBodyNodeProcessor tableBodyNodeProcessor2 = new gutenberg.itext.pegdown.TableBodyNodeProcessor((gutenberg.itext.CellStyler) defaultHeaderCellStyler1);
        gutenberg.pegdown.plugin.AttributesNode attributesNode5 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray6 = new org.pegdown.ast.Node[] { attributesNode5 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList7 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList7, nodeArray6);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode9 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList7);
        gutenberg.pegdown.plugin.AttributeNode attributeNode12 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        gutenberg.pegdown.plugin.AttributesNode attributesNode14 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray15 = new org.pegdown.ast.Node[] { attributesNode14 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList16 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList16, nodeArray15);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode18 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList16);
        org.pegdown.ast.Node[] nodeArray19 = new org.pegdown.ast.Node[] { genericBoxNode9, attributeNode12, genericBoxNode18 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList20 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList20, nodeArray19);
        gutenberg.pegdown.TreeNavigation treeNavigation22 = new gutenberg.pegdown.TreeNavigation((java.util.List<org.pegdown.ast.Node>) nodeList20);
        gutenberg.pegdown.plugin.AttributeNode attributeNode25 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        java.lang.String str26 = attributeNode25.toString();
        gutenberg.pegdown.TreeNavigation treeNavigation27 = treeNavigation22.push((org.pegdown.ast.Node) attributeNode25);
        gutenberg.itext.pegdown.InvocationContext invocationContext28 = null;
        // The following exception was thrown during execution in test generation
        try {
            tableBodyNodeProcessor2.process((int) (byte) 0, (org.pegdown.ast.Node) attributeNode25, invocationContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AttributeNode{table-spacing-after:H4-font}" + "'", str26, "AttributeNode{table-spacing-after:H4-font}");
        org.junit.Assert.assertNotNull(treeNavigation27);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.itextpdf.text.Paragraph paragraph0 = null;
        gutenberg.util.Align align1 = gutenberg.util.Align.Right;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.ITextUtils.applyAlign(paragraph0, align1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + align1 + "' != '" + gutenberg.util.Align.Right + "'", align1.equals(gutenberg.util.Align.Right));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token4 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) token4);
        gutenberg.util.SimpleKeyValues simpleKeyValues6 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin7 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule8 = attributesPlugin7.BlankLine();
        java.lang.Object obj11 = null;
        org.parboiled.Rule rule12 = attributesPlugin7.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj11);
        org.parboiled.Rule rule13 = attributesPlugin7.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional14 = simpleKeyValues6.getNullable((java.lang.Object) attributesPlugin7);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional15 = simpleKeyValues0.getBoolean((java.lang.Object) attributesPlugin7);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule16 = attributesPlugin7.SingleQuoted();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + token4 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token4.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(attributesParserOptional14);
        org.junit.Assert.assertNotNull(booleanOptional15);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.lang.String str0 = gutenberg.itext.support.FirstPageRenderer.FIRST_PAGE_TITLE_FONT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "first-page-title-font" + "'", str0, "first-page-title-font");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.support.StringVar stringVar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = attributesParser0.DefinedHtmlTagName(stringVar2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.Name;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.Name + "'", token0.equals(gutenberg.pygments.Token.Name));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.DecEntity();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = attributesPlugin0.wrapInAnchor();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.Other;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.Other + "'", token0.equals(gutenberg.pygments.Token.Other));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.util.Stack<java.util.Collection<org.pegdown.ast.Node>> nodeCollectionList0 = gutenberg.util.New.newStack();
        org.junit.Assert.assertNotNull(nodeCollectionList0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        org.parboiled.Rule rule2 = attributesPlugin0.Indent();
        gutenberg.util.SimpleKeyValues simpleKeyValues3 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin4 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule5 = attributesPlugin4.BlankLine();
        java.lang.Object obj8 = null;
        org.parboiled.Rule rule9 = attributesPlugin4.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj8);
        org.parboiled.Rule rule10 = attributesPlugin4.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional11 = simpleKeyValues3.getNullable((java.lang.Object) attributesPlugin4);
        gutenberg.util.RGBFormatException rGBFormatException13 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray14 = rGBFormatException13.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attributesPlugin0.pushAll((java.lang.Object) attributesParserOptional11, (java.lang.Object[]) throwableArray14);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule5);
        org.junit.Assert.assertNotNull(rule9);
        org.junit.Assert.assertNotNull(rule10);
        org.junit.Assert.assertNotNull(attributesParserOptional11);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.itextpdf.text.pdf.BaseFont baseFont0 = null;
        com.itextpdf.text.BaseColor baseColor3 = gutenberg.itext.Colors.ORANGE;
        gutenberg.itext.FontDescriptor fontDescriptor4 = gutenberg.itext.FontDescriptor.fontDescriptor(baseFont0, (float) 10, 8, baseColor3);
        com.itextpdf.text.pdf.BaseFont baseFont5 = fontDescriptor4.baseFont();
        org.junit.Assert.assertNotNull(baseColor3);
        org.junit.Assert.assertNotNull(fontDescriptor4);
        org.junit.Assert.assertNull(baseFont5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.DecEntity();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule2 = attributesPlugin0.Abbreviation();
            org.junit.Assert.fail("Expected exception of type org.pegdown.ParsingTimeoutException; message: null");
        } catch (org.pegdown.ParsingTimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.NameProperty;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.NameProperty + "'", token0.equals(gutenberg.pygments.Token.NameProperty));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.DecEntity();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = attributesParser0.Entity();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        gutenberg.itext.ITextUtils iTextUtils0 = new gutenberg.itext.ITextUtils();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.String str0 = gutenberg.itext.HeaderFooter.HEADER_LINE_COLOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "header-line-color" + "'", str0, "header-line-color");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        gutenberg.util.Collector<gutenberg.pegdown.TreeNavigation> treeNavigationCollector0 = new gutenberg.util.Collector<gutenberg.pegdown.TreeNavigation>();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        org.parboiled.Rule rule2 = attributesPlugin0.NonindentSpace();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = attributesPlugin0.BulletList();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        gutenberg.itext.Styles styles0 = null;
        gutenberg.pygments.Token token1 = gutenberg.pygments.Token.NameConstant;
        com.itextpdf.text.Phrase phrase4 = null;
        com.google.common.base.Function<gutenberg.itext.PageInfos, com.itextpdf.text.Phrase> pageInfosFunction5 = gutenberg.itext.HeaderFooter.create(styles0, (java.lang.Object) token1, "hi!", "se", phrase4);
        org.junit.Assert.assertTrue("'" + token1 + "' != '" + gutenberg.pygments.Token.NameConstant + "'", token1.equals(gutenberg.pygments.Token.NameConstant));
        org.junit.Assert.assertNotNull(pageInfosFunction5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        gutenberg.pegdown.plugin.AttributesNode attributesNode1 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray2 = new org.pegdown.ast.Node[] { attributesNode1 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList3 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList3, nodeArray2);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode5 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList3);
        gutenberg.pegdown.plugin.AttributeNode attributeNode8 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        gutenberg.pegdown.plugin.AttributesNode attributesNode10 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray11 = new org.pegdown.ast.Node[] { attributesNode10 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList12 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList12, nodeArray11);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode14 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList12);
        org.pegdown.ast.Node[] nodeArray15 = new org.pegdown.ast.Node[] { genericBoxNode5, attributeNode8, genericBoxNode14 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList16 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList16, nodeArray15);
        gutenberg.pegdown.TreeNavigation treeNavigation18 = new gutenberg.pegdown.TreeNavigation((java.util.List<org.pegdown.ast.Node>) nodeList16);
        gutenberg.pegdown.plugin.AttributeNode attributeNode21 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        java.lang.String str22 = attributeNode21.toString();
        gutenberg.pegdown.TreeNavigation treeNavigation23 = treeNavigation18.push((org.pegdown.ast.Node) attributeNode21);
        java.util.List<org.pegdown.ast.Node> nodeList24 = attributeNode21.getChildren();
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AttributeNode{table-spacing-after:H4-font}" + "'", str22, "AttributeNode{table-spacing-after:H4-font}");
        org.junit.Assert.assertNotNull(treeNavigation23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        gutenberg.itext.PageInfos pageInfos2 = null;
        gutenberg.itext.TableOfContents.Entry entry4 = new gutenberg.itext.TableOfContents.Entry("table-alternate-background", 1, pageInfos2, "first-page-title-font");
        java.lang.Class<?> wildcardClass5 = entry4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token4 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) token4);
        gutenberg.util.SimpleKeyValues simpleKeyValues6 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin7 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule8 = attributesPlugin7.BlankLine();
        java.lang.Object obj11 = null;
        org.parboiled.Rule rule12 = attributesPlugin7.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj11);
        org.parboiled.Rule rule13 = attributesPlugin7.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional14 = simpleKeyValues6.getNullable((java.lang.Object) attributesPlugin7);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional15 = simpleKeyValues0.getBoolean((java.lang.Object) attributesPlugin7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Character char16 = attributesPlugin7.currentChar();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + token4 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token4.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(attributesParserOptional14);
        org.junit.Assert.assertNotNull(booleanOptional15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        gutenberg.itext.pegdown.AnchorLinkNodeProcessor anchorLinkNodeProcessor0 = new gutenberg.itext.pegdown.AnchorLinkNodeProcessor();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule1 = attributesParser0.HorizontalRule();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.lang.String str0 = gutenberg.itext.Styles.TABLE_BODY_CELL_BORDER_COLOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "table-body-cell-border" + "'", str0, "table-body-cell-border");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.lang.Object obj0 = gutenberg.itext.pegdown.ParaNodeProcessor.PARAGRAPH_SPACING_BEFORE;
        org.junit.Assert.assertEquals("'" + obj0 + "' != '" + "paragraph-spacing-before" + "'", obj0, "paragraph-spacing-before");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        org.parboiled.Rule rule2 = attributesPlugin0.NonindentSpace();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = attributesPlugin0.pop((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token4 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) token4);
        gutenberg.util.SimpleKeyValues simpleKeyValues6 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin7 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule8 = attributesPlugin7.BlankLine();
        java.lang.Object obj11 = null;
        org.parboiled.Rule rule12 = attributesPlugin7.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj11);
        org.parboiled.Rule rule13 = attributesPlugin7.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional14 = simpleKeyValues6.getNullable((java.lang.Object) attributesPlugin7);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional15 = simpleKeyValues0.getBoolean((java.lang.Object) attributesPlugin7);
        gutenberg.util.RGBFormatException rGBFormatException17 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray18 = rGBFormatException17.getSuppressed();
        org.parboiled.Rule rule19 = attributesPlugin7.FirstOf((java.lang.Object[]) throwableArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule[] ruleArray20 = attributesPlugin7.blockPluginRules();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + token4 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token4.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(attributesParserOptional14);
        org.junit.Assert.assertNotNull(booleanOptional15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(rule19);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.lang.String str0 = gutenberg.itext.Styles.H2_FONT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "H2-font" + "'", str0, "H2-font");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        gutenberg.pygments.Lexers lexers0 = gutenberg.pygments.Lexers.getInstance();
        gutenberg.pygments.PyGateway pyGateway1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.common.base.Optional<java.lang.Object> objOptional3 = lexers0.lookupLexer(pyGateway1, "paragraph-spacing-before");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(lexers0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.itextpdf.text.pdf.BaseFont baseFont0 = gutenberg.itext.ITextUtils.dejavuSansMono();
        org.junit.Assert.assertNotNull(baseFont0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        org.parboiled.Rule rule2 = attributesPlugin0.NonindentSpace();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = attributesPlugin0.HtmlBlockInTags();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        gutenberg.util.RGB rGB3 = new gutenberg.util.RGB((int) '4', (int) (short) 10, 10);
        int int4 = rGB3.g();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin1 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule2 = attributesPlugin1.BlankLine();
        java.lang.Object obj5 = null;
        org.parboiled.Rule rule6 = attributesPlugin1.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj5);
        org.parboiled.Rule rule7 = attributesPlugin1.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional8 = simpleKeyValues0.getNullable((java.lang.Object) attributesPlugin1);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule9 = attributesPlugin1.InlineHtml();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule6);
        org.junit.Assert.assertNotNull(rule7);
        org.junit.Assert.assertNotNull(attributesParserOptional8);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.CommentMultiline;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.CommentMultiline + "'", token0.equals(gutenberg.pygments.Token.CommentMultiline));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        int int0 = org.pegdown.Extensions.SUPPRESS_HTML_BLOCKS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 65536 + "'", int0 == 65536);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        java.lang.Object obj4 = null;
        org.parboiled.Rule rule5 = attributesPlugin0.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj4);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule6 = attributesPlugin0.DefTermInline();
            org.junit.Assert.fail("Expected exception of type org.pegdown.ParsingTimeoutException; message: null");
        } catch (org.pegdown.ParsingTimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        gutenberg.itext.HeaderFooter headerFooter0 = null;
        gutenberg.itext.TableOfContentsPostProcessor tableOfContentsPostProcessor1 = new gutenberg.itext.TableOfContentsPostProcessor(headerFooter0);
        gutenberg.itext.ITextContext iTextContext2 = null;
        java.io.File file3 = null;
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tableOfContentsPostProcessor1.postProcess(iTextContext2, file3, file4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = attributesPlugin0.ReferenceLink(false);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token4 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) token4);
        gutenberg.util.SimpleKeyValues simpleKeyValues6 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin7 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule8 = attributesPlugin7.BlankLine();
        java.lang.Object obj11 = null;
        org.parboiled.Rule rule12 = attributesPlugin7.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj11);
        org.parboiled.Rule rule13 = attributesPlugin7.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional14 = simpleKeyValues6.getNullable((java.lang.Object) attributesPlugin7);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional15 = simpleKeyValues0.getBoolean((java.lang.Object) attributesPlugin7);
        gutenberg.util.RGBFormatException rGBFormatException17 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray18 = rGBFormatException17.getSuppressed();
        org.parboiled.Rule rule19 = attributesPlugin7.FirstOf((java.lang.Object[]) throwableArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule20 = attributesPlugin7.LinkTitle();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + token4 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token4.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(attributesParserOptional14);
        org.junit.Assert.assertNotNull(booleanOptional15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(rule19);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        gutenberg.itext.pegdown.VerbatimNodeProcessor verbatimNodeProcessor0 = new gutenberg.itext.pegdown.VerbatimNodeProcessor();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        java.lang.Object obj4 = null;
        org.parboiled.Rule rule5 = attributesPlugin0.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj4);
        org.parboiled.Rule rule6 = attributesPlugin0.NormalChar();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule7 = attributesPlugin0.CaptionStart();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule5);
        org.junit.Assert.assertNotNull(rule6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        gutenberg.itext.pegdown.ExpImageNodeProcessor expImageNodeProcessor0 = new gutenberg.itext.pegdown.ExpImageNodeProcessor();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.itextpdf.text.BaseColor baseColor0 = gutenberg.itext.Colors.YELLOW;
        org.junit.Assert.assertNotNull(baseColor0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        gutenberg.itext.Styles styles0 = null;
        gutenberg.itext.DefaultHeaderCellStyler defaultHeaderCellStyler1 = new gutenberg.itext.DefaultHeaderCellStyler(styles0);
        gutenberg.itext.pegdown.TableBodyNodeProcessor tableBodyNodeProcessor2 = new gutenberg.itext.pegdown.TableBodyNodeProcessor((gutenberg.itext.CellStyler) defaultHeaderCellStyler1);
        gutenberg.pegdown.plugin.AttributesNode attributesNode5 = new gutenberg.pegdown.plugin.AttributesNode("");
        java.lang.String str6 = attributesNode5.toString();
        attributesNode5.shiftIndices((int) '#');
        java.util.List<org.pegdown.ast.Node> nodeList9 = attributesNode5.getChildren();
        gutenberg.itext.pegdown.InvocationContext invocationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tableBodyNodeProcessor2.process((int) '4', (org.pegdown.ast.Node) attributesNode5, invocationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AttributesNode{}" + "'", str6, "AttributesNode{}");
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        gutenberg.itext.PageInfos pageInfos2 = null;
        gutenberg.itext.TableOfContents.Entry entry4 = new gutenberg.itext.TableOfContents.Entry("table-alternate-background", 1, pageInfos2, "first-page-title-font");
        gutenberg.itext.PageInfos.Matter matter5 = gutenberg.itext.PageInfos.Matter.Main;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = entry4.is(matter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + matter5 + "' != '" + gutenberg.itext.PageInfos.Matter.Main + "'", matter5.equals(gutenberg.itext.PageInfos.Matter.Main));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        gutenberg.itext.pegdown.SuperNodeProcessor superNodeProcessor0 = new gutenberg.itext.pegdown.SuperNodeProcessor();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        gutenberg.ditaa.GraphicsRenderer graphicsRenderer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.ditaa.GraphicsRenderer.ShapeAreaComparator shapeAreaComparator1 = graphicsRenderer0.new ShapeAreaComparator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to gutenberg.ditaa.GraphicsRenderer$ShapeAreaComparator with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        gutenberg.util.Collector<gutenberg.itext.Configuration> configurationCollector0 = new gutenberg.util.Collector<gutenberg.itext.Configuration>();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        gutenberg.util.Style.Bold bold0 = gutenberg.util.Style.Bold.True;
        org.junit.Assert.assertTrue("'" + bold0 + "' != '" + gutenberg.util.Style.Bold.True + "'", bold0.equals(gutenberg.util.Style.Bold.True));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.KeywordNamespace;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.KeywordNamespace + "'", token0.equals(gutenberg.pygments.Token.KeywordNamespace));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        gutenberg.util.KeyValues keyValues0 = null;
        gutenberg.itext.Styles styles1 = null;
        gutenberg.itext.Sections sections2 = new gutenberg.itext.Sections(keyValues0, styles1);
        com.itextpdf.text.Paragraph paragraph3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.itextpdf.text.Section section5 = sections2.newSection(paragraph3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(100) > toIndex(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        gutenberg.util.KeyValues keyValues0 = null;
        gutenberg.itext.Styles styles1 = null;
        gutenberg.itext.Sections sections2 = new gutenberg.itext.Sections(keyValues0, styles1);
        // The following exception was thrown during execution in test generation
        try {
            com.itextpdf.text.Font font4 = sections2.sectionTitlePrimaryFont((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        org.parboiled.Rule rule2 = attributesPlugin0.NonindentSpace();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = attributesPlugin0.peek((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        gutenberg.util.KeyValues keyValues0 = null;
        gutenberg.itext.Styles styles1 = null;
        gutenberg.itext.Sections sections2 = new gutenberg.itext.Sections(keyValues0, styles1);
        com.itextpdf.text.Section section3 = sections2.currentSection();
        com.itextpdf.text.Paragraph paragraph4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.itextpdf.text.Section section6 = sections2.newSection(paragraph4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Section hLevel starts at 1 (H1, H2, H3...)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(section3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        gutenberg.itext.pegdown.HeaderNodeProcessor headerNodeProcessor0 = new gutenberg.itext.pegdown.HeaderNodeProcessor();
        gutenberg.pegdown.plugin.AttributesNode attributesNode3 = new gutenberg.pegdown.plugin.AttributesNode("");
        int int4 = attributesNode3.getStartIndex();
        gutenberg.itext.pegdown.InvocationContext invocationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            headerNodeProcessor0.process((-1), (org.pegdown.ast.Node) attributesNode3, invocationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: gutenberg.pegdown.plugin.AttributesNode cannot be cast to org.pegdown.ast.HeaderNode");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.lang.Object obj0 = gutenberg.itext.pegdown.ParaNodeProcessor.PARAGRAPH_SPACING_AFTER;
        org.junit.Assert.assertEquals("'" + obj0 + "' != '" + "paragraph-spacing-after" + "'", obj0, "paragraph-spacing-after");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        gutenberg.pegdown.References.Ref ref3 = new gutenberg.pegdown.References.Ref("hi!", "table-spacing-after", "hi!");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token4 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) token4);
        gutenberg.util.SimpleKeyValues simpleKeyValues6 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin7 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule8 = attributesPlugin7.BlankLine();
        java.lang.Object obj11 = null;
        org.parboiled.Rule rule12 = attributesPlugin7.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj11);
        org.parboiled.Rule rule13 = attributesPlugin7.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional14 = simpleKeyValues6.getNullable((java.lang.Object) attributesPlugin7);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional15 = simpleKeyValues0.getBoolean((java.lang.Object) attributesPlugin7);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule16 = attributesPlugin7.NonLinkInline();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + token4 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token4.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(attributesParserOptional14);
        org.junit.Assert.assertNotNull(booleanOptional15);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        gutenberg.pegdown.plugin.AttributesNode attributesNode1 = new gutenberg.pegdown.plugin.AttributesNode("");
        java.lang.String str2 = attributesNode1.toString();
        attributesNode1.shiftIndices((int) '#');
        java.util.List<org.pegdown.ast.Node> nodeList5 = attributesNode1.getChildren();
        gutenberg.pegdown.TreeNavigation treeNavigation6 = new gutenberg.pegdown.TreeNavigation(nodeList5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AttributesNode{}" + "'", str2, "AttributesNode{}");
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.parboiled.common.Reference<org.pegdown.Parser> parserReference0 = null;
        gutenberg.pegdown.plugin.LinkContentPlugin linkContentPlugin1 = new gutenberg.pegdown.plugin.LinkContentPlugin(parserReference0);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule2 = linkContentPlugin1.AutoLinkUrl();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        gutenberg.util.Strings strings0 = new gutenberg.util.Strings();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        gutenberg.util.RGBFormatException rGBFormatException4 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray5 = rGBFormatException4.getSuppressed();
        org.parboiled.Rule[] ruleArray6 = attributesParser0.toRules((java.lang.Object[]) throwableArray5);
        org.parboiled.support.Var<org.pegdown.ast.AbbreviationNode> abbreviationNodeVar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule8 = attributesParser0.AbbreviationText(abbreviationNodeVar7);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(ruleArray6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        org.parboiled.Rule rule2 = attributesPlugin0.Indent();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = attributesPlugin0.Para();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.DecEntity();
        gutenberg.util.SimpleKeyValues simpleKeyValues2 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin3 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule4 = attributesPlugin3.BlankLine();
        java.lang.Object obj7 = null;
        org.parboiled.Rule rule8 = attributesPlugin3.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj7);
        org.parboiled.Rule rule9 = attributesPlugin3.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional10 = simpleKeyValues2.getNullable((java.lang.Object) attributesPlugin3);
        org.parboiled.Rule rule11 = attributesPlugin3.HtmlAttribute();
        org.parboiled.support.StringBuilderVar stringBuilderVar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule13 = attributesPlugin0.CrossedOut(rule11, stringBuilderVar12);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule4);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule9);
        org.junit.Assert.assertNotNull(attributesParserOptional10);
        org.junit.Assert.assertNotNull(rule11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        gutenberg.util.KeyValues keyValues0 = null;
        gutenberg.itext.Styles styles1 = null;
        gutenberg.itext.Sections sections2 = new gutenberg.itext.Sections(keyValues0, styles1);
        com.itextpdf.text.Section section3 = sections2.currentSection();
        // The following exception was thrown during execution in test generation
        try {
            sections2.leaveSection((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(section3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.DecEntity();
        org.parboiled.support.Var<org.pegdown.ast.TableNode> tableNodeVar3 = null;
        org.parboiled.support.Var<java.lang.Boolean> booleanVar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule5 = attributesParser0.TableColumn(tableNodeVar3, booleanVar4);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Rule specification contains an unwrapped Boolean value, if you were trying to specify a parser action wrap the expression with ACTION(...)");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        gutenberg.itext.FontModifier fontModifier0 = new gutenberg.itext.FontModifier();
        gutenberg.itext.FontModifier fontModifier2 = fontModifier0.size((float) (byte) 0);
        org.junit.Assert.assertNotNull(fontModifier2);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        gutenberg.util.RGB rGB4 = new gutenberg.util.RGB((int) (short) 1, (int) (byte) 1, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        gutenberg.itext.pegdown.ParaNodeProcessor paraNodeProcessor0 = new gutenberg.itext.pegdown.ParaNodeProcessor();
        gutenberg.pegdown.plugin.AttributesNode attributesNode3 = new gutenberg.pegdown.plugin.AttributesNode("");
        java.lang.String str4 = attributesNode3.toString();
        attributesNode3.shiftIndices((int) '#');
        gutenberg.itext.pegdown.InvocationContext invocationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            paraNodeProcessor0.process((int) (short) 1, (org.pegdown.ast.Node) attributesNode3, invocationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AttributesNode{}" + "'", str4, "AttributesNode{}");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.DecEntity();
        org.parboiled.Rule rule4 = attributesParser0.IgnoreCase("AttributeNode{table-spacing-after:H4-font}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributesParser0.swap();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        int int0 = org.pegdown.Extensions.DEFINITIONS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.lang.String str0 = gutenberg.itext.Styles.TABLE_HEADER_FONT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "table-header-font" + "'", str0, "table-header-font");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token4 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) token4);
        gutenberg.util.SimpleKeyValues simpleKeyValues6 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin7 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule8 = attributesPlugin7.BlankLine();
        java.lang.Object obj11 = null;
        org.parboiled.Rule rule12 = attributesPlugin7.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj11);
        org.parboiled.Rule rule13 = attributesPlugin7.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional14 = simpleKeyValues6.getNullable((java.lang.Object) attributesPlugin7);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional15 = simpleKeyValues0.getBoolean((java.lang.Object) attributesPlugin7);
        gutenberg.itext.Styles styles16 = null;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.ITextContext iTextContext17 = new gutenberg.itext.ITextContext((gutenberg.util.KeyValues) simpleKeyValues0, styles16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Styles cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + token4 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token4.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(attributesParserOptional14);
        org.junit.Assert.assertNotNull(booleanOptional15);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        java.lang.Object obj4 = null;
        org.parboiled.Rule rule5 = attributesPlugin0.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj4);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule6 = attributesPlugin0.Bullet();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        int int0 = org.pegdown.Extensions.NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser> blockPluginParserCollector0 = new gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser>();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin1 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule2 = attributesPlugin1.BlankLine();
        blockPluginParserCollector0.consume((org.pegdown.plugins.BlockPluginParser) attributesPlugin1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = attributesPlugin1.matchLength();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        java.lang.Object obj4 = null;
        org.parboiled.Rule rule5 = attributesPlugin0.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj4);
        org.parboiled.Rule rule6 = attributesPlugin0.NormalChar();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributesPlugin0.setIndices();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule5);
        org.junit.Assert.assertNotNull(rule6);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        java.lang.Object obj4 = null;
        org.parboiled.Rule rule5 = attributesPlugin0.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj4);
        gutenberg.pygments.Token token6 = gutenberg.pygments.Token.GenericStrong;
        gutenberg.pygments.TokenWithValue tokenWithValue8 = new gutenberg.pygments.TokenWithValue(token6, "table-spacing-after");
        gutenberg.pegdown.plugin.AttributesNode attributesNode10 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray11 = new org.pegdown.ast.Node[] { attributesNode10 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList12 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList12, nodeArray11);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode14 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList12);
        gutenberg.pegdown.plugin.AttributeNode attributeNode17 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        gutenberg.pegdown.plugin.AttributesNode attributesNode19 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray20 = new org.pegdown.ast.Node[] { attributesNode19 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList21 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList21, nodeArray20);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode23 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList21);
        org.pegdown.ast.Node[] nodeArray24 = new org.pegdown.ast.Node[] { genericBoxNode14, attributeNode17, genericBoxNode23 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList25 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList25, nodeArray24);
        gutenberg.pegdown.TreeNavigation treeNavigation27 = new gutenberg.pegdown.TreeNavigation((java.util.List<org.pegdown.ast.Node>) nodeList25);
        gutenberg.util.SimpleKeyValues simpleKeyValues28 = new gutenberg.util.SimpleKeyValues();
        boolean boolean31 = simpleKeyValues28.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token32 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional33 = simpleKeyValues28.getBoolean((java.lang.Object) token32);
        gutenberg.util.SimpleKeyValues simpleKeyValues34 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin35 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule36 = attributesPlugin35.BlankLine();
        java.lang.Object obj39 = null;
        org.parboiled.Rule rule40 = attributesPlugin35.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj39);
        org.parboiled.Rule rule41 = attributesPlugin35.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional42 = simpleKeyValues34.getNullable((java.lang.Object) attributesPlugin35);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional43 = simpleKeyValues28.getBoolean((java.lang.Object) attributesPlugin35);
        gutenberg.util.RGBFormatException rGBFormatException45 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray46 = rGBFormatException45.getSuppressed();
        org.parboiled.Rule rule47 = attributesPlugin35.FirstOf((java.lang.Object[]) throwableArray46);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule48 = attributesPlugin0.ZeroOrMore((java.lang.Object) token6, (java.lang.Object) treeNavigation27, (java.lang.Object[]) throwableArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: gutenberg.pygments.Token");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule5);
        org.junit.Assert.assertTrue("'" + token6 + "' != '" + gutenberg.pygments.Token.GenericStrong + "'", token6.equals(gutenberg.pygments.Token.GenericStrong));
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(nodeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + token32 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token32.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional33);
        org.junit.Assert.assertNotNull(rule36);
        org.junit.Assert.assertNotNull(rule40);
        org.junit.Assert.assertNotNull(rule41);
        org.junit.Assert.assertNotNull(attributesParserOptional42);
        org.junit.Assert.assertNotNull(booleanOptional43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(rule47);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.itextpdf.text.Image image0 = null;
        gutenberg.util.Dimension.Unit unit2 = null;
        gutenberg.util.Dimension dimension3 = new gutenberg.util.Dimension((float) (short) -1, unit2);
        com.itextpdf.text.Rectangle rectangle4 = null;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.ITextUtils.adjustOrScaleToFit(image0, dimension3, rectangle4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        gutenberg.itext.PageInfos pageInfos2 = null;
        gutenberg.itext.TableOfContents.Entry entry4 = new gutenberg.itext.TableOfContents.Entry("table-alternate-background", (int) (byte) -1, pageInfos2, "table-spacing-after");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = entry4.getRawPageNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        gutenberg.itext.TextStripper textStripper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.TextStripper.Page page1 = textStripper0.new Page();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to gutenberg.itext.TextStripper$Page with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        org.parboiled.Rule rule2 = attributesPlugin0.Indent();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = attributesPlugin0.AutoLinkUrl();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.itextpdf.text.pdf.BaseFont baseFont0 = gutenberg.itext.ITextUtils.inconsolata();
        com.itextpdf.text.pdf.BaseFont baseFont3 = gutenberg.itext.ITextUtils.inconsolata();
        com.itextpdf.text.pdf.BaseFont baseFont6 = null;
        com.itextpdf.text.BaseColor baseColor9 = gutenberg.itext.Colors.ORANGE;
        gutenberg.itext.FontDescriptor fontDescriptor10 = gutenberg.itext.FontDescriptor.fontDescriptor(baseFont6, (float) 10, 8, baseColor9);
        gutenberg.itext.FontDescriptor fontDescriptor11 = gutenberg.itext.FontDescriptor.fontDescriptor(baseFont3, (float) (short) 1, (int) (byte) 1, baseColor9);
        gutenberg.itext.FontDescriptor fontDescriptor12 = gutenberg.itext.FontDescriptor.fontDescriptor(baseFont0, (float) 0, (int) 'a', baseColor9);
        org.junit.Assert.assertNotNull(baseFont0);
        org.junit.Assert.assertNotNull(baseFont3);
        org.junit.Assert.assertNotNull(baseColor9);
        org.junit.Assert.assertNotNull(fontDescriptor10);
        org.junit.Assert.assertNotNull(fontDescriptor11);
        org.junit.Assert.assertNotNull(fontDescriptor12);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.NameTag;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.NameTag + "'", token0.equals(gutenberg.pygments.Token.NameTag));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.lang.String str0 = gutenberg.itext.Styles.GENERIC_SYMBOL_COLOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "genericsymbol-color" + "'", str0, "genericsymbol-color");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = attributesParser0.Entity();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        gutenberg.util.Dimension.Unit unit0 = gutenberg.util.Dimension.Unit.Percent;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + gutenberg.util.Dimension.Unit.Percent + "'", unit0.equals(gutenberg.util.Dimension.Unit.Percent));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        gutenberg.pegdown.plugin.AttributesNode attributesNode1 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray2 = new org.pegdown.ast.Node[] { attributesNode1 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList3 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList3, nodeArray2);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode5 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList3);
        gutenberg.pegdown.plugin.AttributeNode attributeNode8 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        gutenberg.pegdown.plugin.AttributesNode attributesNode10 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray11 = new org.pegdown.ast.Node[] { attributesNode10 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList12 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList12, nodeArray11);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode14 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList12);
        org.pegdown.ast.Node[] nodeArray15 = new org.pegdown.ast.Node[] { genericBoxNode5, attributeNode8, genericBoxNode14 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList16 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList16, nodeArray15);
        gutenberg.pegdown.TreeNavigation treeNavigation18 = new gutenberg.pegdown.TreeNavigation((java.util.List<org.pegdown.ast.Node>) nodeList16);
        gutenberg.pegdown.plugin.AttributesNode attributesNode20 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray21 = new org.pegdown.ast.Node[] { attributesNode20 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList22 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList22, nodeArray21);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode24 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList22);
        gutenberg.pegdown.plugin.AttributeNode attributeNode27 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        gutenberg.pegdown.plugin.AttributesNode attributesNode29 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray30 = new org.pegdown.ast.Node[] { attributesNode29 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList31 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList31, nodeArray30);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode33 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList31);
        org.pegdown.ast.Node[] nodeArray34 = new org.pegdown.ast.Node[] { genericBoxNode24, attributeNode27, genericBoxNode33 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList35 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList35, nodeArray34);
        gutenberg.pegdown.TreeNavigation treeNavigation37 = new gutenberg.pegdown.TreeNavigation((java.util.List<org.pegdown.ast.Node>) nodeList35);
        gutenberg.pegdown.plugin.AttributeNode attributeNode40 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        java.lang.String str41 = attributeNode40.toString();
        gutenberg.pegdown.TreeNavigation treeNavigation42 = treeNavigation37.push((org.pegdown.ast.Node) attributeNode40);
        gutenberg.pegdown.TreeNavigation treeNavigation43 = treeNavigation18.push((org.pegdown.ast.Node) attributeNode40);
        java.lang.String str44 = attributeNode40.toString();
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(nodeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AttributeNode{table-spacing-after:H4-font}" + "'", str41, "AttributeNode{table-spacing-after:H4-font}");
        org.junit.Assert.assertNotNull(treeNavigation42);
        org.junit.Assert.assertNotNull(treeNavigation43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "AttributeNode{table-spacing-after:H4-font}" + "'", str44, "AttributeNode{table-spacing-after:H4-font}");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.lang.String str0 = gutenberg.itext.HeaderFooter.FOOTER_FONT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "footer-font" + "'", str0, "footer-font");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token4 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) token4);
        gutenberg.util.SimpleKeyValues simpleKeyValues6 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin7 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule8 = attributesPlugin7.BlankLine();
        java.lang.Object obj11 = null;
        org.parboiled.Rule rule12 = attributesPlugin7.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj11);
        org.parboiled.Rule rule13 = attributesPlugin7.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional14 = simpleKeyValues6.getNullable((java.lang.Object) attributesPlugin7);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional15 = simpleKeyValues0.getBoolean((java.lang.Object) attributesPlugin7);
        gutenberg.util.RGBFormatException rGBFormatException17 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray18 = rGBFormatException17.getSuppressed();
        org.parboiled.Rule rule19 = attributesPlugin7.FirstOf((java.lang.Object[]) throwableArray18);
        org.parboiled.Rule rule20 = attributesPlugin7.HtmlComment();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule21 = attributesPlugin7.HtmlBlockInTags();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + token4 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token4.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(attributesParserOptional14);
        org.junit.Assert.assertNotNull(booleanOptional15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(rule19);
        org.junit.Assert.assertNotNull(rule20);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        gutenberg.pegdown.plugin.AttributesNode attributesNode1 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray2 = new org.pegdown.ast.Node[] { attributesNode1 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList3 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList3, nodeArray2);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode5 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList3);
        gutenberg.pegdown.plugin.AttributeNode attributeNode8 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        gutenberg.pegdown.plugin.AttributesNode attributesNode10 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray11 = new org.pegdown.ast.Node[] { attributesNode10 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList12 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList12, nodeArray11);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode14 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList12);
        org.pegdown.ast.Node[] nodeArray15 = new org.pegdown.ast.Node[] { genericBoxNode5, attributeNode8, genericBoxNode14 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList16 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList16, nodeArray15);
        gutenberg.pegdown.TreeNavigation treeNavigation18 = new gutenberg.pegdown.TreeNavigation((java.util.List<org.pegdown.ast.Node>) nodeList16);
        org.pegdown.ast.Node node19 = treeNavigation18.peek();
        gutenberg.util.MutableSupplier<gutenberg.pegdown.TreeNavigation> treeNavigationMutableSupplier20 = new gutenberg.util.MutableSupplier<gutenberg.pegdown.TreeNavigation>(treeNavigation18);
        org.pegdown.ast.Node node21 = treeNavigation18.peek();
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.itextpdf.text.Paragraph paragraph0 = null;
        gutenberg.util.Align align1 = gutenberg.util.Align.Center;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.ITextUtils.applyAlign(paragraph0, align1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + align1 + "' != '" + gutenberg.util.Align.Center + "'", align1.equals(gutenberg.util.Align.Center));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = attributesParser0.TableCaption();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        int int1 = gutenberg.util.Strings.countTrailingWhitespaces("header-line-color");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.OperatorWord;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.OperatorWord + "'", token0.equals(gutenberg.pygments.Token.OperatorWord));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        gutenberg.itext.PygmentsAdapter pygmentsAdapter0 = null;
        gutenberg.itext.emitter.SourceCodeLaTeXExtension sourceCodeLaTeXExtension1 = new gutenberg.itext.emitter.SourceCodeLaTeXExtension(pygmentsAdapter0);
        gutenberg.itext.model.SourceCode sourceCode2 = null;
        gutenberg.itext.ITextContext iTextContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sourceCodeLaTeXExtension1.emit(sourceCode2, iTextContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        gutenberg.util.Margin margin4 = new gutenberg.util.Margin((float) (byte) 10, (float) 100L, (float) (short) -1, (float) (byte) 100);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        gutenberg.util.Margin margin2 = new gutenberg.util.Margin((float) (short) -1, (float) (-1L));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.itextpdf.text.BaseColor baseColor0 = gutenberg.itext.Colors.GRAY;
        org.junit.Assert.assertNotNull(baseColor0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser> blockPluginParserCollector0 = new gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser>();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin1 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule2 = attributesPlugin1.BlankLine();
        blockPluginParserCollector0.consume((org.pegdown.plugins.BlockPluginParser) attributesPlugin1);
        org.parboiled.Rule rule4 = attributesPlugin1.Sp();
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.itextpdf.text.Font font0 = null;
        gutenberg.itext.FontCopier fontCopier1 = gutenberg.itext.FontCopier.copyFont(font0);
        org.junit.Assert.assertNotNull(fontCopier1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pygments.Lexers lexers1 = gutenberg.pygments.Lexers.getInstance();
        gutenberg.pygments.Lexers lexers2 = gutenberg.pygments.Lexers.getInstance();
        simpleKeyValues0.declare((java.lang.Object) lexers1, (java.lang.Object) lexers2);
        int int6 = simpleKeyValues0.getInteger("genericsymbol-color", (int) (short) 0);
        org.junit.Assert.assertNotNull(lexers1);
        org.junit.Assert.assertNotNull(lexers2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.itextpdf.text.Font font0 = null;
        com.itextpdf.text.Font font1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.itextpdf.text.Font font2 = gutenberg.itext.ITextUtils.adjustWithStyles(font0, font1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        gutenberg.util.RGB rGB3 = new gutenberg.util.RGB((int) '4', (int) (short) 10, 10);
        int int4 = rGB3.b();
        int int5 = rGB3.rgba();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-13366774) + "'", int5 == (-13366774));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        java.lang.Object obj4 = null;
        org.parboiled.Rule rule5 = attributesPlugin0.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj4);
        org.parboiled.Rule rule7 = attributesPlugin0.NoneOf("paragraph-spacing-after");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = attributesPlugin0.pop((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule5);
        org.junit.Assert.assertNotNull(rule7);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        gutenberg.pygments.Token token3 = gutenberg.pygments.Token.NameVariableGlobal;
        gutenberg.util.Dimension.Unit unit5 = null;
        gutenberg.util.Dimension dimension6 = new gutenberg.util.Dimension((float) (short) -1, unit5);
        gutenberg.pegdown.plugin.AttributesParser attributesParser7 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule8 = attributesParser7.Spacechar();
        org.parboiled.Rule rule9 = attributesParser7.Digit();
        gutenberg.util.RGBFormatException rGBFormatException11 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray12 = rGBFormatException11.getSuppressed();
        org.parboiled.Rule[] ruleArray13 = attributesParser7.toRules((java.lang.Object[]) throwableArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule14 = attributesParser0.TestNot((java.lang.Object) token3, (java.lang.Object) unit5, (java.lang.Object[]) ruleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: gutenberg.pygments.Token");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertTrue("'" + token3 + "' != '" + gutenberg.pygments.Token.NameVariableGlobal + "'", token3.equals(gutenberg.pygments.Token.NameVariableGlobal));
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule9);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(ruleArray13);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        gutenberg.ditaa.GraphicsRenderer graphicsRenderer0 = new gutenberg.ditaa.GraphicsRenderer();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.DecEntity();
        char[] charArray9 = new char[] { ' ', ' ', '#', ' ', 'a', '4' };
        org.parboiled.Rule rule10 = attributesParser0.NoneOf(charArray9);
        gutenberg.util.SimpleKeyValues simpleKeyValues11 = new gutenberg.util.SimpleKeyValues();
        boolean boolean14 = simpleKeyValues11.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token15 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional16 = simpleKeyValues11.getBoolean((java.lang.Object) token15);
        gutenberg.util.SimpleKeyValues simpleKeyValues17 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin18 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule19 = attributesPlugin18.BlankLine();
        java.lang.Object obj22 = null;
        org.parboiled.Rule rule23 = attributesPlugin18.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj22);
        org.parboiled.Rule rule24 = attributesPlugin18.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional25 = simpleKeyValues17.getNullable((java.lang.Object) attributesPlugin18);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional26 = simpleKeyValues11.getBoolean((java.lang.Object) attributesPlugin18);
        gutenberg.util.RGBFormatException rGBFormatException28 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray29 = rGBFormatException28.getSuppressed();
        org.parboiled.Rule rule30 = attributesPlugin18.FirstOf((java.lang.Object[]) throwableArray29);
        org.parboiled.Rule rule31 = attributesPlugin18.Letter();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin32 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule33 = attributesPlugin32.DecEntity();
        gutenberg.pegdown.plugin.AttributesParser attributesParser34 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule35 = attributesParser34.Spacechar();
        org.parboiled.Rule rule36 = attributesParser34.Digit();
        gutenberg.util.RGBFormatException rGBFormatException38 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray39 = rGBFormatException38.getSuppressed();
        org.parboiled.Rule[] ruleArray40 = attributesParser34.toRules((java.lang.Object[]) throwableArray39);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule41 = attributesParser0.ZeroOrMore((java.lang.Object) attributesPlugin18, (java.lang.Object) rule33, (java.lang.Object[]) throwableArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: gutenberg.pegdown.plugin.AttributesPlugin");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  # a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  # a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #,  , a, 4]");
        org.junit.Assert.assertNotNull(rule10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + token15 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token15.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional16);
        org.junit.Assert.assertNotNull(rule19);
        org.junit.Assert.assertNotNull(rule23);
        org.junit.Assert.assertNotNull(rule24);
        org.junit.Assert.assertNotNull(attributesParserOptional25);
        org.junit.Assert.assertNotNull(booleanOptional26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(rule30);
        org.junit.Assert.assertNotNull(rule31);
        org.junit.Assert.assertNotNull(rule33);
        org.junit.Assert.assertNotNull(rule35);
        org.junit.Assert.assertNotNull(rule36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(ruleArray40);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        gutenberg.itext.pegdown.ListItemNodeProcessor listItemNodeProcessor0 = new gutenberg.itext.pegdown.ListItemNodeProcessor();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.model.Markdown markdown1 = gutenberg.itext.model.Markdown.fromUTF8(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.NameBuiltinPseudo;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.NameBuiltinPseudo + "'", token0.equals(gutenberg.pygments.Token.NameBuiltinPseudo));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.DecEntity();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule2 = attributesPlugin0.Image();
            org.junit.Assert.fail("Expected exception of type org.pegdown.ParsingTimeoutException; message: null");
        } catch (org.pegdown.ParsingTimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        gutenberg.itext.TextStripper.Text text3 = new gutenberg.itext.TextStripper.Text((float) '4', "H4-font", (float) 4);
        text3.width = 1.0f;
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        gutenberg.itext.model.Markdown markdown1 = gutenberg.itext.model.Markdown.from("footer-font");
        org.junit.Assert.assertNotNull(markdown1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin1 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule2 = attributesPlugin1.BlankLine();
        java.lang.Object obj5 = null;
        org.parboiled.Rule rule6 = attributesPlugin1.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj5);
        org.parboiled.Rule rule7 = attributesPlugin1.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional8 = simpleKeyValues0.getNullable((java.lang.Object) attributesPlugin1);
        org.parboiled.Rule rule9 = attributesPlugin1.HtmlAttribute();
        org.parboiled.Rule rule10 = attributesPlugin1.Newline();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = attributesPlugin1.matchEnd();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule6);
        org.junit.Assert.assertNotNull(rule7);
        org.junit.Assert.assertNotNull(attributesParserOptional8);
        org.junit.Assert.assertNotNull(rule9);
        org.junit.Assert.assertNotNull(rule10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token4 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) token4);
        gutenberg.util.SimpleKeyValues simpleKeyValues6 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin7 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule8 = attributesPlugin7.BlankLine();
        java.lang.Object obj11 = null;
        org.parboiled.Rule rule12 = attributesPlugin7.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj11);
        org.parboiled.Rule rule13 = attributesPlugin7.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional14 = simpleKeyValues6.getNullable((java.lang.Object) attributesPlugin7);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional15 = simpleKeyValues0.getBoolean((java.lang.Object) attributesPlugin7);
        gutenberg.util.RGBFormatException rGBFormatException17 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray18 = rGBFormatException17.getSuppressed();
        org.parboiled.Rule rule19 = attributesPlugin7.FirstOf((java.lang.Object[]) throwableArray18);
        org.parboiled.Rule rule20 = attributesPlugin7.HtmlComment();
        gutenberg.itext.Styles styles21 = null;
        gutenberg.itext.DefaultHeaderCellStyler defaultHeaderCellStyler22 = new gutenberg.itext.DefaultHeaderCellStyler(styles21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = attributesPlugin7.push((java.lang.Object) styles21);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + token4 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token4.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(attributesParserOptional14);
        org.junit.Assert.assertNotNull(booleanOptional15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(rule19);
        org.junit.Assert.assertNotNull(rule20);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        gutenberg.itext.PageInfos pageInfos2 = null;
        gutenberg.itext.TableOfContents.Entry entry4 = new gutenberg.itext.TableOfContents.Entry("", (int) (short) 1, pageInfos2, "H2-font");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin1 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule2 = attributesPlugin1.BlankLine();
        java.lang.Object obj5 = null;
        org.parboiled.Rule rule6 = attributesPlugin1.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj5);
        org.parboiled.Rule rule7 = attributesPlugin1.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional8 = simpleKeyValues0.getNullable((java.lang.Object) attributesPlugin1);
        org.parboiled.Rule rule9 = attributesPlugin1.HtmlAttribute();
        org.parboiled.Rule rule10 = attributesPlugin1.Spn1();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule11 = attributesPlugin1.Space();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule6);
        org.junit.Assert.assertNotNull(rule7);
        org.junit.Assert.assertNotNull(attributesParserOptional8);
        org.junit.Assert.assertNotNull(rule9);
        org.junit.Assert.assertNotNull(rule10);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        gutenberg.itext.model.Markdown markdown1 = new gutenberg.itext.model.Markdown("table-alternate-background");
        gutenberg.itext.model.Markdown markdown3 = markdown1.flushChapter(false);
        boolean boolean4 = markdown1.flushChapter();
        org.junit.Assert.assertNotNull(markdown3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        gutenberg.itext.FontModifier fontModifier0 = gutenberg.itext.FontModifier.NULL_MODIFIER;
        org.junit.Assert.assertNotNull(fontModifier0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = attributesParser0.Symbol();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.util.RGB rGB1 = gutenberg.util.RGB.rgb("inline-code-background");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        gutenberg.itext.PageInfos pageInfos4 = null;
        gutenberg.itext.TableOfContents.Entry entry6 = new gutenberg.itext.TableOfContents.Entry("table-alternate-background", 1, pageInfos4, "first-page-title-font");
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule7 = attributesPlugin0.ZeroOrMore((java.lang.Object) pageInfos4);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: 'null' cannot be automatically converted to a parser Rule");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) (byte) 100);
        com.google.common.base.Optional<java.lang.String> strOptional7 = simpleKeyValues0.getString((java.lang.Object) 100);
        java.util.Map<java.lang.Object, java.lang.Object> objMap8 = simpleKeyValues0.asMap();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(strOptional7);
        org.junit.Assert.assertNotNull(objMap8);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.GenericEmph;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.GenericEmph + "'", token0.equals(gutenberg.pygments.Token.GenericEmph));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.parboiled.common.Reference<org.pegdown.Parser> parserReference0 = null;
        gutenberg.pegdown.plugin.GenericBoxPlugin genericBoxPlugin1 = new gutenberg.pegdown.plugin.GenericBoxPlugin(parserReference0);
        org.parboiled.support.Characters characters2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = genericBoxPlugin1.AnyOf(characters2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Argument 'characters' must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.parboiled.common.Reference<org.pegdown.Parser> parserReference0 = null;
        gutenberg.pegdown.plugin.LinkContentPlugin linkContentPlugin1 = new gutenberg.pegdown.plugin.LinkContentPlugin(parserReference0);
        gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser> blockPluginParserCollector2 = new gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser>();
        java.util.List<org.pegdown.plugins.BlockPluginParser> blockPluginParserList3 = blockPluginParserCollector2.getCollected();
        gutenberg.util.SimpleKeyValues simpleKeyValues4 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin5 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule6 = attributesPlugin5.BlankLine();
        java.lang.Object obj9 = null;
        org.parboiled.Rule rule10 = attributesPlugin5.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj9);
        org.parboiled.Rule rule11 = attributesPlugin5.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional12 = simpleKeyValues4.getNullable((java.lang.Object) attributesPlugin5);
        org.parboiled.Rule rule13 = attributesPlugin5.HtmlAttribute();
        org.parboiled.Rule rule14 = attributesPlugin5.Spn1();
        blockPluginParserCollector2.consume((org.pegdown.plugins.BlockPluginParser) attributesPlugin5);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule16 = linkContentPlugin1.ZeroOrMore((java.lang.Object) attributesPlugin5);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: 'gutenberg.pegdown.plugin.AttributesPlugin@2e54933b' cannot be automatically converted to a parser Rule");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(blockPluginParserList3);
        org.junit.Assert.assertNotNull(rule6);
        org.junit.Assert.assertNotNull(rule10);
        org.junit.Assert.assertNotNull(rule11);
        org.junit.Assert.assertNotNull(attributesParserOptional12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(rule14);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        org.parboiled.Rule rule2 = attributesPlugin0.NonindentSpace();
        org.parboiled.Rule rule3 = attributesPlugin0.Newline();
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin1 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule2 = attributesPlugin1.BlankLine();
        java.lang.Object obj5 = null;
        org.parboiled.Rule rule6 = attributesPlugin1.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj5);
        org.parboiled.Rule rule7 = attributesPlugin1.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional8 = simpleKeyValues0.getNullable((java.lang.Object) attributesPlugin1);
        org.parboiled.Rule rule9 = attributesPlugin1.HtmlAttribute();
        org.parboiled.Rule rule10 = attributesPlugin1.Newline();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule11 = attributesPlugin1.FencedCodeBlock();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule6);
        org.junit.Assert.assertNotNull(rule7);
        org.junit.Assert.assertNotNull(attributesParserOptional8);
        org.junit.Assert.assertNotNull(rule9);
        org.junit.Assert.assertNotNull(rule10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        gutenberg.itext.PygmentsAdapter pygmentsAdapter0 = null;
        java.awt.Color color1 = null;
        gutenberg.itext.emitter.SourceCodeLaTeXExtension sourceCodeLaTeXExtension2 = new gutenberg.itext.emitter.SourceCodeLaTeXExtension(pygmentsAdapter0, color1);
        boolean boolean4 = sourceCodeLaTeXExtension2.accepts("xxxv");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        java.lang.Object obj4 = null;
        org.parboiled.Rule rule5 = attributesPlugin0.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj4);
        gutenberg.pygments.Token token7 = gutenberg.pygments.Token.KeywordType;
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule9 = attributesPlugin0.NTimes(1, (java.lang.Object) token7, obj8);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: 'KeywordType' cannot be automatically converted to a parser Rule");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule5);
        org.junit.Assert.assertTrue("'" + token7 + "' != '" + gutenberg.pygments.Token.KeywordType + "'", token7.equals(gutenberg.pygments.Token.KeywordType));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.itextpdf.text.Paragraph paragraph0 = null;
        gutenberg.util.Attributes attributes1 = null;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.ITextUtils.applyAlign(paragraph0, attributes1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        gutenberg.itext.Styles styles0 = null;
        gutenberg.itext.DefaultHeaderCellStyler defaultHeaderCellStyler1 = new gutenberg.itext.DefaultHeaderCellStyler(styles0);
        gutenberg.itext.pegdown.TableBodyNodeProcessor tableBodyNodeProcessor2 = new gutenberg.itext.pegdown.TableBodyNodeProcessor((gutenberg.itext.CellStyler) defaultHeaderCellStyler1);
        gutenberg.pegdown.plugin.LinkContentNode linkContentNode6 = new gutenberg.pegdown.plugin.LinkContentNode("table-spacing-after", "AttributesNode{}");
        java.util.List<org.pegdown.ast.Node> nodeList7 = linkContentNode6.getChildren();
        java.lang.String str8 = linkContentNode6.toString();
        gutenberg.itext.pegdown.InvocationContext invocationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tableBodyNodeProcessor2.process(4, (org.pegdown.ast.Node) linkContentNode6, invocationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FootnoteNode{table-spacing-after:AttributesNode{}}" + "'", str8, "FootnoteNode{table-spacing-after:AttributesNode{}}");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        java.lang.Object obj4 = null;
        org.parboiled.Rule rule5 = attributesPlugin0.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj4);
        org.parboiled.Rule rule6 = attributesPlugin0.NormalChar();
        org.parboiled.Rule rule8 = attributesPlugin0.IgnoreCase('4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributesPlugin0.inPredicate();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule5);
        org.junit.Assert.assertNotNull(rule6);
        org.junit.Assert.assertNotNull(rule8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        gutenberg.util.AlignFormatException alignFormatException1 = new gutenberg.util.AlignFormatException("xxxv");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        gutenberg.itext.pegdown.StrongEmphSuperNodeProcessor strongEmphSuperNodeProcessor0 = new gutenberg.itext.pegdown.StrongEmphSuperNodeProcessor();
        gutenberg.pegdown.plugin.AttributesNode attributesNode3 = new gutenberg.pegdown.plugin.AttributesNode("");
        java.lang.String str4 = attributesNode3.toString();
        gutenberg.itext.pegdown.InvocationContext invocationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strongEmphSuperNodeProcessor0.process((int) ' ', (org.pegdown.ast.Node) attributesNode3, invocationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: gutenberg.pegdown.plugin.AttributesNode cannot be cast to org.pegdown.ast.StrongEmphSuperNode");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AttributesNode{}" + "'", str4, "AttributesNode{}");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        int int0 = org.pegdown.Extensions.SMARTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser> blockPluginParserCollector0 = new gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser>();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin1 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule2 = attributesPlugin1.BlankLine();
        blockPluginParserCollector0.consume((org.pegdown.plugins.BlockPluginParser) attributesPlugin1);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule4 = attributesPlugin1.NonAutoLink();
            org.junit.Assert.fail("Expected exception of type org.pegdown.ParsingTimeoutException; message: null");
        } catch (org.pegdown.ParsingTimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser> blockPluginParserCollector0 = new gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser>();
        java.util.List<org.pegdown.plugins.BlockPluginParser> blockPluginParserList1 = blockPluginParserCollector0.getCollected();
        gutenberg.util.SimpleKeyValues simpleKeyValues2 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin3 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule4 = attributesPlugin3.BlankLine();
        java.lang.Object obj7 = null;
        org.parboiled.Rule rule8 = attributesPlugin3.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj7);
        org.parboiled.Rule rule9 = attributesPlugin3.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional10 = simpleKeyValues2.getNullable((java.lang.Object) attributesPlugin3);
        org.parboiled.Rule rule11 = attributesPlugin3.HtmlAttribute();
        org.parboiled.Rule rule12 = attributesPlugin3.Spn1();
        blockPluginParserCollector0.consume((org.pegdown.plugins.BlockPluginParser) attributesPlugin3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = attributesPlugin3.pop(52);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(blockPluginParserList1);
        org.junit.Assert.assertNotNull(rule4);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule9);
        org.junit.Assert.assertNotNull(attributesParserOptional10);
        org.junit.Assert.assertNotNull(rule11);
        org.junit.Assert.assertNotNull(rule12);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        gutenberg.itext.FontModifier fontModifier0 = gutenberg.itext.FontModifier.fontModifier();
        gutenberg.itext.FontModifier.NULL_MODIFIER = fontModifier0;
        org.junit.Assert.assertNotNull(fontModifier0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.itextpdf.text.Paragraph paragraph0 = null;
        gutenberg.util.Attributes attributes1 = null;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.ITextUtils.applyWidth(paragraph0, attributes1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        gutenberg.pygments.styles.MonokaiStyle monokaiStyle0 = new gutenberg.pygments.styles.MonokaiStyle();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.Escape;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.Escape + "'", token0.equals(gutenberg.pygments.Token.Escape));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        gutenberg.itext.support.ITextContextBuilder iTextContextBuilder0 = new gutenberg.itext.support.ITextContextBuilder();
        gutenberg.itext.Styles styles1 = null;
        gutenberg.itext.support.ITextContextBuilder iTextContextBuilder2 = iTextContextBuilder0.usingStyles(styles1);
        gutenberg.itext.Styles styles3 = null;
        gutenberg.itext.support.ITextContextBuilder iTextContextBuilder4 = iTextContextBuilder2.usingStyles(styles3);
        org.junit.Assert.assertNotNull(iTextContextBuilder2);
        org.junit.Assert.assertNotNull(iTextContextBuilder4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        gutenberg.itext.pegdown.OrderedListNodeProcessor orderedListNodeProcessor0 = new gutenberg.itext.pegdown.OrderedListNodeProcessor();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.itextpdf.text.pdf.PdfPTable pdfPTable0 = null;
        gutenberg.util.Attributes attributes1 = null;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.ITextUtils.applyWidth(pdfPTable0, attributes1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        gutenberg.itext.Styles styles0 = null;
        gutenberg.itext.DefaultHeaderCellStyler defaultHeaderCellStyler1 = new gutenberg.itext.DefaultHeaderCellStyler(styles0);
        com.itextpdf.text.pdf.PdfPCell pdfPCell2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.itextpdf.text.pdf.PdfPCell pdfPCell3 = defaultHeaderCellStyler1.applyStyle(pdfPCell2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        org.parboiled.Rule rule3 = attributesParser0.NotNewline();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule4 = attributesParser0.FencedCodeBlock();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule3);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        org.parboiled.Rule rule4 = attributesParser0.String("AttributeNode{table-spacing-after:H4-font}");
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule5 = attributesParser0.TableCaption();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule4);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        gutenberg.itext.FontModifier fontModifier0 = gutenberg.itext.FontModifier.fontModifier();
        gutenberg.itext.FontModifier fontModifier2 = fontModifier0.size((float) (-1L));
        gutenberg.itext.FontModifier fontModifier3 = fontModifier2.noBold();
        org.junit.Assert.assertNotNull(fontModifier0);
        org.junit.Assert.assertNotNull(fontModifier2);
        org.junit.Assert.assertNotNull(fontModifier3);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.DecEntity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = attributesParser0.pop((int) '#');
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        gutenberg.itext.model.Markdown markdown1 = new gutenberg.itext.model.Markdown("table-alternate-background");
        gutenberg.itext.model.Markdown markdown3 = markdown1.flushChapter(false);
        gutenberg.itext.model.Markdown markdown5 = markdown3.flushChapter(true);
        org.junit.Assert.assertNotNull(markdown3);
        org.junit.Assert.assertNotNull(markdown5);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin1 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule2 = attributesPlugin1.BlankLine();
        java.lang.Object obj5 = null;
        org.parboiled.Rule rule6 = attributesPlugin1.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj5);
        org.parboiled.Rule rule7 = attributesPlugin1.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional8 = simpleKeyValues0.getNullable((java.lang.Object) attributesPlugin1);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule10 = attributesPlugin1.EmphOrStrong("AttributesNode{}");
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule6);
        org.junit.Assert.assertNotNull(rule7);
        org.junit.Assert.assertNotNull(attributesParserOptional8);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        gutenberg.util.RGB rGB3 = new gutenberg.util.RGB((int) '4', (int) (short) 10, 10);
        int int4 = rGB3.b();
        int int5 = rGB3.r();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.DecEntity();
        char[] charArray9 = new char[] { ' ', ' ', '#', ' ', 'a', '4' };
        org.parboiled.Rule rule10 = attributesParser0.NoneOf(charArray9);
        org.parboiled.Rule rule11 = attributesParser0.Sp();
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  # a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  # a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #,  , a, 4]");
        org.junit.Assert.assertNotNull(rule10);
        org.junit.Assert.assertNotNull(rule11);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        java.lang.String str0 = gutenberg.itext.HeaderFooter.HEADER_FONT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "header-font" + "'", str0, "header-font");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin1 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule2 = attributesPlugin1.BlankLine();
        java.lang.Object obj5 = null;
        org.parboiled.Rule rule6 = attributesPlugin1.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj5);
        org.parboiled.Rule rule7 = attributesPlugin1.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional8 = simpleKeyValues0.getNullable((java.lang.Object) attributesPlugin1);
        org.parboiled.Rule rule9 = attributesPlugin1.HtmlAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule10 = attributesPlugin1.Strong();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule6);
        org.junit.Assert.assertNotNull(rule7);
        org.junit.Assert.assertNotNull(attributesParserOptional8);
        org.junit.Assert.assertNotNull(rule9);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        org.parboiled.Rule rule4 = attributesParser0.String("AttributeNode{table-spacing-after:H4-font}");
        boolean boolean6 = attributesParser0.isHtmlTag("header-line-color");
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule2 = attributesParser0.HorizontalRule('a');
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.parboiled.common.Reference<org.pegdown.Parser> parserReference0 = null;
        gutenberg.pegdown.plugin.GenericBoxPlugin genericBoxPlugin1 = new gutenberg.pegdown.plugin.GenericBoxPlugin(parserReference0);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule[] ruleArray2 = genericBoxPlugin1.blockPluginRules();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.parboiled.common.Reference<org.pegdown.Parser> parserReference0 = null;
        gutenberg.pegdown.plugin.GenericBoxPlugin genericBoxPlugin1 = new gutenberg.pegdown.plugin.GenericBoxPlugin(parserReference0);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule2 = genericBoxPlugin1.Box();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Action action1 = org.parboiled.BaseParser.ACTION(false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: ACTION(...) calls can only be used in Rule creating parser methods");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.lang.Class<? extends org.pegdown.ast.Node> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<? extends org.pegdown.ast.Node>[] wildcardClassArray3 = (java.lang.Class<? extends org.pegdown.ast.Node>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        gutenberg.pegdown.TreeNavigation.Ancestor ancestor6 = gutenberg.pegdown.TreeNavigation.ancestor(wildcardClassArray3);
        gutenberg.pegdown.TreeNavigation.Ancestor ancestor7 = gutenberg.pegdown.TreeNavigation.ancestor(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(ancestor6);
        org.junit.Assert.assertNotNull(ancestor7);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        gutenberg.pegdown.plugin.AttributeNode attributeNode2 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        java.util.List<org.pegdown.ast.Node> nodeList3 = attributeNode2.getChildren();
        org.pegdown.ast.Visitor visitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributeNode2.accept(visitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        java.lang.Object obj4 = null;
        org.parboiled.Rule rule5 = attributesPlugin0.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj4);
        org.parboiled.Rule rule6 = attributesPlugin0.NormalChar();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.support.Position position7 = attributesPlugin0.position();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule5);
        org.junit.Assert.assertNotNull(rule6);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.itextpdf.text.BaseColor baseColor0 = gutenberg.itext.Colors.LIGHT_GRAY;
        org.junit.Assert.assertNotNull(baseColor0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token4 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) token4);
        gutenberg.util.SimpleKeyValues simpleKeyValues6 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin7 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule8 = attributesPlugin7.BlankLine();
        java.lang.Object obj11 = null;
        org.parboiled.Rule rule12 = attributesPlugin7.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj11);
        org.parboiled.Rule rule13 = attributesPlugin7.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional14 = simpleKeyValues6.getNullable((java.lang.Object) attributesPlugin7);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional15 = simpleKeyValues0.getBoolean((java.lang.Object) attributesPlugin7);
        gutenberg.util.RGBFormatException rGBFormatException17 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray18 = rGBFormatException17.getSuppressed();
        org.parboiled.Rule rule19 = attributesPlugin7.FirstOf((java.lang.Object[]) throwableArray18);
        org.parboiled.Rule rule20 = attributesPlugin7.Letter();
        boolean boolean22 = attributesPlugin7.ext((-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + token4 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token4.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(attributesParserOptional14);
        org.junit.Assert.assertNotNull(booleanOptional15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(rule19);
        org.junit.Assert.assertNotNull(rule20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        gutenberg.itext.PygmentsAdapter pygmentsAdapter0 = null;
        gutenberg.itext.emitter.SourceCodeDitaaExtension sourceCodeDitaaExtension1 = new gutenberg.itext.emitter.SourceCodeDitaaExtension(pygmentsAdapter0);
        boolean boolean3 = sourceCodeDitaaExtension1.accepts("inline-code-background");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.DecEntity();
        char[] charArray9 = new char[] { ' ', ' ', '#', ' ', 'a', '4' };
        org.parboiled.Rule rule10 = attributesParser0.NoneOf(charArray9);
        org.parboiled.support.StringBuilderVar stringBuilderVar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule12 = attributesParser0.DoubleIndentedBlocks(stringBuilderVar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  # a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  # a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #,  , a, 4]");
        org.junit.Assert.assertNotNull(rule10);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        gutenberg.font.FontAwesome fontAwesome0 = gutenberg.font.FontAwesome.getInstance();
        java.lang.String str2 = fontAwesome0.get("hi!");
        org.junit.Assert.assertNotNull(fontAwesome0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin1 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule2 = attributesPlugin1.BlankLine();
        java.lang.Object obj5 = null;
        org.parboiled.Rule rule6 = attributesPlugin1.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj5);
        org.parboiled.Rule rule7 = attributesPlugin1.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional8 = simpleKeyValues0.getNullable((java.lang.Object) attributesPlugin1);
        org.parboiled.Rule rule9 = attributesPlugin1.HtmlAttribute();
        org.parboiled.Rule rule10 = attributesPlugin1.Spn1();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule11 = attributesPlugin1.Inlines();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule6);
        org.junit.Assert.assertNotNull(rule7);
        org.junit.Assert.assertNotNull(attributesParserOptional8);
        org.junit.Assert.assertNotNull(rule9);
        org.junit.Assert.assertNotNull(rule10);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        java.lang.String str0 = gutenberg.itext.Styles.TABLE_BODY_FONT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "table-body-font" + "'", str0, "table-body-font");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.KeywordType;
        java.lang.String str1 = token0.repr();
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.KeywordType + "'", token0.equals(gutenberg.pygments.Token.KeywordType));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TokenKeywordType" + "'", str1, "TokenKeywordType");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        gutenberg.itext.PageInfos pageInfos2 = null;
        gutenberg.itext.TableOfContents.Entry entry4 = new gutenberg.itext.TableOfContents.Entry("table-alternate-background", (int) (byte) -1, pageInfos2, "table-spacing-after");
        int int5 = entry4.getLevel();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        java.util.Map<java.lang.Object, java.lang.Object> objMap4 = simpleKeyValues0.asMap();
        gutenberg.util.SimpleKeyValues simpleKeyValues5 = new gutenberg.util.SimpleKeyValues();
        boolean boolean8 = simpleKeyValues5.getBoolean((java.lang.Object) (short) 1, true);
        java.util.Map<java.lang.Object, java.lang.Object> objMap9 = simpleKeyValues5.asMap();
        simpleKeyValues0.declare((java.lang.Object) objMap9, (java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objMap4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objMap9);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        gutenberg.itext.Styles styles0 = new gutenberg.itext.Styles();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        gutenberg.itext.FontAwesomeAdapter fontAwesomeAdapter0 = new gutenberg.itext.FontAwesomeAdapter();
        com.itextpdf.text.BaseColor baseColor3 = gutenberg.itext.Colors.ORANGE;
        // The following exception was thrown during execution in test generation
        try {
            com.itextpdf.text.Chunk chunk4 = fontAwesomeAdapter0.symbol("header-font", (float) 100L, baseColor3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unrecognized symbol 'header-font'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(baseColor3);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        java.lang.Object obj4 = null;
        org.parboiled.Rule rule5 = attributesPlugin0.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj4);
        gutenberg.pegdown.plugin.AttributesParser attributesParser6 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule7 = attributesParser6.Spacechar();
        org.parboiled.Rule rule8 = attributesParser6.DecEntity();
        char[] charArray15 = new char[] { ' ', ' ', '#', ' ', 'a', '4' };
        org.parboiled.Rule rule16 = attributesParser6.NoneOf(charArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.pegdown.ast.RootNode rootNode17 = attributesPlugin0.parseInternal(charArray15);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule5);
        org.junit.Assert.assertNotNull(rule7);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "  # a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "  # a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ ,  , #,  , a, 4]");
        org.junit.Assert.assertNotNull(rule16);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        gutenberg.util.RGB rGB3 = new gutenberg.util.RGB((int) '4', (int) (short) 10, 10);
        int int4 = rGB3.b();
        java.lang.String str5 = rGB3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RGB{-13366774}" + "'", str5, "RGB{-13366774}");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token4 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) token4);
        gutenberg.util.SimpleKeyValues simpleKeyValues6 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin7 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule8 = attributesPlugin7.BlankLine();
        java.lang.Object obj11 = null;
        org.parboiled.Rule rule12 = attributesPlugin7.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj11);
        org.parboiled.Rule rule13 = attributesPlugin7.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional14 = simpleKeyValues6.getNullable((java.lang.Object) attributesPlugin7);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional15 = simpleKeyValues0.getBoolean((java.lang.Object) attributesPlugin7);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule16 = attributesPlugin7.DoubleQuoted();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + token4 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token4.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(attributesParserOptional14);
        org.junit.Assert.assertNotNull(booleanOptional15);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.Text;
        gutenberg.pygments.Token token1 = token0.parent();
        java.lang.String str2 = token1.repr();
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.Text + "'", token0.equals(gutenberg.pygments.Token.Text));
        org.junit.Assert.assertTrue("'" + token1 + "' != '" + gutenberg.pygments.Token.Token + "'", token1.equals(gutenberg.pygments.Token.Token));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Token" + "'", str2, "Token");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        gutenberg.pygments.Pygments pygments0 = null;
        gutenberg.pygments.Tokens tokens1 = new gutenberg.pygments.Tokens();
        java.util.Spliterator<gutenberg.pygments.TokenWithValue> tokenWithValueSpliterator2 = tokens1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.pygments.Pygments.RFormatter rFormatter3 = pygments0.new RFormatter(tokens1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to gutenberg.pygments.Pygments$RFormatter with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenWithValueSpliterator2);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.GenericStrong;
        gutenberg.pygments.TokenWithValue tokenWithValue2 = new gutenberg.pygments.TokenWithValue(token0, "table-spacing-after");
        java.lang.String str3 = tokenWithValue2.value;
        java.lang.String str4 = tokenWithValue2.value;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.GenericStrong + "'", token0.equals(gutenberg.pygments.Token.GenericStrong));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "table-spacing-after" + "'", str3, "table-spacing-after");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "table-spacing-after" + "'", str4, "table-spacing-after");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token4 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) token4);
        gutenberg.util.SimpleKeyValues simpleKeyValues6 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin7 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule8 = attributesPlugin7.BlankLine();
        java.lang.Object obj11 = null;
        org.parboiled.Rule rule12 = attributesPlugin7.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj11);
        org.parboiled.Rule rule13 = attributesPlugin7.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional14 = simpleKeyValues6.getNullable((java.lang.Object) attributesPlugin7);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional15 = simpleKeyValues0.getBoolean((java.lang.Object) attributesPlugin7);
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule17 = attributesPlugin7.ReferenceLink(false);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + token4 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token4.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(attributesParserOptional14);
        org.junit.Assert.assertNotNull(booleanOptional15);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        gutenberg.util.RGBFormatException rGBFormatException1 = new gutenberg.util.RGBFormatException("FootnoteNode{table-spacing-after:AttributesNode{}}");
        gutenberg.util.WrappedRuntimeException wrappedRuntimeException2 = new gutenberg.util.WrappedRuntimeException((java.lang.Throwable) rGBFormatException1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        gutenberg.pegdown.References.Ref ref3 = new gutenberg.pegdown.References.Ref("RGB{-13366774}", "Token", "footer-font");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        java.lang.String str0 = gutenberg.itext.Styles.SYMBOL_FONT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "symbol-font" + "'", str0, "symbol-font");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token4 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) token4);
        gutenberg.util.SimpleKeyValues simpleKeyValues6 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin7 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule8 = attributesPlugin7.BlankLine();
        java.lang.Object obj11 = null;
        org.parboiled.Rule rule12 = attributesPlugin7.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj11);
        org.parboiled.Rule rule13 = attributesPlugin7.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional14 = simpleKeyValues6.getNullable((java.lang.Object) attributesPlugin7);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional15 = simpleKeyValues0.getBoolean((java.lang.Object) attributesPlugin7);
        gutenberg.util.RGBFormatException rGBFormatException17 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray18 = rGBFormatException17.getSuppressed();
        org.parboiled.Rule rule19 = attributesPlugin7.FirstOf((java.lang.Object[]) throwableArray18);
        org.parboiled.Rule rule20 = attributesPlugin7.Letter();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule21 = attributesPlugin7.Para();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + token4 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token4.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(attributesParserOptional14);
        org.junit.Assert.assertNotNull(booleanOptional15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(rule19);
        org.junit.Assert.assertNotNull(rule20);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        java.lang.Object obj0 = gutenberg.itext.pegdown.BulletListNodeProcessor.BULLET_LIST_SPACING_AFTER;
        org.junit.Assert.assertEquals("'" + obj0 + "' != '" + "bullet-list-spacing-after" + "'", obj0, "bullet-list-spacing-after");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        gutenberg.itext.Styles styles0 = null;
        gutenberg.itext.DefaultHeaderCellStyler defaultHeaderCellStyler1 = new gutenberg.itext.DefaultHeaderCellStyler(styles0);
        gutenberg.itext.pegdown.TableBodyNodeProcessor tableBodyNodeProcessor2 = new gutenberg.itext.pegdown.TableBodyNodeProcessor((gutenberg.itext.CellStyler) defaultHeaderCellStyler1);
        org.pegdown.ast.Node node4 = null;
        gutenberg.itext.pegdown.InvocationContext invocationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tableBodyNodeProcessor2.process((int) '#', node4, invocationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        com.itextpdf.text.Font font1 = null;
        gutenberg.itext.model.RichText richText2 = new gutenberg.itext.model.RichText("", font1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        gutenberg.pegdown.plugin.AttributesNode attributesNode1 = new gutenberg.pegdown.plugin.AttributesNode("table-alternate-background");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        gutenberg.util.RGBFormatException rGBFormatException4 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray5 = rGBFormatException4.getSuppressed();
        org.parboiled.Rule[] ruleArray6 = attributesParser0.toRules((java.lang.Object[]) throwableArray5);
        org.parboiled.Rule rule8 = attributesParser0.AnyOf("default-color");
        org.parboiled.Rule rule9 = attributesParser0.Letter();
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(ruleArray6);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule9);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        gutenberg.pegdown.plugin.AttributesNode attributesNode1 = new gutenberg.pegdown.plugin.AttributesNode("");
        java.lang.String str2 = attributesNode1.toString();
        attributesNode1.shiftIndices((int) '#');
        java.lang.String str5 = attributesNode1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AttributesNode{}" + "'", str2, "AttributesNode{}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AttributesNode{}" + "'", str5, "AttributesNode{}");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        gutenberg.itext.pegdown.ExpLinkNodeProcessor expLinkNodeProcessor0 = new gutenberg.itext.pegdown.ExpLinkNodeProcessor();
        gutenberg.pegdown.plugin.LinkContentNode linkContentNode4 = new gutenberg.pegdown.plugin.LinkContentNode("table-spacing-after", "AttributesNode{}");
        gutenberg.itext.pegdown.InvocationContext invocationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            expLinkNodeProcessor0.process(8, (org.pegdown.ast.Node) linkContentNode4, invocationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: gutenberg.pegdown.plugin.LinkContentNode cannot be cast to org.pegdown.ast.ExpLinkNode");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        gutenberg.util.KeyValues keyValues0 = null;
        gutenberg.itext.Styles styles1 = null;
        gutenberg.itext.Sections sections2 = new gutenberg.itext.Sections(keyValues0, styles1);
        com.itextpdf.text.Chapter chapter3 = sections2.currentChapter();
        sections2.leaveSection((int) (byte) 0);
        org.junit.Assert.assertNull(chapter3);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.Generic;
        java.lang.String str1 = token0.shortName();
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.Generic + "'", token0.equals(gutenberg.pygments.Token.Generic));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "g" + "'", str1, "g");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.DecEntity();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = attributesParser0.Link();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesNode attributesNode2 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray3 = new org.pegdown.ast.Node[] { attributesNode2 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList4 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList4, nodeArray3);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode6 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList4);
        gutenberg.pegdown.plugin.AttributeNode attributeNode9 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        gutenberg.pegdown.plugin.AttributesNode attributesNode11 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray12 = new org.pegdown.ast.Node[] { attributesNode11 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList13 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList13, nodeArray12);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode15 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList13);
        org.pegdown.ast.Node[] nodeArray16 = new org.pegdown.ast.Node[] { genericBoxNode6, attributeNode9, genericBoxNode15 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList17 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList17, nodeArray16);
        gutenberg.pegdown.TreeNavigation treeNavigation19 = new gutenberg.pegdown.TreeNavigation((java.util.List<org.pegdown.ast.Node>) nodeList17);
        gutenberg.pegdown.plugin.AttributeNode attributeNode22 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        java.lang.String str23 = attributeNode22.toString();
        gutenberg.pegdown.TreeNavigation treeNavigation24 = treeNavigation19.push((org.pegdown.ast.Node) attributeNode22);
        com.google.common.base.Optional<gutenberg.itext.emitter.SourceCodeLaTeXExtension> sourceCodeLaTeXExtensionOptional25 = simpleKeyValues0.getNullable((java.lang.Object) attributeNode22);
        com.google.common.base.Optional<java.lang.String> strOptional27 = simpleKeyValues0.getString((java.lang.Object) (byte) 10);
        gutenberg.pygments.Token token28 = gutenberg.pygments.Token.NameVariableInstance;
        boolean boolean30 = simpleKeyValues0.getBoolean((java.lang.Object) token28, true);
        gutenberg.itext.TextStripper.Row row32 = new gutenberg.itext.TextStripper.Row((float) (byte) 10);
        com.google.common.base.Optional<java.lang.String> strOptional33 = simpleKeyValues0.getString((java.lang.Object) row32);
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AttributeNode{table-spacing-after:H4-font}" + "'", str23, "AttributeNode{table-spacing-after:H4-font}");
        org.junit.Assert.assertNotNull(treeNavigation24);
        org.junit.Assert.assertNotNull(sourceCodeLaTeXExtensionOptional25);
        org.junit.Assert.assertNotNull(strOptional27);
        org.junit.Assert.assertTrue("'" + token28 + "' != '" + gutenberg.pygments.Token.NameVariableInstance + "'", token28.equals(gutenberg.pygments.Token.NameVariableInstance));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strOptional33);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        gutenberg.itext.PageInfos pageInfos2 = null;
        gutenberg.itext.TableOfContents.Entry entry4 = new gutenberg.itext.TableOfContents.Entry("table-alternate-background", (int) (byte) -1, pageInfos2, "table-spacing-after");
        gutenberg.itext.PageInfos.Matter matter5 = gutenberg.itext.PageInfos.Matter.Back;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = entry4.is(matter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + matter5 + "' != '" + gutenberg.itext.PageInfos.Matter.Back + "'", matter5.equals(gutenberg.itext.PageInfos.Matter.Back));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        org.parboiled.Rule rule0 = org.parboiled.BaseParser.NOTHING;
        org.junit.Assert.assertNotNull(rule0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        gutenberg.util.Margin margin2 = new gutenberg.util.Margin((float) 0, (float) 0L);
        float float3 = margin2.marginBottom;
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        java.lang.String str0 = gutenberg.itext.Styles.H1_FONT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "H1-font" + "'", str0, "H1-font");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        gutenberg.util.RGB rGB3 = new gutenberg.util.RGB((int) '4', (int) (short) 10, 10);
        int int4 = rGB3.r();
        int int5 = rGB3.a();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 255 + "'", int5 == 255);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.DecEntity();
        char[] charArray9 = new char[] { ' ', ' ', '#', ' ', 'a', '4' };
        org.parboiled.Rule rule10 = attributesParser0.NoneOf(charArray9);
        gutenberg.pegdown.plugin.AttributesNode attributesNode13 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray14 = new org.pegdown.ast.Node[] { attributesNode13 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList15 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList15, nodeArray14);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode17 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = attributesParser0.push((-1), (java.lang.Object) nodeList15);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  # a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  # a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #,  , a, 4]");
        org.junit.Assert.assertNotNull(rule10);
        org.junit.Assert.assertNotNull(nodeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        org.parboiled.Rule rule3 = attributesParser0.NotNewline();
        org.parboiled.Rule rule4 = attributesParser0.NonindentSpace();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule5 = attributesParser0.Table();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule3);
        org.junit.Assert.assertNotNull(rule4);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        org.parboiled.Rule rule2 = attributesPlugin0.Indent();
        org.parboiled.support.StringVar stringVar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule4 = attributesPlugin0.HtmlTagBlock(stringVar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        org.parboiled.Rule rule0 = org.parboiled.BaseParser.ANY;
        org.junit.Assert.assertNotNull(rule0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        gutenberg.util.DimensionParser dimensionParser0 = new gutenberg.util.DimensionParser();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = gutenberg.itext.model.Markdown.UTF8;
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.model.Markdown markdown2 = gutenberg.itext.model.Markdown.from(inputStream0, charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charset1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.DecEntity();
        org.parboiled.Rule rule4 = attributesParser0.IgnoreCase("AttributeNode{table-spacing-after:H4-font}");
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule5 = attributesParser0.Strong();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule4);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        org.parboiled.Rule rule4 = attributesParser0.String("AttributeNode{table-spacing-after:H4-font}");
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule5 = attributesParser0.Str();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        org.parboiled.Rule rule4 = attributesParser0.String("AttributeNode{table-spacing-after:H4-font}");
        org.parboiled.support.Var<org.pegdown.ast.ReferenceNode> referenceNodeVar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule6 = attributesParser0.RefTitle(referenceNodeVar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule4);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        gutenberg.util.Style.Strikethrough strikethrough0 = gutenberg.util.Style.Strikethrough.True;
        org.junit.Assert.assertTrue("'" + strikethrough0 + "' != '" + gutenberg.util.Style.Strikethrough.True + "'", strikethrough0.equals(gutenberg.util.Style.Strikethrough.True));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        gutenberg.pygments.PyGateway pyGateway0 = gutenberg.pygments.PyGateway.getInstance();
        org.junit.Assert.assertNotNull(pyGateway0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pygments.Lexers lexers1 = gutenberg.pygments.Lexers.getInstance();
        gutenberg.pygments.Lexers lexers2 = gutenberg.pygments.Lexers.getInstance();
        simpleKeyValues0.declare((java.lang.Object) lexers1, (java.lang.Object) lexers2);
        gutenberg.pygments.Tokens tokens4 = new gutenberg.pygments.Tokens();
        java.util.Spliterator<gutenberg.pygments.TokenWithValue> tokenWithValueSpliterator5 = tokens4.spliterator();
        com.google.common.base.Optional<java.lang.String> strOptional6 = simpleKeyValues0.getString((java.lang.Object) tokens4);
        org.junit.Assert.assertNotNull(lexers1);
        org.junit.Assert.assertNotNull(lexers2);
        org.junit.Assert.assertNotNull(tokenWithValueSpliterator5);
        org.junit.Assert.assertNotNull(strOptional6);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        com.itextpdf.text.pdf.PdfPTable pdfPTable0 = null;
        gutenberg.util.Attributes attributes1 = new gutenberg.util.Attributes();
        gutenberg.itext.ITextUtils.applyWidth(pdfPTable0, attributes1);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        gutenberg.pygments.styles.DefaultStyle defaultStyle0 = new gutenberg.pygments.styles.DefaultStyle();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        int int0 = org.pegdown.Extensions.TABLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin1 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule2 = attributesPlugin1.BlankLine();
        java.lang.Object obj5 = null;
        org.parboiled.Rule rule6 = attributesPlugin1.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj5);
        org.parboiled.Rule rule7 = attributesPlugin1.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional8 = simpleKeyValues0.getNullable((java.lang.Object) attributesPlugin1);
        org.parboiled.Rule rule9 = attributesPlugin1.HtmlAttribute();
        org.parboiled.Context<java.lang.Object> objContext10 = attributesPlugin1.getContext();
        gutenberg.pegdown.plugin.AttributesParser attributesParser11 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule12 = attributesParser11.Spacechar();
        org.parboiled.Rule rule13 = attributesParser11.DecEntity();
        char[] charArray20 = new char[] { ' ', ' ', '#', ' ', 'a', '4' };
        org.parboiled.Rule rule21 = attributesParser11.NoneOf(charArray20);
        org.parboiled.Rule rule22 = attributesPlugin1.IgnoreCase(charArray20);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule6);
        org.junit.Assert.assertNotNull(rule7);
        org.junit.Assert.assertNotNull(attributesParserOptional8);
        org.junit.Assert.assertNotNull(rule9);
        org.junit.Assert.assertNull(objContext10);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "  # a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "  # a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[ ,  , #,  , a, 4]");
        org.junit.Assert.assertNotNull(rule21);
        org.junit.Assert.assertNotNull(rule22);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        gutenberg.itext.PygmentsAdapter pygmentsAdapter0 = null;
        gutenberg.itext.PygmentsAdapter pygmentsAdapter1 = null;
        gutenberg.itext.emitter.SourceCodeDitaaExtension sourceCodeDitaaExtension2 = new gutenberg.itext.emitter.SourceCodeDitaaExtension(pygmentsAdapter1);
        boolean boolean4 = sourceCodeDitaaExtension2.accepts("inline-code-background");
        gutenberg.itext.PygmentsAdapter pygmentsAdapter5 = null;
        gutenberg.itext.emitter.SourceCodeDitaaExtension sourceCodeDitaaExtension6 = new gutenberg.itext.emitter.SourceCodeDitaaExtension(pygmentsAdapter5);
        gutenberg.itext.emitter.SourceCodeEmitterExtension[] sourceCodeEmitterExtensionArray7 = new gutenberg.itext.emitter.SourceCodeEmitterExtension[] { sourceCodeDitaaExtension2, sourceCodeDitaaExtension6 };
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.emitter.SourceCodeEmitter sourceCodeEmitter8 = new gutenberg.itext.emitter.SourceCodeEmitter(pygmentsAdapter0, sourceCodeEmitterExtensionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No pygments adapter provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sourceCodeEmitterExtensionArray7);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.GenericTraceback;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.GenericTraceback + "'", token0.equals(gutenberg.pygments.Token.GenericTraceback));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        gutenberg.pegdown.plugin.AttributesNode attributesNode1 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray2 = new org.pegdown.ast.Node[] { attributesNode1 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList3 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList3, nodeArray2);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode5 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList3);
        gutenberg.pegdown.plugin.AttributeNode attributeNode8 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        gutenberg.pegdown.plugin.AttributesNode attributesNode10 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray11 = new org.pegdown.ast.Node[] { attributesNode10 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList12 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList12, nodeArray11);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode14 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList12);
        org.pegdown.ast.Node[] nodeArray15 = new org.pegdown.ast.Node[] { genericBoxNode5, attributeNode8, genericBoxNode14 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList16 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList16, nodeArray15);
        gutenberg.pegdown.TreeNavigation treeNavigation18 = new gutenberg.pegdown.TreeNavigation((java.util.List<org.pegdown.ast.Node>) nodeList16);
        org.pegdown.ast.Node node19 = treeNavigation18.peek();
        gutenberg.util.MutableSupplier<gutenberg.pegdown.TreeNavigation> treeNavigationMutableSupplier20 = new gutenberg.util.MutableSupplier<gutenberg.pegdown.TreeNavigation>(treeNavigation18);
        gutenberg.pegdown.plugin.AttributesNode attributesNode22 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray23 = new org.pegdown.ast.Node[] { attributesNode22 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList24 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList24, nodeArray23);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode26 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList24);
        gutenberg.pegdown.plugin.AttributeNode attributeNode29 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        gutenberg.pegdown.plugin.AttributesNode attributesNode31 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray32 = new org.pegdown.ast.Node[] { attributesNode31 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList33 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList33, nodeArray32);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode35 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList33);
        org.pegdown.ast.Node[] nodeArray36 = new org.pegdown.ast.Node[] { genericBoxNode26, attributeNode29, genericBoxNode35 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList37 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList37, nodeArray36);
        gutenberg.pegdown.TreeNavigation treeNavigation39 = new gutenberg.pegdown.TreeNavigation((java.util.List<org.pegdown.ast.Node>) nodeList37);
        gutenberg.pegdown.plugin.AttributesNode attributesNode41 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray42 = new org.pegdown.ast.Node[] { attributesNode41 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList43 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList43, nodeArray42);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode45 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList43);
        gutenberg.pegdown.plugin.AttributeNode attributeNode48 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        gutenberg.pegdown.plugin.AttributesNode attributesNode50 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray51 = new org.pegdown.ast.Node[] { attributesNode50 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList52 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList52, nodeArray51);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode54 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList52);
        org.pegdown.ast.Node[] nodeArray55 = new org.pegdown.ast.Node[] { genericBoxNode45, attributeNode48, genericBoxNode54 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList56 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList56, nodeArray55);
        gutenberg.pegdown.TreeNavigation treeNavigation58 = new gutenberg.pegdown.TreeNavigation((java.util.List<org.pegdown.ast.Node>) nodeList56);
        gutenberg.pegdown.plugin.AttributeNode attributeNode61 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        java.lang.String str62 = attributeNode61.toString();
        gutenberg.pegdown.TreeNavigation treeNavigation63 = treeNavigation58.push((org.pegdown.ast.Node) attributeNode61);
        gutenberg.pegdown.TreeNavigation treeNavigation64 = treeNavigation39.push((org.pegdown.ast.Node) attributeNode61);
        treeNavigationMutableSupplier20.set(treeNavigation64);
        org.pegdown.ast.Node node66 = treeNavigation64.pop();
        gutenberg.pegdown.plugin.AttributesNode attributesNode68 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray69 = new org.pegdown.ast.Node[] { attributesNode68 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList70 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList70, nodeArray69);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode72 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList70);
        gutenberg.pegdown.TreeNavigation treeNavigation73 = treeNavigation64.push((org.pegdown.ast.Node) genericBoxNode72);
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(nodeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(nodeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(nodeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "AttributeNode{table-spacing-after:H4-font}" + "'", str62, "AttributeNode{table-spacing-after:H4-font}");
        org.junit.Assert.assertNotNull(treeNavigation63);
        org.junit.Assert.assertNotNull(treeNavigation64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(nodeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(treeNavigation73);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        org.parboiled.Rule rule2 = attributesPlugin0.Indent();
        org.parboiled.Rule rule4 = attributesPlugin0.EmphOrStrongOpen("code-font");
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule4);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        org.parboiled.Rule rule2 = attributesPlugin0.Indent();
        org.parboiled.Rule rule3 = attributesPlugin0.Digit();
        org.parboiled.Rule rule5 = attributesPlugin0.String("AttributeNode{table-spacing-after:H4-font}");
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule6 = attributesPlugin0.Image();
            org.junit.Assert.fail("Expected exception of type org.pegdown.ParsingTimeoutException; message: null");
        } catch (org.pegdown.ParsingTimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule3);
        org.junit.Assert.assertNotNull(rule5);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.NameNamespace;
        gutenberg.pygments.TokenWithValue tokenWithValue2 = new gutenberg.pygments.TokenWithValue(token0, "default-color");
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.NameNamespace + "'", token0.equals(gutenberg.pygments.Token.NameNamespace));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser> blockPluginParserCollector0 = new gutenberg.util.Collector<org.pegdown.plugins.BlockPluginParser>();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin1 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule2 = attributesPlugin1.BlankLine();
        blockPluginParserCollector0.consume((org.pegdown.plugins.BlockPluginParser) attributesPlugin1);
        java.util.List<org.pegdown.plugins.BlockPluginParser> blockPluginParserList4 = blockPluginParserCollector0.getCollected();
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(blockPluginParserList4);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        int int0 = org.pegdown.Extensions.SUPPRESS_ALL_HTML;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 196608 + "'", int0 == 196608);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        gutenberg.itext.PygmentsAdapter pygmentsAdapter0 = null;
        gutenberg.itext.PygmentsAdapter pygmentsAdapter1 = null;
        gutenberg.itext.emitter.SourceCodeDitaaExtension sourceCodeDitaaExtension2 = new gutenberg.itext.emitter.SourceCodeDitaaExtension(pygmentsAdapter1);
        boolean boolean4 = sourceCodeDitaaExtension2.accepts("inline-code-background");
        gutenberg.itext.PygmentsAdapter pygmentsAdapter5 = null;
        gutenberg.itext.emitter.SourceCodeDitaaExtension sourceCodeDitaaExtension6 = new gutenberg.itext.emitter.SourceCodeDitaaExtension(pygmentsAdapter5);
        gutenberg.itext.PygmentsAdapter pygmentsAdapter7 = null;
        java.awt.Color color8 = null;
        gutenberg.itext.emitter.SourceCodeLaTeXExtension sourceCodeLaTeXExtension9 = new gutenberg.itext.emitter.SourceCodeLaTeXExtension(pygmentsAdapter7, color8);
        gutenberg.itext.PygmentsAdapter pygmentsAdapter10 = null;
        java.awt.Color color11 = null;
        gutenberg.itext.emitter.SourceCodeLaTeXExtension sourceCodeLaTeXExtension12 = new gutenberg.itext.emitter.SourceCodeLaTeXExtension(pygmentsAdapter10, color11);
        gutenberg.itext.emitter.SourceCodeEmitterExtension[] sourceCodeEmitterExtensionArray13 = new gutenberg.itext.emitter.SourceCodeEmitterExtension[] { sourceCodeDitaaExtension2, sourceCodeDitaaExtension6, sourceCodeLaTeXExtension9, sourceCodeLaTeXExtension12 };
        // The following exception was thrown during execution in test generation
        try {
            gutenberg.itext.emitter.SourceCodeEmitter sourceCodeEmitter14 = new gutenberg.itext.emitter.SourceCodeEmitter(pygmentsAdapter0, sourceCodeEmitterExtensionArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No pygments adapter provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sourceCodeEmitterExtensionArray13);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token4 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) token4);
        gutenberg.util.SimpleKeyValues simpleKeyValues6 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin7 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule8 = attributesPlugin7.BlankLine();
        java.lang.Object obj11 = null;
        org.parboiled.Rule rule12 = attributesPlugin7.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj11);
        org.parboiled.Rule rule13 = attributesPlugin7.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional14 = simpleKeyValues6.getNullable((java.lang.Object) attributesPlugin7);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional15 = simpleKeyValues0.getBoolean((java.lang.Object) attributesPlugin7);
        gutenberg.pegdown.References references16 = new gutenberg.pegdown.References();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule17 = attributesPlugin7.toRule((java.lang.Object) references16);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: 'gutenberg.pegdown.References@54e11eb2' cannot be automatically converted to a parser Rule");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + token4 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token4.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(attributesParserOptional14);
        org.junit.Assert.assertNotNull(booleanOptional15);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin0 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule1 = attributesPlugin0.BlankLine();
        java.lang.Object obj4 = null;
        org.parboiled.Rule rule5 = attributesPlugin0.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj4);
        org.parboiled.Rule rule6 = attributesPlugin0.NormalChar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = attributesPlugin0.pop(32);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule5);
        org.junit.Assert.assertNotNull(rule6);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        java.lang.String[] strArray5 = new java.lang.String[] { "H4-font", "header-line-color", "code-font", "inline-code-background" };
        gutenberg.pygments.LexerInfo lexerInfo6 = new gutenberg.pygments.LexerInfo("header-font", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        gutenberg.util.RGBFormatException rGBFormatException4 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray5 = rGBFormatException4.getSuppressed();
        org.parboiled.Rule[] ruleArray6 = attributesParser0.toRules((java.lang.Object[]) throwableArray5);
        org.parboiled.support.Characters characters7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule8 = attributesParser0.AnyOf(characters7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Argument 'characters' must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(ruleArray6);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        gutenberg.util.RomanNumeral romanNumeral0 = new gutenberg.util.RomanNumeral();
        java.lang.String str2 = romanNumeral0.format((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = romanNumeral0.format((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative number not allowed: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxv" + "'", str2, "xxxv");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        com.itextpdf.text.Font font0 = null;
        gutenberg.itext.FontCopier fontCopier1 = new gutenberg.itext.FontCopier(font0);
        com.itextpdf.text.Font font2 = fontCopier1.get();
        gutenberg.itext.FontCopier fontCopier3 = fontCopier1.italic();
        org.junit.Assert.assertNull(font2);
        org.junit.Assert.assertNotNull(fontCopier3);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin1 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule2 = attributesPlugin1.BlankLine();
        java.lang.Object obj5 = null;
        org.parboiled.Rule rule6 = attributesPlugin1.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj5);
        org.parboiled.Rule rule7 = attributesPlugin1.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional8 = simpleKeyValues0.getNullable((java.lang.Object) attributesPlugin1);
        org.parboiled.Rule rule9 = attributesPlugin1.HtmlAttribute();
        org.parboiled.Rule rule10 = attributesPlugin1.Spn1();
        org.parboiled.Rule rule12 = attributesPlugin1.HorizontalRule('4');
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule6);
        org.junit.Assert.assertNotNull(rule7);
        org.junit.Assert.assertNotNull(attributesParserOptional8);
        org.junit.Assert.assertNotNull(rule9);
        org.junit.Assert.assertNotNull(rule10);
        org.junit.Assert.assertNotNull(rule12);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        org.parboiled.common.Reference<org.pegdown.Parser> parserReference0 = null;
        gutenberg.pegdown.plugin.GenericBoxPlugin genericBoxPlugin1 = new gutenberg.pegdown.plugin.GenericBoxPlugin(parserReference0);
        org.parboiled.common.Reference<org.pegdown.Parser> parserReference2 = genericBoxPlugin1.delegate;
        org.parboiled.Rule rule3 = org.parboiled.BaseParser.DEDENT;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule4 = genericBoxPlugin1.Code(rule3);
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parserReference2);
        org.junit.Assert.assertNotNull(rule3);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        org.parboiled.common.Reference<org.pegdown.Parser> parserReference0 = null;
        gutenberg.pegdown.plugin.GenericBoxPlugin genericBoxPlugin1 = new gutenberg.pegdown.plugin.GenericBoxPlugin(parserReference0);
        org.parboiled.common.Reference<org.pegdown.Parser> parserReference2 = genericBoxPlugin1.delegate;
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = genericBoxPlugin1.HtmlBlockInTags();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(parserReference2);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin1 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule2 = attributesPlugin1.BlankLine();
        java.lang.Object obj5 = null;
        org.parboiled.Rule rule6 = attributesPlugin1.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj5);
        org.parboiled.Rule rule7 = attributesPlugin1.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional8 = simpleKeyValues0.getNullable((java.lang.Object) attributesPlugin1);
        org.parboiled.Rule rule9 = attributesPlugin1.HtmlAttribute();
        org.parboiled.Rule rule10 = attributesPlugin1.Spn1();
        org.parboiled.Rule rule12 = attributesPlugin1.IgnoreCase('#');
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule14 = attributesPlugin1.AnyOf("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule2);
        org.junit.Assert.assertNotNull(rule6);
        org.junit.Assert.assertNotNull(rule7);
        org.junit.Assert.assertNotNull(attributesParserOptional8);
        org.junit.Assert.assertNotNull(rule9);
        org.junit.Assert.assertNotNull(rule10);
        org.junit.Assert.assertNotNull(rule12);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        gutenberg.pegdown.plugin.AttributesParser attributesParser0 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule1 = attributesParser0.Spacechar();
        org.parboiled.Rule rule2 = attributesParser0.Digit();
        // The following exception was thrown during execution in test generation
        try {
            org.parboiled.Rule rule3 = attributesParser0.DefinitionList();
            org.junit.Assert.fail("Expected exception of type org.parboiled.errors.GrammarException; message: Illegal rule definition: Unwrapped action expression!");
        } catch (org.parboiled.errors.GrammarException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rule1);
        org.junit.Assert.assertNotNull(rule2);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        boolean boolean3 = simpleKeyValues0.getBoolean((java.lang.Object) (short) 1, true);
        gutenberg.pygments.Token token4 = gutenberg.pygments.Token.NumberInteger;
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional5 = simpleKeyValues0.getBoolean((java.lang.Object) token4);
        gutenberg.util.SimpleKeyValues simpleKeyValues6 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesPlugin attributesPlugin7 = new gutenberg.pegdown.plugin.AttributesPlugin();
        org.parboiled.Rule rule8 = attributesPlugin7.BlankLine();
        java.lang.Object obj11 = null;
        org.parboiled.Rule rule12 = attributesPlugin7.NTimes((int) (byte) 10, (java.lang.Object) ' ', obj11);
        org.parboiled.Rule rule13 = attributesPlugin7.NormalChar();
        com.google.common.base.Optional<gutenberg.pegdown.plugin.AttributesParser> attributesParserOptional14 = simpleKeyValues6.getNullable((java.lang.Object) attributesPlugin7);
        com.google.common.base.Optional<java.lang.Boolean> booleanOptional15 = simpleKeyValues0.getBoolean((java.lang.Object) attributesPlugin7);
        gutenberg.util.RGBFormatException rGBFormatException17 = new gutenberg.util.RGBFormatException("table-alternate-background");
        java.lang.Throwable[] throwableArray18 = rGBFormatException17.getSuppressed();
        org.parboiled.Rule rule19 = attributesPlugin7.FirstOf((java.lang.Object[]) throwableArray18);
        org.parboiled.Rule rule20 = attributesPlugin7.HtmlComment();
        boolean boolean22 = attributesPlugin7.isHtmlTag("inline-code-background");
        org.parboiled.Rule rule23 = attributesPlugin7.Alphanumeric();
        gutenberg.pegdown.plugin.AttributesParser attributesParser24 = new gutenberg.pegdown.plugin.AttributesParser();
        org.parboiled.Rule rule25 = attributesParser24.Spacechar();
        org.parboiled.Rule rule26 = attributesParser24.DecEntity();
        char[] charArray33 = new char[] { ' ', ' ', '#', ' ', 'a', '4' };
        org.parboiled.Rule rule34 = attributesParser24.NoneOf(charArray33);
        org.parboiled.Rule rule35 = attributesPlugin7.String(charArray33);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + token4 + "' != '" + gutenberg.pygments.Token.NumberInteger + "'", token4.equals(gutenberg.pygments.Token.NumberInteger));
        org.junit.Assert.assertNotNull(booleanOptional5);
        org.junit.Assert.assertNotNull(rule8);
        org.junit.Assert.assertNotNull(rule12);
        org.junit.Assert.assertNotNull(rule13);
        org.junit.Assert.assertNotNull(attributesParserOptional14);
        org.junit.Assert.assertNotNull(booleanOptional15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(rule19);
        org.junit.Assert.assertNotNull(rule20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(rule23);
        org.junit.Assert.assertNotNull(rule25);
        org.junit.Assert.assertNotNull(rule26);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "  # a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "  # a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[ ,  , #,  , a, 4]");
        org.junit.Assert.assertNotNull(rule34);
        org.junit.Assert.assertNotNull(rule35);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        gutenberg.pegdown.plugin.AttributesNode attributesNode1 = new gutenberg.pegdown.plugin.AttributesNode("");
        java.lang.String str2 = attributesNode1.toString();
        gutenberg.util.Attributes attributes3 = attributesNode1.asAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AttributesNode{}" + "'", str2, "AttributesNode{}");
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        com.itextpdf.text.BaseColor baseColor0 = gutenberg.itext.Colors.DARK_BLUE;
        gutenberg.itext.pegdown.SimpleNodeProcessor simpleNodeProcessor2 = new gutenberg.itext.pegdown.SimpleNodeProcessor(baseColor0, (float) (-13366774));
        org.junit.Assert.assertNotNull(baseColor0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        gutenberg.pegdown.plugin.AttributeNode attributeNode2 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        java.lang.String str3 = attributeNode2.toString();
        java.lang.String str4 = attributeNode2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AttributeNode{table-spacing-after:H4-font}" + "'", str3, "AttributeNode{table-spacing-after:H4-font}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AttributeNode{table-spacing-after:H4-font}" + "'", str4, "AttributeNode{table-spacing-after:H4-font}");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        gutenberg.pygments.Token token0 = gutenberg.pygments.Token.NumberHex;
        org.junit.Assert.assertTrue("'" + token0 + "' != '" + gutenberg.pygments.Token.NumberHex + "'", token0.equals(gutenberg.pygments.Token.NumberHex));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        gutenberg.util.SimpleKeyValues simpleKeyValues0 = new gutenberg.util.SimpleKeyValues();
        gutenberg.pegdown.plugin.AttributesNode attributesNode2 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray3 = new org.pegdown.ast.Node[] { attributesNode2 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList4 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList4, nodeArray3);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode6 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList4);
        gutenberg.pegdown.plugin.AttributeNode attributeNode9 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        gutenberg.pegdown.plugin.AttributesNode attributesNode11 = new gutenberg.pegdown.plugin.AttributesNode("");
        org.pegdown.ast.Node[] nodeArray12 = new org.pegdown.ast.Node[] { attributesNode11 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList13 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList13, nodeArray12);
        gutenberg.pegdown.plugin.GenericBoxNode genericBoxNode15 = new gutenberg.pegdown.plugin.GenericBoxNode((java.util.List<org.pegdown.ast.Node>) nodeList13);
        org.pegdown.ast.Node[] nodeArray16 = new org.pegdown.ast.Node[] { genericBoxNode6, attributeNode9, genericBoxNode15 };
        java.util.ArrayList<org.pegdown.ast.Node> nodeList17 = new java.util.ArrayList<org.pegdown.ast.Node>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.pegdown.ast.Node>) nodeList17, nodeArray16);
        gutenberg.pegdown.TreeNavigation treeNavigation19 = new gutenberg.pegdown.TreeNavigation((java.util.List<org.pegdown.ast.Node>) nodeList17);
        gutenberg.pegdown.plugin.AttributeNode attributeNode22 = new gutenberg.pegdown.plugin.AttributeNode("table-spacing-after", "H4-font");
        java.lang.String str23 = attributeNode22.toString();
        gutenberg.pegdown.TreeNavigation treeNavigation24 = treeNavigation19.push((org.pegdown.ast.Node) attributeNode22);
        com.google.common.base.Optional<gutenberg.itext.emitter.SourceCodeLaTeXExtension> sourceCodeLaTeXExtensionOptional25 = simpleKeyValues0.getNullable((java.lang.Object) attributeNode22);
        com.google.common.base.Optional<java.lang.String> strOptional27 = simpleKeyValues0.getString((java.lang.Object) (byte) 10);
        gutenberg.pygments.Token token28 = gutenberg.pygments.Token.NameVariableInstance;
        boolean boolean30 = simpleKeyValues0.getBoolean((java.lang.Object) token28, true);
        gutenberg.util.Attributes attributes31 = new gutenberg.util.Attributes();
        java.lang.String str33 = simpleKeyValues0.getString((java.lang.Object) attributes31, "H2-font");
        org.junit.Assert.assertNotNull(nodeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(nodeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AttributeNode{table-spacing-after:H4-font}" + "'", str23, "AttributeNode{table-spacing-after:H4-font}");
        org.junit.Assert.assertNotNull(treeNavigation24);
        org.junit.Assert.assertNotNull(sourceCodeLaTeXExtensionOptional25);
        org.junit.Assert.assertNotNull(strOptional27);
        org.junit.Assert.assertTrue("'" + token28 + "' != '" + gutenberg.pygments.Token.NameVariableInstance + "'", token28.equals(gutenberg.pygments.Token.NameVariableInstance));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H2-font" + "'", str33, "H2-font");
    }
}

