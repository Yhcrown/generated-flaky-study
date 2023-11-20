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
        java.lang.String str0 = net.masterthought.cucumber.ReportBuilder.HOME_PAGE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "overview-features.html" + "'", str0, "overview-features.html");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer1 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = embeddingDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.Embedding>) embeddingDeserializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        net.masterthought.cucumber.json.support.Argument[] argumentArray1 = new net.masterthought.cucumber.json.support.Argument[] {};
        java.lang.String str4 = net.masterthought.cucumber.util.StepNameFormatter.format("overview-features.html", argumentArray1, "", "");
        org.junit.Assert.assertNotNull(argumentArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "overview-features.html" + "'", str4, "overview-features.html");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = net.masterthought.cucumber.generators.FeaturesOverviewPage.WEB_PAGE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "overview-features.html" + "'", str0, "overview-features.html");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.Configuration configuration1 = null;
        net.masterthought.cucumber.json.support.TagObject tagObject2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.generators.TagReportPage tagReportPage3 = new net.masterthought.cucumber.generators.TagReportPage(reportResult0, configuration1, tagObject2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.Configuration configuration1 = null;
        net.masterthought.cucumber.Trends trends2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.generators.TrendsOverviewPage trendsOverviewPage3 = new net.masterthought.cucumber.generators.TrendsOverviewPage(reportResult0, configuration1, trends2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = null;
        net.masterthought.cucumber.Configuration configuration2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = embeddingDeserializer0.deserialize(jsonNode1, configuration2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = commentsDeserializer0.deserializeWithType(jsonParser1, deserializationContext2, typeDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        net.masterthought.cucumber.json.Feature[] featureArray0 = new net.masterthought.cucumber.json.Feature[] {};
        java.util.ArrayList<net.masterthought.cucumber.json.Feature> featureList1 = new java.util.ArrayList<net.masterthought.cucumber.json.Feature>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.masterthought.cucumber.json.Feature>) featureList1, featureArray0);
        net.masterthought.cucumber.Configuration configuration3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.ReportResult reportResult4 = new net.masterthought.cucumber.ReportResult((java.util.List<net.masterthought.cucumber.json.Feature>) featureList1, configuration3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(featureArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.String str0 = net.masterthought.cucumber.generators.TagsOverviewPage.WEB_PAGE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "overview-tags.html" + "'", str0, "overview-tags.html");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        boolean boolean1 = embeddingDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty3 = embeddingDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot handle managed/back reference 'hi!': type: value deserializer of type net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str0 = net.masterthought.cucumber.generators.FailuresOverviewPage.WEB_PAGE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "overview-failures.html" + "'", str0, "overview-failures.html");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator tagObjectAlphabeticalComparator0 = new net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator();
        net.masterthought.cucumber.json.support.TagObject tagObject1 = null;
        net.masterthought.cucumber.json.support.TagObject tagObject2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = tagObjectAlphabeticalComparator0.compare(tagObject1, tagObject2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = net.masterthought.cucumber.ReportResult.getCurrentTime();
// flaky:         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "20 Nov 2023, 03:00" + "'", str0, "20 Nov 2023, 03:00");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = commentsDeserializer0.getNullAccessPattern();
        java.util.List<java.lang.String> strList2 = commentsDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.type.LogicalType logicalType3 = commentsDeserializer0.logicalType();
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(logicalType3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = tagsDeserializer0.deserializeWithType(jsonParser1, deserializationContext2, typeDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = commentsDeserializer0.getNullAccessPattern();
        java.util.List<java.lang.String> strList2 = commentsDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = commentsDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5, (java.util.List<java.lang.String>) strList8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage4 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult0, configuration3);
        // The following exception was thrown during execution in test generation
        try {
            tagsOverviewPage4.generatePage();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        java.lang.Boolean boolean2 = tagsDeserializer0.supportsUpdate(deserializationConfig1);
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer3 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        boolean boolean4 = embeddingDeserializer3.isCachable();
        net.masterthought.cucumber.json.Embedding embedding5 = embeddingDeserializer3.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = tagsDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.Embedding>) embeddingDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(embedding5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        net.masterthought.cucumber.util.Counter counter0 = new net.masterthought.cucumber.util.Counter();
        java.lang.String str1 = counter0.toString();
        double double2 = counter0.doubleValue();
        byte byte3 = counter0.byteValue();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        net.masterthought.cucumber.json.Embedding embedding2 = embeddingDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = embeddingDeserializer0.getEmptyValue(deserializationContext3);
        org.junit.Assert.assertNull(embedding2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        net.masterthought.cucumber.util.Counter counter0 = new net.masterthought.cucumber.util.Counter();
        java.lang.String str1 = counter0.toString();
        counter0.decrement();
        java.lang.Class<?> wildcardClass3 = counter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String str1 = net.masterthought.cucumber.util.Util.formatDuration((long) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.000" + "'", str1, "0.000");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage4 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult0, configuration3);
        // The following exception was thrown during execution in test generation
        try {
            tagsOverviewPage4.prepareReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.String str1 = net.masterthought.cucumber.json.Tag.generateFileName("0.000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "report-tag_2193230705.html" + "'", str1, "report-tag_2193230705.html");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.String str1 = net.masterthought.cucumber.util.Util.formatDuration(10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.000" + "'", str1, "0.000");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        boolean boolean1 = embeddingDeserializer0.isCachable();
        net.masterthought.cucumber.json.Embedding embedding2 = embeddingDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        net.masterthought.cucumber.json.Embedding embedding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.Embedding embedding6 = embeddingDeserializer0.deserialize(jsonParser3, deserializationContext4, embedding5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(embedding2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.String str0 = net.masterthought.cucumber.generators.TrendsOverviewPage.WEB_PAGE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "overview-trends.html" + "'", str0, "overview-trends.html");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.String str1 = net.masterthought.cucumber.util.Util.formatDuration((long) (-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.000" + "'", str1, "0.000");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = commentsDeserializer0.getNullAccessPattern();
        java.util.List<java.lang.String> strList2 = commentsDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = commentsDeserializer0.handledType();
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.lang.String str0 = net.masterthought.cucumber.generators.StepsOverviewPage.WEB_PAGE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "overview-steps.html" + "'", str0, "overview-steps.html");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        java.io.File file2 = null;
        net.masterthought.cucumber.Configuration configuration4 = new net.masterthought.cucumber.Configuration(file2, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage5 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult1, configuration4);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod6 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration4.addReducingMethod(reducingMethod6);
        java.io.File file8 = null;
        configuration4.setTrendsStatsFile(file8);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod10 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        boolean boolean11 = configuration4.containsReducingMethod(reducingMethod10);
        java.lang.Exception exception12 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "overview-features.html" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        net.masterthought.cucumber.generators.ErrorPage errorPage17 = new net.masterthought.cucumber.generators.ErrorPage(reportResult0, configuration4, exception12, (java.util.List<java.lang.String>) strList15);
        java.lang.String[] strArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            configuration4.setTagsToExcludeFromChart(strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reducingMethod6 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod6.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + reducingMethod10 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod10.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        java.lang.Class<?> wildcardClass1 = embeddingDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = null;
        net.masterthought.cucumber.ReportResult reportResult3 = null;
        java.io.File file4 = null;
        net.masterthought.cucumber.Configuration configuration6 = new net.masterthought.cucumber.Configuration(file4, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage7 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult3, configuration6);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod8 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration6.addReducingMethod(reducingMethod8);
        java.io.File file10 = null;
        configuration6.setTrendsStatsFile(file10);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod12 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        boolean boolean13 = configuration6.containsReducingMethod(reducingMethod12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = embeddingDeserializer0.deserialize(jsonNode2, configuration6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + reducingMethod8 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod8.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + reducingMethod12 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod12.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        java.lang.Class<?> wildcardClass3 = outputArray2.getClass();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        int int1 = feature0.getFailedScenarios();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        net.masterthought.cucumber.json.Result result3 = step0.getResult();
        long long4 = step0.getDuration();
        java.lang.Integer int5 = step0.getLine();
        net.masterthought.cucumber.json.Match match6 = step0.getMatch();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(match6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        boolean boolean1 = embeddingDeserializer0.isCachable();
        net.masterthought.cucumber.json.Embedding embedding2 = embeddingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = embeddingDeserializer0.getEmptyValue(deserializationContext3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(embedding2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage4 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult0, configuration3);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod5 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration3.addReducingMethod(reducingMethod5);
        java.io.File file7 = null;
        configuration3.setTrendsStatsFile(file7);
        java.util.Collection<java.util.regex.Pattern> patternCollection9 = configuration3.getTagsToExcludeFromChart();
        org.junit.Assert.assertTrue("'" + reducingMethod5 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod5.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertNotNull(patternCollection9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String str2 = net.masterthought.cucumber.util.Util.formatAsPercentage((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00%" + "'", str2, "0.00%");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        net.masterthought.cucumber.generators.OverviewReport overviewReport0 = new net.masterthought.cucumber.generators.OverviewReport();
        int int1 = overviewReport0.getSteps();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        net.masterthought.cucumber.json.Result result3 = step0.getResult();
        net.masterthought.cucumber.json.Output[] outputArray4 = step0.getOutputs();
        net.masterthought.cucumber.json.Match match5 = step0.getMatch();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertNotNull(outputArray4);
        org.junit.Assert.assertNull(match5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        net.masterthought.cucumber.json.Hook hook0 = new net.masterthought.cucumber.json.Hook();
        net.masterthought.cucumber.json.Result result1 = hook0.getResult();
        org.junit.Assert.assertNull(result1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod0 = net.masterthought.cucumber.reducers.ReducingMethod.MERGE_FEATURES_BY_ID;
        org.junit.Assert.assertTrue("'" + reducingMethod0 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.MERGE_FEATURES_BY_ID + "'", reducingMethod0.equals(net.masterthought.cucumber.reducers.ReducingMethod.MERGE_FEATURES_BY_ID));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        net.masterthought.cucumber.util.Util util0 = net.masterthought.cucumber.util.Util.INSTANCE;
        org.junit.Assert.assertNotNull(util0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        java.lang.Boolean boolean2 = tagsDeserializer0.supportsUpdate(deserializationConfig1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        net.masterthought.cucumber.json.Tag tag5 = null;
        net.masterthought.cucumber.json.Tag[] tagArray6 = new net.masterthought.cucumber.json.Tag[] { tag5 };
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.Tag[] tagArray7 = tagsDeserializer0.deserialize(jsonParser3, deserializationContext4, tagArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNotNull(tagArray6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = commentsDeserializer0.getNullAccessPattern();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty3 = commentsDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot handle managed/back reference '': type: value deserializer of type net.masterthought.cucumber.json.deserializers.CommentsDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.List<java.lang.String>> strListJsonDeserializer2 = commentsDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = strListJsonDeserializer2.handledType();
        org.junit.Assert.assertNotNull(strListJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        java.lang.Class<?> wildcardClass1 = embeddingDeserializer0.handledType();
        com.fasterxml.jackson.databind.type.LogicalType logicalType2 = embeddingDeserializer0.logicalType();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = embeddingDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(logicalType2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.List<java.lang.String>> strListJsonDeserializer2 = commentsDeserializer0.unwrappingDeserializer(nameTransformer1);
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer3 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        net.masterthought.cucumber.json.Embedding embedding5 = embeddingDeserializer3.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = embeddingDeserializer3.getAbsentValue(deserializationContext6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = commentsDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.Embedding>) embeddingDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strListJsonDeserializer2);
        org.junit.Assert.assertNull(embedding5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        net.masterthought.cucumber.json.support.Argument argument1 = null;
        net.masterthought.cucumber.json.support.Argument[] argumentArray2 = new net.masterthought.cucumber.json.support.Argument[] { argument1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = net.masterthought.cucumber.util.StepNameFormatter.format("overview-trends.html", argumentArray2, "overview-features.html", "0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(argumentArray2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        boolean boolean1 = embeddingDeserializer0.isCachable();
        net.masterthought.cucumber.json.Embedding embedding2 = embeddingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = embeddingDeserializer0.getObjectIdReader();
        java.lang.Object obj4 = embeddingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        net.masterthought.cucumber.json.Embedding embedding7 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.Embedding embedding8 = embeddingDeserializer0.deserialize(jsonParser5, deserializationContext6, embedding7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(embedding2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = commentsDeserializer0.getNullAccessPattern();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList4 = commentsDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        java.time.LocalDateTime localDateTime2 = element0.getStartTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        java.lang.Class<?> wildcardClass1 = embeddingDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = embeddingDeserializer0.getObjectIdReader();
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer3 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        net.masterthought.cucumber.json.Embedding embedding5 = embeddingDeserializer3.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = embeddingDeserializer3.getAbsentValue(deserializationContext6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = embeddingDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.Embedding>) embeddingDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(embedding5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        net.masterthought.cucumber.json.Feature feature2 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int3 = feature2.getLine();
        net.masterthought.cucumber.ReportResult reportResult4 = null;
        java.io.File file5 = null;
        net.masterthought.cucumber.Configuration configuration7 = new net.masterthought.cucumber.Configuration(file5, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage8 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult4, configuration7);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod9 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration7.addReducingMethod(reducingMethod9);
        java.io.File file11 = null;
        configuration7.setTrendsStatsFile(file11);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod13 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        boolean boolean14 = configuration7.containsReducingMethod(reducingMethod13);
        element0.setMetaData(feature2, configuration7);
        long long16 = feature2.getDuration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + reducingMethod9 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod9.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + reducingMethod13 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod13.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage4 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult0, configuration3);
        java.util.List<net.masterthought.cucumber.reducers.ReducingMethod> reducingMethodList5 = configuration3.getReducingMethods();
        java.util.Collection<java.util.regex.Pattern> patternCollection6 = configuration3.getTagsToExcludeFromChart();
        org.junit.Assert.assertNotNull(reducingMethodList5);
        org.junit.Assert.assertNotNull(patternCollection6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        net.masterthought.cucumber.ValidationException validationException1 = new net.masterthought.cucumber.ValidationException("overview-tags.html");
        net.masterthought.cucumber.ValidationException validationException3 = new net.masterthought.cucumber.ValidationException("overview-tags.html");
        validationException1.addSuppressed((java.lang.Throwable) validationException3);
        java.lang.String str5 = validationException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "net.masterthought.cucumber.ValidationException: overview-tags.html" + "'", str5, "net.masterthought.cucumber.ValidationException: overview-tags.html");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        net.masterthought.cucumber.generators.OverviewReport overviewReport0 = new net.masterthought.cucumber.generators.OverviewReport();
        overviewReport0.incDurationBy((long) (byte) 0);
        int int3 = overviewReport0.getPassedSteps();
        int int4 = overviewReport0.getPassedSteps();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod0 = net.masterthought.cucumber.reducers.ReducingMethod.MERGE_FEATURES_WITH_RETEST;
        org.junit.Assert.assertTrue("'" + reducingMethod0 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.MERGE_FEATURES_WITH_RETEST + "'", reducingMethod0.equals(net.masterthought.cucumber.reducers.ReducingMethod.MERGE_FEATURES_WITH_RETEST));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = tagsDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.Tag[]> tagArrayJsonDeserializer3 = tagsDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = tagArrayJsonDeserializer3.getEmptyValue(deserializationContext4);
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer6 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        java.lang.Class<?> wildcardClass7 = embeddingDeserializer6.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = embeddingDeserializer6.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = embeddingDeserializer6.getEmptyValue(deserializationContext9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = tagArrayJsonDeserializer3.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.Embedding>) embeddingDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(tagArrayJsonDeserializer3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        net.masterthought.cucumber.json.Embedding embedding2 = embeddingDeserializer0.getNullValue(deserializationContext1);
        net.masterthought.cucumber.json.Embedding embedding3 = embeddingDeserializer0.getNullValue();
        org.junit.Assert.assertNull(embedding2);
        org.junit.Assert.assertNull(embedding3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        net.masterthought.cucumber.json.Result result3 = step0.getResult();
        java.lang.Integer int4 = step0.getLine();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        net.masterthought.cucumber.json.Embedding embedding2 = embeddingDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = embeddingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = null;
        net.masterthought.cucumber.json.Step step5 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status6 = step5.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray7 = step5.getOutputs();
        java.util.List<java.lang.String> strList8 = step5.getComments();
        net.masterthought.cucumber.ReportResult reportResult9 = null;
        java.io.File file10 = null;
        net.masterthought.cucumber.Configuration configuration12 = new net.masterthought.cucumber.Configuration(file10, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage13 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult9, configuration12);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod14 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration12.addReducingMethod(reducingMethod14);
        net.masterthought.cucumber.ReportBuilder reportBuilder16 = new net.masterthought.cucumber.ReportBuilder(strList8, configuration12);
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.Embedding embedding17 = embeddingDeserializer0.deserialize(jsonNode4, configuration12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(embedding2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(status6);
        org.junit.Assert.assertNotNull(outputArray7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + reducingMethod14 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod14.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        java.lang.String[] strArray6 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        configuration3.addCustomJsFiles((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = configuration3.getQualifier("20 Nov 2023, 03:00");
        net.masterthought.cucumber.json.Feature feature12 = new net.masterthought.cucumber.json.Feature();
        int int13 = feature12.getFailedSteps();
        net.masterthought.cucumber.generators.FeatureReportPage featureReportPage14 = new net.masterthought.cucumber.generators.FeatureReportPage(reportResult0, configuration3, feature12);
        featureReportPage14.prepareReport();
        java.lang.String str16 = featureReportPage14.getWebPage();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.String str1 = feature0.getDescription();
        net.masterthought.cucumber.json.support.Status status2 = feature0.getStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(status2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        net.masterthought.cucumber.generators.OverviewReport overviewReport0 = new net.masterthought.cucumber.generators.OverviewReport();
        overviewReport0.incDurationBy((long) (byte) 0);
        java.lang.String str3 = overviewReport0.getFormattedDuration();
        int int4 = overviewReport0.getPassedFeatures();
        long long5 = overviewReport0.getDuration();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.000" + "'", str3, "0.000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = commentsDeserializer0.getNullAccessPattern();
        java.util.List<java.lang.String> strList2 = commentsDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList5 = commentsDeserializer0.deserialize(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        net.masterthought.cucumber.json.DocString docString0 = new net.masterthought.cucumber.json.DocString();
        java.lang.String str1 = docString0.getValue();
        java.lang.String str2 = docString0.getValue();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        net.masterthought.cucumber.ValidationException validationException1 = new net.masterthought.cucumber.ValidationException("0");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        net.masterthought.cucumber.json.Result result3 = step0.getResult();
        step0.setMetaData();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(result3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = status1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(status1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.io.File file0 = null;
        net.masterthought.cucumber.Configuration configuration2 = new net.masterthought.cucumber.Configuration(file0, "overview-tags.html");
        java.lang.String[] strArray5 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        configuration2.addCustomJsFiles((java.util.List<java.lang.String>) strList6);
        java.lang.String str10 = configuration2.getQualifier("20 Nov 2023, 03:00");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = configuration2.getClassifications();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strEntryList11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        net.masterthought.cucumber.Trends trends0 = new net.masterthought.cucumber.Trends();
        net.masterthought.cucumber.generators.OverviewReport overviewReport2 = new net.masterthought.cucumber.generators.OverviewReport();
        overviewReport2.incDurationBy((long) (byte) 0);
        java.lang.String str5 = overviewReport2.getFormattedDuration();
        trends0.addBuild("overview-features.html", (net.masterthought.cucumber.Reportable) overviewReport2);
        int int7 = overviewReport2.getUndefinedSteps();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.000" + "'", str5, "0.000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = commentsDeserializer0.getNullAccessPattern();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern2 = commentsDeserializer0.getNullAccessPattern();
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
        org.junit.Assert.assertTrue("'" + accessPattern2 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern2.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int1 = feature0.getLine();
        int int2 = feature0.getFailedScenarios();
        net.masterthought.cucumber.json.support.Status status3 = feature0.getStatus();
        int int4 = feature0.getScenarios();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(status3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = commentsDeserializer0.getNullAccessPattern();
        java.util.List<java.lang.String> strList2 = commentsDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = commentsDeserializer0.findBackReference("0.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot handle managed/back reference '0.000': type: value deserializer of type net.masterthought.cucumber.json.deserializers.CommentsDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = tagsDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection2 = tagsDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = tagsDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        java.lang.Class<?> wildcardClass1 = embeddingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = embeddingDeserializer0.getAbsentValue(deserializationContext2);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.Embedding embedding6 = embeddingDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int1 = feature0.getLine();
        int int2 = feature0.getFailedScenarios();
        net.masterthought.cucumber.json.Element[] elementArray3 = feature0.getElements();
        feature0.setQualifier("net.masterthought.cucumber.ValidationException: overview-tags.html");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(elementArray3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        net.masterthought.cucumber.json.Embedding embedding2 = embeddingDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = embeddingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = embeddingDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(embedding2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int1 = feature0.getLine();
        int int2 = feature0.getFailedScenarios();
        net.masterthought.cucumber.json.Element[] elementArray3 = feature0.getElements();
        java.lang.String str4 = feature0.getDescription();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(elementArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage4 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult0, configuration3);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod5 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration3.addReducingMethod(reducingMethod5);
        java.io.File file7 = null;
        configuration3.setTrendsStatsFile(file7);
        boolean boolean9 = configuration3.isTrendsAvailable();
        org.junit.Assert.assertTrue("'" + reducingMethod5 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod5.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        net.masterthought.cucumber.Trends trends0 = new net.masterthought.cucumber.Trends();
        int[] intArray1 = trends0.getPendingSteps();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = tagsDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.Tag[]> tagArrayJsonDeserializer3 = tagsDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = tagArrayJsonDeserializer3.getEmptyValue(deserializationContext4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = tagArrayJsonDeserializer3.findBackReference("overview-tags.html");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot handle managed/back reference 'overview-tags.html': type: value deserializer of type net.masterthought.cucumber.json.deserializers.TagsDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(tagArrayJsonDeserializer3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        net.masterthought.cucumber.util.Counter counter0 = new net.masterthought.cucumber.util.Counter();
        java.lang.String str1 = counter0.toString();
        counter0.decrement();
        int int3 = counter0.intValue();
        net.masterthought.cucumber.util.Counter counter4 = new net.masterthought.cucumber.util.Counter();
        int int5 = counter4.getAndIncrement();
        int int6 = counter0.compareTo((org.apache.commons.lang3.mutable.MutableInt) counter4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        java.io.File file2 = null;
        net.masterthought.cucumber.Configuration configuration4 = new net.masterthought.cucumber.Configuration(file2, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage5 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult1, configuration4);
        java.util.List<net.masterthought.cucumber.reducers.ReducingMethod> reducingMethodList6 = configuration4.getReducingMethods();
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage7 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult0, configuration4);
        net.masterthought.cucumber.presentation.PresentationMode presentationMode8 = net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS;
        boolean boolean9 = configuration4.containsPresentationMode(presentationMode8);
        net.masterthought.cucumber.ReportResult reportResult10 = null;
        java.io.File file11 = null;
        net.masterthought.cucumber.Configuration configuration13 = new net.masterthought.cucumber.Configuration(file11, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage14 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult10, configuration13);
        java.io.File file15 = configuration13.getReportDirectory();
        java.util.List<java.lang.String> strList16 = configuration13.getCustomJsFiles();
        configuration4.addClassificationFiles(strList16);
        org.junit.Assert.assertNotNull(reducingMethodList6);
        org.junit.Assert.assertTrue("'" + presentationMode8 + "' != '" + net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS + "'", presentationMode8.equals(net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        net.masterthought.cucumber.util.Counter counter0 = new net.masterthought.cucumber.util.Counter();
        java.lang.String str1 = counter0.toString();
        double double2 = counter0.doubleValue();
        int int4 = counter0.getAndAdd((java.lang.Number) 0.0f);
        int int6 = counter0.addAndGet((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        net.masterthought.cucumber.generators.OverviewReport overviewReport0 = new net.masterthought.cucumber.generators.OverviewReport();
        overviewReport0.incDurationBy((long) (byte) 0);
        java.lang.String str3 = overviewReport0.getFormattedDuration();
        net.masterthought.cucumber.json.support.StatusCounter statusCounter4 = new net.masterthought.cucumber.json.support.StatusCounter();
        net.masterthought.cucumber.json.support.Status status5 = net.masterthought.cucumber.json.support.Status.SKIPPED;
        statusCounter4.incrementFor(status5);
        java.lang.String str7 = status5.getRawName();
        overviewReport0.incStepsFor(status5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.000" + "'", str3, "0.000");
        org.junit.Assert.assertTrue("'" + status5 + "' != '" + net.masterthought.cucumber.json.support.Status.SKIPPED + "'", status5.equals(net.masterthought.cucumber.json.support.Status.SKIPPED));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "skipped" + "'", str7, "skipped");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.io.File file0 = null;
        net.masterthought.cucumber.Configuration configuration2 = new net.masterthought.cucumber.Configuration(file0, "overview-tags.html");
        java.lang.String[] strArray5 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        configuration2.addCustomJsFiles((java.util.List<java.lang.String>) strList6);
        net.masterthought.cucumber.ReportResult reportResult9 = null;
        java.io.File file10 = null;
        net.masterthought.cucumber.Configuration configuration12 = new net.masterthought.cucumber.Configuration(file10, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage13 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult9, configuration12);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod14 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration12.addReducingMethod(reducingMethod14);
        boolean boolean16 = configuration2.containsReducingMethod(reducingMethod14);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + reducingMethod14 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod14.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        net.masterthought.cucumber.json.support.TagObject tagObject1 = new net.masterthought.cucumber.json.support.TagObject("overview-trends.html");
        java.lang.String str2 = tagObject1.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = tagObject1.getFailedFeatures();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Code is not implemented");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "overview-trends.html" + "'", str2, "overview-trends.html");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        net.masterthought.cucumber.Trends trends0 = new net.masterthought.cucumber.Trends();
        int[] intArray1 = trends0.getTotalSteps();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        net.masterthought.cucumber.json.support.Status status1 = element0.getBeforeStatus();
        org.junit.Assert.assertNull(status1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        java.io.File file2 = null;
        net.masterthought.cucumber.Configuration configuration4 = new net.masterthought.cucumber.Configuration(file2, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage5 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult1, configuration4);
        java.io.File file6 = configuration4.getReportDirectory();
        java.util.List<java.lang.String> strList7 = configuration4.getCustomJsFiles();
        net.masterthought.cucumber.generators.StepsOverviewPage stepsOverviewPage8 = new net.masterthought.cucumber.generators.StepsOverviewPage(reportResult0, configuration4);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        net.masterthought.cucumber.json.Result result3 = step0.getResult();
        net.masterthought.cucumber.json.Output[] outputArray4 = step0.getOutputs();
        net.masterthought.cucumber.json.DocString docString5 = step0.getDocString();
        net.masterthought.cucumber.json.Hook[] hookArray6 = step0.getAfter();
        net.masterthought.cucumber.json.support.Status status7 = step0.getBeforeStatus();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertNotNull(outputArray4);
        org.junit.Assert.assertNull(docString5);
        org.junit.Assert.assertNotNull(hookArray6);
        org.junit.Assert.assertNull(status7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        java.lang.Boolean boolean2 = tagsDeserializer0.supportsUpdate(deserializationConfig1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = tagsDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = tagsDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = tagsDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(wildcardClass4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Embedding[] embeddingArray2 = step0.getEmbeddings();
        net.masterthought.cucumber.json.support.Status status3 = step0.getBeforeStatus();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(embeddingArray2);
        org.junit.Assert.assertNull(status3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = tagsDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.Tag[]> tagArrayJsonDeserializer3 = tagsDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern4 = tagArrayJsonDeserializer3.getNullAccessPattern();
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(tagArrayJsonDeserializer3);
        org.junit.Assert.assertTrue("'" + accessPattern4 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern4.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        net.masterthought.cucumber.json.Hook[] hookArray1 = element0.getAfter();
        java.lang.String str2 = element0.getType();
        org.junit.Assert.assertNotNull(hookArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        net.masterthought.cucumber.json.Feature feature2 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int3 = feature2.getLine();
        net.masterthought.cucumber.ReportResult reportResult4 = null;
        java.io.File file5 = null;
        net.masterthought.cucumber.Configuration configuration7 = new net.masterthought.cucumber.Configuration(file5, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage8 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult4, configuration7);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod9 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration7.addReducingMethod(reducingMethod9);
        java.io.File file11 = null;
        configuration7.setTrendsStatsFile(file11);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod13 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        boolean boolean14 = configuration7.containsReducingMethod(reducingMethod13);
        element0.setMetaData(feature2, configuration7);
        java.lang.Class<?> wildcardClass16 = configuration7.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + reducingMethod9 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod9.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + reducingMethod13 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod13.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        java.io.File file0 = null;
        net.masterthought.cucumber.Configuration configuration2 = new net.masterthought.cucumber.Configuration(file0, "overview-tags.html");
        configuration2.addClassifications("hi!", "0.000");
        java.io.File file6 = configuration2.getReportDirectory();
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = tagsDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.Tag[]> tagArrayJsonDeserializer3 = tagsDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = tagArrayJsonDeserializer3.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern6 = tagArrayJsonDeserializer3.getNullAccessPattern();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = tagArrayJsonDeserializer3.getEmptyValue(deserializationContext7);
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer9 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        boolean boolean10 = embeddingDeserializer9.isCachable();
        net.masterthought.cucumber.json.Embedding embedding11 = embeddingDeserializer9.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = embeddingDeserializer9.getObjectIdReader();
        java.lang.Object obj13 = embeddingDeserializer9.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = tagArrayJsonDeserializer3.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.Embedding>) embeddingDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(tagArrayJsonDeserializer3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + accessPattern6 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern6.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(embedding11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = commentsDeserializer0.getNullAccessPattern();
        java.util.List<java.lang.String> strList2 = commentsDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = commentsDeserializer0.getObjectIdReader();
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        net.masterthought.cucumber.json.Feature feature2 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int3 = feature2.getLine();
        net.masterthought.cucumber.ReportResult reportResult4 = null;
        java.io.File file5 = null;
        net.masterthought.cucumber.Configuration configuration7 = new net.masterthought.cucumber.Configuration(file5, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage8 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult4, configuration7);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod9 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration7.addReducingMethod(reducingMethod9);
        java.io.File file11 = null;
        configuration7.setTrendsStatsFile(file11);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod13 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        boolean boolean14 = configuration7.containsReducingMethod(reducingMethod13);
        element0.setMetaData(feature2, configuration7);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = feature2.getPassedFeatures();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + reducingMethod9 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod9.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + reducingMethod13 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod13.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        java.lang.String[] strArray6 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        configuration3.addCustomJsFiles((java.util.List<java.lang.String>) strList7);
        net.masterthought.cucumber.json.support.TagObject tagObject11 = new net.masterthought.cucumber.json.support.TagObject("overview-trends.html");
        net.masterthought.cucumber.generators.TagReportPage tagReportPage12 = new net.masterthought.cucumber.generators.TagReportPage(reportResult0, configuration3, tagObject11);
        int int13 = tagObject11.getPassedSteps();
        java.util.List<net.masterthought.cucumber.json.Element> elementList14 = tagObject11.getElements();
        int int15 = tagObject11.getScenarios();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elementList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage4 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult0, configuration3);
        java.io.File file5 = configuration3.getReportDirectory();
        java.util.List<java.lang.String> strList6 = configuration3.getCustomJsFiles();
        int int7 = configuration3.getTrendsLimit();
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        java.lang.Class<?> wildcardClass1 = embeddingDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = embeddingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = embeddingDeserializer0.getEmptyValue(deserializationContext3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = embeddingDeserializer0.findBackReference("overview-steps.html");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot handle managed/back reference 'overview-steps.html': type: value deserializer of type net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        net.masterthought.cucumber.json.support.Status status0 = net.masterthought.cucumber.json.support.Status.PASSED;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status0.equals(net.masterthought.cucumber.json.support.Status.PASSED));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int1 = feature0.getLine();
        java.lang.String str2 = feature0.getDescription();
        int int3 = feature0.getPendingSteps();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        net.masterthought.cucumber.json.Row[] rowArray3 = step0.getRows();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(rowArray3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        net.masterthought.cucumber.json.support.TagObject tagObject1 = new net.masterthought.cucumber.json.support.TagObject("overview-trends.html");
        java.lang.String str2 = tagObject1.getName();
        int int3 = tagObject1.getPassedScenarios();
        java.lang.String str4 = tagObject1.getReportFileName();
        java.lang.String str5 = tagObject1.getRawStatus();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "overview-trends.html" + "'", str2, "overview-trends.html");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "report-tag_834779598.html" + "'", str4, "report-tag_834779598.html");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "passed" + "'", str5, "passed");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        net.masterthought.cucumber.json.Result result3 = step0.getResult();
        long long4 = step0.getDuration();
        java.lang.Integer int5 = step0.getLine();
        net.masterthought.cucumber.json.Row[] rowArray6 = step0.getRows();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(rowArray6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        net.masterthought.cucumber.json.Result result3 = step0.getResult();
        long long4 = step0.getDuration();
        java.lang.Integer int5 = step0.getLine();
        net.masterthought.cucumber.json.support.Status status6 = step0.getBeforeStatus();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(status6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.String str1 = feature0.getDescription();
        int int2 = feature0.getFailedScenarios();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        net.masterthought.cucumber.json.support.Status status2 = element0.getStepsStatus();
        net.masterthought.cucumber.json.Element element3 = new net.masterthought.cucumber.json.Element();
        java.lang.String str4 = element3.getId();
        net.masterthought.cucumber.json.Feature feature5 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int6 = feature5.getLine();
        net.masterthought.cucumber.ReportResult reportResult7 = null;
        java.io.File file8 = null;
        net.masterthought.cucumber.Configuration configuration10 = new net.masterthought.cucumber.Configuration(file8, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage11 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult7, configuration10);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod12 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration10.addReducingMethod(reducingMethod12);
        java.io.File file14 = null;
        configuration10.setTrendsStatsFile(file14);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod16 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        boolean boolean17 = configuration10.containsReducingMethod(reducingMethod16);
        element3.setMetaData(feature5, configuration10);
        java.io.File file19 = null;
        net.masterthought.cucumber.Configuration configuration21 = new net.masterthought.cucumber.Configuration(file19, "overview-tags.html");
        element0.setMetaData(feature5, configuration21);
        net.masterthought.cucumber.Configuration configuration24 = null;
        // The following exception was thrown during execution in test generation
        try {
            feature5.setMetaData((int) (short) 0, configuration24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(status2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + reducingMethod12 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod12.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + reducingMethod16 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod16.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        java.io.File file2 = null;
        net.masterthought.cucumber.Configuration configuration4 = new net.masterthought.cucumber.Configuration(file2, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage5 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult1, configuration4);
        java.util.List<net.masterthought.cucumber.reducers.ReducingMethod> reducingMethodList6 = configuration4.getReducingMethods();
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage7 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult0, configuration4);
        java.io.File file8 = configuration4.getReportDirectory();
        org.junit.Assert.assertNotNull(reducingMethodList6);
        org.junit.Assert.assertNull(file8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        java.io.File file2 = null;
        net.masterthought.cucumber.Configuration configuration4 = new net.masterthought.cucumber.Configuration(file2, "overview-tags.html");
        java.lang.String[] strArray7 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        configuration4.addCustomJsFiles((java.util.List<java.lang.String>) strList8);
        java.lang.String str12 = configuration4.getQualifier("20 Nov 2023, 03:00");
        net.masterthought.cucumber.json.Feature feature13 = new net.masterthought.cucumber.json.Feature();
        int int14 = feature13.getFailedSteps();
        net.masterthought.cucumber.generators.FeatureReportPage featureReportPage15 = new net.masterthought.cucumber.generators.FeatureReportPage(reportResult1, configuration4, feature13);
        net.masterthought.cucumber.ValidationException validationException17 = new net.masterthought.cucumber.ValidationException("overview-tags.html");
        net.masterthought.cucumber.ValidationException validationException19 = new net.masterthought.cucumber.ValidationException("overview-tags.html");
        validationException17.addSuppressed((java.lang.Throwable) validationException19);
        net.masterthought.cucumber.ReportResult reportResult21 = null;
        java.io.File file22 = null;
        net.masterthought.cucumber.Configuration configuration24 = new net.masterthought.cucumber.Configuration(file22, "0");
        configuration24.setDirectorySuffix("0.000");
        net.masterthought.cucumber.ValidationException validationException29 = new net.masterthought.cucumber.ValidationException("overview-tags.html");
        net.masterthought.cucumber.ValidationException validationException30 = new net.masterthought.cucumber.ValidationException("overview-failures.html", (java.lang.Throwable) validationException29);
        net.masterthought.cucumber.ReportResult reportResult31 = null;
        net.masterthought.cucumber.ReportResult reportResult32 = null;
        java.io.File file33 = null;
        net.masterthought.cucumber.Configuration configuration35 = new net.masterthought.cucumber.Configuration(file33, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage36 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult32, configuration35);
        java.util.List<net.masterthought.cucumber.reducers.ReducingMethod> reducingMethodList37 = configuration35.getReducingMethods();
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage38 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult31, configuration35);
        net.masterthought.cucumber.presentation.PresentationMode presentationMode39 = net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS;
        boolean boolean40 = configuration35.containsPresentationMode(presentationMode39);
        java.util.List<java.lang.String> strList41 = configuration35.getCustomCssFiles();
        net.masterthought.cucumber.generators.ErrorPage errorPage42 = new net.masterthought.cucumber.generators.ErrorPage(reportResult21, configuration24, (java.lang.Exception) validationException30, strList41);
        net.masterthought.cucumber.generators.ErrorPage errorPage43 = new net.masterthought.cucumber.generators.ErrorPage(reportResult0, configuration4, (java.lang.Exception) validationException19, strList41);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(reducingMethodList37);
        org.junit.Assert.assertTrue("'" + presentationMode39 + "' != '" + net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS + "'", presentationMode39.equals(net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strList41);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        net.masterthought.cucumber.json.Feature feature2 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int3 = feature2.getLine();
        net.masterthought.cucumber.ReportResult reportResult4 = null;
        java.io.File file5 = null;
        net.masterthought.cucumber.Configuration configuration7 = new net.masterthought.cucumber.Configuration(file5, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage8 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult4, configuration7);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod9 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration7.addReducingMethod(reducingMethod9);
        java.io.File file11 = null;
        configuration7.setTrendsStatsFile(file11);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod13 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        boolean boolean14 = configuration7.containsReducingMethod(reducingMethod13);
        element0.setMetaData(feature2, configuration7);
        net.masterthought.cucumber.json.support.Status status16 = element0.getStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + reducingMethod9 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod9.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + reducingMethod13 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod13.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + status16 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status16.equals(net.masterthought.cucumber.json.support.Status.PASSED));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        java.io.File file2 = null;
        net.masterthought.cucumber.Configuration configuration4 = new net.masterthought.cucumber.Configuration(file2, "overview-tags.html");
        java.lang.String[] strArray7 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        configuration4.addCustomJsFiles((java.util.List<java.lang.String>) strList8);
        net.masterthought.cucumber.json.support.TagObject tagObject12 = new net.masterthought.cucumber.json.support.TagObject("overview-trends.html");
        net.masterthought.cucumber.generators.TagReportPage tagReportPage13 = new net.masterthought.cucumber.generators.TagReportPage(reportResult1, configuration4, tagObject12);
        net.masterthought.cucumber.generators.FeaturesOverviewPage featuresOverviewPage14 = new net.masterthought.cucumber.generators.FeaturesOverviewPage(reportResult0, configuration4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        java.lang.String[] strArray6 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        configuration3.addCustomJsFiles((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = configuration3.getQualifier("20 Nov 2023, 03:00");
        net.masterthought.cucumber.json.Feature feature12 = new net.masterthought.cucumber.json.Feature();
        int int13 = feature12.getFailedSteps();
        net.masterthought.cucumber.generators.FeatureReportPage featureReportPage14 = new net.masterthought.cucumber.generators.FeatureReportPage(reportResult0, configuration3, feature12);
        featureReportPage14.prepareReport();
        java.lang.String str16 = featureReportPage14.getWebPage();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        net.masterthought.cucumber.json.Embedding embedding2 = embeddingDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = embeddingDeserializer0.getAbsentValue(deserializationContext3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.Embedding embedding7 = embeddingDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(embedding2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        java.lang.Class<?> wildcardClass1 = embeddingDeserializer0.handledType();
        com.fasterxml.jackson.databind.type.LogicalType logicalType2 = embeddingDeserializer0.logicalType();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.Embedding embedding5 = embeddingDeserializer0.deserialize(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(logicalType2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = commentsDeserializer0.getNullAccessPattern();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = commentsDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.util.List<java.lang.String> strList5 = commentsDeserializer0.getNullValue(deserializationContext4);
        java.lang.Object obj6 = commentsDeserializer0.getEmptyValue();
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.io.File file0 = null;
        net.masterthought.cucumber.Configuration configuration2 = new net.masterthought.cucumber.Configuration(file0, "0");
        configuration2.setDirectorySuffix("0.000");
        net.masterthought.cucumber.presentation.PresentationMode presentationMode5 = net.masterthought.cucumber.presentation.PresentationMode.PARALLEL_TESTING;
        boolean boolean6 = configuration2.containsPresentationMode(presentationMode5);
        org.junit.Assert.assertTrue("'" + presentationMode5 + "' != '" + net.masterthought.cucumber.presentation.PresentationMode.PARALLEL_TESTING + "'", presentationMode5.equals(net.masterthought.cucumber.presentation.PresentationMode.PARALLEL_TESTING));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        net.masterthought.cucumber.generators.OverviewReport overviewReport0 = new net.masterthought.cucumber.generators.OverviewReport();
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.support.Status status1 = overviewReport0.getStatus();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Code is not implemented");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.lang.String str0 = net.masterthought.cucumber.ReportBuilder.BASE_DIRECTORY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cucumber-html-reports" + "'", str0, "cucumber-html-reports");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        net.masterthought.cucumber.util.Counter counter0 = new net.masterthought.cucumber.util.Counter();
        java.lang.String str1 = counter0.toString();
        counter0.decrement();
        int int3 = counter0.intValue();
        counter0.add((java.lang.Number) 100.0f);
        int int7 = counter0.getAndAdd(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        net.masterthought.cucumber.util.Counter counter0 = new net.masterthought.cucumber.util.Counter();
        counter0.setValue((java.lang.Number) (-1L));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        java.io.File file2 = null;
        net.masterthought.cucumber.Configuration configuration4 = new net.masterthought.cucumber.Configuration(file2, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage5 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult1, configuration4);
        java.util.List<net.masterthought.cucumber.reducers.ReducingMethod> reducingMethodList6 = configuration4.getReducingMethods();
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage7 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult0, configuration4);
        net.masterthought.cucumber.presentation.PresentationMode presentationMode8 = net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS;
        boolean boolean9 = configuration4.containsPresentationMode(presentationMode8);
        java.util.List<java.lang.String> strList10 = configuration4.getCustomCssFiles();
        configuration4.removeQualifier("hi!");
        java.lang.String str13 = configuration4.getBuildNumber();
        org.junit.Assert.assertNotNull(reducingMethodList6);
        org.junit.Assert.assertTrue("'" + presentationMode8 + "' != '" + net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS + "'", presentationMode8.equals(net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        net.masterthought.cucumber.json.support.Argument[] argumentArray1 = new net.masterthought.cucumber.json.support.Argument[] {};
        java.lang.String str4 = net.masterthought.cucumber.util.StepNameFormatter.format("20 Nov 2023, 03:00", argumentArray1, "skipped", "report-tag_834779598.html");
        org.junit.Assert.assertNotNull(argumentArray1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "20 Nov 2023, 03:00" + "'", str4, "20 Nov 2023, 03:00");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        net.masterthought.cucumber.json.deserializers.StatusDeserializer statusDeserializer0 = new net.masterthought.cucumber.json.deserializers.StatusDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = null;
        net.masterthought.cucumber.ReportResult reportResult2 = null;
        java.io.File file3 = null;
        net.masterthought.cucumber.Configuration configuration5 = new net.masterthought.cucumber.Configuration(file3, "overview-tags.html");
        java.lang.String[] strArray8 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        configuration5.addCustomJsFiles((java.util.List<java.lang.String>) strList9);
        java.lang.String str13 = configuration5.getQualifier("20 Nov 2023, 03:00");
        net.masterthought.cucumber.json.Feature feature14 = new net.masterthought.cucumber.json.Feature();
        int int15 = feature14.getFailedSteps();
        net.masterthought.cucumber.generators.FeatureReportPage featureReportPage16 = new net.masterthought.cucumber.generators.FeatureReportPage(reportResult2, configuration5, feature14);
        java.util.Collection<java.util.regex.Pattern> patternCollection17 = configuration5.getTagsToExcludeFromChart();
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.support.Status status18 = statusDeserializer0.deserialize(jsonNode1, configuration5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(patternCollection17);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        net.masterthought.cucumber.ValidationException validationException1 = new net.masterthought.cucumber.ValidationException("report-tag_2193230705.html");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        net.masterthought.cucumber.json.Hook[] hookArray3 = step0.getAfter();
        java.lang.String str4 = step0.getName();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(hookArray3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        java.lang.String str2 = element0.getType();
        long long3 = element0.getDuration();
        net.masterthought.cucumber.json.Feature feature4 = null;
        java.io.File file5 = null;
        net.masterthought.cucumber.Configuration configuration7 = new net.masterthought.cucumber.Configuration(file5, "overview-tags.html");
        java.lang.String[] strArray10 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        configuration7.addCustomJsFiles((java.util.List<java.lang.String>) strList11);
        java.lang.String str15 = configuration7.getQualifier("20 Nov 2023, 03:00");
        configuration7.setQualifier("", "hi!");
        element0.setMetaData(feature4, configuration7);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        java.io.File file2 = null;
        net.masterthought.cucumber.Configuration configuration4 = new net.masterthought.cucumber.Configuration(file2, "0");
        configuration4.setDirectorySuffix("0.000");
        net.masterthought.cucumber.ValidationException validationException9 = new net.masterthought.cucumber.ValidationException("overview-tags.html");
        net.masterthought.cucumber.ValidationException validationException10 = new net.masterthought.cucumber.ValidationException("overview-failures.html", (java.lang.Throwable) validationException9);
        net.masterthought.cucumber.ReportResult reportResult11 = null;
        net.masterthought.cucumber.ReportResult reportResult12 = null;
        java.io.File file13 = null;
        net.masterthought.cucumber.Configuration configuration15 = new net.masterthought.cucumber.Configuration(file13, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage16 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult12, configuration15);
        java.util.List<net.masterthought.cucumber.reducers.ReducingMethod> reducingMethodList17 = configuration15.getReducingMethods();
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage18 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult11, configuration15);
        net.masterthought.cucumber.presentation.PresentationMode presentationMode19 = net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS;
        boolean boolean20 = configuration15.containsPresentationMode(presentationMode19);
        java.util.List<java.lang.String> strList21 = configuration15.getCustomCssFiles();
        net.masterthought.cucumber.generators.ErrorPage errorPage22 = new net.masterthought.cucumber.generators.ErrorPage(reportResult1, configuration4, (java.lang.Exception) validationException10, strList21);
        net.masterthought.cucumber.json.Feature feature23 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int24 = feature23.getLine();
        long long25 = feature23.getDuration();
        long long26 = feature23.getDuration();
        net.masterthought.cucumber.generators.FeatureReportPage featureReportPage27 = new net.masterthought.cucumber.generators.FeatureReportPage(reportResult0, configuration4, feature23);
        org.junit.Assert.assertNotNull(reducingMethodList17);
        org.junit.Assert.assertTrue("'" + presentationMode19 + "' != '" + net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS + "'", presentationMode19.equals(net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        net.masterthought.cucumber.json.support.StepObject stepObject1 = new net.masterthought.cucumber.json.support.StepObject("report-tag_2193230705.html");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = stepObject1.getAverageDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        boolean boolean1 = embeddingDeserializer0.isCachable();
        net.masterthought.cucumber.json.Embedding embedding2 = embeddingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = embeddingDeserializer0.getObjectIdReader();
        java.lang.Object obj4 = embeddingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = embeddingDeserializer0.getEmptyValue(deserializationContext5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(embedding2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        net.masterthought.cucumber.generators.OverviewReport overviewReport0 = new net.masterthought.cucumber.generators.OverviewReport();
        overviewReport0.incDurationBy((long) (byte) 0);
        java.lang.String str3 = overviewReport0.getFormattedDuration();
        int int4 = overviewReport0.getPassedFeatures();
        int int5 = overviewReport0.getPassedSteps();
        int int6 = overviewReport0.getPendingSteps();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.000" + "'", str3, "0.000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        net.masterthought.cucumber.generators.OverviewReport overviewReport0 = new net.masterthought.cucumber.generators.OverviewReport();
        overviewReport0.incDurationBy((long) (byte) 0);
        java.lang.String str3 = overviewReport0.getFormattedDuration();
        net.masterthought.cucumber.json.support.Status status4 = net.masterthought.cucumber.json.support.Status.SKIPPED;
        overviewReport0.incFeaturesFor(status4);
        int int6 = overviewReport0.getPassedSteps();
        int int7 = overviewReport0.getFailedScenarios();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.000" + "'", str3, "0.000");
        org.junit.Assert.assertTrue("'" + status4 + "' != '" + net.masterthought.cucumber.json.support.Status.SKIPPED + "'", status4.equals(net.masterthought.cucumber.json.support.Status.SKIPPED));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.lang.String str2 = net.masterthought.cucumber.util.Util.formatAsDecimal((-1), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.00" + "'", str2, "0.00");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        java.lang.String[] strArray6 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        configuration3.addCustomJsFiles((java.util.List<java.lang.String>) strList7);
        net.masterthought.cucumber.json.support.TagObject tagObject11 = new net.masterthought.cucumber.json.support.TagObject("overview-trends.html");
        net.masterthought.cucumber.generators.TagReportPage tagReportPage12 = new net.masterthought.cucumber.generators.TagReportPage(reportResult0, configuration3, tagObject11);
        java.lang.String str13 = tagReportPage12.getWebPage();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "report-tag_834779598.html" + "'", str13, "report-tag_834779598.html");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        net.masterthought.cucumber.json.support.StepObject stepObject1 = new net.masterthought.cucumber.json.support.StepObject("report-tag_2193230705.html");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = stepObject1.getFormattedAverageDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        net.masterthought.cucumber.json.Result result0 = new net.masterthought.cucumber.json.Result();
        net.masterthought.cucumber.json.support.Status status1 = result0.getStatus();
        org.junit.Assert.assertTrue("'" + status1 + "' != '" + net.masterthought.cucumber.json.support.Status.UNDEFINED + "'", status1.equals(net.masterthought.cucumber.json.support.Status.UNDEFINED));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        java.lang.String[] strArray6 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        configuration3.addCustomJsFiles((java.util.List<java.lang.String>) strList7);
        net.masterthought.cucumber.json.support.TagObject tagObject11 = new net.masterthought.cucumber.json.support.TagObject("overview-trends.html");
        net.masterthought.cucumber.generators.TagReportPage tagReportPage12 = new net.masterthought.cucumber.generators.TagReportPage(reportResult0, configuration3, tagObject11);
        int int13 = tagObject11.getPassedSteps();
        java.util.List<net.masterthought.cucumber.json.Element> elementList14 = tagObject11.getElements();
        int int15 = tagObject11.getSkippedSteps();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(elementList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator tagObjectAlphabeticalComparator0 = new net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator();
        net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator tagObjectAlphabeticalComparator1 = new net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator();
        java.util.Comparator<net.masterthought.cucumber.json.support.TagObject> tagObjectComparator2 = tagObjectAlphabeticalComparator0.thenComparing((java.util.Comparator<net.masterthought.cucumber.json.support.TagObject>) tagObjectAlphabeticalComparator1);
        net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator tagObjectAlphabeticalComparator3 = new net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator();
        java.util.Comparator<net.masterthought.cucumber.json.support.TagObject> tagObjectComparator4 = tagObjectComparator2.thenComparing((java.util.Comparator<net.masterthought.cucumber.json.support.TagObject>) tagObjectAlphabeticalComparator3);
        org.junit.Assert.assertNotNull(tagObjectComparator2);
        org.junit.Assert.assertNotNull(tagObjectComparator4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = embeddingDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int1 = feature0.getLine();
        long long2 = feature0.getDuration();
        int int3 = feature0.getScenarios();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        boolean boolean1 = embeddingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = embeddingDeserializer0.getObjectIdReader();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(objectIdReader2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        net.masterthought.cucumber.json.support.Status status2 = element0.getStepsStatus();
        net.masterthought.cucumber.json.Element element3 = new net.masterthought.cucumber.json.Element();
        java.lang.String str4 = element3.getId();
        net.masterthought.cucumber.json.Feature feature5 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int6 = feature5.getLine();
        net.masterthought.cucumber.ReportResult reportResult7 = null;
        java.io.File file8 = null;
        net.masterthought.cucumber.Configuration configuration10 = new net.masterthought.cucumber.Configuration(file8, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage11 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult7, configuration10);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod12 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration10.addReducingMethod(reducingMethod12);
        java.io.File file14 = null;
        configuration10.setTrendsStatsFile(file14);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod16 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        boolean boolean17 = configuration10.containsReducingMethod(reducingMethod16);
        element3.setMetaData(feature5, configuration10);
        java.io.File file19 = null;
        net.masterthought.cucumber.Configuration configuration21 = new net.masterthought.cucumber.Configuration(file19, "overview-tags.html");
        element0.setMetaData(feature5, configuration21);
        java.lang.String str23 = feature5.getFormattedDuration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(status2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + reducingMethod12 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod12.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + reducingMethod16 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod16.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0.000" + "'", str23, "0.000");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.io.File file0 = null;
        net.masterthought.cucumber.Configuration configuration2 = new net.masterthought.cucumber.Configuration(file0, "overview-tags.html");
        java.lang.String[] strArray5 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        configuration2.addCustomJsFiles((java.util.List<java.lang.String>) strList6);
        net.masterthought.cucumber.presentation.PresentationMode presentationMode9 = net.masterthought.cucumber.presentation.PresentationMode.RUN_WITH_JENKINS;
        configuration2.addPresentationModes(presentationMode9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + presentationMode9 + "' != '" + net.masterthought.cucumber.presentation.PresentationMode.RUN_WITH_JENKINS + "'", presentationMode9.equals(net.masterthought.cucumber.presentation.PresentationMode.RUN_WITH_JENKINS));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        net.masterthought.cucumber.json.deserializers.StatusDeserializer statusDeserializer0 = new net.masterthought.cucumber.json.deserializers.StatusDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = statusDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = statusDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        net.masterthought.cucumber.json.support.Status status5 = net.masterthought.cucumber.json.support.Status.FAILED;
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.support.Status status6 = statusDeserializer0.deserialize(jsonParser3, deserializationContext4, status5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + status5 + "' != '" + net.masterthought.cucumber.json.support.Status.FAILED + "'", status5.equals(net.masterthought.cucumber.json.support.Status.FAILED));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        net.masterthought.cucumber.json.support.StatusCounter statusCounter0 = new net.masterthought.cucumber.json.support.StatusCounter();
        net.masterthought.cucumber.json.support.Status status1 = net.masterthought.cucumber.json.support.Status.SKIPPED;
        statusCounter0.incrementFor(status1);
        net.masterthought.cucumber.json.Element element3 = new net.masterthought.cucumber.json.Element();
        java.lang.String str4 = element3.getId();
        net.masterthought.cucumber.json.support.Status status5 = element3.getStepsStatus();
        net.masterthought.cucumber.json.Element element6 = new net.masterthought.cucumber.json.Element();
        java.lang.String str7 = element6.getId();
        net.masterthought.cucumber.json.Feature feature8 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int9 = feature8.getLine();
        net.masterthought.cucumber.ReportResult reportResult10 = null;
        java.io.File file11 = null;
        net.masterthought.cucumber.Configuration configuration13 = new net.masterthought.cucumber.Configuration(file11, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage14 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult10, configuration13);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod15 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration13.addReducingMethod(reducingMethod15);
        java.io.File file17 = null;
        configuration13.setTrendsStatsFile(file17);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod19 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        boolean boolean20 = configuration13.containsReducingMethod(reducingMethod19);
        element6.setMetaData(feature8, configuration13);
        java.io.File file22 = null;
        net.masterthought.cucumber.Configuration configuration24 = new net.masterthought.cucumber.Configuration(file22, "overview-tags.html");
        element3.setMetaData(feature8, configuration24);
        net.masterthought.cucumber.json.support.Status status26 = element3.getStatus();
        net.masterthought.cucumber.json.support.Status status27 = element3.getBeforeStatus();
        int int28 = statusCounter0.getValueFor(status27);
        org.junit.Assert.assertTrue("'" + status1 + "' != '" + net.masterthought.cucumber.json.support.Status.SKIPPED + "'", status1.equals(net.masterthought.cucumber.json.support.Status.SKIPPED));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(status5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + reducingMethod15 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod15.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + reducingMethod19 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod19.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + status26 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status26.equals(net.masterthought.cucumber.json.support.Status.PASSED));
        org.junit.Assert.assertTrue("'" + status27 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status27.equals(net.masterthought.cucumber.json.support.Status.PASSED));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        net.masterthought.cucumber.Trends trends0 = new net.masterthought.cucumber.Trends();
        net.masterthought.cucumber.generators.OverviewReport overviewReport2 = new net.masterthought.cucumber.generators.OverviewReport();
        overviewReport2.incDurationBy((long) (byte) 0);
        java.lang.String str5 = overviewReport2.getFormattedDuration();
        trends0.addBuild("overview-features.html", (net.masterthought.cucumber.Reportable) overviewReport2);
        int[] intArray7 = trends0.getTotalFeatures();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.000" + "'", str5, "0.000");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.json.Step step1 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status2 = step1.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray3 = step1.getOutputs();
        java.util.List<java.lang.String> strList4 = step1.getComments();
        net.masterthought.cucumber.ReportResult reportResult5 = null;
        java.io.File file6 = null;
        net.masterthought.cucumber.Configuration configuration8 = new net.masterthought.cucumber.Configuration(file6, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage9 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult5, configuration8);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod10 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration8.addReducingMethod(reducingMethod10);
        net.masterthought.cucumber.ReportBuilder reportBuilder12 = new net.masterthought.cucumber.ReportBuilder(strList4, configuration8);
        net.masterthought.cucumber.generators.FailuresOverviewPage failuresOverviewPage13 = new net.masterthought.cucumber.generators.FailuresOverviewPage(reportResult0, configuration8);
        org.junit.Assert.assertNull(status2);
        org.junit.Assert.assertNotNull(outputArray3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + reducingMethod10 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod10.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = commentsDeserializer0.getNullAccessPattern();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = commentsDeserializer0.getEmptyValue(deserializationContext2);
        java.lang.Object obj4 = commentsDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "report-tag_834779598.html", "overview-failures.html", "20 Nov 2023, 03:00", "report-tag_834779598.html", "net.masterthought.cucumber.ValidationException: overview-tags.html", "overview-trends.html", "0.00", "cucumber-html-reports", "overview-tags.html", "cucumber-html-reports", "", "net.masterthought.cucumber.ValidationException: overview-tags.html", "net.masterthought.cucumber.ValidationException: overview-tags.html", "overview-failures.html", "0", "skipped", "overview-tags.html" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList27 = commentsDeserializer0.deserialize(jsonParser5, deserializationContext6, (java.util.List<java.lang.String>) strList25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        java.lang.Class<?> wildcardClass1 = embeddingDeserializer0.handledType();
        com.fasterxml.jackson.databind.type.LogicalType logicalType2 = embeddingDeserializer0.logicalType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = embeddingDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(logicalType2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        net.masterthought.cucumber.Trends trends0 = new net.masterthought.cucumber.Trends();
        java.lang.String[] strArray1 = trends0.getBuildNumbers();
        net.masterthought.cucumber.json.Output output2 = new net.masterthought.cucumber.json.Output(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        java.io.File file2 = null;
        net.masterthought.cucumber.Configuration configuration4 = new net.masterthought.cucumber.Configuration(file2, "0");
        configuration4.setDirectorySuffix("0.000");
        net.masterthought.cucumber.ValidationException validationException9 = new net.masterthought.cucumber.ValidationException("overview-tags.html");
        net.masterthought.cucumber.ValidationException validationException10 = new net.masterthought.cucumber.ValidationException("overview-failures.html", (java.lang.Throwable) validationException9);
        net.masterthought.cucumber.ReportResult reportResult11 = null;
        net.masterthought.cucumber.ReportResult reportResult12 = null;
        java.io.File file13 = null;
        net.masterthought.cucumber.Configuration configuration15 = new net.masterthought.cucumber.Configuration(file13, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage16 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult12, configuration15);
        java.util.List<net.masterthought.cucumber.reducers.ReducingMethod> reducingMethodList17 = configuration15.getReducingMethods();
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage18 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult11, configuration15);
        net.masterthought.cucumber.presentation.PresentationMode presentationMode19 = net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS;
        boolean boolean20 = configuration15.containsPresentationMode(presentationMode19);
        java.util.List<java.lang.String> strList21 = configuration15.getCustomCssFiles();
        net.masterthought.cucumber.generators.ErrorPage errorPage22 = new net.masterthought.cucumber.generators.ErrorPage(reportResult1, configuration4, (java.lang.Exception) validationException10, strList21);
        net.masterthought.cucumber.ValidationException validationException23 = new net.masterthought.cucumber.ValidationException("overview-steps.html", (java.lang.Throwable) validationException10);
        org.junit.Assert.assertNotNull(reducingMethodList17);
        org.junit.Assert.assertTrue("'" + presentationMode19 + "' != '" + net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS + "'", presentationMode19.equals(net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        java.lang.String[] strArray6 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        configuration3.addCustomJsFiles((java.util.List<java.lang.String>) strList7);
        java.lang.String str11 = configuration3.getQualifier("20 Nov 2023, 03:00");
        boolean boolean13 = configuration3.containsQualifier("20 Nov 2023, 03:00");
        configuration3.removeQualifier("overview-steps.html");
        net.masterthought.cucumber.generators.FeaturesOverviewPage featuresOverviewPage16 = new net.masterthought.cucumber.generators.FeaturesOverviewPage(reportResult0, configuration3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int1 = feature0.getLine();
        int int2 = feature0.getFailedScenarios();
        feature0.setQualifier("overview-features.html");
        feature0.setQualifier("");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        net.masterthought.cucumber.json.deserializers.StatusDeserializer statusDeserializer0 = new net.masterthought.cucumber.json.deserializers.StatusDeserializer();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.support.Status status3 = statusDeserializer0.deserialize(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        java.lang.String str2 = element0.getType();
        net.masterthought.cucumber.json.support.Status status3 = element0.getStepsStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(status3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = commentsDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = commentsDeserializer0.getObjectIdReader();
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer3 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        boolean boolean4 = embeddingDeserializer3.isCachable();
        net.masterthought.cucumber.json.Embedding embedding5 = embeddingDeserializer3.getNullValue();
        boolean boolean6 = embeddingDeserializer3.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = commentsDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.Embedding>) embeddingDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(embedding5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage4 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult0, configuration3);
        java.lang.String str5 = configuration3.getDirectorySuffix();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        java.lang.Class<?> wildcardClass1 = embeddingDeserializer0.handledType();
        java.lang.Object obj2 = embeddingDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        net.masterthought.cucumber.generators.OverviewReport overviewReport0 = new net.masterthought.cucumber.generators.OverviewReport();
        overviewReport0.incDurationBy((long) (byte) 0);
        java.lang.String str3 = overviewReport0.getFormattedDuration();
        net.masterthought.cucumber.json.support.Status status4 = net.masterthought.cucumber.json.support.Status.SKIPPED;
        overviewReport0.incFeaturesFor(status4);
        int int6 = overviewReport0.getPassedSteps();
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.support.Status status7 = overviewReport0.getStatus();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Code is not implemented");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.000" + "'", str3, "0.000");
        org.junit.Assert.assertTrue("'" + status4 + "' != '" + net.masterthought.cucumber.json.support.Status.SKIPPED + "'", status4.equals(net.masterthought.cucumber.json.support.Status.SKIPPED));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.String str1 = feature0.getQualifier();
        net.masterthought.cucumber.json.support.Status status2 = feature0.getStatus();
        int int3 = feature0.getScenarios();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(status2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        net.masterthought.cucumber.json.Tag[] tagArray2 = tagsDeserializer0.getNullValue(deserializationContext1);
        org.junit.Assert.assertNull(tagArray2);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        java.lang.Class<?> wildcardClass1 = embeddingDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.Embedding embedding4 = embeddingDeserializer0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        net.masterthought.cucumber.util.Counter counter0 = new net.masterthought.cucumber.util.Counter();
        java.lang.String str1 = counter0.toString();
        counter0.decrement();
        int int3 = counter0.intValue();
        counter0.add((java.lang.Number) 100.0f);
        counter0.setValue((java.lang.Number) 10.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        java.io.File file2 = null;
        net.masterthought.cucumber.Configuration configuration4 = new net.masterthought.cucumber.Configuration(file2, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage5 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult1, configuration4);
        java.io.File file6 = configuration4.getReportDirectory();
        net.masterthought.cucumber.generators.StepsOverviewPage stepsOverviewPage7 = new net.masterthought.cucumber.generators.StepsOverviewPage(reportResult0, configuration4);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        net.masterthought.cucumber.json.Output output1 = new net.masterthought.cucumber.json.Output(strArray0);
        java.lang.String[] strArray2 = output1.getMessages();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        java.io.File file2 = null;
        net.masterthought.cucumber.Configuration configuration4 = new net.masterthought.cucumber.Configuration(file2, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage5 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult1, configuration4);
        java.io.File file6 = configuration4.getReportDirectory();
        java.util.List<java.lang.String> strList7 = configuration4.getCustomJsFiles();
        net.masterthought.cucumber.generators.FeaturesOverviewPage featuresOverviewPage8 = new net.masterthought.cucumber.generators.FeaturesOverviewPage(reportResult0, configuration4);
        net.masterthought.cucumber.sorting.SortingMethod sortingMethod9 = net.masterthought.cucumber.sorting.SortingMethod.ALPHABETICAL;
        configuration4.setSortingMethod(sortingMethod9);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + sortingMethod9 + "' != '" + net.masterthought.cucumber.sorting.SortingMethod.ALPHABETICAL + "'", sortingMethod9.equals(net.masterthought.cucumber.sorting.SortingMethod.ALPHABETICAL));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.String str1 = feature0.getQualifier();
        net.masterthought.cucumber.json.support.Status status2 = feature0.getStatus();
        int int3 = feature0.getUndefinedSteps();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(status2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        net.masterthought.cucumber.util.Counter counter0 = new net.masterthought.cucumber.util.Counter();
        int int1 = counter0.next();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.lang.String str2 = net.masterthought.cucumber.util.Util.formatAsPercentage((-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-3.12%" + "'", str2, "-3.12%");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        net.masterthought.cucumber.util.Counter counter0 = new net.masterthought.cucumber.util.Counter();
        java.lang.String str1 = counter0.toString();
        counter0.decrement();
        int int3 = counter0.intValue();
        counter0.add((java.lang.Number) 100.0f);
        counter0.setValue(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        net.masterthought.cucumber.json.Hook[] hookArray2 = element0.getBefore();
        boolean boolean3 = element0.isScenario();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(hookArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        net.masterthought.cucumber.json.Result result3 = step0.getResult();
        long long4 = result3.getDuration();
        long long5 = result3.getDuration();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        java.lang.String[] strArray6 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        configuration3.addCustomJsFiles((java.util.List<java.lang.String>) strList7);
        net.masterthought.cucumber.json.support.TagObject tagObject11 = new net.masterthought.cucumber.json.support.TagObject("overview-trends.html");
        net.masterthought.cucumber.generators.TagReportPage tagReportPage12 = new net.masterthought.cucumber.generators.TagReportPage(reportResult0, configuration3, tagObject11);
        java.lang.String str13 = tagObject11.getName();
        int int14 = tagObject11.getSkippedSteps();
        int int15 = tagObject11.getPendingSteps();
        int int16 = tagObject11.getSkippedSteps();
        int int17 = tagObject11.getSteps();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "overview-trends.html" + "'", str13, "overview-trends.html");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.io.File file0 = null;
        net.masterthought.cucumber.Configuration configuration2 = new net.masterthought.cucumber.Configuration(file0, "overview-tags.html");
        java.lang.String[] strArray5 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        configuration2.addCustomJsFiles((java.util.List<java.lang.String>) strList6);
        java.lang.String str10 = configuration2.getQualifier("20 Nov 2023, 03:00");
        boolean boolean12 = configuration2.containsQualifier("20 Nov 2023, 03:00");
        configuration2.removeQualifier("overview-steps.html");
        java.io.File file15 = configuration2.getReportDirectory();
        java.lang.String str16 = configuration2.getDirectorySuffix();
        net.masterthought.cucumber.ReportParser reportParser17 = new net.masterthought.cucumber.ReportParser(configuration2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        net.masterthought.cucumber.json.support.StatusCounter statusCounter0 = new net.masterthought.cucumber.json.support.StatusCounter();
        net.masterthought.cucumber.json.support.Status status1 = statusCounter0.getFinalStatus();
        net.masterthought.cucumber.json.support.StepObject stepObject3 = new net.masterthought.cucumber.json.support.StepObject("report-tag_2193230705.html");
        net.masterthought.cucumber.json.support.Status status4 = stepObject3.getStatus();
        int int5 = statusCounter0.getValueFor(status4);
        org.junit.Assert.assertTrue("'" + status1 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status1.equals(net.masterthought.cucumber.json.support.Status.PASSED));
        org.junit.Assert.assertTrue("'" + status4 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status4.equals(net.masterthought.cucumber.json.support.Status.PASSED));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        net.masterthought.cucumber.json.Result result3 = step0.getResult();
        long long4 = step0.getDuration();
        net.masterthought.cucumber.json.Row[] rowArray5 = step0.getRows();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(rowArray5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.util.List<java.lang.String>> strListJsonDeserializer2 = commentsDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        java.lang.Boolean boolean4 = strListJsonDeserializer2.supportsUpdate(deserializationConfig3);
        org.junit.Assert.assertNotNull(strListJsonDeserializer2);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        net.masterthought.cucumber.util.StepNameFormatter stepNameFormatter0 = new net.masterthought.cucumber.util.StepNameFormatter();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        net.masterthought.cucumber.Trends trends0 = new net.masterthought.cucumber.Trends();
        trends0.limitItems(100);
        int[] intArray3 = trends0.getTotalScenarios();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        net.masterthought.cucumber.json.support.Status status2 = element0.getStepsStatus();
        net.masterthought.cucumber.json.Element element3 = new net.masterthought.cucumber.json.Element();
        java.lang.String str4 = element3.getId();
        net.masterthought.cucumber.json.Feature feature5 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int6 = feature5.getLine();
        net.masterthought.cucumber.ReportResult reportResult7 = null;
        java.io.File file8 = null;
        net.masterthought.cucumber.Configuration configuration10 = new net.masterthought.cucumber.Configuration(file8, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage11 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult7, configuration10);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod12 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration10.addReducingMethod(reducingMethod12);
        java.io.File file14 = null;
        configuration10.setTrendsStatsFile(file14);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod16 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        boolean boolean17 = configuration10.containsReducingMethod(reducingMethod16);
        element3.setMetaData(feature5, configuration10);
        java.io.File file19 = null;
        net.masterthought.cucumber.Configuration configuration21 = new net.masterthought.cucumber.Configuration(file19, "overview-tags.html");
        element0.setMetaData(feature5, configuration21);
        java.lang.String str23 = feature5.getUri();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(status2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + reducingMethod12 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod12.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + reducingMethod16 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod16.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        net.masterthought.cucumber.json.support.Status status2 = element0.getStepsStatus();
        net.masterthought.cucumber.json.Element element3 = new net.masterthought.cucumber.json.Element();
        java.lang.String str4 = element3.getId();
        net.masterthought.cucumber.json.Feature feature5 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int6 = feature5.getLine();
        net.masterthought.cucumber.ReportResult reportResult7 = null;
        java.io.File file8 = null;
        net.masterthought.cucumber.Configuration configuration10 = new net.masterthought.cucumber.Configuration(file8, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage11 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult7, configuration10);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod12 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration10.addReducingMethod(reducingMethod12);
        java.io.File file14 = null;
        configuration10.setTrendsStatsFile(file14);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod16 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        boolean boolean17 = configuration10.containsReducingMethod(reducingMethod16);
        element3.setMetaData(feature5, configuration10);
        java.io.File file19 = null;
        net.masterthought.cucumber.Configuration configuration21 = new net.masterthought.cucumber.Configuration(file19, "overview-tags.html");
        element0.setMetaData(feature5, configuration21);
        net.masterthought.cucumber.json.support.Status status23 = element0.getStatus();
        net.masterthought.cucumber.json.Hook[] hookArray24 = element0.getAfter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(status2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + reducingMethod12 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod12.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + reducingMethod16 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod16.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + status23 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status23.equals(net.masterthought.cucumber.json.support.Status.PASSED));
        org.junit.Assert.assertNotNull(hookArray24);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = tagsDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection2 = tagsDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = tagsDeserializer0.findBackReference("0.00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot handle managed/back reference '0.00': type: value deserializer of type net.masterthought.cucumber.json.deserializers.TagsDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int1 = feature0.getLine();
        int int2 = feature0.getFailedScenarios();
        feature0.setQualifier("overview-features.html");
        java.lang.String str5 = feature0.getId();
        int int6 = feature0.getScenarios();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        net.masterthought.cucumber.sorting.FeaturesAlphabeticalComparator featuresAlphabeticalComparator0 = new net.masterthought.cucumber.sorting.FeaturesAlphabeticalComparator();
        net.masterthought.cucumber.json.Feature feature1 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int2 = feature1.getLine();
        int int3 = feature1.getFailedScenarios();
        feature1.setQualifier("overview-features.html");
        java.lang.String str6 = feature1.getId();
        java.lang.String str7 = feature1.getDescription();
        net.masterthought.cucumber.json.Feature feature8 = new net.masterthought.cucumber.json.Feature();
        java.lang.String str9 = feature8.getDescription();
        java.lang.String str10 = feature8.getFormattedDuration();
        java.lang.String str11 = feature8.getQualifier();
        int int12 = featuresAlphabeticalComparator0.compare(feature1, feature8);
        int int13 = feature1.getPendingSteps();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.000" + "'", str10, "0.000");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        boolean boolean1 = tagsDeserializer0.isCachable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = commentsDeserializer0.deserialize(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        net.masterthought.cucumber.util.StepNameFormatter stepNameFormatter0 = net.masterthought.cucumber.util.StepNameFormatter.INSTANCE;
        org.junit.Assert.assertNotNull(stepNameFormatter0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.String str1 = feature0.getQualifier();
        net.masterthought.cucumber.json.Element[] elementArray2 = feature0.getElements();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(elementArray2);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        boolean boolean1 = embeddingDeserializer0.isCachable();
        net.masterthought.cucumber.json.Embedding embedding2 = embeddingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = embeddingDeserializer0.getObjectIdReader();
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer4 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        boolean boolean5 = embeddingDeserializer4.isCachable();
        net.masterthought.cucumber.json.Embedding embedding6 = embeddingDeserializer4.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = embeddingDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.Embedding>) embeddingDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(embedding2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(embedding6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.String str1 = feature0.getQualifier();
        java.lang.String str2 = feature0.getFormattedDuration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.000" + "'", str2, "0.000");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        net.masterthought.cucumber.Trends trends0 = new net.masterthought.cucumber.Trends();
        java.lang.String[] strArray1 = trends0.getBuildNumbers();
        java.lang.String[] strArray2 = trends0.getBuildNumbers();
        int[] intArray3 = trends0.getTotalSteps();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        net.masterthought.cucumber.json.Result result3 = step0.getResult();
        net.masterthought.cucumber.json.Output[] outputArray4 = step0.getOutputs();
        net.masterthought.cucumber.json.DocString docString5 = step0.getDocString();
        net.masterthought.cucumber.json.Hook[] hookArray6 = step0.getAfter();
        net.masterthought.cucumber.json.Step step7 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status8 = step7.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray9 = step7.getOutputs();
        net.masterthought.cucumber.json.Result result10 = step7.getResult();
        long long11 = step7.getDuration();
        net.masterthought.cucumber.json.Step step12 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status13 = step12.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray14 = step12.getOutputs();
        net.masterthought.cucumber.json.Step step15 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status16 = step15.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray17 = step15.getOutputs();
        net.masterthought.cucumber.json.Result result18 = step15.getResult();
        step15.setMetaData();
        net.masterthought.cucumber.json.Step step20 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status21 = step20.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray22 = step20.getOutputs();
        net.masterthought.cucumber.json.Result result23 = step20.getResult();
        net.masterthought.cucumber.json.Output[] outputArray24 = step20.getOutputs();
        net.masterthought.cucumber.json.Match match25 = step20.getMatch();
        net.masterthought.cucumber.json.support.Resultsable[] resultsableArray26 = new net.masterthought.cucumber.json.support.Resultsable[] { step0, step7, step12, step15, step20 };
        net.masterthought.cucumber.json.support.StatusCounter statusCounter27 = new net.masterthought.cucumber.json.support.StatusCounter(resultsableArray26);
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertNotNull(outputArray4);
        org.junit.Assert.assertNull(docString5);
        org.junit.Assert.assertNotNull(hookArray6);
        org.junit.Assert.assertNull(status8);
        org.junit.Assert.assertNotNull(outputArray9);
        org.junit.Assert.assertNotNull(result10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(status13);
        org.junit.Assert.assertNotNull(outputArray14);
        org.junit.Assert.assertNull(status16);
        org.junit.Assert.assertNotNull(outputArray17);
        org.junit.Assert.assertNotNull(result18);
        org.junit.Assert.assertNull(status21);
        org.junit.Assert.assertNotNull(outputArray22);
        org.junit.Assert.assertNotNull(result23);
        org.junit.Assert.assertNotNull(outputArray24);
        org.junit.Assert.assertNull(match25);
        org.junit.Assert.assertNotNull(resultsableArray26);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = tagsDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.Tag[]> tagArrayJsonDeserializer3 = tagsDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern4 = tagsDeserializer0.getNullAccessPattern();
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNotNull(tagArrayJsonDeserializer3);
        org.junit.Assert.assertTrue("'" + accessPattern4 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern4.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        net.masterthought.cucumber.ValidationException validationException2 = new net.masterthought.cucumber.ValidationException("overview-tags.html");
        net.masterthought.cucumber.ValidationException validationException3 = new net.masterthought.cucumber.ValidationException("overview-failures.html", (java.lang.Throwable) validationException2);
        net.masterthought.cucumber.ValidationException validationException4 = new net.masterthought.cucumber.ValidationException((java.lang.Exception) validationException2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        net.masterthought.cucumber.sorting.FeaturesAlphabeticalComparator featuresAlphabeticalComparator0 = new net.masterthought.cucumber.sorting.FeaturesAlphabeticalComparator();
        java.util.Comparator<net.masterthought.cucumber.json.Feature> featureComparator1 = featuresAlphabeticalComparator0.reversed();
        org.junit.Assert.assertNotNull(featureComparator1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        net.masterthought.cucumber.json.deserializers.StatusDeserializer statusDeserializer0 = new net.masterthought.cucumber.json.deserializers.StatusDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = statusDeserializer0.getObjectIdReader();
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer2 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        boolean boolean3 = embeddingDeserializer2.isCachable();
        net.masterthought.cucumber.json.Embedding embedding4 = embeddingDeserializer2.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = statusDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.Embedding>) embeddingDeserializer2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(embedding4);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        net.masterthought.cucumber.Trends trends0 = new net.masterthought.cucumber.Trends();
        net.masterthought.cucumber.generators.OverviewReport overviewReport2 = new net.masterthought.cucumber.generators.OverviewReport();
        overviewReport2.incDurationBy((long) (byte) 0);
        java.lang.String str5 = overviewReport2.getFormattedDuration();
        trends0.addBuild("overview-features.html", (net.masterthought.cucumber.Reportable) overviewReport2);
        int int7 = overviewReport2.getFeatures();
        int int8 = overviewReport2.getFeatures();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.000" + "'", str5, "0.000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        net.masterthought.cucumber.json.support.Status status2 = element0.getStepsStatus();
        net.masterthought.cucumber.json.Element element3 = new net.masterthought.cucumber.json.Element();
        java.lang.String str4 = element3.getId();
        net.masterthought.cucumber.json.Feature feature5 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int6 = feature5.getLine();
        net.masterthought.cucumber.ReportResult reportResult7 = null;
        java.io.File file8 = null;
        net.masterthought.cucumber.Configuration configuration10 = new net.masterthought.cucumber.Configuration(file8, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage11 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult7, configuration10);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod12 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration10.addReducingMethod(reducingMethod12);
        java.io.File file14 = null;
        configuration10.setTrendsStatsFile(file14);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod16 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        boolean boolean17 = configuration10.containsReducingMethod(reducingMethod16);
        element3.setMetaData(feature5, configuration10);
        java.io.File file19 = null;
        net.masterthought.cucumber.Configuration configuration21 = new net.masterthought.cucumber.Configuration(file19, "overview-tags.html");
        element0.setMetaData(feature5, configuration21);
        net.masterthought.cucumber.json.support.Status status23 = element0.getStatus();
        net.masterthought.cucumber.json.support.Status status24 = element0.getBeforeStatus();
        net.masterthought.cucumber.json.support.Status status25 = element0.getBeforeStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(status2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + reducingMethod12 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod12.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + reducingMethod16 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod16.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + status23 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status23.equals(net.masterthought.cucumber.json.support.Status.PASSED));
        org.junit.Assert.assertTrue("'" + status24 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status24.equals(net.masterthought.cucumber.json.support.Status.PASSED));
        org.junit.Assert.assertTrue("'" + status25 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status25.equals(net.masterthought.cucumber.json.support.Status.PASSED));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        java.io.File file2 = null;
        net.masterthought.cucumber.Configuration configuration4 = new net.masterthought.cucumber.Configuration(file2, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage5 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult1, configuration4);
        java.util.List<net.masterthought.cucumber.reducers.ReducingMethod> reducingMethodList6 = configuration4.getReducingMethods();
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage7 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult0, configuration4);
        net.masterthought.cucumber.presentation.PresentationMode presentationMode8 = net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS;
        boolean boolean9 = configuration4.containsPresentationMode(presentationMode8);
        java.util.List<java.lang.String> strList10 = configuration4.getCustomCssFiles();
        configuration4.setQualifier("", "overview-tags.html");
        java.lang.String str14 = configuration4.getDirectorySuffixWithSeparator();
        org.junit.Assert.assertNotNull(reducingMethodList6);
        org.junit.Assert.assertTrue("'" + presentationMode8 + "' != '" + net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS + "'", presentationMode8.equals(net.masterthought.cucumber.presentation.PresentationMode.EXPAND_ALL_STEPS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        net.masterthought.cucumber.json.support.Status status0 = net.masterthought.cucumber.json.support.Status.UNDEFINED;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + net.masterthought.cucumber.json.support.Status.UNDEFINED + "'", status0.equals(net.masterthought.cucumber.json.support.Status.UNDEFINED));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        net.masterthought.cucumber.json.Hook hook0 = new net.masterthought.cucumber.json.Hook();
        net.masterthought.cucumber.json.Output[] outputArray1 = hook0.getOutputs();
        org.junit.Assert.assertNotNull(outputArray1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int1 = feature0.getLine();
        int int2 = feature0.getFailedScenarios();
        net.masterthought.cucumber.json.Tag[] tagArray3 = feature0.getTags();
        net.masterthought.cucumber.json.Tag[] tagArray4 = feature0.getTags();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(tagArray3);
        org.junit.Assert.assertNotNull(tagArray4);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        net.masterthought.cucumber.ValidationException validationException2 = new net.masterthought.cucumber.ValidationException("cucumber-html-reports");
        net.masterthought.cucumber.ValidationException validationException3 = new net.masterthought.cucumber.ValidationException("overview-steps.html", (java.lang.Throwable) validationException2);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = tagsDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.type.LogicalType logicalType2 = tagsDeserializer0.logicalType();
        com.fasterxml.jackson.databind.type.LogicalType logicalType3 = tagsDeserializer0.logicalType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        net.masterthought.cucumber.json.Tag[] tagArray7 = new net.masterthought.cucumber.json.Tag[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = tagsDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6, tagArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(logicalType2);
        org.junit.Assert.assertNull(logicalType3);
        org.junit.Assert.assertNotNull(tagArray7);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        boolean boolean1 = element0.isBackground();
        net.masterthought.cucumber.json.Step[] stepArray2 = element0.getSteps();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stepArray2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.io.File file0 = null;
        net.masterthought.cucumber.Configuration configuration2 = new net.masterthought.cucumber.Configuration(file0, "overview-tags.html");
        java.lang.String[] strArray5 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        configuration2.addCustomJsFiles((java.util.List<java.lang.String>) strList6);
        java.lang.String str10 = configuration2.getQualifier("20 Nov 2023, 03:00");
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod11 = net.masterthought.cucumber.reducers.ReducingMethod.SKIP_EMPTY_JSON_FILES;
        boolean boolean12 = configuration2.containsReducingMethod(reducingMethod11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + reducingMethod11 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.SKIP_EMPTY_JSON_FILES + "'", reducingMethod11.equals(net.masterthought.cucumber.reducers.ReducingMethod.SKIP_EMPTY_JSON_FILES));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        net.masterthought.cucumber.json.Embedding embedding2 = embeddingDeserializer0.getNullValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = embeddingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        net.masterthought.cucumber.json.Embedding embedding8 = new net.masterthought.cucumber.json.Embedding("report-tag_834779598.html", "overview-failures.html");
        java.lang.String str9 = embedding8.getData();
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.Embedding embedding10 = embeddingDeserializer0.deserialize(jsonParser4, deserializationContext5, embedding8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(embedding2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "overview-failures.html" + "'", str9, "overview-failures.html");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        net.masterthought.cucumber.json.Embedding embedding2 = new net.masterthought.cucumber.json.Embedding("report-tag_834779598.html", "overview-failures.html");
        java.lang.String str3 = embedding2.getData();
        java.lang.String str4 = embedding2.getData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "overview-failures.html" + "'", str3, "overview-failures.html");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "overview-failures.html" + "'", str4, "overview-failures.html");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        net.masterthought.cucumber.json.support.Status status0 = net.masterthought.cucumber.json.support.Status.PENDING;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + net.masterthought.cucumber.json.support.Status.PENDING + "'", status0.equals(net.masterthought.cucumber.json.support.Status.PENDING));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        java.lang.String[] strArray6 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        configuration3.addCustomJsFiles((java.util.List<java.lang.String>) strList7);
        net.masterthought.cucumber.json.support.TagObject tagObject11 = new net.masterthought.cucumber.json.support.TagObject("overview-trends.html");
        net.masterthought.cucumber.generators.TagReportPage tagReportPage12 = new net.masterthought.cucumber.generators.TagReportPage(reportResult0, configuration3, tagObject11);
        java.lang.String str13 = tagObject11.getName();
        int int14 = tagObject11.getSkippedSteps();
        int int15 = tagObject11.getPendingSteps();
        int int16 = tagObject11.getPendingSteps();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "overview-trends.html" + "'", str13, "overview-trends.html");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        int int1 = feature0.getFailedSteps();
        int int2 = feature0.getSkippedSteps();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.Embedding embedding3 = embeddingDeserializer0.deserialize(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        net.masterthought.cucumber.sorting.StepObjectAlphabeticalComparator stepObjectAlphabeticalComparator0 = new net.masterthought.cucumber.sorting.StepObjectAlphabeticalComparator();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        net.masterthought.cucumber.json.Hook[] hookArray1 = element0.getAfter();
        java.lang.String str2 = element0.getFormattedDuration();
        java.time.LocalDateTime localDateTime3 = element0.getStartTime();
        org.junit.Assert.assertNotNull(hookArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.000" + "'", str2, "0.000");
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        net.masterthought.cucumber.json.Result result3 = step0.getResult();
        net.masterthought.cucumber.json.Output[] outputArray4 = step0.getOutputs();
        net.masterthought.cucumber.json.DocString docString5 = step0.getDocString();
        long long6 = step0.getDuration();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertNotNull(outputArray4);
        org.junit.Assert.assertNull(docString5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        net.masterthought.cucumber.Trends trends0 = new net.masterthought.cucumber.Trends();
        long[] longArray1 = trends0.getDurations();
        trends0.limitItems((int) (short) 0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        java.lang.Boolean boolean2 = tagsDeserializer0.supportsUpdate(deserializationConfig1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = tagsDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection4 = tagsDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objCollection4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        net.masterthought.cucumber.json.Embedding embedding2 = embeddingDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = embeddingDeserializer0.getAbsentValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = embeddingDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = embeddingDeserializer0.getAbsentValue(deserializationContext7);
        org.junit.Assert.assertNull(embedding2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        net.masterthought.cucumber.generators.OverviewReport overviewReport0 = new net.masterthought.cucumber.generators.OverviewReport();
        long long1 = overviewReport0.getDuration();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        net.masterthought.cucumber.json.Result result3 = step0.getResult();
        net.masterthought.cucumber.json.Output[] outputArray4 = step0.getOutputs();
        net.masterthought.cucumber.json.DocString docString5 = step0.getDocString();
        net.masterthought.cucumber.json.Hook[] hookArray6 = step0.getAfter();
        net.masterthought.cucumber.json.Hook[] hookArray7 = step0.getAfter();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertNotNull(outputArray4);
        org.junit.Assert.assertNull(docString5);
        org.junit.Assert.assertNotNull(hookArray6);
        org.junit.Assert.assertNotNull(hookArray7);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        net.masterthought.cucumber.json.Step step0 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status1 = step0.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray2 = step0.getOutputs();
        net.masterthought.cucumber.json.Result result3 = step0.getResult();
        net.masterthought.cucumber.json.Output[] outputArray4 = step0.getOutputs();
        step0.setMetaData();
        net.masterthought.cucumber.json.Match match6 = step0.getMatch();
        org.junit.Assert.assertNull(status1);
        org.junit.Assert.assertNotNull(outputArray2);
        org.junit.Assert.assertNotNull(result3);
        org.junit.Assert.assertNotNull(outputArray4);
        org.junit.Assert.assertNull(match6);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator tagObjectAlphabeticalComparator0 = new net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator();
        net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator tagObjectAlphabeticalComparator1 = new net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator();
        java.util.Comparator<net.masterthought.cucumber.json.support.TagObject> tagObjectComparator2 = tagObjectAlphabeticalComparator0.thenComparing((java.util.Comparator<net.masterthought.cucumber.json.support.TagObject>) tagObjectAlphabeticalComparator1);
        net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator tagObjectAlphabeticalComparator3 = new net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator();
        net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator tagObjectAlphabeticalComparator4 = new net.masterthought.cucumber.sorting.TagObjectAlphabeticalComparator();
        java.util.Comparator<net.masterthought.cucumber.json.support.TagObject> tagObjectComparator5 = tagObjectAlphabeticalComparator3.thenComparing((java.util.Comparator<net.masterthought.cucumber.json.support.TagObject>) tagObjectAlphabeticalComparator4);
        java.util.Comparator<net.masterthought.cucumber.json.support.TagObject> tagObjectComparator6 = tagObjectComparator2.thenComparing((java.util.Comparator<net.masterthought.cucumber.json.support.TagObject>) tagObjectAlphabeticalComparator4);
        org.junit.Assert.assertNotNull(tagObjectComparator2);
        org.junit.Assert.assertNotNull(tagObjectComparator5);
        org.junit.Assert.assertNotNull(tagObjectComparator6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        net.masterthought.cucumber.generators.OverviewReport overviewReport0 = new net.masterthought.cucumber.generators.OverviewReport();
        overviewReport0.incDurationBy((long) (byte) 0);
        java.lang.String str3 = overviewReport0.getFormattedDuration();
        int int4 = overviewReport0.getPassedFeatures();
        int int5 = overviewReport0.getPassedSteps();
        int int6 = overviewReport0.getSteps();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.000" + "'", str3, "0.000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        net.masterthought.cucumber.ReportResult reportResult2 = null;
        java.io.File file3 = null;
        net.masterthought.cucumber.Configuration configuration5 = new net.masterthought.cucumber.Configuration(file3, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage6 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult2, configuration5);
        java.io.File file7 = configuration5.getReportDirectory();
        net.masterthought.cucumber.generators.FeaturesOverviewPage featuresOverviewPage8 = new net.masterthought.cucumber.generators.FeaturesOverviewPage(reportResult1, configuration5);
        net.masterthought.cucumber.generators.FailuresOverviewPage failuresOverviewPage9 = new net.masterthought.cucumber.generators.FailuresOverviewPage(reportResult0, configuration5);
        java.lang.String str10 = failuresOverviewPage9.getWebPage();
        // The following exception was thrown during execution in test generation
        try {
            failuresOverviewPage9.prepareReport();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "overview-failures.html" + "'", str10, "overview-failures.html");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        java.io.File file2 = null;
        net.masterthought.cucumber.Configuration configuration4 = new net.masterthought.cucumber.Configuration(file2, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage5 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult1, configuration4);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod6 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration4.addReducingMethod(reducingMethod6);
        configuration4.setDirectorySuffix("0.000");
        boolean boolean10 = configuration4.isTrendsAvailable();
        net.masterthought.cucumber.generators.FeaturesOverviewPage featuresOverviewPage11 = new net.masterthought.cucumber.generators.FeaturesOverviewPage(reportResult0, configuration4);
        org.junit.Assert.assertTrue("'" + reducingMethod6 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod6.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        net.masterthought.cucumber.json.support.TagObject tagObject1 = new net.masterthought.cucumber.json.support.TagObject("overview-trends.html");
        java.lang.String str2 = tagObject1.getName();
        int int3 = tagObject1.getPassedScenarios();
        java.lang.String str4 = tagObject1.getReportFileName();
        net.masterthought.cucumber.json.support.Status status5 = tagObject1.getStatus();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "overview-trends.html" + "'", str2, "overview-trends.html");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "report-tag_834779598.html" + "'", str4, "report-tag_834779598.html");
        org.junit.Assert.assertTrue("'" + status5 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status5.equals(net.masterthought.cucumber.json.support.Status.PASSED));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        net.masterthought.cucumber.json.support.Status status2 = element0.getStepsStatus();
        net.masterthought.cucumber.json.Element element3 = new net.masterthought.cucumber.json.Element();
        java.lang.String str4 = element3.getId();
        net.masterthought.cucumber.json.Feature feature5 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int6 = feature5.getLine();
        net.masterthought.cucumber.ReportResult reportResult7 = null;
        java.io.File file8 = null;
        net.masterthought.cucumber.Configuration configuration10 = new net.masterthought.cucumber.Configuration(file8, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage11 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult7, configuration10);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod12 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration10.addReducingMethod(reducingMethod12);
        java.io.File file14 = null;
        configuration10.setTrendsStatsFile(file14);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod16 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        boolean boolean17 = configuration10.containsReducingMethod(reducingMethod16);
        element3.setMetaData(feature5, configuration10);
        java.io.File file19 = null;
        net.masterthought.cucumber.Configuration configuration21 = new net.masterthought.cucumber.Configuration(file19, "overview-tags.html");
        element0.setMetaData(feature5, configuration21);
        net.masterthought.cucumber.json.support.Status status23 = element0.getStatus();
        net.masterthought.cucumber.json.support.Status status24 = element0.getBeforeStatus();
        java.lang.Integer int25 = element0.getLine();
        net.masterthought.cucumber.json.Hook[] hookArray26 = element0.getBefore();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(status2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + reducingMethod12 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod12.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + reducingMethod16 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod16.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + status23 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status23.equals(net.masterthought.cucumber.json.support.Status.PASSED));
        org.junit.Assert.assertTrue("'" + status24 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status24.equals(net.masterthought.cucumber.json.support.Status.PASSED));
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(hookArray26);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.String str1 = feature0.getQualifier();
        long long2 = feature0.getDuration();
        java.lang.String str3 = feature0.getQualifier();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        java.lang.Class<?> wildcardClass1 = embeddingDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = embeddingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = embeddingDeserializer0.getEmptyValue(deserializationContext3);
        boolean boolean5 = embeddingDeserializer0.isCachable();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        net.masterthought.cucumber.Trends trends0 = new net.masterthought.cucumber.Trends();
        long[] longArray1 = trends0.getDurations();
        int[] intArray2 = trends0.getPassedScenarios();
        net.masterthought.cucumber.generators.OverviewReport overviewReport4 = new net.masterthought.cucumber.generators.OverviewReport();
        overviewReport4.incDurationBy((long) (byte) 0);
        java.lang.String str7 = overviewReport4.getFormattedDuration();
        trends0.addBuild("", (net.masterthought.cucumber.Reportable) overviewReport4);
        // The following exception was thrown during execution in test generation
        try {
            net.masterthought.cucumber.json.support.Status status9 = overviewReport4.getStatus();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.lang.NotImplementedException; message: Code is not implemented");
        } catch (org.apache.commons.lang.NotImplementedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.000" + "'", str7, "0.000");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        java.lang.String[] strArray6 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        configuration3.addCustomJsFiles((java.util.List<java.lang.String>) strList7);
        net.masterthought.cucumber.json.support.TagObject tagObject11 = new net.masterthought.cucumber.json.support.TagObject("overview-trends.html");
        net.masterthought.cucumber.generators.TagReportPage tagReportPage12 = new net.masterthought.cucumber.generators.TagReportPage(reportResult0, configuration3, tagObject11);
        java.lang.String str13 = tagObject11.getName();
        java.lang.String str14 = tagObject11.getReportFileName();
        net.masterthought.cucumber.json.Element element15 = new net.masterthought.cucumber.json.Element();
        java.lang.String str16 = element15.getId();
        net.masterthought.cucumber.json.support.Status status17 = element15.getStepsStatus();
        net.masterthought.cucumber.json.Element element18 = new net.masterthought.cucumber.json.Element();
        java.lang.String str19 = element18.getId();
        net.masterthought.cucumber.json.Feature feature20 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int21 = feature20.getLine();
        net.masterthought.cucumber.ReportResult reportResult22 = null;
        java.io.File file23 = null;
        net.masterthought.cucumber.Configuration configuration25 = new net.masterthought.cucumber.Configuration(file23, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage26 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult22, configuration25);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod27 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration25.addReducingMethod(reducingMethod27);
        java.io.File file29 = null;
        configuration25.setTrendsStatsFile(file29);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod31 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        boolean boolean32 = configuration25.containsReducingMethod(reducingMethod31);
        element18.setMetaData(feature20, configuration25);
        java.io.File file34 = null;
        net.masterthought.cucumber.Configuration configuration36 = new net.masterthought.cucumber.Configuration(file34, "overview-tags.html");
        element15.setMetaData(feature20, configuration36);
        net.masterthought.cucumber.json.support.Status status38 = element15.getStatus();
        int int39 = tagObject11.getNumberOfStatus(status38);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "overview-trends.html" + "'", str13, "overview-trends.html");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "report-tag_834779598.html" + "'", str14, "report-tag_834779598.html");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(status17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertTrue("'" + reducingMethod27 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod27.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + reducingMethod31 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod31.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + status38 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status38.equals(net.masterthought.cucumber.json.support.Status.PASSED));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = tagsDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = tagsDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern3 = tagsDeserializer0.getEmptyAccessPattern();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + accessPattern3 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern3.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = tagsDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection2 = tagsDeserializer0.getKnownPropertyNames();
        java.lang.Object obj3 = tagsDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = tagsDeserializer0.getEmptyValue(deserializationContext4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = tagsDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot handle managed/back reference 'hi!': type: value deserializer of type net.masterthought.cucumber.json.deserializers.TagsDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        net.masterthought.cucumber.generators.OverviewReport overviewReport0 = new net.masterthought.cucumber.generators.OverviewReport();
        overviewReport0.incDurationBy((long) (byte) 0);
        java.lang.String str3 = overviewReport0.getFormattedDuration();
        int int4 = overviewReport0.getPassedFeatures();
        int int5 = overviewReport0.getPassedSteps();
        int int6 = overviewReport0.getFailedScenarios();
        int int7 = overviewReport0.getScenarios();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.000" + "'", str3, "0.000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        net.masterthought.cucumber.sorting.SortingMethod sortingMethod0 = net.masterthought.cucumber.sorting.SortingMethod.ALPHABETICAL;
        net.masterthought.cucumber.sorting.SortingFactory sortingFactory1 = new net.masterthought.cucumber.sorting.SortingFactory(sortingMethod0);
        net.masterthought.cucumber.json.support.StepObject stepObject3 = new net.masterthought.cucumber.json.support.StepObject("report-tag_2193230705.html");
        net.masterthought.cucumber.json.support.StepObject stepObject5 = new net.masterthought.cucumber.json.support.StepObject("report-tag_2193230705.html");
        net.masterthought.cucumber.json.support.StepObject[] stepObjectArray6 = new net.masterthought.cucumber.json.support.StepObject[] { stepObject3, stepObject5 };
        java.util.ArrayList<net.masterthought.cucumber.json.support.StepObject> stepObjectList7 = new java.util.ArrayList<net.masterthought.cucumber.json.support.StepObject>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<net.masterthought.cucumber.json.support.StepObject>) stepObjectList7, stepObjectArray6);
        java.util.List<net.masterthought.cucumber.json.support.StepObject> stepObjectList9 = sortingFactory1.sortSteps((java.util.Collection<net.masterthought.cucumber.json.support.StepObject>) stepObjectList7);
        org.junit.Assert.assertTrue("'" + sortingMethod0 + "' != '" + net.masterthought.cucumber.sorting.SortingMethod.ALPHABETICAL + "'", sortingMethod0.equals(net.masterthought.cucumber.sorting.SortingMethod.ALPHABETICAL));
        org.junit.Assert.assertNotNull(stepObjectArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stepObjectList9);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage4 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult0, configuration3);
        java.io.File file5 = configuration3.getReportDirectory();
        java.util.List<java.lang.String> strList6 = configuration3.getCustomJsFiles();
        configuration3.addClassifications("hi!", "net.masterthought.cucumber.ValidationException: overview-tags.html");
        net.masterthought.cucumber.sorting.SortingMethod sortingMethod10 = configuration3.getSortingMethod();
        configuration3.addClassifications("overview-failures.html", "cucumber-html-reports");
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + sortingMethod10 + "' != '" + net.masterthought.cucumber.sorting.SortingMethod.NATURAL + "'", sortingMethod10.equals(net.masterthought.cucumber.sorting.SortingMethod.NATURAL));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        java.io.File file2 = null;
        net.masterthought.cucumber.Configuration configuration4 = new net.masterthought.cucumber.Configuration(file2, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage5 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult1, configuration4);
        java.io.File file6 = configuration4.getReportDirectory();
        net.masterthought.cucumber.generators.FeaturesOverviewPage featuresOverviewPage7 = new net.masterthought.cucumber.generators.FeaturesOverviewPage(reportResult0, configuration4);
        // The following exception was thrown during execution in test generation
        try {
            featuresOverviewPage7.generatePage();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        net.masterthought.cucumber.Trends trends0 = new net.masterthought.cucumber.Trends();
        int[] intArray1 = trends0.getPassedSteps();
        int[] intArray2 = trends0.getPassedSteps();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        net.masterthought.cucumber.json.Match match0 = new net.masterthought.cucumber.json.Match();
        net.masterthought.cucumber.json.support.Argument[] argumentArray1 = match0.getArguments();
        org.junit.Assert.assertNotNull(argumentArray1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        net.masterthought.cucumber.sorting.FeaturesAlphabeticalComparator featuresAlphabeticalComparator0 = new net.masterthought.cucumber.sorting.FeaturesAlphabeticalComparator();
        net.masterthought.cucumber.json.Feature feature1 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int2 = feature1.getLine();
        int int3 = feature1.getFailedScenarios();
        feature1.setQualifier("overview-features.html");
        java.lang.String str6 = feature1.getId();
        java.lang.String str7 = feature1.getDescription();
        net.masterthought.cucumber.json.Feature feature8 = new net.masterthought.cucumber.json.Feature();
        java.lang.String str9 = feature8.getDescription();
        java.lang.String str10 = feature8.getFormattedDuration();
        java.lang.String str11 = feature8.getQualifier();
        int int12 = featuresAlphabeticalComparator0.compare(feature1, feature8);
        java.util.Comparator<net.masterthought.cucumber.json.Feature> featureComparator13 = featuresAlphabeticalComparator0.reversed();
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.000" + "'", str10, "0.000");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(featureComparator13);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        net.masterthought.cucumber.util.Counter counter0 = new net.masterthought.cucumber.util.Counter();
        java.lang.String str1 = counter0.toString();
        double double2 = counter0.doubleValue();
        int int4 = counter0.getAndAdd((java.lang.Number) 0.0f);
        int int6 = counter0.addAndGet((int) (byte) 1);
        net.masterthought.cucumber.util.Counter counter7 = new net.masterthought.cucumber.util.Counter();
        java.lang.String str8 = counter7.toString();
        double double9 = counter7.doubleValue();
        int int11 = counter7.getAndAdd((java.lang.Number) 0.0f);
        int int13 = counter7.addAndGet((int) (byte) 1);
        long long14 = counter7.longValue();
        counter0.setValue((java.lang.Number) long14);
        counter0.add((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        java.lang.String[] strArray6 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        configuration3.addCustomJsFiles((java.util.List<java.lang.String>) strList7);
        net.masterthought.cucumber.json.support.TagObject tagObject11 = new net.masterthought.cucumber.json.support.TagObject("overview-trends.html");
        net.masterthought.cucumber.generators.TagReportPage tagReportPage12 = new net.masterthought.cucumber.generators.TagReportPage(reportResult0, configuration3, tagObject11);
        int int13 = tagObject11.getScenarios();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        net.masterthought.cucumber.json.Hook[] hookArray2 = element0.getBefore();
        java.util.List<net.masterthought.cucumber.json.Hook> hookList3 = net.masterthought.cucumber.util.Util.eliminateEmptyHooks(hookArray2);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(hookArray2);
        org.junit.Assert.assertNotNull(hookList3);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = commentsDeserializer0.getNullAccessPattern();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = commentsDeserializer0.getEmptyValue(deserializationContext2);
        java.util.List<java.lang.String> strList4 = commentsDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.type.LogicalType logicalType5 = commentsDeserializer0.logicalType();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig6 = null;
        java.lang.Boolean boolean7 = commentsDeserializer0.supportsUpdate(deserializationConfig6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = commentsDeserializer0.getObjectIdReader();
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(logicalType5);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        net.masterthought.cucumber.json.Row row0 = new net.masterthought.cucumber.json.Row();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        net.masterthought.cucumber.Trends trends0 = new net.masterthought.cucumber.Trends();
        java.lang.String[] strArray1 = trends0.getBuildNumbers();
        java.lang.String[] strArray2 = trends0.getBuildNumbers();
        int[] intArray3 = trends0.getPassedFeatures();
        int[] intArray4 = trends0.getFailedSteps();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        net.masterthought.cucumber.json.Feature feature0 = new net.masterthought.cucumber.json.Feature();
        java.lang.String str1 = feature0.getQualifier();
        feature0.setQualifier("overview-tags.html");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = tagsDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.type.LogicalType logicalType2 = tagsDeserializer0.logicalType();
        com.fasterxml.jackson.databind.type.LogicalType logicalType3 = tagsDeserializer0.logicalType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = tagsDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot handle managed/back reference '': type: value deserializer of type net.masterthought.cucumber.json.deserializers.TagsDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(logicalType2);
        org.junit.Assert.assertNull(logicalType3);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = commentsDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = commentsDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = commentsDeserializer0.getAbsentValue(deserializationContext3);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        net.masterthought.cucumber.json.support.Status status2 = element0.getStepsStatus();
        net.masterthought.cucumber.json.Element element3 = new net.masterthought.cucumber.json.Element();
        java.lang.String str4 = element3.getId();
        net.masterthought.cucumber.json.Feature feature5 = new net.masterthought.cucumber.json.Feature();
        java.lang.Integer int6 = feature5.getLine();
        net.masterthought.cucumber.ReportResult reportResult7 = null;
        java.io.File file8 = null;
        net.masterthought.cucumber.Configuration configuration10 = new net.masterthought.cucumber.Configuration(file8, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage11 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult7, configuration10);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod12 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration10.addReducingMethod(reducingMethod12);
        java.io.File file14 = null;
        configuration10.setTrendsStatsFile(file14);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod16 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        boolean boolean17 = configuration10.containsReducingMethod(reducingMethod16);
        element3.setMetaData(feature5, configuration10);
        java.io.File file19 = null;
        net.masterthought.cucumber.Configuration configuration21 = new net.masterthought.cucumber.Configuration(file19, "overview-tags.html");
        element0.setMetaData(feature5, configuration21);
        net.masterthought.cucumber.json.support.Status status23 = element0.getStatus();
        java.lang.String str24 = element0.getFormattedDuration();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(status2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + reducingMethod12 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod12.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + reducingMethod16 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod16.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + status23 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status23.equals(net.masterthought.cucumber.json.support.Status.PASSED));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0.000" + "'", str24, "0.000");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        net.masterthought.cucumber.json.Element element0 = new net.masterthought.cucumber.json.Element();
        java.lang.String str1 = element0.getId();
        java.lang.String str2 = element0.getType();
        net.masterthought.cucumber.json.support.Status status3 = element0.getStatus();
        net.masterthought.cucumber.ReportResult reportResult4 = null;
        java.io.File file5 = null;
        net.masterthought.cucumber.Configuration configuration7 = new net.masterthought.cucumber.Configuration(file5, "overview-tags.html");
        java.lang.String[] strArray10 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        configuration7.addCustomJsFiles((java.util.List<java.lang.String>) strList11);
        java.lang.String str15 = configuration7.getQualifier("20 Nov 2023, 03:00");
        net.masterthought.cucumber.json.Feature feature16 = new net.masterthought.cucumber.json.Feature();
        int int17 = feature16.getFailedSteps();
        net.masterthought.cucumber.generators.FeatureReportPage featureReportPage18 = new net.masterthought.cucumber.generators.FeatureReportPage(reportResult4, configuration7, feature16);
        int int19 = feature16.getPassedSteps();
        long long20 = feature16.getDuration();
        net.masterthought.cucumber.json.Step step21 = new net.masterthought.cucumber.json.Step();
        net.masterthought.cucumber.json.support.Status status22 = step21.getBeforeStatus();
        net.masterthought.cucumber.json.Output[] outputArray23 = step21.getOutputs();
        java.util.List<java.lang.String> strList24 = step21.getComments();
        net.masterthought.cucumber.ReportResult reportResult25 = null;
        java.io.File file26 = null;
        net.masterthought.cucumber.Configuration configuration28 = new net.masterthought.cucumber.Configuration(file26, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage29 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult25, configuration28);
        net.masterthought.cucumber.reducers.ReducingMethod reducingMethod30 = net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS;
        configuration28.addReducingMethod(reducingMethod30);
        net.masterthought.cucumber.ReportBuilder reportBuilder32 = new net.masterthought.cucumber.ReportBuilder(strList24, configuration28);
        java.util.List<java.lang.String> strList33 = configuration28.getClassificationFiles();
        element0.setMetaData(feature16, configuration28);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(status3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(status22);
        org.junit.Assert.assertNotNull(outputArray23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + reducingMethod30 + "' != '" + net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS + "'", reducingMethod30.equals(net.masterthought.cucumber.reducers.ReducingMethod.HIDE_EMPTY_HOOKS));
        org.junit.Assert.assertNull(strList33);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        net.masterthought.cucumber.json.Embedding embedding3 = new net.masterthought.cucumber.json.Embedding("", "overview-trends.html", "overview-failures.html");
        java.lang.String str4 = embedding3.getFileName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "embedding_-1312704049.html" + "'", str4, "embedding_-1312704049.html");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer0 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        java.lang.Class<?> wildcardClass1 = embeddingDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = embeddingDeserializer0.handledType();
        com.fasterxml.jackson.databind.type.LogicalType logicalType3 = embeddingDeserializer0.logicalType();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(logicalType3);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        net.masterthought.cucumber.util.Counter counter0 = new net.masterthought.cucumber.util.Counter();
        java.lang.String str1 = counter0.toString();
        counter0.decrement();
        counter0.add((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        net.masterthought.cucumber.json.support.TagObject tagObject1 = new net.masterthought.cucumber.json.support.TagObject("overview-trends.html");
        int int2 = tagObject1.getPassedSteps();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        net.masterthought.cucumber.json.deserializers.CommentsDeserializer commentsDeserializer0 = new net.masterthought.cucumber.json.deserializers.CommentsDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = commentsDeserializer0.getNullAccessPattern();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = commentsDeserializer0.getEmptyValue(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.util.List<java.lang.String> strList5 = commentsDeserializer0.getNullValue(deserializationContext4);
        java.util.Collection<java.lang.Object> objCollection6 = commentsDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        java.lang.String[] strArray6 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        configuration3.addCustomJsFiles((java.util.List<java.lang.String>) strList7);
        net.masterthought.cucumber.json.support.TagObject tagObject11 = new net.masterthought.cucumber.json.support.TagObject("overview-trends.html");
        net.masterthought.cucumber.generators.TagReportPage tagReportPage12 = new net.masterthought.cucumber.generators.TagReportPage(reportResult0, configuration3, tagObject11);
        java.lang.String str13 = tagObject11.getName();
        int int14 = tagObject11.getSkippedSteps();
        int int15 = tagObject11.getPendingSteps();
        java.lang.String str16 = tagObject11.getReportFileName();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "overview-trends.html" + "'", str13, "overview-trends.html");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "report-tag_834779598.html" + "'", str16, "report-tag_834779598.html");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "0");
        net.masterthought.cucumber.generators.FailuresOverviewPage failuresOverviewPage4 = new net.masterthought.cucumber.generators.FailuresOverviewPage(reportResult0, configuration3);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.io.File file0 = null;
        net.masterthought.cucumber.Configuration configuration2 = new net.masterthought.cucumber.Configuration(file0, "overview-tags.html");
        java.lang.String[] strArray5 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        configuration2.addCustomJsFiles((java.util.List<java.lang.String>) strList6);
        java.lang.String str10 = configuration2.getQualifier("20 Nov 2023, 03:00");
        boolean boolean12 = configuration2.containsQualifier("20 Nov 2023, 03:00");
        configuration2.removeQualifier("overview-steps.html");
        java.util.Set<net.masterthought.cucumber.json.support.Status> statusSet15 = configuration2.getNotFailingStatuses();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(statusSet15);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        net.masterthought.cucumber.generators.OverviewReport overviewReport0 = new net.masterthought.cucumber.generators.OverviewReport();
        overviewReport0.incDurationBy((long) (byte) 0);
        java.lang.String str3 = overviewReport0.getFormattedDuration();
        int int4 = overviewReport0.getPassedFeatures();
        int int5 = overviewReport0.getPassedSteps();
        int int6 = overviewReport0.getFailedScenarios();
        int int7 = overviewReport0.getFailedFeatures();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.000" + "'", str3, "0.000");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        net.masterthought.cucumber.json.support.StepObject stepObject1 = new net.masterthought.cucumber.json.support.StepObject("report-tag_2193230705.html");
        net.masterthought.cucumber.json.support.Status status2 = stepObject1.getStatus();
        net.masterthought.cucumber.json.support.Status status3 = stepObject1.getStatus();
        long long4 = stepObject1.getDuration();
        java.lang.String str5 = stepObject1.getFormattedTotalDuration();
        org.junit.Assert.assertTrue("'" + status2 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status2.equals(net.masterthought.cucumber.json.support.Status.PASSED));
        org.junit.Assert.assertTrue("'" + status3 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status3.equals(net.masterthought.cucumber.json.support.Status.PASSED));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.000" + "'", str5, "0.000");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        net.masterthought.cucumber.json.deserializers.StatusDeserializer statusDeserializer0 = new net.masterthought.cucumber.json.deserializers.StatusDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = statusDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern2 = statusDeserializer0.getEmptyAccessPattern();
        java.lang.Object obj3 = statusDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + accessPattern2 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern2.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = tagsDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.type.LogicalType logicalType2 = tagsDeserializer0.logicalType();
        com.fasterxml.jackson.databind.type.LogicalType logicalType3 = tagsDeserializer0.logicalType();
        net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer embeddingDeserializer4 = new net.masterthought.cucumber.json.deserializers.EmbeddingDeserializer();
        boolean boolean5 = embeddingDeserializer4.isCachable();
        net.masterthought.cucumber.json.Embedding embedding6 = embeddingDeserializer4.getNullValue();
        boolean boolean7 = embeddingDeserializer4.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = tagsDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.Embedding>) embeddingDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(logicalType2);
        org.junit.Assert.assertNull(logicalType3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(embedding6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        net.masterthought.cucumber.reducers.ReportFeatureMergerFactory reportFeatureMergerFactory0 = new net.masterthought.cucumber.reducers.ReportFeatureMergerFactory();
        net.masterthought.cucumber.ReportResult reportResult1 = null;
        java.io.File file2 = null;
        net.masterthought.cucumber.Configuration configuration4 = new net.masterthought.cucumber.Configuration(file2, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage5 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult1, configuration4);
        java.util.List<net.masterthought.cucumber.reducers.ReducingMethod> reducingMethodList6 = configuration4.getReducingMethods();
        net.masterthought.cucumber.reducers.ReportFeatureMerger reportFeatureMerger7 = reportFeatureMergerFactory0.get(reducingMethodList6);
        net.masterthought.cucumber.ReportResult reportResult8 = null;
        java.io.File file9 = null;
        net.masterthought.cucumber.Configuration configuration11 = new net.masterthought.cucumber.Configuration(file9, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage12 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult8, configuration11);
        java.util.List<net.masterthought.cucumber.reducers.ReducingMethod> reducingMethodList13 = configuration11.getReducingMethods();
        boolean boolean14 = reportFeatureMerger7.test(reducingMethodList13);
        net.masterthought.cucumber.reducers.ReportFeatureMergerFactory reportFeatureMergerFactory15 = new net.masterthought.cucumber.reducers.ReportFeatureMergerFactory();
        net.masterthought.cucumber.ReportResult reportResult16 = null;
        java.io.File file17 = null;
        net.masterthought.cucumber.Configuration configuration19 = new net.masterthought.cucumber.Configuration(file17, "overview-tags.html");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage20 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult16, configuration19);
        java.util.List<net.masterthought.cucumber.reducers.ReducingMethod> reducingMethodList21 = configuration19.getReducingMethods();
        net.masterthought.cucumber.reducers.ReportFeatureMerger reportFeatureMerger22 = reportFeatureMergerFactory15.get(reducingMethodList21);
        java.util.function.Predicate<java.util.List<net.masterthought.cucumber.reducers.ReducingMethod>> reducingMethodListPredicate23 = reportFeatureMerger7.and((java.util.function.Predicate<java.util.List<net.masterthought.cucumber.reducers.ReducingMethod>>) reportFeatureMerger22);
        org.junit.Assert.assertNotNull(reducingMethodList6);
        org.junit.Assert.assertNotNull(reportFeatureMerger7);
        org.junit.Assert.assertNotNull(reducingMethodList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reducingMethodList21);
        org.junit.Assert.assertNotNull(reportFeatureMerger22);
        org.junit.Assert.assertNotNull(reducingMethodListPredicate23);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        net.masterthought.cucumber.util.Counter counter0 = new net.masterthought.cucumber.util.Counter();
        java.lang.String str1 = counter0.toString();
        double double2 = counter0.doubleValue();
        int int4 = counter0.getAndAdd((java.lang.Number) 0.0f);
        int int6 = counter0.addAndGet((int) (byte) 1);
        counter0.setValue((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        net.masterthought.cucumber.Trends trends0 = new net.masterthought.cucumber.Trends();
        int[] intArray1 = trends0.getPassedSteps();
        int[] intArray2 = trends0.getPassedScenarios();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        net.masterthought.cucumber.util.Counter counter0 = new net.masterthought.cucumber.util.Counter();
        java.lang.String str1 = counter0.toString();
        counter0.decrement();
        int int3 = counter0.intValue();
        counter0.add((java.lang.Number) 100.0f);
        counter0.setValue((java.lang.Number) (-1.0f));
        float float8 = counter0.floatValue();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        net.masterthought.cucumber.json.deserializers.StatusDeserializer statusDeserializer0 = new net.masterthought.cucumber.json.deserializers.StatusDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = statusDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = statusDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<net.masterthought.cucumber.json.support.Status> statusJsonDeserializer4 = statusDeserializer0.unwrappingDeserializer(nameTransformer3);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(statusJsonDeserializer4);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        net.masterthought.cucumber.json.deserializers.OutputsDeserializer outputsDeserializer0 = new net.masterthought.cucumber.json.deserializers.OutputsDeserializer();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "0");
        configuration3.setDirectorySuffix("0.000");
        net.masterthought.cucumber.generators.TagsOverviewPage tagsOverviewPage6 = new net.masterthought.cucumber.generators.TagsOverviewPage(reportResult0, configuration3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        net.masterthought.cucumber.Trends trends0 = new net.masterthought.cucumber.Trends();
        long[] longArray1 = trends0.getDurations();
        int[] intArray2 = trends0.getPendingSteps();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        net.masterthought.cucumber.ReportResult reportResult0 = null;
        java.io.File file1 = null;
        net.masterthought.cucumber.Configuration configuration3 = new net.masterthought.cucumber.Configuration(file1, "overview-tags.html");
        java.lang.String[] strArray6 = new java.lang.String[] { "overview-failures.html", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        configuration3.addCustomJsFiles((java.util.List<java.lang.String>) strList7);
        net.masterthought.cucumber.json.support.TagObject tagObject11 = new net.masterthought.cucumber.json.support.TagObject("overview-trends.html");
        net.masterthought.cucumber.generators.TagReportPage tagReportPage12 = new net.masterthought.cucumber.generators.TagReportPage(reportResult0, configuration3, tagObject11);
        int int13 = tagObject11.getPassedSteps();
        int int14 = tagObject11.getFailedScenarios();
        net.masterthought.cucumber.json.support.Status status15 = tagObject11.getStatus();
        int int16 = tagObject11.getUndefinedSteps();
        int int17 = tagObject11.getPassedSteps();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + status15 + "' != '" + net.masterthought.cucumber.json.support.Status.PASSED + "'", status15.equals(net.masterthought.cucumber.json.support.Status.PASSED));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        net.masterthought.cucumber.json.deserializers.TagsDeserializer tagsDeserializer0 = new net.masterthought.cucumber.json.deserializers.TagsDeserializer();
        java.util.Collection<java.lang.Object> objCollection1 = tagsDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.type.LogicalType logicalType2 = tagsDeserializer0.logicalType();
        java.util.Collection<java.lang.Object> objCollection3 = tagsDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(objCollection1);
        org.junit.Assert.assertNull(logicalType2);
        org.junit.Assert.assertNull(objCollection3);
    }
}
