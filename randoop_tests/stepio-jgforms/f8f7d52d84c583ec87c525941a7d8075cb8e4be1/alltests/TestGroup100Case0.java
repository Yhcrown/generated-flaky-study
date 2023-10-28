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
        boolean boolean1 = io.github.stepio.jgforms.answer.Validation.hasLength((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str1 = io.github.stepio.jgforms.answer.Validation.encode("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi%21" + "'", str1, "hi%21");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.util.Collection collection0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0, (byte) 0, (-1L), false, (short) 10, "hi%21" };
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(collection0, "hi%21", objArray8);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0, 0, -1, false, 10, hi%21]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0, 0, -1, false, 10, hi%21]");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        boolean boolean1 = io.github.stepio.jgforms.answer.Validation.isEmpty((java.lang.Object) "hi%21");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = io.github.stepio.jgforms.answer.Validation.message("hi%21", objArray7);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[4, , 4,  ]");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException2 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException3 = new io.github.stepio.jgforms.exception.NotSubmittedException("", (java.lang.Throwable) notSubmittedException2);
        java.lang.String str4 = notSubmittedException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str4, "io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        boolean boolean1 = io.github.stepio.jgforms.answer.Validation.isEmpty((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.Object[] objArray11 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray11);
        java.lang.String str13 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray11);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray11);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray11);
        boolean boolean16 = io.github.stepio.jgforms.answer.Validation.isEmpty((java.lang.Object) true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDateTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.util.Map map0 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray10);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "hi%21", objArray10);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(map0, "io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[4, , 4,  ]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.util.Map map0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray8);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(map0, "hi!", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, , 4,  ]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, (int) 'a', (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, (long) (byte) 0, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDate(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException1 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        java.lang.String str2 = notSubmittedException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str2, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.util.Map map0 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray13);
        java.lang.String str15 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray13);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray13);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray13);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(map0, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi%21", "hi!", "io.github.stepio.jgforms.exception.NotSubmittedException: ", "hi%21", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder11 = builder1.put(metaData2, (java.util.List<java.lang.String>) strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        java.lang.Class<?> wildcardClass3 = configuration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException1 = new io.github.stepio.jgforms.exception.InvalidFormException("io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException2 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException3 = new io.github.stepio.jgforms.exception.NotSubmittedException("", (java.lang.Throwable) notSubmittedException2);
        java.lang.String str4 = notSubmittedException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str4, "io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str1 = io.github.stepio.jgforms.answer.Validation.encode("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+" + "'", str1, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String str1 = io.github.stepio.jgforms.answer.Validation.encode("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException%3A+" + "'", str1, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDate(metaData2, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.util.Map map0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray8);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(map0, "io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, , 4,  ]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDate(metaData2, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = builder1.toUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.Object[] objArray11 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray11);
        java.lang.String str13 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray11);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray11);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray11);
        boolean boolean16 = io.github.stepio.jgforms.answer.Validation.isEmpty((java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "io.github.stepio.jgforms.exception.NotSubmittedException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException1 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi%21");
        java.lang.String str2 = missingRequiredAnswerException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21" + "'", str2, "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+" + "'", str2, "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.List<java.lang.String> strList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, strList3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.lang.String str1 = io.github.stepio.jgforms.answer.Validation.encode("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B" + "'", str1, "io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, 100, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        boolean boolean1 = io.github.stepio.jgforms.answer.Validation.hasLength((java.lang.CharSequence) "io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.Object[] objArray11 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray11);
        java.lang.String str13 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray11);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray11);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.isTrue(false, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = builder1.toUrlString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDate(metaData2, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, calendar3, calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.util.Map map0 = null;
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException4 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException5 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException4);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException7 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException4.addSuppressed((java.lang.Throwable) notSubmittedException7);
        java.lang.Throwable[] throwableArray9 = notSubmittedException7.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(map0, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", (java.lang.Object[]) throwableArray9);
            org.junit.Assert.fail("Expected exception of type java.util.MissingFormatArgumentException; message: Format specifier '%3A'");
        } catch (java.util.MissingFormatArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        io.github.stepio.jgforms.Configuration configuration0 = null;
        io.github.stepio.jgforms.Submitter submitter1 = new io.github.stepio.jgforms.Submitter(configuration0);
        java.net.URL uRL2 = null;
        // The following exception was thrown during execution in test generation
        try {
            submitter1.submitForm(uRL2);
            org.junit.Assert.fail("Expected exception of type io.github.stepio.jgforms.exception.NotSubmittedException; message: Failed to submit form, unexpected exception");
        } catch (io.github.stepio.jgforms.exception.NotSubmittedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, (int) (byte) 0, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.lang.Object[] objArray11 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray11);
        java.lang.String str13 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray11);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray11);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.isTrue(false, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray11);
            org.junit.Assert.fail("Expected exception of type java.util.IllegalFormatConversionException; message: a != java.lang.Character");
        } catch (java.util.IllegalFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        io.github.stepio.jgforms.Log log1 = io.github.stepio.jgforms.Log.getLogger("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.util.Map map0 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray9);
        java.lang.String str11 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray9);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(map0, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        io.github.stepio.jgforms.Log log2 = io.github.stepio.jgforms.Log.getLogger("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.Configuration configuration4 = new io.github.stepio.jgforms.Configuration();
        configuration4.setConnectTimeout((long) 0);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException8 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi%21");
        java.lang.Object[] objArray10 = new java.lang.Object[] { "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", 0, "hi%21", 'a' };
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.fail("io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray10);
            org.junit.Assert.fail("Expected exception of type java.util.IllegalFormatConversionException; message: a != java.lang.String");
        } catch (java.util.IllegalFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+, io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: , 0, hi%21, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+, io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: , 0, hi%21, a]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException1 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        java.lang.Class<?> wildcardClass2 = notSubmittedException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException1 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!");
        java.lang.Class<?> wildcardClass2 = notSubmittedException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.util.Collection collection0 = null;
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(collection0, "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        boolean boolean1 = io.github.stepio.jgforms.answer.Validation.isEmpty((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.Object[] objArray10 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray10);
        java.lang.String str12 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray10);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", objArray10);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, calendar3, calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, 100, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException1 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        java.lang.String str2 = notSubmittedException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str2, "io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.util.Collection collection0 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray11);
        java.lang.String str13 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray11);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray11);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(collection0, "hi!", objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = builder1.toUrlString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException2 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException3 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException2);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException5 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException2.addSuppressed((java.lang.Throwable) notSubmittedException5);
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException8 = new io.github.stepio.jgforms.exception.InvalidFormException("hi!");
        missingRequiredAnswerException2.addSuppressed((java.lang.Throwable) invalidFormException8);
        java.lang.String str10 = invalidFormException8.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "io.github.stepio.jgforms.exception.InvalidFormException: hi!" + "'", str10, "io.github.stepio.jgforms.exception.InvalidFormException: hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = builder1.toUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.lang.Object[] objArray10 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray10);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray10);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.isTrue(false, "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", objArray10);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[4, , 4,  ]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException1 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, 100, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, 0, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        boolean boolean1 = io.github.stepio.jgforms.answer.Validation.isEmpty((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.String str1 = io.github.stepio.jgforms.answer.Validation.encode("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B" + "'", str1, "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.util.Map map0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.String str4 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(map0, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray3);
            org.junit.Assert.fail("Expected exception of type java.util.MissingFormatArgumentException; message: Format specifier '%3A'");
        } catch (java.util.MissingFormatArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str4, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.String str1 = io.github.stepio.jgforms.answer.Validation.encode("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21" + "'", str1, "io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.Object[] objArray10 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray10);
        java.lang.String str12 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray10);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray10);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.fail("hi%21", objArray10);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        java.lang.Class<?> wildcardClass2 = configuration0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, calendar3, calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.lang.Object[] objArray11 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray11);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray11);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray11);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.fail("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B", objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[4, , 4,  ]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, calendar3, calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.util.Map map0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.String str4 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(map0, "io.github.stepio.jgforms.exception.InvalidFormException: hi!", objArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str4, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = builder1.toUrlString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "io.github.stepio.jgforms.exception.NotSubmittedException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, (int) (byte) 100, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDate(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException1 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.util.Map map0 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray11);
        java.lang.String str13 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray11);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray11);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(map0, "hi%21", objArray11);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException3 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException4 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException3);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException6 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException3.addSuppressed((java.lang.Throwable) notSubmittedException6);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException8 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException: ", (java.lang.Throwable) notSubmittedException6);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException10 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        notSubmittedException6.addSuppressed((java.lang.Throwable) missingRequiredAnswerException10);
        java.lang.String str12 = notSubmittedException6.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str12, "io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDate(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        boolean boolean1 = io.github.stepio.jgforms.answer.Validation.hasLength((java.lang.CharSequence) "io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, 10, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        io.github.stepio.jgforms.Submitter submitter4 = new io.github.stepio.jgforms.Submitter(configuration0);
        configuration0.setConnectTimeout((long) 100);
        long long7 = configuration0.getReadTimeout();
        long long8 = configuration0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDateTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.lang.Object[] objArray12 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray12);
        java.lang.String str14 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray12);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray12);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray12);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.fail("io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B", objArray12);
            org.junit.Assert.fail("Expected exception of type java.util.IllegalFormatConversionException; message: a != java.lang.Character");
        } catch (java.util.IllegalFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, 0, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException1 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.lang.Object[] objArray11 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray11);
        java.lang.String str13 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray11);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray11);
        java.lang.String str15 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray11);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.fail("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B", objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str15, "io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.util.Collection collection0 = null;
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray8);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(collection0, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray8);
            org.junit.Assert.fail("Expected exception of type java.util.IllegalFormatConversionException; message: a != java.lang.Character");
        } catch (java.util.IllegalFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, , 4,  ]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException1 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        java.lang.String str2 = notSubmittedException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+" + "'", str2, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = builder1.toUrlString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.lang.Object obj0 = null;
        boolean boolean1 = io.github.stepio.jgforms.answer.Validation.isEmpty(obj0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = builder1.toUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.util.Map map0 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray15);
        java.lang.String str17 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray15);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray15);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray15);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+", objArray15);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(map0, "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", objArray15);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.lang.Object[] objArray7 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray7);
        java.lang.String str9 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray7);
        java.lang.Class<?> wildcardClass10 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException1 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        java.lang.String str2 = missingRequiredAnswerException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21" + "'", str2, "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException2 = new io.github.stepio.jgforms.exception.InvalidFormException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        java.lang.Throwable[] throwableArray3 = invalidFormException2.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = io.github.stepio.jgforms.answer.Validation.message("hi%21", (java.lang.Object[]) throwableArray3);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setReadTimeout((long) 1);
        long long3 = configuration0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, (long) '4', timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.Object[] objArray8 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray8);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.isTrue(false, "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+", objArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[4, , 4,  ]");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = builder1.toUrlString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        boolean boolean1 = io.github.stepio.jgforms.answer.Validation.isEmpty((java.lang.Object) "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, (long) '4', timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, (long) (short) 0, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException2 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException3 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException2);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException5 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException2.addSuppressed((java.lang.Throwable) notSubmittedException5);
        java.lang.Throwable[] throwableArray7 = notSubmittedException5.getSuppressed();
        java.lang.Class<?> wildcardClass8 = notSubmittedException5.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.util.Collection collection0 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray10);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray10);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(collection0, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray10);
            org.junit.Assert.fail("Expected exception of type java.util.IllegalFormatConversionException; message: a != java.lang.Character");
        } catch (java.util.IllegalFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[4, , 4,  ]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = builder1.toUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        boolean boolean1 = io.github.stepio.jgforms.answer.Validation.hasLength((java.lang.CharSequence) "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, 0, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        io.github.stepio.jgforms.Submitter submitter4 = new io.github.stepio.jgforms.Submitter(configuration0);
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            submitter4.submitForm(uRL5);
            org.junit.Assert.fail("Expected exception of type io.github.stepio.jgforms.exception.NotSubmittedException; message: Failed to submit form, unexpected exception");
        } catch (io.github.stepio.jgforms.exception.NotSubmittedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "io.github.stepio.jgforms.exception.NotSubmittedException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        io.github.stepio.jgforms.Log log1 = io.github.stepio.jgforms.Log.getLogger("");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException4 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi%21");
        log1.error("io.github.stepio.jgforms.exception.NotSubmittedException%3A+", (java.lang.Throwable) notSubmittedException4);
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDate(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = builder1.toUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, calendar3, calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.lang.Object[] objArray9 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray9);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray9);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.fail("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", objArray9);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[4, , 4,  ]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException1 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, (long) 100, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException1 = new io.github.stepio.jgforms.exception.InvalidFormException("io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException3 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        invalidFormException1.addSuppressed((java.lang.Throwable) missingRequiredAnswerException3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.lang.Object[] objArray9 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray9);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = io.github.stepio.jgforms.answer.Validation.message("hi%21", objArray9);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[4, , 4,  ]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        io.github.stepio.jgforms.Submitter submitter4 = new io.github.stepio.jgforms.Submitter(configuration0);
        configuration0.setConnectTimeout((long) 100);
        long long7 = configuration0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.util.Collection collection0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(collection0, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray4);
            org.junit.Assert.fail("Expected exception of type java.util.IllegalFormatConversionException; message: a != java.lang.Short");
        } catch (java.util.IllegalFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[10,  ]");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, calendar3, calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B", "io.github.stepio.jgforms.exception.InvalidFormException: hi!", "io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder11 = builder1.put(metaData2, (java.util.List<java.lang.String>) strList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDate(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException3 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException4 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException3);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException6 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException3.addSuppressed((java.lang.Throwable) notSubmittedException6);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException8 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", (java.lang.Throwable) missingRequiredAnswerException3);
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException10 = new io.github.stepio.jgforms.exception.InvalidFormException("");
        notSubmittedException8.addSuppressed((java.lang.Throwable) invalidFormException10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.github.stepio.jgforms.Log log1 = io.github.stepio.jgforms.Log.getLogger("hi%21");
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, (int) (short) 0, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        io.github.stepio.jgforms.Submitter submitter3 = new io.github.stepio.jgforms.Submitter(configuration0);
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            submitter3.submitForm(uRL4);
            org.junit.Assert.fail("Expected exception of type io.github.stepio.jgforms.exception.NotSubmittedException; message: Failed to submit form, unexpected exception");
        } catch (io.github.stepio.jgforms.exception.NotSubmittedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, (long) (short) 0, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, (int) (byte) 100, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException3 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException4 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException3);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException6 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException3.addSuppressed((java.lang.Throwable) notSubmittedException6);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException8 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException: ", (java.lang.Throwable) notSubmittedException6);
        java.lang.String str9 = notSubmittedException8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str9, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDate(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.util.Map map0 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray10);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray10);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(map0, "hi%21", objArray10);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[4, , 4,  ]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        boolean boolean1 = io.github.stepio.jgforms.answer.Validation.hasLength((java.lang.CharSequence) "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, (int) (short) 1, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException3 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException4 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException3);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException8 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException9 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException8);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException11 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException8.addSuppressed((java.lang.Throwable) notSubmittedException11);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException13 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", (java.lang.Throwable) missingRequiredAnswerException8);
        missingRequiredAnswerException3.addSuppressed((java.lang.Throwable) notSubmittedException13);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException15 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", (java.lang.Throwable) notSubmittedException13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDate(metaData2, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDate(metaData2, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.lang.Object[] objArray9 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray9);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) "", "hi!", objArray9);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.fail("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", objArray9);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[4, , 4,  ]");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException2 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException3 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException2);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException5 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException2.addSuppressed((java.lang.Throwable) notSubmittedException5);
        java.lang.String str7 = notSubmittedException5.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str7, "io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.String str3 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", objArray2);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str3, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDate(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        configuration0.setReadTimeout(5000L);
        io.github.stepio.jgforms.Submitter submitter4 = new io.github.stepio.jgforms.Submitter(configuration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = builder1.toUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        long long4 = configuration0.getReadTimeout();
        io.github.stepio.jgforms.Submitter submitter5 = new io.github.stepio.jgforms.Submitter(configuration0);
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            submitter5.submitForm(uRL6);
            org.junit.Assert.fail("Expected exception of type io.github.stepio.jgforms.exception.NotSubmittedException; message: Failed to submit form, unexpected exception");
        } catch (io.github.stepio.jgforms.exception.NotSubmittedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDateTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, 1, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDate(metaData2, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, 0, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDateTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        io.github.stepio.jgforms.Log log1 = io.github.stepio.jgforms.Log.getLogger("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        boolean boolean1 = io.github.stepio.jgforms.answer.Validation.hasLength((java.lang.CharSequence) "io.github.stepio.jgforms.exception.NotSubmittedException: ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        io.github.stepio.jgforms.Submitter submitter4 = new io.github.stepio.jgforms.Submitter(configuration0);
        configuration0.setConnectTimeout((long) 100);
        long long7 = configuration0.getReadTimeout();
        long long8 = configuration0.getReadTimeout();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException1 = new io.github.stepio.jgforms.exception.InvalidFormException("hi!");
        java.lang.Throwable[] throwableArray2 = invalidFormException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = invalidFormException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.lang.String str1 = io.github.stepio.jgforms.answer.Validation.encode("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.lang.String str1 = io.github.stepio.jgforms.answer.Validation.encode("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "io.github.stepio.jgforms.exception.MissingRequiredAnswerException%3A+hi%2521" + "'", str1, "io.github.stepio.jgforms.exception.MissingRequiredAnswerException%3A+hi%2521");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.isTrue(false, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        configuration0.setReadTimeout((long) (byte) 1);
        configuration0.setReadTimeout((long) (short) 100);
        long long7 = configuration0.getReadTimeout();
        io.github.stepio.jgforms.Submitter submitter8 = new io.github.stepio.jgforms.Submitter(configuration0);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            submitter8.submitForm(uRL9);
            org.junit.Assert.fail("Expected exception of type io.github.stepio.jgforms.exception.NotSubmittedException; message: Failed to submit form, unexpected exception");
        } catch (io.github.stepio.jgforms.exception.NotSubmittedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.util.Map map0 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray12);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray12);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray12);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(map0, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray12);
            org.junit.Assert.fail("Expected exception of type java.util.IllegalFormatConversionException; message: a != java.lang.Character");
        } catch (java.util.IllegalFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[4, , 4,  ]");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        io.github.stepio.jgforms.Log log1 = io.github.stepio.jgforms.Log.getLogger("io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B");
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.util.Collection collection0 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray9);
        java.lang.String str11 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray9);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(collection0, "hi%21", objArray9);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException2 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException3 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException2);
        java.lang.Class<?> wildcardClass4 = notSubmittedException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        configuration0.setReadTimeout(1L);
        configuration0.setReadTimeout((long) 1);
        configuration0.setConnectTimeout((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        io.github.stepio.jgforms.Configuration configuration2 = new io.github.stepio.jgforms.Configuration();
        long long3 = configuration2.getReadTimeout();
        long long4 = configuration2.getConnectTimeout();
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        java.lang.String str8 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray7);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) long4, "io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray7);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.isTrue(false, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str8, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        configuration0.setReadTimeout(0L);
        configuration0.setConnectTimeout(1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.util.Map map0 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray13);
        java.lang.String str15 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray13);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray13);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray13);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(map0, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray13);
            org.junit.Assert.fail("Expected exception of type java.util.IllegalFormatConversionException; message: a != java.lang.Character");
        } catch (java.util.IllegalFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException4 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException5 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException4);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException7 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException4.addSuppressed((java.lang.Throwable) notSubmittedException7);
        java.lang.Throwable[] throwableArray9 = missingRequiredAnswerException4.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.isTrue(false, "hi!", (java.lang.Object[]) throwableArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException1 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, 5000L, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.lang.String str1 = io.github.stepio.jgforms.answer.Validation.encode("io.github.stepio.jgforms.exception.MissingRequiredAnswerException%3A+hi%2521");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "io.github.stepio.jgforms.exception.MissingRequiredAnswerException%253A%2Bhi%252521" + "'", str1, "io.github.stepio.jgforms.exception.MissingRequiredAnswerException%253A%2Bhi%252521");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        java.lang.Class<?> wildcardClass2 = builder1.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        io.github.stepio.jgforms.Submitter submitter4 = new io.github.stepio.jgforms.Submitter(configuration0);
        configuration0.setConnectTimeout((long) 100);
        long long7 = configuration0.getReadTimeout();
        configuration0.setReadTimeout(1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        io.github.stepio.jgforms.Log log1 = io.github.stepio.jgforms.Log.getLogger("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        java.lang.Throwable throwable3 = null;
        log1.error("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", throwable3);
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        io.github.stepio.jgforms.Submitter submitter4 = new io.github.stepio.jgforms.Submitter(configuration0);
        configuration0.setConnectTimeout((long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "io.github.stepio.jgforms.exception.InvalidFormException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException2 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException3 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException2);
        java.lang.Class<?> wildcardClass4 = missingRequiredAnswerException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDate(metaData2, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException3 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException4 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException3);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException6 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException3.addSuppressed((java.lang.Throwable) notSubmittedException6);
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException9 = new io.github.stepio.jgforms.exception.InvalidFormException("hi!");
        missingRequiredAnswerException3.addSuppressed((java.lang.Throwable) invalidFormException9);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException12 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        missingRequiredAnswerException3.addSuppressed((java.lang.Throwable) missingRequiredAnswerException12);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException14 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B", (java.lang.Throwable) missingRequiredAnswerException3);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException17 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException18 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException17);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException20 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException17.addSuppressed((java.lang.Throwable) notSubmittedException20);
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException23 = new io.github.stepio.jgforms.exception.InvalidFormException("hi!");
        missingRequiredAnswerException17.addSuppressed((java.lang.Throwable) invalidFormException23);
        notSubmittedException14.addSuppressed((java.lang.Throwable) invalidFormException23);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        java.lang.Object[] objArray10 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray10);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) (byte) 1, "", objArray10);
        java.lang.String str13 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B", objArray10);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.fail("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray10);
            org.junit.Assert.fail("Expected exception of type java.util.IllegalFormatConversionException; message: a != java.lang.Character");
        } catch (java.util.IllegalFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE" + "'", str13, "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, 0, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        configuration0.setConnectTimeout((long) 10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean1 = io.github.stepio.jgforms.answer.Validation.isEmpty(obj0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, (int) (short) -1, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDateTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException2 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!");
        java.lang.Throwable[] throwableArray3 = notSubmittedException2.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.fail("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+", (java.lang.Object[]) throwableArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "hi%21");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        configuration0.setReadTimeout(0L);
        long long6 = configuration0.getConnectTimeout();
        long long7 = configuration0.getReadTimeout();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException1 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException%253A%2Bhi%252521");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        configuration0.setReadTimeout(1L);
        long long4 = configuration0.getConnectTimeout();
        configuration0.setConnectTimeout((long) (byte) 0);
        long long7 = configuration0.getReadTimeout();
        long long8 = configuration0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException2 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException3 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException2);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException7 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException8 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException7);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException10 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException7.addSuppressed((java.lang.Throwable) notSubmittedException10);
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException13 = new io.github.stepio.jgforms.exception.InvalidFormException("hi!");
        missingRequiredAnswerException7.addSuppressed((java.lang.Throwable) invalidFormException13);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException16 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        missingRequiredAnswerException7.addSuppressed((java.lang.Throwable) missingRequiredAnswerException16);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException18 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException%3A+", (java.lang.Throwable) missingRequiredAnswerException16);
        notSubmittedException3.addSuppressed((java.lang.Throwable) notSubmittedException18);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.List<java.lang.String> strList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, strList3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE", "io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B", "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+", "io.github.stepio.jgforms.exception.InvalidFormException: hi!", "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", "hi!", "io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21", "io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21", "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", "io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B", "io.github.stepio.jgforms.exception.NotSubmittedException: ", "hi!", "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B", "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B", "io.github.stepio.jgforms.exception.NotSubmittedException%3A+" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder23 = builder1.put(metaData2, (java.util.List<java.lang.String>) strList21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.List<java.lang.String> strList3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, strList3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDate(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, (long) 10, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.util.Collection collection0 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray9);
        java.lang.String str11 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray9);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(collection0, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray9);
            org.junit.Assert.fail("Expected exception of type java.util.IllegalFormatConversionException; message: a != java.lang.Character");
        } catch (java.util.IllegalFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = builder1.toUrlString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        io.github.stepio.jgforms.Log log1 = io.github.stepio.jgforms.Log.getLogger("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+");
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE", "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE", "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE", "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", "io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21", "", "hi%21", "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B", "io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21", "", "io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21", "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", "io.github.stepio.jgforms.exception.NotSubmittedException%3A+" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder22 = builder1.put(metaData2, (java.util.List<java.lang.String>) strList20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDate(metaData2, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException1 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        long long4 = configuration0.getReadTimeout();
        io.github.stepio.jgforms.Submitter submitter5 = new io.github.stepio.jgforms.Submitter(configuration0);
        configuration0.setConnectTimeout((long) (byte) 100);
        configuration0.setConnectTimeout((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException3 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException4 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException3);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException6 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException3.addSuppressed((java.lang.Throwable) notSubmittedException6);
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException9 = new io.github.stepio.jgforms.exception.InvalidFormException("hi!");
        missingRequiredAnswerException3.addSuppressed((java.lang.Throwable) invalidFormException9);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException12 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        missingRequiredAnswerException3.addSuppressed((java.lang.Throwable) missingRequiredAnswerException12);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException14 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException%3A+", (java.lang.Throwable) missingRequiredAnswerException12);
        boolean boolean15 = io.github.stepio.jgforms.answer.Validation.isEmpty((java.lang.Object) "io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, 0, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDate(metaData2, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDate(metaData2, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDateTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException1 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.lang.Object[] objArray14 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray14);
        java.lang.String str16 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray14);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray14);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray14);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+", objArray14);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.fail("io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B", objArray14);
            org.junit.Assert.fail("Expected exception of type java.util.IllegalFormatConversionException; message: a != java.lang.Character");
        } catch (java.util.IllegalFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDate(metaData2, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.lang.Object[] objArray12 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray12);
        java.lang.String str14 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray12);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray12);
        java.lang.String str16 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray12);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.isTrue(false, "io.github.stepio.jgforms.exception.InvalidFormException: hi!", objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str16, "io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDateTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        configuration0.setReadTimeout(1L);
        long long4 = configuration0.getReadTimeout();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = builder1.toUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        long long4 = configuration0.getReadTimeout();
        io.github.stepio.jgforms.Submitter submitter5 = new io.github.stepio.jgforms.Submitter(configuration0);
        configuration0.setConnectTimeout(0L);
        configuration0.setReadTimeout((long) (-1));
        long long10 = configuration0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        io.github.stepio.jgforms.Configuration configuration1 = new io.github.stepio.jgforms.Configuration();
        long long2 = configuration1.getReadTimeout();
        long long3 = configuration1.getConnectTimeout();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.String str7 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray6);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) long3, "io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray6);
        java.lang.String str9 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+", objArray6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str7, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+" + "'", str9, "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = builder1.toUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setReadTimeout((long) 1);
        io.github.stepio.jgforms.Submitter submitter3 = new io.github.stepio.jgforms.Submitter(configuration0);
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            submitter3.submitForm(uRL4);
            org.junit.Assert.fail("Expected exception of type io.github.stepio.jgforms.exception.NotSubmittedException; message: Failed to submit form, unexpected exception");
        } catch (io.github.stepio.jgforms.exception.NotSubmittedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.util.Collection collection0 = null;
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException3 = new io.github.stepio.jgforms.exception.InvalidFormException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        java.lang.Throwable[] throwableArray4 = invalidFormException3.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(collection0, "io.github.stepio.jgforms.exception.MissingRequiredAnswerException%3A+hi%2521", (java.lang.Object[]) throwableArray4);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "io.github.stepio.jgforms.exception.MissingRequiredAnswerException%3A+hi%2521", "", "", "io.github.stepio.jgforms.exception.NotSubmittedException: ", "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", "", "io.github.stepio.jgforms.exception.NotSubmittedException: ", "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE", "io.github.stepio.jgforms.exception.InvalidFormException: hi!", "io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder16 = builder1.put(metaData2, (java.util.List<java.lang.String>) strList14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        io.github.stepio.jgforms.Log log1 = io.github.stepio.jgforms.Log.getLogger("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException1 = new io.github.stepio.jgforms.exception.InvalidFormException("hi!");
        java.lang.Throwable[] throwableArray2 = invalidFormException1.getSuppressed();
        java.lang.String str3 = invalidFormException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "io.github.stepio.jgforms.exception.InvalidFormException: hi!" + "'", str3, "io.github.stepio.jgforms.exception.InvalidFormException: hi!");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException3 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException4 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException3);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException6 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException3.addSuppressed((java.lang.Throwable) notSubmittedException6);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException8 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", (java.lang.Throwable) missingRequiredAnswerException3);
        java.lang.String str9 = missingRequiredAnswerException3.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi!" + "'", str9, "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi!");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException4 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException5 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException4);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException7 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException4.addSuppressed((java.lang.Throwable) notSubmittedException7);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException9 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException: ", (java.lang.Throwable) notSubmittedException7);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException11 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        notSubmittedException7.addSuppressed((java.lang.Throwable) missingRequiredAnswerException11);
        java.lang.Throwable[] throwableArray13 = missingRequiredAnswerException11.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", (java.lang.Object[]) throwableArray13);
            org.junit.Assert.fail("Expected exception of type java.util.MissingFormatArgumentException; message: Format specifier '%3A'");
        } catch (java.util.MissingFormatArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        java.lang.Object[] objArray9 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray9);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) (byte) 1, "", objArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", objArray9);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[4, , 4,  ]");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException3 = new io.github.stepio.jgforms.exception.InvalidFormException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        java.lang.Throwable[] throwableArray4 = invalidFormException3.getSuppressed();
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 100.0d, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", (java.lang.Object[]) throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        configuration0.setReadTimeout((long) (byte) 10);
        io.github.stepio.jgforms.Submitter submitter4 = new io.github.stepio.jgforms.Submitter(configuration0);
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            submitter4.submitForm(uRL5);
            org.junit.Assert.fail("Expected exception of type io.github.stepio.jgforms.exception.NotSubmittedException; message: Failed to submit form, unexpected exception");
        } catch (io.github.stepio.jgforms.exception.NotSubmittedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDate(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getConnectTimeout();
        configuration0.setConnectTimeout(1L);
        configuration0.setReadTimeout((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "io.github.stepio.jgforms.exception.InvalidFormException: hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        configuration0.setReadTimeout((long) (byte) 10);
        io.github.stepio.jgforms.Submitter submitter4 = new io.github.stepio.jgforms.Submitter(configuration0);
        configuration0.setConnectTimeout((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setReadTimeout((long) 1);
        io.github.stepio.jgforms.Submitter submitter3 = new io.github.stepio.jgforms.Submitter(configuration0);
        long long4 = configuration0.getReadTimeout();
        long long5 = configuration0.getConnectTimeout();
        long long6 = configuration0.getReadTimeout();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.String str4 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.isTrue(false, "io.github.stepio.jgforms.exception.MissingRequiredAnswerException%253A%2Bhi%252521", objArray3);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str4, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        configuration0.setReadTimeout((long) (byte) 10);
        long long4 = configuration0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, (long) (short) 100, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException4 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException5 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException4);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException7 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException4.addSuppressed((java.lang.Throwable) notSubmittedException7);
        java.lang.Throwable[] throwableArray9 = missingRequiredAnswerException4.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.isTrue(false, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", (java.lang.Object[]) throwableArray9);
            org.junit.Assert.fail("Expected exception of type java.util.IllegalFormatConversionException; message: a != io.github.stepio.jgforms.exception.NotSubmittedException");
        } catch (java.util.IllegalFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        java.lang.Object[] objArray9 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray9);
        java.lang.String str11 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray9);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.isTrue(false, "hi%21", objArray9);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException3 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException4 = new io.github.stepio.jgforms.exception.NotSubmittedException("", (java.lang.Throwable) notSubmittedException3);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException5 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException%3A+", (java.lang.Throwable) notSubmittedException3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = builder1.toUrlString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException1 = new io.github.stepio.jgforms.exception.InvalidFormException("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.lang.Object[] objArray11 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray11);
        java.lang.String str13 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray11);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray11);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray11);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.lang.String str1 = io.github.stepio.jgforms.answer.Validation.encode("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE" + "'", str1, "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, 100L, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        configuration0.setReadTimeout((long) (byte) -1);
        configuration0.setConnectTimeout((-1L));
        long long6 = configuration0.getReadTimeout();
        long long7 = configuration0.getReadTimeout();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        configuration0.setReadTimeout((long) (byte) 1);
        configuration0.setReadTimeout((long) (short) 100);
        io.github.stepio.jgforms.Submitter submitter7 = new io.github.stepio.jgforms.Submitter(configuration0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException2 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        java.lang.Throwable[] throwableArray3 = notSubmittedException2.getSuppressed();
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException4 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21", (java.lang.Throwable) notSubmittedException2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDateTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setReadTimeout((long) ' ');
        io.github.stepio.jgforms.Submitter submitter3 = new io.github.stepio.jgforms.Submitter(configuration0);
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            submitter3.submitForm(uRL4);
            org.junit.Assert.fail("Expected exception of type io.github.stepio.jgforms.exception.NotSubmittedException; message: Failed to submit form, unexpected exception");
        } catch (io.github.stepio.jgforms.exception.NotSubmittedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", "", "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B", "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B", "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B", "", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder15 = builder1.put(metaData2, (java.util.List<java.lang.String>) strList13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        java.lang.String str1 = io.github.stepio.jgforms.answer.Validation.encode("io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException%25253A%252B" + "'", str1, "io.github.stepio.jgforms.exception.NotSubmittedException%25253A%252B");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        java.lang.Object[] objArray11 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray11);
        java.lang.String str13 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray11);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray11);
        java.lang.String str15 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray11);
            org.junit.Assert.fail("Expected exception of type java.util.IllegalFormatConversionException; message: a != java.lang.Character");
        } catch (java.util.IllegalFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str15, "io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException3 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException4 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException3);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException6 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException3.addSuppressed((java.lang.Throwable) notSubmittedException6);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException8 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException%253A%2Bhi%252521", (java.lang.Throwable) notSubmittedException6);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, 0, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.lang.Object[] objArray15 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray15);
        java.lang.String str17 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray15);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) 10L, "", objArray15);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray15);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+", objArray15);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%25253A%252B", objArray15);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        java.util.Map map0 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray15);
        java.lang.String str17 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray15);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray15);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray15);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "hi%21", objArray15);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(map0, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray15);
            org.junit.Assert.fail("Expected exception of type java.util.IllegalFormatConversionException; message: a != java.lang.Character");
        } catch (java.util.IllegalFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.String str5 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray4);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B", "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray4);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str5, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        java.lang.Throwable throwable1 = null;
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException2 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", throwable1);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException4 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException5 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException4);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException9 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException10 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException9);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException12 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException9.addSuppressed((java.lang.Throwable) notSubmittedException12);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException14 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", (java.lang.Throwable) missingRequiredAnswerException9);
        missingRequiredAnswerException4.addSuppressed((java.lang.Throwable) notSubmittedException14);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException16 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", (java.lang.Throwable) missingRequiredAnswerException4);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException17 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException%3A+", (java.lang.Throwable) missingRequiredAnswerException4);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        io.github.stepio.jgforms.Log log1 = io.github.stepio.jgforms.Log.getLogger("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException4 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException%3A+hi%2521");
        log1.error("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi!", (java.lang.Throwable) notSubmittedException4);
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        boolean boolean1 = io.github.stepio.jgforms.answer.Validation.hasLength((java.lang.CharSequence) "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        java.util.Collection collection0 = null;
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException5 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException6 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException5);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException8 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException5.addSuppressed((java.lang.Throwable) notSubmittedException8);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException10 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException: ", (java.lang.Throwable) notSubmittedException8);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException12 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        notSubmittedException8.addSuppressed((java.lang.Throwable) missingRequiredAnswerException12);
        java.lang.Throwable[] throwableArray14 = missingRequiredAnswerException12.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(collection0, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", (java.lang.Object[]) throwableArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        configuration0.setReadTimeout((long) (byte) 10);
        io.github.stepio.jgforms.Submitter submitter4 = new io.github.stepio.jgforms.Submitter(configuration0);
        io.github.stepio.jgforms.Submitter submitter5 = new io.github.stepio.jgforms.Submitter(configuration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDate(metaData2, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        long long2 = configuration0.getConnectTimeout();
        long long3 = configuration0.getConnectTimeout();
        configuration0.setConnectTimeout((long) (byte) 1);
        java.lang.Class<?> wildcardClass6 = configuration0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException1 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        java.lang.String str2 = missingRequiredAnswerException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+" + "'", str2, "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        java.lang.String str1 = io.github.stepio.jgforms.answer.Validation.encode("io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "io.github.stepio.jgforms.exception.InvalidFormException%253A%2Bhi%2521" + "'", str1, "io.github.stepio.jgforms.exception.InvalidFormException%253A%2Bhi%2521");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        io.github.stepio.jgforms.Submitter submitter4 = new io.github.stepio.jgforms.Submitter(configuration0);
        configuration0.setConnectTimeout((long) 100);
        io.github.stepio.jgforms.Submitter submitter7 = new io.github.stepio.jgforms.Submitter(configuration0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, (int) ' ', (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        configuration0.setReadTimeout(1L);
        configuration0.setReadTimeout(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException1 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException%253A%2Bhi%252521");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setReadTimeout((long) 1);
        io.github.stepio.jgforms.Submitter submitter3 = new io.github.stepio.jgforms.Submitter(configuration0);
        configuration0.setReadTimeout((long) (byte) 0);
        long long6 = configuration0.getReadTimeout();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDateTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        long long2 = configuration0.getConnectTimeout();
        long long3 = configuration0.getConnectTimeout();
        configuration0.setReadTimeout((long) ' ');
        io.github.stepio.jgforms.Submitter submitter6 = new io.github.stepio.jgforms.Submitter(configuration0);
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            submitter6.submitForm(uRL7);
            org.junit.Assert.fail("Expected exception of type io.github.stepio.jgforms.exception.NotSubmittedException; message: Failed to submit form, unexpected exception");
        } catch (io.github.stepio.jgforms.exception.NotSubmittedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDate(metaData2, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, (int) '4', (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException2 = new io.github.stepio.jgforms.exception.InvalidFormException("");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException4 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi%21");
        invalidFormException2.addSuppressed((java.lang.Throwable) missingRequiredAnswerException4);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException6 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE", (java.lang.Throwable) invalidFormException2);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, 1L, timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        java.util.Collection collection0 = null;
        java.lang.Object[] objArray10 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray10);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray10);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(collection0, "io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21", objArray10);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[4, , 4,  ]");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        java.lang.String str1 = io.github.stepio.jgforms.answer.Validation.encode("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%253A%2Bio.github.stepio.jgforms.exception.NotSubmittedException%253A%2B" + "'", str1, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%253A%2Bio.github.stepio.jgforms.exception.NotSubmittedException%253A%2B");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        boolean boolean1 = io.github.stepio.jgforms.answer.Validation.hasLength((java.lang.CharSequence) "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        java.lang.Class<?> wildcardClass2 = builder1.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        long long4 = configuration0.getReadTimeout();
        io.github.stepio.jgforms.Submitter submitter5 = new io.github.stepio.jgforms.Submitter(configuration0);
        configuration0.setConnectTimeout(0L);
        configuration0.setReadTimeout(1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putDateTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        java.util.Calendar calendar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, calendar3, calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException1 = new io.github.stepio.jgforms.exception.InvalidFormException("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
        java.lang.String str2 = invalidFormException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "io.github.stepio.jgforms.exception.InvalidFormException: io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B" + "'", str2, "io.github.stepio.jgforms.exception.InvalidFormException: io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, (int) (byte) 10, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        configuration0.setReadTimeout(5000L);
        configuration0.setConnectTimeout((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.lang.String[] strArray25 = new java.lang.String[] { "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi!", "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE", "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", "io.github.stepio.jgforms.exception.MissingRequiredAnswerException%3A+hi%2521", "io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B", "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+", "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+", "hi%21", "io.github.stepio.jgforms.exception.NotSubmittedException%25253A%252B", "io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B", "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", "io.github.stepio.jgforms.exception.NotSubmittedException: ", "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%253A%2Bio.github.stepio.jgforms.exception.NotSubmittedException%253A%2B", "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", "io.github.stepio.jgforms.exception.InvalidFormException%253A%2Bhi%2521", "hi%21", "io.github.stepio.jgforms.exception.NotSubmittedException%25253A%252B", "io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B", "io.github.stepio.jgforms.exception.InvalidFormException: io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder28 = builder1.put(metaData2, (java.util.List<java.lang.String>) strList26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B", "io.github.stepio.jgforms.exception.InvalidFormException%253A%2Bhi%2521", "io.github.stepio.jgforms.exception.InvalidFormException: io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B", "hi%21", "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%253A%2Bio.github.stepio.jgforms.exception.NotSubmittedException%253A%2B", "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", "hi!", "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", "io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B", "", "io.github.stepio.jgforms.exception.NotSubmittedException: ", "io.github.stepio.jgforms.exception.MissingRequiredAnswerException%3A+hi%2521", "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", "io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder21 = builder1.put(metaData2, (java.util.List<java.lang.String>) strList19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, (int) '#', (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException4 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException5 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException4);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException7 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException4.addSuppressed((java.lang.Throwable) notSubmittedException7);
        java.lang.Throwable[] throwableArray9 = missingRequiredAnswerException4.getSuppressed();
        java.lang.Throwable[] throwableArray10 = missingRequiredAnswerException4.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.isTrue(false, "io.github.stepio.jgforms.exception.InvalidFormException%253A%2Bhi%2521", (java.lang.Object[]) throwableArray10);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException4 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException5 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException4);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException9 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException10 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException9);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException12 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException9.addSuppressed((java.lang.Throwable) notSubmittedException12);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException14 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", (java.lang.Throwable) missingRequiredAnswerException9);
        missingRequiredAnswerException4.addSuppressed((java.lang.Throwable) notSubmittedException14);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException16 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", (java.lang.Throwable) missingRequiredAnswerException4);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException17 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", (java.lang.Throwable) missingRequiredAnswerException4);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        java.lang.Object[] objArray12 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray12);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray12);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray12);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.isTrue(false, "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B", objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[4, , 4,  ]");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        io.github.stepio.jgforms.Log log1 = io.github.stepio.jgforms.Log.getLogger("");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException4 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException%253A%2B");
        log1.error("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%253A%2Bio.github.stepio.jgforms.exception.NotSubmittedException%253A%2B", (java.lang.Throwable) notSubmittedException4);
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException1 = new io.github.stepio.jgforms.exception.InvalidFormException("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        java.lang.Throwable[] throwableArray2 = invalidFormException1.getSuppressed();
        java.lang.String str3 = invalidFormException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "io.github.stepio.jgforms.exception.InvalidFormException: io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+" + "'", str3, "io.github.stepio.jgforms.exception.InvalidFormException: io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException2 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException3 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi%21", (java.lang.Throwable) missingRequiredAnswerException2);
        java.lang.String str4 = missingRequiredAnswerException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: " + "'", str4, "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: ");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: ");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDate(metaData2, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        long long2 = configuration0.getConnectTimeout();
        long long3 = configuration0.getConnectTimeout();
        configuration0.setConnectTimeout((long) (byte) 1);
        configuration0.setConnectTimeout((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setReadTimeout((long) 1);
        io.github.stepio.jgforms.Submitter submitter3 = new io.github.stepio.jgforms.Submitter(configuration0);
        long long4 = configuration0.getReadTimeout();
        long long5 = configuration0.getConnectTimeout();
        io.github.stepio.jgforms.Submitter submitter6 = new io.github.stepio.jgforms.Submitter(configuration0);
        long long7 = configuration0.getReadTimeout();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        configuration0.setReadTimeout((long) (byte) -1);
        configuration0.setConnectTimeout((-1L));
        long long6 = configuration0.getReadTimeout();
        configuration0.setReadTimeout(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.String str3 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray2);
            org.junit.Assert.fail("Expected exception of type java.util.MissingFormatArgumentException; message: Format specifier '%3A'");
        } catch (java.util.MissingFormatArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: " + "'", str3, "io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException4 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException5 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException4);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException7 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException4.addSuppressed((java.lang.Throwable) notSubmittedException7);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException9 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21", (java.lang.Throwable) missingRequiredAnswerException4);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException10 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ", (java.lang.Throwable) missingRequiredAnswerException4);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        java.lang.Object[] objArray12 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray12);
        java.lang.String str14 = io.github.stepio.jgforms.answer.Validation.message("hi!", objArray12);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray12);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray12);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.fail("hi%21", objArray12);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException3 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!");
        java.lang.Throwable[] throwableArray4 = notSubmittedException3.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.isTrue(false, "io.github.stepio.jgforms.exception.InvalidFormException: hi!", (java.lang.Object[]) throwableArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException1 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        java.lang.Class<?> wildcardClass2 = missingRequiredAnswerException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        java.util.Map map0 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray12);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray12);
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+", objArray12);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(map0, "io.github.stepio.jgforms.exception.InvalidFormException: io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B", objArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.InvalidFormException: io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[4, , 4,  ]");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        io.github.stepio.jgforms.Submitter submitter4 = new io.github.stepio.jgforms.Submitter(configuration0);
        io.github.stepio.jgforms.Submitter submitter5 = new io.github.stepio.jgforms.Submitter(configuration0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        java.util.Collection collection0 = null;
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException3 = new io.github.stepio.jgforms.exception.InvalidFormException("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        java.lang.Throwable[] throwableArray4 = invalidFormException3.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(collection0, "io.github.stepio.jgforms.exception.NotSubmittedException%25253A%252B", (java.lang.Object[]) throwableArray4);
            org.junit.Assert.fail("Expected exception of type java.util.MissingFormatArgumentException; message: Format specifier '%25253A'");
        } catch (java.util.MissingFormatArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getConnectTimeout();
        configuration0.setConnectTimeout((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+");
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, (int) (byte) 10, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        java.lang.Object[] objArray9 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray9);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) "", "hi!", objArray9);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.fail("io.github.stepio.jgforms.exception.InvalidFormException: hi!", objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[4, , 4,  ]");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = builder1.toUrlString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: At least one answer is mandatory to submit a form");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder6 = builder1.putDuration(metaData2, (int) (short) 100, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        io.github.stepio.jgforms.Log log1 = io.github.stepio.jgforms.Log.getLogger("io.github.stepio.jgforms.exception.InvalidFormException%3A+hi%21");
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "io.github.stepio.jgforms.exception.InvalidFormException: io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException2 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException3 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException2);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException7 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException8 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException7);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException10 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException7.addSuppressed((java.lang.Throwable) notSubmittedException10);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException12 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", (java.lang.Throwable) missingRequiredAnswerException7);
        missingRequiredAnswerException2.addSuppressed((java.lang.Throwable) notSubmittedException12);
        java.lang.String str14 = missingRequiredAnswerException2.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi!" + "'", str14, "io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi!");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        configuration0.setReadTimeout((long) (byte) -1);
        io.github.stepio.jgforms.Submitter submitter4 = new io.github.stepio.jgforms.Submitter(configuration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        configuration0.setReadTimeout(0L);
        long long6 = configuration0.getConnectTimeout();
        configuration0.setConnectTimeout((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        java.util.Collection collection0 = null;
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException5 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException6 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException5);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException8 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException5.addSuppressed((java.lang.Throwable) notSubmittedException8);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException10 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.NotSubmittedException: ", (java.lang.Throwable) notSubmittedException8);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException12 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        notSubmittedException8.addSuppressed((java.lang.Throwable) missingRequiredAnswerException12);
        java.lang.Throwable[] throwableArray14 = missingRequiredAnswerException12.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(collection0, "io.github.stepio.jgforms.exception.NotSubmittedException: ", (java.lang.Object[]) throwableArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        long long1 = configuration0.getReadTimeout();
        long long2 = configuration0.getConnectTimeout();
        long long3 = configuration0.getReadTimeout();
        long long4 = configuration0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5000L + "'", long1 == 5000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        java.util.Collection collection0 = null;
        java.lang.Object[] objArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(collection0, "io.github.stepio.jgforms.exception.NotSubmittedException: ", objArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException1 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: ");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException4 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException5 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException4);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException7 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException4.addSuppressed((java.lang.Throwable) notSubmittedException7);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException9 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", (java.lang.Throwable) missingRequiredAnswerException4);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException10 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.InvalidFormException: hi!", (java.lang.Throwable) notSubmittedException9);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.concurrent.TimeUnit timeUnit4 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder5 = builder1.putDuration(metaData2, (long) (-1), timeUnit4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        io.github.stepio.jgforms.Log log1 = io.github.stepio.jgforms.Log.getLogger("hi!");
        org.junit.Assert.assertNotNull(log1);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL+");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        long long4 = configuration0.getReadTimeout();
        long long5 = configuration0.getConnectTimeout();
        long long6 = configuration0.getReadTimeout();
        long long7 = configuration0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException1 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException4 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException5 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException4);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException7 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException4.addSuppressed((java.lang.Throwable) notSubmittedException7);
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException10 = new io.github.stepio.jgforms.exception.InvalidFormException("hi!");
        missingRequiredAnswerException4.addSuppressed((java.lang.Throwable) invalidFormException10);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException13 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        missingRequiredAnswerException4.addSuppressed((java.lang.Throwable) missingRequiredAnswerException13);
        notSubmittedException1.addSuppressed((java.lang.Throwable) missingRequiredAnswerException13);
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException19 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException20 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException19);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException22 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException19.addSuppressed((java.lang.Throwable) notSubmittedException22);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException24 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi%21", (java.lang.Throwable) missingRequiredAnswerException19);
        missingRequiredAnswerException13.addSuppressed((java.lang.Throwable) notSubmittedException24);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        io.github.stepio.jgforms.exception.MissingRequiredAnswerException missingRequiredAnswerException3 = new io.github.stepio.jgforms.exception.MissingRequiredAnswerException("hi!");
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException4 = new io.github.stepio.jgforms.exception.NotSubmittedException("hi!", (java.lang.Throwable) missingRequiredAnswerException3);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException6 = new io.github.stepio.jgforms.exception.NotSubmittedException("");
        missingRequiredAnswerException3.addSuppressed((java.lang.Throwable) notSubmittedException6);
        io.github.stepio.jgforms.exception.NotSubmittedException notSubmittedException8 = new io.github.stepio.jgforms.exception.NotSubmittedException("io.github.stepio.jgforms.exception.MissingRequiredAnswerException: hi!", (java.lang.Throwable) notSubmittedException6);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        long long3 = configuration0.getReadTimeout();
        io.github.stepio.jgforms.Submitter submitter4 = new io.github.stepio.jgforms.Submitter(configuration0);
        configuration0.setConnectTimeout((long) 100);
        long long7 = configuration0.getReadTimeout();
        configuration0.setReadTimeout((long) (short) 1);
        io.github.stepio.jgforms.Submitter submitter10 = new io.github.stepio.jgforms.Submitter(configuration0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5000L + "'", long3 == 5000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
        io.github.stepio.jgforms.Configuration configuration0 = new io.github.stepio.jgforms.Configuration();
        configuration0.setConnectTimeout((long) 0);
        configuration0.setReadTimeout((long) (byte) 1);
        configuration0.setReadTimeout((long) (short) 100);
        long long7 = configuration0.getReadTimeout();
        long long8 = configuration0.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.InvalidFormException: hi!");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "io.github.stepio.jgforms.exception.MissingRequiredAnswerException%3A+hi%2521", "io.github.stepio.jgforms.exception.InvalidFormException: hi!", "io.github.stepio.jgforms.exception.InvalidFormException: hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder9 = builder1.put(metaData2, (java.util.List<java.lang.String>) strList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        java.util.Collection collection0 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { '4', "", '4', ' ' };
        io.github.stepio.jgforms.answer.Validation.isTrue(true, "", objArray11);
        io.github.stepio.jgforms.answer.Validation.notNull((java.lang.Object) (byte) 1, "", objArray11);
        java.lang.String str14 = io.github.stepio.jgforms.answer.Validation.message("io.github.stepio.jgforms.exception.NotSubmittedExceptionNULL%2B", objArray11);
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Validation.notEmpty(collection0, "io.github.stepio.jgforms.exception.MissingRequiredAnswerException%253A%2Bhi%252521", objArray11);
            org.junit.Assert.fail("Expected exception of type java.util.UnknownFormatConversionException; message: Conversion = '2'");
        } catch (java.util.UnknownFormatConversionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[4, , 4,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE" + "'", str14, "io.github.stepio.jgforms.exception.NotSubmittedExceptionNULLTRUE");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.put(metaData2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        io.github.stepio.jgforms.answer.Builder builder1 = io.github.stepio.jgforms.answer.Builder.formKey("io.github.stepio.jgforms.exception.NotSubmittedException%3A+io.github.stepio.jgforms.exception.NotSubmittedException%3A+");
        io.github.stepio.jgforms.question.MetaData metaData2 = null;
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.github.stepio.jgforms.answer.Builder builder4 = builder1.putTime(metaData2, calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MetaData for answer is mandatory");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test372");
        io.github.stepio.jgforms.exception.InvalidFormException invalidFormException1 = new io.github.stepio.jgforms.exception.InvalidFormException("io.github.stepio.jgforms.exception.NotSubmittedException: io.github.stepio.jgforms.exception.NotSubmittedException: ");
        java.lang.Class<?> wildcardClass2 = invalidFormException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

