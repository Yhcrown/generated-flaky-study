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
        java.lang.String str0 = javax.servlet.jsp.PageContext.SESSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "javax.servlet.jsp.jspSession" + "'", str0, "javax.servlet.jsp.jspSession");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.engine.specification.SpecificationUtil.purgeSerializedFile("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        boolean boolean1 = org.seasar.mayaa.impl.util.StringUtil.isRelativePath("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        // The following exception was thrown during execution in test generation
        try {
            org.mozilla.javascript.Scriptable scriptable0 = org.seasar.mayaa.impl.cycle.script.rhino.RhinoUtil.getScope();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.util.Iterator iterator0 = org.seasar.mayaa.impl.util.collection.NullIterator.getInstance();
        org.junit.Assert.assertNotNull(iterator0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        org.seasar.mayaa.engine.specification.QName qName1 = org.seasar.mayaa.impl.CONST_IMPL.QM_BEFORE_RENDER_PROCESSOR;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.builder.library.NoRequiredPropertyException noRequiredPropertyException2 = new org.seasar.mayaa.impl.builder.library.NoRequiredPropertyException("javax.servlet.jsp.jspSession", qName1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qName1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.FILE_WEB_DTD_23;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "web-app_2_3.dtd" + "'", str0, "web-app_2_3.dtd");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.source.SourceDescriptor sourceDescriptor1 = org.seasar.mayaa.impl.source.SourceUtil.getSourceDescriptor("javax.servlet.jsp.jspSession");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor0 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        org.seasar.mayaa.engine.processor.ProcessorProperty processorProperty1 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributeProcessor0.setValue(processorProperty1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.seasar.mayaa.impl.provider.factory.ProviderTagHandler providerTagHandler0 = null;
        org.seasar.mayaa.provider.ServiceProvider serviceProvider1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.provider.factory.LibraryManagerTagHandler libraryManagerTagHandler2 = new org.seasar.mayaa.impl.provider.factory.LibraryManagerTagHandler(providerTagHandler0, serviceProvider1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        org.seasar.mayaa.engine.Page page0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.engine.RenderUtil.saveToCycle(page0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.Class<org.seasar.mayaa.engine.specification.serialize.ProcessorReferenceResolverFinder> processorReferenceResolverFinderClass0 = null;
        org.seasar.mayaa.impl.util.ReferenceCache.SweepListener sweepListener2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.util.ReferenceCache<org.seasar.mayaa.engine.specification.serialize.ProcessorReferenceResolverFinder> processorReferenceResolverFinderReferenceCache3 = new org.seasar.mayaa.impl.util.ReferenceCache<org.seasar.mayaa.engine.specification.serialize.ProcessorReferenceResolverFinder>(processorReferenceResolverFinderClass0, 0, sweepListener2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        long long0 = org.seasar.mayaa.impl.CONST_IMPL.NOFILE_DATE_MILLIS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.seasar.mayaa.engine.specification.QName qName1 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.createQName("web-app_2_3.dtd");
        org.junit.Assert.assertNotNull(qName1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.cycle.CycleFactory cycleFactory0 = org.seasar.mayaa.impl.cycle.CycleUtil.getFactory();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.seasar.mayaa.PositionAware positionAware1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.script.rhino.direct.PageGetterScript pageGetterScript6 = new org.seasar.mayaa.impl.cycle.script.rhino.direct.PageGetterScript("", positionAware1, (int) ' ', "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.util.Iterator<?> wildcardItor1 = org.seasar.mayaa.impl.util.IteratorUtil.toIterator((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.String str0 = org.seasar.mayaa.impl.CONST_IMPL.NOT_TEMPLATE_PATH_PATTERN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "notTemplatePathPattern" + "'", str0, "notTemplatePathPattern");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        org.seasar.mayaa.engine.specification.Namespace namespace1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jaxen.XPath xPath2 = org.seasar.mayaa.impl.engine.specification.xpath.SpecificationXPath.createXPath("hi!", namespace1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: org.jaxen.XPathSyntaxException: Unexpected '!'");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.specification.Specification specification0 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.findSpecification();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        org.seasar.mayaa.impl.management.JMXUtil jMXUtil0 = new org.seasar.mayaa.impl.management.JMXUtil();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.util.Iterator<org.seasar.mayaa.source.SourceHolder> sourceHolderItor0 = org.seasar.mayaa.impl.source.SourceHolderFactory.iterator();
        org.junit.Assert.assertNotNull(sourceHolderItor0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        org.seasar.mayaa.impl.engine.processor.InsertProcessor insertProcessor0 = null;
        org.seasar.mayaa.impl.engine.processor.ComponentRenderer componentRenderer2 = new org.seasar.mayaa.impl.engine.processor.ComponentRenderer(insertProcessor0, "notTemplatePathPattern");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.CycleUtil.setGlobalVariable("", (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.cyberneko.html.HTMLScanner hTMLScanner0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.builder.parser.TemplateParser templateParser3 = new org.seasar.mayaa.impl.builder.parser.TemplateParser(hTMLScanner0, "notTemplatePathPattern", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.seasar.mayaa.impl.engine.processor.JspProcessor.clear();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.FILE_DATATYPES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "datatypes.dtd" + "'", str0, "datatypes.dtd");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.seasar.mayaa.impl.cycle.scope.BindingScope bindingScope0 = new org.seasar.mayaa.impl.cycle.scope.BindingScope();
        // The following exception was thrown during execution in test generation
        try {
            bindingScope0.removeAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.seasar.mayaa.cycle.script.CompiledScript compiledScript0 = null;
        org.seasar.mayaa.impl.cycle.jsp.ExpressionImpl expressionImpl1 = new org.seasar.mayaa.impl.cycle.jsp.ExpressionImpl(compiledScript0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        int int0 = javax.servlet.http.HttpServletResponse.SC_CONFLICT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 409 + "'", int0 == 409);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.lang.String str0 = org.seasar.mayaa.impl.CONST_IMPL.SUFFIX_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "suffixSeparator" + "'", str0, "suffixSeparator");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        org.seasar.mayaa.engine.specification.Namespace namespace0 = null;
        org.seasar.mayaa.engine.specification.Namespace namespace1 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.copyNamespace(namespace0);
        org.junit.Assert.assertNull(namespace1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.seasar.mayaa.impl.builder.injection.EqualsIDInjectionResolver equalsIDInjectionResolver0 = new org.seasar.mayaa.impl.builder.injection.EqualsIDInjectionResolver();
        org.seasar.mayaa.engine.specification.SpecificationNode specificationNode1 = null;
        org.seasar.mayaa.builder.injection.InjectionChain injectionChain2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.specification.SpecificationNode specificationNode3 = equalsIDInjectionResolver0.getNode(specificationNode1, injectionChain2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor0 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor1 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        org.seasar.mayaa.builder.SequenceIDGenerator sequenceIDGenerator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.builder.BuilderUtil.characterProcessorCopy((org.seasar.mayaa.engine.processor.TemplateProcessor) attributeProcessor0, (org.seasar.mayaa.impl.engine.processor.TemplateProcessorSupport) attributeProcessor1, sequenceIDGenerator2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: originalNode is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.seasar.mayaa.engine.specification.Specification specification0 = null;
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.engine.specification.SpecificationUtil.serialize(specification0, file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.util.Iterator<org.seasar.mayaa.source.SourceDescriptor> sourceDescriptorItor1 = org.seasar.mayaa.impl.MarshallUtil.iterateMetaInfSources("web-app_2_3.dtd");
        org.junit.Assert.assertNotNull(sourceDescriptorItor1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.lang.String str0 = org.seasar.mayaa.impl.engine.EngineImpl.PAGE_SERIALIZE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pageSerialize" + "'", str0, "pageSerialize");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        int int0 = javax.servlet.http.HttpServletResponse.SC_HTTP_VERSION_NOT_SUPPORTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 505 + "'", int0 == 505);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor0 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.seasar.mayaa.impl.engine.EngineUtil.getSourcePath((org.seasar.mayaa.engine.processor.ProcessorTreeWalker) attributeProcessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: unknown sourcePath from processor");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        int int0 = javax.servlet.http.HttpServletResponse.SC_REQUEST_ENTITY_TOO_LARGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 413 + "'", int0 == 413);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.seasar.mayaa.impl.engine.processor.CharactersProcessor charactersProcessor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.engine.processor.CharactersProcessor charactersProcessor2 = new org.seasar.mayaa.impl.engine.processor.CharactersProcessor(charactersProcessor0, "javax.servlet.jsp.jspSession");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        org.mozilla.javascript.Scriptable scriptable0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[][] strArray14 = new java.lang.String[][] { strArray7, strArray13 };
        org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl pathRelativeAdjusterImpl15 = new org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl(strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.mozilla.javascript.ScriptableObject.callMethod(scriptable0, "hi!", (java.lang.Object[]) strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        int int0 = org.mozilla.javascript.ScriptableObject.EMPTY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.mozilla.javascript.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mozilla.javascript.ScriptableObject.hasProperty(scriptable0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.seasar.mayaa.impl.builder.library.scanner.MetaInfSourceScanner metaInfSourceScanner0 = new org.seasar.mayaa.impl.builder.library.scanner.MetaInfSourceScanner();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.seasar.mayaa.source.SourceDescriptor> sourceDescriptorItor1 = metaInfSourceScanner0.scan();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        int int0 = javax.servlet.jsp.JspWriter.UNBOUNDED_BUFFER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2) + "'", int0 == (-2));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        java.lang.String str0 = javax.servlet.http.HttpServletRequest.FORM_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FORM" + "'", str0, "FORM");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.seasar.mayaa.engine.specification.Namespace namespace0 = null;
        org.seasar.mayaa.engine.specification.Namespace namespace1 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.getFixedNamespace(namespace0);
        org.junit.Assert.assertNull(namespace1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        short short0 = org.apache.xerces.xni.XMLDTDContentModelHandler.SEPARATOR_SEQUENCE;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 1 + "'", short0 == (short) 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.web.HeaderValuesScope headerValuesScope1 = new org.seasar.mayaa.impl.cycle.web.HeaderValuesScope(httpServletRequest0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.seasar.mayaa.impl.source.SourceHolderFactory.release();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.lang.String str0 = org.cyberneko.html.HTMLScanner.STYLE_STRIP_COMMENT_DELIMS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://cyberneko.org/html/features/scanner/style/strip-comment-delims" + "'", str0, "http://cyberneko.org/html/features/scanner/style/strip-comment-delims");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.parser.TemplateScanner.LEXICAL_HANDLER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://xml.org/sax/properties/lexical-handler" + "'", str0, "http://xml.org/sax/properties/lexical-handler");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        int int0 = javax.servlet.http.HttpServletResponse.SC_PRECONDITION_FAILED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 412 + "'", int0 == 412);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.lang.Throwable throwable0 = null;
        boolean boolean1 = org.seasar.mayaa.impl.engine.EngineUtil.isClientAbortException(throwable0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.String str0 = org.seasar.mayaa.impl.CONST_IMPL.PUBLIC_FACTORY10;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-//The Seasar Foundation//DTD Mayaa Factory 1.0//EN" + "'", str0, "-//The Seasar Foundation//DTD Mayaa Factory 1.0//EN");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.String str0 = org.cyberneko.html.HTMLScanner.HTML_4_01_STRICT_SYSID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/TR/html4/strict.dtd" + "'", str0, "http://www.w3.org/TR/html4/strict.dtd");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.seasar.mayaa.engine.Page page0 = null;
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor1 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker2 = attributeProcessor1.getParentProcessor();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.processor.ProcessStatus processStatus3 = org.seasar.mayaa.impl.engine.RenderUtil.renderProcessorTree(page0, processorTreeWalker2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        boolean boolean0 = org.seasar.mayaa.impl.cycle.CycleUtil.isDraftWriting();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor0 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.specification.serialize.ProcessorReferenceResolver processorReferenceResolver1 = attributeProcessor0.findProcessorResolver();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        boolean boolean0 = org.seasar.mayaa.impl.cycle.CycleUtil.isInitialized();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.seasar.mayaa.engine.Page page0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.engine.PageImpl.setCurrentComponent(page0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.seasar.mayaa.engine.specification.SpecificationNode specificationNode0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.getNodeBodyText(specificationNode0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.source.SourceDescriptor sourceDescriptor1 = org.seasar.mayaa.impl.source.SourceUtil.getSourceDescriptor("notTemplatePathPattern");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.String str0 = org.seasar.mayaa.cycle.ServiceCycle.SCOPE_SESSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "session" + "'", str0, "session");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.text.DateFormat dateFormat0 = null;
        org.seasar.mayaa.impl.util.DateFormatPool.returnFormat(dateFormat0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.jaxen.Navigator navigator0 = org.seasar.mayaa.impl.engine.specification.xpath.SpecificationNavigator.getInstance();
        org.junit.Assert.assertNotNull(navigator0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.String str0 = javax.servlet.jsp.PageContext.RESPONSE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "javax.servlet.jsp.jspResponse" + "'", str0, "javax.servlet.jsp.jspResponse");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.mozilla.javascript.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mozilla.javascript.ScriptableObject.redefineProperty(scriptable0, "notTemplatePathPattern", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.LOCATION_WEB_SERVICE_CLIENT_12;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://java.sun.com/xml/ns/javaee/j2ee_web_services_client_1_2.xsd" + "'", str0, "http://java.sun.com/xml/ns/javaee/j2ee_web_services_client_1_2.xsd");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        int int0 = javax.servlet.http.HttpServletResponse.SC_REQUEST_URI_TOO_LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 414 + "'", int0 == 414);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.seasar.mayaa.impl.cycle.scope.BindingScope bindingScope0 = new org.seasar.mayaa.impl.cycle.scope.BindingScope();
        bindingScope0.setLineNumber(100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.lang.String> strItor3 = bindingScope0.iterateAttributeNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.String[] strArray5 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray5, strArray11 };
        org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl pathRelativeAdjusterImpl13 = new org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl(strArray12);
        pathRelativeAdjusterImpl13.setSystemID("hi!");
        boolean boolean16 = pathRelativeAdjusterImpl13.isOnTemplate();
        java.lang.String str19 = pathRelativeAdjusterImpl13.adjustRelativePath("web-app_2_3.dtd", "FORM");
        java.util.Iterator<java.lang.String> strItor20 = pathRelativeAdjusterImpl13.iterateParameterNames();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "FORM" + "'", str19, "FORM");
        org.junit.Assert.assertNotNull(strItor20);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        int int0 = javax.servlet.http.HttpServletResponse.SC_PROXY_AUTHENTICATION_REQUIRED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 407 + "'", int0 == 407);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        int int0 = javax.servlet.http.HttpServletResponse.SC_MOVED_PERMANENTLY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 301 + "'", int0 == 301);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.source.SourceDescriptor sourceDescriptor2 = org.seasar.mayaa.FactoryFactory.getBootstrapSource("notTemplatePathPattern", "datatypes.dtd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.engine.RenderNotCompletedException renderNotCompletedException2 = new org.seasar.mayaa.impl.engine.RenderNotCompletedException("http://xml.org/sax/properties/lexical-handler", "session");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.seasar.mayaa.impl.engine.specification.serialize.NodeSerializeController nodeSerializeController0 = new org.seasar.mayaa.impl.engine.specification.serialize.NodeSerializeController();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        org.seasar.mayaa.impl.builder.library.tld.TaglibTagHandler taglibTagHandler0 = null;
        org.seasar.mayaa.impl.builder.library.tld.TagTagHandler tagTagHandler1 = new org.seasar.mayaa.impl.builder.library.tld.TagTagHandler(taglibTagHandler0);
        boolean boolean2 = tagTagHandler1.isValid();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.lang.String str0 = org.seasar.mayaa.impl.CONST_IMPL.CHECK_TIMESTAMP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "checkTimestamp" + "'", str0, "checkTimestamp");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.seasar.mayaa.provider.ServiceProvider serviceProvider0 = null;
        org.seasar.mayaa.impl.provider.factory.ServiceProviderHandler serviceProviderHandler1 = new org.seasar.mayaa.impl.provider.factory.ServiceProviderHandler(serviceProvider0);
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.provider.ServiceProvider serviceProvider2 = serviceProviderHandler1.getServiceProvider();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        char[] charArray1 = org.seasar.mayaa.impl.util.StringUtil.toTrimedCharArray("-//The Seasar Foundation//DTD Mayaa Factory 1.0//EN");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "-//The Seasar Foundation//DTD Mayaa Factory 1.0//EN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "-//The Seasar Foundation//DTD Mayaa Factory 1.0//EN");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[-, /, /, T, h, e,  , S, e, a, s, a, r,  , F, o, u, n, d, a, t, i, o, n, /, /, D, T, D,  , M, a, y, a, a,  , F, a, c, t, o, r, y,  , 1, ., 0, /, /, E, N]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.script.ReadOnlyScriptBlockException readOnlyScriptBlockException1 = new org.seasar.mayaa.impl.cycle.script.ReadOnlyScriptBlockException("javax.servlet.jsp.jspSession");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.script.ReadOnlyScriptBlockException readOnlyScriptBlockException1 = new org.seasar.mayaa.impl.cycle.script.ReadOnlyScriptBlockException("http://cyberneko.org/html/features/scanner/style/strip-comment-delims");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.cycle.script.ScriptEnvironment scriptEnvironment0 = org.seasar.mayaa.impl.provider.ProviderUtil.getScriptEnvironment();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.seasar.mayaa.impl.engine.specification.NamespaceImpl namespaceImpl0 = new org.seasar.mayaa.impl.engine.specification.NamespaceImpl();
        org.seasar.mayaa.engine.specification.QName qName2 = org.seasar.mayaa.impl.engine.specification.QNameImpl.getInstance("hi!");
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl4 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName2, "datatypes.dtd");
        org.seasar.mayaa.engine.specification.URI uRI5 = qName2.getNamespaceURI();
        namespaceImpl0.setDefaultNamespaceURI(uRI5);
        org.seasar.mayaa.impl.engine.specification.URIImpl.NULL_NS_URI = uRI5;
        org.junit.Assert.assertNotNull(qName2);
        org.junit.Assert.assertNotNull(uRI5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = serviceCycleImpl0.getProcessor();
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker2 = null;
        serviceCycleImpl0.setOriginalNode(nodeTreeWalker2);
        org.seasar.mayaa.cycle.Response response4 = serviceCycleImpl0.getResponse();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.cycle.scope.SessionScope sessionScope5 = serviceCycleImpl0.getSessionScope();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker1);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        org.seasar.mayaa.engine.specification.QName qName2 = org.seasar.mayaa.impl.engine.specification.QNameImpl.getInstance("hi!");
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl4 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName2, "datatypes.dtd");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.builder.library.NoRequiredPropertyException noRequiredPropertyException5 = new org.seasar.mayaa.impl.builder.library.NoRequiredPropertyException("suffixSeparator", qName2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qName2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.script.ScriptUtil.assertSingleScript("http://cyberneko.org/html/features/scanner/style/strip-comment-delims");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.LOCATION_WEB_COMMON_31;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://xmlns.jcp.org/xml/ns/javaee/web-common_3_1.xsd" + "'", str0, "http://xmlns.jcp.org/xml/ns/javaee/web-common_3_1.xsd");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.seasar.mayaa.engine.specification.QName qName2 = org.seasar.mayaa.impl.engine.specification.QNameImpl.getInstance("hi!");
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl4 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName2, "datatypes.dtd");
        org.seasar.mayaa.engine.specification.URI uRI5 = qName2.getNamespaceURI();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.builder.library.NoRequiredPropertyException noRequiredPropertyException6 = new org.seasar.mayaa.impl.builder.library.NoRequiredPropertyException("hi!", qName2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qName2);
        org.junit.Assert.assertNotNull(uRI5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor0 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.specification.serialize.NodeReferenceResolver nodeReferenceResolver1 = attributeProcessor0.findNodeResolver();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.FILE_J2EE_5;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "javaee_5.xsd" + "'", str0, "javaee_5.xsd");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.lang.String str0 = org.seasar.mayaa.impl.CONST_IMPL.WELCOME_FILE_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "welcomeFileName" + "'", str0, "welcomeFileName");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        int int0 = javax.servlet.http.HttpServletResponse.SC_UNAUTHORIZED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 401 + "'", int0 == 401);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.engine.specification.SpecificationUtil.purgeSerializedFile("session");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.seasar.mayaa.impl.provider.factory.ProviderTagHandler providerTagHandler0 = null;
        org.seasar.mayaa.provider.ServiceProvider serviceProvider1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.provider.factory.TemplateBuilderTagHandler templateBuilderTagHandler2 = new org.seasar.mayaa.impl.provider.factory.TemplateBuilderTagHandler(providerTagHandler0, serviceProvider1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        int int0 = javax.servlet.http.HttpServletResponse.SC_NOT_ACCEPTABLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 406 + "'", int0 == 406);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.seasar.mayaa.impl.builder.library.LibraryManagerImpl libraryManagerImpl0 = new org.seasar.mayaa.impl.builder.library.LibraryManagerImpl();
        org.seasar.mayaa.builder.library.converter.PropertyConverter propertyConverter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagerImpl0.addPropertyConverter("javaee_5.xsd", propertyConverter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.seasar.mayaa.PositionAware positionAware1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.script.rhino.direct.SessionGetterScript sessionGetterScript6 = new org.seasar.mayaa.impl.cycle.script.rhino.direct.SessionGetterScript("datatypes.dtd", positionAware1, (int) (byte) 10, "javax.servlet.jsp.jspSession", "http://xml.org/sax/properties/lexical-handler", "pageSerialize");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.io.InputStream inputStream0 = null;
        org.seasar.mayaa.impl.util.IOUtil.close(inputStream0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        int int0 = javax.servlet.http.HttpServletResponse.SC_ACCEPTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 202 + "'", int0 == 202);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.mozilla.javascript.Scriptable scriptable0 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.script.rhino.NativeMap nativeMap2 = new org.seasar.mayaa.impl.cycle.script.rhino.NativeMap(scriptable0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        boolean boolean1 = org.seasar.mayaa.impl.util.StringUtil.isEmpty("http://cyberneko.org/html/features/scanner/style/strip-comment-delims");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.seasar.mayaa.engine.specification.SpecificationNode specificationNode0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.specification.PrefixAwareName prefixAwareName2 = org.seasar.mayaa.impl.builder.BuilderUtil.parseName(specificationNode0, "suffixSeparator");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.seasar.mayaa.engine.processor.ProcessStatus processStatus0 = org.seasar.mayaa.engine.processor.ProcessStatus.SKIP_PAGE;
        org.junit.Assert.assertNotNull(processStatus0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.seasar.mayaa.provider.ServiceProvider serviceProvider0 = null;
        org.seasar.mayaa.impl.provider.factory.ServiceProviderHandler serviceProviderHandler1 = new org.seasar.mayaa.impl.provider.factory.ServiceProviderHandler(serviceProvider0);
        org.xml.sax.SAXParseException sAXParseException2 = null;
        // The following exception was thrown during execution in test generation
        try {
            serviceProviderHandler1.fatalError(sAXParseException2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.mozilla.javascript.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mozilla.javascript.Scriptable scriptable1 = org.mozilla.javascript.ScriptableObject.getObjectPrototype(scriptable0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.seasar.mayaa.impl.provider.factory.TemplateAttributeReaderTagHandler templateAttributeReaderTagHandler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.provider.factory.IgnoreAttributeTagHandler ignoreAttributeTagHandler1 = new org.seasar.mayaa.impl.provider.factory.IgnoreAttributeTagHandler(templateAttributeReaderTagHandler0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.lang.String str2 = org.seasar.mayaa.impl.util.StringUtil.adjustContextRelativePath("-//The Seasar Foundation//DTD Mayaa Factory 1.0//EN", "suffixSeparator");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "suffixSeparator" + "'", str2, "suffixSeparator");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.seasar.mayaa.impl.builder.library.scanner.MetaInfSourceScanner metaInfSourceScanner0 = new org.seasar.mayaa.impl.builder.library.scanner.MetaInfSourceScanner();
        boolean boolean1 = org.seasar.mayaa.impl.util.ObjectUtil.canBooleanConvert((java.lang.Object) metaInfSourceScanner0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.seasar.mayaa.impl.builder.injection.XPathMatchesInjectionResolver xPathMatchesInjectionResolver0 = new org.seasar.mayaa.impl.builder.injection.XPathMatchesInjectionResolver();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.seasar.mayaa.engine.specification.PrefixMapping prefixMapping0 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.HTML_DEFAULT_PREFIX_MAPPING;
        org.junit.Assert.assertNotNull(prefixMapping0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        int int0 = org.seasar.mayaa.impl.util.ReferenceCache.WEAK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = serviceCycleImpl0.getProcessor();
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker2 = null;
        serviceCycleImpl0.setOriginalNode(nodeTreeWalker2);
        // The following exception was thrown during execution in test generation
        try {
            serviceCycleImpl0.forward("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        javax.servlet.jsp.el.ExpressionEvaluator expressionEvaluator0 = org.seasar.mayaa.impl.cycle.jsp.ExpressionEvaluatorImpl.getInstance();
        org.junit.Assert.assertNotNull(expressionEvaluator0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.seasar.mayaa.impl.engine.processor.InsertProcessor insertProcessor0 = null;
        org.seasar.mayaa.impl.engine.processor.ComponentRenderer componentRenderer2 = new org.seasar.mayaa.impl.engine.processor.ComponentRenderer(insertProcessor0, "http://cyberneko.org/html/features/scanner/style/strip-comment-delims");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        int int0 = javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.builder.SpecificationBuilder specificationBuilder0 = org.seasar.mayaa.impl.provider.ProviderUtil.getSpecificationBuilder();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.seasar.mayaa.engine.specification.QName qName0 = org.seasar.mayaa.impl.CONST_IMPL.QM_AFTER_RENDER;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.LOCATION_WEB_DTD_31;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd" + "'", str0, "http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.seasar.mayaa.builder.library.converter.PropertyConverter propertyConverter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.builder.library.ConverterOperationException converterOperationException2 = new org.seasar.mayaa.impl.builder.library.ConverterOperationException(propertyConverter0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.seasar.mayaa.impl.cycle.CycleNotInitializedException cycleNotInitializedException0 = new org.seasar.mayaa.impl.cycle.CycleNotInitializedException();
        java.lang.String str1 = cycleNotInitializedException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.seasar.mayaa.impl.cycle.CycleNotInitializedException: Cycle not initialized. Do \"CycleFactory.initialize(req, res);\"" + "'", str1, "org.seasar.mayaa.impl.cycle.CycleNotInitializedException: Cycle not initialized. Do \"CycleFactory.initialize(req, res);\"");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        int int0 = javax.servlet.jsp.tagext.Tag.SKIP_PAGE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        org.seasar.mayaa.impl.provider.factory.TemplateAttributeReaderTagHandler templateAttributeReaderTagHandler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.provider.factory.AliasAttributeTagHandler aliasAttributeTagHandler1 = new org.seasar.mayaa.impl.provider.factory.AliasAttributeTagHandler(templateAttributeReaderTagHandler0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.seasar.mayaa.provider.ServiceProvider serviceProvider0 = null;
        org.seasar.mayaa.impl.provider.factory.ServiceProviderHandler serviceProviderHandler1 = new org.seasar.mayaa.impl.provider.factory.ServiceProviderHandler(serviceProvider0);
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.util.XMLUtil.parse((org.xml.sax.helpers.DefaultHandler) serviceProviderHandler1, inputStream2, "http://cyberneko.org/html/features/scanner/style/strip-comment-delims", "pageSerialize", false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.seasar.mayaa.impl.builder.library.LibraryManagerImpl libraryManagerImpl1 = new org.seasar.mayaa.impl.builder.library.LibraryManagerImpl();
        org.seasar.mayaa.impl.builder.library.scanner.MetaInfSourceScanner metaInfSourceScanner2 = new org.seasar.mayaa.impl.builder.library.scanner.MetaInfSourceScanner();
        libraryManagerImpl1.addSourceScanner((org.seasar.mayaa.builder.library.scanner.SourceScanner) metaInfSourceScanner2);
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.script.rhino.direct.PageGetterScript pageGetterScript8 = new org.seasar.mayaa.impl.cycle.script.rhino.direct.PageGetterScript("http://www.w3.org/TR/html4/strict.dtd", (org.seasar.mayaa.PositionAware) libraryManagerImpl1, 414, "http://cyberneko.org/html/features/scanner/style/strip-comment-delims", "", "http://xml.org/sax/properties/lexical-handler");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.seasar.mayaa.impl.cycle.script.rhino.direct.GetterScriptFactory getterScriptFactory0 = new org.seasar.mayaa.impl.cycle.script.rhino.direct.GetterScriptFactory();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = serviceCycleImpl0.getProcessor();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.cycle.scope.ApplicationScope applicationScope2 = serviceCycleImpl0.getApplicationScope();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.seasar.mayaa.engine.specification.QName qName0 = org.seasar.mayaa.impl.CONST_IMPL.QM_EXTENDS;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.parser.TemplateScanner.HTML_NAMES_ATTRS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://cyberneko.org/html/properties/names/attrs" + "'", str0, "http://cyberneko.org/html/properties/names/attrs");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.lang.String str1 = org.seasar.mayaa.impl.util.StringUtil.preparePath("http://cyberneko.org/html/features/scanner/style/strip-comment-delims");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/http://cyberneko.org/html/features/scanner/style/strip-comment-delims" + "'", str1, "/http://cyberneko.org/html/features/scanner/style/strip-comment-delims");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.CycleUtil.setGlobalVariable("suffixSeparator", (java.lang.Object) 412);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.seasar.mayaa.impl.provider.factory.ProviderTagHandler providerTagHandler0 = null;
        org.seasar.mayaa.provider.ServiceProvider serviceProvider1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.provider.factory.EngineTagHandler engineTagHandler2 = new org.seasar.mayaa.impl.provider.factory.EngineTagHandler(providerTagHandler0, serviceProvider1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.seasar.mayaa.impl.NonSerializableParameterAwareImpl nonSerializableParameterAwareImpl0 = new org.seasar.mayaa.impl.NonSerializableParameterAwareImpl();
        nonSerializableParameterAwareImpl0.setOnTemplate(false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor0 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.processor.ChildEvaluationProcessor childEvaluationProcessor1 = org.seasar.mayaa.impl.engine.RenderUtil.getEvaluation((org.seasar.mayaa.engine.processor.TemplateProcessor) attributeProcessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.seasar.mayaa.impl.engine.processor.AttributeProcessor cannot be cast to org.seasar.mayaa.engine.processor.ChildEvaluationProcessor");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl processorDefinitionImpl0 = new org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl();
        org.seasar.mayaa.builder.library.LibraryDefinition libraryDefinition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            processorDefinitionImpl0.setLibraryDefinition(libraryDefinition1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.seasar.mayaa.impl.cycle.script.rhino.ScriptEnvironmentImpl scriptEnvironmentImpl0 = new org.seasar.mayaa.impl.cycle.script.rhino.ScriptEnvironmentImpl();
        org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl pathRelativeAdjusterImpl2 = new org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl();
        org.seasar.mayaa.cycle.script.CompiledScript compiledScript3 = scriptEnvironmentImpl0.compile("http://cyberneko.org/html/features/scanner/style/strip-comment-delims", (org.seasar.mayaa.PositionAware) pathRelativeAdjusterImpl2);
        // The following exception was thrown during execution in test generation
        try {
            compiledScript3.assignValue((java.lang.Object) "http://xml.org/sax/properties/lexical-handler");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compiledScript3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = serviceCycleImpl0.getProcessor();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<org.seasar.mayaa.cycle.scope.AttributeScope> attributeScopeItor2 = serviceCycleImpl0.iterateAttributeScope();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.io.File file1 = null;
        org.seasar.mayaa.engine.specification.Specification specification2 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.deserialize("hi!", file1);
        org.junit.Assert.assertNull(specification2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = serviceCycleImpl0.getProcessor();
        serviceCycleImpl0.setSystemID("suffixSeparator");
        // The following exception was thrown during execution in test generation
        try {
            serviceCycleImpl0.load("http://xml.org/sax/properties/lexical-handler", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = serviceCycleImpl0.getProcessor();
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker2 = null;
        serviceCycleImpl0.setOriginalNode(nodeTreeWalker2);
        org.seasar.mayaa.cycle.Response response4 = serviceCycleImpl0.getResponse();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = response4.getUnderlyingContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker1);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.String str0 = org.seasar.mayaa.impl.engine.EngineImpl.NO_CACHE_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "noCacheValue" + "'", str0, "noCacheValue");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.builder.ProcessorNotInjectedException processorNotInjectedException1 = new org.seasar.mayaa.impl.builder.ProcessorNotInjectedException("session");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.seasar.mayaa.engine.specification.QName qName1 = org.seasar.mayaa.impl.engine.specification.QNameImpl.getInstance("hi!");
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl3 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName1, "notTemplatePathPattern");
        org.seasar.mayaa.engine.specification.URI uRI4 = nodeAttributeImpl3.getDefaultNamespaceURI();
        org.junit.Assert.assertNotNull(qName1);
        org.junit.Assert.assertNull(uRI4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.lang.String str0 = org.seasar.mayaa.impl.CONST_IMPL.MAYAA_EXTENSION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mayaaExtension" + "'", str0, "mayaaExtension");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.lang.String str1 = org.seasar.mayaa.impl.util.StringUtil.removeFileProtocol("http://xml.org/sax/properties/lexical-handler");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "http://xml.org/sax/properties/lexical-handler" + "'", str1, "http://xml.org/sax/properties/lexical-handler");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.seasar.mayaa.engine.specification.URI uRI0 = org.seasar.mayaa.impl.CONST_IMPL.URI_MAYAA;
        org.junit.Assert.assertNotNull(uRI0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.seasar.mayaa.impl.engine.processor.ExecProcessor execProcessor0 = new org.seasar.mayaa.impl.engine.processor.ExecProcessor();
        org.seasar.mayaa.engine.Page page1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.processor.ProcessStatus processStatus2 = execProcessor0.doStartProcess(page1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        javax.servlet.ServletContext servletContext0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.web.MockHttpServletRequest mockHttpServletRequest2 = new org.seasar.mayaa.impl.cycle.web.MockHttpServletRequest(servletContext0, "web-app_2_3.dtd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.seasar.mayaa.cycle.CycleWriter cycleWriter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.jsp.BodyContentImpl bodyContentImpl1 = new org.seasar.mayaa.impl.cycle.jsp.BodyContentImpl(cycleWriter0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.builder.library.ConverterNotFoundException converterNotFoundException3 = new org.seasar.mayaa.impl.builder.library.ConverterNotFoundException("notTemplatePathPattern", "datatypes.dtd", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl processorDefinitionImpl0 = new org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl();
        org.seasar.mayaa.builder.library.PropertyDefinition propertyDefinition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            processorDefinitionImpl0.addPropertyDefinitiion(propertyDefinition1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str0 = org.seasar.mayaa.impl.engine.EngineUtil.getSourcePath();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.seasar.mayaa.impl.cycle.CycleThreadLocalFactory.cycleLocalFinalize();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.seasar.mayaa.impl.cycle.script.ScriptBlock scriptBlock3 = new org.seasar.mayaa.impl.cycle.script.ScriptBlock("/http://cyberneko.org/html/features/scanner/style/strip-comment-delims", false, "http://java.sun.com/xml/ns/javaee/j2ee_web_services_client_1_2.xsd");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.seasar.mayaa.provider.ServiceProvider serviceProvider0 = null;
        org.seasar.mayaa.impl.provider.factory.ServiceProviderHandler serviceProviderHandler1 = new org.seasar.mayaa.impl.provider.factory.ServiceProviderHandler(serviceProvider0);
        serviceProviderHandler1.endDocument();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.seasar.mayaa.impl.Version version0 = new org.seasar.mayaa.impl.Version();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.io.File file0 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil._serializeDirFile;
        org.junit.Assert.assertNull(file0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.builder.PathAdjuster pathAdjuster0 = org.seasar.mayaa.impl.provider.ProviderUtil.getPathAdjuster();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.seasar.mayaa.impl.cycle.scope.BindingScope bindingScope0 = new org.seasar.mayaa.impl.cycle.scope.BindingScope();
        // The following exception was thrown during execution in test generation
        try {
            bindingScope0.removeAttribute("http://www.w3.org/TR/html4/strict.dtd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.builder.ProcessorNotInjectedException processorNotInjectedException1 = new org.seasar.mayaa.impl.builder.ProcessorNotInjectedException("suffixSeparator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.seasar.mayaa.impl.builder.injection.MetaValuesSetter metaValuesSetter0 = new org.seasar.mayaa.impl.builder.injection.MetaValuesSetter();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl1 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.cycle.scope.AttributeScope attributeScope2 = serviceCycleImpl1.getPageScope();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.script.rhino.direct.AttributeScopeGetterScript attributeScopeGetterScript7 = new org.seasar.mayaa.impl.cycle.script.rhino.direct.AttributeScopeGetterScript("$", (org.seasar.mayaa.PositionAware) serviceCycleImpl1, 406, "http://cyberneko.org/html/properties/names/attrs", "web-app_2_3.dtd", "http://www.w3.org/TR/html4/strict.dtd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(attributeScope2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.lang.String str0 = org.seasar.mayaa.cycle.ServiceCycle.SCOPE_PAGE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "page" + "'", str0, "page");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        char[] charArray1 = org.seasar.mayaa.impl.util.StringUtil.toTrimedCharArray("http://cyberneko.org/html/features/scanner/style/strip-comment-delims");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "http://cyberneko.org/html/features/scanner/style/strip-comment-delims");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "http://cyberneko.org/html/features/scanner/style/strip-comment-delims");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, t, t, p, :, /, /, c, y, b, e, r, n, e, k, o, ., o, r, g, /, h, t, m, l, /, f, e, a, t, u, r, e, s, /, s, c, a, n, n, e, r, /, s, t, y, l, e, /, s, t, r, i, p, -, c, o, m, m, e, n, t, -, d, e, l, i, m, s]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.seasar.mayaa.engine.processor.ProcessStatus processStatus0 = org.seasar.mayaa.engine.processor.ProcessStatus.EVAL_BODY_INCLUDE;
        org.junit.Assert.assertNotNull(processStatus0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor0 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = attributeProcessor0.getParentProcessor();
        boolean boolean2 = org.seasar.mayaa.impl.engine.RenderUtil.isEvaluation((org.seasar.mayaa.engine.processor.TemplateProcessor) attributeProcessor0);
        org.junit.Assert.assertNull(processorTreeWalker1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.seasar.mayaa.impl.engine.processor.InsertRenderingParams insertRenderingParams0 = new org.seasar.mayaa.impl.engine.processor.InsertRenderingParams();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.seasar.mayaa.engine.specification.QName qName1 = org.seasar.mayaa.impl.engine.specification.QNameImpl.getInstance("hi!");
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl3 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName1, "datatypes.dtd");
        java.lang.String str4 = nodeAttributeImpl3.toString();
        org.junit.Assert.assertNotNull(qName1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{http://mayaa.seasar.org}hi!=\"datatypes.dtd\"" + "'", str4, "{http://mayaa.seasar.org}hi!=\"datatypes.dtd\"");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.PUBLIC_JSP_TAGLIB_11;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.1//EN" + "'", str0, "-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.1//EN");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = serviceCycleImpl0.getProcessor();
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker2 = null;
        serviceCycleImpl0.setOriginalNode(nodeTreeWalker2);
        org.seasar.mayaa.cycle.Response response4 = serviceCycleImpl0.getResponse();
        // The following exception was thrown during execution in test generation
        try {
            response4.setStatus((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker1);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl processorDefinitionImpl0 = new org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.builder.library.LibraryDefinition libraryDefinition1 = processorDefinitionImpl0.getLibraryDefinition();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.seasar.mayaa.impl.cycle.web.MockHttpServletResponse mockHttpServletResponse0 = new org.seasar.mayaa.impl.cycle.web.MockHttpServletResponse();
        mockHttpServletResponse0.setCharacterEncoding("http://xmlns.jcp.org/xml/ns/javaee/web-common_3_1.xsd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = mockHttpServletResponse0.encodeRedirectUrl("javaee_5.xsd");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor0 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = attributeProcessor0.getParentProcessor();
        org.seasar.mayaa.engine.processor.ProcessorProperty processorProperty2 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributeProcessor0.setEscapeAmp(processorProperty2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: needs expression.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.seasar.mayaa.impl.builder.library.tld.TaglibTagHandler taglibTagHandler0 = null;
        org.seasar.mayaa.impl.builder.library.tld.TagTagHandler tagTagHandler1 = new org.seasar.mayaa.impl.builder.library.tld.TagTagHandler(taglibTagHandler0);
        tagTagHandler1.characters("suffixSeparator");
        org.xml.sax.Attributes attributes5 = null;
        org.seasar.mayaa.impl.util.xml.TagHandler tagHandler8 = tagTagHandler1.startElement("http://xml.org/sax/properties/lexical-handler", attributes5, "web-app_2_3.dtd", (int) (short) 10);
        org.junit.Assert.assertNotNull(tagHandler8);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor0 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        attributeProcessor0.initialize();
        boolean boolean2 = org.seasar.mayaa.impl.engine.RenderUtil.isEvaluation((org.seasar.mayaa.engine.processor.TemplateProcessor) attributeProcessor0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.seasar.mayaa.cycle.CycleLocalInstantiator cycleLocalInstantiator1 = null;
        org.seasar.mayaa.impl.cycle.CycleThreadLocalFactory.registFactory("javaee_5.xsd", cycleLocalInstantiator1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.FILE_JSP_TAGLIB_21;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "web-jsptaglibrary_2_1.xsd" + "'", str0, "web-jsptaglibrary_2_1.xsd");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.CycleUtil.setAttribute("http://cyberneko.org/html/features/scanner/style/strip-comment-delims", (java.lang.Object) (short) 1, "checkTimestamp");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.seasar.mayaa.impl.cycle.script.ScriptUtil.getBlockSignedText("http://cyberneko.org/html/features/scanner/style/strip-comment-delims");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.FILE_XML;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xml.xsd" + "'", str0, "xml.xsd");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.seasar.mayaa.engine.processor.ProcessorProperty processorProperty0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.engine.processor.ProcessorUtil.checkBoolableProperty(processorProperty0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: needs expression.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.seasar.mayaa.impl.cycle.scope.HeaderScope headerScope0 = new org.seasar.mayaa.impl.cycle.scope.HeaderScope();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<java.lang.String> strItor1 = headerScope0.iterateAttributeNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.LOCATION_WEB_SERVICE_CLIENT_13;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://java.sun.com/xml/ns/javaee/javaee_web_services_client_1_3.xsd" + "'", str0, "http://java.sun.com/xml/ns/javaee/javaee_web_services_client_1_3.xsd");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        int int0 = javax.servlet.http.HttpServletResponse.SC_MOVED_TEMPORARILY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 302 + "'", int0 == 302);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor0 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = attributeProcessor0.getUniqueID();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: originalNode is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.lang.String[] strArray6 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[] strArray12 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray6, strArray12 };
        org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl pathRelativeAdjusterImpl14 = new org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl(strArray13);
        org.seasar.mayaa.cycle.script.CompiledScript compiledScript16 = org.seasar.mayaa.impl.cycle.script.rhino.direct.GetterScriptFactory.create("", (org.seasar.mayaa.PositionAware) pathRelativeAdjusterImpl14, 413);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(compiledScript16);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.lang.String str0 = org.seasar.mayaa.impl.CONST_IMPL.SCRIPT_DEFAULT_CHARSET;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.lang.String str0 = org.seasar.mayaa.impl.CONST_IMPL.DEFAULT_SPECIFICATION_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.seasar.mayaa.engine.Engine#default" + "'", str0, "org.seasar.mayaa.engine.Engine#default");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.impl.engine.RenderingTerminated renderingTerminated1 = new org.seasar.mayaa.impl.engine.RenderingTerminated();
        serviceCycleImpl0.setHandledError((java.lang.Throwable) renderingTerminated1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = serviceCycleImpl0.hasAttributeScope("page");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = serviceCycleImpl0.getProcessor();
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker2 = null;
        serviceCycleImpl0.setOriginalNode(nodeTreeWalker2);
        org.seasar.mayaa.cycle.Response response4 = serviceCycleImpl0.getResponse();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.cycle.CycleWriter cycleWriter5 = response4.popWriter();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker1);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.seasar.mayaa.impl.engine.EngineUtil.getSourcePath(nodeTreeWalker0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.scope.ScopeNotFoundException scopeNotFoundException1 = new org.seasar.mayaa.impl.cycle.scope.ScopeNotFoundException("suffixSeparator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor0 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        attributeProcessor0.initialize();
        org.seasar.mayaa.engine.Page page2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.processor.ProcessStatus processStatus3 = attributeProcessor0.doStartProcess(page2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: no attributable processor.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.seasar.mayaa.engine.specification.QName qName1 = org.seasar.mayaa.impl.engine.specification.QNameImpl.getInstance("hi!");
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl3 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName1, "notTemplatePathPattern");
        org.seasar.mayaa.engine.specification.PrefixMapping prefixMapping6 = nodeAttributeImpl3.getMappingFromPrefix("http://java.sun.com/xml/ns/javaee/j2ee_web_services_client_1_2.xsd", false);
        org.junit.Assert.assertNotNull(qName1);
        org.junit.Assert.assertNull(prefixMapping6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.seasar.mayaa.impl.engine.EngineImpl engineImpl0 = new org.seasar.mayaa.impl.engine.EngineImpl();
        org.seasar.mayaa.engine.error.ErrorHandler errorHandler1 = null;
        engineImpl0.setErrorHandler(errorHandler1);
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.error.ErrorHandler errorHandler3 = engineImpl0.getErrorHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.seasar.mayaa.impl.cycle.script.rhino.ScriptEnvironmentImpl scriptEnvironmentImpl0 = new org.seasar.mayaa.impl.cycle.script.rhino.ScriptEnvironmentImpl();
        org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl pathRelativeAdjusterImpl2 = new org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl();
        org.seasar.mayaa.cycle.script.CompiledScript compiledScript3 = scriptEnvironmentImpl0.compile("http://cyberneko.org/html/features/scanner/style/strip-comment-delims", (org.seasar.mayaa.PositionAware) pathRelativeAdjusterImpl2);
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        compiledScript3.setMethodArgClasses((java.lang.Class<?>[]) classArray5);
        org.junit.Assert.assertNotNull(compiledScript3);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.xml.sax.Attributes attributes0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.seasar.mayaa.impl.util.XMLUtil.getBooleanValue(attributes0, "http://xmlns.jcp.org/xml/ns/javaee/web-common_3_1.xsd", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.seasar.mayaa.impl.engine.processor.CommentProcessor commentProcessor0 = new org.seasar.mayaa.impl.engine.processor.CommentProcessor();
        org.seasar.mayaa.engine.Page page1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.processor.ProcessStatus processStatus2 = commentProcessor0.doStartProcess(page1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.seasar.mayaa.impl.builder.library.tld.TaglibTagHandler taglibTagHandler0 = null;
        org.seasar.mayaa.impl.builder.library.tld.TagTagHandler tagTagHandler1 = new org.seasar.mayaa.impl.builder.library.tld.TagTagHandler(taglibTagHandler0);
        tagTagHandler1.characters("suffixSeparator");
        org.seasar.mayaa.impl.builder.library.mld.LibraryTagHandler libraryTagHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.builder.library.mld.ConverterTagHandler converterTagHandler5 = new org.seasar.mayaa.impl.builder.library.mld.ConverterTagHandler((org.seasar.mayaa.impl.util.xml.TagHandler) tagTagHandler1, libraryTagHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.seasar.mayaa.impl.source.ApplicationResourceSourceDescriptor applicationResourceSourceDescriptor0 = new org.seasar.mayaa.impl.source.ApplicationResourceSourceDescriptor();
        java.lang.String str1 = applicationResourceSourceDescriptor0.getSystemID();
        org.seasar.mayaa.impl.cycle.script.rhino.SourceCompiledScriptImpl sourceCompiledScriptImpl3 = new org.seasar.mayaa.impl.cycle.script.rhino.SourceCompiledScriptImpl((org.seasar.mayaa.source.SourceDescriptor) applicationResourceSourceDescriptor0, "http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd");
        java.lang.String[] strArray9 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[] strArray15 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[][] strArray16 = new java.lang.String[][] { strArray9, strArray15 };
        org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl pathRelativeAdjusterImpl17 = new org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl(strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = sourceCompiledScriptImpl3.execute((java.lang.Object[]) strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.lang.Class<org.seasar.mayaa.impl.CONST_IMPL> cONST_IMPLClass0 = null;
        org.seasar.mayaa.impl.util.ReferenceCache.SweepListener sweepListener2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.util.ReferenceCache<org.seasar.mayaa.impl.CONST_IMPL> cONST_IMPLReferenceCache3 = new org.seasar.mayaa.impl.util.ReferenceCache<org.seasar.mayaa.impl.CONST_IMPL>(cONST_IMPLClass0, 0, sweepListener2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.lang.String[] strArray6 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[] strArray12 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[][] strArray13 = new java.lang.String[][] { strArray6, strArray12 };
        org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl pathRelativeAdjusterImpl14 = new org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl(strArray13);
        pathRelativeAdjusterImpl14.setSystemID("hi!");
        java.lang.String str19 = pathRelativeAdjusterImpl14.adjustRelativePath("{http://mayaa.seasar.org}hi!=\"datatypes.dtd\"", "org.seasar.mayaa.impl.cycle.CycleNotInitializedException: Cycle not initialized. Do \"CycleFactory.initialize(req, res);\"");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.script.rhino.direct.RequestGetterScript requestGetterScript24 = new org.seasar.mayaa.impl.cycle.script.rhino.direct.RequestGetterScript("notTemplatePathPattern", (org.seasar.mayaa.PositionAware) pathRelativeAdjusterImpl14, 414, "xml.xsd", "", "$");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.seasar.mayaa.impl.cycle.CycleNotInitializedException: Cycle not initialized. Do \"CycleFactory.initialize(req, res);\"" + "'", str19, "org.seasar.mayaa.impl.cycle.CycleNotInitializedException: Cycle not initialized. Do \"CycleFactory.initialize(req, res);\"");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.seasar.mayaa.engine.specification.QName qName0 = org.seasar.mayaa.impl.CONST_IMPL.QM_PI;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition tLDLibraryDefinition1 = new org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.script.rhino.direct.AttributeScopeGetterScript attributeScopeGetterScript6 = new org.seasar.mayaa.impl.cycle.script.rhino.direct.AttributeScopeGetterScript("-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.1//EN", (org.seasar.mayaa.PositionAware) tLDLibraryDefinition1, (int) (byte) 100, "http://java.sun.com/xml/ns/javaee/javaee_web_services_client_1_3.xsd", "", "-//The Seasar Foundation//DTD Mayaa Factory 1.0//EN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.seasar.mayaa.engine.specification.QName qName0 = org.seasar.mayaa.impl.CONST_IMPL.QM_CDATA;
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl3 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName0, "checkTimestamp", "web-jsptaglibrary_2_1.xsd");
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition tLDLibraryDefinition0 = new org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition();
        org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl processorDefinitionImpl1 = new org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl();
        processorDefinitionImpl1.addPropertySetRef("-//The Seasar Foundation//DTD Mayaa Factory 1.0//EN", "suffixSeparator", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            tLDLibraryDefinition0.addPropertySet((org.seasar.mayaa.builder.library.PropertySet) processorDefinitionImpl1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.seasar.mayaa.impl.cycle.web.MockHttpServletResponse mockHttpServletResponse0 = new org.seasar.mayaa.impl.cycle.web.MockHttpServletResponse();
        mockHttpServletResponse0.setStatus(1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.seasar.mayaa.impl.engine.specification.serialize.ProcessorSerializeController processorSerializeController0 = new org.seasar.mayaa.impl.engine.specification.serialize.ProcessorSerializeController();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = serviceCycleImpl0.getProcessor();
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker2 = null;
        serviceCycleImpl0.setOriginalNode(nodeTreeWalker2);
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor4 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        serviceCycleImpl0.setProcessor((org.seasar.mayaa.engine.processor.ProcessorTreeWalker) attributeProcessor4);
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker7 = attributeProcessor4.getChildProcessor((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.specification.QName qName1 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.parseQName("org.seasar.mayaa.impl.cycle.CycleNotInitializedException: Cycle not initialized. Do \"CycleFactory.initialize(req, res);\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.seasar.mayaa.impl.cycle.CycleNotInitializedException: Cycle not initialized. Do \"CycleFactory.initialize(req, res);\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.builder.library.TemplateAttributeReader templateAttributeReader0 = org.seasar.mayaa.impl.provider.ProviderUtil.getTemplateAttributeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.lang.String str2 = org.seasar.mayaa.impl.util.StringUtil.adjustContextRelativePath("http://cyberneko.org/html/properties/names/attrs", "session");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "session" + "'", str2, "session");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.seasar.mayaa.impl.engine.processor.ForProcessor forProcessor0 = new org.seasar.mayaa.impl.engine.processor.ForProcessor();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.processor.ChildEvaluationProcessor childEvaluationProcessor1 = org.seasar.mayaa.impl.engine.RenderUtil.getEvaluation((org.seasar.mayaa.engine.processor.TemplateProcessor) forProcessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.seasar.mayaa.impl.engine.processor.ForProcessor cannot be cast to org.seasar.mayaa.engine.processor.ChildEvaluationProcessor");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = serviceCycleImpl0.getProcessor();
        serviceCycleImpl0.setSystemID("suffixSeparator");
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker4 = null;
        serviceCycleImpl0.setInjectedNode(nodeTreeWalker4);
        org.junit.Assert.assertNull(processorTreeWalker1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.io.File file1 = null;
        org.seasar.mayaa.engine.specification.Specification specification2 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.deserialize("UTF-8", file1);
        org.junit.Assert.assertNull(specification2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = serviceCycleImpl0.getProcessor();
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker2 = null;
        serviceCycleImpl0.setOriginalNode(nodeTreeWalker2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = serviceCycleImpl0.hasAttributeScope("/http://cyberneko.org/html/features/scanner/style/strip-comment-delims");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.seasar.mayaa.impl.engine.RenderUtil.SkipPageException skipPageException0 = new org.seasar.mayaa.impl.engine.RenderUtil.SkipPageException();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.seasar.mayaa.impl.source.ApplicationResourceSourceDescriptor applicationResourceSourceDescriptor0 = new org.seasar.mayaa.impl.source.ApplicationResourceSourceDescriptor();
        java.lang.String str1 = applicationResourceSourceDescriptor0.getSystemID();
        org.seasar.mayaa.impl.cycle.script.rhino.SourceCompiledScriptImpl sourceCompiledScriptImpl3 = new org.seasar.mayaa.impl.cycle.script.rhino.SourceCompiledScriptImpl((org.seasar.mayaa.source.SourceDescriptor) applicationResourceSourceDescriptor0, "http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl4 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.cycle.scope.AttributeScope attributeScope5 = serviceCycleImpl4.getPageScope();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker6 = serviceCycleImpl4.getProcessor();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.CycleUtil.initialize((java.lang.Object) applicationResourceSourceDescriptor0, (java.lang.Object) processorTreeWalker6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(attributeScope5);
        org.junit.Assert.assertNull(processorTreeWalker6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.seasar.mayaa.engine.specification.QName qName0 = org.seasar.mayaa.impl.CONST_IMPL.QH_ID;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        boolean boolean1 = org.seasar.mayaa.impl.util.StringUtil.isEmpty("mayaaExtension");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.seasar.mayaa.engine.specification.PrefixMapping prefixMapping0 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.XHTML_DEFAULT_PREFIX_MAPPING;
        org.junit.Assert.assertNotNull(prefixMapping0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.seasar.mayaa.impl.util.IOUtil.readStream(inputStream0, "web-app_2_3.dtd");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.seasar.mayaa.impl.cycle.StandardScope standardScope0 = new org.seasar.mayaa.impl.cycle.StandardScope();
        int int1 = standardScope0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.seasar.mayaa.engine.specification.Namespace namespace0 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.createNamespace();
        org.junit.Assert.assertNotNull(namespace0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.lang.String str2 = org.seasar.mayaa.impl.util.StringUtil.adjustContextRelativePath("xml.xsd", "web-jsptaglibrary_2_1.xsd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "web-jsptaglibrary_2_1.xsd" + "'", str2, "web-jsptaglibrary_2_1.xsd");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.LOCATION_WEB_COMMON_30;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://java.sun.com/xml/ns/javaee/web-common_3_0.xsd" + "'", str0, "http://java.sun.com/xml/ns/javaee/web-common_3_0.xsd");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.seasar.mayaa.impl.cycle.web.MockHttpServletResponse mockHttpServletResponse0 = new org.seasar.mayaa.impl.cycle.web.MockHttpServletResponse();
        mockHttpServletResponse0.setCharacterEncoding("http://xmlns.jcp.org/xml/ns/javaee/web-common_3_1.xsd");
        int int3 = mockHttpServletResponse0.getStatus();
        boolean boolean5 = mockHttpServletResponse0.containsHeader("http://cyberneko.org/html/properties/names/attrs");
        mockHttpServletResponse0.setDateHeader("binding", (long) (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.seasar.mayaa.impl.engine.EngineImpl engineImpl0 = new org.seasar.mayaa.impl.engine.EngineImpl();
        org.seasar.mayaa.engine.error.ErrorHandler errorHandler1 = null;
        engineImpl0.setErrorHandler(errorHandler1);
        java.lang.String str4 = engineImpl0.getParameter("org.seasar.mayaa.engine.Engine#default");
        org.seasar.mayaa.engine.Page page5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = engineImpl0.getTemplateID(page5, "http://xml.org/sax/properties/lexical-handler", "http://www.w3.org/TR/html4/strict.dtd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.seasar.mayaa.impl.ParameterAwareImpl parameterAwareImpl0 = new org.seasar.mayaa.impl.ParameterAwareImpl();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.seasar.mayaa.engine.specification.PrefixAwareName prefixAwareName0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.engine.processor.ProcessorPropertyLiteral processorPropertyLiteral2 = new org.seasar.mayaa.impl.engine.processor.ProcessorPropertyLiteral(prefixAwareName0, "noCacheValue");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.lang.String str0 = javax.servlet.jsp.PageContext.APPLICATION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "javax.servlet.jsp.jspApplication" + "'", str0, "javax.servlet.jsp.jspApplication");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.lang.String str0 = org.seasar.mayaa.impl.cycle.script.rhino.WalkStandardScope.SCOPE_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "_" + "'", str0, "_");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition tLDLibraryDefinition0 = new org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition();
        java.util.Iterator<org.seasar.mayaa.builder.library.ProcessorDefinition> processorDefinitionItor1 = tLDLibraryDefinition0.iterateProcessorDefinitions();
        tLDLibraryDefinition0.setRequiredVersion("-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.1//EN");
        org.junit.Assert.assertNotNull(processorDefinitionItor1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.seasar.mayaa.builder.library.converter.PropertyConverter propertyConverter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.builder.library.ConverterOperationException converterOperationException2 = new org.seasar.mayaa.impl.builder.library.ConverterOperationException(propertyConverter0, "javax.servlet.jsp.jspSession");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.cycle.scope.ApplicationScope applicationScope0 = org.seasar.mayaa.FactoryFactory.getApplicationScope();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.seasar.mayaa.impl.builder.library.TLDScriptingVariableInfo tLDScriptingVariableInfo0 = new org.seasar.mayaa.impl.builder.library.TLDScriptingVariableInfo();
        javax.servlet.jsp.tagext.TagExtraInfo tagExtraInfo1 = null;
        tLDScriptingVariableInfo0.setTagExtraInfo(tagExtraInfo1);
        boolean boolean4 = tLDScriptingVariableInfo0.isNestedVariable("http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd");
        boolean boolean6 = tLDScriptingVariableInfo0.isNestedVariable("http://xmlns.jcp.org/xml/ns/javaee/web-common_3_1.xsd");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.SYSTEM_XML_SCHEMA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/XMLSchema.dtd" + "'", str0, "http://www.w3.org/2001/XMLSchema.dtd");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl processorDefinitionImpl0 = new org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl();
        processorDefinitionImpl0.addPropertySetRef("-//The Seasar Foundation//DTD Mayaa Factory 1.0//EN", "suffixSeparator", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = processorDefinitionImpl0.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl6 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.impl.engine.RenderingTerminated renderingTerminated7 = new org.seasar.mayaa.impl.engine.RenderingTerminated();
        serviceCycleImpl6.setHandledError((java.lang.Throwable) renderingTerminated7);
        org.seasar.mayaa.impl.cycle.script.rhino.OffsetLineRhinoException offsetLineRhinoException9 = new org.seasar.mayaa.impl.cycle.script.rhino.OffsetLineRhinoException("http://www.w3.org/TR/html4/strict.dtd", "", 412, "http://java.sun.com/xml/ns/javaee/j2ee_web_services_client_1_2.xsd", 301, (int) (byte) 100, (java.lang.Throwable) renderingTerminated7);
        java.lang.String str10 = offsetLineRhinoException9.details();
        java.lang.String str11 = offsetLineRhinoException9.lineSource();
        int int12 = offsetLineRhinoException9.getOffsetLine();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://www.w3.org/TR/html4/strict.dtd" + "'", str10, "http://www.w3.org/TR/html4/strict.dtd");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://java.sun.com/xml/ns/javaee/j2ee_web_services_client_1_2.xsd" + "'", str11, "http://java.sun.com/xml/ns/javaee/j2ee_web_services_client_1_2.xsd");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.seasar.mayaa.impl.cycle.scope.HeaderScope headerScope0 = new org.seasar.mayaa.impl.cycle.scope.HeaderScope();
        // The following exception was thrown during execution in test generation
        try {
            headerScope0.setAttribute("http://java.sun.com/xml/ns/javaee/web-common_3_0.xsd", (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.seasar.mayaa.impl.cycle.CycleUtil.getAttribute("FORM", "suffixSeparator");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor0 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        attributeProcessor0.initialize();
        org.seasar.mayaa.engine.processor.ProcessorProperty processorProperty2 = null;
        // The following exception was thrown during execution in test generation
        try {
            attributeProcessor0.setEscapeAmp(processorProperty2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: needs expression.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        int int0 = javax.servlet.http.HttpServletResponse.SC_PARTIAL_CONTENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 206 + "'", int0 == 206);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.seasar.mayaa.impl.CycleLocalVariablesImpl cycleLocalVariablesImpl0 = new org.seasar.mayaa.impl.CycleLocalVariablesImpl();
        java.lang.Object obj2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[][] strArray15 = new java.lang.String[][] { strArray8, strArray14 };
        org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl pathRelativeAdjusterImpl16 = new org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl(strArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = cycleLocalVariablesImpl0.getVariable("javax.servlet.jsp.jspSession", obj2, (java.lang.Object[]) strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.mozilla.javascript.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.mozilla.javascript.ScriptableObject.hasProperty(scriptable0, "http://www.w3.org/TR/html4/strict.dtd\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.lang.String[] strArray5 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray5, strArray11 };
        org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl pathRelativeAdjusterImpl13 = new org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl(strArray12);
        pathRelativeAdjusterImpl13.setSystemID("hi!");
        boolean boolean16 = pathRelativeAdjusterImpl13.isOnTemplate();
        java.lang.String str19 = pathRelativeAdjusterImpl13.adjustRelativePath("-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.1//EN", "FORM");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "FORM" + "'", str19, "FORM");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.seasar.mayaa.impl.engine.EngineImpl engineImpl0 = new org.seasar.mayaa.impl.engine.EngineImpl();
        org.seasar.mayaa.engine.error.ErrorHandler errorHandler1 = null;
        engineImpl0.setErrorHandler(errorHandler1);
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.specification.Specification specification3 = engineImpl0.createDefaultSpecification();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl6 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.impl.engine.RenderingTerminated renderingTerminated7 = new org.seasar.mayaa.impl.engine.RenderingTerminated();
        serviceCycleImpl6.setHandledError((java.lang.Throwable) renderingTerminated7);
        org.seasar.mayaa.impl.cycle.script.rhino.OffsetLineRhinoException offsetLineRhinoException9 = new org.seasar.mayaa.impl.cycle.script.rhino.OffsetLineRhinoException("http://www.w3.org/TR/html4/strict.dtd", "", 412, "http://java.sun.com/xml/ns/javaee/j2ee_web_services_client_1_2.xsd", 301, (int) (byte) 100, (java.lang.Throwable) renderingTerminated7);
        java.lang.String str10 = offsetLineRhinoException9.details();
        java.lang.String str11 = offsetLineRhinoException9.lineSource();
        java.lang.String str12 = offsetLineRhinoException9.details();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://www.w3.org/TR/html4/strict.dtd" + "'", str10, "http://www.w3.org/TR/html4/strict.dtd");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://java.sun.com/xml/ns/javaee/j2ee_web_services_client_1_2.xsd" + "'", str11, "http://java.sun.com/xml/ns/javaee/j2ee_web_services_client_1_2.xsd");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://www.w3.org/TR/html4/strict.dtd" + "'", str12, "http://www.w3.org/TR/html4/strict.dtd");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.seasar.mayaa.engine.specification.QName qName0 = org.seasar.mayaa.impl.CONST_IMPL.QM_NAME;
        org.seasar.mayaa.engine.specification.SpecificationNode specificationNode5 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.createSpecificationNode(qName0, "http://www.w3.org/TR/html4/strict.dtd\n", 406, false, (int) (byte) 100);
        org.seasar.mayaa.impl.engine.specification.NamespaceImpl namespaceImpl7 = new org.seasar.mayaa.impl.engine.specification.NamespaceImpl();
        org.seasar.mayaa.engine.specification.QName qName9 = org.seasar.mayaa.impl.engine.specification.QNameImpl.getInstance("hi!");
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl11 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName9, "datatypes.dtd");
        org.seasar.mayaa.engine.specification.URI uRI12 = qName9.getNamespaceURI();
        namespaceImpl7.setDefaultNamespaceURI(uRI12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.seasar.mayaa.impl.engine.specification.xpath.XPathUtil.matches(specificationNode5, "org.seasar.mayaa.engine.Engine#default", (org.seasar.mayaa.engine.specification.Namespace) namespaceImpl7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: class org.jaxen.saxpath.XPathSyntaxException: org.seasar.mayaa.engine.Engine#default: 30: Unexpected '#default'");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qName0);
        org.junit.Assert.assertNotNull(specificationNode5);
        org.junit.Assert.assertNotNull(qName9);
        org.junit.Assert.assertNotNull(uRI12);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.lang.String str0 = org.cyberneko.html.HTMLScanner.CDATA_SECTIONS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://cyberneko.org/html/features/scanner/cdata-sections" + "'", str0, "http://cyberneko.org/html/features/scanner/cdata-sections");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl processorDefinitionImpl0 = new org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl();
        processorDefinitionImpl0.addPropertySetRef("-//The Seasar Foundation//DTD Mayaa Factory 1.0//EN", "suffixSeparator", (int) (short) 10);
        org.seasar.mayaa.builder.library.PropertyDefinition propertyDefinition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processorDefinitionImpl0.addPropertyDefinitiion(propertyDefinition5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.lang.String[] strArray5 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray5, strArray11 };
        org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl pathRelativeAdjusterImpl13 = new org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl(strArray12);
        org.seasar.mayaa.impl.builder.PathAdjusterImpl pathAdjusterImpl14 = new org.seasar.mayaa.impl.builder.PathAdjusterImpl(strArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.seasar.mayaa.impl.util.StringUtil.hasValue((java.lang.Object) pathAdjusterImpl14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl processorDefinitionImpl0 = new org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl();
        java.util.Iterator<org.seasar.mayaa.builder.library.PropertyDefinition> propertyDefinitionItor1 = processorDefinitionImpl0.iteratePropertyDefinition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = processorDefinitionImpl0.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDefinitionItor1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.seasar.mayaa.impl.source.CompositeSourceDescriptor compositeSourceDescriptor0 = new org.seasar.mayaa.impl.source.CompositeSourceDescriptor();
        java.io.OutputStream outputStream1 = compositeSourceDescriptor0.getOutputStream();
        boolean boolean2 = compositeSourceDescriptor0.exists();
        boolean boolean3 = compositeSourceDescriptor0.canWrite();
        org.junit.Assert.assertNull(outputStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.seasar.mayaa.impl.source.CompositeSourceDescriptor compositeSourceDescriptor0 = new org.seasar.mayaa.impl.source.CompositeSourceDescriptor();
        java.io.InputStream inputStream1 = compositeSourceDescriptor0.getInputStream();
        org.junit.Assert.assertNull(inputStream1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.seasar.mayaa.impl.engine.EngineImpl engineImpl0 = new org.seasar.mayaa.impl.engine.EngineImpl();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.error.ErrorHandler errorHandler1 = engineImpl0.getErrorHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        org.seasar.mayaa.impl.cycle.CycleUtil.endDraftWriting();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        short short0 = org.apache.xerces.xni.XMLDTDContentModelHandler.OCCURS_ONE_OR_MORE;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 4 + "'", short0 == (short) 4);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.seasar.mayaa.impl.cycle.script.rhino.ScriptEnvironmentImpl scriptEnvironmentImpl0 = new org.seasar.mayaa.impl.cycle.script.rhino.ScriptEnvironmentImpl();
        java.util.Iterator<org.seasar.mayaa.cycle.scope.AttributeScope> attributeScopeItor1 = scriptEnvironmentImpl0.iterateAttributeScope();
        java.util.Iterator<org.seasar.mayaa.cycle.scope.AttributeScope> attributeScopeItor2 = scriptEnvironmentImpl0.iterateAttributeScope();
        org.junit.Assert.assertNotNull(attributeScopeItor1);
        org.junit.Assert.assertNotNull(attributeScopeItor2);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        char[] charArray1 = org.seasar.mayaa.impl.util.StringUtil.toTrimedCharArray("http://xmlns.jcp.org/xml/ns/javaee/web-common_3_1.xsd");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "http://xmlns.jcp.org/xml/ns/javaee/web-common_3_1.xsd");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "http://xmlns.jcp.org/xml/ns/javaee/web-common_3_1.xsd");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, t, t, p, :, /, /, x, m, l, n, s, ., j, c, p, ., o, r, g, /, x, m, l, /, n, s, /, j, a, v, a, e, e, /, w, e, b, -, c, o, m, m, o, n, _, 3, _, 1, ., x, s, d]");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = org.seasar.mayaa.impl.util.DateFormatPool.borrowFormat("page", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.seasar.mayaa.impl.engine.processor.CommentProcessor commentProcessor0 = new org.seasar.mayaa.impl.engine.processor.CommentProcessor();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.processor.ChildEvaluationProcessor childEvaluationProcessor1 = org.seasar.mayaa.impl.engine.RenderUtil.getEvaluation((org.seasar.mayaa.engine.processor.TemplateProcessor) commentProcessor0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.seasar.mayaa.impl.engine.processor.CommentProcessor cannot be cast to org.seasar.mayaa.engine.processor.ChildEvaluationProcessor");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.seasar.mayaa.impl.cycle.web.ResponseHeaderCache responseHeaderCache0 = new org.seasar.mayaa.impl.cycle.web.ResponseHeaderCache();
        java.util.List<java.lang.Object> objList2 = responseHeaderCache0.getHeaders("notTemplatePathPattern");
        java.util.Set<java.lang.String> strSet3 = responseHeaderCache0.getHeaderNames();
        responseHeaderCache0.addHeader("$", "javax.servlet.jsp.jspApplication");
        org.junit.Assert.assertNotNull(objList2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.engine.specification.serialize.NodeSerializeController nodeSerializeController0 = org.seasar.mayaa.impl.engine.specification.SpecificationImpl.nodeSerializer();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str0 = org.seasar.mayaa.impl.engine.EngineUtil.getMayaaExtensionName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        java.lang.String str1 = serviceCycleImpl0.getSystemID();
        serviceCycleImpl0.setSystemID("notTemplatePathPattern");
        java.lang.Throwable throwable4 = serviceCycleImpl0.getHandledError();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(throwable4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.LOCATION_WEB_SERVICE_13;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://java.sun.com/xml/ns/javaee/javaee_web_services_1_3.xsd" + "'", str0, "http://java.sun.com/xml/ns/javaee/javaee_web_services_1_3.xsd");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.cycle.ServiceCycle serviceCycle0 = org.seasar.mayaa.impl.cycle.CycleUtil.getServiceCycle();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl6 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.impl.engine.RenderingTerminated renderingTerminated7 = new org.seasar.mayaa.impl.engine.RenderingTerminated();
        serviceCycleImpl6.setHandledError((java.lang.Throwable) renderingTerminated7);
        org.seasar.mayaa.impl.cycle.script.rhino.OffsetLineRhinoException offsetLineRhinoException9 = new org.seasar.mayaa.impl.cycle.script.rhino.OffsetLineRhinoException("http://www.w3.org/TR/html4/strict.dtd", "", 412, "http://java.sun.com/xml/ns/javaee/j2ee_web_services_client_1_2.xsd", 301, (int) (byte) 100, (java.lang.Throwable) renderingTerminated7);
        java.lang.String str10 = offsetLineRhinoException9.details();
        // The following exception was thrown during execution in test generation
        try {
            offsetLineRhinoException9.initColumnNumber(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://www.w3.org/TR/html4/strict.dtd" + "'", str10, "http://www.w3.org/TR/html4/strict.dtd");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        org.seasar.mayaa.impl.builder.library.tld.TaglibTagHandler taglibTagHandler0 = null;
        org.seasar.mayaa.impl.builder.library.tld.TagTagHandler tagTagHandler1 = new org.seasar.mayaa.impl.builder.library.tld.TagTagHandler(taglibTagHandler0);
        tagTagHandler1.characters("suffixSeparator");
        org.seasar.mayaa.impl.builder.library.tld.AttributeTagHandler attributeTagHandler4 = new org.seasar.mayaa.impl.builder.library.tld.AttributeTagHandler(tagTagHandler1);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        org.seasar.mayaa.impl.builder.library.tld.TaglibTagHandler taglibTagHandler0 = null;
        org.seasar.mayaa.impl.builder.library.tld.TagTagHandler tagTagHandler1 = new org.seasar.mayaa.impl.builder.library.tld.TagTagHandler(taglibTagHandler0);
        // The following exception was thrown during execution in test generation
        try {
            tagTagHandler1.endElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        org.seasar.mayaa.engine.processor.TemplateProcessor templateProcessor0 = null;
        org.seasar.mayaa.engine.processor.ChildEvaluationProcessor childEvaluationProcessor1 = org.seasar.mayaa.impl.engine.RenderUtil.getEvaluation(templateProcessor0);
        org.junit.Assert.assertNull(childEvaluationProcessor1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.PUBLIC_JSP_TAGLIB_12;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.2//EN" + "'", str0, "-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.2//EN");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        int int0 = javax.servlet.http.HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 500 + "'", int0 == 500);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl processorDefinitionImpl0 = new org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl();
        processorDefinitionImpl0.addPropertySetRef("-//The Seasar Foundation//DTD Mayaa Factory 1.0//EN", "suffixSeparator", (int) (short) 10);
        org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition tLDLibraryDefinition5 = new org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition();
        org.seasar.mayaa.engine.specification.URI uRI6 = tLDLibraryDefinition5.getNamespaceURI();
        processorDefinitionImpl0.setLibraryDefinition((org.seasar.mayaa.builder.library.LibraryDefinition) tLDLibraryDefinition5);
        org.junit.Assert.assertNull(uRI6);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        org.seasar.mayaa.provider.ServiceProvider serviceProvider0 = null;
        org.seasar.mayaa.impl.provider.factory.ServiceProviderHandler serviceProviderHandler1 = new org.seasar.mayaa.impl.provider.factory.ServiceProviderHandler(serviceProvider0);
        org.xml.sax.SAXParseException sAXParseException2 = null;
        serviceProviderHandler1.warning(sAXParseException2);
        boolean boolean5 = org.seasar.mayaa.impl.util.ObjectUtil.booleanValue((java.lang.Object) sAXParseException2, false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        org.seasar.mayaa.impl.cycle.web.ResponseHeaderCache responseHeaderCache0 = new org.seasar.mayaa.impl.cycle.web.ResponseHeaderCache();
        java.util.List<java.lang.Object> objList2 = responseHeaderCache0.getHeaders("notTemplatePathPattern");
        responseHeaderCache0.addHeader("hi!", "-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.1//EN");
        org.junit.Assert.assertNotNull(objList2);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition tLDLibraryDefinition0 = new org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition();
        org.seasar.mayaa.engine.specification.URI uRI1 = tLDLibraryDefinition0.getNamespaceURI();
        org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl processorDefinitionImpl2 = new org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl();
        java.util.Iterator<org.seasar.mayaa.builder.library.PropertyDefinition> propertyDefinitionItor3 = processorDefinitionImpl2.iteratePropertyDefinition();
        // The following exception was thrown during execution in test generation
        try {
            tLDLibraryDefinition0.addPropertySet((org.seasar.mayaa.builder.library.PropertySet) processorDefinitionImpl2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRI1);
        org.junit.Assert.assertNotNull(propertyDefinitionItor3);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        org.seasar.mayaa.impl.source.NullSourceDescriptor nullSourceDescriptor0 = org.seasar.mayaa.impl.source.NullSourceDescriptor.getInstance();
        java.io.InputStream inputStream1 = nullSourceDescriptor0.getInputStream();
        org.junit.Assert.assertNotNull(nullSourceDescriptor0);
        org.junit.Assert.assertNull(inputStream1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        org.seasar.mayaa.impl.engine.processor.CommentProcessor commentProcessor0 = new org.seasar.mayaa.impl.engine.processor.CommentProcessor();
        org.seasar.mayaa.engine.Page page1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.processor.ProcessStatus processStatus2 = commentProcessor0.doStartProcess(page1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        org.seasar.mayaa.engine.specification.QName qName0 = org.seasar.mayaa.impl.CONST_IMPL.QM_ID;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        org.seasar.mayaa.impl.engine.EngineImpl engineImpl0 = new org.seasar.mayaa.impl.engine.EngineImpl();
        org.seasar.mayaa.impl.cycle.CycleNotInitializedException cycleNotInitializedException1 = new org.seasar.mayaa.impl.cycle.CycleNotInitializedException();
        boolean boolean2 = org.seasar.mayaa.impl.engine.EngineUtil.isClientAbortException((java.lang.Throwable) cycleNotInitializedException1);
        // The following exception was thrown during execution in test generation
        try {
            engineImpl0.handleError((java.lang.Throwable) cycleNotInitializedException1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        org.mozilla.javascript.Scriptable scriptable0 = null;
        org.seasar.mayaa.engine.specification.QName qName2 = org.seasar.mayaa.impl.CONST_IMPL.QM_BEFORE_RENDER_PROCESSOR;
        // The following exception was thrown during execution in test generation
        try {
            org.mozilla.javascript.ScriptableObject.putProperty(scriptable0, "binding", (java.lang.Object) qName2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qName2);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.FILE_JSP_22;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "jsp_2_2.xsd" + "'", str0, "jsp_2_2.xsd");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        java.lang.String str0 = org.cyberneko.html.HTMLScanner.HTML_4_01_FRAMESET_SYSID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/TR/html4/frameset.dtd" + "'", str0, "http://www.w3.org/TR/html4/frameset.dtd");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        org.seasar.mayaa.impl.engine.processor.CommentProcessor commentProcessor0 = new org.seasar.mayaa.impl.engine.processor.CommentProcessor();
        org.seasar.mayaa.engine.processor.ProcessorProperty processorProperty1 = commentProcessor0.getText();
        org.seasar.mayaa.engine.Page page2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.processor.ProcessStatus processStatus3 = commentProcessor0.doStartProcess(page2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorProperty1);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        org.seasar.mayaa.engine.specification.QName qName0 = org.seasar.mayaa.impl.CONST_IMPL.QM_AFTER_RENDER_PAGE;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        org.seasar.mayaa.impl.source.ApplicationResourceSourceDescriptor applicationResourceSourceDescriptor0 = new org.seasar.mayaa.impl.source.ApplicationResourceSourceDescriptor();
        java.lang.String str1 = applicationResourceSourceDescriptor0.getSystemID();
        org.seasar.mayaa.impl.cycle.script.rhino.SourceCompiledScriptImpl sourceCompiledScriptImpl3 = new org.seasar.mayaa.impl.cycle.script.rhino.SourceCompiledScriptImpl((org.seasar.mayaa.source.SourceDescriptor) applicationResourceSourceDescriptor0, "http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd");
        java.lang.String str4 = applicationResourceSourceDescriptor0.getSystemID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.impl.engine.RenderingTerminated renderingTerminated1 = new org.seasar.mayaa.impl.engine.RenderingTerminated();
        serviceCycleImpl0.setHandledError((java.lang.Throwable) renderingTerminated1);
        // The following exception was thrown during execution in test generation
        try {
            serviceCycleImpl0.load("{http://mayaa.seasar.org}hi!=\"datatypes.dtd\"", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition tLDLibraryDefinition0 = new org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition();
        org.seasar.mayaa.engine.specification.URI uRI1 = tLDLibraryDefinition0.getNamespaceURI();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.builder.library.converter.PropertyConverter propertyConverter3 = tLDLibraryDefinition0.getPropertyConverter("http://java.sun.com/xml/ns/javaee/j2ee_web_services_client_1_2.xsd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRI1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        org.seasar.mayaa.FactoryFactory.setContext((java.lang.Object) "http://www.w3.org/TR/html4/strict.dtd");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        java.lang.String str0 = org.cyberneko.html.HTMLScanner.HTML_4_01_TRANSITIONAL_SYSID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/TR/html4/loose.dtd" + "'", str0, "http://www.w3.org/TR/html4/loose.dtd");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        java.lang.String[] strArray7 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[] strArray13 = new java.lang.String[] { "web-app_2_3.dtd", "web-app_2_3.dtd", "", "javax.servlet.jsp.jspSession", "" };
        java.lang.String[][] strArray14 = new java.lang.String[][] { strArray7, strArray13 };
        org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl pathRelativeAdjusterImpl15 = new org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl(strArray14);
        java.lang.Class<?> wildcardClass16 = null;
        java.lang.Class[] classArray18 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.seasar.mayaa.impl.util.ObjectUtil.invoke((java.lang.Object) "binding", "noCacheValue", (java.lang.Object[]) strArray14, wildcardClassArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NoSuchMethodException: No such accessible method: noCacheValue() on object: java.lang.String");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition tLDLibraryDefinition0 = new org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition();
        java.util.Iterator<org.seasar.mayaa.builder.library.ProcessorDefinition> processorDefinitionItor1 = tLDLibraryDefinition0.iterateProcessorDefinitions();
        tLDLibraryDefinition0.setSystemID("xml.xsd");
        java.util.Iterator<org.seasar.mayaa.builder.library.converter.PropertyConverter> propertyConverterItor4 = tLDLibraryDefinition0.iteratePropertyConverters();
        java.lang.String str5 = tLDLibraryDefinition0.toString();
        org.junit.Assert.assertNotNull(processorDefinitionItor1);
        org.junit.Assert.assertNotNull(propertyConverterItor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LibraryDefinition: systemID = /xml.xsd, namespaceUrl = null, assignedURI = (), " + "'", str5, "LibraryDefinition: systemID = /xml.xsd, namespaceUrl = null, assignedURI = (), ");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = serviceCycleImpl0.getProcessor();
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker2 = null;
        serviceCycleImpl0.setOriginalNode(nodeTreeWalker2);
        int int4 = serviceCycleImpl0.getLineNumber();
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl11 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.impl.engine.RenderingTerminated renderingTerminated12 = new org.seasar.mayaa.impl.engine.RenderingTerminated();
        serviceCycleImpl11.setHandledError((java.lang.Throwable) renderingTerminated12);
        org.seasar.mayaa.impl.cycle.script.rhino.OffsetLineRhinoException offsetLineRhinoException14 = new org.seasar.mayaa.impl.cycle.script.rhino.OffsetLineRhinoException("http://www.w3.org/TR/html4/strict.dtd", "", 412, "http://java.sun.com/xml/ns/javaee/j2ee_web_services_client_1_2.xsd", 301, (int) (byte) 100, (java.lang.Throwable) renderingTerminated12);
        java.lang.String str15 = offsetLineRhinoException14.details();
        java.lang.String str16 = offsetLineRhinoException14.lineSource();
        java.lang.String str17 = offsetLineRhinoException14.emphasizeDetails();
        // The following exception was thrown during execution in test generation
        try {
            serviceCycleImpl0.throwJava((java.lang.Throwable) offsetLineRhinoException14);
            org.junit.Assert.fail("Expected exception of type org.seasar.mayaa.impl.cycle.script.rhino.OffsetLineRhinoException; message: http://www.w3.org/TR/html4/strict.dtd (#412)");
        } catch (org.seasar.mayaa.impl.cycle.script.rhino.OffsetLineRhinoException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://www.w3.org/TR/html4/strict.dtd" + "'", str15, "http://www.w3.org/TR/html4/strict.dtd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://java.sun.com/xml/ns/javaee/j2ee_web_services_client_1_2.xsd" + "'", str16, "http://java.sun.com/xml/ns/javaee/j2ee_web_services_client_1_2.xsd");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://www.w3.org/TR/html4/strict.dtd\n" + "'", str17, "http://www.w3.org/TR/html4/strict.dtd\n");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor0 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        attributeProcessor0.initialize();
        org.seasar.mayaa.engine.specification.QName qName2 = org.seasar.mayaa.impl.CONST_IMPL.QM_NAME;
        org.seasar.mayaa.engine.specification.SpecificationNode specificationNode7 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.createSpecificationNode(qName2, "http://www.w3.org/TR/html4/strict.dtd\n", 406, false, (int) (byte) 100);
        attributeProcessor0.setInjectedNode(specificationNode7);
        org.junit.Assert.assertNotNull(qName2);
        org.junit.Assert.assertNotNull(specificationNode7);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.SYSTEM_DATATYPES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2001/datatypes.dtd" + "'", str0, "http://www.w3.org/2001/datatypes.dtd");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        org.seasar.mayaa.impl.cycle.web.RequestScopeImpl requestScopeImpl0 = new org.seasar.mayaa.impl.cycle.web.RequestScopeImpl();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = requestScopeImpl0.getUnderlyingContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        short short0 = org.apache.xerces.xni.XMLDTDHandler.CONDITIONAL_INCLUDE;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        org.seasar.mayaa.impl.builder.library.scanner.DefaultSourceScanner defaultSourceScanner0 = new org.seasar.mayaa.impl.builder.library.scanner.DefaultSourceScanner();
        java.util.Iterator<org.seasar.mayaa.source.SourceDescriptor> sourceDescriptorItor1 = defaultSourceScanner0.scan();
        org.junit.Assert.assertNotNull(sourceDescriptorItor1);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        org.mozilla.javascript.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.mozilla.javascript.ScriptableObject.getProperty(scriptable0, "LibraryDefinition: systemID = /xml.xsd, namespaceUrl = null, assignedURI = (), ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        org.seasar.mayaa.impl.builder.injection.EqualsIDInjectionResolver equalsIDInjectionResolver0 = new org.seasar.mayaa.impl.builder.injection.EqualsIDInjectionResolver();
        equalsIDInjectionResolver0.setParameter("http://www.w3.org/2001/datatypes.dtd", "");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl processorDefinitionImpl0 = new org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl();
        processorDefinitionImpl0.addPropertySetRef("-//The Seasar Foundation//DTD Mayaa Factory 1.0//EN", "suffixSeparator", (int) (short) 10);
        processorDefinitionImpl0.setName("http://xmlns.jcp.org/xml/ns/javaee/web-common_3_1.xsd");
        java.util.Iterator<org.seasar.mayaa.builder.library.PropertyDefinition> propertyDefinitionItor7 = processorDefinitionImpl0.iteratePropertyDefinition();
        org.junit.Assert.assertNotNull(propertyDefinitionItor7);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        org.mozilla.javascript.Scriptable scriptable0 = null;
        org.seasar.mayaa.impl.cycle.scope.HeaderScope headerScope1 = new org.seasar.mayaa.impl.cycle.scope.HeaderScope();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.cycle.script.rhino.NativeAttributeScope nativeAttributeScope2 = new org.seasar.mayaa.impl.cycle.script.rhino.NativeAttributeScope(scriptable0, (org.seasar.mayaa.cycle.scope.AttributeScope) headerScope1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.PUBLIC_XML_SCHEMA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "-//W3C//DTD XMLSCHEMA 200102//EN" + "'", str0, "-//W3C//DTD XMLSCHEMA 200102//EN");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        int int0 = javax.servlet.jsp.PageContext.REQUEST_SCOPE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        java.lang.String str0 = org.seasar.mayaa.impl.builder.library.entity.CONST_J2EE.FILE_WEB_DTD_22;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "web-app_2_2.dtd" + "'", str0, "web-app_2_2.dtd");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        org.seasar.mayaa.impl.engine.EngineImpl engineImpl0 = new org.seasar.mayaa.impl.engine.EngineImpl();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.specification.Specification specification1 = engineImpl0.createDefaultSpecification();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        int int0 = javax.servlet.jsp.JspWriter.NO_BUFFER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        org.seasar.mayaa.impl.builder.library.PropertySetImpl propertySetImpl0 = new org.seasar.mayaa.impl.builder.library.PropertySetImpl();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        org.seasar.mayaa.engine.specification.QName qName0 = org.seasar.mayaa.impl.CONST_IMPL.QM_DUPLECATED;
        java.lang.String str1 = qName0.getLocalName();
        org.junit.Assert.assertNotNull(qName0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "duplecatedElement" + "'", str1, "duplecatedElement");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        org.seasar.mayaa.impl.builder.library.tld.TaglibTagHandler taglibTagHandler0 = new org.seasar.mayaa.impl.builder.library.tld.TaglibTagHandler();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        org.seasar.mayaa.impl.builder.library.mld.LibraryTagHandler libraryTagHandler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.builder.library.mld.ProcessorTagHandler processorTagHandler1 = new org.seasar.mayaa.impl.builder.library.mld.ProcessorTagHandler(libraryTagHandler0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition tLDLibraryDefinition0 = new org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition();
        java.util.Iterator<org.seasar.mayaa.builder.library.ProcessorDefinition> processorDefinitionItor1 = tLDLibraryDefinition0.iterateProcessorDefinitions();
        tLDLibraryDefinition0.setSystemID("xml.xsd");
        java.util.Iterator<org.seasar.mayaa.builder.library.ProcessorDefinition> processorDefinitionItor4 = tLDLibraryDefinition0.iterateProcessorDefinitions();
        org.junit.Assert.assertNotNull(processorDefinitionItor1);
        org.junit.Assert.assertNotNull(processorDefinitionItor4);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        org.seasar.mayaa.impl.cycle.web.MockHttpServletResponse mockHttpServletResponse0 = new org.seasar.mayaa.impl.cycle.web.MockHttpServletResponse();
        mockHttpServletResponse0.setContentLength(406);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        org.seasar.mayaa.impl.source.ApplicationResourceSourceDescriptor applicationResourceSourceDescriptor0 = new org.seasar.mayaa.impl.source.ApplicationResourceSourceDescriptor();
        java.lang.String str1 = applicationResourceSourceDescriptor0.getSystemID();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = applicationResourceSourceDescriptor0.getTimestamp();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        org.seasar.mayaa.impl.source.NullSourceDescriptor nullSourceDescriptor0 = org.seasar.mayaa.impl.source.NullSourceDescriptor.getInstance();
        java.lang.String str1 = nullSourceDescriptor0.getSystemID();
        java.lang.String str2 = nullSourceDescriptor0.getSystemID();
        org.junit.Assert.assertNotNull(nullSourceDescriptor0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        java.lang.String str1 = serviceCycleImpl0.getSystemID();
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker2 = serviceCycleImpl0.getOriginalNode();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(nodeTreeWalker2);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        java.lang.String str1 = org.seasar.mayaa.impl.util.StringUtil.replaceSystemProperties("noCacheValue");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "noCacheValue" + "'", str1, "noCacheValue");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        org.seasar.mayaa.impl.standalone.FileGenerator fileGenerator0 = new org.seasar.mayaa.impl.standalone.FileGenerator();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        org.seasar.mayaa.impl.builder.library.scanner.TaglibLocationsHandler taglibLocationsHandler0 = new org.seasar.mayaa.impl.builder.library.scanner.TaglibLocationsHandler();
        taglibLocationsHandler0.startDocument();
        java.util.Iterator<org.seasar.mayaa.impl.builder.library.scanner.SourceAlias> sourceAliasItor2 = taglibLocationsHandler0.iterateTaglibLocations();
        java.util.Iterator<org.seasar.mayaa.impl.builder.library.scanner.SourceAlias> sourceAliasItor3 = taglibLocationsHandler0.iterateTaglibLocations();
        org.junit.Assert.assertNotNull(sourceAliasItor2);
        org.junit.Assert.assertNotNull(sourceAliasItor3);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        org.mozilla.javascript.Scriptable scriptable0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.mozilla.javascript.ScriptableObject.getProperty(scriptable0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        int int0 = javax.servlet.http.HttpServletResponse.SC_METHOD_NOT_ALLOWED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 405 + "'", int0 == 405);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        org.seasar.mayaa.impl.cycle.scope.BindingScope bindingScope0 = new org.seasar.mayaa.impl.cycle.scope.BindingScope();
        bindingScope0.setLineNumber(100);
        org.seasar.mayaa.impl.builder.library.LibraryManagerImpl libraryManagerImpl4 = new org.seasar.mayaa.impl.builder.library.LibraryManagerImpl();
        java.util.Iterator<org.seasar.mayaa.builder.library.converter.PropertyConverter> propertyConverterItor5 = libraryManagerImpl4.iteratePropertyConverters();
        // The following exception was thrown during execution in test generation
        try {
            bindingScope0.setAttribute("http://java.sun.com/xml/ns/javaee/javaee_web_services_client_1_3.xsd", (java.lang.Object) libraryManagerImpl4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyConverterItor5);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        org.seasar.mayaa.impl.CycleLocalVariablesImpl cycleLocalVariablesImpl0 = new org.seasar.mayaa.impl.CycleLocalVariablesImpl();
// flaky:         cycleLocalVariablesImpl0.clearGlobalVariable("javaee_5.xsd");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition tLDLibraryDefinition0 = new org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition();
        boolean boolean1 = tLDLibraryDefinition0.isOnTemplate();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        org.seasar.mayaa.impl.cycle.StandardScope standardScope0 = org.seasar.mayaa.impl.cycle.CycleUtil.getStandardScope();
        org.junit.Assert.assertNotNull(standardScope0);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        org.seasar.mayaa.impl.cycle.script.rhino.ScriptEnvironmentImpl scriptEnvironmentImpl0 = new org.seasar.mayaa.impl.cycle.script.rhino.ScriptEnvironmentImpl();
        org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl pathRelativeAdjusterImpl2 = new org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl();
        org.seasar.mayaa.cycle.script.CompiledScript compiledScript3 = scriptEnvironmentImpl0.compile("http://cyberneko.org/html/features/scanner/style/strip-comment-delims", (org.seasar.mayaa.PositionAware) pathRelativeAdjusterImpl2);
        java.lang.String str4 = scriptEnvironmentImpl0.getBlockSign();
        org.seasar.mayaa.impl.cycle.script.rhino.ScriptEnvironmentImpl scriptEnvironmentImpl6 = new org.seasar.mayaa.impl.cycle.script.rhino.ScriptEnvironmentImpl();
        scriptEnvironmentImpl6.setParameter("session", "hi!");
        org.seasar.mayaa.cycle.script.CompiledScript compiledScript10 = scriptEnvironmentImpl0.compile("", (org.seasar.mayaa.PositionAware) scriptEnvironmentImpl6);
        int int11 = scriptEnvironmentImpl6.getScriptCacheSize();
        org.junit.Assert.assertNotNull(compiledScript3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "$" + "'", str4, "$");
        org.junit.Assert.assertNotNull(compiledScript10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 128 + "'", int11 == 128);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        org.seasar.mayaa.impl.builder.parser.TemplateScanner templateScanner0 = new org.seasar.mayaa.impl.builder.parser.TemplateScanner();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        java.lang.String str0 = org.seasar.mayaa.impl.cycle.script.rhino.PageAttributeScope.KEY_CURRENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "__current__" + "'", str0, "__current__");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        org.seasar.mayaa.impl.cycle.web.RequestScopeImpl requestScopeImpl0 = new org.seasar.mayaa.impl.cycle.web.RequestScopeImpl();
        org.seasar.mayaa.engine.specification.QName qName1 = org.seasar.mayaa.impl.CONST_IMPL.QM_CDATA;
        // The following exception was thrown during execution in test generation
        try {
            requestScopeImpl0.setUnderlyingContext((java.lang.Object) qName1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(qName1);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl1 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker2 = serviceCycleImpl1.getProcessor();
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker3 = null;
        serviceCycleImpl1.setOriginalNode(nodeTreeWalker3);
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor5 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        serviceCycleImpl1.setProcessor((org.seasar.mayaa.engine.processor.ProcessorTreeWalker) attributeProcessor5);
        org.seasar.mayaa.impl.cycle.CycleThreadLocalFactory.InstanceKey instanceKey7 = new org.seasar.mayaa.impl.cycle.CycleThreadLocalFactory.InstanceKey("http://www.w3.org/TR/html4/strict.dtd", (java.lang.Object) attributeProcessor5);
        java.lang.String str8 = instanceKey7.getKey();
        java.lang.String str9 = instanceKey7.getKey();
        org.junit.Assert.assertNull(processorTreeWalker2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://www.w3.org/TR/html4/strict.dtd" + "'", str8, "http://www.w3.org/TR/html4/strict.dtd");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://www.w3.org/TR/html4/strict.dtd" + "'", str9, "http://www.w3.org/TR/html4/strict.dtd");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.cycle.scope.RequestScope requestScope0 = org.seasar.mayaa.impl.cycle.CycleUtil.getRequestScope();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        java.net.URL uRL0 = null;
        java.io.File file1 = org.seasar.mayaa.impl.util.IOUtil.getFile(uRL0);
        org.junit.Assert.assertNull(file1);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        org.seasar.mayaa.impl.builder.SpecificationBuilderImpl specificationBuilderImpl0 = new org.seasar.mayaa.impl.builder.SpecificationBuilderImpl();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        org.seasar.mayaa.impl.util.xml.XMLHandler xMLHandler0 = new org.seasar.mayaa.impl.util.xml.XMLHandler();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        org.seasar.mayaa.impl.source.ApplicationResourceSourceDescriptor applicationResourceSourceDescriptor0 = new org.seasar.mayaa.impl.source.ApplicationResourceSourceDescriptor();
        java.lang.String str1 = applicationResourceSourceDescriptor0.getSystemID();
        org.seasar.mayaa.impl.cycle.script.rhino.SourceCompiledScriptImpl sourceCompiledScriptImpl3 = new org.seasar.mayaa.impl.cycle.script.rhino.SourceCompiledScriptImpl((org.seasar.mayaa.source.SourceDescriptor) applicationResourceSourceDescriptor0, "http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd");
        java.lang.String str4 = sourceCompiledScriptImpl3.getScriptText();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.builder.ProcessorNotInjectedException processorNotInjectedException1 = new org.seasar.mayaa.impl.builder.ProcessorNotInjectedException("http://java.sun.com/xml/ns/javaee/javaee_web_services_1_3.xsd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        org.seasar.mayaa.impl.builder.library.LibraryManagerImpl libraryManagerImpl0 = new org.seasar.mayaa.impl.builder.library.LibraryManagerImpl();
        org.seasar.mayaa.impl.builder.library.scanner.MetaInfSourceScanner metaInfSourceScanner1 = new org.seasar.mayaa.impl.builder.library.scanner.MetaInfSourceScanner();
        libraryManagerImpl0.addSourceScanner((org.seasar.mayaa.builder.library.scanner.SourceScanner) metaInfSourceScanner1);
        java.util.Iterator<org.seasar.mayaa.builder.library.converter.PropertyConverter> propertyConverterItor3 = libraryManagerImpl0.iteratePropertyConverters();
        // The following exception was thrown during execution in test generation
        try {
            libraryManagerImpl0.prepareLibraries();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyConverterItor3);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        boolean boolean1 = org.seasar.mayaa.impl.util.StringUtil.hasValue("FORM");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        org.seasar.mayaa.impl.cycle.scope.BindingScope bindingScope0 = new org.seasar.mayaa.impl.cycle.scope.BindingScope();
        bindingScope0.setLineNumber(100);
        java.lang.String str3 = bindingScope0.getScopeName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = bindingScope0.getAttribute("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "binding" + "'", str3, "binding");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        org.seasar.mayaa.impl.engine.specification.NamespaceImpl namespaceImpl0 = new org.seasar.mayaa.impl.engine.specification.NamespaceImpl();
        org.seasar.mayaa.engine.specification.QName qName2 = org.seasar.mayaa.impl.engine.specification.QNameImpl.getInstance("hi!");
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl4 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName2, "datatypes.dtd");
        org.seasar.mayaa.engine.specification.URI uRI5 = qName2.getNamespaceURI();
        namespaceImpl0.setDefaultNamespaceURI(uRI5);
        java.util.Iterator<org.seasar.mayaa.engine.specification.PrefixMapping> prefixMappingItor8 = namespaceImpl0.iteratePrefixMapping(false);
        org.seasar.mayaa.engine.specification.URI uRI11 = org.seasar.mayaa.impl.engine.specification.URIImpl.getInstance("javaee_5.xsd");
        org.seasar.mayaa.engine.specification.PrefixMapping prefixMapping12 = org.seasar.mayaa.impl.engine.specification.SpecificationUtil.createPrefixMapping("-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.1//EN", uRI11);
        namespaceImpl0.setDefaultNamespaceURI(uRI11);
        org.junit.Assert.assertNotNull(qName2);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNotNull(prefixMappingItor8);
        org.junit.Assert.assertNotNull(uRI11);
        org.junit.Assert.assertNotNull(prefixMapping12);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        org.seasar.mayaa.impl.cycle.web.MockHttpServletResponse mockHttpServletResponse0 = new org.seasar.mayaa.impl.cycle.web.MockHttpServletResponse();
        java.io.PrintWriter printWriter1 = mockHttpServletResponse0.getWriter();
        printWriter1.flush();
        org.junit.Assert.assertNotNull(printWriter1);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        org.seasar.mayaa.impl.util.WeakValueHashMap<org.seasar.mayaa.impl.source.NullSourceDescriptor, org.seasar.mayaa.impl.builder.library.LibraryDefinitionImpl> nullSourceDescriptorWeakValueHashMap1 = new org.seasar.mayaa.impl.util.WeakValueHashMap<org.seasar.mayaa.impl.source.NullSourceDescriptor, org.seasar.mayaa.impl.builder.library.LibraryDefinitionImpl>(1);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        int int0 = javax.servlet.http.HttpServletResponse.SC_BAD_GATEWAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 502 + "'", int0 == 502);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean0 = org.seasar.mayaa.impl.engine.EngineUtil.isDebugMode();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        org.seasar.mayaa.impl.provider.factory.ProviderTagHandler providerTagHandler0 = null;
        org.seasar.mayaa.provider.ServiceProvider serviceProvider1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.impl.provider.factory.ParentSpecificationResolverTagHandler parentSpecificationResolverTagHandler2 = new org.seasar.mayaa.impl.provider.factory.ParentSpecificationResolverTagHandler(providerTagHandler0, serviceProvider1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        org.seasar.mayaa.impl.engine.EngineImpl engineImpl0 = new org.seasar.mayaa.impl.engine.EngineImpl();
        org.seasar.mayaa.engine.error.ErrorHandler errorHandler1 = null;
        engineImpl0.setErrorHandler(errorHandler1);
        org.seasar.mayaa.engine.Page page3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = engineImpl0.getTemplateID(page3, "", "pageSerialize");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        int int0 = javax.servlet.http.HttpServletResponse.SC_MULTIPLE_CHOICES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 300 + "'", int0 == 300);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        org.seasar.mayaa.impl.engine.processor.TemplateProcessorSupport templateProcessorSupport0 = new org.seasar.mayaa.impl.engine.processor.TemplateProcessorSupport();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        org.seasar.mayaa.impl.engine.processor.DoBodyProcessor doBodyProcessor0 = new org.seasar.mayaa.impl.engine.processor.DoBodyProcessor();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        org.seasar.mayaa.impl.cycle.script.rhino.ScriptEnvironmentImpl scriptEnvironmentImpl0 = new org.seasar.mayaa.impl.cycle.script.rhino.ScriptEnvironmentImpl();
        org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl pathRelativeAdjusterImpl2 = new org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl();
        org.seasar.mayaa.cycle.script.CompiledScript compiledScript3 = scriptEnvironmentImpl0.compile("http://cyberneko.org/html/features/scanner/style/strip-comment-delims", (org.seasar.mayaa.PositionAware) pathRelativeAdjusterImpl2);
        org.seasar.mayaa.engine.specification.QName qName4 = org.seasar.mayaa.impl.CONST_IMPL.QM_TEMPLATE_ELEMENT;
        boolean boolean5 = pathRelativeAdjusterImpl2.isTargetNode(qName4);
        org.junit.Assert.assertNotNull(compiledScript3);
        org.junit.Assert.assertNotNull(qName4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        org.seasar.mayaa.impl.util.xml.TagHandler tagHandler1 = new org.seasar.mayaa.impl.util.xml.TagHandler("xml.xsd");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        org.seasar.mayaa.impl.builder.library.scanner.FolderSourceScanner folderSourceScanner0 = new org.seasar.mayaa.impl.builder.library.scanner.FolderSourceScanner();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        java.lang.String[] strArray1 = new java.lang.String[] { "suffixSeparator" };
        java.lang.String[] strArray3 = new java.lang.String[] { "suffixSeparator" };
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray1, strArray3 };
        org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl pathRelativeAdjusterImpl5 = new org.seasar.mayaa.impl.builder.PathRelativeAdjusterImpl(strArray4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        org.seasar.mayaa.engine.specification.QName qName0 = org.seasar.mayaa.impl.CONST_IMPL.QM_CONTENT_TYPE;
        org.junit.Assert.assertNotNull(qName0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl1 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker2 = serviceCycleImpl1.getProcessor();
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker3 = null;
        serviceCycleImpl1.setOriginalNode(nodeTreeWalker3);
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor5 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        serviceCycleImpl1.setProcessor((org.seasar.mayaa.engine.processor.ProcessorTreeWalker) attributeProcessor5);
        org.seasar.mayaa.impl.cycle.CycleThreadLocalFactory.InstanceKey instanceKey7 = new org.seasar.mayaa.impl.cycle.CycleThreadLocalFactory.InstanceKey("http://www.w3.org/TR/html4/strict.dtd", (java.lang.Object) attributeProcessor5);
        org.seasar.mayaa.impl.engine.processor.ForProcessor forProcessor8 = new org.seasar.mayaa.impl.engine.processor.ForProcessor();
        attributeProcessor5.setParentProcessor((org.seasar.mayaa.engine.processor.ProcessorTreeWalker) forProcessor8);
        attributeProcessor5.clearChildProcessors();
        org.junit.Assert.assertNull(processorTreeWalker2);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        org.seasar.mayaa.impl.engine.specification.NamespaceImpl namespaceImpl0 = new org.seasar.mayaa.impl.engine.specification.NamespaceImpl();
        org.seasar.mayaa.engine.specification.QName qName2 = org.seasar.mayaa.impl.engine.specification.QNameImpl.getInstance("hi!");
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl4 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName2, "datatypes.dtd");
        org.seasar.mayaa.engine.specification.URI uRI5 = qName2.getNamespaceURI();
        namespaceImpl0.setDefaultNamespaceURI(uRI5);
        org.seasar.mayaa.impl.engine.specification.NamespaceImpl namespaceImpl7 = new org.seasar.mayaa.impl.engine.specification.NamespaceImpl();
        org.seasar.mayaa.engine.specification.QName qName9 = org.seasar.mayaa.impl.engine.specification.QNameImpl.getInstance("hi!");
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl11 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName9, "datatypes.dtd");
        org.seasar.mayaa.engine.specification.URI uRI12 = qName9.getNamespaceURI();
        namespaceImpl7.setDefaultNamespaceURI(uRI12);
        namespaceImpl0.setParentSpace((org.seasar.mayaa.engine.specification.Namespace) namespaceImpl7);
        org.seasar.mayaa.impl.builder.library.mld.LibraryDefinitionHandler libraryDefinitionHandler15 = new org.seasar.mayaa.impl.builder.library.mld.LibraryDefinitionHandler();
        boolean boolean16 = namespaceImpl0.equals((java.lang.Object) libraryDefinitionHandler15);
        org.seasar.mayaa.engine.specification.URI uRI17 = org.seasar.mayaa.impl.CONST_IMPL.URI_HTML;
        org.seasar.mayaa.engine.specification.PrefixMapping prefixMapping19 = namespaceImpl0.getMappingFromURI(uRI17, false);
        org.junit.Assert.assertNotNull(qName2);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNotNull(qName9);
        org.junit.Assert.assertNotNull(uRI12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(uRI17);
        org.junit.Assert.assertNull(prefixMapping19);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        org.seasar.mayaa.impl.engine.specification.NamespaceImpl namespaceImpl0 = new org.seasar.mayaa.impl.engine.specification.NamespaceImpl();
        org.seasar.mayaa.engine.specification.QName qName2 = org.seasar.mayaa.impl.engine.specification.QNameImpl.getInstance("hi!");
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl4 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName2, "datatypes.dtd");
        org.seasar.mayaa.engine.specification.URI uRI5 = qName2.getNamespaceURI();
        namespaceImpl0.setDefaultNamespaceURI(uRI5);
        org.seasar.mayaa.impl.engine.specification.NamespaceImpl namespaceImpl7 = new org.seasar.mayaa.impl.engine.specification.NamespaceImpl();
        org.seasar.mayaa.engine.specification.QName qName9 = org.seasar.mayaa.impl.engine.specification.QNameImpl.getInstance("hi!");
        org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl nodeAttributeImpl11 = new org.seasar.mayaa.impl.engine.specification.NodeAttributeImpl(qName9, "datatypes.dtd");
        org.seasar.mayaa.engine.specification.URI uRI12 = qName9.getNamespaceURI();
        namespaceImpl7.setDefaultNamespaceURI(uRI12);
        namespaceImpl0.setParentSpace((org.seasar.mayaa.engine.specification.Namespace) namespaceImpl7);
        org.seasar.mayaa.engine.specification.Namespace namespace15 = namespaceImpl0.getParentSpace();
        org.junit.Assert.assertNotNull(qName2);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertNotNull(qName9);
        org.junit.Assert.assertNotNull(uRI12);
        org.junit.Assert.assertNotNull(namespace15);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        org.seasar.mayaa.impl.engine.processor.JspProcessor jspProcessor0 = new org.seasar.mayaa.impl.engine.processor.JspProcessor();
        org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl processorDefinitionImpl1 = new org.seasar.mayaa.impl.builder.library.ProcessorDefinitionImpl();
        processorDefinitionImpl1.addPropertySetRef("-//The Seasar Foundation//DTD Mayaa Factory 1.0//EN", "suffixSeparator", (int) (short) 10);
        jspProcessor0.setProcessorDefinition((org.seasar.mayaa.builder.library.ProcessorDefinition) processorDefinitionImpl1);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl1 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker2 = serviceCycleImpl1.getProcessor();
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker3 = null;
        serviceCycleImpl1.setOriginalNode(nodeTreeWalker3);
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor5 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        serviceCycleImpl1.setProcessor((org.seasar.mayaa.engine.processor.ProcessorTreeWalker) attributeProcessor5);
        org.seasar.mayaa.impl.cycle.CycleThreadLocalFactory.InstanceKey instanceKey7 = new org.seasar.mayaa.impl.cycle.CycleThreadLocalFactory.InstanceKey("http://www.w3.org/TR/html4/strict.dtd", (java.lang.Object) attributeProcessor5);
        org.seasar.mayaa.engine.Page page8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.engine.processor.ProcessStatus processStatus9 = attributeProcessor5.doStartProcess(page8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: no attributable processor.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker2);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        org.seasar.mayaa.engine.specification.URI uRI2 = org.seasar.mayaa.impl.engine.specification.URIImpl.getInstance("javaee_5.xsd");
        org.seasar.mayaa.engine.specification.PrefixMapping prefixMapping3 = org.seasar.mayaa.impl.engine.specification.PrefixMappingImpl.getInstance("http://java.sun.com/xml/ns/javaee/javaee_web_services_client_1_3.xsd", uRI2);
        org.junit.Assert.assertNotNull(uRI2);
        org.junit.Assert.assertNotNull(prefixMapping3);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        org.seasar.mayaa.impl.engine.specification.SpecificationImpl specificationImpl0 = new org.seasar.mayaa.impl.engine.specification.SpecificationImpl();
        org.seasar.mayaa.source.SourceDescriptor sourceDescriptor1 = specificationImpl0.getSource();
        boolean boolean2 = sourceDescriptor1.exists();
        org.junit.Assert.assertNotNull(sourceDescriptor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        java.io.OutputStream outputStream0 = null;
        org.seasar.mayaa.impl.util.IOUtil.close(outputStream0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
        org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition tLDLibraryDefinition0 = new org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition();
        org.seasar.mayaa.engine.specification.URI uRI1 = tLDLibraryDefinition0.getNamespaceURI();
        org.seasar.mayaa.builder.library.converter.PropertyConverter propertyConverter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            tLDLibraryDefinition0.addPropertyConverter("__current__", propertyConverter3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(uRI1);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        org.seasar.mayaa.impl.cycle.web.ResponseHeaderCache responseHeaderCache0 = new org.seasar.mayaa.impl.cycle.web.ResponseHeaderCache();
        responseHeaderCache0.setHeader("web-app_2_3.dtd", "datatypes.dtd");
        boolean boolean5 = responseHeaderCache0.containsHeader("http://www.w3.org/TR/html4/strict.dtd\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition tLDLibraryDefinition0 = new org.seasar.mayaa.impl.builder.library.TLDLibraryDefinition();
        // The following exception was thrown during execution in test generation
        try {
            org.seasar.mayaa.builder.library.converter.PropertyConverter propertyConverter2 = tLDLibraryDefinition0.getPropertyConverter("page");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instance is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl serviceCycleImpl0 = new org.seasar.mayaa.impl.cycle.web.ServiceCycleImpl();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = serviceCycleImpl0.getProcessor();
        org.seasar.mayaa.engine.specification.NodeTreeWalker nodeTreeWalker2 = null;
        serviceCycleImpl0.setOriginalNode(nodeTreeWalker2);
        org.seasar.mayaa.cycle.Response response4 = serviceCycleImpl0.getResponse();
        java.lang.String str6 = serviceCycleImpl0.getParameter("checkTimestamp");
        // The following exception was thrown during execution in test generation
        try {
            serviceCycleImpl0.error((int) (byte) 10, "session");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        org.seasar.mayaa.impl.cycle.script.ScriptBlock scriptBlock3 = new org.seasar.mayaa.impl.cycle.script.ScriptBlock("org.seasar.mayaa.impl.cycle.CycleNotInitializedException: Cycle not initialized. Do \"CycleFactory.initialize(req, res);\"", false, "/http://cyberneko.org/html/features/scanner/style/strip-comment-delims");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test372");
        org.seasar.mayaa.impl.engine.processor.AttributeProcessor attributeProcessor0 = new org.seasar.mayaa.impl.engine.processor.AttributeProcessor();
        org.seasar.mayaa.engine.processor.ProcessorTreeWalker processorTreeWalker1 = attributeProcessor0.getParentProcessor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = attributeProcessor0.getUniqueID();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: originalNode is null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(processorTreeWalker1);
    }
}
