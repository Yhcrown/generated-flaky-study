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
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = new io.gsonfire.builders.JsonArrayBuilder();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        int int0 = java.text.DateFormat.YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        int int0 = java.text.DateFormat.AM_PM_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        io.gsonfire.DateSerializationPolicy dateSerializationPolicy0 = io.gsonfire.DateSerializationPolicy.unixTimePositiveSeconds;
        org.junit.Assert.assertNotNull(dateSerializationPolicy0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = dateFormat0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"hi!\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        io.gsonfire.DateSerializationPolicy dateSerializationPolicy0 = io.gsonfire.DateSerializationPolicy.unixTimePositiveMillis;
        org.junit.Assert.assertNotNull(dateSerializationPolicy0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator3 = numberFormat1.formatToCharacterIterator((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        int int0 = java.text.DateFormat.DAY_OF_WEEK_IN_MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.stream.JsonReader jsonReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = dateUnixtimeSecondsTypeAdapter1.read(jsonReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        io.gsonfire.DateSerializationPolicy dateSerializationPolicy0 = io.gsonfire.DateSerializationPolicy.rfc3339Date;
        org.junit.Assert.assertNotNull(dateSerializationPolicy0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.google.gson.JsonElement jsonElement0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement1 = io.gsonfire.util.JsonUtils.deepCopy(jsonElement0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(0, 1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        java.io.Writer writer2 = null;
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateUnixtimeSecondsTypeAdapter1.toJson(writer2, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = dateUnixtimeSecondsTypeAdapter1.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.google.gson.TypeAdapter typeAdapter0 = null;
        com.google.gson.stream.JsonWriter jsonWriter1 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory2 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass3 = cachedReflectionFactory2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement4 = io.gsonfire.util.JsonUtils.toJsonTree(typeAdapter0, jsonWriter1, (java.lang.Object) cachedReflectionFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder1 = io.gsonfire.builders.JsonArrayBuilder.start();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dateFormat0.format((java.lang.Object) jsonArrayBuilder1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        int int0 = java.text.DateFormat.FULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = dateUnixtimeSecondsTypeAdapter1.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(14, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.reflect.Method method0 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory1 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass2 = cachedReflectionFactory1.getClass();
        java.lang.Class[] classArray3 = new java.lang.Class[] { wildcardClass2 };
        java.util.LinkedHashSet<java.lang.Class> classSet4 = new java.util.LinkedHashSet<java.lang.Class>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Class>) classSet4, classArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.gsonfire.util.reflection.MethodInvoker methodInvoker6 = new io.gsonfire.util.reflection.MethodInvoker(method0, (java.util.Set<java.lang.Class>) classSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(classArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        int int0 = java.text.DateFormat.ERA_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement3 = dateUnixtimeSecondsTypeAdapter1.toJsonTree(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        int int0 = java.text.DateFormat.DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.stream.JsonWriter jsonWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement4 = io.gsonfire.util.JsonUtils.toJsonTree((com.google.gson.TypeAdapter) dateUnixtimeSecondsTypeAdapter1, jsonWriter2, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.stream.JsonWriter jsonWriter2 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory3 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass4 = cachedReflectionFactory3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement5 = io.gsonfire.util.JsonUtils.toJsonTree((com.google.gson.TypeAdapter) dateUnixtimeSecondsTypeAdapter1, jsonWriter2, (java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        io.gsonfire.ClassConfig<java.lang.reflect.AnnotatedElement> annotatedElementClassConfig0 = null;
        io.gsonfire.gson.HooksTypeAdapterFactory<java.lang.reflect.AnnotatedElement> annotatedElementHooksTypeAdapterFactory1 = new io.gsonfire.gson.HooksTypeAdapterFactory<java.lang.reflect.AnnotatedElement>(annotatedElementClassConfig0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder3.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray6 = jsonArrayBuilder3.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder2.add((com.google.gson.JsonElement) jsonArray6);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder2.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder8);
        com.google.gson.JsonObject jsonObject10 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder11 = jsonObjectBuilder8.merge(jsonObject10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArray6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.stream.JsonWriter jsonWriter2 = null;
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateUnixtimeSecondsTypeAdapter1.write(jsonWriter2, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        int int0 = java.text.DateFormat.DAY_OF_YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = dateUnixtimeSecondsTypeAdapter1.fromJson(reader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.stream.JsonWriter jsonWriter2 = null;
        io.gsonfire.DateSerializationPolicy dateSerializationPolicy3 = io.gsonfire.DateSerializationPolicy.unixTimeMillis;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement4 = io.gsonfire.util.JsonUtils.toJsonTree((com.google.gson.TypeAdapter) dateUnixtimeSecondsTypeAdapter1, jsonWriter2, (java.lang.Object) dateSerializationPolicy3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateSerializationPolicy3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) -1, 100, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.stream.JsonReader jsonReader2 = null;
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder3.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder6 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder8 = jsonArrayBuilder6.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray9 = jsonArrayBuilder6.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder10 = jsonArrayBuilder5.add((com.google.gson.JsonElement) jsonArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = io.gsonfire.util.JsonUtils.fromJsonTree((com.google.gson.TypeAdapter<java.util.Date>) dateUnixtimeSecondsTypeAdapter1, jsonReader2, (com.google.gson.JsonElement) jsonArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArrayBuilder6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder8);
        org.junit.Assert.assertNotNull(jsonArray9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat1 = new io.gsonfire.util.RFC3339DateFormat(timeZone0);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder2 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject3 = jsonObjectBuilder2.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = rFC3339DateFormat1.format((java.lang.Object) jsonObject3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonObject3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.stream.JsonWriter jsonWriter2 = null;
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.util.Calendar calendar4 = null;
        dateFormat3.setCalendar(calendar4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement6 = io.gsonfire.util.JsonUtils.toJsonTree((com.google.gson.TypeAdapter) dateUnixtimeSecondsTypeAdapter1, jsonWriter2, (java.lang.Object) calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        int int0 = java.text.DateFormat.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject1 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder5 = jsonObjectBuilder0.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder3);
        io.gsonfire.builders.JsonElementBuilder jsonElementBuilder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = jsonObjectBuilder5.set("hi!", jsonElementBuilder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonObject1);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObjectBuilder5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        int int0 = java.text.DateFormat.HOUR0_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder1 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject2 = jsonObjectBuilder1.build();
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = dateFormat0.format((java.lang.Object) jsonObject2, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(jsonObject2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateRFC3339TypeAdapter2.toJson(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        int int0 = java.text.DateFormat.MILLISECOND_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray3 = jsonArrayBuilder0.build();
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator4 = jsonArray3.spliterator();
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArray3);
        org.junit.Assert.assertNotNull(jsonElementSpliterator4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        int int0 = java.text.DateFormat.DAY_OF_WEEK_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat2 = new io.gsonfire.util.RFC3339DateFormat(timeZone0, false);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = rFC3339DateFormat2.parse("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        io.gsonfire.gson.SimpleIterableTypeAdapterFactory simpleIterableTypeAdapterFactory0 = new io.gsonfire.gson.SimpleIterableTypeAdapterFactory();
        com.google.gson.Gson gson1 = null;
        com.google.gson.reflect.TypeToken typeToken2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeAdapter typeAdapter3 = simpleIterableTypeAdapterFactory0.create(gson1, typeToken2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.google.gson.Gson gson0 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory1 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass2 = cachedReflectionFactory1.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter3 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson0, (java.lang.reflect.Type) wildcardClass2);
        com.google.gson.stream.JsonReader jsonReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.gsonfire.util.SimpleIterable<?> wildcardSimpleIterable5 = simpleIterableTypeAdapter3.read(jsonReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateUnixtimeSecondsTypeAdapter1.nullSafe();
        com.google.gson.stream.JsonReader jsonReader3 = null;
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder4 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder6 = jsonArrayBuilder4.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder7.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray10 = jsonArrayBuilder7.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder11 = jsonArrayBuilder6.add((com.google.gson.JsonElement) jsonArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = io.gsonfire.util.JsonUtils.fromJsonTree(dateTypeAdapter2, jsonReader3, (com.google.gson.JsonElement) jsonArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder4);
        org.junit.Assert.assertNotNull(jsonArrayBuilder6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArray10);
        org.junit.Assert.assertNotNull(jsonArrayBuilder11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat0 = new io.gsonfire.util.RFC3339DateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = rFC3339DateFormat0.parseObject("", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat2 = new io.gsonfire.util.RFC3339DateFormat(timeZone0, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = rFC3339DateFormat2.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement6 = dateRFC3339TypeAdapter2.toJsonTree(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder4 = jsonArrayBuilder2.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder5.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray8 = jsonArrayBuilder5.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder4.add((com.google.gson.JsonElement) jsonArray8);
        com.google.gson.JsonElement jsonElement10 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = dateUnixtimeSecondsTypeAdapter1.fromJsonTree(jsonElement10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NUMBER but was BEGIN_ARRAY at path $");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder4);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArray8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.reflect.Method method0 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass2 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy3 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory4 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass2, conflictResolutionStrategy3);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod5 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method0, "", conflictResolutionStrategy3);
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy6 = mappedMethod5.getConflictResolutionStrategy();
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy3 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy3.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy6 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy6.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.Throwable throwable1 = null;
        io.gsonfire.gson.HookInvocationException hookInvocationException2 = new io.gsonfire.gson.HookInvocationException("", throwable1);
        java.lang.String str3 = hookInvocationException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "io.gsonfire.gson.HookInvocationException: " + "'", str3, "io.gsonfire.gson.HookInvocationException: ");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.util.Map<java.lang.Class<java.lang.String>, io.gsonfire.util.Mapper<java.lang.String, java.lang.String>> strClassMap0 = null;
        io.gsonfire.gson.WrapTypeAdapterFactory<java.lang.String> strWrapTypeAdapterFactory1 = new io.gsonfire.gson.WrapTypeAdapterFactory<java.lang.String>(strClassMap0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (short) 1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter1 = new io.gsonfire.gson.DateRFC3339TypeAdapter(true);
        com.google.gson.stream.JsonReader jsonReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = dateRFC3339TypeAdapter1.read(jsonReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        java.io.Reader reader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = dateRFC3339TypeAdapter2.fromJson(reader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar2 = null;
        dateFormat1.setCalendar(calendar2);
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat1 = new io.gsonfire.util.RFC3339DateFormat(timeZone0);
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            rFC3339DateFormat1.setTimeZone(timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.lang.reflect.Method method0 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory1 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass2 = cachedReflectionFactory1.getClass();
        com.google.gson.Gson gson3 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory4 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass5 = cachedReflectionFactory4.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter6 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson3, (java.lang.reflect.Type) wildcardClass5);
        io.gsonfire.gson.FireExclusionStrategy fireExclusionStrategy7 = null;
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor8 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>(fireExclusionStrategy7);
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory9 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass10 = cachedReflectionFactory9.getClass();
        com.google.gson.JsonElement jsonElement11 = null;
        com.google.gson.Gson gson12 = null;
        annotatedElementMethodInvokerPostProcessor8.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass10, jsonElement11, gson12);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder14 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder16 = jsonArrayBuilder14.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder17 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder19 = jsonArrayBuilder17.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray20 = jsonArrayBuilder17.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder21 = jsonArrayBuilder16.add((com.google.gson.JsonElement) jsonArray20);
        com.google.gson.Gson gson22 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory23 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass24 = cachedReflectionFactory23.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter25 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson22, (java.lang.reflect.Type) wildcardClass24);
        com.google.gson.Gson gson26 = null;
        annotatedElementMethodInvokerPostProcessor8.postSerialize((com.google.gson.JsonElement) jsonArray20, (java.lang.reflect.AnnotatedElement) wildcardClass24, gson26);
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass2, wildcardClass5, wildcardClass24 };
        java.util.LinkedHashSet<java.lang.Class> classSet29 = new java.util.LinkedHashSet<java.lang.Class>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Class>) classSet29, classArray28);
        // The following exception was thrown during execution in test generation
        try {
            io.gsonfire.util.reflection.MethodInvoker methodInvoker31 = new io.gsonfire.util.reflection.MethodInvoker(method0, (java.util.Set<java.lang.Class>) classSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonArrayBuilder14);
        org.junit.Assert.assertNotNull(jsonArrayBuilder16);
        org.junit.Assert.assertNotNull(jsonArrayBuilder17);
        org.junit.Assert.assertNotNull(jsonArrayBuilder19);
        org.junit.Assert.assertNotNull(jsonArray20);
        org.junit.Assert.assertNotNull(jsonArrayBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject1 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder5 = jsonObjectBuilder0.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder3);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = jsonObjectBuilder0.set("[SKIP, SKIP]", (java.lang.Number) 100.0f);
        org.junit.Assert.assertNotNull(jsonObject1);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObjectBuilder5);
        org.junit.Assert.assertNotNull(jsonObjectBuilder8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateUnixtimeSecondsTypeAdapter1.nullSafe();
        com.google.gson.stream.JsonReader jsonReader3 = null;
        java.util.TimeZone timeZone4 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter6 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone4, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateRFC3339TypeAdapter6.nullSafe();
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = dateTypeAdapter7.toJsonTree(date8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = io.gsonfire.util.JsonUtils.fromJsonTree(dateTypeAdapter2, jsonReader3, jsonElement9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        int int0 = java.text.DateFormat.DATE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject1 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder5 = jsonObjectBuilder0.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder3);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = jsonObjectBuilder0.set("", (java.lang.Number) (short) -1);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder10 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder11 = jsonObjectBuilder8.set("io.gsonfire.gson.HookInvocationException: ", (io.gsonfire.builders.JsonElementBuilder) jsonArrayBuilder10);
        org.junit.Assert.assertNotNull(jsonObject1);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObjectBuilder5);
        org.junit.Assert.assertNotNull(jsonObjectBuilder8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder10);
        org.junit.Assert.assertNotNull(jsonObjectBuilder11);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.gsonfire.ClassConfig<io.gsonfire.gson.FireExclusionStrategyComposite> fireExclusionStrategyCompositeClassConfig0 = null;
        com.google.gson.reflect.TypeToken[] typeTokenArray1 = new com.google.gson.reflect.TypeToken[] {};
        java.util.LinkedHashSet<com.google.gson.reflect.TypeToken> typeTokenSet2 = new java.util.LinkedHashSet<com.google.gson.reflect.TypeToken>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.google.gson.reflect.TypeToken>) typeTokenSet2, typeTokenArray1);
        io.gsonfire.gson.TypeSelectorTypeAdapterFactory<io.gsonfire.gson.FireExclusionStrategyComposite> fireExclusionStrategyCompositeTypeSelectorTypeAdapterFactory4 = new io.gsonfire.gson.TypeSelectorTypeAdapterFactory<io.gsonfire.gson.FireExclusionStrategyComposite>(fireExclusionStrategyCompositeClassConfig0, (java.util.Set<com.google.gson.reflect.TypeToken>) typeTokenSet2);
        org.junit.Assert.assertNotNull(typeTokenArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<io.gsonfire.gson.DateRFC3339TypeAdapter> dateRFC3339TypeAdapterMethodInvokerPostProcessor0 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<io.gsonfire.gson.DateRFC3339TypeAdapter>();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder4 = jsonArrayBuilder0.add((java.lang.Number) (byte) 1);
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod2 = null;
        boolean boolean3 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod2);
        java.lang.reflect.Method method4 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass6 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy7 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory8 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass6, conflictResolutionStrategy7);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod9 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method4, "", conflictResolutionStrategy7);
        java.lang.reflect.Method method10 = mappedMethod9.getMethod();
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy11 = mappedMethod9.getConflictResolutionStrategy();
        boolean boolean12 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod9);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy7 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy7.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy11 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy11.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat1 = new io.gsonfire.util.RFC3339DateFormat(timeZone0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar4 = dateFormat3.getCalendar();
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = rFC3339DateFormat1.format((java.lang.Object) dateFormat3, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=-825812078794,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=9,WEEK_OF_YEAR=45,WEEK_OF_MONTH=6,DAY_OF_MONTH=31,DAY_OF_YEAR=304,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=45,SECOND=21,MILLISECOND=206,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dateFormat0.format(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat3 = new io.gsonfire.util.RFC3339DateFormat(timeZone0, true, false);
        io.gsonfire.gson.FireExclusionStrategy fireExclusionStrategy4 = null;
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor5 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>(fireExclusionStrategy4);
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory6 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass7 = cachedReflectionFactory6.getClass();
        com.google.gson.JsonElement jsonElement8 = null;
        com.google.gson.Gson gson9 = null;
        annotatedElementMethodInvokerPostProcessor5.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass7, jsonElement8, gson9);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = rFC3339DateFormat3.format((java.lang.Object) gson9, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat2 = new io.gsonfire.util.RFC3339DateFormat(timeZone0, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = rFC3339DateFormat2.parseObject("[SKIP, SKIP]");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.text.ParseException: Unparseable date: \"[SKIP, SKIP]-0000\"");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        io.gsonfire.ClassConfig<java.lang.Object> objClassConfig0 = null;
        java.util.Set<com.google.gson.reflect.TypeToken> typeTokenSet1 = null;
        io.gsonfire.gson.TypeSelectorTypeAdapterFactory<java.lang.Object> objTypeSelectorTypeAdapterFactory2 = new io.gsonfire.gson.TypeSelectorTypeAdapterFactory<java.lang.Object>(objClassConfig0, typeTokenSet1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        int int0 = java.text.DateFormat.MINUTE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder7 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder11 = jsonArrayBuilder9.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder12 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder14 = jsonArrayBuilder12.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray15 = jsonArrayBuilder12.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder16 = jsonArrayBuilder11.add((com.google.gson.JsonElement) jsonArray15);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder17 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder18 = jsonArrayBuilder11.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder17);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder19 = jsonObjectBuilder7.set("", (io.gsonfire.builders.JsonElementBuilder) jsonArrayBuilder18);
        com.google.gson.JsonObject jsonObject20 = jsonObjectBuilder19.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = dateTypeAdapter6.fromJsonTree((com.google.gson.JsonElement) jsonObject20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected STRING but was BEGIN_OBJECT at path $");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder11);
        org.junit.Assert.assertNotNull(jsonArrayBuilder12);
        org.junit.Assert.assertNotNull(jsonArrayBuilder14);
        org.junit.Assert.assertNotNull(jsonArray15);
        org.junit.Assert.assertNotNull(jsonArrayBuilder16);
        org.junit.Assert.assertNotNull(jsonArrayBuilder18);
        org.junit.Assert.assertNotNull(jsonObjectBuilder19);
        org.junit.Assert.assertNotNull(jsonObject20);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = dateFormat0.parse("[SKIP, SKIP]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"[SKIP, SKIP]\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        int int0 = java.text.DateFormat.SECOND_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        int int0 = java.text.DateFormat.HOUR_OF_DAY1_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        java.util.Date date5 = dateTypeAdapter3.fromJson("null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNull(date5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.google.gson.Gson gson0 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory1 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass2 = cachedReflectionFactory1.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter3 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson0, (java.lang.reflect.Type) wildcardClass2);
        com.google.gson.stream.JsonWriter jsonWriter4 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy5 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy6 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] conflictResolutionStrategyArray7 = new io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] { conflictResolutionStrategy5, conflictResolutionStrategy6 };
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable8 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray7);
        java.util.Iterator<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumItor9 = conflictResolutionStrategyEnumSimpleIterable8.iterator();
        // The following exception was thrown during execution in test generation
        try {
            simpleIterableTypeAdapter3.write(jsonWriter4, conflictResolutionStrategyEnumSimpleIterable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy5 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy5.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy6 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy6.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNotNull(conflictResolutionStrategyArray7);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable8);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumItor9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.lang.Throwable throwable2 = null;
        io.gsonfire.gson.HookInvocationException hookInvocationException3 = new io.gsonfire.gson.HookInvocationException("", throwable2);
        io.gsonfire.gson.HookInvocationException hookInvocationException4 = new io.gsonfire.gson.HookInvocationException("", throwable2);
        java.lang.String str5 = hookInvocationException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "io.gsonfire.gson.HookInvocationException: " + "'", str5, "io.gsonfire.gson.HookInvocationException: ");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat1.parseObject("null");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-825812078436,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=9,WEEK_OF_YEAR=45,WEEK_OF_MONTH=6,DAY_OF_MONTH=31,DAY_OF_YEAR=304,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=45,SECOND=21,MILLISECOND=564,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject1 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder5 = jsonObjectBuilder0.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder3);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = jsonObjectBuilder0.set("", (java.lang.Number) (short) -1);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder11 = jsonObjectBuilder8.set("io.gsonfire.gson.HookInvocationException: ", (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(jsonObject1);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObjectBuilder5);
        org.junit.Assert.assertNotNull(jsonObjectBuilder8);
        org.junit.Assert.assertNotNull(jsonObjectBuilder11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat2 = new io.gsonfire.util.RFC3339DateFormat(timeZone0, false);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = rFC3339DateFormat2.parse("io.gsonfire.gson.HookInvocationException: ", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.io.gsonfire.gson.HookInvocationException:\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateRFC3339TypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = dateTypeAdapter5.fromJson("[SKIP, SKIP]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected a string but was BEGIN_ARRAY at line 1 column 2 path $");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat3 = new io.gsonfire.util.RFC3339DateFormat(timeZone0, false, true);
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            rFC3339DateFormat3.setTimeZone(timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        io.gsonfire.gson.FireExclusionStrategy fireExclusionStrategy0 = null;
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor1 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>(fireExclusionStrategy0);
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory2 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass3 = cachedReflectionFactory2.getClass();
        com.google.gson.JsonElement jsonElement4 = null;
        com.google.gson.Gson gson5 = null;
        annotatedElementMethodInvokerPostProcessor1.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass3, jsonElement4, gson5);
        com.google.gson.Gson gson7 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory8 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass9 = cachedReflectionFactory8.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter10 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson7, (java.lang.reflect.Type) wildcardClass9);
        com.google.gson.JsonElement jsonElement11 = null;
        com.google.gson.Gson gson12 = null;
        annotatedElementMethodInvokerPostProcessor1.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass9, jsonElement11, gson12);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        int int0 = java.text.DateFormat.HOUR1_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        int int0 = java.text.DateFormat.WEEK_OF_MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter0 = null;
        com.google.gson.stream.JsonReader jsonReader1 = null;
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder4 = jsonArrayBuilder2.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder5.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray8 = jsonArrayBuilder5.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder4.add((com.google.gson.JsonElement) jsonArray8);
        com.google.gson.JsonElement jsonElement10 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = io.gsonfire.util.JsonUtils.fromJsonTree(dateTypeAdapter0, jsonReader1, jsonElement10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder4);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArray8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        io.gsonfire.gson.DateUnixtimeMillisTypeAdapter dateUnixtimeMillisTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeMillisTypeAdapter(true);
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = dateUnixtimeMillisTypeAdapter1.fromJson(reader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter1 = new io.gsonfire.gson.DateRFC3339TypeAdapter(true);
        java.io.Writer writer2 = null;
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateRFC3339TypeAdapter1.toJson(writer2, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateRFC3339TypeAdapter2.nullSafe();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder6 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject7 = jsonObjectBuilder6.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder9 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject10 = jsonObjectBuilder9.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder11 = jsonObjectBuilder6.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder9);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder14 = jsonObjectBuilder6.set("", (java.lang.Number) (short) -1);
        com.google.gson.JsonObject jsonObject15 = jsonObjectBuilder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = dateTypeAdapter5.fromJsonTree((com.google.gson.JsonElement) jsonObject15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected STRING but was BEGIN_OBJECT at path $");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(jsonObject7);
        org.junit.Assert.assertNotNull(jsonObject10);
        org.junit.Assert.assertNotNull(jsonObjectBuilder11);
        org.junit.Assert.assertNotNull(jsonObjectBuilder14);
        org.junit.Assert.assertNotNull(jsonObject15);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat1 = new io.gsonfire.util.RFC3339DateFormat(timeZone0);
        java.util.Date date2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = rFC3339DateFormat1.format(date2, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.google.gson.Gson gson0 = null;
        com.google.gson.Gson gson1 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory2 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass3 = cachedReflectionFactory2.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter4 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson1, (java.lang.reflect.Type) wildcardClass3);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter5 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson0, (java.lang.reflect.Type) wildcardClass3);
        com.google.gson.stream.JsonWriter jsonWriter6 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy7 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy8 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] conflictResolutionStrategyArray9 = new io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] { conflictResolutionStrategy7, conflictResolutionStrategy8 };
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable10 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray9);
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable11 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray9);
        // The following exception was thrown during execution in test generation
        try {
            simpleIterableTypeAdapter5.write(jsonWriter6, conflictResolutionStrategyEnumSimpleIterable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy7 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy7.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy8 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy8.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNotNull(conflictResolutionStrategyArray9);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable10);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat3 = new io.gsonfire.util.RFC3339DateFormat(timeZone0, true, false);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = rFC3339DateFormat3.parse("null", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject1 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder5 = jsonObjectBuilder0.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder3);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = jsonObjectBuilder5.set("io.gsonfire.gson.HookInvocationException: ", (java.lang.Number) 1);
        org.junit.Assert.assertNotNull(jsonObject1);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObjectBuilder5);
        org.junit.Assert.assertNotNull(jsonObjectBuilder8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder3.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray6 = jsonArrayBuilder3.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder2.add((com.google.gson.JsonElement) jsonArray6);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator8 = jsonArray6.spliterator();
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArray6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonElementSpliterator8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder3.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray6 = jsonArrayBuilder3.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder2.add((com.google.gson.JsonElement) jsonArray6);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder2.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder8);
        com.google.gson.JsonArray jsonArray10 = jsonArrayBuilder9.build();
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArray6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArray10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat2 = new io.gsonfire.util.RFC3339DateFormat(true, false);
        java.util.Date date3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = rFC3339DateFormat2.format(date3, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.lang.Class<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClass0 = null;
        io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClassConfig1 = new io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException>(hookInvocationExceptionClass0);
        hookInvocationExceptionClassConfig1.setHooksEnabled(true);
        java.util.Collection<io.gsonfire.PostProcessor<io.gsonfire.gson.HookInvocationException>> hookInvocationExceptionPostProcessorCollection4 = hookInvocationExceptionClassConfig1.getPostProcessors();
        java.util.Collection<io.gsonfire.PreProcessor<io.gsonfire.gson.HookInvocationException>> hookInvocationExceptionPreProcessorCollection5 = hookInvocationExceptionClassConfig1.getPreProcessors();
        org.junit.Assert.assertNotNull(hookInvocationExceptionPostProcessorCollection4);
        org.junit.Assert.assertNotNull(hookInvocationExceptionPreProcessorCollection5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonElementBuilder jsonElementBuilder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder4 = jsonArrayBuilder0.add(jsonElementBuilder3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateUnixtimeSecondsTypeAdapter1.nullSafe();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder3.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder6 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder8 = jsonArrayBuilder6.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray9 = jsonArrayBuilder6.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder10 = jsonArrayBuilder5.add((com.google.gson.JsonElement) jsonArray9);
        com.google.gson.JsonElement jsonElement11 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = dateTypeAdapter2.fromJsonTree((com.google.gson.JsonElement) jsonArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NUMBER but was BEGIN_ARRAY at path $");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArrayBuilder6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder8);
        org.junit.Assert.assertNotNull(jsonArray9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder10);
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateRFC3339TypeAdapter2.nullSafe();
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement8 = dateRFC3339TypeAdapter2.toJsonTree(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.google.gson.Gson gson0 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.gsonfire.util.FieldNameResolver fieldNameResolver1 = new io.gsonfire.util.FieldNameResolver(gson0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        int int0 = java.text.DateFormat.WEEK_OF_YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass0 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass1 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy2 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.OVERWRITE;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory3 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass1, conflictResolutionStrategy2);
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory4 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass0, conflictResolutionStrategy2);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy2 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.OVERWRITE + "'", conflictResolutionStrategy2.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.OVERWRITE));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod2 = null;
        boolean boolean3 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod2);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor4 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite1);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray5 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite6 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray5);
        java.lang.reflect.Method method7 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass9 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy10 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory11 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass9, conflictResolutionStrategy10);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod12 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method7, "", conflictResolutionStrategy10);
        boolean boolean13 = fireExclusionStrategyComposite6.shouldSkipMethod(mappedMethod12);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray14 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite15 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray14);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod16 = null;
        boolean boolean17 = fireExclusionStrategyComposite15.shouldSkipMethod(mappedMethod16);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray18 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite19 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray18);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod20 = null;
        boolean boolean21 = fireExclusionStrategyComposite19.shouldSkipMethod(mappedMethod20);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray22 = new io.gsonfire.gson.FireExclusionStrategy[] { fireExclusionStrategyComposite1, fireExclusionStrategyComposite6, fireExclusionStrategyComposite15, fireExclusionStrategyComposite19 };
        java.util.ArrayList<io.gsonfire.gson.FireExclusionStrategy> fireExclusionStrategyList23 = new java.util.ArrayList<io.gsonfire.gson.FireExclusionStrategy>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<io.gsonfire.gson.FireExclusionStrategy>) fireExclusionStrategyList23, fireExclusionStrategyArray22);
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite25 = new io.gsonfire.gson.FireExclusionStrategyComposite((java.util.Collection<io.gsonfire.gson.FireExclusionStrategy>) fireExclusionStrategyList23);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray5);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy10 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy10.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.util.TimeZone timeZone1 = null;
        dateFormat0.setTimeZone(timeZone1);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder6 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject7 = jsonObjectBuilder6.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = jsonObjectBuilder3.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder6);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder11 = jsonObjectBuilder3.set("", (java.lang.Number) (short) -1);
        com.google.gson.JsonObject jsonObject12 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder13 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder15 = jsonArrayBuilder13.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder16 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject17 = jsonObjectBuilder16.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder19 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject20 = jsonObjectBuilder19.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder21 = jsonObjectBuilder16.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder19);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder24 = jsonObjectBuilder16.set("", (java.lang.Number) (short) -1);
        com.google.gson.JsonObject jsonObject25 = jsonObjectBuilder16.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder26 = jsonArrayBuilder13.add((com.google.gson.JsonElement) jsonObject25);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder27 = jsonObjectBuilder3.merge(jsonObject25);
        com.google.gson.JsonElement jsonElement28 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonObject25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dateFormat0.format((java.lang.Object) jsonObject25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObject7);
        org.junit.Assert.assertNotNull(jsonObjectBuilder8);
        org.junit.Assert.assertNotNull(jsonObjectBuilder11);
        org.junit.Assert.assertNotNull(jsonObject12);
        org.junit.Assert.assertNotNull(jsonArrayBuilder13);
        org.junit.Assert.assertNotNull(jsonArrayBuilder15);
        org.junit.Assert.assertNotNull(jsonObject17);
        org.junit.Assert.assertNotNull(jsonObject20);
        org.junit.Assert.assertNotNull(jsonObjectBuilder21);
        org.junit.Assert.assertNotNull(jsonObjectBuilder24);
        org.junit.Assert.assertNotNull(jsonObject25);
        org.junit.Assert.assertNotNull(jsonArrayBuilder26);
        org.junit.Assert.assertNotNull(jsonObjectBuilder27);
        org.junit.Assert.assertNotNull(jsonElement28);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone3 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter5 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone3, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateRFC3339TypeAdapter5.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateRFC3339TypeAdapter5.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = dateFormat0.formatToCharacterIterator((java.lang.Object) dateRFC3339TypeAdapter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-825812077419,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=9,WEEK_OF_YEAR=45,WEEK_OF_MONTH=6,DAY_OF_MONTH=31,DAY_OF_YEAR=304,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=45,SECOND=22,MILLISECOND=581,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = dateFormat0.isLenient();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Object obj2 = dateFormat1.clone();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat1 = new io.gsonfire.util.RFC3339DateFormat(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            rFC3339DateFormat1.setLenient(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.lang.reflect.Method method0 = null;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method4 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass6 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy7 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory8 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass6, conflictResolutionStrategy7);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod9 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method4, "", conflictResolutionStrategy7);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod10 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method2, "[SKIP, SKIP]", conflictResolutionStrategy7);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod11 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method0, "io.gsonfire.gson.HookInvocationException: ", conflictResolutionStrategy7);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy7 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy7.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        io.gsonfire.util.reflection.MethodInspector methodInspector0 = new io.gsonfire.util.reflection.MethodInspector();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        io.gsonfire.gson.DateUnixtimeMillisTypeAdapter dateUnixtimeMillisTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeMillisTypeAdapter(true);
        java.io.Writer writer2 = null;
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateUnixtimeMillisTypeAdapter1.toJson(writer2, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        int int0 = java.text.DateFormat.HOUR_OF_DAY0_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("null");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Dec 31, 1969" + "'", str2, "Dec 31, 1969");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.google.gson.Gson gson0 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory1 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass2 = cachedReflectionFactory1.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter3 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson0, (java.lang.reflect.Type) wildcardClass2);
        com.google.gson.stream.JsonWriter jsonWriter4 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy5 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy6 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] conflictResolutionStrategyArray7 = new io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] { conflictResolutionStrategy5, conflictResolutionStrategy6 };
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable8 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray7);
        java.util.Iterator<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumItor9 = conflictResolutionStrategyEnumSimpleIterable8.iterator();
        java.lang.String str10 = conflictResolutionStrategyEnumSimpleIterable8.toString();
        // The following exception was thrown during execution in test generation
        try {
            simpleIterableTypeAdapter3.write(jsonWriter4, conflictResolutionStrategyEnumSimpleIterable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy5 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy5.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy6 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy6.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNotNull(conflictResolutionStrategyArray7);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable8);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumItor9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[SKIP, SKIP]" + "'", str10, "[SKIP, SKIP]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        java.io.Reader reader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = dateRFC3339TypeAdapter2.fromJson(reader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        io.gsonfire.gson.HooksInvoker hooksInvoker0 = new io.gsonfire.gson.HooksInvoker();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder1 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = jsonArrayBuilder1.add((java.lang.Number) (-1.0d));
        hooksInvoker0.preSerialize((java.lang.Object) jsonArrayBuilder1);
        org.junit.Assert.assertNotNull(jsonArrayBuilder1);
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod2 = null;
        boolean boolean3 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod2);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor4 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite1);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<io.gsonfire.gson.DateUnixtimeMillisTypeAdapter> dateUnixtimeMillisTypeAdapterMethodInvokerPostProcessor5 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<io.gsonfire.gson.DateUnixtimeMillisTypeAdapter>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite1);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject1 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder3.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder6 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder8 = jsonArrayBuilder6.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray9 = jsonArrayBuilder6.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder10 = jsonArrayBuilder5.add((com.google.gson.JsonElement) jsonArray9);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder11 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder12 = jsonArrayBuilder5.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder11);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder13 = jsonObjectBuilder0.set("[SKIP, SKIP]", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder11);
        org.junit.Assert.assertNotNull(jsonObject1);
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArrayBuilder6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder8);
        org.junit.Assert.assertNotNull(jsonArray9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder10);
        org.junit.Assert.assertNotNull(jsonArrayBuilder12);
        org.junit.Assert.assertNotNull(jsonObjectBuilder13);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (byte) 10, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.lang.Class<io.gsonfire.DateSerializationPolicy> dateSerializationPolicyClass0 = null;
        io.gsonfire.DateSerializationPolicy dateSerializationPolicy1 = io.gsonfire.DateSerializationPolicy.unixTimeMillis;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.DateSerializationPolicy> dateSerializationPolicyEnumDefaultValueTypeAdapterFactory2 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.DateSerializationPolicy>(dateSerializationPolicyClass0, dateSerializationPolicy1);
        org.junit.Assert.assertNotNull(dateSerializationPolicy1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        java.lang.Class<java.lang.CharSequence> charSequenceClass0 = null;
        io.gsonfire.ClassConfig<java.lang.CharSequence> charSequenceClassConfig1 = new io.gsonfire.ClassConfig<java.lang.CharSequence>(charSequenceClass0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat2 = new io.gsonfire.util.RFC3339DateFormat(timeZone0, false);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = rFC3339DateFormat2.parse("Dec 31, 1969", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.text.ParseException: Unparseable date: \"Dec 31, 1969-0000\"");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray3 = jsonArrayBuilder2.build();
        io.gsonfire.builders.JsonElementBuilder jsonElementBuilder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder2.add(jsonElementBuilder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArray3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        int int0 = java.text.DateFormat.TIMEZONE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.stream.JsonWriter jsonWriter2 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy3 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy4 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] conflictResolutionStrategyArray5 = new io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] { conflictResolutionStrategy3, conflictResolutionStrategy4 };
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable6 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement7 = io.gsonfire.util.JsonUtils.toJsonTree((com.google.gson.TypeAdapter) dateUnixtimeSecondsTypeAdapter1, jsonWriter2, (java.lang.Object) conflictResolutionStrategyArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy3 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy3.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy4 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy4.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNotNull(conflictResolutionStrategyArray5);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder3.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray6 = jsonArrayBuilder3.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder2.add((com.google.gson.JsonElement) jsonArray6);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder2.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder8);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder12 = jsonObjectBuilder8.set("", "null");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder14 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject15 = jsonObjectBuilder14.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder17 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject18 = jsonObjectBuilder17.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder19 = jsonObjectBuilder14.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder17);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder22 = jsonObjectBuilder14.set("", (java.lang.Number) (short) -1);
        com.google.gson.JsonObject jsonObject23 = jsonObjectBuilder14.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder24 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder26 = jsonArrayBuilder24.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder27 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject28 = jsonObjectBuilder27.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder30 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject31 = jsonObjectBuilder30.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder32 = jsonObjectBuilder27.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder30);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder35 = jsonObjectBuilder27.set("", (java.lang.Number) (short) -1);
        com.google.gson.JsonObject jsonObject36 = jsonObjectBuilder27.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder37 = jsonArrayBuilder24.add((com.google.gson.JsonElement) jsonObject36);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder38 = jsonObjectBuilder14.merge(jsonObject36);
        io.gsonfire.gson.FireExclusionStrategy fireExclusionStrategy40 = null;
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor41 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>(fireExclusionStrategy40);
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory42 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass43 = cachedReflectionFactory42.getClass();
        com.google.gson.JsonElement jsonElement44 = null;
        com.google.gson.Gson gson45 = null;
        annotatedElementMethodInvokerPostProcessor41.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass43, jsonElement44, gson45);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder47 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder49 = jsonArrayBuilder47.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder50 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder52 = jsonArrayBuilder50.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray53 = jsonArrayBuilder50.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder54 = jsonArrayBuilder49.add((com.google.gson.JsonElement) jsonArray53);
        com.google.gson.Gson gson55 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory56 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass57 = cachedReflectionFactory56.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter58 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson55, (java.lang.reflect.Type) wildcardClass57);
        com.google.gson.Gson gson59 = null;
        annotatedElementMethodInvokerPostProcessor41.postSerialize((com.google.gson.JsonElement) jsonArray53, (java.lang.reflect.AnnotatedElement) wildcardClass57, gson59);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder61 = jsonObjectBuilder14.set("", (com.google.gson.JsonElement) jsonArray53);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder63 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject64 = jsonObjectBuilder63.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder65 = jsonObjectBuilder14.set("", (com.google.gson.JsonElement) jsonObject64);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder66 = jsonObjectBuilder8.set("null", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder14);
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArray6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonObjectBuilder12);
        org.junit.Assert.assertNotNull(jsonObject15);
        org.junit.Assert.assertNotNull(jsonObject18);
        org.junit.Assert.assertNotNull(jsonObjectBuilder19);
        org.junit.Assert.assertNotNull(jsonObjectBuilder22);
        org.junit.Assert.assertNotNull(jsonObject23);
        org.junit.Assert.assertNotNull(jsonArrayBuilder24);
        org.junit.Assert.assertNotNull(jsonArrayBuilder26);
        org.junit.Assert.assertNotNull(jsonObject28);
        org.junit.Assert.assertNotNull(jsonObject31);
        org.junit.Assert.assertNotNull(jsonObjectBuilder32);
        org.junit.Assert.assertNotNull(jsonObjectBuilder35);
        org.junit.Assert.assertNotNull(jsonObject36);
        org.junit.Assert.assertNotNull(jsonArrayBuilder37);
        org.junit.Assert.assertNotNull(jsonObjectBuilder38);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(jsonArrayBuilder47);
        org.junit.Assert.assertNotNull(jsonArrayBuilder49);
        org.junit.Assert.assertNotNull(jsonArrayBuilder50);
        org.junit.Assert.assertNotNull(jsonArrayBuilder52);
        org.junit.Assert.assertNotNull(jsonArray53);
        org.junit.Assert.assertNotNull(jsonArrayBuilder54);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(jsonObjectBuilder61);
        org.junit.Assert.assertNotNull(jsonObject64);
        org.junit.Assert.assertNotNull(jsonObjectBuilder65);
        org.junit.Assert.assertNotNull(jsonObjectBuilder66);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy0 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy1 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] conflictResolutionStrategyArray2 = new io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] { conflictResolutionStrategy0, conflictResolutionStrategy1 };
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable3 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray2);
        java.util.Iterator<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumItor4 = conflictResolutionStrategyEnumSimpleIterable3.iterator();
        java.util.Iterator<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumItor5 = conflictResolutionStrategyEnumSimpleIterable3.iterator();
        java.util.Iterator<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumItor6 = conflictResolutionStrategyEnumSimpleIterable3.iterator();
        java.util.Iterator<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumItor7 = conflictResolutionStrategyEnumSimpleIterable3.iterator();
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy0 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy0.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy1 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy1.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNotNull(conflictResolutionStrategyArray2);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable3);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumItor4);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumItor5);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumItor6);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumItor7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        io.gsonfire.gson.DateUnixtimeMillisTypeAdapter dateUnixtimeMillisTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeMillisTypeAdapter(false);
        com.google.gson.stream.JsonWriter jsonWriter2 = null;
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateUnixtimeMillisTypeAdapter1.write(jsonWriter2, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.Calendar calendar3 = dateFormat1.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-825812076522,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=9,WEEK_OF_YEAR=45,WEEK_OF_MONTH=6,DAY_OF_MONTH=31,DAY_OF_YEAR=304,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=45,SECOND=23,MILLISECOND=478,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-825812076522,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=9,WEEK_OF_YEAR=45,WEEK_OF_MONTH=6,DAY_OF_MONTH=31,DAY_OF_YEAR=304,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=45,SECOND=23,MILLISECOND=478,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod2 = null;
        boolean boolean3 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod2);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor4 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite1);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray5 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite6 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray5);
        java.lang.reflect.Method method7 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass9 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy10 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory11 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass9, conflictResolutionStrategy10);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod12 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method7, "", conflictResolutionStrategy10);
        boolean boolean13 = fireExclusionStrategyComposite6.shouldSkipMethod(mappedMethod12);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray14 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite15 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray14);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod16 = null;
        boolean boolean17 = fireExclusionStrategyComposite15.shouldSkipMethod(mappedMethod16);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray18 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite19 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray18);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod20 = null;
        boolean boolean21 = fireExclusionStrategyComposite19.shouldSkipMethod(mappedMethod20);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray22 = new io.gsonfire.gson.FireExclusionStrategy[] { fireExclusionStrategyComposite1, fireExclusionStrategyComposite6, fireExclusionStrategyComposite15, fireExclusionStrategyComposite19 };
        java.util.ArrayList<io.gsonfire.gson.FireExclusionStrategy> fireExclusionStrategyList23 = new java.util.ArrayList<io.gsonfire.gson.FireExclusionStrategy>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<io.gsonfire.gson.FireExclusionStrategy>) fireExclusionStrategyList23, fireExclusionStrategyArray22);
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite25 = new io.gsonfire.gson.FireExclusionStrategyComposite((java.util.Collection<io.gsonfire.gson.FireExclusionStrategy>) fireExclusionStrategyList23);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray26 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite27 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray26);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod28 = null;
        boolean boolean29 = fireExclusionStrategyComposite27.shouldSkipMethod(mappedMethod28);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray30 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite31 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray30);
        java.lang.reflect.Method method32 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass34 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy35 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory36 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass34, conflictResolutionStrategy35);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod37 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method32, "", conflictResolutionStrategy35);
        boolean boolean38 = fireExclusionStrategyComposite31.shouldSkipMethod(mappedMethod37);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray39 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite40 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray39);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod41 = null;
        boolean boolean42 = fireExclusionStrategyComposite40.shouldSkipMethod(mappedMethod41);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor43 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite40);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray44 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite45 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray44);
        java.lang.reflect.Method method46 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass48 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy49 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory50 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass48, conflictResolutionStrategy49);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod51 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method46, "", conflictResolutionStrategy49);
        boolean boolean52 = fireExclusionStrategyComposite45.shouldSkipMethod(mappedMethod51);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray53 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite54 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray53);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod55 = null;
        boolean boolean56 = fireExclusionStrategyComposite54.shouldSkipMethod(mappedMethod55);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray57 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite58 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray57);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod59 = null;
        boolean boolean60 = fireExclusionStrategyComposite58.shouldSkipMethod(mappedMethod59);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray61 = new io.gsonfire.gson.FireExclusionStrategy[] { fireExclusionStrategyComposite40, fireExclusionStrategyComposite45, fireExclusionStrategyComposite54, fireExclusionStrategyComposite58 };
        java.util.ArrayList<io.gsonfire.gson.FireExclusionStrategy> fireExclusionStrategyList62 = new java.util.ArrayList<io.gsonfire.gson.FireExclusionStrategy>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<io.gsonfire.gson.FireExclusionStrategy>) fireExclusionStrategyList62, fireExclusionStrategyArray61);
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite64 = new io.gsonfire.gson.FireExclusionStrategyComposite((java.util.Collection<io.gsonfire.gson.FireExclusionStrategy>) fireExclusionStrategyList62);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray65 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite66 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray65);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray67 = new io.gsonfire.gson.FireExclusionStrategy[] { fireExclusionStrategyComposite25, fireExclusionStrategyComposite27, fireExclusionStrategyComposite31, fireExclusionStrategyComposite64, fireExclusionStrategyComposite66 };
        java.util.ArrayList<io.gsonfire.gson.FireExclusionStrategy> fireExclusionStrategyList68 = new java.util.ArrayList<io.gsonfire.gson.FireExclusionStrategy>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<io.gsonfire.gson.FireExclusionStrategy>) fireExclusionStrategyList68, fireExclusionStrategyArray67);
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite70 = new io.gsonfire.gson.FireExclusionStrategyComposite((java.util.Collection<io.gsonfire.gson.FireExclusionStrategy>) fireExclusionStrategyList68);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray5);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy10 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy10.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray30);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy35 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy35.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray44);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy49 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy49.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray65);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.lang.Throwable throwable3 = null;
        io.gsonfire.gson.HookInvocationException hookInvocationException4 = new io.gsonfire.gson.HookInvocationException("", throwable3);
        io.gsonfire.gson.HookInvocationException hookInvocationException5 = new io.gsonfire.gson.HookInvocationException("hi!", throwable3);
        io.gsonfire.gson.HookInvocationException hookInvocationException6 = new io.gsonfire.gson.HookInvocationException("[SKIP, SKIP]", throwable3);
        java.lang.String str7 = hookInvocationException6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "io.gsonfire.gson.HookInvocationException: [SKIP, SKIP]" + "'", str7, "io.gsonfire.gson.HookInvocationException: [SKIP, SKIP]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy0 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy1 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] conflictResolutionStrategyArray2 = new io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] { conflictResolutionStrategy0, conflictResolutionStrategy1 };
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable3 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray2);
        java.util.Collection<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumCollection4 = conflictResolutionStrategyEnumSimpleIterable3.toCollection();
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy0 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy0.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy1 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy1.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNotNull(conflictResolutionStrategyArray2);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable3);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumCollection4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        io.gsonfire.gson.CollectionOperationTypeAdapterFactory collectionOperationTypeAdapterFactory0 = new io.gsonfire.gson.CollectionOperationTypeAdapterFactory();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateRFC3339TypeAdapter2.toJson(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder3.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray6 = jsonArrayBuilder3.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder2.add((com.google.gson.JsonElement) jsonArray6);
        com.google.gson.JsonElement jsonElement8 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray6);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator9 = jsonArray6.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable10 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray6);
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable11 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArray6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(jsonElementSpliterator9);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable10);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder4 = jsonArrayBuilder2.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder5.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray8 = jsonArrayBuilder5.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder4.add((com.google.gson.JsonElement) jsonArray8);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder10 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder11 = jsonArrayBuilder4.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder10);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder12 = jsonObjectBuilder0.set("", (io.gsonfire.builders.JsonElementBuilder) jsonArrayBuilder11);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder14 = jsonObjectBuilder0.setNull("");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder17 = jsonObjectBuilder0.set("hi!", "hi!");
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder4);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArray8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder11);
        org.junit.Assert.assertNotNull(jsonObjectBuilder12);
        org.junit.Assert.assertNotNull(jsonObjectBuilder14);
        org.junit.Assert.assertNotNull(jsonObjectBuilder17);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        io.gsonfire.GsonFireBuilder gsonFireBuilder0 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson1 = gsonFireBuilder0.createGson();
        com.google.gson.GsonBuilder gsonBuilder2 = gsonFireBuilder0.createGsonBuilder();
        org.junit.Assert.assertNotNull(gson1);
        org.junit.Assert.assertNotNull(gsonBuilder2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat2 = new io.gsonfire.util.RFC3339DateFormat(timeZone0, true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.google.gson.Gson gson0 = null;
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass3 = dateFormat2.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter4 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson0, (java.lang.reflect.Type) wildcardClass3);
        com.google.gson.stream.JsonWriter jsonWriter5 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy6 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy7 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] conflictResolutionStrategyArray8 = new io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] { conflictResolutionStrategy6, conflictResolutionStrategy7 };
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable9 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray8);
        // The following exception was thrown during execution in test generation
        try {
            simpleIterableTypeAdapter4.write(jsonWriter5, conflictResolutionStrategyEnumSimpleIterable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy6 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy6.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy7 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy7.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNotNull(conflictResolutionStrategyArray8);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter1 = new io.gsonfire.gson.DateRFC3339TypeAdapter(true);
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = dateRFC3339TypeAdapter1.fromJson(reader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        io.gsonfire.gson.DateUnixtimeMillisTypeAdapter dateUnixtimeMillisTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeMillisTypeAdapter(false);
        java.io.Writer writer2 = null;
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateUnixtimeMillisTypeAdapter1.toJson(writer2, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateRFC3339TypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = dateTypeAdapter5.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateRFC3339TypeAdapter2.nullSafe();
        java.io.Writer writer7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateRFC3339TypeAdapter2.toJson(writer7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateUnixtimeSecondsTypeAdapter1.toJson(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        java.lang.reflect.Method method2 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass4 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy5 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory6 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass4, conflictResolutionStrategy5);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod7 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method2, "", conflictResolutionStrategy5);
        boolean boolean8 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod7);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor9 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite1);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy5 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy5.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.gsonfire.util.reflection.FieldInspector fieldInspector0 = new io.gsonfire.util.reflection.FieldInspector();
        io.gsonfire.util.reflection.FieldInspector fieldInspector1 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory2 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        io.gsonfire.gson.ExcludeByValueTypeAdapterFactory excludeByValueTypeAdapterFactory3 = new io.gsonfire.gson.ExcludeByValueTypeAdapterFactory(fieldInspector1, (io.gsonfire.util.reflection.Factory) cachedReflectionFactory2);
        io.gsonfire.gson.ExcludeByValueTypeAdapterFactory excludeByValueTypeAdapterFactory4 = new io.gsonfire.gson.ExcludeByValueTypeAdapterFactory(fieldInspector0, (io.gsonfire.util.reflection.Factory) cachedReflectionFactory2);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        io.gsonfire.gson.DateUnixtimeMillisTypeAdapter dateUnixtimeMillisTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeMillisTypeAdapter(true);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateUnixtimeMillisTypeAdapter1.nullSafe();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder3.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray6 = jsonArrayBuilder3.build();
        com.google.gson.JsonArray jsonArray7 = jsonArrayBuilder3.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder3.add("hi!");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder10 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject11 = jsonObjectBuilder10.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder12 = jsonArrayBuilder3.add((com.google.gson.JsonElement) jsonObject11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = dateUnixtimeMillisTypeAdapter1.fromJsonTree((com.google.gson.JsonElement) jsonObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NUMBER but was BEGIN_OBJECT at path $");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArray6);
        org.junit.Assert.assertNotNull(jsonArray7);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonObject11);
        org.junit.Assert.assertNotNull(jsonArrayBuilder12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dateFormat0.format(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.stream.JsonReader jsonReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = dateRFC3339TypeAdapter2.read(jsonReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.google.gson.Gson gson0 = null;
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass3 = dateFormat2.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter4 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson0, (java.lang.reflect.Type) wildcardClass3);
        com.google.gson.stream.JsonWriter jsonWriter5 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy6 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy7 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] conflictResolutionStrategyArray8 = new io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] { conflictResolutionStrategy6, conflictResolutionStrategy7 };
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable9 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray8);
        java.util.Iterator<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumItor10 = conflictResolutionStrategyEnumSimpleIterable9.iterator();
        java.util.Iterator<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumItor11 = conflictResolutionStrategyEnumSimpleIterable9.iterator();
        java.util.Collection<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumCollection12 = conflictResolutionStrategyEnumSimpleIterable9.toCollection();
        // The following exception was thrown during execution in test generation
        try {
            simpleIterableTypeAdapter4.write(jsonWriter5, conflictResolutionStrategyEnumSimpleIterable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy6 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy6.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy7 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy7.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNotNull(conflictResolutionStrategyArray8);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable9);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumItor10);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumItor11);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumCollection12);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder4 = jsonArrayBuilder2.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder5.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray8 = jsonArrayBuilder5.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder4.add((com.google.gson.JsonElement) jsonArray8);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder10 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder11 = jsonArrayBuilder4.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder10);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder12 = jsonObjectBuilder0.set("", (io.gsonfire.builders.JsonElementBuilder) jsonArrayBuilder11);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder14 = jsonArrayBuilder11.add((java.lang.Number) 9);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder16 = jsonArrayBuilder14.add((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder4);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArray8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder11);
        org.junit.Assert.assertNotNull(jsonObjectBuilder12);
        org.junit.Assert.assertNotNull(jsonArrayBuilder14);
        org.junit.Assert.assertNotNull(jsonArrayBuilder16);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (short) 100, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        java.lang.reflect.Method method2 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass4 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy5 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory6 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass4, conflictResolutionStrategy5);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod7 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method2, "", conflictResolutionStrategy5);
        boolean boolean8 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod7);
        java.lang.String str9 = mappedMethod7.getSerializedName();
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy5 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy5.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.util.Map<java.lang.Class<java.lang.Object>, io.gsonfire.util.Mapper<java.lang.Object, java.lang.String>> objClassMap0 = null;
        io.gsonfire.gson.WrapTypeAdapterFactory<java.lang.Object> objWrapTypeAdapterFactory1 = new io.gsonfire.gson.WrapTypeAdapterFactory<java.lang.Object>(objClassMap0);
        java.lang.Class<?> wildcardClass2 = objWrapTypeAdapterFactory1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 13);
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Dec 31, 1969" + "'", str2, "Dec 31, 1969");
        org.junit.Assert.assertNotNull(numberFormat3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject1 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder5 = jsonObjectBuilder0.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder3);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = jsonObjectBuilder0.set("", (java.lang.Number) (short) -1);
        com.google.gson.JsonObject jsonObject9 = jsonObjectBuilder8.build();
        org.junit.Assert.assertNotNull(jsonObject1);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObjectBuilder5);
        org.junit.Assert.assertNotNull(jsonObjectBuilder8);
        org.junit.Assert.assertNotNull(jsonObject9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = dateFormat4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateFormat0.format((java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-825812075414,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=9,WEEK_OF_YEAR=45,WEEK_OF_MONTH=6,DAY_OF_MONTH=31,DAY_OF_YEAR=304,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=45,SECOND=24,MILLISECOND=586,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray3 = jsonArrayBuilder0.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder0.add((java.lang.Number) 10);
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArray3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = dateFormat0.parseObject("null");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.Map<java.lang.Class<io.gsonfire.util.reflection.FieldInspector>, io.gsonfire.util.Mapper<io.gsonfire.util.reflection.FieldInspector, java.lang.String>> fieldInspectorClassMap1 = null;
        io.gsonfire.gson.WrapTypeAdapterFactory<io.gsonfire.util.reflection.FieldInspector> fieldInspectorWrapTypeAdapterFactory2 = new io.gsonfire.gson.WrapTypeAdapterFactory<io.gsonfire.util.reflection.FieldInspector>(fieldInspectorClassMap1);
        boolean boolean3 = dateFormat0.equals((java.lang.Object) fieldInspectorClassMap1);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder4 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder6 = jsonArrayBuilder4.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder7.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray10 = jsonArrayBuilder7.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder11 = jsonArrayBuilder6.add((com.google.gson.JsonElement) jsonArray10);
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable12 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray10);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator13 = jsonArray10.spliterator();
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = dateFormat0.format((java.lang.Object) jsonElementSpliterator13, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder4);
        org.junit.Assert.assertNotNull(jsonArrayBuilder6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArray10);
        org.junit.Assert.assertNotNull(jsonArrayBuilder11);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable12);
        org.junit.Assert.assertNotNull(jsonElementSpliterator13);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        int int0 = java.text.DateFormat.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        java.io.Writer writer3 = null;
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateRFC3339TypeAdapter2.toJson(writer3, date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat2 = dateFormat0.getNumberFormat();
        io.gsonfire.GsonFireBuilder gsonFireBuilder3 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson4 = gsonFireBuilder3.createGson();
        io.gsonfire.GsonFireBuilder gsonFireBuilder5 = gsonFireBuilder3.enableExclusionByValue();
        java.util.TimeZone timeZone6 = null;
        io.gsonfire.GsonFireBuilder gsonFireBuilder7 = gsonFireBuilder5.serializeTimeZone(timeZone6);
        io.gsonfire.GsonFireBuilder gsonFireBuilder8 = gsonFireBuilder7.enableExposeMethodResult();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = dateFormat0.formatToCharacterIterator((java.lang.Object) gsonFireBuilder7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(gson4);
        org.junit.Assert.assertNotNull(gsonFireBuilder5);
        org.junit.Assert.assertNotNull(gsonFireBuilder7);
        org.junit.Assert.assertNotNull(gsonFireBuilder8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject1 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder5 = jsonObjectBuilder0.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder3);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = jsonObjectBuilder0.set("", (java.lang.Number) (short) -1);
        com.google.gson.JsonObject jsonObject9 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder10 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder12 = jsonArrayBuilder10.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder13 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject14 = jsonObjectBuilder13.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder16 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject17 = jsonObjectBuilder16.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder18 = jsonObjectBuilder13.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder16);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder21 = jsonObjectBuilder13.set("", (java.lang.Number) (short) -1);
        com.google.gson.JsonObject jsonObject22 = jsonObjectBuilder13.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder23 = jsonArrayBuilder10.add((com.google.gson.JsonElement) jsonObject22);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder24 = jsonObjectBuilder0.merge(jsonObject22);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder25 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder27 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder29 = jsonArrayBuilder27.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder30 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder32 = jsonArrayBuilder30.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray33 = jsonArrayBuilder30.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder34 = jsonArrayBuilder29.add((com.google.gson.JsonElement) jsonArray33);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder35 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder36 = jsonArrayBuilder29.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder35);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder37 = jsonObjectBuilder25.set("", (io.gsonfire.builders.JsonElementBuilder) jsonArrayBuilder36);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder39 = jsonObjectBuilder25.setNull("");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder40 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder42 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder44 = jsonArrayBuilder42.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder45 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder47 = jsonArrayBuilder45.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray48 = jsonArrayBuilder45.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder49 = jsonArrayBuilder44.add((com.google.gson.JsonElement) jsonArray48);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder50 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder51 = jsonArrayBuilder44.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder50);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder52 = jsonObjectBuilder40.set("", (io.gsonfire.builders.JsonElementBuilder) jsonArrayBuilder51);
        com.google.gson.JsonObject jsonObject53 = jsonObjectBuilder52.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder54 = jsonObjectBuilder39.merge(jsonObject53);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder55 = jsonObjectBuilder24.merge(jsonObject53);
        org.junit.Assert.assertNotNull(jsonObject1);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObjectBuilder5);
        org.junit.Assert.assertNotNull(jsonObjectBuilder8);
        org.junit.Assert.assertNotNull(jsonObject9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder10);
        org.junit.Assert.assertNotNull(jsonArrayBuilder12);
        org.junit.Assert.assertNotNull(jsonObject14);
        org.junit.Assert.assertNotNull(jsonObject17);
        org.junit.Assert.assertNotNull(jsonObjectBuilder18);
        org.junit.Assert.assertNotNull(jsonObjectBuilder21);
        org.junit.Assert.assertNotNull(jsonObject22);
        org.junit.Assert.assertNotNull(jsonArrayBuilder23);
        org.junit.Assert.assertNotNull(jsonObjectBuilder24);
        org.junit.Assert.assertNotNull(jsonArrayBuilder27);
        org.junit.Assert.assertNotNull(jsonArrayBuilder29);
        org.junit.Assert.assertNotNull(jsonArrayBuilder30);
        org.junit.Assert.assertNotNull(jsonArrayBuilder32);
        org.junit.Assert.assertNotNull(jsonArray33);
        org.junit.Assert.assertNotNull(jsonArrayBuilder34);
        org.junit.Assert.assertNotNull(jsonArrayBuilder36);
        org.junit.Assert.assertNotNull(jsonObjectBuilder37);
        org.junit.Assert.assertNotNull(jsonObjectBuilder39);
        org.junit.Assert.assertNotNull(jsonArrayBuilder42);
        org.junit.Assert.assertNotNull(jsonArrayBuilder44);
        org.junit.Assert.assertNotNull(jsonArrayBuilder45);
        org.junit.Assert.assertNotNull(jsonArrayBuilder47);
        org.junit.Assert.assertNotNull(jsonArray48);
        org.junit.Assert.assertNotNull(jsonArrayBuilder49);
        org.junit.Assert.assertNotNull(jsonArrayBuilder51);
        org.junit.Assert.assertNotNull(jsonObjectBuilder52);
        org.junit.Assert.assertNotNull(jsonObject53);
        org.junit.Assert.assertNotNull(jsonObjectBuilder54);
        org.junit.Assert.assertNotNull(jsonObjectBuilder55);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat2 = new io.gsonfire.util.RFC3339DateFormat(timeZone0, false);
        java.util.TimeZone timeZone3 = null;
        // The following exception was thrown during execution in test generation
        try {
            rFC3339DateFormat2.setTimeZone(timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject1 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder5 = jsonObjectBuilder0.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder3);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = jsonObjectBuilder5.set("null", (java.lang.Number) 9);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder10 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder12 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder14 = jsonArrayBuilder12.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder15 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder17 = jsonArrayBuilder15.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray18 = jsonArrayBuilder15.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder19 = jsonArrayBuilder14.add((com.google.gson.JsonElement) jsonArray18);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder20 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder21 = jsonArrayBuilder14.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder20);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder22 = jsonObjectBuilder10.set("", (io.gsonfire.builders.JsonElementBuilder) jsonArrayBuilder21);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder24 = jsonObjectBuilder10.setNull("");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder25 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder27 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder29 = jsonArrayBuilder27.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder30 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder32 = jsonArrayBuilder30.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray33 = jsonArrayBuilder30.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder34 = jsonArrayBuilder29.add((com.google.gson.JsonElement) jsonArray33);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder35 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder36 = jsonArrayBuilder29.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder35);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder37 = jsonObjectBuilder25.set("", (io.gsonfire.builders.JsonElementBuilder) jsonArrayBuilder36);
        com.google.gson.JsonObject jsonObject38 = jsonObjectBuilder37.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder39 = jsonObjectBuilder24.merge(jsonObject38);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder40 = jsonObjectBuilder5.set("io.gsonfire.gson.HookInvocationException: [SKIP, SKIP]", (com.google.gson.JsonElement) jsonObject38);
        org.junit.Assert.assertNotNull(jsonObject1);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObjectBuilder5);
        org.junit.Assert.assertNotNull(jsonObjectBuilder8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder12);
        org.junit.Assert.assertNotNull(jsonArrayBuilder14);
        org.junit.Assert.assertNotNull(jsonArrayBuilder15);
        org.junit.Assert.assertNotNull(jsonArrayBuilder17);
        org.junit.Assert.assertNotNull(jsonArray18);
        org.junit.Assert.assertNotNull(jsonArrayBuilder19);
        org.junit.Assert.assertNotNull(jsonArrayBuilder21);
        org.junit.Assert.assertNotNull(jsonObjectBuilder22);
        org.junit.Assert.assertNotNull(jsonObjectBuilder24);
        org.junit.Assert.assertNotNull(jsonArrayBuilder27);
        org.junit.Assert.assertNotNull(jsonArrayBuilder29);
        org.junit.Assert.assertNotNull(jsonArrayBuilder30);
        org.junit.Assert.assertNotNull(jsonArrayBuilder32);
        org.junit.Assert.assertNotNull(jsonArray33);
        org.junit.Assert.assertNotNull(jsonArrayBuilder34);
        org.junit.Assert.assertNotNull(jsonArrayBuilder36);
        org.junit.Assert.assertNotNull(jsonObjectBuilder37);
        org.junit.Assert.assertNotNull(jsonObject38);
        org.junit.Assert.assertNotNull(jsonObjectBuilder39);
        org.junit.Assert.assertNotNull(jsonObjectBuilder40);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.lang.reflect.Method method0 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass2 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy3 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory4 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass2, conflictResolutionStrategy3);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod5 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method0, "", conflictResolutionStrategy3);
        java.lang.reflect.Method method6 = mappedMethod5.getMethod();
        java.lang.String str7 = mappedMethod5.getSerializedName();
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy3 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy3.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        io.gsonfire.gson.DateUnixtimeMillisTypeAdapter dateUnixtimeMillisTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeMillisTypeAdapter(false);
        com.google.gson.stream.JsonReader jsonReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = dateUnixtimeMillisTypeAdapter1.read(jsonReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject1 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder5 = jsonObjectBuilder0.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder3);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = jsonObjectBuilder5.set("null", (java.lang.Number) 9);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder11 = jsonObjectBuilder8.set("[SKIP, SKIP]", (java.lang.Boolean) true);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder13 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder15 = jsonArrayBuilder13.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder16 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder18 = jsonArrayBuilder16.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray19 = jsonArrayBuilder16.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder20 = jsonArrayBuilder15.add((com.google.gson.JsonElement) jsonArray19);
        com.google.gson.JsonElement jsonElement21 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray19);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator22 = jsonArray19.spliterator();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder23 = jsonObjectBuilder11.set("io.gsonfire.gson.HookInvocationException: [SKIP, SKIP]", (com.google.gson.JsonElement) jsonArray19);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder25 = jsonObjectBuilder11.setNull("null");
        org.junit.Assert.assertNotNull(jsonObject1);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObjectBuilder5);
        org.junit.Assert.assertNotNull(jsonObjectBuilder8);
        org.junit.Assert.assertNotNull(jsonObjectBuilder11);
        org.junit.Assert.assertNotNull(jsonArrayBuilder13);
        org.junit.Assert.assertNotNull(jsonArrayBuilder15);
        org.junit.Assert.assertNotNull(jsonArrayBuilder16);
        org.junit.Assert.assertNotNull(jsonArrayBuilder18);
        org.junit.Assert.assertNotNull(jsonArray19);
        org.junit.Assert.assertNotNull(jsonArrayBuilder20);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNotNull(jsonElementSpliterator22);
        org.junit.Assert.assertNotNull(jsonObjectBuilder23);
        org.junit.Assert.assertNotNull(jsonObjectBuilder25);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.lang.Throwable throwable3 = null;
        io.gsonfire.gson.HookInvocationException hookInvocationException4 = new io.gsonfire.gson.HookInvocationException("", throwable3);
        io.gsonfire.gson.HookInvocationException hookInvocationException5 = new io.gsonfire.gson.HookInvocationException("null", throwable3);
        io.gsonfire.gson.HookInvocationException hookInvocationException6 = new io.gsonfire.gson.HookInvocationException("Dec 31, 1969", throwable3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat1 = new io.gsonfire.util.RFC3339DateFormat(false);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = rFC3339DateFormat1.parse("null", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod2 = null;
        boolean boolean3 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod2);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor4 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite1);
        java.lang.reflect.Method method5 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass7 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy8 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory9 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass7, conflictResolutionStrategy8);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod10 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method5, "", conflictResolutionStrategy8);
        java.lang.reflect.Method method11 = mappedMethod10.getMethod();
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy12 = mappedMethod10.getConflictResolutionStrategy();
        boolean boolean13 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod10);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy8 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy8.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy12 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy12.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder6 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder8 = jsonArrayBuilder6.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder11 = jsonArrayBuilder9.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray12 = jsonArrayBuilder9.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder13 = jsonArrayBuilder8.add((com.google.gson.JsonElement) jsonArray12);
        com.google.gson.JsonElement jsonElement14 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = dateTypeAdapter4.fromJsonTree(jsonElement14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected STRING but was BEGIN_ARRAY at path $");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(jsonArrayBuilder6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder11);
        org.junit.Assert.assertNotNull(jsonArray12);
        org.junit.Assert.assertNotNull(jsonArrayBuilder13);
        org.junit.Assert.assertNotNull(jsonElement14);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        int int0 = java.text.DateFormat.MEDIUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod2 = null;
        boolean boolean3 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod2);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor4 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite1);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder5 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject6 = jsonObjectBuilder5.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject9 = jsonObjectBuilder8.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder10 = jsonObjectBuilder5.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder8);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder13 = jsonObjectBuilder5.set("", (java.lang.Number) (short) -1);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder14 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject15 = jsonObjectBuilder14.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder17 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject18 = jsonObjectBuilder17.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder19 = jsonObjectBuilder14.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder17);
        com.google.gson.JsonObject jsonObject20 = jsonObjectBuilder17.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder21 = jsonObjectBuilder5.merge(jsonObject20);
        io.gsonfire.gson.FireExclusionStrategy fireExclusionStrategy22 = null;
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor23 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>(fireExclusionStrategy22);
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory24 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass25 = cachedReflectionFactory24.getClass();
        com.google.gson.JsonElement jsonElement26 = null;
        com.google.gson.Gson gson27 = null;
        annotatedElementMethodInvokerPostProcessor23.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass25, jsonElement26, gson27);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray29 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite30 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray29);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod31 = null;
        boolean boolean32 = fireExclusionStrategyComposite30.shouldSkipMethod(mappedMethod31);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor33 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite30);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder34 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder36 = jsonArrayBuilder34.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder37 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder39 = jsonArrayBuilder37.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray40 = jsonArrayBuilder37.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder41 = jsonArrayBuilder36.add((com.google.gson.JsonElement) jsonArray40);
        com.google.gson.JsonElement jsonElement42 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray40);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator43 = jsonArray40.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable44 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray40);
        com.google.gson.Gson gson45 = null;
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass48 = dateFormat47.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter49 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson45, (java.lang.reflect.Type) wildcardClass48);
        io.gsonfire.GsonFireBuilder gsonFireBuilder50 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson51 = gsonFireBuilder50.createGson();
        annotatedElementMethodInvokerPostProcessor33.postSerialize((com.google.gson.JsonElement) jsonArray40, (java.lang.reflect.AnnotatedElement) wildcardClass48, gson51);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray53 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite54 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray53);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod55 = null;
        boolean boolean56 = fireExclusionStrategyComposite54.shouldSkipMethod(mappedMethod55);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor57 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite54);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder58 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder60 = jsonArrayBuilder58.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder61 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder63 = jsonArrayBuilder61.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray64 = jsonArrayBuilder61.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder65 = jsonArrayBuilder60.add((com.google.gson.JsonElement) jsonArray64);
        com.google.gson.JsonElement jsonElement66 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray64);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator67 = jsonArray64.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable68 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray64);
        com.google.gson.Gson gson69 = null;
        java.text.DateFormat dateFormat71 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass72 = dateFormat71.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter73 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson69, (java.lang.reflect.Type) wildcardClass72);
        io.gsonfire.GsonFireBuilder gsonFireBuilder74 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson75 = gsonFireBuilder74.createGson();
        annotatedElementMethodInvokerPostProcessor57.postSerialize((com.google.gson.JsonElement) jsonArray64, (java.lang.reflect.AnnotatedElement) wildcardClass72, gson75);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter77 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson51, (java.lang.reflect.Type) wildcardClass72);
        annotatedElementMethodInvokerPostProcessor4.postSerialize((com.google.gson.JsonElement) jsonObject20, (java.lang.reflect.AnnotatedElement) wildcardClass25, gson51);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonObject6);
        org.junit.Assert.assertNotNull(jsonObject9);
        org.junit.Assert.assertNotNull(jsonObjectBuilder10);
        org.junit.Assert.assertNotNull(jsonObjectBuilder13);
        org.junit.Assert.assertNotNull(jsonObject15);
        org.junit.Assert.assertNotNull(jsonObject18);
        org.junit.Assert.assertNotNull(jsonObjectBuilder19);
        org.junit.Assert.assertNotNull(jsonObject20);
        org.junit.Assert.assertNotNull(jsonObjectBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder34);
        org.junit.Assert.assertNotNull(jsonArrayBuilder36);
        org.junit.Assert.assertNotNull(jsonArrayBuilder37);
        org.junit.Assert.assertNotNull(jsonArrayBuilder39);
        org.junit.Assert.assertNotNull(jsonArray40);
        org.junit.Assert.assertNotNull(jsonArrayBuilder41);
        org.junit.Assert.assertNotNull(jsonElement42);
        org.junit.Assert.assertNotNull(jsonElementSpliterator43);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable44);
        org.junit.Assert.assertNotNull(dateFormat47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(gson51);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder58);
        org.junit.Assert.assertNotNull(jsonArrayBuilder60);
        org.junit.Assert.assertNotNull(jsonArrayBuilder61);
        org.junit.Assert.assertNotNull(jsonArrayBuilder63);
        org.junit.Assert.assertNotNull(jsonArray64);
        org.junit.Assert.assertNotNull(jsonArrayBuilder65);
        org.junit.Assert.assertNotNull(jsonElement66);
        org.junit.Assert.assertNotNull(jsonElementSpliterator67);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable68);
        org.junit.Assert.assertNotNull(dateFormat71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(gson75);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject1 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder5 = jsonObjectBuilder0.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder3);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = jsonObjectBuilder0.set("", (java.lang.Number) (short) -1);
        com.google.gson.JsonObject jsonObject9 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder10 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder12 = jsonArrayBuilder10.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder13 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject14 = jsonObjectBuilder13.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder16 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject17 = jsonObjectBuilder16.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder18 = jsonObjectBuilder13.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder16);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder21 = jsonObjectBuilder13.set("", (java.lang.Number) (short) -1);
        com.google.gson.JsonObject jsonObject22 = jsonObjectBuilder13.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder23 = jsonArrayBuilder10.add((com.google.gson.JsonElement) jsonObject22);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder24 = jsonObjectBuilder0.merge(jsonObject22);
        io.gsonfire.gson.FireExclusionStrategy fireExclusionStrategy26 = null;
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor27 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>(fireExclusionStrategy26);
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory28 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass29 = cachedReflectionFactory28.getClass();
        com.google.gson.JsonElement jsonElement30 = null;
        com.google.gson.Gson gson31 = null;
        annotatedElementMethodInvokerPostProcessor27.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass29, jsonElement30, gson31);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder33 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder35 = jsonArrayBuilder33.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder36 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder38 = jsonArrayBuilder36.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray39 = jsonArrayBuilder36.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder40 = jsonArrayBuilder35.add((com.google.gson.JsonElement) jsonArray39);
        com.google.gson.Gson gson41 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory42 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass43 = cachedReflectionFactory42.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter44 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson41, (java.lang.reflect.Type) wildcardClass43);
        com.google.gson.Gson gson45 = null;
        annotatedElementMethodInvokerPostProcessor27.postSerialize((com.google.gson.JsonElement) jsonArray39, (java.lang.reflect.AnnotatedElement) wildcardClass43, gson45);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder47 = jsonObjectBuilder0.set("", (com.google.gson.JsonElement) jsonArray39);
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable48 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray39);
        org.junit.Assert.assertNotNull(jsonObject1);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObjectBuilder5);
        org.junit.Assert.assertNotNull(jsonObjectBuilder8);
        org.junit.Assert.assertNotNull(jsonObject9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder10);
        org.junit.Assert.assertNotNull(jsonArrayBuilder12);
        org.junit.Assert.assertNotNull(jsonObject14);
        org.junit.Assert.assertNotNull(jsonObject17);
        org.junit.Assert.assertNotNull(jsonObjectBuilder18);
        org.junit.Assert.assertNotNull(jsonObjectBuilder21);
        org.junit.Assert.assertNotNull(jsonObject22);
        org.junit.Assert.assertNotNull(jsonArrayBuilder23);
        org.junit.Assert.assertNotNull(jsonObjectBuilder24);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(jsonArrayBuilder33);
        org.junit.Assert.assertNotNull(jsonArrayBuilder35);
        org.junit.Assert.assertNotNull(jsonArrayBuilder36);
        org.junit.Assert.assertNotNull(jsonArrayBuilder38);
        org.junit.Assert.assertNotNull(jsonArray39);
        org.junit.Assert.assertNotNull(jsonArrayBuilder40);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(jsonObjectBuilder47);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable48);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        io.gsonfire.GsonFireBuilder gsonFireBuilder0 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson1 = gsonFireBuilder0.createGson();
        io.gsonfire.GsonFireBuilder gsonFireBuilder2 = gsonFireBuilder0.enableExclusionByValue();
        java.util.TimeZone timeZone3 = null;
        io.gsonfire.GsonFireBuilder gsonFireBuilder4 = gsonFireBuilder2.serializeTimeZone(timeZone3);
        io.gsonfire.GsonFireBuilder gsonFireBuilder5 = gsonFireBuilder4.enableExclusionByValue();
        io.gsonfire.GsonFireBuilder gsonFireBuilder6 = gsonFireBuilder4.enableExposeMethodResult();
        org.junit.Assert.assertNotNull(gson1);
        org.junit.Assert.assertNotNull(gsonFireBuilder2);
        org.junit.Assert.assertNotNull(gsonFireBuilder4);
        org.junit.Assert.assertNotNull(gsonFireBuilder5);
        org.junit.Assert.assertNotNull(gsonFireBuilder6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat2 = new io.gsonfire.util.RFC3339DateFormat(timeZone0, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = rFC3339DateFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.lang.Throwable throwable2 = null;
        io.gsonfire.gson.HookInvocationException hookInvocationException3 = new io.gsonfire.gson.HookInvocationException("", throwable2);
        io.gsonfire.gson.HookInvocationException hookInvocationException4 = new io.gsonfire.gson.HookInvocationException("hi!", throwable2);
        java.lang.String str5 = hookInvocationException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "io.gsonfire.gson.HookInvocationException: hi!" + "'", str5, "io.gsonfire.gson.HookInvocationException: hi!");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.lang.Class<java.io.Serializable> serializableClass0 = null;
        io.gsonfire.ClassConfig<java.io.Serializable> serializableClassConfig1 = new io.gsonfire.ClassConfig<java.io.Serializable>(serializableClass0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        io.gsonfire.gson.DateUnixtimeMillisTypeAdapter dateUnixtimeMillisTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeMillisTypeAdapter(true);
        com.google.gson.stream.JsonReader jsonReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = dateUnixtimeMillisTypeAdapter1.read(jsonReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = dateTypeAdapter6.fromJson("io.gsonfire.gson.HookInvocationException: ");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(12, 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateRFC3339TypeAdapter2.nullSafe();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder7.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder10 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder12 = jsonArrayBuilder10.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray13 = jsonArrayBuilder10.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder14 = jsonArrayBuilder9.add((com.google.gson.JsonElement) jsonArray13);
        com.google.gson.JsonArray jsonArray15 = jsonArrayBuilder9.build();
        com.google.gson.JsonElement jsonElement16 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = dateRFC3339TypeAdapter2.fromJsonTree((com.google.gson.JsonElement) jsonArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected STRING but was BEGIN_ARRAY at path $");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder10);
        org.junit.Assert.assertNotNull(jsonArrayBuilder12);
        org.junit.Assert.assertNotNull(jsonArray13);
        org.junit.Assert.assertNotNull(jsonArrayBuilder14);
        org.junit.Assert.assertNotNull(jsonArray15);
        org.junit.Assert.assertNotNull(jsonElement16);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        java.lang.reflect.Method method2 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass4 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy5 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory6 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass4, conflictResolutionStrategy5);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod7 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method2, "", conflictResolutionStrategy5);
        boolean boolean8 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod7);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray9 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite10 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray9);
        java.lang.reflect.Method method11 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass13 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy14 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory15 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass13, conflictResolutionStrategy14);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod16 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method11, "", conflictResolutionStrategy14);
        boolean boolean17 = fireExclusionStrategyComposite10.shouldSkipMethod(mappedMethod16);
        boolean boolean18 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod16);
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method21 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass23 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy24 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory25 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass23, conflictResolutionStrategy24);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod26 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method21, "", conflictResolutionStrategy24);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod27 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method19, "[SKIP, SKIP]", conflictResolutionStrategy24);
        boolean boolean28 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod27);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy5 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy5.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray9);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy14 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy14.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy24 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy24.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat3 = new io.gsonfire.util.RFC3339DateFormat(timeZone0, false, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = rFC3339DateFormat3.parseObject("Dec 31, 1969");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.text.ParseException: Unparseable date: \"Dec 31, 1969-0000\"");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.lang.Throwable throwable2 = null;
        io.gsonfire.gson.HookInvocationException hookInvocationException3 = new io.gsonfire.gson.HookInvocationException("", throwable2);
        io.gsonfire.gson.HookInvocationException hookInvocationException4 = new io.gsonfire.gson.HookInvocationException("", throwable2);
        java.lang.Throwable[] throwableArray5 = hookInvocationException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) ' ', 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy0 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy1 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] conflictResolutionStrategyArray2 = new io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] { conflictResolutionStrategy0, conflictResolutionStrategy1 };
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable3 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray2);
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable4 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray2);
        java.lang.String str5 = conflictResolutionStrategyEnumSimpleIterable4.toString();
        java.util.Collection<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumCollection6 = conflictResolutionStrategyEnumSimpleIterable4.toCollection();
        java.util.Iterator<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumItor7 = conflictResolutionStrategyEnumSimpleIterable4.iterator();
        java.util.Collection<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumCollection8 = conflictResolutionStrategyEnumSimpleIterable4.toCollection();
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy0 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy0.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy1 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy1.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNotNull(conflictResolutionStrategyArray2);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable3);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[SKIP, SKIP]" + "'", str5, "[SKIP, SKIP]");
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumCollection6);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumItor7);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumCollection8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(17, (int) '4', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat2 = new io.gsonfire.util.RFC3339DateFormat(true, false);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder3.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray6 = jsonArrayBuilder3.build();
        com.google.gson.JsonArray jsonArray7 = jsonArrayBuilder3.build();
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = rFC3339DateFormat2.format((java.lang.Object) jsonArray7, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArray6);
        org.junit.Assert.assertNotNull(jsonArray7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.Map<java.lang.Class<io.gsonfire.util.reflection.FieldInspector>, io.gsonfire.util.Mapper<io.gsonfire.util.reflection.FieldInspector, java.lang.String>> fieldInspectorClassMap1 = null;
        io.gsonfire.gson.WrapTypeAdapterFactory<io.gsonfire.util.reflection.FieldInspector> fieldInspectorWrapTypeAdapterFactory2 = new io.gsonfire.gson.WrapTypeAdapterFactory<io.gsonfire.util.reflection.FieldInspector>(fieldInspectorClassMap1);
        boolean boolean3 = dateFormat0.equals((java.lang.Object) fieldInspectorClassMap1);
        io.gsonfire.DateSerializationPolicy dateSerializationPolicy4 = io.gsonfire.DateSerializationPolicy.rfc3339;
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = dateFormat0.format((java.lang.Object) dateSerializationPolicy4, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateSerializationPolicy4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder3.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray6 = jsonArrayBuilder3.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder2.add((com.google.gson.JsonElement) jsonArray6);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder2.add((java.lang.Number) (byte) -1);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder11 = jsonArrayBuilder9.add("io.gsonfire.gson.HookInvocationException: [SKIP, SKIP]");
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArray6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder11);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        io.gsonfire.gson.DateUnixtimeMillisTypeAdapter dateUnixtimeMillisTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeMillisTypeAdapter(true);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateUnixtimeMillisTypeAdapter1.nullSafe();
        com.google.gson.stream.JsonReader jsonReader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = dateUnixtimeMillisTypeAdapter1.read(jsonReader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat0 = new io.gsonfire.util.RFC3339DateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = rFC3339DateFormat0.parse("null", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.util.TimeZone timeZone1 = null;
        dateFormat0.setTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = null;
        dateFormat0.setTimeZone(timeZone3);
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.util.TimeZone timeZone1 = null;
        dateFormat0.setTimeZone(timeZone1);
        boolean boolean4 = dateFormat0.equals((java.lang.Object) 0);
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateFormat0.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        java.lang.Class<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClass0 = null;
        io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClassConfig1 = new io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException>(hookInvocationExceptionClass0);
        hookInvocationExceptionClassConfig1.setHooksEnabled(true);
        java.util.Collection<io.gsonfire.PostProcessor<io.gsonfire.gson.HookInvocationException>> hookInvocationExceptionPostProcessorCollection4 = hookInvocationExceptionClassConfig1.getPostProcessors();
        java.lang.Class<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClass5 = hookInvocationExceptionClassConfig1.getConfiguredClass();
        java.util.Collection<io.gsonfire.PostProcessor<io.gsonfire.gson.HookInvocationException>> hookInvocationExceptionPostProcessorCollection6 = hookInvocationExceptionClassConfig1.getPostProcessors();
        hookInvocationExceptionClassConfig1.setHooksEnabled(false);
        org.junit.Assert.assertNotNull(hookInvocationExceptionPostProcessorCollection4);
        org.junit.Assert.assertNull(hookInvocationExceptionClass5);
        org.junit.Assert.assertNotNull(hookInvocationExceptionPostProcessorCollection6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor0 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>();
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray1 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite2 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray1);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod3 = null;
        boolean boolean4 = fireExclusionStrategyComposite2.shouldSkipMethod(mappedMethod3);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor5 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite2);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder6 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder8 = jsonArrayBuilder6.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder11 = jsonArrayBuilder9.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray12 = jsonArrayBuilder9.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder13 = jsonArrayBuilder8.add((com.google.gson.JsonElement) jsonArray12);
        com.google.gson.JsonElement jsonElement14 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray12);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator15 = jsonArray12.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable16 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray12);
        com.google.gson.Gson gson17 = null;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass20 = dateFormat19.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter21 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson17, (java.lang.reflect.Type) wildcardClass20);
        io.gsonfire.GsonFireBuilder gsonFireBuilder22 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson23 = gsonFireBuilder22.createGson();
        annotatedElementMethodInvokerPostProcessor5.postSerialize((com.google.gson.JsonElement) jsonArray12, (java.lang.reflect.AnnotatedElement) wildcardClass20, gson23);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray25 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite26 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray25);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod27 = null;
        boolean boolean28 = fireExclusionStrategyComposite26.shouldSkipMethod(mappedMethod27);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor29 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite26);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder30 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder32 = jsonArrayBuilder30.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder33 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder35 = jsonArrayBuilder33.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray36 = jsonArrayBuilder33.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder37 = jsonArrayBuilder32.add((com.google.gson.JsonElement) jsonArray36);
        com.google.gson.JsonElement jsonElement38 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray36);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator39 = jsonArray36.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable40 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray36);
        com.google.gson.Gson gson41 = null;
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass44 = dateFormat43.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter45 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson41, (java.lang.reflect.Type) wildcardClass44);
        io.gsonfire.GsonFireBuilder gsonFireBuilder46 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson47 = gsonFireBuilder46.createGson();
        annotatedElementMethodInvokerPostProcessor29.postSerialize((com.google.gson.JsonElement) jsonArray36, (java.lang.reflect.AnnotatedElement) wildcardClass44, gson47);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray49 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite50 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray49);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod51 = null;
        boolean boolean52 = fireExclusionStrategyComposite50.shouldSkipMethod(mappedMethod51);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor53 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite50);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder54 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder56 = jsonArrayBuilder54.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder57 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder59 = jsonArrayBuilder57.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray60 = jsonArrayBuilder57.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder61 = jsonArrayBuilder56.add((com.google.gson.JsonElement) jsonArray60);
        com.google.gson.JsonElement jsonElement62 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray60);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator63 = jsonArray60.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable64 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray60);
        com.google.gson.Gson gson65 = null;
        java.text.DateFormat dateFormat67 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass68 = dateFormat67.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter69 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson65, (java.lang.reflect.Type) wildcardClass68);
        io.gsonfire.GsonFireBuilder gsonFireBuilder70 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson71 = gsonFireBuilder70.createGson();
        annotatedElementMethodInvokerPostProcessor53.postSerialize((com.google.gson.JsonElement) jsonArray60, (java.lang.reflect.AnnotatedElement) wildcardClass68, gson71);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter73 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson47, (java.lang.reflect.Type) wildcardClass68);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray74 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite75 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray74);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod76 = null;
        boolean boolean77 = fireExclusionStrategyComposite75.shouldSkipMethod(mappedMethod76);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor78 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite75);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder79 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder81 = jsonArrayBuilder79.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder82 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder84 = jsonArrayBuilder82.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray85 = jsonArrayBuilder82.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder86 = jsonArrayBuilder81.add((com.google.gson.JsonElement) jsonArray85);
        com.google.gson.JsonElement jsonElement87 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray85);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator88 = jsonArray85.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable89 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray85);
        com.google.gson.Gson gson90 = null;
        java.text.DateFormat dateFormat92 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass93 = dateFormat92.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter94 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson90, (java.lang.reflect.Type) wildcardClass93);
        io.gsonfire.GsonFireBuilder gsonFireBuilder95 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson96 = gsonFireBuilder95.createGson();
        annotatedElementMethodInvokerPostProcessor78.postSerialize((com.google.gson.JsonElement) jsonArray85, (java.lang.reflect.AnnotatedElement) wildcardClass93, gson96);
        annotatedElementMethodInvokerPostProcessor0.postSerialize((com.google.gson.JsonElement) jsonArray12, (java.lang.reflect.AnnotatedElement) wildcardClass68, gson96);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder11);
        org.junit.Assert.assertNotNull(jsonArray12);
        org.junit.Assert.assertNotNull(jsonArrayBuilder13);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonElementSpliterator15);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(gson23);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder30);
        org.junit.Assert.assertNotNull(jsonArrayBuilder32);
        org.junit.Assert.assertNotNull(jsonArrayBuilder33);
        org.junit.Assert.assertNotNull(jsonArrayBuilder35);
        org.junit.Assert.assertNotNull(jsonArray36);
        org.junit.Assert.assertNotNull(jsonArrayBuilder37);
        org.junit.Assert.assertNotNull(jsonElement38);
        org.junit.Assert.assertNotNull(jsonElementSpliterator39);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable40);
        org.junit.Assert.assertNotNull(dateFormat43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(gson47);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder54);
        org.junit.Assert.assertNotNull(jsonArrayBuilder56);
        org.junit.Assert.assertNotNull(jsonArrayBuilder57);
        org.junit.Assert.assertNotNull(jsonArrayBuilder59);
        org.junit.Assert.assertNotNull(jsonArray60);
        org.junit.Assert.assertNotNull(jsonArrayBuilder61);
        org.junit.Assert.assertNotNull(jsonElement62);
        org.junit.Assert.assertNotNull(jsonElementSpliterator63);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable64);
        org.junit.Assert.assertNotNull(dateFormat67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(gson71);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder79);
        org.junit.Assert.assertNotNull(jsonArrayBuilder81);
        org.junit.Assert.assertNotNull(jsonArrayBuilder82);
        org.junit.Assert.assertNotNull(jsonArrayBuilder84);
        org.junit.Assert.assertNotNull(jsonArray85);
        org.junit.Assert.assertNotNull(jsonArrayBuilder86);
        org.junit.Assert.assertNotNull(jsonElement87);
        org.junit.Assert.assertNotNull(jsonElementSpliterator88);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable89);
        org.junit.Assert.assertNotNull(dateFormat92);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(gson96);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 1);
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray3 = jsonArrayBuilder0.build();
        com.google.gson.JsonElement jsonElement4 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArray3);
        org.junit.Assert.assertNotNull(jsonElement4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder6 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject7 = jsonObjectBuilder6.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = jsonObjectBuilder3.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder6);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder11 = jsonObjectBuilder3.set("", (java.lang.Number) (short) -1);
        com.google.gson.JsonObject jsonObject12 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder13 = jsonArrayBuilder0.add((com.google.gson.JsonElement) jsonObject12);
        com.google.gson.JsonArray jsonArray14 = jsonArrayBuilder13.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder16 = jsonArrayBuilder13.add("io.gsonfire.gson.HookInvocationException: ");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder18 = jsonArrayBuilder16.add((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObject7);
        org.junit.Assert.assertNotNull(jsonObjectBuilder8);
        org.junit.Assert.assertNotNull(jsonObjectBuilder11);
        org.junit.Assert.assertNotNull(jsonObject12);
        org.junit.Assert.assertNotNull(jsonArrayBuilder13);
        org.junit.Assert.assertNotNull(jsonArray14);
        org.junit.Assert.assertNotNull(jsonArrayBuilder16);
        org.junit.Assert.assertNotNull(jsonArrayBuilder18);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.Map<java.lang.Class<io.gsonfire.util.reflection.FieldInspector>, io.gsonfire.util.Mapper<io.gsonfire.util.reflection.FieldInspector, java.lang.String>> fieldInspectorClassMap1 = null;
        io.gsonfire.gson.WrapTypeAdapterFactory<io.gsonfire.util.reflection.FieldInspector> fieldInspectorWrapTypeAdapterFactory2 = new io.gsonfire.gson.WrapTypeAdapterFactory<io.gsonfire.util.reflection.FieldInspector>(fieldInspectorClassMap1);
        boolean boolean3 = dateFormat0.equals((java.lang.Object) fieldInspectorClassMap1);
        java.util.TimeZone timeZone4 = null;
        dateFormat0.setTimeZone(timeZone4);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.util.Map<java.lang.Class<java.util.Collection<com.google.gson.reflect.TypeToken>>, io.gsonfire.util.Mapper<java.util.Collection<com.google.gson.reflect.TypeToken>, java.lang.String>> typeTokenCollectionClassMap0 = null;
        io.gsonfire.gson.WrapTypeAdapterFactory<java.util.Collection<com.google.gson.reflect.TypeToken>> typeTokenCollectionWrapTypeAdapterFactory1 = new io.gsonfire.gson.WrapTypeAdapterFactory<java.util.Collection<com.google.gson.reflect.TypeToken>>(typeTokenCollectionClassMap0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.lang.Class<com.google.gson.GsonBuilder> gsonBuilderClass0 = null;
        io.gsonfire.ClassConfig<com.google.gson.GsonBuilder> gsonBuilderClassConfig1 = new io.gsonfire.ClassConfig<com.google.gson.GsonBuilder>(gsonBuilderClass0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.lang.Class<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClass0 = null;
        io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClassConfig1 = new io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException>(hookInvocationExceptionClass0);
        hookInvocationExceptionClassConfig1.setHooksEnabled(true);
        io.gsonfire.TypeSelector<? super io.gsonfire.gson.HookInvocationException> wildcardTypeSelector4 = hookInvocationExceptionClassConfig1.getTypeSelector();
        org.junit.Assert.assertNull(wildcardTypeSelector4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        io.gsonfire.gson.SimpleIterableTypeAdapterFactory simpleIterableTypeAdapterFactory0 = new io.gsonfire.gson.SimpleIterableTypeAdapterFactory();
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray1 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite2 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray1);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod3 = null;
        boolean boolean4 = fireExclusionStrategyComposite2.shouldSkipMethod(mappedMethod3);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor5 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite2);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder6 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder8 = jsonArrayBuilder6.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder11 = jsonArrayBuilder9.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray12 = jsonArrayBuilder9.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder13 = jsonArrayBuilder8.add((com.google.gson.JsonElement) jsonArray12);
        com.google.gson.JsonElement jsonElement14 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray12);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator15 = jsonArray12.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable16 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray12);
        com.google.gson.Gson gson17 = null;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass20 = dateFormat19.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter21 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson17, (java.lang.reflect.Type) wildcardClass20);
        io.gsonfire.GsonFireBuilder gsonFireBuilder22 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson23 = gsonFireBuilder22.createGson();
        annotatedElementMethodInvokerPostProcessor5.postSerialize((com.google.gson.JsonElement) jsonArray12, (java.lang.reflect.AnnotatedElement) wildcardClass20, gson23);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray25 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite26 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray25);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod27 = null;
        boolean boolean28 = fireExclusionStrategyComposite26.shouldSkipMethod(mappedMethod27);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor29 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite26);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder30 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder32 = jsonArrayBuilder30.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder33 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder35 = jsonArrayBuilder33.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray36 = jsonArrayBuilder33.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder37 = jsonArrayBuilder32.add((com.google.gson.JsonElement) jsonArray36);
        com.google.gson.JsonElement jsonElement38 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray36);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator39 = jsonArray36.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable40 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray36);
        com.google.gson.Gson gson41 = null;
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass44 = dateFormat43.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter45 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson41, (java.lang.reflect.Type) wildcardClass44);
        io.gsonfire.GsonFireBuilder gsonFireBuilder46 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson47 = gsonFireBuilder46.createGson();
        annotatedElementMethodInvokerPostProcessor29.postSerialize((com.google.gson.JsonElement) jsonArray36, (java.lang.reflect.AnnotatedElement) wildcardClass44, gson47);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter49 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson23, (java.lang.reflect.Type) wildcardClass44);
        com.google.gson.Gson gson50 = null;
        com.google.gson.Gson gson51 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory52 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass53 = cachedReflectionFactory52.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter54 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson51, (java.lang.reflect.Type) wildcardClass53);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter55 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson50, (java.lang.reflect.Type) wildcardClass53);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter56 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson23, (java.lang.reflect.Type) wildcardClass53);
        com.google.gson.reflect.TypeToken typeToken57 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.TypeAdapter typeAdapter58 = simpleIterableTypeAdapterFactory0.create(gson23, typeToken57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder11);
        org.junit.Assert.assertNotNull(jsonArray12);
        org.junit.Assert.assertNotNull(jsonArrayBuilder13);
        org.junit.Assert.assertNotNull(jsonElement14);
        org.junit.Assert.assertNotNull(jsonElementSpliterator15);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(gson23);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder30);
        org.junit.Assert.assertNotNull(jsonArrayBuilder32);
        org.junit.Assert.assertNotNull(jsonArrayBuilder33);
        org.junit.Assert.assertNotNull(jsonArrayBuilder35);
        org.junit.Assert.assertNotNull(jsonArray36);
        org.junit.Assert.assertNotNull(jsonArrayBuilder37);
        org.junit.Assert.assertNotNull(jsonElement38);
        org.junit.Assert.assertNotNull(jsonElementSpliterator39);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable40);
        org.junit.Assert.assertNotNull(dateFormat43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(gson47);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder6 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject7 = jsonObjectBuilder6.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = jsonObjectBuilder3.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder6);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder11 = jsonObjectBuilder3.set("", (java.lang.Number) (short) -1);
        com.google.gson.JsonObject jsonObject12 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder13 = jsonArrayBuilder0.add((com.google.gson.JsonElement) jsonObject12);
        com.google.gson.JsonArray jsonArray14 = jsonArrayBuilder13.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder16 = jsonArrayBuilder13.add("io.gsonfire.gson.HookInvocationException: ");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder17 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject18 = jsonObjectBuilder17.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder20 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject21 = jsonObjectBuilder20.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder22 = jsonObjectBuilder17.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder20);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder24 = jsonObjectBuilder22.setNull("io.gsonfire.gson.HookInvocationException: ");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder25 = jsonArrayBuilder13.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder24);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder27 = jsonArrayBuilder25.add((java.lang.Boolean) true);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder29 = jsonArrayBuilder25.add((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObject7);
        org.junit.Assert.assertNotNull(jsonObjectBuilder8);
        org.junit.Assert.assertNotNull(jsonObjectBuilder11);
        org.junit.Assert.assertNotNull(jsonObject12);
        org.junit.Assert.assertNotNull(jsonArrayBuilder13);
        org.junit.Assert.assertNotNull(jsonArray14);
        org.junit.Assert.assertNotNull(jsonArrayBuilder16);
        org.junit.Assert.assertNotNull(jsonObject18);
        org.junit.Assert.assertNotNull(jsonObject21);
        org.junit.Assert.assertNotNull(jsonObjectBuilder22);
        org.junit.Assert.assertNotNull(jsonObjectBuilder24);
        org.junit.Assert.assertNotNull(jsonArrayBuilder25);
        org.junit.Assert.assertNotNull(jsonArrayBuilder27);
        org.junit.Assert.assertNotNull(jsonArrayBuilder29);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        io.gsonfire.gson.FireExclusionStrategy fireExclusionStrategy0 = null;
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor1 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>(fireExclusionStrategy0);
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory2 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass3 = cachedReflectionFactory2.getClass();
        com.google.gson.JsonElement jsonElement4 = null;
        com.google.gson.Gson gson5 = null;
        annotatedElementMethodInvokerPostProcessor1.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass3, jsonElement4, gson5);
        io.gsonfire.gson.FireExclusionStrategy fireExclusionStrategy7 = null;
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor8 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>(fireExclusionStrategy7);
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory9 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass10 = cachedReflectionFactory9.getClass();
        com.google.gson.JsonElement jsonElement11 = null;
        com.google.gson.Gson gson12 = null;
        annotatedElementMethodInvokerPostProcessor8.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass10, jsonElement11, gson12);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder14 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder16 = jsonArrayBuilder14.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder17 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder19 = jsonArrayBuilder17.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray20 = jsonArrayBuilder17.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder21 = jsonArrayBuilder16.add((com.google.gson.JsonElement) jsonArray20);
        com.google.gson.Gson gson22 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory23 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass24 = cachedReflectionFactory23.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter25 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson22, (java.lang.reflect.Type) wildcardClass24);
        com.google.gson.Gson gson26 = null;
        annotatedElementMethodInvokerPostProcessor8.postSerialize((com.google.gson.JsonElement) jsonArray20, (java.lang.reflect.AnnotatedElement) wildcardClass24, gson26);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder28 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder30 = jsonArrayBuilder28.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder31 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder33 = jsonArrayBuilder31.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray34 = jsonArrayBuilder31.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder35 = jsonArrayBuilder30.add((com.google.gson.JsonElement) jsonArray34);
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable36 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray34);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator37 = jsonArray34.spliterator();
        io.gsonfire.GsonFireBuilder gsonFireBuilder38 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson39 = gsonFireBuilder38.createGson();
        annotatedElementMethodInvokerPostProcessor1.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass24, (com.google.gson.JsonElement) jsonArray34, gson39);
        com.google.gson.JsonElement jsonElement41 = null;
        com.google.gson.Gson gson42 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory43 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass44 = cachedReflectionFactory43.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter45 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson42, (java.lang.reflect.Type) wildcardClass44);
        io.gsonfire.gson.FireExclusionStrategy fireExclusionStrategy46 = null;
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor47 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>(fireExclusionStrategy46);
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory48 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass49 = cachedReflectionFactory48.getClass();
        com.google.gson.JsonElement jsonElement50 = null;
        com.google.gson.Gson gson51 = null;
        annotatedElementMethodInvokerPostProcessor47.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass49, jsonElement50, gson51);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder53 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder55 = jsonArrayBuilder53.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder56 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder58 = jsonArrayBuilder56.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray59 = jsonArrayBuilder56.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder60 = jsonArrayBuilder55.add((com.google.gson.JsonElement) jsonArray59);
        com.google.gson.Gson gson61 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory62 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass63 = cachedReflectionFactory62.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter64 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson61, (java.lang.reflect.Type) wildcardClass63);
        com.google.gson.Gson gson65 = null;
        annotatedElementMethodInvokerPostProcessor47.postSerialize((com.google.gson.JsonElement) jsonArray59, (java.lang.reflect.AnnotatedElement) wildcardClass63, gson65);
        com.google.gson.Gson gson67 = null;
        com.google.gson.Gson gson68 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory69 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass70 = cachedReflectionFactory69.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter71 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson68, (java.lang.reflect.Type) wildcardClass70);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter72 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson67, (java.lang.reflect.Type) wildcardClass70);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder73 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder75 = jsonArrayBuilder73.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray76 = jsonArrayBuilder73.build();
        com.google.gson.Gson gson77 = null;
        annotatedElementMethodInvokerPostProcessor47.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass70, (com.google.gson.JsonElement) jsonArray76, gson77);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder79 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder81 = jsonArrayBuilder79.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray82 = jsonArrayBuilder79.build();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable83 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray82);
        java.text.DateFormat dateFormat85 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass86 = dateFormat85.getClass();
        io.gsonfire.GsonFireBuilder gsonFireBuilder87 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson88 = gsonFireBuilder87.createGson();
        annotatedElementMethodInvokerPostProcessor47.postSerialize((com.google.gson.JsonElement) jsonArray82, (java.lang.reflect.AnnotatedElement) wildcardClass86, gson88);
        // The following exception was thrown during execution in test generation
        try {
            annotatedElementMethodInvokerPostProcessor1.postSerialize(jsonElement41, (java.lang.reflect.AnnotatedElement) wildcardClass44, gson88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonArrayBuilder14);
        org.junit.Assert.assertNotNull(jsonArrayBuilder16);
        org.junit.Assert.assertNotNull(jsonArrayBuilder17);
        org.junit.Assert.assertNotNull(jsonArrayBuilder19);
        org.junit.Assert.assertNotNull(jsonArray20);
        org.junit.Assert.assertNotNull(jsonArrayBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(jsonArrayBuilder28);
        org.junit.Assert.assertNotNull(jsonArrayBuilder30);
        org.junit.Assert.assertNotNull(jsonArrayBuilder31);
        org.junit.Assert.assertNotNull(jsonArrayBuilder33);
        org.junit.Assert.assertNotNull(jsonArray34);
        org.junit.Assert.assertNotNull(jsonArrayBuilder35);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable36);
        org.junit.Assert.assertNotNull(jsonElementSpliterator37);
        org.junit.Assert.assertNotNull(gson39);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(jsonArrayBuilder53);
        org.junit.Assert.assertNotNull(jsonArrayBuilder55);
        org.junit.Assert.assertNotNull(jsonArrayBuilder56);
        org.junit.Assert.assertNotNull(jsonArrayBuilder58);
        org.junit.Assert.assertNotNull(jsonArray59);
        org.junit.Assert.assertNotNull(jsonArrayBuilder60);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(jsonArrayBuilder73);
        org.junit.Assert.assertNotNull(jsonArrayBuilder75);
        org.junit.Assert.assertNotNull(jsonArray76);
        org.junit.Assert.assertNotNull(jsonArrayBuilder79);
        org.junit.Assert.assertNotNull(jsonArrayBuilder81);
        org.junit.Assert.assertNotNull(jsonArray82);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable83);
        org.junit.Assert.assertNotNull(dateFormat85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(gson88);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        com.google.gson.JsonArray jsonArray1 = jsonArrayBuilder0.build();
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator2 = jsonArray1.spliterator();
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArray1);
        org.junit.Assert.assertNotNull(jsonElementSpliterator2);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.lang.Object obj1 = dateFormat0.clone();
        boolean boolean2 = dateFormat0.isLenient();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat0.parseObject("io.gsonfire.gson.HookInvocationException: [SKIP, SKIP]", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        io.gsonfire.GsonFireBuilder gsonFireBuilder0 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson1 = gsonFireBuilder0.createGson();
        io.gsonfire.GsonFireBuilder gsonFireBuilder2 = gsonFireBuilder0.enableExclusionByValue();
        java.util.TimeZone timeZone3 = null;
        io.gsonfire.GsonFireBuilder gsonFireBuilder4 = gsonFireBuilder0.serializeTimeZone(timeZone3);
        com.google.gson.Gson gson5 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory6 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass7 = cachedReflectionFactory6.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter8 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson5, (java.lang.reflect.Type) wildcardClass7);
        io.gsonfire.GsonFireBuilder gsonFireBuilder9 = gsonFireBuilder4.enableHooks((java.lang.Class) wildcardClass7);
        io.gsonfire.GsonFireBuilder gsonFireBuilder10 = gsonFireBuilder4.enableExclusionByValue();
        org.junit.Assert.assertNotNull(gson1);
        org.junit.Assert.assertNotNull(gsonFireBuilder2);
        org.junit.Assert.assertNotNull(gsonFireBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(gsonFireBuilder9);
        org.junit.Assert.assertNotNull(gsonFireBuilder10);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        io.gsonfire.GsonFireBuilder gsonFireBuilder0 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson1 = gsonFireBuilder0.createGson();
        io.gsonfire.GsonFireBuilder gsonFireBuilder2 = gsonFireBuilder0.enableExclusionByValue();
        java.util.TimeZone timeZone3 = null;
        io.gsonfire.GsonFireBuilder gsonFireBuilder4 = gsonFireBuilder0.serializeTimeZone(timeZone3);
        com.google.gson.Gson gson5 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory6 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass7 = cachedReflectionFactory6.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter8 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson5, (java.lang.reflect.Type) wildcardClass7);
        io.gsonfire.GsonFireBuilder gsonFireBuilder9 = gsonFireBuilder4.enableHooks((java.lang.Class) wildcardClass7);
        io.gsonfire.GsonFireBuilder gsonFireBuilder10 = gsonFireBuilder9.enableExposeMethodResult();
        org.junit.Assert.assertNotNull(gson1);
        org.junit.Assert.assertNotNull(gsonFireBuilder2);
        org.junit.Assert.assertNotNull(gsonFireBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(gsonFireBuilder9);
        org.junit.Assert.assertNotNull(gsonFireBuilder10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod2 = null;
        boolean boolean3 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod2);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor4 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite1);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder5.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder8 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder10 = jsonArrayBuilder8.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray11 = jsonArrayBuilder8.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder12 = jsonArrayBuilder7.add((com.google.gson.JsonElement) jsonArray11);
        com.google.gson.JsonElement jsonElement13 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray11);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator14 = jsonArray11.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable15 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray11);
        com.google.gson.Gson gson16 = null;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = dateFormat18.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter20 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson16, (java.lang.reflect.Type) wildcardClass19);
        io.gsonfire.GsonFireBuilder gsonFireBuilder21 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson22 = gsonFireBuilder21.createGson();
        annotatedElementMethodInvokerPostProcessor4.postSerialize((com.google.gson.JsonElement) jsonArray11, (java.lang.reflect.AnnotatedElement) wildcardClass19, gson22);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator24 = jsonArray11.spliterator();
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator25 = jsonArray11.spliterator();
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArrayBuilder8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder10);
        org.junit.Assert.assertNotNull(jsonArray11);
        org.junit.Assert.assertNotNull(jsonArrayBuilder12);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonElementSpliterator14);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable15);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(gson22);
        org.junit.Assert.assertNotNull(jsonElementSpliterator24);
        org.junit.Assert.assertNotNull(jsonElementSpliterator25);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject1 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder5 = jsonObjectBuilder0.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder3);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = jsonObjectBuilder5.set("null", (java.lang.Number) 9);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder11 = jsonObjectBuilder8.set("[SKIP, SKIP]", (java.lang.Boolean) true);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder13 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder15 = jsonArrayBuilder13.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder16 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder18 = jsonArrayBuilder16.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray19 = jsonArrayBuilder16.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder20 = jsonArrayBuilder15.add((com.google.gson.JsonElement) jsonArray19);
        com.google.gson.JsonElement jsonElement21 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray19);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator22 = jsonArray19.spliterator();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder23 = jsonObjectBuilder11.set("io.gsonfire.gson.HookInvocationException: [SKIP, SKIP]", (com.google.gson.JsonElement) jsonArray19);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder26 = jsonObjectBuilder11.set("Dec 31, 1969", (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(jsonObject1);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObjectBuilder5);
        org.junit.Assert.assertNotNull(jsonObjectBuilder8);
        org.junit.Assert.assertNotNull(jsonObjectBuilder11);
        org.junit.Assert.assertNotNull(jsonArrayBuilder13);
        org.junit.Assert.assertNotNull(jsonArrayBuilder15);
        org.junit.Assert.assertNotNull(jsonArrayBuilder16);
        org.junit.Assert.assertNotNull(jsonArrayBuilder18);
        org.junit.Assert.assertNotNull(jsonArray19);
        org.junit.Assert.assertNotNull(jsonArrayBuilder20);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNotNull(jsonElementSpliterator22);
        org.junit.Assert.assertNotNull(jsonObjectBuilder23);
        org.junit.Assert.assertNotNull(jsonObjectBuilder26);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.lang.Class<io.gsonfire.gson.SimpleIterableTypeAdapterFactory> simpleIterableTypeAdapterFactoryClass0 = null;
        io.gsonfire.ClassConfig<io.gsonfire.gson.SimpleIterableTypeAdapterFactory> simpleIterableTypeAdapterFactoryClassConfig1 = new io.gsonfire.ClassConfig<io.gsonfire.gson.SimpleIterableTypeAdapterFactory>(simpleIterableTypeAdapterFactoryClass0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateRFC3339TypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = dateTypeAdapter5.fromJson("io.gsonfire.gson.HookInvocationException: [SKIP, SKIP]");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder1 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = jsonArrayBuilder1.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray4 = jsonArrayBuilder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator5 = dateFormat0.formatToCharacterIterator((java.lang.Object) jsonArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder1);
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArray4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.lang.Throwable throwable2 = null;
        io.gsonfire.gson.HookInvocationException hookInvocationException3 = new io.gsonfire.gson.HookInvocationException("", throwable2);
        io.gsonfire.gson.HookInvocationException hookInvocationException4 = new io.gsonfire.gson.HookInvocationException("null", throwable2);
        java.lang.Throwable[] throwableArray5 = hookInvocationException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = hookInvocationException4.getSuppressed();
        java.lang.Throwable[] throwableArray7 = hookInvocationException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = dateFormat1.parse("io.gsonfire.gson.HookInvocationException: [SKIP, SKIP]");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"io.gsonfire.gson.HookInvocationException: [SKIP, SKIP]\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.util.TimeZone timeZone1 = null;
        dateFormat0.setTimeZone(timeZone1);
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat3);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.util.Map<java.lang.Class<io.gsonfire.gson.FireExclusionStrategyComposite>, io.gsonfire.util.Mapper<io.gsonfire.gson.FireExclusionStrategyComposite, java.lang.String>> fireExclusionStrategyCompositeClassMap0 = null;
        io.gsonfire.gson.WrapTypeAdapterFactory<io.gsonfire.gson.FireExclusionStrategyComposite> fireExclusionStrategyCompositeWrapTypeAdapterFactory1 = new io.gsonfire.gson.WrapTypeAdapterFactory<io.gsonfire.gson.FireExclusionStrategyComposite>(fireExclusionStrategyCompositeClassMap0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateTypeAdapter4.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = dateTypeAdapter5.toJson(date6);
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor0 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>();
        io.gsonfire.gson.FireExclusionStrategy fireExclusionStrategy1 = null;
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor2 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>(fireExclusionStrategy1);
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory3 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass4 = cachedReflectionFactory3.getClass();
        com.google.gson.JsonElement jsonElement5 = null;
        com.google.gson.Gson gson6 = null;
        annotatedElementMethodInvokerPostProcessor2.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass4, jsonElement5, gson6);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder8 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder10 = jsonArrayBuilder8.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder11 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder13 = jsonArrayBuilder11.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray14 = jsonArrayBuilder11.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder15 = jsonArrayBuilder10.add((com.google.gson.JsonElement) jsonArray14);
        com.google.gson.Gson gson16 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory17 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass18 = cachedReflectionFactory17.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter19 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson16, (java.lang.reflect.Type) wildcardClass18);
        com.google.gson.Gson gson20 = null;
        annotatedElementMethodInvokerPostProcessor2.postSerialize((com.google.gson.JsonElement) jsonArray14, (java.lang.reflect.AnnotatedElement) wildcardClass18, gson20);
        com.google.gson.Gson gson22 = null;
        com.google.gson.Gson gson23 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory24 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass25 = cachedReflectionFactory24.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter26 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson23, (java.lang.reflect.Type) wildcardClass25);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter27 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson22, (java.lang.reflect.Type) wildcardClass25);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder28 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder30 = jsonArrayBuilder28.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray31 = jsonArrayBuilder28.build();
        com.google.gson.Gson gson32 = null;
        annotatedElementMethodInvokerPostProcessor2.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass25, (com.google.gson.JsonElement) jsonArray31, gson32);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder34 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject35 = jsonObjectBuilder34.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder37 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject38 = jsonObjectBuilder37.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder39 = jsonObjectBuilder34.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder37);
        com.google.gson.JsonObject jsonObject40 = jsonObjectBuilder37.build();
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray41 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite42 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray41);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod43 = null;
        boolean boolean44 = fireExclusionStrategyComposite42.shouldSkipMethod(mappedMethod43);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor45 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite42);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder46 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder48 = jsonArrayBuilder46.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder49 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder51 = jsonArrayBuilder49.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray52 = jsonArrayBuilder49.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder53 = jsonArrayBuilder48.add((com.google.gson.JsonElement) jsonArray52);
        com.google.gson.JsonElement jsonElement54 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray52);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator55 = jsonArray52.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable56 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray52);
        com.google.gson.Gson gson57 = null;
        java.text.DateFormat dateFormat59 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass60 = dateFormat59.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter61 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson57, (java.lang.reflect.Type) wildcardClass60);
        io.gsonfire.GsonFireBuilder gsonFireBuilder62 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson63 = gsonFireBuilder62.createGson();
        annotatedElementMethodInvokerPostProcessor45.postSerialize((com.google.gson.JsonElement) jsonArray52, (java.lang.reflect.AnnotatedElement) wildcardClass60, gson63);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray65 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite66 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray65);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod67 = null;
        boolean boolean68 = fireExclusionStrategyComposite66.shouldSkipMethod(mappedMethod67);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor69 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite66);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder70 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder72 = jsonArrayBuilder70.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder73 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder75 = jsonArrayBuilder73.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray76 = jsonArrayBuilder73.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder77 = jsonArrayBuilder72.add((com.google.gson.JsonElement) jsonArray76);
        com.google.gson.JsonElement jsonElement78 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray76);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator79 = jsonArray76.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable80 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray76);
        com.google.gson.Gson gson81 = null;
        java.text.DateFormat dateFormat83 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass84 = dateFormat83.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter85 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson81, (java.lang.reflect.Type) wildcardClass84);
        io.gsonfire.GsonFireBuilder gsonFireBuilder86 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson87 = gsonFireBuilder86.createGson();
        annotatedElementMethodInvokerPostProcessor69.postSerialize((com.google.gson.JsonElement) jsonArray76, (java.lang.reflect.AnnotatedElement) wildcardClass84, gson87);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter89 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson63, (java.lang.reflect.Type) wildcardClass84);
        annotatedElementMethodInvokerPostProcessor0.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass25, (com.google.gson.JsonElement) jsonObject40, gson63);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(jsonArrayBuilder8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder10);
        org.junit.Assert.assertNotNull(jsonArrayBuilder11);
        org.junit.Assert.assertNotNull(jsonArrayBuilder13);
        org.junit.Assert.assertNotNull(jsonArray14);
        org.junit.Assert.assertNotNull(jsonArrayBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(jsonArrayBuilder28);
        org.junit.Assert.assertNotNull(jsonArrayBuilder30);
        org.junit.Assert.assertNotNull(jsonArray31);
        org.junit.Assert.assertNotNull(jsonObject35);
        org.junit.Assert.assertNotNull(jsonObject38);
        org.junit.Assert.assertNotNull(jsonObjectBuilder39);
        org.junit.Assert.assertNotNull(jsonObject40);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder46);
        org.junit.Assert.assertNotNull(jsonArrayBuilder48);
        org.junit.Assert.assertNotNull(jsonArrayBuilder49);
        org.junit.Assert.assertNotNull(jsonArrayBuilder51);
        org.junit.Assert.assertNotNull(jsonArray52);
        org.junit.Assert.assertNotNull(jsonArrayBuilder53);
        org.junit.Assert.assertNotNull(jsonElement54);
        org.junit.Assert.assertNotNull(jsonElementSpliterator55);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable56);
        org.junit.Assert.assertNotNull(dateFormat59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(gson63);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder70);
        org.junit.Assert.assertNotNull(jsonArrayBuilder72);
        org.junit.Assert.assertNotNull(jsonArrayBuilder73);
        org.junit.Assert.assertNotNull(jsonArrayBuilder75);
        org.junit.Assert.assertNotNull(jsonArray76);
        org.junit.Assert.assertNotNull(jsonArrayBuilder77);
        org.junit.Assert.assertNotNull(jsonElement78);
        org.junit.Assert.assertNotNull(jsonElementSpliterator79);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable80);
        org.junit.Assert.assertNotNull(dateFormat83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(gson87);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.lang.Throwable throwable2 = null;
        io.gsonfire.gson.HookInvocationException hookInvocationException3 = new io.gsonfire.gson.HookInvocationException("", throwable2);
        io.gsonfire.gson.HookInvocationException hookInvocationException4 = new io.gsonfire.gson.HookInvocationException("hi!", throwable2);
        java.lang.Throwable[] throwableArray5 = hookInvocationException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy0 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy1 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] conflictResolutionStrategyArray2 = new io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] { conflictResolutionStrategy0, conflictResolutionStrategy1 };
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable3 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray2);
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable4 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray2);
        java.lang.String str5 = conflictResolutionStrategyEnumSimpleIterable4.toString();
        java.util.Collection<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumCollection6 = conflictResolutionStrategyEnumSimpleIterable4.toCollection();
        java.lang.String str7 = conflictResolutionStrategyEnumSimpleIterable4.toString();
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy0 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy0.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy1 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy1.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNotNull(conflictResolutionStrategyArray2);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable3);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[SKIP, SKIP]" + "'", str5, "[SKIP, SKIP]");
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumCollection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[SKIP, SKIP]" + "'", str7, "[SKIP, SKIP]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(16, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateUnixtimeSecondsTypeAdapter1.nullSafe();
        com.google.gson.stream.JsonWriter jsonWriter3 = null;
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateUnixtimeSecondsTypeAdapter1.write(jsonWriter3, date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder4 = jsonArrayBuilder2.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder5.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray8 = jsonArrayBuilder5.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder4.add((com.google.gson.JsonElement) jsonArray8);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder10 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder11 = jsonArrayBuilder4.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder10);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder12 = jsonObjectBuilder0.set("", (io.gsonfire.builders.JsonElementBuilder) jsonArrayBuilder11);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder15 = jsonObjectBuilder0.set("", "");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder18 = jsonObjectBuilder0.set("Dec 31, 1969", (java.lang.Boolean) true);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder20 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject21 = jsonObjectBuilder20.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder23 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject24 = jsonObjectBuilder23.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder25 = jsonObjectBuilder20.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder23);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder28 = jsonObjectBuilder20.set("", (java.lang.Number) (short) -1);
        com.google.gson.JsonObject jsonObject29 = jsonObjectBuilder20.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder31 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder33 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder35 = jsonArrayBuilder33.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder36 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder38 = jsonArrayBuilder36.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray39 = jsonArrayBuilder36.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder40 = jsonArrayBuilder35.add((com.google.gson.JsonElement) jsonArray39);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder41 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder42 = jsonArrayBuilder35.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder41);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder43 = jsonObjectBuilder31.set("", (io.gsonfire.builders.JsonElementBuilder) jsonArrayBuilder42);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder46 = jsonObjectBuilder31.set("", "");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder49 = jsonObjectBuilder31.set("Dec 31, 1969", (java.lang.Boolean) true);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder50 = jsonObjectBuilder20.set("[SKIP, SKIP]", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder49);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder51 = jsonObjectBuilder18.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder49);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder54 = jsonObjectBuilder18.set("io.gsonfire.gson.HookInvocationException: hi!", (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder4);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArray8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder11);
        org.junit.Assert.assertNotNull(jsonObjectBuilder12);
        org.junit.Assert.assertNotNull(jsonObjectBuilder15);
        org.junit.Assert.assertNotNull(jsonObjectBuilder18);
        org.junit.Assert.assertNotNull(jsonObject21);
        org.junit.Assert.assertNotNull(jsonObject24);
        org.junit.Assert.assertNotNull(jsonObjectBuilder25);
        org.junit.Assert.assertNotNull(jsonObjectBuilder28);
        org.junit.Assert.assertNotNull(jsonObject29);
        org.junit.Assert.assertNotNull(jsonArrayBuilder33);
        org.junit.Assert.assertNotNull(jsonArrayBuilder35);
        org.junit.Assert.assertNotNull(jsonArrayBuilder36);
        org.junit.Assert.assertNotNull(jsonArrayBuilder38);
        org.junit.Assert.assertNotNull(jsonArray39);
        org.junit.Assert.assertNotNull(jsonArrayBuilder40);
        org.junit.Assert.assertNotNull(jsonArrayBuilder42);
        org.junit.Assert.assertNotNull(jsonObjectBuilder43);
        org.junit.Assert.assertNotNull(jsonObjectBuilder46);
        org.junit.Assert.assertNotNull(jsonObjectBuilder49);
        org.junit.Assert.assertNotNull(jsonObjectBuilder50);
        org.junit.Assert.assertNotNull(jsonObjectBuilder51);
        org.junit.Assert.assertNotNull(jsonObjectBuilder54);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<io.gsonfire.builders.JsonArrayBuilder> jsonArrayBuilderMethodInvokerPostProcessor0 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<io.gsonfire.builders.JsonArrayBuilder>();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        java.lang.reflect.Method method2 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass4 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy5 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory6 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass4, conflictResolutionStrategy5);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod7 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method2, "", conflictResolutionStrategy5);
        boolean boolean8 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod7);
        java.lang.reflect.Method method9 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass11 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy12 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory13 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass11, conflictResolutionStrategy12);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod14 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method9, "", conflictResolutionStrategy12);
        java.lang.reflect.Method method15 = mappedMethod14.getMethod();
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy16 = mappedMethod14.getConflictResolutionStrategy();
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy17 = mappedMethod14.getConflictResolutionStrategy();
        boolean boolean18 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod14);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy5 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy5.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy12 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy12.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy16 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy16.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy17 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy17.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (short) 1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject1 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder5 = jsonObjectBuilder0.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder3);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = jsonObjectBuilder5.set("null", (java.lang.Number) 9);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder11 = jsonObjectBuilder8.set("[SKIP, SKIP]", (java.lang.Boolean) true);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder13 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder15 = jsonArrayBuilder13.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder16 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder18 = jsonArrayBuilder16.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray19 = jsonArrayBuilder16.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder20 = jsonArrayBuilder15.add((com.google.gson.JsonElement) jsonArray19);
        com.google.gson.JsonElement jsonElement21 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray19);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator22 = jsonArray19.spliterator();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder23 = jsonObjectBuilder11.set("io.gsonfire.gson.HookInvocationException: [SKIP, SKIP]", (com.google.gson.JsonElement) jsonArray19);
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable24 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray19);
        org.junit.Assert.assertNotNull(jsonObject1);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObjectBuilder5);
        org.junit.Assert.assertNotNull(jsonObjectBuilder8);
        org.junit.Assert.assertNotNull(jsonObjectBuilder11);
        org.junit.Assert.assertNotNull(jsonArrayBuilder13);
        org.junit.Assert.assertNotNull(jsonArrayBuilder15);
        org.junit.Assert.assertNotNull(jsonArrayBuilder16);
        org.junit.Assert.assertNotNull(jsonArrayBuilder18);
        org.junit.Assert.assertNotNull(jsonArray19);
        org.junit.Assert.assertNotNull(jsonArrayBuilder20);
        org.junit.Assert.assertNotNull(jsonElement21);
        org.junit.Assert.assertNotNull(jsonElementSpliterator22);
        org.junit.Assert.assertNotNull(jsonObjectBuilder23);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable24);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter1 = new io.gsonfire.gson.DateRFC3339TypeAdapter(false);
        com.google.gson.stream.JsonReader jsonReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = dateRFC3339TypeAdapter1.read(jsonReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = dateTypeAdapter5.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        io.gsonfire.GsonFireBuilder gsonFireBuilder0 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson1 = gsonFireBuilder0.createGson();
        io.gsonfire.GsonFireBuilder gsonFireBuilder2 = gsonFireBuilder0.enableExclusionByValue();
        java.util.TimeZone timeZone3 = null;
        io.gsonfire.GsonFireBuilder gsonFireBuilder4 = gsonFireBuilder0.serializeTimeZone(timeZone3);
        com.google.gson.Gson gson5 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory6 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass7 = cachedReflectionFactory6.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter8 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson5, (java.lang.reflect.Type) wildcardClass7);
        io.gsonfire.GsonFireBuilder gsonFireBuilder9 = gsonFireBuilder4.enableHooks((java.lang.Class) wildcardClass7);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray10 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite11 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray10);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod12 = null;
        boolean boolean13 = fireExclusionStrategyComposite11.shouldSkipMethod(mappedMethod12);
        io.gsonfire.GsonFireBuilder gsonFireBuilder14 = gsonFireBuilder4.addSerializationExclusionStrategy((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite11);
        org.junit.Assert.assertNotNull(gson1);
        org.junit.Assert.assertNotNull(gsonFireBuilder2);
        org.junit.Assert.assertNotNull(gsonFireBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(gsonFireBuilder9);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(gsonFireBuilder14);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        io.gsonfire.util.reflection.FieldInspector fieldInspector0 = new io.gsonfire.util.reflection.FieldInspector();
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory1 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        io.gsonfire.gson.ExcludeByValueTypeAdapterFactory excludeByValueTypeAdapterFactory2 = new io.gsonfire.gson.ExcludeByValueTypeAdapterFactory(fieldInspector0, (io.gsonfire.util.reflection.Factory) cachedReflectionFactory1);
        io.gsonfire.util.reflection.FieldInspector fieldInspector3 = new io.gsonfire.util.reflection.FieldInspector();
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory4 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        io.gsonfire.gson.ExcludeByValueTypeAdapterFactory excludeByValueTypeAdapterFactory5 = new io.gsonfire.gson.ExcludeByValueTypeAdapterFactory(fieldInspector3, (io.gsonfire.util.reflection.Factory) cachedReflectionFactory4);
        io.gsonfire.gson.ExcludeByValueTypeAdapterFactory excludeByValueTypeAdapterFactory6 = new io.gsonfire.gson.ExcludeByValueTypeAdapterFactory(fieldInspector0, (io.gsonfire.util.reflection.Factory) cachedReflectionFactory4);
        io.gsonfire.util.reflection.FieldInspector fieldInspector7 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory8 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        io.gsonfire.gson.ExcludeByValueTypeAdapterFactory excludeByValueTypeAdapterFactory9 = new io.gsonfire.gson.ExcludeByValueTypeAdapterFactory(fieldInspector7, (io.gsonfire.util.reflection.Factory) cachedReflectionFactory8);
        io.gsonfire.gson.ExcludeByValueTypeAdapterFactory excludeByValueTypeAdapterFactory10 = new io.gsonfire.gson.ExcludeByValueTypeAdapterFactory(fieldInspector0, (io.gsonfire.util.reflection.Factory) cachedReflectionFactory8);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(5, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '#', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.util.Map<java.lang.Class<io.gsonfire.gson.ExcludeByValueTypeAdapterFactory>, io.gsonfire.util.Mapper<io.gsonfire.gson.ExcludeByValueTypeAdapterFactory, java.lang.String>> excludeByValueTypeAdapterFactoryClassMap0 = null;
        io.gsonfire.gson.WrapTypeAdapterFactory<io.gsonfire.gson.ExcludeByValueTypeAdapterFactory> excludeByValueTypeAdapterFactoryWrapTypeAdapterFactory1 = new io.gsonfire.gson.WrapTypeAdapterFactory<io.gsonfire.gson.ExcludeByValueTypeAdapterFactory>(excludeByValueTypeAdapterFactoryClassMap0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateUnixtimeSecondsTypeAdapter1.nullSafe();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder3.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray6 = jsonArrayBuilder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = dateUnixtimeSecondsTypeAdapter1.fromJsonTree((com.google.gson.JsonElement) jsonArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NUMBER but was BEGIN_ARRAY at path $");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArray6);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder3.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray6 = jsonArrayBuilder3.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder2.add((com.google.gson.JsonElement) jsonArray6);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder2.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder8);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder11 = jsonArrayBuilder9.add("hi!");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder12 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject13 = jsonObjectBuilder12.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder15 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject16 = jsonObjectBuilder15.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder17 = jsonObjectBuilder12.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder15);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder20 = jsonObjectBuilder12.set("", (java.lang.Number) (short) -1);
        com.google.gson.JsonObject jsonObject21 = jsonObjectBuilder12.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder22 = jsonArrayBuilder11.add((com.google.gson.JsonElement) jsonObject21);
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArray6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder11);
        org.junit.Assert.assertNotNull(jsonObject13);
        org.junit.Assert.assertNotNull(jsonObject16);
        org.junit.Assert.assertNotNull(jsonObjectBuilder17);
        org.junit.Assert.assertNotNull(jsonObjectBuilder20);
        org.junit.Assert.assertNotNull(jsonObject21);
        org.junit.Assert.assertNotNull(jsonArrayBuilder22);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        io.gsonfire.ClassConfig<io.gsonfire.util.reflection.Factory> factoryClassConfig0 = null;
        io.gsonfire.ClassConfig<io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactoryClassConfig1 = null;
        com.google.gson.reflect.TypeToken[] typeTokenArray2 = new com.google.gson.reflect.TypeToken[] {};
        java.util.LinkedHashSet<com.google.gson.reflect.TypeToken> typeTokenSet3 = new java.util.LinkedHashSet<com.google.gson.reflect.TypeToken>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.gson.reflect.TypeToken>) typeTokenSet3, typeTokenArray2);
        io.gsonfire.gson.TypeSelectorTypeAdapterFactory<io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactoryTypeSelectorTypeAdapterFactory5 = new io.gsonfire.gson.TypeSelectorTypeAdapterFactory<io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>>(conflictResolutionStrategyEnumDefaultValueTypeAdapterFactoryClassConfig1, (java.util.Set<com.google.gson.reflect.TypeToken>) typeTokenSet3);
        io.gsonfire.gson.TypeSelectorTypeAdapterFactory<io.gsonfire.util.reflection.Factory> factoryTypeSelectorTypeAdapterFactory6 = new io.gsonfire.gson.TypeSelectorTypeAdapterFactory<io.gsonfire.util.reflection.Factory>(factoryClassConfig0, (java.util.Set<com.google.gson.reflect.TypeToken>) typeTokenSet3);
        org.junit.Assert.assertNotNull(typeTokenArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) ' ', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.lang.Class<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClass0 = null;
        io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClassConfig1 = new io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException>(hookInvocationExceptionClass0);
        java.util.Collection<io.gsonfire.PreProcessor<io.gsonfire.gson.HookInvocationException>> hookInvocationExceptionPreProcessorCollection2 = hookInvocationExceptionClassConfig1.getPreProcessors();
        boolean boolean3 = hookInvocationExceptionClassConfig1.isHooksEnabled();
        org.junit.Assert.assertNotNull(hookInvocationExceptionPreProcessorCollection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder0 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = jsonArrayBuilder0.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder3.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray6 = jsonArrayBuilder3.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder2.add((com.google.gson.JsonElement) jsonArray6);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder8 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder2.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder8);
        com.google.gson.JsonArray jsonArray10 = jsonArrayBuilder2.build();
        org.junit.Assert.assertNotNull(jsonArrayBuilder0);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArray6);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArray10);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy0 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy1 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] conflictResolutionStrategyArray2 = new io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] { conflictResolutionStrategy0, conflictResolutionStrategy1 };
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable3 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray2);
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable4 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray2);
        java.util.Iterator<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumItor5 = conflictResolutionStrategyEnumSimpleIterable4.iterator();
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy0 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy0.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy1 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy1.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNotNull(conflictResolutionStrategyArray2);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable3);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable4);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumItor5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = dateRFC3339TypeAdapter2.fromJson("[SKIP, SKIP]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected a string but was BEGIN_ARRAY at line 1 column 2 path $");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        io.gsonfire.gson.FireExclusionStrategy fireExclusionStrategy0 = null;
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor1 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>(fireExclusionStrategy0);
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory2 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass3 = cachedReflectionFactory2.getClass();
        com.google.gson.JsonElement jsonElement4 = null;
        com.google.gson.Gson gson5 = null;
        annotatedElementMethodInvokerPostProcessor1.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass3, jsonElement4, gson5);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder7.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder10 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder12 = jsonArrayBuilder10.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray13 = jsonArrayBuilder10.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder14 = jsonArrayBuilder9.add((com.google.gson.JsonElement) jsonArray13);
        com.google.gson.Gson gson15 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory16 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass17 = cachedReflectionFactory16.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter18 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson15, (java.lang.reflect.Type) wildcardClass17);
        com.google.gson.Gson gson19 = null;
        annotatedElementMethodInvokerPostProcessor1.postSerialize((com.google.gson.JsonElement) jsonArray13, (java.lang.reflect.AnnotatedElement) wildcardClass17, gson19);
        com.google.gson.Gson gson21 = null;
        com.google.gson.Gson gson22 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory23 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass24 = cachedReflectionFactory23.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter25 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson22, (java.lang.reflect.Type) wildcardClass24);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter26 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson21, (java.lang.reflect.Type) wildcardClass24);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder27 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder29 = jsonArrayBuilder27.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray30 = jsonArrayBuilder27.build();
        com.google.gson.Gson gson31 = null;
        annotatedElementMethodInvokerPostProcessor1.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass24, (com.google.gson.JsonElement) jsonArray30, gson31);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder33 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder35 = jsonArrayBuilder33.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray36 = jsonArrayBuilder35.build();
        com.google.gson.Gson gson37 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory38 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass39 = cachedReflectionFactory38.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter40 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson37, (java.lang.reflect.Type) wildcardClass39);
        io.gsonfire.gson.FireExclusionStrategy fireExclusionStrategy41 = null;
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor42 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>(fireExclusionStrategy41);
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory43 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass44 = cachedReflectionFactory43.getClass();
        com.google.gson.JsonElement jsonElement45 = null;
        com.google.gson.Gson gson46 = null;
        annotatedElementMethodInvokerPostProcessor42.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass44, jsonElement45, gson46);
        io.gsonfire.gson.FireExclusionStrategy fireExclusionStrategy48 = null;
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor49 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>(fireExclusionStrategy48);
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory50 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass51 = cachedReflectionFactory50.getClass();
        com.google.gson.JsonElement jsonElement52 = null;
        com.google.gson.Gson gson53 = null;
        annotatedElementMethodInvokerPostProcessor49.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass51, jsonElement52, gson53);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder55 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder57 = jsonArrayBuilder55.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder58 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder60 = jsonArrayBuilder58.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray61 = jsonArrayBuilder58.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder62 = jsonArrayBuilder57.add((com.google.gson.JsonElement) jsonArray61);
        com.google.gson.Gson gson63 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory64 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass65 = cachedReflectionFactory64.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter66 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson63, (java.lang.reflect.Type) wildcardClass65);
        com.google.gson.Gson gson67 = null;
        annotatedElementMethodInvokerPostProcessor49.postSerialize((com.google.gson.JsonElement) jsonArray61, (java.lang.reflect.AnnotatedElement) wildcardClass65, gson67);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder69 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder71 = jsonArrayBuilder69.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder72 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder74 = jsonArrayBuilder72.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray75 = jsonArrayBuilder72.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder76 = jsonArrayBuilder71.add((com.google.gson.JsonElement) jsonArray75);
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable77 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray75);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator78 = jsonArray75.spliterator();
        io.gsonfire.GsonFireBuilder gsonFireBuilder79 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson80 = gsonFireBuilder79.createGson();
        annotatedElementMethodInvokerPostProcessor42.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass65, (com.google.gson.JsonElement) jsonArray75, gson80);
        annotatedElementMethodInvokerPostProcessor1.postSerialize((com.google.gson.JsonElement) jsonArray36, (java.lang.reflect.AnnotatedElement) wildcardClass39, gson80);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator83 = jsonArray36.spliterator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder10);
        org.junit.Assert.assertNotNull(jsonArrayBuilder12);
        org.junit.Assert.assertNotNull(jsonArray13);
        org.junit.Assert.assertNotNull(jsonArrayBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(jsonArrayBuilder27);
        org.junit.Assert.assertNotNull(jsonArrayBuilder29);
        org.junit.Assert.assertNotNull(jsonArray30);
        org.junit.Assert.assertNotNull(jsonArrayBuilder33);
        org.junit.Assert.assertNotNull(jsonArrayBuilder35);
        org.junit.Assert.assertNotNull(jsonArray36);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(jsonArrayBuilder55);
        org.junit.Assert.assertNotNull(jsonArrayBuilder57);
        org.junit.Assert.assertNotNull(jsonArrayBuilder58);
        org.junit.Assert.assertNotNull(jsonArrayBuilder60);
        org.junit.Assert.assertNotNull(jsonArray61);
        org.junit.Assert.assertNotNull(jsonArrayBuilder62);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(jsonArrayBuilder69);
        org.junit.Assert.assertNotNull(jsonArrayBuilder71);
        org.junit.Assert.assertNotNull(jsonArrayBuilder72);
        org.junit.Assert.assertNotNull(jsonArrayBuilder74);
        org.junit.Assert.assertNotNull(jsonArray75);
        org.junit.Assert.assertNotNull(jsonArrayBuilder76);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable77);
        org.junit.Assert.assertNotNull(jsonElementSpliterator78);
        org.junit.Assert.assertNotNull(gson80);
        org.junit.Assert.assertNotNull(jsonElementSpliterator83);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateTypeAdapter3.nullSafe();
        java.io.Writer writer5 = null;
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter4.toJson(writer5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat2 = new io.gsonfire.util.RFC3339DateFormat(timeZone0, false);
        java.util.Date date3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = rFC3339DateFormat2.format(date3, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateRFC3339TypeAdapter2.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter6.toJson(date7);
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("io.gsonfire.gson.HookInvocationException: hi!", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.lang.Class<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClass0 = null;
        io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClassConfig1 = new io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException>(hookInvocationExceptionClass0);
        java.lang.Class<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClass2 = hookInvocationExceptionClassConfig1.getConfiguredClass();
        java.util.Collection<io.gsonfire.PreProcessor<io.gsonfire.gson.HookInvocationException>> hookInvocationExceptionPreProcessorCollection3 = hookInvocationExceptionClassConfig1.getPreProcessors();
        boolean boolean4 = hookInvocationExceptionClassConfig1.isHooksEnabled();
        hookInvocationExceptionClassConfig1.setHooksEnabled(false);
        org.junit.Assert.assertNull(hookInvocationExceptionClass2);
        org.junit.Assert.assertNotNull(hookInvocationExceptionPreProcessorCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat1 = new io.gsonfire.util.RFC3339DateFormat(true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        java.lang.Class<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumClass0 = null;
        io.gsonfire.ClassConfig<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumClassConfig1 = new io.gsonfire.ClassConfig<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>>(conflictResolutionStrategyEnumClass0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod2 = null;
        boolean boolean3 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod2);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor4 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite1);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray5 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite6 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray5);
        java.lang.reflect.Method method7 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass9 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy10 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory11 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass9, conflictResolutionStrategy10);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod12 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method7, "", conflictResolutionStrategy10);
        boolean boolean13 = fireExclusionStrategyComposite6.shouldSkipMethod(mappedMethod12);
        java.lang.reflect.Method method14 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass16 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy17 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory18 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass16, conflictResolutionStrategy17);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod19 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method14, "", conflictResolutionStrategy17);
        java.lang.reflect.Method method20 = mappedMethod19.getMethod();
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy21 = mappedMethod19.getConflictResolutionStrategy();
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy22 = mappedMethod19.getConflictResolutionStrategy();
        boolean boolean23 = fireExclusionStrategyComposite6.shouldSkipMethod(mappedMethod19);
        java.lang.reflect.Method method24 = mappedMethod19.getMethod();
        boolean boolean25 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod19);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray5);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy10 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy10.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy17 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy17.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy21 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy21.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy22 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy22.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        java.lang.Throwable throwable2 = null;
        io.gsonfire.gson.HookInvocationException hookInvocationException3 = new io.gsonfire.gson.HookInvocationException("", throwable2);
        io.gsonfire.gson.HookInvocationException hookInvocationException4 = new io.gsonfire.gson.HookInvocationException("null", throwable2);
        java.lang.String str5 = hookInvocationException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "io.gsonfire.gson.HookInvocationException: null" + "'", str5, "io.gsonfire.gson.HookInvocationException: null");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        java.lang.Class<java.text.Format> formatClass0 = null;
        io.gsonfire.ClassConfig<java.text.Format> formatClassConfig1 = new io.gsonfire.ClassConfig<java.text.Format>(formatClass0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter5.nullSafe();
        java.util.Date date7 = null;
        java.lang.String str8 = dateTypeAdapter6.toJson(date7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = dateTypeAdapter6.fromJson("io.gsonfire.gson.HookInvocationException: [SKIP, SKIP]");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.util.TimeZone timeZone1 = null;
        dateFormat0.setTimeZone(timeZone1);
        boolean boolean4 = dateFormat0.equals((java.lang.Object) 0);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = dateFormat0.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy0 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy1 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] conflictResolutionStrategyArray2 = new io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] { conflictResolutionStrategy0, conflictResolutionStrategy1 };
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable3 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray2);
        java.util.Iterator<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumItor4 = conflictResolutionStrategyEnumSimpleIterable3.iterator();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder5 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder7.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder10 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder12 = jsonArrayBuilder10.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray13 = jsonArrayBuilder10.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder14 = jsonArrayBuilder9.add((com.google.gson.JsonElement) jsonArray13);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder15 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder16 = jsonArrayBuilder9.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder15);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder17 = jsonObjectBuilder5.set("", (io.gsonfire.builders.JsonElementBuilder) jsonArrayBuilder16);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder20 = jsonObjectBuilder5.set("", "");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder22 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder24 = jsonArrayBuilder22.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder25 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder27 = jsonArrayBuilder25.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray28 = jsonArrayBuilder25.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder29 = jsonArrayBuilder24.add((com.google.gson.JsonElement) jsonArray28);
        com.google.gson.JsonElement jsonElement30 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray28);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder31 = jsonObjectBuilder20.set("hi!", jsonElement30);
        boolean boolean32 = conflictResolutionStrategyEnumSimpleIterable3.equals((java.lang.Object) jsonElement30);
        java.lang.Object obj33 = null;
        boolean boolean34 = conflictResolutionStrategyEnumSimpleIterable3.equals(obj33);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy0 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy0.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy1 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy1.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNotNull(conflictResolutionStrategyArray2);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable3);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumItor4);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder10);
        org.junit.Assert.assertNotNull(jsonArrayBuilder12);
        org.junit.Assert.assertNotNull(jsonArray13);
        org.junit.Assert.assertNotNull(jsonArrayBuilder14);
        org.junit.Assert.assertNotNull(jsonArrayBuilder16);
        org.junit.Assert.assertNotNull(jsonObjectBuilder17);
        org.junit.Assert.assertNotNull(jsonObjectBuilder20);
        org.junit.Assert.assertNotNull(jsonArrayBuilder22);
        org.junit.Assert.assertNotNull(jsonArrayBuilder24);
        org.junit.Assert.assertNotNull(jsonArrayBuilder25);
        org.junit.Assert.assertNotNull(jsonArrayBuilder27);
        org.junit.Assert.assertNotNull(jsonArray28);
        org.junit.Assert.assertNotNull(jsonArrayBuilder29);
        org.junit.Assert.assertNotNull(jsonElement30);
        org.junit.Assert.assertNotNull(jsonObjectBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder4 = jsonArrayBuilder2.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder5.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray8 = jsonArrayBuilder5.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder4.add((com.google.gson.JsonElement) jsonArray8);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder10 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder11 = jsonArrayBuilder4.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder10);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder12 = jsonObjectBuilder0.set("", (io.gsonfire.builders.JsonElementBuilder) jsonArrayBuilder11);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder15 = jsonObjectBuilder0.set("", "");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder17 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder20 = jsonObjectBuilder17.set("io.gsonfire.gson.HookInvocationException: null", (java.lang.Boolean) true);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder21 = jsonObjectBuilder15.set("io.gsonfire.gson.HookInvocationException: hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder17);
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder4);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArray8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder11);
        org.junit.Assert.assertNotNull(jsonObjectBuilder12);
        org.junit.Assert.assertNotNull(jsonObjectBuilder15);
        org.junit.Assert.assertNotNull(jsonObjectBuilder20);
        org.junit.Assert.assertNotNull(jsonObjectBuilder21);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        java.lang.reflect.Method method2 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass4 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy5 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory6 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass4, conflictResolutionStrategy5);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod7 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method2, "", conflictResolutionStrategy5);
        boolean boolean8 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod7);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray9 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite10 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray9);
        java.lang.reflect.Method method11 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass13 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy14 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory15 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass13, conflictResolutionStrategy14);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod16 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method11, "", conflictResolutionStrategy14);
        boolean boolean17 = fireExclusionStrategyComposite10.shouldSkipMethod(mappedMethod16);
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy18 = mappedMethod16.getConflictResolutionStrategy();
        boolean boolean19 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod16);
        java.lang.String str20 = mappedMethod16.getSerializedName();
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy5 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy5.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray9);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy14 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy14.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy18 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy18.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.google.gson.Gson gson0 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory1 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass2 = cachedReflectionFactory1.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter3 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson0, (java.lang.reflect.Type) wildcardClass2);
        com.google.gson.stream.JsonWriter jsonWriter4 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy5 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy6 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] conflictResolutionStrategyArray7 = new io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] { conflictResolutionStrategy5, conflictResolutionStrategy6 };
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable8 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray7);
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable9 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray7);
        java.lang.String str10 = conflictResolutionStrategyEnumSimpleIterable9.toString();
        java.lang.Object obj11 = null;
        boolean boolean12 = conflictResolutionStrategyEnumSimpleIterable9.equals(obj11);
        // The following exception was thrown during execution in test generation
        try {
            simpleIterableTypeAdapter3.write(jsonWriter4, conflictResolutionStrategyEnumSimpleIterable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy5 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy5.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy6 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy6.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNotNull(conflictResolutionStrategyArray7);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable8);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[SKIP, SKIP]" + "'", str10, "[SKIP, SKIP]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        io.gsonfire.gson.DateUnixtimeMillisTypeAdapter dateUnixtimeMillisTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeMillisTypeAdapter(true);
        com.google.gson.stream.JsonWriter jsonWriter2 = null;
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder3 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = jsonArrayBuilder3.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder6 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject7 = jsonObjectBuilder6.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder9 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject10 = jsonObjectBuilder9.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder11 = jsonObjectBuilder6.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder9);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder14 = jsonObjectBuilder6.set("", (java.lang.Number) (short) -1);
        com.google.gson.JsonObject jsonObject15 = jsonObjectBuilder6.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder16 = jsonArrayBuilder3.add((com.google.gson.JsonElement) jsonObject15);
        com.google.gson.JsonArray jsonArray17 = jsonArrayBuilder16.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder19 = jsonArrayBuilder16.add("io.gsonfire.gson.HookInvocationException: ");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder20 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject21 = jsonObjectBuilder20.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder23 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject24 = jsonObjectBuilder23.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder25 = jsonObjectBuilder20.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder23);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder27 = jsonObjectBuilder25.setNull("io.gsonfire.gson.HookInvocationException: ");
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder28 = jsonArrayBuilder16.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder27);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement29 = io.gsonfire.util.JsonUtils.toJsonTree((com.google.gson.TypeAdapter) dateUnixtimeMillisTypeAdapter1, jsonWriter2, (java.lang.Object) jsonArrayBuilder28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonArrayBuilder3);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonObject7);
        org.junit.Assert.assertNotNull(jsonObject10);
        org.junit.Assert.assertNotNull(jsonObjectBuilder11);
        org.junit.Assert.assertNotNull(jsonObjectBuilder14);
        org.junit.Assert.assertNotNull(jsonObject15);
        org.junit.Assert.assertNotNull(jsonArrayBuilder16);
        org.junit.Assert.assertNotNull(jsonArray17);
        org.junit.Assert.assertNotNull(jsonArrayBuilder19);
        org.junit.Assert.assertNotNull(jsonObject21);
        org.junit.Assert.assertNotNull(jsonObject24);
        org.junit.Assert.assertNotNull(jsonObjectBuilder25);
        org.junit.Assert.assertNotNull(jsonObjectBuilder27);
        org.junit.Assert.assertNotNull(jsonArrayBuilder28);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.lang.Class<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClass0 = null;
        io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClassConfig1 = new io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException>(hookInvocationExceptionClass0);
        hookInvocationExceptionClassConfig1.setHooksEnabled(true);
        java.util.Collection<io.gsonfire.PostProcessor<io.gsonfire.gson.HookInvocationException>> hookInvocationExceptionPostProcessorCollection4 = hookInvocationExceptionClassConfig1.getPostProcessors();
        java.lang.Class<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClass5 = hookInvocationExceptionClassConfig1.getConfiguredClass();
        java.util.Collection<io.gsonfire.PostProcessor<io.gsonfire.gson.HookInvocationException>> hookInvocationExceptionPostProcessorCollection6 = hookInvocationExceptionClassConfig1.getPostProcessors();
        java.util.Collection<io.gsonfire.PostProcessor<io.gsonfire.gson.HookInvocationException>> hookInvocationExceptionPostProcessorCollection7 = hookInvocationExceptionClassConfig1.getPostProcessors();
        org.junit.Assert.assertNotNull(hookInvocationExceptionPostProcessorCollection4);
        org.junit.Assert.assertNull(hookInvocationExceptionClass5);
        org.junit.Assert.assertNotNull(hookInvocationExceptionPostProcessorCollection6);
        org.junit.Assert.assertNotNull(hookInvocationExceptionPostProcessorCollection7);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        io.gsonfire.util.RFC3339DateFormat rFC3339DateFormat1 = new io.gsonfire.util.RFC3339DateFormat(false);
        java.util.Date date2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = rFC3339DateFormat1.format(date2, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod2 = null;
        boolean boolean3 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod2);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor4 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite1);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder5.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder8 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder10 = jsonArrayBuilder8.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray11 = jsonArrayBuilder8.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder12 = jsonArrayBuilder7.add((com.google.gson.JsonElement) jsonArray11);
        com.google.gson.JsonElement jsonElement13 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray11);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator14 = jsonArray11.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable15 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray11);
        com.google.gson.Gson gson16 = null;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = dateFormat18.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter20 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson16, (java.lang.reflect.Type) wildcardClass19);
        io.gsonfire.GsonFireBuilder gsonFireBuilder21 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson22 = gsonFireBuilder21.createGson();
        annotatedElementMethodInvokerPostProcessor4.postSerialize((com.google.gson.JsonElement) jsonArray11, (java.lang.reflect.AnnotatedElement) wildcardClass19, gson22);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray24 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite25 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray24);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod26 = null;
        boolean boolean27 = fireExclusionStrategyComposite25.shouldSkipMethod(mappedMethod26);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor28 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite25);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder29 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder31 = jsonArrayBuilder29.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder32 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder34 = jsonArrayBuilder32.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray35 = jsonArrayBuilder32.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder36 = jsonArrayBuilder31.add((com.google.gson.JsonElement) jsonArray35);
        com.google.gson.JsonElement jsonElement37 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray35);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator38 = jsonArray35.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable39 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray35);
        com.google.gson.Gson gson40 = null;
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass43 = dateFormat42.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter44 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson40, (java.lang.reflect.Type) wildcardClass43);
        io.gsonfire.GsonFireBuilder gsonFireBuilder45 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson46 = gsonFireBuilder45.createGson();
        annotatedElementMethodInvokerPostProcessor28.postSerialize((com.google.gson.JsonElement) jsonArray35, (java.lang.reflect.AnnotatedElement) wildcardClass43, gson46);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter48 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson22, (java.lang.reflect.Type) wildcardClass43);
        com.google.gson.Gson gson49 = null;
        com.google.gson.Gson gson50 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory51 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass52 = cachedReflectionFactory51.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter53 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson50, (java.lang.reflect.Type) wildcardClass52);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter54 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson49, (java.lang.reflect.Type) wildcardClass52);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter55 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson22, (java.lang.reflect.Type) wildcardClass52);
        io.gsonfire.gson.FireExclusionStrategy fireExclusionStrategy56 = null;
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor57 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>(fireExclusionStrategy56);
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory58 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass59 = cachedReflectionFactory58.getClass();
        com.google.gson.JsonElement jsonElement60 = null;
        com.google.gson.Gson gson61 = null;
        annotatedElementMethodInvokerPostProcessor57.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass59, jsonElement60, gson61);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder63 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder65 = jsonArrayBuilder63.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder66 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder68 = jsonArrayBuilder66.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray69 = jsonArrayBuilder66.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder70 = jsonArrayBuilder65.add((com.google.gson.JsonElement) jsonArray69);
        com.google.gson.Gson gson71 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory72 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass73 = cachedReflectionFactory72.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter74 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson71, (java.lang.reflect.Type) wildcardClass73);
        com.google.gson.Gson gson75 = null;
        annotatedElementMethodInvokerPostProcessor57.postSerialize((com.google.gson.JsonElement) jsonArray69, (java.lang.reflect.AnnotatedElement) wildcardClass73, gson75);
        com.google.gson.Gson gson77 = null;
        com.google.gson.Gson gson78 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory79 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass80 = cachedReflectionFactory79.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter81 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson78, (java.lang.reflect.Type) wildcardClass80);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter82 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson77, (java.lang.reflect.Type) wildcardClass80);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder83 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder85 = jsonArrayBuilder83.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray86 = jsonArrayBuilder83.build();
        com.google.gson.Gson gson87 = null;
        annotatedElementMethodInvokerPostProcessor57.postDeserialize((java.lang.reflect.AnnotatedElement) wildcardClass80, (com.google.gson.JsonElement) jsonArray86, gson87);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter89 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson22, (java.lang.reflect.Type) wildcardClass80);
        com.google.gson.stream.JsonWriter jsonWriter90 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy91 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy92 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] conflictResolutionStrategyArray93 = new io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy[] { conflictResolutionStrategy91, conflictResolutionStrategy92 };
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable94 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray93);
        io.gsonfire.util.SimpleIterable<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumSimpleIterable95 = io.gsonfire.util.SimpleIterable.of((java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>[]) conflictResolutionStrategyArray93);
        java.lang.String str96 = conflictResolutionStrategyEnumSimpleIterable95.toString();
        java.util.Collection<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumCollection97 = conflictResolutionStrategyEnumSimpleIterable95.toCollection();
        java.util.Iterator<java.lang.Enum<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>> conflictResolutionStrategyEnumItor98 = conflictResolutionStrategyEnumSimpleIterable95.iterator();
        // The following exception was thrown during execution in test generation
        try {
            simpleIterableTypeAdapter89.write(jsonWriter90, conflictResolutionStrategyEnumSimpleIterable95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArrayBuilder8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder10);
        org.junit.Assert.assertNotNull(jsonArray11);
        org.junit.Assert.assertNotNull(jsonArrayBuilder12);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonElementSpliterator14);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable15);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(gson22);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder29);
        org.junit.Assert.assertNotNull(jsonArrayBuilder31);
        org.junit.Assert.assertNotNull(jsonArrayBuilder32);
        org.junit.Assert.assertNotNull(jsonArrayBuilder34);
        org.junit.Assert.assertNotNull(jsonArray35);
        org.junit.Assert.assertNotNull(jsonArrayBuilder36);
        org.junit.Assert.assertNotNull(jsonElement37);
        org.junit.Assert.assertNotNull(jsonElementSpliterator38);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable39);
        org.junit.Assert.assertNotNull(dateFormat42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(gson46);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(jsonArrayBuilder63);
        org.junit.Assert.assertNotNull(jsonArrayBuilder65);
        org.junit.Assert.assertNotNull(jsonArrayBuilder66);
        org.junit.Assert.assertNotNull(jsonArrayBuilder68);
        org.junit.Assert.assertNotNull(jsonArray69);
        org.junit.Assert.assertNotNull(jsonArrayBuilder70);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(jsonArrayBuilder83);
        org.junit.Assert.assertNotNull(jsonArrayBuilder85);
        org.junit.Assert.assertNotNull(jsonArray86);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy91 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy91.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy92 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy92.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNotNull(conflictResolutionStrategyArray93);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable94);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumSimpleIterable95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "[SKIP, SKIP]" + "'", str96, "[SKIP, SKIP]");
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumCollection97);
        org.junit.Assert.assertNotNull(conflictResolutionStrategyEnumItor98);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder4 = jsonArrayBuilder2.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder5.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray8 = jsonArrayBuilder5.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder4.add((com.google.gson.JsonElement) jsonArray8);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder10 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder11 = jsonArrayBuilder4.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder10);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder12 = jsonObjectBuilder0.set("", (io.gsonfire.builders.JsonElementBuilder) jsonArrayBuilder11);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder15 = jsonObjectBuilder0.set("", "");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder17 = jsonObjectBuilder0.setNull("");
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder4);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArray8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder11);
        org.junit.Assert.assertNotNull(jsonObjectBuilder12);
        org.junit.Assert.assertNotNull(jsonObjectBuilder15);
        org.junit.Assert.assertNotNull(jsonObjectBuilder17);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        java.lang.Class<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClass0 = null;
        io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClassConfig1 = new io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException>(hookInvocationExceptionClass0);
        hookInvocationExceptionClassConfig1.setHooksEnabled(true);
        java.util.Collection<io.gsonfire.PostProcessor<io.gsonfire.gson.HookInvocationException>> hookInvocationExceptionPostProcessorCollection4 = hookInvocationExceptionClassConfig1.getPostProcessors();
        java.lang.Class<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClass5 = hookInvocationExceptionClassConfig1.getConfiguredClass();
        java.util.Collection<io.gsonfire.PreProcessor<io.gsonfire.gson.HookInvocationException>> hookInvocationExceptionPreProcessorCollection6 = hookInvocationExceptionClassConfig1.getPreProcessors();
        org.junit.Assert.assertNotNull(hookInvocationExceptionPostProcessorCollection4);
        org.junit.Assert.assertNull(hookInvocationExceptionClass5);
        org.junit.Assert.assertNotNull(hookInvocationExceptionPreProcessorCollection6);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        java.lang.reflect.Method method0 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass2 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy3 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory4 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass2, conflictResolutionStrategy3);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod5 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method0, "", conflictResolutionStrategy3);
        java.lang.reflect.Method method6 = mappedMethod5.getMethod();
        java.lang.reflect.Method method7 = mappedMethod5.getMethod();
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy3 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy3.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        io.gsonfire.GsonFireBuilder gsonFireBuilder0 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson1 = gsonFireBuilder0.createGson();
        io.gsonfire.GsonFireBuilder gsonFireBuilder2 = gsonFireBuilder0.enableExclusionByValue();
        java.util.TimeZone timeZone3 = null;
        io.gsonfire.GsonFireBuilder gsonFireBuilder4 = gsonFireBuilder2.serializeTimeZone(timeZone3);
        io.gsonfire.GsonFireBuilder gsonFireBuilder5 = gsonFireBuilder4.enableExclusionByValue();
        com.google.gson.GsonBuilder gsonBuilder6 = gsonFireBuilder5.createGsonBuilder();
        org.junit.Assert.assertNotNull(gson1);
        org.junit.Assert.assertNotNull(gsonFireBuilder2);
        org.junit.Assert.assertNotNull(gsonFireBuilder4);
        org.junit.Assert.assertNotNull(gsonFireBuilder5);
        org.junit.Assert.assertNotNull(gsonBuilder6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        com.google.gson.TypeAdapter<java.util.HashSet<com.google.gson.reflect.TypeToken>> typeTokenSetTypeAdapter0 = null;
        io.gsonfire.gson.NullableTypeAdapter<java.util.HashSet<com.google.gson.reflect.TypeToken>> typeTokenSetNullableTypeAdapter1 = new io.gsonfire.gson.NullableTypeAdapter<java.util.HashSet<com.google.gson.reflect.TypeToken>>(typeTokenSetTypeAdapter0);
        com.google.gson.stream.JsonReader jsonReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<com.google.gson.reflect.TypeToken> typeTokenSet3 = typeTokenSetNullableTypeAdapter1.read(jsonReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter4 = dateRFC3339TypeAdapter2.nullSafe();
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = dateRFC3339TypeAdapter2.nullSafe();
        java.util.TimeZone timeZone6 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter8 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone6, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter9 = dateRFC3339TypeAdapter8.nullSafe();
        java.util.Date date10 = null;
        java.lang.String str11 = dateTypeAdapter9.toJson(date10);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = dateTypeAdapter9.toJsonTree(date12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = dateRFC3339TypeAdapter2.fromJsonTree(jsonElement13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected STRING but was NULL at path $");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertNotNull(dateTypeAdapter4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(dateTypeAdapter9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
        org.junit.Assert.assertNotNull(jsonElement13);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder2 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder4 = jsonArrayBuilder2.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder5.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray8 = jsonArrayBuilder5.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder9 = jsonArrayBuilder4.add((com.google.gson.JsonElement) jsonArray8);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder10 = new io.gsonfire.builders.JsonObjectBuilder();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder11 = jsonArrayBuilder4.add((io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder10);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder12 = jsonObjectBuilder0.set("", (io.gsonfire.builders.JsonElementBuilder) jsonArrayBuilder11);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder14 = jsonObjectBuilder0.setNull("");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder17 = jsonObjectBuilder14.set("", "io.gsonfire.gson.HookInvocationException: hi!");
        org.junit.Assert.assertNotNull(jsonArrayBuilder2);
        org.junit.Assert.assertNotNull(jsonArrayBuilder4);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArray8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder9);
        org.junit.Assert.assertNotNull(jsonArrayBuilder11);
        org.junit.Assert.assertNotNull(jsonObjectBuilder12);
        org.junit.Assert.assertNotNull(jsonObjectBuilder14);
        org.junit.Assert.assertNotNull(jsonObjectBuilder17);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        java.text.NumberFormat numberFormat4 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar8 = dateFormat7.getCalendar();
        dateFormat1.setCalendar(calendar8);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=-825812066865,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=9,WEEK_OF_YEAR=45,WEEK_OF_MONTH=6,DAY_OF_MONTH=31,DAY_OF_YEAR=304,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=45,SECOND=33,MILLISECOND=135,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod2 = null;
        boolean boolean3 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod2);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor4 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite1);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder5 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder7 = jsonArrayBuilder5.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder8 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder10 = jsonArrayBuilder8.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray11 = jsonArrayBuilder8.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder12 = jsonArrayBuilder7.add((com.google.gson.JsonElement) jsonArray11);
        com.google.gson.JsonElement jsonElement13 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray11);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator14 = jsonArray11.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable15 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray11);
        com.google.gson.Gson gson16 = null;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = dateFormat18.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter20 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson16, (java.lang.reflect.Type) wildcardClass19);
        io.gsonfire.GsonFireBuilder gsonFireBuilder21 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson22 = gsonFireBuilder21.createGson();
        annotatedElementMethodInvokerPostProcessor4.postSerialize((com.google.gson.JsonElement) jsonArray11, (java.lang.reflect.AnnotatedElement) wildcardClass19, gson22);
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray24 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite25 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray24);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod26 = null;
        boolean boolean27 = fireExclusionStrategyComposite25.shouldSkipMethod(mappedMethod26);
        io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement> annotatedElementMethodInvokerPostProcessor28 = new io.gsonfire.postprocessors.methodinvoker.MethodInvokerPostProcessor<java.lang.reflect.AnnotatedElement>((io.gsonfire.gson.FireExclusionStrategy) fireExclusionStrategyComposite25);
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder29 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder31 = jsonArrayBuilder29.add((java.lang.Number) (-1.0d));
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder32 = io.gsonfire.builders.JsonArrayBuilder.start();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder34 = jsonArrayBuilder32.add((java.lang.Number) (-1.0d));
        com.google.gson.JsonArray jsonArray35 = jsonArrayBuilder32.build();
        io.gsonfire.builders.JsonArrayBuilder jsonArrayBuilder36 = jsonArrayBuilder31.add((com.google.gson.JsonElement) jsonArray35);
        com.google.gson.JsonElement jsonElement37 = io.gsonfire.util.JsonUtils.deepCopy((com.google.gson.JsonElement) jsonArray35);
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator38 = jsonArray35.spliterator();
        io.gsonfire.util.SimpleIterable<com.google.gson.JsonElement> jsonElementSimpleIterable39 = io.gsonfire.util.SimpleIterable.of((java.lang.Iterable<com.google.gson.JsonElement>) jsonArray35);
        com.google.gson.Gson gson40 = null;
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass43 = dateFormat42.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter44 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson40, (java.lang.reflect.Type) wildcardClass43);
        io.gsonfire.GsonFireBuilder gsonFireBuilder45 = new io.gsonfire.GsonFireBuilder();
        com.google.gson.Gson gson46 = gsonFireBuilder45.createGson();
        annotatedElementMethodInvokerPostProcessor28.postSerialize((com.google.gson.JsonElement) jsonArray35, (java.lang.reflect.AnnotatedElement) wildcardClass43, gson46);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter48 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson22, (java.lang.reflect.Type) wildcardClass43);
        com.google.gson.Gson gson49 = null;
        com.google.gson.Gson gson50 = null;
        io.gsonfire.util.reflection.CachedReflectionFactory cachedReflectionFactory51 = new io.gsonfire.util.reflection.CachedReflectionFactory();
        java.lang.Class<?> wildcardClass52 = cachedReflectionFactory51.getClass();
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter53 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson50, (java.lang.reflect.Type) wildcardClass52);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter54 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson49, (java.lang.reflect.Type) wildcardClass52);
        io.gsonfire.gson.SimpleIterableTypeAdapter simpleIterableTypeAdapter55 = new io.gsonfire.gson.SimpleIterableTypeAdapter(gson22, (java.lang.reflect.Type) wildcardClass52);
        com.google.gson.stream.JsonReader jsonReader56 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.gsonfire.util.SimpleIterable<?> wildcardSimpleIterable57 = simpleIterableTypeAdapter55.read(jsonReader56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder5);
        org.junit.Assert.assertNotNull(jsonArrayBuilder7);
        org.junit.Assert.assertNotNull(jsonArrayBuilder8);
        org.junit.Assert.assertNotNull(jsonArrayBuilder10);
        org.junit.Assert.assertNotNull(jsonArray11);
        org.junit.Assert.assertNotNull(jsonArrayBuilder12);
        org.junit.Assert.assertNotNull(jsonElement13);
        org.junit.Assert.assertNotNull(jsonElementSpliterator14);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable15);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(gson22);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jsonArrayBuilder29);
        org.junit.Assert.assertNotNull(jsonArrayBuilder31);
        org.junit.Assert.assertNotNull(jsonArrayBuilder32);
        org.junit.Assert.assertNotNull(jsonArrayBuilder34);
        org.junit.Assert.assertNotNull(jsonArray35);
        org.junit.Assert.assertNotNull(jsonArrayBuilder36);
        org.junit.Assert.assertNotNull(jsonElement37);
        org.junit.Assert.assertNotNull(jsonElementSpliterator38);
        org.junit.Assert.assertNotNull(jsonElementSimpleIterable39);
        org.junit.Assert.assertNotNull(dateFormat42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(gson46);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        java.util.TimeZone timeZone0 = null;
        io.gsonfire.gson.DateRFC3339TypeAdapter dateRFC3339TypeAdapter2 = new io.gsonfire.gson.DateRFC3339TypeAdapter(timeZone0, false);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateRFC3339TypeAdapter2.nullSafe();
        java.io.Writer writer4 = null;
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter3.toJson(writer4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        java.lang.reflect.Method method2 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass4 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy5 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory6 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass4, conflictResolutionStrategy5);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod7 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method2, "", conflictResolutionStrategy5);
        boolean boolean8 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod7);
        java.lang.reflect.Method method9 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass11 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy12 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory13 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass11, conflictResolutionStrategy12);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod14 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method9, "", conflictResolutionStrategy12);
        java.lang.reflect.Method method15 = mappedMethod14.getMethod();
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy16 = mappedMethod14.getConflictResolutionStrategy();
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy17 = mappedMethod14.getConflictResolutionStrategy();
        boolean boolean18 = fireExclusionStrategyComposite1.shouldSkipMethod(mappedMethod14);
        java.lang.reflect.Method method19 = mappedMethod14.getMethod();
        java.lang.String str20 = mappedMethod14.getSerializedName();
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy5 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy5.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy12 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy12.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy16 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy16.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy17 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy17.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        java.lang.Throwable throwable3 = null;
        io.gsonfire.gson.HookInvocationException hookInvocationException4 = new io.gsonfire.gson.HookInvocationException("", throwable3);
        io.gsonfire.gson.HookInvocationException hookInvocationException5 = new io.gsonfire.gson.HookInvocationException("hi!", throwable3);
        io.gsonfire.gson.HookInvocationException hookInvocationException6 = new io.gsonfire.gson.HookInvocationException("[SKIP, SKIP]", throwable3);
        java.lang.Throwable throwable9 = null;
        io.gsonfire.gson.HookInvocationException hookInvocationException10 = new io.gsonfire.gson.HookInvocationException("", throwable9);
        io.gsonfire.gson.HookInvocationException hookInvocationException11 = new io.gsonfire.gson.HookInvocationException("hi!", throwable9);
        java.lang.Throwable throwable14 = null;
        io.gsonfire.gson.HookInvocationException hookInvocationException15 = new io.gsonfire.gson.HookInvocationException("", throwable14);
        io.gsonfire.gson.HookInvocationException hookInvocationException16 = new io.gsonfire.gson.HookInvocationException("null", throwable14);
        java.lang.Throwable throwable19 = null;
        io.gsonfire.gson.HookInvocationException hookInvocationException20 = new io.gsonfire.gson.HookInvocationException("", throwable19);
        io.gsonfire.gson.HookInvocationException hookInvocationException21 = new io.gsonfire.gson.HookInvocationException("hi!", throwable19);
        hookInvocationException16.addSuppressed((java.lang.Throwable) hookInvocationException21);
        hookInvocationException11.addSuppressed((java.lang.Throwable) hookInvocationException21);
        hookInvocationException6.addSuppressed((java.lang.Throwable) hookInvocationException21);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((-1), locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.util.TimeZone timeZone1 = null;
        dateFormat0.setTimeZone(timeZone1);
        boolean boolean4 = dateFormat0.equals((java.lang.Object) 0);
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter6 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = dateUnixtimeSecondsTypeAdapter6.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateFormat0.format((java.lang.Object) dateTypeAdapter7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        java.text.NumberFormat numberFormat4 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        java.text.NumberFormat numberFormat10 = dateFormat8.getNumberFormat();
        dateFormat7.setNumberFormat(numberFormat10);
        java.lang.StringBuffer stringBuffer12 = null;
        java.text.FieldPosition fieldPosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = dateFormat1.format((java.lang.Object) numberFormat10, stringBuffer12, fieldPosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder0 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject1 = jsonObjectBuilder0.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder3 = new io.gsonfire.builders.JsonObjectBuilder();
        com.google.gson.JsonObject jsonObject4 = jsonObjectBuilder3.build();
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder5 = jsonObjectBuilder0.set("hi!", (io.gsonfire.builders.JsonElementBuilder) jsonObjectBuilder3);
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder7 = jsonObjectBuilder5.setNull("io.gsonfire.gson.HookInvocationException: ");
        io.gsonfire.builders.JsonObjectBuilder jsonObjectBuilder10 = jsonObjectBuilder7.set("", (java.lang.Number) 15);
        org.junit.Assert.assertNotNull(jsonObject1);
        org.junit.Assert.assertNotNull(jsonObject4);
        org.junit.Assert.assertNotNull(jsonObjectBuilder5);
        org.junit.Assert.assertNotNull(jsonObjectBuilder7);
        org.junit.Assert.assertNotNull(jsonObjectBuilder10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        java.lang.Class<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClass0 = null;
        io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClassConfig1 = new io.gsonfire.ClassConfig<io.gsonfire.gson.HookInvocationException>(hookInvocationExceptionClass0);
        hookInvocationExceptionClassConfig1.setHooksEnabled(true);
        java.util.Collection<io.gsonfire.PostProcessor<io.gsonfire.gson.HookInvocationException>> hookInvocationExceptionPostProcessorCollection4 = hookInvocationExceptionClassConfig1.getPostProcessors();
        java.lang.Class<io.gsonfire.gson.HookInvocationException> hookInvocationExceptionClass5 = hookInvocationExceptionClassConfig1.getConfiguredClass();
        java.util.Collection<io.gsonfire.PostProcessor<io.gsonfire.gson.HookInvocationException>> hookInvocationExceptionPostProcessorCollection6 = hookInvocationExceptionClassConfig1.getPostProcessors();
        io.gsonfire.TypeSelector<? super io.gsonfire.gson.HookInvocationException> wildcardTypeSelector7 = hookInvocationExceptionClassConfig1.getTypeSelector();
        org.junit.Assert.assertNotNull(hookInvocationExceptionPostProcessorCollection4);
        org.junit.Assert.assertNull(hookInvocationExceptionClass5);
        org.junit.Assert.assertNotNull(hookInvocationExceptionPostProcessorCollection6);
        org.junit.Assert.assertNull(wildcardTypeSelector7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter dateUnixtimeSecondsTypeAdapter1 = new io.gsonfire.gson.DateUnixtimeSecondsTypeAdapter(true);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter2 = dateUnixtimeSecondsTypeAdapter1.nullSafe();
        com.google.gson.stream.JsonReader jsonReader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = dateUnixtimeSecondsTypeAdapter1.read(jsonReader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter2);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        io.gsonfire.gson.FireExclusionStrategy[] fireExclusionStrategyArray0 = new io.gsonfire.gson.FireExclusionStrategy[] {};
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite1 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        io.gsonfire.gson.FireExclusionStrategyComposite fireExclusionStrategyComposite2 = new io.gsonfire.gson.FireExclusionStrategyComposite(fireExclusionStrategyArray0);
        java.lang.reflect.Method method3 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass5 = null;
        java.lang.reflect.Method method6 = null;
        java.lang.Class<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyClass8 = null;
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy9 = io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP;
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory10 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass8, conflictResolutionStrategy9);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod11 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method6, "", conflictResolutionStrategy9);
        java.lang.reflect.Method method12 = mappedMethod11.getMethod();
        io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy conflictResolutionStrategy13 = mappedMethod11.getConflictResolutionStrategy();
        io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy> conflictResolutionStrategyEnumDefaultValueTypeAdapterFactory14 = new io.gsonfire.gson.EnumDefaultValueTypeAdapterFactory<io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy>(conflictResolutionStrategyClass5, conflictResolutionStrategy13);
        io.gsonfire.postprocessors.methodinvoker.MappedMethod mappedMethod15 = new io.gsonfire.postprocessors.methodinvoker.MappedMethod(method3, "[SKIP, SKIP]", conflictResolutionStrategy13);
        java.lang.String str16 = mappedMethod15.getSerializedName();
        boolean boolean17 = fireExclusionStrategyComposite2.shouldSkipMethod(mappedMethod15);
        org.junit.Assert.assertNotNull(fireExclusionStrategyArray0);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy9 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy9.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + conflictResolutionStrategy13 + "' != '" + io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP + "'", conflictResolutionStrategy13.equals(io.gsonfire.annotations.ExposeMethodResult.ConflictResolutionStrategy.SKIP));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[SKIP, SKIP]" + "'", str16, "[SKIP, SKIP]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        io.gsonfire.DateSerializationPolicy dateSerializationPolicy1 = io.gsonfire.DateSerializationPolicy.unixTimeSeconds;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) dateSerializationPolicy1);
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateSerializationPolicy1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-825812066701,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Chicago\",offset=-21600000,dstSavings=3600000,useDaylight=true,transitions=235,lastRule=java.util.SimpleTimeZone[id=America/Chicago,offset=-21600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1943,MONTH=9,WEEK_OF_YEAR=45,WEEK_OF_MONTH=6,DAY_OF_MONTH=31,DAY_OF_YEAR=304,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=45,SECOND=33,MILLISECOND=299,ZONE_OFFSET=-21600000,DST_OFFSET=3600000]");
    }
}
