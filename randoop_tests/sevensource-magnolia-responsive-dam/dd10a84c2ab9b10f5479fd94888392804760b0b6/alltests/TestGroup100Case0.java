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
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet1 = org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet.of(focusAreaSet0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension sizeDimension1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.configuration.SizeSpecification sizeSpecification2 = new org.sevensource.magnolia.responsivedam.configuration.SizeSpecification((java.lang.Integer) 1, sizeDimension1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SizeDimension (h or w) must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamImageGenerator responsiveDamImageGenerator0 = new org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamImageGenerator();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No ComponentProvider has been set yet, something must have gone terribly wrong at startup.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.vaadin.server.Sizeable.Unit unit0 = com.vaadin.server.Sizeable.UNITS_POINTS;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.vaadin.server.Sizeable.Unit.POINTS + "'", unit0.equals(com.vaadin.server.Sizeable.Unit.POINTS));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray0 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList1 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, damVariationSetArray0);
        java.awt.Dimension dimension3 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getRequiredImageDimensions((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1);
        org.junit.Assert.assertNotNull(damVariationSetArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dimension3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.vaadin.v7.data.Item item0 = null;
        info.magnolia.dam.app.ui.field.definition.DamUploadFieldDefinition damUploadFieldDefinition1 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer aspectAwareAssetTransformer3 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer(item0, damUploadFieldDefinition1, i18NAuthoringSupport2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.String str0 = info.magnolia.ui.form.field.factory.LinkFieldFactory.PATH_PROPERTY_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "transientPathProperty" + "'", str0, "transientPathProperty");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.vaadin.server.Sizeable.Unit unit0 = com.vaadin.server.Sizeable.UNITS_CM;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.vaadin.server.Sizeable.Unit.CM + "'", unit0.equals(com.vaadin.server.Sizeable.Unit.CM));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.field.validation.AspectAwareDamUploadFieldValidator aspectAwareDamUploadFieldValidator3 = new org.sevensource.magnolia.responsivedam.field.validation.AspectAwareDamUploadFieldValidator(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        float float0 = com.vaadin.server.Sizeable.SIZE_UNDEFINED;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + (-1.0f) + "'", float0 == (-1.0f));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.vaadin.server.Sizeable.Unit unit0 = com.vaadin.server.Sizeable.UNITS_PERCENTAGE;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.vaadin.server.Sizeable.Unit.PERCENTAGE + "'", unit0.equals(com.vaadin.server.Sizeable.Unit.PERCENTAGE));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareCrop aspectAwareCrop0 = new org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareCrop();
        java.awt.image.BufferedImage bufferedImage1 = null;
        info.magnolia.imaging.ParameterProvider<org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameter> aspectAwareParameterParameterProvider2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage3 = aspectAwareCrop0.apply(bufferedImage1, aspectAwareParameterParameterProvider2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = null;
        org.sevensource.magnolia.responsivedam.field.link.AspectAwareDamLinkFieldDefinition aspectAwareDamLinkFieldDefinition1 = null;
        info.magnolia.jcr.node2bean.Node2BeanProcessor node2BeanProcessor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.field.validation.AspectAwareDamLinkFieldValidator aspectAwareDamLinkFieldValidator4 = new org.sevensource.magnolia.responsivedam.field.validation.AspectAwareDamLinkFieldValidator(responsiveDamConfiguration0, aspectAwareDamLinkFieldDefinition1, node2BeanProcessor2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.vaadin.ui.Label label0 = null;
        org.sevensource.magnolia.responsivedam.field.AspectAwareUiUtils.InfoLabelStyle infoLabelStyle2 = null;
        org.sevensource.magnolia.responsivedam.field.AspectAwareUiUtils.updateInfoLabel(label0, "", infoLabelStyle2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        info.magnolia.objectfactory.ComponentProvider componentProvider0 = null;
        info.magnolia.jcr.node2bean.Node2BeanProcessor node2BeanProcessor1 = null;
        org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameterProviderFactory<org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareCrop> aspectAwareCropAspectAwareParameterProviderFactory2 = new org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameterProviderFactory<org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareCrop>(componentProvider0, node2BeanProcessor1);
        info.magnolia.imaging.caching.CachingStrategy<org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameter> aspectAwareParameterCachingStrategy3 = aspectAwareCropAspectAwareParameterProviderFactory2.getCachingStrategy();
        org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareCrop aspectAwareCrop4 = new org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareCrop();
        // The following exception was thrown during execution in test generation
        try {
            info.magnolia.imaging.ParameterProvider<org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameter> aspectAwareParameterParameterProvider5 = aspectAwareCropAspectAwareParameterProviderFactory2.newParameterProviderFor(aspectAwareCrop4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to handle request of type org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareCrop");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(aspectAwareParameterCachingStrategy3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas0 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet damVariationSet1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet2 = focusAreas0.getOrCreateFocusAreaSet(damVariationSet1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        javax.jcr.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            javax.jcr.Node node1 = org.sevensource.magnolia.responsivedam.ResponsiveDamNodeUtil.getContentNode(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.vaadin.server.Sizeable.Unit unit0 = com.vaadin.server.Sizeable.UNITS_INCH;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.vaadin.server.Sizeable.Unit.INCH + "'", unit0.equals(com.vaadin.server.Sizeable.Unit.INCH));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        javax.jcr.Node node0 = null;
        info.magnolia.jcr.node2bean.Node2BeanProcessor node2BeanProcessor1 = null;
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas2 = org.sevensource.magnolia.responsivedam.focusarea.FocusAreasUtil.readFocusAreas(node0, node2BeanProcessor1);
        org.junit.Assert.assertNull(focusAreas2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition selectionActionDefinition1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition(damVariation0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation2 = selectionActionDefinition1.getVariation();
        java.lang.String str3 = selectionActionDefinition1.getI18nBasename();
        java.lang.String str4 = selectionActionDefinition1.getErrorMessage();
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation5 = selectionActionDefinition1.getVariation();
        org.junit.Assert.assertNull(damVariation2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(damVariation5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet1 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet("");
        focusAreaSet1.setName("transientPathProperty");
        focusAreaSet1.setName("");
        java.lang.Class<?> wildcardClass6 = focusAreaSet1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        info.magnolia.objectfactory.ComponentProvider componentProvider0 = null;
        info.magnolia.jcr.node2bean.Node2BeanProcessor node2BeanProcessor1 = null;
        org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameterProviderFactory<info.magnolia.imaging.operations.ImageOperation<info.magnolia.imaging.ParameterProvider<org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameter>>> aspectAwareParameterParameterProviderImageOperationAspectAwareParameterProviderFactory2 = new org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameterProviderFactory<info.magnolia.imaging.operations.ImageOperation<info.magnolia.imaging.ParameterProvider<org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameter>>>(componentProvider0, node2BeanProcessor1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet1 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet("");
        focusAreaSet1.setName("transientPathProperty");
        focusAreaSet1.setName("");
        java.util.Set<org.sevensource.magnolia.responsivedam.focusarea.FocusArea> focusAreaSet6 = focusAreaSet1.getFocusAreas();
        org.junit.Assert.assertNotNull(focusAreaSet6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.configuration.SizeSpecification sizeSpecification1 = org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.of("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension sizeDimension1 = org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.of("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown size spec hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeSpecificationConverter sizeSpecificationConverter0 = new org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeSpecificationConverter();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.vaadin.server.Sizeable.Unit unit0 = com.vaadin.server.Sizeable.UNITS_PICAS;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.vaadin.server.Sizeable.Unit.PICAS + "'", unit0.equals(com.vaadin.server.Sizeable.Unit.PICAS));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        javax.jcr.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamVariation responsiveDamVariation7 = responsiveDamTemplatingFunctions3.getResponsiveVariation(node4, "transientPathProperty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No damVariation with name [hi!] found for variationSet [transientPathProperty]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.String str0 = org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer.PROP_FOCUSAREAS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "focusAreas" + "'", str0, "focusAreas");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter0 = null;
        info.magnolia.ui.dialog.DialogPresenter dialogPresenter1 = null;
        info.magnolia.ui.dialog.actionarea.DialogActionExecutor dialogActionExecutor2 = null;
        info.magnolia.ui.api.app.AppContext appContext3 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionPresenter focusAreaSelectionPresenter5 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionPresenter(actionbarPresenter0, dialogPresenter1, dialogActionExecutor2, appContext3, simpleTranslator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition selectionActionDefinition1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition(damVariation0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation2 = selectionActionDefinition1.getVariation();
        java.lang.String str3 = selectionActionDefinition1.getI18nBasename();
        selectionActionDefinition1.setIcon("");
        selectionActionDefinition1.setFailureMessage("focusAreas");
        org.junit.Assert.assertNull(damVariation2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamCachingStrategy responsiveDamCachingStrategy0 = new org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamCachingStrategy();
        info.magnolia.imaging.ImageGenerator<info.magnolia.imaging.ParameterProvider<org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameter>> aspectAwareParameterParameterProviderImageGenerator1 = null;
        info.magnolia.imaging.ParameterProvider<org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameter> aspectAwareParameterParameterProvider2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = responsiveDamCachingStrategy0.getCachePath(aspectAwareParameterParameterProviderImageGenerator1, aspectAwareParameterParameterProvider2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea5 = new org.sevensource.magnolia.responsivedam.focusarea.FocusArea("", (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
        boolean boolean6 = focusArea5.isValid();
        boolean boolean8 = focusArea5.equals((java.lang.Object) (byte) 1);
        focusArea5.setX((java.lang.Integer) 1);
        boolean boolean11 = focusArea5.isValid();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.vaadin.server.ClientConnector clientConnector0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<? extends com.vaadin.server.ClientConnector> wildcardIterable1 = com.vaadin.server.AbstractClientConnector.getAllChildrenIterable(clientConnector0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension sizeDimension1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.configuration.SizeSpecification sizeSpecification2 = new org.sevensource.magnolia.responsivedam.configuration.SizeSpecification((java.lang.Integer) 10, sizeDimension1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: SizeDimension (h or w) must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea5 = new org.sevensource.magnolia.responsivedam.focusarea.FocusArea("", (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
        boolean boolean6 = focusArea5.isValid();
        boolean boolean8 = focusArea5.equals((java.lang.Object) (byte) 1);
        focusArea5.setHeight((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule1 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.field.validation.AspectAwareDamUploadFieldValidator aspectAwareDamUploadFieldValidator4 = new org.sevensource.magnolia.responsivedam.field.validation.AspectAwareDamUploadFieldValidator(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition2, "focusAreas");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        info.magnolia.ui.form.field.LinkField linkField0 = null;
        info.magnolia.ui.dialog.formdialog.FormDialogPresenterFactory formDialogPresenterFactory1 = null;
        info.magnolia.ui.dialog.registry.DialogDefinitionRegistry dialogDefinitionRegistry2 = null;
        info.magnolia.ui.api.context.UiContext uiContext3 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.field.link.AspectAwareDamLinkField aspectAwareDamLinkField5 = new org.sevensource.magnolia.responsivedam.field.link.AspectAwareDamLinkField(linkField0, formDialogPresenterFactory1, dialogDefinitionRegistry2, uiContext3, simpleTranslator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String str0 = org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamImageGenerator.GENERATOR_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "rd" + "'", str0, "rd");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition selectionActionDefinition1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition(damVariation0);
        java.lang.String str2 = selectionActionDefinition1.getDescription();
        java.lang.String str3 = selectionActionDefinition1.getI18nBasename();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareResample aspectAwareResample0 = new org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareResample();
        java.lang.Class<?> wildcardClass1 = aspectAwareResample0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        org.sevensource.magnolia.responsivedam.field.AspectAwareUiUtils.InfoLabelStyle infoLabelStyle0 = org.sevensource.magnolia.responsivedam.field.AspectAwareUiUtils.InfoLabelStyle.ERROR;
        org.junit.Assert.assertTrue("'" + infoLabelStyle0 + "' != '" + org.sevensource.magnolia.responsivedam.field.AspectAwareUiUtils.InfoLabelStyle.ERROR + "'", infoLabelStyle0.equals(org.sevensource.magnolia.responsivedam.field.AspectAwareUiUtils.InfoLabelStyle.ERROR));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = null;
        com.vaadin.v7.data.Item item6 = null;
        info.magnolia.ui.api.context.UiContext uiContext7 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport8 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator12 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer13 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item6, uiContext7, i18NAuthoringSupport8, imageProvider9, mediaEditorPresenterFactory10, componentProvider11, simpleTranslator12, i18nizer13, actionbarPresenter14);
        java.util.Locale locale16 = aspectAwareDamUploadFieldFactory15.getLocale();
        info.magnolia.objectfactory.ComponentProvider componentProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            aspectAwareDamUploadFieldFactory15.setComponentProvider(componentProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(locale16);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition selectionActionDefinition1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition(damVariation0);
        java.lang.String str2 = selectionActionDefinition1.getDescription();
        selectionActionDefinition1.setI18nBasename("transientPathProperty");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet1 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet("");
        focusAreaSet1.setName("transientPathProperty");
        java.lang.Class<?> wildcardClass4 = focusAreaSet1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea5 = new org.sevensource.magnolia.responsivedam.focusarea.FocusArea("", (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
        boolean boolean6 = focusArea5.isValid();
        boolean boolean8 = focusArea5.equals((java.lang.Object) (byte) 1);
        focusArea5.setX((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            focusAreaSelectionField1.setValue(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 1, 100, 1, 100]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea5 = new org.sevensource.magnolia.responsivedam.focusarea.FocusArea("", (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
        boolean boolean6 = focusArea5.isValid();
        boolean boolean8 = focusArea5.equals((java.lang.Object) (byte) 1);
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea9 = org.sevensource.magnolia.responsivedam.focusarea.FocusArea.of(focusArea5);
        focusArea5.setHeight((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(focusArea9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        // The following exception was thrown during execution in test generation
        try {
            focusAreaSelectionField1.detach();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        javax.jcr.Node node0 = null;
        info.magnolia.jcr.node2bean.Node2BeanProcessor node2BeanProcessor3 = null;
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea4 = org.sevensource.magnolia.responsivedam.focusarea.FocusAreasUtil.readFocusArea(node0, "", "transientPathProperty", node2BeanProcessor3);
        org.junit.Assert.assertNull(focusArea4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        // The following exception was thrown during execution in test generation
        try {
            focusAreaSelectionField1.attach();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareResample aspectAwareResample0 = new org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareResample();
        java.awt.image.BufferedImage bufferedImage1 = null;
        info.magnolia.imaging.ParameterProvider<org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameter> aspectAwareParameterParameterProvider2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage3 = aspectAwareResample0.apply(bufferedImage1, aspectAwareParameterParameterProvider2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray0 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList1 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, damVariationSetArray0);
        java.awt.Dimension dimension3 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getRequiredImageDimensions((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1);
        java.awt.Dimension dimension4 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getRequiredImageDimensions((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1);
        org.junit.Assert.assertNotNull(damVariationSetArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertNotNull(dimension4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        info.magnolia.imaging.OutputFormat outputFormat4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = responsiveDamTemplatingFunctions3.getMimeTypeByOutputFormat(outputFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = null;
        com.vaadin.v7.data.Item item6 = null;
        info.magnolia.ui.api.context.UiContext uiContext7 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport8 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator12 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer13 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item6, uiContext7, i18NAuthoringSupport8, imageProvider9, mediaEditorPresenterFactory10, componentProvider11, simpleTranslator12, i18nizer13, actionbarPresenter14);
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration16 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging17 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration18 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions19 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration16, imaging17, serverConfiguration18);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList20 = responsiveDamConfiguration16.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition21 = null;
        com.vaadin.v7.data.Item item22 = null;
        info.magnolia.ui.api.context.UiContext uiContext23 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport24 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider25 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory26 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider27 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator28 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer29 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter30 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory31 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration16, aspectAwareDamUploadFieldDefinition21, item22, uiContext23, i18NAuthoringSupport24, imageProvider25, mediaEditorPresenterFactory26, componentProvider27, simpleTranslator28, i18nizer29, actionbarPresenter30);
        java.util.Locale locale32 = aspectAwareDamUploadFieldFactory31.getLocale();
        aspectAwareDamUploadFieldFactory15.setParent((info.magnolia.ui.form.FormItem) aspectAwareDamUploadFieldFactory31);
        // The following exception was thrown during execution in test generation
        try {
            com.vaadin.v7.ui.Field<org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetUploadReceiver> aspectAwareAssetUploadReceiverField34 = aspectAwareDamUploadFieldFactory15.createField();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(outputFormatMappingList20);
        org.junit.Assert.assertNull(locale32);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension sizeDimension1 = org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH;
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification sizeSpecification2 = new org.sevensource.magnolia.responsivedam.configuration.SizeSpecification((java.lang.Integer) 100, sizeDimension1);
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration3 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging4 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration5 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions6 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration3, imaging4, serverConfiguration5);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList7 = responsiveDamConfiguration3.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition8 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        com.vaadin.v7.data.Item item9 = null;
        info.magnolia.ui.api.context.UiContext uiContext10 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport11 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider12 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory13 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider14 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator15 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer16 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter17 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory18 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration3, aspectAwareDamUploadFieldDefinition8, item9, uiContext10, i18NAuthoringSupport11, imageProvider12, mediaEditorPresenterFactory13, componentProvider14, simpleTranslator15, i18nizer16, actionbarPresenter17);
        boolean boolean19 = sizeSpecification2.equals((java.lang.Object) uiContext10);
        org.junit.Assert.assertTrue("'" + sizeDimension1 + "' != '" + org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH + "'", sizeDimension1.equals(org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH));
        org.junit.Assert.assertNull(outputFormatMappingList7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray0 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList1 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, damVariationSetArray0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray3 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList4 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList4, damVariationSetArray3);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas6 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList7 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList4, focusAreas6);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray8 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList9 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList9, damVariationSetArray8);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas11 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList12 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList9, focusAreas11);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList13 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList4, focusAreas11);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList14 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, focusAreas11);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet16 = focusAreas11.getFocusAreaSet("focusAreas");
        org.junit.Assert.assertNotNull(damVariationSetArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(damVariationSetArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(damVariationList7);
        org.junit.Assert.assertNotNull(damVariationSetArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(damVariationList12);
        org.junit.Assert.assertNotNull(damVariationList13);
        org.junit.Assert.assertNotNull(damVariationList14);
        org.junit.Assert.assertNull(focusAreaSet16);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        java.util.Collection<com.vaadin.server.Extension> extensionCollection4 = focusAreaSelectionField1.getExtensions();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            focusAreaSelectionField1.setValue(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extensionCollection4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, 0, 1]");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setDescription("focusAreas");
        aspectAwareDamUploadFieldDefinition0.setSizeInterruption("transientPathProperty");
        java.lang.String str5 = aspectAwareDamUploadFieldDefinition0.getDeleteCaption();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "field.upload.select.delete" + "'", str5, "field.upload.select.delete");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = null;
        com.vaadin.v7.data.Item item6 = null;
        info.magnolia.ui.api.context.UiContext uiContext7 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport8 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator12 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer13 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item6, uiContext7, i18NAuthoringSupport8, imageProvider9, mediaEditorPresenterFactory10, componentProvider11, simpleTranslator12, i18nizer13, actionbarPresenter14);
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration16 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging17 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration18 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions19 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration16, imaging17, serverConfiguration18);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList20 = responsiveDamConfiguration16.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition21 = null;
        com.vaadin.v7.data.Item item22 = null;
        info.magnolia.ui.api.context.UiContext uiContext23 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport24 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider25 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory26 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider27 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator28 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer29 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter30 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory31 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration16, aspectAwareDamUploadFieldDefinition21, item22, uiContext23, i18NAuthoringSupport24, imageProvider25, mediaEditorPresenterFactory26, componentProvider27, simpleTranslator28, i18nizer29, actionbarPresenter30);
        java.util.Locale locale32 = aspectAwareDamUploadFieldFactory31.getLocale();
        aspectAwareDamUploadFieldFactory15.setParent((info.magnolia.ui.form.FormItem) aspectAwareDamUploadFieldFactory31);
        info.magnolia.ui.form.FormItem formItem34 = aspectAwareDamUploadFieldFactory15.getParent();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(outputFormatMappingList20);
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertNotNull(formItem34);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition selectionActionDefinition1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition(damVariation0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation2 = selectionActionDefinition1.getVariation();
        java.lang.String str3 = selectionActionDefinition1.getI18nBasename();
        selectionActionDefinition1.setSuccessMessage("hi!");
        org.junit.Assert.assertNull(damVariation2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener7 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField8 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener7);
        boolean boolean9 = focusAreaSelectionField8.isConnectorEnabled();
        focusAreaSelectionField4.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField8);
        float float11 = focusAreaSelectionField4.getHeight();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener12 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField13 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener12);
        com.vaadin.v7.data.Buffered.SourceException sourceException14 = null;
        focusAreaSelectionField13.setCurrentBufferedSourceException(sourceException14);
        focusAreaSelectionField4.removeListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField13);
        java.util.Locale locale17 = null;
        focusAreaSelectionField4.setLocale(locale17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension sizeDimension1 = org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.of("transientPathProperty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown size spec transientPathProperty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        focusAreaSelectionField1.setTabIndex(0);
        focusAreaSelectionField1.scaleToActualSize();
        com.vaadin.server.VaadinRequest vaadinRequest7 = null;
        com.vaadin.server.VaadinResponse vaadinResponse8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = focusAreaSelectionField1.handleConnectorRequest(vaadinRequest7, vaadinResponse8, "transientPathProperty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = null;
        com.vaadin.v7.data.Item item6 = null;
        info.magnolia.ui.api.context.UiContext uiContext7 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport8 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator12 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer13 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item6, uiContext7, i18NAuthoringSupport8, imageProvider9, mediaEditorPresenterFactory10, componentProvider11, simpleTranslator12, i18nizer13, actionbarPresenter14);
        java.util.Locale locale16 = aspectAwareDamUploadFieldFactory15.getLocale();
        java.util.Locale locale17 = null;
        aspectAwareDamUploadFieldFactory15.setLocale(locale17);
        java.util.Locale locale19 = null;
        aspectAwareDamUploadFieldFactory15.setLocale(locale19);
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(locale16);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener7 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField8 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener7);
        boolean boolean9 = focusAreaSelectionField8.isConnectorEnabled();
        focusAreaSelectionField4.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField8);
        float float11 = focusAreaSelectionField4.getHeight();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener12 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField13 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener12);
        com.vaadin.v7.data.Buffered.SourceException sourceException14 = null;
        focusAreaSelectionField13.setCurrentBufferedSourceException(sourceException14);
        focusAreaSelectionField4.removeListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField13);
        focusAreaSelectionField13.setImmediate(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        // The following exception was thrown during execution in test generation
        try {
            aspectAwareDamUploadField17.detach();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        com.vaadin.v7.data.Item item6 = null;
        info.magnolia.ui.api.context.UiContext uiContext7 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport8 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator12 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer13 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item6, uiContext7, i18NAuthoringSupport8, imageProvider9, mediaEditorPresenterFactory10, componentProvider11, simpleTranslator12, i18nizer13, actionbarPresenter14);
        java.lang.String str16 = aspectAwareDamUploadFieldDefinition5.getStyleName();
        boolean boolean17 = aspectAwareDamUploadFieldDefinition5.isReadOnly();
        aspectAwareDamUploadFieldDefinition5.setI18nBasename("field.upload.note.error");
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.vaadin.v7.data.Item item0 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition1 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition1.setFieldType("");
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport4 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer aspectAwareAssetTransformer5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer(item0, (info.magnolia.dam.app.ui.field.definition.DamUploadFieldDefinition) aspectAwareDamUploadFieldDefinition1, i18NAuthoringSupport4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = aspectAwareAssetTransformer5.isReadOnly();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        com.vaadin.v7.data.Item item6 = null;
        info.magnolia.ui.api.context.UiContext uiContext7 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport8 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator12 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer13 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item6, uiContext7, i18NAuthoringSupport8, imageProvider9, mediaEditorPresenterFactory10, componentProvider11, simpleTranslator12, i18nizer13, actionbarPresenter14);
        aspectAwareDamUploadFieldDefinition5.setFileDetailFormatCaption("field.upload.select.delete");
        org.junit.Assert.assertNull(outputFormatMappingList4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition selectionActionDefinition1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition(damVariation0);
        java.lang.String str2 = selectionActionDefinition1.getDescription();
        selectionActionDefinition1.setI18nBasename("");
        java.lang.String str5 = selectionActionDefinition1.getI18nBasename();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet0 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition selectionActionDefinition1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition(damVariation0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation2 = selectionActionDefinition1.getVariation();
        java.lang.String str3 = selectionActionDefinition1.getI18nBasename();
        java.lang.String str4 = selectionActionDefinition1.getErrorMessage();
        selectionActionDefinition1.setIcon("hi!");
        java.lang.String str7 = selectionActionDefinition1.getName();
        org.junit.Assert.assertNull(damVariation2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule1 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> strMap2 = null;
        responsiveDamModule1.setVariations(strMap2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener18 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField19 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener18);
        boolean boolean20 = focusAreaSelectionField19.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener21 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField22 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener21);
        focusAreaSelectionField19.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField22);
        aspectAwareDamUploadField17.removeValueChangeListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField19);
        boolean boolean25 = aspectAwareDamUploadField17.isModified();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        focusAreaSelectionField1.setTabIndex(0);
        focusAreaSelectionField1.requestRepaint();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        javax.jcr.Node node0 = null;
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification sizeSpecification3 = null;
        info.magnolia.imaging.OutputFormat outputFormat4 = null;
        org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamRendition responsiveDamRendition5 = new org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamRendition(node0, "hi!", "transientPathProperty", sizeSpecification3, outputFormat4);
        javax.jcr.Node node6 = responsiveDamRendition5.getNode();
        java.lang.String str7 = responsiveDamRendition5.getVariation();
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification sizeSpecification8 = responsiveDamRendition5.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = responsiveDamRendition5.getLink();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "transientPathProperty" + "'", str7, "transientPathProperty");
        org.junit.Assert.assertNull(sizeSpecification8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea5 = new org.sevensource.magnolia.responsivedam.focusarea.FocusArea("", (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
        focusArea5.setY((java.lang.Integer) 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.vaadin.v7.data.Item item0 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition1 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition1.setFieldType("");
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport4 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer aspectAwareAssetTransformer5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer(item0, (info.magnolia.dam.app.ui.field.definition.DamUploadFieldDefinition) aspectAwareDamUploadFieldDefinition1, i18NAuthoringSupport4);
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetUploadReceiver aspectAwareAssetUploadReceiver6 = aspectAwareAssetTransformer5.readFromItem();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        focusAreaSelectionField4.execute();
        boolean boolean8 = focusAreaSelectionField4.isInvalidCommitted();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray0 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList1 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, damVariationSetArray0);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas3 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList4 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, focusAreas3);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray5 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList6 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList6, damVariationSetArray5);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas8 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList9 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList6, focusAreas8);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList10 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, focusAreas8);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet12 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet("");
        focusAreas8.addFocusAreaSet(focusAreaSet12);
        boolean boolean15 = focusAreaSet12.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(damVariationSetArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(damVariationList4);
        org.junit.Assert.assertNotNull(damVariationSetArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(damVariationList9);
        org.junit.Assert.assertNotNull(damVariationList10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea5 = new org.sevensource.magnolia.responsivedam.focusarea.FocusArea("", (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
        boolean boolean6 = focusArea5.isValid();
        focusArea5.setName("rd");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        com.vaadin.server.Sizeable.Unit unit19 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField17.setWidth((float) (byte) -1, unit19);
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration21 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule22 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration21);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation25 = responsiveDamConfiguration21.getVariation("focusAreas", "transientPathProperty");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition26 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition26.setSuccessNoteCaption("transientPathProperty");
        com.vaadin.v7.data.Item item29 = null;
        info.magnolia.ui.api.context.UiContext uiContext30 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport31 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider32 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory33 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider34 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator35 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer36 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter37 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory38 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration21, aspectAwareDamUploadFieldDefinition26, item29, uiContext30, i18NAuthoringSupport31, imageProvider32, mediaEditorPresenterFactory33, componentProvider34, simpleTranslator35, i18nizer36, actionbarPresenter37);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet damVariationSet40 = responsiveDamConfiguration21.getVariationSet("rd");
        aspectAwareDamUploadField17.setData((java.lang.Object) damVariationSet40);
        aspectAwareDamUploadField17.setAllowedMimeTypePattern("transientPathProperty");
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit19.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNull(damVariation25);
        org.junit.Assert.assertNull(damVariationSet40);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        focusAreaSelectionField1.setTabIndex(0);
        focusAreaSelectionField1.setValidationVisible(true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition0.setSuccessNoteCaption("");
        aspectAwareDamUploadFieldDefinition0.setFileDetailNameCaption("");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        com.vaadin.server.Sizeable.Unit unit19 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField17.setWidth((float) (byte) -1, unit19);
        com.vaadin.server.ErrorMessage errorMessage21 = aspectAwareDamUploadField17.getErrorMessage();
        com.vaadin.server.VaadinRequest vaadinRequest22 = null;
        com.vaadin.server.VaadinResponse vaadinResponse23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = aspectAwareDamUploadField17.handleConnectorRequest(vaadinRequest22, vaadinResponse23, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit19.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNull(errorMessage21);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter2 = focusAreaSelectionField1.getConverter();
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration3 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging4 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration5 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions6 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration3, imaging4, serverConfiguration5);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList7 = responsiveDamConfiguration3.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider8 = null;
        info.magnolia.ui.api.context.UiContext uiContext9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition12 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition12.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition12.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator17 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer18 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter19 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField20 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration3, imageProvider8, uiContext9, mediaEditorPresenterFactory10, componentProvider11, aspectAwareDamUploadFieldDefinition12, simpleTranslator17, i18nizer18, actionbarPresenter19);
        com.vaadin.server.Sizeable.Unit unit22 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField20.setWidth((float) (byte) -1, unit22);
        focusAreaSelectionField1.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) aspectAwareDamUploadField20);
        com.vaadin.ui.HasComponents hasComponents25 = focusAreaSelectionField1.getParent();
        org.junit.Assert.assertNull(byteArrayConverter2);
        org.junit.Assert.assertNull(outputFormatMappingList7);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit22.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNull(hasComponents25);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule1 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
        org.sevensource.magnolia.responsivedam.configuration.DamSizeConstraints damSizeConstraints2 = responsiveDamModule1.getDefaultConstraint();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> strMap3 = responsiveDamModule1.getVariations();
        org.sevensource.magnolia.responsivedam.configuration.DamSizeConstraints damSizeConstraints4 = null;
        responsiveDamModule1.setDefaultConstraint(damSizeConstraints4);
        org.junit.Assert.assertNull(damSizeConstraints2);
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.server.ServerRpcManager<?> wildcardServerRpcManager3 = focusAreaSelectionField1.getRpcManager("focusAreas");
        boolean boolean4 = focusAreaSelectionField1.isValid();
        float float5 = focusAreaSelectionField1.getHeight();
        org.junit.Assert.assertNull(wildcardServerRpcManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = null;
        com.vaadin.v7.data.Item item6 = null;
        info.magnolia.ui.api.context.UiContext uiContext7 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport8 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator12 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer13 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item6, uiContext7, i18NAuthoringSupport8, imageProvider9, mediaEditorPresenterFactory10, componentProvider11, simpleTranslator12, i18nizer13, actionbarPresenter14);
        java.util.Locale locale16 = aspectAwareDamUploadFieldFactory15.getLocale();
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration17 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging18 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration19 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions20 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration17, imaging18, serverConfiguration19);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList21 = responsiveDamConfiguration17.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition22 = null;
        com.vaadin.v7.data.Item item23 = null;
        info.magnolia.ui.api.context.UiContext uiContext24 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport25 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider26 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory27 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider28 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator29 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer30 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter31 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory32 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration17, aspectAwareDamUploadFieldDefinition22, item23, uiContext24, i18NAuthoringSupport25, imageProvider26, mediaEditorPresenterFactory27, componentProvider28, simpleTranslator29, i18nizer30, actionbarPresenter31);
        aspectAwareDamUploadFieldFactory15.setParent((info.magnolia.ui.form.FormItem) aspectAwareDamUploadFieldFactory32);
        // The following exception was thrown during execution in test generation
        try {
            com.vaadin.v7.ui.Field<org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetUploadReceiver> aspectAwareAssetUploadReceiverField34 = aspectAwareDamUploadFieldFactory15.createField();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNull(outputFormatMappingList21);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter2 = focusAreaSelectionField1.getConverter();
        focusAreaSelectionField1.setSizeFull();
        org.junit.Assert.assertNull(byteArrayConverter2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet1 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet("transientPathProperty");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener18 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField19 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener18);
        com.vaadin.server.ServerRpcManager<?> wildcardServerRpcManager21 = focusAreaSelectionField19.getRpcManager("focusAreas");
        aspectAwareDamUploadField17.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField19);
        com.vaadin.v7.data.Property.ReadOnlyStatusChangeEvent readOnlyStatusChangeEvent23 = null;
        // The following exception was thrown during execution in test generation
        try {
            aspectAwareDamUploadField17.readOnlyStatusChange(readOnlyStatusChangeEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(wildcardServerRpcManager21);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray0 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList1 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, damVariationSetArray0);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas3 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList4 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, focusAreas3);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray5 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList6 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList6, damVariationSetArray5);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray8 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList9 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList9, damVariationSetArray8);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas11 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList12 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList9, focusAreas11);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray13 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList14 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList14, damVariationSetArray13);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas16 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList17 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList14, focusAreas16);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList18 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList9, focusAreas16);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList19 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList6, focusAreas16);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet21 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet("");
        focusAreaSet21.setName("transientPathProperty");
        focusAreas16.addFocusAreaSet(focusAreaSet21);
        focusAreas3.addFocusAreaSet(focusAreaSet21);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet27 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet("");
        focusAreas3.addFocusAreaSet(focusAreaSet27);
        org.junit.Assert.assertNotNull(damVariationSetArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(damVariationList4);
        org.junit.Assert.assertNotNull(damVariationSetArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(damVariationSetArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(damVariationList12);
        org.junit.Assert.assertNotNull(damVariationSetArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(damVariationList17);
        org.junit.Assert.assertNotNull(damVariationList18);
        org.junit.Assert.assertNotNull(damVariationList19);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        java.lang.String str6 = focusAreaSelectionField4.getConversionError();
        com.vaadin.server.ClientConnector.AttachListener attachListener7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vaadin.shared.Registration registration8 = focusAreaSelectionField4.addAttachListener(attachListener7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener must not be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Could not convert value to {0}" + "'", str6, "Could not convert value to {0}");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.server.ServerRpcManager<?> wildcardServerRpcManager3 = focusAreaSelectionField1.getRpcManager("focusAreas");
        byte[] byteArray4 = focusAreaSelectionField1.getValue();
        org.junit.Assert.assertNull(wildcardServerRpcManager3);
        org.junit.Assert.assertNull(byteArray4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet1 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet("validation.message.required");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        com.vaadin.v7.data.Item item6 = null;
        info.magnolia.ui.api.context.UiContext uiContext7 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport8 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator12 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer13 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item6, uiContext7, i18NAuthoringSupport8, imageProvider9, mediaEditorPresenterFactory10, componentProvider11, simpleTranslator12, i18nizer13, actionbarPresenter14);
        java.lang.String str16 = aspectAwareDamUploadFieldDefinition5.getStyleName();
        boolean boolean17 = aspectAwareDamUploadFieldDefinition5.isReadOnly();
        aspectAwareDamUploadFieldDefinition5.setFileDetailSizeCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition5.setDeleteCaption("field.upload.select.edit");
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.server.ServerRpcManager<?> wildcardServerRpcManager3 = focusAreaSelectionField1.getRpcManager("focusAreas");
        boolean boolean4 = focusAreaSelectionField1.isBuffered();
        focusAreaSelectionField1.removeStyleName("");
        org.junit.Assert.assertNull(wildcardServerRpcManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.imaging.operation.FromAspectAwareBinaryNode fromAspectAwareBinaryNode0 = new org.sevensource.magnolia.responsivedam.imaging.operation.FromAspectAwareBinaryNode();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No ComponentProvider has been set yet, something must have gone terribly wrong at startup.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule1 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation4 = responsiveDamConfiguration0.getVariation("focusAreas", "transientPathProperty");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition5.setSuccessNoteCaption("transientPathProperty");
        com.vaadin.v7.data.Item item8 = null;
        info.magnolia.ui.api.context.UiContext uiContext9 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport10 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider11 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory12 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider13 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item8, uiContext9, i18NAuthoringSupport10, imageProvider11, mediaEditorPresenterFactory12, componentProvider13, simpleTranslator14, i18nizer15, actionbarPresenter16);
        java.lang.String str18 = aspectAwareDamUploadFieldDefinition5.getSelectAnotherCaption();
        java.lang.String str19 = aspectAwareDamUploadFieldDefinition5.getErrorNoteCaption();
        org.junit.Assert.assertNull(damVariation4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "field.upload.select.another" + "'", str18, "field.upload.select.another");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "field.upload.note.error" + "'", str19, "field.upload.note.error");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList5 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping[] outputFormatMappingArray6 = new org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList7 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping>) outputFormatMappingList7, outputFormatMappingArray6);
        responsiveDamConfiguration0.setOutputFormatMappings((java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping>) outputFormatMappingList7);
        org.sevensource.magnolia.responsivedam.field.link.AspectAwareDamLinkFieldDefinition aspectAwareDamLinkFieldDefinition10 = null;
        info.magnolia.jcr.node2bean.Node2BeanProcessor node2BeanProcessor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.field.validation.AspectAwareDamLinkFieldValidator aspectAwareDamLinkFieldValidator13 = new org.sevensource.magnolia.responsivedam.field.validation.AspectAwareDamLinkFieldValidator(responsiveDamConfiguration0, aspectAwareDamLinkFieldDefinition10, node2BeanProcessor11, "validation.message.required");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(outputFormatMappingList5);
        org.junit.Assert.assertNotNull(outputFormatMappingArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        com.vaadin.server.Sizeable.Unit unit19 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField17.setWidth((float) (byte) -1, unit19);
        com.vaadin.server.ErrorMessage errorMessage21 = aspectAwareDamUploadField17.getErrorMessage();
        com.vaadin.server.Sizeable.Unit unit23 = com.vaadin.server.Sizeable.UNITS_PIXELS;
        aspectAwareDamUploadField17.setHeight(1.0f, unit23);
        // The following exception was thrown during execution in test generation
        try {
            aspectAwareDamUploadField17.attach();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit19.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNull(errorMessage21);
        org.junit.Assert.assertTrue("'" + unit23 + "' != '" + com.vaadin.server.Sizeable.Unit.PIXELS + "'", unit23.equals(com.vaadin.server.Sizeable.Unit.PIXELS));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.lang.String str0 = info.magnolia.ui.form.field.upload.UploadReceiver.INVALID_FILE_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "untitled" + "'", str0, "untitled");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        focusAreaSelectionField4.execute();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition8 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        java.lang.String str9 = aspectAwareDamUploadFieldDefinition8.getFieldType();
        focusAreaSelectionField4.setData((java.lang.Object) aspectAwareDamUploadFieldDefinition8);
        aspectAwareDamUploadFieldDefinition8.setErrorNoteCaption("rd");
        java.lang.String str13 = aspectAwareDamUploadFieldDefinition8.getDeleteCaption();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "field.upload.select.delete" + "'", str13, "field.upload.select.delete");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        java.util.Collection<com.vaadin.server.Extension> extensionCollection4 = focusAreaSelectionField1.getExtensions();
        focusAreaSelectionField1.removeAllValidators();
        boolean boolean6 = focusAreaSelectionField1.isAttached();
        org.junit.Assert.assertNotNull(extensionCollection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        focusAreaSelectionField1.focus();
        java.util.Collection<com.vaadin.v7.data.Validator> validatorCollection4 = focusAreaSelectionField1.getValidators();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(validatorCollection4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.String str0 = org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions.FUNCTIONS_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "responsivedamfn" + "'", str0, "responsivedamfn");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        javax.jcr.Node node4 = null;
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification sizeSpecification7 = null;
        info.magnolia.imaging.OutputFormat outputFormat8 = null;
        org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamRendition responsiveDamRendition9 = new org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamRendition(node4, "hi!", "transientPathProperty", sizeSpecification7, outputFormat8);
        javax.jcr.Node node10 = responsiveDamRendition9.getNode();
        java.lang.String str11 = responsiveDamRendition9.getVariation();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = responsiveDamTemplatingFunctions3.getExternalLink(responsiveDamRendition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "transientPathProperty" + "'", str11, "transientPathProperty");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule1 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule2 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        com.vaadin.server.Sizeable.Unit unit19 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField17.setWidth((float) (byte) -1, unit19);
        com.vaadin.server.ErrorMessage errorMessage21 = aspectAwareDamUploadField17.getErrorMessage();
        com.vaadin.v7.data.Buffered.SourceException sourceException22 = null;
        aspectAwareDamUploadField17.setCurrentBufferedSourceException(sourceException22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = aspectAwareDamUploadField17.isEmpty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit19.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNull(errorMessage21);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        focusAreaSelectionField1.setTabIndex(0);
        focusAreaSelectionField1.scaleToActualSize();
        com.vaadin.v7.data.Property property7 = focusAreaSelectionField1.getPropertyDataSource();
        com.vaadin.server.ErrorHandler errorHandler8 = null;
        focusAreaSelectionField1.setErrorHandler(errorHandler8);
        org.junit.Assert.assertNull(property7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.vaadin.server.Sizeable.Unit unit0 = com.vaadin.server.Sizeable.UNITS_MM;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.vaadin.server.Sizeable.Unit.MM + "'", unit0.equals(com.vaadin.server.Sizeable.Unit.MM));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping outputFormatMapping2 = new org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping("field.upload.note.error", "");
        java.util.List<info.magnolia.imaging.OutputFormat> outputFormatList3 = outputFormatMapping2.getOutputFormats();
        org.junit.Assert.assertNotNull(outputFormatList3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        javax.jcr.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamVariation responsiveDamVariation7 = responsiveDamTemplatingFunctions3.getResponsiveVariation(node4, "untitled", "untitled");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No damVariation with name [untitled] found for variationSet [untitled]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setFieldType("");
        aspectAwareDamUploadFieldDefinition0.setFileDetailNameCaption("field.upload.note.error");
        java.lang.String str5 = aspectAwareDamUploadFieldDefinition0.getSuccessNoteCaption();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "field.upload.note.success" + "'", str5, "field.upload.note.success");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener7 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField8 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener7);
        boolean boolean9 = focusAreaSelectionField8.isConnectorEnabled();
        focusAreaSelectionField4.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField8);
        float float11 = focusAreaSelectionField4.getHeight();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener12 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField13 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener12);
        com.vaadin.v7.data.Buffered.SourceException sourceException14 = null;
        focusAreaSelectionField13.setCurrentBufferedSourceException(sourceException14);
        focusAreaSelectionField4.removeListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField13);
        focusAreaSelectionField4.applyChanges();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setSuccessNoteCaption("transientPathProperty");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getName();
        aspectAwareDamUploadFieldDefinition0.setDropZoneCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition0.setDefaultValue("hi!");
        java.lang.String str8 = aspectAwareDamUploadFieldDefinition0.getDropZoneCaption();
        java.lang.String str9 = aspectAwareDamUploadFieldDefinition0.getFileDetailSizeCaption();
        aspectAwareDamUploadFieldDefinition0.setAllowedMimeTypePattern("field.upload.select.edit");
        java.lang.String str12 = aspectAwareDamUploadFieldDefinition0.getWarningNoteCaption();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "transientPathProperty" + "'", str8, "transientPathProperty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "field.upload.file.detail.size" + "'", str9, "field.upload.file.detail.size");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "field.upload.note.warning" + "'", str12, "field.upload.note.warning");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.configuration.SizeSpecification sizeSpecification1 = org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.of("field.upload.uploaded.file");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown size spec e");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        java.lang.String str6 = focusAreaSelectionField4.getConversionError();
        com.vaadin.event.ShortcutListener shortcutListener7 = null;
        focusAreaSelectionField4.removeShortcutListener(shortcutListener7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Could not convert value to {0}" + "'", str6, "Could not convert value to {0}");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        com.vaadin.server.Sizeable.Unit unit19 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField17.setWidth((float) (byte) -1, unit19);
        boolean boolean21 = aspectAwareDamUploadField17.isModified();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit19.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        java.lang.Class<byte[]> byteArrayClass3 = focusAreaSelectionField1.getType();
        java.lang.String str4 = focusAreaSelectionField1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArrayClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        info.magnolia.objectfactory.ComponentProvider componentProvider0 = null;
        info.magnolia.jcr.node2bean.Node2BeanProcessor node2BeanProcessor1 = null;
        org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameterProviderFactory<org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareCrop> aspectAwareCropAspectAwareParameterProviderFactory2 = new org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameterProviderFactory<org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareCrop>(componentProvider0, node2BeanProcessor1);
        org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareCrop aspectAwareCrop3 = new org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareCrop();
        // The following exception was thrown during execution in test generation
        try {
            info.magnolia.imaging.ParameterProvider<org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameter> aspectAwareParameterParameterProvider4 = aspectAwareCropAspectAwareParameterProviderFactory2.newParameterProviderFor(aspectAwareCrop3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Don't know how to handle request of type org.sevensource.magnolia.responsivedam.imaging.operation.AspectAwareCrop");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet1 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet("");
        focusAreaSet1.setName("transientPathProperty");
        boolean boolean5 = focusAreaSet1.equals((java.lang.Object) 1L);
        java.lang.String str6 = focusAreaSet1.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "transientPathProperty" + "'", str6, "transientPathProperty");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter2 = focusAreaSelectionField1.getConverter();
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration3 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging4 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration5 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions6 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration3, imaging4, serverConfiguration5);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList7 = responsiveDamConfiguration3.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider8 = null;
        info.magnolia.ui.api.context.UiContext uiContext9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition12 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition12.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition12.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator17 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer18 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter19 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField20 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration3, imageProvider8, uiContext9, mediaEditorPresenterFactory10, componentProvider11, aspectAwareDamUploadFieldDefinition12, simpleTranslator17, i18nizer18, actionbarPresenter19);
        com.vaadin.server.Sizeable.Unit unit22 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField20.setWidth((float) (byte) -1, unit22);
        focusAreaSelectionField1.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) aspectAwareDamUploadField20);
        java.util.Spliterator<com.vaadin.ui.Component> componentSpliterator25 = aspectAwareDamUploadField20.spliterator();
        com.vaadin.server.ErrorMessage errorMessage26 = aspectAwareDamUploadField20.getErrorMessage();
        org.junit.Assert.assertNull(byteArrayConverter2);
        org.junit.Assert.assertNull(outputFormatMappingList7);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit22.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNotNull(componentSpliterator25);
        org.junit.Assert.assertNull(errorMessage26);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        com.vaadin.server.Sizeable.Unit unit19 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField17.setWidth((float) (byte) -1, unit19);
        boolean boolean21 = aspectAwareDamUploadField17.isCaptionAsHtml();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit19.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray0 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList1 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, damVariationSetArray0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray3 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList4 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList4, damVariationSetArray3);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas6 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList7 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList4, focusAreas6);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray8 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList9 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList9, damVariationSetArray8);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas11 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList12 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList9, focusAreas11);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList13 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList4, focusAreas11);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList14 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, focusAreas11);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet damVariationSet15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet16 = focusAreas11.getOrCreateFocusAreaSet(damVariationSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(damVariationSetArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(damVariationSetArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(damVariationList7);
        org.junit.Assert.assertNotNull(damVariationSetArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(damVariationList12);
        org.junit.Assert.assertNotNull(damVariationList13);
        org.junit.Assert.assertNotNull(damVariationList14);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = null;
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule1 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> strMap2 = null;
        responsiveDamModule1.setVariations(strMap2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        focusAreaSelectionField4.execute();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener8 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField9 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener8);
        boolean boolean10 = focusAreaSelectionField9.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener11 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField12 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener11);
        focusAreaSelectionField9.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField12);
        focusAreaSelectionField12.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener15 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField16 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener15);
        boolean boolean17 = focusAreaSelectionField16.isConnectorEnabled();
        focusAreaSelectionField12.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField16);
        focusAreaSelectionField4.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField12);
        focusAreaSelectionField12.discard();
        java.lang.String str21 = focusAreaSelectionField12.getStyleName();
        org.jsoup.nodes.Element element22 = null;
        com.vaadin.ui.declarative.DesignContext designContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            focusAreaSelectionField12.writeDesign(element22, designContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = null;
        org.sevensource.magnolia.responsivedam.field.link.AspectAwareDamLinkFieldDefinition aspectAwareDamLinkFieldDefinition1 = null;
        info.magnolia.jcr.node2bean.Node2BeanProcessor node2BeanProcessor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.field.validation.AspectAwareDamLinkFieldValidator aspectAwareDamLinkFieldValidator4 = new org.sevensource.magnolia.responsivedam.field.validation.AspectAwareDamLinkFieldValidator(responsiveDamConfiguration0, aspectAwareDamLinkFieldDefinition1, node2BeanProcessor2, "field.upload.select.delete");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition selectionActionDefinition1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition(damVariation0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation2 = selectionActionDefinition1.getVariation();
        java.lang.String str3 = selectionActionDefinition1.getI18nBasename();
        java.lang.String str4 = selectionActionDefinition1.getErrorMessage();
        selectionActionDefinition1.setIcon("hi!");
        java.lang.String str7 = selectionActionDefinition1.getSuccessMessage();
        org.junit.Assert.assertNull(damVariation2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setSuccessNoteCaption("transientPathProperty");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getName();
        aspectAwareDamUploadFieldDefinition0.setDropZoneCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition0.setDefaultValue("hi!");
        java.lang.String str8 = aspectAwareDamUploadFieldDefinition0.getDropZoneCaption();
        java.lang.String str9 = aspectAwareDamUploadFieldDefinition0.getFileDetailSizeCaption();
        aspectAwareDamUploadFieldDefinition0.setAllowedMimeTypePattern("field.upload.select.edit");
        aspectAwareDamUploadFieldDefinition0.setRequired(false);
        aspectAwareDamUploadFieldDefinition0.setI18n(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "transientPathProperty" + "'", str8, "transientPathProperty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "field.upload.file.detail.size" + "'", str9, "field.upload.file.detail.size");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        com.vaadin.v7.data.Item item6 = null;
        info.magnolia.ui.api.context.UiContext uiContext7 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport8 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator12 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer13 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item6, uiContext7, i18NAuthoringSupport8, imageProvider9, mediaEditorPresenterFactory10, componentProvider11, simpleTranslator12, i18nizer13, actionbarPresenter14);
        java.lang.String str16 = aspectAwareDamUploadFieldDefinition5.getStyleName();
        boolean boolean17 = aspectAwareDamUploadFieldDefinition5.isReadOnly();
        aspectAwareDamUploadFieldDefinition5.setFileDetailSizeCaption("transientPathProperty");
        java.lang.String str20 = aspectAwareDamUploadFieldDefinition5.getEditFileCaption();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "field.upload.select.edit" + "'", str20, "field.upload.select.edit");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        javax.jcr.Node node0 = null;
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification sizeSpecification3 = null;
        info.magnolia.imaging.OutputFormat outputFormat4 = null;
        org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamRendition responsiveDamRendition5 = new org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamRendition(node0, "hi!", "transientPathProperty", sizeSpecification3, outputFormat4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = responsiveDamRendition5.getLink();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.vaadin.v7.data.Item item0 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition1 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition1.setFieldType("");
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport4 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer aspectAwareAssetTransformer5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer(item0, (info.magnolia.dam.app.ui.field.definition.DamUploadFieldDefinition) aspectAwareDamUploadFieldDefinition1, i18NAuthoringSupport4);
        boolean boolean6 = aspectAwareAssetTransformer5.hasI18NSupport();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetUploadReceiver aspectAwareAssetUploadReceiver7 = null;
        com.vaadin.v7.data.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vaadin.v7.data.Item item9 = aspectAwareAssetTransformer5.populateItem(aspectAwareAssetUploadReceiver7, item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setSuccessNoteCaption("transientPathProperty");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getStyleName();
        info.magnolia.ui.form.validator.definition.FieldValidatorDefinition[] fieldValidatorDefinitionArray4 = new info.magnolia.ui.form.validator.definition.FieldValidatorDefinition[] {};
        java.util.ArrayList<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition> fieldValidatorDefinitionList5 = new java.util.ArrayList<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition>) fieldValidatorDefinitionList5, fieldValidatorDefinitionArray4);
        aspectAwareDamUploadFieldDefinition0.setValidators((java.util.List<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition>) fieldValidatorDefinitionList5);
        aspectAwareDamUploadFieldDefinition0.setDefaultValue("responsivedamfn");
        aspectAwareDamUploadFieldDefinition0.setDeleteCaption("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(fieldValidatorDefinitionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener7 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField8 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener7);
        boolean boolean9 = focusAreaSelectionField8.isConnectorEnabled();
        focusAreaSelectionField4.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField8);
        float float11 = focusAreaSelectionField4.getHeight();
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation12 = null;
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea13 = null;
        // The following exception was thrown during execution in test generation
        try {
            focusAreaSelectionField4.setAreaSelectOptions(damVariation12, focusArea13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.server.ServerRpcManager<?> wildcardServerRpcManager3 = focusAreaSelectionField1.getRpcManager("focusAreas");
        boolean boolean4 = focusAreaSelectionField1.isValid();
        java.lang.String str5 = focusAreaSelectionField1.getPrimaryStyleName();
        org.junit.Assert.assertNull(wildcardServerRpcManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule1 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation4 = responsiveDamConfiguration0.getVariation("focusAreas", "transientPathProperty");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition5.setSuccessNoteCaption("transientPathProperty");
        com.vaadin.v7.data.Item item8 = null;
        info.magnolia.ui.api.context.UiContext uiContext9 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport10 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider11 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory12 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider13 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item8, uiContext9, i18NAuthoringSupport10, imageProvider11, mediaEditorPresenterFactory12, componentProvider13, simpleTranslator14, i18nizer15, actionbarPresenter16);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet damVariationSet19 = responsiveDamConfiguration0.getVariationSet("rd");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<info.magnolia.imaging.OutputFormat> outputFormatList21 = responsiveDamConfiguration0.getOutputFormatsByMimeType("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(damVariation4);
        org.junit.Assert.assertNull(damVariationSet19);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        focusAreaSelectionField1.setReadOnly(false);
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener6 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField7 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener6);
        java.util.Locale locale8 = null;
        focusAreaSelectionField7.setLocale(locale8);
        focusAreaSelectionField1.setFocusDelegate((com.vaadin.ui.Component.Focusable) focusAreaSelectionField7);
        // The following exception was thrown during execution in test generation
        try {
            focusAreaSelectionField7.attach();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        java.lang.Object obj18 = aspectAwareDamUploadField17.getConvertedValue();
        java.util.Iterator<com.vaadin.ui.Component> componentItor19 = aspectAwareDamUploadField17.iterator();
        com.vaadin.v7.data.Property.ValueChangeEvent valueChangeEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            aspectAwareDamUploadField17.valueChange(valueChangeEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(componentItor19);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        boolean boolean18 = aspectAwareDamUploadField17.isModified();
        com.vaadin.shared.ui.ContentMode contentMode20 = null;
        aspectAwareDamUploadField17.setDescription("field.upload.select.delete", contentMode20);
        java.lang.String str22 = aspectAwareDamUploadField17.getDebugId();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener23 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField24 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener23);
        boolean boolean25 = focusAreaSelectionField24.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener26 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField27 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener26);
        focusAreaSelectionField24.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField27);
        focusAreaSelectionField27.clear();
        focusAreaSelectionField27.execute();
        aspectAwareDamUploadField17.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField27);
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.vaadin.v7.data.Item item0 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition1 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition1.setFieldType("");
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport4 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer aspectAwareAssetTransformer5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer(item0, (info.magnolia.dam.app.ui.field.definition.DamUploadFieldDefinition) aspectAwareDamUploadFieldDefinition1, i18NAuthoringSupport4);
        java.lang.String str6 = aspectAwareDamUploadFieldDefinition1.getLabel();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        // The following exception was thrown during execution in test generation
        try {
            javax.jcr.Node node2 = org.sevensource.magnolia.responsivedam.ResponsiveDamNodeUtil.getContentNode("validation.message.required", "field.upload.note.success");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: MgnlContext is not set for this thread");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        focusAreaSelectionField1.setReadOnly(false);
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener6 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField7 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener6);
        java.util.Locale locale8 = null;
        focusAreaSelectionField7.setLocale(locale8);
        focusAreaSelectionField1.setFocusDelegate((com.vaadin.ui.Component.Focusable) focusAreaSelectionField7);
        com.vaadin.ui.Component.Listener listener11 = null;
        focusAreaSelectionField1.removeListener(listener11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray0 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList1 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, damVariationSetArray0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray3 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList4 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList4, damVariationSetArray3);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas6 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList7 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList4, focusAreas6);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray8 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList9 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList9, damVariationSetArray8);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas11 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList12 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList9, focusAreas11);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList13 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList4, focusAreas11);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList14 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, focusAreas11);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray15 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList16 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList16, damVariationSetArray15);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas18 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList19 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList16, focusAreas18);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray20 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList21 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList21, damVariationSetArray20);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray23 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList24 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList24, damVariationSetArray23);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas26 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList27 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList24, focusAreas26);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray28 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList29 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList29, damVariationSetArray28);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas31 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList32 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList29, focusAreas31);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList33 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList24, focusAreas31);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList34 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList21, focusAreas31);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet36 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet("");
        focusAreaSet36.setName("transientPathProperty");
        focusAreas31.addFocusAreaSet(focusAreaSet36);
        focusAreas18.addFocusAreaSet(focusAreaSet36);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList41 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, focusAreas18);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet43 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet("");
        focusAreaSet43.setName("transientPathProperty");
        focusAreaSet43.setName("");
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet48 = org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet.of(focusAreaSet43);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas49 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        boolean boolean50 = focusAreaSet48.equals((java.lang.Object) focusAreas49);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet52 = focusAreas49.getFocusAreaSet("rd");
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList53 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, focusAreas49);
        org.junit.Assert.assertNotNull(damVariationSetArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(damVariationSetArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(damVariationList7);
        org.junit.Assert.assertNotNull(damVariationSetArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(damVariationList12);
        org.junit.Assert.assertNotNull(damVariationList13);
        org.junit.Assert.assertNotNull(damVariationList14);
        org.junit.Assert.assertNotNull(damVariationSetArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(damVariationList19);
        org.junit.Assert.assertNotNull(damVariationSetArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(damVariationSetArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(damVariationList27);
        org.junit.Assert.assertNotNull(damVariationSetArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(damVariationList32);
        org.junit.Assert.assertNotNull(damVariationList33);
        org.junit.Assert.assertNotNull(damVariationList34);
        org.junit.Assert.assertNotNull(damVariationList41);
        org.junit.Assert.assertNotNull(focusAreaSet48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(focusAreaSet52);
        org.junit.Assert.assertNotNull(damVariationList53);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener7 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField8 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener7);
        boolean boolean9 = focusAreaSelectionField8.isConnectorEnabled();
        focusAreaSelectionField4.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField8);
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener12 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField13 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener12);
        boolean boolean14 = focusAreaSelectionField13.isConnectorEnabled();
        java.lang.Class<byte[]> byteArrayClass15 = focusAreaSelectionField13.getType();
        com.vaadin.server.Sizeable.Unit unit16 = focusAreaSelectionField13.getWidthUnits();
        focusAreaSelectionField8.setWidth((float) (byte) 0, unit16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArrayClass15);
        org.junit.Assert.assertTrue("'" + unit16 + "' != '" + com.vaadin.server.Sizeable.Unit.PERCENTAGE + "'", unit16.equals(com.vaadin.server.Sizeable.Unit.PERCENTAGE));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setInProgressCaption("");
        java.util.List<java.lang.String> strList3 = aspectAwareDamUploadFieldDefinition0.getVariationSets();
        org.junit.Assert.assertNull(strList3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter2 = focusAreaSelectionField1.getConverter();
        boolean boolean3 = focusAreaSelectionField1.isBuffered();
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration4 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging5 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration6 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions7 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration4, imaging5, serverConfiguration6);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList8 = responsiveDamConfiguration4.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.api.context.UiContext uiContext10 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory11 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider12 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition13 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition13.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition13.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator18 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer19 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter20 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField21 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration4, imageProvider9, uiContext10, mediaEditorPresenterFactory11, componentProvider12, aspectAwareDamUploadFieldDefinition13, simpleTranslator18, i18nizer19, actionbarPresenter20);
        java.lang.Object obj22 = aspectAwareDamUploadField21.getConvertedValue();
        aspectAwareDamUploadField21.setSelectAnotherCaption("field.upload.select.edit");
        focusAreaSelectionField1.removeReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) aspectAwareDamUploadField21);
        org.junit.Assert.assertNull(byteArrayConverter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(outputFormatMappingList8);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.vaadin.v7.data.Item item0 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition1 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition1.setFieldType("");
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport4 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer aspectAwareAssetTransformer5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer(item0, (info.magnolia.dam.app.ui.field.definition.DamUploadFieldDefinition) aspectAwareDamUploadFieldDefinition1, i18NAuthoringSupport4);
        aspectAwareAssetTransformer5.setReadOnly(true);
        aspectAwareAssetTransformer5.setReadOnly(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = aspectAwareAssetTransformer5.isReadOnly();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setSuccessNoteCaption("transientPathProperty");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getInProgressRatioCaption();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "field.upload.uploaded.file" + "'", str3, "field.upload.uploaded.file");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setSuccessNoteCaption("transientPathProperty");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getName();
        aspectAwareDamUploadFieldDefinition0.setDropZoneCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition0.setDefaultValue("hi!");
        java.lang.String str8 = aspectAwareDamUploadFieldDefinition0.getDropZoneCaption();
        java.lang.String str9 = aspectAwareDamUploadFieldDefinition0.getFileDetailSizeCaption();
        aspectAwareDamUploadFieldDefinition0.setAllowedMimeTypePattern("field.upload.select.edit");
        aspectAwareDamUploadFieldDefinition0.setRequired(false);
        java.lang.String str14 = aspectAwareDamUploadFieldDefinition0.getLabel();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "transientPathProperty" + "'", str8, "transientPathProperty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "field.upload.file.detail.size" + "'", str9, "field.upload.file.detail.size");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.server.ServerRpcManager<?> wildcardServerRpcManager3 = focusAreaSelectionField1.getRpcManager("focusAreas");
        com.vaadin.shared.ui.ContentMode contentMode5 = null;
        focusAreaSelectionField1.setDescription("field.upload.file.detail.size", contentMode5);
        org.junit.Assert.assertNull(wildcardServerRpcManager3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter2 = focusAreaSelectionField1.getConverter();
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration3 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging4 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration5 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions6 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration3, imaging4, serverConfiguration5);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList7 = responsiveDamConfiguration3.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider8 = null;
        info.magnolia.ui.api.context.UiContext uiContext9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition12 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition12.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition12.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator17 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer18 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter19 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField20 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration3, imageProvider8, uiContext9, mediaEditorPresenterFactory10, componentProvider11, aspectAwareDamUploadFieldDefinition12, simpleTranslator17, i18nizer18, actionbarPresenter19);
        com.vaadin.server.Sizeable.Unit unit22 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField20.setWidth((float) (byte) -1, unit22);
        focusAreaSelectionField1.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) aspectAwareDamUploadField20);
        java.util.Spliterator<com.vaadin.ui.Component> componentSpliterator25 = aspectAwareDamUploadField20.spliterator();
        aspectAwareDamUploadField20.setInvalidAllowed(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = aspectAwareDamUploadField20.isEmpty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArrayConverter2);
        org.junit.Assert.assertNull(outputFormatMappingList7);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit22.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNotNull(componentSpliterator25);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration1 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule2 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration1);
        java.util.Set<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetSet3 = responsiveDamConfiguration1.getVariationSets();
        info.magnolia.jcr.node2bean.Node2BeanProcessor node2BeanProcessor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameterProvider aspectAwareParameterProvider5 = new org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameterProvider("", responsiveDamConfiguration1, node2BeanProcessor4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Cannot create org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameter due to an empty requestedPath part");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(damVariationSetSet3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray0 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList1 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, damVariationSetArray0);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas3 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList4 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, focusAreas3);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray5 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList6 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList6, damVariationSetArray5);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas8 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList9 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList6, focusAreas8);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList10 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, focusAreas8);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet12 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet("");
        focusAreas8.addFocusAreaSet(focusAreaSet12);
        java.lang.String str14 = focusAreaSet12.getName();
        org.junit.Assert.assertNotNull(damVariationSetArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(damVariationList4);
        org.junit.Assert.assertNotNull(damVariationSetArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(damVariationList9);
        org.junit.Assert.assertNotNull(damVariationList10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        java.lang.String str6 = focusAreaSelectionField4.getConversionError();
        com.vaadin.server.ErrorMessage errorMessage7 = null;
        focusAreaSelectionField4.setComponentError(errorMessage7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Could not convert value to {0}" + "'", str6, "Could not convert value to {0}");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition selectionActionDefinition1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition(damVariation0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation2 = selectionActionDefinition1.getVariation();
        java.lang.String str3 = selectionActionDefinition1.getI18nBasename();
        java.lang.String str4 = selectionActionDefinition1.getErrorMessage();
        java.lang.String str5 = selectionActionDefinition1.getLabel();
        selectionActionDefinition1.setSuccessMessage("rd");
        selectionActionDefinition1.setName("field.upload.note.success");
        org.junit.Assert.assertNull(damVariation2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setDescription("focusAreas");
        aspectAwareDamUploadFieldDefinition0.setSelectNewCaption("validation.message.required");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener18 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField19 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener18);
        com.vaadin.server.ServerRpcManager<?> wildcardServerRpcManager21 = focusAreaSelectionField19.getRpcManager("focusAreas");
        aspectAwareDamUploadField17.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField19);
        com.vaadin.v7.data.Property.ValueChangeEvent valueChangeEvent23 = null;
        // The following exception was thrown during execution in test generation
        try {
            aspectAwareDamUploadField17.valueChange(valueChangeEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(wildcardServerRpcManager21);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener18 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField19 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener18);
        com.vaadin.server.ServerRpcManager<?> wildcardServerRpcManager21 = focusAreaSelectionField19.getRpcManager("focusAreas");
        aspectAwareDamUploadField17.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField19);
        aspectAwareDamUploadField17.setWarningNoteCaption("field.upload.select.delete");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = aspectAwareDamUploadField17.isEmpty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(wildcardServerRpcManager21);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        java.util.Locale locale2 = null;
        focusAreaSelectionField1.setLocale(locale2);
        focusAreaSelectionField1.execute();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea5 = new org.sevensource.magnolia.responsivedam.focusarea.FocusArea("field.upload.file.detail.size", (java.lang.Integer) (-1), (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener7 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField8 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener7);
        boolean boolean9 = focusAreaSelectionField8.isConnectorEnabled();
        focusAreaSelectionField4.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField8);
        focusAreaSelectionField4.setRequiredError("untitled");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.vaadin.server.Sizeable.Unit unit0 = com.vaadin.server.Sizeable.UNITS_EX;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.vaadin.server.Sizeable.Unit.EX + "'", unit0.equals(com.vaadin.server.Sizeable.Unit.EX));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        java.lang.Class<byte[]> byteArrayClass3 = focusAreaSelectionField1.getType();
        com.vaadin.server.Sizeable.Unit unit4 = focusAreaSelectionField1.getWidthUnits();
        focusAreaSelectionField1.validate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArrayClass3);
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + com.vaadin.server.Sizeable.Unit.PERCENTAGE + "'", unit4.equals(com.vaadin.server.Sizeable.Unit.PERCENTAGE));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter2 = focusAreaSelectionField1.getConverter();
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration3 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging4 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration5 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions6 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration3, imaging4, serverConfiguration5);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList7 = responsiveDamConfiguration3.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider8 = null;
        info.magnolia.ui.api.context.UiContext uiContext9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition12 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition12.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition12.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator17 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer18 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter19 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField20 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration3, imageProvider8, uiContext9, mediaEditorPresenterFactory10, componentProvider11, aspectAwareDamUploadFieldDefinition12, simpleTranslator17, i18nizer18, actionbarPresenter19);
        com.vaadin.server.Sizeable.Unit unit22 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField20.setWidth((float) (byte) -1, unit22);
        focusAreaSelectionField1.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) aspectAwareDamUploadField20);
        com.vaadin.server.ErrorMessage errorMessage25 = focusAreaSelectionField1.getErrorMessage();
        com.vaadin.v7.data.Property.ValueChangeEvent valueChangeEvent26 = null;
        // The following exception was thrown during execution in test generation
        try {
            focusAreaSelectionField1.valueChange(valueChangeEvent26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArrayConverter2);
        org.junit.Assert.assertNull(outputFormatMappingList7);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit22.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNull(errorMessage25);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setSuccessNoteCaption("transientPathProperty");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getName();
        aspectAwareDamUploadFieldDefinition0.setDropZoneCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition0.setDefaultValue("hi!");
        boolean boolean8 = aspectAwareDamUploadFieldDefinition0.isEditFileFormat();
        info.magnolia.ui.form.validator.definition.FieldValidatorDefinition[] fieldValidatorDefinitionArray9 = new info.magnolia.ui.form.validator.definition.FieldValidatorDefinition[] {};
        java.util.ArrayList<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition> fieldValidatorDefinitionList10 = new java.util.ArrayList<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition>) fieldValidatorDefinitionList10, fieldValidatorDefinitionArray9);
        aspectAwareDamUploadFieldDefinition0.setValidators((java.util.List<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition>) fieldValidatorDefinitionList10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fieldValidatorDefinitionArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        com.vaadin.v7.data.Item item6 = null;
        info.magnolia.ui.api.context.UiContext uiContext7 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport8 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator12 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer13 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item6, uiContext7, i18NAuthoringSupport8, imageProvider9, mediaEditorPresenterFactory10, componentProvider11, simpleTranslator12, i18nizer13, actionbarPresenter14);
        java.lang.Class<?> wildcardClass16 = aspectAwareDamUploadFieldDefinition5.getConverterClass();
        aspectAwareDamUploadFieldDefinition5.setFileDetailFormatCaption("");
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(wildcardClass16);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        boolean boolean6 = focusAreaSelectionField4.isConnectorEnabled();
        focusAreaSelectionField4.setDebugId("rd");
        com.vaadin.server.ErrorHandler errorHandler9 = null;
        focusAreaSelectionField4.setErrorHandler(errorHandler9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration4 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging5 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration6 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions7 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration4, imaging5, serverConfiguration6);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList8 = responsiveDamConfiguration4.getOutputFormatMappings();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList9 = responsiveDamConfiguration4.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping[] outputFormatMappingArray10 = new org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList11 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping>) outputFormatMappingList11, outputFormatMappingArray10);
        responsiveDamConfiguration4.setOutputFormatMappings((java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping>) outputFormatMappingList11);
        responsiveDamConfiguration0.setOutputFormatMappings((java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping>) outputFormatMappingList11);
        org.junit.Assert.assertNull(outputFormatMappingList8);
        org.junit.Assert.assertNull(outputFormatMappingList9);
        org.junit.Assert.assertNotNull(outputFormatMappingArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        focusAreaSelectionField1.setTabIndex(0);
        boolean boolean6 = focusAreaSelectionField1.isVisible();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setSelectAnotherCaption("field.upload.select.delete");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getInProgressRatioCaption();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "field.upload.uploaded.file" + "'", str3, "field.upload.uploaded.file");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.vaadin.v7.data.Item item0 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition1 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition1.setFieldType("");
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport4 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer aspectAwareAssetTransformer5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer(item0, (info.magnolia.dam.app.ui.field.definition.DamUploadFieldDefinition) aspectAwareDamUploadFieldDefinition1, i18NAuthoringSupport4);
        aspectAwareDamUploadFieldDefinition1.setDefaultValue("responsivedamfn");
        java.lang.String str8 = aspectAwareDamUploadFieldDefinition1.getErrorNoteCaption();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "field.upload.note.error" + "'", str8, "field.upload.note.error");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener7 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField8 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener7);
        boolean boolean9 = focusAreaSelectionField8.isConnectorEnabled();
        focusAreaSelectionField4.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField8);
        float float11 = focusAreaSelectionField4.getHeight();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener12 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField13 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener12);
        com.vaadin.v7.data.Buffered.SourceException sourceException14 = null;
        focusAreaSelectionField13.setCurrentBufferedSourceException(sourceException14);
        focusAreaSelectionField4.removeListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField13);
        focusAreaSelectionField4.clear();
        com.vaadin.v7.data.Property.ValueChangeEvent valueChangeEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            focusAreaSelectionField4.valueChange(valueChangeEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        com.vaadin.server.Sizeable.Unit unit19 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField17.setWidth((float) (byte) -1, unit19);
        java.lang.Class class21 = aspectAwareDamUploadField17.getType();
        // The following exception was thrown during execution in test generation
        try {
            aspectAwareDamUploadField17.attach();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit19.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNotNull(class21);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener18 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField19 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener18);
        com.vaadin.server.ServerRpcManager<?> wildcardServerRpcManager21 = focusAreaSelectionField19.getRpcManager("focusAreas");
        aspectAwareDamUploadField17.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField19);
        aspectAwareDamUploadField17.setWarningNoteCaption("field.upload.select.delete");
        com.vaadin.v7.data.util.converter.Converter<org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetUploadReceiver, java.lang.Object> aspectAwareAssetUploadReceiverConverter25 = aspectAwareDamUploadField17.getConverter();
        int int26 = aspectAwareDamUploadField17.getTabIndex();
        java.lang.String str27 = aspectAwareDamUploadField17.getRequiredError();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(wildcardServerRpcManager21);
        org.junit.Assert.assertNull(aspectAwareAssetUploadReceiverConverter25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        focusAreaSelectionField1.setRequiredError("validation.message.required");
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet7 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet("");
        focusAreaSet7.setName("transientPathProperty");
        boolean boolean11 = focusAreaSet7.equals((java.lang.Object) 1L);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet12 = org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet.of(focusAreaSet7);
        // The following exception was thrown during execution in test generation
        try {
            focusAreaSelectionField1.setConvertedValue((java.lang.Object) focusAreaSet7);
            org.junit.Assert.fail("Expected exception of type com.vaadin.v7.data.util.converter.Converter.ConversionException; message: Unable to convert value of type org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet to presentation type class [B. No converter is set and the types are not compatible.");
        } catch (com.vaadin.v7.data.util.converter.Converter.ConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(focusAreaSet12);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        com.vaadin.server.Sizeable.Unit unit19 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField17.setWidth((float) (byte) -1, unit19);
        com.vaadin.server.ErrorMessage errorMessage21 = aspectAwareDamUploadField17.getErrorMessage();
        aspectAwareDamUploadField17.setDeteteCaption("");
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit19.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNull(errorMessage21);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        java.lang.String str6 = focusAreaSelectionField4.getConversionError();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener7 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField8 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener7);
        boolean boolean9 = focusAreaSelectionField8.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener10 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField11 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener10);
        focusAreaSelectionField8.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField11);
        focusAreaSelectionField11.clear();
        focusAreaSelectionField11.execute();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener15 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField16 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener15);
        boolean boolean17 = focusAreaSelectionField16.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener18 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField19 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener18);
        focusAreaSelectionField16.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField19);
        focusAreaSelectionField19.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener22 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField23 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener22);
        boolean boolean24 = focusAreaSelectionField23.isConnectorEnabled();
        focusAreaSelectionField19.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField23);
        focusAreaSelectionField11.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField19);
        java.lang.String[] strArray33 = new java.lang.String[] { "field.upload.select.another", "field.upload.note.warning", "responsivedamfn", "field.upload.select.edit", "", "field.upload.interupted.user" };
        focusAreaSelectionField11.addStyleNames(strArray33);
        focusAreaSelectionField4.removeStyleNames(strArray33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Could not convert value to {0}" + "'", str6, "Could not convert value to {0}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        boolean boolean18 = aspectAwareDamUploadField17.isModified();
        com.vaadin.shared.ui.ContentMode contentMode20 = null;
        aspectAwareDamUploadField17.setDescription("field.upload.select.delete", contentMode20);
        aspectAwareDamUploadField17.setTabIndex((int) (short) -1);
        aspectAwareDamUploadField17.beforeClientResponse(true);
        java.lang.String str26 = aspectAwareDamUploadField17.getDescription();
        int int27 = aspectAwareDamUploadField17.getTabIndex();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "field.upload.select.delete" + "'", str26, "field.upload.select.delete");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule1 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation4 = responsiveDamConfiguration0.getVariation("focusAreas", "transientPathProperty");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition5.setSuccessNoteCaption("transientPathProperty");
        com.vaadin.v7.data.Item item8 = null;
        info.magnolia.ui.api.context.UiContext uiContext9 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport10 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider11 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory12 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider13 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item8, uiContext9, i18NAuthoringSupport10, imageProvider11, mediaEditorPresenterFactory12, componentProvider13, simpleTranslator14, i18nizer15, actionbarPresenter16);
        java.lang.String str18 = aspectAwareDamUploadFieldDefinition5.getLabel();
        org.junit.Assert.assertNull(damVariation4);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule1 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation4 = responsiveDamConfiguration0.getVariation("focusAreas", "transientPathProperty");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition5.setSuccessNoteCaption("transientPathProperty");
        com.vaadin.v7.data.Item item8 = null;
        info.magnolia.ui.api.context.UiContext uiContext9 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport10 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider11 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory12 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider13 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item8, uiContext9, i18NAuthoringSupport10, imageProvider11, mediaEditorPresenterFactory12, componentProvider13, simpleTranslator14, i18nizer15, actionbarPresenter16);
        aspectAwareDamUploadFieldDefinition5.setI18n(true);
        org.junit.Assert.assertNull(damVariation4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener7 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField8 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener7);
        boolean boolean9 = focusAreaSelectionField8.isConnectorEnabled();
        focusAreaSelectionField4.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField8);
        float float11 = focusAreaSelectionField4.getHeight();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener12 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField13 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener12);
        com.vaadin.v7.data.Buffered.SourceException sourceException14 = null;
        focusAreaSelectionField13.setCurrentBufferedSourceException(sourceException14);
        focusAreaSelectionField4.removeListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField13);
        focusAreaSelectionField13.revertChanges();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener18 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField19 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener18);
        com.vaadin.v7.data.Buffered.SourceException sourceException20 = null;
        focusAreaSelectionField19.setCurrentBufferedSourceException(sourceException20);
        focusAreaSelectionField19.setReadOnly(false);
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener24 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField25 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener24);
        java.util.Locale locale26 = null;
        focusAreaSelectionField25.setLocale(locale26);
        focusAreaSelectionField19.setFocusDelegate((com.vaadin.ui.Component.Focusable) focusAreaSelectionField25);
        focusAreaSelectionField19.setRequiredError("field.upload.select.edit");
        focusAreaSelectionField13.removeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        focusAreaSelectionField1.setTabIndex(0);
        focusAreaSelectionField1.scaleToActualSize();
        com.vaadin.v7.data.Property property7 = focusAreaSelectionField1.getPropertyDataSource();
        java.lang.String str8 = focusAreaSelectionField1.getConversionError();
        org.junit.Assert.assertNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Could not convert value to {0}" + "'", str8, "Could not convert value to {0}");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        com.vaadin.v7.data.Item item6 = null;
        info.magnolia.ui.api.context.UiContext uiContext7 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport8 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator12 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer13 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item6, uiContext7, i18NAuthoringSupport8, imageProvider9, mediaEditorPresenterFactory10, componentProvider11, simpleTranslator12, i18nizer13, actionbarPresenter14);
        java.lang.String str16 = aspectAwareDamUploadFieldDefinition5.getStyleName();
        java.lang.String str17 = aspectAwareDamUploadFieldDefinition5.getInProgressRatioCaption();
        aspectAwareDamUploadFieldDefinition5.setEditFileCaption("untitled");
        java.lang.String str20 = aspectAwareDamUploadFieldDefinition5.getUserInterruption();
        java.lang.String str21 = aspectAwareDamUploadFieldDefinition5.getDeleteCaption();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "field.upload.uploaded.file" + "'", str17, "field.upload.uploaded.file");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "field.upload.interupted.user" + "'", str20, "field.upload.interupted.user");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "field.upload.select.delete" + "'", str21, "field.upload.select.delete");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        javax.jcr.Node node0 = null;
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension sizeDimension4 = org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH;
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification sizeSpecification5 = new org.sevensource.magnolia.responsivedam.configuration.SizeSpecification((java.lang.Integer) 100, sizeDimension4);
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration6 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging7 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration8 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions9 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration6, imaging7, serverConfiguration8);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList10 = responsiveDamConfiguration6.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition11 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        com.vaadin.v7.data.Item item12 = null;
        info.magnolia.ui.api.context.UiContext uiContext13 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport14 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider15 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory16 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider17 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator18 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer19 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter20 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory21 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration6, aspectAwareDamUploadFieldDefinition11, item12, uiContext13, i18NAuthoringSupport14, imageProvider15, mediaEditorPresenterFactory16, componentProvider17, simpleTranslator18, i18nizer19, actionbarPresenter20);
        java.lang.String str22 = aspectAwareDamUploadFieldDefinition11.getStyleName();
        boolean boolean23 = aspectAwareDamUploadFieldDefinition11.isReadOnly();
        boolean boolean24 = sizeSpecification5.equals((java.lang.Object) aspectAwareDamUploadFieldDefinition11);
        info.magnolia.imaging.OutputFormat outputFormat25 = null;
        org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamRendition responsiveDamRendition26 = new org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamRendition(node0, "field.upload.uploaded.file", "field.upload.note.warning", sizeSpecification5, outputFormat25);
        org.junit.Assert.assertTrue("'" + sizeDimension4 + "' != '" + org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH + "'", sizeDimension4.equals(org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH));
        org.junit.Assert.assertNull(outputFormatMappingList10);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setFieldType("");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getType();
        java.lang.Class<? extends info.magnolia.ui.form.field.transformer.Transformer<?>> wildcardClass4 = aspectAwareDamUploadFieldDefinition0.getTransformerClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        boolean boolean18 = aspectAwareDamUploadField17.isModified();
        com.vaadin.shared.ui.ContentMode contentMode20 = null;
        aspectAwareDamUploadField17.setDescription("field.upload.select.delete", contentMode20);
        aspectAwareDamUploadField17.setTabIndex((int) (short) -1);
        aspectAwareDamUploadField17.beforeClientResponse(true);
        java.lang.String str26 = aspectAwareDamUploadField17.getDescription();
        aspectAwareDamUploadField17.clear();
        boolean boolean28 = aspectAwareDamUploadField17.isInvalidCommitted();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "field.upload.select.delete" + "'", str26, "field.upload.select.delete");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setSuccessNoteCaption("transientPathProperty");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getStyleName();
        info.magnolia.ui.form.validator.definition.FieldValidatorDefinition[] fieldValidatorDefinitionArray4 = new info.magnolia.ui.form.validator.definition.FieldValidatorDefinition[] {};
        java.util.ArrayList<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition> fieldValidatorDefinitionList5 = new java.util.ArrayList<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition>) fieldValidatorDefinitionList5, fieldValidatorDefinitionArray4);
        aspectAwareDamUploadFieldDefinition0.setValidators((java.util.List<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition>) fieldValidatorDefinitionList5);
        aspectAwareDamUploadFieldDefinition0.setFieldType("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(fieldValidatorDefinitionArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition selectionActionDefinition1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition(damVariation0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation2 = selectionActionDefinition1.getVariation();
        java.lang.String str3 = selectionActionDefinition1.getI18nBasename();
        java.lang.String str4 = selectionActionDefinition1.getI18nBasename();
        selectionActionDefinition1.setDescription("field.upload.select.edit");
        org.junit.Assert.assertNull(damVariation2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray0 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList1 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, damVariationSetArray0);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas3 = null;
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList4 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, focusAreas3);
        java.awt.Dimension dimension5 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getRequiredImageDimensions((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1);
        java.awt.Dimension dimension6 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getRequiredImageDimensions((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1);
        org.junit.Assert.assertNotNull(damVariationSetArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(damVariationList4);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNotNull(dimension6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule1 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
        info.magnolia.module.ModuleLifecycleContext moduleLifecycleContext2 = null;
        responsiveDamModule1.stop(moduleLifecycleContext2);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> strMap4 = responsiveDamModule1.getOutputFormatMappings();
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        boolean boolean18 = aspectAwareDamUploadField17.isModified();
        com.vaadin.shared.ui.ContentMode contentMode20 = null;
        aspectAwareDamUploadField17.setDescription("field.upload.select.delete", contentMode20);
        aspectAwareDamUploadField17.setTabIndex((int) (short) -1);
        aspectAwareDamUploadField17.beforeClientResponse(true);
        java.lang.String str26 = aspectAwareDamUploadField17.getDescription();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener27 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField28 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener27);
        boolean boolean29 = focusAreaSelectionField28.isConnectorEnabled();
        focusAreaSelectionField28.focus();
        aspectAwareDamUploadField17.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField28);
        boolean boolean32 = aspectAwareDamUploadField17.isValidationVisible();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "field.upload.select.delete" + "'", str26, "field.upload.select.delete");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.sevensource.magnolia.responsivedam.field.AspectAwareUiUtils.InfoLabelStyle infoLabelStyle0 = org.sevensource.magnolia.responsivedam.field.AspectAwareUiUtils.InfoLabelStyle.WARN;
        org.junit.Assert.assertTrue("'" + infoLabelStyle0 + "' != '" + org.sevensource.magnolia.responsivedam.field.AspectAwareUiUtils.InfoLabelStyle.WARN + "'", infoLabelStyle0.equals(org.sevensource.magnolia.responsivedam.field.AspectAwareUiUtils.InfoLabelStyle.WARN));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener7 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField8 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener7);
        boolean boolean9 = focusAreaSelectionField8.isConnectorEnabled();
        focusAreaSelectionField4.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField8);
        float float11 = focusAreaSelectionField4.getHeight();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener12 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField13 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener12);
        com.vaadin.v7.data.Buffered.SourceException sourceException14 = null;
        focusAreaSelectionField13.setCurrentBufferedSourceException(sourceException14);
        focusAreaSelectionField4.removeListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField13);
        focusAreaSelectionField4.beforeClientResponse(false);
        focusAreaSelectionField4.markAsDirty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension sizeDimension0 = org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH;
        java.lang.String str1 = sizeDimension0.getId();
        org.junit.Assert.assertTrue("'" + sizeDimension0 + "' != '" + org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH + "'", sizeDimension0.equals(org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "w" + "'", str1, "w");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setFieldType("");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getErrorNoteCaption();
        aspectAwareDamUploadFieldDefinition0.setSuccessNoteCaption("rd");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition6 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition6.setSuccessNoteCaption("transientPathProperty");
        java.lang.String str9 = aspectAwareDamUploadFieldDefinition6.getStyleName();
        info.magnolia.ui.form.validator.definition.FieldValidatorDefinition[] fieldValidatorDefinitionArray10 = new info.magnolia.ui.form.validator.definition.FieldValidatorDefinition[] {};
        java.util.ArrayList<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition> fieldValidatorDefinitionList11 = new java.util.ArrayList<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition>) fieldValidatorDefinitionList11, fieldValidatorDefinitionArray10);
        aspectAwareDamUploadFieldDefinition6.setValidators((java.util.List<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition>) fieldValidatorDefinitionList11);
        aspectAwareDamUploadFieldDefinition0.setValidators((java.util.List<info.magnolia.ui.form.validator.definition.FieldValidatorDefinition>) fieldValidatorDefinitionList11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "field.upload.note.error" + "'", str3, "field.upload.note.error");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(fieldValidatorDefinitionArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        java.util.Collection<com.vaadin.server.Extension> extensionCollection4 = focusAreaSelectionField1.getExtensions();
        boolean boolean5 = focusAreaSelectionField1.isBuffered();
        org.junit.Assert.assertNotNull(extensionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        com.vaadin.server.Sizeable.Unit unit19 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField17.setWidth((float) (byte) -1, unit19);
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration21 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule22 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration21);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation25 = responsiveDamConfiguration21.getVariation("focusAreas", "transientPathProperty");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition26 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition26.setSuccessNoteCaption("transientPathProperty");
        com.vaadin.v7.data.Item item29 = null;
        info.magnolia.ui.api.context.UiContext uiContext30 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport31 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider32 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory33 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider34 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator35 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer36 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter37 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory38 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration21, aspectAwareDamUploadFieldDefinition26, item29, uiContext30, i18NAuthoringSupport31, imageProvider32, mediaEditorPresenterFactory33, componentProvider34, simpleTranslator35, i18nizer36, actionbarPresenter37);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet damVariationSet40 = responsiveDamConfiguration21.getVariationSet("rd");
        aspectAwareDamUploadField17.setData((java.lang.Object) damVariationSet40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = aspectAwareDamUploadField17.getConnectorId();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Component must be attached to a session when getConnectorId() is called for the first time");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit19.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNull(damVariation25);
        org.junit.Assert.assertNull(damVariationSet40);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        java.lang.Object obj18 = aspectAwareDamUploadField17.getConvertedValue();
        java.util.Iterator<com.vaadin.ui.Component> componentItor19 = aspectAwareDamUploadField17.iterator();
        aspectAwareDamUploadField17.validate();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(componentItor19);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener18 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField19 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener18);
        com.vaadin.server.ServerRpcManager<?> wildcardServerRpcManager21 = focusAreaSelectionField19.getRpcManager("focusAreas");
        aspectAwareDamUploadField17.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField19);
        aspectAwareDamUploadField17.setWarningNoteCaption("field.upload.select.delete");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener25 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField26 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener25);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter27 = focusAreaSelectionField26.getConverter();
        boolean boolean28 = focusAreaSelectionField26.isBuffered();
        aspectAwareDamUploadField17.removeReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField26);
        aspectAwareDamUploadField17.focus();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(wildcardServerRpcManager21);
        org.junit.Assert.assertNull(byteArrayConverter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule1 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation4 = responsiveDamConfiguration0.getVariation("focusAreas", "transientPathProperty");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition5.setSuccessNoteCaption("transientPathProperty");
        com.vaadin.v7.data.Item item8 = null;
        info.magnolia.ui.api.context.UiContext uiContext9 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport10 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider11 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory12 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider13 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item8, uiContext9, i18NAuthoringSupport10, imageProvider11, mediaEditorPresenterFactory12, componentProvider13, simpleTranslator14, i18nizer15, actionbarPresenter16);
        java.lang.String str18 = aspectAwareDamUploadFieldDefinition5.getRequiredErrorMessage();
        aspectAwareDamUploadFieldDefinition5.setAllowedMimeTypePattern("rd");
        org.junit.Assert.assertNull(damVariation4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "validation.message.required" + "'", str18, "validation.message.required");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition selectionActionDefinition1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition(damVariation0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation2 = selectionActionDefinition1.getVariation();
        java.lang.String str3 = selectionActionDefinition1.getI18nBasename();
        selectionActionDefinition1.setIcon("");
        java.lang.String str6 = selectionActionDefinition1.getI18nBasename();
        java.lang.String str7 = selectionActionDefinition1.getIcon();
        selectionActionDefinition1.setLabel("responsivedamfn");
        org.junit.Assert.assertNull(damVariation2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        java.lang.Object obj18 = aspectAwareDamUploadField17.getConvertedValue();
        aspectAwareDamUploadField17.setSelectAnotherCaption("field.upload.select.edit");
        aspectAwareDamUploadField17.setImmediate(false);
        java.util.Collection<com.vaadin.v7.data.Validator> validatorCollection23 = aspectAwareDamUploadField17.getValidators();
        // The following exception was thrown during execution in test generation
        try {
            aspectAwareDamUploadField17.detach();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(validatorCollection23);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setSuccessNoteCaption("transientPathProperty");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getStyleName();
        aspectAwareDamUploadFieldDefinition0.setMaxUploadSize((long) ' ');
        aspectAwareDamUploadFieldDefinition0.setFileDetailFormatCaption("field.upload.file.detail.size");
        java.util.List<java.lang.String> strList8 = aspectAwareDamUploadFieldDefinition0.getVariationSets();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setFieldType("");
        aspectAwareDamUploadFieldDefinition0.setFileDetailSizeCaption("Could not convert value to {0}");
        aspectAwareDamUploadFieldDefinition0.setMaxUploadSize((long) (short) 10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea5 = new org.sevensource.magnolia.responsivedam.focusarea.FocusArea("", (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
        boolean boolean6 = focusArea5.isValid();
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea7 = org.sevensource.magnolia.responsivedam.focusarea.FocusArea.of(focusArea5);
        java.lang.String str8 = focusArea7.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(focusArea7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setSuccessNoteCaption("transientPathProperty");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getName();
        aspectAwareDamUploadFieldDefinition0.setDropZoneCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition0.setDefaultValue("hi!");
        java.lang.String str8 = aspectAwareDamUploadFieldDefinition0.getDropZoneCaption();
        java.lang.Class<?> wildcardClass9 = aspectAwareDamUploadFieldDefinition0.getConverterClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "transientPathProperty" + "'", str8, "transientPathProperty");
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.setStyleName("rd");
        focusAreaSelectionField4.removeAllValidators();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        focusAreaSelectionField1.setTabIndex(0);
        focusAreaSelectionField1.scaleToActualSize();
        com.vaadin.v7.data.Property property7 = focusAreaSelectionField1.getPropertyDataSource();
        focusAreaSelectionField1.setInvalidAllowed(true);
        org.junit.Assert.assertNull(property7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray0 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList1 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, damVariationSetArray0);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas3 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList4 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, focusAreas3);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas5 = null;
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList6 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, focusAreas5);
        org.junit.Assert.assertNotNull(damVariationSetArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(damVariationList4);
        org.junit.Assert.assertNotNull(damVariationList6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.vaadin.v7.data.Item item0 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition1 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition1.setFieldType("");
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport4 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer aspectAwareAssetTransformer5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer(item0, (info.magnolia.dam.app.ui.field.definition.DamUploadFieldDefinition) aspectAwareDamUploadFieldDefinition1, i18NAuthoringSupport4);
        boolean boolean6 = aspectAwareAssetTransformer5.hasI18NSupport();
        com.vaadin.v7.data.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetUploadReceiver aspectAwareAssetUploadReceiver8 = aspectAwareAssetTransformer5.createPropertyFromItem(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        com.vaadin.v7.data.Item item6 = null;
        info.magnolia.ui.api.context.UiContext uiContext7 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport8 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator12 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer13 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item6, uiContext7, i18NAuthoringSupport8, imageProvider9, mediaEditorPresenterFactory10, componentProvider11, simpleTranslator12, i18nizer13, actionbarPresenter14);
        aspectAwareDamUploadFieldDefinition5.setSelectAnotherCaption("field.upload.note.error");
        boolean boolean18 = aspectAwareDamUploadFieldDefinition5.isUseExistingFocusAreas();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.server.ServerRpcManager<?> wildcardServerRpcManager3 = focusAreaSelectionField1.getRpcManager("focusAreas");
        boolean boolean4 = focusAreaSelectionField1.isValid();
        com.vaadin.event.ShortcutListener shortcutListener5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vaadin.shared.Registration registration6 = focusAreaSelectionField1.addShortcutListener(shortcutListener5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Listener must not be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardServerRpcManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        boolean boolean18 = aspectAwareDamUploadField17.isModified();
        boolean boolean19 = aspectAwareDamUploadField17.isInvalidCommitted();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        focusAreaSelectionField4.execute();
        boolean boolean8 = focusAreaSelectionField4.isBuffered();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea5 = new org.sevensource.magnolia.responsivedam.focusarea.FocusArea("", (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
        focusArea5.setX((java.lang.Integer) (-1));
        java.lang.String str8 = focusArea5.getName();
        boolean boolean9 = focusArea5.isValid();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.lang.String str0 = info.magnolia.ui.form.field.factory.LinkFieldFactory.SELF_APP_REFERENCE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "self" + "'", str0, "self");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.server.ServerRpcManager<?> wildcardServerRpcManager3 = focusAreaSelectionField1.getRpcManager("focusAreas");
        boolean boolean4 = focusAreaSelectionField1.isValid();
        boolean boolean5 = focusAreaSelectionField1.isModified();
        org.junit.Assert.assertNull(wildcardServerRpcManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.vaadin.v7.data.Item item0 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition1 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition1.setFieldType("");
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport4 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer aspectAwareAssetTransformer5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer(item0, (info.magnolia.dam.app.ui.field.definition.DamUploadFieldDefinition) aspectAwareDamUploadFieldDefinition1, i18NAuthoringSupport4);
        java.lang.String str6 = aspectAwareAssetTransformer5.getBasePropertyName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "binaryNodeName" + "'", str6, "binaryNodeName");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter2 = focusAreaSelectionField1.getConverter();
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration3 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging4 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration5 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions6 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration3, imaging4, serverConfiguration5);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList7 = responsiveDamConfiguration3.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider8 = null;
        info.magnolia.ui.api.context.UiContext uiContext9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition12 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition12.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition12.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator17 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer18 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter19 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField20 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration3, imageProvider8, uiContext9, mediaEditorPresenterFactory10, componentProvider11, aspectAwareDamUploadFieldDefinition12, simpleTranslator17, i18nizer18, actionbarPresenter19);
        com.vaadin.server.Sizeable.Unit unit22 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField20.setWidth((float) (byte) -1, unit22);
        focusAreaSelectionField1.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) aspectAwareDamUploadField20);
        java.util.Spliterator<com.vaadin.ui.Component> componentSpliterator25 = aspectAwareDamUploadField20.spliterator();
        aspectAwareDamUploadField20.setInvalidAllowed(false);
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener28 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField29 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener28);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter30 = focusAreaSelectionField29.getConverter();
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration31 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging32 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration33 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions34 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration31, imaging32, serverConfiguration33);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList35 = responsiveDamConfiguration31.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider36 = null;
        info.magnolia.ui.api.context.UiContext uiContext37 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory38 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider39 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition40 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition40.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition40.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator45 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer46 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter47 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField48 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration31, imageProvider36, uiContext37, mediaEditorPresenterFactory38, componentProvider39, aspectAwareDamUploadFieldDefinition40, simpleTranslator45, i18nizer46, actionbarPresenter47);
        com.vaadin.server.Sizeable.Unit unit50 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField48.setWidth((float) (byte) -1, unit50);
        focusAreaSelectionField29.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) aspectAwareDamUploadField48);
        java.util.Spliterator<com.vaadin.ui.Component> componentSpliterator53 = aspectAwareDamUploadField48.spliterator();
        aspectAwareDamUploadField48.setInvalidAllowed(true);
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener56 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField57 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener56);
        boolean boolean58 = focusAreaSelectionField57.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener59 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField60 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener59);
        focusAreaSelectionField57.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField60);
        boolean boolean62 = focusAreaSelectionField57.isBuffered();
        aspectAwareDamUploadField48.setFocusDelegate((com.vaadin.ui.Component.Focusable) focusAreaSelectionField57);
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener64 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField65 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener64);
        boolean boolean66 = focusAreaSelectionField65.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener67 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField68 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener67);
        focusAreaSelectionField65.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField68);
        focusAreaSelectionField68.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener71 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField72 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener71);
        boolean boolean73 = focusAreaSelectionField72.isConnectorEnabled();
        focusAreaSelectionField68.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField72);
        float float75 = focusAreaSelectionField68.getHeight();
        focusAreaSelectionField57.setParent((com.vaadin.ui.HasComponents) focusAreaSelectionField68);
        aspectAwareDamUploadField20.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField57);
        org.junit.Assert.assertNull(byteArrayConverter2);
        org.junit.Assert.assertNull(outputFormatMappingList7);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit22.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNotNull(componentSpliterator25);
        org.junit.Assert.assertNull(byteArrayConverter30);
        org.junit.Assert.assertNull(outputFormatMappingList35);
        org.junit.Assert.assertTrue("'" + unit50 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit50.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNotNull(componentSpliterator53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + (-1.0f) + "'", float75 == (-1.0f));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        com.vaadin.event.ContextClickEvent.ContextClickListener contextClickListener4 = null;
        focusAreaSelectionField1.removeContextClickListener(contextClickListener4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray0 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetList1 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, damVariationSetArray0);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas3 = null;
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariation> damVariationList4 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getMissingVariations((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1, focusAreas3);
        java.awt.Dimension dimension5 = org.sevensource.magnolia.responsivedam.field.validation.AbstractAspectAwareFieldValidator.getRequiredImageDimensions((java.util.List<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetList1);
        org.junit.Assert.assertNotNull(damVariationSetArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(damVariationList4);
        org.junit.Assert.assertNotNull(dimension5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea5 = new org.sevensource.magnolia.responsivedam.focusarea.FocusArea("", (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
        boolean boolean6 = focusArea5.isValid();
        java.lang.String str7 = focusArea5.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        java.util.Collection<com.vaadin.server.Extension> extensionCollection4 = focusAreaSelectionField1.getExtensions();
        boolean boolean5 = focusAreaSelectionField1.isReadOnly();
        focusAreaSelectionField1.setHeightUndefined();
        org.junit.Assert.assertNotNull(extensionCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter2 = focusAreaSelectionField1.getConverter();
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration3 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging4 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration5 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions6 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration3, imaging4, serverConfiguration5);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList7 = responsiveDamConfiguration3.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider8 = null;
        info.magnolia.ui.api.context.UiContext uiContext9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition12 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition12.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition12.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator17 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer18 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter19 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField20 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration3, imageProvider8, uiContext9, mediaEditorPresenterFactory10, componentProvider11, aspectAwareDamUploadFieldDefinition12, simpleTranslator17, i18nizer18, actionbarPresenter19);
        com.vaadin.server.Sizeable.Unit unit22 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField20.setWidth((float) (byte) -1, unit22);
        focusAreaSelectionField1.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) aspectAwareDamUploadField20);
        java.util.Spliterator<com.vaadin.ui.Component> componentSpliterator25 = aspectAwareDamUploadField20.spliterator();
        aspectAwareDamUploadField20.setInvalidAllowed(true);
        com.vaadin.server.ErrorMessage errorMessage28 = aspectAwareDamUploadField20.getComponentError();
        org.junit.Assert.assertNull(byteArrayConverter2);
        org.junit.Assert.assertNull(outputFormatMappingList7);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit22.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNotNull(componentSpliterator25);
        org.junit.Assert.assertNull(errorMessage28);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet1 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet("");
        focusAreaSet1.setName("transientPathProperty");
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea5 = focusAreaSet1.getFocusArea("field.upload.note.error");
        java.lang.String str6 = focusAreaSet1.getName();
        org.junit.Assert.assertNull(focusArea5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "transientPathProperty" + "'", str6, "transientPathProperty");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        com.vaadin.server.Sizeable.Unit unit19 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField17.setWidth((float) (byte) -1, unit19);
        com.vaadin.server.ErrorMessage errorMessage21 = aspectAwareDamUploadField17.getErrorMessage();
        com.vaadin.v7.data.Property.ValueChangeEvent valueChangeEvent22 = null;
        // The following exception was thrown during execution in test generation
        try {
            aspectAwareDamUploadField17.valueChange(valueChangeEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit19.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNull(errorMessage21);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension sizeDimension1 = org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH;
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification sizeSpecification2 = new org.sevensource.magnolia.responsivedam.configuration.SizeSpecification((java.lang.Integer) 100, sizeDimension1);
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension sizeDimension3 = sizeSpecification2.getDimension();
        java.lang.String str4 = sizeDimension3.getId();
        org.junit.Assert.assertTrue("'" + sizeDimension1 + "' != '" + org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH + "'", sizeDimension1.equals(org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH));
        org.junit.Assert.assertTrue("'" + sizeDimension3 + "' != '" + org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH + "'", sizeDimension3.equals(org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "w" + "'", str4, "w");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setFieldType("");
        aspectAwareDamUploadFieldDefinition0.setDropZoneCaption("field.upload.select.another");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener7 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField8 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener7);
        boolean boolean9 = focusAreaSelectionField8.isConnectorEnabled();
        focusAreaSelectionField4.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField8);
        float float11 = focusAreaSelectionField4.getHeight();
        focusAreaSelectionField4.setRequiredError("field.upload.select.delete");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        focusAreaSelectionField4.execute();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition8 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        java.lang.String str9 = aspectAwareDamUploadFieldDefinition8.getFieldType();
        focusAreaSelectionField4.setData((java.lang.Object) aspectAwareDamUploadFieldDefinition8);
        aspectAwareDamUploadFieldDefinition8.setErrorNoteCaption("rd");
        java.lang.String str13 = aspectAwareDamUploadFieldDefinition8.getFieldType();
        aspectAwareDamUploadFieldDefinition8.setInProgressRatioCaption("w");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        com.vaadin.v7.data.Item item6 = null;
        info.magnolia.ui.api.context.UiContext uiContext7 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport8 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator12 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer13 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item6, uiContext7, i18NAuthoringSupport8, imageProvider9, mediaEditorPresenterFactory10, componentProvider11, simpleTranslator12, i18nizer13, actionbarPresenter14);
        aspectAwareDamUploadFieldDefinition5.setSelectAnotherCaption("field.upload.note.error");
        aspectAwareDamUploadFieldDefinition5.setDeleteCaption("field.upload.file.detail.size");
        org.junit.Assert.assertNull(outputFormatMappingList4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.vaadin.v7.data.Item item0 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition1 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition1.setFieldType("");
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport4 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer aspectAwareAssetTransformer5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareAssetTransformer(item0, (info.magnolia.dam.app.ui.field.definition.DamUploadFieldDefinition) aspectAwareDamUploadFieldDefinition1, i18NAuthoringSupport4);
        aspectAwareAssetTransformer5.setReadOnly(true);
        aspectAwareAssetTransformer5.setReadOnly(true);
        boolean boolean10 = aspectAwareAssetTransformer5.hasI18NSupport();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        java.lang.Object obj18 = aspectAwareDamUploadField17.getConvertedValue();
        aspectAwareDamUploadField17.setSelectAnotherCaption("field.upload.select.edit");
        aspectAwareDamUploadField17.setImmediate(false);
        aspectAwareDamUploadField17.setFileDetailFormatCaption("field.upload.uploaded.file");
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas0 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet2 = focusAreas0.getFocusAreaSet("field.upload.note.error");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter5 = focusAreaSelectionField4.getConverter();
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration6 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging7 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration8 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions9 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration6, imaging7, serverConfiguration8);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList10 = responsiveDamConfiguration6.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider11 = null;
        info.magnolia.ui.api.context.UiContext uiContext12 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory13 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition15.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition15.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator20 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer21 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter22 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField23 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration6, imageProvider11, uiContext12, mediaEditorPresenterFactory13, componentProvider14, aspectAwareDamUploadFieldDefinition15, simpleTranslator20, i18nizer21, actionbarPresenter22);
        com.vaadin.server.Sizeable.Unit unit25 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField23.setWidth((float) (byte) -1, unit25);
        focusAreaSelectionField4.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) aspectAwareDamUploadField23);
        com.vaadin.server.ErrorMessage errorMessage28 = focusAreaSelectionField4.getErrorMessage();
        focusAreaSelectionField4.removeStyleName("");
        boolean boolean31 = focusAreas0.equals((java.lang.Object) "");
        org.junit.Assert.assertNull(focusAreaSet2);
        org.junit.Assert.assertNull(byteArrayConverter5);
        org.junit.Assert.assertNull(outputFormatMappingList10);
        org.junit.Assert.assertTrue("'" + unit25 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit25.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNull(errorMessage28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition selectionActionDefinition1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition(damVariation0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation2 = selectionActionDefinition1.getVariation();
        java.lang.String str3 = selectionActionDefinition1.getI18nBasename();
        selectionActionDefinition1.setIcon("");
        java.lang.String str6 = selectionActionDefinition1.getDescription();
        java.lang.String str7 = selectionActionDefinition1.getSuccessMessage();
        selectionActionDefinition1.setName("hi!");
        info.magnolia.ui.api.availability.AvailabilityDefinition availabilityDefinition10 = selectionActionDefinition1.getAvailability();
        org.junit.Assert.assertNull(damVariation2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(availabilityDefinition10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        focusAreaSelectionField4.execute();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener8 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField9 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener8);
        boolean boolean10 = focusAreaSelectionField9.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener11 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField12 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener11);
        focusAreaSelectionField9.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField12);
        focusAreaSelectionField12.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener15 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField16 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener15);
        boolean boolean17 = focusAreaSelectionField16.isConnectorEnabled();
        focusAreaSelectionField12.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField16);
        focusAreaSelectionField4.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField12);
        focusAreaSelectionField12.discard();
        boolean boolean21 = focusAreaSelectionField12.isConnectorEnabled();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setSuccessNoteCaption("transientPathProperty");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getName();
        aspectAwareDamUploadFieldDefinition0.setDropZoneCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition0.setDefaultValue("hi!");
        boolean boolean8 = aspectAwareDamUploadFieldDefinition0.isEditFileFormat();
        aspectAwareDamUploadFieldDefinition0.setFileDetailFormatCaption("");
        java.lang.String str11 = aspectAwareDamUploadFieldDefinition0.getFileDetailSourceCaption();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "field.upload.file.detail.source" + "'", str11, "field.upload.file.detail.source");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule1 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
        org.sevensource.magnolia.responsivedam.configuration.DamSizeConstraints damSizeConstraints2 = responsiveDamModule1.getDefaultConstraint();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> strMap3 = responsiveDamModule1.getVariations();
        org.sevensource.magnolia.responsivedam.configuration.DamSizeConstraints damSizeConstraints4 = responsiveDamModule1.getDefaultConstraint();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>> strMap5 = responsiveDamModule1.getVariations();
        org.junit.Assert.assertNull(damSizeConstraints2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(damSizeConstraints4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        com.vaadin.server.Sizeable.Unit unit19 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField17.setWidth((float) (byte) -1, unit19);
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration21 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule22 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration21);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation25 = responsiveDamConfiguration21.getVariation("focusAreas", "transientPathProperty");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition26 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition26.setSuccessNoteCaption("transientPathProperty");
        com.vaadin.v7.data.Item item29 = null;
        info.magnolia.ui.api.context.UiContext uiContext30 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport31 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider32 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory33 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider34 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator35 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer36 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter37 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory38 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration21, aspectAwareDamUploadFieldDefinition26, item29, uiContext30, i18NAuthoringSupport31, imageProvider32, mediaEditorPresenterFactory33, componentProvider34, simpleTranslator35, i18nizer36, actionbarPresenter37);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet damVariationSet40 = responsiveDamConfiguration21.getVariationSet("rd");
        aspectAwareDamUploadField17.setData((java.lang.Object) damVariationSet40);
        java.lang.String str42 = aspectAwareDamUploadField17.getDescription();
        aspectAwareDamUploadField17.setData((java.lang.Object) 100.0f);
        com.vaadin.ui.HasComponents hasComponents45 = aspectAwareDamUploadField17.getParent();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit19.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNull(damVariation25);
        org.junit.Assert.assertNull(damVariationSet40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(hasComponents45);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        java.lang.Object obj18 = aspectAwareDamUploadField17.getConvertedValue();
        java.util.Iterator<com.vaadin.ui.Component> componentItor19 = aspectAwareDamUploadField17.iterator();
        org.jsoup.nodes.Element element20 = null;
        com.vaadin.ui.declarative.DesignContext designContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            aspectAwareDamUploadField17.writeDesign(element20, designContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(componentItor19);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList5 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping[] outputFormatMappingArray6 = new org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping[] {};
        java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList7 = new java.util.ArrayList<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping>) outputFormatMappingList7, outputFormatMappingArray6);
        responsiveDamConfiguration0.setOutputFormatMappings((java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping>) outputFormatMappingList7);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation12 = responsiveDamConfiguration0.getVariation("field.upload.note.error", "focusAreas");
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(outputFormatMappingList5);
        org.junit.Assert.assertNotNull(outputFormatMappingArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(damVariation12);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        javax.jcr.Node node4 = null;
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension sizeDimension8 = org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH;
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification sizeSpecification9 = new org.sevensource.magnolia.responsivedam.configuration.SizeSpecification((java.lang.Integer) 100, sizeDimension8);
        info.magnolia.imaging.OutputFormat outputFormat10 = null;
        org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamRendition responsiveDamRendition11 = new org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamRendition(node4, "validation.message.required", "Could not convert value to {0}", sizeSpecification9, outputFormat10);
        java.lang.String str12 = responsiveDamTemplatingFunctions3.getBase64EncodedRendition(responsiveDamRendition11);
        javax.jcr.Node node13 = responsiveDamRendition11.getNode();
        org.junit.Assert.assertTrue("'" + sizeDimension8 + "' != '" + org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH + "'", sizeDimension8.equals(org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition0.setTypeInterruption("hi!");
        java.lang.String[] strArray9 = new java.lang.String[] { "field.upload.select.delete", "", "rd", "focusAreas" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        aspectAwareDamUploadFieldDefinition0.setVariationSets((java.util.List<java.lang.String>) strList10);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        java.lang.Object obj18 = aspectAwareDamUploadField17.getConvertedValue();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener19 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField20 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener19);
        boolean boolean21 = focusAreaSelectionField20.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener22 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField23 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener22);
        focusAreaSelectionField20.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField23);
        com.vaadin.server.Sizeable.Unit unit25 = focusAreaSelectionField23.getHeightUnits();
        aspectAwareDamUploadField17.removeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField23);
        java.util.Iterator<com.vaadin.ui.Component> componentItor27 = aspectAwareDamUploadField17.iterator();
        aspectAwareDamUploadField17.setFileDetailFormatCaption("field.upload.note.error");
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + unit25 + "' != '" + com.vaadin.server.Sizeable.Unit.PIXELS + "'", unit25.equals(com.vaadin.server.Sizeable.Unit.PIXELS));
        org.junit.Assert.assertNotNull(componentItor27);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter2 = focusAreaSelectionField1.getConverter();
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration3 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging4 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration5 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions6 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration3, imaging4, serverConfiguration5);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList7 = responsiveDamConfiguration3.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider8 = null;
        info.magnolia.ui.api.context.UiContext uiContext9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition12 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition12.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition12.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator17 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer18 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter19 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField20 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration3, imageProvider8, uiContext9, mediaEditorPresenterFactory10, componentProvider11, aspectAwareDamUploadFieldDefinition12, simpleTranslator17, i18nizer18, actionbarPresenter19);
        com.vaadin.server.Sizeable.Unit unit22 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField20.setWidth((float) (byte) -1, unit22);
        focusAreaSelectionField1.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) aspectAwareDamUploadField20);
        java.util.Spliterator<com.vaadin.ui.Component> componentSpliterator25 = aspectAwareDamUploadField20.spliterator();
        com.vaadin.server.ClientConnector.DetachListener detachListener26 = null;
        aspectAwareDamUploadField20.removeDetachListener(detachListener26);
        com.vaadin.v7.data.Validator validator28 = null;
        aspectAwareDamUploadField20.addValidator(validator28);
        org.junit.Assert.assertNull(byteArrayConverter2);
        org.junit.Assert.assertNull(outputFormatMappingList7);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit22.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNotNull(componentSpliterator25);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener7 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField8 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener7);
        boolean boolean9 = focusAreaSelectionField8.isConnectorEnabled();
        focusAreaSelectionField4.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField8);
        boolean boolean11 = focusAreaSelectionField4.isCaptionAsHtml();
        focusAreaSelectionField4.removeAllValidators();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule1 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
        info.magnolia.imaging.Imaging imaging2 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration3 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions4 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging2, serverConfiguration3);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] damVariationSetArray5 = new org.sevensource.magnolia.responsivedam.configuration.DamVariationSet[] {};
        java.util.LinkedHashSet<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet> damVariationSetSet6 = new java.util.LinkedHashSet<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetSet6, damVariationSetArray5);
        responsiveDamConfiguration0.setVariationSets((java.util.Set<org.sevensource.magnolia.responsivedam.configuration.DamVariationSet>) damVariationSetSet6);
        org.junit.Assert.assertNotNull(damVariationSetArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration1 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule2 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration1);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation5 = responsiveDamConfiguration1.getVariation("focusAreas", "transientPathProperty");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition6 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition6.setSuccessNoteCaption("transientPathProperty");
        com.vaadin.v7.data.Item item9 = null;
        info.magnolia.ui.api.context.UiContext uiContext10 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport11 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider12 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory13 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider14 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator15 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer16 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter17 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory18 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration1, aspectAwareDamUploadFieldDefinition6, item9, uiContext10, i18NAuthoringSupport11, imageProvider12, mediaEditorPresenterFactory13, componentProvider14, simpleTranslator15, i18nizer16, actionbarPresenter17);
        info.magnolia.jcr.node2bean.Node2BeanProcessor node2BeanProcessor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameterProvider aspectAwareParameterProvider20 = new org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameterProvider("rd", responsiveDamConfiguration1, node2BeanProcessor19);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Cannot create org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameter due to an empty requestedPath part");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(damVariation5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        boolean boolean18 = aspectAwareDamUploadField17.isModified();
        java.lang.Object obj19 = aspectAwareDamUploadField17.getConvertedValue();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        com.vaadin.v7.data.Item item6 = null;
        info.magnolia.ui.api.context.UiContext uiContext7 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport8 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator12 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer13 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item6, uiContext7, i18NAuthoringSupport8, imageProvider9, mediaEditorPresenterFactory10, componentProvider11, simpleTranslator12, i18nizer13, actionbarPresenter14);
        java.lang.String str16 = aspectAwareDamUploadFieldDefinition5.getStyleName();
        boolean boolean17 = aspectAwareDamUploadFieldDefinition5.isReadOnly();
        java.lang.String str18 = aspectAwareDamUploadFieldDefinition5.getSizeInterruption();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "field.upload.interupted.size" + "'", str18, "field.upload.interupted.size");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setSuccessNoteCaption("transientPathProperty");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getName();
        aspectAwareDamUploadFieldDefinition0.setDropZoneCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition0.setDefaultValue("hi!");
        java.lang.String str8 = aspectAwareDamUploadFieldDefinition0.getDropZoneCaption();
        java.lang.String str9 = aspectAwareDamUploadFieldDefinition0.getErrorNoteCaption();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "transientPathProperty" + "'", str8, "transientPathProperty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "field.upload.note.error" + "'", str9, "field.upload.note.error");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.Buffered.SourceException sourceException2 = null;
        focusAreaSelectionField1.setCurrentBufferedSourceException(sourceException2);
        focusAreaSelectionField1.setTabIndex(0);
        focusAreaSelectionField1.scaleToActualSize();
        java.lang.String str7 = focusAreaSelectionField1.getStyleName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition selectionActionDefinition1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition(damVariation0);
        java.lang.String str2 = selectionActionDefinition1.getDescription();
        selectionActionDefinition1.setDescription("Could not convert value to {0}");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setFieldType("");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getErrorNoteCaption();
        java.lang.String str4 = aspectAwareDamUploadFieldDefinition0.getEditFileCaption();
        aspectAwareDamUploadFieldDefinition0.setErrorNoteCaption("validation.message.required");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "field.upload.note.error" + "'", str3, "field.upload.note.error");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "field.upload.select.edit" + "'", str4, "field.upload.select.edit");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition0 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition0.setFieldType("");
        java.lang.String str3 = aspectAwareDamUploadFieldDefinition0.getErrorNoteCaption();
        aspectAwareDamUploadFieldDefinition0.setAllowedMimeTypePattern("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "field.upload.note.error" + "'", str3, "field.upload.note.error");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule1 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation4 = responsiveDamConfiguration0.getVariation("focusAreas", "transientPathProperty");
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet damVariationSet6 = responsiveDamConfiguration0.getVariationSet("transientPathProperty");
        org.junit.Assert.assertNull(damVariation4);
        org.junit.Assert.assertNull(damVariationSet6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener18 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField19 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener18);
        boolean boolean20 = focusAreaSelectionField19.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener21 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField22 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener21);
        focusAreaSelectionField19.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField22);
        aspectAwareDamUploadField17.removeValueChangeListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField19);
        boolean boolean25 = aspectAwareDamUploadField17.isInvalidAllowed();
        aspectAwareDamUploadField17.focus();
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        boolean boolean2 = focusAreaSelectionField1.isConnectorEnabled();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener3 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField4 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener3);
        focusAreaSelectionField1.addListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField4);
        focusAreaSelectionField4.clear();
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener7 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField8 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener7);
        boolean boolean9 = focusAreaSelectionField8.isConnectorEnabled();
        focusAreaSelectionField4.addListener((com.vaadin.v7.data.Property.ValueChangeListener) focusAreaSelectionField8);
        boolean boolean11 = focusAreaSelectionField4.isVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        info.magnolia.dam.jcr.JcrAsset jcrAsset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.imaging.ResponsiveDamVariation responsiveDamVariation7 = responsiveDamTemplatingFunctions3.getResponsiveVariation(jcrAsset4, "field.upload.uploaded.file", "w");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Asset is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.server.ServerRpcManager<?> wildcardServerRpcManager3 = focusAreaSelectionField1.getRpcManager("focusAreas");
        boolean boolean4 = focusAreaSelectionField1.isValid();
        focusAreaSelectionField1.beforeClientResponse(false);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter7 = focusAreaSelectionField1.getConverter();
        focusAreaSelectionField1.setHeightUndefined();
        org.junit.Assert.assertNull(wildcardServerRpcManager3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(byteArrayConverter7);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter2 = focusAreaSelectionField1.getConverter();
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration3 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging4 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration5 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions6 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration3, imaging4, serverConfiguration5);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList7 = responsiveDamConfiguration3.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider8 = null;
        info.magnolia.ui.api.context.UiContext uiContext9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition12 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition12.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition12.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator17 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer18 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter19 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField20 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration3, imageProvider8, uiContext9, mediaEditorPresenterFactory10, componentProvider11, aspectAwareDamUploadFieldDefinition12, simpleTranslator17, i18nizer18, actionbarPresenter19);
        com.vaadin.server.Sizeable.Unit unit22 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField20.setWidth((float) (byte) -1, unit22);
        focusAreaSelectionField1.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) aspectAwareDamUploadField20);
        java.util.Spliterator<com.vaadin.ui.Component> componentSpliterator25 = aspectAwareDamUploadField20.spliterator();
        aspectAwareDamUploadField20.setFileDetailFormatCaption("Could not convert value to {0}");
        com.vaadin.server.ErrorMessage errorMessage28 = aspectAwareDamUploadField20.getComponentError();
        org.junit.Assert.assertNull(byteArrayConverter2);
        org.junit.Assert.assertNull(outputFormatMappingList7);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit22.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNotNull(componentSpliterator25);
        org.junit.Assert.assertNull(errorMessage28);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition5 = null;
        com.vaadin.v7.data.Item item6 = null;
        info.magnolia.ui.api.context.UiContext uiContext7 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport8 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator12 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer13 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter14 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory15 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration0, aspectAwareDamUploadFieldDefinition5, item6, uiContext7, i18NAuthoringSupport8, imageProvider9, mediaEditorPresenterFactory10, componentProvider11, simpleTranslator12, i18nizer13, actionbarPresenter14);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet damVariationSet17 = responsiveDamConfiguration0.getVariationSet("transientPathProperty");
        org.sevensource.magnolia.responsivedam.ResponsiveDamModule responsiveDamModule18 = new org.sevensource.magnolia.responsivedam.ResponsiveDamModule(responsiveDamConfiguration0);
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(damVariationSet17);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter2 = focusAreaSelectionField1.getConverter();
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration3 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging4 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration5 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions6 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration3, imaging4, serverConfiguration5);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList7 = responsiveDamConfiguration3.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider8 = null;
        info.magnolia.ui.api.context.UiContext uiContext9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition12 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition12.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition12.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator17 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer18 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter19 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField20 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration3, imageProvider8, uiContext9, mediaEditorPresenterFactory10, componentProvider11, aspectAwareDamUploadFieldDefinition12, simpleTranslator17, i18nizer18, actionbarPresenter19);
        com.vaadin.server.Sizeable.Unit unit22 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField20.setWidth((float) (byte) -1, unit22);
        focusAreaSelectionField1.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) aspectAwareDamUploadField20);
        com.vaadin.server.ErrorMessage errorMessage25 = focusAreaSelectionField1.getErrorMessage();
        focusAreaSelectionField1.setCaption("binaryNodeName");
        org.junit.Assert.assertNull(byteArrayConverter2);
        org.junit.Assert.assertNull(outputFormatMappingList7);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit22.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNull(errorMessage25);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet1 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet("");
        focusAreaSet1.setName("transientPathProperty");
        focusAreaSet1.setName("");
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet6 = org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet.of(focusAreaSet1);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreas focusAreas7 = new org.sevensource.magnolia.responsivedam.focusarea.FocusAreas();
        boolean boolean8 = focusAreaSet6.equals((java.lang.Object) focusAreas7);
        org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet focusAreaSet10 = focusAreas7.getFocusAreaSet("rd");
        java.util.List<org.sevensource.magnolia.responsivedam.focusarea.FocusAreaSet> focusAreaSetList11 = focusAreas7.getFocusAreaSets();
        org.junit.Assert.assertNotNull(focusAreaSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(focusAreaSet10);
        org.junit.Assert.assertNotNull(focusAreaSetList11);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration1 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging2 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration3 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions4 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration1, imaging2, serverConfiguration3);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList5 = responsiveDamConfiguration1.getOutputFormatMappings();
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition6 = null;
        com.vaadin.v7.data.Item item7 = null;
        info.magnolia.ui.api.context.UiContext uiContext8 = null;
        info.magnolia.ui.api.i18n.I18NAuthoringSupport i18NAuthoringSupport9 = null;
        info.magnolia.ui.imageprovider.ImageProvider imageProvider10 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory11 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider12 = null;
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator13 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer14 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter15 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory aspectAwareDamUploadFieldFactory16 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldFactory(responsiveDamConfiguration1, aspectAwareDamUploadFieldDefinition6, item7, uiContext8, i18NAuthoringSupport9, imageProvider10, mediaEditorPresenterFactory11, componentProvider12, simpleTranslator13, i18nizer14, actionbarPresenter15);
        org.sevensource.magnolia.responsivedam.configuration.DamVariationSet damVariationSet18 = responsiveDamConfiguration1.getVariationSet("rd");
        info.magnolia.jcr.node2bean.Node2BeanProcessor node2BeanProcessor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameterProvider aspectAwareParameterProvider20 = new org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameterProvider("field.upload.note.success", responsiveDamConfiguration1, node2BeanProcessor19);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Cannot create org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameter due to an empty requestedPath part");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(outputFormatMappingList5);
        org.junit.Assert.assertNull(damVariationSet18);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener0);
        com.vaadin.v7.data.util.converter.Converter<byte[], java.lang.Object> byteArrayConverter2 = focusAreaSelectionField1.getConverter();
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration3 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging4 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration5 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions6 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration3, imaging4, serverConfiguration5);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList7 = responsiveDamConfiguration3.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider8 = null;
        info.magnolia.ui.api.context.UiContext uiContext9 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory10 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider11 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition12 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition12.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition12.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator17 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer18 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter19 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField20 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration3, imageProvider8, uiContext9, mediaEditorPresenterFactory10, componentProvider11, aspectAwareDamUploadFieldDefinition12, simpleTranslator17, i18nizer18, actionbarPresenter19);
        com.vaadin.server.Sizeable.Unit unit22 = com.vaadin.server.Sizeable.UNITS_EM;
        aspectAwareDamUploadField20.setWidth((float) (byte) -1, unit22);
        focusAreaSelectionField1.addReadOnlyStatusChangeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) aspectAwareDamUploadField20);
        java.util.Spliterator<com.vaadin.ui.Component> componentSpliterator25 = aspectAwareDamUploadField20.spliterator();
        aspectAwareDamUploadField20.setInvalidAllowed(false);
        aspectAwareDamUploadField20.commit();
        boolean boolean29 = aspectAwareDamUploadField20.isReadOnly();
        org.junit.Assert.assertNull(byteArrayConverter2);
        org.junit.Assert.assertNull(outputFormatMappingList7);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + com.vaadin.server.Sizeable.Unit.EM + "'", unit22.equals(com.vaadin.server.Sizeable.Unit.EM));
        org.junit.Assert.assertNotNull(componentSpliterator25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration responsiveDamConfiguration0 = new org.sevensource.magnolia.responsivedam.configuration.ResponsiveDamConfiguration();
        info.magnolia.imaging.Imaging imaging1 = null;
        info.magnolia.cms.beans.config.ServerConfiguration serverConfiguration2 = null;
        org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions responsiveDamTemplatingFunctions3 = new org.sevensource.magnolia.responsivedam.templating.ResponsiveDamTemplatingFunctions(responsiveDamConfiguration0, imaging1, serverConfiguration2);
        java.util.List<org.sevensource.magnolia.responsivedam.configuration.OutputFormatMapping> outputFormatMappingList4 = responsiveDamConfiguration0.getOutputFormatMappings();
        info.magnolia.ui.imageprovider.ImageProvider imageProvider5 = null;
        info.magnolia.ui.api.context.UiContext uiContext6 = null;
        info.magnolia.ui.mediaeditor.MediaEditorPresenterFactory mediaEditorPresenterFactory7 = null;
        info.magnolia.objectfactory.ComponentProvider componentProvider8 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition aspectAwareDamUploadFieldDefinition9 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadFieldDefinition();
        aspectAwareDamUploadFieldDefinition9.setSuccessNoteCaption("transientPathProperty");
        aspectAwareDamUploadFieldDefinition9.setTypeInterruption("hi!");
        info.magnolia.i18nsystem.SimpleTranslator simpleTranslator14 = null;
        info.magnolia.i18nsystem.I18nizer i18nizer15 = null;
        info.magnolia.ui.actionbar.ActionbarPresenter actionbarPresenter16 = null;
        org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField aspectAwareDamUploadField17 = new org.sevensource.magnolia.responsivedam.field.upload.AspectAwareDamUploadField(responsiveDamConfiguration0, imageProvider5, uiContext6, mediaEditorPresenterFactory7, componentProvider8, aspectAwareDamUploadFieldDefinition9, simpleTranslator14, i18nizer15, actionbarPresenter16);
        java.lang.Object obj18 = aspectAwareDamUploadField17.getConvertedValue();
        aspectAwareDamUploadField17.setSelectAnotherCaption("field.upload.select.edit");
        aspectAwareDamUploadField17.setImmediate(false);
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectedListener focusAreaSelectedListener23 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField focusAreaSelectionField24 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.FocusAreaSelectionField(focusAreaSelectedListener23);
        com.vaadin.server.ServerRpcManager<?> wildcardServerRpcManager26 = focusAreaSelectionField24.getRpcManager("focusAreas");
        boolean boolean27 = focusAreaSelectionField24.isValid();
        aspectAwareDamUploadField17.removeListener((com.vaadin.v7.data.Property.ReadOnlyStatusChangeListener) focusAreaSelectionField24);
        org.junit.Assert.assertNull(outputFormatMappingList4);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(wildcardServerRpcManager26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition selectionActionDefinition1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition(damVariation0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation2 = selectionActionDefinition1.getVariation();
        java.lang.String str3 = selectionActionDefinition1.getI18nBasename();
        selectionActionDefinition1.setIcon("");
        java.lang.String str6 = selectionActionDefinition1.getDescription();
        info.magnolia.ui.api.availability.AvailabilityDefinition availabilityDefinition7 = null;
        selectionActionDefinition1.setAvailability(availabilityDefinition7);
        java.lang.String str9 = selectionActionDefinition1.getErrorMessage();
        org.junit.Assert.assertNull(damVariation2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        javax.jcr.Node node0 = null;
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation1 = null;
        org.sevensource.magnolia.responsivedam.focusarea.FocusArea focusArea7 = new org.sevensource.magnolia.responsivedam.focusarea.FocusArea("", (java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 1);
        focusArea7.setX((java.lang.Integer) (-1));
        boolean boolean11 = focusArea7.equals((java.lang.Object) "rd");
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension sizeDimension13 = org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH;
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification sizeSpecification14 = new org.sevensource.magnolia.responsivedam.configuration.SizeSpecification((java.lang.Integer) 100, sizeDimension13);
        info.magnolia.imaging.OutputFormat outputFormat15 = null;
        org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameter aspectAwareParameter16 = new org.sevensource.magnolia.responsivedam.imaging.parameter.AspectAwareParameter(node0, damVariation1, focusArea7, sizeSpecification14, outputFormat15);
        org.sevensource.magnolia.responsivedam.field.AspectAwareUiUtils aspectAwareUiUtils17 = new org.sevensource.magnolia.responsivedam.field.AspectAwareUiUtils();
        boolean boolean18 = focusArea7.equals((java.lang.Object) aspectAwareUiUtils17);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + sizeDimension13 + "' != '" + org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH + "'", sizeDimension13.equals(org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation0 = null;
        org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition selectionActionDefinition1 = new org.sevensource.magnolia.responsivedam.field.focusareaselection.action.SelectionActionDefinition(damVariation0);
        org.sevensource.magnolia.responsivedam.configuration.DamVariation damVariation2 = selectionActionDefinition1.getVariation();
        java.lang.String str3 = selectionActionDefinition1.getI18nBasename();
        selectionActionDefinition1.setIcon("");
        java.lang.String str6 = selectionActionDefinition1.getDescription();
        java.lang.String str7 = selectionActionDefinition1.getErrorMessage();
        java.lang.String str8 = selectionActionDefinition1.getIcon();
        org.junit.Assert.assertNull(damVariation2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension sizeDimension1 = org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH;
        org.sevensource.magnolia.responsivedam.configuration.SizeSpecification sizeSpecification2 = new org.sevensource.magnolia.responsivedam.configuration.SizeSpecification((java.lang.Integer) 100, sizeDimension1);
        java.lang.String str3 = sizeSpecification2.toString();
        org.junit.Assert.assertTrue("'" + sizeDimension1 + "' != '" + org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH + "'", sizeDimension1.equals(org.sevensource.magnolia.responsivedam.configuration.SizeSpecification.SizeDimension.WIDTH));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100w" + "'", str3, "100w");
    }
}

